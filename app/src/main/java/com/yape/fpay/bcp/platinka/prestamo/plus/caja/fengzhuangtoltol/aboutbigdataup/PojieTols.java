package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.ViewConfiguration;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class PojieTols {



    /**
     * 手机是否有root权限
     *
     * @return
     */
    public static int shiFouPojie() {
        int poJieJieguo = 0;
        if (shifouYueYu()) {
            poJieJieguo = 1;
        }
        return poJieJieguo;
    }
    public static boolean shifouYueYu() {
        return panDuanYueYu1() || panDuanYueYu2() || panDuanYueYu3();
    }

    private static boolean panDuanYueYu1() {
        String buildBiaoshi = Build.TAGS;
        return buildBiaoshi != null && buildBiaoshi.contains("test-keys");
    }

    private static boolean panDuanYueYu2() {
        String[] luJingShuzu = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su",
                "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (String path : luJingShuzu) {
            if (new File(path).exists()) return true;
        }
        return false;
    }

    private static boolean panDuanYueYu3() {
        Process jindu = null;
        try {
            jindu = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            BufferedReader in = new BufferedReader(new InputStreamReader(jindu.getInputStream()));
            if (in.readLine() != null) return true;
            return false;
        } catch (Throwable t) {
            return false;
        } finally {
            if (jindu != null) jindu.destroy();
        }
    }

    public static int keyboard(Activity acty) {
        boolean hasCaidanKey = ViewConfiguration.get(acty)
                .hasPermanentMenuKey();
        boolean hasBackKey = KeyCharacterMap
                .deviceHasKey(KeyEvent.KEYCODE_BACK);
        if (!hasCaidanKey && !hasBackKey) {
            return 0;
        }
        return 1;
    }


    public static int huoQuMoniqi(Activity aacyyy) {
        boolean checkProperty = Build.FINGERPRINT.startsWith("generic")
                || Build.FINGERPRINT.toLowerCase().contains("vbox")
                || Build.FINGERPRINT.toLowerCase().contains("test-keys")
                || Build.MODEL.contains("google_sdk")
                || Build.MODEL.contains("Emulator")
                || Build.MODEL.contains("Android SDK built for x86")
                || Build.MANUFACTURER.contains("Genymotion")
                || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic"))
                || "google_sdk".equals(Build.PRODUCT);
        if (checkProperty) return 1;
        String operatorName = "";
        TelephonyManager tm = (TelephonyManager)aacyyy.getSystemService(Context.TELEPHONY_SERVICE);
        if (tm != null) {
            String name = tm.getNetworkOperatorName();
            if (name != null) {
                operatorName = name;
            }
        }
        boolean checkOperatorName = operatorName.toLowerCase().equals("android");
        if (checkOperatorName) return 1;

        String url = "tel:" + "123456";
        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        intent.setAction(Intent.ACTION_DIAL);
        boolean checkDial = intent.resolveActivity(aacyyy.getPackageManager()) == null;
        if (checkDial) return 1;
        return 0;
    }


    //获取基站信息
    public static String huoQuJizhanXinxi(Activity acty) {
        String dbm = "-1";
        try {
            TelephonyManager tm =  (TelephonyManager) acty.getSystemService(Context.TELEPHONY_SERVICE);
//        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)
//                != PackageManager.PERMISSION_GRANTED) {
//            return dbm;
//        }
            List<CellInfo> jizhanList = tm.getAllCellInfo();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                if (null != jizhanList) {
                    for (CellInfo cellInfo : jizhanList) {
                        if (cellInfo instanceof CellInfoGsm) {
                            CellSignalStrengthGsm jizhanDanGsm = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                            dbm = String.valueOf(jizhanDanGsm.getDbm());
                        } else if (cellInfo instanceof CellInfoCdma) {
                            CellSignalStrengthCdma jizhanDanCdma = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                            dbm = String.valueOf(jizhanDanCdma.getDbm());
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                                CellSignalStrengthWcdma jizhanDanCdma = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                                dbm = String.valueOf(jizhanDanCdma.getDbm());
                            }
                        } else if (cellInfo instanceof CellInfoLte) {
                            CellSignalStrengthLte jizhanDanLte = ((CellInfoLte) cellInfo).getCellSignalStrength();
                            dbm = String.valueOf(jizhanDanLte.getDbm());
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return dbm;
    }




    //获取boot time
    public static String naBootShijian() {
        String zongBootShijian = "";
        try {
            zongBootShijian = SystemClock.elapsedRealtime() + "";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return zongBootShijian;
    }
    public static String naZongBootTimeWake() {
        String total_boot_time = "";
        try {
            total_boot_time = SystemClock.uptimeMillis() + "";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total_boot_time;
    }

    /**
     * 获取电池的容量
     *
     * @param chiyouZhe
     * @return
     */
    public static double naDianchiRongliang(Context chiyouZhe) {
        double dianchiRongliang = 0;
        if (dianchiRongliang > 0) {
            return dianchiRongliang;
        }
        Object dianYuanGuanli;
        final String DIANYUANLEI = "com.android.internal.os.PowerProfile";
        try {
            dianYuanGuanli = Class.forName(DIANYUANLEI).getConstructor(Context.class).newInstance(chiyouZhe);
            dianchiRongliang = (double) Class.forName(DIANYUANLEI).getMethod("getBatteryCapacity").invoke(dianYuanGuanli);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dianchiRongliang;
    }

    // 获取CPU最大频率
    // "/system/bin/cat" 命令行
    // "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq" 存储最大频率的文件的路径
    public static String naCpuPin() {
        String pinLvJieguo = "";
        ProcessBuilder minglingHang;
        try {
            String[] canshu = { "/system/bin/cat",
                    "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq" };
            minglingHang = new ProcessBuilder(canshu);
            Process process = minglingHang.start();
            InputStream shuruLiu = process.getInputStream();
            byte[] re = new byte[24];
            while (shuruLiu.read(re) != -1) {
                pinLvJieguo = pinLvJieguo + new String(re);
            }
            shuruLiu.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            pinLvJieguo = "N/A";
        }
        return pinLvJieguo.trim();
    }
}
