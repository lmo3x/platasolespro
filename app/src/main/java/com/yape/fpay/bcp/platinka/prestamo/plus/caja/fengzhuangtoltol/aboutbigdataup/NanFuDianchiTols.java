package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.util.Log;

public class NanFuDianchiTols {




    //是否充电中
    public static boolean shifouChadianChongdian(Activity aacyyy) {
        Intent dianChi = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            dianChi = aacyyy.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED), Context.RECEIVER_EXPORTED);
        } else {
            dianChi = aacyyy.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        }

        boolean shiFouChongdian = dianChi.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1) != 0;
        Log.d("sss", "shiFouChongdian = " + shiFouChongdian);
        return shiFouChongdian;

    }


    // 获取电池电量百分比
    public static String huoQuDianchiBaifenbi(Activity qaaaaa) {

        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent intent = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            intent = qaaaaa.registerReceiver(null,intentFilter, Context.RECEIVER_EXPORTED);
        } else {
            intent = qaaaaa.registerReceiver(null,intentFilter);
        }

        int baifenbi = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,-1);
//        BatteryManager dianChiGuanli = (BatteryManager) qaaaaa.getSystemService(qaaaaa.BATTERY_SERVICE);
//
//        int dangqianDianliang = dianChiGuanli.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
//        double i = dangqianDianliang / 100;
        return baifenbi+"";
    }

    public static String shiFouChongdian(Activity aaccyy) {
        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatusIntent = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
             batteryStatusIntent =aaccyy.registerReceiver(null, ifilter, Context.RECEIVER_EXPORTED);
        } else {
            batteryStatusIntent =aaccyy.registerReceiver(null, ifilter);
        }

        int status = batteryStatusIntent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
        boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
                status == BatteryManager.BATTERY_STATUS_FULL;
        int chargePlug = batteryStatusIntent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;
        boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;
        if (isCharging) {
            if (usbCharge) {
                return "usb";
            }
            if (acCharge) {
                return "ac";
            }
        }
        return "";

    }
}
