package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DingWeiSinglebangzhuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.MyBefeeerReceiver.GuanbiAppService;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.gjtype.SelectCountryDialog;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.PppQxPanduaner;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.SanfangRxppp;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZifuchuanPinjieSpanTols;

import org.json.JSONObject;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;

//import io.branch.indexing.BranchUniversalObject;
//import io.branch.referral.Branch;
//import io.branch.referral.BranchError;
//import io.branch.referral.util.LinkProperties;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ID;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIWENANYETIAOGUOBTN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIWENANYETONGYIBTN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUAPP;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUWENANYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.NEWRISK_OPENAPPWITHTOKEN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.QUANXIANDINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.WENANYESHOUQUANJIEGUO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian3Activity.DUQU_BIGJSON_PPPP;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.YINSI_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols.FUWU_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuGodu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.XITONG_YINSI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.GuojiaLeixing2;

import java.io.IOException;

public class AOpenStarActivity extends MyJichuBsActivity {

    private int shulaing = 3;
    private boolean shujuBeooan = true;

    private ImageView usdjTupian;

    private ChanpinMoxingPPWindows chanpinMoxingPPWindows;
    //先判断一个是否允许了权限 等页面跳转的时候再根据ture去打点 因为页面一开始可可能没有获取到gaid
    private boolean isallowper = false;
    //是否新启动
    private boolean isstart = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_start_hellowork);

        usdjTupian = findViewById(R.id.usdjTupian);


        //动态设置状态栏高度
        ConstraintLayout.LayoutParams bujuguanllili = (ConstraintLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        bujuguanllili.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(bujuguanllili);

        chuangjianPPw();

        String userid = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID);
        if("00000000-0000-0000-0000-000000000000".equals(YincangShijianClickTols.yichuanId)){
            if(!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(),BendiHuancunTols.GAIDGUGE))){
                YincangShijianClickTols.yichuanId = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(),BendiHuancunTols.GAIDGUGE);
            }

        }
        if(!TextUtils.isEmpty(userid) || (!TextUtils.isEmpty(YincangShijianClickTols.yichuanId) &&
                !"00000000-0000-0000-0000-000000000000".equals(YincangShijianClickTols.yichuanId)) ){
            YincangShijianClickTols.QingqiuMaidian(JINRUAPP);
        }else {
            huoquGugeIdddd();
        }

        sanfangRxppp = new SanfangRxppp(this);


        usdjTupian.post(new Runnable() {
            @Override
            public void run() {
                showQuanxxxppw();
            }
        });

        Intent closeint = new Intent(this, GuanbiAppService.class);
        startService(closeint);
    }

    //咱在写一个计算Welcome界面的广告时间结束后进入主界面的方法
    private int getShulaing() {
        shulaing--;

        if (shulaing <= 0 && shujuBeooan) {

            if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(this, BendiHuancunTols.YONGHU_TOKEN))) {
                YincangShijianClickTols.QingqiuNewRiskMaidian(NEWRISK_OPENAPPWITHTOKEN);
                try {
                    FirebaseCrashlytics.getInstance().setUserId(
                            BendiHuancunTols.huoQuZifuchuan(AOpenStarActivity.this, YONGHU_ID) + "," +
                            BendiHuancunTols.huoQuZifuchuan(AOpenStarActivity.this, BendiHuancunTols.YONGHU_ZHUAJI) + "," +
                            YincangShijianClickTols.yichuanId);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                //crash用
                try {
                    FirebaseCrashlytics.getInstance().setUserId(YincangShijianClickTols.yichuanId);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


            isstart = true;
            Intent intent = new Intent(AOpenStarActivity.this, ImpZhuyaoActivity.class);
            intent.putExtra("allowperdian", isallowper);
            intent.putExtra("startdian", isstart);
            startActivity(intent);

            finish();
        }
        return shulaing;
    }

    //进行一个消息的处理
    @SuppressLint("HandlerLeak")
    private Handler caozuozhe = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if (msg.what == 0) {
                if (getShulaing() > 0) {
                    caozuozhe.sendEmptyMessageDelayed(0, 1000);
                }
            } else if (msg.what == 1) {


            }
        }

        ;
    };

    private void showQuanxxxppw() {
        try {
            String privacy = BendiHuancunTols.huoQuZifuchuan(AOpenStarActivity.this, XITONG_YINSI);
            if (!"1".equals(privacy)) {
                SelectCountryDialog.openShow(this, false, new SelectCountryDialog.OnCallback() {
                    @Override
                    public void callback(String type) {
                        chanpinMoxingPPWindows.showPPw(Gravity.CENTER);

                        //显示权限页面埋点
                        YincangShijianClickTols.QingqiuMaidian(JINRUWENANYE);
                    }
                });

            } else {
                caozuozhe.sendEmptyMessageDelayed(0, 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void chuangjianPPw() {
        chanpinMoxingPPWindows = new ChanpinMoxingPPWindows(this);

        LayoutInflater chaungfanzhe = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View chuangshitu = chaungfanzhe.inflate(R.layout.wndw_start, null);

        TextView jieShouw_fhfj_Qxhjofjxian = chuangshitu.findViewById(R.id.jieShouw_fhfj_Qxhjofjxian);
        TextView maiso_des_opppp_wenan = chuangshitu.findViewById(R.id.maiso_des_opppp_wenan);

        switch (GuojiaLeixing) {
            case GuojiaLeixing2://秘鲁
                shezhiDingbuWENAN2(jieShouw_fhfj_Qxhjofjxian);
                zhezhiTxtxtt2(maiso_des_opppp_wenan);
                break;
            default://西班牙
                sehzhiTDingbuTXXXT(jieShouw_fhfj_Qxhjofjxian);
                zhezhiTxtxtt(maiso_des_opppp_wenan);
        }

        chuangshitu.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //埋点：点击权限跳过按钮
                YincangShijianClickTols.QingqiuMaidian(DIANJIWENANYETIAOGUOBTN);

                chanpinMoxingPPWindows.xiaohuiPPw();
                BendiHuancunTols.commitZifuchuan(XITONG_YINSI, "0");
                finish();
            }
        });
        chuangshitu.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BendiHuancunTols.commitZifuchuan(XITONG_YINSI, "1");
                //埋点：点击权限同意按钮
                YincangShijianClickTols.QingqiuMaidian(DIANJIWENANYETONGYIBTN);
                jianchaBIGjjsensonQQQppp();
            }
        });

        chanpinMoxingPPWindows.chushihuaPPW(chuangshitu, false, (int) (huoquPingmuKuandu(this) * 0.8), (int) (huoquPingmuGodu(this) * 0.8), new ChanpinMoxingPPWindows.OnDianjiHuidiaoJianting() {
            @Override
            public void onDianjiQUxioa() {
//                caozuozhe.sendEmptyMessageDelayed(0, 1000);
            }
        }, false);
    }


    //打开文件管理器,同时处理图片（判断权限）
    private SanfangRxppp sanfangRxppp;

    private void jianchaBIGjjsensonQQQppp() {
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
//                                        Manifest.permission.ACCESS_FINE_LOCATION,
                                        Manifest.permission.READ_SMS,
                                        Manifest.permission.READ_CALL_LOG,
//                                        Manifest.permission.SEND_SMS,
                                        Manifest.permission.READ_PHONE_STATE)) {
                                    Log.d("requestLocation---->>>", "权限被拒绝");
                                    if (
                                            !shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)
                                                    || !shouldShowRequestPermissionRationale(Manifest.permission.READ_CALENDAR)
                                                    || !shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_WIFI_STATE)
                                                    || !shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_NETWORK_STATE)
                                                    || !shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_COARSE_LOCATION)
                                                    || !shouldShowRequestPermissionRationale(Manifest.permission.READ_SMS)
                                                    || !shouldShowRequestPermissionRationale(Manifest.permission.READ_CALL_LOG)
                                                    || !shouldShowRequestPermissionRationale(Manifest.permission.READ_PHONE_STATE)
                                    ) {
                                        //埋点：获取权限结果 不管成功失败都要
                                        YincangShijianClickTols.QingqiuMaidian(WENANYESHOUQUANJIEGUO);
                                        if(shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_COARSE_LOCATION)){
                                            Log.d("dingweidian---->>>", "tongyi1");
                                            YincangShijianClickTols.QingqiuMaidian(QUANXIANDINGWEI);
                                        }
                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝了 而且点击了不在提示（始终禁止） 所以 需要判断出来 有必要的话 需要用代码跳转到设置页面");
//                                        Toast.makeText(SplashActivity.this, getString(R.string.tusitishi_dizih_12), Toast.LENGTH_SHORT).show();
                                    } else {
                                        //埋点：获取权限结果 不管成功失败都要
                                        isallowper = true;

                                        YincangShijianClickTols.QingqiuMaidian(WENANYESHOUQUANJIEGUO);
                                        Log.d("requestLocation---->>>", "权限上次的时候被拒绝");
//                                        Toast.makeText(SplashActivity.this, getString(R.string.tusitishi_dizih_11), Toast.LENGTH_SHORT).show();
                                    }



                                    if (ActivityCompat.checkSelfPermission(AOpenStarActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

                                        isallowper = true;

                                        Log.d("dingweidian", "tongyi2");
                                        YincangShijianClickTols.QingqiuMaidian(QUANXIANDINGWEI);
                                        //解毒
                                        DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(AOpenStarActivity.this);
                                        ll.kaiqiDingwGongneng();
                                    }
                                } else {

                                    try {

                                        isallowper = true;
                                        Log.d("dingweidian", "tongyi3");
                                        YincangShijianClickTols.QingqiuMaidian(QUANXIANDINGWEI);
                                        //解毒
                                        DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(AOpenStarActivity.this);
                                        ll.kaiqiDingwGongneng();
                                    } catch (Exception e) {

                                    }


                                    Log.d("requestLocation---->>>", "权限被通过");
                                    //所有权限都已经授权
                                    //埋点：获取权限结果 不管成功失败都要
                                    YincangShijianClickTols.QingqiuMaidian(WENANYESHOUQUANJIEGUO);

                                    //获取位置信息
//                                    DingWeizhiTols.getWeizhiDingwei(AOpenStarActivity.this);


                                }

                            } else {
                                try {
                                    YincangShijianClickTols.QingqiuMaidian(QUANXIANDINGWEI);
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(AOpenStarActivity.this);
                                    ll.kaiqiDingwGongneng();
                                } catch (Exception e) {

                                }
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                            }
                        } catch (Exception e) {
                        }

                        chanpinMoxingPPWindows.xiaohuiPPw();
                        caozuozhe.sendEmptyMessageDelayed(0, 1000);
                    }

                    @Override
                    public void onError(Throwable e) {
                        chanpinMoxingPPWindows.xiaohuiPPw();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void sehzhiTDingbuTXXXT(final TextView YJHTGREF) {
        ZifuchuanPinjieSpanTols.with(YJHTGREF).diejiaapped(getString(R.string.qxppp_usestr_1) + "\n\n")
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
        YJHTGREF.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    public void shezhiDingbuWENAN2(final TextView sdgjlfd) {
        ZifuchuanPinjieSpanTols.with(sdgjlfd)
//                diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_01) + "\n\n")
//                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_02) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_09) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_010) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_011) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_012) + "\n\n")


                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_07) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_08) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_02301) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_02401) + "\n\n")


                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_013) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_014) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_015) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_016) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_0443) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_0444) + "\n\n")

                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_017) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_018) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_019) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_020) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_021) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_022) + "\n\n")
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_023) + "\n\n")
                .setQianjingse(Color.parseColor("#000000"))
                .diejiaapped(getString(R.string.qxppp_usestr_dierduanwuyong_024) + "\n\n")

                .chuangjian();
        sdgjlfd.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    public void zhezhiTxtxtt(final TextView tttt) {
        ZifuchuanPinjieSpanTols.with(tttt).diejiaapped(getString(R.string.qxppp_usestr_dianjijixu))
                .diejiaapped(getString(R.string.zhuyetab_tudai_des_pri))
                .setQianjingse(getResources().getColor(R.color.sezhi_argb_5377D5))
                .chuangjian();
        tttt.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    public void zhezhiTxtxtt2(final TextView tttt) {
        ZifuchuanPinjieSpanTols.with(tttt).diejiaapped(getString(R.string.qxppp_usestr_jieshou1))
                .diejiaapped(" " + getString(R.string.qxppp_usestr_jieshou2) + " ")
                .setQianjingse(getResources().getColor(R.color.sezhi_argb_E20C2B))
                .setDianjiSpan(new DianjiSpanTols(this, YINSI_DIZHI, "0"))
//                .diejiaapped(getString(R.string.qxppp_usestr_jieshou3))
//                .diejiaapped(" " + getString(R.string.qxppp_usestr_jieshou4) + " ")
//                .setQianjingse(getResources().getColor(R.color.sezhi_argb_E20C2B))
//                .setDianjiSpan(new DianjiSpanTols(this, FUWU_DIZHI, "2"))
//                .diejiaapped(".")
                .chuangjian();
        tttt.setHighlightColor(Color.parseColor("#88cccccc"));
    }

    //获取 GAID
    public static void huoquGugeIdddd() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                AdvertisingIdClient.Info gugeidxinxi = null;
                try {
                    gugeidxinxi = AdvertisingIdClient.getAdvertisingIdInfo(MyJichuAplica.getInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (gugeidxinxi != null) {
                    YincangShijianClickTols.yichuanId = gugeidxinxi.getId();
                    BendiHuancunTols.commitZifuchuan(BendiHuancunTols.GAIDGUGE,gugeidxinxi.getId());
                    YincangShijianClickTols.QingqiuMaidian(JINRUAPP);
                }
            }
        }).start();
    }

    /**
     * 按两次退出
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}