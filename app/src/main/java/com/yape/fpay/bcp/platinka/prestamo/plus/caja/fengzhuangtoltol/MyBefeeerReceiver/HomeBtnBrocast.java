package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.MyBefeeerReceiver;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.HUANQIRENWULIEB;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.YINCNAGAPP;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;

public class HomeBtnBrocast extends BroadcastReceiver {

    private long shangcishijian = 0;

    @Override
    public void onReceive(Context context, Intent intent) {
        String saocaozuo = intent.getAction();

        if (saocaozuo.equals(Intent.ACTION_CLOSE_SYSTEM_DIALOGS)) {

            String shijianyuanyin = intent.getStringExtra("reason");

            if (shijianyuanyin == null)

                return;

            // Home键
            if (shijianyuanyin.equals("homekey")) {
                YincangShijianClickTols.QingqiuMaidian(YINCNAGAPP);
            } else if (shijianyuanyin.equals("recentapps")) {
                long now = System.currentTimeMillis();
                if (now - shangcishijian > 300) {
                    shangcishijian = now;
                    YincangShijianClickTols.QingqiuMaidian(HUANQIRENWULIEB);
                }
            }
        }
    }
}
