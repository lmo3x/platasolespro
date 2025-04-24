package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

//跳转权限设置页面
public class QuanxianShipeiGuanliTols {

    private static final String TAG = "toQuanxianPage";

    /**
     * Build.MANUFACTURER
     */
    private static final String ZHUAJITYPE_HUAWEI = "HUAWEI";//华为
    private static final String ZHUAJITYPE_MEIZU = "Meizu";//魅族
    private static final String ZHUAJITYPE_XIAOMI = "Xiaomi";//小米
    private static final String ZHUAJITYPE_SONY = "Sony";//索尼
    private static final String ZHUAJITYPE_OPPO = "OPPO";//oppo
    private static final String ZHUAJITYPE_LG = "LG";
    private static final String ZHUAJITYPE_VIVO = "vivo";//vivo
    private static final String ZHUAJITYPE_SAMSUNG = "samsung";//三星
    private static final String ZHUAJITYPE_ZTE = "ZTE";//中兴
    private static final String ZHUAJITYPE_YULONG = "YuLong";//酷派
    private static final String ZHUAJITYPE_LENOVO = "LENOVO";//联想

    /**
     * 此函数可以自己定义
     * @param activity
     */
    public static void tiaoZhuanZhuajiSetsPage(Activity activity){
        switch (Build.MANUFACTURER){
            case ZHUAJITYPE_HUAWEI:
                TiaozhuanHuaweiSetsPage(activity);
                break;
            case ZHUAJITYPE_MEIZU:
                TiaozhuanMeizuSetsPage(activity);
                break;
            case ZHUAJITYPE_XIAOMI:
                TiaozhuanXiaoMiSetsPage(activity);
                break;
            case ZHUAJITYPE_SONY:
                TiaozhuanSonySetsPage(activity);
                break;
            case ZHUAJITYPE_OPPO:
                TiaozhuanOppoSetsPage(activity);
                break;
            case ZHUAJITYPE_VIVO:
                TiaozhuanVivoSetsPage(activity);
                break;
            case ZHUAJITYPE_LG:
                TiaozhuanLGSetsPage(activity);
                break;
            default:
                TiaozhuanAppSetsPage(activity);
                Log.e("goToSetting", "目前暂不支持此系统");
                break;
        }
    }

    public static void TiaozhuanHuaweiSetsPage(Activity accyyh) {
        try {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("packageName", accyyh.getApplicationInfo().packageName);
            ComponentName comp = new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity");
            intent.setComponent(comp);
            accyyh.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            TiaozhuanAppDetailsSetsPage(accyyh);
        }
    }

    public static void TiaozhuanMeizuSetsPage(Activity activity) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory(Intent.CATEGORY_DEFAULT);
            intent.putExtra("packageName", activity.getPackageName());
            activity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            TiaozhuanAppDetailsSetsPage(activity);
        }
    }

    public static void TiaozhuanXiaoMiSetsPage(Activity activity) {
        try {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.putExtra("extra_pkgname", activity.getPackageName());
            ComponentName componentName = new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            intent.setComponent(componentName);
            activity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            TiaozhuanAppDetailsSetsPage(activity);
        }
    }

    public static void TiaozhuanSonySetsPage(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("packageName", activity.getPackageName());
            ComponentName comp = new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity");
            intent.setComponent(comp);
            activity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            TiaozhuanAppDetailsSetsPage(activity);
        }
    }

    public static void TiaozhuanOppoSetsPage(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("packageName", activity.getPackageName());
            //        ComponentName comp = new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity");
            ComponentName comp = new ComponentName("com.coloros.securitypermission", "com.coloros.securitypermission.permission.PermissionAppAllPermissionActivity");//R11t 7.1.1 os-v3.2
            intent.setComponent(comp);
            activity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            TiaozhuanAppDetailsSetsPage(activity);
        }
    }

    public static void TiaozhuanVivoSetsPage(Activity activity) {
        Intent localIntent;
        try {
            if (((Build.MODEL.contains("Y85")) && (!Build.MODEL.contains("Y85A"))) || (Build.MODEL.contains("vivo Y53L"))) {
                localIntent = new Intent();
                localIntent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewTabActivity");
                localIntent.putExtra("packagename", activity.getPackageName());
                localIntent.putExtra("tabId", "1");
                activity.startActivity(localIntent);
            } else {

                if((Build.MODEL.contains("V2118"))){
                    TiaozhuanAppSetsPage(activity);
                }else {
                    localIntent = new Intent();
                    localIntent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
                    localIntent.setAction("secure.intent.action.softPermissionDetail");
                    localIntent.putExtra("packagename", activity.getPackageName());
                    activity.startActivity(localIntent);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
            TiaozhuanAppDetailsSetsPage(activity);
        }

    }

    public static void TiaozhuanLGSetsPage(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("packageName", activity.getPackageName());
            ComponentName comp = new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity");
            intent.setComponent(comp);
            activity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            TiaozhuanAppDetailsSetsPage(activity);
        }
    }

    /**
     * 只能打开到自带安全软件
     * @param activity
     */
    public static void Tiaozhuan360SetsPage(Activity activity) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("packageName", activity.getPackageName());
        ComponentName comp = new ComponentName("com.qihoo360.mobilesafe", "com.qihoo360.mobilesafe.ui.index.AppEnterActivity");
        intent.setComponent(comp);
        activity.startActivity(intent);
    }

    /**
     * 应用信息界面
     * @param activity
     */
    public static void TiaozhuanAppSetsPage(Activity activity){
        try {
            Intent localIntent = new Intent();
            localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            if (Build.VERSION.SDK_INT >= 9) {
                localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                localIntent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            } else if (Build.VERSION.SDK_INT <= 8) {
                localIntent.setAction(Intent.ACTION_VIEW);
                localIntent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
                localIntent.putExtra("com.android.settings.ApplicationPkgName", activity.getPackageName());
            }
            activity.startActivity(localIntent);
        }catch (Exception e){
            e.printStackTrace();
            TiaozhuanAppDetailsSetsPage(activity);
        }

    }

    /**
     * 系统设置界面
     * @param activity
     */
    public static void TiaozhuanSystemSetsPage(Activity activity) {
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        activity.startActivity(intent);
    }

    /**
     * 默认打开应用详细页
     */
    private static void TiaozhuanAppDetailsSetsPage(Activity pActivity) {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", pActivity.getPackageName(), null);
        intent.setData(uri);
        try {
            pActivity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}