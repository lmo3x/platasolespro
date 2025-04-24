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

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.DadianhuaGeiWomenActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.Main2Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian5Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HuiqianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DaiFailTuihuiShitilei;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class ZhuSenceFiveLiangliangleFragment extends MyJichuBsFragment implements View.OnClickListener {

    private String fragLeixing = ImpZhuyaoActivity.JIEFAIL;

    private View gaogehaodingbuheight;
    private TextView liangliang_wenTTVana_bailes35, liangliang_wenTTVana_Titlbiaoshibailes35;
    private TextView str_actualizar_receptora;
    private ImageView jyhyjhtgrtthg;
    private ImageView failcxxh_zhuangtaiimg;
    private TextView jingojian1dibuxieyi;
    private SwipeRefreshLayout shuaxinbuju_fjld_Tsfjf123jf;
    private ImpZhuyaoActivity impZhuyaoActivity;

    private RequestOptions oootptttt = RequestOptions.circleCropTransform();
    private ImageView loginLogo,gaohao_tubiaofanhui;
    private TextView liangliangtitle;
    private TextView duochanpappname;
    //界面控件
    private Banner lunzhuantu_djfsljaf_fjfjTjjt233;
    //轮播图的数据
    private ZhuSenceOneFirstJieFragment.LunzhuanImgXiazaqi lunzhuanImgXiazaqi;
    private ArrayList<HuiqianModel.RoughNaturalProDTO> tutuList;

    private TextView asfdghkjhgdfhgkjhgjhkjhf, jfjTjD3_jfjrR333_fjfjfls;

    private String dingdandaid="";
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
        View gragShitu = inflater.inflate(R.layout.f_frag_failcxxh, null);

        shuaxinbuju_fjld_Tsfjf123jf = gragShitu.findViewById(R.id.shuaxinbuju_fjld_Tsfjf123jf);
        gaogehaodingbuheight = gragShitu.findViewById(R.id.golbe_sjflT123_dingbuview);
        liangliang_wenTTVana_bailes35 = gragShitu.findViewById(R.id.liangliang_wenTTVana_bailes35);
        liangliang_wenTTVana_Titlbiaoshibailes35 = gragShitu.findViewById(R.id.liangliang_wenTTVana_Titlbiaoshibailes35);
        str_actualizar_receptora = gragShitu.findViewById(R.id.str_actualizar_receptora);
        jyhyjhtgrtthg = gragShitu.findViewById(R.id.jyhyjhtgrtthg);
        asfdghkjhgdfhgkjhgjhkjhf = gragShitu.findViewById(R.id.asfdghkjhgdfhgkjhgjhkjhf);
        jfjTjD3_jfjrR333_fjfjfls = gragShitu.findViewById(R.id.jfjTjD3_jfjrR333_fjfjfls);
        failcxxh_zhuangtaiimg = gragShitu.findViewById(R.id.failcxxh_zhuangtaiimg);
        jingojian1dibuxieyi = gragShitu.findViewById(R.id.jingojian1dibuxieyi);
        liangliangtitle = gragShitu.findViewById(R.id.liangliangtitle);
        lunzhuantu_djfsljaf_fjfjTjjt233 = gragShitu.findViewById(R.id.lunzhuantu_djfsljaf_fjfjTjjt233);
        duochanpappname = gragShitu.findViewById(R.id.duochanpappname);
        DianjiQuickTols.kuaiLeMa(jingojian1dibuxieyi,this);
        DianjiQuickTols.kuaiLeMa(jyhyjhtgrtthg,this);

        setFragLeixing(fragLeixing);



        //动态设置状态栏高度
        RelativeLayout.LayoutParams guanlibuju = (RelativeLayout.LayoutParams) gaogehaodingbuheight.getLayoutParams();
        guanlibuju.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(getActivity());
        gaogehaodingbuheight.setLayoutParams(guanlibuju);

        str_actualizar_receptora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!WngluoTols.youWangluoFou(getActivity())) {
                    basefNonet.showPPw(Gravity.CENTER);
                    return;
                }
                Intent intent = new Intent(getActivity(), JinJinGoGoJian5Activity.class);
                intent.putExtra("orderId", dingdandaid);
                intent.putExtra("Home05ShiBaiFragment",true);
                startActivity(intent);
            }
        });
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);

        }else {
            qingquJiekou1(1);
            qinqqiuJiekouGetLunzhuanImg();
        }


        loginLogo = gragShitu.findViewById(R.id.gaohao_tubiaoapp);
        gaohao_tubiaofanhui = gragShitu.findViewById(R.id.gaohao_tubiaofanhui);
        DianjiQuickTols.kuaiLeMa(gaohao_tubiaofanhui, this);
        if (getActivity() instanceof ImpZhuyaoActivity) {

            loginLogo.setVisibility(View.VISIBLE);
            gaohao_tubiaofanhui.setVisibility(View.GONE);
        } else if (getActivity() instanceof Main2Activity) {
            loginLogo.setVisibility(View.GONE);
            gaohao_tubiaofanhui.setVisibility(View.VISIBLE);
        }
        //圆形Logo
        Glide.with(this).asBitmap()
                .load(R.mipmap.useimg_desklogo)
                .apply(oootptttt)
                .into(loginLogo);

        shuaxinbuju_fjld_Tsfjf123jf.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                shuaxinbuju_fjld_Tsfjf123jf.setRefreshing(false);
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

        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI))) {
            duochanpappname.setText(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI));
        }

        return gragShitu;
    }

    //界面初始化
    private void creatPageVshitu() {
        //设置轮播的样式
        lunzhuantu_djfsljaf_fjfjTjjt233.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);  //CIRCLE_INDICATOR
        //设置图片加载器
        lunzhuantu_djfsljaf_fjfjTjjt233.setImageLoader(lunzhuanImgXiazaqi);
        //设置轮播的动画效果,里面有很多种特效,可以都看看效果。
        lunzhuantu_djfsljaf_fjfjTjjt233.setBannerAnimation(Transformer.ZoomOutSlide);
        //设置轮播间隔时间
        lunzhuantu_djfsljaf_fjfjTjjt233.setDelayTime(3000);
        //设置是否为自动轮播，默认是true
        lunzhuantu_djfsljaf_fjfjTjjt233.isAutoPlay(true);
        //设置指示器的位置，小点点，居中显示
        lunzhuantu_djfsljaf_fjfjTjjt233.setIndicatorGravity(BannerConfig.CENTER);
        //设置图片加载地址
        lunzhuantu_djfsljaf_fjfjTjjt233.setImages(tutuList)
                //开始调用的方法，启动轮播图。
                .start();
    }

    public void qingquJiekou1() {
        qingquJiekou1(1);
    }
    public void qingquJiekou1(int types) {
        if (jiazaizhongWindows == null){
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
                if(TextUtils.isEmpty(s1)){
                    s1="0";
                }
                if(TextUtils.isEmpty(s2)){
                    s2="0";
                }
                map.put("looseCivilInchCrowdedAnyone",  s1 + "," +  s2);//lbs
                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
//                map.put("coldUnemploymentPrizeCanadianHim", "1");
            }

            @Override
            public void onSuccess(UnintoTabModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    UnintoTabModel.GongyongCanshuModel fanhuibean = response.getBigAncientTastyHeadteacher();
                    int ghfgdfsa = fanhuibean.getElectronicAllTrick();
                    int leixingttt = fanhuibean.getPoorStrictNeedleShopping();
                    double mjhrgfea = fanhuibean.eastLaughterPartJungleAngryPhrase;
                    String vvvstfsadsg = fanhuibean.tiredSatellitePacificDifficultGarden;
                    dingdandaid = fanhuibean.getTiredMommyEitherThickEnding()+"";
                    if (leixingttt == 3) {

//                        qingqiuJiekouHuoquApppeizhi();
                        //拒绝
                        failcxxh_zhuangtaiimg.setImageResource(R.mipmap.fragzhuangtai_diff_liangliang);
                        liangliangtitle.setText(R.string.zhuyetab_waitchek_jujuetitle);
                        liangliang_wenTTVana_Titlbiaoshibailes35.setText(R.string.zhuyetab_fangfail_sol);
                        str_actualizar_receptora.setVisibility(View.GONE);
                        liangliang_wenTTVana_bailes35.setText(String.format(Locale.ENGLISH,getString(R.string.zhuyetab_fangfail_los1),fanhuibean.getThisHenPleasantFrenchman()));

                        if (types == 1){
                            qingqiuJiekouHuoquFailskjf();
                        }
                    } else if (leixingttt == 2) {
                        if (ghfgdfsa == 2) {//放款失败
                            failcxxh_zhuangtaiimg.setImageResource(R.mipmap.fragzhuangtai_diff_givefail);
                            liangliangtitle.setText(R.string.zhuyetab_waitchek_kacuotitle);
                            liangliang_wenTTVana_Titlbiaoshibailes35.setText(R.string.zhuyetab_fangfail_pre);
                            liangliang_wenTTVana_bailes35.setText(getString(R.string.zhuyetab_fangfail_els));
                            str_actualizar_receptora.setVisibility(View.VISIBLE);
                            asfdghkjhgdfhgkjhgjhkjhf.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), mjhrgfea));//还款金额
                            jfjTjD3_jfjrR333_fjfjfls.setText(vvvstfsadsg);//还款日期
                        }
                    }
                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")){
                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    //原来请求拒绝天数的接口
    public void qingqiuJiekouHuoquApppeizhi() {
        jiazaizhongWindows.showKuangkuangIng();//
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.GUGESARTSPINGLUN, PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(getActivity(), BendiHuancunTols.YONGHU_ID));
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
                map.put("asianBrotherJewelLake",  "englishDirectionJudgement");//xaici dai tianshu
//                map.put("asianBrotherJewelLake",  new Gson().toJson(new StillPigEntity("谷歌评论-开关","1","0是关，1是开\\n可通过状态设置是否启用谷歌评论")));//0是关，1是开
            }

            @Override
            public void onSuccess(PeizhiRuanjianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    PeizhiRuanjianModel.RoughNaturalProBean fanhuibean = response.getRoughNaturalPro();
                    if (!TextUtils.isEmpty(fanhuibean.getEnglishDirectionJudgement())){
                        liangliang_wenTTVana_bailes35.setText(String.format(Locale.ENGLISH,getString(R.string.zhuyetab_fangfail_los),fanhuibean.getEnglishDirectionJudgement()));

//                        YincangShijianClickTols.QingqiuMaidian(GUGETANKUANG);
                    }
                } else {
//                    Toast.makeText(MyJichuAplica.getInstance(), response.getnuclearTrialSpareMountainousBat(), android.widget.Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")){
                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private void qinqqiuJiekouGetLunzhuanImg() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HENGFUTUPIAN, HuiqianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<HuiqianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(getActivity(), BendiHuancunTols.YONGHU_ID));
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
            public void onSuccess(HuiqianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    List<HuiqianModel.RoughNaturalProDTO> fanhuibean = response.getRoughNaturalPro();
                    lunzhuanImgXiazaqi = new ZhuSenceOneFirstJieFragment.LunzhuanImgXiazaqi();
                    //将轮播的图片放在photos 那里
                    tutuList = new ArrayList<HuiqianModel.RoughNaturalProDTO>();
                    tutuList.addAll(fanhuibean);
                    creatPageVshitu();
                    if (fanhuibean.size() == 0){
                        lunzhuantu_djfsljaf_fjfjTjjt233.setVisibility(View.GONE);
                    }else {
                        lunzhuantu_djfsljaf_fjfjTjjt233.setVisibility(View.VISIBLE);
                    }
                }else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                if (error.contains("java.net.UnknownHostException:")){
                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }


    private void qingqiuJiekouHuoquFailskjf() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.JUJUEZHUANGTAI, DaiFailTuihuiShitilei.class, new WangluoQingqiuVolyeyeTols.OnResponse<DaiFailTuihuiShitilei>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(getActivity(), BendiHuancunTols.YONGHU_ID));
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
                map.put("noisyContentMouse", "03");
            }

            @Override
            public void onSuccess(DaiFailTuihuiShitilei response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    //首贷申请拒绝
                    if (response.getRoughNaturalPro().size() > 0){
                        DaiFailTuihuiShitilei.RoughNaturalProBean fanhuiBean = response.getRoughNaturalPro().get(0);

                        if ("1".equals(fanhuiBean.livingHeroineGod)) {
//                            YincangShijianClickTols.QingqiuMaidian(SHOUDAIJUJUE);
                        }
                    }
                }else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                if (error.contains("java.net.UnknownHostException:")){
                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    public void setFragLeixing(String fragLeixing) {
        this.fragLeixing = fragLeixing;
        if (fragLeixing.equals(ImpZhuyaoActivity.JIEFAIL)) {
            if (liangliang_wenTTVana_bailes35 != null)
                liangliang_wenTTVana_bailes35.setText(R.string.zhuyetab_fangfail_los);
            if (liangliang_wenTTVana_Titlbiaoshibailes35 != null)
                liangliang_wenTTVana_Titlbiaoshibailes35.setText(R.string.zhuyetab_fangfail_sol);
            failcxxh_zhuangtaiimg.setImageResource(R.mipmap.fragzhuangtai_diff_liangliang);
        } else if (fragLeixing.equals(ImpZhuyaoActivity.GIVEQIANFAIL)) {
            if (liangliang_wenTTVana_bailes35 != null)
                liangliang_wenTTVana_bailes35.setText(getString(R.string.zhuyetab_fangfail_els));
            if (liangliang_wenTTVana_Titlbiaoshibailes35 != null)
                liangliang_wenTTVana_Titlbiaoshibailes35.setText(R.string.zhuyetab_fangfail_pre);
            failcxxh_zhuangtaiimg.setImageResource(R.mipmap.fragzhuangtai_diff_givefail);
        }
    }

    @Override
    public void onClick(View view) {
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        switch (view.getId()) {
            case R.id.jyhyjhtgrtthg://跳转客服
                if (liangliang_wenTTVana_Titlbiaoshibailes35.getText().equals(getString(R.string.zhuyetab_fangfail_pre))) {
                    XieyiShowTols.quH5KefuPage(getActivity(),"13");
                }else{
                    XieyiShowTols.quH5KefuPage(getActivity(),"14");
                }
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
