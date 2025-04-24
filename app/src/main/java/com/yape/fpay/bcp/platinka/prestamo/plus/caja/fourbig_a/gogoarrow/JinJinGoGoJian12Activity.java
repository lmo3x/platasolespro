package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols.shebeiId;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.XITONG_YINSI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ZHUAJI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.FUWU_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.YINSI_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuGodu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing2;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJILIANXIRENTIJIAOBINGJIAOYANGUO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJILIANXIRENTIJIAOEVEYTTIME;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHUJUZHUAQUJUJUE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHUJUZHUAQUTONGYI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRULIANXIRENYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRULIANXIRENYEFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.KAISHISHANGCHAUNSHUJU;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.LIANXIRENDINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.LIANXIRENYEFANHUI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.LIANXIRENYEJIAZAIWAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHUJUZHUAQUJIEGUO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHUJUZHUAQUSHOUQUANTONGGUOFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.WANCHENGSHANGCHUANSHUJU;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ConfigDianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.SuoyouXinxiModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DingWeiSinglebangzhuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.GzipCompreTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuoquBigJsonUpShujuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.KeybordTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.QuanxianShipeiGuanliTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZifuchuanPinjieSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.ShuruZongXinxi2Shipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
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

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class JinJinGoGoJian12Activity extends MyJichuBsActivity implements View.OnClickListener {


    static final String[] LianXIRENPPPP = new String[]{
//            Manifest.permission.READ_CONTACTS,
            Manifest.permission.READ_PHONE_STATE
    };

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

    private ImageView jingojian1fanhui;
    private TextView jingojian1submit, duquDiyihangTxt2, duhalashaoTxt6, jingojian1dibuxieyi;
    private EditText duquDiyihangTxt1, jingaojian1wenan2, duquDiyihangTxt3, duhalashaoTxt5;
    private RelativeLayout duquDiyihangRl1, dididitwotwo, duquDiyihangRl2, dududusisisi, dududuwuwuwu, dududuliuliuliu;
    private List<ConfigDianModel.RoughNaturalProBean> shshslist, shshslist2;
    private ShuruZongXinxi2Shipei shuruZongXinxi2Shipei;
    private ShuruZongXinxi2Shipei shuruZongXinxi2Shipei2;
    private String leileixing;
    private String bianma1 = "";
    private String bianma2 = "";
    private RelativeLayout jingaojian1dibtnbuju;
    private ImageView jingojian3kefu;

    //选择布局的内容
    private LinearLayout jingojian3kefushuru, jingojian3kefuxuanze;
    private TextView jingaojian1wenan2xuanze, duquDiyihangTxt1xuanze, duhalashaoTxt5xuanze, duquDiyihangTxt3xuanze;
    private RelativeLayout duquDiyihangRl2xuanze, dududuliuliuliuxuanze;
    private TextView duquDiyihangTxt2xuanze, duhalashaoTxt6xuanze;

    public static int leileixing1 = 1;
    public static int leileixing2 = 1;
    public boolean shifouYaoYinsiWindows = true;//记录当前是否需要弹隐私窗

    private boolean isShuju = false;

    public String xingmingYi = "";
    public String zhuajiYi = "";
    public String xingmingEr = "";
    public String zhuaji2 = "";
    public String binama11 = "";
    public String bianma22 = "";

    private boolean cacheguanxiOk = false;//联系人1关系初始化成公
    private boolean cacheguanxiOk2 = false;//联系人2关系初始化成公

    private boolean isxuanzeren = true;

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

                    chuanShuju = HuoquBigJsonUpShujuTols.getJson(JinJinGoGoJian12Activity.this, slimEagerSignal);
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
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_gogoarrow3);

        setzhidign("S/1,300");

        //将activity添加到列表中
        if (currentactivity == null) {
            currentactivity = new WeakReference<Activity>(this);
        }
        MyJichuAplica.getApplicaInstance().addactivitytoList(currentactivity.get());

        switch (GuojiaLeixing) {
            case GuojiaLeixing2://秘鲁
                qingqiuJiekou5();
                break;
            default://西班牙
                qingqiuJiekou4();
        }

        chushiHuaChangkou();//初始化联系人关系弹框
        chushiHuaChangkou2();//初始化联系人2关系弹框
        chushihuaPpWindowd();
        chushihuaPPwindows();

        qingqiuJiekouIndex();
        qingqiuJiekou3(true);//获取联系人关系列表 必须在初始化联系人关系弹框之后
        qingqiuJiekou33(true);//获取联系人关系列表 必须在初始化联系人关系弹框之后
        //动态设置状态栏高度
        ConstraintLayout.LayoutParams bujuguanli = (ConstraintLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        bujuguanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(bujuguanli);

        jingojian1fanhui = findViewById(R.id.jingojian1fanhui);
        jingojian1submit = findViewById(R.id.jingojian1submit);
        duquDiyihangRl1 = findViewById(R.id.duquDiyihangRl1);
        dididitwotwo = findViewById(R.id.dididitwotwo);
        duquDiyihangRl2 = findViewById(R.id.duquDiyihangRl2);
        dududusisisi = findViewById(R.id.dududusisisi);
        dududuwuwuwu = findViewById(R.id.dududuwuwuwu);
        dududuliuliuliu = findViewById(R.id.dududuliuliuliu);
        duquDiyihangTxt2 = findViewById(R.id.duquDiyihangTxt2);
        duhalashaoTxt6 = findViewById(R.id.duhalashaoTxt6);
        duquDiyihangTxt1 = findViewById(R.id.duquDiyihangTxt1);
        jingaojian1wenan2 = findViewById(R.id.jingaojian1wenan2);
        duquDiyihangTxt3 = findViewById(R.id.duquDiyihangTxt3);
        duhalashaoTxt5 = findViewById(R.id.duhalashaoTxt5);
        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);
        jingojian3kefu = findViewById(R.id.jingojian3kefu);

        jingojian3kefushuru = findViewById(R.id.jingojian3kefushuru);
        jingojian3kefuxuanze = findViewById(R.id.jingojian3kefuxuanze);
        jingaojian1wenan2xuanze = findViewById(R.id.jingaojian1wenan2xuanze);
        duquDiyihangTxt1xuanze = findViewById(R.id.duquDiyihangTxt1xuanze);
        duhalashaoTxt5xuanze = findViewById(R.id.duhalashaoTxt5xuanze);
        duquDiyihangTxt3xuanze = findViewById(R.id.duquDiyihangTxt3xuanze);

        duquDiyihangRl2xuanze = findViewById(R.id.duquDiyihangRl2xuanze);
        dududuliuliuliuxuanze = findViewById(R.id.dududuliuliuliuxuanze);
        duquDiyihangTxt2xuanze = findViewById(R.id.duquDiyihangTxt2xuanze);
        duhalashaoTxt6xuanze = findViewById(R.id.duhalashaoTxt6xuanze);


        jingojian1dibuxieyi.setOnClickListener(this);
        jingojian1fanhui.setOnClickListener(this);
        jingojian1submit.setOnClickListener(this);
        duquDiyihangRl1.setOnClickListener(this);
        dididitwotwo.setOnClickListener(this);
        duquDiyihangRl2.setOnClickListener(this);
        dududusisisi.setOnClickListener(this);
        dududuwuwuwu.setOnClickListener(this);
        dududuliuliuliu.setOnClickListener(this);
        jingojian3kefu.setOnClickListener(this);


        jingaojian1wenan2xuanze.setOnClickListener(this);
        duquDiyihangTxt1xuanze.setOnClickListener(this);
        duhalashaoTxt5xuanze.setOnClickListener(this);
        duquDiyihangTxt3xuanze.setOnClickListener(this);

        duquDiyihangRl2xuanze.setOnClickListener(this);
        dududuliuliuliuxuanze.setOnClickListener(this);

        sanfangRxppp = new SanfangRxppp(this);

        jiazaizhongWindows.setCanceledOnTouchOutside(false);

        jingaojian1dibtnbuju = findViewById(R.id.jingaojian1dibtnbuju);

        YincangShijianClickTols.QingqiuMaidian(JINRULIANXIRENYE);

        inputoverCheck();

        //获取定位权限 如果有获取定位
//        jianchaBIGjjsensonQQQppp();

        initBackWindow();
        initLixnireTipsWindow();
    }

    private void inputoverCheck() {
        duquDiyihangTxt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                duquDiyihangTxt1.setSelection(duquDiyihangTxt1.getText().toString().length());
            }

            @Override
            public void afterTextChanged(Editable s) {

                shifouXiabu(false);
            }
        });

        jingaojian1wenan2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().contains("\n")) {
                    jingaojian1wenan2.setText(s.toString().replace("\n", ""));
                    jingaojian1wenan2.setSelection(jingaojian1wenan2.getText().toString().length());

                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                shifouXiabu(false);
            }
        });

        duquDiyihangTxt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                duquDiyihangTxt3.setSelection(duquDiyihangTxt3.getText().toString().length());
            }

            @Override
            public void afterTextChanged(Editable s) {
                shifouXiabu(false);
            }
        });

        duhalashaoTxt5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().contains("\n")) {
                    duhalashaoTxt5.setText(s.toString().replace("\n", ""));
                    duhalashaoTxt5.setSelection(duhalashaoTxt5.getText().toString().length());

                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                shifouXiabu(false);
            }
        });
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
                                        YincangShijianClickTols.QingqiuMaidian(LIANXIRENDINGWEI);
                                        DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian12Activity.this);
                                        ll.kaiqiDingwGongneng();
                                    } catch (Exception e) {

                                    }

                                }

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                try {
                                    YincangShijianClickTols.QingqiuMaidian(LIANXIRENDINGWEI);
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian12Activity.this);
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

        if (view.getId() == R.id.jingojian1submit) {
            if (shifouXiabu(true)) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                //埋点 点击联系人提交按钮
                YincangShijianClickTols.QingqiuMaidian(DIANJILIANXIRENTIJIAOEVEYTTIME);
                leileixing1 = 2;
                leileixing2 = 0;
                shezhidFFFFYuyanyuya();
                //改逻辑 先去提交联系人信息
//                    gaoQxPP_PPW.showPPw(Gravity.CENTER);


                //去提交联系人信息
                switch (leileixing1) {
                    case 1:
                        shifouYaoYinsiWindows = false;
                        checkWritePermission(leileixing2);
                        break;
                    case 2:
                        switch (GuojiaLeixing) {
                            case GuojiaLeixing2://秘鲁
                                qingqiuJiekou2();
                                break;
                            default://西班牙
                                qingqiuJiekou1();
                        }
                        break;
                }
            }
        } else {
            if (DianjiQuickTols.clickkuaikuai()) {
                return;
            }
            if (!WngluoTols.youWangluoFou(JinJinGoGoJian12Activity.this)) {
                baseaNonet.showPPw(Gravity.CENTER);
                return;
            }
            Intent intent;
            switch (view.getId()) {

                case R.id.jingojian1fanhui:
                    YincangShijianClickTols.QingqiuMaidian(LIANXIRENYEFANHUI);

                    uptopageononon();

                    break;

                case R.id.duquDiyihangRl2:  // 输入模式 关系1
                case R.id.duquDiyihangRl2xuanze:  //选择模式 关系1
                    KeybordTols.hideKeyboard(this);
                    leileixing = "1";
                    popJinJianZiLiao01Rv.scrollToPosition(0);
                    if (cacheguanxiOk) {
                        for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : shshslist) {
                            if (duquDiyihangTxt2xuanze.getText().toString().equals(roughNaturalProBean.sunnyJuniorDowntown)) {
                                roughNaturalProBean.isSelect = true;
                            } else {
                                roughNaturalProBean.isSelect = false;
                            }
                        }
                        shuruZongXinxi2Shipei.notifyDataSetChanged();
                        guanxi1111.showPPw();
                    } else {
                        qingqiuJiekou3(false);
                    }

                    break;
                case R.id.dududuliuliuliu:  //输入模式 关系2
                case R.id.dududuliuliuliuxuanze:  //选择模式 关系2
                    KeybordTols.hideKeyboard(this);
                    leileixing = "2";
                    popJinJianZiLiao01Rv.scrollToPosition(0);
//                    chanpinMoxingPPWindows= null;
//                    chushiHuaChangkou();
                    if (cacheguanxiOk2) {
                        for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : shshslist2) {
                            if (duhalashaoTxt6xuanze.getText().equals(roughNaturalProBean.sunnyJuniorDowntown) ) {
                                roughNaturalProBean.isSelect = true;
                            } else {
                                roughNaturalProBean.isSelect = false;
                            }
                        }
                        shuruZongXinxi2Shipei2.notifyDataSetChanged();
                        guanxi2222.showPPw();
                    } else {
                        qingqiuJiekou33(false);
                    }

                    break;
                case R.id.jingojian1dibuxieyi://跳转隐私协议
                    XieyiShowTols.quH5YinsiPage(JinJinGoGoJian12Activity.this);
                    break;
                case R.id.jingojian3kefu://跳转ws kefu
                    XieyiShowTols.quH5KefuPage(JinJinGoGoJian12Activity.this,"7");
//                    intent = new Intent(this, DadianhuaGeiWomenActivity.class);
//                    startActivity(intent);
                    break;
                //选择联系人1
                case R.id.jingaojian1wenan2xuanze:
                case R.id.duquDiyihangTxt1xuanze:
                    toxuanRen(1001);
                    break;
                //选择联系人2
                case R.id.duhalashaoTxt5xuanze:
                case R.id.duquDiyihangTxt3xuanze:
                    toxuanRen(1002);
                    break;

            }
        }


    }

    private void toxuanRen(int reqcodde) {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, reqcodde);
        }
    }

    private void uptopageononon() {
        YincangShijianClickTols.QingqiuMaidian(LIANXIRENYEFANHUI);

        //没提交过数据
        if (!isShuju) {
            huilaibaPPw.showPPw(Gravity.CENTER);
        } else {
            finish();
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
//        newtipsneineirongrong.setText(getString(R.string.newtankuang_jichuwanliu));
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

    private ChanpinMoxingPPWindows titishishiPPw;
    private TextView newtipsshitineirong;

    //提示弹框初始化
    private void initLixnireTipsWindow() {
        titishishiPPw = new ChanpinMoxingPPWindows(this);

        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_info_wanliutip1, null);
        newtipsshitineirong = popupView.findViewById(R.id.newtipsshitineirong);
        newtipsshitineirong.setText(getString(R.string.newtankuang_lianxirentishi));
        popupView.findViewById(R.id.newtipsokokok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titishishiPPw.xiaohuiPPw();

            }
        });

        titishishiPPw.chushihuaPPW(popupView, false
                , (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);
    }

    private boolean shifouXiabu(boolean isToast) {
        boolean xaiyibuFou = false;
        if (isxuanzeren) {
            //提交数据
            if (TextUtils.isEmpty(duquDiyihangTxt1xuanze.getText().toString().replace(" ", ""))
                    || TextUtils.isEmpty(jingaojian1wenan2xuanze.getText().toString().replace(" ", ""))
                    || TextUtils.isEmpty(duquDiyihangTxt3xuanze.getText().toString().replace(" ", ""))
                    || TextUtils.isEmpty(duhalashaoTxt5xuanze.getText().toString().replace(" ", ""))) {
                if (isToast) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
                }
                xaiyibuFou = false;
            } else if (TextUtils.equals(duquDiyihangTxt1xuanze.getText().toString(), duquDiyihangTxt3xuanze.getText().toString())) {
                if (isToast) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_06));
                }
                xaiyibuFou = false;
            } else if (TextUtils.isEmpty(bianma1) || TextUtils.isEmpty(bianma2)) {
                if (isToast) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
                }
                xaiyibuFou = false;
            } else {
                xaiyibuFou = true;
            }
        } else {
            //提交数据
            if (TextUtils.isEmpty(duquDiyihangTxt1.getText().toString().replace(" ", ""))
                    || TextUtils.isEmpty(jingaojian1wenan2.getText().toString().replace(" ", ""))
                    || TextUtils.isEmpty(duquDiyihangTxt3.getText().toString().replace(" ", ""))
                    || TextUtils.isEmpty(duhalashaoTxt5.getText().toString().replace(" ", ""))) {
                if (isToast) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
                }
                xaiyibuFou = false;
            } else if (TextUtils.equals(duquDiyihangTxt1.getText().toString(), duquDiyihangTxt3.getText().toString())) {
                if (isToast) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_06));
                }
                xaiyibuFou = false;
            } else if (TextUtils.isEmpty(bianma1) || TextUtils.isEmpty(bianma2)) {
                if (isToast) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
                }
                xaiyibuFou = false;
            } else {
                xaiyibuFou = true;
            }
        }


        if (xaiyibuFou) {
            jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_thgsdthgsfew));
        } else {
            jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
        }

        return xaiyibuFou;
    }

    private void qingqiuJiekou1() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SAVE_SHENFEN, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian12Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("freshCop", bianma1);
                map.put("magicBusinessMedicalCivilBeauty", duquDiyihangTxt2.getText().toString());
                map.put("fastFortuneBirdFinalCartoon", bianma2);
                map.put("undergroundPopcornLameVarietyTinyFriendship", duhalashaoTxt6.getText().toString());
                map.put("foreignReceiverRussianSunshineCurrency", jingaojian1wenan2.getText().toString());//name
                map.put("irishFlamePassiveTypist", duhalashaoTxt5.getText().toString());//name2
                map.put("yellowBayPaceBeast", duquDiyihangTxt1.getText().toString());//phoneNumber
                map.put("humorousTrousersBadHealth", duquDiyihangTxt3.getText().toString());//phoneNumber2

            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    //获取权限
                    chaxunShanghuanNeddQuanxian();
//                    if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
//                        Intent intent = new Intent(ReadData03Activity.this, ReadData04Activity.class);
//                        startActivity(intent);
//                    }

                } else {
                    jiazaizhongWindows.hideKuangkuangIng();
//                    Toast.makeText(JinJinGoGoJian12Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    private void qingqiuJiekou2() {

        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.LIANXIPEOPLE_SAVE_BBB, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian12Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("freshCop", bianma1);
                map.put("fastFortuneBirdFinalCartoon", bianma2);

                if (isxuanzeren) {
                    map.put("magicBusinessMedicalCivilBeauty", duquDiyihangTxt2xuanze.getText().toString().trim());
                    map.put("undergroundPopcornLameVarietyTinyFriendship", duhalashaoTxt6xuanze.getText().toString().trim());
                    map.put("foreignReceiverRussianSunshineCurrency", jingaojian1wenan2xuanze.getText().toString().trim());//name
                    map.put("irishFlamePassiveTypist", duhalashaoTxt5xuanze.getText().toString().trim());//name2
                    map.put("yellowBayPaceBeast", duquDiyihangTxt1xuanze.getText().toString().trim());//phoneNumber
                    map.put("humorousTrousersBadHealth", duquDiyihangTxt3xuanze.getText().toString().trim());//phoneNumber2
                } else {
                    map.put("magicBusinessMedicalCivilBeauty", duquDiyihangTxt2.getText().toString().trim());
                    map.put("undergroundPopcornLameVarietyTinyFriendship", duhalashaoTxt6.getText().toString().trim());
                    map.put("foreignReceiverRussianSunshineCurrency", jingaojian1wenan2.getText().toString().trim());//name
                    map.put("irishFlamePassiveTypist", duhalashaoTxt5.getText().toString().trim());//name2
                    map.put("yellowBayPaceBeast", duquDiyihangTxt1.getText().toString().trim());//phoneNumber
                    map.put("humorousTrousersBadHealth", duquDiyihangTxt3.getText().toString().trim());//phoneNumber2
                }

                map.put("interestingGrillClerk", "3");
            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                Log.e("TAG", "response--savelxr-->" + response);
                jiazaizhongWindows.hideKuangkuangIng();
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {

                    if (!isShuju) {
                        //保存联系人成功 之前没保存过（首次）
                        YincangShijianClickTols.QingqiuMaidian(DIANJILIANXIRENTIJIAOBINGJIAOYANGUO);

                    }
                    isShuju = true;

                    JinJinGoGoJian12Activity.this.finish();

                } else {
                    ToastUtil.showShortToast(response.nuclearTrialSpareMountainousBat);
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                ToastUtil.showShortToast(error);
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
//                    Toast.makeText(JinJinGoGoJian12Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    private void chuanChuanShujuJson(String jsonData) {
//        if (!WngluoTols.youWangluoFou(JinJinGoGoJian12Activity.this)) {
//            baseaNonet.showPPw(Gravity.CENTER);
//            return;
//        }
        String jiamimi = "";
        try {
            jiamimi = GzipCompreTols.compress(jsonData);
            Log.e("encrypt", jiamimi);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //开始上传大数据
        if (!WngluoTols.youWangluoFou(JinJinGoGoJian12Activity.this)) {
            jiazaizhongWindows.hideKuangkuangIng();
            baseaNonet.showPPw(Gravity.CENTER);
            return;
        }
        YincangShijianClickTols.QingqiuMaidian(KAISHISHANGCHAUNSHUJU);
        RequestQueue qingqiuduilie = Volley.newRequestQueue(getApplicationContext(), new OKwangHttpyeZhan());
        JsonRequest<JSONObject> jiesenQingqiu = new JsonObjectRequest(Request.Method.POST
                , ChangliangConfigTols.DASHUJUJSON3, jiamimi,
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

                                Log.d("TAG_onResponse", "name1:" + xingmingYi + "name2:" + xingmingEr + "phone1:" + zhuajiYi + "phone2:" + zhuaji2);
                                Log.d("TAG_onResponse", "name11:" + duquDiyihangTxt1.getText().toString().trim()
                                        + "name22:" + duquDiyihangTxt3.getText().toString().trim() +
                                        "phone11:" + jingaojian1wenan2.getText().toString().trim() +
                                        "phone22:" + duhalashaoTxt5.getText().toString().trim());
                                Log.d("TAG_onResponse", "if" + ((!xingmingYi.isEmpty() && !xingmingYi.equals(jingaojian1wenan2.getText().toString().trim()))));
                                Log.d("TAG_onResponse", "if" + (!xingmingEr.isEmpty() && !xingmingEr.equals(duhalashaoTxt5.getText().toString().trim())));
                                Log.d("TAG_onResponse", "if" + (!zhuajiYi.isEmpty() && !zhuajiYi.equals(duquDiyihangTxt1.getText().toString().trim())));
                                Log.d("TAG_onResponse", "if" + (!zhuaji2.isEmpty() && !zhuaji2.equals(duquDiyihangTxt3.getText().toString().trim())));
                                Log.d("TAG_onResponse", "code111：" + binama11);
                                Log.d("TAG_onResponse", "code222：" + bianma22);
                                Log.d("TAG_onResponse", "code1：" + bianma1);
                                Log.d("TAG_onResponse", "code2：" + bianma2);

                                if ((!xingmingYi.isEmpty() && !xingmingYi.equals(jingaojian1wenan2.getText().toString().trim()))
                                        || (!xingmingEr.isEmpty() && !xingmingEr.equals(duhalashaoTxt5.getText().toString().trim()))
                                        || (!zhuajiYi.isEmpty() && !zhuajiYi.equals(duquDiyihangTxt1.getText().toString().trim()))
                                        || (!zhuaji2.isEmpty() && !zhuaji2.equals(duquDiyihangTxt3.getText().toString().trim()))
                                        || (!binama11.equals("") && !binama11.equals(bianma1))
                                        || (!bianma22.equals("") && !bianma22.equals(bianma2))
                                ) {
//                                    YincangShijianClickTols.QingqiuMaidian(YOULIANXIRENXINXIBIANHUATIJIAO);
                                } else {
//                                    YincangShijianClickTols.QingqiuMaidian(DIANJILIANXIRENTIJIAO);
                                }

                                if (!isShuju) {
//                                    YincangShijianClickTols.QingqiuMaidian(WULIANXIRENXINXITIJIAO);

                                }


                                isShuju = true;

                                xingmingYi = jingaojian1wenan2.getText().toString().trim();
                                zhuajiYi = duquDiyihangTxt1.getText().toString().trim();
                                xingmingEr = duhalashaoTxt5.getText().toString().trim();
                                zhuaji2 = duquDiyihangTxt3.getText().toString().trim();

                                binama11 = bianma1;
                                bianma22 = bianma2;
                                jiazaizhongWindows.hideKuangkuangIng();
//                                YincangShijianClickTols.QingqiuMaidian(TINGLIUYEMIANBUZHANSHI);
                                Intent intent = new Intent(JinJinGoGoJian12Activity.this, JinJinGoGoJian4Activity.class);
                                startActivity(intent);
                            } else {
                                jiazaizhongWindows.hideKuangkuangIng();
                                ToastUtil.showShortToast(configDianModel.nuclearTrialSpareMountainousBat);
                            }
                        } catch (Exception e) {
                            jiazaizhongWindows.hideKuangkuangIng();
                        }
                        jiazaizhongWindows.hideKuangkuangIng();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("wanghuaile1", error.getMessage(), error);
                if (error.toString().contains("java.net.UnknownHostException:") || error.toString().contains("NoConnectionError")) {
                    Log.e("wanghuaile2", error.getMessage(), error);
                    jiazaizhongWindows.hideKuangkuangIng();
                    Log.e("wanghuaile3", error.getMessage(), error);
                    baseaNonet.showPPw(Gravity.CENTER);
                }

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


    //请求联系人1关系
    private void qingqiuJiekou3(boolean isinitcache) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_ZIDIAN_LEIXING, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian12Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("squareBookshop", "relationship");//第一联系人
            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    List<ConfigDianModel.RoughNaturalProBean> bigAncientTastyHeadteacher = response.bigAncientTastyHeadteacher;
                    shshslist.clear();
                    if (bigAncientTastyHeadteacher != null && bigAncientTastyHeadteacher.size() > 0) {
                        shshslist.addAll(bigAncientTastyHeadteacher);
                        shuruZongXinxi2Shipei.notifyDataSetChanged();

                        //不是初始化时为了缓存的时候 才show
                        if (!isinitcache) {
                            guanxi1111.showPPw();
                        }
                        //不管是不是初始化，只要获取成功了，就设为已经缓存
                        cacheguanxiOk = true;
                    }
                } else {
//                    Toast.makeText(JinJinGoGoJian12Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    //请求联系人2关系
    private void qingqiuJiekou33(boolean isinitcache) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_ZIDIAN_LEIXING, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian12Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("squareBookshop", "secRelationship");//第二联系人
            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    List<ConfigDianModel.RoughNaturalProBean> bigAncientTastyHeadteacher = response.bigAncientTastyHeadteacher;
                    shshslist2.clear();
                    if (bigAncientTastyHeadteacher != null && bigAncientTastyHeadteacher.size() > 0) {
                        shshslist2.addAll(bigAncientTastyHeadteacher);
                        shuruZongXinxi2Shipei2.notifyDataSetChanged();

                        //不是初始化时为了缓存的时候 才show
                        if (!isinitcache) {
                            guanxi2222.showPPw();
                        }
                        //不管是不是初始化，只要获取成功了，就设为已经缓存
                        cacheguanxiOk2 = true;
                    }
                } else {
//                    Toast.makeText(JinJinGoGoJian12Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    private ChanpinMoxingPPWindows guanxi1111;
    private ChanpinMoxingPPWindows guanxi2222;


    float kasihiY;
    float yidongY = 0;
    RecyclerView popJinJianZiLiao01Rv;
    RecyclerView popJinJianZiLiao01Rv2;

    private void chushiHuaChangkou() {
        guanxi1111 = new ChanpinMoxingPPWindows(this);
        LayoutInflater chuangkouInflt = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View shituVisdjhsdj = chuangkouInflt.inflate(R.layout.wndw_gogoarrow_info, null);
        popJinJianZiLiao01Rv = shituVisdjhsdj.findViewById(R.id.popJinJianZiLiao01Rv);
        RelativeLayout htgrfasg = shituVisdjhsdj.findViewById(R.id.jythgrfsh);
        shshslist = new ArrayList<>();
//        shshslist2 = new ArrayList<>();
        LinearLayoutManager bujuGunali = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(bujuGunali);

        shuruZongXinxi2Shipei = new ShuruZongXinxi2Shipei(shshslist);
        popJinJianZiLiao01Rv.setAdapter(shuruZongXinxi2Shipei);
        shuruZongXinxi2Shipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

                String sunnyJuniorDowntown = shshslist.get(position).sunnyJuniorDowntown;
//                for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : shshslist) {
//                    if (roughNaturalProBean.sunnyJuniorDowntown == sunnyJuniorDowntown) {
//                        roughNaturalProBean.isSelect = true;
//                    } else {
//                        roughNaturalProBean.isSelect = false;
//                    }
//                }

                duquDiyihangTxt2.setText(sunnyJuniorDowntown);
                duquDiyihangTxt2xuanze.setText(sunnyJuniorDowntown);
                bianma1 = shshslist.get(position).averageEmbassyNationalVictoryDepth;

                shifouXiabu(false);
                shuruZongXinxi2Shipei.notifyDataSetChanged();
                guanxi1111.xiaohuiPPw();
            }
        });


        guanxi1111.chushihuaPPW(shituVisdjhsdj, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.6), null, true);


        RelativeLayout jgjorrr = shituVisdjhsdj.findViewById(R.id.jyhtgrefasg);
        jgjorrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guanxi1111.xiaohuiPPw();
            }
        });
        htgrfasg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        kasihiY = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        yidongY = ev.getY() - kasihiY;
                        if (yidongY > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            shituVisdjhsdj.scrollBy(0, -(int) yidongY);
                            kasihiY = ev.getY();
                        }
                        if (shituVisdjhsdj.getScrollY() > 0) { //避免向上拖动
                            shituVisdjhsdj.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (shituVisdjhsdj.getScrollY() < -shituVisdjhsdj.getHeight()
                                / 10 && yidongY > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            guanxi1111.xiaohuiPPw();
                        }
                        shituVisdjhsdj.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });
    }

    private void chushiHuaChangkou2() {
        guanxi2222 = new ChanpinMoxingPPWindows(this);
        LayoutInflater chuangkouInflt = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View shituVisdjhsdj = chuangkouInflt.inflate(R.layout.wndw_gogoarrow_info, null);
        popJinJianZiLiao01Rv2 = shituVisdjhsdj.findViewById(R.id.popJinJianZiLiao01Rv);
        RelativeLayout htgrfasg = shituVisdjhsdj.findViewById(R.id.jythgrfsh);
        shshslist2 = new ArrayList<>();
        LinearLayoutManager bujuGunali = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv2.setLayoutManager(bujuGunali);

        shuruZongXinxi2Shipei2 = new ShuruZongXinxi2Shipei(shshslist2);
        popJinJianZiLiao01Rv2.setAdapter(shuruZongXinxi2Shipei2);
        shuruZongXinxi2Shipei2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
//                String sunnyJuniorDowntown = shshslist.get(position).sunnyJuniorDowntown;
                String sunnyJuniorDowntown2 = shshslist2.get(position).sunnyJuniorDowntown;
//                for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : shshslist2) {
//                    if (roughNaturalProBean.sunnyJuniorDowntown == sunnyJuniorDowntown2) {
//                        roughNaturalProBean.isSelect = true;
//                    } else {
//                        roughNaturalProBean.isSelect = false;
//                    }
//                }

//                if ("1".equals(leileixing)) {
//                    duquDiyihangTxt2.setText(sunnyJuniorDowntown);
//                    duquDiyihangTxt2xuanze.setText(sunnyJuniorDowntown);
//                    bianma1 = shshslist.get(position).averageEmbassyNationalVictoryDepth;
//                } else if ("2".equals(leileixing)) {
                duhalashaoTxt6.setText(sunnyJuniorDowntown2);
                duhalashaoTxt6xuanze.setText(sunnyJuniorDowntown2);
                bianma2 = shshslist2.get(position).averageEmbassyNationalVictoryDepth;
//                }
                shifouXiabu(false);
                shuruZongXinxi2Shipei2.notifyDataSetChanged();
                guanxi2222.xiaohuiPPw();
            }
        });


        guanxi2222.chushihuaPPW(shituVisdjhsdj, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.6), null, true);


        RelativeLayout jgjorrr = shituVisdjhsdj.findViewById(R.id.jyhtgrefasg);
        jgjorrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guanxi2222.xiaohuiPPw();
            }
        });
        htgrfasg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        kasihiY = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        yidongY = ev.getY() - kasihiY;
                        if (yidongY > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            shituVisdjhsdj.scrollBy(0, -(int) yidongY);
                            kasihiY = ev.getY();
                        }
                        if (shituVisdjhsdj.getScrollY() > 0) { //避免向上拖动
                            shituVisdjhsdj.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (shituVisdjhsdj.getScrollY() < -shituVisdjhsdj.getHeight()
                                / 10 && yidongY > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            guanxi2222.xiaohuiPPw();
                        }
                        shituVisdjhsdj.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });
    }

    //回显
    private void qingqiuJiekou4() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SERACH_SHENFEN, SuoyouXinxiModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<SuoyouXinxiModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian12Activity.this, BendiHuancunTols.YONGHU_ID));
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
            public void onSuccess(SuoyouXinxiModel response) {
                Log.e("TAG", "response---->" + response);
                //加载完成
                YincangShijianClickTols.QingqiuMaidian(LIANXIRENYEJIAZAIWAN);

                jiazaizhongWindows.hideKuangkuangIng();
                SuoyouXinxiModel.FanhuiData naturalProBean = response.bigAncientTastyHeadteacher;
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    if (!TextUtils.isEmpty(naturalProBean.yellowBayPaceBeast)) {//v-pleasedStoneFactoryBrokenHole : "Empleado"
                        duquDiyihangTxt1.setText(naturalProBean.yellowBayPaceBeast);
                        zhuajiYi = naturalProBean.yellowBayPaceBeast;

                        binama11 = naturalProBean.freshCop + "";
                    }
                    if (!TextUtils.isEmpty(naturalProBean.humorousTrousersBadHealth)) {//v-pleasedStoneFactoryBrokenHole : "Empleado"
                        duquDiyihangTxt3.setText(naturalProBean.humorousTrousersBadHealth);
                        zhuaji2 = naturalProBean.humorousTrousersBadHealth;

                        bianma22 = naturalProBean.fastFortuneBirdFinalCartoon + "";
                    }
                    if (!TextUtils.isEmpty(naturalProBean.foreignReceiverRussianSunshineCurrency)) {
                        jingaojian1wenan2.setText(naturalProBean.foreignReceiverRussianSunshineCurrency);
                        xingmingYi = naturalProBean.foreignReceiverRussianSunshineCurrency;
                    }
                    if (!TextUtils.isEmpty(naturalProBean.irishFlamePassiveTypist)) {
                        duhalashaoTxt5.setText(naturalProBean.irishFlamePassiveTypist);
                        xingmingEr = naturalProBean.irishFlamePassiveTypist;
                    }
                    bianma1 = naturalProBean.freshCop + "";
                    bianma2 = naturalProBean.fastFortuneBirdFinalCartoon + "";

                    if (!TextUtils.isEmpty(naturalProBean.magicBusinessMedicalCivilBeauty)) {
                        duquDiyihangTxt2.setText(naturalProBean.magicBusinessMedicalCivilBeauty);
                        duquDiyihangTxt2xuanze.setText(naturalProBean.magicBusinessMedicalCivilBeauty);
                    }

                    if (!TextUtils.isEmpty(naturalProBean.undergroundPopcornLameVarietyTinyFriendship)) {
                        duhalashaoTxt6.setText(naturalProBean.undergroundPopcornLameVarietyTinyFriendship);
                        duhalashaoTxt6xuanze.setText(naturalProBean.undergroundPopcornLameVarietyTinyFriendship);
                    }

                    isShuju = !TextUtils.isEmpty(naturalProBean.yellowBayPaceBeast);
                    if (!isShuju) {
                        //未提交过加载完成
                        YincangShijianClickTols.QingqiuMaidian(JINRULIANXIRENYEFIRST);
                    }

                    shifouXiabu(false);
                } else {
//                    Toast.makeText(JinJinGoGoJian12Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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


    //回显
    private void qingqiuJiekou5() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.LIANXIPEOPLE_SEARCH_BBB, SuoyouXinxiModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<SuoyouXinxiModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian12Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("interestingGrillClerk", "3");
            }

            @Override
            public void onSuccess(SuoyouXinxiModel response) {
                Log.e("TAG", "response---->" + response);

                //加载完成
                YincangShijianClickTols.QingqiuMaidian(LIANXIRENYEJIAZAIWAN);
                jiazaizhongWindows.hideKuangkuangIng();
                SuoyouXinxiModel.FanhuiData fanhuiData = response.bigAncientTastyHeadteacher;
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    if (!TextUtils.isEmpty(fanhuiData.yellowBayPaceBeast)) {//v-pleasedStoneFactoryBrokenHole : "Empleado"
                        duquDiyihangTxt1.setText(fanhuiData.yellowBayPaceBeast);
                        duquDiyihangTxt1xuanze.setText(fanhuiData.yellowBayPaceBeast);
                        zhuajiYi = fanhuiData.yellowBayPaceBeast;

                        binama11 = fanhuiData.freshCop + "";
                    }
                    if (!TextUtils.isEmpty(fanhuiData.humorousTrousersBadHealth)) {//v-pleasedStoneFactoryBrokenHole : "Empleado"
                        duquDiyihangTxt3.setText(fanhuiData.humorousTrousersBadHealth);
                        duquDiyihangTxt3xuanze.setText(fanhuiData.humorousTrousersBadHealth);
                        zhuaji2 = fanhuiData.humorousTrousersBadHealth;

                        bianma22 = fanhuiData.fastFortuneBirdFinalCartoon + "";
                    }
                    if (!TextUtils.isEmpty(fanhuiData.foreignReceiverRussianSunshineCurrency)) {
                        jingaojian1wenan2.setText(fanhuiData.foreignReceiverRussianSunshineCurrency);
                        jingaojian1wenan2xuanze.setText(fanhuiData.foreignReceiverRussianSunshineCurrency);
                        xingmingYi = fanhuiData.foreignReceiverRussianSunshineCurrency;
                    }
                    if (!TextUtils.isEmpty(fanhuiData.irishFlamePassiveTypist)) {
                        duhalashaoTxt5.setText(fanhuiData.irishFlamePassiveTypist);
                        duhalashaoTxt5xuanze.setText(fanhuiData.irishFlamePassiveTypist);
                        xingmingEr = fanhuiData.irishFlamePassiveTypist;
                    }
                    if (!TextUtils.isEmpty(fanhuiData.freshCop)) {
                        bianma1 = fanhuiData.freshCop + "";
                    }
                    if (!TextUtils.isEmpty(fanhuiData.fastFortuneBirdFinalCartoon)) {
                        bianma2 = fanhuiData.fastFortuneBirdFinalCartoon + "";
                    }

                    if (!TextUtils.isEmpty(fanhuiData.magicBusinessMedicalCivilBeauty)) {
                        duquDiyihangTxt2.setText(fanhuiData.magicBusinessMedicalCivilBeauty);
                        duquDiyihangTxt2xuanze.setText(fanhuiData.magicBusinessMedicalCivilBeauty);
                    }

                    if (!TextUtils.isEmpty(fanhuiData.undergroundPopcornLameVarietyTinyFriendship)) {
                        duhalashaoTxt6.setText(fanhuiData.undergroundPopcornLameVarietyTinyFriendship);
                        duhalashaoTxt6xuanze.setText(fanhuiData.undergroundPopcornLameVarietyTinyFriendship);
                    }

                    isShuju = !TextUtils.isEmpty(fanhuiData.yellowBayPaceBeast);
                    if (!isShuju) {
                        //进入联系人页面 首次
                        YincangShijianClickTols.QingqiuMaidian(JINRULIANXIRENYEFIRST);
                        titishishiPPw.showPPw(Gravity.CENTER);
                    }


                    shifouXiabu(false);
                } else {
//                    Toast.makeText(JinJinGoGoJian12Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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


    //打开文件管理器,同时处理图片（判断权限）
    private SanfangRxppp sanfangRxppp;
    private int rrssss = 0;

    private void checkWritePermission(int code) {
        rrssss++;
        sanfangRxppp.qingQiu(LianXIRENPPPP)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d("requestLocation---->>>", "onSubscribe");
                    }

                    @Override
                    public void onNext(Boolean aBoolean) {
                        try {
                            if (!aBoolean) {
                                if (new PppQxPanduaner(MyJichuAplica.getInstance()).checkShaoPppp(/*Manifest.permission.READ_CONTACTS,*/ Manifest.permission.READ_PHONE_STATE)) {
                                    Log.d("requestLocation---->>>", "权限被拒绝");
//                                    if (!shouldShowRequestPermissionRationale(Manifest.permission.READ_CONTACTS)
//                                            || !shouldShowRequestPermissionRationale(Manifest.permission.READ_PHONE_STATE)
//                                    ) {
//                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝了 而且点击了不在提示（始终禁止） 所以 需要判断出来 有必要的话 需要用代码跳转到设置页面");
//                                        Toast.makeText(ReadData03Activity.this, getString(R.string.tusitishi_dizih_12), Toast.LENGTH_SHORT).show();
//                                        PermissionPageManagement.goToSetting(ReadData03Activity.this);
//                                    } else {
//                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝");
//                                    }
                                    chanpinMoxingPPWindows1.showPPw(Gravity.CENTER);

                                } else {
                                    Log.d("requestLocation---->>>", "权限被通过");
                                    //所有权限都已经授权
                                    Log.e("", "");
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.PICK");
                                    intent.addCategory("android.intent.category.DEFAULT");
                                    intent.setType("vnd.android.cursor.dir/phone_v2");
                                    startActivityForResult(intent, code);

                                }
/*                                if (new PermissionsChecker(ApplicationContext.getContext()).lacksPermissions(Manifest.permission.READ_PHONE_STATE)) {
                                    IKToast.show(getApplicationContext(), "手机状态被拒，不能享用一键登录功能");
                                    Log.d("requestLocation---->>>", "权限被拒绝");
                                } else {
                                    Log.d("requestLocation---->>>", "权限被拒绝");
                                }*/

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                Log.e("", "");
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.PICK");
                                intent.addCategory("android.intent.category.DEFAULT");
                                intent.setType("vnd.android.cursor.dir/phone_v2");
                                startActivityForResult(intent, code);
                            }
                        } catch (Exception e) {
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("requestLocation---->>>", "onError");
                    }

                    @Override
                    public void onComplete() {
                        Log.d("requestLocation---->>>", "onComplete");
                    }
                });
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
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian12Activity.this);
                                    ll.kaiqiDingwGongneng();
                                    //所有权限都已经授权
                                    gaogeXianchengStart();

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
                                DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian12Activity.this);
                                ll.kaiqiDingwGongneng();

                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                gaogeXianchengStart();
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case 1001:
                    List<String> list = duquZhuajiLixrr(data.getData());
                    if (list == null) {
                        duquDiyihangTxt1.requestFocus();
                        KeybordTols.showKeyboard(this, duquDiyihangTxt1);
                    } else {
                        if (list.get(1).equals(duquDiyihangTxt3xuanze.getText().toString())) {
                            ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_06));
                        } else if (list.get(1).equals(BendiHuancunTols.huoQuZifuchuan(this, YONGHU_ZHUAJI))) {
                            ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_01));
                        } else {
                            if (!TextUtils.isEmpty(list.get(0))) {
                                jingaojian1wenan2xuanze.setText(list.get(0));
                            }
                            if (!TextUtils.isEmpty(list.get(1))) {
                                duquDiyihangTxt1xuanze.setText(list.get(1));
                            }
                            shifouXiabu(false);
                        }

                    }


                    break;
                case 1002:
                    List<String> list1 = duquZhuajiLixrr(data.getData());
                    if (list1 == null) {
                        duquDiyihangTxt3.requestFocus();
                        KeybordTols.showKeyboard(this, duquDiyihangTxt3);
                    } else {
                        if (list1.get(1).equals(duquDiyihangTxt1xuanze.getText().toString())) {
                            ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_06));

                        } else if (list1.get(1).equals(BendiHuancunTols.huoQuZifuchuan(this, YONGHU_ZHUAJI))) {
                            ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_01));
                        } else {
                            if (!TextUtils.isEmpty(list1.get(0))) {
                                duhalashaoTxt5xuanze.setText(list1.get(0));
                            }
                            if (!TextUtils.isEmpty(list1.get(1))) {
                                duquDiyihangTxt3xuanze.setText(list1.get(1));
                            }
                            shifouXiabu(false);
                        }


                        break;
                    }
                    shifouXiabu(false);
            }
        }
    }

    @SuppressLint("Range")
    public List<String> duquZhuajiLixrr(Uri dddzhi) {
        List<String> list = new ArrayList<>();
        String name = "";
        String phone = "";
        // 创建内容解析者
        ContentResolver contentResolver = getContentResolver();
        Cursor liaxrYoubiao = null;
        if (dddzhi != null) {
            liaxrYoubiao = contentResolver.query(dddzhi,
                    new String[]{"display_name", "data1"}, null, null, null);
        }
        if (liaxrYoubiao == null) {
            jingojian3kefuxuanze.setVisibility(View.GONE);
            jingojian3kefushuru.setVisibility(View.VISIBLE);
            isxuanzeren = false;
            return null;
        } else {
            while (liaxrYoubiao.moveToNext()) {
                name = liaxrYoubiao.getString(liaxrYoubiao.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                phone = liaxrYoubiao.getString(liaxrYoubiao.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            }
            liaxrYoubiao.close();
            list.add(name);
            list.add(phone);
            return list;
        }

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

    private void chushihuaPpWindowd() {
        gaoQxPP_PPW = new ChanpinMoxingPPWindows(this);

        LayoutInflater bujuinflrt = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View bujuSHitu = bujuinflrt.inflate(R.layout.wndw_start, null);

        jieShouw_fhfj_Qxhjofjxian = bujuSHitu.findViewById(R.id.jieShouw_fhfj_Qxhjofjxian);
        maiso_des_opppp_wenan = bujuSHitu.findViewById(R.id.maiso_des_opppp_wenan);
        TextView quxiaoquxiao_fjdoj_buyaoquan = bujuSHitu.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        TextView gaoding_sure_djdj_yaogeiwo = bujuSHitu.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);
        TextView readDataTopText02 = bujuSHitu.findViewById(R.id.readDataTopText02);

//        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian12Activity.this, APPMINGZI))) {
//            readDataTopText02.setText(BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian12Activity.this, APPMINGZI));
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

                //测试说点取消按钮也不能再弹了
                BendiHuancunTols.commitZifuchuan(XITONG_YINSI, "1");
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
                BendiHuancunTols.commitZifuchuan(XITONG_YINSI, "1");
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

    public void shezhiShangmianWnean33(final TextView www) {
        ZifuchuanPinjieSpanTols.with(www)
//                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_01) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_02) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_011) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_012) + "\n\n")
                .chuangjian();
        www.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    public void shezhiSnWnean(final TextView wwww) {
        ZifuchuanPinjieSpanTols.with(wwww).diejiaapped(getString(R.string.qxppp_usestr_dianjijixu))
                .diejiaapped(getString(R.string.zhuyetab_tudai_des_pri))
                .setQianjingse(getResources().getColor(R.color.sezhi_argb_5377D5))
                .chuangjian();
        wwww.setHighlightColor(Color.parseColor("#88cccccc"));
//        SpanUtils.with(textView).append("我们更新了隐私政策，您可以通过阅读完整版")
//                .append("《隐私政策》")
//                .setForegroundColor(Color.parseColor("#007AFF"))
//                .append("了解详细信息。\n\n")
//                .append("如您同意更新后的")
//                .append("《隐私政策》")
//                .setForegroundColor(Color.parseColor("#007AFF"))
//                .append("，请点击“同意”继续接受我们的服务")
//                .create();
//        textView.setHighlightColor(Color.parseColor("#88cccccc"));
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
                QuanxianShipeiGuanliTols.tiaoZhuanZhuajiSetsPage(JinJinGoGoJian12Activity.this);
            }
        });

        chanpinMoxingPPWindows1.chushihuaPPW(sfjvjsHISSHIS, false, (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (gaoQxPP_PPW != null && gaoQxPP_PPW.huoquPPwShowFou()) {
            return false;
        }
        return super.dispatchTouchEvent(event);
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


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //将activity从列表中移除
        MyJichuAplica.getApplicaInstance().removedestoryActivity(currentactivity.get());
    }
}