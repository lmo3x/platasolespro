package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HetongModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.XuanQianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.FenqiShisuanModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DingWeiSinglebangzhuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.FenqijihuaListAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.ShangpinRiqiShipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DaijieChujisuanModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ShangpinGoodHaModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.ShangpinXuanqianiShipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.PppQxPanduaner;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.SanfangRxppp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.APPMINGZI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.QUEDINGJIEKUANDINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINEYEFANHUI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINEYEJIAZAIWAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINEYETIJIAO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUJINEYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUQUERENYE;
//import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_BRH_4;
//import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_BRH_4;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FB_4;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FIB_4;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FLYER_4;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.XIUGAIJINE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.XIUGAIQIXIAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.ZHUCHANPINSHOUDAIOKNEW;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ShangpinActivity extends MyJichuBsActivity implements View.OnClickListener {

    private TextView adsf_b354GJ_jgwwe3,jiendnisoj_Valuesf_999;
    private TextView jiendnisoj_Valuesf_111, jiendnisoj_Valuesf_222, jiendnisoj_Valuesf_333, jiendnisoj_Valuesf_444, jglasjT_DO_djjfd, gfajlfjasfljasf, awesgP_12648_dgjafl, hgefasghfgdafsd, thgfa_djgosfa_sfjnvvv, adsf_bdOGJ_jg23, htgrfdaffqqqqq, adsf_begfdGJ_jg23;
    private ImageView hgfasgBAKCKC, jyhyjhtgrtthg;
    private RecyclerView hr76ef_jg2323Rs_fv23;
    private LinearLayout jiendnisoj_sjfasf_zong;
    private View beijdign_jdo_dgjTdfj, beijdign_jdo_dgjTdfj1, ry_sjflj_shitu1, ry_sjflj_shitu2, ry_sjflj_shitu3;
    private RelativeLayout afsaj_jfzhuce_lofjoisj, asjuyhtgr, hrgef_jgRRs_fFCfijs223, ashgfsadsfhga2dfh, jiendnisoj_sjfasf_111, jiendnisoj_sjfasf_222, jiendnisoj_sjfasf_333, jiendnisoj_sjfasf_444;
    private LinearLayout jiendnisoj_sjfasf_666, jiendnisoj_RRLLasf_222;
    private TextView fjgofiajf;
    private ChanpinMoxingPPWindows chanpinMoxingPPWindows;
    private ChanpinMoxingPPWindows shangpinRiqiPPW;
    private ChanpinMoxingPPWindows shangpinChenggongPPW;//还款成功弹框
    private ChanpinMoxingPPWindows shangpinQianListPPW;

    private ShangpinRiqiShipei shangpinRiqiShipei;
    private ShangpinXuanqianiShipei shipeiqian;

    //当前选中金额
    private double bothCockVillager = 0.0;
    //商品总id
    private int communistTibetAloneYesterdayFirmNoodle = 0;
    //贷款产品id
    private int tastelessLuggageBasement = -999;
    //记录日期修正
    private long averageEmbassyNationalVictoryDepth = 0;

    private ArrayList<XuanQianModel> popupMoneyList;
    private ArrayList<XuanQianModel> qianbaList;
    private ArrayList<XuanQianModel> qianbaListInit;
    private XuanQianModel currentselect;
    private int currentPosition = 0;
    private int oldPosition = 0;
    private RecyclerView xuanqianlist;
    private TextView hgdasdhfjhgyyyy;


    //显隐更多金额
    private TextView showmoreorhide;
    private TextView showmoreorhide2;

    private TextView jingojian1dibuxieyi;

    private TextView yemianappmingzi;
    private boolean alreadyclickdate = false;

    private String duochanpinappmingzi = "";

    private SanfangRxppp sanfangRxppp;

    private boolean isOkdaikuan = false;

    //是否是显示前八 是 true  不是 false  (默认是false 以免上来点击前八个 就会删除第一个）
    private boolean isqianbaorallList = true;

    private CountDownTimer daojishitime;
    private TextView wenan3;

    // 真分期
    private TextView jojoetwesqian_tv;
    private int personalReligiousPill = 0;
    private List<FenqiShisuanModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO> fenqiList;
    private FenqijihuaListAdapter fenqijihuashipei;
    private RecyclerView zhenfenqijihualiebiaoRV50;
    private double zuixiaohuankuanqian = 0;
    private double toastqian = 0;

    // 合同
    private LinearLayout hetong_layout,fenqiPlanLayout,detailLyaout;
    private CheckBox checkbox;
    private TextView daikuanhetong;
    private TextView readDataTopText;
    private TextView fenqiPlanBiaot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_xuancxxh);

        duochanpinappmingzi = BendiHuancunTols.huoQuZifuchuan(this, APPMINGZI);

        //动态设置状态栏高度
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        layoutParams.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(layoutParams);

        popupMoneyList = new ArrayList<>();
        qianbaList = new ArrayList<>();
        qianbaListInit = new ArrayList<>();


        yemianappmingzi = findViewById(R.id.yemianappmingzi);
        if (!TextUtils.isEmpty(duochanpinappmingzi)) {
            yemianappmingzi.setText(duochanpinappmingzi);
        }


        hgfasgBAKCKC = findViewById(R.id.hgfasgBAKCKC);
        jglasjT_DO_djjfd = findViewById(R.id.jglasjT_DO_djjfd);
        gfajlfjasfljasf = findViewById(R.id.gfajlfjasfljasf);
        awesgP_12648_dgjafl = findViewById(R.id.awesgP_12648_dgjafl);
        thgfa_djgosfa_sfjnvvv = findViewById(R.id.thgfa_djgosfa_sfjnvvv);
        hgefasghfgdafsd = findViewById(R.id.hgefasghfgdafsd);
        htgrfdaffqqqqq = findViewById(R.id.htgrfdaffqqqqq);
        adsf_bdOGJ_jg23 = findViewById(R.id.adsf_bdOGJ_jg23);
        adsf_b354GJ_jgwwe3 = findViewById(R.id.adsf_b354GJ_jgwwe3);

        fjgofiajf = findViewById(R.id.fjgofiajf);
        asjuyhtgr = findViewById(R.id.asjuyhtgr);
        hrgef_jgRRs_fFCfijs223 = findViewById(R.id.hrgef_jgRRs_fFCfijs223);
        hr76ef_jg2323Rs_fv23 = findViewById(R.id.hr76ef_jg2323Rs_fv23);
        jiendnisoj_sjfasf_zong = findViewById(R.id.jiendnisoj_sjfasf_zong);
        jiendnisoj_sjfasf_111 = findViewById(R.id.jiendnisoj_sjfasf_111);
        jiendnisoj_sjfasf_222 = findViewById(R.id.jiendnisoj_sjfasf_222);
        jiendnisoj_sjfasf_333 = findViewById(R.id.jiendnisoj_sjfasf_333);
        jiendnisoj_sjfasf_444 = findViewById(R.id.jiendnisoj_sjfasf_444);
        jiendnisoj_sjfasf_666 = findViewById(R.id.jiendnisoj_sjfasf_666);
        jiendnisoj_RRLLasf_222 = findViewById(R.id.jiendnisoj_RRLLasf_222);
        jiendnisoj_Valuesf_999 = findViewById(R.id.jiendnisoj_Valuesf_999);


        jiendnisoj_Valuesf_111 = findViewById(R.id.jiendnisoj_Valuesf_111);
        jiendnisoj_Valuesf_222 = findViewById(R.id.jiendnisoj_Valuesf_222);
        jiendnisoj_Valuesf_333 = findViewById(R.id.jiendnisoj_Valuesf_333);
        jiendnisoj_Valuesf_444 = findViewById(R.id.jiendnisoj_Valuesf_444);

        ashgfsadsfhga2dfh = findViewById(R.id.ashgfsadsfhga2dfh);
        jyhyjhtgrtthg = findViewById(R.id.jyhyjhtgrtthg);

        xuanqianlist = findViewById(R.id.xuanqianlist);
        showmoreorhide = findViewById(R.id.showmoreorhide);
        showmoreorhide2 = findViewById(R.id.showmoreorhide2);

        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);

        wenan3 = findViewById(R.id.wenan3);

        zhenfenqijihualiebiaoRV50 = findViewById(R.id.hr76ef_jg2323Rs_fv50);
        jojoetwesqian_tv = findViewById(R.id.jojoetwesqian_tv);
        hetong_layout = findViewById(R.id.hetong_layout);
        checkbox = findViewById(R.id.checkbox);
        daikuanhetong = findViewById(R.id.daikuanhetong);
        readDataTopText = findViewById(R.id.readDataTopText);
        fenqiPlanLayout = findViewById(R.id.fenqiPlanLayout);
        detailLyaout = findViewById(R.id.detailLyaout);
        fenqiPlanBiaot = findViewById(R.id.fenqiPlanBiaot);

        qingqiuJiekou1();


        jingojian1dibuxieyi.setOnClickListener(this);
        showmoreorhide.setOnClickListener(this);
        showmoreorhide2.setOnClickListener(this);
        hgfasgBAKCKC.setOnClickListener(this);
        fjgofiajf.setOnClickListener(this);
        asjuyhtgr.setOnClickListener(this);
        hrgef_jgRRs_fFCfijs223.setOnClickListener(this);
        ashgfsadsfhga2dfh.setOnClickListener(this);
        jyhyjhtgrtthg.setOnClickListener(this);


        chaungshihuaSHijianPPW();
        chushihuaChenggongPPw();

        jiazaizhongWindows.setCanceledOnTouchOutside(false);


        sanfangRxppp = new SanfangRxppp(this);
        //获取定位权限 如果有获取定位
        jianchaBIGjjsensonQQQppp();

        //进入页面埋点
        YincangShijianClickTols.QingqiuMaidian(JINRUJINEYE);

        initBackWindow();

        daojishitime = new CountDownTimer(601 * 1000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {

                String fenzhongshu = zhuanchengFenzhong(millisUntilFinished / 1000);
                wenan3.setText(fenzhongshu);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }


    //请求定位权限
    private void jianchaBIGjjsensonQQQppp() {
        sanfangRxppp.qingQiu(Manifest.permission.ACCESS_COARSE_LOCATION)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Boolean aBoolean) {
                        try {
                            if (!aBoolean) {
                                if (new PppQxPanduaner(MyJichuAplica.getInstance()).checkShaoPppp(
//
                                        Manifest.permission.ACCESS_COARSE_LOCATION
                                )) {
                                    Log.d("requestLocation---->>>", "权限被拒绝");
                                    if (!shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_COARSE_LOCATION)) {

                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝了 而且点击了不在提示（始终禁止） 所以 需要判断出来 有必要的话 需要用代码跳转到设置页面");
                                    } else {

                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝");
                                    }
                                } else {
                                    Log.d("requestLocation---->>>", "权限被通过");
                                    //所有权限都已经授权

                                    //获取位置信息
//                                  DingWeizhiTols.getWeizhiDingwei(AOpenStarActivity.this);

                                    try {
                                        YincangShijianClickTols.QingqiuMaidian(QUEDINGJIEKUANDINGWEI);
                                        DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(ShangpinActivity.this);
                                        ll.kaiqiDingwGongneng();
                                    } catch (Exception e) {

                                    }

                                }

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                try {
                                    YincangShijianClickTols.QingqiuMaidian(QUEDINGJIEKUANDINGWEI);
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(ShangpinActivity.this);
                                    ll.kaiqiDingwGongneng();
                                } catch (Exception e) {

                                }
                            }
                        } catch (Exception e) {
                        }


                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void onClick(View view) {
        if (DianjiQuickTols.clickkuaikuai()) {
            return;
        }
        if (!WngluoTols.youWangluoFou(ShangpinActivity.this)) {
            baseaNonet.showPPw(Gravity.CENTER);
            return;
        }
        Intent intent;
        switch (view.getId()) {
            case R.id.hgfasgBAKCKC:
                YincangShijianClickTols.QingqiuMaidian(JINEYEFANHUI);
                if (!isOkdaikuan) {
                    huilaibaPPw.showPPw(Gravity.CENTER);
                }
                break;
            case R.id.fjgofiajf:
                //埋点，点击日期页确认按钮
                YincangShijianClickTols.QingqiuMaidian(JINEYETIJIAO);
                //埋点 ，进入确认页弹框
                YincangShijianClickTols.QingqiuMaidian(JINRUQUERENYE);

                if (alreadyclickdate) {

                    if (hetong_layout.getVisibility() == View.VISIBLE) {
                        if (!checkbox.isChecked()) {
                            ToastUtil.showShortToast("Primero marque el acuerdo");
                            return;
                        }
                    }
                    qingqiuJiekou5();

                } else {
//                        Toast.makeText(this, getString(R.string.noselectdateflag), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(getString(R.string.noselectdateflag));
                }

                break;
//            case R.id.ashgfsadsfhga2dfh:
//                shangpinQianListPPW.showPPw();
//                break;

            case R.id.jyhyjhtgrtthg:
                XieyiShowTols.quH5KefuPage(ShangpinActivity.this, "10");
//                intent = new Intent(this, DadianhuaGeiWomenActivity.class);
//                startActivity(intent);
                break;
            case R.id.jingojian1dibuxieyi://跳转隐私协议
                if (!WngluoTols.youWangluoFou(ShangpinActivity.this)) {
                    baseaNonet.showPPw(Gravity.CENTER);
                    return;
                }
                XieyiShowTols.quH5YinsiPage(ShangpinActivity.this);
                break;

            //显示多
            case R.id.showmoreorhide:

                isqianbaorallList = false;
                showmoreorhide.setVisibility(View.GONE);
                showmoreorhide2.setVisibility(View.VISIBLE);

                if (currentPosition > 7) {
//                    shipeiqian.setPosition(currentPosition);
                    Collections.swap(qianbaList, 2, 4);
                    Collections.swap(qianbaList, 3, 4);
                    qianbaList.remove(0);
                    qianbaList.add(7, popupMoneyList.get(7));

                }
                shipeiqian.setNewData(popupMoneyList);
                break;
            // 隐藏
            case R.id.showmoreorhide2:

                isqianbaorallList = true;

                showmoreorhide.setVisibility(View.VISIBLE);
                showmoreorhide2.setVisibility(View.GONE);
                if (currentPosition > 7) {

                    oldPosition = currentPosition;

                    qianbaList.add(0, currentselect);
                    qianbaList.remove(8);
                    Collections.swap(qianbaList, 2, 3);
                    Collections.swap(qianbaList, 3, 4);

                    for (int i = 0; i < qianbaList.size(); i++) {
                        qianbaList.get(i).setIschecked(false);
                    }
                    qianbaList.get(0).setIschecked(true);
                } else {
                    qianbaList.get(currentPosition).setIschecked(true);
                }
                shipeiqian.setNewData(qianbaList);
                break;
        }
    }

    //挽留
    private ChanpinMoxingPPWindows huilaibaPPw;
    private TextView newtipsneineirongrong;

    //挽留弹框初始化
    private void initBackWindow() {
        huilaibaPPw = new ChanpinMoxingPPWindows(this);

        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_info_wanliu1, null);
        newtipsneineirongrong = popupView.findViewById(R.id.newtipsneineirongrong);
        newtipsneineirongrong.setText(getString(R.string.newtankuang_quejietishi));
        popupView.findViewById(R.id.newtipsisisi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                huilaibaPPw.xiaohuiPPw();
                finish();
            }
        });
        popupView.findViewById(R.id.newtipsnonono).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                huilaibaPPw.xiaohuiPPw();
            }
        });

        huilaibaPPw.chushihuaPPW(popupView, false
                , (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);
    }

    ShangpinGoodHaModel.FanhuiBeanData wanchenBean;

    private void qingqiuJiekou1() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_SHANGPIN, ShangpinGoodHaModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ShangpinGoodHaModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(ShangpinActivity.this, BendiHuancunTols.YONGHU_ID));
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
            public void onSuccess(ShangpinGoodHaModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                //数据加载完成
                YincangShijianClickTols.QingqiuMaidian(JINEYEJIAZAIWAN);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    wanchenBean = response.getRoughNaturalPro();
                    if (wanchenBean != null && wanchenBean.getRedChair() != null && wanchenBean.getRedChair().size() > 0) {

                        //商品总id
                        communistTibetAloneYesterdayFirmNoodle = wanchenBean.getPrimaryAirThereFamousFreedom();

                        chushihuaDataList(wanchenBean);//日期列表
                        //设置金额
                        if (wanchenBean.getRedChair().size() > 0) {
                            shauxinShangmianjINE(wanchenBean.getRedChair().get(0),wanchenBean.getRedChair().size() == 1);
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
                    baseaNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private void shauxinShangmianqian(ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean chanpinBean) {

        if(chanpinBean.carefulDifferentChiefMeal>1){
            readDataTopText.setText(getString(R.string.shangpins_foryo_fec10));
        }else {
            readDataTopText.setText(getString(R.string.shangpins_foryo_fec10_2));
        }

        qianbaList = new ArrayList<>();
        //xuanqianlist
        //当前选中金额
        bothCockVillager = chanpinBean.eachThemeSecondSalesman;
        //贷款产品id
        tastelessLuggageBasement = chanpinBean.tastelessLuggageBasement;

        //顶部显示已选金额
        adsf_b354GJ_jgwwe3.setText(HuobigeshiTols.FormatNumber(bothCockVillager));//最da金额

        //设置金额颜色
        int HGRFHGG = (int) ((chanpinBean.eachThemeSecondSalesman - chanpinBean.bothCockVillager) / chanpinBean.conceitedPostmanBoundMinisterSunnyPronunciation);

        popupMoneyList.clear();

        for (int i = 0; i < HGRFHGG + 2; i++) {
            XuanQianModel xuanQianModel = new XuanQianModel();
            xuanQianModel.setQianshu(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form6), (chanpinBean.bothCockVillager + chanpinBean.conceitedPostmanBoundMinisterSunnyPronunciation * i)));
            if ((chanpinBean.bothCockVillager + chanpinBean.conceitedPostmanBoundMinisterSunnyPronunciation * i) >= chanpinBean.eachThemeSecondSalesman) {
                xuanQianModel.setQianshu(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form6), chanpinBean.eachThemeSecondSalesman));
            }
            xuanQianModel.setIschecked(false);
            xuanQianModel.setIslock(false);

            popupMoneyList.add(xuanQianModel);
            if ((chanpinBean.bothCockVillager + chanpinBean.conceitedPostmanBoundMinisterSunnyPronunciation * i) >= chanpinBean.eachThemeSecondSalesman) {
                break;
            }
        }
        Collections.reverse(popupMoneyList);

        popupMoneyList.get(0).setIschecked(true);

        if (popupMoneyList.size() > 8) {
            showmoreorhide.setVisibility(View.VISIBLE);
            showmoreorhide2.setVisibility(View.GONE);

            for (int i = 0; i < 8; i++) {
                XuanQianModel xunqian = new XuanQianModel();
                xunqian.setQianshu(popupMoneyList.get(i).getQianshu());
                xunqian.setIschecked(popupMoneyList.get(i).isIschecked());
                xunqian.setIslock(popupMoneyList.get(i).isIslock());
                qianbaList.add(xunqian);
                qianbaList.get(0).setIschecked(true);
            }
        } else {
            showmoreorhide.setVisibility(View.GONE);
            showmoreorhide2.setVisibility(View.GONE);
            qianbaList = popupMoneyList;
        }

        qianbaListInit = qianbaList;

        jiendnisoj_Valuesf_444.setText(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form3), HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(bothCockVillager + ""))));

        shipeiqian.setNewData(qianbaList);
    }

    //刷新顶部金额UI
    private void shauxinShangmianjINE(ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean chanpinBean, boolean isShiJiSuan) {

        //xuanqianlist
        //当前选中金额
        bothCockVillager = chanpinBean.eachThemeSecondSalesman;
        if(isShiJiSuan){
            //贷款产品id
            tastelessLuggageBasement = chanpinBean.tastelessLuggageBasement;
        }


        //顶部显示已选金额
        adsf_b354GJ_jgwwe3.setText(HuobigeshiTols.FormatNumber(bothCockVillager));//最da金额

        //设置金额颜色
        int HGRFHGG = (int) ((chanpinBean.eachThemeSecondSalesman - chanpinBean.bothCockVillager) / chanpinBean.conceitedPostmanBoundMinisterSunnyPronunciation);

        popupMoneyList.clear();

        for (int i = 0; i < HGRFHGG + 2; i++) {
            XuanQianModel xuanQianModel = new XuanQianModel();
            xuanQianModel.setQianshu(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form6), (chanpinBean.bothCockVillager + chanpinBean.conceitedPostmanBoundMinisterSunnyPronunciation * i)));
            if ((chanpinBean.bothCockVillager + chanpinBean.conceitedPostmanBoundMinisterSunnyPronunciation * i) >= chanpinBean.eachThemeSecondSalesman) {
                xuanQianModel.setQianshu(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form6), chanpinBean.eachThemeSecondSalesman));
            }
            xuanQianModel.setIschecked(false);
            xuanQianModel.setIslock(false);

            popupMoneyList.add(xuanQianModel);
            if ((chanpinBean.bothCockVillager + chanpinBean.conceitedPostmanBoundMinisterSunnyPronunciation * i) >= chanpinBean.eachThemeSecondSalesman) {
                break;
            }
        }
        Collections.reverse(popupMoneyList);

        popupMoneyList.get(0).setIschecked(true);

        if (popupMoneyList.size() > 8) {
            showmoreorhide.setVisibility(View.VISIBLE);
            for (int i = 0; i < 8; i++) {
                XuanQianModel xunqian = new XuanQianModel();
                xunqian.setQianshu(popupMoneyList.get(i).getQianshu());
                xunqian.setIschecked(popupMoneyList.get(i).isIschecked());
                xunqian.setIslock(popupMoneyList.get(i).isIslock());
                qianbaList.add(xunqian);
                qianbaList.get(0).setIschecked(true);
            }
        } else {
            showmoreorhide.setVisibility(View.GONE);
            qianbaList = popupMoneyList;
        }

        qianbaListInit = qianbaList;


        jiendnisoj_Valuesf_444.setText(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form3), HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(bothCockVillager + ""))));

        if(isShiJiSuan){
            //获取贷款信息
            qingqiuJiekou3();
            //埋点选择日期
            YincangShijianClickTols.QingqiuMaidian(XIUGAIQIXIAN);
        }

        //埋点：修改金额
        YincangShijianClickTols.QingqiuMaidian(XIUGAIJINE);

        GridLayoutManager bujuguanli1 = new GridLayoutManager(this, 4);
        xuanqianlist.setLayoutManager(bujuguanli1);
        shipeiqian = new ShangpinXuanqianiShipei(qianbaList);
        xuanqianlist.setAdapter(shipeiqian);

        shipeiqian.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

                currentselect = (XuanQianModel) adapter.getData().get(position);
                currentPosition = position;
                if (!currentselect.isIslock()) {

                    if (isqianbaorallList && oldPosition > 7) {
                        oldPosition = currentPosition;
                        //选择金额置顶后 收起金额之后，又选择了其他金额
                        if (!currentselect.getQianshu().equals(qianbaList.get(0).getQianshu())
                                && !qianbaList.get(0).getQianshu().equals(popupMoneyList.get(0).getQianshu())) {
                            Collections.swap(qianbaList, 2, 4);
                            Collections.swap(qianbaList, 3, 4);
                            qianbaList.remove(0);
                            qianbaList.add(7, popupMoneyList.get(7));
                            currentPosition = currentPosition - 1;
                            isqianbaorallList = false;
                        }
                    }

                    bothCockVillager = Double.parseDouble(currentselect.getQianshu());
                    qianbaList = qianbaListInit;

                    //先遍历前八list 清空所有选择
                    for (int i = 0; i < qianbaList.size(); i++) {
                        qianbaList.get(i).setIschecked(false);
                    }
                    //再遍历总list 清空所有选择
                    for (int i = 0; i < popupMoneyList.size(); i++) {
                        popupMoneyList.get(i).setIschecked(false);
                    }

                    currentselect.setIschecked(true);
                    if (currentPosition < 8) {
                        for (int i = 0; i < qianbaList.size() - 1; i++) {
                            if (qianbaList.get(i).getQianshu().equals(currentselect.getQianshu())) {
                                qianbaList.get(i).setIschecked(true);
                            }
                        }
//                        qianbaList.get(currentPosition).setIschecked(true);
                    }

                    //所有数据的list 不需要是不是前八判断
                    for (int i = 0; i < popupMoneyList.size() - 1; i++) {
                        if (popupMoneyList.get(i).getQianshu().equals(currentselect.getQianshu())) {
                            popupMoneyList.get(i).setIschecked(true);
                        }
                    }
//                    popupMoneyList.get(currentPosition).setIschecked(true);

                    adapter.notifyDataSetChanged();

                    //埋点：修改金额
                    YincangShijianClickTols.QingqiuMaidian(XIUGAIJINE);
                    //顶部显示已选金额
//                    DecimalFormat df = new DecimalFormat("0.##");
//                    String s = df.format(bothCockVillager);
                    adsf_b354GJ_jgwwe3.setText(HuobigeshiTols.FormatNumber(bothCockVillager));
                    jiendnisoj_Valuesf_444.setText(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), bothCockVillager));
                    //获取贷款信息
                    if (alreadyclickdate) {
                        qingqiuJiekou3();
                    }


                } else {
                    shangpinRiqiPPW.showPPw(Gravity.CENTER);
                }
            }
        });

        //获取贷款合同列表
        qingqiuJiekou6();
    }

    /**
     * 获取贷款合同
     */
    private void qingqiuJiekou6() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HUOQUDAIKUANHETONG, HetongModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<HetongModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                 map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(ShangpinActivity.this, BendiHuancunTols.YONGHU_ID));
                map.put("tastelessLuggageBasement", String.valueOf(tastelessLuggageBasement));//detailId
                map.put("funnySoldierNewBoot", String.valueOf(bothCockVillager));//applyAmount
                map.put("skilledSoutheastQuickAntarcticNationality", "1");//orderType
            }

            @Override
            public void onSuccess(HetongModel response) {
                jiazaizhongWindows.dismiss();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    if (response.getBigAncientTastyHeadteacher() != null && response.getBigAncientTastyHeadteacher().size() > 0) {
                        List<HetongModel.BigAncientTastyHeadteacherDTO> list = response.getBigAncientTastyHeadteacher();
                        hetong_layout.setVisibility(View.VISIBLE);
                        daikuanhetong.setText(" <" + list.get(0).getForeignReceiverRussianSunshineCurrency() + "> ");
                        daikuanhetong.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String url = list.get(0).getNeitherMondayHammerCentury();
                                if (!TextUtils.isEmpty(url)) {
                                    Intent webtEND = new Intent(ShangpinActivity.this, WangyeHelperActivity.class);
                                    webtEND.putExtra("webViewUrl", url);
                                    webtEND.putExtra("showtype", list.get(0).getForeignReceiverRussianSunshineCurrency());
                                    startActivity(webtEND);
                                }
                            }
                        });

                    }
                } else {
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

    private void qingqiuJiekou3() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_COUNTTRAIL, FenqiShisuanModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<FenqiShisuanModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(ShangpinActivity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("communistTibetAloneYesterdayFirmNoodle", String.valueOf(communistTibetAloneYesterdayFirmNoodle));//商品总id
                map.put("tastelessLuggageBasement", String.valueOf(tastelessLuggageBasement));//贷款产品id
                map.put("funnySoldierNewBoot", String.valueOf(bothCockVillager));//当前选中金额
            }

            @Override
            public void onSuccess(FenqiShisuanModel response) {
                jiazaizhongWindows.dismiss();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    if (response.getBigAncientTastyHeadteacher() != null) {
                        fenqiPlanLayout.setVisibility(View.VISIBLE);
                        detailLyaout.setVisibility(View.VISIBLE);

                        alreadyclickdate = true;
                        fjgofiajf.setBackgroundResource(R.drawable.bj_thgsdthgsfew);

                        FenqiShisuanModel.BigAncientTastyHeadteacherDTO caradjoBean = response.getBigAncientTastyHeadteacher();

                        personalReligiousPill = caradjoBean.getPersonalReligiousPill();

                        if (caradjoBean.getHonestHelpfulSteamInlandSummary().size() > 0) {
                            fenqiList = caradjoBean.getHonestHelpfulSteamInlandSummary();
                            fenqijihuashipei = new FenqijihuaListAdapter(ShangpinActivity.this, fenqiList);
                            fenqijihuashipei.setPersonalReligiousPill(caradjoBean.getPersonalReligiousPill());
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ShangpinActivity.this);
                            zhenfenqijihualiebiaoRV50.setLayoutManager(linearLayoutManager);
                            zhenfenqijihualiebiaoRV50.setAdapter(fenqijihuashipei);

                            //同步更新贷款成功弹框列表
                            fenqiList51 = caradjoBean.getHonestHelpfulSteamInlandSummary();
                            fenqijihuashipei51 = new FenqijihuaListAdapter(ShangpinActivity.this, fenqiList51);
                            fenqijihuashipei51.setPersonalReligiousPill(caradjoBean.getPersonalReligiousPill());
                            linearLayoutManager = new LinearLayoutManager(ShangpinActivity.this);
                            zhenfenqijihualiebiaoRV51.setLayoutManager(linearLayoutManager);
                            zhenfenqijihualiebiaoRV51.setAdapter(fenqijihuashipei51);

                            double minRepayAmount = 0;
                            for (FenqiShisuanModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO honestHelpfulSteamInlandSummaryDTO : caradjoBean.getHonestHelpfulSteamInlandSummary()) {
                                double repayAmount = honestHelpfulSteamInlandSummaryDTO.getAncientDueInterpreter();
                                if (repayAmount < minRepayAmount || minRepayAmount == 0) {
                                    minRepayAmount = repayAmount;
                                }
                            }
                            zuixiaohuankuanqian = minRepayAmount;
                            toastqian = minRepayAmount * 0.8;
                            if(caradjoBean.getHonestHelpfulSteamInlandSummary().size()>1){
                                jojoetwesqian_tv.setVisibility(View.VISIBLE);
                                jojoetwesqian_tv.setText("El pago mínimo es " + HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), zuixiaohuankuanqian)) + " cada cuota");
                                fenqiPlanBiaot.setText(getString(R.string.shangpins_foryo_plan));
                            }else {
                                jojoetwesqian_tv.setVisibility(View.GONE);
                                fenqiPlanBiaot.setText(getString(R.string.shangpins_foryo_plan_2));
                            }

                        }

                        jiendnisoj_Valuesf_111.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), caradjoBean.getLiquidInvention())));//到手金额
                        jiendnisoj_Valuesf_222.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), caradjoBean.getElectricEveryAutumn())));//利息
                        jiendnisoj_Valuesf_333.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), caradjoBean.getExtraordinaryGentlemanArt())));//服务费
                        awesgP_12648_dgjafl.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), caradjoBean.getBasicSickness())));//via
                        jiendnisoj_Valuesf_999.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), caradjoBean.getAllDisability())));//preAmount

                        jiendnisoj_sjfasf_666.setVisibility(View.GONE);
                        jiendnisoj_RRLLasf_222.setVisibility(View.GONE);
                        for (int i = 0; i < caradjoBean.getPainfulHardworkingCrossStomachache().size(); i++) {
                            if (i == 0) {
                                jiendnisoj_sjfasf_666.setVisibility(View.VISIBLE);
                                hgefasghfgdafsd.setText(caradjoBean.getPainfulHardworkingCrossStomachache().get(i).foreignReceiverRussianSunshineCurrency);
                                thgfa_djgosfa_sfjnvvv.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), caradjoBean.getPainfulHardworkingCrossStomachache().get(i).chineseTibetEmbassy)));
                            } else if (i == 1) {
                                jiendnisoj_RRLLasf_222.setVisibility(View.VISIBLE);
                                adsf_bdOGJ_jg23.setText(caradjoBean.getPainfulHardworkingCrossStomachache().get(i).foreignReceiverRussianSunshineCurrency);
                                htgrfdaffqqqqq.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), caradjoBean.getPainfulHardworkingCrossStomachache().get(i).chineseTibetEmbassy)));
                            }
                        }

                        daikuanvalue1.setText(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), bothCockVillager));//借款金额
                        daikuanvalue2.setText(HuobigeshiTols.FormatNumberWithXiaoshudian(String.format(Locale.ENGLISH, getString(R.string.geshizhuanyi_jsl_form), caradjoBean.getLiquidInvention())));//到手金额

                    }

                } else {
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


    //提交贷款信息
    private void qingqiuJiekou5() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_TIJIAODAIKUANXINXI, DaijieChujisuanModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<DaijieChujisuanModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(ShangpinActivity.this, BendiHuancunTols.YONGHU_ID));
                Log.d("lbsfunc1", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU) + "," + BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU));
                Log.d("lbsfunc2", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU) + "," + BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU));

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
                map.put("communistTibetAloneYesterdayFirmNoodle", String.valueOf(communistTibetAloneYesterdayFirmNoodle));//商品总id
                map.put("tastelessLuggageBasement", String.valueOf(tastelessLuggageBasement));//贷款产品id
                map.put("funnySoldierNewBoot", String.valueOf(bothCockVillager));//当前选中金额
            }

            @Override
            public void onSuccess(DaijieChujisuanModel response) {
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    isOkdaikuan = true;
                    if(response.getRoughNaturalPro()!=null){
                        String toothbrush = response.getRoughNaturalPro().getFreshHousewifeSuspectImportantToothbrush();
                        if("1".equals(toothbrush)){
                            YincangShijianClickTols.LianshuMaidian(THREECOMPANY_FB_4);
                            YincangShijianClickTols.HuojiMaidian(THREECOMPANY_FIB_4);
                            YincangShijianClickTols.FlyMaidian(THREECOMPANY_FLYER_4);
                            //贷款成功埋点
                            YincangShijianClickTols.QingqiuMaidian(ZHUCHANPINSHOUDAIOKNEW);
                        }
                    }
                    shangpinChenggongPPW.showPPw(Gravity.CENTER);
                    timer.schedule(task, 1000, 1000);

                    jiazaizhongWindows.hideKuangkuangIng();

                } else {
                    jiazaizhongWindows.hideKuangkuangIng();
                    ToastUtil.showShortToast(response.getnuclearTrialSpareMountainousBat());
                }


            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    List<ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean> shujuju;

    //初始化日期list
    private void chushihuaDataList(ShangpinGoodHaModel.FanhuiBeanData shitilei) {

        shujuju = new ArrayList<>(shitilei.getRedChair());
        int fenqishu = 0;
        int meiqitianshu = 0;
        for (int i = 0; i < shitilei.getRedChair().size(); i++) {
            ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean chanpinBean = shitilei.getRedChair().get(i);
            if (chanpinBean.carefulDifferentChiefMeal > fenqishu) {
                fenqishu = chanpinBean.carefulDifferentChiefMeal;
            }
            if (chanpinBean.commonUselessMinority > meiqitianshu) {
                meiqitianshu = chanpinBean.commonUselessMinority;
            }

        }
        if(shujuju.size()==1){
            shujuju.get(0).isSelect = true;  //默认选择第1个日期
            if(shujuju.get(0).carefulDifferentChiefMeal>1){
                readDataTopText.setText(getString(R.string.shangpins_foryo_fec10));
            }else {
                readDataTopText.setText(getString(R.string.shangpins_foryo_fec10_2));
            }
        }

        shujuju.add(new ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean(meiqitianshu, fenqishu + 1, true));
        shujuju.add(new ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean(meiqitianshu, fenqishu + 2, true));


        GridLayoutManager bujuguanli1 = new GridLayoutManager(this, 3);
        hr76ef_jg2323Rs_fv23.setLayoutManager(bujuguanli1);



        shangpinRiqiShipei = new ShangpinRiqiShipei(shujuju, shitilei.getTastyTheatre());
        hr76ef_jg2323Rs_fv23.setAdapter(shangpinRiqiShipei);

        shangpinRiqiShipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

                TextView currentdate = view.findViewById(R.id.jirm_tiaomu_ccxxTShiajin);
                Log.d("currentdate", currentdate.getText().toString());
                List<ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean> data = shangpinRiqiShipei.getData();
                for (int i = 0; i < data.size(); i++) {
                    data.get(i).isSelect = false;
                }
                if (!data.get(position).isAvailable) {

                    shauxinShangmianqian(data.get(position));

                    alreadyclickdate = true;

                    data.get(position).isSelect = true;
                    adapter.notifyDataSetChanged();

                    //贷款产品id
                    tastelessLuggageBasement = data.get(position).tastelessLuggageBasement;

                    //埋点选择日期
                    YincangShijianClickTols.QingqiuMaidian(XIUGAIQIXIAN);
                    //获取贷款信息
                    qingqiuJiekou3();
                } else {
//                    shangpinRiqiPPW.showPPw(Gravity.CENTER);
                    ToastUtil.showShortToast("Si pide préstamo de nuevo,puede pagar en más cuotas.Lo mínimo paga en S/" + HuobigeshiTols.FormatNumber(toastqian) + " cuotas.");
                }
            }
        });
    }


    private void chaungshihuaSHijianPPW() {
        shangpinRiqiPPW = new ChanpinMoxingPPWindows(this);

        LayoutInflater chaungInfter = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View chaungShitu = chaungInfter.inflate(R.layout.wndw_xuancxxh_chanpin_time, null);
        chaungShitu.findViewById(R.id.str_ya_veoTv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shangpinRiqiPPW.xiaohuiPPw();
            }
        });
        chaungShitu.findViewById(R.id.xuanzeriqiguanbi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shangpinRiqiPPW.xiaohuiPPw();
            }
        });

        shangpinRiqiPPW.chushihuaPPW(chaungShitu, false);
    }

    // 真分期
    private List<FenqiShisuanModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO> fenqiList51;
    private FenqijihuaListAdapter fenqijihuashipei51;
    private RecyclerView zhenfenqijihualiebiaoRV51;
    private TextView daikuanvalue1, daikuanvalue2;

    @SuppressLint("MissingInflatedId")
    private void chushihuaChenggongPPw() {
        shangpinChenggongPPW = new ChanpinMoxingPPWindows(this);
        LayoutInflater cahungInfltr = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View chaungShitu = cahungInfltr.inflate(R.layout.wndw_xuancxxh_chengok, null);
        hgdasdhfjhgyyyy = chaungShitu.findViewById(R.id.hgdasdhfjhgyyyy);
        daikuanvalue1 = chaungShitu.findViewById(R.id.daikuanvalue1);
        daikuanvalue2 = chaungShitu.findViewById(R.id.daikuanvalue2);
        zhenfenqijihualiebiaoRV51 = chaungShitu.findViewById(R.id.hr76ef_jg2323Rs_fv51);

        if (fenqiList != null && fenqiList.size() > 0) {
            fenqiList51 = new ArrayList<>();
            fenqiList51.addAll(fenqiList);
            fenqijihuashipei51 = new FenqijihuaListAdapter(ShangpinActivity.this, fenqiList51);
            fenqijihuashipei51.setPersonalReligiousPill(personalReligiousPill);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ShangpinActivity.this);
            zhenfenqijihualiebiaoRV51.setLayoutManager(linearLayoutManager);
            zhenfenqijihualiebiaoRV51.setAdapter(fenqijihuashipei51);
        }

        chaungShitu.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shangpinChenggongPPW != null) {
                    shangpinChenggongPPW.xiaohuiPPw();
                }
                shangpinChenggongPPW = null;
                shuliang = -1;
                finish();
                MyJichuAplica.getApplicaInstance().closeAlllistActivity();
                Log.d("daojishi", "finish");
            }
        });

        shangpinChenggongPPW.chushihuaPPW(chaungShitu, false
                , (int) (huoquPingmuKuandu(this) * 0.9), ViewGroup.LayoutParams.WRAP_CONTENT, null, false);
    }

    Timer timer = new Timer();
    private int shuliang = 10;
    TimerTask task = new TimerTask() {
        @Override
        public void run() {

            runOnUiThread(new Runnable() {      // UI thread
                @Override
                public void run() {
                    shuliang--;
                    hgdasdhfjhgyyyy.setText(String.format(Locale.ENGLISH, getString(R.string.jingogojian_xixicheck_000), shuliang));
                    if (shuliang <= 0) {
                        timer.cancel();
                        if (shangpinChenggongPPW != null) {
                            shangpinChenggongPPW.xiaohuiPPw();
                        }
                        shangpinChenggongPPW = null;
                        finish();
                        MyJichuAplica.getApplicaInstance().closeAlllistActivity();
                        Log.d("daojishi", "finish");
                    }
                }
            });
        }
    };


    //咱在写一个计算Welcome界面的广告时间结束后进入主界面的方法
    private int getShuliang() {
        shuliang--;
        if (shuliang == 0) {
            Intent intent = new Intent(this, ImpZhuyaoActivity.class);
            startActivity(intent);
            finish();
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

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //埋点 返回
            YincangShijianClickTols.QingqiuMaidian(JINEYEFANHUI);
            if (!isOkdaikuan) {
                huilaibaPPw.showPPw(Gravity.CENTER);
            }
            if (shangpinChenggongPPW != null && shangpinChenggongPPW.huoquPPwShowFou()) {
                return true;
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * 时间戳转化成时分秒显示
     */
    public String zhuanchengFenzhong(Long date) {
        String whfej = "";

        String wghge = "";
        String wjksjgfeh = "";
        long jh = date / (60 * 60 * 24);
        long ty = (date / (60 * 60) - jh * 24);
        long iop = ((date / 60) - jh * 24 * 60 - ty * 60);
        long poi = (date - jh * 24 * 60 * 60 - ty * 60 * 60 - iop * 60);

        if (iop < 10 && poi >= 10) {
            wghge = "0" + iop;
            wjksjgfeh = poi + "";
        }
        if (iop < 10 && poi < 10) {
            wghge = "0" + iop;
            wjksjgfeh = "0" + poi;
        }
        if (iop >= 10 && poi >= 10) {
            wghge = iop + "";
            wjksjgfeh = poi + "";
        }
        if (iop >= 10 && poi < 10) {
            wghge = iop + "";
            wjksjgfeh = "0" + poi;
        }

        whfej = wghge + ":" + wjksjgfeh;
        return whfej;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        daojishitime.cancel();
    }
}