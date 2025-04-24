package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

import java.lang.reflect.Method;
import java.util.Locale;

/**
 * ProjectName: Module
 * Tags: ${tags}
 * On 2019/4/8 15:17
 */
public class ZhuajiPingmuTols {

    public enum Screen {
        WIDTH, HEIGHT
    }


    /**
     * 获取屏幕的宽度
     *
     * @param chiyouzhe
     * @return
     */
    public static int huoquPingmuKuandu(Context chiyouzhe) {
        WindowManager chuangkouGuanli = (WindowManager) chiyouzhe.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics zhanshiMetr = new DisplayMetrics();
        chuangkouGuanli.getDefaultDisplay().getMetrics(zhanshiMetr);
        return zhanshiMetr.widthPixels;
    }

    /**
     * 获取屏幕的高度
     *
     * @param chiyouzhe
     * @return
     */
    public static int huoquPingmuGodu(Context chiyouzhe) {
        WindowManager chuangkouGuanli = (WindowManager) chiyouzhe.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics xianshiMetr = new DisplayMetrics();
        chuangkouGuanli.getDefaultDisplay().getMetrics(xianshiMetr);
        return xianshiMetr.heightPixels;
    }


    /**
     * 获取状态栏的高度
     *
     * @param chiyouzhe
     * @return
     */
    public static int huoquZhuangtaiLanGaodu(Context chiyouzhe) {
        int gaoduJieguo = 0;
        int ziyuanId = chiyouzhe.getResources().getIdentifier("status_bar_height", "dimen", "android");
        String zhuajiXinghao = Build.MODEL;//手机型号
        String zhuajiYunyingshang = Build.BRAND;//手机运营商

        if (zhuajiYunyingshang.equals("HONOR") && zhuajiXinghao.equals("OXF-AN00")) {
            return gaoduJieguo;
        } else if (ziyuanId > 0) {
            gaoduJieguo = chiyouzhe.getResources().getDimensionPixelSize(ziyuanId);
        }
        return gaoduJieguo;
    }


    /**
     * dpi转pix
     *
     * @param chiyouzhe
     * @param dpiZhi
     * @return
     */
    public static int dipdanweiZhuanPxDanwei(Context chiyouzhe, float dpiZhi) {
        float ret = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpiZhi, chiyouzhe.getResources().getDisplayMetrics());
        return (int) (ret + 0.5f);
    }


    //价格格式
    public static String jiageGeshi(int jiage){
        //format price.
        //default keep 6 decimal places
        String text = String.format(Locale.ENGLISH,"%,d",jiage);
        int beginIndex = 0;
        int endIndex = text.length() - 4;
//        return text.substring(beginIndex, endIndex);
        return text;
    }


    private static final String[] SHIJIAN_BIANHAO = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};

    //getFixNum
    public static String huoquXiugaiHaoma(int shijianma) {
        return shijianma >= 0 && shijianma < 10 ? SHIJIAN_BIANHAO[shijianma] : String.valueOf(shijianma);
    }
}
