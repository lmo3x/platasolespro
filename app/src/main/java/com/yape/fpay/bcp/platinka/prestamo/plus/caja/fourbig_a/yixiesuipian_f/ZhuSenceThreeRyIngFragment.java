package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.RyryHuantypeListModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhaowomenFuwuModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhifuInfoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.DadianhuaGeiWomenActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZifuchuanPinjieSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.Main2Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.LateForRyDetailsModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HuiqianModel1;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.RyryHuanTypeLiebShipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ShijianTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.RiliTols;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.APPMINGZI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.TOUSUH5TOEKN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.HUANKUANTOUSU;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuGodu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing2;

public class ZhuSenceThreeRyIngFragment extends MyJichuBsFragment implements View.OnClickListener {

    private String fragLeixing = ImpZhuyaoActivity.HUANQIANSTATUS;

    private View golbe_sjflT123_dingbuview;
    private LinearLayout miyjuthyrgtefarsrdhgfa, fasjlfjr_jJ4JLFSJsjf_jfjTpdfj;
    private RelativeLayout rryry_sjanest_rlbuju, tyjth_jldjYiegji2_fjs223jfj, adsh_fjT22sdjl_hgfsa2, adsh_fjT22sdjl_hgfsa22, jhgdfasGhgdfa_rldsjlkd_bujubujurl;
    private TextView yjhgfashgfRryh34g, jfjTjD3_jfjrR333_fjfjfls, sdtfygijuthyrgefas5rhgTfhgYFgs;
    private TextView adsh_fjT22sdjl_hgfsa, rryry_sjanest_ttxxtt77,  thgfsdtjhgfasrdthg22;
    private ImageView jyhyjhtgrtthg;
    private ImageView fragrycxxh_beforedate;
    private NestedScrollView rryry_sjanest_huadongbuju;
    private TextView ryry_aboutryxinxi_huanshuliang, ryry_aboutryxinxi_riqi, ryry_aboutryxinxi_daishue, ryry_aboutryxinxi_dailixi, asfdghkjhgdfhgkjhgjhkjhf, ryry_aboutryxinxi_daishuewanfakuan, ryry_ryxinxi_dhuanhuan;

    private ChanpinMoxingPPWindows chenggongPPw;
    public ChanpinMoxingPPWindows zhanqiPpw;
    private SwipeRefreshLayout shuashau_gjlaTjtj_sja23jdf;
    private LinearLayout rycxxh_huancuishoutousu;

    private ImpZhuyaoActivity impZhuyaoActivity;

    private RequestOptions tupianCaozuo = RequestOptions.circleCropTransform();
    private ImageView loginLogo,gaohao_tubiaofanhui;
    private TextView duochanpappname;
    private RecyclerView ryry_rytype_luzilist;
    private int danziDingId = 0;
    private double gonyognAAsssc = 0.0;
    private boolean putongHuanOk = false;
    private boolean zhanqiHuanOk = false;

    private ImageView zhengchangry_zhuangtai_img, latery_zhuangtai_img;

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
        View ftagShitu = inflater.inflate(R.layout.f_frag_rycxxh_ing, null);


        shuashau_gjlaTjtj_sja23jdf = ftagShitu.findViewById(R.id.shuashau_gjlaTjtj_sja23jdf);
        golbe_sjflT123_dingbuview = ftagShitu.findViewById(R.id.golbe_sjflT123_dingbuview);
        yjhgfashgfRryh34g = ftagShitu.findViewById(R.id.yjhgfashgfRryh34g);
        adsh_fjT22sdjl_hgfsa = ftagShitu.findViewById(R.id.adsh_fjT22sdjl_hgfsa);
        adsh_fjT22sdjl_hgfsa2 = ftagShitu.findViewById(R.id.adsh_fjT22sdjl_hgfsa2);
        adsh_fjT22sdjl_hgfsa22 = ftagShitu.findViewById(R.id.adsh_fjT22sdjl_hgfsa22);
        jyhyjhtgrtthg = ftagShitu.findViewById(R.id.jyhyjhtgrtthg);
        jhgdfasGhgdfa_rldsjlkd_bujubujurl = ftagShitu.findViewById(R.id.jhgdfasGhgdfa_rldsjlkd_bujubujurl);

        rryry_sjanest_huadongbuju = ftagShitu.findViewById(R.id.rryry_sjanest_huadongbuju);
        rryry_sjanest_rlbuju = ftagShitu.findViewById(R.id.rryry_sjanest_rlbuju);
        rryry_sjanest_ttxxtt77 = ftagShitu.findViewById(R.id.rryry_sjanest_ttxxtt77);
        miyjuthyrgtefarsrdhgfa = ftagShitu.findViewById(R.id.miyjuthyrgtefarsrdhgfa);
        fasjlfjr_jJ4JLFSJsjf_jfjTpdfj = ftagShitu.findViewById(R.id.fasjlfjr_jJ4JLFSJsjf_jfjTpdfj);

        ryry_aboutryxinxi_huanshuliang = ftagShitu.findViewById(R.id.ryry_aboutryxinxi_huanshuliang);//还款金额
        ryry_aboutryxinxi_riqi = ftagShitu.findViewById(R.id.ryry_aboutryxinxi_riqi);//还款日期
        ryry_aboutryxinxi_daishue = ftagShitu.findViewById(R.id.ryry_aboutryxinxi_daishue);//贷款金额
        asfdghkjhgdfhgkjhgjhkjhf = ftagShitu.findViewById(R.id.asfdghkjhgdfhgkjhgjhkjhf);//贷款金额
        ryry_aboutryxinxi_dailixi = ftagShitu.findViewById(R.id.ryry_aboutryxinxi_dailixi);//利息
        ryry_aboutryxinxi_daishuewanfakuan = ftagShitu.findViewById(R.id.ryry_aboutryxinxi_daishuewanfakuan);//逾期费用
        ryry_ryxinxi_dhuanhuan = ftagShitu.findViewById(R.id.ryry_ryxinxi_dhuanhuan);
        jfjTjD3_jfjrR333_fjfjfls = ftagShitu.findViewById(R.id.jfjTjD3_jfjrR333_fjfjfls);
        sdtfygijuthyrgefas5rhgTfhgYFgs = ftagShitu.findViewById(R.id.sdtfygijuthyrgefas5rhgTfhgYFgs);
        tyjth_jldjYiegji2_fjs223jfj = ftagShitu.findViewById(R.id.tyjth_jldjYiegji2_fjs223jfj);
        thgfsdtjhgfasrdthg22 = ftagShitu.findViewById(R.id.thgfsdtjhgfasrdthg22);

        zhengchangry_zhuangtai_img = ftagShitu.findViewById(R.id.zhengchangry_zhuangtai_img);
        latery_zhuangtai_img = ftagShitu.findViewById(R.id.latery_zhuangtai_img);
        loginLogo = ftagShitu.findViewById(R.id.gaohao_tubiaoapp);
        gaohao_tubiaofanhui = ftagShitu.findViewById(R.id.gaohao_tubiaofanhui);
        duochanpappname= ftagShitu.findViewById(R.id.duochanpappname);
        ryry_rytype_luzilist= ftagShitu.findViewById(R.id.ryry_rytype_luzilist);
        fragrycxxh_beforedate= ftagShitu.findViewById(R.id.fragrycxxh_beforedate);
        rycxxh_huancuishoutousu= ftagShitu.findViewById(R.id.rycxxh_huancuishoutousu);

        jyhyjhtgrtthg.setOnClickListener(this);
        rryry_sjanest_ttxxtt77.setOnClickListener(this);
        gaohao_tubiaofanhui.setOnClickListener(this);
        fragrycxxh_beforedate.setOnClickListener(this);
        rycxxh_huancuishoutousu.setOnClickListener(this);

        setFragLeixing(fragLeixing);

        //动态设置状态栏高度
        RelativeLayout.LayoutParams bujuguanli = (RelativeLayout.LayoutParams) golbe_sjflT123_dingbuview.getLayoutParams();
        bujuguanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(getActivity());
        golbe_sjflT123_dingbuview.setLayoutParams(bujuguanli);
        initPopSuccessWindow();
        chuangjianZahnqiqiPPW();
        initBeforeWindow();
        initSoutuWindow();

        qingqiuJiekou1();
        qingqiuhuankuanfangshi(false);
        qingqiuJiekouHuoquApppeizhi();
        qingqiuJiekouHuoquApppeizhi2();
//        qingqiuJiekouHuoquApppeizhi3();
        qingqiuJiekouSousuneirong();

        initrecyclerview();


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
                .apply(tupianCaozuo)
                .into(loginLogo);

        loginLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                throw new RuntimeException("Test Crash");
            }
        });

        shuashau_gjlaTjtj_sja23jdf.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                shuashau_gjlaTjtj_sja23jdf.setRefreshing(false);
                if (!WngluoTols.youWangluoFou(getActivity())) {
                    basefNonet.showPPw(Gravity.CENTER);
                    return;
                }
//                ryry_rytype_luzilist.seasdasdasd
                if (getActivity() instanceof ImpZhuyaoActivity) {
                    ((ImpZhuyaoActivity) getActivity()).checkSingleOrMore();
                    qingqiuJiekouHuoquApppeizhi();
                    qingqiuJiekouHuoquApppeizhi2();//每次刷新页面都请求是否有投诉弹框
//                    qingqiuJiekouHuoquApppeizhi3();
                    qingqiuJiekouSousuneirong();
                    qingqiuhuankuanfangshi(false);
                } else if (getActivity() instanceof Main2Activity) {
                    ((Main2Activity) getActivity()).getData();
                    qingqiuJiekouHuoquApppeizhi();
                    qingqiuJiekouHuoquApppeizhi2();//每次刷新页面都请求是否有投诉弹框
//                    qingqiuJiekouHuoquApppeizhi3();
                    qingqiuJiekouSousuneirong();
                    qingqiuhuankuanfangshi(false);
                }
            }
        });

        switch (GuojiaLeixing) {
            case GuojiaLeixing2://秘鲁
                fasjlfjr_jJ4JLFSJsjf_jfjTpdfj.setVisibility(View.VISIBLE);
                tyjth_jldjYiegji2_fjs223jfj.setVisibility(View.GONE);
                break;
            default://西班牙
                fasjlfjr_jJ4JLFSJsjf_jfjTpdfj.setVisibility(View.GONE);
                tyjth_jldjYiegji2_fjs223jfj.setVisibility(View.VISIBLE);
        }


        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI))) {
            duochanpappname.setText(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI));
        }

        //提前还款动画
        beforeanimation(fragrycxxh_beforedate);

        return ftagShitu;
    }

    private RyryHuanTypeLiebShipei ryryHuanTypeLiebShipei;
    private void initrecyclerview(){

        if (ryryHuanTypeLiebShipei == null) {
            ryryHuanTypeLiebShipei = new RyryHuanTypeLiebShipei(getContext(), new ArrayList<>(),"0");
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        ryry_rytype_luzilist.setLayoutManager(linearLayoutManager);
        ryry_rytype_luzilist.setAdapter(ryryHuanTypeLiebShipei);
        ryryHuanTypeLiebShipei.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if(DianjiQuickTols.clickkuaikuai()){
                    return;
                }
                RyryHuantypeListModel.RyryHuantype bean = (RyryHuantypeListModel.RyryHuantype) adapter.getData().get(position);
                qingqiuhuankuanZhifu(bean,"00");

            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        if(putongHuanOk){
            if (getActivity() instanceof ImpZhuyaoActivity) {
//                ImpZhuyaoActivity.shiFouFukuan = true;
                ((ImpZhuyaoActivity) getActivity()).checkSingleOrMore();
            } else if (getActivity() instanceof Main2Activity) {
//                Main2Activity.isZhiFu = true;
                ((Main2Activity) getActivity()).getData();
            }
        }else {
            if (getActivity() instanceof ImpZhuyaoActivity) {
//                ImpZhuyaoActivity.shiFouFukuan_Exten = true;
                ((ImpZhuyaoActivity) getActivity()).checkSingleOrMore();
            } else if (getActivity() instanceof Main2Activity) {
//                Main2Activity.isZhiFu_zhanQi = true;
                ((Main2Activity) getActivity()).getData();
            }
        }
    }

    public void setFragLeixing(String fragLeixing) {
        this.fragLeixing = fragLeixing;
        if (fragLeixing.equals(ImpZhuyaoActivity.HUANQIANSTATUS)) {
            yjhgfashgfRryh34g.setVisibility(View.VISIBLE);
            adsh_fjT22sdjl_hgfsa.setVisibility(View.GONE);
            adsh_fjT22sdjl_hgfsa2.setVisibility(View.VISIBLE);
            adsh_fjT22sdjl_hgfsa22.setVisibility(View.GONE);

            zhengchangry_zhuangtai_img.setVisibility(View.VISIBLE);
            latery_zhuangtai_img.setVisibility(View.GONE);
        } else if (fragLeixing.equals(ImpZhuyaoActivity.ALREADYLATEHUAN)) {
            adsh_fjT22sdjl_hgfsa.setVisibility(View.VISIBLE);
            adsh_fjT22sdjl_hgfsa2.setVisibility(View.GONE);
            adsh_fjT22sdjl_hgfsa22.setVisibility(View.VISIBLE);

            yjhgfashgfRryh34g.setVisibility(View.GONE);
            zhengchangry_zhuangtai_img.setVisibility(View.GONE);
            latery_zhuangtai_img.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onClick(View view) {
        if(DianjiQuickTols.clickkuaikuai()){
            return;
        }
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        switch (view.getId()) {

            case R.id.rryry_sjanest_ttxxtt77://展期还款
                qingqiuJiekou2();
                break;

            case R.id.jyhyjhtgrtthg://跳转客服

                if (yjhgfashgfRryh34g.getVisibility()==View.VISIBLE) {
                    XieyiShowTols.quH5KefuPage(getActivity(),"16");

                } else{
                    XieyiShowTols.quH5KefuPage(getActivity(),"17");
                }
//                Intent intent1 = new Intent(getActivity(),DadianhuaGeiWomenActivity.class);
//                startActivity(intent1);
                break;
            case R.id.rycxxh_huancuishoutousu://跳转到聚合客服投诉

                opensoutuh5();
                break;

            case R.id.gaohao_tubiaofanhui://返回到多产品
                if (getActivity() instanceof ImpZhuyaoActivity) {
                    ((ImpZhuyaoActivity) getActivity()).checkSingleOrMore();
                } else if (getActivity() instanceof Main2Activity) {
                    ((Main2Activity) getActivity()).finish();
                }
                break;
                case R.id.fragrycxxh_beforedate://显示提前还款提示弹框

                    beforedatePPw.showPPw(Gravity.CENTER);
                break;


        }
    }

    private void opencallus(){

    }

    private UnintoTabModel.GongyongCanshuModel fanhuibean;
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
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->huankuan" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    fanhuibean = response.getBigAncientTastyHeadteacher();
                    if(TextUtils.isEmpty(fanhuibean.getConvenientDesertPunctualJar())){
                        BendiHuancunTols.commitZifuchuan(TOUSUH5TOEKN,fanhuibean.getConvenientDesertPunctualJar());
                    }

                    //提前还款金额
                    if(!TextUtils.isEmpty(fanhuibean.eastLaughterPartJungleAngryPhrase+"")){
                        shezhiStrspanl(wndwtiqian_before1,String.format(Locale.ENGLISH,getString(R.string.repy_zhuanyi), HuobigeshiTols.FormatNumber(fanhuibean.eastLaughterPartJungleAngryPhrase*2)));
//                        wndwtiqian_before1.setText(String.format(Locale.ENGLISH,getString(R.string.repy_zhuanyi), HuobigeshiTols.FormatNumber(fanhuibean.eastLaughterPartJungleAngryPhrase*2)));
                    }
                    if(!TextUtils.isEmpty(fanhuibean.getPoisonousPhotographerSauce()+"")){
                        shezhiStrspanl2(wndwtiqian_before2,String.format(Locale.ENGLISH,getString(R.string.repy_zhuanyi), HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(fanhuibean.getPoisonousPhotographerSauce() + ""))));
//                        wndwtiqian_before2.setText(String.format(Locale.ENGLISH,getString(R.string.repy_before21), HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(fanhuibean.getPoisonousPhotographerSauce() + ""))));
                    }


                    if ("1".equals(fanhuibean.getThickCopContinent())) {
                        rryry_sjanest_ttxxtt77.setVisibility(View.VISIBLE);
                        fasjlfjr_jJ4JLFSJsjf_jfjTpdfj.setVisibility(View.VISIBLE);
                    } else {
                        rryry_sjanest_ttxxtt77.setVisibility(View.GONE);
                        fasjlfjr_jJ4JLFSJsjf_jfjTpdfj.setVisibility(View.GONE);
                    }

                    double ddsadhfgdf = fanhuibean.getFondForestChemicalCameraArabicCrime();
                    double kjyhtgrfe = fanhuibean.getShallowUniversePracticalNobody();
                    double awfesgrdhtf = fanhuibean.electricEveryAutumn;
                    double mnhrgefasgr = fanhuibean.successfulMinuteBrunchFairMonth;//延迟费用
                    int afesgrdtrtfrd = fanhuibean.commonUselessMinority;//天数
                    String nhgefagsrdh = fanhuibean.regularChineseValley;
                    //orderId
                    danziDingId = fanhuibean.tiredMommyEitherThickEnding;
                    int adwfesgrdthgsefr = fanhuibean.radioactiveAtmosphereBacterium;//逾期天数

                    asfdghkjhgdfhgkjhgjhkjhf.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form5), kjyhtgrfe)));//还款金额
                    jfjTjD3_jfjrR333_fjfjfls.setText(nhgefagsrdh);//还款日期

                    String yinyinsisis = BendiHuancunTols.huoQuZifuchuan(getActivity(), fanhuibean.tiredMommyEitherThickEnding + "");
                    if (!"1".equals(yinyinsisis)) {
                        try{
                            //存储在日历里面
                            long tasty = ShijianTols.zifuchuanZhuanShijianchuo2(nhgefagsrdh);
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                                RiliTols.tainJaiShijian(getActivity(),
                                        getString(R.string.ruanjianapp_mingzi) + " Fecha de vencimiento del reembolso en efectivo"
                                        , "Su fecha de vencimiento de pago de " + getString(R.string.ruanjianapp_mingzi) + ", ¡pague a tiempo!"
                                        , tasty, 2);
                                BendiHuancunTols.commitZifuchuan(fanhuibean.tiredMommyEitherThickEnding + "", "1");
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }

                    ryry_aboutryxinxi_huanshuliang.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), kjyhtgrfe)));//还款金额
                    ryry_aboutryxinxi_riqi.setText(nhgefagsrdh);//还款日期
                    ryry_aboutryxinxi_daishue.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), ddsadhfgdf)));//贷款金额
                    ryry_aboutryxinxi_dailixi.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), awfesgrdhtf)));//利息

                    //减免金额
                    if (fanhuibean.popVolleyballEarlyDelight != 0) {
                        jhgdfasGhgdfa_rldsjlkd_bujubujurl.setVisibility(View.VISIBLE);
                        sdtfygijuthyrgefas5rhgTfhgYFgs.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), fanhuibean.popVolleyballEarlyDelight));
                    } else {
                        jhgdfasGhgdfa_rldsjlkd_bujubujurl.setVisibility(View.GONE);
                    }

                    gonyognAAsssc = fanhuibean.popVolleyballEarlyDelight;

                    rryry_sjanest_ttxxtt77.setText(String.format(Locale.ENGLISH,getString(R.string.zhuyetab_ryingzhong_pro2), afesgrdtrtfrd));
//                    thgfsdtjhgfasrdthg.setText(Html.fromHtml(String.format(Locale.ENGLISH,getString(R.string.peizhiandout_egdsgj_tuc), adwfesgrdthgsefr)));
//                    thgfsdtjhgfasrdthg22.setText(Html.fromHtml(String.format(Locale.ENGLISH,getString(R.string.peizhiandout_egdsgj_tuc), adwfesgrdthgsefr)));

//                    ZifuchuanPinjieSpanTols.with(thgfsdtjhgfasrdthg).diejiaapped(getString(R.string.peizhiandout_egdsgj_tuc001))
//                            .diejiaapped(" "+adwfesgrdthgsefr+" ")
//                            .setQianjingse(getResources().getColor(R.color.sezhi_argb_baise))
//                            .diejiaapped(getString(R.string.peizhiandout_egdsgj_tuc002))
//                            .chuangjian();

                    ZifuchuanPinjieSpanTols.with(thgfsdtjhgfasrdthg22).diejiaapped(getString(R.string.peizhiandout_egdsgj_tuc001))
                            .diejiaapped(" " + adwfesgrdthgsefr)
                            .setQianjingse(getResources().getColor(R.color.sezhi_argb_baise))
                            .diejiaapped(getString(R.string.peizhiandout_egdsgj_tuc002))
                            .chuangjian();


                    int leileixingasda = fanhuibean.getPoorStrictNeedleShopping();
                    if (leileixingasda == 1) {
                        //逾期中
                        adsh_fjT22sdjl_hgfsa.setVisibility(View.VISIBLE);
                        adsh_fjT22sdjl_hgfsa.setText(String.format(Locale.ENGLISH,getString(R.string.zhuyetab_ryingzhong_atr), adwfesgrdthgsefr));
                        adsh_fjT22sdjl_hgfsa2.setVisibility(View.GONE);
                        rryry_sjanest_rlbuju.setVisibility(View.VISIBLE);
                        yjhgfashgfRryh34g.setVisibility(View.GONE);

                        adsh_fjT22sdjl_hgfsa22.setVisibility(View.VISIBLE);
                        zhengchangry_zhuangtai_img.setVisibility(View.GONE);
                        latery_zhuangtai_img.setVisibility(View.VISIBLE);
                        ryry_aboutryxinxi_daishuewanfakuan.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), mnhrgefasgr));
                    } else {
                        //还款中
                        adsh_fjT22sdjl_hgfsa.setVisibility(View.GONE);
                        adsh_fjT22sdjl_hgfsa2.setVisibility(View.VISIBLE);
                        yjhgfashgfRryh34g.setVisibility(View.VISIBLE);
                        rryry_sjanest_rlbuju.setVisibility(View.GONE);

                        adsh_fjT22sdjl_hgfsa22.setVisibility(View.GONE);
                        zhengchangry_zhuangtai_img.setVisibility(View.VISIBLE);
                        latery_zhuangtai_img.setVisibility(View.GONE);
                    }

                    ryry_ryxinxi_dhuanhuan.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ryry_rytype_luzilist.post(new Runnable() {
                                @Override
                                public void run() {
                                    float top = miyjuthyrgtefarsrdhgfa.getY() + 30;
//                                    rryry_sjanest_huadongbuju.scrollTo(0, (int) top);
                                    rryry_sjanest_huadongbuju.fullScroll(View.FOCUS_DOWN);
                                }
                            });

                        }
                    });
                } else {
                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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


    //展期详情
    public void qingqiuJiekou2() {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.ZHANQIXIANGQING, LateForRyDetailsModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<LateForRyDetailsModel>() {
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
                map.put("tiredMommyEitherThickEnding", danziDingId + "");
                map.put("eachSharkCleverDishDampFactory", "01");


            }

            @Override
            public void onSuccess(LateForRyDetailsModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.averageEmbassyNationalVictoryDepth == 1000) {
                    final LateForRyDetailsModel.XiangxiShujuModel fanhuibean = response.bigAncientTastyHeadteacher;

                    //日期
                    if (!TextUtils.isEmpty(fanhuibean.leadingArmySweetFrogTinyPacket)) {
                        zhina_sajR23fTv_riqi.setText(fanhuibean.leadingArmySweetFrogTinyPacket);
                    }

                    //服务费
                    zhina_sajR23fTv_servefei.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), fanhuibean.humanChipsCarefulMentalEnquiry));
                    //利息
                    zhina_sajR23fTv_lixi.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), fanhuibean.leadingJanuaryRightSonPath));
                    //滞纳金
                    zhina_sajR23fTv_zhinajin.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), fanhuibean.successfulMinuteBrunchFairMonth));
                    //展期金额
                    zhina_sajR23fTv_zhanshue.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), fanhuibean.compressedSoapCentigradeInstrumentThoroughSeaweed));

                    //增值税
                    if (fanhuibean.basicSickness != 0) {
                        zhina_sajR23fTv_zengzhishui.setVisibility(View.VISIBLE);
                        zhina_sajR23fTv_jianmiane.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), fanhuibean.basicSickness));
                    } else {
                        zhina_sajR23fTv_zengzhishui.setVisibility(View.GONE);
                    }

                    //减免金额
                    if (gonyognAAsssc != 0) {
                        zhina_sajR23fTv_zengzhishushui2.setVisibility(View.VISIBLE);
                        zhina_sajR23fTv_jianmianeee2.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), gonyognAAsssc));
                    } else {
                        zhina_sajR23fTv_zengzhishushui2.setVisibility(View.GONE);
                    }

                    //文案
                    zhina_sajR23fTv_wenwean.setText(String.format(Locale.ENGLISH,getString(R.string.peizhiandout_egdsgj_unp),
                            fanhuibean.compressedSoapCentigradeInstrumentThoroughSeaweed
                            , fanhuibean.afraidUndividedRestaurant + ""
                            , fanhuibean.compressedSoapCentigradeInstrumentThoroughSeaweed));

                    //展期内的还款方式列表 和外部正常还款用的同一个adapter 在获取还款方式接口的时候就已经赋值了
                    qingqiuhuankuanfangshi(true);
//                    zhanqiPpw.showPPw(Gravity.CENTER);
                } else {
                    Toast.makeText(getActivity(), response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    //获取还款方式
    public void qingqiuhuankuanfangshi(boolean iszhanqi){
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HUANKUANFANGSHI, RyryHuantypeListModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<RyryHuantypeListModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
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
                map.put("tiredMommyEitherThickEnding", danziDingId + "");
                map.put("eachSharkCleverDishDampFactory", "00");
            }

            @Override
            public void onSuccess(RyryHuantypeListModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    ryryHuanTypeLiebShipei.setNewData(new ArrayList<>());
                    //赋值还款方式列表
                    if (ryryHuanTypeLiebShipei != null) {
                        ryryHuanTypeLiebShipei.setNewData(response.getBigAncientTastyHeadteacher());
                    } else {
                        ryryHuanTypeLiebShipei = new RyryHuanTypeLiebShipei(getActivity(), response.getBigAncientTastyHeadteacher(),"0");
                    }

                    if(iszhanqi){
                        //赋值展期方式列表
                        if (ryryZhanqiTypeLiebShipei != null) {
                            ryryZhanqiTypeLiebShipei.setNewData(response.getBigAncientTastyHeadteacher());
                        } else {
                            ryryZhanqiTypeLiebShipei = new RyryHuanTypeLiebShipei(getActivity(), response.getBigAncientTastyHeadteacher(),"1");
                        }
                        zhanqiPpw.showPPw(Gravity.CENTER);
                    }


                } else {
                    Toast.makeText(getActivity(), response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    public void qingqiuhuankuanZhifu(RyryHuantypeListModel.RyryHuantype clickitem,String payleixing){
//        if (jiazaizhongWindows == null) {
//            return;
//        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HUOQUZHIFUXINXI, ZhifuInfoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ZhifuInfoModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
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
                map.put("tiredMommyEitherThickEnding", danziDingId + "");
                map.put("eachSharkCleverDishDampFactory", payleixing);//payType
                map.put("thoroughLiteraryPeach", clickitem.getThoroughLiteraryPeach());//payChannel
                map.put("properFatDigestPolitics", clickitem.getProperFatDigestPolitics());//payChannelName
            }

            @Override
            public void onSuccess(ZhifuInfoModel response) {

                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    if ("01".equals(payleixing)) {
//                        ImpZhuyaoActivity.shiFouFukuan_Exten = true;

                        if (getActivity() instanceof ImpZhuyaoActivity) {
                            ImpZhuyaoActivity.shiFouFukuan_Exten = true;
                        } else if (getActivity() instanceof Main2Activity) {
                            Main2Activity.isZhiFu_zhanQi = true;
                        }
                    } else {
//                        ImpZhuyaoActivity.shiFouFukuan = true;

                        if (getActivity() instanceof ImpZhuyaoActivity) {
                            ImpZhuyaoActivity.shiFouFukuan = true;
                        } else if (getActivity() instanceof Main2Activity) {
                            Main2Activity.isZhiFu = true;
                        }
                    }
                    if ("01".equals(payleixing)) {
                        zhanqiHuanOk = true;
                    }else {
                        putongHuanOk = true;
                    }
                   if("1".equals(response.getBigAncientTastyHeadteacher().getEarlyInventionAirEndlessAncestor())){
                       Uri uri = Uri.parse(response.getBigAncientTastyHeadteacher().getDoubleForm());
                       Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                       startActivity(intent);

                   }else {
                       if ("01".equals(payleixing)) {
                           if (getActivity() instanceof ImpZhuyaoActivity) {
                               ((ImpZhuyaoActivity) getActivity()).tiaoWangyeHlper(response.getBigAncientTastyHeadteacher().getDoubleForm(), 2001);
                           }else if (getActivity() instanceof Main2Activity) {
                               ((Main2Activity) getActivity()).startH5Activity(response.getBigAncientTastyHeadteacher().getDoubleForm(), 2001);
                           }
                       } else {
                           if (getActivity() instanceof ImpZhuyaoActivity) {
                               ((ImpZhuyaoActivity) getActivity()).tiaoWangyeHlper(response.getBigAncientTastyHeadteacher().getDoubleForm(), 1001);
                           }else if (getActivity() instanceof Main2Activity) {
                               ((Main2Activity) getActivity()).startH5Activity(response.getBigAncientTastyHeadteacher().getDoubleForm(), 1001);
                           }
                       }
                   }


                } else {
                    Toast.makeText(getActivity(), response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                }

                //dialog框 置后一些 防止连点
                jiazaizhongWindows.hideKuangkuangIng();
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

    private void qingqiuJiekouHuqouLeixing(String payType, String payMethod, int orderId) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.KUANHUANLIANJIE, HuiqianModel1.class, new WangluoQingqiuVolyeyeTols.OnResponse<HuiqianModel1>() {
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
                map.put("tiredMommyEitherThickEnding", orderId + "");//orderId
                map.put("eachSharkCleverDishDampFactory", payType);//type
                map.put("undergroundMoreTinyCollege", payMethod);//type
            }

            @Override
            public void onSuccess(HuiqianModel1 response) {
                Log.e("TAG", "response---->" + response);
                jiazaizhongWindows.hideKuangkuangIng();
                //empleado
                //0-4999999
                //viaje
                if (response.averageEmbassyNationalVictoryDepth == 1000) {
                    if (response.bigAncientTastyHeadteacher != null && response.bigAncientTastyHeadteacher.neitherMondayHammerCentury != null) {
                        if ("01".equals(payType)) {
//                        ImpZhuyaoActivity.shiFouFukuan_Exten = true;

                            if (getActivity() instanceof ImpZhuyaoActivity) {
                                ImpZhuyaoActivity.shiFouFukuan_Exten = true;
                            } else if (getActivity() instanceof Main2Activity) {
                                Main2Activity.isZhiFu_zhanQi = true;
                            }
                        } else {
//                        ImpZhuyaoActivity.shiFouFukuan = true;

                            if (getActivity() instanceof ImpZhuyaoActivity) {
                                ImpZhuyaoActivity.shiFouFukuan = true;
                            } else if (getActivity() instanceof Main2Activity) {
                                Main2Activity.isZhiFu = true;
                            }
                        }
                        if ("1".equals(response.bigAncientTastyHeadteacher.earlyInventionAirEndlessAncestor)) {

                            Uri uri = Uri.parse(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury);
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                            if ("01".equals(payType)) {
                                zhanqiHuanOk = true;
                            }else {
                                putongHuanOk = true;
                            }


                        } else {
                            if ("01".equals(payType)) {
                                if (getActivity() instanceof ImpZhuyaoActivity) {
                                    ((ImpZhuyaoActivity) getActivity()).tiaoWangyeHlper(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury, 2001);
                                }else if (getActivity() instanceof Main2Activity) {
                                    ((Main2Activity) getActivity()).startH5Activity(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury, 2001);
                                }
                            } else {
                                if (getActivity() instanceof ImpZhuyaoActivity) {
                                    ((ImpZhuyaoActivity) getActivity()).tiaoWangyeHlper(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury, 1001);
                                }else if (getActivity() instanceof Main2Activity) {
                                    ((Main2Activity) getActivity()).startH5Activity(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury, 1001);
                                }
                            }
                        }

                    }
                } else {
                    Toast.makeText(getActivity(), response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    //获取 是否展示催收投诉入口
    public void qingqiuJiekouHuoquApppeizhi() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.GUGESARTSPINGLUN, PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
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
                map.put("asianBrotherJewelLake", "usedRabbitCentigradeThey");//还款催收投诉，1展示，0不展示
            }

            @Override
            public void onSuccess(PeizhiRuanjianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    PeizhiRuanjianModel.RoughNaturalProBean fanhuibean = response.getRoughNaturalPro();
                    // 还款投诉开关显示
                    if (!TextUtils.isEmpty(fanhuibean.getUsedRabbitCentigradeThey())&&"1".equals(fanhuibean.getUsedRabbitCentigradeThey())) {
                        rycxxh_huancuishoutousu.setVisibility(View.VISIBLE);
                    }else {
                        rycxxh_huancuishoutousu.setVisibility(View.GONE);
                    }
                } else {
                    android.widget.Toast.makeText(MyJichuAplica.getInstance(), response.getnuclearTrialSpareMountainousBat(), android.widget.Toast.LENGTH_SHORT).show();
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

    //获取 是否展示催收投诉弹框
    public void qingqiuJiekouHuoquApppeizhi2() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.GUGESARTSPINGLUN, PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
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
                map.put("asianBrotherJewelLake", "eachFerryMoralTableLooseBrake");//还款催收投诉弹框，1展示，0不展示
            }

            @Override
            public void onSuccess(PeizhiRuanjianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    PeizhiRuanjianModel.RoughNaturalProBean fanhuibean = response.getRoughNaturalPro();
                    // 还款投诉开关显示
                    if (!TextUtils.isEmpty(fanhuibean.getEachFerryMoralTableLooseBrake())&&"1".equals(fanhuibean.getEachFerryMoralTableLooseBrake())) {
                        tousuPPw.showPPw(Gravity.CENTER);
                    }
                } else {
                    Toast.makeText(MyJichuAplica.getInstance(), response.getnuclearTrialSpareMountainousBat(), android.widget.Toast.LENGTH_SHORT).show();
                }
                qingqiuJiekouHuoquApppeizhi3();
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

    //获取 提前还款浮标
    public void qingqiuJiekouHuoquApppeizhi3() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.GUGESARTSPINGLUN, PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
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
                map.put("asianBrotherJewelLake", "contentSpoonEachDialogueSafeSailing");//提前还款浮标，1展示，0不展示
            }

            @Override
            public void onSuccess(PeizhiRuanjianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    PeizhiRuanjianModel.RoughNaturalProBean fanhuibean = response.getRoughNaturalPro();
                    // 提前还款浮标
                    if (!TextUtils.isEmpty(fanhuibean.getContentSpoonEachDialogueSafeSailing())&&"1".equals(fanhuibean.getContentSpoonEachDialogueSafeSailing())) {
                        fragrycxxh_beforedate.setVisibility(View.VISIBLE);
                        beforedatePPw.showPPw(Gravity.CENTER);
                    }else {
                        fragrycxxh_beforedate.setVisibility(View.GONE);
                    }
                } else {
                    Toast.makeText(MyJichuAplica.getInstance(), response.getnuclearTrialSpareMountainousBat(), android.widget.Toast.LENGTH_SHORT).show();
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

    private void qingqiuJiekouSousuneirong() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.SEARCH_ZHUAJINUM_DIANHUA, ZhaowomenFuwuModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ZhaowomenFuwuModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(DadianhuaGeiWomenActivity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("asianBrotherJewelLake", "mobileList");
            }

            @Override
            public void onSuccess(ZhaowomenFuwuModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.averageEmbassyNationalVictoryDepth == 1000) {
                    if (response.bigAncientTastyHeadteacher != null) {


//                        if (!TextUtils.isEmpty(response.bigAncientTastyHeadteacher.endlessCarbon)) {
//                            telwhatstousu_dianhuanum.setText(response.bigAncientTastyHeadteacher.endlessCarbon);
//                            telwhatstousu_dianhuanum.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
//                        }
//                        if (!TextUtils.isEmpty(response.bigAncientTastyHeadteacher.famousSomeoneAbilityNativeLibrarian)) {
//                            telwhatstousu_wangzhiurl.setText(response.bigAncientTastyHeadteacher.famousSomeoneAbilityNativeLibrarian);
//                            telwhatstousu_wangzhiurl.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
//                        }
                        if (!TextUtils.isEmpty(response.bigAncientTastyHeadteacher.agriculturalAirportBoss)) {
                            wndwtousu_txt1.setText(response.bigAncientTastyHeadteacher.agriculturalAirportBoss);
                        }

                    }


                } else {
                    Toast.makeText(getActivity(), response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private void initPopSuccessWindow() {
        chenggongPPw = new ChanpinMoxingPPWindows(getActivity());

        LayoutInflater yinghseFanhseie = (LayoutInflater) (getActivity()).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View shituud = yinghseFanhseie.inflate(R.layout.wndw_lateapply_chengok, null);

        chenggongPPw.chushihuaPPW(shituud, false, (int) (huoquPingmuKuandu(getActivity()) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    TextView zhina_sajR23fTv_riqi;//日期
    TextView zhina_sajR23fTv_servefei;//服务费
    TextView zhina_sajR23fTv_lixi;//利息
    TextView zhina_sajR23fTv_zhinajin;//滞纳金
    TextView zhina_sajR23fTv_zhanshue;//展期金额
    TextView zhina_sajR23fTv_zhanshueee2;//天数
    TextView zhina_sajR23fTv_wenwean;//文案

    RelativeLayout zhina_sajR23fTv_zengzhishui, zhina_sajR23fTv_zengzhishushui2;
    TextView zhina_sajR23fTv_jianmiane;//增值税
    TextView zhina_sajR23fTv_jianmianeee2;//减免
    RecyclerView ryry_zhanqitype_luzilist;//还款方式列表

    private void chuangjianZahnqiqiPPW() {
        zhanqiPpw = new ChanpinMoxingPPWindows(getActivity());


        LayoutInflater chuangkouFanshe = (LayoutInflater) (getActivity()).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View kuangShitu = chuangkouFanshe.inflate(R.layout.wndw_latefor_rycxxh, null);
        RelativeLayout jhgfasdhgfasfa = kuangShitu.findViewById(R.id.jhgfasdhgfasfa);

        zhina_sajR23fTv_riqi = kuangShitu.findViewById(R.id.zhina_sajR23fTv_riqi);//日期
        zhina_sajR23fTv_servefei = kuangShitu.findViewById(R.id.zhina_sajR23fTv_servefei);//服务费
        zhina_sajR23fTv_lixi = kuangShitu.findViewById(R.id.zhina_sajR23fTv_lixi);//利息
        zhina_sajR23fTv_zhinajin = kuangShitu.findViewById(R.id.zhina_sajR23fTv_zhinajin);//滞纳金
        zhina_sajR23fTv_zhanshue = kuangShitu.findViewById(R.id.zhina_sajR23fTv_zhanshue);//展期金额
        zhina_sajR23fTv_zhanshueee2 = kuangShitu.findViewById(R.id.zhina_sajR23fTv_zhanshueee2);//展期金额
        zhina_sajR23fTv_wenwean = kuangShitu.findViewById(R.id.zhina_sajR23fTv_wenwean);//文案

        zhina_sajR23fTv_zengzhishui = kuangShitu.findViewById(R.id.zhina_sajR23fTv_zengzhishui);//增值税
        zhina_sajR23fTv_jianmiane = kuangShitu.findViewById(R.id.zhina_sajR23fTv_jianmiane);//减免金额
        zhina_sajR23fTv_zengzhishushui2 = kuangShitu.findViewById(R.id.zhina_sajR23fTv_zengzhishushui2);//增值税
        zhina_sajR23fTv_jianmianeee2 = kuangShitu.findViewById(R.id.zhina_sajR23fTv_jianmianeee2);//减免金额
        ryry_zhanqitype_luzilist = kuangShitu.findViewById(R.id.ryry_zhanqitype_luzilist);//减免金额

        switch (GuojiaLeixing) {
            case GuojiaLeixing2://秘鲁
                zhina_sajR23fTv_zengzhishui.setVisibility(View.VISIBLE);
                zhina_sajR23fTv_zengzhishushui2.setVisibility(View.VISIBLE);
                break;
            default://西班牙
        }

        jhgfasdhgfasfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zhanqiPpw.xiaohuiPPw();
            }
        });


        initrecyclerviewzhanqi();

//        zhanqiPpw.chushihuaPPW(kuangShitu, false, (int) (huoquPingmuKuandu(getActivity())), ViewGroup.LayoutParams.WRAP_CONTENT);
        zhanqiPpw.chushihuaPPW(kuangShitu, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(getActivity()) * 0.8), null, true);


    }

    //提前还款dialog
    private ChanpinMoxingPPWindows beforedatePPw;
    private TextView wndwtiqian_before1;
    private TextView wndwtiqian_before2;

    //提前还款弹框
    private void initBeforeWindow() {
        beforedatePPw = new ChanpinMoxingPPWindows(getActivity());

        LayoutInflater popInflater = (LayoutInflater) (getActivity()).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_repy_beforedate, null);
        wndwtiqian_before1 = popupView.findViewById(R.id.wndwtiqian_before1);
        wndwtiqian_before2 = popupView.findViewById(R.id.wndwtiqian_before2);
//        shezhiStrspanl();
//        newtipsneineirongrong.setText(getString(R.string.newtankuang_jichuwanliu));
        popupView.findViewById(R.id.wndwbefore_close1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beforedatePPw.xiaohuiPPw();

            }
        });
        popupView.findViewById(R.id.wndwbefore_close2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beforedatePPw.xiaohuiPPw();
            }
        });

        beforedatePPw.chushihuaPPW(popupView, false
                , (int) (huoquPingmuKuandu(getActivity()) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);
    }

    //催收投诉dialog
    private ChanpinMoxingPPWindows tousuPPw;
    private TextView wndwtousu_dianhuanum;
    private TextView wndwtousu_wangzhiurl;
    private TextView wndwtousu_txt1;

    //提前还款弹框
    private void initSoutuWindow() {
        tousuPPw = new ChanpinMoxingPPWindows(getActivity());

        LayoutInflater popInflater = (LayoutInflater) (getActivity()).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_repy_tousu, null);
        wndwtousu_dianhuanum = popupView.findViewById(R.id.wndwtousu_dianhuanum);
        wndwtousu_wangzhiurl = popupView.findViewById(R.id.wndwtousu_wangzhiurl);
        wndwtousu_txt1 = popupView.findViewById(R.id.wndwtousu_txt1);
//        newtipsneineirongrong.setText(getString(R.string.newtankuang_jichuwanliu));
        popupView.findViewById(R.id.wndwtousu_close1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tousuPPw.xiaohuiPPw();

            }
        });
        popupView.findViewById(R.id.wndwtousu_close2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensoutuh5();
                tousuPPw.xiaohuiPPw();
            }
        });

        tousuPPw.chushihuaPPW(popupView, false
                , (int) (huoquPingmuKuandu(getActivity()) *0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);
    }


    private void opensoutuh5(){
        String url = HUANKUANTOUSU+"&token="+fanhuibean.getConvenientDesertPunctualJar();
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private RyryHuanTypeLiebShipei ryryZhanqiTypeLiebShipei;
    private void initrecyclerviewzhanqi(){


        if (ryryZhanqiTypeLiebShipei == null) {
            ryryZhanqiTypeLiebShipei = new RyryHuanTypeLiebShipei(getContext(), new ArrayList<>(),"1");
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        ryry_zhanqitype_luzilist.setLayoutManager(linearLayoutManager);
        ryry_zhanqitype_luzilist.setAdapter(ryryZhanqiTypeLiebShipei);
        ryryZhanqiTypeLiebShipei.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if(DianjiQuickTols.clickkuaikuai()){
                    return;
                }
                if (jiazaizhongWindows == null) {
                    return;
                }
                jiazaizhongWindows.showKuangkuangIng();
                RyryHuantypeListModel.RyryHuantype bean = (RyryHuantypeListModel.RyryHuantype) adapter.getData().get(position);
                qingqiuhuankuanZhifu(bean,"01");

            }
        });



    }

    private void beforeanimation(ImageView iviv){
        Animation shake = new TranslateAnimation(0, 10, 0, 0);
        shake.setDuration(10000);
        shake.setInterpolator(new CycleInterpolator(25));
        shake.setRepeatCount(Animation.INFINITE);
        shake.setRepeatMode(Animation.REVERSE);
        iviv.setAnimation(shake);
        shake.start();
    }

    public void shezhiStrspanl(final TextView WWWW,String mnyy) {
        ZifuchuanPinjieSpanTols.with(WWWW)
                .diejiaapped(getString(R.string.repy_before11) +" ")
                .setQianjingse(Color.parseColor("#222222"))
                .diejiaapped(getString(R.string.repy_before12) +" ")
                .setQianjingse(Color.parseColor("#E20C2B"))

                .diejiaapped(mnyy +" " )
                .setQianjingse(Color.parseColor("#E20C2B"))
                .diejiaapped(getString(R.string.repy_before13))
                .setQianjingse(Color.parseColor("#222222"))
                .chuangjian();
        WWWW.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    public void shezhiStrspanl2(final TextView WWWW,String mnyy) {
        ZifuchuanPinjieSpanTols.with(WWWW)
                .diejiaapped(getString(R.string.repy_before21)+" ")
                .setQianjingse(Color.parseColor("#222222"))
                .diejiaapped(getString(R.string.repy_before22)+" ")
                .setQianjingse(Color.parseColor("#E20C2B"))

                .diejiaapped(mnyy +" ")
                .setQianjingse(Color.parseColor("#E20C2B"))
                .diejiaapped(getString(R.string.repy_before23))
                .setQianjingse(Color.parseColor("#222222"))
                .chuangjian();
        WWWW.setHighlightColor(Color.parseColor("#88cccccc"));
    }

}
