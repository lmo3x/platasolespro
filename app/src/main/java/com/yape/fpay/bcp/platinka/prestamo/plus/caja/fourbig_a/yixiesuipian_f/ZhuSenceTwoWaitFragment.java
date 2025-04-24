package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.APPMINGZI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.HAOPINGTANKUANG;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.DadianhuaGeiWomenActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.Main2Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;

import java.util.Locale;
import java.util.Map;

import androidx.annotation.NonNull;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class ZhuSenceTwoWaitFragment extends MyJichuBsFragment implements View.OnClickListener {

    private View golbe_sjflT123_dingbuview;
    private TextView hgdasdhfjhgyyyy, adsf_b354GJ_jgwwe3, jfjTjD3_jfjrR333_fjfjfls;
    private ImageView jyhyjhtgrtthg;
    private SwipeRefreshLayout shuashau_gjlaTjtj_sja23jdf;
    private TextView jingojian1dibuxieyi;
    private ImageView gaohao_tubiaoapp, gaohao_tubiaofanhui;
    private TextView duochanpappname;


    private RequestOptions options = RequestOptions.circleCropTransform();
    private ImageView loginLogo;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

//    @Override
//    public void onDetach() {
//        super.onDetach();
//        if (jiazaizhongWindows != null) {
//            jiazaizhongWindows.hideKuangkuangIng();
//            jiazaizhongWindows = null;
//        }
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (jiazaizhongWindows != null) {
            jiazaizhongWindows.hideKuangkuangIng();
            jiazaizhongWindows = null;
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f_frag_waitingforcxxh, null);

        shuashau_gjlaTjtj_sja23jdf = view.findViewById(R.id.shuashau_gjlaTjtj_sja23jdf);
        golbe_sjflT123_dingbuview = view.findViewById(R.id.golbe_sjflT123_dingbuview);
        hgdasdhfjhgyyyy = view.findViewById(R.id.hgdasdhfjhgyyyy);
        adsf_b354GJ_jgwwe3 = view.findViewById(R.id.adsf_b354GJ_jgwwe3);
        jfjTjD3_jfjrR333_fjfjfls = view.findViewById(R.id.jfjTjD3_jfjrR333_fjfjfls);
        jyhyjhtgrtthg = view.findViewById(R.id.jyhyjhtgrtthg);
        jingojian1dibuxieyi = view.findViewById(R.id.jingojian1dibuxieyi);
        gaohao_tubiaoapp = view.findViewById(R.id.gaohao_tubiaoapp);
        gaohao_tubiaofanhui = view.findViewById(R.id.gaohao_tubiaofanhui);
        duochanpappname = view.findViewById(R.id.duochanpappname);

        DianjiQuickTols.kuaiLeMa(jingojian1dibuxieyi, this);
        DianjiQuickTols.kuaiLeMa(gaohao_tubiaofanhui, this);


        DianjiQuickTols.kuaiLeMa(jyhyjhtgrtthg, this);


        //动态设置状态栏高度
        RelativeLayout.LayoutParams bujjGuanli = (RelativeLayout.LayoutParams) golbe_sjflT123_dingbuview.getLayoutParams();
        bujjGuanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(getActivity());
        golbe_sjflT123_dingbuview.setLayoutParams(bujjGuanli);

        if (getActivity() instanceof ImpZhuyaoActivity) {

            gaohao_tubiaoapp.setVisibility(View.VISIBLE);
            gaohao_tubiaofanhui.setVisibility(View.GONE);
        } else if (getActivity() instanceof Main2Activity) {
            gaohao_tubiaoapp.setVisibility(View.GONE);
            gaohao_tubiaofanhui.setVisibility(View.VISIBLE);
        }


        qingqiuJiekou1();

        shuashau_gjlaTjtj_sja23jdf.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                shuliang = 15;
                shuashau_gjlaTjtj_sja23jdf.setRefreshing(false);
                if (!WngluoTols.youWangluoFou(getActivity())) {
                    basefNonet.showPPw(Gravity.CENTER);
                    return;
                }
                if (getActivity() instanceof ImpZhuyaoActivity) {
                    ((ImpZhuyaoActivity) getActivity()).checkSingleOrMore();
                    ((ImpZhuyaoActivity) getActivity()).qingqiuJiekouGengxin();
//                    ((ImpZhuyaoActivity) getActivity()).qingqiuJiekougetTouxiang();
                } else if (getActivity() instanceof Main2Activity) {
                    ((Main2Activity) getActivity()).getData();
                    ((Main2Activity) getActivity()).qingqiuJiekouGengxin();
                }
//                impZhuyaoActivity.checkSingleOrMore();
//                impZhuyaoActivity.qingqiuJiekougetTouxiang();
            }
        });
//        handler.sendEmptyMessageDelayed(0, 1000);


        loginLogo = view.findViewById(R.id.gaohao_tubiaoapp);
        //圆形Logo
        Glide.with(this).asBitmap()
                .load(R.mipmap.useimg_desklogo)
                .apply(options)
                .into(loginLogo);


        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI))) {
            duochanpappname.setText(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI));
        }

        return view;
    }


    public void qingqiuJiekou1() {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HOMEPAGE_FOR_UNLOGIN, UnintoTabModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<UnintoTabModel>() {
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
            }

            @Override
            public void onSuccess(UnintoTabModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    UnintoTabModel.GongyongCanshuModel fanhuiBEAN = response.getBigAncientTastyHeadteacher();
                    int type = fanhuiBEAN.getPoorStrictNeedleShopping();
                    if (type == 2) {
                        final int electronicAllTrick = fanhuiBEAN.getElectronicAllTrick();
                        if (electronicAllTrick == 2) {//放款失败
                            shuliang = -1;
                        } else {//审核中
                            if (shuliang == 0) {
                                shuliang = 15;
                                caozuozhe.sendEmptyMessageDelayed(0, 1000);
                            } else {
                                shuliang = 15;
                            }
                            adsf_b354GJ_jgwwe3.setText(HuobigeshiTols.FormatNumber(fanhuiBEAN.getUnusualRatLabourRaincoat()));
//                            if (isTest) {
//                                str_30_11_2020Tv.setText(DateUtil.getDateToString(getTimeMillis() + ((long) 91 * 3600 * 24 * 1000)));
//                            } else {
                            jfjTjD3_jfjrR333_fjfjfls.setText(fanhuiBEAN.getDustyLuckyTheirBrownSuffering());
//                            }
                            if (ImpZhuyaoActivity.shiFouFirstJie) {
                                qingqiuJiekouHuoquApppeizhi();
                            }
                        }
                    } else {
                        shuliang = -1;
                    }
                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    public void qingqiuJiekouHuoquApppeizhi() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.GUGESARTSPINGLUN, PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
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
                map.put("asianBrotherJewelLake", "instantSummaryHeroineComedy");//0是关，1是开
//                map.put("asianBrotherJewelLake",  new Gson().toJson(new StillPigEntity("谷歌评论-开关","1","0是关，1是开\\n可通过状态设置是否启用谷歌评论")));//0是关，1是开
            }

            @Override
            public void onSuccess(PeizhiRuanjianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    PeizhiRuanjianModel.RoughNaturalProBean fanhuibean = response.getRoughNaturalPro();
                    if ("1".equals(fanhuibean.getInstantSummaryHeroineComedy())) {
                        YincangShijianClickTols.QingqiuMaidian(HAOPINGTANKUANG);
                        qidongGugePlayjsldk();//调用谷歌评论弹窗
                        Log.d("haoping","1");

                    }
                } else {
//                    Toast.makeText(MyJichuAplica.getInstance(), response.getnuclearTrialSpareMountainousBat(), android.widget.Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    public int shuliang = 15;

    //咱在写一个计算Welcome界面的广告时间结束后进入主界面的方法
    private int getShuliang() {
        if (isAdded()) {
            shuliang--;
            if (shuliang == 0) {
                qingqiuJiekou1();
            } else {
                if (shuliang > 9) {
                    hgdasdhfjhgyyyy.setText(String.valueOf(shuliang));
                } else {
                    hgdasdhfjhgyyyy.setText(String.format(Locale.ENGLISH, getString(R.string.zhuyetab_waitchek_00), shuliang));
                }
            }
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

    @Override
    public void onClick(View v) {
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        switch (v.getId()) {
            case R.id.jyhyjhtgrtthg:
                XieyiShowTols.quH5KefuPage(getActivity(),"11");
//                Intent intent = new Intent(getActivity(), DadianhuaGeiWomenActivity.class);
//                startActivity(intent);
                break;
            case R.id.jingojian1dibuxieyi://跳转协议
                XieyiShowTols.quH5YinsiPage(getActivity());
                break;
            case R.id.gaohao_tubiaofanhui://返回到多产品
                if (getActivity() instanceof ImpZhuyaoActivity) {
                    ((ImpZhuyaoActivity) getActivity()).checkSingleOrMore();
                } else if (getActivity() instanceof Main2Activity) {
                    ((Main2Activity) getActivity()).finish();
                }
                break;
        }
    }

    public void qidongGugePlayjsldk() {
        ReviewManager fanhuiguanli = ReviewManagerFactory.create(getActivity());
        Task<ReviewInfo> renwuJieguo = fanhuiguanli.requestReviewFlow();
        renwuJieguo.addOnCompleteListener(new OnCompleteListener<ReviewInfo>() {
            @Override
            public void onComplete(@NonNull Task<ReviewInfo> task) {
                if (task.isSuccessful()) {
                    ReviewInfo reviewInfo = task.getResult();
                    reviewInfo.describeContents();
                    Task<Void> liuliuTask = fanhuiguanli.launchReviewFlow(getActivity(), reviewInfo);
                    liuliuTask.addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {
                        }
                    });
                }
            }
        });
    }
}
