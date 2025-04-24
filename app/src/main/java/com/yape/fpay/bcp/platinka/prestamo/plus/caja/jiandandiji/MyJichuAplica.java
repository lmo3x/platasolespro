package com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.GuojihuaTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.TupianGongjuShanghuanByVoleyley;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
//import com.facebook.FacebookSdk;
//import com.facebook.appevents.AppEventsLogger;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.QingqPeizhisSsf;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei.VoliWawalleyBangzhuLei;
//import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
//import com.google.zxing.common.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import im.crisp.client.Crisp;
//import io.branch.referral.Branch;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols.shebeiId;

import androidx.annotation.NonNull;

public class MyJichuAplica extends Application {

    public static String BAIOZHUTA = "application>>>>> ";
    public static Context applitionChiyouzhe;
    private static  MyJichuAplica myapplication;

    private ArrayList<Activity> activityArrayList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        applitionChiyouzhe = getApplicationContext();

        huoquGugeIdddd();
        chushihuaWangluo();
        initWangluoZujian();

        GuojihuaTols.huoquYuaynLlll(this);
        AboutShebeiTols.commonHuoquShebiId(this);
        YincangShijianClickTols.chushihaMaidian();

        initLianGe();

        initappsfeifei();

//        Branch.enableLogging();
//        Branch.getAutoInstance(this);
//        Crisp.configure(this,getString(R.string.kehuzhanghao1)+getString(R.string.kehuzhanghao2)+getString(R.string.kehuzhanghao3)+getString(R.string.kehuzhanghao4)+getString(R.string.kehuzhanghao5));//秘鲁


        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
//            GuojihuaTols.gaibianYanyu(applitionChiyouzhe, dangqianAppYanyu);
        }

    }

    private void initappsfeifei() {
        AppsFlyerLib.getInstance().init("2qR5vwRwkGv2sKBgUX8kqd", null, this);
        AppsFlyerLib.getInstance().start(this);

//        AppsFlyerLib.getInstance().start(applitionChiyouzhe, "bhWd4iMsouFNnaPktzQ8pT", new AppsFlyerRequestListener() {
//            @Override
//            public void onSuccess() {
//                Log.d("aaff", "Launch sent successfully, got 200 response code from server");
//                YincangShijianClickTols.feiSId = AppsFlyerLib.getInstance().getAppsFlyerUID(applitionChiyouzhe);
//            }
//
//            @Override
//            public void onError(int i, @NonNull String s) {
//                Log.d("aaff", "Launch failed to be sent:\n" +
//                        "Error code: " + i + "\n"
//                        + "Error description: " + s);
//            }
//        });

    }

    private void initLianGe() {
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }

    /*初始化实例*/
    @Override
    protected void attachBaseContext(Context context) {
        myapplication = this;
        super.attachBaseContext(context);
    }


    /**
     * 网络服务初始化
     */
    private void initWangluoZujian() {
        VoliWawalleyBangzhuLei.chshihuaDanli().chushihua(getApplicationContext());
        QingqPeizhisSsf.getPeichiInst().setHeader(setWangluoQingqiutou());//根据服务器要求，设置网络请求头
    }


    public Map<String, String> setWangluoQingqiutou() {
        Map<String, String> header = new HashMap<>();
        header.put("agriculturalArithmeticGeneralPine", YincangShijianClickTols.appshasahId);//appssid
        header.put("pleasantSeaweedMobileHousewife", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_TOKEN));//token
        header.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID));//userid
        header.put("mostCongratulationPeacefulBreakfast", "googleplay");
        header.put("endlessSnowClearAirYoungMeaning", YincangShijianClickTols.banbenming);
        header.put("leftAfternoonFlamingProtection", YincangShijianClickTols.banbenma + "");//versionCode
        header.put("averageExpedition", shebeiId);
        header.put("femaleToothacheArabPerfectCloud", "1");
        header.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));
        return header;
    }

    private void chushihuaWangluo() {
        WangluoQingqiuVolyeyeTols.chuangjianInit(this);
        TupianGongjuShanghuanByVoleyley.chushiHuaInstantize(this);
    }

    public static Context getInstance() {
        return applitionChiyouzhe;
    }


    public static MyJichuAplica getApplicaInstance() {
        return myapplication;
    }

    //获取 GAID
    public static void huoquGugeIdddd() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                AdvertisingIdClient.Info gugeidxinxi = null;
                try {
                    gugeidxinxi = AdvertisingIdClient.getAdvertisingIdInfo(getInstance());
                } catch (IOException e) {
                    /*
                     Unrecoverable error connecting to Google Play services (e.g.,
                     the old version of the service doesn't support getting AdvertisingId).
                    */
                    Log.e("getGAID", "IOException");
                } catch (GooglePlayServicesNotAvailableException e) {
                    // Google Play services is not available entirely.
                    Log.e("getGAID", "GooglePlayServicesNotAvailableException");
                } catch (Exception e) {
                    Log.e("getGAID", "Exception:" + e.toString());
                    // Encountered a recoverable error connecting to Google Play services.
                }
                if (gugeidxinxi != null) {
                    YincangShijianClickTols.yichuanId = gugeidxinxi.getId();
                    BendiHuancunTols.commitZifuchuan(BendiHuancunTols.GAIDGUGE,gugeidxinxi.getId());
                    Log.w("getGAID", "gaid:" + YincangShijianClickTols.yichuanId);
                }
            }
        }).start();
    }

    /**
     * activity addto list
     */
    public void addactivitytoList(Activity aaaa) {
        //对activity的弱引用
        if (!activityArrayList.contains(aaaa)) {
            activityArrayList.add(aaaa);
        }
    }


    /**
     * remove activity
     */
    public void removedestoryActivity(Activity aaa) {
        //对activity的弱引用
        if (activityArrayList.contains(aaa)) {
            activityArrayList.remove(aaa);
        }
    }


    /**
     * close activitysss by list
     */
    public void closeAlllistActivity() {
        try {
            for (Activity activity : activityArrayList) {
                if (null != activity) {
                    activity.finish();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
