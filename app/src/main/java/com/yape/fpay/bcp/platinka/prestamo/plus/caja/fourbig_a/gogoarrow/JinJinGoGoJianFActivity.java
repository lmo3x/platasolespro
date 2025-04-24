package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JICHUDINGWEI;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DingWeiSinglebangzhuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.QuanxianShipeiGuanliTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.PppQxPanduaner;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.SanfangRxppp;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class JinJinGoGoJianFActivity extends MyJichuBsActivity implements View.OnClickListener {

    private View mGolbeSjflT123Dingbuview;
    private ImageView mJingojian1fanhui;
    private TextView mJingojian1submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.activity_jin_jin_go_go_jian_factivity);

        chushihuaPPwindows();

        mGolbeSjflT123Dingbuview = findViewById(R.id.golbe_sjflT123_dingbuview);
        mJingojian1fanhui = findViewById(R.id.jingojian1fanhui);
        mJingojian1submit = findViewById(R.id.jingojian1submit);

        mJingojian1fanhui.setOnClickListener(this);
        mJingojian1submit.setOnClickListener(this);


        sanfangRxppp = new SanfangRxppp(this);
    }

    @Override
    public void onClick(View v) {
        if (!WngluoTols.youWangluoFou(this)) {
            baseaNonet.showPPw(Gravity.CENTER);
            return;
        }
        switch (v.getId()) {
            case R.id.jingojian1fanhui:
                finish();
                break;
            case R.id.jingojian1submit:
                //授权成功去上传大数据 获取权限
                chaxunShanghuanNeddQuanxian();
                break;
        }
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
                                        DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJianFActivity.this);
                                        ll.kaiqiDingwGongneng();
                                    } catch (Exception e) {

                                    }

                                }

                            } else {
                                Log.d("requestLocation---->>>", "权限被通过通过通过");
                                //所有权限都已经授权
                                try {
                                    YincangShijianClickTols.QingqiuMaidian(JICHUDINGWEI);
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJianFActivity.this);
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

    ChanpinMoxingPPWindows gaoQxPP_PPW;

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
                                } else {
                                    Log.d("requestLocation---->>>", "权限被通过");
                                    DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJianFActivity.this);
                                    ll.kaiqiDingwGongneng();
                                    //所有权限都已经授权

                                    Intent intent = new Intent(JinJinGoGoJianFActivity.this,JinJinGoGoJian6Activity.class);
                                    startActivity(intent);
                                    finish();
                                }


                            } else {

                                DingWeiSinglebangzhuTols ll = new DingWeiSinglebangzhuTols(JinJinGoGoJianFActivity.this);
                                ll.kaiqiDingwGongneng();
                                Log.d("requestLocation---->>>", "权限被通过通过通过");

                                //所有权限都已经授权
                                Intent intent = new Intent(JinJinGoGoJianFActivity.this,JinJinGoGoJian6Activity.class);
                                startActivity(intent);
                                finish();
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
                QuanxianShipeiGuanliTols.tiaoZhuanZhuajiSetsPage(JinJinGoGoJianFActivity.this);
            }
        });

        chanpinMoxingPPWindows1.chushihuaPPW(sfjvjsHISSHIS, false, (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

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