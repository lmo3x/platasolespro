package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import androidx.core.app.ActivityCompat;

import static android.telephony.TelephonyManager.PHONE_TYPE_CDMA;
import static android.telephony.TelephonyManager.PHONE_TYPE_GSM;
import static android.telephony.TelephonyManager.PHONE_TYPE_NONE;
import static android.telephony.TelephonyManager.PHONE_TYPE_SIP;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ChuanganqiModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.DebvgRizhiLogsjfjlf;

public class ShebeiXinxiTols {




    //获取android id
    public static String naAnzhuoId(Activity aacttyy) {
        String shebeiBiaoshiId;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            shebeiBiaoshiId = Settings.Secure.getString(aacttyy.getContentResolver(), Settings.Secure.ANDROID_ID);
        } else {
            final TelephonyManager shoujiGuanli = (TelephonyManager) aacttyy.getSystemService(Context.TELEPHONY_SERVICE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (aacttyy.checkSelfPermission(Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                    return "";
                }
            }
            try{
                assert shoujiGuanli != null;
                if (shoujiGuanli.getDeviceId() != null) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        shebeiBiaoshiId = shoujiGuanli.getImei();
                    } else {
                        shebeiBiaoshiId = shoujiGuanli.getDeviceId();
                    }
                } else {
                    shebeiBiaoshiId = Settings.Secure.getString(aacttyy.getContentResolver(), Settings.Secure.ANDROID_ID);
                }
            }catch (Exception e){
                return "";
            }

        }
        return shebeiBiaoshiId;
    }

    //获取手机类型（入网类型）
    public static String naZhuajiLeixingWang(Activity aacctyty) {

        String type= "";
        TelephonyManager telephonyManager = (TelephonyManager) aacctyty.getSystemService(Context.TELEPHONY_SERVICE);
        switch (telephonyManager.getPhoneType()){
            case PHONE_TYPE_NONE:
                type = "NONE";
                break;
            case PHONE_TYPE_GSM:
                type = "GSM";
            break;
            case PHONE_TYPE_CDMA:
                type = "CDMA";
            break;
            case PHONE_TYPE_SIP:
                type = "SIP";
            break;
            default:
                type = "NONE";
                break;
        }
        return type;
    }


    /**
     * 获取MAC地址
     *
     * @param chiyouZhe
     * @return
     */
    public static String naWUliDizhi(Context chiyouZhe) {
        String wuliDizhi = "00:00:00:00:00:00";
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            wuliDizhi = naMorenWuliAdress(chiyouZhe);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            wuliDizhi = naSixtoSevenWulidizhi();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            wuliDizhi = naYingjianWulidian();
        }
        return wuliDizhi;

    }

    /**
     * Android  6.0 之前（不包括6.0）
     * 必须的权限  <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
     *
     * @param chiyouzhe
     * @return
     */
    private static String naMorenWuliAdress(Context chiyouzhe) {
        String wuli = "";
        if (null == chiyouzhe) {
            return wuli;
        }

        WifiManager wuxianwangGuanli = (WifiManager) chiyouzhe.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        if (null == wuxianwangGuanli) {
            return wuli;
        }
        WifiInfo wuxianwangXinxi = null;
        try {
            wuxianwangXinxi = wuxianwangGuanli.getConnectionInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null == wuxianwangXinxi) {
            return wuli;
        }
        wuli = wuxianwangXinxi.getMacAddress();
        DebvgRizhiLogsjfjlf.d("6.0 之前（不包括6.0）  设备  mac地址 唯一标识符===>>>" + wuli);
        return wuli;
    }


    /**
     * Android 6.0（包括） - Android 7.0（不包括）
     *
     * @return
     */
    private static String naSixtoSevenWulidizhi() {
        String wuxianwangDizhi = "";
        try {
            wuxianwangDizhi = new BufferedReader(new FileReader(new File("/sys/class/net/wlan0/address"))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        DebvgRizhiLogsjfjlf.d("6.0（包括）- Android 7.0（不包括）  设备mac地址 唯一标识符===>>>" + wuxianwangDizhi);
        return wuxianwangDizhi;
    }

    private static String naWulidizhi2(Activity aaccttt) {
        if (zaiXianFou(aaccttt) && dangqianWangluoZhuangtai(aaccttt).equals("WIFI")) {
            String wuliXUliehao = null;
            String str = "";

            try {
                Process aasijif = Runtime.getRuntime().exec("cat /sys/class/net/wlan0/address ");
                InputStreamReader skinndndd = new InputStreamReader(aasijif.getInputStream());
                LineNumberReader qvgvfgg = new LineNumberReader(skinndndd);

                while (null != str) {
                    str = qvgvfgg.readLine();
                    if (str != null) {
                        wuliXUliehao = str.trim();
                        break;
                    }
                }
            } catch (Exception var5) {
            }

            return wuliXUliehao;
        } else {
            return "";
        }
    }

    //硬件物理地址
    private static String naYingjianWulidian() {
        try {
            List<NetworkInterface> wangluoJiekouList = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface nif : wangluoJiekouList) {
                if (!nif.getName().equalsIgnoreCase("wlan0")) continue;

                byte[] wuliZifu = nif.getHardwareAddress();
                if (wuliZifu == null) {
                    return "";
                }

                StringBuilder asthgf = new StringBuilder();
                for (byte b : wuliZifu) {
                    asthgf.append(String.format(Locale.ENGLISH,"%02X:", b));
                }

                if (asthgf.length() > 0) {
                    asthgf.deleteCharAt(asthgf.length() - 1);
                }
                DebvgRizhiLogsjfjlf.d("Android7.0以上（包括7.0）设备 mac地址 唯一标识符===>>>" + asthgf.toString());
                return asthgf.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    //是否在线
    private static boolean zaiXianFou(Activity actyt) {
       ConnectivityManager lianjieGuanli = (ConnectivityManager)actyt.getSystemService("connectivity");
        NetworkInfo wangluoXinxi = lianjieGuanli.getActiveNetworkInfo();
        return wangluoXinxi != null && wangluoXinxi.isConnected();
    }
    //获取网络状态
    private static String dangqianWangluoZhuangtai(Activity actyt) {
       ConnectivityManager lianjieGuanli = (ConnectivityManager) actyt.getSystemService("connectivity");
        if (null == lianjieGuanli) {
            return "none";
        } else {
            NetworkInfo wangXinxi = lianjieGuanli.getActiveNetworkInfo();
            if (wangXinxi != null && wangXinxi.isAvailable()) {
                NetworkInfo wuxianwangXinxi = lianjieGuanli.getNetworkInfo(1);
                if (null != wuxianwangXinxi) {
                    NetworkInfo.State zzzTai = wuxianwangXinxi.getState();
                    if (null != zzzTai && (zzzTai == NetworkInfo.State.CONNECTED || zzzTai == NetworkInfo.State.CONNECTING)) {
                        return "WIFI";
                    }
                }
                NetworkInfo wangluoxinxi2 = lianjieGuanli.getNetworkInfo(0);
                if (null != wangluoxinxi2) {
                    NetworkInfo.State xixi2zhuantai = wangluoxinxi2.getState();
                    String mingzi = wangluoxinxi2.getSubtypeName();
                    if (null != xixi2zhuantai && (xixi2zhuantai == NetworkInfo.State.CONNECTED || xixi2zhuantai == NetworkInfo.State.CONNECTING)) {
                        switch (wangXinxi.getSubtype()) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                                return "2G";
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                                return "3G";
                            case 13:
                                return "4G";
                            default:
                                return !mingzi.equalsIgnoreCase("TD-SCDMA") && !mingzi.equalsIgnoreCase("WCDMA") && !mingzi.equalsIgnoreCase("CDMA2000") ? "other" : "3G";
                        }
                    }
                }

                return "none";
            } else {
                return "none";
            }
        }
    }
    //获取系统语言
    public static Locale dangqianXitongYuan() {
        return huoquBendipeizhi(Resources.getSystem().getConfiguration());
    }

    //getLocal  获取local ? 本地？
    public static Locale huoquBendipeizhi(Configuration peizhi) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return peizhi.getLocales().get(0);
        } else {
            return peizhi.locale;
        }
    }
    //检查自身权限
    public static boolean jianchaZijiPPPP(Context chiyouzhe, String qxxxppp) {
        if (ActivityCompat.checkSelfPermission(chiyouzhe, qxxxppp)
                != PackageManager.PERMISSION_GRANTED) {
            return true;
        }
        return false;
    }



    //获取Imei
    public static String naShebeiBianhao(Context chiyouZhe) {
        String onlyOneId = null;
        try {
            TelephonyManager zhuajiGunali = (TelephonyManager) chiyouZhe.getSystemService(Context.TELEPHONY_SERVICE);
            if (Build.VERSION.SDK_INT >= 29) {
                onlyOneId = Settings.System.getString(chiyouZhe.getContentResolver(), Settings.Secure.ANDROID_ID);
                DebvgRizhiLogsjfjlf.d("00getIMIE  onlyoneflag===>>>" + onlyOneId);
                return onlyOneId;
            } else {
                if (ActivityCompat.checkSelfPermission(chiyouZhe, Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {
                    onlyOneId = zhuajiGunali.getDeviceId();
                    DebvgRizhiLogsjfjlf.d("11getIMIE  设备唯一标识符===>>>" + onlyOneId);
                    return onlyOneId;
                } else {
                    DebvgRizhiLogsjfjlf.d("22getIMIE  设备唯一标识符===>>>" + "permission.READ_PHONE_STATE is Denied");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (null == onlyOneId || "".equals(onlyOneId)) {
                return "";
            }
        }
        return "";
    }

    //
    private static String najsisisisjs(String s0, String s1) {
        boolean empty0 = TextUtils.isEmpty(s0);
        boolean empty1 = TextUtils.isEmpty(s1);
        if (empty0 && empty1) return "";
        if (!empty0 && !empty1) {
            if (s0.compareTo(s1) <= 0) {
                return s0;
            } else {
                return s1;
            }
        }
        if (!empty0) return s0;
        return s1;
    }

    //获取系统属性配置 通过反射
    private static String chaxunPropertiessByFanshe(String gfdsdsf) {
        try {
            @SuppressLint("PrivateApi")
            Class<?> clz = Class.forName("android.os.SystemProperties");
            Method getMethod = clz.getMethod("get", String.class, String.class);
            return (String) getMethod.invoke(clz, gfdsdsf, "");
        } catch (Exception e) {/**/}
        return "";
    }


    //获取网络操作名称
    public static String zhaoWangluoOperatMingzi(Activity aactt) {
        TelephonyManager systemService = (TelephonyManager) aactt.getSystemService(Context.TELEPHONY_SERVICE);
        return systemService.getNetworkOperatorName();
    }


    //获取网络类型
    public static String chaXunWangluoLeixing(Activity aaccyytyt) {
        if (jianchaZijiPPPP(aaccyytyt,Manifest.permission.ACCESS_NETWORK_STATE)) {
            return "NETWORK_NO";
        }
        if (yitaiWangFou(aaccyytyt)) {
            return "NETWORK_ETHERNET";
        }
        ConnectivityManager lainjieGuanli =
                (ConnectivityManager) aaccyytyt.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (lainjieGuanli == null) {
            return null;
        }
        NetworkInfo wangluoXinxi = lainjieGuanli.getActiveNetworkInfo();
        if (wangluoXinxi != null && wangluoXinxi.isAvailable()) {
            if (wangluoXinxi.getType() == ConnectivityManager.TYPE_WIFI) {
                return "WIFI";
            } else if (wangluoXinxi.getType() == ConnectivityManager.TYPE_MOBILE) {
                switch (wangluoXinxi.getSubtype()) {
                    case TelephonyManager.NETWORK_TYPE_GSM:
                    case TelephonyManager.NETWORK_TYPE_GPRS:
                    case TelephonyManager.NETWORK_TYPE_CDMA:
                    case TelephonyManager.NETWORK_TYPE_EDGE:
                    case TelephonyManager.NETWORK_TYPE_1xRTT:
                    case TelephonyManager.NETWORK_TYPE_IDEN:
                        return "2G";

                    case TelephonyManager.NETWORK_TYPE_TD_SCDMA:
                    case TelephonyManager.NETWORK_TYPE_EVDO_A:
                    case TelephonyManager.NETWORK_TYPE_UMTS:
                    case TelephonyManager.NETWORK_TYPE_EVDO_0:
                    case TelephonyManager.NETWORK_TYPE_HSDPA:
                    case TelephonyManager.NETWORK_TYPE_HSUPA:
                    case TelephonyManager.NETWORK_TYPE_HSPA:
                    case TelephonyManager.NETWORK_TYPE_EVDO_B:
                    case TelephonyManager.NETWORK_TYPE_EHRPD:
                    case TelephonyManager.NETWORK_TYPE_HSPAP:
                        return "3G";

                    case TelephonyManager.NETWORK_TYPE_IWLAN:
                    case TelephonyManager.NETWORK_TYPE_LTE:
                        return "4G";

                    case TelephonyManager.NETWORK_TYPE_NR:
                        return "5G";
                    default:
                        String wangmingzi = wangluoXinxi.getSubtypeName();
                        if (wangmingzi.equalsIgnoreCase("TD-SCDMA")
                                || wangmingzi.equalsIgnoreCase("WCDMA")
                                || wangmingzi.equalsIgnoreCase("CDMA2000")) {
                            return "3G";
                        } else {
                            return "UNKNOWN";
                        }
                }
            } else {
                return "UNKNOWN";
            }
        }
        return "NO";
    }

    //是否是以太网
    private static boolean yitaiWangFou(Activity yyyyy) {
        final ConnectivityManager linajieGuanli =
                (ConnectivityManager) yyyyy.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (linajieGuanli == null) return false;
        final NetworkInfo wangXinxi = linajieGuanli.getNetworkInfo(ConnectivityManager.TYPE_ETHERNET);
        if (wangXinxi == null) return false;
        NetworkInfo.State wangZHuangtai = wangXinxi.getState();
        if (null == wangZHuangtai) return false;
        return wangZHuangtai == NetworkInfo.State.CONNECTED || wangZHuangtai == NetworkInfo.State.CONNECTING;
    }

    //获取时区id
    public static String naShiquId() {
        TimeZone shiqu = TimeZone.getDefault();
        return chuangJianGmtZifuchuan(true, true, shiqu.getRawOffset());
    }
    //创建gmt不在线string
    public static String chuangJianGmtZifuchuan(boolean baohanGtmFou, boolean baohanFenshiFengefu, int pianyiLiang) {
        int pianyiShichang = pianyiLiang / 60000;
        char sign = '+';
        if (pianyiShichang < 0) {
            sign = '-';
            pianyiShichang = -pianyiShichang;
        }
        StringBuilder arrayZifuhchaun = new StringBuilder(9);
        if (baohanGtmFou) {
            arrayZifuhchaun.append("GMT");
        }
        arrayZifuhchaun.append(sign);
        diejiaHaoma(arrayZifuhchaun, 2, pianyiShichang / 60);
        if (baohanFenshiFengefu) {
            arrayZifuhchaun.append(':');
        }
        diejiaHaoma(arrayZifuhchaun, 2, pianyiShichang % 60);
        return arrayZifuhchaun.toString();
    }

    //追加号码
    public static void diejiaHaoma(StringBuilder goujian, int shuliang, int zhi) {
        String string = Integer.toString(zhi);
        for (int i = 0; i < shuliang - string.length(); i++) {
            goujian.append('0');
        }
        goujian.append(string);
    }

    //是否无线代理
    public static boolean shiWuxainDailiFou() {
        boolean SHIFOU_ICSOR_WAN = Build.VERSION.SDK_INT >= 14;
        String dailiDizhi;
        int dailiDuankou;
        if (SHIFOU_ICSOR_WAN) {
            dailiDizhi = System.getProperty("http.proxyHost");
            String portStr = System.getProperty("http.proxyPort");
            dailiDuankou = Integer.parseInt(portStr != null ? portStr : "-1");
        } else {
            dailiDizhi = Proxy.getHost(MyJichuAplica.getInstance());
            dailiDuankou = Proxy.getPort(MyJichuAplica.getInstance());
        }

        return !TextUtils.isEmpty(dailiDizhi) && dailiDuankou != -1;
    }


    //是否用Vpn
    public static boolean shiFouyongXuniWangKuayu() {
        if (Build.VERSION.SDK_INT > 14) {
            String defaultHost = Proxy.getDefaultHost();
            return !TextUtils.isEmpty(defaultHost);
        } else {
            return false;
        }
    }

    //是否USB调试 debug
    public static boolean yongUsbTiaoshiFou(Activity acccyyu) {
        boolean tttsss = Settings.Secure.getInt(acccyyu.getContentResolver(), Settings.Secure.ADB_ENABLED, 0) > 0;
        return tttsss;
    }


    //获取传感器列表
    public static List<ChuanganqiModel> naChuanganqiLiebiao(Activity activity) {
        List<ChuanganqiModel> chuanganqiList = new ArrayList<>();
        SensorManager chuanganqiGuanli = (SensorManager)activity.getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> guanganqI = chuanganqiGuanli.getSensorList(Sensor.TYPE_ALL);
        for (Sensor item : guanganqI) {
            ChuanganqiModel chuanganqiModel = new ChuanganqiModel();
            chuanganqiModel.squareBookshop =item.getType()+"";
            chuanganqiModel.foreignReceiverRussianSunshineCurrency =item.getName()+"";
            chuanganqiModel.strongAncientSurgeonYou =item.getVersion()+"";
            chuanganqiModel.foreignMatch =item.getVendor()+"";
            chuanganqiModel.brownVegetableFullCapAmbulance =item.getMaximumRange()+"";
            chuanganqiModel.shyStraitCentigradeRope =item.getMinDelay()+"";
            chuanganqiModel.harmlessEveryEnglandBasicBackache =item.getPower()+"";
            chuanganqiModel.unsafeDirectionIndeedHandwritingGrammar =item.getResolution()+"";
            chuanganqiList.add(chuanganqiModel);
        }
        return chuanganqiList;
    }
}
