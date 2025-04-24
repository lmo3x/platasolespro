package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import java.lang.reflect.Method;

public class ShoujiPingmuTols {


    /**
     * 拿手机物理尺寸
     *
     * @return
     */
    public static String naSrceenWUliChixun(Activity aacyyy) {
        Point point = new Point();
        WindowManager chuangkouGuanli = (WindowManager) aacyyy.getSystemService(Context.WINDOW_SERVICE);
        chuangkouGuanli.getDefaultDisplay().getRealSize(point);
        DisplayMetrics xianshiZhanshi = aacyyy.getResources().getDisplayMetrics();
        double x = Math.pow(point.x / xianshiZhanshi.xdpi, 2);
        double y = Math.pow(point.y / xianshiZhanshi.ydpi, 2);
        double pingmuCun = Math.sqrt(x + y);
        return String.valueOf(pingmuCun);
    }

    //获取屏幕宽度
    public static int celiangPingmuKuan(Activity acytt) {
        WindowManager chuangkouGuanli = (WindowManager) acytt
                .getSystemService(Context.WINDOW_SERVICE);
        Display zhanshichicun = chuangkouGuanli.getDefaultDisplay();
        return zhanshichicun.getWidth();
    }
    //获取屏幕高度
    public static int celiangPingmuGao(Activity acytt) {
        WindowManager chuangkouGuanli = (WindowManager) acytt
                .getSystemService(Context.WINDOW_SERVICE);
        Display hzanshi = chuangkouGuanli.getDefaultDisplay();
        return hzanshi.getHeight();
    }

    //获取序列号
    public static String naXuliehaoForZhuaji() {
        String xuliehao = "";
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {//9.0+
                xuliehao = Build.getSerial();
            } else if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N) {//8.0+
                xuliehao = Build.SERIAL;
            } else {//8.0-
                Class<?> fansheLei = Class.forName("android.os.SystemProperties");
                Method get = fansheLei.getMethod("get", String.class);
                xuliehao = (String) get.invoke(fansheLei, "ro.serialno");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xuliehao;
    }
}
