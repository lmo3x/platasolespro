package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow;

import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ShangpinActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DEGNDAIYETIAOZHUANXIAYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JINRUFENGKONGYE;

import java.util.Locale;

public class JinJinGoGoJianZhuyaoActivity extends MyJichuBsActivity implements View.OnClickListener {

    private ImageView jingojian1fanhui;
    private TextView jingojian1submit, asdfh_TYodfj_djgo, jingojian1dibuxieyi;

    private int shulaingZhi = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_gogoarrow_timeto);

        // 初始化控件对象textView
        yemianHandlsj.sendEmptyMessageDelayed(0, 1000);

        //动态设置状态栏高度
        ConstraintLayout.LayoutParams bujuguanli = (ConstraintLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        bujuguanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(bujuguanli);

        jingojian1fanhui = findViewById(R.id.jingojian1fanhui);
        jingojian1submit = findViewById(R.id.jingojian1submit);
        asdfh_TYodfj_djgo = findViewById(R.id.asdfh_TYodfj_djgo);
        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);

        DianjiQuickTols.kuaiLeMa(jingojian1dibuxieyi,this);
        DianjiQuickTols.kuaiLeMa(jingojian1fanhui,this);
        DianjiQuickTols.kuaiLeMa(jingojian1submit,this);

        YincangShijianClickTols.QingqiuMaidian(JINRUFENGKONGYE);
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
    public void onClick(View view) {
        if (!WngluoTols.youWangluoFou(JinJinGoGoJianZhuyaoActivity.this)) {
            baseaNonet.showPPw(Gravity.CENTER);
            return;
        }
        Intent intent;
        switch (view.getId()) {
            case R.id.jingojian1fanhui:
                shulaingZhi = -1;
                finish();
                break;
            case R.id.jingojian1submit:

                YincangShijianClickTols.QingqiuMaidian(DEGNDAIYETIAOZHUANXIAYE);
                shulaingZhi = -1;
                intent = new Intent(this, ShangpinActivity.class);
                startActivity(intent);
                finish();
                break;
//            case R.id.jingojian1dibuxieyi://跳转隐私协议
//                YincangShijianClickTols.QingqiuMaidian(DEGNDAIYETIAOZHUANXIAYE);
//                XieyiShowTols.quH5YinsiPage(JinJinGoGoJianZhuyaoActivity.this);
//                break;
        }
    }

    //咱在写一个计算Welcome界面的广告时间结束后进入主界面的方法
    private int getShulaingZhi() {
        shulaingZhi--;
        if (shulaingZhi == 0) {
            YincangShijianClickTols.QingqiuMaidian(DEGNDAIYETIAOZHUANXIAYE);
            Intent intent = new Intent(this, ShangpinActivity.class);
            startActivity(intent);
            finish();
        } else {
            if (shulaingZhi < 0){
                asdfh_TYodfj_djgo.setText(String.format(Locale.ENGLISH,getString(R.string.jingogojian_xixicheck_000), 0));
            }else {
                asdfh_TYodfj_djgo.setText(String.format(Locale.ENGLISH,getString(R.string.jingogojian_xixicheck_000), shulaingZhi));
            }
        }
        return shulaingZhi;
    }

    //进行一个消息的处理
    @SuppressLint("HandlerLeak")
    private Handler yemianHandlsj = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if (msg.what == 0) {
                if (getShulaingZhi() > 0){
                    yemianHandlsj.sendEmptyMessageDelayed(0, 1000);
                }
            }
        }

        ;
    };


    /**
     * 按两次退出
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            count = -1;
//            finish();
        }
        return true;
    }
}