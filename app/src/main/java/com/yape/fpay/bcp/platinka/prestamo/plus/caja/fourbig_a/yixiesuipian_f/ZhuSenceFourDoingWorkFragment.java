package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.APPMINGZI;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HuiqianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ZhuSenceFourDoingWorkFragment extends MyJichuBsFragment implements View.OnClickListener {

    private View golbe_sjflT123_dingbuview;
    private ImageView jyhyjhtgrtthg;
    private SwipeRefreshLayout shuashau_gjlaTjtj_sja23jdf;
    private TextView adsf_b354GJ_jgwwe3, jfjTjD3_jfjrR333_fjfjfls;
    private ImpZhuyaoActivity impZhuyaoActivity;
    private TextView jingojian1dibuxieyi;

    //界面控件
    private Banner lunzhuantu_djfsljaf_fjfjTjjt233;
    //轮播图的数据
    private PeizhiAndOutappFragment.LunzhuanImgLoader lunzhuanImgLoader;
    private ArrayList<HuiqianModel.RoughNaturalProDTO> photos;

    private RequestOptions options = RequestOptions.circleCropTransform();
    private ImageView loginLogo, gaohao_tubiaofanhui;
    private TextView duochanpappname;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        impZhuyaoActivity = (ImpZhuyaoActivity) context;
//        if(jiazaizhongWindows.isShowingKuangkuangIng()){
//            jiazaizhongWindows.hideKuangkuangIng();
//            jiazaizhongWindows = null;
//        }
    }
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
        View view = inflater.inflate(R.layout.f_frag_doingcheck, null);

        shuashau_gjlaTjtj_sja23jdf = view.findViewById(R.id.shuashau_gjlaTjtj_sja23jdf);
        golbe_sjflT123_dingbuview = view.findViewById(R.id.golbe_sjflT123_dingbuview);
        jyhyjhtgrtthg = view.findViewById(R.id.jyhyjhtgrtthg);
        adsf_b354GJ_jgwwe3 = view.findViewById(R.id.adsf_b354GJ_jgwwe3);
        lunzhuantu_djfsljaf_fjfjTjjt233 = (Banner) view.findViewById(R.id.lunzhuantu_djfsljaf_fjfjTjjt233);
        jfjTjD3_jfjrR333_fjfjfls = view.findViewById(R.id.jfjTjD3_jfjrR333_fjfjfls);
        jingojian1dibuxieyi = view.findViewById(R.id.jingojian1dibuxieyi);
        duochanpappname = view.findViewById(R.id.duochanpappname);
        DianjiQuickTols.kuaiLeMa(jyhyjhtgrtthg, this);
        DianjiQuickTols.kuaiLeMa(jingojian1dibuxieyi, this);

        //动态设置状态栏高度
        RelativeLayout.LayoutParams bujuGuanli = (RelativeLayout.LayoutParams) golbe_sjflT123_dingbuview.getLayoutParams();
        bujuGuanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(getActivity());
        golbe_sjflT123_dingbuview.setLayoutParams(bujuGuanli);

        shuashau_gjlaTjtj_sja23jdf.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                shuashau_gjlaTjtj_sja23jdf.setRefreshing(false);
                if (!WngluoTols.youWangluoFou(getActivity())) {
                    basefNonet.showPPw(Gravity.CENTER);
                    return;
                }

                if (getActivity() instanceof ImpZhuyaoActivity) {
                    ((ImpZhuyaoActivity) getActivity()).checkSingleOrMore();
                    ((ImpZhuyaoActivity) getActivity()).qingqiuJiekouGengxin();
                } else if (getActivity() instanceof Main2Activity) {
                    ((Main2Activity) getActivity()).getData();
                    ((Main2Activity) getActivity()).qingqiuJiekouGengxin();
                }
            }
        });

        loginLogo = view.findViewById(R.id.gaohao_tubiaoapp);
        gaohao_tubiaofanhui = view.findViewById(R.id.gaohao_tubiaofanhui);
        DianjiQuickTols.kuaiLeMa(gaohao_tubiaofanhui, this);
        //圆形Logo
        Glide.with(this).asBitmap()
                .load(R.mipmap.useimg_desklogo)
                .apply(options)
                .into(loginLogo);

        if (getActivity() instanceof ImpZhuyaoActivity) {

            loginLogo.setVisibility(View.VISIBLE);
            gaohao_tubiaofanhui.setVisibility(View.GONE);
        } else if (getActivity() instanceof Main2Activity) {
            loginLogo.setVisibility(View.GONE);
            gaohao_tubiaofanhui.setVisibility(View.VISIBLE);
        }
        qingqiuJiekouCheckingJieguo();

        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI))) {
            duochanpappname.setText(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI));
        }

        return view;
    }

    public void qingqiuJiekouCheckingJieguo() {
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
                    UnintoTabModel.GongyongCanshuModel fanhuiBean = response.getBigAncientTastyHeadteacher();
                    int leixingttt = fanhuiBean.getPoorStrictNeedleShopping();
                    if (leixingttt == 2) {
                        final int masmfjfifff = fanhuiBean.getElectronicAllTrick();
                        if (masmfjfifff == 3) {//放款中
                            adsf_b354GJ_jgwwe3.setText(HuobigeshiTols.FormatNumber(fanhuiBean.getUnusualRatLabourRaincoat()));
                            jfjTjD3_jfjrR333_fjfjfls.setText(fanhuiBean.getDustyLuckyTheirBrownSuffering());
                        }
                    }
                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }
                qingqiujiekouLunzhuanImg();
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


    private void qingqiujiekouLunzhuanImg() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HENGFUTUPIAN, HuiqianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<HuiqianModel>() {
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
                map.put("noisyContentMouse", "03");
            }

            @Override
            public void onSuccess(HuiqianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    List<HuiqianModel.RoughNaturalProDTO> tubean = response.getRoughNaturalPro();
                    lunzhuanImgLoader = new PeizhiAndOutappFragment.LunzhuanImgLoader();
                    //将轮播的图片放在photos 那里
                    photos = new ArrayList<HuiqianModel.RoughNaturalProDTO>();
                    photos.addAll(tubean);
                    chaungjianVshitupage();
                    if (tubean.size() == 0) {
                        lunzhuantu_djfsljaf_fjfjTjjt233.setVisibility(View.GONE);
                    } else {
                        lunzhuantu_djfsljaf_fjfjTjjt233.setVisibility(View.VISIBLE);
                    }
                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                if (error.contains("java.net.UnknownHostException:")) {
                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    //界面初始化
    private void chaungjianVshitupage() {
        //设置轮播的样式
        lunzhuantu_djfsljaf_fjfjTjjt233.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);  //CIRCLE_INDICATOR
        //设置图片加载器
        lunzhuantu_djfsljaf_fjfjTjjt233.setImageLoader(lunzhuanImgLoader);
        //设置轮播的动画效果,里面有很多种特效,可以都看看效果。
        lunzhuantu_djfsljaf_fjfjTjjt233.setBannerAnimation(Transformer.ZoomOutSlide);
        //设置轮播间隔时间
        lunzhuantu_djfsljaf_fjfjTjjt233.setDelayTime(3000);
        //设置是否为自动轮播，默认是true
        lunzhuantu_djfsljaf_fjfjTjjt233.isAutoPlay(true);
        //设置指示器的位置，小点点，居中显示
        lunzhuantu_djfsljaf_fjfjTjjt233.setIndicatorGravity(BannerConfig.CENTER);
        //设置图片加载地址
        lunzhuantu_djfsljaf_fjfjTjjt233.setImages(photos)
                //开始调用的方法，启动轮播图。
                .start();
    }


    @Override
    public void onClick(View view) {
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        switch (view.getId()) {
            case R.id.jyhyjhtgrtthg://跳转客服
                XieyiShowTols.quH5KefuPage(getActivity(),"12");
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
}
