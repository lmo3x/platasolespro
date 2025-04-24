package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;

public class DianjiSpanTols extends ClickableSpan {
    private String dizhi;
    private Context context;
    private String showleixing;

    public ChanpinMoxingPPWindows baseaNonet = null;

    public DianjiSpanTols(Context context, String dizhi,String showleixing) {
        this.dizhi = dizhi;
        this.context = context;
        this.showleixing = showleixing;

        chaungjianPPw();
    }

    /**
     * Performs the click action associated with this span.
     *
     * @param widget
     */
    @Override
    public void onClick(@NonNull View widget) {
        if (!WngluoTols.youWangluoFou(context)) {
            baseaNonet.showPPw(Gravity.CENTER);
            return;
        }
        XieyiShowTols.quH5YinsiPage((Activity) widget.getContext(), dizhi,showleixing);
    }


    @Override
    public void updateDrawState(@NonNull TextPaint ds) {
        ds.setUnderlineText(false);//去掉横线
    }

    private void chaungjianPPw() {
        baseaNonet = new ChanpinMoxingPPWindows(context);

        LayoutInflater popInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_xuancxxh_chanpin2, null);
        TextView jythgrsdtfygukyjh = popupView.findViewById(R.id.jythgrsdtfygukyjh);
        TextView quxiaoquxiao_fjdoj_buyaoquan = popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        TextView gaoding_sure_djdj_yaogeiwo = popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);

        jythgrsdtfygukyjh.setText(context.getString(R.string.tusitishi_dizih_00));
        quxiaoquxiao_fjdoj_buyaoquan.setText(context.getString(R.string.shangpins_foryo_can2));
        gaoding_sure_djdj_yaogeiwo.setText(context.getString(R.string.shangpins_foryo_abr));

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
                context.startActivity(intent);
            }
        });

        baseaNonet.chushihuaPPW(popupView, false, (int) (huoquPingmuKuandu(context) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

    }
}
