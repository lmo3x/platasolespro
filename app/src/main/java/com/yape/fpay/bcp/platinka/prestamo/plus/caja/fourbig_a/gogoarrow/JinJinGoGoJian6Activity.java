package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.AboutShebeiTols.shebeiId;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.XITONG_YINSI_BASIC;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuGodu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DEGNDAIYETIAOZHUANXIAYE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHUJUZHUAQUJUJUE;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJISHUJUZHUAQUTONGYI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.JICHUDINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.KAISHISHANGCHAUNSHUJU;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.LIANXIRENDINGWEI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHUJUZHUAQUJIEGUO;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.SHUJUZHUAQUSHOUQUANTONGGUOFIRST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.WANCHENGSHANGCHUANSHUJU;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ConfigDianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.FengKongQianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.PeizhiRuanjianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ShangChuanModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DingWeiSinglebangzhuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.GzipCompreTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuoquBigJsonUpShujuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.QuanxianShipeiGuanliTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup.ShebeiXinxiTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ShangpinActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei.OKwangHttpyeZhan;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.PppQxPanduaner;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow.SanfangRxppp;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class JinJinGoGoJian6Activity extends MyJichuBsActivity {

    private View mGolbeSjflT123Dingbuview;
    private LinearLayout mLayoutloading;
    private TextView mAsdfhOdfjDjgo;
    private TextView mAsdfhTYodfjDjgo;

    private CountDownTimer countDownTimer;
    private CountDownTimer countDownTimer1;

    private int errorCount = 0;
    private String fktype = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.activity_jinjingogo6);

        fktype = getIntent().getStringExtra("fktype");

        mGolbeSjflT123Dingbuview = findViewById(R.id.golbe_sjflT123_dingbuview);
        mLayoutloading = findViewById(R.id.layoutloading);
        mAsdfhOdfjDjgo = findViewById(R.id.asdfh_odfj_djgo);
        mAsdfhTYodfjDjgo = findViewById(R.id.asdfh_TYodfj_djgo);

        jianchaJson();
    }


    private void zhixingfengkongQian() {

        mAsdfhOdfjDjgo.setText("Calculando tu límite, por favor espera");
        countDownTimer1 = new CountDownTimer(16000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                int secondsRemaining = (int) (millisUntilFinished / 1000);
                mAsdfhTYodfjDjgo.setText(String.valueOf(secondsRemaining) + "S");
                if (secondsRemaining == 12) {
                    qingqiuJiekouFKqian();
                }

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(JinJinGoGoJian6Activity.this, ShangpinActivity.class);
                startActivity(intent);
                finish();
            }
        };
        countDownTimer1.start();
    }

    private void jianchaJson() {

        if (!TextUtils.isEmpty(fktype) && fktype.equals("1")) {
            zhixingfengkongQian();
        } else {
            //是否上传中
            if (ChangliangConfigTols.jsonUpload) {
                countDownTimer = new CountDownTimer(120000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                        //上传完成
                        if (ChangliangConfigTols.jsonUpload == false) {
                            if (countDownTimer != null) {
                                countDownTimer.cancel();
                            }
                            qingqiuJiekouJiancha();
                        }
                    }

                    @Override
                    public void onFinish() {
                        qingqiuJiekouJiancha();
                    }
                };

                countDownTimer.start();

            } else {
                gaogeXianchengStart();
            }
        }
    }


    private void qingqiuJiekouFKqian() {
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.CHAXUNFENGKONGJINE, FengKongQianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<FengKongQianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {

            }

            @Override
            public void onSuccess(FengKongQianModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {

                    String shallowRestRepairsLevel = response.getBigAncientTastyHeadteacher().getShallowRestRepairsLevel();
                    if ("1".equals(shallowRestRepairsLevel)) {
                        if (countDownTimer1 != null) {
                            countDownTimer1.cancel();
                        }
                        Intent intent = new Intent(JinJinGoGoJian6Activity.this, ShangpinActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }
            }

            @Override
            public void onError(String error) {


            }
        });
    }

    private Handler zhuxianCaozuo = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String chaunJiesen = "";
            if (msg.obj != null) {

                chaunJiesen = (String) msg.obj;
                chuanChuanShujuJson(chaunJiesen);
            }
        }
    };

    private void gaogeXianchengStart() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GUGESARTSPINGLUN,
                PeizhiRuanjianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<PeizhiRuanjianModel>() {
                    @Override
                    public void OnMap(Map<String, String> map) {
                        String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                        String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                        if (TextUtils.isEmpty(s1)) {
                            s1 = "0";
                        }
                        if (TextUtils.isEmpty(s2)) {
                            s2 = "0";
                        }
                        map.put("looseCivilInchCrowdedAnyone", s1 + "," + s2);//lbs
                        map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
                        map.put("asianBrotherJewelLake", "slimEagerSignal");
                    }

                    @Override
                    public void onSuccess(PeizhiRuanjianModel response) {
                        jiazaizhongWindows.hideKuangkuangIng();
                        Log.e("TAG", "response---->" + response);
                        if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                            PeizhiRuanjianModel.RoughNaturalProBean fanhuibean = response.getRoughNaturalPro();
                            String slimEagerSignal = fanhuibean.getSlimEagerSignal();
                           startJson(slimEagerSignal);
                        } else {
                            startJson("");
                        }
                    }

                    @Override
                    public void onError(String error) {
                        jiazaizhongWindows.hideKuangkuangIng();
                        startJson("");
                        Log.e("TAG", "error---->" + error);
                    }
                });

    }

    private void startJson(String slimEagerSignal){
        new Thread(new Runnable() {
            @Override
            public void run() {

                //获取json
                String chuanShuju = "";
                try {

                    chuanShuju = HuoquBigJsonUpShujuTols.getJson(JinJinGoGoJian6Activity.this, slimEagerSignal);
                } catch (Exception e) {
                    Log.d("bigjsonerror", "jsonexception");
                }

                // 以send方式发送：
                Message handXinxi = Message.obtain();
                handXinxi.obj = chuanShuju;
                // 正常发送
                zhuxianCaozuo.sendMessage(handXinxi);
            }
        }).start();
    }

    private void chuanChuanShujuJson(String jsonData) {
        String jiamimi = "";
        try {
            jiamimi = GzipCompreTols.compress(jsonData);
            Log.e("encrypt", jiamimi);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //开始上传大数据
        ChangliangConfigTols.jsonUpload = true;
        YincangShijianClickTols.QingqiuMaidian(KAISHISHANGCHAUNSHUJU);
        RequestQueue qingqiuduilie = Volley.newRequestQueue(getApplicationContext(), new OKwangHttpyeZhan());
        JsonRequest<JSONObject> jiesenQingqiu = new JsonObjectRequest(Request.Method.POST
                , ChangliangConfigTols.SHANGCHUANDAJSON5, jiamimi,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("TAG", "response -> " + response.toString());
                        try {
                            Gson gson = new Gson();
                            final ConfigDianModel configDianModel = gson.fromJson(String.valueOf(response), ConfigDianModel.class);
                            if (configDianModel.getaverageEmbassyNationalVictoryDepth() == 1000) {
                                ChangliangConfigTols.jsonUpload = false;
                                ChangliangConfigTols.jsonUploadStatus = true;

                                //上传成功再次检测
                                qingqiuJiekouJiancha();

                            } else {
                                ChangliangConfigTols.jsonUpload = false;
                                ChangliangConfigTols.jsonUploadStatus = false;
//                                if (errorCount == 0) {
//                                    errorCount++;
//                                    gaogeXianchengStart();
//                                } else {
                                    Intent intent = new Intent(JinJinGoGoJian6Activity.this,JinJinGoGoJianFActivity.class);
                                    startActivity(intent);
                                    finish();
//                                }
                            }
                        } catch (Exception e) {
                            ChangliangConfigTols.jsonUpload = false;
                            ChangliangConfigTols.jsonUploadStatus = false;
//                            if (errorCount == 0) {
//                                errorCount++;
//                                gaogeXianchengStart();
//                            } else {
                                Intent intent = new Intent(JinJinGoGoJian6Activity.this,JinJinGoGoJianFActivity.class);
                                startActivity(intent);
                                finish();
//                            }
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                ChangliangConfigTols.jsonUpload = false;
                ChangliangConfigTols.jsonUploadStatus = false;
//                if (errorCount == 0) {
//                    errorCount++;
//                    gaogeXianchengStart();
//                } else {
                    Intent intent = new Intent(JinJinGoGoJian6Activity.this,JinJinGoGoJianFActivity.class);
                    startActivity(intent);
                    finish();
//                }
            }
        }) {
            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Accept", "application/json");
                headers.put("Content-Type", "application/json; charset=UTF-8");
                headers.put("coldUnemploymentPrizeCanadianHim", "1");
//                headers.put("agriculturalArithmeticGeneralPine", YincangShijianClickTols.appshasahId);//appssid
                headers.put("pleasantSeaweedMobileHousewife", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_TOKEN));//token
//                headers.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.applitionChiyouzhe, BendiHuancunTols.YONGHU_ID));//userid
                headers.put("mostCongratulationPeacefulBreakfast", "googleplay");
                headers.put("endlessSnowClearAirYoungMeaning", YincangShijianClickTols.banbenming);
                headers.put("leftAfternoonFlamingProtection", YincangShijianClickTols.banbenma + "");
                headers.put("averageExpedition", shebeiId);
                headers.put("femaleToothacheArabPerfectCloud", "1");
                headers.put("quickBeerMentalSuchBank", ShebeiXinxiTols.naShebeiBianhao(MyJichuAplica.getInstance()));

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

                headers.put("agriculturalArithmeticGeneralPine", appSsid);//appssid
                headers.put("hopelessLearnedConvenience", userID);//currentUserId

                return headers;

            }

        };
        jiesenQingqiu.setRetryPolicy(new DefaultRetryPolicy(60000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        qingqiuduilie.add(jiesenQingqiu);
    }

    private void qingqiuJiekouJiancha() {
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SHIFOUSHANGCHUANJSON, ShangChuanModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ShangChuanModel>() {
            @Override
            public void OnMap(Map<String, String> map) {

            }

            @Override
            public void onSuccess(ShangChuanModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getAverageEmbassyNationalVictoryDepth() == 1000) {

                    String coldNervousKeeperLake = response.getBigAncientTastyHeadteacher().getColdNervousKeeperLake();
                    if ("0".equals(coldNervousKeeperLake)) {
                        //需要上传
                        gaogeXianchengStart();
                    } else {
                        //不需要上传,查询风控额度
                        zhixingfengkongQian();
                    }

                } else {
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (countDownTimer1 != null) {
            countDownTimer1.cancel();
        }
    }

    @Override
    public void onBackPressed() {

    }
}