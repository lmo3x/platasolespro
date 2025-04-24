package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto;

import android.text.TextUtils;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols.shebeiId;

/**
 * update by han on 2023.5.8.
 */
public class ShangchuanQingqiu extends Request<String> {

    /**
     * 正确数据的时候回掉用
     */
    private QingqiuFanhuiJianting jianting;
    /*请求 数据通过参数的形式传入*/
    private List<TupianZhiliang> tupianZhiliangList;
    private String dizhi;

    public static String FENGEXIAN = "--------------520-13-14"; //数据分隔线
    public static String SHUJUMULI = "multipart/form-data";
    private Map<String, String> shujuDitu = new HashMap<String, String>() {
    };

    public ShangchuanQingqiu(String dizhi, Map<String, String> shujuDitu, List<TupianZhiliang> tupianZhiliangList, QingqiuFanhuiJianting jainting) {
        super(Method.POST, dizhi, jainting);
        this.jianting = jainting;
        this.shujuDitu = shujuDitu;
        setShouldCache(false);
        this.tupianZhiliangList = tupianZhiliangList;
        //设置请求的响应事件，因为文件上传需要较长的时间，所以在这里加大了，设为5秒
        setRetryPolicy(new DefaultRetryPolicy(60000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
    }

    /**
     * 这里开始解析数据
     *
     * @param jieguo Response from the network
     * @return
     */
    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse jieguo) {
        try {
            String mString =
                    new String(jieguo.data, HttpHeaderParser.parseCharset(jieguo.headers));
            Log.v("zgy", "====mString===" + mString);

            return Response.success(mString,
                    HttpHeaderParser.parseCacheHeaders(jieguo));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        }
    }

    /**
     * 回调正确的数据
     *
     * @param response The parsed response returned by
     */
    @Override
    protected void deliverResponse(String response) {
        jianting.onResponse(response);
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        if (tupianZhiliangList == null || tupianZhiliangList.size() == 0) {
            return super.getBody();
        }
        ByteArrayOutputStream zijieShuchuLiu = new ByteArrayOutputStream();


        for (Map.Entry<String, String> entry : shujuDitu.entrySet()) {
            try {
                StringBuffer zifuchuanPinjie = new StringBuffer();
                zifuchuanPinjie.append("--" + FENGEXIAN);
                zifuchuanPinjie.append("\r\n");
                /*第二行*/
                //Content-Disposition: form-data; name="参数的名称"; filename="上传的文件名" + "\r\n"
                zifuchuanPinjie.append("Content-Disposition: form-data;");
                zifuchuanPinjie.append(" name=\"");
                zifuchuanPinjie.append(entry.getKey());
                zifuchuanPinjie.append("\"");
                /*第二行*/
                zifuchuanPinjie.append("\r\n");
                zifuchuanPinjie.append("\r\n");
                zifuchuanPinjie.append(entry.getValue());
                zifuchuanPinjie.append("\r\n");

                zijieShuchuLiu.write(zifuchuanPinjie.toString().getBytes("utf-8"));
            } catch (Exception o) {
            }
        }


        int N = tupianZhiliangList.size();
        TupianZhiliang tupianZhiliang;
        for (int i = 0; i < N; i++) {
            tupianZhiliang = tupianZhiliangList.get(i);
            StringBuffer pinJieStr = new StringBuffer();
            /*第一行*/
            //`"--" + BOUNDARY + "\r\n"`
            pinJieStr.append("--" + FENGEXIAN);
            pinJieStr.append("\r\n");
            /*第二行*/
            //Content-Disposition: form-data; name="参数的名称"; filename="上传的文件名" + "\r\n"
            pinJieStr.append("Content-Disposition: form-data;");
            pinJieStr.append(" name=\"");
            pinJieStr.append(tupianZhiliang.getName());
            pinJieStr.append("\"");
            pinJieStr.append("; filename=\"");
            pinJieStr.append(tupianZhiliang.getFileName());
            pinJieStr.append("\"");
            pinJieStr.append("\r\n");
            /*第三行*/
            //Content-Type: 文件的 mime 类型 + "\r\n"
            pinJieStr.append("Content-Type: ");
            pinJieStr.append(tupianZhiliang.getMime());
            pinJieStr.append("\r\n");
            /*第四行*/
            //"\r\n"
            pinJieStr.append("\r\n");
            try {
                zijieShuchuLiu.write(pinJieStr.toString().getBytes("utf-8"));
                /*第五行*/
                //文件的二进制数据 + "\r\n"
                zijieShuchuLiu.write(tupianZhiliang.getValue());
                zijieShuchuLiu.write("\r\n".getBytes("utf-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        /*结尾行*/
        //`"--" + BOUNDARY + "--" + "\r\n"`
        try {
            String jieshuXian = "--" + FENGEXIAN + "--" + "\r\n";
            zijieShuchuLiu.write(jieshuXian.toString().getBytes("utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.v("zgy", "=====formImage====\n" + zijieShuchuLiu.toString());
        return zijieShuchuLiu.toByteArray();
    }

    //Content-Type: multipart/form-data; boundary=----------8888888888888
    @Override
    public String getBodyContentType() {
        return SHUJUMULI + "; boundary=" + FENGEXIAN;
    }

    @Override
    public Map<String, String> getPostParams() throws AuthFailureError {
        //将请求条件封装到map对象中
        Map<String, String> map = new HashMap<>();
        map.put("highBaggageDailyParking", shebeiId);//deviceId
        map.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));//imei
        map.put("endlessSnowClearAirYoungMeaning", YincangShijianClickTols.banbenming);//versionName
        map.put("leftAfternoonFlamingProtection", YincangShijianClickTols.banbenma + "");//versionCode
        map.put("mostCongratulationPeacefulBreakfast", "googleplay");//channel
//        listener.OnMap(map);

        String appSsid = YincangShijianClickTols.appshasahId;
        String userID = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID);
        String copyUserInfo = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.COPY_USER_INFO);
        if (!TextUtils.isEmpty(copyUserInfo) && copyUserInfo.contains(",")) {
            String[] split = copyUserInfo.split(",");
            if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                userID = split[0];
                appSsid = split[1];
            }
        }


        if (map.containsKey("currentssidcanshu")) {
            appSsid = map.get("currentssidcanshu");
            map.remove("currentssidcanshu");
        }
        if (map.containsKey("currentuseridcanshu")) {
            userID = map.get("currentuseridcanshu");
            map.remove("currentuseridcanshu");
        }

        map.put("firmHappyAtlanticAustralia", appSsid);
        map.put("agriculturalArithmeticGeneralPine", appSsid);
        map.put("singleComfortClerkSwissMachine", userID);

        Log.e("Volley", "httpsqingqiuimage-->"+dizhi +"-->bodymap-->" +  map.toString());
        return map;
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> canshu = new HashMap<>();

        String appSsid = YincangShijianClickTols.appshasahId;
        String userID = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID);
        String copyUserInfo = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.COPY_USER_INFO);
        if (!TextUtils.isEmpty(copyUserInfo) && copyUserInfo.contains(",")) {
            String[] split = copyUserInfo.split(",");
            if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                userID = split[0];
                appSsid = split[1];
            }
        }

        canshu.put("firmHappyAtlanticAustralia", appSsid);//appssid
        canshu.put("agriculturalArithmeticGeneralPine", appSsid);//client-id
        canshu.put("crossAngryExactPrisoner", appSsid);//client-id
        canshu.put("pleasantSeaweedMobileHousewife", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_TOKEN));//token
        canshu.put("singleComfortClerkSwissMachine", userID);//userid
        canshu.put("hopelessLearnedConvenience", userID);//currentUserId
        canshu.put("mostCongratulationPeacefulBreakfast", "googleplay");
        canshu.put("endlessSnowClearAirYoungMeaning", YincangShijianClickTols.banbenming);
        canshu.put("leftAfternoonFlamingProtection", YincangShijianClickTols.banbenma + "");//versionCode
        canshu.put("averageExpedition", shebeiId);
        canshu.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));
        canshu.put("coldUnemploymentPrizeCanadianHim", "1");
        Log.e("Volley", "httpsqingqiuimage-->"+dizhi +"-->headmap-->" +  canshu.toString());
        return canshu;
    }
}