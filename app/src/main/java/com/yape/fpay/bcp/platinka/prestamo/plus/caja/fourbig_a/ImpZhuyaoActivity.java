package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.appsflyer.AppsFlyerLib;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DuoproChapinModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.FengKongQianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HuankDanliebModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.JianchaGengxinModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PersonShenfenZhaoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DingWeiSinglebangzhuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.MyBefeeerReceiver.GuanbiAppService;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.MyBefeeerReceiver.HomeBtnBrocast;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhenFenQiHuanKuanFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceSixMoreProductFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceSevenBillFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceOneFirstJieFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceTwoWaitFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceFourDoingWorkFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.ZhuSenceFiveLiangliangleFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f.PeizhiAndOutappFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.PppQxPanduaner;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.SanfangRxppp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.TOUSUH5TOEKN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_TOKEN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ID;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUAPP;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.QUANXIANDINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHOUYEZHUDINGWEI;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ImpZhuyaoActivity extends MyJichuBsActivity implements View.OnClickListener {
    public static String ZHUYEMIAN = "com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity";//拒绝放款//放款失败
    public static String PEIZHIHETUICHU = "WoDe";//我的页面
    public static String FIRSTJIE = "ShouDai";//首贷
    public static String WAITCHECK = "DengDaiShenHe";//等待审核
    public static String HUANQIANSTATUS = "HuanKuanZhong";//还款中//逾期状态
    public static String DOINGWORK = "ChuLiZhong";//处理中
    public static String JIEFAIL = "JuJueFangKuan";//拒绝放款//放款失败
    public static String ALREADYLATEHUAN = "YuQiZhuangTai";//逾期状态
    public static String GIVEQIANFAIL = "FangKuanShiBai";//放款失败
    public static String DingDan = "DingDan";//订单
    public static String DuoChanPin = "DuoChanPin";//多产品-未知
    private CouponGuangboHuidiao couponGuangboHuidiao;//选中优惠券
    private LinearLayout menutab_sfjT12jf_one;
    private LinearLayout menutab_sfjT12jf_two;
    private LinearLayout menutab_sfjT12jf_dingdna;
    private ImageView menutab_stupianf_one;
    private ImageView menutab_stupianf_two;
    private ImageView menutab_stupianf_dingdna;
    private TextView jingojian1dibuxieyi;
    public Fragment dangqianF;//当前的Fragment
    public Fragment dangqianZhusenceF;//当前首页的Fragment
    public FrameLayout fragcontent_sfjT12jf_buju;
    public Map<String, Fragment> stringFragmentHashMap = new HashMap<>();
    public static boolean shiFouFukuan = false;//是否支付
    public static boolean shiFouFukuan_Exten = false;//展期是否支付
    public static boolean shiFouFirstJie = true;
    public static int danziDingId = 0;
    public static int shiFou_ry_extenDingId = 0;
    public static boolean isMain = true;
    public static String shiFou_rest_Menu = "0";//0 否  1 重置
    private ChanpinMoxingPPWindows zhanzhanchenggongPPw;
    private HomeBtnBrocast homeBtnBrocast;
    private TextView repaymentDateTv;
    public static int isZhiFu_zhanQi_orderId = 0;
    private String zhiFuJine = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_impzhuyao);

        initGengxinWindow();

//        qingqiuJiekouHuoquApppeizhi();


        sanfangRxppp = new SanfangRxppp(this);



//        qingQiuJiekou1();

        menutab_sfjT12jf_one = findViewById(R.id.menutab_sfjT12jf_one);
        menutab_sfjT12jf_two = findViewById(R.id.menutab_sfjT12jf_two);
        menutab_sfjT12jf_dingdna = findViewById(R.id.menutab_sfjT12jf_dingdna);
        fragcontent_sfjT12jf_buju = findViewById(R.id.fragcontent_sfjT12jf_buju);

        menutab_stupianf_one = findViewById(R.id.menutab_stupianf_one);
        menutab_stupianf_two = findViewById(R.id.menutab_stupianf_two);
        menutab_stupianf_dingdna = findViewById(R.id.menutab_stupianf_dingdna);

        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);

        DianjiQuickTols.kuaiLeMa(jingojian1dibuxieyi, this);
        DianjiQuickTols.kuaiLeMa(menutab_sfjT12jf_one, this);
        DianjiQuickTols.kuaiLeMa(menutab_sfjT12jf_two, this);
        DianjiQuickTols.kuaiLeMa(menutab_sfjT12jf_dingdna, this);
        DianjiQuickTols.kuaiLeMa(menutab_sfjT12jf_dingdna, this);

        menutab_sfjT12jf_one.setOnClickListener(this);
        menutab_sfjT12jf_two.setOnClickListener(this);
        menutab_sfjT12jf_dingdna.setOnClickListener(this);
//
        stringFragmentHashMap.put(FIRSTJIE, new ZhuSenceOneFirstJieFragment());//首贷
        stringFragmentHashMap.put(WAITCHECK, new ZhuSenceTwoWaitFragment());//等待审核
        stringFragmentHashMap.put(HUANQIANSTATUS, new ZhenFenQiHuanKuanFragment());//还款中，逾期状态
        stringFragmentHashMap.put(DOINGWORK, new ZhuSenceFourDoingWorkFragment());//处理中
        stringFragmentHashMap.put(JIEFAIL, new ZhuSenceFiveLiangliangleFragment());//拒绝放款//放款失败
        stringFragmentHashMap.put(DuoChanPin, new ZhuSenceSixMoreProductFragment());//多产品
        stringFragmentHashMap.put(DingDan, new ZhuSenceSevenBillFragment());//订单
        stringFragmentHashMap.put(PEIZHIHETUICHU, new PeizhiAndOutappFragment());//我的

        //默认显示首贷
        dangqianF = stringFragmentHashMap.get(FIRSTJIE);
        dangqianZhusenceF = stringFragmentHashMap.get(FIRSTJIE);

        //设置页面
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragcontent_sfjT12jf_buju, dangqianZhusenceF).show(dangqianZhusenceF).commit();

        couponGuangboHuidiao = new CouponGuangboHuidiao();
        IntentFilter guolv = new IntentFilter();
        guolv.addAction(ZHUYEMIAN);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            registerReceiver(couponGuangboHuidiao, guolv, Context.RECEIVER_EXPORTED);
        } else {
            registerReceiver(couponGuangboHuidiao, guolv);
        }


        //初始化展期弹框
        initPopSuccessWindow();
        jianchaBIGjjsensonQQQppp();

        isMain = true;
//        checkSingleOrMore();


        homeBtnBrocast = new HomeBtnBrocast();
        IntentFilter filter = new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            this.registerReceiver(homeBtnBrocast, filter, Context.RECEIVER_EXPORTED);
        } else {
            this.registerReceiver(homeBtnBrocast, filter);
        }

//        if(maidianallow){
//            YincangShijianClickTols.QingqiuMaidian(QUANXIANDINGWEI);
//            maidianallow= false;
//        }
//        if(maidianstart){
//            YincangShijianClickTols.QingqiuMaidian(JINRUAPP);
//
//
//            maidianstart= false;
//        }

        YincangShijianClickTols.feiSId = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        BendiHuancunTols.commitZifuchuan(BendiHuancunTols.COPY_USER_INFO, "");
        BendiHuancunTols.commitZifuchuan(BendiHuancunTols.APPMINGZI, "");

        //在设置和退出页面得activity退出时 首页刷新用
        if ("1".equals(shiFou_rest_Menu)) {
            shezhiDibuMenuColor(0);
            qingchuDibuMenuColro(1);
            qingchuDibuMenuColro(2);
            dangqianZhusenceF = stringFragmentHashMap.get(FIRSTJIE);
            kongzhiFragChange(dangqianF, dangqianZhusenceF);
            shiFou_rest_Menu = "0";
        }
        checkSingleOrMore();
    }

    private TextView hgdasdhfjhgyyyy;
    private TextView zhanqichenggongming;

    //展期成功弹框
    private void initPopSuccessWindow() {
        zhanzhanchenggongPPw = new ChanpinMoxingPPWindows(this);

        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_lateapply_chengok, null);
        hgdasdhfjhgyyyy = popupView.findViewById(R.id.hgdasdhfjhgyyyy);
        repaymentDateTv = popupView.findViewById(R.id.zhanqihuankuanqi);
        zhanqichenggongming = popupView.findViewById(R.id.zhanqichenggongming);
        if(!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(ImpZhuyaoActivity.this,BendiHuancunTols.APPMINGZI))){
            zhanqichenggongming.setText(BendiHuancunTols.huoQuZifuchuan(ImpZhuyaoActivity.this,BendiHuancunTols.APPMINGZI));
        }
        popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zhanzhanchenggongPPw.xiaohuiPPw();
                shuliang = -1;
            }
        });

        zhanzhanchenggongPPw.chushihuaPPW(popupView, false
                , (int) (huoquPingmuKuandu(this) * 1), ViewGroup.LayoutParams.MATCH_PARENT, null, true);
    }


    private SanfangRxppp sanfangRxppp;

    //请求权限
    private void jianchaBIGjjsensonQQQppp() {
        sanfangRxppp.qingQiu(Manifest.permission.ACCESS_COARSE_LOCATION)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Boolean aBoolean) {
                        try {
                            if (!aBoolean) {
                                if (new PppQxPanduaner(MyJichuAplica.getInstance()).checkShaoPppp(
//
                                        Manifest.permission.ACCESS_COARSE_LOCATION
                                )) {
                                    Log.d("requestLocation---->>>", "权限被拒绝");
                                    if (!shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_COARSE_LOCATION)) {

                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝了 而且点击了不在提示（始终禁止） 所以 需要判断出来 有必要的话 需要用代码跳转到设置页面");
                                    } else {

                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝");
                                    }
                                } else {
                                    Log.d("requestLocation---->>>", "权限被通过");
                                    //所有权限都已经授权
                                    //获取位置信息
//                                  DingWeizhiTols.getWeizhiDingwei(AOpenStarActivity.this);
                                    try {
                                        YincangShijianClickTols.QingqiuMaidian(SHOUYEZHUDINGWEI);
                                        DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(ImpZhuyaoActivity.this);
                                        ll.kaiqiDingwGongneng();
                                    } catch (Exception e) {

                                    }

                                }

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                try {
                                    YincangShijianClickTols.QingqiuMaidian(SHOUYEZHUDINGWEI);
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(ImpZhuyaoActivity.this);
                                    ll.kaiqiDingwGongneng();
                                } catch (Exception e) {

                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void onClick(View view) {
        if (!WngluoTols.youWangluoFou(ImpZhuyaoActivity.this)) {
            baseaNonet.showPPw(Gravity.CENTER);
            return;
        }
        Intent intent;
        switch (view.getId()) {
            case R.id.menutab_sfjT12jf_one:

                shezhiDibuMenuColor(0);
                qingchuDibuMenuColro(1);
                qingchuDibuMenuColro(2);
                kongzhiFragChange(dangqianF, dangqianZhusenceF);
                checkSingleOrMore();

                break;

            case R.id.menutab_sfjT12jf_dingdna:
                String token1 = BendiHuancunTols.huoQuZifuchuan(ImpZhuyaoActivity.this, YONGHU_TOKEN);
                if (TextUtils.isEmpty(token1)) {
                    intent = new Intent(ImpZhuyaoActivity.this, GaogeZhanghaoIntoActivity.class);
                    startActivity(intent);
                } else {
                    shezhiDibuMenuColor(2);
                    qingchuDibuMenuColro(0);
                    qingchuDibuMenuColro(1);
                    kongzhiFragChange(dangqianF, Objects.requireNonNull(stringFragmentHashMap.get(DingDan)));
                    checkSingleOrMore();
                }
                break;
            case R.id.menutab_sfjT12jf_two:
                String token = BendiHuancunTols.huoQuZifuchuan(ImpZhuyaoActivity.this, YONGHU_TOKEN);
                if (TextUtils.isEmpty(token)) {
                    intent = new Intent(ImpZhuyaoActivity.this, GaogeZhanghaoIntoActivity.class);
                    startActivity(intent);
                } else {
                    shezhiDibuMenuColor(1);
                    qingchuDibuMenuColro(0);
                    qingchuDibuMenuColro(2);
                    kongzhiFragChange(dangqianF, Objects.requireNonNull(stringFragmentHashMap.get(PEIZHIHETUICHU)));
                    checkSingleOrMore();
                }

                break;
            case R.id.jingojian1dibuxieyi://跳转隐私协议
                XieyiShowTols.quH5YinsiPage(ImpZhuyaoActivity.this);
                break;
        }
    }

    public void checkSingleOrMore() {
        Log.d("zhuyejiekou","1");
        BendiHuancunTols.commitZifuchuan(BendiHuancunTols.COPY_USER_INFO, "");
        BendiHuancunTols.commitZifuchuan(BendiHuancunTols.APPMINGZI, "");
        if (dangqianF instanceof ZhuSenceSevenBillFragment) {
            jiazaizhongWindows.showKuangkuangIng();
            WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.REALISE_RUDE_TOWN, HuankDanliebModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<HuankDanliebModel>() {
                @Override
                public void OnMap(Map<String, String> map) {
                    map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(ImpZhuyaoActivity.this, YONGHU_ID));
                    String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                    String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                    if (TextUtils.isEmpty(s1)) {
                        s1 = "0";
                    }
                    if (TextUtils.isEmpty(s2)) {
                        s2 = "0";
                    }
                    map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                    map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
                }

                @Override
                public void onSuccess(HuankDanliebModel response) {
                    jiazaizhongWindows.hideKuangkuangIng();
                    List<HuankDanliebModel.HuankuanDanModel> list = new ArrayList<>();
                    if (response.getAverageEmbassyNationalVictoryDepth() == 1000 && response.getBigAncientTastyHeadteacher() != null && !response.getBigAncientTastyHeadteacher().isEmpty()) {
                        list.addAll(response.getBigAncientTastyHeadteacher());
                    }

                    if (stringFragmentHashMap.get(DingDan) instanceof ZhuSenceSevenBillFragment) {
                        ZhuSenceSevenBillFragment fragment = ((ZhuSenceSevenBillFragment) stringFragmentHashMap.get(DingDan));
                        if (fragment != null) {
                            fragment.setData(ImpZhuyaoActivity.this, list);
                        }
                    }
                }

                @Override
                public void onError(String error) {
                    jiazaizhongWindows.hideKuangkuangIng();
                    Log.e("TAG", "error---->" + error);
                }
            });
        } else if (dangqianF instanceof PeizhiAndOutappFragment && !TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(this, BendiHuancunTols.YONGHU_TOKEN))) {
            jiazaizhongWindows.showKuangkuangIng();
            WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GET_SHENFEN_PICTURE, PersonShenfenZhaoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PersonShenfenZhaoModel>() {
                @Override
                public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(impZhuyaoActivity, BendiHuancunTols.YONGHU_ID));
                    String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                    String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                    if (TextUtils.isEmpty(s1)) {
                        s1 = "0";
                    }
                    if (TextUtils.isEmpty(s2)) {
                        s2 = "0";
                    }
                    map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                    map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
                }

                @Override
                public void onSuccess(PersonShenfenZhaoModel response) {
                    jiazaizhongWindows.hideKuangkuangIng();
                    Log.e("TAG", "response---->" + response);
                    if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                        PersonShenfenZhaoModel.FanhuiDataModel huidiaobean = response.getRoughNaturalPro();

                        if (stringFragmentHashMap.get(DingDan) instanceof PeizhiAndOutappFragment) {
                            PeizhiAndOutappFragment fragment = ((PeizhiAndOutappFragment) stringFragmentHashMap.get(PEIZHIHETUICHU));
                            if (fragment != null) {
                                fragment.setData(ImpZhuyaoActivity.this, huidiaobean);
                            }
                        }

                    } else {
                        ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                    }
                }

                @Override
                public void onError(String error) {
                    jiazaizhongWindows.hideKuangkuangIng();
                    if (error.contains("java.net.UnknownHostException:")) {
                        baseaNonet.showPPw(Gravity.CENTER);
                    }
                }
            });
        } else {
            if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(this, BendiHuancunTols.YONGHU_TOKEN))) {
                jiazaizhongWindows.showKuangkuangIng();
                WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HOOK_MAGIC_PAST, DuoproChapinModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<DuoproChapinModel>() {
                    @Override
                    public void OnMap(Map<String, String> map) {

                        map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(ImpZhuyaoActivity.this, YONGHU_ID));
                        String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                        String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                        if (TextUtils.isEmpty(s1)) {
                            s1 = "0";
                        }
                        if (TextUtils.isEmpty(s2)) {
                            s2 = "0";
                        }
                        map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                        map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
                    }

                    @Override
                    public void onSuccess(DuoproChapinModel response) {
                        jiazaizhongWindows.hideKuangkuangIng();
                        if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                            if (response.getBigAncientTastyHeadteacher().size() > 1) {
                                //切换到多产品首页
                                dangqianZhusenceF = stringFragmentHashMap.get(DuoChanPin);
                                if (!(dangqianF instanceof PeizhiAndOutappFragment) && !(dangqianF instanceof ZhuSenceSevenBillFragment)) {
                                    kongzhiFragChange(dangqianF, dangqianZhusenceF);
                                    if (dangqianZhusenceF instanceof ZhuSenceSixMoreProductFragment) {
                                        ((ZhuSenceSixMoreProductFragment) dangqianZhusenceF).shezhiDuochanpinList(ImpZhuyaoActivity.this, response.getBigAncientTastyHeadteacher());
                                    }

                                    qingQiuJiekouDanchunweilePanduanHuankuanhuangtai();

                                    fragcontent_sfjT12jf_buju.setVisibility(View.VISIBLE);

                                }
                            } else {
                                qingQiuJiekou1();
                            }
                        } else {
                            qingQiuJiekou1();
                        }
                    }

                    @Override
                    public void onError(String error) {
                        jiazaizhongWindows.hideKuangkuangIng();
                        if (error.contains("java.net.UnknownHostException:")) {
                            baseaNonet.showPPw(Gravity.CENTER);
                        }
                    }
                });
            } else {
                qingQiuJiekou1();
            }

        }
    }

    public void qingQiuJiekou1() {

        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HOMEPAGE_FOR_UNLOGIN, UnintoTabModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<UnintoTabModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(ImpZhuyaoActivity.this, YONGHU_ID));
                String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                if (TextUtils.isEmpty(s1)) {
                    s1 = "0";
                }
                if (TextUtils.isEmpty(s2)) {
                    s2 = "0";
                }
                map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
//                map.put("coldUnemploymentPrizeCanadianHim", "1");
            }

            @Override
            public void onSuccess(UnintoTabModel response) {
                Log.e("TAG", "response---->" + response);
                jiazaizhongWindows.hideKuangkuangIng();
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {

                    UnintoTabModel.GongyongCanshuModel fanhuibean = response.getBigAncientTastyHeadteacher();
                    if(TextUtils.isEmpty(fanhuibean.getConvenientDesertPunctualJar())){
                        BendiHuancunTols.commitZifuchuan(TOUSUH5TOEKN,fanhuibean.getConvenientDesertPunctualJar());
                    }

                    int leiingInt = fanhuibean.getPoorStrictNeedleShopping();
                    String leixingStr = fanhuibean.getBasicSleepUnableChallengingVase();
                    danziDingId = fanhuibean.getTiredMommyEitherThickEnding();
                    int electronicAllTrick = fanhuibean.getElectronicAllTrick();
                    shiFouFirstJie = !"1".equals(leixingStr);
                    switch (leiingInt) {
                        case 0:
                            //正常订单,已放款，未逾期
                            dangqianZhusenceF = stringFragmentHashMap.get(HUANQIANSTATUS);
                            if (shiFouFukuan_Exten && danziDingId != isZhiFu_zhanQi_orderId) {
                                shiFouFukuan_Exten = false;
                                repaymentDateTv.setVisibility(View.VISIBLE);
                                repaymentDateTv.setText(fanhuibean.regularChineseValley);
                                shuliang = 3;
                                caozuozhe.sendEmptyMessageDelayed(0, 1000);
                                zhanzhanchenggongPPw.showPPw(Gravity.CENTER);
                            }
                            break;
                        case 1:
                            //逾期订单
                            dangqianZhusenceF = stringFragmentHashMap.get(HUANQIANSTATUS);
                            break;
                        case 2:
                            //审批中
                            if (electronicAllTrick == 2) {
                                //放款失败，需更新银行卡操作
                                dangqianZhusenceF = stringFragmentHashMap.get(JIEFAIL);
                            } else if (electronicAllTrick == 3) {//放款中
                                dangqianZhusenceF = stringFragmentHashMap.get(DOINGWORK);
                            } else {
                                //审批中
                                dangqianZhusenceF = stringFragmentHashMap.get(WAITCHECK);
//                                if (dangqianZhusenceF instanceof ZhuSenceTwoWaitFragment)
//                                    ((ZhuSenceTwoWaitFragment) dangqianZhusenceF).qingqiuJiekou1();
                            }
                            break;
                        case 3:
                            //拒绝订单，进入拒绝页面
                            dangqianZhusenceF = stringFragmentHashMap.get(JIEFAIL);
                            break;
                        case -1:
                            dangqianZhusenceF = stringFragmentHashMap.get(FIRSTJIE);
                            if (Objects.equals("1", leixingStr)) {
                                //复贷，进入复贷页面
                                //切换首贷复贷
                                if (dangqianZhusenceF instanceof ZhuSenceOneFirstJieFragment)
                                    ((ZhuSenceOneFirstJieFragment) dangqianZhusenceF).setSecondDaidai(leixingStr);
                            } else {
                                //未下过单状态，默认显示首页
                                if (dangqianZhusenceF instanceof ZhuSenceOneFirstJieFragment)
                                    ((ZhuSenceOneFirstJieFragment) dangqianZhusenceF).setSecondDaidai("2");
                            }
                            if (fanhuibean.eastLaughterPartJungleAngryPhrase > 0) {
//                                ((ZhuSenceOneFirstJieFragment) dangqianZhusenceF).kjhkjythgrjhgfefwdqqYTdg34dsg.setText(ZhuajiPingmuTols.jiageGeshi((int) fanhuibean.eastLaughterPartJungleAngryPhrase));
                            }
                            kongzhiFragChange(dangqianF, dangqianZhusenceF);

                            //还贷后若是可贷款状态则说明还贷成功
                            if (shiFouFukuan) {
                                shiFouFukuan = false;
                                Intent intent = new Intent(ImpZhuyaoActivity.this, RYryBackqianSuceeOkActivity.class);
                                intent.putExtra("zhifue", zhiFuJine);
                                startActivityForResult(intent, 1002);
                            }
                            break;
                        default:
                            break;
                    }

                    shiFouFukuan = false;
                    shiFouFukuan_Exten = false;

                    //保存当前订单号，展期成功弹窗用
                    isZhiFu_zhanQi_orderId = fanhuibean.getTiredMommyEitherThickEnding();
                    double kjyhtgrfe = fanhuibean.getUnusualRatLabourRaincoat() * 2;
                    zhiFuJine = HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form5), kjyhtgrfe));

                    //放款成功
                    if ("0".equals(fanhuibean.agriculturalFish)) {
//                        YincangShijianClickTols.QingqiuMaidian(FANGKUANCHENGGONG);
//                        YincangShijianClickTols.LianshuMaidian(LIANSHUFANGKUANCHENGGONG);
//                        YincangShijianClickTols.HuojiMaidian(HUOJIFANGKUANCHENGGONG);
                    }

                    //放款信息 首贷放款成功
                    if ("0".equals(fanhuibean.electricalCitizenFew)) {
//                        YincangShijianClickTols.QingqiuMaidian(SHOUDAIFANGKUANCHENGGONG);
//                        YincangShijianClickTols.LianshuMaidian(LIANSHUSHOUDAIFANGKUAN);
//                        YincangShijianClickTols.HuojiMaidian(HUOJISHOUDAIFANGKUAN);
                    }


                    if (dangqianZhusenceF instanceof ZhuSenceOneFirstJieFragment) {
                        ((ZhuSenceOneFirstJieFragment) dangqianZhusenceF).qingqiuJiekou1();
                    } else if (dangqianZhusenceF instanceof ZhuSenceTwoWaitFragment) {
                        ((ZhuSenceTwoWaitFragment) dangqianZhusenceF).qingqiuJiekou1();
                    } else if (dangqianZhusenceF instanceof ZhenFenQiHuanKuanFragment) {
                        ((ZhenFenQiHuanKuanFragment) dangqianZhusenceF).qingqiuJiekou1();
                    } else if (dangqianZhusenceF instanceof ZhuSenceFourDoingWorkFragment) {
                        ((ZhuSenceFourDoingWorkFragment) dangqianZhusenceF).qingqiuJiekouCheckingJieguo();
                    } else if (dangqianZhusenceF instanceof ZhuSenceFiveLiangliangleFragment) {
                        ((ZhuSenceFiveLiangliangleFragment) dangqianZhusenceF).qingquJiekou1();
                    }

                    if (!(dangqianF instanceof PeizhiAndOutappFragment))
                        kongzhiFragChange(dangqianF, dangqianZhusenceF);

                    fragcontent_sfjT12jf_buju.setVisibility(View.VISIBLE);
                    //保存当前订单号，展期成功弹窗用
                    shiFou_ry_extenDingId = fanhuibean.getTiredMommyEitherThickEnding();

                } else {
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }


            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
                    fragcontent_sfjT12jf_buju.setVisibility(View.VISIBLE);
                    baseaNonet.showPPw(Gravity.CENTER);
                }
            }
        });

    }

    public void qingQiuJiekouDanchunweilePanduanHuankuanhuangtai() {

        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HOMEPAGE_FOR_UNLOGIN, UnintoTabModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<UnintoTabModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(ImpZhuyaoActivity.this, YONGHU_ID));
                String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                if (TextUtils.isEmpty(s1)) {
                    s1 = "0";
                }
                if (TextUtils.isEmpty(s2)) {
                    s2 = "0";
                }
                map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
//                map.put("coldUnemploymentPrizeCanadianHim", "1");
            }

            @Override
            public void onSuccess(UnintoTabModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    UnintoTabModel.GongyongCanshuModel fanhuibean = response.getBigAncientTastyHeadteacher();
                    int leiingInt = fanhuibean.getPoorStrictNeedleShopping();
                    String leixingStr = fanhuibean.getBasicSleepUnableChallengingVase();
                    danziDingId = fanhuibean.getTiredMommyEitherThickEnding();
                    int electronicAllTrick = fanhuibean.getElectronicAllTrick();
                    shiFouFirstJie = !"1".equals(leixingStr);
                    switch (leiingInt) {
                        case 0:
                            //正常订单,已放款，未逾期
                            if (shiFouFukuan_Exten && danziDingId != isZhiFu_zhanQi_orderId) {
                                shiFouFukuan_Exten = false;
                                repaymentDateTv.setVisibility(View.VISIBLE);
                                repaymentDateTv.setText(fanhuibean.regularChineseValley);
                                shuliang = 3;
                                caozuozhe.sendEmptyMessageDelayed(0, 1000);
                                zhanzhanchenggongPPw.showPPw(Gravity.CENTER);
                            }
                            break;

                        case -1:
                            //还贷后若是可贷款状态则说明还贷成功
                            if (shiFouFukuan) {
                                shiFouFukuan = false;
                                Intent intent = new Intent(ImpZhuyaoActivity.this, RYryBackqianSuceeOkActivity.class);
                                intent.putExtra("zhifue", zhiFuJine);
                                startActivityForResult(intent, 1002);
                            }
                            break;
                        default:
                            break;
                    }
                    shiFouFukuan = false;
                    shiFouFukuan_Exten = false;

                    //保存当前订单号，展期成功弹窗用
                    shiFou_ry_extenDingId = fanhuibean.getTiredMommyEitherThickEnding();
                    double kjyhtgrfe = fanhuibean.getUnusualRatLabourRaincoat() * 2;
                    zhiFuJine = HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form5), kjyhtgrfe));

                } else {
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
                    fragcontent_sfjT12jf_buju.setVisibility(View.VISIBLE);
//                    baseaNonet.showPPw(Gravity.CENTER);
                }
            }
        });

    }

    private int shuliang = 3;

    //咱在写一个计算Welcome界面的广告时间结束后进入主界面的方法
    private int getShuliang() {
        shuliang--;
        if (shuliang <= 0) {
            if (zhanzhanchenggongPPw != null && zhanzhanchenggongPPw.huoquPPwShifouShow()) {
                zhanzhanchenggongPPw.xiaohuiPPw();
            }
        } else {
            hgdasdhfjhgyyyy.setText(String.format(Locale.ENGLISH,getString(R.string.jingogojian_xixicheck_000), shuliang));
        }
        return shuliang;
    }

    //进行一个消息的处理
    @SuppressLint("HandlerLeak")
    private Handler caozuozhe = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if (msg.what == 0) {
                if (getShuliang() > 0) {
                    caozuozhe.sendEmptyMessageDelayed(0, 1000);
                }
            }
        }

        ;
    };


    public void tiaoWangyeHlper(String url, int requestCode) {
        Intent intent = new Intent(this, WangyeHelperWithGugeChormeActivity.class);
        intent.putExtra("web_url", url);
        startActivityForResult(intent, requestCode);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1001) {
//            checkSingleOrMore();
        } else if (requestCode == 1002) {
            checkSingleOrMore();
        } else if (requestCode == 2001) {
            checkSingleOrMore();
        }
    }

    /**
     * 控制fragment的变化
     * <p>
     * xianzaiyongF 现在的
     * xiageyongF 要显示的
     */
    public void kongzhiFragChange(Fragment xianzaiyongF, Fragment xiageyongF) {
        if (xianzaiyongF == null || xiageyongF == null) {
            return;
        }
        try {
            FragmentTransaction asyjhgsdf = getSupportFragmentManager().beginTransaction();
            asyjhgsdf.replace(R.id.fragcontent_sfjT12jf_buju, xiageyongF);
            asyjhgsdf.show(xiageyongF).commitAllowingStateLoss();
            dangqianF = xiageyongF;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * 设置底部栏按钮变色
     */
    public void shezhiDibuMenuColor(int suoyinzhi) {
        switch (suoyinzhi) {
            case 0:
                menutab_stupianf_one.setImageResource(R.mipmap.useimg_gdhgfasrg);
//                mainTv1.setTextColor(getResources().getColor(R.color.sezhi_argb_444444));
                break;
            case 1:
                menutab_stupianf_two.setImageResource(R.mipmap.useimg_tyjhtgrfes);
//                mainTv2.setTextColor(getResources().getColor(R.color.sezhi_argb_444444));
                break;
            case 2:
                menutab_stupianf_dingdna.setImageResource(R.mipmap.useimg_rtyjhdandanliang);
//                mainTv2.setTextColor(getResources().getColor(R.color.sezhi_argb_444444));
                break;
        }
    }

    /**
     * 清除底部栏颜色
     */
    public void qingchuDibuMenuColro(int dangqianweizhi) {
        switch (dangqianweizhi) {
            case 0:
                menutab_stupianf_one.setImageResource(R.mipmap.awfesrdthfyhuseimg_grfeuseimg_);
//                mainTv1.setTextColor(getResources().getColor(R.color.sezhi_argb_73444444));
                break;
            case 1:
                menutab_stupianf_two.setImageResource(R.mipmap.useimg_rtyjhtgrfes);
//                mainTv2.setTextColor(getResources().getColor(R.color.sezhi_argb_73444444));
                break;
            case 2:
                menutab_stupianf_dingdna.setImageResource(R.mipmap.useimg_rtyjhdandanhui);
//                mainTv2.setTextColor(getResources().getColor(R.color.sezhi_argb_73444444));
                break;
        }
    }

    public class CouponGuangboHuidiao extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
//            fragcontent_sfjT12jf_buju.setVisibility(View.GONE);

            shezhiDibuMenuColor(0);
            qingchuDibuMenuColro(1);
            qingchuDibuMenuColro(2);
            dangqianZhusenceF = stringFragmentHashMap.get(FIRSTJIE);
            kongzhiFragChange(dangqianF, dangqianZhusenceF);
            checkSingleOrMore();

        }

    }

//    ChanpinMoxingPPWindows fjalgjsafff;
//
//    //无网络
//    private void chaungjianPPw() {
//        fjalgjsafff = new ChanpinMoxingPPWindows(this);
//
//        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View popupView = popInflater.inflate(R.layout.wndw_xuancxxh_chanpin2, null);
//        TextView jythgrsdtfygukyjh = popupView.findViewById(R.id.jythgrsdtfygukyjh);
//        TextView quxiaoquxiao_fjdoj_buyaoquan = popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
//        TextView gaoding_sure_djdj_yaogeiwo = popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);
//
//        jythgrsdtfygukyjh.setText(getString(R.string.tusitishi_dizih_00));
//        quxiaoquxiao_fjdoj_buyaoquan.setText(getString(R.string.shangpins_foryo_can2));
//        gaoding_sure_djdj_yaogeiwo.setText(getString(R.string.shangpins_foryo_abr));
//
//        popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fjalgjsafff.xiaohuiPPw();
//            }
//        });
//        popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fjalgjsafff.xiaohuiPPw();
//
//                Intent intent = new Intent();
//                intent.setAction("android.net.wifi.PICK_WIFI_NETWORK");
//                startActivity(intent);
//            }
//        });
//
//        fjalgjsafff.chushihuaPPW(popupView, false, (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, false);
//
//    }

    /*if (type == -1) {//可贷

    } else if (type == 0) {//还款中

    } else if (type == 1) {//逾期中

    } else if (type == 2) {
        if (electronicAllTrick == 2) {//放款失败

        } else if (electronicAllTrick == 3) {//放款中
            currentHomeFragment = fragmentMap.get(ChuLiZhong);
        } else {//审核中

        }
    } else if (type == 3) {//拒绝

    }*/


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解绑brocast
        this.unregisterReceiver(homeBtnBrocast);
        //关闭检测app是否关闭的服务
        Intent closeInt = new Intent(this, GuanbiAppService.class);
        stopService(closeInt);
    }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if(keyCode == KeyEvent.KEYCODE_BACK){
//            if(chenggongPPw!=null &&chenggongPPw.huoquPPwShowFou()){
//                chenggongPPw.xiaohuiPPw();
//                return true;
//
//            }else if(baseaNonet!=null &&baseaNonet.huoquPPwShowFou()){
//                baseaNonet.xiaohuiPPw();
//                return true;
//            }
//        }
//        return super.onKeyDown(keyCode, event);
//    }

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

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        //默认显示首贷
        dangqianF = stringFragmentHashMap.get(FIRSTJIE);
        dangqianZhusenceF = stringFragmentHashMap.get(FIRSTJIE);
    }
}