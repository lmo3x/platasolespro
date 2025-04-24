package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.APPMINGZI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuGodu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.shezhiShujuActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HuankDanliebModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HuiqianModel1;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.LateForRyDetailsModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PersonShenfenZhaoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.RyryHuantypeListModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.XinyonghuModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhifuInfoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.DadianhuaGeiWomenActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ExtendForDialogActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.Main2Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian0Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian3Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian4Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian5Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow2.JinJinGoGoJian0ActivityEg;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.gjtype.SelectGuoJiaUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.OrderListAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.RyryHuanTypeLiebShipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ZhuSenceSevenBillFragment extends MyJichuBsFragment implements View.OnClickListener {

    private View topMainView;
    private RecyclerView duoChanPinRl;
    private LinearLayout duoChanPinRlEmpty;

    private SwipeRefreshLayout swipeRefreshLayout;
    private ImpZhuyaoActivity impZhuyaoActivity;

    private OrderListAdapter orderListAdapter;
    private TextView jingojian1dibuxieyi;


    private boolean isClickFast = false;
    private HuankDanliebModel.HuankuanDanModel clickbean;

    private boolean putongHuanOk = false;
    private boolean zhanqiHuanOk = false;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        impZhuyaoActivity = (ImpZhuyaoActivity) context;
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
        View view = inflater.inflate(R.layout.fragment_home_07_order, null);

        chuangjianZahnqiqiPPW();

        swipeRefreshLayout = view.findViewById(R.id.swipeRefreshLayout);
        topMainView = view.findViewById(R.id.topMainView);
        duoChanPinRl = view.findViewById(R.id.duoChanPinRl);
        duoChanPinRlEmpty = view.findViewById(R.id.duoChanPinRl_empty);
        jingojian1dibuxieyi = view.findViewById(R.id.jingojian1dibuxieyi);

//        DianjiQuickTols.kuaiLeMa(jingojian1dibuxieyi,this);
        jingojian1dibuxieyi.setOnClickListener(this);
        //动态设置状态栏高度
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) topMainView.getLayoutParams();
        layoutParams.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(getActivity());
        topMainView.setLayoutParams(layoutParams);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(impZhuyaoActivity);
        duoChanPinRl.setLayoutManager(linearLayoutManager);
        if (orderListAdapter == null) {
            orderListAdapter = new OrderListAdapter(getContext(), new ArrayList<>());
        }
        duoChanPinRl.setAdapter(orderListAdapter);
        orderListAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {

                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                clickbean = (HuankDanliebModel.HuankuanDanModel) adapter.getData().get(position);
                if ("3".equals(clickbean.getUpsetBayUnfortunateFamousStair()) || "4".equals(clickbean.getUpsetBayUnfortunateFamousStair())) {
                    clickItem(clickbean);
//                    if (view.getId() == R.id.btn_first) {//点击还款或者逾期的 展期按钮
//
//                        BendiHuancunTols.commitZifuchuan(BendiHuancunTols.COPY_USER_INFO, clickbean.getHighConceitedTablet() + "," + clickbean.getDistantBoxingBeerUnmarriedShade());
//                        Intent intent = new Intent(getActivity(), ExtendForDialogActivity.class);
//                        intent.putExtra("clickorderid", clickbean.getTiredMommyEitherThickEnding()+"");
//                        startActivity(intent);
////                        //弹框展期
////                        qingQiuJiekou1ForCutfee();
////                        qingqiuJiekou2();
////                        qingqiuhuankuanfangshi();
//
//                    } else {
//                        clickItem(clickbean);
//                    }
                } else {//点击其他情况其他按钮

                    clickItem(clickbean);
//                    view.postDelayed(new Runnable() {
//                        @Override
//                        public void run() {
//                            isClickFast = false;
//                        }
//                    }, 600);
                }


            }

        });


        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(false);
                if (!WngluoTols.youWangluoFou(getActivity())) {
                    basefNonet.showPPw(Gravity.CENTER);
                    return;
                }
                impZhuyaoActivity.checkSingleOrMore();
                impZhuyaoActivity.qingqiuJiekouGengxin();
//                impZhuyaoActivity.qingqiuJiekougetTouxiang();
            }
        });

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();

        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        impZhuyaoActivity.qingqiuJiekouGengxin();
    }

    @Override
    public void onClick(View view) {
        if (DianjiQuickTols.clickkuaikuai()) {
            return;
        }
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        switch (view.getId()) {
            case R.id.jyhyjhtgrtthg:
                XieyiShowTols.quH5KefuPage(getActivity(),"18");
//                Intent intent = new Intent(getActivity(), DadianhuaGeiWomenActivity.class);
//                startActivity(intent);
                break;
            case R.id.jingojian1dibuxieyi://跳转协议
                XieyiShowTols.quH5YinsiPage(getActivity());
                break;
        }
    }

    public void setData(Context context, List<HuankDanliebModel.HuankuanDanModel> list) {
//        if (realiseRudeTownBeans == null) {
//            realiseRudeTownBeans = new ArrayList<>();
//        }
//        realiseRudeTownBeans.clear();
//        realiseRudeTownBeans.addAll(list);
        if (orderListAdapter != null) {
            orderListAdapter.setNewData(list);
        } else {
            orderListAdapter = new OrderListAdapter(context, list);
        }
        if (list.isEmpty()) {
            duoChanPinRl.setVisibility(View.GONE);
            duoChanPinRlEmpty.setVisibility(View.VISIBLE);
        } else {
            duoChanPinRlEmpty.setVisibility(View.GONE);
            duoChanPinRl.setVisibility(View.VISIBLE);
        }
    }

    private void clickItem(HuankDanliebModel.HuankuanDanModel bean) {
        jump(bean);
    }

    private void getCopyInfo(HuankDanliebModel.HuankuanDanModel bean) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getContext()).post(ChangliangConfigTols.KAOBEIXINXI2, XinyonghuModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<XinyonghuModel>() {
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
                map.put("furnishedSteepFalseForest", YincangShijianClickTols.appshasahId);//og
                map.put("firmHappyAtlanticAustralia", bean.getDistantBoxingBeerUnmarriedShade());//appssid 传子盘ssssid
                map.put("agriculturalArithmeticGeneralPine", bean.getDistantBoxingBeerUnmarriedShade());//cilent-id传子盘ssssid
                map.put("distantBoxingBeerUnmarriedShade", bean.getDistantBoxingBeerUnmarriedShade());//appSsid传子盘ssssid
            }

            @Override
            public void onSuccess(XinyonghuModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000 && response.getBigAncientTastyHeadteacher() != null) {
                    bean.setHighConceitedTablet(response.getBigAncientTastyHeadteacher().getLittleStory());
                    //
                    BendiHuancunTols.commitZifuchuan(BendiHuancunTols.COPY_USER_INFO, bean.getHighConceitedTablet() + "," + bean.getDistantBoxingBeerUnmarriedShade());

                    qingqiuJiekouWanShan(bean);
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private void qingqiuJiekouWanShan(HuankDanliebModel.HuankuanDanModel bean) {
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
                        Intent intent = new Intent();
                        intent.putExtra("appName", bean.getSeveralHillCompressedSlaveryFreshBasin());
                        BendiHuancunTols.commitZifuchuan(APPMINGZI, bean.getSeveralHillCompressedSlaveryFreshBasin());
                        if (SelectGuoJiaUtil.isGuoJiaBl()) {
                            //秘鲁
                            intent.setClass(getContext(), JinJinGoGoJian0Activity.class);
                        } else {
                            intent.setClass(getContext(), JinJinGoGoJian0ActivityEg.class);
                        }
                        startActivity(intent);
                    }else {
                        String[] pageType = response.getRoughNaturalPro().triangleTowerAids.split(",");
                        if(pageType.length == 4){
                            if(pageType[0].equals("0")){  //基础信息页面
                                Intent intent = new Intent();
                                intent.putExtra("appName", bean.getSeveralHillCompressedSlaveryFreshBasin());
                                BendiHuancunTols.commitZifuchuan(APPMINGZI, bean.getSeveralHillCompressedSlaveryFreshBasin());
                                if (SelectGuoJiaUtil.isGuoJiaBl()) {
                                    //秘鲁
                                    intent.setClass(getContext(), JinJinGoGoJian0Activity.class);
                                } else {
                                    intent.setClass(getContext(), JinJinGoGoJian0ActivityEg.class);
                                }
                                startActivity(intent);
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

    private void jump(HuankDanliebModel.HuankuanDanModel bean) {
        String type = bean.getUpsetBayUnfortunateFamousStair();
        switch (type) {
            case "2":
            case "5":
                jiazaizhongWindows.showKuangkuangIng();
                WangluoQingqiuVolyeyeTols.chuangjianInit(getContext()).post(ChangliangConfigTols.HOMEPAGE_FOR_UNLOGIN, UnintoTabModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<UnintoTabModel>() {
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
                        map.put("currentuseridcanshu", String.valueOf(bean.getHighConceitedTablet()));//userid
                        map.put("currentssidcanshu", bean.getDistantBoxingBeerUnmarriedShade());//ssssid
                    }

                    @Override
                    public void onSuccess(UnintoTabModel response) {
                        jiazaizhongWindows.hideKuangkuangIng();
                        if (response.getaverageEmbassyNationalVictoryDepth() == 1000 && response.getBigAncientTastyHeadteacher() != null) {
                            int pleasantBallIcelandBookshop = response.getBigAncientTastyHeadteacher().getPoorStrictNeedleShopping();
                            if (type.equals("2")) {
                                if (pleasantBallIcelandBookshop == -1) {
                                    getCopyInfo(bean);
                                }
                            } else {
                                BendiHuancunTols.commitZifuchuan(BendiHuancunTols.COPY_USER_INFO, bean.getHighConceitedTablet() + "," + bean.getDistantBoxingBeerUnmarriedShade());
                                Intent intent = new Intent(getActivity(), JinJinGoGoJian5Activity.class);
                                intent.putExtra("orderId", String.valueOf(response.getBigAncientTastyHeadteacher().getTiredMommyEitherThickEnding()));
                                intent.putExtra("Home05ShiBaiFragment", true);
                                startActivity(intent);
                            }
                        }
                    }

                    @Override
                    public void onError(String error) {
                        jiazaizhongWindows.hideKuangkuangIng();
                        Log.e("TAG", "error---->" + error);
                    }
                });
                break;
            case "0":
            case "1":
            case "3":
            case "4":
            case "6":
                BendiHuancunTols.commitZifuchuan(BendiHuancunTols.COPY_USER_INFO, bean.getHighConceitedTablet() + "," + bean.getDistantBoxingBeerUnmarriedShade());
                Intent intent = new Intent();
                intent.setClass(getContext(), Main2Activity.class);
                intent.putExtra("clickorderid", clickbean.getTiredMommyEitherThickEnding());
                intent.putExtra("appName", bean.getSeveralHillCompressedSlaveryFreshBasin());
                BendiHuancunTols.commitZifuchuan(APPMINGZI, bean.getSeveralHillCompressedSlaveryFreshBasin());
                startActivity(intent);
                break;

        }
    }


    public ChanpinMoxingPPWindows zhanqiPpw;

    //获取展期弹框信息
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
                if (TextUtils.isEmpty(s1)) {
                    s1 = "0";
                }
                if (TextUtils.isEmpty(s2)) {
                    s2 = "0";
                }
                map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
                map.put("tiredMommyEitherThickEnding", clickbean.getTiredMommyEitherThickEnding() + "");
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

//                    //减免金额 需要请求index接口获取
//                    if (fanhuibean.afraidUndividedRestaurant!=0) {
//                        zhina_sajR23fTv_zengzhishushui2.setVisibility(View.VISIBLE);
//                        zhina_sajR23fTv_jianmianeee2.setText(String.format(Locale.ENGLISH,getString(R.string.geshizhuanyi_jsl_form), Double.parseDouble(fanhuibean.afraidUndividedRestaurant+"")));
//                    } else {
//                        zhina_sajR23fTv_zengzhishushui2.setVisibility(View.GONE);
//                    }

                    //文案
                    zhina_sajR23fTv_wenwean.setText(String.format(Locale.ENGLISH,getString(R.string.peizhiandout_egdsgj_unp),
                            fanhuibean.compressedSoapCentigradeInstrumentThoroughSeaweed
                            , fanhuibean.afraidUndividedRestaurant + ""
                            , fanhuibean.compressedSoapCentigradeInstrumentThoroughSeaweed));

                    //天数
//                    zhina_sajR23fTv_zhanshueee2.setText(String.format(Locale.ENGLISH,getString(R.string.zhuyetab_ryingzhong_pro2), fanhuibean.afraidUndividedRestaurant));
//
//                    //服务费
//                    str_tarifa_extendidaTv.setText(String.format(Locale.ENGLISH,getString(R.string.str_radix_point), bigAncientTastyHeadteacher.popVolleyballEarlyDelight));
//                    //利息
//                    str_interesesTv.setText(String.format(Locale.ENGLISH,getString(R.string.str_radix_point), bigAncientTastyHeadteacher.leadingJanuaryRightSonPath));
//                    //滞纳金
//                    str_cargo_por_demoraTv.setText(String.format(Locale.ENGLISH,getString(R.string.str_radix_point), bigAncientTastyHeadteacher.successfulMinuteBrunchFairMonth));
//                    //展期金额
//                    str_monto_del_pagoTv.setText(String.format(Locale.ENGLISH,getString(R.string.str_radix_point), bigAncientTastyHeadteacher.compressedSoapCentigradeInstrumentThoroughSeaweed));


                    zhanqiPpw.showPPw(Gravity.CENTER);
                } else {
//                    Toast.makeText(getActivity(), response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getNuclearTrialSpareMountainousBat());
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

    RelativeLayout zhina_sajR23fTv_zengzhishui, zhina_sajR23fTv_zengzhishushui2;
    TextView zhina_sajR23fTv_jianmiane;//增值税
    TextView zhina_sajR23fTv_jianmianeee2;//减免
    private RecyclerView ryry_zhanqitype_luzilist;//还款方式列表


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
                RyryHuantypeListModel.RyryHuantype bean = (RyryHuantypeListModel.RyryHuantype) adapter.getData().get(position);
                qingqiuhuankuanZhifu(bean, "01");

            }
        });


    }

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
        ryry_zhanqitype_luzilist = kuangShitu.findViewById(R.id.ryry_zhanqitype_luzilist);

        zhina_sajR23fTv_zengzhishui = kuangShitu.findViewById(R.id.zhina_sajR23fTv_zengzhishui);//增值税
        zhina_sajR23fTv_jianmiane = kuangShitu.findViewById(R.id.zhina_sajR23fTv_jianmiane);//减免金额
        zhina_sajR23fTv_zengzhishushui2 = kuangShitu.findViewById(R.id.zhina_sajR23fTv_zengzhishushui2);//增值税
        zhina_sajR23fTv_jianmianeee2 = kuangShitu.findViewById(R.id.zhina_sajR23fTv_jianmianeee2);//减免金额


//        switch (GuojiaLeixing) {
//            case GuojiaLeixing2://秘鲁
//                zhina_sajR23fTv_zengzhishui.setVisibility(View.VISIBLE);
//                zhina_sajR23fTv_zengzhishushui2.setVisibility(View.VISIBLE);
//                break;
//            default://西班牙
//        }

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

    private void qingqiuJiekouHuqouLeixing(String payType, String payMethod, int orderId) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.KUANHUANLIANJIE, HuiqianModel1.class, new WangluoQingqiuVolyeyeTols.OnResponse<HuiqianModel1>() {
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
                            ImpZhuyaoActivity.shiFouFukuan_Exten = true;
                        } else {
                            ImpZhuyaoActivity.shiFouFukuan = true;
                        }
                        if ("1".equals(response.bigAncientTastyHeadteacher.earlyInventionAirEndlessAncestor)) {

                            Uri uri = Uri.parse(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury);
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
//                            if ("01".equals(payType)) {
//                                zhanqiHuanOk = true;
//                            }else {
//                                putongHuanOk = true;
//                            }


                        } else {
                            if ("01".equals(payType)) {
                                if (getActivity() instanceof ImpZhuyaoActivity) {
                                    ((ImpZhuyaoActivity) getActivity()).tiaoWangyeHlper(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury, 2001);
                                } else if (getActivity() instanceof Main2Activity) {
                                    ((Main2Activity) getActivity()).startH5Activity(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury, 2001);
                                }
                            } else {
                                if (getActivity() instanceof ImpZhuyaoActivity) {
                                    ((ImpZhuyaoActivity) getActivity()).tiaoWangyeHlper(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury, 1001);
                                } else if (getActivity() instanceof Main2Activity) {
                                    ((Main2Activity) getActivity()).startH5Activity(response.bigAncientTastyHeadteacher.neitherMondayHammerCentury, 1001);
                                }
                            }
                        }

                    }
                } else {
//                    Toast.makeText(getActivity(), response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getNuclearTrialSpareMountainousBat());
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
                map.put("tiredMommyEitherThickEnding", clickbean.getTiredMommyEitherThickEnding() + "");//dingdan id
                map.put("eachSharkCleverDishDampFactory", "00");
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
                        ryryZhanqiTypeLiebShipei = new RyryHuanTypeLiebShipei(getActivity(), response.getBigAncientTastyHeadteacher(), "1");
                    }

                } else {
//                    Toast.makeText(getActivity(), response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getNuclearTrialSpareMountainousBat());
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

    public void qingqiuhuankuanZhifu(RyryHuantypeListModel.RyryHuantype clickitem, String payleixing) {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.HUOQUZHIFUXINXI, ZhifuInfoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ZhifuInfoModel>() {
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
                map.put("tiredMommyEitherThickEnding", clickbean.getTiredMommyEitherThickEnding() + "");
                map.put("eachSharkCleverDishDampFactory", payleixing);//payType
                map.put("thoroughLiteraryPeach", clickitem.getThoroughLiteraryPeach());//payChannel
                map.put("properFatDigestPolitics", clickitem.getProperFatDigestPolitics());//payChannelName
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
                    } else {
                        putongHuanOk = true;
                    }
                    if ("1".equals(response.getBigAncientTastyHeadteacher().getEarlyInventionAirEndlessAncestor())) {
                        Uri uri = Uri.parse(response.getBigAncientTastyHeadteacher().getDoubleForm());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);

                    } else {
                        if ("01".equals(payleixing)) {
                            if (getActivity() instanceof ImpZhuyaoActivity) {
                                ((ImpZhuyaoActivity) getActivity()).tiaoWangyeHlper(response.getBigAncientTastyHeadteacher().getDoubleForm(), 2001);
                            } else if (getActivity() instanceof Main2Activity) {
                                ((Main2Activity) getActivity()).startH5Activity(response.getBigAncientTastyHeadteacher().getDoubleForm(), 2001);
                            }
                        } else {
                            if (getActivity() instanceof ImpZhuyaoActivity) {
                                ((ImpZhuyaoActivity) getActivity()).tiaoWangyeHlper(response.getBigAncientTastyHeadteacher().getDoubleForm(), 1001);
                            } else if (getActivity() instanceof Main2Activity) {
                                ((Main2Activity) getActivity()).startH5Activity(response.getBigAncientTastyHeadteacher().getDoubleForm(), 1001);
                            }
                        }
                    }


                } else {
//                    Toast.makeText(getActivity(), response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast( response.getNuclearTrialSpareMountainousBat());
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

}
