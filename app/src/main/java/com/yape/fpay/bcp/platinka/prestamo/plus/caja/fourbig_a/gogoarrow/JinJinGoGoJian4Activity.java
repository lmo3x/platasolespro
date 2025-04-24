package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import top.zibin.luban.Luban;
import top.zibin.luban.OnCompressListener;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.bigkoo.pickerview.builder.TimePickerBuilder;
import com.bigkoo.pickerview.listener.CustomListener;
import com.bigkoo.pickerview.view.TimePickerView;
import com.bumptech.glide.request.RequestOptions;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.UnintoTabModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.TuImgYasuoUtils;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DingWeiSinglebangzhuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.KeybordTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhaopianXuanzeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.ShuruZongXinxi2Shipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ConfigDianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PersonShenfenZhaoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.SuoyouXinxiModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.PppQxPanduaner;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.SanfangRxppp;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.TuxiangTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.QuanxianShipeiGuanliTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.TupianZhiliang;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.ShangchuanQingqiu;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.QingqiuFanhuiJianting;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.TupianGongjuShanghuanByVoleyley;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols.shebeiId;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols.SHANGCHUAN_DANZHANGSHENFENZHENG;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIFANMIAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIZHENGMIAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.FANMIANPAICHENGGONG;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.FANMIANPAISHIBAI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUSHENFENYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.KAISHISHANGCHAUNSHENFENZHENG;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.NEWRISK_DIANJIFANMIANFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.NEWRISK_DIANJIRENLIANFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.NEWRISK_DIANJIZHENGMIANFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.NEWRISK_FANMIANSHIBAI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.NEWRISK_RENLIANSHIBAI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.NEWRISK_ZHENGMIANSHIBAI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.PAIZHAOSHOUQUANJIEGUO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.RENLIANCHENGONG;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.RENLIANSHIBAI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHANGCHAUNSHENFENZHAOFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHANGCHUANRENLIANFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHENFENTIJIAO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHENFENTIJIAOJIAOYANTONGGUOFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHENFENYEJIAZAIWAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHENFENZHAOPIANJIAZAIWAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHENFENZHENGDINGWEI;
//import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_BRH_2;
//import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_BRH_2;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FB_2;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FIB_2;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FLYER_2;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.ZHENGMIANPAICHENGGONG;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.ZHENGMIANPAISHIBAI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica.getInstance;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuGodu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIRENLIAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHENFENYEFANHUI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing2;

public class JinJinGoGoJian4Activity extends MyJichuBsActivity implements View.OnClickListener {

    private ImageView jingojian1fanhui;
    private TextView jingojian1submit, jingojian1dibuxieyi, jdgjl_jgoiw_TVT, jfjIRfjfi_gjif_Reddd;
    private RelativeLayout jdsgj_FJOfj_fjfjs, jlsjfOjggl_fjj, hgdfjai_kPifjPp_jfPief, sjfo_jigjRl_djgiIT;
    private Uri tupianUriiiii;
    private ImageView tututpaisnd1;
    private ImageView tututpaisnd2;
    private ImageView tututpaisnd3;
    private ImageView jingojian1kefu;
    private ImageView dangqianpaizhuangtai;
    private ImageView dangqianpaizhuangtai2;
    private ImageView dangqianpaizhuangtai3;
    private ChanpinMoxingPPWindows kaleixingPpw;
    private ChanpinMoxingPPWindows xingbiePpw;
    private ChanpinMoxingPPWindows chanpinMoxingPPWindows1;
    private List<ConfigDianModel.RoughNaturalProBean> kaleixingjfList;
    private List<ConfigDianModel.RoughNaturalProBean> ssexmjfList;
    private ShuruZongXinxi2Shipei xingbieshipei;
    private ShuruZongXinxi2Shipei kaleixingshipei;
    private ShuruZongXinxi2Shipei shuruZongXinxi2Shipei1;
    private TextView duhalashaoTxt5;

    private TextView duhalashaoTxt6;
    private EditText kakaka_shenfenzhenghao;
    private EditText jingaojian1wenan2;
    private EditText duquDiyihangTxt2;
    private EditText duquDiyihangTxt3;


    private Bitmap zhengmianTu = null;
    private Bitmap beimianTu = null;
    private Bitmap renlianTu = null;

    //新拍照或者选择之后 是否有图片地址
    private boolean zhengmianTuDizhi = false;
    private boolean beimianTuDizhi = false;
    private boolean renlianTuDizhi = false;

    //页面初始化之初 是否有图片
    private boolean zhengmianTuOne = false;
    private boolean beimianTuOne = false;
    private boolean renlianTuOne = false;

    private String leixing = "";
    private String dangrcuLeixing = "";

    private RelativeLayout jingaojian1dibtnbuju;

    private RequestOptions options = RequestOptions.circleCropTransform();

    private String xingbieBianma = "0";
    private String xingBieWenan = "";

    //首次保存身份证信息，默认为true 获取回显的时候有内容改为false
    private boolean fisrtSaveXinx = true;
    //首次保存人脸信息，默认为true 获取回显的时候有内容改为false
    private boolean fisrtSaveLianXinx = true;

    private boolean fisrtSaveZhengmian = true;
    private boolean fisrtSaveFanmian = true;
    private TimePickerView build;

    public static final int TAKE_PHOTO = 1;//启动相机标识
    public static final int SELECT_PHOTO = 2;//启动相册标识

    //因为不同接口 所以指引填写窗口只能弹一次
    private boolean isarleadshowWanliutitishishi = false;

    /**
     * 使用弱引用防止内存溢出
     */
    private WeakReference<Activity> currentactivity;

    private boolean cachekaLeixing = false;//缓存性别是否成功
    private boolean cacheXingbie = false;//缓存性别是否成功

    private ImageView sfztupian;
    private TextView dianjishouqilai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_gogoarrow4);

        setzhidign("S/1,600");

        //将activity添加到列表中
        if (currentactivity == null) {
            currentactivity = new WeakReference<Activity>(this);
        }
        MyJichuAplica.getApplicaInstance().addactivitytoList(currentactivity.get());


        chushihuakaleixingYPPW();
        chushihuaYxingbiePPW();
        chushiHUAppWind3();
        chushihuaPPiWindwos();
        //无网络弹框
        chaungjianPPw();
        //动态设置状态栏高度
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        layoutParams.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(layoutParams);

        jingojian1fanhui = findViewById(R.id.jingojian1fanhui);
        jingojian1submit = findViewById(R.id.jingojian1submit);
        jlsjfOjggl_fjj = findViewById(R.id.jlsjfOjggl_fjj);
        jdsgj_FJOfj_fjfjs = findViewById(R.id.jdsgj_FJOfj_fjfjs);
        hgdfjai_kPifjPp_jfPief = findViewById(R.id.hgdfjai_kPifjPp_jfPief);
        tututpaisnd1 = findViewById(R.id.tututpaisnd1);
        tututpaisnd2 = findViewById(R.id.tututpaisnd2);
        tututpaisnd3 = findViewById(R.id.tututpaisnd3);
        dangqianpaizhuangtai = findViewById(R.id.dangqianpaizhuangtai);
        dangqianpaizhuangtai2 = findViewById(R.id.dangqianpaizhuangtai2);
        dangqianpaizhuangtai3 = findViewById(R.id.dangqianpaizhuangtai3);
        //身份证号
        kakaka_shenfenzhenghao = findViewById(R.id.kakaka_shenfenzhenghao);
        //身份证姓名
        jingaojian1wenan2 = findViewById(R.id.jingaojian1wenan2);
        //第一个姓
        duquDiyihangTxt2 = findViewById(R.id.duquDiyihangTxt2);
        //第2个姓
        duquDiyihangTxt3 = findViewById(R.id.duquDiyihangTxt3);
        RelativeLayout dududuwuwuwu = findViewById(R.id.dududuwuwuwu);//性别
        RelativeLayout dududuliuliuliu = findViewById(R.id.dududuliuliuliu);//出生年月
        //性别
        duhalashaoTxt5 = findViewById(R.id.duhalashaoTxt5);
        //出生年月
        duhalashaoTxt6 = findViewById(R.id.duhalashaoTxt6);
        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);
        jdgjl_jgoiw_TVT = findViewById(R.id.jdgjl_jgoiw_TVT);
        sjfo_jigjRl_djgiIT = findViewById(R.id.sjfo_jigjRl_djgiIT);
        jfjIRfjfi_gjif_Reddd = findViewById(R.id.jfjIRfjfi_gjif_Reddd);
        jingojian1kefu = findViewById(R.id.jingojian1kefu);
        dianjishouqilai = findViewById(R.id.dianjishouqilai);
        sfztupian = findViewById(R.id.sfztupian);

        jingojian1dibuxieyi.setOnClickListener(this);
        jingojian1fanhui.setOnClickListener(this);
        jingojian1submit.setOnClickListener(this);
        jlsjfOjggl_fjj.setOnClickListener(this);
        jdsgj_FJOfj_fjfjs.setOnClickListener(this);
        hgdfjai_kPifjPp_jfPief.setOnClickListener(this);
        dududuliuliuliu.setOnClickListener(this);
        dududuwuwuwu.setOnClickListener(this);
        sjfo_jigjRl_djgiIT.setOnClickListener(this);
        jingojian1kefu.setOnClickListener(this);
        dianjishouqilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExample();
            }
        });

        qingqiuJiekou1();
        qingqiuJiekouTu();
        qingqiuJiekouIndex();
        //缓存性别
        leixing = "sex";
        dedaoXingbie(leixing, true);


        leixing = "curpType";
        dedaoXingbie(leixing, true);


        rrxxxPPP = new SanfangRxppp(this);

        jiazaizhongWindows.setCanceledOnTouchOutside(false);

        jingaojian1dibtnbuju = findViewById(R.id.jingaojian1dibtnbuju);
        jingaojian1dibtnbuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        kakaka_shenfenzhenghao.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                if (charSequence.toString().startsWith(" ")) {
//                    kakaka_shenfenzhenghao.setText(charSequence.toString().replace(" ", ""));
//                }
//                kakaka_shenfenzhenghao.setSelection(kakaka_shenfenzhenghao.getText().toString().length());
            }

            @Override
            public void afterTextChanged(Editable editable) {

                String trim = editable.toString().trim();

                if (trim.length() > 0) {
                    sifouKeXiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });
        duquDiyihangTxt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().contains("\n")) {
                    duquDiyihangTxt2.setText(charSequence.toString().replace("\n", ""));
                    duquDiyihangTxt2.setSelection(duquDiyihangTxt2.getText().toString().length());

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String qukonggewenan = editable.toString().trim();

                if (qukonggewenan.length() > 0) {
                    sifouKeXiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });
        duquDiyihangTxt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().contains("\n")) {
                    duquDiyihangTxt3.setText(charSequence.toString().replace("\n", ""));
                    duquDiyihangTxt3.setSelection(duquDiyihangTxt3.getText().toString().length());

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (trim.length() > 0) {
                    sifouKeXiayibu(false);
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
                if (charSequence.toString().contains("\n")) {
                    jingaojian1wenan2.setText(charSequence.toString().replace("\n", ""));
                    jingaojian1wenan2.setSelection(jingaojian1wenan2.getText().toString().length());

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String trim = editable.toString().trim();
                if (trim.length() > 0) {
                    sifouKeXiayibu(false);
                } else {
                    jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });

        YincangShijianClickTols.QingqiuMaidian(JINRUSHENFENYE);

        jianchaBIGjjsensonQQQppp();

        initBackWindow();
        initShenfenTipsWindow();
    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    int photo = 0;

    //请求定位权限
    private void jianchaBIGjjsensonQQQppp() {
        rrxxxPPP.qingQiu(Manifest.permission.ACCESS_COARSE_LOCATION)
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
                                        YincangShijianClickTols.QingqiuMaidian(SHENFENZHENGDINGWEI);
                                        DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian4Activity.this);
                                        ll.kaiqiDingwGongneng();
                                    } catch (Exception e) {

                                    }

                                }

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                try {
                                    YincangShijianClickTols.QingqiuMaidian(SHENFENZHENGDINGWEI);
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJian4Activity.this);
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
            //提交
            if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                baseaNonet.showPPw(Gravity.CENTER);
                return;
            }
            if (sifouKeXiayibu(true)) {
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                YincangShijianClickTols.QingqiuMaidian(SHENFENTIJIAO);

                qingqiuJiekouTu2ForbiddenNull();
//                    qingqiuJiekou2();
            }

        } else {
            if (DianjiQuickTols.clickkuaikuai()) {
                return;
            }
            Intent intent;
            switch (view.getId()) {
                //返回
                case R.id.jingojian1fanhui:
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    uptopageononon();

                    break;

                //正面拍照
                case R.id.jlsjfOjggl_fjj:


                    if (fisrtSaveZhengmian) {
                        YincangShijianClickTols.QingqiuNewRiskMaidian(NEWRISK_DIANJIZHENGMIANFIRST);
                    }
                    YincangShijianClickTols.QingqiuMaidian(DIANJIZHENGMIAN);
                    //photo1
//                if ((TextUtils.isEmpty(renlianTu) && TextUtils.isEmpty(renlianTuDizhi))
//                        || (TextUtils.isEmpty(zhengmianTu) && TextUtils.isEmpty(zhengmianTuDizhi))) {
                    photo = 1001;
                    jianchaPageXuyaoPPP(1001);
//                }
                    break;
                //反面拍照
                case R.id.jdsgj_FJOfj_fjfjs:

                    if (fisrtSaveFanmian) {
                        YincangShijianClickTols.QingqiuNewRiskMaidian(NEWRISK_DIANJIFANMIANFIRST);
                    }
                    YincangShijianClickTols.QingqiuMaidian(DIANJIFANMIAN);
                    //photo2
//                if ((TextUtils.isEmpty(renlianTu) && TextUtils.isEmpty(renlianTuDizhi))
//                        || (TextUtils.isEmpty(beimianTu) && TextUtils.isEmpty(beimianTuDizhi))) {
                    photo = 1002;
                    jianchaPageXuyaoPPP(1002);
//                }
                    break;
                //人脸拍照
                case R.id.hgdfjai_kPifjPp_jfPief:
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                        wuwangluoKuang.showPPw(Gravity.CENTER);
                        return;
                    }

                    if (fisrtSaveLianXinx) {
                        YincangShijianClickTols.QingqiuNewRiskMaidian(NEWRISK_DIANJIRENLIANFIRST);
                    }
                    YincangShijianClickTols.QingqiuMaidian(DIANJIRENLIAN);
                    //photo3
//                if ((!TextUtils.isEmpty(zhengmianTu) || !TextUtils.isEmpty(zhengmianTuDizhi))
//                        && (!TextUtils.isEmpty(beimianTu) || !TextUtils.isEmpty(beimianTuDizhi))) {
                    photo = 1003;
                    jianchaPageXuyaoPPP(1003);
//                } else {
//                    Toast.makeText(JinJinGoGoJian4Activity.this, getString(R.string.tusitishi_dizih_17), Toast.LENGTH_SHORT).show();
//                }
                    break;
                case R.id.dududuwuwuwu:
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    KeybordTols.hideKeyboard(this);
                    leixing = "sex";
                    if (cacheXingbie) {
                        for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : ssexmjfList) {
                            if (duhalashaoTxt5.getText().equals(roughNaturalProBean.sunnyJuniorDowntown)) {
                                roughNaturalProBean.isSelect = true;
                            } else {
                                roughNaturalProBean.isSelect = false;
                            }
                        }
                        xingbieshipei.notifyDataSetChanged();
                        xingbiePpw.showPPw();
                    } else {
                        //性别
                        dedaoXingbie(leixing, false);
                    }

                    break;
                case R.id.sjfo_jigjRl_djgiIT:
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    KeybordTols.hideKeyboard(this);
                    leixing = "curpType";
                    //类型
                    if (cacheXingbie) {
                        for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : kaleixingjfList) {
                            if (jdgjl_jgoiw_TVT.getText().equals(roughNaturalProBean.sunnyJuniorDowntown)) {
                                roughNaturalProBean.isSelect = true;
                            } else {
                                roughNaturalProBean.isSelect = false;
                            }
                        }
                        kaleixingshipei.notifyDataSetChanged();
                        kaleixingPpw.showPPw();
                    } else {
                        dedaoXingbie(leixing, false);
                    }

                    break;
                case R.id.dududuliuliuliu:
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    KeybordTols.hideKeyboard(this);
                    //出生年月
//                    chushihhUAShijianXuanzeqi(view);
                    try {
                        selectDate(duhalashaoTxt6);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
//                getBday01();
//                getBday();

                    break;
                case R.id.jingojian1dibuxieyi://跳转隐私协议
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    XieyiShowTols.quH5YinsiPage(JinJinGoGoJian4Activity.this);
                    break;
                case R.id.jingojian1kefu://跳转ws kefu
                    if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    XieyiShowTols.quH5KefuPage(JinJinGoGoJian4Activity.this,"8");
//                    intent = new Intent(this, DadianhuaGeiWomenActivity.class);
//                    startActivity(intent);
                    break;
            }
        }

    }

    private void openExample() {
        if(sfztupian.getVisibility() == View.VISIBLE){
            sfztupian.setVisibility(View.GONE);
            Drawable drawableRight = ContextCompat.getDrawable(this, R.mipmap.useimg_jiantouwangshang);
            dianjishouqilai.setCompoundDrawablesWithIntrinsicBounds(null, null, drawableRight, null);
        }else{
            sfztupian.setVisibility(View.VISIBLE);
            Drawable drawableRight = ContextCompat.getDrawable(this, R.mipmap.useimg_jiantouwangxia);
            dianjishouqilai.setCompoundDrawablesWithIntrinsicBounds(null, null, drawableRight, null);
        }
    }

    private void uptopageononon() {
        YincangShijianClickTols.QingqiuMaidian(SHENFENYEFANHUI);
        //没提交过数据
        if (fisrtSaveXinx || fisrtSaveZhengmian || fisrtSaveFanmian || fisrtSaveLianXinx) {
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
    private void initShenfenTipsWindow() {
        titishishiPPw = new ChanpinMoxingPPWindows(this);

        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_info_wanliutip1, null);
        newtipsshitineirong = popupView.findViewById(R.id.newtipsshitineirong);
        newtipsshitineirong.setText(getString(R.string.newtankuang_shenfentishi));
        popupView.findViewById(R.id.newtipsokokok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titishishiPPw.xiaohuiPPw();

            }
        });

        titishishiPPw.chushihuaPPW(popupView, false
                , (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);
    }

    private boolean sifouKeXiayibu(boolean shifouTusi) {
        boolean keXiayibu = false;
        //提交数据
        if (TextUtils.isEmpty(jingaojian1wenan2.getText().toString().trim())
                || TextUtils.isEmpty(duquDiyihangTxt2.getText().toString().trim())
                || TextUtils.isEmpty(duquDiyihangTxt3.getText().toString().trim())
                || TextUtils.isEmpty(duhalashaoTxt5.getText().toString())
                || TextUtils.isEmpty(duhalashaoTxt6.getText().toString())
//                ||TextUtils.isEmpty(renlianTuDizhi)
//                || TextUtils.isEmpty(dangrcuLeixing)
        ) {
            if (shifouTusi) {
                ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
//                Toast.makeText(JinJinGoGoJian4Activity.this, getString(R.string.tusitishi_dizih_04), Toast.LENGTH_SHORT).show();

            }
        } else if ((!zhengmianTuDizhi || !beimianTuDizhi) && !zhengmianTuOne && !beimianTuOne) {//身份证图为空提示
            if (shifouTusi) {
                ToastUtil.showShortToast(getString(R.string.shenfenzheng_shenfentukongtishi));
            }
        } else if (TextUtils.isEmpty(kakaka_shenfenzhenghao.getText().toString().trim())) {//身份证卡号为空提示
            if (shifouTusi) {
                ToastUtil.showShortToast(getString(R.string.shenfenzheng_shenfenkakongtishi));
            }
        } else if (!renlianTuDizhi && !renlianTuOne) {//人脸未拍照 提示
            if (shifouTusi) {
                ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04face));
            }
        } else {
            keXiayibu = true;
        }

        if (!shifouTusi && keXiayibu) {
            jingojian1submit.setBackground(getResources().getDrawable(R.drawable.bj_thgsdthgsfew));
        }

        return keXiayibu;
    }


    private void qingqiuJiekou1() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SERACH_SHENFEN, SuoyouXinxiModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<SuoyouXinxiModel>() {
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

                    //如果回显身份证号不为空 是否首次保存信息值改为false
                    if (!TextUtils.isEmpty(naturalPro.fastChoiceHandsomeNation)) {
                        fisrtSaveXinx = false;
                    } else {
                        if (!isarleadshowWanliutitishishi) {
                            titishishiPPw.showPPw(Gravity.CENTER);

                            isarleadshowWanliutitishishi = true;
                        }
                    }
                    switch (GuojiaLeixing) {
                        case GuojiaLeixing2://秘鲁
                            dangrcuLeixing = naturalPro.inlandGoldenShine;
//                            if (!TextUtils.isEmpty(naturalPro.followingBurialMorning)) {
//                                jdgjl_jgoiw_TVT.setText(naturalPro.followingBurialMorning);
//                                jfjIRfjfi_gjif_Reddd.setText(String.format(Locale.ENGLISH, getString(R.string.jingogojian_xixifour_num3), naturalPro.followingBurialMorning));
//                            }
                            if (!TextUtils.isEmpty(naturalPro.fastChoiceHandsomeNation)) {
                                kakaka_shenfenzhenghao.setText(naturalPro.fastChoiceHandsomeNation);
                            }
                            if (!TextUtils.isEmpty(naturalPro.funnyDifferentBanana)) {//name1
                                jingaojian1wenan2.setText(naturalPro.funnyDifferentBanana);
                            }
                            if (!TextUtils.isEmpty(naturalPro.ableNationalityCleverColleagueRainyRazor)) {//name2
                                duquDiyihangTxt2.setText(naturalPro.ableNationalityCleverColleagueRainyRazor);
                            }
                            if (!TextUtils.isEmpty(naturalPro.unhappyDiagram)) {//name3
                                duquDiyihangTxt3.setText(naturalPro.unhappyDiagram);
                            }
                            if (!TextUtils.isEmpty(naturalPro.briefBankPunctuationUnderwear)) {//xingbie
                                duhalashaoTxt5.setText(naturalPro.briefBankPunctuationUnderwear);
                                xingBieWenan = naturalPro.briefBankPunctuationUnderwear;
                                xingbieBianma = naturalPro.handsomeAmericanRobotKindness;

                                //下面着代码多此一举 上面返回就有可以直接取
                                leixing = "sex";
//                                dedaoXingbie(leixing, "1");


                            }
                            if (!TextUtils.isEmpty(naturalPro.readyDoubleTheirs)) {
                                duhalashaoTxt6.setText(naturalPro.readyDoubleTheirs);
                            }
                            break;
                        default://西班牙
                            if (!TextUtils.isEmpty(naturalPro.fastChoiceHandsomeNation)) {
                                kakaka_shenfenzhenghao.setText(naturalPro.fastChoiceHandsomeNation);
                            }
                            if (!TextUtils.isEmpty(naturalPro.uncertainNecklaceComrade)) {//name1
                                jingaojian1wenan2.setText(naturalPro.uncertainNecklaceComrade);
                            }
                            if (!TextUtils.isEmpty(naturalPro.popularNecessaryPineapple)) {//name2
                                duquDiyihangTxt2.setText(naturalPro.popularNecessaryPineapple);
                            }
                            if (!TextUtils.isEmpty(naturalPro.neitherSlimSteepNortheast)) {//name3
                                duquDiyihangTxt3.setText(naturalPro.neitherSlimSteepNortheast);
                            }
                            if (!TextUtils.isEmpty(naturalPro.handsomeAmericanRobotKindness)) {//name3
                                duhalashaoTxt5.setText(naturalPro.handsomeAmericanRobotKindness);
                            }
                            if (!TextUtils.isEmpty(naturalPro.readyDoubleTheirs)) {
                                duhalashaoTxt6.setText(naturalPro.readyDoubleTheirs);
                            }
                    }
                    sifouKeXiayibu(false);
                } else {
//                    Toast.makeText(JinJinGoGoJian4Activity.this, bean1.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(bean1.getnuclearTrialSpareMountainousBat());
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


    private String gaoDaoShjian(Date date) {//可根据需要自行截取数据显示
        Log.d("getTime()", "choice date millis: " + date.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

    private void chushihhUAShijianXuanzeqi(View view) {//Dialog 模式下，在底部弹出
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//        Calendar selectedDate = Calendar.getInstance();//系统当前时间
//        Calendar startDate = Calendar.getInstance();//控件起始时间
////注：（1）年份可以随便设置 (2)月份是从0开始的（0代表1月 11月代表12月），即设置0代表起始时间从1月开始
////(3)日期必须从1开始，因为2月没有30天，设置其他日期时，2月份会从设置日期开始显示导致出现问题
//        startDate.set(1950, 0, 1);//该控件从1900年1月1日开始
//        Calendar endDate = Calendar.getInstance();//控件截止时间
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(ShijianTols.huoquNian());
//        endDate.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));//该控件到2050年2月28日结束
//        try {
//
//            String start1 = "01-01-2000";//格式必须与formatter的格式一致
//            if (!TextUtils.isEmpty(duhalashaoTxt6.getText().toString())) {
//
//                start1 = duhalashaoTxt6.getText().toString();
//            }
//            Date date = formatter.parse(start1);
//            selectedDate.setTime(date);//指定控件初始值显示哪一天
//        } catch (Exception e) {
//        }
//        ShijianXuanzeView pvTime = new TimePickerBuilder(this, new OnShijianXuzneJt() {
//            @Override
//            public void onXuanzeShijian(Date shijian, View shitu) {
//                int year, monthOfYear, dayOfMonth;
//                Calendar calendar = Calendar.getInstance();
//                calendar.setTime(shijian);
//                year = calendar.get(Calendar.YEAR);
//                monthOfYear = calendar.get(Calendar.MONTH);
//                dayOfMonth = calendar.get(Calendar.DATE);
//                /*String choiceTime = formatter.format(date);//日期 String
//                Toast.makeText(mContext,choiceTime,Toast.LENGTH_LONG).show();
//                birthText.setText(choiceTime);
//                long startl = date.getTime();//日期 long*/
//                String dayStr = dayOfMonth + "";
//                if (dayOfMonth < 10) {
//                    dayStr = "0" + dayOfMonth;
//                }
//
//                String monthStr = (monthOfYear + 1) + "";
//                if ((monthOfYear + 1) < 10) {
//                    monthStr = "0" + (monthOfYear + 1);
//                }
//                String s = year + "-" + (monthOfYear + 1) + "-" + dayOfMonth;
//                String data = dayStr + "-" + monthStr + "-" + year;
//                duhalashaoTxt6.setText(data);
//                sifouKeXiayibu(false);
//            }
//        }).shezhiBianhuaXuanzeJianting(new OnShijianXuzneBianhuaJt() {
//            @Override
//            public void onShijianXuazneBianhua(Date shijian) {
//                Log.i("pvTime", "onTimeSelectChanged");
//            }
//        }).shezhiYueFenData(selectedDate)//设置系统时间为当前时间
//                .shezhiQishiShijian(startDate, endDate)//设置控件日期范围 也可以不设置默认1900年到2100年
//                .shezhiXuanzeqiShowType(new boolean[]{true, true, true, false, false, false})
//                .shibushiChuangkou(false) //默认设置false ，内部实现将DecorView 作为它的父控件。
//                .shezhiWeannana("", "", "", "", "", "")
//                .shezhiTIjiaoWena("Determinar")
//                .sehzhiQuxiaoBtnWenan("Cancelación")
//                .addOnQuxaiJttter(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Log.i("pvTime", "onCancelClickListener");
//                    }
//                })
//                .shezhiZuidaKejianshu(5) //若设置偶数，实际值会加1（比如设置6，则最大可见条目为7）
//                .shezhiJianju(2.0f)
//                .shifouToumingJianbian(true)
//                .build();
//
//        Dialog mDialog = pvTime.huoquDaiKuang();
//        if (mDialog != null) {
//
//            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
//                    ViewGroup.LayoutParams.MATCH_PARENT,
//                    ViewGroup.LayoutParams.WRAP_CONTENT,
//                    Gravity.BOTTOM);
//
//            params.leftMargin = 0;
//            params.rightMargin = 0;
//            pvTime.dedaoKuangBUjuqi().setLayoutParams(params);
//
//            Window dialogWindow = mDialog.getWindow();
//            if (dialogWindow != null) {
//                dialogWindow.setWindowAnimations(R.style.picker_view_slide_anim);//修改动画样式
//                dialogWindow.setGravity(Gravity.BOTTOM);//改成Bottom,底部显示
//                dialogWindow.setDimAmount(0.3f);
//            }
//        }
//        pvTime.tongguoNegeTanchu(view);//弹出时间选择器，传递参数过去，回调的时候则可以绑定此view

    }

    private void selectDate(TextView textView) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Calendar selectedDate = Calendar.getInstance();
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();
        if (textView.getId() == R.id.duhalashaoTxt6) {
            String start1 = "01-01-2000";//格式必须与formatter的格式一致
            if (!TextUtils.isEmpty(duhalashaoTxt6.getText().toString())) {

                start1 = duhalashaoTxt6.getText().toString();
            }
            Date date = formatter.parse(start1);
            selectedDate.setTime(date);//指定控件初始值显示哪一天
//            selectedDate.set(2000,0,1);
        }


        if (duhalashaoTxt6.equals(textView)) {
            endDate = Calendar.getInstance();
            int year = endDate.get(Calendar.YEAR) - 10;
            endDate.set(Calendar.YEAR, year);
        } else {
            endDate.set(2100, 11, 31);
        }

        startDate.set(1950, 0, 1);
        build = new TimePickerBuilder(this, (date, v) -> {//选中事件回调
            textView.setText(shijianchuoZhuanriyuenina(date));
            sifouKeXiayibu(false);
        })
                .setType(new boolean[]{true, true, true, false, false, false})// 默认全部显示
                .setCancelText("Cancelación")//取消按钮文字
                .setSubmitText("Determinar")//确认按钮文字
                .setOutSideCancelable(false)//点击屏幕，点在控件外部范围时，是否取消显示
                .isCyclic(false)//是否循环滚动
                .setTitleColor(Color.TRANSPARENT)//标题文字颜色
                .setSubmitColor(Color.BLACK)//确定按钮文字颜色
                .setCancelColor(Color.BLACK)//取消按钮文字颜色
                .setDate(selectedDate)// 如果不设置的话，默认是系统时间
                .setRangDate(startDate, endDate)//起始终止年月日设定
                .setLabel("", "", "", "", "", "")//默认设置为年月日时分秒
                .isCenterLabel(false) //是否只显示中间选中项的label文字，false则每项item全部都带有label。
                .setLayoutRes(R.layout.pickerview_time, new CustomListener() {
                    @Override
                    public void customLayout(View v) {
                        final TextView tvSubmit = (TextView) v.findViewById(R.id.xuanzeqi_baocun);
                        TextView ivCancel = (TextView) v.findViewById(R.id.xuanzeqi_quxiao);
                        tvSubmit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                build.returnData();
                                build.dismiss();
                            }
                        });
                        ivCancel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                build.dismiss();
                            }
                        });
                    }
                })
                .build();
        build.show();
    }

    private String shijianchuoZhuanriyuenina(Date shijian) {
        int year, monthOfYear, dayOfMonth;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(shijian);
        year = calendar.get(Calendar.YEAR);
        monthOfYear = calendar.get(Calendar.MONTH);
        dayOfMonth = calendar.get(Calendar.DATE);
                /*String choiceTime = formatter.format(date);//日期 String
                Toast.makeText(mContext,choiceTime,Toast.LENGTH_LONG).show();
                birthText.setText(choiceTime);
                long startl = date.getTime();//日期 long*/
        String dayStr = dayOfMonth + "";
        if (dayOfMonth < 10) {
            dayStr = "0" + dayOfMonth;
        }

        String monthStr = (monthOfYear + 1) + "";
        if ((monthOfYear + 1) < 10) {
            monthStr = "0" + (monthOfYear + 1);
        }
        String s = year + "-" + (monthOfYear + 1) + "-" + dayOfMonth;
        String data = dayStr + "-" + monthStr + "-" + year;

        return data;
    }

    private void dedaoXingbie(String leixing, boolean isinitcache) {
        dedaoXingbie(leixing, "0", isinitcache);
    }

    private void dedaoXingbie(String qingqiuleixing, String leixing, boolean isinitcache) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_ZIDIAN_LEIXING, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
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
                map.put("squareBookshop", qingqiuleixing);
            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    List<ConfigDianModel.RoughNaturalProBean> bigAncientTastyHeadteacher = response.bigAncientTastyHeadteacher;
                    if (leixing.equals("1")) {
                        if (!TextUtils.isEmpty(xingBieWenan))
                            for (int i = 0; i < bigAncientTastyHeadteacher.size(); i++) {
                                if (bigAncientTastyHeadteacher.get(i).sunnyJuniorDowntown.equals(xingBieWenan)) {
                                    xingbieBianma = bigAncientTastyHeadteacher.get(i).averageEmbassyNationalVictoryDepth;
                                    break;
                                }
                            }
                    } else {
                        if (bigAncientTastyHeadteacher != null && bigAncientTastyHeadteacher.size() > 0) {

                            if ("sex".equals(qingqiuleixing)) {
                                ssexmjfList.clear();
                                ssexmjfList.addAll(bigAncientTastyHeadteacher);
                                xingbieshipei.notifyDataSetChanged();
                                cacheXingbie = true;
                                if (!isinitcache) {
                                    xingbiePpw.showPPw();
                                }
                            } else {
                                Log.d("kaka", "111");
                                kaleixingjfList.clear();
                                kaleixingjfList.addAll(bigAncientTastyHeadteacher);
                                kaleixingshipei.notifyDataSetChanged();
                                cachekaLeixing = true;
                                if (!isinitcache) {
                                    kaleixingPpw.showPPw();
                                }
                            }

                        }
                    }
                } else {
//                    Toast.makeText(JinJinGoGoJian4Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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
    private SanfangRxppp rrxxxPPP;

    private void jianchaPageXuyaoPPP(int code) {
        String[] qxxxSshuzu = {
//                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA/*, Manifest.permission.READ_EXTERNAL_STORAGE*/};
        rrxxxPPP.qingQiu(qxxxSshuzu)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Boolean aBoolean) {
                        try {
                            if (!aBoolean) {
                                if (new PppQxPanduaner(MyJichuAplica.getInstance()).checkShaoPppp(
//                                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                                        Manifest.permission.CAMERA/*, Manifest.permission.READ_EXTERNAL_STORAGE*/)) {
                                    Log.d("requestLocation---->>>", "权限被拒绝");
//                                    if (!shouldShowRequestPermissionRationale(Manifest.permission.WRITE_EXTERNAL_STORAGE)
//                                            || !shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)
//                                            || !shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)
//                                    ) {
//                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝了 而且点击了不在提示（始终禁止） 所以 需要判断出来 有必要的话 需要用代码跳转到设置页面");
//                                        Toast.makeText(ReadData04Activity.this, getString(R.string.tusitishi_dizih_12), Toast.LENGTH_SHORT).show();
//                                        goTOSettingActivity(ReadData04Activity.this);
//                                    } else {
//                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝");
//                                        Toast.makeText(ReadData04Activity.this, getString(R.string.tusitishi_dizih_11), Toast.LENGTH_SHORT).show();
//                                    }
                                    chanpinMoxingPPWindows2.showPPw(Gravity.CENTER);
                                } else {
                                    Log.d("requestLocation---->>>", "权限被通过");
                                    //所有权限都已经授权
                                    huoquTupian(code);

                                }
                                //当弹出授权弹窗时，拍照授权结果
                                YincangShijianClickTols.QingqiuMaidian(PAIZHAOSHOUQUANJIEGUO);
/*                                if (new PermissionsChecker(ApplicationContext.getContext()).lacksPermissions(Manifest.permission.READ_PHONE_STATE)) {
                                    IKToast.show(getApplicationContext(), "手机状态被拒，不能享用一键登录功能");
                                    Log.d("requestLocation---->>>", "权限被拒绝");
                                } else {
                                    Log.d("requestLocation---->>>", "权限被拒绝");
                                }*/

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //当弹出授权弹窗时，拍照授权结果
                                YincangShijianClickTols.QingqiuMaidian(PAIZHAOSHOUQUANJIEGUO);
                                //所有权限都已经授权
                                huoquTupian(code);
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

    File cunchuWenjian = null;

    //get image
    private void huoquTupian(int zibianma) {

        try {
            cunchuWenjian = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), zibianma + "output_image.jpg");
            if (cunchuWenjian.exists()) {
                cunchuWenjian.delete();
            }
            cunchuWenjian.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        tupianUriiiii = Uri.fromFile(cunchuWenjian);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tupianUriiiii = FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", cunchuWenjian);
        } else {
            tupianUriiiii = Uri.fromFile(cunchuWenjian);
        }


        if (zibianma == 1003) {
            gaodaoZheTUpian(photo);
        } else {
            chanpinMoxingPPWindows1.showPPw();
        }

//        take_photo();

    }


    private File outputImagepath;//存储拍完照后的图片
    private Uri uri = null;

    public void take_photo() {

        try {
            //获取系統版本
            int currentapiVersion = Build.VERSION.SDK_INT;
            // 激活相机
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            // 判断存储卡是否可以用，可用进行存储
            if (hasSdcard()) {
                SimpleDateFormat timeStampFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
                String filename = timeStampFormat.format(new Date());
                outputImagepath = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), filename + ".jpg");
                if (currentapiVersion < Build.VERSION_CODES.N) {
                    // 从文件中创建uri
                    uri = Uri.fromFile(outputImagepath);
                    intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
                } else {
                    uri = FileProvider.getUriForFile(this, getPackageName() + ".fileProvider", outputImagepath);
                    intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
                }
            }

            startActivityForResult(intent, TAKE_PHOTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 判断sdcard是否被挂载
     */
    public static boolean hasSdcard() {
        return Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED);
    }


    float kaishiY;
    float yidongY = 0;
    private List<ConfigDianModel.RoughNaturalProBean> zidainpeizhi;

    private void chushihuaPPiWindwos() {
        chanpinMoxingPPWindows1 = new ChanpinMoxingPPWindows(this);
        LayoutInflater chuangkouInodltet = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View chaungView = chuangkouInodltet.inflate(R.layout.wndw_gogoarrow_info, null);
        RecyclerView popJinJianZiLiao01Rv = chaungView.findViewById(R.id.popJinJianZiLiao01Rv);
        RelativeLayout shtgdf = chaungView.findViewById(R.id.jyhtgrefasg);
        RelativeLayout mnbfdasg = chaungView.findViewById(R.id.jythgrfsh);
        zidainpeizhi = new ArrayList<>();
        zidainpeizhi.add(new ConfigDianModel.RoughNaturalProBean(getString(R.string.peizhiandout_egdsgj_tom), "001"));
        zidainpeizhi.add(new ConfigDianModel.RoughNaturalProBean(getString(R.string.peizhiandout_egdsgj_sel), "002"));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(linearLayoutManager);
        shuruZongXinxi2Shipei1 = new ShuruZongXinxi2Shipei(zidainpeizhi);
        popJinJianZiLiao01Rv.setAdapter(shuruZongXinxi2Shipei1);
        chanpinMoxingPPWindows1.chushihuaPPW(chaungView, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.6), null, true);
        shtgdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chanpinMoxingPPWindows1.xiaohuiPPw();
            }
        });
        shuruZongXinxi2Shipei1.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String sunnyJuniorDowntown = zidainpeizhi.get(position).averageEmbassyNationalVictoryDepth;
                if ("001".equals(sunnyJuniorDowntown)) {

                    gaodaoZheTUpian(photo);
                } else if ("002".equals(sunnyJuniorDowntown)) {
                    xuanYigeTUpian(photo);
                }
                chanpinMoxingPPWindows1.xiaohuiPPw();
            }
        });

        mnbfdasg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        kaishiY = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        yidongY = ev.getY() - kaishiY;
                        if (yidongY > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            chaungView.scrollBy(0, -(int) yidongY);
                            kaishiY = ev.getY();
                        }
                        if (chaungView.getScrollY() > 0) { //避免向上拖动
                            chaungView.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (chaungView.getScrollY() < -chaungView.getHeight()
                                / 10 && yidongY > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            chanpinMoxingPPWindows1.xiaohuiPPw();
                        }
                        chaungView.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });
    }

    //设置拍照
    private void gaodaoZheTUpian(int code) {
//        if(code==1003){
//            if (TextUtils.equals(Build.MODEL, "moto e40")) {
//                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(intent, code);
//            } else {
//                new PhotoConfigInfo.Builder()
//                        .setIsCheckInfo(false)//false代表前置
//                        .setActivity(JinJinGoGoJian4Activity.this)
//                        .setInt_first(AskChoicePhotoTypeBox.INT_BACK_CODE_NUMBER_CAMERA)
//                        .build();
//            }
//        }else {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, tupianUriiiii);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        }
        startActivityForResult(intent, TAKE_PHOTO);
//        }


    }

    //xuanze tupiano
    private void xuanYigeTUpian(int code) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Intent pickImageIntent = new Intent();
            pickImageIntent.setAction(Intent.ACTION_PICK);
            pickImageIntent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//            Intent  pickImageIntent = new ActivityResultContracts.PickVisualMedia().createIntent(JinJinGoGoJian4Activity.this, new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
            startActivityForResult(pickImageIntent, SELECT_PHOTO);
        } else {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            startActivityForResult(intent, SELECT_PHOTO);
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            Bitmap bitmap = null;
            Bitmap bitmap1 = null;

            try {
                if (requestCode == TAKE_PHOTO) {
                    Lubancompress(JinJinGoGoJian4Activity.this, cunchuWenjian.getAbsolutePath());
                } else if (requestCode == SELECT_PHOTO) {
//                    bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(data.getData()));
//                    bitmap1 = TuxiangTols.tuPianKongjian(bitmap);
                    String path = ZhaopianXuanzeTols.getPathFromUri(JinJinGoGoJian4Activity.this, data.getData());
                    Lubancompress(JinJinGoGoJian4Activity.this, path);
//                    bitmap = BitmapFactory.decodeFile(path);
//                    bitmap1 = TuxiangTols.tuPianKongjian(bitmap);
                }


            } catch (Exception e) {
                e.printStackTrace();
            }


        } else {
            if (photo == 1001) {
                YincangShijianClickTols.QingqiuMaidian(ZHENGMIANPAISHIBAI);
                YincangShijianClickTols.QingqiuNewRiskMaidian(NEWRISK_ZHENGMIANSHIBAI);
            } else if (photo == 1002) {
                YincangShijianClickTols.QingqiuMaidian(FANMIANPAISHIBAI);
                YincangShijianClickTols.QingqiuNewRiskMaidian(NEWRISK_FANMIANSHIBAI);
            } else if (photo == 1003) {
                YincangShijianClickTols.QingqiuMaidian(RENLIANSHIBAI);
                YincangShijianClickTols.QingqiuNewRiskMaidian(NEWRISK_RENLIANSHIBAI);
            }
        }
    }


    private void setCameraImageAndUpload(File weiyasuofile) {

//        String xiasuohoulujing = CompresImgTols.yasuoTufanhuiLujing(weiyasuofile.getPath(),this);
//        File file = new File(xiasuohoulujing);

        File file = null;
        if(weiyasuofile.length()/1024>50){
            TuImgYasuoUtils tuImgYasuoUtils = new TuImgYasuoUtils(JinJinGoGoJian4Activity.this);
            try {
                file= tuImgYasuoUtils.yasuoTu(weiyasuofile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            file = weiyasuofile;
        }


        Log.d("imagsize",file.length()/1000+"");
        Bitmap bitmap = null;
        if (photo == 1001) {
            bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            zhengmianTu = bitmap;
            File path1 = TuxiangTols.baocunTupianDaoBendi(bitmap, "photo1001", JinJinGoGoJian4Activity.this);

            //关闭选中后直接显示
            tututpaisnd1.setVisibility(View.VISIBLE);
            Glide.with(JinJinGoGoJian4Activity.this).load(file).into(tututpaisnd1);
//                    tututpaisnd1.setImageURI(Uri.fromFile(new File(zhengmianTu)));

            if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                baseaNonet.showPPw(Gravity.CENTER);

                dangqianpaizhuangtai.setVisibility(View.VISIBLE);
                dangqianpaizhuangtai.setImageResource(R.mipmap.shenfencuole);
                return;
            }

            if (zhengmianTu != null) {
                YincangShijianClickTols.QingqiuMaidian(ZHENGMIANPAICHENGGONG);
                gengxinXiangce(1001, bitmap, path1);

            } else {
                YincangShijianClickTols.QingqiuMaidian(ZHENGMIANPAISHIBAI);
            }
        } else if (photo == 1002) {
            bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            beimianTu = bitmap;
            File path2 = TuxiangTols.baocunTupianDaoBendi(bitmap, "photo1002", JinJinGoGoJian4Activity.this);

            //关闭选中后直接显示
            tututpaisnd2.setVisibility(View.VISIBLE);
//                    tututpaisnd2.bringToFront();
            Glide.with(JinJinGoGoJian4Activity.this).load(file).into(tututpaisnd2);

//                    if (!TextUtils.isEmpty(zhengmianTu)) {
            if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
                baseaNonet.showPPw(Gravity.CENTER);

                dangqianpaizhuangtai2.setVisibility(View.VISIBLE);
                dangqianpaizhuangtai2.setImageResource(R.mipmap.shenfencuole);
                return;
            }
//                    }

            if (beimianTu != null) {
                YincangShijianClickTols.QingqiuMaidian(FANMIANPAICHENGGONG);
                gengxinXiangce(1002, bitmap, path2);

            } else {
                YincangShijianClickTols.QingqiuMaidian(FANMIANPAISHIBAI);
            }

        } else if (photo == 1003) {
            bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            renlianTu = bitmap;
            File path3 = TuxiangTols.baocunTupianDaoBendi(bitmap, "photo1003", JinJinGoGoJian4Activity.this);

            //关闭选中后直接显示
            tututpaisnd3.setVisibility(View.VISIBLE);
//                    tututpaisnd3.bringToFront();
            Glide.with(JinJinGoGoJian4Activity.this).load(file).into(tututpaisnd3);


            if (!WngluoTols.youWangluoFou(JinJinGoGoJian4Activity.this)) {
//                Toast.makeText(getInstance(), getInstance().getString(R.string.tusitishi_dizih_00), Toast.LENGTH_SHORT).show();
                ToastUtil.showShortToast(getInstance().getString(R.string.tusitishi_dizih_00));
                dangqianpaizhuangtai3.setVisibility(View.VISIBLE);
                dangqianpaizhuangtai3.setImageResource(R.mipmap.shenfencuole);
                return;
            }
            if (bitmap != null) {
                YincangShijianClickTols.QingqiuMaidian(RENLIANCHENGONG);
                gengxinXiangce(1003, bitmap, path3);
            } else {
                YincangShijianClickTols.QingqiuMaidian(RENLIANSHIBAI);
            }
        }
    }

    private Bitmap orc_bitmap;//拍照和相册获取图片的Bitmap


    private void Lubancompress(Context context, String imagepath) {
        if (TextUtils.isEmpty(imagepath)) {
            return;
        }
        new Thread() {
            @Override
            public void run() {
                super.run();

                Luban.with(context).load(imagepath).ignoreBy(100).setCompressListener(new OnCompressListener() {

                    @Override
                    public void onStart() {

                    }

                    @Override
                    public void onSuccess(File file) {
//                        toLone = false;
                        Log.d("compress", "=======end===11==" + file.getAbsolutePath());

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                 setCameraImageAndUpload(file);

                            }
                        });
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                }).launch();
            }
        }.start();
    }


    float kasihiY;
    float pianyiY = 0;

    private void chushihuaYxingbiePPW() {
        xingbiePpw = new ChanpinMoxingPPWindows(this);
        LayoutInflater chuangYingshe = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View chuangView = chuangYingshe.inflate(R.layout.wndw_gogoarrow_info, null);
        RecyclerView popJinJianZiLiao01Rv = chuangView.findViewById(R.id.popJinJianZiLiao01Rv);
        RelativeLayout jyhtgrefasg = chuangView.findViewById(R.id.jyhtgrefasg);
        RelativeLayout jythgrfsh = chuangView.findViewById(R.id.jythgrfsh);
        ssexmjfList = new ArrayList<>();
        LinearLayoutManager bujuguanli = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(bujuguanli);
        xingbieshipei = new ShuruZongXinxi2Shipei(ssexmjfList);
        popJinJianZiLiao01Rv.setAdapter(xingbieshipei);
//        xingbiePpw.chushihuaPPW(chuangView);
        jyhtgrefasg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xingbiePpw.xiaohuiPPw();
            }
        });

        xingbieshipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String sunnyJuniorDowntown = ssexmjfList.get(position).sunnyJuniorDowntown;
                for (ConfigDianModel.RoughNaturalProBean roughNaturalProBean : ssexmjfList) {
                    if (roughNaturalProBean.sunnyJuniorDowntown == sunnyJuniorDowntown) {
                        roughNaturalProBean.isSelect = true;
                    } else {
                        roughNaturalProBean.isSelect = false;
                    }
                }
                if ("sex".equals(leixing)) {
                    xingbieBianma = ssexmjfList.get(position).averageEmbassyNationalVictoryDepth;
                    duhalashaoTxt5.setText(sunnyJuniorDowntown);
                } else if ("curpType".equals(leixing)) {
                    jdgjl_jgoiw_TVT.setText(sunnyJuniorDowntown);
                    dangrcuLeixing = ssexmjfList.get(position).averageEmbassyNationalVictoryDepth;
                    jfjIRfjfi_gjif_Reddd.setText(String.format(Locale.ENGLISH, getString(R.string.jingogojian_xixifour_num3), sunnyJuniorDowntown));
                }
                sifouKeXiayibu(false);
                xingbiePpw.xiaohuiPPw();
            }
        });

        jythgrfsh.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        kasihiY = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        pianyiY = ev.getY() - kasihiY;
                        if (pianyiY > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            chuangView.scrollBy(0, -(int) pianyiY);
                            kasihiY = ev.getY();
                        }
                        if (chuangView.getScrollY() > 0) { //避免向上拖动
                            chuangView.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (chuangView.getScrollY() < -chuangView.getHeight()
                                / 10 && pianyiY > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            xingbiePpw.xiaohuiPPw();
                        }
                        chuangView.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });

        xingbiePpw.chushihuaPPW(chuangView, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.6), null, true);

    }


    private void chushihuakaleixingYPPW() {
        kaleixingPpw = new ChanpinMoxingPPWindows(this);
        LayoutInflater chuangYingshe = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View chuangView = chuangYingshe.inflate(R.layout.wndw_gogoarrow_info, null);
        RecyclerView popJinJianZiLiao01Rv = chuangView.findViewById(R.id.popJinJianZiLiao01Rv);
        RelativeLayout jyhtgrefasg = chuangView.findViewById(R.id.jyhtgrefasg);
        RelativeLayout jythgrfsh = chuangView.findViewById(R.id.jythgrfsh);
        kaleixingjfList = new ArrayList<>();
        LinearLayoutManager bujuguanli = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(bujuguanli);
        kaleixingshipei = new ShuruZongXinxi2Shipei(kaleixingjfList);
        popJinJianZiLiao01Rv.setAdapter(kaleixingshipei);
//        kaleixingPpw.chushihuaPPW(chuangView);
        jyhtgrefasg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kaleixingPpw.xiaohuiPPw();
            }
        });

        kaleixingshipei.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String sunnyJuniorDowntown = kaleixingjfList.get(position).sunnyJuniorDowntown;

                if ("sex".equals(leixing)) {
                    xingbieBianma = kaleixingjfList.get(position).averageEmbassyNationalVictoryDepth;
                    duhalashaoTxt5.setText(sunnyJuniorDowntown);
                } else if ("curpType".equals(leixing)) {
                    jdgjl_jgoiw_TVT.setText(sunnyJuniorDowntown);
                    dangrcuLeixing = kaleixingjfList.get(position).averageEmbassyNationalVictoryDepth;
                    jfjIRfjfi_gjif_Reddd.setText(String.format(Locale.ENGLISH, getString(R.string.jingogojian_xixifour_num3), sunnyJuniorDowntown));
                }
                sifouKeXiayibu(false);
                kaleixingPpw.xiaohuiPPw();
            }
        });

        jythgrfsh.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent ev) {
                switch (ev.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        kasihiY = ev.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        pianyiY = ev.getY() - kasihiY;
                        if (pianyiY > 0) { //避免坐标抖动，滑动过程中闪烁不连贯的问题
                            chuangView.scrollBy(0, -(int) pianyiY);
                            kasihiY = ev.getY();
                        }
                        if (chuangView.getScrollY() > 0) { //避免向上拖动
                            chuangView.scrollTo(0, 0);
                        }
                        break;
                    case MotionEvent.ACTION_UP:
                        if (chuangView.getScrollY() < -chuangView.getHeight()
                                / 10 && pianyiY > 0) { // 如果滑动距离达到高度的5分之一 就关闭Dialog
                            xingbiePpw.xiaohuiPPw();
                        }
                        chuangView.scrollTo(0, 0);
                        break;
                }
                return true;

            }
        });

        kaleixingPpw.chushihuaPPW(chuangView, false, ViewGroup.LayoutParams.WRAP_CONTENT, (int) (huoquPingmuGodu(this) * 0.6), null, true);

    }

    private void qingqiuJiekouTu() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GET_SHENFEN_PICTURE, PersonShenfenZhaoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PersonShenfenZhaoModel>() {
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
                map.put("interestingGrillClerk", "4");
            }

            @Override
            public void onSuccess(PersonShenfenZhaoModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                //数据加载完
                YincangShijianClickTols.QingqiuMaidian(SHENFENZHAOPIANJIAZAIWAN);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {

                    PersonShenfenZhaoModel.FanhuiDataModel sahfkBean = response.getRoughNaturalPro();
                    RequestOptions options = new RequestOptions()
                            .error(R.mipmap.tupianliekai)
                            //关键是这个占位图，使用<animated-rotate/>标签;
                            //设置帧动画资源也可以，不过需要代码开启动画;
                            .placeholder(R.drawable.request_jiazai_donghua);
                    //如果回显身份证号不为空 是否首次保存信息值改为false
                    if (!TextUtils.isEmpty(sahfkBean.variousRacialHeadline)) {
                        fisrtSaveXinx = false;
                    } else {
                        if (!isarleadshowWanliutitishishi) {
                            titishishiPPw.showPPw(Gravity.CENTER);

                            isarleadshowWanliutitishishi = true;
                        }
                    }

                    //身份证正面不为空
                    if (!TextUtils.isEmpty(sahfkBean.getThisCanalDustyChristian())) {
                        fisrtSaveZhengmian = false;
                        zhengmianTuDizhi = true;
                        zhengmianTuOne = true;
                        tututpaisnd1.setVisibility(View.VISIBLE);

                        Glide.with(JinJinGoGoJian4Activity.this)
                                .applyDefaultRequestOptions(options)
                                .load(sahfkBean.getThisCanalDustyChristian())
                                .into(tututpaisnd1);
                    } else {
                        fisrtSaveZhengmian = true;
                        if (!isarleadshowWanliutitishishi) {
                            titishishiPPw.showPPw(Gravity.CENTER);

                            isarleadshowWanliutitishishi = true;
                        }
                    }
                    //身份证反面不为空
                    if (!TextUtils.isEmpty(sahfkBean.getMaleJungle())) {
                        fisrtSaveFanmian = false;
                        beimianTuDizhi = true;
                        beimianTuOne = true;
                        tututpaisnd2.setVisibility(View.VISIBLE);
                        Glide.with(JinJinGoGoJian4Activity.this)
                                .applyDefaultRequestOptions(options)
                                .load(sahfkBean.getMaleJungle())
                                .into(tututpaisnd2);
                    } else {
                        fisrtSaveFanmian = true;
                        if (!isarleadshowWanliutitishishi) {
                            titishishiPPw.showPPw(Gravity.CENTER);

                            isarleadshowWanliutitishishi = true;
                        }
                    }

                    //人脸不为空
                    if (!TextUtils.isEmpty(sahfkBean.variousRacialHeadline)) {
                        fisrtSaveLianXinx = false;
                        renlianTuDizhi = true;
                        renlianTuOne = true;
                        tututpaisnd3.setVisibility(View.VISIBLE);
                        Glide.with(JinJinGoGoJian4Activity.this)
                                .applyDefaultRequestOptions(options)
                                .load(sahfkBean.variousRacialHeadline)
                                .into(tututpaisnd3);
                    } else {
                        fisrtSaveLianXinx = true;
                        if (!isarleadshowWanliutitishishi) {
                            titishishiPPw.showPPw(Gravity.CENTER);

                            isarleadshowWanliutitishishi = true;
                        }
                    }

                    sifouKeXiayibu(false);
                } else {
//                    Toast.makeText(JinJinGoGoJian4Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    private void qingqiuJiekouTu2ForbiddenNull() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GET_SHENFEN_PICTURE, PersonShenfenZhaoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PersonShenfenZhaoModel>() {
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
            public void onSuccess(PersonShenfenZhaoModel response) {
//                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                //数据加载完
                YincangShijianClickTols.QingqiuMaidian(SHENFENZHAOPIANJIAZAIWAN);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {

                    PersonShenfenZhaoModel.FanhuiDataModel sahfkBean = response.getRoughNaturalPro();
                    if (!TextUtils.isEmpty(sahfkBean.getThisCanalDustyChristian())
                            && !TextUtils.isEmpty(sahfkBean.getMaleJungle())
                            && !TextUtils.isEmpty(sahfkBean.variousRacialHeadline)) {
                        qingqiuJiekou2();
                    } else {
                        jiazaizhongWindows.hideKuangkuangIng();
                        if (TextUtils.isEmpty(sahfkBean.getThisCanalDustyChristian())) {
                            Glide.with(JinJinGoGoJian4Activity.this)
//                                    .applyDefaultRequestOptions(options)
                                    .load(R.mipmap.useimg_jmthgsrfaef)
                                    .apply(options)
                                    .into(tututpaisnd1);
//                            Toast.makeText(JinJinGoGoJian4Activity.this, getString(R.string.tusitishi_dizih_17), Toast.LENGTH_SHORT).show();
                            ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_17));
                        }
                        if (TextUtils.isEmpty(sahfkBean.getMaleJungle())) {
                            Glide.with(JinJinGoGoJian4Activity.this)
//                                    .applyDefaultRequestOptions(options)
                                    .load(R.mipmap.useimg_jmthgsrfaef)
                                    .apply(options)
                                    .into(tututpaisnd2);
//                            Toast.makeText(JinJinGoGoJian4Activity.this, getString(R.string.tusitishi_dizih_17), Toast.LENGTH_SHORT).show();
                            ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_17));
                        }
                        if (TextUtils.isEmpty(sahfkBean.variousRacialHeadline)) {
                            Glide.with(JinJinGoGoJian4Activity.this)
//                                    .applyDefaultRequestOptions(options)
                                    .load(R.mipmap.useimg_asddfssss)
                                    .apply(options)
                                    .into(tututpaisnd3);
//                            Toast.makeText(JinJinGoGoJian4Activity.this, getString(R.string.meiyourenlianqingshangcahun), Toast.LENGTH_SHORT).show();
                            ToastUtil.showShortToast(getString(R.string.meiyourenlianqingshangcahun));
                        }
                    }
                } else {
                    jiazaizhongWindows.hideKuangkuangIng();
//                    Toast.makeText(JinJinGoGoJian4Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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
        if (!jiazaizhongWindows.isShowingKuangkuangIng()) {
            jiazaizhongWindows.showKuangkuangIng();
        }
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SAVE_SHENFEN, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
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

//                map.put("inlandGoldenShine", dangrcuLeixing);//curpType
                map.put("fastChoiceHandsomeNation", kakaka_shenfenzhenghao.getText().toString().trim());//curp
                map.put("funnyDifferentBanana", jingaojian1wenan2.getText().toString().trim());//representThird
                map.put("ableNationalityCleverColleagueRainyRazor", duquDiyihangTxt2.getText().toString().trim());//names
                map.put("unhappyDiagram", duquDiyihangTxt3.getText().toString().trim());//surnames
//                        map.put("handsomeAmericanRobotKindness", readTv05.getText().toString());//sex
                map.put("handsomeAmericanRobotKindness", xingbieBianma);//sex
                map.put("readyDoubleTheirs", duhalashaoTxt6.getText().toString().trim());//birthDay
                map.put("interestingGrillClerk", "4");

            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {


                    if (fisrtSaveXinx) {
                        YincangShijianClickTols.LianshuMaidian(THREECOMPANY_FB_2);
                        YincangShijianClickTols.HuojiMaidian(THREECOMPANY_FIB_2);
//                        YincangShijianClickTols.BrMaidian(THREECOMPANY_BRH_2);
                        YincangShijianClickTols.QingqiuMaidian(SHENFENTIJIAOJIAOYANTONGGUOFIRST);
//                        YincangShijianClickTols.FlyMaidian(THREECOMPANY_BRH_2.getName());
                        YincangShijianClickTols.FlyMaidian(THREECOMPANY_FLYER_2);
                    }


                    fisrtSaveXinx = false;
                    fisrtSaveZhengmian = false;
                    fisrtSaveFanmian = false;
                    fisrtSaveLianXinx = false;
                    Intent intent = new Intent(JinJinGoGoJian4Activity.this, JinJinGoGoJian5Activity.class);
                    startActivity(intent);
                } else {
//                    Toast.makeText(JinJinGoGoJian4Activity.this, response.nuclearTrialSpareMountainousBat, Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.nuclearTrialSpareMountainousBat);
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        jiazaizhongWindows.hideKuangkuangIng();
                    }
                },1000);

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

    private void gengxinXiangce(int code, Bitmap upbitmap, File path1) {

//        YincangShijianClickTols.QingqiuMaidian(ZHENGMIANMIANFENKAISHANGCHUAN);

        jiazaizhongWindows.showKuangkuangIng();
        Map<String, String> ditubiao = new HashMap<>();
//        ditubiao.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//        ditubiao.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian4Activity.this, BendiHuancunTols.YONGHU_ID));
        String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
        String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
        if (TextUtils.isEmpty(s1)) {
            s1 = "0";
        }
        if (TextUtils.isEmpty(s2)) {
            s2 = "0";
        }
        ditubiao.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
        ditubiao.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);


        ditubiao.put("highBaggageDailyParking", shebeiId);//deviceId
        ditubiao.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));//imei
        ditubiao.put("endlessSnowClearAirYoungMeaning", YincangShijianClickTols.banbenming);//versionName
        ditubiao.put("leftAfternoonFlamingProtection", YincangShijianClickTols.banbenma + "");//versionCode
        ditubiao.put("mostCongratulationPeacefulBreakfast", "googleplay");//channel

        String appSsid = YincangShijianClickTols.appshasahId;
        String userID = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID);
        String copyUserInfo = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.COPY_USER_INFO);
        if (!TextUtils.isEmpty(copyUserInfo) && copyUserInfo.contains(",")) {
            String[] split = copyUserInfo.split(",");
            if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                userID = split[0];
                appSsid = split[1];
            }
        }
        ditubiao.put("firmHappyAtlanticAustralia", appSsid);
        ditubiao.put("agriculturalArithmeticGeneralPine", appSsid);
        ditubiao.put("singleComfortClerkSwissMachine", userID);

        if (code == 1001) {
            ditubiao.put("squareBookshop", "00");
        } else if (code == 1002) {
            ditubiao.put("squareBookshop", "01");
        } else if (code == 1003) {
            ditubiao.put("squareBookshop", "02");
        }

        String zhengmiantuMing = "";
        String fanminatuMing = "";
        String renliantuMing = "";
        try {
            if (code == 1003) {

                renliantuMing = path1.getName();
            } else if (code == 1001) {
                ;
                zhengmiantuMing = path1.getName();
//

            } else if (code == 1002) {


                fanminatuMing = path1.getName();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<TupianZhiliang> TuListdddd = new ArrayList<TupianZhiliang>();
        if (code == 1003) {
            TuListdddd.add(new TupianZhiliang(upbitmap, "northAeroplaneLastFrenchPurpose", renliantuMing));
        } else if (code == 1001) {
            TuListdddd.add(new TupianZhiliang(upbitmap, "northAeroplaneLastFrenchPurpose", zhengmiantuMing));
//            TuListdddd.add(new TupianZhiliang(fanmiantu, "unknownSwordArcticAstronomy", fanminatuMing));
        } else if (code == 1002) {
//            TuListdddd.add(new TupianZhiliang(zhengmiantu, "northAeroplaneLastFrenchPurpose", zhengmiantuMing));
            TuListdddd.add(new TupianZhiliang(upbitmap, "northAeroplaneLastFrenchPurpose", fanminatuMing));
        }

        //上传身份证照片 正反面一起上传
        YincangShijianClickTols.QingqiuMaidian(KAISHISHANGCHAUNSHENFENZHENG);
        Request<String> qingQiu = new ShangchuanQingqiu(SHANGCHUAN_DANZHANGSHENFENZHENG, ditubiao, TuListdddd, new QingqiuFanhuiJianting<String>() {
            @Override
            public void onResponse(String response) {
                Log.v("zgy", "===========onResponse=========" + response);
                if (response.contains("1000") && !response.contains("-1000")) {
                    if (code == 1003) {
                        renlianTuDizhi = true;
                        dangqianpaizhuangtai3.setVisibility(View.VISIBLE);
                        dangqianpaizhuangtai3.setImageResource(R.mipmap.shenfenduile);

                        if (fisrtSaveLianXinx) {
                            YincangShijianClickTols.QingqiuMaidian(SHANGCHUANRENLIANFIRST);
                        }
                        fisrtSaveLianXinx = false;

                    } else {
                        if (fisrtSaveXinx) {
                            YincangShijianClickTols.QingqiuMaidian(SHANGCHAUNSHENFENZHAOFIRST);
                        }

                        if (code == 1001) {
                            fisrtSaveZhengmian = false;
                            zhengmianTuDizhi = true;
                            dangqianpaizhuangtai.setVisibility(View.VISIBLE);
                            dangqianpaizhuangtai.setImageResource(R.mipmap.shenfenduile);
                        } else if (code == 1002) {
                            fisrtSaveFanmian = false;
                            beimianTuDizhi = true;
                            dangqianpaizhuangtai2.setVisibility(View.VISIBLE);
                            dangqianpaizhuangtai2.setImageResource(R.mipmap.shenfenduile);
                        }

                    }
                    sifouKeXiayibu(false);

                } else {
                    if (code == 1003) {
                        renlianTuDizhi = false;
                        dangqianpaizhuangtai3.setVisibility(View.VISIBLE);
                        dangqianpaizhuangtai3.setImageResource(R.mipmap.shenfencuole);
                    } else {
                        if (code == 1001) {
                            zhengmianTuDizhi = false;
                            dangqianpaizhuangtai.setVisibility(View.VISIBLE);
                            dangqianpaizhuangtai.setImageResource(R.mipmap.shenfencuole);
                        } else if (code == 1002) {
                            beimianTuDizhi = false;
                            dangqianpaizhuangtai2.setVisibility(View.VISIBLE);
                            dangqianpaizhuangtai2.setImageResource(R.mipmap.shenfencuole);
                        }
//                    tututpaisnd1.setVisibility(View.GONE);
//                    tututpaisnd2.setVisibility(View.GONE);
                        zhengmianTu = null;
                        zhengmianTuDizhi = false;
                        beimianTu = null;
                        beimianTuDizhi = false;
                    }
                }
                jiazaizhongWindows.hideKuangkuangIng();

//                getImageData();
            }

            @Override
            public void onErrorResponse(VolleyError error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.v("zgy", "===========VolleyError=========" + error);

                if (code == 1003) {
                    renlianTuDizhi = false;
                    dangqianpaizhuangtai3.setVisibility(View.VISIBLE);
                    dangqianpaizhuangtai3.setImageResource(R.mipmap.shenfencuole);
                } else {
                    if (code == 1001) {
                        zhengmianTuDizhi = false;
                        dangqianpaizhuangtai.setVisibility(View.VISIBLE);
                        dangqianpaizhuangtai.setImageResource(R.mipmap.shenfencuole);
                    } else if (code == 1002) {
                        beimianTuDizhi = false;
                        dangqianpaizhuangtai2.setVisibility(View.VISIBLE);
                        dangqianpaizhuangtai2.setImageResource(R.mipmap.shenfencuole);
                    }
//                    tututpaisnd1.setVisibility(View.GONE);
//                    tututpaisnd2.setVisibility(View.GONE);
                    zhengmianTu = null;
                    zhengmianTuDizhi = false;
                    beimianTu = null;
                    beimianTuDizhi = false;
                }
            }
        });
        qingQiu.setRetryPolicy(new DefaultRetryPolicy(60000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        TupianGongjuShanghuanByVoleyley.huquQingqiuDuilie().add(qingQiu);
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
                    Toast.makeText(JinJinGoGoJian4Activity.this, response.getnuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
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

    ChanpinMoxingPPWindows chanpinMoxingPPWindows2;

    private void chushiHUAppWind3() {
        chanpinMoxingPPWindows2 = new ChanpinMoxingPPWindows(this);

        LayoutInflater chuangYingshe = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View chaungView = chuangYingshe.inflate(R.layout.wndw_xuancxxh_chanpin2, null);
        TextView quxiaoquxiao_fjdoj_buyaoquan = chaungView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        TextView gaoding_sure_djdj_yaogeiwo = chaungView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);

        quxiaoquxiao_fjdoj_buyaoquan.setText(getString(R.string.peizhiandout_egdsgj_cer));
        gaoding_sure_djdj_yaogeiwo.setText(getString(R.string.shangpins_foryo_con));

        chaungView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chanpinMoxingPPWindows2.xiaohuiPPw();
                Toast.makeText(JinJinGoGoJian4Activity.this, getString(R.string.tusitishi_dizih_12), Toast.LENGTH_SHORT).show();
            }
        });
        chaungView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chanpinMoxingPPWindows2.xiaohuiPPw();
                QuanxianShipeiGuanliTols.tiaoZhuanZhuajiSetsPage(JinJinGoGoJian4Activity.this);
            }
        });

        chanpinMoxingPPWindows2.chushihuaPPW(chaungView, false, (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

    }


    ChanpinMoxingPPWindows wuwangluoKuang;

    private void chaungjianPPw() {
        wuwangluoKuang = new ChanpinMoxingPPWindows(this);

        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_xuancxxh_chanpin2, null);
        TextView jythgrsdtfygukyjh = popupView.findViewById(R.id.jythgrsdtfygukyjh);
        TextView quxiaoquxiao_fjdoj_buyaoquan = popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        TextView gaoding_sure_djdj_yaogeiwo = popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);

        jythgrsdtfygukyjh.setText(getString(R.string.tusitishi_dizih_00));
        quxiaoquxiao_fjdoj_buyaoquan.setText(getString(R.string.shangpins_foryo_can2));
        gaoding_sure_djdj_yaogeiwo.setText(getString(R.string.shangpins_foryo_abr));

        popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wuwangluoKuang.xiaohuiPPw();
            }
        });
        popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wuwangluoKuang.xiaohuiPPw();

                Intent intent = new Intent();
                intent.setAction("android.net.wifi.PICK_WIFI_NETWORK");
                startActivity(intent);
            }
        });

        wuwangluoKuang.chushihuaPPW(popupView, false, (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

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