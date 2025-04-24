package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;

import java.util.List;
import java.util.Locale;
import androidx.core.app.ActivityCompat;
import static android.content.Context.LOCATION_SERVICE;
public class DingWeizhiTols {

    public static LocationManager weizhiGuanli;
    public static String jingdu = "0";//经度
    public static String weidu = "0";//纬度
    public static String jiedaodizhi = "";
    public static String chengshidizhi = "";
    public static String shengfendizhi = "";

    public static void getWeizhiDingwei(Activity accyytyt) {
        weizhiGuanli = (LocationManager) accyytyt.getSystemService(LOCATION_SERVICE);
        Location dingwei = huoquZhidaoDizhi(weizhiGuanli,accyytyt);
        if (dingwei != null) {
            jingdu = String.valueOf(dingwei.getLongitude());
            weidu = String.valueOf(dingwei.getLatitude());
            BendiHuancunTols.commitZifuchuan(BendiHuancunTols.XITONG_JINGWEIDU, jingdu +"");
            BendiHuancunTols.commitZifuchuan(BendiHuancunTols.XITONG_WEIJINGDU, weidu +"");
            Geocoder geocoder = new Geocoder(accyytyt, Locale.getDefault());
            try {
                List<Address> dizhi = geocoder.getFromLocation(Double.valueOf(weidu), Double.valueOf(jingdu), 1);
                if (dizhi != null && dizhi.size() > 0) {
                    Address address = dizhi.get(0);
                    shengfendizhi = address.getAdminArea();
                    chengshidizhi = address.getLocality();
                    jiedaodizhi = address.getAddressLine(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static Location huoquZhidaoDizhi(LocationManager locationManager, Activity activity) {
        List<String> tigongzhe = locationManager.getProviders(true);
        Location zuijiaDingwei = null;
        for (String provider : tigongzhe) {
            if (
//                    ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return null;
            }
            Location dingwei = locationManager.getLastKnownLocation(provider);
            if (dingwei == null) {
                continue;
            }
            if (zuijiaDingwei == null || dingwei.getAccuracy() < zuijiaDingwei.getAccuracy()) {
                zuijiaDingwei = dingwei;
            }
        }
        if (zuijiaDingwei!=null){
            double jingjingdu = zuijiaDingwei.getLongitude();
            double weiweidu = zuijiaDingwei.getLatitude();
            BendiHuancunTols.commitZifuchuan(BendiHuancunTols.XITONG_JINGWEIDU,jingjingdu+"");
            BendiHuancunTols.commitZifuchuan(BendiHuancunTols.XITONG_WEIJINGDU,weiweidu+"");
        }
        return zuijiaDingwei;
    }
}
