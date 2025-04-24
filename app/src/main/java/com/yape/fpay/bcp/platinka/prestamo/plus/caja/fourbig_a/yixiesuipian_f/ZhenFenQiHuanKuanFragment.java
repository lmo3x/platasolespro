package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.APPMINGZI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.TOUSUH5TOEKN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.TOUSU_APP;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.HUANKUANTOUSU;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuGodu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.text.Html;
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

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.FenqiJihuaListModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.LateForRyDetailsModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.RyryHuantypeListModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.TiqianHuankuanwenziModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhaowomenFuwuModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhifuInfoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ShijianTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.RiliTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.Main2Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.FenqiHuankuanAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.FenqiHuankuanzhongAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.RyryHuanTypeLiebShipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;


public class ZhenFenQiHuanKuanFragment extends MyJichuBsFragment implements View.OnClickListener {

    private TextView jfjTjD3_jfjrR333_fjfjfls, asfdghkjhgdfhgkjhgjhkjhf, ryry_ryxinxi_dhuanhuan, dingdanhao_tv, btn_first;
    private ImageView fuzhidingdanhao_img;
    private int danziDingId = 0;
    private SwipeRefreshLayout shuashau_gjlaTjtj_sja23jdf;
    private List<FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO> fenqiList;
    private FenqiHuankuanzhongAdapter fenqijihuashipei;
    private RecyclerView zhenfenqijihualiebiaoRV50;

    //弹框
    private List<FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO> fenqiList51;
    private FenqiHuankuanAdapter fenqijihuashipei51;
    private RecyclerView zhenfenqijihualiebiaoRV51;
    private ChanpinMoxingPPWindows chenggongPPw;

    private ImageView fragrycxxh_beforedate;


    private ImageView jyhyjhtgrtthg;
    private RequestOptions tupianCaozuo = RequestOptions.circleCropTransform();
    private ImageView loginLogo, gaohao_tubiaofanhui;
    private TextView duochanpappname;

    private LinearLayout rycxxh_huancuishoutousu;

    private String thickCopContinent = "";  //extendFlag
    public ChanpinMoxingPPWindows zhanqiPpw;

    private String repayPlanIdListZhanQi = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View ftagShitu = inflater.inflate(R.layout.fragment_zhen_fen_qi_huan_kuan, container, false);

        dingdanhao_tv = ftagShitu.findViewById(R.id.dingdanhao_tv);
        fuzhidingdanhao_img = ftagShitu.findViewById(R.id.fuzhidingdanhao_img);
        shuashau_gjlaTjtj_sja23jdf = ftagShitu.findViewById(R.id.shuashau_gjlaTjtj_sja23jdf);
        asfdghkjhgdfhgkjhgjhkjhf = ftagShitu.findViewById(R.id.asfdghkjhgdfhgkjhgjhkjhf);//贷款金额
        jfjTjD3_jfjrR333_fjfjfls = ftagShitu.findViewById(R.id.jfjTjD3_jfjrR333_fjfjfls);
        zhenfenqijihualiebiaoRV50 = ftagShitu.findViewById(R.id.hr76ef_jg2323Rs_fv50);
        ryry_ryxinxi_dhuanhuan = ftagShitu.findViewById(R.id.ryry_ryxinxi_dhuanhuan);
        fragrycxxh_beforedate = ftagShitu.findViewById(R.id.fragrycxxh_beforedate);
        btn_first = ftagShitu.findViewById(R.id.btn_first);

        jyhyjhtgrtthg = ftagShitu.findViewById(R.id.jyhyjhtgrtthg);
        loginLogo = ftagShitu.findViewById(R.id.gaohao_tubiaoapp);
        gaohao_tubiaofanhui = ftagShitu.findViewById(R.id.gaohao_tubiaofanhui);
        duochanpappname = ftagShitu.findViewById(R.id.duochanpappname);
        rycxxh_huancuishoutousu = ftagShitu.findViewById(R.id.rycxxh_huancuishoutousu);

        btn_first.setOnClickListener(this);
        jyhyjhtgrtthg.setOnClickListener(this);
        ryry_ryxinxi_dhuanhuan.setOnClickListener(this);
        fuzhidingdanhao_img.setOnClickListener(this);
        fragrycxxh_beforedate.setOnClickListener(this);
        gaohao_tubiaofanhui.setOnClickListener(this);
        rycxxh_huancuishoutousu.setOnClickListener(this);

        initPopSuccessWindow();
        chuangjianZahnqiqiPPW();
        initBeforeWindow();
        initSoutuWindow();

        qingqiuJiekou1();
//        qingqiuhuankuanfangshi();
        qingqiuJiekouHuoquApppeizhi();
        qingqiuJiekouHuoquApppeizhi2();
        qingqiuJiekouSousuneirong();

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
                    qingqiuJiekouHuoquApppeizhi();
                    qingqiuJiekouHuoquApppeizhi2();//每次刷新页面都请求是否有投诉弹框
//                    qingqiuJiekouHuoquApppeizhi3();
                    qingqiuJiekouSousuneirong();
                } else if (getActivity() instanceof Main2Activity) {
                    ((Main2Activity) getActivity()).getData();
                    qingqiuJiekouHuoquApppeizhi();
                    qingqiuJiekouHuoquApppeizhi2();//每次刷新页面都请求是否有投诉弹框
//                    qingqiuJiekouHuoquApppeizhi3();
                    qingqiuJiekouSousuneirong();
                }
            }
        });

        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI))) {
            duochanpappname.setText(BendiHuancunTols.huoQuZifuchuan(getActivity(), APPMINGZI));
        }

        //提前还款动画
        beforeanimation(fragrycxxh_beforedate);

        return ftagShitu;
    }

    private void beforeanimation(ImageView iviv) {
        Animation shake = new TranslateAnimation(0, 10, 0, 0);
        shake.setDuration(10000);
        shake.setInterpolator(new CycleInterpolator(25));
        shake.setRepeatCount(Animation.INFINITE);
        shake.setRepeatMode(Animation.REVERSE);
        iviv.setAnimation(shake);
        shake.start();
    }

    @Override
    public void onClick(View v) {
        if (DianjiQuickTols.clickkuaikuai()) {
            return;
        }
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        switch (v.getId()) {
            case R.id.ryry_ryxinxi_dhuanhuan:
                if (fenqiList != null && fenqiList.size() > 0) {


                    if (chenggongPPw != null) {
                        chenggongPPw.showPPw();

                        //弹框里面的还款计划
                        int checkedCount = 0;
                        fenqiList51 = new ArrayList<>();
                        for (int i = 0; i < fenqiList.size(); i++) {
                            FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO honestHelpfulSteamInlandSummaryDTO = fenqiList.get(i);
                            int settleStatus = honestHelpfulSteamInlandSummaryDTO.getRoundVcd();
                            int selectMark = honestHelpfulSteamInlandSummaryDTO.getHumorousMouseCrossRollerHeavyPace();
                            if (settleStatus == 0) {
                                if (selectMark == 1) {
                                    checkedCount++;
                                    honestHelpfulSteamInlandSummaryDTO.setChecked(1);
                                } else {
                                    honestHelpfulSteamInlandSummaryDTO.setChecked(0);
                                }
                                fenqiList51.add(honestHelpfulSteamInlandSummaryDTO);
                            }
                        }
                        if (fenqiList51.size() > 0) {
                            if (checkedCount == fenqiList51.size()) {
                                dfdsg_qx.setImageResource(R.mipmap.cbccck1);
                            } else {
                                dfdsg_qx.setImageResource(R.mipmap.cbccck0);
                            }
                            fenqijihuashipei51.setNewData(fenqiList51);
                        }

                        if (ryryHuanTypeLiebShipei != null) {
                            ryryHuanTypeLiebShipei.setNewData(new ArrayList<>());
                        }
                        qingqiuhuankuanfangshi();
                    }
                }
                break;
            case R.id.jyhyjhtgrtthg://跳转客服

                XieyiShowTols.quH5KefuPage(getActivity(), "16");
                break;
            case R.id.fuzhidingdanhao_img:
                String code = dingdanhao_tv.getText().toString().trim();
                if (!TextUtils.isEmpty(code)) {
                    ClipboardManager clipboard = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                    clipboard.setPrimaryClip(ClipData.newPlainText("label", code));
                    ToastUtil.showShortToast("Copiar con éxito");
                }
                break;
            case R.id.fragrycxxh_beforedate://显示提前还款提示弹框
                beforedatePPw.showPPw(Gravity.CENTER);
                break;
            case R.id.gaohao_tubiaofanhui://返回到多产品
                if (getActivity() instanceof ImpZhuyaoActivity) {
                    ((ImpZhuyaoActivity) getActivity()).checkSingleOrMore();
                } else if (getActivity() instanceof Main2Activity) {
                    ((Main2Activity) getActivity()).finish();
                }
                break;
            case R.id.rycxxh_huancuishoutousu://跳转到聚合客服投诉

                opensoutuh5();
                break;
            case R.id.btn_first:
                qingqiuJiekouZhanQi(); //展期
                break;
        }
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
                Log.e("TAG", "response---->huankuan" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    fanhuibean = response.getBigAncientTastyHeadteacher();

                    thickCopContinent = fanhuibean.getThickCopContinent();

                    if (TextUtils.isEmpty(fanhuibean.getConvenientDesertPunctualJar())) {
                        BendiHuancunTols.commitZifuchuan(TOUSUH5TOEKN, fanhuibean.getConvenientDesertPunctualJar());
                    }

                    double kjyhtgrfe = fanhuibean.getUnusualRatLabourRaincoat();
                    String nhgefagsrdh = fanhuibean.getDustyLuckyTheirBrownSuffering();
                    //orderId
                    danziDingId = fanhuibean.tiredMommyEitherThickEnding;
                    int adwfesgrdthgsefr = fanhuibean.radioactiveAtmosphereBacterium;//逾期天数

                    asfdghkjhgdfhgkjhgjhkjhf.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form5), kjyhtgrfe)));//还款金额
                    jfjTjD3_jfjrR333_fjfjfls.setText(nhgefagsrdh);//还款日期

                    String yinyinsisis = BendiHuancunTols.huoQuZifuchuan(getActivity(), fanhuibean.tiredMommyEitherThickEnding + "");
                    if (!"1".equals(yinyinsisis)) {
                        try {
                            //存储在日历里面
                            long tasty = ShijianTols.zifuchuanZhuanShijianchuo2(nhgefagsrdh);
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                                RiliTols.tainJaiShijian(getActivity(),
                                        getString(R.string.ruanjianapp_mingzi) + " Fecha de vencimiento del reembolso en efectivo"
                                        , "Su fecha de vencimiento de pago de " + getString(R.string.ruanjianapp_mingzi) + ", ¡pague a tiempo!"
                                        , tasty, 2);
                                BendiHuancunTols.commitZifuchuan(fanhuibean.tiredMommyEitherThickEnding + "", "1");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }


                } else {
                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                }

                qingqiuJiekou2();
//                qingqiuJiekouHuoquApppeizhi3();
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

    public void qingqiuJiekou2() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HUOQUHUANKUANJIHUA, FenqiJihuaListModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<FenqiJihuaListModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(getActivity(), BendiHuancunTols.YONGHU_ID));
                map.put("tiredMommyEitherThickEnding", String.valueOf(danziDingId));
                map.put("eachSharkCleverDishDampFactory", "03");
            }

            @Override
            public void onSuccess(FenqiJihuaListModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->huankuan" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    if (response.getBigAncientTastyHeadteacher() != null) {
                        FenqiJihuaListModel.BigAncientTastyHeadteacherDTO caradjoBean = response.getBigAncientTastyHeadteacher();
                        dingdanhao_tv.setText(caradjoBean.getSeveralNationChocolate());
                        dingdanhao_tv_zq.setText(caradjoBean.getSeveralNationChocolate());
                        if (caradjoBean.getHonestHelpfulSteamInlandSummary().size() > 0) {
                            fenqiList = caradjoBean.getHonestHelpfulSteamInlandSummary();
                            fenqijihuashipei = new FenqiHuankuanzhongAdapter(getContext(), fenqiList);
                            fenqijihuashipei.setPersonalReligiousPill(caradjoBean.getPersonalReligiousPill());
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                            zhenfenqijihualiebiaoRV50.setLayoutManager(linearLayoutManager);
                            zhenfenqijihualiebiaoRV50.setAdapter(fenqijihuashipei);

                            //弹框里面的还款计划
                            int checkedCount = 0;
                            fenqiList51 = new ArrayList<>();
                            for (int i = 0; i < caradjoBean.getHonestHelpfulSteamInlandSummary().size(); i++) {
                                FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO honestHelpfulSteamInlandSummaryDTO = caradjoBean.getHonestHelpfulSteamInlandSummary().get(i);
                                int settleStatus = honestHelpfulSteamInlandSummaryDTO.getRoundVcd();
                                int selectMark = honestHelpfulSteamInlandSummaryDTO.getHumorousMouseCrossRollerHeavyPace();
                                if (settleStatus == 0) {
                                    if (selectMark == 1) {
                                        checkedCount++;
                                        honestHelpfulSteamInlandSummaryDTO.setChecked(1);
                                    } else {
                                        honestHelpfulSteamInlandSummaryDTO.setChecked(0);
                                    }
                                    fenqiList51.add(honestHelpfulSteamInlandSummaryDTO);
                                }
                            }
                            if (fenqiList51.size() > 0) {
                                if (checkedCount == fenqiList51.size()) {
                                    dfdsg_qx.setImageResource(R.mipmap.cbccck1);
                                } else {
                                    dfdsg_qx.setImageResource(R.mipmap.cbccck0);
                                }

                                fenqijihuashipei51 = new FenqiHuankuanAdapter(getContext(), fenqiList51);
                                fenqijihuashipei51.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
                                    @Override
                                    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                                        if (position == 0) {
                                            return;
                                        }
                                        FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean = fenqiList51.get(position);
                                        if (bean.getChecked() == 1) {
                                            for (int i = position; i < fenqiList51.size(); i++) {
                                                FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean1 = fenqiList51.get(i);
                                                bean1.setChecked(0);
                                            }
                                        } else {
                                            for (int i = 0; i <= position; i++) {
                                                FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean1 = fenqiList51.get(i);
                                                bean1.setChecked(1);
                                            }
                                        }
                                        fenqijihuashipei51.notifyDataSetChanged();


                                        //
                                        int checkedCount = 0;
                                        for (int i = 0; i < fenqiList51.size(); i++) {
                                            FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean1 = fenqiList51.get(i);
                                            int checked = bean1.getChecked();
                                            if (checked == 1) {
                                                checkedCount++;
                                            }
                                        }
                                        if (checkedCount == fenqiList51.size()) {
                                            dfdsg_qx.setImageResource(R.mipmap.cbccck1);
                                        } else {
                                            dfdsg_qx.setImageResource(R.mipmap.cbccck0);
                                        }

                                        //
                                        double total = 0;
                                        for (int i = 0; i < fenqiList51.size(); i++) {
                                            if (fenqiList51.get(i).getChecked() == 1) {
                                                total += fenqiList51.get(i).getAncientDueInterpreter();
                                            }
                                        }
                                        if (ryryHuanTypeLiebShipei != null) {
                                            List<RyryHuantypeListModel.RyryHuantype> huantypeList = ryryHuanTypeLiebShipei.getData();
                                            for (int i = 0; i < huantypeList.size(); i++) {
                                                RyryHuantypeListModel.RyryHuantype ryryHuantype = huantypeList.get(i);
                                                ryryHuantype.setAnniuXianshiQian(getString(R.string.zhuyetab_ryingzhong_pag2) + "\n" + HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), total)));
                                            }
                                            ryryHuanTypeLiebShipei.notifyDataSetChanged();
                                        }

                                    }
                                });
                                if(caradjoBean.getPersonalReligiousPill()>1){
                                    dfdxg_qx_layout.setVisibility(View.VISIBLE);
                                    planTitle.setText(getString(R.string.shangpins_foryo_plan));
                                }else {
                                    dfdxg_qx_layout.setVisibility(View.GONE);
                                    planTitle.setText(getString(R.string.shangpins_foryo_plan_2));
                                }
                                fenqijihuashipei51.setPersonalReligiousPill(caradjoBean.getPersonalReligiousPill());
                                linearLayoutManager = new LinearLayoutManager(getContext());
                                zhenfenqijihualiebiaoRV51.setLayoutManager(linearLayoutManager);
                                zhenfenqijihualiebiaoRV51.setAdapter(fenqijihuashipei51);
                            }

                            // 显示展期按钮
                            if (thickCopContinent.equals("1")) {
                                btn_first.setVisibility(View.VISIBLE);
                                btn_first.setText("Prolonga " + fanhuibean.getAfraidUndividedRestaurant() + " días más");
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


    private ImageView dfdsg_qx;
    private RecyclerView ryry_rytype_luzilist;
    private TextView planTitle;
    private LinearLayout dfdxg_qx_layout;
    private void initPopSuccessWindow() {
        chenggongPPw = new ChanpinMoxingPPWindows(getActivity());

        LayoutInflater yinghseFanhseie = (LayoutInflater) (getActivity()).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View shituud = yinghseFanhseie.inflate(R.layout.wndw_hkjh_widow, null);
        zhenfenqijihualiebiaoRV51 = shituud.findViewById(R.id.hr76ef_jg2323Rs_fv51);
        RelativeLayout iconCloseRl = shituud.findViewById(R.id.jyhtgrefasg);
        dfdsg_qx = shituud.findViewById(R.id.dfdsg_qx);
        ryry_rytype_luzilist = shituud.findViewById(R.id.ryry_rytype_luzilist);
        dfdxg_qx_layout = shituud.findViewById(R.id.dfdxg_qx_layout);
        planTitle = shituud.findViewById(R.id.planTitle);

        initrecyclerview();

        dfdsg_qx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                int checkedCount = 0;
                if (fenqiList51 != null && fenqiList51.size() > 0) {
                    for (int i = 0; i < fenqiList51.size(); i++) {
                        FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean = fenqiList51.get(i);
                        int checked = bean.getChecked();
                        //是否选中
                        if (checked == 1) {
                            checkedCount++;
                        }
                    }

                    if (checkedCount == fenqiList51.size() && fenqiList51.size() > 1) {
                        for (int i = 0; i < fenqiList51.size(); i++) {
                            FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean = fenqiList51.get(i);
                            if (i == 0) {
                                bean.setChecked(1);
                            } else {
                                bean.setChecked(0);
                            }
                        }
                        fenqijihuashipei51.notifyDataSetChanged();
                        dfdsg_qx.setImageResource(R.mipmap.cbccck0);
                    } else {
                        for (int i = 0; i < fenqiList51.size(); i++) {
                            FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean = fenqiList51.get(i);
                            bean.setChecked(1);
                        }
                        fenqijihuashipei51.notifyDataSetChanged();
                        dfdsg_qx.setImageResource(R.mipmap.cbccck1);
                    }
                }


                double total = 0;
                for (int i = 0; i < fenqiList51.size(); i++) {
                    if (fenqiList51.get(i).getChecked() == 1) {
                        total += fenqiList51.get(i).getAncientDueInterpreter();
                    }
                }
                if (ryryHuanTypeLiebShipei != null) {
                    List<RyryHuantypeListModel.RyryHuantype> huantypeList = ryryHuanTypeLiebShipei.getData();
                    for (int i = 0; i < huantypeList.size(); i++) {
                        RyryHuantypeListModel.RyryHuantype ryryHuantype = huantypeList.get(i);
                        ryryHuantype.setAnniuXianshiQian(getString(R.string.zhuyetab_ryingzhong_pag2) + "\n" + HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), total)));
                    }
                    ryryHuanTypeLiebShipei.notifyDataSetChanged();
                }

            }
        });
        iconCloseRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chenggongPPw.xiaohuiPPw();
            }
        });

        chenggongPPw.chushihuaPPW(shituud, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(getActivity()) * 0.95));
    }

    private RyryHuanTypeLiebShipei ryryHuanTypeLiebShipei;

    private void initrecyclerview() {

        if (ryryHuanTypeLiebShipei == null) {
            ryryHuanTypeLiebShipei = new RyryHuanTypeLiebShipei(getContext(), new ArrayList<>(), "1");
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        ryry_rytype_luzilist.setLayoutManager(linearLayoutManager);
        ryry_rytype_luzilist.setAdapter(ryryHuanTypeLiebShipei);
        ryryHuanTypeLiebShipei.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                String repayPlanIdList = "";
                if (fenqiList51 != null && fenqiList51.size() > 0) {
                    for (int i = 0; i < fenqiList51.size(); i++) {
                        FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean = fenqiList51.get(i);
                        int checked = bean.getChecked();
                        if (checked == 1) {
                            repayPlanIdList += bean.getActiveFoxNumberCarpet() + ",";
                        }
                    }
                    if (repayPlanIdList.endsWith(",")) {
                        repayPlanIdList = repayPlanIdList.substring(0, repayPlanIdList.length() - 1);
                    }
                    RyryHuantypeListModel.RyryHuantype bean = (RyryHuantypeListModel.RyryHuantype) adapter.getData().get(position);
                    qingqiuhuankuanZhifu(bean, repayPlanIdList,"03");
                }


            }
        });

    }

    public void qingqiuhuankuanfangshi() {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HUANKUANFANGSHI, RyryHuantypeListModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<RyryHuantypeListModel>() {
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
                map.put("tiredMommyEitherThickEnding", danziDingId + "");
                map.put("squareBookshop", "00");  //type
            }

            @Override
            public void onSuccess(RyryHuantypeListModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    List<RyryHuantypeListModel.RyryHuantype> huantypeList = response.getBigAncientTastyHeadteacher();
                    double total = 0;
                    if (fenqiList51 != null && fenqiList51.size() > 0) {
                        for (int i = 0; i < fenqiList51.size(); i++) {
                            if (fenqiList51.get(i).getChecked() == 1) {
                                total += fenqiList51.get(i).getAncientDueInterpreter();
                            }
                        }
                    }
                    for (int i = 0; i < huantypeList.size(); i++) {
                        RyryHuantypeListModel.RyryHuantype ryryHuantype = huantypeList.get(i);
                        ryryHuantype.setAnniuXianshiQian(getString(R.string.zhuyetab_ryingzhong_pag2) + "\n" + HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), total)));
                    }
                    ryryHuanTypeLiebShipei.setNewData(new ArrayList<>());
                    //赋值还款方式列表
                    if (ryryHuanTypeLiebShipei != null) {
                        ryryHuanTypeLiebShipei.setNewData(huantypeList);
                    } else {
                        ryryHuanTypeLiebShipei = new RyryHuanTypeLiebShipei(getActivity(), huantypeList, "1");
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


    public void qingqiuhuankuanZhifu(RyryHuantypeListModel.RyryHuantype clickitem, String repayPlanIdList,String payType) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HUOQUZHIFUXINXI1, ZhifuInfoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ZhifuInfoModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("deadQuickBun", repayPlanIdList); //repayPlanIdList
                map.put("tiredMommyEitherThickEnding", danziDingId + "");
                map.put("thoroughLiteraryPeach", clickitem.getThoroughLiteraryPeach());//payChannel
                map.put("properFatDigestPolitics", clickitem.getProperFatDigestPolitics());//payChannelName
                map.put("eachSharkCleverDishDampFactory", payType);  //payType
            }

            @Override
            public void onSuccess(ZhifuInfoModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    if (getActivity() instanceof ImpZhuyaoActivity) {
                        if("03".equals(payType)){
                            ImpZhuyaoActivity.shiFouFukuan = true;
                        }else {
                            ImpZhuyaoActivity.shiFouFukuan_Exten = true;
                        }

                    } else if (getActivity() instanceof Main2Activity) {
                        if("03".equals(payType)){
                            Main2Activity.isZhiFu = true;
                        }else {
                            Main2Activity.isZhiFu_zhanQi = true;
                        }
                    }

                    if (chenggongPPw != null && "03".equals(payType)) {
                        chenggongPPw.xiaohuiPPw();
                    }

                    if(zhanqiPpw != null && "0304".equals(payType)){
                        zhanqiPpw.xiaohuiPPw();
                    }

                    try {
                        if ("1".equals(response.getBigAncientTastyHeadteacher().getEarlyInventionAirEndlessAncestor())) {
                            Uri uri = Uri.parse(response.getBigAncientTastyHeadteacher().getDoubleForm());
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else {
                            if (getActivity() instanceof ImpZhuyaoActivity) {
                                ((ImpZhuyaoActivity) getActivity()).tiaoWangyeHlper(response.getBigAncientTastyHeadteacher().getDoubleForm(), 1001);
                            } else if (getActivity() instanceof Main2Activity) {
                                ((Main2Activity) getActivity()).startH5Activity(response.getBigAncientTastyHeadteacher().getDoubleForm(), 1001);
                            }
                        }
                    }catch (Exception e){
                        e.printStackTrace();
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
                    if (!TextUtils.isEmpty(fanhuibean.getContentSpoonEachDialogueSafeSailing()) && "1".equals(fanhuibean.getContentSpoonEachDialogueSafeSailing())) {
//                        fragrycxxh_beforedate.setVisibility(View.VISIBLE);
                        qingqiuJiekouHuoquTankuangwena();
                    } else {
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

    //获取提前还款弹框文案
    public void qingqiuJiekouHuoquTankuangwena() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HUOQUTIQIANHUANKUANWENAN, TiqianHuankuanwenziModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<TiqianHuankuanwenziModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("unfitPeaceDangerousMarathonHorribleFlash", "documents_1");
                map.put("tiredMommyEitherThickEnding", String.valueOf(danziDingId));
                map.put("skilledSoutheastQuickAntarcticNationality", "1");
            }

            @Override
            public void onSuccess(TiqianHuankuanwenziModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {

                    List<String> handsomeFoolishCuriousSister = response.getBigAncientTastyHeadteacher().getHandsomeFoolishCuriousSister();
                    Map<String, String> differentRiddleSquareProbableActress = response.getBigAncientTastyHeadteacher().getDifferentRiddleSquareProbableActress();
                    if (handsomeFoolishCuriousSister != null && handsomeFoolishCuriousSister.size() > 0) {
                        if (tiqianhuankuantankuanglayout != null) {
                            tiqianhuankuantankuanglayout.removeAllViews();
                        }
                        for (int i = 0; i < handsomeFoolishCuriousSister.size(); i++) {
                            String content = handsomeFoolishCuriousSister.get(i);
                            if (differentRiddleSquareProbableActress != null) {
                                for (Map.Entry<String, String> entry : differentRiddleSquareProbableActress.entrySet()) {
                                    String key = entry.getKey();
                                    String value = entry.getValue();
                                    content = content.replace(key, "<font color='#E20C2B'>" + value + "</font>");
                                }
                            }
                            LayoutInflater inflater = LayoutInflater.from(getContext());
                            View view = inflater.inflate(R.layout.t_dsfjdsk_qkhktext, null);
                            TextView textView = view.findViewById(R.id.wndwtiqian_ddfsfs);
                            textView.setText(Html.fromHtml(content));
                            tiqianhuankuantankuanglayout.addView(textView);
                        }
                        beforedatePPw.showPPw(Gravity.CENTER);
                        fragrycxxh_beforedate.setVisibility(View.VISIBLE);
                    }

                    if (getActivity() instanceof ImpZhuyaoActivity) {
                        ((ImpZhuyaoActivity) getActivity()).qingqiuJiekouGengxin();
                    } else if (getActivity() instanceof Main2Activity) {
                        ((Main2Activity) getActivity()).qingqiuJiekouGengxin();
                    }

                } else {
                    Toast.makeText(MyJichuAplica.getInstance(), response.getNuclearTrialSpareMountainousBat(), android.widget.Toast.LENGTH_SHORT).show();
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


    //提前还款dialog
    private ChanpinMoxingPPWindows beforedatePPw;
    private LinearLayout tiqianhuankuantankuanglayout;

    //提前还款弹框
    private void initBeforeWindow() {
        beforedatePPw = new ChanpinMoxingPPWindows(getActivity());

        LayoutInflater popInflater = (LayoutInflater) (getActivity()).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_repy_beforedate1, null);
        tiqianhuankuantankuanglayout = popupView.findViewById(R.id.tiqianhuankuantankuanglayout);
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
                , (int) (huoquPingmuKuandu(getActivity()) * 0.9), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);
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
                , (int) (huoquPingmuKuandu(getActivity()) * 0.9), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);
    }


    private void opensoutuh5() {
        String url = HUANKUANTOUSU + "&token=" + fanhuibean.getConvenientDesertPunctualJar();
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
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
                    if (!TextUtils.isEmpty(fanhuibean.getUsedRabbitCentigradeThey()) && "1".equals(fanhuibean.getUsedRabbitCentigradeThey())) {
                        rycxxh_huancuishoutousu.setVisibility(View.VISIBLE);
                    } else {
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
        try {
            String tousuApp = BendiHuancunTols.huoQuZifuchuan(getActivity(), TOUSU_APP);
            if("1".equals(tousuApp)){
                qingqiuJiekouHuoquApppeizhi3();
                return;
            }

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
                        if (!TextUtils.isEmpty(fanhuibean.getEachFerryMoralTableLooseBrake()) && "1".equals(fanhuibean.getEachFerryMoralTableLooseBrake())) {
                            BendiHuancunTols.commitZifuchuan(TOUSU_APP,"1");
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
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void qingqiuJiekouSousuneirong() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.SEARCH_ZHUAJINUM_BBB, ZhaowomenFuwuModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ZhaowomenFuwuModel>() {
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

    //展期详情
    public void qingqiuJiekouZhanQi() {

        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HUOQUHUANKUANJIHUA, FenqiJihuaListModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<FenqiJihuaListModel>() {
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
                map.put("eachSharkCleverDishDampFactory", "0304");
            }

            @Override
            public void onSuccess(FenqiJihuaListModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    if(response.getBigAncientTastyHeadteacher().getHonestHelpfulSteamInlandSummary() != null && response.getBigAncientTastyHeadteacher().getHonestHelpfulSteamInlandSummary().size()>0) {
                        FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO fanhuibean = response.getBigAncientTastyHeadteacher().getHonestHelpfulSteamInlandSummary().get(0);

                        repayPlanIdListZhanQi = fanhuibean.getActiveFoxNumberCarpet() + "";

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
                            zhina_sajR23fTv_jianmianeee2.setText("-" +String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), fanhuibean.getPopVolleyballEarlyDelight()));
                        } else {
                            zhina_sajR23fTv_zengzhishushui2.setVisibility(View.GONE);
                        }

                        //文案
                        zhina_sajR23fTv_wenwean.setText(String.format(Locale.ENGLISH, getString(R.string.peizhiandout_egdsgj_xiop),
                                fanhuibean.getAfraidUndividedRestaurant() + ""
                                , fanhuibean.getGentleDecember()));

                        //展期内的还款方式列表 和外部正常还款用的同一个adapter 在获取还款方式接口的时候就已经赋值了
                        qingqiuhuankuanfangshiZhanqi();
//                    zhanqiPpw.showPPw(Gravity.CENTER);
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

    public void qingqiuhuankuanfangshiZhanqi() {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getContext()).post(ChangliangConfigTols.HUANKUANFANGSHI, RyryHuantypeListModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<RyryHuantypeListModel>() {
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
                map.put("tiredMommyEitherThickEnding",  danziDingId + "");//dingdan id
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
                        ryryZhanqiTypeLiebShipei = new RyryHuanTypeLiebShipei(getContext(), response.getBigAncientTastyHeadteacher(), "1");
                    }

                    zhanqiPpw.showPPw(Gravity.CENTER);

                } else {
//                    Toast.makeText(ExtendForDialogActivity.this, response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
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

    TextView zhina_sajR23fTv_riqi;//日期
    TextView zhina_sajR23fTv_servefei;//服务费
    TextView zhina_sajR23fTv_lixi;//利息
    TextView zhina_sajR23fTv_zhinajin;//滞纳金
    TextView zhina_sajR23fTv_zhanshue;//展期金额
    TextView zhina_sajR23fTv_zhanshueee2;//天数
    TextView zhina_sajR23fTv_wenwean;//文案
    TextView dingdanhao_tv_zq;//订单编号

    RelativeLayout zhina_sajR23fTv_zengzhishui, zhina_sajR23fTv_zengzhishushui2;
    TextView zhina_sajR23fTv_jianmiane;//增值税
    TextView zhina_sajR23fTv_jianmianeee2;//减免
    RecyclerView ryry_zhanqitype_luzilist;//还款方式列表


    private void chuangjianZahnqiqiPPW() {
        zhanqiPpw = new ChanpinMoxingPPWindows(getActivity());

        //展期view
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
        dingdanhao_tv_zq = kuangShitu.findViewById(R.id.dingdanhao_tv_zq);//订单编号

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

        kuangShitu.findViewById(R.id.fuzhidingdanhao_img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = dingdanhao_tv_zq.getText().toString().trim();
                if (!TextUtils.isEmpty(code)) {
                    ClipboardManager clipboard = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                    clipboard.setPrimaryClip(ClipData.newPlainText("label", code));
                    ToastUtil.showShortToast("Copiar con éxito");
                }
            }
        });


        initrecyclerviewzhanqi();

//        zhanqiPpw.chushihuaPPW(kuangShitu, false, (int) (huoquPingmuKuandu(getActivity())), ViewGroup.LayoutParams.WRAP_CONTENT);
        zhanqiPpw.chushihuaPPW(kuangShitu, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(getActivity()) * 0.8), null, true);


    }

    private RyryHuanTypeLiebShipei ryryZhanqiTypeLiebShipei;

    private void initrecyclerviewzhanqi() {

        if (ryryZhanqiTypeLiebShipei == null) {
            ryryZhanqiTypeLiebShipei = new RyryHuanTypeLiebShipei(getContext(), new ArrayList<>(), "1");
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        ryry_zhanqitype_luzilist.setLayoutManager(linearLayoutManager);
        ryry_zhanqitype_luzilist.setAdapter(ryryZhanqiTypeLiebShipei);
        ryryZhanqiTypeLiebShipei.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                if (jiazaizhongWindows == null) {
                    return;
                }
                if (!TextUtils.isEmpty(repayPlanIdListZhanQi)) {
                    RyryHuantypeListModel.RyryHuantype bean = (RyryHuantypeListModel.RyryHuantype) adapter.getData().get(position);
                    qingqiuhuankuanZhifu(bean, repayPlanIdListZhanQi,"0304");
                }

            }
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        try {
            if (tousuPPw != null && tousuPPw.huoquPPwShowFou()) {
                tousuPPw.xiaohuiPPw();
            }
            if (beforedatePPw != null && beforedatePPw.huoquPPwShowFou()) {
                beforedatePPw.xiaohuiPPw();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}