package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.gjtype.SelectCountryDialog;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.gjtype.SelectGuoJiaUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.YzmFournumModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.GaogeZhanghaoIntoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DaojishiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.Map;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.XITONG_YINSI_BASIC;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ISTEST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DENGLUCHENGGONG;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIDENGLUBTNANNIU;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIDENGLUYEFANHUI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIFASONGYZM;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUDENGLUYE;
//import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_BRH_1;
//import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_BRH_1;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUWENANYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FB_1;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FIB_1;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.THREECOMPANY_FLYER_1;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.ZHUCECHENGONG;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica.BAIOZHUTA;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ZHUAJI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_TOKEN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ID;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing1;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing2;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.bianhuaYuyan;

//import im.crisp.client.Crisp;

public class GaogeZhanghaoIntoActivity extends MyJichuBsActivity implements View.OnClickListener {

    private static final int againTime = 61;

    private ImageView hdusud_sshurukuang_ttwenan2;
    private TextView zhuajiquhao_YTs12_sfhgg;
    private View hdusud_sshurukuang_ttwenan3;

    private View gaogehaodingbuheight;
    private ImageView gaogehaogoback;
    private ImageView gaohao_tubiaoapp;
    private TextView nonghao_mainbtn, uyjthrgefasdh, uyjthrgefasdhcount, jingojian1dibuxieyi;
    private LinearLayout uyjthrgefasdhbuju;

    private EditText jasldj_sidjyzm_yzm_vi;//验证码输入框

    private ChanpinMoxingPPWindows popupWindow;

    private RequestOptions options = RequestOptions.circleCropTransform();
    private EditText sdgsd_jf52ojYY_sfj2;

    private String code = "";


    private CountDownTimer countDownTimer;
    private LinearLayout coderlayoutop;
    private TextView verficolde;
    private TextView jigeshijian;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_gaogehao);

        jiazaizhongWindows.setKefouDianjiWaibu(false);

        MyJichuAplica.huoquGugeIdddd();

        changjianPPw3();

        gaogehaogoback = findViewById(R.id.gaogehaogoback);
        gaogehaodingbuheight = findViewById(R.id.golbe_sjflT123_dingbuview);
        gaohao_tubiaoapp = findViewById(R.id.gaohao_tubiaoapp);
        nonghao_mainbtn = findViewById(R.id.nonghao_mainbtn);
        sdgsd_jf52ojYY_sfj2 = findViewById(R.id.sdgsd_jf52ojYY_sfj2);
        jasldj_sidjyzm_yzm_vi = findViewById(R.id.jasldj_sidjyzm_yzm_vi);
        uyjthrgefasdhbuju = findViewById(R.id.uyjthrgefasdhbuju);
        uyjthrgefasdh = findViewById(R.id.uyjthrgefasdh);
        uyjthrgefasdhcount = findViewById(R.id.uyjthrgefasdhcount);
        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);


        hdusud_sshurukuang_ttwenan2 = findViewById(R.id.hdusud_sshurukuang_ttwenan2);
        zhuajiquhao_YTs12_sfhgg = findViewById(R.id.zhuajiquhao_YTs12_sfhgg);
        hdusud_sshurukuang_ttwenan3 = findViewById(R.id.hdusud_sshurukuang_ttwenan3);

        coderlayoutop = findViewById(R.id.coderlayoutop);
        verficolde = findViewById(R.id.verficolde);
        jigeshijian = findViewById(R.id.jigeshijian);

        //动态设置状态栏高度
        ConstraintLayout.LayoutParams yuebujuguanli = (ConstraintLayout.LayoutParams) gaogehaodingbuheight.getLayoutParams();
        yuebujuguanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        gaogehaodingbuheight.setLayoutParams(yuebujuguanli);

        gaogehaogoback.setOnClickListener(this);
        jingojian1dibuxieyi.setOnClickListener(this);
        nonghao_mainbtn.setOnClickListener(this);
        uyjthrgefasdhbuju.setOnClickListener(this);
        hdusud_sshurukuang_ttwenan3.setOnClickListener(this);

        String guoCode = SelectGuoJiaUtil.getCode();
        updateFlag(guoCode);

        Glide.with(this).asBitmap()
                .load(R.mipmap.useimg_desklogo)
                .apply(options)
                .into(gaohao_tubiaoapp);

//        Glide.with(this).load("https://cn.bing.com/az/hprichbg/rb/Dongdaemun_ZH-CN10736487148_1920x1080.jpg").into(loginLogo);

        chaungjianPPW();
        sdgsd_jf52ojYY_sfj2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String trim = charSequence.toString().trim();

                if (trim.length() >= 1) {
                    if (countover) { //倒计时结束
                        uyjthrgefasdhbuju.setBackground(getResources().getDrawable(R.drawable.bj_thgfesrgef));
                        uyjthrgefasdh.setTextColor(getColor(R.color.sezhi_argb_baise));
                    } else {
                        uyjthrgefasdhbuju.setBackground(getResources().getDrawable(R.drawable.bj_nbvcsdvfb));
                        uyjthrgefasdh.setTextColor(getColor(R.color.sezhi_argb_6C6C6C));
                    }
                    //验证码也不为空 登录按钮才高亮
                    if (!TextUtils.isEmpty(jasldj_sidjyzm_yzm_vi.getText().toString().trim())) {
                        nonghao_mainbtn.setBackground(getResources().getDrawable(R.drawable.bj_thgsdthgsfew));
                    } else {
                        nonghao_mainbtn.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                    }

                } else {
                    uyjthrgefasdhbuju.setBackground(getResources().getDrawable(R.drawable.bj_nbvcsdvfb));
                    uyjthrgefasdh.setTextColor(getColor(R.color.sezhi_argb_6C6C6C));

                    nonghao_mainbtn.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        jasldj_sidjyzm_yzm_vi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                jasldj_sidjyzm_yzm_vi.setSelection(jasldj_sidjyzm_yzm_vi.getText().toString().length());
                ;
            }

            @Override
            public void afterTextChanged(Editable s) {
                String trim = s.toString().trim();
                if (trim.length() > 0 && !TextUtils.isEmpty(sdgsd_jf52ojYY_sfj2.getText().toString())) {
                    nonghao_mainbtn.setBackground(getResources().getDrawable(R.drawable.bj_thgsdthgsfew));
                } else {
                    nonghao_mainbtn.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
                }
            }
        });

        //埋点 进入登录页
        YincangShijianClickTols.QingqiuMaidian(JINRUDENGLUYE);
    }

    private void chaungjianPPW() {
        popupWindow = new ChanpinMoxingPPWindows(this);

        LayoutInflater ppwFanshe = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ppwShitu = ppwFanshe.inflate(R.layout.wndw_niuchengok, null);
        RelativeLayout popLayoutSuccessRl = ppwShitu.findViewById(R.id.popLayoutSuccessRl);
        popLayoutSuccessRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.xiaohuiPPw();
            }
        });
        popupWindow.chushihuaPPW(ppwShitu, false);
    }


    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.nonghao_mainbtn) {
            if (!WngluoTols.youWangluoFou(GaogeZhanghaoIntoActivity.this)) {
                baseaNonet.showPPw(Gravity.CENTER);
                return;
            }

            if (sdgsd_jf52ojYY_sfj2.getText().length() < 8) {
//                Toast.makeText(GaogeZhanghaoIntoActivity.this, getString(R.string.tusitishi_dizih_01), Toast.LENGTH_SHORT).show();
                ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_01));
                return;
            }
            if (jasldj_sidjyzm_yzm_vi.getText().toString().length() <= 3) {
//                Toast.makeText(GaogeZhanghaoIntoActivity.this, getString(R.string.gaozhanghao_pagewenan_jhgd), Toast.LENGTH_SHORT).show();
                ToastUtil.showShortToast(getString(R.string.gaozhanghao_pagewenan_jhgd));
                return;
            }

            if (DianjiQuickTols.clickkuaikuai()) {
                return;
            }
            YincangShijianClickTols.QingqiuMaidian(DIANJIDENGLUBTNANNIU);
            qingqiujiekouGaozhanghao();

        } else {
            if (DianjiQuickTols.clickkuaikuai()) {
                return;
            }
            switch (view.getId()) {

                case R.id.uyjthrgefasdhbuju:
                    if (!WngluoTols.youWangluoFou(GaogeZhanghaoIntoActivity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    if (sdgsd_jf52ojYY_sfj2.getText().length() < 8) {
//                        Toast.makeText(GaogeZhanghaoIntoActivity.this, getString(R.string.tusitishi_dizih_01), Toast.LENGTH_SHORT).show();
                        ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_01));
                        return;
                    } else if (!uyjthrgefasdh.getText().toString().trim().equals(getString(R.string.gaozhanghao_pagewenan_htrgestg))) {
//                    Toast.makeText(GaogeZhanghaoIntoActivity.this, getString(R.string.tusitishi_dizih_16), Toast.LENGTH_SHORT).show();
                        return;
                    }
                    //埋点 点击发送验证码
                    YincangShijianClickTols.QingqiuMaidian(DIANJIFASONGYZM);
                    qingqiuJiekouHuoquYZM();
                    break;
                case R.id.gaogehaogoback:
                    if (!WngluoTols.youWangluoFou(GaogeZhanghaoIntoActivity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    //埋点 登录也返回
                    YincangShijianClickTols.QingqiuMaidian(DIANJIDENGLUYEFANHUI);
//                Intent broadcastIntent = new Intent(ZHUYEMIAN);
//                sendBroadcast(broadcastIntent);
                    Intent intent = new Intent(GaogeZhanghaoIntoActivity.this, ImpZhuyaoActivity.class);
                    startActivity(intent);
                    finish();
                    break;
                case R.id.jingojian1dibuxieyi:
                    if (!WngluoTols.youWangluoFou(GaogeZhanghaoIntoActivity.this)) {
                        baseaNonet.showPPw(Gravity.CENTER);
                        return;
                    }
                    XieyiShowTols.quH5YinsiPage(GaogeZhanghaoIntoActivity.this);
                    break;

                case R.id.hdusud_sshurukuang_ttwenan3:
                    SelectCountryDialog.openShow(this, true, new SelectCountryDialog.OnCallback() {
                        @Override
                        public void callback(String type) {
                            updateFlag(type);
                        }
                    });
                    break;
            }
        }
    }

    private void updateFlag(String type){
        if (TextUtils.equals(type, "51")) {
            hdusud_sshurukuang_ttwenan2.setImageResource(R.mipmap.useimg_nbveasrdth);
            zhuajiquhao_YTs12_sfhgg.setText(getString(R.string.gaozhanghao_pagewenan_guojihuazhuaji2));
        } else {
            hdusud_sshurukuang_ttwenan2.setImageResource(R.mipmap.useimg_nbveasrdth_eg);
            zhuajiquhao_YTs12_sfhgg.setText(getString(R.string.gaozhanghao_pagewenan_guojihuazhuaji1));
        }
    }

    private void qingqiuJiekouHuoquYZM() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.LOGIN_GETCODE, YzmFournumModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<YzmFournumModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", "");
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
                map.put("powerfulStrangerBackGuidance", sdgsd_jf52ojYY_sfj2.getText().toString().trim());
            }

            @Override
            public void onSuccess(YzmFournumModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.averageEmbassyNationalVictoryDepth == 1000) {

                    count = againTime;


                    uyjthrgefasdhbuju.setBackground(getResources().getDrawable(R.drawable.bj_nbvcsdvfb));
                    uyjthrgefasdh.setText(getString(R.string.gaozhanghao_pagewenan_yzm2));
                    uyjthrgefasdhcount.setVisibility(View.VISIBLE);
                    uyjthrgefasdhcount.setText("61");
                    uyjthrgefasdh.setTextColor(getColor(R.color.sezhi_argb_6C6C6C));
                    countover = false;
                    kaishiZhengchangDaoshushijian(againTime);
//                    handler.sendEmptyMessageDelayed(0, 1000);


                    YzmFournumModel.RoughNaturalProBean bean = response.getBigAncientTastyHeadteacher();
                    if (bean.scientificImmediateFreedom != 1 && !TextUtils.isEmpty(bean.carefulTrolleyContentHotel) && !TextUtils.isEmpty(bean.chemicalSweatShoe)) {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                jasldj_sidjyzm_yzm_vi.setText(response.bigAncientTastyHeadteacher.chemicalSweatShoe);
                                jasldj_sidjyzm_yzm_vi.setSelection(jasldj_sidjyzm_yzm_vi.getText().length());
                                coderlayoutop.setVisibility(View.VISIBLE);
                                verficolde.setText(bean.carefulTrolleyContentHotel);
                                startCountDownTimer();
                            }
                        }, 2000);
                    }

                } else {
//                    Toast.makeText(GaogeZhanghaoIntoActivity.this, response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "error---->" + error);
                if (error.contains("java.net.UnknownHostException:")) {
                    chanpinMoxingPPWindows.showPPw(Gravity.CENTER);
                }
            }
        });
    }

    private void startCountDownTimer() {
        jigeshijian.setText("Marca revisado (5S)");
        countDownTimer = new CountDownTimer(5000, 1000) { // 5000毫秒 = 5秒, 1000毫秒 = 1秒
            public void onTick(long millisUntilFinished) {
                // 毫秒转秒并更新TextView
                int seconds = (int) (millisUntilFinished / 1000);
                jigeshijian.setText("Marca revisado (" + seconds + "S)");
            }

            public void onFinish() {
                jigeshijian.setText("");
                coderlayoutop.setVisibility(View.GONE);
            }
        }.start();
    }


    private int count = 0;

    private int jisuanDaojishi() {
        count--;
        if (count <= 0) {
            uyjthrgefasdhcount.setVisibility(View.GONE);
            uyjthrgefasdh.setText(getString(R.string.gaozhanghao_pagewenan_htrgestg));
            uyjthrgefasdh.setTextColor(getColor(R.color.sezhi_argb_baise));
        } else {
            uyjthrgefasdh.setText(getString(R.string.gaozhanghao_pagewenan_yzm2));
            uyjthrgefasdhcount.setVisibility(View.VISIBLE);
            uyjthrgefasdhcount.setText(ZhuajiPingmuTols.huoquXiugaiHaoma(count) + "s");
            uyjthrgefasdh.setTextColor(getColor(R.color.sezhi_argb_6C6C6C));
        }
        return count;
    }

    //进行一个消息的处理
    @SuppressLint("HandlerLeak")
    private Handler yemianCaozuo = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if (msg.what == 0) {
                if (jisuanDaojishi() > 0) {
                    ToastUtil.showShortToast("111");
                    yemianCaozuo.sendEmptyMessageDelayed(0, 1000);
                }
            }
        }

        ;
    };

    private void qingqiujiekouGaozhanghao() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.LOGIN_REGISTERORLOGIN, GaogeZhanghaoIntoModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<GaogeZhanghaoIntoModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("attractiveDarkClassFamousCough", YincangShijianClickTols.yonghusmId);//instanceid
                map.put("blankRecentFormNewReservation", YincangShijianClickTols.feiSId);//afid
                map.put("doubleMotorcycleIslandCompetition", YincangShijianClickTols.yichuanId);
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", "");
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
                map.put("powerfulStrangerBackGuidance", sdgsd_jf52ojYY_sfj2.getText().toString().trim());
                map.put("chemicalSweatShoe", jasldj_sidjyzm_yzm_vi.getText().toString().trim());//验证码
            }

            @Override
            public void onSuccess(GaogeZhanghaoIntoModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (response.averageEmbassyNationalVictoryDepth == 1000) {

                    coderlayoutop.setVisibility(View.GONE);
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }

                    //重置状态
                    ChangliangConfigTols.jsonUpload = false;
                    ChangliangConfigTols.jsonUploadStatus = false;
                    BendiHuancunTols.commitZifuchuan(XITONG_YINSI_BASIC, "0");

                    GaogeZhanghaoIntoModel.RoughNaturalProBean bigAncientTastyHeadteacher = response.bigAncientTastyHeadteacher;
                    BendiHuancunTols.commitZifuchuan(YONGHU_ID, bigAncientTastyHeadteacher.singleComfortClerkSwissMachine + "");
                    if (!TextUtils.isEmpty(bigAncientTastyHeadteacher.pleasantSeaweedMobileHousewife)) {

                        //crash用
                        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(GaogeZhanghaoIntoActivity.this, YONGHU_ID))) {
                            try {
                                FirebaseCrashlytics.getInstance().setUserId(BendiHuancunTols.huoQuZifuchuan(GaogeZhanghaoIntoActivity.this, YONGHU_ID) + "," +
                                        sdgsd_jf52ojYY_sfj2.getText().toString().trim() + "," +
                                        YincangShijianClickTols.yichuanId);
                            } catch (Exception e) {

                            }

                        }

                        //注册成功
                        if ("1".equals(bigAncientTastyHeadteacher.shyLeftPictureBell)) {
                            YincangShijianClickTols.QingqiuMaidian(ZHUCECHENGONG);

                            YincangShijianClickTols.LianshuMaidian(THREECOMPANY_FB_1);
                            YincangShijianClickTols.HuojiMaidian(THREECOMPANY_FIB_1);
//                            YincangShijianClickTols.BrMaidian(THREECOMPANY_BRH_1);
//                            YincangShijianClickTols.FlyMaidian(THREECOMPANY_BRH_1.getName());
                            YincangShijianClickTols.FlyMaidian(THREECOMPANY_FLYER_1);
                        }

                        BendiHuancunTols.commitZifuchuan(YONGHU_ISTEST, bigAncientTastyHeadteacher.scientificImmediateFreedom);
                        BendiHuancunTols.commitZifuchuan(YONGHU_TOKEN, bigAncientTastyHeadteacher.pleasantSeaweedMobileHousewife);
                        BendiHuancunTols.commitZifuchuan(YONGHU_ZHUAJI, sdgsd_jf52ojYY_sfj2.getText().toString().trim());


//                        Crisp.resetChatSession(GaogeZhanghaoIntoActivity.this);
//                        Crisp.setTokenID(sdgsd_jf52ojYY_sfj2.getText().toString().trim());//登录⼿机号
//                        Crisp.setUserPhone(sdgsd_jf52ojYY_sfj2.getText().toString().trim());//登录⼿机号
//                        //判断是否为测试账号
//                        if ("1".equals(bigAncientTastyHeadteacher.scientificImmediateFreedom)) {
//                            Crisp.setSessionSegment("test");
//                        } else {
//                            Crisp.setSessionSegment(getString(R.string.ruanjianapp_mingzi));//app名称
//                        }

                        //回首页
//                        Toast.makeText(LoginActivity.this, getString(R.string.tusitishi_dizih_09), Toast.LENGTH_SHORT).show();

                        YincangShijianClickTols.QingqiuMaidian(DENGLUCHENGGONG);
//                        Intent broadcastIntent = new Intent(ZHUYEMIAN);
//                        sendBroadcast(broadcastIntent);
                        Intent intent = new Intent(GaogeZhanghaoIntoActivity.this, ImpZhuyaoActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();
                    }

                } else if (response.averageEmbassyNationalVictoryDepth == -1003) {
//                    Toast.makeText(GaogeZhanghaoIntoActivity.this, response.nuclearTrialSpareMountainousBat, Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.nuclearTrialSpareMountainousBat);
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "error---->" + error);
                if (error.contains("java.net.UnknownHostException:")) {
                    chanpinMoxingPPWindows.showPPw(Gravity.CENTER);
                }
            }
        });
    }

    //文本改变
//    @Override
//    public void onShuruBianhua(View view, String content) {
//        if (content.length() == 4) {
//            nonghao_mainbtn.setBackground(getResources().getDrawable(R.drawable.bj_thgsdthgsfew));
//        } else {
//            nonghao_mainbtn.setBackground(getResources().getDrawable(R.drawable.bj_hgfafesrgfeasrg));
//        }
//        code = content;
//
//    }
//
//    //输入完成
//    @Override
//    public void onShuruWancheng(View view, String content) {
//
//    }

    boolean countover = true;

    private void kaishiZhengchangDaoshushijian(long time) {
        /**
         * 最简单的倒计时类，实现了官方的CountDownTimer类（没有特殊要求的话可以使用）
         * 即使退出activity，倒计时还能进行，因为是创建了后台的线程。
         * 有onTick，onFinsh、cancel和start方法
         */
        CountDownTimer jianjianshijian = new CountDownTimer(time * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d(BAIOZHUTA, "onTick  " + millisUntilFinished / 1000);
                if (count <= 1) {
                    countover = true;
                    uyjthrgefasdhbuju.setBackground(getResources().getDrawable(R.drawable.bj_thgfesrgef));
                    uyjthrgefasdh.setText(getString(R.string.gaozhanghao_pagewenan_htrgestg));
                    uyjthrgefasdhcount.setVisibility(View.GONE);
                    uyjthrgefasdh.setTextColor(getColor(R.color.sezhi_argb_baise));
                } else {
//                    uyjthrgefasdhbuju.setBackground(getResources().getDrawable(R.drawable.bj_nbvcsdvfb));
                    uyjthrgefasdhbuju.setBackground(null);
                    uyjthrgefasdh.setText(getString(R.string.gaozhanghao_pagewenan_yzm2));
                    uyjthrgefasdhcount.setVisibility(View.VISIBLE);
                    uyjthrgefasdhcount.setText(ZhuajiPingmuTols.huoquXiugaiHaoma((int) (millisUntilFinished / 1000)) + "s");
                    uyjthrgefasdh.setTextColor(getColor(R.color.sezhi_argb_6C6C6C));
                }
            }

            @Override
            public void onFinish() {
                Log.d(BAIOZHUTA, "onFinish -- 倒计时结束");
                countover = true;
                uyjthrgefasdhbuju.setBackground(getResources().getDrawable(R.drawable.bj_thgfesrgef));
                uyjthrgefasdh.setText(getString(R.string.gaozhanghao_pagewenan_htrgestg));
                uyjthrgefasdhcount.setVisibility(View.GONE);
                uyjthrgefasdh.setTextColor(getColor(R.color.sezhi_argb_baise));
            }
        };
        jianjianshijian.start();
        //timer.cancel();
    }

    private void kaishiDaoshijjis(long shijian) {
        DaojishiTols countdownTimer = new DaojishiTols(shijian * 1000, 1000) {
            @Override
            public void onTtTitck(long millisUntilFinished, int percent) {
                Log.d(BAIOZHUTA, "onTick   " + millisUntilFinished / 1000);
//                timeTextView.setText("还剩" + millisUntilFinished / 1000 + "秒");
            }

            @Override
            public void onOver() {
                Log.d(BAIOZHUTA, "onFinish -- 倒计时结束");
//                timeTextView.setText("结束");
            }
        };
        countdownTimer.letsGo();
    }

    ChanpinMoxingPPWindows chanpinMoxingPPWindows;

    private void changjianPPw3() {
        chanpinMoxingPPWindows = new ChanpinMoxingPPWindows(this);

        LayoutInflater chaungFanshe = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ppwShitu = chaungFanshe.inflate(R.layout.wndw_xuancxxh_chanpin2, null);
        TextView jythgrsdtfygukyjh = ppwShitu.findViewById(R.id.jythgrsdtfygukyjh);
        TextView quxiaoquxiao_fjdoj_buyaoquan = ppwShitu.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        TextView gaoding_sure_djdj_yaogeiwo = ppwShitu.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);

        jythgrsdtfygukyjh.setText(getString(R.string.tusitishi_dizih_00));
        quxiaoquxiao_fjdoj_buyaoquan.setText(getString(R.string.shangpins_foryo_can2));
        gaoding_sure_djdj_yaogeiwo.setText(getString(R.string.shangpins_foryo_abr));

        ppwShitu.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chanpinMoxingPPWindows.xiaohuiPPw();
            }
        });
        ppwShitu.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chanpinMoxingPPWindows.xiaohuiPPw();

                Intent intent = new Intent();
                intent.setAction("android.net.wifi.PICK_WIFI_NETWORK");
                startActivity(intent);
            }
        });

        chanpinMoxingPPWindows.chushihuaPPW(ppwShitu, false, (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}