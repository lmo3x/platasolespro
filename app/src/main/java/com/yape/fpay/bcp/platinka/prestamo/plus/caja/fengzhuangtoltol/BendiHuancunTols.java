package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.content.Context;
import android.content.SharedPreferences;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;


public class BendiHuancunTols {

    private static SharedPreferences bendiHuancun;
    public static String YONGHU_ID = "userId";
    public static String YONGHU_TOKEN = "token";
    public static String YONGHU_ZHUAJI = "phone";
    public static String YONGHU_ISTEST = "isTest";

    public static String XITONG_YUYAN = "language";//语言代号
    public static String XITONG_JINGWEIDU = "loGps";//loGps
    public static String XITONG_WEIJINGDU = "laGps";//laGps

    public static String XITONG_YUYAN_TRUE = "language_yes";//语言-真

    public static String XITONG_YUYAN_LAN = "language_yu";//语言-语言
    public static String XITONG_YUYAN_COUNTRY = "language_guo";//语言-国家

    public static String XITONG_YINSI_BASIC = "privacy_BASIC";
    public static String XITONG_YINSI = "privacy";//
    public static String XITONG_RILICANL = "isRiLi";//
    public static String COPY_USER_INFO = "copy_user_info";//zipan ssid
    public static String APPMINGZI = "app_mingzi";//产品名

    public static String GAIDGUGE = "GGAADD";//goodgle id

    public static String TOUSUH5TOEKN = "0";//权限也确认过没

    public static String UUID = "RAPIDGEOGRAPHYMISTAKENVIOLENCEHOUSEWORK";
    public static String GUO_JIA_CODE = "guo_jia_code";

    public static String TOUSU_APP = "tousu_app";//投诉是否展示过

    private static SharedPreferences getBendiHuancun(Context chiyouzhe) {
        if (bendiHuancun == null) {
            bendiHuancun = chiyouzhe.getSharedPreferences("SpUtil", Context.MODE_PRIVATE);
        }
        return bendiHuancun;
    }


    public static void commitZifuchuan(String key, String value) {
        SharedPreferences preferences = getBendiHuancun(MyJichuAplica.applitionChiyouzhe);
        //存入数据
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.commit();
    }


    public static void commitZhengxing(String key, int value) {
        SharedPreferences preferences = getBendiHuancun(MyJichuAplica.applitionChiyouzhe);
        //存入数据
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    /**
     * 获取字符串
     *
     * @param chiyouzhe 上下文
     * @param jianzhi     字符串的键
     * @return 得到的字符串
     */
    public static String huoQuZifuchuan(Context chiyouzhe, String jianzhi) {
        SharedPreferences preferences = getBendiHuancun(chiyouzhe);
        return preferences.getString(jianzhi, "");
    }

    /**
     * 获取整数
     *
     * @param chiyouzhe 上下文
     * @param jianzhi     整数的的键
     * @return 得到的整数
     */
    public static int huoQuZhengxing(Context chiyouzhe, String jianzhi) {
        SharedPreferences preferences = getBendiHuancun(chiyouzhe);
        return preferences.getInt(jianzhi, 0);
    }

    /**
     * 清除String
     * @param chiyouzhe
     * @param jianzhi
     */
    public static void qingChuZifuchuan(Context chiyouzhe, String jianzhi) {
        SharedPreferences sp = getBendiHuancun(chiyouzhe);
        SharedPreferences.Editor editor = sp.edit();
        editor.remove(jianzhi);
        editor.apply();
    }


}
