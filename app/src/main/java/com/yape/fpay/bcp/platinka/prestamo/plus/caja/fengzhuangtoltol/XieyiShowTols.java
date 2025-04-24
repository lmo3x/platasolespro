package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.DadianhuaGeiWomenActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.WangyeHelperActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols.appshasahId;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ZHUAJI;

public class XieyiShowTols {

    public static String YINSI_DIZHI = "https://peru.prestamomio.com/tuprestamoyas/privacy.html";
    public static String FUWU_DIZHI = "https://peru.prestamomio.com/tuprestamoyas/term.html";
    public static String INDEX_MORENDIZHI = "https://peru.prestamomi.com/tuprestamoyas/peindex.html";//投诉书
    public static String HUANKUANTOUSU = "https://peru.prestamomio.com/peruComplaint/#/?orderType=1";//投诉
    public static String JUHEH5 = "https://peru.prestamomio.com/Labours/index.html?appSsid=312";//投诉
    public static String TABLEKEFU1 = "https://peru.prestamomio.com/customer/index.html?frontSource=";//聚合表单客服 来源
    public static String TABLEKEFU2 = "&appSsid=";//聚合表单客服盘好
    public static String TABLEKEFU3 = "&userId=";//聚合表单客服用户id
    public static String TABLEKEFU4 = "&mobile=";//聚合表单客服用户手机号

    private static XieyiShowTols xieyiShowTols;

    private XieyiShowTols() {
    }

    public static XieyiShowTols getInstance() {
        if (xieyiShowTols == null) {
            xieyiShowTols = new XieyiShowTols();
        }
        return xieyiShowTols;
    }

    /**
     * 跳转隐私页面 h5
     *
     * @param actvv 上下文对象
     */
    public static void quH5YinsiPage(Activity actvv) {
        Intent webtEND = new Intent(actvv, WangyeHelperActivity.class);
        webtEND.putExtra("webViewUrl", YINSI_DIZHI);
        actvv.startActivity(webtEND);
    }
    /**
     * 跳转客服页面
     *
     * @param actvv 上下文对象
     */
    public static void quH5KefuPage(Activity actvv,String typeresource) {
//        String shouji = BendiHuancunTols.huoQuZifuchuan(actvv, YONGHU_ZHUAJI);
//        if (TextUtils.isEmpty(shouji)){
//            Intent chuanshu = new Intent(actvv, DadianhuaGeiWomenActivity.class);
//            actvv.startActivity(chuanshu);
//        }else {
//            quYuanshengKefuPage(actvv,shouji);
//        }

//        Intent webtEND = new Intent(actvv, WangyeHelperActivity.class);
//        webtEND.putExtra("webViewUrl", JUHEH5);
//        webtEND.putExtra("showtype", "3");
//        actvv.startActivity(webtEND);

//        ToastUtil.showShortToast(typeresource);
        String userid = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID);
        String shouji = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, YONGHU_ZHUAJI);
        //表单客服
        String biaodanurl = TABLEKEFU1+typeresource+TABLEKEFU2+appshasahId+TABLEKEFU3+userid+TABLEKEFU4+shouji;
        Intent webtEND = new Intent(actvv, WangyeHelperActivity.class);
        webtEND.putExtra("webViewUrl", biaodanurl);
        webtEND.putExtra("showtype", "3");
        actvv.startActivity(webtEND);
    }

    /**
     * 跳转隐私页面
     *
     * @param activity 上下文对象
     * @param url 上下文对象
     */
    public static void quH5YinsiPage(Activity activity, String url) {
        Intent mainIntent = new Intent(activity, WangyeHelperActivity.class);
        mainIntent.putExtra("webViewUrl", url);
        activity.startActivity(mainIntent);
    }

    /**
     * 跳转投诉页面
     *
     * @param activity 上下文对象
     * @param url 上下文对象
     * @param type 0隐私协议 2服务条款 1投诉书
     */
    public static void quH5YinsiPage(Activity activity, String url,String type) {
        Intent mainIntent = new Intent(activity, WangyeHelperActivity.class);
        mainIntent.putExtra("webViewUrl", url);
        mainIntent.putExtra("showtype", type);
        activity.startActivity(mainIntent);
    }

    /**
     * 跳转设置页面
     *
     * @param actv 上下文对象
     */
    public static void quSheZhiPage(Activity actv) {
        Intent intent =  new Intent(Settings.ACTION_SETTINGS);
        actv.startActivity(intent);
    }
    /**
     * 跳转客服页面
     *
     * @param actvv 上下文对象
     */
    public static void quYuanshengKefuPage(Activity actvv, String zhuaji) {
//        //为了避免登录时绑定不上，打开聊天前再次进⾏绑定
//        Crisp.setTokenID(zhuaji);//登录⼿机号
//        Crisp.setUserPhone(zhuaji);//登录⼿机号
//        //判断是否为测试账号
//        if (thisisSpecPhone) {
//            Crisp.setSessionSegment("test");
//        } else {
//            Crisp.setSessionSegment(actvv.getString(R.string.ruanjianapp_mingzi));
//        }
//        Intent crispIntent = new Intent(actvv, ChatActivity.class);
//        actvv.startActivity(crispIntent);
    }

}
