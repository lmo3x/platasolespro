package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import androidx.core.app.ActivityCompat;

import com.aitime.android.deviceid.DeviceIdentifier;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;

//常用工具类 设备id mac wangluo
public class AboutShebeiTols {

    public static String uuid(){
        String uuidString = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(),BendiHuancunTols.UUID);
        if(TextUtils.isEmpty(uuidString)) {
            uuidString = UUID.randomUUID().toString();
            BendiHuancunTols.commitZifuchuan(BendiHuancunTols.UUID, uuidString);
        }
        return uuidString;
    }

    /**
     * 获取设备唯一标识符
     *
     * @param context
     * @return
     */
    public static String shebeiId = "";

    /**
     * 常规方式获取devicesId
     *
     * @param chiyouzhe
     * @return
     */
    public static String commonHuoquShebiId(Context chiyouzhe) {
        StringBuffer zifuchuanBBBFF = new StringBuffer();//用于生成最终的唯一标识符
        try {
            shebeiId = huoquWeiyiBiaoshiZhuagntai(chiyouzhe);//获取IMES(也就是常说的DeviceId)
            if (TextUtils.isEmpty(shebeiId)){
                shebeiId = DeviceIdentifier.getUniqueIdentifier(MyJichuAplica.getInstance());//获取DeviceId
            }
            zifuchuanBBBFF.append(shebeiId);
            Log.d("","getIMIEStatus  onlyoneid===>>>" + shebeiId + "-----" + zifuchuanBBBFF.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //获取设备的MACAddress地址 去掉中间相隔的冒号
            String deviceId = dedaoWuliDizhi(chiyouzhe);
            zifuchuanBBBFF.append(deviceId.replace(":", ""));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //如果以上都没有获取相应的则自己生成相应的UUID作为相应设备唯一标识符
        if (zifuchuanBBBFF.length() <= 0) {
            UUID weiyiid = UUID.randomUUID();
            shebeiId = weiyiid.toString().replace("-", "");
            zifuchuanBBBFF.append(shebeiId);
            Log.d("","UUID  onlyoneid===>>>" + "uuid:::" + weiyiid.toString() + "deviceId:::" + shebeiId);
        }
        return zifuchuanBBBFF.toString();
    }

    /**
     * 获取设备的DeviceId(IMES) 这里需要相应的权限<br/>
     * 需要 READ_PHONE_STATE 权限
     *
     * @param chiyouzhe
     * @return
     */
    public static String huoquWeiyiBiaoshiZhuagntai(Context chiyouzhe) {
        String weiyiId = null;
        try {
            TelephonyManager zhuajiGuanli = (TelephonyManager) chiyouzhe.getSystemService(Context.TELEPHONY_SERVICE);
            if (Build.VERSION.SDK_INT >= 29) {
                weiyiId = Settings.System.getString(chiyouzhe.getContentResolver(), Settings.Secure.ANDROID_ID);
                Log.d("","00getIMIE  onlyoneid===>>>" + weiyiId);
                return weiyiId;
            } else {
                if (ActivityCompat.checkSelfPermission(chiyouzhe, Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {
                    weiyiId = zhuajiGuanli.getDeviceId();
                    Log.d("","11getIMIE  onlyoneid===>>>" + weiyiId);
                    return weiyiId;
                } else {
                    Log.d("","22getIMIE  onlyoneid===>>>" + "permission.READ_PHONE_STATE is Denied");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (null == weiyiId || "".equals(weiyiId)) {
                return "";
            }
        }
        return "";
    }


    /**
     * 获取MAC地址
     *
     * @param chiyouzhe
     * @return
     */
    public static String dedaoWuliDizhi(Context chiyouzhe) {
        String wulidizhi = "";
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            wulidizhi = huoquMorenWUlizhid(chiyouzhe);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            wulidizhi = dedaoWuliDizhi();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            wulidizhi = congYingjianHuoquWulidizhi();
        }
        return wulidizhi;

    }


    /**
     * Android  6.0 之前（不包括6.0）
     * 必须的权限  <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
     *
     * @param chiyouzhe
     * @return
     */
    private static String huoquMorenWUlizhid(Context chiyouzhe) {
        String wulicmamac = "";
        if (null == chiyouzhe) {
            return wulicmamac;
        }

        WifiManager wuxianguanli = (WifiManager) chiyouzhe.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        if (null == wuxianguanli) {
            return wulicmamac;
        }
        WifiInfo wuxianXinxi = null;
        try {
            wuxianXinxi = wuxianguanli.getConnectionInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null == wuxianXinxi) {
            return wulicmamac;
        }
        wulicmamac = wuxianXinxi.getMacAddress();
        Log.d("","before6.0 （not cantaion 6.0）  device mac onlyone===>>>" + wulicmamac);
        return wulicmamac;
    }


    /**
     * Android 6.0（包括） - Android 7.0（不包括）
     *
     * @return
     */
    private static String dedaoWuliDizhi() {
        String wuxianDizhi = "";
        try {
            wuxianDizhi = new BufferedReader(new FileReader(new File("/sys/class/net/wlan0/address"))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("","6.0（包括）- Android 7.0（不包括）  设备mac地址 唯一标识符===>>>" + wuxianDizhi);
        return wuxianDizhi;
    }


    /**
     * 遍历循环所有的网络接口，找到接口是 wlan0
     * 必须的权限 <uses-permission android:name="android.permission.INTERNET" />
     *
     * @return
     */
    private static String congYingjianHuoquWulidizhi() {
        try {
            List<NetworkInterface> wangluojiekouList = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface nif : wangluojiekouList) {
                if (!nif.getName().equalsIgnoreCase("wlan0")) continue;

                byte[] macBytes = nif.getHardwareAddress();
                if (macBytes == null) {
                    return "";
                }

                StringBuilder adwesrg = new StringBuilder();
                for (byte b : macBytes) {
                    adwesrg.append(String.format(Locale.ENGLISH,"%02X:", b));
                }

                if (adwesrg.length() > 0) {
                    adwesrg.deleteCharAt(adwesrg.length() - 1);
                }
                Log.d("","Android7.0以上（包括7.0）设备 mac地址 唯一标识符===>>>" + adwesrg.toString());
                return adwesrg.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
