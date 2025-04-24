package com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZifuchuanPinjieSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.JiazaizhongWindows;

import androidx.appcompat.app.AppCompatActivity;

public class MyJichuBsActivity extends AppCompatActivity {

    //等待框
    public JiazaizhongWindows jiazaizhongWindows = null;
    public ChanpinMoxingPPWindows baseaNonet = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
        jiazaizhongWindows = new JiazaizhongWindows(this, R.style.DialogTheme, R.layout.wndw_jiazai_ing);

        chaungjianPPw();


    }


    //无网络
    private void chaungjianPPw() {
        baseaNonet = new ChanpinMoxingPPWindows(this);

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
                baseaNonet.xiaohuiPPw();
            }
        });
        popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseaNonet.xiaohuiPPw();

                Intent intent = new Intent();
                intent.setAction("android.net.wifi.PICK_WIFI_NETWORK");
                startActivity(intent);
            }
        });

        baseaNonet.chushihuaPPW(popupView, false, (int) (huoquPingmuKuandu(this) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

    }

    public void shezhiChuangkouSHiepi() {
//        if (StatusBarUtil.hasNavigationBarShow(this)) {
//            getWindow().getDecorView().findViewById(android.R.id.content).setPadding(0, 0, 0, StatusBarUtil.getNavigationBarHeight(this));
//        }
//        StatusBarUtil.setTransparent(this);
        getWindow().getDecorView().setFitsSystemWindows(true);
        //透明状态栏 @顶部
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏 @底部 这一句不要加，目的是防止沉浸式状态栏和部分底部自带虚拟按键的手机（比如华为）发生冲突，注释掉就好了
        // getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        View decorView = getWindow().getDecorView();
        int flags = decorView.getSystemUiVisibility();
        flags |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR; // 设置状态栏文字为黑色
        decorView.setSystemUiVisibility(flags);
    }

    public void setzhidign(String text) {

        try {
            TextView textView1 = findViewById(R.id.txdet1);
            TextView textView2 = findViewById(R.id.txdet2);
            ZifuchuanPinjieSpanTols.with(textView1).diejiaapped("Casi")
                    .diejiaapped(" 52K ")
                    .setQianjingse(Color.parseColor("#E73D3D"))
                    .diejiaapped("personas solicitaron con éxito en los últimos 3 días")
                    .chuangjian();
            ZifuchuanPinjieSpanTols.with(textView2).diejiaapped("Aumenta ")
                    .diejiaapped(text)
                    .setQianjingse(Color.parseColor("#E73D3D"))
                    .diejiaapped(" después de completar")
                    .chuangjian();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}