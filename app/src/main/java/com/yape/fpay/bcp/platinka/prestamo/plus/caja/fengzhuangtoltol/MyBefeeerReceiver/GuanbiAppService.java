package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.MyBefeeerReceiver;


import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.GUANBILIANGLIANGAPP;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;

public class GuanbiAppService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {

        //todo colseapp maidian
        YincangShijianClickTols.QingqiuMaidian(GUANBILIANGLIANGAPP);

        super.onDestroy();

    }
}
