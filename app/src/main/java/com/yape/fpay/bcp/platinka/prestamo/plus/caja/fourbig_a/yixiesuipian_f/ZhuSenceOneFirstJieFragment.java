package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.APPMINGZI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ISTEST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_TOKEN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing2;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.shezhiShujuActivity;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHENQINGBTN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHENQINGBTNFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUSHOUDAIYEEVEVYONEITME;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity.shiFouFirstJie;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HuiqianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PersonShenfenZhaoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZifuchuanPinjieSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.GaogeZhanghaoIntoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.Main2Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian3Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian4Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian5Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsFragment;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ZhuSenceOneFirstJieFragment extends MyJichuBsFragment implements View.OnClickListener {

    private View golbe_sjflT123_dingbuview;
    private ImageView gaohao_tubiaoapp, gaohao_tubiaofanhui, jyhyjhtgrtthg, dajsl_jrTiei_isr2221adjsi;
    public TextView kjythgrfasfafa, jfjffjfls_fjFkfjs35_sfnc, kjhkjythgrjhgfefwdqqYTdg34dsg,str_91dias,str_91dias_miaos;
    public boolean dainjiLeixing = false;
    private RequestOptions ooptptt = RequestOptions
            .circleCropTransform();

    //界面控件
    private Banner lunhaunkongjian;
    //轮播图的数据
    private LunzhuanImgXiazaqi lunzhuanImgXiazaqi;
    private ArrayList<HuiqianModel.RoughNaturalProDTO> tututulist;

    private TextView jingojian1dibuxieyi;
    private LinearLayout jythgsRrthgsdd345sdg;
    private SwipeRefreshLayout shuashau_gjlaTjtj_sja23jdf;

    private LinearLayout asfF_fIRstDaisj33_sjf2fj, sjl_secondgive_xinxi_sfjTjs132;

    private ImpZhuyaoActivity impZhuyaoActivity;
    private TextView duochanpappname;
    private boolean isRefresh;

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
        View view = inflater.inflate(R.layout.f_frag_first, null);
        jiazaizhongWindows.setKefouDianjiWaibu(false);

        qingqiuJiekou1();

        golbe_sjflT123_dingbuview = view.findViewById(R.id.golbe_sjflT123_dingbuview);
        shuashau_gjlaTjtj_sja23jdf = view.findViewById(R.id.shuashau_gjlaTjtj_sja23jdf);

        gaohao_tubiaoapp = view.findViewById(R.id.gaohao_tubiaoapp);
        gaohao_tubiaofanhui = view.findViewById(R.id.gaohao_tubiaofanhui);
//        dajsl_jrTiei_isr2221adjsi = view.findViewById(R.id.dajsl_jrTiei_isr2221adjsi);
//        jingojian1dibuxieyi = view.findViewById(R.id.jingojian1dibuxieyi);GET_SHENFEN_PICTURE
//        jythgsRrthgsdd345sdg = view.findViewById(R.id.jythgsRrthgsdd345sdg);
        jyhyjhtgrtthg = view.findViewById(R.id.jyhyjhtgrtthg);
        TextView asgkjhgsgRYTQerhgd = view.findViewById(R.id.asgkjhgsgRYTQerhgd);
        lunhaunkongjian = (Banner) view.findViewById(R.id.lunzhuantu_djfsljaf_fjfjTjjt233);
        asfF_fIRstDaisj33_sjf2fj = (LinearLayout) view.findViewById(R.id.asfF_fIRstDaisj33_sjf2fj);
        sjl_secondgive_xinxi_sfjTjs132 = (LinearLayout) view.findViewById(R.id.sjl_secondgive_xinxi_sfjTjs132);
        kjythgrfasfafa = (TextView) view.findViewById(R.id.kjythgrfasfafa);
        jfjffjfls_fjFkfjs35_sfnc = (TextView) view.findViewById(R.id.jfjffjfls_fjFkfjs35_sfnc);
        kjhkjythgrjhgfefwdqqYTdg34dsg = (TextView) view.findViewById(R.id.kjhkjythgrjhgfefwdqqYTdg34dsg);
        jingojian1dibuxieyi = view.findViewById(R.id.jingojian1dibuxieyi);
        duochanpappname = view.findViewById(R.id.duochanpappname);
        str_91dias = view.findViewById(R.id.str_91dias);
        str_91dias_miaos = view.findViewById(R.id.str_91dias_miaos);

        DianjiQuickTols.kuaiLeMa(jingojian1dibuxieyi, this);
        DianjiQuickTols.kuaiLeMa(gaohao_tubiaofanhui, this);

        //动态设置状态栏高度
        RelativeLayout.LayoutParams bujuguanli = (RelativeLayout.LayoutParams) golbe_sjflT123_dingbuview.getLayoutParams();
        bujuguanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(getActivity());
        golbe_sjflT123_dingbuview.setLayoutParams(bujuguanli);

        ZifuchuanPinjieSpanTols.with(kjythgrfasfafa).diejiaapped(getString(R.string.tyty_chengoksdj_tas))
                .diejiaapped(" 99%")
                .setQianjingse(getResources().getColor(R.color.sezhi_argb_5377D5))
                .sehzhiJiacu()
                .setZitiDaxiao(ZhuajiPingmuTols.dipdanweiZhuanPxDanwei(getActivity(), 18))
                .chuangjian();
        kjythgrfasfafa.setHighlightColor(getResources().getColor(R.color.sezhi_argb_73000000));

        ZifuchuanPinjieSpanTols.with(jfjffjfls_fjFkfjs35_sfnc)
                .diejiaapped("50% ")
                .setQianjingse(getResources().getColor(R.color.sezhi_argb_5377D5))
                .sehzhiJiacu()
                .setZitiDaxiao(ZhuajiPingmuTols.dipdanweiZhuanPxDanwei(getActivity(), 18))
                .diejiaapped(getString(R.string.tyty_chengoksdj_dea))
                .chuangjian();
        jfjffjfls_fjFkfjs35_sfnc.setHighlightColor(getResources().getColor(R.color.sezhi_argb_73000000));


        if (getActivity() instanceof ImpZhuyaoActivity) {

            gaohao_tubiaoapp.setVisibility(View.VISIBLE);
            gaohao_tubiaofanhui.setVisibility(View.GONE);
        } else if (getActivity() instanceof Main2Activity) {
            gaohao_tubiaoapp.setVisibility(View.GONE);
            gaohao_tubiaofanhui.setVisibility(View.VISIBLE);
        }
        //圆形Logo
        Glide.with(this).asBitmap()
                .load(R.mipmap.useimg_desklogo)
                .apply(ooptptt)
                .into(gaohao_tubiaoapp);

        DianjiQuickTols.kuaiLeMa(asgkjhgsgRYTQerhgd, this);

//        DianjiQuickTols.kuaiLeMa(jythgsRrthgsdd345sdg, this);
        DianjiQuickTols.kuaiLeMa(jyhyjhtgrtthg, this);

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

                qingqiuJiekouLunzhaunImg();
            }
        });

        //创建一个 SpannableString对象
        SpannableString lkajfSSsstr = new SpannableString(getString(R.string.qxppp_usestr_jieshou5));
        //设置字体前景色
        lkajfSSsstr.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.sezhi_argb_5377D5)), 20, 41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);  //设置前景色为洋红色

        //设置下划线
        lkajfSSsstr.setSpan(new UnderlineSpan(), 20, 41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        jingojian1dibuxieyi.setText(lkajfSSsstr);
//        jingojian1dibuxieyi.setMovementMethod(LinkMovementMethod.getInstance());
//        jingojian1dibuxieyi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                XieyiShowTols.quH5YinsiPage(impZhuyaoActivity, YINSI_DIZHI);
//            }
//        });


        switch (GuojiaLeixing) {
            case GuojiaLeixing2://秘鲁
//                dajsl_jrTiei_isr2221adjsi.setImageResource(R.mipmap.useimg_cxxh_icon);
                break;
            default://西班牙
//                dajsl_jrTiei_isr2221adjsi.setImageResource(R.mipmap.useimg_htferrggrrr);
        }

        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI))) {
            duochanpappname.setText(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI));
        }

        qingqiuJiekouLunzhaunImg();
        qingqiuJiekouShouyeJine();
        qingqiuJiekouShouyeTianShu();

        if (getActivity() instanceof ImpZhuyaoActivity) {
            ((ImpZhuyaoActivity) getActivity()).qingqiuJiekouGengxin();
        } else if (getActivity() instanceof Main2Activity) {
            ((Main2Activity) getActivity()).qingqiuJiekouGengxin();
        }

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        //每次进入首页
        YincangShijianClickTols.QingqiuMaidian(JINRUSHOUDAIYEEVEVYONEITME);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {

            qingqiuJiekou1();
            qingqiuJiekouLunzhaunImg();
            qingqiuJiekouShouyeJine();
            qingqiuJiekouShouyeTianShu();
        }
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
                    UnintoTabModel.GongyongCanshuModel bigAncientTastyHeadteacher = response.getBigAncientTastyHeadteacher();

//                    if (!TextUtils.isEmpty(bigAncientTastyHeadteacher.eastLaughterPartJungleAngryPhrase + "")) {
//                        kjhkjythgrjhgfefwdqqYTdg34dsg.setText(HuobigeshiTols.FormatNumber(bigAncientTastyHeadteacher.eastLaughterPartJungleAngryPhrase));
//                    }

                    int type = bigAncientTastyHeadteacher.getPoorStrictNeedleShopping();
                    if (type == -1) {//可贷
                        //去认证
                        if (dainjiLeixing) {
                            qingqiuJiekouKaobei();
                        }
                    }
                    dainjiLeixing = false;
                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
//                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }


    private void qingqiuJiekouLunzhaunImg() {
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
                    List<HuiqianModel.RoughNaturalProDTO> bigAncientTastyHeadteacher = response.getRoughNaturalPro();
                    lunzhuanImgXiazaqi = new LunzhuanImgXiazaqi();
                    //将轮播的图片放在photos 那里
                    tututulist = new ArrayList<HuiqianModel.RoughNaturalProDTO>();
                    tututulist.addAll(bigAncientTastyHeadteacher);
                    chuangjianShitu();
                    if (bigAncientTastyHeadteacher.size() == 0) {
                        lunhaunkongjian.setVisibility(View.GONE);
                    } else {
                        lunhaunkongjian.setVisibility(View.VISIBLE);
                    }
                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                if (error.contains("java.net.UnknownHostException:")) {
//                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }


    //界面初始化
    private void chuangjianShitu() {
        //设置轮播的样式
        lunhaunkongjian.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);  //CIRCLE_INDICATOR
        //设置图片加载器
        lunhaunkongjian.setImageLoader(lunzhuanImgXiazaqi);
        //设置轮播的动画效果,里面有很多种特效,可以都看看效果。
        lunhaunkongjian.setBannerAnimation(Transformer.ZoomOutSlide);
        //设置轮播间隔时间
        lunhaunkongjian.setDelayTime(3000);
        //设置是否为自动轮播，默认是true
        lunhaunkongjian.isAutoPlay(true);
        //设置指示器的位置，小点点，居中显示
        lunhaunkongjian.setIndicatorGravity(BannerConfig.CENTER);
        //设置图片加载地址
        lunhaunkongjian.setImages(tututulist)
                //开始调用的方法，启动轮播图。
                .start();
    }

    public void setSecondDaidai(String leixing) {
        //切换到首贷页面
        if ("1".equals(leixing)) {//复贷
            asfF_fIRstDaisj33_sjf2fj.setVisibility(View.VISIBLE);//默认应该gone 因为没有付姐 所以先显示出来
            sjl_secondgive_xinxi_sfjTjs132.setVisibility(View.GONE);
        } else {//首贷
            asfF_fIRstDaisj33_sjf2fj.setVisibility(View.VISIBLE);
            sjl_secondgive_xinxi_sfjTjs132.setVisibility(View.GONE);
        }
    }


    @Override
    public void onClick(View v) {
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        switch (v.getId()) {
            case R.id.jingojian1dibuxieyi:
                XieyiShowTols.quH5YinsiPage(getActivity());
                break;
            case R.id.asgkjhgsgRYTQerhgd:
                String token = BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_TOKEN);
                if (TextUtils.isEmpty(token)) {
                    Intent intent = new Intent(getActivity(), GaogeZhanghaoIntoActivity.class);
                    startActivity(intent);
                } else {
                    //首贷
                    if (shiFouFirstJie) {
                        YincangShijianClickTols.QingqiuMaidian(DIANJISHENQINGBTNFIRST);
                    }
                    YincangShijianClickTols.QingqiuMaidian(DIANJISHENQINGBTN);
                    dainjiLeixing = true;
                    if (getActivity() instanceof ImpZhuyaoActivity) {
                        ((ImpZhuyaoActivity) getActivity()).checkSingleOrMore();
                    } else if (getActivity() instanceof Main2Activity) {
                        ((Main2Activity) getActivity()).getData();
                    }
                }
                break;
            case R.id.jyhyjhtgrtthg:
                if (!WngluoTols.youWangluoFou(getActivity())) {
                    basefNonet.showPPw(Gravity.CENTER);
                    return;
                }
                String token1 = BendiHuancunTols.huoQuZifuchuan(getActivity(), BendiHuancunTols.YONGHU_TOKEN);
                if (TextUtils.isEmpty(token1)) {
                    XieyiShowTols.quH5KefuPage(getActivity(),"1");
                } else {
                    XieyiShowTols.quH5KefuPage(getActivity(),"2");
                }
//                Intent intent = new Intent(getActivity(), DadianhuaGeiWomenActivity.class);
//                startActivity(intent);
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

    public static class LunzhuanImgXiazaqi extends ImageLoader {
        @Override
        public void displayImage(Context chiyouzhe, Object path, ImageView imageView) {
            HuiqianModel.RoughNaturalProDTO bigAncientTastyHeadteacher = (HuiqianModel.RoughNaturalProDTO) path;

            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            RequestOptions options = new RequestOptions().bitmapTransform(new RoundedCorners(10));//图

            if (!TextUtils.isEmpty(bigAncientTastyHeadteacher.getUnimportantQuickManyComma()))
                Glide.with(chiyouzhe.getApplicationContext())
                        .load(bigAncientTastyHeadteacher.getUnimportantQuickManyComma())
                        .apply(options)
                        .into(imageView);
        }
    }

    private void qingqiuJiekouShouyeTianShu(){
        String test = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), YONGHU_ISTEST);
        String asianBrotherJewelLake;
        if("0".equals(test)){
            asianBrotherJewelLake = "sorryLorryBraveBookcase";
        }else{
            asianBrotherJewelLake = "socialNorthernZoo";
        }
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.GUGESARTSPINGLUN, PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("asianBrotherJewelLake", asianBrotherJewelLake);
            }

            @Override
            public void onSuccess(PeizhiRuanjianModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {

                    if("0".equals(test)){
                        str_91dias.setText(response.getRoughNaturalPro().getSorryLorryBraveBookcase() +  "Días");
                        str_91dias_miaos.setText("Plazo máximo de préstamo "+response.getRoughNaturalPro().getSorryLorryBraveBookcase() +  " días");
                    }else{
                        str_91dias.setText(response.getRoughNaturalPro().getSocialNorthernZoo() +  "Días");
                        str_91dias_miaos.setText("Plazo máximo de préstamo "+response.getRoughNaturalPro().getSocialNorthernZoo() +  " días");
                    }

                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                if (error.contains("java.net.UnknownHostException:")) {
//                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private void qingqiuJiekouShouyeJine() {
        String test = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), YONGHU_ISTEST);
        String asianBrotherJewelLake;
        if("0".equals(test)){
            asianBrotherJewelLake = "eachThemeSecondSalesman";
        }else{
            asianBrotherJewelLake = "helpfulUncleFairTraffic";
        }
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.GUGESARTSPINGLUN, PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("asianBrotherJewelLake", asianBrotherJewelLake);
            }

            @Override
            public void onSuccess(PeizhiRuanjianModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {

                    if("0".equals(test)){
                        kjhkjythgrjhgfefwdqqYTdg34dsg.setText(HuobigeshiTols.FormatNumber(response.getRoughNaturalPro().getEachThemeSecondSalesman()));
                    }else{
                        kjhkjythgrjhgfefwdqqYTdg34dsg.setText(HuobigeshiTols.FormatNumber(response.getRoughNaturalPro().getHelpfulUncleFairTraffic()));
                    }

                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                if (error.contains("java.net.UnknownHostException:")) {
//                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private void qingqiuJiekouKaobei() {
       jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.KAOBEIXINXI2, PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("furnishedSteepFalseForest",YincangShijianClickTols.appshasahId);
            }

            @Override
            public void onSuccess(PeizhiRuanjianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {

                    qingqiuJiekouWanShan();

                } else {
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
//                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }


    private void qingqiuJiekouWanShan() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.JINJIANYEWANSHAN, PersonShenfenZhaoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PersonShenfenZhaoModel>() {
            @Override
            public void OnMap(Map<String, String> map) {

            }

            @Override
            public void onSuccess(PersonShenfenZhaoModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {

                    if(TextUtils.isEmpty(response.getRoughNaturalPro().triangleTowerAids)){
                        shezhiShujuActivity(getActivity());
                    }else {
                        String[] pageType = response.getRoughNaturalPro().triangleTowerAids.split(",");
                        if(pageType.length == 4){
                            if(pageType[0].equals("0")){  //基础信息页面
                                shezhiShujuActivity(getActivity());
                            }else if(pageType[2].equals("0")){ //通讯录页
                                Intent intent = new Intent(getActivity(), JinJinGoGoJian3Activity.class);
                                startActivity(intent);
                            }else if(pageType[3].equals("0")){ //身份证页面
                                Intent intent = new Intent(getActivity(), JinJinGoGoJian4Activity.class);
                                startActivity(intent);
                            }else{ //银行卡页
                                Intent intent = new Intent(getActivity(), JinJinGoGoJian5Activity.class);
                                startActivity(intent);
                            }
                        }
                    }

                } else {
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")) {
//                    basefNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

}
