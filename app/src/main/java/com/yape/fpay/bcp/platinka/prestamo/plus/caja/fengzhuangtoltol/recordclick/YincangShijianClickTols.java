package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuoquBigJsonUpShujuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.GaogeZhanghaoIntoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian0Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow.JinJinGoGoJian1Activity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow2.JinJinGoGoJian0ActivityEg;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.gjtype.SelectGuoJiaUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.SuoyouXinxiModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static com.facebook.FacebookSdk.getApplicationContext;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols.shebeiId;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols.SEARCH_ZHUAJINUM_BBB;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols.SEARCH_ZHUAJINUM_XXX;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols.GONGZUOLXR_SAVE_BBB;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols.GONGZUOLXR_SAVE_XXX;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols.COUNTTY_ADDRESS;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols.BASEHEAD_DIZHI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols.GONGZUOLXR_SERACH_BBB;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols.GONGZUOLXR_SERACH_XXX;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ZHUAJI;

import androidx.annotation.NonNull;

//import io.branch.referral.util.BRANCH_STANDARD_EVENT;
//import io.branch.referral.util.BranchEvent;

public class YincangShijianClickTols {

    //gaid
    public static String yichuanId = "00000000-0000-0000-0000-000000000000";
    //user_pseudo_id
    public static String yonghusmId = "";
    //user_appflys_id
    public static String feiSId = "";
    //appssid
    public static String appshasahId;
    //language
    public static String muyuyaaa;
    //gpsInfo
    public static String dingweixinxi;
    //laGps
    public static String jingorweiGps = "0";
    //loGps
    public static String weirojingGps = "0";
    //versionName
    public static String banbenming;
    //versionCode
    public static int banbenma;


    public static int GuojiaLeixing = 2;//1.西班牙，2.秘鲁
    public final static int GuojiaLeixing1 = 1;//1.西班牙
    public final static int GuojiaLeixing2 = 2;//1.秘鲁


    public static void chushihaMaidian() {

        switch (GuojiaLeixing) {
            case GuojiaLeixing2://秘鲁
                appshasahId = "426";
                muyuyaaa = "es";

                BASEHEAD_DIZHI = COUNTTY_ADDRESS;
                // 保存工作基本联系人身份信息
                ChangliangConfigTols.GONGZUOLXR_SAVE_SHENFEN = GONGZUOLXR_SAVE_BBB;
                // 查询工作基本联系人身份信息
                ChangliangConfigTols.GONGZUOLXR_SERACH_SHENFEN = GONGZUOLXR_SERACH_BBB;
                // 查询电话
                ChangliangConfigTols.SEARCH_ZHUAJINUM_DIANHUA = SEARCH_ZHUAJINUM_BBB;
                break;
            default://西班牙
                appshasahId = "426";
                muyuyaaa = "es";

//                NEWS = Ip_ES;
                // 保存工作基本联系人身份信息
                ChangliangConfigTols.GONGZUOLXR_SAVE_SHENFEN = GONGZUOLXR_SAVE_XXX;
                // 查询工作基本联系人身份信息
                ChangliangConfigTols.GONGZUOLXR_SERACH_SHENFEN = GONGZUOLXR_SERACH_XXX;
                // 查询电话
                ChangliangConfigTols.SEARCH_ZHUAJINUM_DIANHUA = SEARCH_ZHUAJINUM_XXX;
                break;
        }

        FirebaseAnalytics.getInstance(MyJichuAplica.getInstance()).getAppInstanceId().addOnCompleteListener(new OnCompleteListener<String>() {

            @Override
            public void onComplete(@NonNull Task<String> task) {
                if (task.isSuccessful()) {
                    if (task.getResult() != null)
                        yonghusmId = task.getResult();
                }
            }
        });

        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU)))
            jingorweiGps = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU)))
            weirojingGps = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);

        Gson gson = new Gson();
        dingweixinxi = gson.toJson(HuoquBigJsonUpShujuTols.getLocEntity(MyJichuAplica.getInstance()));

        //获取包管理器
        banbenming = "1.0.0";
        banbenma = 1;
        try {
            PackageManager pm = MyJichuAplica.getInstance().getPackageManager();
            PackageInfo packageInfo = pm.getPackageInfo(MyJichuAplica.getInstance().getPackageName(), 0);
            banbenming = packageInfo.versionName;
            banbenma = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String userID = "";
    public static String appSsid = "";

    public static boolean zhuchanpinfou() {
        userID = YincangShijianClickTols.appshasahId;
        appSsid = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID);
        String copyUserInfo = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.COPY_USER_INFO);
        if (!TextUtils.isEmpty(copyUserInfo) && copyUserInfo.contains(",")) {
            String[] split = copyUserInfo.split(",");
            if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                userID = split[0];
                appSsid = split[1];
            }

            if ("426".equals(appSsid)) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public static void LianshuMaidian(String key) {
        if (zhuchanpinfou()) {
            AppEventsLogger logger = AppEventsLogger.newLogger(MyJichuAplica.getInstance());
            logger.logEvent(key);
            Log.d("lianshumaidian", "logEvent:" + key);
        }

    }

    public static void HuojiMaidian(String key) {
        if (zhuchanpinfou()) {
            FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(MyJichuAplica.getInstance());
            mFirebaseAnalytics.logEvent(key, new Bundle());
            Log.d("huojimaidian", "logEvent:" + key);
        }

    }

//    public static void BrMaidian(BRANCH_STANDARD_EVENT key) {
//        if(zhuchanpinfou()) {
//            BranchEvent be = new BranchEvent(key);
//            be.logEvent(MyJichuAplica.getInstance());
//            Log.d("branchmaidian", "logEvent:" + key);
//        }
//    }

    public static void FlyMaidian(String key) {
        if (zhuchanpinfou()) {
            Map<String, Object> eventValues = new HashMap<String, Object>();
            AppsFlyerLib.getInstance().logEvent(getApplicationContext(),
                    key, eventValues);
            Log.d("flymaidian", "logEvent:" + key);
        }
    }

    //之前老埋点
    public static void QingqiuMaidian(String key) {
        WangluoQingqiuVolyeyeTols.chuangjianInit(MyJichuAplica.getInstance()).post(ChangliangConfigTols.CLICKEVENT, SuoyouXinxiModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<SuoyouXinxiModel>() {
            @Override
            public void OnMap(Map<String, String> map) {

                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);

                map.put("hopelessKnifeBar", key);//optType
                String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                if (TextUtils.isEmpty(s1)) {
                    s1 = "0";
                }
                if (TextUtils.isEmpty(s2)) {
                    s2 = "0";
                }
                map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                map.put("carefulFuneralHardEssay", s1 + "," + s2);//lbs
                map.put("certainMentalTerminalExchange", Build.BRAND);//equipmentBrand
                map.put("unfairRoundPermission", Build.MODEL);// equipmentType
                map.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));//imei
                map.put("endlessSnowClearAirYoungMeaning", banbenming);//versionName
                map.put("leftAfternoonFlamingProtection", banbenma + "");//versionCode
                if ("00000000-0000-0000-0000-000000000000".equals(YincangShijianClickTols.yichuanId)) {
                    if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.GAIDGUGE))) {
                        YincangShijianClickTols.yichuanId = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.GAIDGUGE);
                    }

                }
                Log.d("gaidgaid", YincangShijianClickTols.yichuanId);
                map.put("doubleMotorcycleIslandCompetition", YincangShijianClickTols.yichuanId);//gaid
                map.put("rapidGeographyMistakenViolenceHousework", shebeiId);//uuid
                map.put("guiltyRichCigarAdmission", Build.VERSION.RELEASE);//os_version
                map.put("incorrectNovelist", "Android");//user_agent
                map.put("communistActorBeardThought", ShebeiXinxiTols.dangqianXitongYuan().getLanguage());//mobile_language
            }

            @Override
            public void onSuccess(SuoyouXinxiModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
//                    Toast.makeText(MyJichuAplica.getInstance(),BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU) + "," + BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU),Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onError(String error) {
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    //新风控买埋点
    public static void QingqiuNewRiskMaidian(String key) {
        WangluoQingqiuVolyeyeTols.chuangjianInit(MyJichuAplica.getInstance()).post(ChangliangConfigTols.NEWCLICKEVENT, SuoyouXinxiModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<SuoyouXinxiModel>() {
            @Override
            public void OnMap(Map<String, String> map) {

                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
                map.put("hopelessKnifeBar", key);//optType
                String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                if (TextUtils.isEmpty(s1)) {
                    s1 = "0";
                }
                if (TextUtils.isEmpty(s2)) {
                    s2 = "0";
                }
                map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                map.put("carefulFuneralHardEssay", s1 + "," + s2);//lbs
//                map.put("bigAncientTastyHeadteacher",  newriskdata);//data 新风控埋点用

                map.put("certainMentalTerminalExchange", Build.BRAND);//equipmentBrand
                map.put("unfairRoundPermission", Build.MODEL);// equipmentType
                map.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));//imei
                map.put("endlessSnowClearAirYoungMeaning", banbenming);//versionName
                map.put("leftAfternoonFlamingProtection", banbenma + "");//versionCode
                map.put("doubleMotorcycleIslandCompetition", YincangShijianClickTols.yichuanId);//gaid
                map.put("rapidGeographyMistakenViolenceHousework", shebeiId);//uuid
                map.put("guiltyRichCigarAdmission", Build.VERSION.RELEASE);//os_version
                map.put("incorrectNovelist", "Android");//user_agent
                map.put("communistActorBeardThought", ShebeiXinxiTols.dangqianXitongYuan().getLanguage());//mobile_language
            }

            @Override
            public void onSuccess(SuoyouXinxiModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
//                    Toast.makeText(MyJichuAplica.getInstance(),key ,Toast.LENGTH_SHORT).show();

                    Log.d("newrisk", key);
                }
            }

            @Override
            public void onError(String error) {
                Log.d("newrisk", error);
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    public static void bianhuaYuyan(Context context) {
        String language;
        String country;

        switch (GuojiaLeixing) {
            case GuojiaLeixing2://秘鲁
                language = "es";
                country = "PE";
                break;
            default://西班牙
                language = "es";
                country = "ES";
        }

        BendiHuancunTols.commitZhengxing(BendiHuancunTols.XITONG_YUYAN_TRUE, GuojiaLeixing);

        Resources resources = context.getResources();
        Configuration config = resources.getConfiguration();
        config.locale = new Locale(language, country);
        resources.updateConfiguration(config, null);
    }

    public static void shezhiShujuActivity(Context packageContext) {
        Intent intent = new Intent();
        if (SelectGuoJiaUtil.isGuoJiaBl()) {
            //秘鲁
            intent.setClass(packageContext, JinJinGoGoJian0Activity.class);
        } else {
            intent.setClass(packageContext, JinJinGoGoJian0ActivityEg.class);
        }
        packageContext.startActivity(intent);

//        Intent intent = new Intent(packageContext, GoodsActivity.class);
//        packageContext.startActivity(intent);
    }
}
