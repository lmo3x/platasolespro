package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.APPMINGZI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.shezhiShujuActivity;

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

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DuoproChapinModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PersonShenfenZhaoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.XinyonghuModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
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
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.DuoChanPinListAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ZhuSenceSixMoreProductFragment extends MyJichuBsFragment implements View.OnClickListener {

    private View zishiyingzhuangtailangaodu;
    private ImageView jyhyjhtgrtthg;
    private RecyclerView duoChanPinRl;

    private SwipeRefreshLayout shuaxinKongjianLy;
    private ImpZhuyaoActivity impZhuyaoActivity;

    //圆形
    private RequestOptions options = RequestOptions.circleCropTransform();
    private ImageView gaohao_tubiaoapp;

    private DuoChanPinListAdapter duoChanPinListAdapter;

    private static List<DuoproChapinModel.RoughNaturalProDTO> list = new ArrayList<>();

    private boolean isClickFast;

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
    public void onResume() {
        super.onResume();

        impZhuyaoActivity.qingqiuJiekouGengxin();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_06_duo_chan_pin, null);

        shuaxinKongjianLy = view.findViewById(R.id.swipeRefreshLayout);
        zishiyingzhuangtailangaodu = view.findViewById(R.id.topMainView);
        jyhyjhtgrtthg = view.findViewById(R.id.jyhyjhtgrtthg);

        duoChanPinRl = view.findViewById(R.id.duoChanPinRl);

//        DianjiQuickTols.kuaiLeMa(jyhyjhtgrtthg, this);
        jyhyjhtgrtthg.setOnClickListener(this);

        //动态设置状态栏高度
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) zishiyingzhuangtailangaodu.getLayoutParams();
        layoutParams.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(getActivity());
        zishiyingzhuangtailangaodu.setLayoutParams(layoutParams);

        gaohao_tubiaoapp = view.findViewById(R.id.gaohao_tubiaoapp);
        //圆形Logo
        Glide.with(this).asBitmap()
                .load(R.mipmap.useimg_desklogo)
                .apply(options)
                .into(gaohao_tubiaoapp);
        if (duoChanPinListAdapter == null) {
            duoChanPinListAdapter = new DuoChanPinListAdapter(getContext(), new ArrayList<>());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        duoChanPinRl.setLayoutManager(linearLayoutManager);
        duoChanPinRl.setAdapter(duoChanPinListAdapter);
        duoChanPinListAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                DuoproChapinModel.RoughNaturalProDTO bean = (DuoproChapinModel.RoughNaturalProDTO) adapter.getData().get(position);
                clickItem(bean);
//                view.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        isClickFast = false;
//                    }
//                }, 600);
            }
        });

        shuaxinKongjianLy.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                shuaxinKongjianLy.setRefreshing(false);
                impZhuyaoActivity.checkSingleOrMore();
                impZhuyaoActivity.qingqiuJiekouGengxin();
//                impZhuyaoActivity.qingqiuJiekougetTouxiang();
            }
        });
        return view;
    }

    @Override
    public void onClick(View view) {
        if (DianjiQuickTols.clickkuaikuai()) {
            return;
        }
        switch (view.getId()) {
            case R.id.jyhyjhtgrtthg://跳转客服
                XieyiShowTols.quH5KefuPage(getActivity(),"3");
//                Intent intent = new Intent(getActivity(), DadianhuaGeiWomenActivity.class);
//                startActivity(intent);
                break;
        }
    }

    public void shezhiDuochanpinList(Context context, List<DuoproChapinModel.RoughNaturalProDTO> list) {
        List<DuoproChapinModel.RoughNaturalProDTO> data = new ArrayList<>();
        if (!list.isEmpty()) {
            List<DuoproChapinModel.RoughNaturalProDTO> list1 = new ArrayList<>();
            List<DuoproChapinModel.RoughNaturalProDTO> list2 = new ArrayList<>();
            for (DuoproChapinModel.RoughNaturalProDTO bean : list) {
//                bean.setEachThemeSecondSalesman(Double.parseDouble(amount));
                bean.setCurrentIndex(-1);
                if (bean.getUpsetBayUnfortunateFamousStair().equals("0")) {
                    bean.setCurrentIndex(list2.size());
                    list2.add(bean);
                } else {
                    list1.add(bean);
                }
            }
            data.addAll(list1);
            data.addAll(list2);
        }
        if (duoChanPinListAdapter != null) {
            duoChanPinListAdapter.setNewData(data);
        } else {
            duoChanPinListAdapter = new DuoChanPinListAdapter(context, data);
        }
    }

    private String publicamout="";

    public void setAmoutData(Context context, String amount) {
        publicamout = amount;
    }

    private void clickItem(DuoproChapinModel.RoughNaturalProDTO bean) {
        zhijieTiaozhaun(bean);
    }

    private void qingqiuJiekouKaobei(DuoproChapinModel.RoughNaturalProDTO bean) {
        if (jiazaizhongWindows == null) {
            return;
        }
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

                    fuZhiUserXixnxForAnotherProduct(bean);

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

    private void fuZhiUserXixnxForAnotherProduct(DuoproChapinModel.RoughNaturalProDTO bean) {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();

        WangluoQingqiuVolyeyeTols.chuangjianInit(getContext()).post(ChangliangConfigTols.KAOBEIXINXI2, XinyonghuModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<XinyonghuModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
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
                    BendiHuancunTols.commitZifuchuan(APPMINGZI, bean.getSeveralHillCompressedSlaveryFreshBasin());

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

    private void qingqiuJiekouWanShan(DuoproChapinModel.RoughNaturalProDTO bean) {
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

    private void zhijieTiaozhaun(DuoproChapinModel.RoughNaturalProDTO bean) {
        String type = bean.getUpsetBayUnfortunateFamousStair();
        switch (type) {
            case "0":
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
//                        map.put("plasticDrugChicken", bean.getDistantBoxingBeerUnmarriedShade());
                        map.put("currentuseridcanshu", String.valueOf(bean.getHighConceitedTablet()));
                        map.put("currentssidcanshu", bean.getDistantBoxingBeerUnmarriedShade());
                    }

                    @Override
                    public void onSuccess(UnintoTabModel response) {
                        jiazaizhongWindows.hideKuangkuangIng();
                        if (response.getaverageEmbassyNationalVictoryDepth() == 1000 && response.getBigAncientTastyHeadteacher() != null) {
                            int pleasantBallIcelandBookshop = response.getBigAncientTastyHeadteacher().getPoorStrictNeedleShopping();
                            if (type.equals("0")) {
                                if (pleasantBallIcelandBookshop == -1) {
                                    fuZhiUserXixnxForAnotherProduct(bean);
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
            case "1":
            case "2":
            case "3":
            case "4":
            case "6":
                BendiHuancunTols.commitZifuchuan(BendiHuancunTols.COPY_USER_INFO, bean.getHighConceitedTablet() + "," + bean.getDistantBoxingBeerUnmarriedShade());
                Intent intent = new Intent();
                intent.putExtra("appName", bean.getSeveralHillCompressedSlaveryFreshBasin());
                BendiHuancunTols.commitZifuchuan(APPMINGZI, bean.getSeveralHillCompressedSlaveryFreshBasin());
                intent.setClass(getContext(), Main2Activity.class);
                startActivity(intent);
                break;
        }
    }
}