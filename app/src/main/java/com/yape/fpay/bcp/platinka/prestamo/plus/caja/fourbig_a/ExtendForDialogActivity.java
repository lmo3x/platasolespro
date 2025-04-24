package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.FenqiJihuaListModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.LateForRyDetailsModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.RyryHuantypeListModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhifuInfoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.RyryHuanTypeLiebShipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

public class ExtendForDialogActivity extends MyJichuBsActivity implements View.OnClickListener {

    private TextView zhina_sajR23fTv_riqi;//日期
    private TextView zhina_sajR23fTv_servefei;//服务费
    private TextView zhina_sajR23fTv_lixi;//利息
    private TextView zhina_sajR23fTv_zhinajin;//滞纳金
    private TextView zhina_sajR23fTv_zhanshue;//展期金额
    private TextView zhina_sajR23fTv_zhanshueee2;//天数
    private TextView zhina_sajR23fTv_wenwean;//文案
    private TextView dingdanhao_tv_zq;//订单编号
    private ImageView fuzhidingdanhao_img; //复制

    private RelativeLayout zhina_sajR23fTv_zengzhishui, zhina_sajR23fTv_zengzhishushui2;
    private TextView zhina_sajR23fTv_jianmiane;//增值税
    private TextView zhina_sajR23fTv_jianmianeee2;//减免
    private RelativeLayout jhgfasdhgfasfa;//关闭
    private RecyclerView ryry_zhanqitype_luzilist;//还款方式列表
    private RyryHuanTypeLiebShipei ryryZhanqiTypeLiebShipei;

    private String currentorderId;//打开页面时订单id
    private String neworderId;//跳转h5还款回来之后订单id
    private boolean zhanqiHuanOk = false;//是否点了展期跳转支付按钮

    //展期成功弹框
    private ChanpinMoxingPPWindows zhanzhanchenggongPPw;
    //展期成功弹框内元素
    private TextView hgdasdhfjhgyyyy;
    private TextView zhanqihuankuanqi;
    private TextView zhanqichenggongming;

    private String repayPlanIdList = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_for_dialog);


        if (getIntent() != null && getIntent().getStringExtra("clickorderid") != null) {
            currentorderId = getIntent().getStringExtra("clickorderid");
        }

        zhina_sajR23fTv_riqi = findViewById(R.id.zhina_sajR23fTv_riqi);//日期
        zhina_sajR23fTv_servefei = findViewById(R.id.zhina_sajR23fTv_servefei);//服务费
        zhina_sajR23fTv_lixi = findViewById(R.id.zhina_sajR23fTv_lixi);//利息
        zhina_sajR23fTv_zhinajin = findViewById(R.id.zhina_sajR23fTv_zhinajin);//滞纳金
        zhina_sajR23fTv_zhanshue = findViewById(R.id.zhina_sajR23fTv_zhanshue);//展期金额
        zhina_sajR23fTv_zhanshueee2 = findViewById(R.id.zhina_sajR23fTv_zhanshueee2);//展期金额
        zhina_sajR23fTv_wenwean = findViewById(R.id.zhina_sajR23fTv_wenwean);//文案
        dingdanhao_tv_zq = findViewById(R.id.dingdanhao_tv_zq);//订单编号
        fuzhidingdanhao_img = findViewById(R.id.fuzhidingdanhao_img);//订单编号
        ryry_zhanqitype_luzilist = findViewById(R.id.ryry_zhanqitype_luzilist);

        zhina_sajR23fTv_zengzhishui = findViewById(R.id.zhina_sajR23fTv_zengzhishui);//增值税
        zhina_sajR23fTv_jianmiane = findViewById(R.id.zhina_sajR23fTv_jianmiane);//减免金额
        zhina_sajR23fTv_zengzhishushui2 = findViewById(R.id.zhina_sajR23fTv_zengzhishushui2);//增值税
        zhina_sajR23fTv_jianmianeee2 = findViewById(R.id.zhina_sajR23fTv_jianmianeee2);//减免金额
        jhgfasdhgfasfa = findViewById(R.id.jhgfasdhgfasfa);//关闭

        jhgfasdhgfasfa.setOnClickListener(this);
        fuzhidingdanhao_img.setOnClickListener(this);

        qingqiuJiekou2();
        qingqiuhuankuanfangshi();

        initrecyclerviewzhanqi();

        initPopSuccessWindow();

    }

    @Override
    protected void onResume() {
        super.onResume();

        qingQiuJiekou1();
    }


    //展期成功弹框
    private void initPopSuccessWindow() {
        zhanzhanchenggongPPw = new ChanpinMoxingPPWindows(this);

        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_lateapply_chengok, null);
        hgdasdhfjhgyyyy = popupView.findViewById(R.id.hgdasdhfjhgyyyy);
        zhanqihuankuanqi = popupView.findViewById(R.id.zhanqihuankuanqi);
        zhanqichenggongming = popupView.findViewById(R.id.zhanqichenggongming);
        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(ExtendForDialogActivity.this, BendiHuancunTols.APPMINGZI))) {
            zhanqichenggongming.setText(BendiHuancunTols.huoQuZifuchuan(ExtendForDialogActivity.this, BendiHuancunTols.APPMINGZI));
        }
        popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zhanzhanchenggongPPw.xiaohuiPPw();
                finish();
                shuliang = -1;
            }
        });

        zhanzhanchenggongPPw.chushihuaPPW(popupView, false
                , (int) (huoquPingmuKuandu(this) * 1), ViewGroup.LayoutParams.MATCH_PARENT, null, true);
    }

    private int shuliang = 3;

    //咱在写一个计算Welcome界面的广告时间结束后进入主界面的方法
    private int getShuliang() {
        shuliang--;
        if (shuliang <= 0) {
            if (zhanzhanchenggongPPw != null && zhanzhanchenggongPPw.huoquPPwShifouShow()) {
                zhanzhanchenggongPPw.xiaohuiPPw();
                finish();
            }
        } else {
            hgdasdhfjhgyyyy.setText(String.format(Locale.ENGLISH, getString(R.string.jingogojian_xixicheck_000), shuliang));
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

    //初始化list
    private void initrecyclerviewzhanqi() {
        if (ryryZhanqiTypeLiebShipei == null) {
            ryryZhanqiTypeLiebShipei = new RyryHuanTypeLiebShipei(this, new ArrayList<>(), "1");
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        ryry_zhanqitype_luzilist.setLayoutManager(linearLayoutManager);
        ryry_zhanqitype_luzilist.setAdapter(ryryZhanqiTypeLiebShipei);
        ryryZhanqiTypeLiebShipei.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                RyryHuantypeListModel.RyryHuantype bean = (RyryHuantypeListModel.RyryHuantype) adapter.getData().get(position);
                qingqiuhuankuanZhifu(bean, "0304");

            }
        });


    }

    @Override
    public void onClick(View view) {
        if (DianjiQuickTols.clickkuaikuai()) {
            return;
        }
        Intent intent;
        switch (view.getId()) {
            case R.id.jhgfasdhgfasfa:
                finish();
                break;
            case R.id.fuzhidingdanhao_img:
                String code = dingdanhao_tv_zq.getText().toString().trim();
                if (!TextUtils.isEmpty(code)) {
                    ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                    clipboard.setPrimaryClip(ClipData.newPlainText("label", code));
                    ToastUtil.showShortToast("Copiar con éxito");
                }
                break;
        }
    }

    //获取展期弹框信息
    public void qingqiuJiekou2() {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HUOQUHUANKUANJIHUA, FenqiJihuaListModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<FenqiJihuaListModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(getActivity(), BendiHuancunTols.YONGHU_ID));
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
                map.put("tiredMommyEitherThickEnding", currentorderId);
                map.put("eachSharkCleverDishDampFactory", "0304");


            }

            @Override
            public void onSuccess(FenqiJihuaListModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {

                    if (response.getBigAncientTastyHeadteacher().getHonestHelpfulSteamInlandSummary() != null && response.getBigAncientTastyHeadteacher().getHonestHelpfulSteamInlandSummary().size() > 0) {
                        FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO fanhuibean = response.getBigAncientTastyHeadteacher().getHonestHelpfulSteamInlandSummary().get(0);
                        dingdanhao_tv_zq.setText(response.getBigAncientTastyHeadteacher().getSeveralNationChocolate());
                        repayPlanIdList = fanhuibean.getActiveFoxNumberCarpet() + "";
                        //日期
                        if (!TextUtils.isEmpty(fanhuibean.getLeadingArmySweetFrogTinyPacket())) {
                            zhina_sajR23fTv_riqi.setText(fanhuibean.getLeadingArmySweetFrogTinyPacket());
                        }

                        //服务费
                        zhina_sajR23fTv_servefei.setText(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), fanhuibean.getHumanChipsCarefulMentalEnquiry()));
                        //利息
                        zhina_sajR23fTv_lixi.setText(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), fanhuibean.getLeadingJanuaryRightSonPath()));
                        //滞纳金
                        zhina_sajR23fTv_zhinajin.setText(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), fanhuibean.getSuccessfulMinuteBrunchFairMonth()));
                        //展期金额
                        zhina_sajR23fTv_zhanshue.setText(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), fanhuibean.getGentleDecember()));

                        //增值税
                        if (fanhuibean.getBasicSickness() != 0) {
                            zhina_sajR23fTv_zengzhishui.setVisibility(View.VISIBLE);
                            zhina_sajR23fTv_jianmiane.setText(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), fanhuibean.getBasicSickness()));
                        } else {
                            zhina_sajR23fTv_zengzhishui.setVisibility(View.GONE);
                        }

                        //减免金额
                        if (fanhuibean.getPopVolleyballEarlyDelight() != 0) {
                            zhina_sajR23fTv_zengzhishushui2.setVisibility(View.VISIBLE);
                            zhina_sajR23fTv_jianmianeee2.setText("-" + String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), fanhuibean.getPopVolleyballEarlyDelight()));
                        } else {
                            zhina_sajR23fTv_zengzhishushui2.setVisibility(View.GONE);
                        }

                        //文案
                        zhina_sajR23fTv_wenwean.setText(String.format(Locale.ENGLISH, getString(R.string.peizhiandout_egdsgj_xiop),
                                fanhuibean.getAfraidUndividedRestaurant() + ""
                                , fanhuibean.getGentleDecember()));


//                    zhanqiPpw.showPPw(Gravity.CENTER);
                    }

                } else {
//                    Toast.makeText(ExtendForDialogActivity.this, response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
                    baseaNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }


    //获取还款方式
    public void qingqiuhuankuanfangshi() {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HUANKUANFANGSHI, RyryHuantypeListModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<RyryHuantypeListModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
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
                map.put("tiredMommyEitherThickEnding", currentorderId);//dingdan id
                map.put("squareBookshop", "0304");  //type
            }

            @Override
            public void onSuccess(RyryHuantypeListModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {

                    //赋值展期方式列表
                    if (ryryZhanqiTypeLiebShipei != null) {
                        ryryZhanqiTypeLiebShipei.setNewData(response.getBigAncientTastyHeadteacher());
                    } else {
                        ryryZhanqiTypeLiebShipei = new RyryHuanTypeLiebShipei(ExtendForDialogActivity.this, response.getBigAncientTastyHeadteacher(), "1");
                    }

                } else {
//                    Toast.makeText(ExtendForDialogActivity.this, response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
                    baseaNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }


    //请求支付
    public void qingqiuhuankuanZhifu(RyryHuantypeListModel.RyryHuantype clickitem, String payleixing) {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HUOQUZHIFUXINXI1, ZhifuInfoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ZhifuInfoModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
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
                map.put("tiredMommyEitherThickEnding", currentorderId);
                map.put("eachSharkCleverDishDampFactory", payleixing);//payType
                map.put("thoroughLiteraryPeach", clickitem.getThoroughLiteraryPeach());//payChannel
                map.put("properFatDigestPolitics", clickitem.getProperFatDigestPolitics());//payChannelName
                map.put("deadQuickBun", repayPlanIdList); //repayPlanIdList
            }

            @Override
            public void onSuccess(ZhifuInfoModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    if ("01".equals(payleixing)) {
                        ImpZhuyaoActivity.shiFouFukuan_Exten = true;
                    } else {
                        ImpZhuyaoActivity.shiFouFukuan = true;
                    }
                    if ("01".equals(payleixing)) {
                        zhanqiHuanOk = true;
                    }
                    if ("1".equals(response.getBigAncientTastyHeadteacher().getEarlyInventionAirEndlessAncestor())) {
                        Uri uri = Uri.parse(response.getBigAncientTastyHeadteacher().getDoubleForm());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);

                    } else {
                        if ("01".equals(payleixing)) {
                            Intent intent = new Intent(ExtendForDialogActivity.this, WangyeHelperWithGugeChormeActivity.class);
                            intent.putExtra("web_url", response.getBigAncientTastyHeadteacher().getDoubleForm());
                            startActivityForResult(intent, 2001);
                        } else {
                            Intent intent = new Intent(ExtendForDialogActivity.this, WangyeHelperWithGugeChormeActivity.class);
                            intent.putExtra("web_url", response.getBigAncientTastyHeadteacher().getDoubleForm());
                            startActivityForResult(intent, 1001);
                        }
                    }


                } else {
//                    Toast.makeText(ExtendForDialogActivity.this, response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
                    baseaNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    //请求index接口获取新订单id
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
            }

            @Override
            public void onSuccess(UnintoTabModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    UnintoTabModel.GongyongCanshuModel fanhuibean = response.getBigAncientTastyHeadteacher();
                    neworderId = fanhuibean.getTiredMommyEitherThickEnding() + "";

                    //正常订单,已放款，未逾期
                    if (zhanqiHuanOk && !currentorderId.equals(neworderId)) {
                        //关闭展期详情弹窗
                        zhanqiHuanOk = false;
                        caozuozhe.sendEmptyMessageDelayed(0, 1000);
                        zhanqihuankuanqi.setVisibility(View.VISIBLE);
                        zhanqihuankuanqi.setText(fanhuibean.regularChineseValley);
                        //显示展期成功弹框
                        zhanzhanchenggongPPw.showPPw(Gravity.CENTER);

                    }


                    zhanqiHuanOk = false;

                } else {
//                    Toast.makeText(ExtendForDialogActivity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
                    baseaNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });

    }
}