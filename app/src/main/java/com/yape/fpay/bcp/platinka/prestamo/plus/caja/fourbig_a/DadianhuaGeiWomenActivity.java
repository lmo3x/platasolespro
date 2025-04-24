package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_TOKEN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica.getInstance;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ZhaowomenFuwuModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;

import java.util.Map;

public class DadianhuaGeiWomenActivity extends MyJichuBsActivity implements View.OnClickListener {

    private ImageView sjljf_Uudiog_djgodg;
    private LinearLayout dadianhua_dianhua_buju, dadianhua_wahts_buju, dadianhua_youxiang_buju;
    private LinearLayout dadianhua_dianhua_wenan, dadianhua_whats_wenan, dadianhua_youxiang_wenan;
    private TextView callusdesp;

    private LinearLayout telwhats_row2;
    private LinearLayout telwhats_row3;
    private LinearLayout telwhats_row4;
    private LinearLayout telwhats_row5;
    private LinearLayout telwhats_ll;
    private LinearLayout tousu_ll;
    private TextView telwhatstousu_txt1;
    private TextView telwhatstousu_dianhuanum;
    private TextView telwhatstousu_wangzhiurl;

    private RelativeLayout putongdianhuarl;
    private RelativeLayout putongwhatsrl;
    private RelativeLayout putongyouxiangrl;

    private ImageView telwhats_row4_jiantou;
    private ImageView telwhats_row5_jiantou;

    private LinearLayout zhaowomen_tousudianhuall;
    private LinearLayout zhaowomen_tousuwall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_tel_whatsapp_emial);

        qingqiuJiekou();


        //动态设置状态栏高度
        RelativeLayout.LayoutParams bujuGUnli = (RelativeLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        bujuGUnli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(bujuGUnli);

        sjljf_Uudiog_djgodg = findViewById(R.id.sjljf_Uudiog_djgodg);
        dadianhua_dianhua_buju = findViewById(R.id.dadianhua_dianhua_buju);
        dadianhua_wahts_buju = findViewById(R.id.dadianhua_wahts_buju);
        dadianhua_youxiang_buju = findViewById(R.id.dadianhua_youxiang_buju);

        dadianhua_dianhua_wenan = findViewById(R.id.dadianhua_dianhua_wenan);
        dadianhua_whats_wenan = findViewById(R.id.dadianhua_whats_wenan);
        dadianhua_youxiang_wenan = findViewById(R.id.dadianhua_youxiang_wenan);
        callusdesp = findViewById(R.id.callusdesp);

        telwhats_row2 = findViewById(R.id.telwhats_row2);
        telwhats_row3 = findViewById(R.id.telwhats_row3);
        telwhats_row4 = findViewById(R.id.telwhats_row4);
        telwhats_row5 = findViewById(R.id.telwhats_row5);
        telwhats_ll = findViewById(R.id.telwhats_ll);
        tousu_ll = findViewById(R.id.tousu_ll);

        telwhatstousu_txt1 = findViewById(R.id.telwhatstousu_txt1);
        telwhatstousu_dianhuanum = findViewById(R.id.telwhatstousu_dianhuanum);
        telwhatstousu_wangzhiurl = findViewById(R.id.telwhatstousu_wangzhiurl);

        putongdianhuarl = findViewById(R.id.putongdianhuarl);
        putongwhatsrl = findViewById(R.id.putongwhatsrl);
        putongyouxiangrl = findViewById(R.id.putongyouxiangrl);

        telwhats_row4_jiantou = findViewById(R.id.telwhats_row4_jiantou);
        telwhats_row5_jiantou = findViewById(R.id.telwhats_row5_jiantou);

        zhaowomen_tousudianhuall = findViewById(R.id.zhaowomen_tousudianhuall);
        zhaowomen_tousuwall = findViewById(R.id.zhaowomen_tousuwall);

//        DianjiQuickTols.kuaiLeMa(dadianhua_dianhua_buju, this);
//        DianjiQuickTols.kuaiLeMa(dadianhua_wahts_buju, this);
//        DianjiQuickTols.kuaiLeMa(dadianhua_youxiang_buju, this);
//        DianjiQuickTols.kuaiLeMa(sjljf_Uudiog_djgodg, this);
//        DianjiQuickTols.kuaiLeMa(telwhats_row2, this);
//        DianjiQuickTols.kuaiLeMa(telwhats_row3, this);
//        DianjiQuickTols.kuaiLeMa(telwhats_row4, this);
//        DianjiQuickTols.kuaiLeMa(telwhats_row5, this);
//        DianjiQuickTols.kuaiLeMa(telwhats_ll, this);
//        DianjiQuickTols.kuaiLeMa(telwhatstousu_dianhuanum, this);
//        DianjiQuickTols.kuaiLeMa(telwhatstousu_wangzhiurl, this);

        dadianhua_dianhua_buju.setOnClickListener(this);
        dadianhua_wahts_buju.setOnClickListener(this);
        dadianhua_youxiang_buju.setOnClickListener(this);
        sjljf_Uudiog_djgodg.setOnClickListener(this);
        telwhats_row2.setOnClickListener(this);
        telwhats_row3.setOnClickListener(this);
        telwhats_row4.setOnClickListener(this);
        telwhats_row5.setOnClickListener(this);
        telwhats_ll.setOnClickListener(this);
        telwhatstousu_dianhuanum.setOnClickListener(this);
        telwhatstousu_wangzhiurl.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (!WngluoTols.youWangluoFou(DadianhuaGeiWomenActivity.this)) {
            baseaNonet.showPPw(Gravity.CENTER);
            return;
        }

        Intent intent;
        switch (view.getId()) {
            case R.id.sjljf_Uudiog_djgodg:
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                finish();
                break;
            case R.id.telwhats_row2://调用客户端sdk
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                String token = BendiHuancunTols.huoQuZifuchuan(this, YONGHU_TOKEN);
                if (TextUtils.isEmpty(token)) {
                    intent = new Intent(this, GaogeZhanghaoIntoActivity.class);
                    startActivity(intent);
                }else {
                    XieyiShowTols.quH5KefuPage(this,"");

                }
                break;
            case R.id.telwhats_row3://

                break;
            case R.id.telwhats_row4://展开 tel whats email
                if (telwhats_ll.getVisibility()==View.VISIBLE) {
                    telwhats_row4_jiantou.setImageResource(R.mipmap.callcallarow);
                    telwhats_ll.setVisibility(View.GONE);
                } else {
                    telwhats_ll.setVisibility(View.VISIBLE);
                    telwhats_row4_jiantou.setImageResource(R.mipmap.useimg_jiantoudakai);
                }
                break;
            case R.id.telwhats_row5://展开 投诉详细
                if (tousu_ll.getVisibility() == View.VISIBLE) {
                    tousu_ll.setVisibility(View.GONE);
                    telwhats_row5_jiantou.setImageResource(R.mipmap.callcallarow);
                } else {
                    tousu_ll.setVisibility(View.VISIBLE);
                    telwhats_row5_jiantou.setImageResource(R.mipmap.useimg_jiantoudakai);
                }
                break;
            case R.id.telwhatstousu_dianhuanum://dianhua
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                tiaodadianhua(telwhatstousu_dianhuanum.getText().toString());
                break;
            case R.id.telwhatstousu_wangzhiurl://whatsapp
                if (DianjiQuickTols.clickkuaikuai()) {
                    return;
                }
                tiaowhats(telwhatstousu_wangzhiurl.getText().toString());
                break;
        }
    }


    private void qingqiuJiekou() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_ZHUAJINUM_DIANHUA, ZhaowomenFuwuModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ZhaowomenFuwuModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(DadianhuaGeiWomenActivity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("asianBrotherJewelLake", "mobileList");
            }

            @Override
            public void onSuccess(ZhaowomenFuwuModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.averageEmbassyNationalVictoryDepth == 1000) {
                    if (response.bigAncientTastyHeadteacher != null) {
                        LayoutInflater bujuYingshe = LayoutInflater.from(DadianhuaGeiWomenActivity.this);
                        //电话
                        if (response.bigAncientTastyHeadteacher.communistDesertMinusClub != null && response.bigAncientTastyHeadteacher.communistDesertMinusClub.size() != 0) {
                            dadianhua_dianhua_wenan.removeAllViews();
                            for (int i = 0; i < response.bigAncientTastyHeadteacher.communistDesertMinusClub.size(); i++) {
                                if (response.bigAncientTastyHeadteacher.communistDesertMinusClub.get(i).sunnyJuniorDowntown != null) {
                                    View view = bujuYingshe.inflate(R.layout.lyt_yigekehu, null);
                                    TextView me_Tv = view.findViewById(R.id.me_Tv);
                                    me_Tv.setText(response.bigAncientTastyHeadteacher.communistDesertMinusClub.get(i).sunnyJuniorDowntown);
                                    me_Tv.setId(i);
                                    me_Tv.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
                                    me_Tv.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            DianjiQuickTols.kuaiLeMa(v, this);

                                            tiaodadianhua(response.bigAncientTastyHeadteacher.communistDesertMinusClub.get(v.getId()).sunnyJuniorDowntown);
//                                            try {
//                                                //获取剪贴板管理器：
//                                                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
//                                                // 创建普通字符型ClipData
//                                                ClipData mClipData = ClipData.newPlainText("text", response.bigAncientTastyHeadteacher.communistDesertMinusClub.get(v.getId()).sunnyJuniorDowntown);
//                                                // 将ClipData内容放到系统剪贴板里。
//                                                clipboardManager.setPrimaryClip(mClipData);
//                                                Toast.makeText(DadianhuaGeiWomenActivity.this, getString(R.string.tusitishi_dizih_13), Toast.LENGTH_SHORT).show();
//                                                Intent hgrfe = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + response.bigAncientTastyHeadteacher.communistDesertMinusClub.get(v.getId()).sunnyJuniorDowntown));
//                                                startActivity(hgrfe);
//                                            } catch (Exception e) {
//                                                e.printStackTrace();
//                                            }
                                        }
                                    });
                                    dadianhua_dianhua_wenan.addView(view);
                                }
                            }
                        } else {
                            putongdianhuarl.setVisibility(View.GONE);
                        }
                        //whats
                        if (response.bigAncientTastyHeadteacher.racialUndividedViewAmbulance != null && response.bigAncientTastyHeadteacher.racialUndividedViewAmbulance.size() != 0) {
                            dadianhua_whats_wenan.removeAllViews();
                            for (int i = 0; i < response.bigAncientTastyHeadteacher.racialUndividedViewAmbulance.size(); i++) {
                                if (response.bigAncientTastyHeadteacher.racialUndividedViewAmbulance.get(i).sunnyJuniorDowntown != null) {
                                    View view = bujuYingshe.inflate(R.layout.lyt_yigekehu, null);
                                    TextView me_Tv = view.findViewById(R.id.me_Tv);
                                    me_Tv.setText(response.bigAncientTastyHeadteacher.racialUndividedViewAmbulance.get(i).sunnyJuniorDowntown);
                                    me_Tv.setId(i);
                                    me_Tv.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
                                    me_Tv.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            DianjiQuickTols.kuaiLeMa(v, this);
                                            tiaowhats(response.bigAncientTastyHeadteacher.racialUndividedViewAmbulance.get(v.getId()).sunnyJuniorDowntown);
                                        }
                                    });
                                    dadianhua_whats_wenan.addView(view);
                                }
                            }
                        } else {
                            putongwhatsrl.setVisibility(View.GONE);
                        }
                        //邮箱
                        if (response.bigAncientTastyHeadteacher.highPlate != null && response.bigAncientTastyHeadteacher.highPlate.size() != 0) {
                            dadianhua_youxiang_wenan.removeAllViews();
                            for (int i = 0; i < response.bigAncientTastyHeadteacher.highPlate.size(); i++) {
                                if (response.bigAncientTastyHeadteacher.highPlate.get(i).sunnyJuniorDowntown != null) {
                                    View view = bujuYingshe.inflate(R.layout.lyt_yigekehu, null);
                                    TextView me_Tv = view.findViewById(R.id.me_Tv);
                                    me_Tv.setText(response.bigAncientTastyHeadteacher.highPlate.get(i).sunnyJuniorDowntown);
                                    me_Tv.setId(i);
                                    me_Tv.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
                                    me_Tv.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            DianjiQuickTols.kuaiLeMa(v, this);
                                            try {
                                                ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_13));
                                                //获取剪贴板管理器：
                                                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                                // 创建普通字符型ClipData
                                                ClipData mClipData = ClipData.newPlainText("text", response.bigAncientTastyHeadteacher.highPlate.get(v.getId()).sunnyJuniorDowntown);
                                                // 将ClipData内容放到系统剪贴板里。
                                                clipboardManager.setPrimaryClip(mClipData);
                                                qufasongYoujian(response.bigAncientTastyHeadteacher.communistDesertMinusClub.get(v.getId()).sunnyJuniorDowntown);
//                                                Toast.makeText(DadianhuaGeiWomenActivity.this, getString(R.string.tusitishi_dizih_13), Toast.LENGTH_SHORT).show();

                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    });
                                    dadianhua_youxiang_wenan.addView(view);
                                }
                            }
                        } else {
                            putongyouxiangrl.setVisibility(View.GONE);
                        }

                        if (TextUtils.isEmpty(response.bigAncientTastyHeadteacher.endlessTerminalLeather)) {
                            callusdesp.setText(response.bigAncientTastyHeadteacher.endlessTerminalLeather);
                        }

                        if (!TextUtils.isEmpty(response.bigAncientTastyHeadteacher.endlessCarbon)) {
                            zhaowomen_tousudianhuall.setVisibility(View.VISIBLE);
                            telwhatstousu_dianhuanum.setText(response.bigAncientTastyHeadteacher.endlessCarbon);
                            telwhatstousu_dianhuanum.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
                        }else {
                            zhaowomen_tousudianhuall.setVisibility(View.GONE);
                        }
                        if (!TextUtils.isEmpty(response.bigAncientTastyHeadteacher.famousSomeoneAbilityNativeLibrarian)) {
                            zhaowomen_tousuwall.setVisibility(View.VISIBLE);
                            telwhatstousu_wangzhiurl.setText(response.bigAncientTastyHeadteacher.famousSomeoneAbilityNativeLibrarian);
                            telwhatstousu_wangzhiurl.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
                        }else {
                            zhaowomen_tousuwall.setVisibility(View.GONE);
                        }
                        if (!TextUtils.isEmpty(response.bigAncientTastyHeadteacher.agriculturalAirportBoss)) {
                            telwhatstousu_txt1.setVisibility(View.VISIBLE);
                            telwhatstousu_txt1.setText(response.bigAncientTastyHeadteacher.agriculturalAirportBoss);
                        }else {
                            telwhatstousu_txt1.setVisibility(View.GONE);
                        }

                    }


                } else {
//                    Toast.makeText(DadianhuaGeiWomenActivity.this, response.getNuclearTrialSpareMountainousBat(), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(response.getNuclearTrialSpareMountainousBat());
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private void tiaodadianhua(String dianhua) {
        try {
            ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_13));
            //获取剪贴板管理器：
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            // 创建普通字符型ClipData
            ClipData mClipData = ClipData.newPlainText("text", dianhua);
            // 将ClipData内容放到系统剪贴板里。
            clipboardManager.setPrimaryClip(mClipData);
//            Toast.makeText(DadianhuaGeiWomenActivity.this, getString(R.string.tusitishi_dizih_13), Toast.LENGTH_SHORT).show();

            Intent hgrfe = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + dianhua));
            startActivity(hgrfe);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tiaowhats(String whats){
        try {
            ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_13));
            dakaiWahsppLiaotian(DadianhuaGeiWomenActivity.this
                    ,whats );
            //获取剪贴板管理器：
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            // 创建普通字符型ClipData
            ClipData mClipData = ClipData.newPlainText("text",whats);
            // 将ClipData内容放到系统剪贴板里。
            clipboardManager.setPrimaryClip(mClipData);
//            Toast.makeText(DadianhuaGeiWomenActivity.this, getString(R.string.tusitishi_dizih_13), Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //send email
    protected void qufasongYoujian(String sunnyJuniorDowntown) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, sunnyJuniorDowntown);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, ""));
    }

    //start whatsapp chat
    public static void dakaiWahsppLiaotian(Context mContext, String mobileNum) {
//        try {
//            final Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.WhatsApp.com/send?phone=" + mobileNum));
//            intent.setPackage("com.whatsapp");
//            mContext.startActivity(intent);
//        } catch (Exception e) { //  没有安装WhatsApp
//
//            e.printStackTrace();
//        }

        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=" + mobileNum));
            intent.setPackage("com.whatsapp");
            mContext.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://api.whatsapp.com"));
            mContext.startActivity(intent);
        }

    }
}