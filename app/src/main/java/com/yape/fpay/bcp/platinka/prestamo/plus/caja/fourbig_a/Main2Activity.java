package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.JianchaGengxinModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhenFenQiHuanKuanFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceSixMoreProductFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceSevenBillFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.PeizhiAndOutappFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceFiveLiangliangleFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceFourDoingWorkFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceOneFirstJieFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceTwoWaitFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class Main2Activity extends MyJichuBsActivity implements View.OnClickListener {


    public static String EFECTIVO_Main2Activity = "com.autobus.efectivo.Main2Activity";//拒绝放款//放款失败
    public static String EFECTIVO_Main2Activity_TOLOGIN = "com.autobus.efectivo.Main2Activity.toLogin";//退出登录

    public static String WoDe = "WoDe";
    public static String DingDan = "DingDan";//订单
    public static String ShouDai = "ShouDai";//首贷
    public static String FuDai = "FuDai";//复贷
    public static String ZhanQiHuanKuan = "ZhanQiHuanKuan";//展期还款
    public static String DengDaiShenHe = "DengDaiShenHe";//等待审核
    public static String HuanKuanZhong = "HuanKuanZhong";//还款中//逾期状态
    public static String ChuLiZhong = "ChuLiZhong";//处理中
    public static String JuJueFangKuan = "JuJueFangKuan";//拒绝放款//放款失败
    public static String DuoChanPin = "DuoChanPin";//多产品-未知

    public static String YuQiZhuangTai = "YuQiZhuangTai";//逾期状态
    public static String FangKuanShiBai = "FangKuanShiBai";//放款失败

    public Fragment currentFragment;//当前的Fragment
    public Fragment currentHomeFragment;//当前首页的Fragment
    public FrameLayout main_fl_content;

    public Map<String, Fragment> fragmentMap = new HashMap<>();

    public static boolean isZhiFu = false;
    public static boolean isZhiFu_zhanQi = false;
    public static boolean isShouDai = true;
    public static boolean isHomeNoNetwork = false;
    public static int orderId = 0;
    public static int isZhiFu_zhanQi_orderId = 0;
    private String zhiFuJine = "";

    private ChanpinMoxingPPWindows popupSuccessWindow;

    private String appName = "";
//    private String clickorderid = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.activity_main2);

        if (getIntent() != null) {
            if (getIntent().hasExtra("appName")) {
                appName = getIntent().getStringExtra("appName");
            }
//            if (getIntent().hasExtra("clickorderid")) {
//                clickorderid = getIntent().getStringExtra("clickorderid");
//            }
        }

//        initPopWindow003();


        main_fl_content = findViewById(R.id.main_fl_content);

        fragmentMap.put(ShouDai, new ZhuSenceOneFirstJieFragment());//首贷
        fragmentMap.put(DengDaiShenHe, new ZhuSenceTwoWaitFragment());//等待审核
        fragmentMap.put(HuanKuanZhong, new ZhenFenQiHuanKuanFragment());//还款中，逾期状态
        fragmentMap.put(ChuLiZhong, new ZhuSenceFourDoingWorkFragment());//处理中
        fragmentMap.put(JuJueFangKuan, new ZhuSenceFiveLiangliangleFragment());//拒绝放款//放款失败
        fragmentMap.put(DuoChanPin, new ZhuSenceSixMoreProductFragment());//多产品
        fragmentMap.put(DingDan, new ZhuSenceSevenBillFragment());//订单
        fragmentMap.put(WoDe, new PeizhiAndOutappFragment());//我的

        //默认显示首贷
        currentFragment = fragmentMap.get(ShouDai);
        currentHomeFragment = fragmentMap.get(ShouDai);

        //设置页面
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_fl_content, currentHomeFragment).show(currentHomeFragment).commit();

        initPopSuccessWindow();
        initGengxinWindow();
//        getData();
//        ViewUtils.checkWritePermission(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getData();
    }

    private TextView tv10;
    private TextView repaymentDateTv;
    private TextView zhanqichenggongming;

    private void initPopSuccessWindow() {
        popupSuccessWindow = new ChanpinMoxingPPWindows(this);

        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_lateapply_chengok, null);
        tv10 = popupView.findViewById(R.id.hgdasdhfjhgyyyy);
        repaymentDateTv = popupView.findViewById(R.id.zhanqihuankuanqi);
        zhanqichenggongming = popupView.findViewById(R.id.zhanqichenggongming);
        if(!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(Main2Activity.this,BendiHuancunTols.APPMINGZI))){
            zhanqichenggongming.setText(BendiHuancunTols.huoQuZifuchuan(Main2Activity.this,BendiHuancunTols.APPMINGZI));
        }
        popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupSuccessWindow.xiaohuiPPw();
                count = -1;
            }
        });

        popupSuccessWindow.chushihuaPPW(popupView, false, (int) (huoquPingmuKuandu(this) *1), ViewGroup.LayoutParams.MATCH_PARENT, null, true);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
//            case R.id.str_aviso_privacidadTv://跳转隐私协议
//                XieyiShowTols.quH5YinsiPage(Main2Activity.this);
//                break;
        }
    }


    public void getData() {
        loadIndexData();
    }

    private void loadIndexData() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HOMEPAGE_FOR_UNLOGIN, UnintoTabModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<UnintoTabModel>() {
            @Override
            public void OnMap(Map<String, String> map) {

//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(Main2Activity.this, YONGHU_ID));
                 String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                if(TextUtils.isEmpty(s1)){
                    s1="0";
                }
                if(TextUtils.isEmpty(s2)){
                    s2="0";
                }
                map.put("looseCivilInchCrowdedAnyone",  s1 + "," +  s2);//lbs
                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
            }

            @Override
            public void onSuccess(UnintoTabModel response) {
                Log.e("TAG", "response---->" + response);
                jiazaizhongWindows.hideKuangkuangIng();
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    UnintoTabModel.GongyongCanshuModel roughNaturalPro = response.getBigAncientTastyHeadteacher();
                    int type = roughNaturalPro.getPoorStrictNeedleShopping();
                    String type01 = roughNaturalPro.getBasicSleepUnableChallengingVase();
                    orderId = roughNaturalPro.getTiredMommyEitherThickEnding();
                    final int mexicanFoolishScissors = roughNaturalPro.getElectronicAllTrick();
                    isShouDai = !"1".equals(type01);
                    switch (type) {
                        case 0:
                            //正常订单,已放款，未逾期
                            currentHomeFragment = fragmentMap.get(HuanKuanZhong);
                            if (isZhiFu_zhanQi && orderId != isZhiFu_zhanQi_orderId) {
                                //关闭展期弹窗
//                                ChanpinMoxingPPWindows popupZhanQiWindow;
//                                ZhuSenceThreeRyIngFragment fragment = ((ZhuSenceThreeRyIngFragment) fragmentMap.get(HuanKuanZhong));
//                                if (fragment != null) {
//                                    popupZhanQiWindow = fragment.zhanqiPpw;
//                                    if (popupZhanQiWindow != null && popupZhanQiWindow.huoquPPwShifouShow()) {
//                                        popupZhanQiWindow.xiaohuiPPw();
//                                    }
//                                }

                                isZhiFu_zhanQi = false;
                                repaymentDateTv.setVisibility(View.VISIBLE);
                                repaymentDateTv.setText(roughNaturalPro.regularChineseValley);
                                count = 3;
                                handler.sendEmptyMessageDelayed(0, 1000);
                                popupSuccessWindow.showPPw(Gravity.CENTER);
                            }
                            break;
                        case 1:
                            //逾期订单
                            currentHomeFragment = fragmentMap.get(HuanKuanZhong);
                            break;
                        case 2:
                            //审批中
                            if (mexicanFoolishScissors == 2) {
                                //放款失败，需更新银行卡操作
                                currentHomeFragment = fragmentMap.get(JuJueFangKuan);
                            } else if (mexicanFoolishScissors == 3) {//放款中
                                currentHomeFragment = fragmentMap.get(ChuLiZhong);
                            } else {
                                //审批中
                                currentHomeFragment = fragmentMap.get(DengDaiShenHe);
                            }
                            break;
                        case 3:
                            //拒绝订单，进入拒绝页面
                            currentHomeFragment = fragmentMap.get(JuJueFangKuan);
                            break;
                        case -1:
                            currentHomeFragment = fragmentMap.get(ShouDai);
                            if (Objects.equals(type01, "1")) {
                                //复贷，进入复贷页面
                                //切换首贷复贷
                                if (currentHomeFragment instanceof ZhuSenceOneFirstJieFragment)
                                    ((ZhuSenceOneFirstJieFragment) currentHomeFragment).setSecondDaidai(type01);
                            } else {
                                //未下过单状态，默认显示首页
                                if (currentHomeFragment instanceof ZhuSenceOneFirstJieFragment)
                                    ((ZhuSenceOneFirstJieFragment) currentHomeFragment).setSecondDaidai("2");
                            }
                            if (roughNaturalPro.eastLaughterPartJungleAngryPhrase > 0) {
//                                ((ZhuSenceOneFirstJieFragment) currentHomeFragment).kjhkjythgrjhgfefwdqqYTdg34dsg.setText(ZhuajiPingmuTols.jiageGeshi((int) roughNaturalPro.eastLaughterPartJungleAngryPhrase));
                            }
                            fragmentTransaction(currentFragment, currentHomeFragment);

                            //还贷后若是可贷款状态则说明还贷成功
                            if (isZhiFu) {
                                isZhiFu = false;
                                Intent intent = new Intent(Main2Activity.this, RYryBackqianSuceeOkActivity.class);
                                intent.putExtra("zhifue", zhiFuJine);
                                startActivityForResult(intent, 1002);
                                finish();
                            }
                            break;
                        default:
                            break;
                    }

                    isZhiFu = false;
                    isZhiFu_zhanQi = false;

                    //保存当前订单号，展期成功弹窗用
                    isZhiFu_zhanQi_orderId = roughNaturalPro.getTiredMommyEitherThickEnding();
                    double kjyhtgrfe = roughNaturalPro.getUnusualRatLabourRaincoat() * 2;
                    zhiFuJine = HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form5), kjyhtgrfe));
//                     //放款成功
//                    if ("0".equals(fanhuibean.agriculturalFish)) {
////                        YincangShijianClickTols.QingqiuMaidian(FANGKUANCHENGGONG);
////                        YincangShijianClickTols.LianshuMaidian(LIANSHUFANGKUANCHENGGONG);
////                        YincangShijianClickTols.HuojiMaidian(HUOJIFANGKUANCHENGGONG);
//                    }
//
//                    //放款信息 首贷放款成功
//                    if ("0".equals(fanhuibean.electricalCitizenFew)) {
////                        YincangShijianClickTols.QingqiuMaidian(SHOUDAIFANGKUANCHENGGONG);
////                        YincangShijianClickTols.LianshuMaidian(LIANSHUSHOUDAIFANGKUAN);
////                        YincangShijianClickTols.HuojiMaidian(HUOJISHOUDAIFANGKUAN);
//                    }


                    if (currentHomeFragment instanceof ZhuSenceOneFirstJieFragment) {
                        ((ZhuSenceOneFirstJieFragment) currentHomeFragment).qingqiuJiekou1();
                    } else if (currentHomeFragment instanceof ZhuSenceTwoWaitFragment) {
                        ((ZhuSenceTwoWaitFragment) currentHomeFragment).qingqiuJiekou1();
                    } else if (currentHomeFragment instanceof ZhenFenQiHuanKuanFragment) {
                        ((ZhenFenQiHuanKuanFragment) currentHomeFragment).qingqiuJiekou1();
                    } else if (currentHomeFragment instanceof ZhuSenceFourDoingWorkFragment) {
                        ((ZhuSenceFourDoingWorkFragment) currentHomeFragment).qingqiuJiekouCheckingJieguo();
                    } else if (currentHomeFragment instanceof ZhuSenceFiveLiangliangleFragment) {
                        ((ZhuSenceFiveLiangliangleFragment) currentHomeFragment).qingquJiekou1();
                    }
                    if (!(currentFragment instanceof PeizhiAndOutappFragment) && !(currentFragment instanceof ZhuSenceSevenBillFragment)) {
                        fragmentTransaction(currentFragment, currentHomeFragment);
                    }
                } else {
//                    Toast.makeText(Main2Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }


            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private int count = 3;

    //咱在写一个计算Welcome界面的广告时间结束后进入主界面的方法
    private int getCount() {
        count--;
        if (count <= 0) {
            if (popupSuccessWindow != null && popupSuccessWindow.huoquPPwShifouShow()) {
                popupSuccessWindow.xiaohuiPPw();
            }
        } else {
            tv10.setText(String.format(Locale.ENGLISH,getString(R.string.jingogojian_xixicheck_000), count));
        }
        return count;
    }

    //进行一个消息的处理
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if (msg.what == 0) {
                if (getCount() > 0) {
                    handler.sendEmptyMessageDelayed(0, 1000);
                }
            }
        }

        ;
    };


    public void startH5Activity(String url, int requestCode) {
        Intent intent = new Intent(this, WangyeHelperWithGugeChormeActivity.class);
        intent.putExtra("web_url", url);
        startActivityForResult(intent, requestCode);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1001) {
            isZhiFu = true;
//            getData();
        } else if (requestCode == 1002) {
            getData();
        } else if (requestCode == 2001) {
            isZhiFu_zhanQi = true;
            getData();
        }
//        else if(requestCode == 1008){
//            getData();
//        }
    }

    /**
     * 控制fragment的变化
     * <p>
     * currentFragment 现在的
     * nextFragment 要显示的
     */
    public void fragmentTransaction(Fragment currentFragment, Fragment nextFragment) {
        if (currentFragment == null || nextFragment == null) {
            return;
        }
        try {
            FragmentTransaction trx = getSupportFragmentManager().beginTransaction();
//            trx.hide(currentFragment);
//            if (nextFragment.isAdded() && nextFragment.getParentFragmentManager() != getSupportFragmentManager()) {
//                FragmentManager parentFragmentManager = nextFragment.getParentFragmentManager();
//                parentFragmentManager.beginTransaction().remove(nextFragment).commit();
//
//            }
//            if (!nextFragment.isAdded()
//                    &&null ==nextFragment.getParentFragmentManager().findFragmentByTag(nextFragment.getTag())) {
//                trx.add(R.id.main_fl_content, nextFragment,nextFragment.getTag());
//            }
            trx.replace(R.id.main_fl_content, nextFragment);
            trx.show(nextFragment).commitAllowingStateLoss();
            this.currentFragment = nextFragment;
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

//    ChanpinMoxingPPWindows popupWindow0003;
//
//    private void initPopWindow003() {
//        popupWindow0003 = new ChanpinMoxingPPWindows(this);
//
//        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View popupView = popInflater.inflate(R.layout.pop_layout_goods_02, null);
//        TextView readDataContextText02 = popupView.findViewById(R.id.readDataContextText02);
//        TextView str_cancelarTv = popupView.findViewById(R.id.str_cancelarTv);
//        TextView str_confirmarTv = popupView.findViewById(R.id.str_confirmarTv);
//
//        readDataContextText02.setText(getString(R.string.toast_url_00));
//        str_cancelarTv.setText(getString(R.string.str_cancelar));
//        str_confirmarTv.setText(getString(R.string.str_ABRIR));
//
//        popupView.findViewById(R.id.str_cancelarTv).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                popupWindow0003.setDestroyPopup();
//            }
//        });
//        popupView.findViewById(R.id.str_confirmarTv).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                popupWindow0003.setDestroyPopup();
//
//                Intent intent = new Intent();
//                intent.setAction("android.net.wifi.PICK_WIFI_NETWORK");
//                startActivity(intent);
//            }
//        });
//
//        popupWindow0003.initPopupWindowUtils(popupView, false, (int) (getScreenWidth(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, false);
//
//    }

    public String getAppName() {
        return appName;
    }

    private ChanpinMoxingPPWindows gengxinappPPW;
    private TextView wndwtousu_txt1;
    private TextView quxiaoanniu;
    private String gengxinlianjie = "";

    private void initGengxinWindow() {
        gengxinappPPW = new ChanpinMoxingPPWindows(this);

        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_appyaogengxinle, null);

        wndwtousu_txt1 = popupView.findViewById(R.id.wndwtousu_txt1);
        quxiaoanniu = popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        quxiaoanniu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gengxinappPPW.xiaohuiPPw();
            }
        });
        popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    if(!TextUtils.isEmpty(gengxinlianjie)){
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gengxinlianjie));
                        startActivity(intent);
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        gengxinappPPW.chushihuaPPW(popupView, false
                ,  ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, null, false);
    }

    public void qingqiuJiekouGengxin() {
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GENGXINYINGYONG, JianchaGengxinModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<JianchaGengxinModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("quickBeerMentalSuchBank", AboutShebeiTols.uuid());//imei
            }

            @Override
            public void onSuccess(JianchaGengxinModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    //1：强制更新 ，2：用户可选择性更新
                    if(response.getBigAncientTastyHeadteacher().getPrimaryMuttonRichCinema().equals("1") || response.getBigAncientTastyHeadteacher().getPrimaryMuttonRichCinema().equals("2")){
                        if(gengxinappPPW != null) {
                            if(response.getBigAncientTastyHeadteacher().getPrimaryMuttonRichCinema().equals("1")){
                                quxiaoanniu.setVisibility(View.GONE);
                            }
                            if(!TextUtils.isEmpty(response.getBigAncientTastyHeadteacher().getGratefulCoolSchoolmate())) {
                                wndwtousu_txt1.setText(response.getBigAncientTastyHeadteacher().getGratefulCoolSchoolmate());
                            }
                            gengxinlianjie = response.getBigAncientTastyHeadteacher().getUntrueCousinChairwomanTennis();
                            gengxinappPPW.showPPw(Gravity.BOTTOM);
                        }
                    }

                }
            }

            @Override
            public void onError(String error) {


            }
        });
    }

    @Override
    public void onBackPressed() {
        if (gengxinappPPW.huoquPPwShowFou()) {

        } else {
            super.onBackPressed();
        }
    }
}