package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
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
import com.google.gson.Gson;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.FengKongQianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ShangChuanModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.YzmFournumModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DingWeiSinglebangzhuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.GzipCompreTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuoquBigJsonUpShujuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.KeybordTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.QuanxianShipeiGuanliTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZifuchuanPinjieSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.DadianhuaGeiWomenActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ShangpinActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.ShuruZongXinxi2Shipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HangkaModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ConfigDianModel;
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

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols.shebeiId;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.XITONG_YINSI_BASIC;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.FUWU_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.YINSI_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuGodu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHUJUZHUAQUJUJUE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHUJUZHUAQUTONGYI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.KAISHISHANGCHAUNSHUJU;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.LIANXIRENDINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.NEWRISK_SAVEINFOOVER;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHUJUZHUAQUJIEGUO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHUJUZHUAQUSHOUQUANTONGGUOFIRST;
//import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_BRH_3;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FLYER_1;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FLYER_3;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.WANCHENGSHANGCHUANSHUJU;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.YINHANGKADINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIKAGENGXINTIJIAO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIKATIJIAOBINGJIAOYANGUO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIKATIJIOAEVEVYTIME;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUKAYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUKAYEFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.KAYEFANHUI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.KAYEJIAZAIWAN;
//import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_BRH_3;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FB_3;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FIB_3;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing2;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica.BAIOZHUTA;

import org.json.JSONObject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class JinJinGoGoJian5Activity extends MyJichuBsActivity implements View.OnClickListener {

    private ImageView jingojian1fanhui;
    private TextView jingojian1submit, jingojian1dibuxieyi, tyujhfgfgjfghgsd;
    private RelativeLayout jlsjfOjggl_fjj, dsnhakfj_FUF_jdgjJTpf, bhsaf_Thudf_knfRR;
    private ChanpinMoxingPPWindows kamingchengPPWindows;//银行名称
    private ChanpinMoxingPPWindows shoukuanleixingPPWindows;//收款类型
    private ChanpinMoxingPPWindows yinhangleixingPPWindows;//银行类型
    private List<ConfigDianModel.RoughNaturalProBean> shouList;//收款类型list
    private List<ConfigDianModel.RoughNaturalProBean> kamingchengList;//银行名称list
    private List<ConfigDianModel.RoughNaturalProBean> yinhangleixingList;//银行类型list
    private ShuruZongXinxi2Shipei shoukuanleixingShipei;//收款类型适配器
    private ShuruZongXinxi2Shipei yinhangleixingShipei;//银行类型适配器
    private ShuruZongXinxi2Shipei shuruZongXinxi2Shipei;//银行名称适配器
    private ImageView gkk_gjdiogdj_UTjfjf_fff;
    private ImageView jingojian1kefu;
    private TextView gajlf_Uueg_fjITUff, dfhfdgdfasfdh, myntrsgrdthgrs, dsnhakfj_FUas_fhgjJTpf;
    private TextView jhfgdfsadsgfd;//银行卡类型
    private EditText jifkfo_eogja_wwEGJ, sdgsdf_sgDFSF;//银行卡账号
    private EditText duquDiyihangTxt1, jingaojian1wenan2;//钱包账号
    private LinearLayout fnas_Uufisfi_ujOOO;
    private LinearLayout asfj_sfjijlll_wiitow, yjukyjthgrsa,toplayout1,qipaokuang;

    //bank code
    private String kahangBianma;
    //banktype code
    private String kahangLeixingBianma;

    private RelativeLayout str_siguienteRl;

    private boolean siShuju = false;

    //卡&账户
    private String duduWen111 = "";
    private String kakaBianma111 = "";
    private String shoujiBianma111 = "";
    private boolean chenggongOrNot = false;

    private String leileixing = "";
    private String dingdingiddan = "0";

    //首次保存KA信息，默认为true 获取回显的时候有内容改为false
    private boolean fisrtSaveXinx = true;
    private SanfangRxppp sanfangRxppp;

    private boolean cacheshoukuanleixingOk = false;
    private boolean cachekaleixingnOk = false;

    /**
     * 使用弱引用防止内存溢出
     */
    private WeakReference<Activity> currentactivity;

    private boolean submitButtonClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_gogoarrow5);

        setzhidign("S/2,600");

        //将activity添加到列表中
        if (currentactivity == null) {
            currentactivity = new WeakReference<Activity>(this);
        }
        MyJichuAplica.getApplicaInstance().addactivitytoList(currentactivity.get());


        if (getIntent() != null && getIntent().getStringExtra("orderId") != null) {
            dingdingiddan = getIntent().getStringExtra("orderId");
        }


        //动态设置状态栏高度
        ConstraintLayout.LayoutParams bujucanshu = (ConstraintLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        bujucanshu.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(bujucanshu);
        chushihuaWindpPP();
        shoukuanleixingWindpPP();
        yinhangleixingWindpPP();
        initYanzhengmaWindow();
        chushihuaPPwindows();

        leileixing = "collectionType";
        qingqiuJiekou3(leileixing, 0, true);
        leileixing = "bankAccountType";
        qingqiuJiekou3(leileixing, 0, true);
        jingojian1fanhui = findViewById(R.id.jingojian1fanhui);
//        gkk_gjdiogdj_UTjfjf_fff = findViewById(R.id.gkk_gjdiogdj_UTjfjf_fff);
        jingojian1submit = findViewById(R.id.jingojian1submit);
        jlsjfOjggl_fjj = findViewById(R.id.jlsjfOjggl_fjj);
        dsnhakfj_FUF_jdgjJTpf = findViewById(R.id.dsnhakfj_FUF_jdgjJTpf);
        dsnhakfj_FUas_fhgjJTpf = findViewById(R.id.dsnhakfj_FUas_fhgjJTpf);
        bhsaf_Thudf_knfRR = findViewById(R.id.bhsaf_Thudf_knfRR);
        gajlf_Uueg_fjITUff = findViewById(R.id.gajlf_Uueg_fjITUff);
        fnas_Uufisfi_ujOOO = findViewById(R.id.fnas_Uufisfi_ujOOO);
        asfj_sfjijlll_wiitow = findViewById(R.id.asfj_sfjijlll_wiitow);
        duquDiyihangTxt1 = findViewById(R.id.duquDiyihangTxt1);
        jhfgdfsadsgfd = findViewById(R.id.jhfgdfsadsgfd);
        jingaojian1wenan2 = findViewById(R.id.jingaojian1wenan2);
        jifkfo_eogja_wwEGJ = findViewById(R.id.jifkfo_eogja_wwEGJ);
        sdgsdf_sgDFSF = findViewById(R.id.sdgsdf_sgDFSF);
        dfhfdgdfasfdh = findViewById(R.id.dfhfdgdfasfdh);
        myntrsgrdthgrs = findViewById(R.id.myntrsgrdthgrs);
        tyujhfgfgjfghgsd = findViewById(R.id.tyujhfgfgjfghgsd);
        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);
        yjukyjthgrsa = findViewById(R.id.yjukyjthgrsa);
        jingojian1kefu = findViewById(R.id.jingojian1kefu);
        toplayout1 = findViewById(R.id.toplayout1);
        qipaokuang = findViewById(R.id.qipaokuang);

        if (getIntent() != null)
            chenggongOrNot = getIntent().getBooleanExtra("Home05ShiBaiFragment", false);

        if (chenggongOrNot) {
            //放款失败修改卡
            yjukyjthgrsa.setVisibility(View.VISIBLE);
            tyujhfgfgjfghgsd.setText(getString(R.string.jingogojian_xixifive_los));
            toplayout1.setVisibility(View.GONE);
            qipaokuang.setVisibility(View.GONE);
        } else {
            //正常填写页面
            yjukyjthgrsa.setVisibility(View.GONE);
            toplayout1.setVisibility(View.VISIBLE);
            qipaokuang.setVisibility(View.VISIBLE);
        }
        qingqiuJiekou1();
        qingqiuJiekouIndex();

        jingojian1dibuxieyi.setOnClickListener(this);
        jingojian1fanhui.setOnClickListener(this);
        jingojian1submit.setOnClickListener(this);
        jlsjfOjggl_fjj.setOnClickListener(this);
        dsnhakfj_FUF_jdgjJTpf.setOnClickListener(this);
        bhsaf_Thudf_knfRR.setOnClickListener(this);
        jingojian1kefu.setOnClickListener(this);

        jiazaizhongWindows.setCanceledOnTouchOutside(false);

        str_siguienteRl = findViewById(R.id.jingaojian1dibtnbuju);
        str_siguienteRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        gajlf_Uueg_fjITUff.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if(s.toString().contains("\n")){
//                    duquDiyihangTxt1.setText(s.toString().replace("\n", ""));
//                    duquDiyihangTxt1.setSelection(duquDiyihangTxt1.getText().toString().length());
//
//                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                String trim = s.toString().trim();
                if (trim.length() > 0) {
                    keFouxiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });

        duquDiyihangTxt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().contains("\n")) {
                    duquDiyihangTxt1.setText(s.toString().replace("\n", ""));
                    duquDiyihangTxt1.setSelection(duquDiyihangTxt1.getText().toString().length());

                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                String trim = s.toString().trim();
                if (trim.length() > 0) {
                    keFouxiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
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
                String trim = s.toString().trim();
                if (trim.length() > 0) {
                    keFouxiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });

        jifkfo_eogja_wwEGJ.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().contains("\n")) {
                    jifkfo_eogja_wwEGJ.setText(charSequence.toString().replace("\n", ""));
                    jifkfo_eogja_wwEGJ.setSelection(jifkfo_eogja_wwEGJ.getText().toString().length());

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (trim.length() > 0) {
                    keFouxiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });
        sdgsdf_sgDFSF.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().contains("\n")) {
                    sdgsdf_sgDFSF.setText(charSequence.toString().replace("\n", ""));
                    sdgsdf_sgDFSF.setSelection(sdgsdf_sgDFSF.getText().toString().length());

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (trim.length() > 0) {
                    keFouxiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });
        jingaojian1wenan2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                jingaojian1wenan2.setSelection(jingaojian1wenan2.getText().toString().length());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (trim.length() > 0) {
                    keFouxiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });

        if (!chenggongOrNot) {
            YincangShijianClickTols.QingqiuMaidian(JINRUKAYE);

        }
        sanfangRxppp = new SanfangRxppp(this);
        jianchaBIGjjsensonQQQppp();

        initBackWindow();


        if (!chenggongOrNot) {
            chushihuaPpWindowd();
            //跳过已填写的进件页
            //查询权限
            chaxunShanghuanNeddQuanxian1();
        }
    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

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
                                        YincangShijianClickTols.QingqiuMaidian(YINHANGKADINGWEI);
                                        DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian5Activity.this);
                                        ll.kaiqiDingwGongneng();
                                    } catch (Exception e) {

                                    }

                                }

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                try {
                                    YincangShijianClickTols.QingqiuMaidian(YINHANGKADINGWEI);
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian5Activity.this);
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
            YincangShijianClickTols.QingqiuMaidian(DIANJIKATIJIOAEVEVYTIME);
            if (keFouxiayibu(true)) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                smsCode = "";
                if (yanzhegnma01 != null) {
                    yanzhegnma01.setText("");
                }
                submitButtonClick = true;
                qingqiuJiekou2();
            }

        } else {
            if (DianjiQuickTols.clickkuaikuai()) {
                return;
            }
            if (!WngluoTols.youWangluoFou(JinJinGoGoJian5Activity.this)) {
                baseaNonet.showPPw(Gravity.CENTER);
                return;
            }
            Intent intent;
            switch (view.getId()) {
                case R.id.jingojian1fanhui:
                    uptopageononon();
                    break;

                case R.id.jlsjfOjggl_fjj:
                    KeybordTols.hideKeyboard(this);
                    leileixing = "collectionType";
                    if (cacheshoukuanleixingOk) {
                        for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : shouList) {
                            if (gajlf_Uueg_fjITUff.getText().toString().equals(roughNaturalProBean.sunnyJuniorDowntown)) {
                                roughNaturalProBean.isSelect = true;
                            } else {
                                roughNaturalProBean.isSelect = false;
                            }
                        }
                        shoukuanleixingShipei.notifyDataSetChanged();
                        shoukuanleixingPPWindows.showPPw();
                    } else {
                        qingqiuJiekou3(leileixing, 0, false);
                    }

                    break;
                case R.id.dsnhakfj_FUF_jdgjJTpf:
                    KeybordTols.hideKeyboard(this);
                    leileixing = "bankAccountType";
                    if (cachekaleixingnOk) {
                        for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : yinhangleixingList) {
                            if (jhfgdfsadsgfd.getText().toString().equals(roughNaturalProBean.sunnyJuniorDowntown)) {
                                roughNaturalProBean.isSelect = true;
                            } else {
                                roughNaturalProBean.isSelect = false;
                            }
                        }
                        yinhangleixingShipei.notifyDataSetChanged();
                        yinhangleixingPPWindows.showPPw();
                    } else {
                        qingqiuJiekou3(leileixing, 0, false);
                    }

                    break;
                case R.id.bhsaf_Thudf_knfRR:
                    KeybordTols.hideKeyboard(this);
                    leileixing = "bankNameList";
                    qingqiuJiekou3(leileixing, 0, false);
                    break;
                case R.id.jingojian1dibuxieyi://跳转隐私协议
                    XieyiShowTols.quH5YinsiPage(JinJinGoGoJian5Activity.this);
                    break;
                case R.id.jingojian1kefu://跳转ws kefu
                    if (!chenggongOrNot) {
                        XieyiShowTols.quH5KefuPage(JinJinGoGoJian5Activity.this, "9");

                    } else {
                        XieyiShowTols.quH5KefuPage(JinJinGoGoJian5Activity.this, "15");

                    }
//                    intent = new Intent(this, DadianhuaGeiWomenActivity.class);
//                    startActivity(intent);
                    break;
            }
        }

    }

    private void uptopageononon() {
        if (!chenggongOrNot)
            YincangShijianClickTols.QingqiuMaidian(KAYEFANHUI);
        //没提交过数据
        if (fisrtSaveXinx) {
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


    private boolean keFouxiayibu(boolean tantusibu) {
        boolean xiayibuKefou = true;
        //提交数据
        if ("1".equals(kakaBianmaLeixing)) {
            if (TextUtils.isEmpty(gajlf_Uueg_fjITUff.getText().toString().trim())
                    || TextUtils.isEmpty(jifkfo_eogja_wwEGJ.getText().toString().trim())
                    || TextUtils.isEmpty(jhfgdfsadsgfd.getText().toString()) || TextUtils.isEmpty(kahangBianma)
                    || TextUtils.isEmpty(jifkfo_eogja_wwEGJ.getText().toString().trim())
                    || TextUtils.isEmpty(sdgsdf_sgDFSF.getText().toString().trim())) {
                if (tantusibu) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
//                    Toast.makeText(JinJinGoGoJian5Activity.this, getString(R.string.tusitishi_dizih_04), Toast.LENGTH_SHORT).show();
                }
                xiayibuKefou = false;
            } else {
                if (!jifkfo_eogja_wwEGJ.getText().toString().trim().equals(sdgsdf_sgDFSF.getText().toString().trim())) {
                    if (tantusibu)
                        ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_07));
//                        Toast.makeText(JinJinGoGoJian5Activity.this, getString(R.string.tusitishi_dizih_07), Toast.LENGTH_SHORT).show();
                    xiayibuKefou = false;
                }
            }

        } else {
            if (TextUtils.isEmpty(duquDiyihangTxt1.getText().toString().trim()) || TextUtils.isEmpty(jingaojian1wenan2.getText().toString().trim())) {
                if (tantusibu) {
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
                }
                xiayibuKefou = false;
            } else {
                if (!duquDiyihangTxt1.getText().toString().trim().equals(jingaojian1wenan2.getText().toString().trim())) {
                    if (tantusibu) {
                        ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_07));
                    }
                    xiayibuKefou = false;
                }
            }

        }

        if (!tantusibu && xiayibuKefou) {
            jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_thgsdthgsfew));
        }

        return xiayibuKefou;
    }

    private void qingqiuJiekou1() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.YINKA_SERCH, HangkaModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<HangkaModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian5Activity.this, BendiHuancunTols.YONGHU_ID));
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
            public void onSuccess(HangkaModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                //v-maximumSkillfulClimate : "1234567891234567"
                //v-musicalCommonTiredToday : "Nequi"
                YincangShijianClickTols.QingqiuMaidian(KAYEJIAZAIWAN);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    List<HangkaModel.RoughNaturalProBean> huixianBean = response.bigAncientTastyHeadteacher;
                    if (huixianBean != null && huixianBean.size() > 0) {
                        //获取回显有卡信息，标识置为false 说明不是首次保存之前已经保存过
                        fisrtSaveXinx = false;
                        HangkaModel.RoughNaturalProBean roughNaturalProBean = huixianBean.get(0);
                        kakaBianmaLeixing = roughNaturalProBean.contentDullGeneration;
                        shoujiBianma111 = roughNaturalProBean.contentDullGeneration;
                        if (!TextUtils.isEmpty(roughNaturalProBean.musicalCommonTiredToday)) {
                            gajlf_Uueg_fjITUff.setText(roughNaturalProBean.musicalCommonTiredToday);
                            setSHituViewChange();
                        }
                        switch (GuojiaLeixing) {
                            case GuojiaLeixing2://秘鲁
                                if ("1".equals(kakaBianmaLeixing)) {
                                    if (!TextUtils.isEmpty(roughNaturalProBean.maximumSkillfulClimate)) {
                                        if (!chenggongOrNot) {
                                            jifkfo_eogja_wwEGJ.setText(roughNaturalProBean.maximumSkillfulClimate);
                                            sdgsdf_sgDFSF.setText(roughNaturalProBean.maximumSkillfulClimate);
                                        }
                                        duduWen111 = roughNaturalProBean.maximumSkillfulClimate;
                                    }
                                    if (!TextUtils.isEmpty(roughNaturalProBean.literarySimplePower)) {
                                        kahangLeixingBianma = roughNaturalProBean.literarySimplePower;
                                    }
                                    if (!TextUtils.isEmpty(roughNaturalProBean.mildDayNervousPasser)) {
                                        dsnhakfj_FUas_fhgjJTpf.setText(roughNaturalProBean.mildDayNervousPasser);
                                    }
                                    if (!TextUtils.isEmpty(roughNaturalProBean.generalSale)) {
                                        kahangBianma = roughNaturalProBean.generalSale;
                                        kakaBianma111 = roughNaturalProBean.generalSale;
                                    }
                                    if (!TextUtils.isEmpty(roughNaturalProBean.helpfulTechnicalNewUnfortunateHospital)) {
                                        jhfgdfsadsgfd.setText(roughNaturalProBean.helpfulTechnicalNewUnfortunateHospital);
                                    }
                                } else {
                                    if (!TextUtils.isEmpty(roughNaturalProBean.maximumSkillfulClimate)) {
                                        if (!chenggongOrNot) {
                                            duquDiyihangTxt1.setText(roughNaturalProBean.maximumSkillfulClimate);
                                            jingaojian1wenan2.setText(roughNaturalProBean.maximumSkillfulClimate);
                                        }

                                        duduWen111 = roughNaturalProBean.maximumSkillfulClimate;
                                    }
                                }
                                break;
                            default://西班牙
                                if ("1".equals(kakaBianmaLeixing)) {
                                    if (!TextUtils.isEmpty(roughNaturalProBean.maximumSkillfulClimate)) {
                                        jifkfo_eogja_wwEGJ.setText(roughNaturalProBean.maximumSkillfulClimate);
                                        sdgsdf_sgDFSF.setText(roughNaturalProBean.maximumSkillfulClimate);

                                        duduWen111 = roughNaturalProBean.maximumSkillfulClimate;
                                    }
                                    if (!TextUtils.isEmpty(roughNaturalProBean.mildDayNervousPasser)) {
                                        jhfgdfsadsgfd.setText(roughNaturalProBean.mildDayNervousPasser);

                                    }
                                    if (!TextUtils.isEmpty(roughNaturalProBean.literarySimplePower)) {
                                        kahangBianma = roughNaturalProBean.literarySimplePower;
                                        kakaBianma111 = roughNaturalProBean.literarySimplePower;
                                    }
                                } else {
                                    if (!TextUtils.isEmpty(roughNaturalProBean.maximumSkillfulClimate)) {
                                        duquDiyihangTxt1.setText(roughNaturalProBean.maximumSkillfulClimate);
                                        jingaojian1wenan2.setText(roughNaturalProBean.maximumSkillfulClimate);

                                        duduWen111 = roughNaturalProBean.maximumSkillfulClimate;
                                    }
                                }
                        }
                        siShuju = true;
                    } else {
                        siShuju = false;
                        YincangShijianClickTols.QingqiuMaidian(JINRUKAYEFIRST);

                        leileixing = "collectionType";
                        qingqiuJiekou3(leileixing, 1, false);
                    }

                    keFouxiayibu(false);
                } else {
//                    Toast.makeText(JinJinGoGoJian5Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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
        String apiUrl = ChangliangConfigTols.YINHANGKA_SAVE_OTP;
        if (chenggongOrNot) {
            apiUrl = ChangliangConfigTols.YINHANGKA_SAVE;
        }
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(apiUrl, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian5Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("contentDullGeneration", kakaBianmaLeixing);//
                map.put("skilledSoutheastQuickAntarcticNationality", "1"); //真分期

                if ("1".equals(kakaBianmaLeixing)) {
                    //银行卡
                    map.put("maximumSkillfulClimate", jifkfo_eogja_wwEGJ.getText().toString().trim());//bankCardNo 卡号
                    map.put("generalSale", kahangBianma);//bankCode
                    map.put("mildDayNervousPasser", dsnhakfj_FUas_fhgjJTpf.getText().toString());//bankName
                    map.put("literarySimplePower", kahangLeixingBianma);//bankAccountType
                } else {
                    // qianbao
                    map.put("maximumSkillfulClimate", duquDiyihangTxt1.getText().toString().trim());//bankCardNo 卡号
                }

                if (chenggongOrNot) {
                    map.put("tiredMommyEitherThickEnding", dingdingiddan + "");
                    map.put("hardToughInstitution", "1");
                }

                if (!TextUtils.isEmpty(smsCode)) {
                    map.put("chemicalSweatShoe", smsCode);
                }
            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    smsCode = "";
//                    if (ImpZhuyaoActivity.shiFouFirstJie) {
//                        YincangShijianClickTols.LianshuMaidian(LIANSHUXINXIOVER);
//                        YincangShijianClickTols.HuojiMaidian(HUOJIXINXIOVER);
//                    }

                    if (fisrtSaveXinx) {
                        YincangShijianClickTols.LianshuMaidian(THREECOMPANY_FB_3);
                        YincangShijianClickTols.HuojiMaidian(THREECOMPANY_FIB_3);
//                        YincangShijianClickTols.BrMaidian(THREECOMPANY_BRH_3);
//                        YincangShijianClickTols.FlyMaidian(THREECOMPANY_BRH_3.getName());
                        YincangShijianClickTols.FlyMaidian(THREECOMPANY_FLYER_3);
                        YincangShijianClickTols.QingqiuNewRiskMaidian(NEWRISK_SAVEINFOOVER);
                    }
                    fisrtSaveXinx = false;

                    if ("1".equals(kakaBianmaLeixing)) {
                        Log.d("TAG", "readTv011Str:" + duduWen111);
                        Log.d("TAG", "readTv011:" + jifkfo_eogja_wwEGJ.getText().toString().trim());
                        Log.d("TAG", "if" + (!duduWen111.isEmpty() && !duduWen111.equals(jifkfo_eogja_wwEGJ.getText().toString().trim())));

                        if (chenggongOrNot) {
                            YincangShijianClickTols.QingqiuMaidian(DIANJIKAGENGXINTIJIAO);
                        }

                        duduWen111 = jifkfo_eogja_wwEGJ.getText().toString().trim();
                        kakaBianma111 = kahangBianma;
                    } else {
                        duduWen111 = duquDiyihangTxt1.getText().toString().trim();
                    }
                    if (!siShuju) {
                        YincangShijianClickTols.QingqiuMaidian(DIANJIKATIJIAOBINGJIAOYANGUO);
                    }


                    siShuju = true;
                    shoujiBianma111 = kakaBianmaLeixing;

                    if (chenggongOrNot) {
                        ImpZhuyaoActivity.shiFou_rest_Menu = "1";
                        jiazaizhongWindows.hideKuangkuangIng();
                        Intent intent = new Intent(JinJinGoGoJian5Activity.this, ImpZhuyaoActivity.class);
                        startActivity(intent);
                        finish();
                    } else {

                        String privacy = BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian5Activity.this, XITONG_YINSI_BASIC);
                        if ("1".equals(privacy)) {
                            jiazaizhongWindows.showKuangkuangIng();
                            jiazaizhongWindows.setCancelable(false);

                            //授权成功去上传大数据 获取权限
                            chaxunShanghuanNeddQuanxian();
                        } else {
                            jiazaizhongWindows.hideKuangkuangIng();
                            gaoQxPP_PPW.showPPw(Gravity.CENTER);
                        }
                    }

                    qingchuDaojishi();
                    if (huoquyanzhegnma != null) {
                        huoquyanzhegnma.xiaohuiPPw();
                    }

                } else if (response.getaverageEmbassyNationalVictoryDepth() == -1015) {
                    jiazaizhongWindows.hideKuangkuangIng();
                    if (chenggongOrNot) {
                        //addBank接口不处理-1015
                        ToastUtil.showShortToast(response.nuclearTrialSpareMountainousBat);
                        return;
                    }
                    if (huoquyanzhegnma != null) {
                        huoquyanzhegnma.showPPw(Gravity.CENTER);
                        qingqiuJiekou5();
                    }
                } else {
//                    Toast.makeText(JinJinGoGoJian5Activity.this, response.nuclearTrialSpareMountainousBat, Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.nuclearTrialSpareMountainousBat);
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

    private void qingqiuJiekou3(String leilei, int ty, boolean isinit) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_ZIDIAN_LEIXING, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian5Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("squareBookshop", leilei);
            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    List<ConfigDianModel.RoughNaturalProBean> bigAncientTastyHeadteacher = response.bigAncientTastyHeadteacher;
                    kamingchengList.clear();
                    kamingchengList.addAll(bigAncientTastyHeadteacher);
                    if (ty == 0) {
                        if (bigAncientTastyHeadteacher != null && bigAncientTastyHeadteacher.size() > 0) {
//                        if (TextUtils.isEmpty(collectCode))
//                            collectCode = bigAncientTastyHeadteacher.get(0).averageEmbassyNationalVictoryDepth;
                            if ("collectionType".equals(leilei)) {
                                shouList.clear();
                                shouList.addAll(bigAncientTastyHeadteacher);
                                shoukuanleixingShipei.notifyDataSetChanged();
                                cacheshoukuanleixingOk = true;
                                if (!isinit) {
                                    shoukuanleixingPPWindows.showPPw();
                                }
                            } else if ("bankAccountType".equals(leilei)) {
                                yinhangleixingList.clear();
                                yinhangleixingList.addAll(bigAncientTastyHeadteacher);
                                yinhangleixingShipei.notifyDataSetChanged();
                                cachekaleixingnOk = true;
                                if (!isinit) {
//                                    for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : yinhangleixingList) {
//                                        if (jhfgdfsadsgfd.getText().toString().equals(roughNaturalProBean.sunnyJuniorDowntown)) {
//                                            roughNaturalProBean.isSelect = true;
//                                        } else {
//                                            roughNaturalProBean.isSelect = false;
//                                        }
//                                    }
//                                    yinhangleixingShipei.notifyDataSetChanged();
                                    yinhangleixingPPWindows.showPPw();
                                }
                            } else {
                                kamingchengList.clear();
                                kamingchengList.addAll(bigAncientTastyHeadteacher);
                                for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : kamingchengList) {
                                    if (dsnhakfj_FUas_fhgjJTpf.getText().toString().equals(roughNaturalProBean.sunnyJuniorDowntown)) {
                                        roughNaturalProBean.isSelect = true;
                                    } else {
                                        roughNaturalProBean.isSelect = false;
                                    }
                                }

                                shuruZongXinxi2Shipei.notifyDataSetChanged();
                                kamingchengPPWindows.showPPw();
                            }

//                            shuruZongXinxi2Shipei.notifyDataSetChanged();
//                            chanpinMoxingPPWindows.showPPw();
                        }
                    } else if (ty == 1 && bigAncientTastyHeadteacher.size() == 1) {
                        String sunnyJuniorDowntown = kamingchengList.get(0).sunnyJuniorDowntown;

                        if (!gajlf_Uueg_fjITUff.getText().toString().trim().equals(sunnyJuniorDowntown)) {
                            jifkfo_eogja_wwEGJ.setText("");
                            sdgsdf_sgDFSF.setText("");
                            duquDiyihangTxt1.setText("");
                            jingaojian1wenan2.setText("");
                        }

                        kakaBianmaLeixing = kamingchengList.get(0).averageEmbassyNationalVictoryDepth;
                        gajlf_Uueg_fjITUff.setText(sunnyJuniorDowntown);
                        setSHituViewChange();
                    }

                } else {
//                    Toast.makeText(JinJinGoGoJian5Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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
//                    Toast.makeText(JinJinGoGoJian5Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    float kaishiY;
    float yidongY = 0;

    //银行名称选择dialog
    private void chushihuaWindpPP() {
        kamingchengPPWindows = new ChanpinMoxingPPWindows(this);
        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_gogoarrow_info, null);
        RelativeLayout iconCloseRl = popupView.findViewById(R.id.jyhtgrefasg);
        RelativeLayout iconCloseVlRl = popupView.findViewById(R.id.jythgrfsh);
        RecyclerView popJinJianZiLiao01Rv = popupView.findViewById(R.id.popJinJianZiLiao01Rv);
        kamingchengList = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(linearLayoutManager);
        shuruZongXinxi2Shipei = new ShuruZongXinxi2Shipei(kamingchengList);
        popJinJianZiLiao01Rv.setAdapter(shuruZongXinxi2Shipei);
//        kamingchengPPWindows.chushihuaPPW(popupView);
        kamingchengPPWindows.chushihuaPPW(popupView, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.6), null, true);

        iconCloseRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kamingchengPPWindows.xiaohuiPPw();
            }
        });
        shuruZongXinxi2Shipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String sunnyJuniorDowntown = kamingchengList.get(position).sunnyJuniorDowntown;
//                for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : kamingchengList) {
//                    if (roughNaturalProBean.sunnyJuniorDowntown == sunnyJuniorDowntown) {
//                        roughNaturalProBean.isSelect = true;
//                    } else {
//                        roughNaturalProBean.isSelect = false;
//                    }
//                }
                if ("collectionType".equals(leileixing)) {
                    if (!gajlf_Uueg_fjITUff.getText().toString().trim().equals(sunnyJuniorDowntown)) {
                        jifkfo_eogja_wwEGJ.setText("");
                        sdgsdf_sgDFSF.setText("");
                        duquDiyihangTxt1.setText("");
                        jingaojian1wenan2.setText("");
                    }

                    kakaBianmaLeixing = kamingchengList.get(position).averageEmbassyNationalVictoryDepth;
                    gajlf_Uueg_fjITUff.setText(sunnyJuniorDowntown);
                    setSHituViewChange();
                } else if ("bankNameList".equals(leileixing)) {
                    kahangBianma = kamingchengList.get(position).averageEmbassyNationalVictoryDepth;
                    dsnhakfj_FUas_fhgjJTpf.setText(sunnyJuniorDowntown);
                } else if ("bankAccountType".equals(leileixing)) {
                    kahangLeixingBianma = kamingchengList.get(position).averageEmbassyNationalVictoryDepth;
                    jhfgdfsadsgfd.setText(sunnyJuniorDowntown);
                }
                keFouxiayibu(false);
                kamingchengPPWindows.xiaohuiPPw();
            }
        });

        iconCloseVlRl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        kaishiY = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        yidongY = ev.getY() - kaishiY;
                        if (yidongY > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            popupView.scrollBy(0, -(int) yidongY);
                            kaishiY = ev.getY();
                        }
                        if (popupView.getScrollY() > 0) { //避免向上拖动
                            popupView.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (popupView.getScrollY() < -popupView.getHeight()
                                / 10 && yidongY > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            kamingchengPPWindows.xiaohuiPPw();
                        }
                        popupView.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });
    }

    //收款类型选择dialog
    private void shoukuanleixingWindpPP() {
        shoukuanleixingPPWindows = new ChanpinMoxingPPWindows(this);
        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_gogoarrow_info, null);
        RelativeLayout iconCloseRl = popupView.findViewById(R.id.jyhtgrefasg);
        RelativeLayout iconCloseVlRl = popupView.findViewById(R.id.jythgrfsh);
        RecyclerView popJinJianZiLiao01Rv = popupView.findViewById(R.id.popJinJianZiLiao01Rv);
        shouList = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(linearLayoutManager);
        shoukuanleixingShipei = new ShuruZongXinxi2Shipei(shouList);
        popJinJianZiLiao01Rv.setAdapter(shoukuanleixingShipei);
//        shoukuanleixingPPWindows.chushihuaPPW(popupView);
        shoukuanleixingPPWindows.chushihuaPPW(popupView, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.6), null, true);

        iconCloseRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shoukuanleixingPPWindows.xiaohuiPPw();
            }
        });
        shoukuanleixingShipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String sunnyJuniorDowntown = shouList.get(position).sunnyJuniorDowntown;
//                for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : shouList) {
//                    if (roughNaturalProBean.sunnyJuniorDowntown == sunnyJuniorDowntown) {
//                        roughNaturalProBean.isSelect = true;
//                    } else {
//                        roughNaturalProBean.isSelect = false;
//                    }
//                }
                if ("collectionType".equals(leileixing)) {
                    if (!gajlf_Uueg_fjITUff.getText().toString().trim().equals(sunnyJuniorDowntown)) {
                        jifkfo_eogja_wwEGJ.setText("");
                        sdgsdf_sgDFSF.setText("");
                        duquDiyihangTxt1.setText("");
                        jingaojian1wenan2.setText("");

                        if (fisrtSaveXinx) {
                            dsnhakfj_FUas_fhgjJTpf.setText("");
                            jhfgdfsadsgfd.setText("");
                        }

                    }

                    kakaBianmaLeixing = shouList.get(position).averageEmbassyNationalVictoryDepth;
                    gajlf_Uueg_fjITUff.setText(sunnyJuniorDowntown);
                    setSHituViewChange();
                } else if ("bankNameList".equals(leileixing)) {
                    kahangBianma = shouList.get(position).averageEmbassyNationalVictoryDepth;
                    dsnhakfj_FUas_fhgjJTpf.setText(sunnyJuniorDowntown);
                } else if ("bankAccountType".equals(leileixing)) {
                    kahangLeixingBianma = shouList.get(position).averageEmbassyNationalVictoryDepth;
                    jhfgdfsadsgfd.setText(sunnyJuniorDowntown);
                }
                keFouxiayibu(false);
                shoukuanleixingPPWindows.xiaohuiPPw();
            }
        });

        iconCloseVlRl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        kaishiY = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        yidongY = ev.getY() - kaishiY;
                        if (yidongY > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            popupView.scrollBy(0, -(int) yidongY);
                            kaishiY = ev.getY();
                        }
                        if (popupView.getScrollY() > 0) { //避免向上拖动
                            popupView.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (popupView.getScrollY() < -popupView.getHeight()
                                / 10 && yidongY > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            shoukuanleixingPPWindows.xiaohuiPPw();
                        }
                        popupView.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });
    }

    //银行名称选择dialog
    private void yinhangleixingWindpPP() {
        yinhangleixingPPWindows = new ChanpinMoxingPPWindows(this);
        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_gogoarrow_info, null);
        RelativeLayout iconCloseRl = popupView.findViewById(R.id.jyhtgrefasg);
        RelativeLayout iconCloseVlRl = popupView.findViewById(R.id.jythgrfsh);
        RecyclerView popJinJianZiLiao01Rv = popupView.findViewById(R.id.popJinJianZiLiao01Rv);
        yinhangleixingList = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(linearLayoutManager);
        yinhangleixingShipei = new ShuruZongXinxi2Shipei(yinhangleixingList);
        popJinJianZiLiao01Rv.setAdapter(yinhangleixingShipei);
//        yinhangleixingPPWindows.chushihuaPPW(popupView);
        yinhangleixingPPWindows.chushihuaPPW(popupView, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.6), null, true);

        iconCloseRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yinhangleixingPPWindows.xiaohuiPPw();
            }
        });
        yinhangleixingShipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String sunnyJuniorDowntown = yinhangleixingList.get(position).sunnyJuniorDowntown;

                if ("collectionType".equals(leileixing)) {
                    if (!gajlf_Uueg_fjITUff.getText().toString().trim().equals(sunnyJuniorDowntown)) {
                        jifkfo_eogja_wwEGJ.setText("");
                        sdgsdf_sgDFSF.setText("");
                        duquDiyihangTxt1.setText("");
                        jingaojian1wenan2.setText("");
                    }

                    kakaBianmaLeixing = yinhangleixingList.get(position).averageEmbassyNationalVictoryDepth;
                    gajlf_Uueg_fjITUff.setText(sunnyJuniorDowntown);
                    setSHituViewChange();
                } else if ("bankNameList".equals(leileixing)) {
                    kahangBianma = yinhangleixingList.get(position).averageEmbassyNationalVictoryDepth;
                    dsnhakfj_FUas_fhgjJTpf.setText(sunnyJuniorDowntown);
                } else if ("bankAccountType".equals(leileixing)) {
                    kahangLeixingBianma = yinhangleixingList.get(position).averageEmbassyNationalVictoryDepth;
                    jhfgdfsadsgfd.setText(sunnyJuniorDowntown);
                }
                keFouxiayibu(false);
                yinhangleixingPPWindows.xiaohuiPPw();
            }
        });

        iconCloseVlRl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        kaishiY = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        yidongY = ev.getY() - kaishiY;
                        if (yidongY > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            popupView.scrollBy(0, -(int) yidongY);
                            kaishiY = ev.getY();
                        }
                        if (popupView.getScrollY() > 0) { //避免向上拖动
                            popupView.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (popupView.getScrollY() < -popupView.getHeight()
                                / 10 && yidongY > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            yinhangleixingPPWindows.xiaohuiPPw();
                        }
                        popupView.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });
    }

    private String kakaBianmaLeixing = "1";

    public void setSHituViewChange() {
        if (kakaBianmaLeixing.equals("1")) {//银行卡
//            gkk_gjdiogdj_UTjfjf_fff.setBackgroundResource(R.mipmap.useimg_bfvsdgdtg);
            dfhfdgdfasfdh.setText(getString(R.string.jingogojian_xixifive_cue));
            myntrsgrdthgrs.setText(getString(R.string.jingogojian_xixifive_con3));
            asfj_sfjijlll_wiitow.setVisibility(View.VISIBLE);
            fnas_Uufisfi_ujOOO.setVisibility(View.GONE);
        } else {
            //电子钱包
            dfhfdgdfasfdh.setText(getString(R.string.jingogojian_xixifive_cue2));
            myntrsgrdthgrs.setText(getString(R.string.jingogojian_xixifive_con));
            fnas_Uufisfi_ujOOO.setVisibility(View.VISIBLE);
            asfj_sfjijlll_wiitow.setVisibility(View.GONE);
//            gkk_gjdiogdj_UTjfjf_fff.setBackgroundResource(R.mipmap.useimg_hgrfeasrg);
        }
    }

    /**
     * 修改银行卡获取验证码
     */
    private ChanpinMoxingPPWindows huoquyanzhegnma;

    private EditText yanzhegnma01;

    private TextView daojishitext;
    private TextView huoquotp;
    private String smsCode = "";

    private String maskPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() < 4) {
            return "****"; // 如果电话号码不足四位，返回前四个星号
        }
        return "****" + phoneNumber.substring(phoneNumber.length() - 4);
    }

    //挽留弹框初始化
    private void initYanzhengmaWindow() {
        huoquyanzhegnma = new ChanpinMoxingPPWindows(this);

        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_xiugaiyanzhengyixia, null);

        TextView nonghao_mainbtn = popupView.findViewById(R.id.nonghao_mainbtn);

        String phone = BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian5Activity.this, BendiHuancunTols.YONGHU_ZHUAJI);
        TextView tishi = popupView.findViewById(R.id.fjldfdttldgd);
        ZifuchuanPinjieSpanTols.with(tishi).diejiaapped("Hemos enviado un código de verificación a su número de teléfono móvil de inicio de sesión ")
                .diejiaapped(maskPhoneNumber(phone))
                .setQianjingse(Color.parseColor("#E20C2B"))
                .diejiaapped(" para verificar que es usted. ")
                .chuangjian();

        yanzhegnma01 = popupView.findViewById(R.id.yanzhegnma01);
        yanzhegnma01.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String trim = charSequence.toString().trim();

                if (trim.length() >= 4) {
                    nonghao_mainbtn.setBackground(getResources().getDrawable(R.drawable.bj_thgsdthgsfew));
                    smsCode = yanzhegnma01.getText().toString().trim();
                    qingqiuJiekou2();
                } else {
                    nonghao_mainbtn.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        daojishitext = popupView.findViewById(R.id.daojishitext);
        huoquotp = popupView.findViewById(R.id.huoquotp);
        huoquotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countover) {
                    return;
                }
                qingqiuJiekou5();
            }
        });
        popupView.findViewById(R.id.nonghao_mainbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String code = yanzhegnma01.getText().toString().trim();
                    if (TextUtils.isEmpty(code) || code.length() < 4) {
                        ToastUtil.showShortToast(getString(R.string.gaozhanghao_pagewenan_jhgd));
                        return;
                    }
                    smsCode = code;
                    qingqiuJiekou2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        popupView.findViewById(R.id.nonghao_mainbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String code = yanzhegnma01.getText().toString().trim();
                    if (TextUtils.isEmpty(code) || code.length() < 4) {
                        ToastUtil.showShortToast(getString(R.string.gaozhanghao_pagewenan_jhgd));
                        return;
                    }
                    smsCode = code;
                    qingqiuJiekou2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        popupView.findViewById(R.id.jinggaotupian).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                huoquyanzhegnma.xiaohuiPPw();
                huoquotp.setVisibility(View.GONE);
                if (jianjianshijian != null) {
                    jianjianshijian.cancel();
                    countover = false;
                }
            }
        });

        huoquyanzhegnma.chushihuaPPW(popupView, false
                , (int) (ZhuajiPingmuTols.huoquPingmuKuandu(this) * 0.9), ViewGroup.LayoutParams.WRAP_CONTENT, new ChanpinMoxingPPWindows.OnDianjiHuidiaoJianting() {
                    @Override
                    public void onDianjiQUxioa() {
                        if (jianjianshijian != null) {
                            jianjianshijian.cancel();
                            countover = false;
                        }
                        daojishitext.setText("");
                    }
                }, true);
    }

    private CountDownTimer jianjianshijian;
    boolean countover = false;

    private void kaishiZhengchangDaoshushijian() {
        huoquotp.setVisibility(View.GONE);
        huoquotp.setEnabled(true);
        huoquotp.setBackgroundResource(R.drawable.bj_nbvcsdvfb);
        jianjianshijian = new CountDownTimer(60 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d(BAIOZHUTA, "onTick  " + millisUntilFinished / 1000);
                countover = true;
                daojishitext.setText("Volver a obtener " + millisUntilFinished / 1000 + "s");
            }

            @Override
            public void onFinish() {
                Log.d(BAIOZHUTA, "onFinish -- 倒计时结束");
                countover = false;
                daojishitext.setText("");
                huoquotp.setVisibility(View.VISIBLE);
            }
        };
        jianjianshijian.start();
    }

    private void qingqiuJiekou5() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.HUOQUYANZHENGMA, YzmFournumModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<YzmFournumModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("powerfulStrangerBackGuidance", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian5Activity.this, BendiHuancunTols.YONGHU_ZHUAJI));
            }

            @Override
            public void onSuccess(YzmFournumModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.averageEmbassyNationalVictoryDepth == 1000) {

                    kaishiZhengchangDaoshushijian();


                } else {
//                    Toast.makeText(JinJinGoGoJian5Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
                    huoquotp.setVisibility(View.VISIBLE);
                    huoquotp.setEnabled(false);
                    huoquotp.setBackgroundResource(R.drawable.bj_hgfafesrgfeasrg);
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
                        Intent intent = new Intent(JinJinGoGoJian5Activity.this, JinJinGoGoJian6Activity.class);
                        startActivity(intent);
                    } else {
                        //不需要上传,查询风控额度
                        qingqiuJiekouFKqian();
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

    private void qingqiuJiekouFKqian() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.CHAXUNFENGKONGJINE, FengKongQianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<FengKongQianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {

            }

            @Override
            public void onSuccess(FengKongQianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {

                    String shallowRestRepairsLevel = response.getBigAncientTastyHeadteacher().getShallowRestRepairsLevel();
                    if ("0".equals(shallowRestRepairsLevel)) {
                        //风控金额等待页面
                        Intent intent = new Intent(JinJinGoGoJian5Activity.this, JinJinGoGoJian6Activity.class);
                        intent.putExtra("fktype", "1");
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(JinJinGoGoJian5Activity.this, ShangpinActivity.class);
                        startActivity(intent);
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
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian5Activity.this);
                                    ll.kaiqiDingwGongneng();
                                    //所有权限都已经授权

                                    qingqiuJiekouJiancha();
                                }


                            } else {

                                DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian5Activity.this);
                                ll.kaiqiDingwGongneng();
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权

                                qingqiuJiekouJiancha();
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
                QuanxianShipeiGuanliTols.tiaoZhuanZhuajiSetsPage(JinJinGoGoJian5Activity.this);
            }
        });

        chanpinMoxingPPWindows1.chushihuaPPW(sfjvjsHISSHIS, false, (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

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
        qingchuDaojishi();
        //将activity从列表中移除
        MyJichuAplica.getApplicaInstance().removedestoryActivity(currentactivity.get());
    }

    private void qingchuDaojishi() {
        if (jianjianshijian != null) {
            jianjianshijian.cancel();
            countover = false;
        }
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

    // 跳过进件页逻辑

    // 判断是否都已经授权大json所需权限组
    private void chaxunShanghuanNeddQuanxian1() {
        jiazaizhongWindows.showKuangkuangIng();
        if (new PppQxPanduaner(MyJichuAplica.getInstance()).checkShaoPppp(
                Manifest.permission.CAMERA,
                Manifest.permission.READ_CALENDAR,
                Manifest.permission.ACCESS_WIFI_STATE,
                Manifest.permission.ACCESS_NETWORK_STATE,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.READ_CALL_LOG,
                Manifest.permission.READ_SMS,
                Manifest.permission.READ_PHONE_STATE
        )) {
            Log.d("requestLocation---->>>", "权限被拒绝");
            jiazaizhongWindows.hideKuangkuangIng();
        } else {
            Log.d("requestLocation---->>>", "权限被通过");
            DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian5Activity.this);
            ll.kaiqiDingwGongneng();
            //所有权限都已经授权

            checkUpload();
        }

    }

    private void checkUpload() {
        //没有执行中的任务
        if (!ChangliangConfigTols.jsonUpload) {
            qingqiuJiekouJiancha1();
        } else {
            jiazaizhongWindows.hideKuangkuangIng();
        }
    }

    ChanpinMoxingPPWindows gaoQxPP_PPW;
    private TextView jieShouw_fhfj_Qxhjofjxian;
    private TextView maiso_des_opppp_wenan;

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


        shezhiShangmianWnean2(jieShouw_fhfj_Qxhjofjxian);
        shezhiSnWnean2(maiso_des_opppp_wenan);

        bujuSHitu.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                gaoQxPP_PPW.xiaohuiPPw();
            }
        });
        bujuSHitu.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }

                BendiHuancunTols.commitZifuchuan(XITONG_YINSI_BASIC, "1");
                gaoQxPP_PPW.xiaohuiPPw();

                if(submitButtonClick){
                    jiazaizhongWindows.showKuangkuangIng();
                    jiazaizhongWindows.setCancelable(false);
                    //授权成功去上传大数据 获取权限
                    chaxunShanghuanNeddQuanxian();
                }else{
                    gaogeXianchengStart();
                }

            }
        });

        gaoQxPP_PPW.chushihuaPPW(bujuSHitu, false, (int) (huoquPingmuKuandu(this) * 0.8), (int) (huoquPingmuGodu(this) * 0.8), new ChanpinMoxingPPWindows.OnDianjiHuidiaoJianting() {
            @Override
            public void onDianjiQUxioa() {
            }
        }, true);
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

    public void shezhiShangmianWnean2(final TextView WWWW) {
        ZifuchuanPinjieSpanTols.with(WWWW)
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_09) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_010) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_011) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_012) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_02301) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_02401) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_07) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_08) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_017) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_018) + "\n\n")
                .chuangjian();
        WWWW.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    private void qingqiuJiekouJiancha1() {
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
                        String privacy = BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian5Activity.this, XITONG_YINSI_BASIC);
                        if ("1".equals(privacy)) {
                            jiazaizhongWindows.showKuangkuangIng();
                            jiazaizhongWindows.setCancelable(false);

                            gaogeXianchengStart();
                        } else {
                            gaoQxPP_PPW.showPPw(Gravity.CENTER);
                        }
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

                    chuanShuju = HuoquBigJsonUpShujuTols.getJson(JinJinGoGoJian5Activity.this, slimEagerSignal);
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
}