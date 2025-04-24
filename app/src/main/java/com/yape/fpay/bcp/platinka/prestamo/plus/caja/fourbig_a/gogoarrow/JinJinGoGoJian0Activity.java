package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols.shebeiId;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.XITONG_YINSI_BASIC;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.FUWU_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.YINSI_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuGodu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing2;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.shezhiShujuActivity;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIGERENXINXIYEFANHUI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIGERENXINXIYETIJIAOEVETYTIME;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIGERENXINXIYETIJIAOFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHUJUZHUAQUJUJUE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHUJUZHUAQUTONGYI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIWENANYETIAOGUOBTN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIWENANYETONGYIBTN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.GERENXINXIYESHUJUJIAZAIWANCHENG;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JICHUDINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUGERENXINXIYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUGERENXINXIYEXINXIFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUWENANYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.KAISHISHANGCHAUNSHUJU;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.LIANXIRENDINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.NEWRISK_INTOINFOFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHUJUZHUAQUJIEGUO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHUJUZHUAQUSHOUQUANTONGGUOFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.WANCHENGSHANGCHUANSHUJU;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ShangChuanModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DingWeiSinglebangzhuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.GzipCompreTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuoquBigJsonUpShujuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.KeybordTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.QuanxianShipeiGuanliTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZifuchuanPinjieSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.AOpenStarActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.DadianhuaGeiWomenActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.ShuruZongXinxi1Shipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.ShuruZongXinxi3Shipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DizhiDiquModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ConfigDianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.SuoyouXinxiModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei.OKwangHttpyeZhan;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.PppQxPanduaner;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.SanfangRxppp;

import org.json.JSONObject;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import im.crisp.client.Crisp;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.NodrmalModel;

/**
 * 进件资料01-秘鲁专用
 */
public class JinJinGoGoJian0Activity extends MyJichuBsActivity implements View.OnClickListener {

    private ConstraintLayout zongBuju;
    private RelativeLayout duquNeirongBuju, duquDiyihangRl1;
    private ImageView jingojian1fanhui;
    private TextView jingojian1submit, jingojian1dibuxieyi;

    private EditText duquDiyihangTxt1;
    private EditText duquDiyihangTxt3, duquDiyihangTxt004, duquDiyihangTxt005;
    private TextView duquDiyihangTxt2;

    private ChanpinMoxingPPWindows chanpinMoxingPPWindows;
    private ChanpinMoxingPPWindows chanpinMoxingDiqu1PPWindows;
    private List<DizhiDiquModel.RoughNaturalProBean> ziranList;
    private List<DizhiDiquModel.RoughNaturalProBean> ziranListDiyiji;
    private ShuruZongXinxi3Shipei shuruZongXinxiDiquqitaShipei;
    private ShuruZongXinxi3Shipei shuruZongXinxiDiqu1Shipei;
    private ShuruZongXinxi1Shipei shuruZongXinxi1Shipei;

    private String zhongxinDengji;
    private StringBuffer dizhiSbf;
    private int morenSuoyin;
    private String dizhiBianma1;
    private String dizhiBianma2;
    private String dizhiBianma3;
    private String dizhiStr1;
    private String dizhiStr2;
    private String dizhiStr3;
    private RecyclerView jingaojian1rvList;
    private FrameLayout jingaojian1Framel;
    private NestedScrollView zongHuadongBuju;
    private ImageView jingojian1kefu;
//    private ImageView menutab_stupianf_one;

    private boolean isShuju = false;
    private boolean ruanjianPanIsShow = true;//是否弹软键盘

    private RelativeLayout jingaojian1dibtnbuju, duquDiyihangRl4, duquDiyihangRl5, duquDiyihangRl6;
    private ArrayList<String> stringArrayList1 = new ArrayList<>();
    private ArrayList<String> stringArrayList2 = new ArrayList<>();

    private boolean cacheDiqu1 = false;

    /**
     * 使用弱引用防止内存溢出
     */
    private WeakReference<Activity> currentactivity;

    // 主线程的Handler
    @SuppressLint("HandlerLeak")
    private Handler zhuxianCaozuo = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String chaunJiesen = "";
            if (msg.obj != null) {

                chaunJiesen = (String) msg.obj;
                chuanChuanShujuJson(chaunJiesen);
            }
        }
    };
    private TextView jieShouw_fhfj_Qxhjofjxian;
    private TextView maiso_des_opppp_wenan;

    private void gaogeXianchengStart() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GUGESARTSPINGLUN,
                PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
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
                        map.put("asianBrotherJewelLake", "slimEagerSignal");
                    }

                    @Override
                    public void onSuccess(PeizhiRuanjianModel response) {
                        jiazaizhongWindows.hideKuangkuangIng();
                        Log.e("TAG", "response---->" + response);
                        if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                            PeizhiRuanjianModel.RoughNaturalProBean fanhuibean = response.getRoughNaturalPro();
                            String slimEagerSignal = fanhuibean.getSlimEagerSignal();
                            startJson(slimEagerSignal);
                        } else {
                            startJson("");
                        }
                    }

                    @Override
                    public void onError(String error) {
                        jiazaizhongWindows.hideKuangkuangIng();
                        startJson("");
                        Log.e("TAG", "error---->" + error);
                    }
                });

    }

    private void startJson(String slimEagerSignal){
        new Thread(new Runnable() {
            @Override
            public void run() {
                //获取json
                String chuanShuju = "";
                try {
                    chuanShuju = HuoquBigJsonUpShujuTols.getJson(JinJinGoGoJian0Activity.this, slimEagerSignal);
                } catch (Exception e) {
                    Log.d("bigjsonerror", "jsonexception");
                }

                // 以send方式发送：
                Message handXinxi = Message.obtain();
                handXinxi.obj = chuanShuju;
                // 正常发送
                zhuxianCaozuo.sendMessage(handXinxi);
            }
        }).start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        setContentView(R.layout.a_gogoarrow0);

        setzhidign("S/1,100");

        //将activity添加到列表中
        if (currentactivity == null) {
            currentactivity = new WeakReference<Activity>(this);
        }
        MyJichuAplica.getApplicaInstance().addactivitytoList(currentactivity.get());

        chushiHuaShowDiqu1PPWindows();
        chushiHuaShowQuduQitaPPWindows();
        chushihuaPpWindowd();
        chushihuaPPwindows();

        requestSearchDataAndHuixian();
        qingqiuJiekouIndex();
        gaoDiqudizhi(true);

        //获取位置信息
//        DingWeizhiTols.getWeizhiDingwei(this);
//        LocUtil ll = new LocUtil(this);
//        ll.startLoction();
        sanfangRxppp = new SanfangRxppp(this);
        //获取定位权限 如果有获取定位
        jianchaBIGjjsensonQQQppp();


        //动态设置状态栏高度
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        layoutParams.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(layoutParams);

        zongBuju = findViewById(R.id.zongBuju);
        zongHuadongBuju = findViewById(R.id.zongHuadongBuju);
        duquNeirongBuju = findViewById(R.id.duquNeirongBuju);

        jingojian1fanhui = findViewById(R.id.jingojian1fanhui);
        jingojian1submit = findViewById(R.id.jingojian1submit);

        duquDiyihangRl1 = findViewById(R.id.duquDiyihangRl1);
        duquDiyihangTxt1 = findViewById(R.id.duquDiyihangTxt1);

        View duquDiyihangRl2 = findViewById(R.id.duquDiyihangRl2);
        duquDiyihangTxt2 = findViewById(R.id.duquDiyihangTxt2);

        duquDiyihangTxt3 = findViewById(R.id.duquDiyihangTxt3);

        duquDiyihangTxt004 = findViewById(R.id.duquDiyihangTxt004);
        duquDiyihangTxt005 = findViewById(R.id.duquDiyihangTxt005);

        duquDiyihangRl4 = findViewById(R.id.duquDiyihangRl4);
        duquDiyihangRl5 = findViewById(R.id.duquDiyihangRl5);
        duquDiyihangRl6 = findViewById(R.id.duquDiyihangRl6);

        jingaojian1rvList = findViewById(R.id.jingaojian1rvList);
        jingaojian1Framel = findViewById(R.id.jingaojian1Framel);

        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);

        jingojian1kefu = findViewById(R.id.jingojian1kefu);


//        menutab_stupianf_one = findViewById(R.id.menutab_stupianf_one);
//        menutab_stupianf_one.setImageResource(R.drawable.bj_hgfafesrgfeasrg);

        jingojian1dibuxieyi.setOnClickListener(this);
        jingojian1fanhui.setOnClickListener(this);
        jingojian1submit.setOnClickListener(this);
        duquDiyihangRl2.setOnClickListener(this);
        duquDiyihangRl4.setOnClickListener(this);
        duquDiyihangRl5.setOnClickListener(this);
        duquDiyihangRl6.setOnClickListener(this);
        jingojian1kefu.setOnClickListener(this);

        jiazaizhongWindows.setCanceledOnTouchOutside(false);

        jingaojian1dibtnbuju = findViewById(R.id.jingaojian1dibtnbuju);
        jingaojian1dibtnbuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        duquDiyihangTxt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().contains(" ")) {
                    duquDiyihangTxt1.setText(charSequence.toString().replace(" ", ""));
                    duquDiyihangTxt1.setSelection(duquDiyihangTxt1.getText().toString().length());

                }
                if (charSequence.toString().contains("\n")) {
                    duquDiyihangTxt1.setText(charSequence.toString().replace("\n", ""));
                    duquDiyihangTxt1.setSelection(duquDiyihangTxt1.getText().toString().length());

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
//                String qudiaokonggeStr = editable.toString().trim().replace(" ", "");
//                if (qudiaokonggeStr.length() > 0) {
//                    shiFouxiayibu(false);
//
//                    if (ruanjianPanIsShow)
//                        if (qudiaokonggeStr.contains("@") && !editable.toString().endsWith(" ")) {
//                            stringArrayList2.clear();
//                            for (int i = 0; i < stringArrayList1.size(); i++) {
//                                String sss = qudiaokonggeStr.substring(0, qudiaokonggeStr.indexOf("@")) + stringArrayList1.get(i);
//                                stringArrayList2.add(sss);
//                            }
//                            shuruZongXinxi1Shipei.notifyDataSetChanged();
//                            shezhiXianshiList(true);
//                        } else {
//                            shezhiXianshiList(false);
//                        }
//                    else
//                        ruanjianPanIsShow = true;
//                } else {
//                    if (ruanjianPanIsShow)
//                        shezhiXianshiList(false);
//                    else
//                        ruanjianPanIsShow = true;
//                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
//                }
            }
        });

        duquDiyihangTxt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                if (charSequence.toString().contains("\n")) {
                    duquDiyihangTxt3.setText(charSequence.toString().replace("\n", ""));
                    duquDiyihangTxt3.setSelection(duquDiyihangTxt3.getText().toString().length());

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (trim.length() > 0) {
                    shiFouxiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });

//        duquDiyihangTxt3.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                duquDiyihangTxt3.setSelection(duquDiyihangTxt3.getText().toString().length());
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });

//        EmailHintWatcher emailHintWatcher = new EmailHintWatcher(readTv01);
//        emailHintWatcher.setSuffixData(R.array.youxiang_jihearry);
//        readTv01.addHintWatcher(emailHintWatcher);

        stringArrayList1 = new ArrayList<>();
        stringArrayList1.add("@gmail.com");
        stringArrayList1.add("@hotmail.com");
        stringArrayList1.add("@yahoo.com");
        stringArrayList1.add("@outlook.com");
        stringArrayList1.add("@unh.edu");
        stringArrayList1.add("@speedy.com");
        stringArrayList1.add("@live.com");
        stringArrayList1.add("@continental.edu");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        jingaojian1rvList.setLayoutManager(linearLayoutManager);
        shuruZongXinxi1Shipei = new ShuruZongXinxi1Shipei(stringArrayList2);
        jingaojian1rvList.setAdapter(shuruZongXinxi1Shipei);
        shuruZongXinxi1Shipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String str = stringArrayList2.get(position);
                ruanjianPanIsShow = false;
                shezhiXianshiList(false);
                duquDiyihangTxt1.setText(str);
                duquDiyihangTxt1.setSelection(str.length());
            }
        });
        jingaojian1Framel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shezhiXianshiList(false);
            }
        });

        //埋点 进入个人信息页
        YincangShijianClickTols.QingqiuMaidian(JINRUGERENXINXIYE);

        initBackWindow();
    }


    private SanfangRxppp sanfangRxppp;

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
                                        YincangShijianClickTols.QingqiuMaidian(JICHUDINGWEI);
                                        DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian0Activity.this);
                                        ll.kaiqiDingwGongneng();
                                    } catch (Exception e) {

                                    }

                                }

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                try {
                                    YincangShijianClickTols.QingqiuMaidian(JICHUDINGWEI);
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian0Activity.this);
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

    //回显数据
    private void requestSearchDataAndHuixian() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SERACH_SHENFEN, SuoyouXinxiModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<SuoyouXinxiModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian0Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("interestingGrillClerk", "1");//新风控埋点用
            }

            @Override
            public void onSuccess(SuoyouXinxiModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);


                //埋点 个人信息页回显完成
                YincangShijianClickTols.QingqiuMaidian(GERENXINXIYESHUJUJIAZAIWANCHENG);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    SuoyouXinxiModel.FanhuiData bean = response.bigAncientTastyHeadteacher;

                    if (!TextUtils.isEmpty(bean.eastAloneAggressiveMankind)) {//v-pleasedStoneFactoryBrokenHole : "Empleado"
                        ruanjianPanIsShow = false;
                        duquDiyihangTxt1.setText(bean.eastAloneAggressiveMankind);
                        duquDiyihangTxt1.setSelection(bean.eastAloneAggressiveMankind.length());
                    }

                    //v-regularUnmarriedBed : "6"
                    //v-gentlePulseEntireDistantDeer : "387"
                    dizhiBianma1 = bean.regularUnmarriedBed + "";
                    dizhiBianma2 = bean.gentlePulseEntireDistantDeer + "";
                    dizhiBianma3 = bean.dangerousBossAnythingCertainRing + "";

                    if (!TextUtils.isEmpty(bean.snowyFirstAny)) {
                        //CALDAS  chinchina
                        dizhiStr1 = bean.snowyFirstAny;
                    }
                    if (!TextUtils.isEmpty(bean.suchIceSuddenEnergySilver)) {
                        //CALDAS  chinchina
                        dizhiStr2 = bean.suchIceSuddenEnergySilver;
                    }
                    if (!TextUtils.isEmpty(bean.shortSugarQuietFlame)) {
                        //CALDAS  chinchina
                        dizhiStr3 = bean.shortSugarQuietFlame;
                    }

                    if (dizhiStr1 != null && dizhiStr2 != null) {
                        duquDiyihangTxt2.setText(dizhiStr1 + " " + dizhiStr2 + " " + dizhiStr3);
                    }

                    if (!TextUtils.isEmpty(bean.livelyBrainSimpleFrequentRay)) {
                        duquDiyihangTxt3.setText(bean.livelyBrainSimpleFrequentRay);
                    }

                    isShuju = !TextUtils.isEmpty(bean.eastAloneAggressiveMankind);
                    if (!isShuju) {
                        //当前页面没保存过信息得时候 首次进入才打点
                        YincangShijianClickTols.QingqiuMaidian(JINRUGERENXINXIYEXINXIFIRST);
                        YincangShijianClickTols.QingqiuNewRiskMaidian(NEWRISK_INTOINFOFIRST);
                    }
                    shiFouxiayibu(false);
                } else {
//                    Toast.makeText(JinJinGoGoJian0Activity.this, response.nuclearTrialSpareMountainousBat, Toast.LENGTH_SHORT).show();
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

    private int shuzhiGundongZhi;

    private void shezhiXianshiList(boolean shifouxianshi) {

        int[] weizi = new int[2];
        duquDiyihangRl1.getLocationInWindow(weizi);
        int y1 = weizi[1];
        shuzhiGundongZhi = y1 + duquDiyihangRl1.getHeight();

        if (shifouxianshi) {
            jingaojian1Framel.setPadding(0, shuzhiGundongZhi, 0, 0);
            jingaojian1Framel.setVisibility(View.VISIBLE);
        } else {
            jingaojian1Framel.setVisibility(View.GONE);
        }


    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.jingojian1submit) {
            if (!WngluoTols.youWangluoFou(JinJinGoGoJian0Activity.this)) {
                baseaNonet.showPPw(Gravity.CENTER);
                return;
            }
            if (shiFouxiayibu(true)) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                //提交数据
                if (!zhengZeYanzhengYouxaing(duquDiyihangTxt1.getText().toString().trim())) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_05));
                    return;
                }
                requestSaveDataAndHuixian();
            }
        } else {
            if (DianjiQuickTols.clickkuaikuai()) {
                return;
            }
            Intent intent;
            switch (view.getId()) {
                case R.id.jingojian1fanhui:
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian0Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    uptopageononon();

                    break;

                case R.id.duquDiyihangRl2://选择地区
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian0Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }

                    KeybordTols.hideKeyboard(this);

                    if (cacheDiqu1) {
                        dizhiSbf = new StringBuffer();
                        popJinJianZiLiao01Rv.scrollToPosition(0);
                        //地区
                        morenSuoyin = 1;
                        regionParentId = "-1";
                        zhongxinDengji = "1";
                        chanpinMoxingDiqu1PPWindows.showPPw();
                    } else {
                        shiFouxiayibu(false);
                        gaoDiqudizhi(false);
                    }

                    break;

                case R.id.jingojian1dibuxieyi://跳转隐私协议
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian0Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    XieyiShowTols.quH5YinsiPage(JinJinGoGoJian0Activity.this);
                    break;
                case R.id.jingojian1kefu://跳转ws kefu
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian0Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
//                    intent = new Intent(this, DadianhuaGeiWomenActivity.class);
//                    startActivity(intent);
                    XieyiShowTols.quH5KefuPage(JinJinGoGoJian0Activity.this, "5");
                    break;
            }
        }

    }


    String regionParentId = "-1";

    private void gaoDiqudizhi(boolean initrequest) {
        //地区
        morenSuoyin = 0;
        dizhiSbf = new StringBuffer();
        regionParentId = "-1";
        zhongxinDengji = "1";
        requestSearchDiquAndHuixian(regionParentId, zhongxinDengji, initrequest);


    }

    private void uptopageononon() {
        YincangShijianClickTols.QingqiuMaidian(DIANJIGERENXINXIYEFANHUI);

        //没提交过数据
        if (!isShuju) {
            huilaibaPPw.showPPw(Gravity.CENTER);
        } else {
            gototoduodudohoem();
        }
    }

    private void gototoduodudohoem() {
        BendiHuancunTols.commitZifuchuan(BendiHuancunTols.COPY_USER_INFO, "");
        YincangShijianClickTols.QingqiuMaidian(DIANJIGERENXINXIYEFANHUI);
//        Intent broadcastIntent = new Intent(ZHUYEMIAN);
//        sendBroadcast(broadcastIntent);
//        Intent intent2 = new Intent(this, ImpZhuyaoActivity.class);
//        startActivity(intent2);
        finish();
    }

    private boolean shiFouxiayibu(boolean isToast) {
        boolean isXiayibu = false;
        //提交数据
        if (!TextUtils.isEmpty(duquDiyihangTxt1.getText().toString().trim())
                && !TextUtils.isEmpty(duquDiyihangTxt3.getText().toString().trim())
                && !TextUtils.isEmpty(dizhiStr1)
                && !TextUtils.isEmpty(dizhiStr2)) {
            //提交数据
            if (!zhengZeYanzhengYouxaing(duquDiyihangTxt1.getText().toString().trim())) {
                if (isToast) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_05));
                }
            }
            isXiayibu = true;
        } else {
            if (isToast) {
                ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
            }
        }

        if (isXiayibu) {
            jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_thgsdthgsfew));
        }

        return isXiayibu;
    }

    private void requestSaveDataAndHuixian() {//FIND_PLEASENT_SPARROW
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SAVE_SHENFEN, NodrmalModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<NodrmalModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian0Activity.this, BendiHuancunTols.YONGHU_ID));
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

                map.put("eastAloneAggressiveMankind", duquDiyihangTxt1.getText().toString().trim());//email

                map.put("snowyFirstAny", dizhiStr1);//residentialProvince
                map.put("regularUnmarriedBed", dizhiBianma1 + "");//residentialProvinceCode
                map.put("suchIceSuddenEnergySilver", dizhiStr2);//residentialCity
                map.put("gentlePulseEntireDistantDeer", dizhiBianma2 + "");//residentialCityCode
                map.put("shortSugarQuietFlame", dizhiStr3);//residentialDistrict
                map.put("dangerousBossAnythingCertainRing", dizhiBianma3 + "");//residentialDistrictCode
                map.put("livelyBrainSimpleFrequentRay", duquDiyihangTxt3.getText().toString().trim());//fullAddress 具体地址
                map.put("interestingGrillClerk", "1");//新风控埋点

            }

            @Override
            public void onSuccess(NodrmalModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {
                    if (!isShuju) {
                        //首次提交
                        YincangShijianClickTols.QingqiuMaidian(DIANJIGERENXINXIYETIJIAOFIRST);

                    }
                    //每次提交
                    YincangShijianClickTols.QingqiuMaidian(DIANJIGERENXINXIYETIJIAOEVETYTIME);
//                    Crisp.setUserEmail(duquDiyihangTxt1.getText().toString().trim());// 进件⻚⼿动输的邮箱

                    isShuju = true;
                    ruanjianPanIsShow = false;

                    qingqiuJiekouJiancha();
                } else {
//                    Toast.makeText(JinJinGoGoJian0Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
                    jiazaizhongWindows.hideKuangkuangIng();
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

    float yZhouQishizhi;
    float yZhouYidongzhi = 0;

    RecyclerView popJinJianZiLiao01Rv;

    private void chushiHuaShowDiqu1PPWindows() {
        chanpinMoxingDiqu1PPWindows = new ChanpinMoxingPPWindows(this);
        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_gogoarrow_info, null);
        popJinJianZiLiao01Rv = popupView.findViewById(R.id.popJinJianZiLiao01Rv);
        RelativeLayout iconCloseRl = popupView.findViewById(R.id.jyhtgrefasg);
        RelativeLayout iconCloseVlRl = popupView.findViewById(R.id.jythgrfsh);
        ziranListDiyiji = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(linearLayoutManager);

        shuruZongXinxiDiqu1Shipei = new ShuruZongXinxi3Shipei(ziranListDiyiji);
        popJinJianZiLiao01Rv.setAdapter(shuruZongXinxiDiqu1Shipei);
        chanpinMoxingDiqu1PPWindows.chushihuaPPW(popupView, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.7), null, true);
        iconCloseRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                morenSuoyin = 0;
                chanpinMoxingDiqu1PPWindows.xiaohuiPPw();
            }
        });
        shuruZongXinxiDiqu1Shipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String challengingSwimmingDeepAdvertisement = ziranListDiyiji.get(position).challengingSwimmingDeepAdvertisement;
                if (morenSuoyin == 1) {
                    dizhiBianma1 = ziranListDiyiji.get(position).deliciousUpperYesterday + "";
                    dizhiStr1 = challengingSwimmingDeepAdvertisement;
                    zhongxinDengji = "2";
                    dizhiSbf.append(challengingSwimmingDeepAdvertisement + " ");
                } else if (morenSuoyin == 2) {
                    dizhiBianma2 = ziranListDiyiji.get(position).deliciousUpperYesterday + "";
                    dizhiStr2 = challengingSwimmingDeepAdvertisement;
                    zhongxinDengji = "3";
                    dizhiSbf.append(challengingSwimmingDeepAdvertisement + " ");
                } else if (morenSuoyin == 3) {
                    dizhiBianma3 = ziranListDiyiji.get(position).deliciousUpperYesterday + "";
                    dizhiStr3 = challengingSwimmingDeepAdvertisement;


                    dizhiSbf.append(challengingSwimmingDeepAdvertisement + " ");
                    duquDiyihangTxt2.setText(dizhiSbf);

                    shiFouxiayibu(false);
                }

                int deliciousUpperYesterday = ziranListDiyiji.get(position).deliciousUpperYesterday;
                regionParentId = deliciousUpperYesterday + "";
                requestSearchDiquAndHuixian(regionParentId, zhongxinDengji, false);
                chanpinMoxingDiqu1PPWindows.xiaohuiPPw();
            }
        });

        iconCloseVlRl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        yZhouQishizhi = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        yZhouYidongzhi = ev.getY() - yZhouQishizhi;
                        if (yZhouYidongzhi > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            popupView.scrollBy(0, -(int) yZhouYidongzhi);
                            yZhouQishizhi = ev.getY();
                        }
                        if (popupView.getScrollY() > 0) { //避免向上拖动
                            popupView.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (popupView.getScrollY() < -popupView.getHeight()
                                / 10 && yZhouYidongzhi > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            chanpinMoxingPPWindows.xiaohuiPPw();
                        }
                        popupView.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });
    }

    private void chushiHuaShowQuduQitaPPWindows() {
        chanpinMoxingPPWindows = new ChanpinMoxingPPWindows(this);
        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_gogoarrow_info, null);
        RecyclerView popJinJianZiLiao01Rv = popupView.findViewById(R.id.popJinJianZiLiao01Rv);
        RelativeLayout iconCloseRl = popupView.findViewById(R.id.jyhtgrefasg);
        RelativeLayout iconCloseVlRl = popupView.findViewById(R.id.jythgrfsh);
        ziranList = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(linearLayoutManager);
//        if(morenSuoyin==1){
//            ziranList = ziranListDiyiji;
//        }
        shuruZongXinxiDiquqitaShipei = new ShuruZongXinxi3Shipei(ziranList);
        popJinJianZiLiao01Rv.setAdapter(shuruZongXinxiDiquqitaShipei);
        chanpinMoxingPPWindows.chushihuaPPW(popupView, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.7), null, true);
        iconCloseRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chanpinMoxingPPWindows.xiaohuiPPw();
            }
        });
        shuruZongXinxiDiquqitaShipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String challengingSwimmingDeepAdvertisement = ziranList.get(position).challengingSwimmingDeepAdvertisement;
                if (morenSuoyin == 1) {
                    dizhiBianma1 = ziranList.get(position).deliciousUpperYesterday + "";
                    dizhiStr1 = challengingSwimmingDeepAdvertisement;
                    zhongxinDengji = "2";
                    dizhiSbf.append(challengingSwimmingDeepAdvertisement + " ");
                } else if (morenSuoyin == 2) {
                    dizhiBianma2 = ziranList.get(position).deliciousUpperYesterday + "";
                    dizhiStr2 = challengingSwimmingDeepAdvertisement;
                    zhongxinDengji = "3";
                    dizhiSbf.append(challengingSwimmingDeepAdvertisement + " ");
                } else if (morenSuoyin == 3) {
                    dizhiBianma3 = ziranList.get(position).deliciousUpperYesterday + "";
                    dizhiStr3 = challengingSwimmingDeepAdvertisement;


                    dizhiSbf.append(challengingSwimmingDeepAdvertisement + " ");
                    duquDiyihangTxt2.setText(dizhiSbf);

                    shiFouxiayibu(false);
                }

                int deliciousUpperYesterday = ziranList.get(position).deliciousUpperYesterday;
                regionParentId = deliciousUpperYesterday + "";
                requestSearchDiquAndHuixian(regionParentId, zhongxinDengji, false);
                chanpinMoxingPPWindows.xiaohuiPPw();
            }
        });

        iconCloseVlRl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        yZhouQishizhi = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        yZhouYidongzhi = ev.getY() - yZhouQishizhi;
                        if (yZhouYidongzhi > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            popupView.scrollBy(0, -(int) yZhouYidongzhi);
                            yZhouQishizhi = ev.getY();
                        }
                        if (popupView.getScrollY() > 0) { //避免向上拖动
                            popupView.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (popupView.getScrollY() < -popupView.getHeight()
                                / 10 && yZhouYidongzhi > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            chanpinMoxingPPWindows.xiaohuiPPw();
                        }
                        popupView.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });
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
//        newtipsneineirongrong.setText(getString(R.string.newtankuang_jichuwanliu));
        popupView.findViewById(R.id.newtipsisisi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                huilaibaPPw.xiaohuiPPw();
                gototoduodudohoem();
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


    //请求查询地区接口并回显
    private void requestSearchDiquAndHuixian(String shangjiId, String regionlevel, boolean initrequest) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_DIQUQUARE, DizhiDiquModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<DizhiDiquModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian0Activity.this, BendiHuancunTols.YONGHU_ID));
                String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                if (TextUtils.isEmpty(s1)) {
                    s1 = "0";
                }
                if (TextUtils.isEmpty(s2)) {
                    s2 = "0";
                }
                map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                map.put("carefulFuneralHardEssay", s1 + "," + s2);//gpsInfo
                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
                map.put("blankApplicationNearbySheep", shangjiId);
                map.put("fairHelmetModernCourseHoney", regionlevel);
            }

            @Override
            public void onSuccess(DizhiDiquModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    morenSuoyin++;
                    List<DizhiDiquModel.RoughNaturalProBean> bigAncientTastyHeadteacher = response.bigAncientTastyHeadteacher;
                    if (bigAncientTastyHeadteacher != null && bigAncientTastyHeadteacher.size() > 0) {
                        if (initrequest) {
                            ziranListDiyiji.clear();
                            ziranListDiyiji.addAll(bigAncientTastyHeadteacher);
                            shuruZongXinxiDiqu1Shipei.setNewData(ziranListDiyiji);
                        }
                        ziranList.clear();
                        ziranList.addAll(bigAncientTastyHeadteacher);
                        shuruZongXinxiDiquqitaShipei.notifyDataSetChanged();
                    }
                    cacheDiqu1 = true;
                    if (morenSuoyin < 4 && !initrequest) {
                        chanpinMoxingPPWindows.showPPw();
                    }
                    if (morenSuoyin == 4) {
                        regionParentId = "-1";
                        zhongxinDengji = "1";
                        morenSuoyin = 1;
                    }
                } else {
//                    Toast.makeText(JinJinGoGoJian0Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    public void qingqiuJiekouIndex() {
        if (jiazaizhongWindows == null) {
            return;
        }
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HOMEPAGE_FOR_UNLOGIN, UnintoTabModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<UnintoTabModel>() {
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

//                    if(!TextUtils.isEmpty(bigAncientTastyHeadteacher.eastLaughterPartJungleAngryPhrase+"")){
//                        kjhkjythgrjhgfefwdqqYTdg34dsg.setText(HuobigeshiTols.FormatNumber(bigAncientTastyHeadteacher.eastLaughterPartJungleAngryPhrase));
//
//                    }
                    //进入联系人页面 首次
                    newtipsneineirongrong.setText(String.format(Locale.ENGLISH, getString(R.string.newtankuang_jichuwanliu), HuobigeshiTols.FormatNumber(bigAncientTastyHeadteacher.eastLaughterPartJungleAngryPhrase)));

                } else {
//                    Toast.makeText(JinJinGoGoJian0Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    private void qingqiuJiekouJiancha() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SHIFOUSHANGCHUANJSON, ShangChuanModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ShangChuanModel>() {
            @Override
            public void OnMap(Map<String, String> map) {

            }

            @Override
            public void onSuccess(ShangChuanModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {

                    String coldNervousKeeperLake = response.getBigAncientTastyHeadteacher().getColdNervousKeeperLake();
                    if ("0".equals(coldNervousKeeperLake)) {
                        //需要上传

                        //是否上传中
                        if (ChangliangConfigTols.jsonUpload) {
                            Intent intent = new Intent(JinJinGoGoJian0Activity.this, JinJinGoGoJian3Activity.class);
                            startActivity(intent);
                        } else {

                            String privacy = BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian0Activity.this, XITONG_YINSI_BASIC);
                            if ("1".equals(privacy)) {
                                jiazaizhongWindows.showKuangkuangIng();
                                jiazaizhongWindows.setCancelable(false);

                                //授权成功去上传大数据 获取权限
                                chaxunShanghuanNeddQuanxian();
                            } else {
                                gaoQxPP_PPW.showPPw(Gravity.CENTER);
                            }
                        }


                    } else {
                        //不需要上传
//                        Intent intent = new Intent(JinJinGoGoJian0Activity.this, JinJinGoGoJian3Activity.class);
//                        startActivity(intent);

                        jiazaizhongWindows.showKuangkuangIng();
                        jiazaizhongWindows.setCancelable(false);
                        chaxunShanghuanNeddQuanxianDingw();
                    }

                } else {
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
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

    // 不需要上传卡定位权限
    private void chaxunShanghuanNeddQuanxianDingw() {
        sanfangRxppp.qingQiu(DUQU_BIGJSON_PPPP)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Boolean aBoolean) {
                        try {
                            if (!aBoolean) {
                                if (new PppQxPanduaner(MyJichuAplica.getInstance()).checkShaoPppp(
                                        Manifest.permission.ACCESS_COARSE_LOCATION
                                )) {
                                    Log.d("requestLocation---->>>", "权限被拒绝");

                                    chanpinMoxingPPWindows1.showPPw(Gravity.CENTER);
                                    jiazaizhongWindows.hideKuangkuangIng();
                                } else {
                                    Log.d("requestLocation---->>>", "权限被通过");
                                    //所有权限都已经授权
                                    Intent intent = new Intent(JinJinGoGoJian0Activity.this, JinJinGoGoJian3Activity.class);
                                    startActivity(intent);
                                    jiazaizhongWindows.hideKuangkuangIng();
                                }

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                Intent intent = new Intent(JinJinGoGoJian0Activity.this, JinJinGoGoJian3Activity.class);
                                startActivity(intent);
                                jiazaizhongWindows.hideKuangkuangIng();
                            }
                        } catch (Exception e) {
                            jiazaizhongWindows.hideKuangkuangIng();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        jiazaizhongWindows.hideKuangkuangIng();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    ChanpinMoxingPPWindows gaoQxPP_PPW;

    public void shezhidFFFFYuyanyuya() {
        switch (GuojiaLeixing) {
            case GuojiaLeixing2://秘鲁
                shezhiShangmianWnean2(jieShouw_fhfj_Qxhjofjxian);
                shezhiSnWnean2(maiso_des_opppp_wenan);
                break;
            default://西班牙
                shezhiSHANGMIANtxtWendha(jieShouw_fhfj_Qxhjofjxian);
                shezhiSnWnean(maiso_des_opppp_wenan);
        }
    }

    private void chaxunShanghuanNeddQuanxian() {
        sanfangRxppp.qingQiu(DUQU_BIGJSON_PPPP)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Boolean aBoolean) {
                        try {
                            if (!aBoolean) {
                                if (new PppQxPanduaner(MyJichuAplica.getInstance()).checkShaoPppp(
//                                        Manifest.permission.READ_CONTACTS,
//                                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
//                                        Manifest.permission.READ_EXTERNAL_STORAGE,
                                        Manifest.permission.CAMERA,
                                        Manifest.permission.READ_CALENDAR,
                                        Manifest.permission.ACCESS_WIFI_STATE,
                                        Manifest.permission.ACCESS_NETWORK_STATE,
                                        Manifest.permission.ACCESS_COARSE_LOCATION,
                                        Manifest.permission.READ_CALL_LOG,
//                                        Manifest.permission.ACCESS_FINE_LOCATION,
                                        Manifest.permission.READ_SMS,
//                                        Manifest.permission.SEND_SMS,
                                        Manifest.permission.READ_PHONE_STATE
                                )) {
                                    Log.d("requestLocation---->>>", "权限被拒绝");

                                    chanpinMoxingPPWindows1.showPPw(Gravity.CENTER);
                                    jiazaizhongWindows.hideKuangkuangIng();
                                } else {
                                    Log.d("requestLocation---->>>", "权限被通过");
                                    YincangShijianClickTols.QingqiuMaidian(LIANXIRENDINGWEI);
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian0Activity.this);
                                    ll.kaiqiDingwGongneng();
                                    //所有权限都已经授权
                                    gaogeXianchengStart();

                                    Intent intent = new Intent(JinJinGoGoJian0Activity.this, JinJinGoGoJian3Activity.class);
                                    startActivity(intent);
                                    jiazaizhongWindows.hideKuangkuangIng();
                                }
                                //获取数据抓取权限结果
                                YincangShijianClickTols.QingqiuMaidian(SHUJUZHUAQUJIEGUO);
/*                                if (new PermissionsChecker(ApplicationContext.getContext()).lacksPermissions(Manifest.permission.READ_PHONE_STATE)) {
                                    IKToast.show(getApplicationContext(), "手机状态被拒，不能享用一键登录功能");
                                    Log.d("requestLocation---->>>", "权限被拒绝");
                                } else {
                                    Log.d("requestLocation---->>>", "权限被拒绝");
                                }*/

                            } else {
                                //获取数据抓取权限结果
                                YincangShijianClickTols.QingqiuMaidian(SHUJUZHUAQUJIEGUO);
                                //权限全部通过
                                if (!isShuju) {
                                    YincangShijianClickTols.QingqiuMaidian(SHUJUZHUAQUSHOUQUANTONGGUOFIRST);

                                }

                                YincangShijianClickTols.QingqiuMaidian(LIANXIRENDINGWEI);
                                DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian0Activity.this);
                                ll.kaiqiDingwGongneng();

                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                gaogeXianchengStart();

                                Intent intent = new Intent(JinJinGoGoJian0Activity.this, JinJinGoGoJian3Activity.class);
                                startActivity(intent);
                                jiazaizhongWindows.hideKuangkuangIng();
                            }
                        } catch (Exception e) {
                            jiazaizhongWindows.hideKuangkuangIng();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        jiazaizhongWindows.hideKuangkuangIng();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void chushihuaPpWindowd() {
        gaoQxPP_PPW = new ChanpinMoxingPPWindows(this);

        LayoutInflater bujuinflrt = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View bujuSHitu = bujuinflrt.inflate(R.layout.wndw_start, null);

        jieShouw_fhfj_Qxhjofjxian = bujuSHitu.findViewById(R.id.jieShouw_fhfj_Qxhjofjxian);
        maiso_des_opppp_wenan = bujuSHitu.findViewById(R.id.maiso_des_opppp_wenan);
        TextView quxiaoquxiao_fjdoj_buyaoquan = bujuSHitu.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        TextView gaoding_sure_djdj_yaogeiwo = bujuSHitu.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);
        TextView readDataTopText02 = bujuSHitu.findViewById(R.id.readDataTopText02);

//        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian3Activity.this, APPMINGZI))) {
//            readDataTopText02.setText(BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian3Activity.this, APPMINGZI));
//        }
        quxiaoquxiao_fjdoj_buyaoquan.setText(getString(R.string.peizhiandout_egdsgj_cer));
        gaoding_sure_djdj_yaogeiwo.setText(getString(R.string.shangpins_foryo_con));
        shezhidFFFFYuyanyuya();

        bujuSHitu.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                gaoQxPP_PPW.xiaohuiPPw();
                //数据抓取拒绝按钮
                YincangShijianClickTols.QingqiuMaidian(DIANJISHUJUZHUAQUJUJUE);
            }
        });
        bujuSHitu.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                jiazaizhongWindows.showKuangkuangIng();
                jiazaizhongWindows.setCancelable(false);
                gaoQxPP_PPW.xiaohuiPPw();
                BendiHuancunTols.commitZifuchuan(XITONG_YINSI_BASIC, "1");
                //数据抓取同意按钮
                YincangShijianClickTols.QingqiuMaidian(DIANJISHUJUZHUAQUTONGYI);

                //授权成功去上传大数据 获取权限
                chaxunShanghuanNeddQuanxian();
//                switch (leileixing1) {
//                    case 1:
//                        shifouYaoYinsiWindows = false;
//                        checkWritePermission(leileixing2);
//                        break;
//                    case 2:
//                        switch (GuojiaLeixing) {
//                            case GuojiaLeixing2://秘鲁
//                                qingqiuJiekou2();
//                                break;
//                            default://西班牙
//                                qingqiuJiekou1();
//                        }
//                        break;
//                }
            }
        });

        gaoQxPP_PPW.chushihuaPPW(bujuSHitu, false, (int) (huoquPingmuKuandu(this) * 0.8), (int) (huoquPingmuGodu(this) * 0.8), new ChanpinMoxingPPWindows.OnDianjiHuidiaoJianting() {
            @Override
            public void onDianjiQUxioa() {
            }
        }, true);
    }

    public void shezhiSHANGMIANtxtWendha(final TextView wenenan) {
        ZifuchuanPinjieSpanTols.with(wenenan).diejiaapped(getString(R.string.qxppp_usestr_1) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_2) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_03) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_04) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_05) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_06) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_0601) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_07) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_08) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_09) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_010) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_011) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_012) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_013) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_014) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_015) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_016) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_017) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_018) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_019) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_020) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_021) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_022) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_023) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_024) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_025) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_026) + "\n\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_027) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_028) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_029) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_030) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_030) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_031) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_032) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_033) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_034) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_035) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_036) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_037) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_038) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_039) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_040) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_041) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_042) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_043) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_044) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_045) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_046) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_047) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_048) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_049) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_050) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_051) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_052) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_053) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_054) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_055) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_056) + "\n\n")

                .chuangjian();
        wenenan.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    public void shezhiShangmianWnean2(final TextView WWWW) {
        ZifuchuanPinjieSpanTols.with(WWWW)
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_01) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_02) + "\n\n")
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_03) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_04) + "\n\n")
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_05) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_06) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_09) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_010) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_011) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_012) + "\n\n")


//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_07) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_08) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_02301) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_02401) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_07) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_08) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_017) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_018) + "\n\n")
//

//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_013) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_014) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_015) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_016) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_0443) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_0444) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_017) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_018) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_019) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_020) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_021) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_022) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_023) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_024) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_025) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_026) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_027) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_028) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_029) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_030) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_031) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_032) + "\n\n")
//
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_033) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_034) + "\n\n")
                .chuangjian();
        WWWW.setHighlightColor(Color.parseColor("#88cccccc"));
    }


    public void shezhiSnWnean(final TextView wwww) {
        ZifuchuanPinjieSpanTols.with(wwww).diejiaapped(getString(R.string.qxppp_usestr_dianjijixu))
                .diejiaapped(getString(R.string.zhuyetab_tudai_des_pri))
                .setQianjingse(getResources().getColor(R.color.sezhi_argb_5377D5))
                .chuangjian();
        wwww.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    public void shezhiSnWnean2(final TextView tttxxx) {
        ZifuchuanPinjieSpanTols.with(tttxxx).diejiaapped(getString(R.string.qxppp_usestr_jieshou1))
                .diejiaapped(" " + getString(R.string.qxppp_usestr_jieshou2) + " ")
                .setQianjingse(getResources().getColor(R.color.sezhi_argb_5377D5))
                .setDianjiSpan(new DianjiSpanTols(this, YINSI_DIZHI, "0"))
//                .diejiaapped(getString(R.string.qxppp_usestr_jieshou3))
//                .diejiaapped(" " + getString(R.string.qxppp_usestr_jieshou4) + " ")
//                .setQianjingse(getResources().getColor(R.color.sezhi_argb_5377D5))
//                .setDianjiSpan(new DianjiSpanTols(this, FUWU_DIZHI, "2"))
//                .diejiaapped(".")
                .chuangjian();
        tttxxx.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    ChanpinMoxingPPWindows chanpinMoxingPPWindows1;

    private void chushihuaPPwindows() {
        chanpinMoxingPPWindows1 = new ChanpinMoxingPPWindows(this);

        LayoutInflater layshiallayr = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View sfjvjsHISSHIS = layshiallayr.inflate(R.layout.wndw_xuancxxh_chanpin2, null);
        TextView quxiaoquxiao_fjdoj_buyaoquan = sfjvjsHISSHIS.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        TextView gaoding_sure_djdj_yaogeiwo = sfjvjsHISSHIS.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);

        quxiaoquxiao_fjdoj_buyaoquan.setText(getString(R.string.peizhiandout_egdsgj_cer));
        gaoding_sure_djdj_yaogeiwo.setText(getString(R.string.shangpins_foryo_con));

        sfjvjsHISSHIS.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chanpinMoxingPPWindows1.xiaohuiPPw();
                //测试说这个提示和弹窗重复了
//                if (rx <= 1) {
//                    Toast.makeText(ReadData03Activity.this, getString(R.string.tusitishi_dizih_11), Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(ReadData03Activity.this, getString(R.string.tusitishi_dizih_12), Toast.LENGTH_SHORT).show();
//                }
            }
        });
        sfjvjsHISSHIS.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chanpinMoxingPPWindows1.xiaohuiPPw();
                QuanxianShipeiGuanliTols.tiaoZhuanZhuajiSetsPage(JinJinGoGoJian0Activity.this);
            }
        });

        chanpinMoxingPPWindows1.chushihuaPPW(sfjvjsHISSHIS, false, (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

    }

    private void chuanChuanShujuJson(String jsonData) {
        String jiamimi = "";
        try {
            jiamimi = GzipCompreTols.compress(jsonData);
            Log.e("encrypt", jiamimi);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //开始上传大数据
        ChangliangConfigTols.jsonUpload = true;
        YincangShijianClickTols.QingqiuMaidian(KAISHISHANGCHAUNSHUJU);
        RequestQueue qingqiuduilie = Volley.newRequestQueue(getApplicationContext(), new OKwangHttpyeZhan());
        JsonRequest<JSONObject> jiesenQingqiu = new JsonObjectRequest(Request.Method.POST
                , ChangliangConfigTols.SHANGCHUANDAJSON5, jiamimi,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("TAG", "response -> " + response.toString());
                        try {

                            //上传大数据成功
                            YincangShijianClickTols.QingqiuMaidian(WANCHENGSHANGCHUANSHUJU);
                            Gson gson = new Gson();

                            final ConfigDianModel configDianModel = gson.fromJson(String.valueOf(response), ConfigDianModel.class);
                            if (configDianModel.getaverageEmbassyNationalVictoryDepth() == 1000) {
                                ChangliangConfigTols.jsonUpload = false;
                                ChangliangConfigTols.jsonUploadStatus = true;

                            } else {
                                ChangliangConfigTols.jsonUpload = false;
                                ChangliangConfigTols.jsonUploadStatus = false;
                            }
                        } catch (Exception e) {
                            ChangliangConfigTols.jsonUpload = false;
                            ChangliangConfigTols.jsonUploadStatus = false;
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                ChangliangConfigTols.jsonUpload = false;
                ChangliangConfigTols.jsonUploadStatus = false;
            }
        }) {
            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Accept", "application/json");
                headers.put("Content-Type", "application/json; charset=UTF-8");
                headers.put("coldUnemploymentPrizeCanadianHim", "1");
//                headers.put("agriculturalArithmeticGeneralPine", YincangShijianClickTols.appshasahId);//appssid
                headers.put("pleasantSeaweedMobileHousewife", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_TOKEN));//token
//                headers.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID));//userid
                headers.put("mostCongratulationPeacefulBreakfast", "googleplay");
                headers.put("endlessSnowClearAirYoungMeaning", YincangShijianClickTols.banbenming);
                headers.put("leftAfternoonFlamingProtection", YincangShijianClickTols.banbenma + "");
                headers.put("averageExpedition", shebeiId);
                headers.put("femaleToothacheArabPerfectCloud", "1");
                headers.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));

                //主产品ssid 和userid
                String appSsid = YincangShijianClickTols.appshasahId;
                String userID = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID);

                //如果点击了子产品 获取子产品ssid和 uerid 并赋值
                String copyUserInfo = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.COPY_USER_INFO);
                if (!TextUtils.isEmpty(copyUserInfo) && copyUserInfo.contains(",")) {
                    String[] split = copyUserInfo.split(",");
                    if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                        userID = split[0];
                        appSsid = split[1];
                    }
                }

                headers.put("agriculturalArithmeticGeneralPine", appSsid);//appssid
                headers.put("hopelessLearnedConvenience", userID);//currentUserId

                return headers;

            }

        };
        jiesenQingqiu.setRetryPolicy(new DefaultRetryPolicy(60000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        qingqiuduilie.add(jiesenQingqiu);
    }

    /**
     * 按两次退出
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            uptopageononon();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public boolean zhengZeYanzhengYouxaing(String youxiang) {
        if (youxiang != null || youxiang.length() > 0) {
            Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(youxiang);
            return matcher.find();
        }
        return false;

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //将activity从列表中移除
        MyJichuAplica.getApplicaInstance().removedestoryActivity(currentactivity.get());
    }

    public static String[] DUQU_BIGJSON_PPPP = {
//            Manifest.permission.READ_CONTACTS,
            Manifest.permission.WRITE_CALENDAR,
//            Manifest.permission.WRITE_EXTERNAL_STORAGE,
//            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA,
            Manifest.permission.READ_CALENDAR, Manifest.permission.ACCESS_WIFI_STATE,
            Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.ACCESS_COARSE_LOCATION,
//            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.READ_CALL_LOG,
            Manifest.permission.READ_SMS,
            Manifest.permission.READ_PHONE_STATE
    };

}