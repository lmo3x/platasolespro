package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.yixiesuipian_f;

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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.SuoyouXinxiModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.DadianhuaGeiWomenActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.GaogeZhanghaoIntoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.PeizhiLeiActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian10Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.myselfkongjian.GunlunZidingyiKongjian;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.gjtype.SelectGuoJiaUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.XioaxiLiebShipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.HaodeShangpinLiebShipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsFragment;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HuiqianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PersonShenfenZhaoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.TOUSUH5TOEKN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.YINSI_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHENFENYEJIAZAIWAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity.ZHUYEMIAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity.FIRSTJIE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.INDEX_MORENDIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ZHUAJI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_TOKEN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ID;

public class PeizhiAndOutappFragment extends MyJichuBsFragment implements View.OnClickListener {

    private ImageView toutou_fjkf_img_Tfjsf, sjljf_Uudiog_djgodg;
    private LinearLayout caksj_menu_firstrowbuju, caksj_menu_secondrowbuju, caksj_menu_thirdrowbuju, caksj_menu_fourrowbuju, caksj_menu_fiverowbuju, caksj_menu_xinxiwanshan;
//    private LinearLayout caksj_menu_tousull;

    private TextView meishayong_sfjfsTjsif_sof1239dsd, meishayong_sfjfsTjsif_sof1239dsd1, meishayong_sfjfsTjsif_sof1239dsd2, nameTv, hgrfa_zhuaji_haoma_djgttxxt;

    private SwipeRefreshLayout shuashau_gjlaTjtj_sja23jdf;

    private ChanpinMoxingPPWindows chanpinMoxingPPWindows;
    private ChanpinMoxingPPWindows shangpinPPw;
    private ChanpinMoxingPPWindows xiaoxiPPw;

    private RequestOptions qingqiuOpt = RequestOptions.circleCropTransform();

    private ImpZhuyaoActivity impZhuyaoActivity;

    private String zhuaji;

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
        View fragShitu = inflater.inflate(R.layout.f_frag_woziji, null);

        //动态设置状态栏高度
        RelativeLayout.LayoutParams bujuguanli = (RelativeLayout.LayoutParams) fragShitu.findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        bujuguanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(getActivity());
        fragShitu.findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(bujuguanli);
        shuashau_gjlaTjtj_sja23jdf = fragShitu.findViewById(R.id.shuashau_gjlaTjtj_sja23jdf);
        toutou_fjkf_img_Tfjsf = fragShitu.findViewById(R.id.toutou_fjkf_img_Tfjsf);
        sjljf_Uudiog_djgodg = fragShitu.findViewById(R.id.sjljf_Uudiog_djgodg);

        caksj_menu_firstrowbuju = fragShitu.findViewById(R.id.caksj_menu_firstrowbuju);
        caksj_menu_secondrowbuju = fragShitu.findViewById(R.id.caksj_menu_secondrowbuju);
        caksj_menu_thirdrowbuju = fragShitu.findViewById(R.id.caksj_menu_thirdrowbuju);
        caksj_menu_fourrowbuju = fragShitu.findViewById(R.id.caksj_menu_fourrowbuju);
        caksj_menu_fiverowbuju = fragShitu.findViewById(R.id.caksj_menu_fiverowbuju);
        caksj_menu_xinxiwanshan = fragShitu.findViewById(R.id.caksj_menu_xinxiwanshan);
        nameTv = fragShitu.findViewById(R.id.nameTv);
        hgrfa_zhuaji_haoma_djgttxxt = fragShitu.findViewById(R.id.hgrfa_zhuaji_haoma_djgttxxt);
        lunzhuantu_djfsljaf_fjfjTjjt233 = (Banner) fragShitu.findViewById(R.id.lunzhuantu_djfsljaf_fjfjTjjt233);
//        caksj_menu_tousull = fragShitu.findViewById(R.id.caksj_menu_tousull);


        sjljf_Uudiog_djgodg.setOnClickListener(this);
        toutou_fjkf_img_Tfjsf.setOnClickListener(this);
        caksj_menu_firstrowbuju.setOnClickListener(this);
        caksj_menu_secondrowbuju.setOnClickListener(this);
        caksj_menu_thirdrowbuju.setOnClickListener(this);
        caksj_menu_fourrowbuju.setOnClickListener(this);
        caksj_menu_fiverowbuju.setOnClickListener(this);
        caksj_menu_xinxiwanshan.setOnClickListener(this);
//        caksj_menu_tousull.setOnClickListener(this);

        chuangjianPPwdsdj();
        chuangjianShangpinPPw();
        chuangjianXiaoxiPPW();

//        qingqiuJiekouLunzhuanImg();
        qingqiuJiekougetTouxiang();
        qingqiuJiekou1();//获取名字

        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_ZHUAJI))) {
            Log.d("zhuajiHUANCUN", BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_ZHUAJI));

            zhuaji = BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_ZHUAJI);
            if (zhuaji != null && zhuaji.length() > 3) {
                String code = SelectGuoJiaUtil.GUO_CODE_BL_ADD;
                if (SelectGuoJiaUtil.isGuoJiaEg()) {
                    code = SelectGuoJiaUtil.GUO_CODE_EG_ADD;
                }
                hgrfa_zhuaji_haoma_djgttxxt.setText(code + zhuaji);
            }
        }

        //头像
        Glide.with(this).asBitmap()
                .load(R.mipmap.useimg_desklogo)
                .apply(qingqiuOpt)
                .into(toutou_fjkf_img_Tfjsf);


        shuashau_gjlaTjtj_sja23jdf.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                shuashau_gjlaTjtj_sja23jdf.setRefreshing(false);
                if (!WngluoTols.youWangluoFou(getActivity())) {
                    basefNonet.showPPw(Gravity.CENTER);
                    return;
                }
                qingqiuJiekougetTouxiang();
//                qingqiuJiekouLunzhuanImg();
                qingqiuJiekou1();
            }
        });

        return fragShitu;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_ZHUAJI))) {
            Log.d("zhuajiHUANCUN", BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_ZHUAJI));

            zhuaji = BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_ZHUAJI);
            if (zhuaji != null && zhuaji.length() > 3) {
                String code = SelectGuoJiaUtil.GUO_CODE_BL_ADD;
                if (SelectGuoJiaUtil.isGuoJiaEg()) {
                    code = SelectGuoJiaUtil.GUO_CODE_EG_ADD;
                }
                hgrfa_zhuaji_haoma_djgttxxt.setText(code + zhuaji);
            }
        }
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            qingqiuJiekougetTouxiang();
//            qingqiuJiekouLunzhuanImg();
            qingqiuJiekou1();

            if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_ZHUAJI))) {
                Log.d("zhuajiHUANCUN", BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_ZHUAJI));

                zhuaji = BendiHuancunTols.huoQuZifuchuan(getActivity(), YONGHU_ZHUAJI);
                if (zhuaji != null && zhuaji.length() > 3) {
                    String code = SelectGuoJiaUtil.GUO_CODE_BL_ADD;
                    if (SelectGuoJiaUtil.isGuoJiaEg()) {
                        code = SelectGuoJiaUtil.GUO_CODE_EG_ADD;
                    }
                    hgrfa_zhuaji_haoma_djgttxxt.setText(code + zhuaji);
                }
            }
        }
    }

    public void qingqiuJiekougetTouxiang() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(impZhuyaoActivity).post(ChangliangConfigTols.GET_SHENFEN_PICTURE, PersonShenfenZhaoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PersonShenfenZhaoModel>() {
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
                    if (!TextUtils.isEmpty(huidiaobean.variousRacialHeadline)) {
                        //头像
                        Glide.with(impZhuyaoActivity).asBitmap()
                                .load(huidiaobean.variousRacialHeadline)
                                .apply(qingqiuOpt)
                                .into(toutou_fjkf_img_Tfjsf);
                    } else {
                        //头像
                        Glide.with(impZhuyaoActivity).asBitmap()
                                .load(R.mipmap.useimg_desklogo)
                                .apply(qingqiuOpt)
                                .into(toutou_fjkf_img_Tfjsf);
                    }
                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
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

    private void qingqiuJiekou1() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(getActivity()).post(ChangliangConfigTols.GONGZUOLXR_SERACH_SHENFEN, SuoyouXinxiModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<SuoyouXinxiModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian4Activity.this, BendiHuancunTols.YONGHU_ID));
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
            public void onSuccess(SuoyouXinxiModel bean1) {
                jiazaizhongWindows.hideKuangkuangIng();
                //v-maximumSkillfulClimate : "1234567891234567"
                //v-musicalCommonTiredToday : "Nequi"
                //数据加载完
                YincangShijianClickTols.QingqiuMaidian(SHENFENYEJIAZAIWAN);
                if (bean1.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    SuoyouXinxiModel.FanhuiData naturalPro = bean1.bigAncientTastyHeadteacher;


                    if (!TextUtils.isEmpty(naturalPro.funnyDifferentBanana)) {
                        nameTv.setText(naturalPro.funnyDifferentBanana);
                    } else {
                        nameTv.setText(getString(R.string.ruanjianapp_mingzi));
                    }

                } else {
//                    Toast.makeText(getActivity(), bean1.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(bean1.getnuclearTrialSpareMountainousBat());
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

/*
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            Log.e("---fragment", "当前fragment获得焦点");
            if (!TextUtils.isEmpty(SpUtils.getString(getActivity(), PHONE))) {
                nameTv.setText(SpUtils.getString(getActivity(), PHONE));
                phoneTv.setText(SpUtils.getString(getActivity(), PHONE));
            }
        } else {
            Log.e("---fragment", "当前fragment非焦点");

        }
    }*/


    @Override
    public void onClick(View view) {
        if (!WngluoTols.youWangluoFou(getActivity())) {
            basefNonet.showPPw(Gravity.CENTER);
            return;
        }
        Intent intent;
        switch (view.getId()) {
            case R.id.toutou_fjkf_img_Tfjsf:
//                Intent broadcastIntent=new Intent(EFECTIVO_MAINACTIVITY);
//                mainActivity.sendBroadcast(broadcastIntent);
                break;
            case R.id.sjljf_Uudiog_djgodg:

                nameTv.setText("");
                hgrfa_zhuaji_haoma_djgttxxt.setText("");

                BendiHuancunTols.qingChuZifuchuan(getActivity(), YONGHU_ID);
                BendiHuancunTols.qingChuZifuchuan(getActivity(), YONGHU_TOKEN);
                BendiHuancunTols.qingChuZifuchuan(getActivity(), YONGHU_ZHUAJI);
                BendiHuancunTols.qingChuZifuchuan(getActivity(), TOUSUH5TOEKN);
                ImpZhuyaoActivity.shiFouFukuan = false;
                ImpZhuyaoActivity.shiFouFukuan_Exten = false;

                Intent broadcastIntent = new Intent(ZHUYEMIAN);
                impZhuyaoActivity.sendBroadcast(broadcastIntent);

                intent = new Intent(getActivity(), GaogeZhanghaoIntoActivity.class);
                startActivity(intent);

                impZhuyaoActivity.shezhiDibuMenuColor(0);
                impZhuyaoActivity.qingchuDibuMenuColro(1);
                impZhuyaoActivity.qingchuDibuMenuColro(2);

                impZhuyaoActivity.dangqianZhusenceF = impZhuyaoActivity.stringFragmentHashMap.get(FIRSTJIE);
                impZhuyaoActivity.kongzhiFragChange(impZhuyaoActivity.dangqianF, impZhuyaoActivity.dangqianZhusenceF);
                break;
            case R.id.caksj_menu_firstrowbuju:
                intent = new Intent(getContext(), PeizhiLeiActivity.class);
                startActivity(intent);
                break;
            case R.id.caksj_menu_secondrowbuju:
                XieyiShowTols.quH5KefuPage(getActivity(), "4");
//                intent = new Intent(getContext(), DadianhuaGeiWomenActivity.class);
//                startActivity(intent);
                break;
//            case R.id.meishayong_sfjfsTjsif_sof1239dsd://滚轮弹窗
//                chanpinMoxingPPWindows.showPPw();
//                break;
//            case R.id.meishayong_sfjfsTjsif_sof1239dsd1://推荐商品弹窗
//                shangpinPPw.showPPw(Gravity.CENTER);
//                break;
//            case R.id.meishayong_sfjfsTjsif_sof1239dsd2://消息弹窗
//                xiaoxiPPw.showPPw(Gravity.CENTER);
//                break;
            case R.id.caksj_menu_thirdrowbuju://隐私
                XieyiShowTols.quH5YinsiPage(getActivity(), YINSI_DIZHI, "0");
                break;
            case R.id.caksj_menu_fourrowbuju://客服
                XieyiShowTols.quYuanshengKefuPage(impZhuyaoActivity, zhuaji);
                break;
            case R.id.caksj_menu_fiverowbuju://投诉
                XieyiShowTols.quH5YinsiPage(impZhuyaoActivity, INDEX_MORENDIZHI, "1");
                break;
//            case R.id.caksj_menu_tousull://投诉
//                String url = HUANKUANTOUSU+"&token=" + BendiHuancunTols.huoQuZifuchuan(getActivity(),TOUSUH5TOEKN);
//                Uri uri = Uri.parse(url);
//                intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//                break;
            case R.id.caksj_menu_xinxiwanshan:
                intent = new Intent(getContext(), JinJinGoGoJian10Activity.class);
                startActivity(intent);
                break;
        }
    }


    private void chuangjianPPwdsdj() {
        chanpinMoxingPPWindows = new ChanpinMoxingPPWindows(getActivity());

        LayoutInflater popInflater = (LayoutInflater) (getActivity()).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_time_date, null);

        GunlunZidingyiKongjian wv = popupView.findViewById(R.id.wheel_view_wv);


        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        wv.setPianyiLiang(1);
        wv.setAllTiaomusList(list);


        wv.setOnOnGunlunJianting(new GunlunZidingyiKongjian.OnGunlunJianting() {
            @Override
            public void onXuanzeOne(int xaunzesuoyin, String item) {
//                Toast.makeText(getActivity(), "点击了："+item, Toast.LENGTH_SHORT).show();
            }
        });

        chanpinMoxingPPWindows.chushihuaPPW(popupView, false);
    }


    private void chuangjianShangpinPPw() {
        shangpinPPw = new ChanpinMoxingPPWindows(getActivity());

        LayoutInflater popInflater = (LayoutInflater) (getActivity()).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_chanpin_lst, null);
        RecyclerView popRecommendRv = popupView.findViewById(R.id.popRecommendRv);

        List<String> strings = new ArrayList<>();
        strings.add("");
        strings.add("");
        strings.add("");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        popRecommendRv.setLayoutManager(linearLayoutManager);
        HaodeShangpinLiebShipei haodeShangpinLiebShipei = new HaodeShangpinLiebShipei(strings);
        popRecommendRv.setAdapter(haodeShangpinLiebShipei);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.bbggbsahffwf));
        popRecommendRv.addItemDecoration(dividerItemDecoration);

        shangpinPPw.chushihuaPPW(popupView, false, (int) (huoquPingmuKuandu(getActivity()) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    private void chuangjianXiaoxiPPW() {
        xiaoxiPPw = new ChanpinMoxingPPWindows(getActivity());

        LayoutInflater popInflater = (LayoutInflater) (getActivity()).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_xinxi_mgs, null);
        RecyclerView popMessageRv = popupView.findViewById(R.id.popMessageRv);

        List<String> strings = new ArrayList<>();
        strings.add("");
        strings.add("");
        strings.add("");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        popMessageRv.setLayoutManager(linearLayoutManager);
        XioaxiLiebShipei xioaxiLiebShipei = new XioaxiLiebShipei(strings);
        popMessageRv.setAdapter(xioaxiLiebShipei);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.lylt_misjidjdd));
        popMessageRv.addItemDecoration(dividerItemDecoration);

        xiaoxiPPw.chushihuaPPW(popupView, false, (int) (huoquPingmuKuandu(getActivity()) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT);
    }


    //界面控件
    private Banner lunzhuantu_djfsljaf_fjfjTjjt233;
    //轮播图的数据
    private LunzhuanImgLoader lunzhuanImgData;
    private ArrayList<HuiqianModel.RoughNaturalProDTO> lunzhuanTuList;

    public void qingqiuJiekouLunzhuanImg() {
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
                    List<HuiqianModel.RoughNaturalProDTO> huidiaoBean = response.getRoughNaturalPro();
                    lunzhuanImgData = new LunzhuanImgLoader();
                    //将轮播的图片放在photos 那里
                    lunzhuanTuList = new ArrayList<HuiqianModel.RoughNaturalProDTO>();
                    lunzhuanTuList.addAll(huidiaoBean);
                    chusihuaPageview();
                    if (huidiaoBean.size() == 0) {
                        lunzhuantu_djfsljaf_fjfjTjjt233.setVisibility(View.GONE);
                    } else {
                        lunzhuantu_djfsljaf_fjfjTjjt233.setVisibility(View.VISIBLE);
                    }
                } else {
//                    Toast.makeText(getActivity(), response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
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

    //界面初始化
    private void chusihuaPageview() {
        //设置轮播的样式
        lunzhuantu_djfsljaf_fjfjTjjt233.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);  //CIRCLE_INDICATOR
        //设置图片加载器
        lunzhuantu_djfsljaf_fjfjTjjt233.setImageLoader(lunzhuanImgData);
        //设置轮播的动画效果,里面有很多种特效,可以都看看效果。
        lunzhuantu_djfsljaf_fjfjTjjt233.setBannerAnimation(Transformer.ZoomOutSlide);
        //设置轮播间隔时间
        lunzhuantu_djfsljaf_fjfjTjjt233.setDelayTime(3000);
        //设置是否为自动轮播，默认是true
        lunzhuantu_djfsljaf_fjfjTjjt233.isAutoPlay(true);
        //设置指示器的位置，小点点，居中显示
        lunzhuantu_djfsljaf_fjfjTjjt233.setIndicatorGravity(BannerConfig.CENTER);
        //设置图片加载地址
        lunzhuantu_djfsljaf_fjfjTjjt233.setImages(lunzhuanTuList)
                //开始调用的方法，启动轮播图。
                .start();
    }

    public static class LunzhuanImgLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            HuiqianModel.RoughNaturalProDTO bendann = (HuiqianModel.RoughNaturalProDTO) path;

            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            RequestOptions opttptt = new RequestOptions().bitmapTransform(new RoundedCorners(10));//图

            if (!TextUtils.isEmpty(bendann.getUnimportantQuickManyComma()))
                Glide.with(context.getApplicationContext())
                        .load(bendann.getUnimportantQuickManyComma())
                        .apply(opttptt)
                        .into(imageView);
        }
    }


    public void setData(Context context, PersonShenfenZhaoModel.FanhuiDataModel huidiaobean) {
        if (!TextUtils.isEmpty(huidiaobean.variousRacialHeadline)) {
            //头像
            Glide.with(impZhuyaoActivity).asBitmap()
                    .load(huidiaobean.variousRacialHeadline)
                    .apply(qingqiuOpt)
                    .into(toutou_fjkf_img_Tfjsf);
        } else {
            //头像
            Glide.with(impZhuyaoActivity).asBitmap()
                    .load(R.mipmap.useimg_desklogo)
                    .apply(qingqiuOpt)
                    .into(toutou_fjkf_img_Tfjsf);
        }
    }

}
