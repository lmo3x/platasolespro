package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.widget.ImageView;
import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;
import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.WuxianwangTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.GaogeZhanghaoIntoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei.OKwangHttpyeZhan;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.TOUSUH5TOEKN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ID;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ISTEST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_TOKEN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ZHUAJI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity.ZHUYEMIAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica.getInstance;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols.shebeiId;

public class WangluoQingqiuVolyeyeTols {
    public static RequestQueue wodeQingqiuYibu;
    private ImageLoader tuPianXiazaiqi;
    private ImageLoader.ImageCache tupianHuancun;
    private static WangluoQingqiuVolyeyeTols qingqiuDanli;
    private Context context;

    /**
     * 1.构造方法私有化
     *
     * @param chiyouzhe
     */
    private WangluoQingqiuVolyeyeTols(Context chiyouzhe) {
        this.context = chiyouzhe;
        //做一些事情
        wodeQingqiuYibu = Volley.newRequestQueue(chiyouzhe, new OKwangHttpyeZhan());
//        mQueue = Volley.newRequestQueue(context);
        tupianHuancun = new MyImageCache();
        tuPianXiazaiqi = new ImageLoader(wodeQingqiuYibu, tupianHuancun);
    }

    //get queue
    public RequestQueue huoquYIbuduilie() {
        return wodeQingqiuYibu;
    }

    //get loader
    public ImageLoader huoquxiazaiqi() {
        return tuPianXiazaiqi;
    }


    /**
     * 2.提供一个静态方法，返回一个当前类
     *
     * @param context
     * @return
     */
    public static WangluoQingqiuVolyeyeTols chuangjianInit(Context context) {
        if (qingqiuDanli == null) {
            synchronized (WangluoQingqiuVolyeyeTols.class) {
                if (qingqiuDanli == null) {
                    qingqiuDanli = new WangluoQingqiuVolyeyeTols(context);
                }
            }
        }
        return qingqiuDanli;
    }


    public <T> void get(String dizhi, final Class<T> leizzz, final OnResponse<T> jianting) {


        HashMap<String, String> haxiDitu = new HashMap<>();
        jianting.OnMap(haxiDitu);
        String canshu = prepareParam(haxiDitu);
        if (canshu.trim().length() >= 1) {
            dizhi += "?" + canshu;
        }
        String dddd = dizhi;
        Log.e("Volley", "urlResult---->" + dizhi);
        StringRequest qingqiuStr = new StringRequest(StringRequest.Method.GET, dizhi, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("Volley", "request-->" + dddd);
                Log.e("Volley", "response-->" + response);

                Gson gson = new Gson();
                jianting.onSuccess(gson.fromJson(response, leizzz));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", "response-->" + error.getMessage());
                jianting.onError(error.getMessage());
            }
        });
        qingqiuStr.setRetryPolicy(new DefaultRetryPolicy(60000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        wodeQingqiuYibu.add(qingqiuStr);
    }


    private static String prepareParam(Map<String, String> paramMap) {
        StringBuilder sb = new StringBuilder();
        if (paramMap.isEmpty()) {
            return "";
        } else {
            for (String key : paramMap.keySet()) {
                String value = paramMap.get(key);
                if (sb.length() < 1) {
                    sb.append(key).append("=").append(value);
                } else {
                    sb.append("&").append(key).append("=").append(value);
                }
            }
            return sb.toString();
        }
    }


    public <T> void post(String url, final Class<T> clazz, final OnResponse<T> listener) {

        post(url, clazz, listener, "x-www-form-urlencoded");
    }

    public <T> void post(String url, final Class<T> clazz, final OnResponse<T> listener, String bodyContentType) {
        StringRequest stringRequest = new StringRequest(StringRequest.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {

                } catch (Exception e) {

                }


                Log.e("Volley", "http-->" + url);
                Log.e("Volley", "response-->" + response);
                Log.d("Wuwangluo", "response-->" + response);
//                {"nuclearTrialSpareMountainousBat":"system exception","averageEmbassyNationalVictoryDepth":-1000}
                JSONObject object = JSONObject.parseObject(response);
                String code = object.get("averageEmbassyNationalVictoryDepth").toString();

                if ("-1001".equals(code)) {
                    Log.d("Wuwangluo-1001", "response-->" + response);

//                    Toast.makeText(context, context.getString(R.string.guoqiguoqi), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(context.getString(R.string.guoqiguoqi));

                    Intent broadcastIntent = new Intent(ZHUYEMIAN);
                    context.sendBroadcast(broadcastIntent);
                    Intent intent = new Intent(context, GaogeZhanghaoIntoActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);

                    BendiHuancunTols.qingChuZifuchuan(context, YONGHU_ID);
                    BendiHuancunTols.qingChuZifuchuan(context, YONGHU_TOKEN);
                    BendiHuancunTols.qingChuZifuchuan(context, YONGHU_ZHUAJI);
                    BendiHuancunTols.qingChuZifuchuan(context,TOUSUH5TOEKN);
                    BendiHuancunTols.qingChuZifuchuan(context, YONGHU_ISTEST);
                    ImpZhuyaoActivity.shiFouFukuan = false;
                    ImpZhuyaoActivity.shiFouFukuan_Exten = false;
                    ImpZhuyaoActivity.shiFou_rest_Menu = "1";
                    return;
                }

                try {
                    Gson gson = new Gson();
                    listener.onSuccess(gson.fromJson(response, clazz));
                } catch (Exception e) {
                    Log.e("Volley", "response-->" + e.toString());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", "response-->" + error.getMessage());
                try {
                    if (error instanceof NetworkError
                            && !ChangliangConfigTols.CLICKEVENT.equals(url)
                            && !ChangliangConfigTols.HOMEPAGE_FOR_UNLOGIN.equals(url)
                            && !ChangliangConfigTols.HENGFUTUPIAN.equals(url)
                    ) {
//                        Toast.makeText(getInstance(), getInstance().getString(R.string.tusitishi_dizih_00), Toast.LENGTH_SHORT).show();
//                        ToastUtil.showShortToast(getInstance().getString(R.string.tusitishi_dizih_00));
                    }
                    listener.onError(error.getMessage());
                } catch (Exception e) {
                    listener.onError("");
                }
            }
        }) {
            /**
             * Post请求和Get请求的使用步骤上的区别在于请求条件的指定
             * 必须在StringRequest对象的后面添加{}，并且
             * 在{}内重写getParams方法，该方法的返回值就是所有的请求条件
             * */
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                //将请求条件封装到map对象中
                Map<String, String> map = new HashMap<>();
                map.put("highBaggageDailyParking", shebeiId);//deviceId
                map.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));//imei
                map.put("endlessSnowClearAirYoungMeaning", YincangShijianClickTols.banbenming);//versionName
                map.put("leftAfternoonFlamingProtection", YincangShijianClickTols.banbenma + "");//versionCode
                map.put("mostCongratulationPeacefulBreakfast", "googleplay");//channel
                map.put("valuableNoiseConstructionCanteen", Build.VERSION.RELEASE);//os_version
                map.put("communistActorBeardThought", ShebeiXinxiTols.dangqianXitongYuan().getLanguage());//mobile_language
                map.put("coldSquidThoroughSoldier", "es");//language

                map.put("energeticBoatAttractiveFurnishedDollar", Build.MODEL);//DeviceMode
                map.put("folkMicrocomputerTastelessPlate", BendiHuancunTols.huoQuZifuchuan(context, YONGHU_ZHUAJI));//MobileNo
                map.put("frequentRealHealthyCoach", YincangShijianClickTols.yichuanId);//googleGaid
                try {
                    map.put("europeanBlackAttention", System.getProperty("http.agent"));//googleUserAgent
                    map.put("unpleasantPrayerCamel", System.getProperty("http.agent"));//UserAgent
                }catch (Exception e){
                    map.put("europeanBlackAttention", "");//googleUserAgent
                    map.put("unpleasantPrayerCamel", "");//UserAgent
                }

                map.put("harmlessIndeedRevolutionLiveJeans", WuxianwangTols.huoquwangluoipdizhi(context)); //ip

                //主产品ssid 和userid
                String appSsid = YincangShijianClickTols.appshasahId;
                String userID = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID);

                //如果点击了子产品 获取子产品ssid和 uerid 并赋值
                String copyUserInfo = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.COPY_USER_INFO);
                if (!TextUtils.isEmpty(copyUserInfo) && copyUserInfo.contains(",")) {
                    String[] split = copyUserInfo.split(",");
                    if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                        userID = split[0];
                        appSsid = split[1];
                    }
                }






                //最终给body里面的 参数定值
                map.put("firmHappyAtlanticAustralia", appSsid);
                map.put("agriculturalArithmeticGeneralPine", appSsid);
                map.put("singleComfortClerkSwissMachine", userID);
                map.put("distantBoxingBeerUnmarriedShade", appSsid);//custinfoid 新风控打点用
                map.put("antarcticPaleBeamUnfitZone", userID);//custinfoid 新风控打点用

                //如果外部有appssid或者userid 覆盖上面的
                // 最终的赋值优先级就是 先获取本地 再获取copyuserinfo  在获取currentuser参数，再获取onmap
                listener.OnMap(map);


                //已有ssid和userid的情况 不用调用copyuserinfo 直接跳转的时候转这个值
                //这时候因为上面已经定值了 所以需要移除之后重新赋值
                if (map.containsKey("currentssidcanshu")) {
                    appSsid = map.get("currentssidcanshu");
                    map.remove("currentssidcanshu");

                    map.remove("firmHappyAtlanticAustralia");
                    map.remove("agriculturalArithmeticGeneralPine");
                    map.remove("distantBoxingBeerUnmarriedShade");//custinfoid 新风控打点用

                    map.put("firmHappyAtlanticAustralia", appSsid);
                    map.put("agriculturalArithmeticGeneralPine", appSsid);
                    map.put("distantBoxingBeerUnmarriedShade", appSsid);//custinfoid 新风控打点用
                }
                if (map.containsKey("currentuseridcanshu")) {
                    userID = map.get("currentuseridcanshu");
                    map.remove("currentuseridcanshu");

                    map.remove("singleComfortClerkSwissMachine");
                    map.remove("antarcticPaleBeamUnfitZone");//custinfoid 新风控打点用

                    map.put("singleComfortClerkSwissMachine", userID);
                    map.put("antarcticPaleBeamUnfitZone", userID);
                }

                return map;
            }

            /**
             * 重写请求头获取方法
             */
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {

                String appSsid = YincangShijianClickTols.appshasahId;
                String userID = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID);
                String copyUserInfo = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.COPY_USER_INFO);
                Map<String, String> params1 = this.getParams();
                if (!params1.isEmpty()) {
                    //如果是cocy接口，那header里面的appssid等就要用主盘的 如果不是 那就用子盘
                    if (!url.contains("attractiveAddition/snakeCleverKey")) {
                        if (!TextUtils.isEmpty(copyUserInfo) && copyUserInfo.contains(",")) {
                            String[] split = copyUserInfo.split(",");
                            if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                                userID = split[0];
                                appSsid = split[1];
                            }
                        }


                        if (params1.containsKey("singleComfortClerkSwissMachine")) {
                            userID = params1.get("singleComfortClerkSwissMachine");
                        }
                        if (params1.containsKey("firmHappyAtlanticAustralia")) {
                            appSsid = params1.get("firmHappyAtlanticAustralia");//appssid
                        }
                    }
                }


                if (params1.containsKey("currentssidcanshu")) {
                    appSsid = params1.get("currentssidcanshu");
                    params1.remove("currentssidcanshu");
                }
                if (params1.containsKey("currentuseridcanshu")) {
                    userID = params1.get("currentuseridcanshu");
                    params1.remove("currentuseridcanshu");
                }

                Map<String, String> params = new HashMap<>();
                params.put("firmHappyAtlanticAustralia", appSsid);//appssid
                params.put("agriculturalArithmeticGeneralPine", appSsid);//client-id
                params.put("crossAngryExactPrisoner", appSsid);//client-id
                params.put("singleComfortClerkSwissMachine", userID);//userid
                params.put("hopelessLearnedConvenience", userID);//currentUserId
                params.put("pleasantSeaweedMobileHousewife", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_TOKEN));//token
                params.put("mostCongratulationPeacefulBreakfast", "googleplay");
                params.put("endlessSnowClearAirYoungMeaning", YincangShijianClickTols.banbenming);
                params.put("leftAfternoonFlamingProtection", YincangShijianClickTols.banbenma + "");//versionCode
                params.put("averageExpedition", shebeiId);
                params.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));
                params.put("coldUnemploymentPrizeCanadianHim", "1");
                Log.e("Volley", "httpsqingqiu-->" + url + "-->headmap-->" + params.toString() + "-->bodymap-->" + getParams().toString());
                return params;
            }

            @Override
            public String getBodyContentType() {
                return "application/" + bodyContentType + "; charset=" + getParamsEncoding();
            }
        };
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(60000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
//        if(!url.equals("daidan")){
        stringRequest.setTag("1");
//        }

        wodeQingqiuYibu.add(stringRequest);
    }


    public void loadImg(String url, ImageView view, int maxWidth, int maxHeight, int defaultImageResId, int errorImageResId) {
        tuPianXiazaiqi.get(url, //图片的下载路径
                /**
                 * 通过getImageListener方法获取ImageListener接口对象
                 * 参数1： 图片下载完成后，由哪个控件显示图片
                 * 参数2： 设置图片下载过程中显示的默认图片
                 * 参数3： 设置一旦图片下载出错，就显示出错提示图片
                 * */
                ImageLoader.getImageListener(view, defaultImageResId, errorImageResId),
                maxWidth, maxHeight, //图片的最大宽高 指定成0的话就表示不管图片有多大
                ImageView.ScaleType.FIT_XY //图片的缩放模式
        );
    }

    public void loadImg(String url, ImageView view) {
        tuPianXiazaiqi.get(url, //图片的下载路径
                ImageLoader.getImageListener(view, R.mipmap.useimg_desklogo, R.mipmap.useimg_desklogo),
                0, 0, //图片的最大宽高 指定成0的话就表示不管图片有多大
                ImageView.ScaleType.FIT_XY //图片的缩放模式
        );
    }

    public void loadImg(String url, ImageView view, int defaultImageResId, int errorImageResId) {
        tuPianXiazaiqi.get(url, //图片的下载路径
                ImageLoader.getImageListener(view, defaultImageResId, errorImageResId),
                0, 0, //图片的最大宽高 指定成0的话就表示不管图片有多大
                ImageView.ScaleType.FIT_XY //图片的缩放模式
        );
    }

    /**
     * 分配一定内存空间，专门存取图片，一般为内存大小的1/8
     */
    private class MyImageCache implements ImageLoader.ImageCache {

        private LruCache<String, Bitmap> mCache;

        private MyImageCache() {
            //分配最大内存空间的1/8
            long maxMemory = Runtime.getRuntime().maxMemory() / 8;
            mCache = new LruCache<String, Bitmap>((int) maxMemory) {
                @Override
                protected int sizeOf(String key, Bitmap value) {
                    //得到当前图片的大小
                    return value.getByteCount();
                }
            };
        }

        @Override
        public Bitmap getBitmap(String url) {
            return mCache.get(url);
        }

        @Override
        public void putBitmap(String url, Bitmap bitmap) {
            if (getBitmap(url) == null)
                mCache.put(url, bitmap);
        }
    }

    /**
     * 自定义的类型
     *
     * @param <T>
     */
    public class GsonRequest<T> extends Request<T> {
        private Response.Listener<T> mListener;
        private Gson mGson;
        private Class<T> mClazz;

        private GsonRequest(int method, String url, Response.Listener<T> listener, Response.ErrorListener errorListenerlistener, Class<T> clazz) {
            super(method, url, errorListenerlistener);
            this.mListener = listener;
            mGson = new Gson();
            this.mClazz = clazz;
        }

        @Override
        protected Response<T> parseNetworkResponse(NetworkResponse response) {
            String parsed;
            try {
                parsed = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
                Log.e("Volley", "服务器返回JSON------>" + parsed);
                return Response.success(mGson.fromJson(parsed, mClazz), HttpHeaderParser.parseCacheHeaders(response));
            } catch (UnsupportedEncodingException e) {
                return Response.error(new VolleyError(e));
            }
        }

        @Override
        protected void deliverResponse(T response) {
            if (mListener != null) {
                mListener.onResponse(response);
            }
        }
    }

    public interface OnResponse<T> {

        void OnMap(Map<String, String> map);

        void onSuccess(T response);

        void onError(String error);
    }
}