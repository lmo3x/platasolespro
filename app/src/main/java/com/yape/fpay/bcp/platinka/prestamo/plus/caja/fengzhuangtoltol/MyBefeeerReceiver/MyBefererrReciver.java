package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.MyBefeeerReceiver;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.INSTALLAPP;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;

public class MyBefererrReciver extends BroadcastReceiver {

    String myBefererrReciver;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            myBefererrReciver = intent.getStringExtra("referrer");
            //安装埋点
            YincangShijianClickTols.QingqiuMaidian(INSTALLAPP);
        }
    }
}
