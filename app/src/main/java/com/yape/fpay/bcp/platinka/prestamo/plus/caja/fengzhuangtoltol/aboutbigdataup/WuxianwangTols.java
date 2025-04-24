package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DangqianWuxianWangModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;

import java.util.ArrayList;
import java.util.List;


//wifi gongju
public class WuxianwangTols {

    public static String huoquwangluoipdizhi(Context accyyy) {
        String iiipppdizhi = "";
        try {
            WifiManager wuxainGuanli = (WifiManager)accyyy.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            WifiInfo wuxianXinxi = wuxainGuanli.getConnectionInfo();
            iiipppdizhi = WngluoTols.zhengxingZhuanIP(wuxianXinxi.getIpAddress());
        }catch (Exception e){
            e.printStackTrace();
        }

        return iiipppdizhi;
    }

    //获取ip
    public static String huoquwangluoipdizhi(Activity accyyy) {
        String iiipppdizhi = "";
        try {
            WifiManager wuxainGuanli = (WifiManager)accyyy.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            WifiInfo wuxianXinxi = wuxainGuanli.getConnectionInfo();
            iiipppdizhi = WngluoTols.zhengxingZhuanIP(wuxianXinxi.getIpAddress());
        }catch (Exception e){
            e.printStackTrace();
        }

        return iiipppdizhi;
    }


    //get wifi count
    public static int huoquWuxianShuliang(Activity aaccyyu) {
        StringBuffer sInfo = new StringBuffer();
        List<ScanResult> newScanResultList = new ArrayList<>();
        try {
            WifiManager mWifiManager = (WifiManager)aaccyyu.getSystemService(Context.WIFI_SERVICE);
            WifiInfo mWifiInfo = mWifiManager.getConnectionInfo();
            List<ScanResult> scanResults = mWifiManager.getScanResults();//搜索到的设备列表

            for (ScanResult scanResult : scanResults) {
                int position = nadaoTiaomuWeizhi(newScanResultList, scanResult);
                if (position != -1) {
                    if (newScanResultList.get(position).level < scanResult.level) {
                        newScanResultList.remove(position);
                        newScanResultList.add(position, scanResult);
                    }
                } else {
                    newScanResultList.add(scanResult);
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }



        return newScanResultList.size();
    }

    //get wifi item position
    private static int nadaoTiaomuWeizhi(List<ScanResult> liulangList, ScanResult liulantiaomu) {
        for (int i = 0; i < liulangList.size(); i++) {
            if (liulantiaomu.SSID.equals(liulangList.get(i).SSID)) {
                return i;
            }
        }
        return -1;
    }

    //get wifi model
    public static DangqianWuxianWangModel nadaoDangqianWuxianLei(Activity acthhyyyy) {
        DangqianWuxianWangModel dangqianwuxian = new DangqianWuxianWangModel();
        try {
            WifiManager wuxianGuanli = (WifiManager) acthhyyyy.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            WifiInfo wuxianXxin = wuxianGuanli.getConnectionInfo();
            String wuxainSSid = wuxianXxin.getSSID().replace("\"", "");

            dangqianwuxian.splendidPathDish =wuxianXxin.getBSSID();
            dangqianwuxian.mostMotorIncorrectBriefEyesight =wuxianXxin.getSSID();
            dangqianwuxian.noisyCountrysideDifferentDriverSilentThief = wuxianXxin.getMacAddress();
            dangqianwuxian.foreignReceiverRussianSunshineCurrency =wuxainSSid;
        }catch (Exception e){
            e.printStackTrace();
        }

        return dangqianwuxian;
    }

    //get current wifi model list
    public static List<DangqianWuxianWangModel> huoquDangqianWuxianLeiList(Activity aattyyy) {
        List<DangqianWuxianWangModel>  wufilist = new ArrayList<>();

        try {
            WifiManager wuxianGuanli = (WifiManager)aattyyy.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            List<ScanResult> liulanList = wuxianGuanli.getScanResults();//搜索到的设备列表
            for (ScanResult scanResult : liulanList) {
                DangqianWuxianWangModel bean = new DangqianWuxianWangModel();
                bean.splendidPathDish =scanResult.BSSID;
                bean.mostMotorIncorrectBriefEyesight =scanResult.SSID;
//            bean.mac= GeneralUtils.getMac(activity);
                bean.noisyCountrysideDifferentDriverSilentThief = scanResult.BSSID;
                bean.foreignReceiverRussianSunshineCurrency =scanResult.SSID;
                wufilist.add(bean);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return wufilist;
    }

}
