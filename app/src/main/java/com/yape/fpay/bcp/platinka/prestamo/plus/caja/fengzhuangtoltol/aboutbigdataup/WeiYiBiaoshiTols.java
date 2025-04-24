package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

import java.lang.reflect.Method;

import androidx.core.content.ContextCompat;

public class WeiYiBiaoshiTols {

    //get cpu num
    public static int naHexinJisuanqiHaoma() {
        try {
            return Runtime.getRuntime().availableProcessors();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


    //get imei
    public static String naImeaiBiaoshi(Context chiyouZhe) {
        String shebeiBiaoshi = "";
        try {
            shebeiBiaoshi = naWeiyiBiaoshi(chiyouZhe, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(shebeiBiaoshi)) {
            shebeiBiaoshi = Settings.System.getString(
                    chiyouZhe.getContentResolver(), Settings.Secure.ANDROID_ID);
        }
        if (!TextUtils.isEmpty(shebeiBiaoshi)) {
            return shebeiBiaoshi;
        }

        return "";
    }

    //get imei or meid
    public static String naWeiyiBiaoshi(Context chiyouzhe, int ruajianId) {
        String weiyibiaoshi = "";

        //Android 6.0 以后需要获取动态权限  检查权限
        if (ContextCompat.checkSelfPermission(chiyouzhe, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            return weiyibiaoshi;
        }

        try {
            TelephonyManager zhuajiGunali = (TelephonyManager) chiyouzhe.getApplicationContext().getSystemService(Context.TELEPHONY_SERVICE);
            if (zhuajiGunali != null) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {// android 8 即以后建议用getImei 方法获取 不会获取到MEID
                    Method method = zhuajiGunali.getClass().getMethod("getImei", int.class);
                    weiyibiaoshi = (String) method.invoke(zhuajiGunali, ruajianId);
                } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    //5.0的系统如果想获取MEID/IMEI1/IMEI2  ----framework层提供了两个属性值“ril.cdma.meid"和“ril.gsm.imei"获取
                    weiyibiaoshi = naXitongPeizhizhi("ril.gsm.imei");
                    //如果获取不到 就调用 getDeviceId 方法获取

                } else {//5.0以下获取imei/meid只能通过 getDeviceId  方法去取


                }
            }
        } catch (Exception e) {
        }

        if (TextUtils.isEmpty(weiyibiaoshi)) {
            weiyibiaoshi = gaodaoShebeiId(chiyouzhe, ruajianId);
        }
        return weiyibiaoshi;
    }



    //通过反射拿系统属性 系统配置
    private static String naXitongPeizhizhi(String asghfgdf) {
        try {
            @SuppressLint("PrivateApi")
            Class<?> fansheLei = Class.forName("android.os.SystemProperties");
            Method fansheLeiFangfa = fansheLei.getMethod("get", String.class, String.class);
            return (String) fansheLeiFangfa.invoke(fansheLei, asghfgdf, "");
        } catch (Exception e) {/**/}
        return "";
    }


    //get deviceid
    public static String gaodaoShebeiId(Context chiyouzhe, int iaidddd) {
        String wieyibiaoshi = "";
        wieyibiaoshi = naXitongShebeiByaPI(chiyouzhe, iaidddd);
        if (TextUtils.isEmpty(wieyibiaoshi)) {
            wieyibiaoshi = fanshejlfjfsljd(chiyouzhe, iaidddd);
        }
        return wieyibiaoshi;
    }


    //get deviceid by sys api
    public static String naXitongShebeiByaPI(Context chiouzhe, int iiidddd) {
        String shebeiBiaoshi = "";
        try {
            TelephonyManager zhuajiGaunli =
                    (TelephonyManager) chiouzhe.getApplicationContext().getSystemService(Context.TELEPHONY_SERVICE);
            if (zhuajiGaunli != null) {
                shebeiBiaoshi = zhuajiGaunli.getDeviceId(iiidddd);
            }
        } catch (Throwable e) {
        }
        return shebeiBiaoshi;
    }


    /**
     * 反射获取 deviceId
     *
     * @param chiyouzhe
     * @param sssdddiiidd  slotId为卡槽Id，它的值为 0、1；
     * @return
     */
    public static String fanshejlfjfsljd(Context chiyouzhe, int sssdddiiidd) {
        try {
            TelephonyManager zhuaGunali = (TelephonyManager) chiyouzhe.getApplicationContext().getSystemService(Context.TELEPHONY_SERVICE);
            Method fangfa = zhuaGunali.getClass().getMethod("getDeviceId", int.class);
            return fangfa.invoke(zhuaGunali, sssdddiiidd).toString();
        } catch (Throwable e) {
        }
        return "";
    }



    //获取imei
    public static String huoquWieyiImei2222(Context chiyouzhe) {

        try {
            //imei2必须与 imei1不一样
            String morenImie = naImeaiBiaoshi(chiyouzhe);
            if (TextUtils.isEmpty(morenImie)) {
                //默认的 imei 竟然为空，说明权限还没拿到，或者是平板
                //这种情况下，返回 imei2也应该是空串
                return "";
            }

            //注意，拿第一个 IMEI 是传0，第2个 IMEI 是传1，别搞错了
            String weiyibiaoshi1 = naWeiyiBiaoshi(chiyouzhe, 0);
            String weiyibiaoshi2 = naWeiyiBiaoshi(chiyouzhe, 1);
            //sim 卡换卡位时，imei1与 imei2有可能互换，而 imeidefault 有可能不变
            if (!TextUtils.equals(weiyibiaoshi2, morenImie)) {
                //返回与 imeiDefault 不一样的
                return weiyibiaoshi2;
            }
            if (!TextUtils.equals(weiyibiaoshi1, morenImie)) {
                return weiyibiaoshi1;
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        return "";
    }
}
