package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;

import java.util.Locale;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.GongyongJingtaiShujuTols.dangqianAppYanyu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.XITONG_YUYAN;

import androidx.annotation.NonNull;

/**
 * Created by dumingwei on 2018/5/31 0031.
 */
public class GuojihuaTols {

    private static final String YUYANTAG = "LanguageUtil";

    /**
     * 切换语言
     * @param zhiyouzhe
     * @param xinyuyan 想要切换的语言类型 比如 "en" ,"zh"
     */
    @SuppressWarnings("deprecation")
    public static void gaibianYanyu(Context zhiyouzhe, String xinyuyan) {
        if (TextUtils.isEmpty(xinyuyan)) {
            return;
        }
        Resources ziyuan = zhiyouzhe.getResources();
        Configuration peizhi = ziyuan.getConfiguration();
        //获取想要切换的语言类型
        Locale bendi = genjuYuaynHuoquDiqu(xinyuyan);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            peizhi.setLocale(bendi);
        }
        // updateConfiguration
        DisplayMetrics zhanshiMetr = ziyuan.getDisplayMetrics();
        ziyuan.updateConfiguration(peizhi, zhanshiMetr);
    }

    //get loacl by language
    public static Locale genjuYuaynHuoquDiqu(String yyyyy) {
        Locale locale = Locale.SIMPLIFIED_CHINESE;
        if (yyyyy.equals(GuojihuaLeixingTols.CHINESE.getYanyu())) {
            locale = Locale.SIMPLIFIED_CHINESE;
        } else if (yyyyy.equals(GuojihuaLeixingTols.CHINESE_TW.getYanyu())) {
            locale = Locale.TAIWAN;
        } else if (yyyyy.equals(GuojihuaLeixingTols.ENGLISH.getYanyu())) {
            locale = Locale.ENGLISH;
        }
        Log.d(YUYANTAG, "getLocaleByLanguage: " + locale.getDisplayName());
        return locale;
    }

    //attch base content
    public static Context tianjiaJibenNeirong(Context zhiyou, String yyyy) {
        Log.d(YUYANTAG, "attachBaseContext: " + Build.VERSION.SDK_INT);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return gengXinZiyuan(zhiyou, yyyy);
        } else {
            return zhiyou;
        }
    }

    //update resources
    @TargetApi(Build.VERSION_CODES.N)
    private static Context gengXinZiyuan(@NonNull Context chiyouzhe, String yyyy) {
        Resources ziyuan = chiyouzhe.getResources();
        Locale bendi = GuojihuaTols.genjuYuaynHuoquDiqu(yyyy);

        Configuration peizhi = ziyuan.getConfiguration();
        peizhi.setLocale(bendi);
        peizhi.setLocales(new LocaleList(bendi));
        return chiyouzhe.createConfigurationContext(peizhi);
    }


    //以下为取出指定语言下的文字
    // ===================开始=======================
    private static final String RUANJIANMING = "com.FM8LEDcontrollor";
    public static final String CUOWU_WENAN = "";
    private static final String MOREN_CUOJIA = "US";
    private static final String MOREN_YUYAN = "en";

    public static String huoquZifuchuanByDizhi(Context chiyouzhe, int zifuchuanId, String yyyy, String guojia) {
        /*for (Locale locale : getAvailableLocales()) {

            String lang = locale.getLanguage();
            String coun = getCountryPrivate(locale);
            String localeStr = country.equals("") ? language : (language + "_" + country);

            Loger.w("ruijie", "language = " + lang + ", country = " + coun + "," +
                    "localeStr = " + localeStr);
        }*/
        Resources ziyuan = huoquRunjianZiyuan(chiyouzhe.getApplicationContext().getPackageManager(),
                RUANJIANMING, new Locale(yyyy, guojia));
        if (ziyuan == null) {
            return CUOWU_WENAN;
        } else {
            try {
                return ziyuan.getString(zifuchuanId);
            } catch (Exception e) {
                return CUOWU_WENAN;
            }
        }
    }

    //get application resource
    private static Resources huoquRunjianZiyuan(PackageManager baoguanli, String baomingzi, Locale dangdi) {
        Resources ruanijanziyuan = null;
        try {
            ruanijanziyuan = baoguanli.getResourcesForApplication(baomingzi);
            gengxinZiyuan(ruanijanziyuan, dangdi);
        } catch (PackageManager.NameNotFoundException e) {

        }
        return ruanijanziyuan;
    }

    private static void gengxinZiyuan(Resources ziyuanhaha, Locale dangdidizhi) {
        Configuration conpeizhi = ziyuanhaha.getConfiguration();
        conpeizhi.locale = dangdidizhi;
        ziyuanhaha.updateConfiguration(conpeizhi, null);
    }
    // ===================结束=======================

    public static String huoquYuaynLlll(Context chiyouzhe) {
        //取出离线语言
        dangqianAppYanyu = BendiHuancunTols.huoQuZifuchuan(chiyouzhe, XITONG_YUYAN);
        if (TextUtils.isEmpty(dangqianAppYanyu) && chiyouzhe != null) {
            dangqianAppYanyu = chiyouzhe.getResources().getConfiguration().locale.getLanguage();
        }
        return dangqianAppYanyu;
    }


    //西班牙都好转化问题
    private static final Locale Locale_Russia = new Locale("RUS", "ru", "");
    private static final Locale Locale_Spanish = new Locale("ES", "es", "");
    public static void setApplicationLauguageType(Context context, int type) {
        if (context == null) return;
        Resources resources = context.getResources();//获得res资源对象
        Configuration config = resources.getConfiguration();//获得设置对象
        DisplayMetrics dm = resources .getDisplayMetrics();//获得屏幕参数：主要是分辨率，像素等。

        switch (type) {
            case 0:
                config.locale = Locale.getDefault();
                break;
            case 1:
                config.locale = Locale.SIMPLIFIED_CHINESE;
                break;
            case 2:
                config.locale = Locale.ENGLISH;
                break;
            case 3:
                config.locale = Locale_Russia;
                break;
            case 4:
                config.locale = Locale_Spanish;
                break;
            default:
                config.locale = Locale.getDefault();
                break;
        }

        resources.updateConfiguration(config, dm);
    }
}
