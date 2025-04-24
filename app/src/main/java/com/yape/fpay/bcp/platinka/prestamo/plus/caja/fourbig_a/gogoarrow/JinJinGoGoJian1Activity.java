package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.ShuruZongXinxi2Shipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ConfigDianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.SuoyouXinxiModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.XieyiShowTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ChangliangConfigTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto.WangluoQingqiuVolyeyeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 进件资料01
 */
public class JinJinGoGoJian1Activity extends MyJichuBsActivity implements View.OnClickListener {

    private ImageView jingojian1fanhui;
    private TextView jingojian1submit, duquDiyihangTxt1, jingaojian1wenan2, duquDiyihangTxt2, jingojian1dibuxieyi;
    private RelativeLayout duquDiyihangRl1, duquDiyihangRl2, duquDiyihangRl3;

    private ChanpinMoxingPPWindows popupWindow;
    private List<ConfigDianModel.RoughNaturalProBean> strings;
    private ShuruZongXinxi2Shipei read01Adapter;
    private String type;
    private String code1;
    private String code2;
    private String code3;

    private boolean isData = false;

    private RelativeLayout jingaojian1dibtnbuju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_gogoarrow1);

        chushiHuaPPwindows();
        qingqiuJiekouHuixainshuju();
        //动态设置状态栏高度
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        layoutParams.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(layoutParams);

        jingojian1fanhui = findViewById(R.id.jingojian1fanhui);
        jingojian1submit = findViewById(R.id.jingojian1submit);

        duquDiyihangRl1 = findViewById(R.id.duquDiyihangRl1);
        duquDiyihangRl2 = findViewById(R.id.duquDiyihangRl2);
        duquDiyihangRl3 = findViewById(R.id.duquDiyihangRl3);

        duquDiyihangTxt1 = findViewById(R.id.duquDiyihangTxt1);
        jingaojian1wenan2 = findViewById(R.id.jingaojian1wenan2);
        duquDiyihangTxt2 = findViewById(R.id.duquDiyihangTxt2);
        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);

        DianjiQuickTols.kuaiLeMa(jingojian1dibuxieyi, this);
        DianjiQuickTols.kuaiLeMa(jingojian1fanhui, this);
        DianjiQuickTols.kuaiLeMa(jingojian1submit, this);
        DianjiQuickTols.kuaiLeMa(duquDiyihangRl1, this);
        DianjiQuickTols.kuaiLeMa(duquDiyihangRl2, this);
        DianjiQuickTols.kuaiLeMa(duquDiyihangRl3, this);

        jiazaizhongWindows.setCanceledOnTouchOutside(false);

        jingaojian1dibtnbuju = findViewById(R.id.jingaojian1dibtnbuju);
        jingaojian1dibtnbuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    //回显数据
    private void qingqiuJiekouHuixainshuju() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SERACH_SHENFEN, SuoyouXinxiModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<SuoyouXinxiModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian1Activity.this, BendiHuancunTols.YONGHU_ID));
                 String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                if(TextUtils.isEmpty(s1)){
                    s1="0";
                }
                if(TextUtils.isEmpty(s2)){
                    s2="0";
                }
                map.put("looseCivilInchCrowdedAnyone",  s1 + "," +  s2);//lbs
                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
            }

            @Override
            public void onSuccess(SuoyouXinxiModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                //empleado
                //0-4999999
                //viaje
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    SuoyouXinxiModel.FanhuiData bean = response.bigAncientTastyHeadteacher;

                    if (!TextUtils.isEmpty(bean.pleasedStoneFactoryBrokenHole)) {//v-pleasedStoneFactoryBrokenHole : "Empleado"
                        code1 = bean.justVirtueChild;
                        duquDiyihangTxt1.setText(bean.pleasedStoneFactoryBrokenHole);
                    }
                    if (!TextUtils.isEmpty(bean.learnedCousinKangarooRemark)) {
                        code2 = bean.dailyMoreBreak;
                        jingaojian1wenan2.setText(bean.learnedCousinKangarooRemark);
                    }
                    if (!TextUtils.isEmpty(bean.comfortableUnknownGestureBritishLeaf)) {
                        code3 = bean.triangleAboveError;
                        duquDiyihangTxt2.setText(bean.comfortableUnknownGestureBritishLeaf);
                    }

                    isData = !TextUtils.isEmpty(code1);
                    if (!isData) {
//                        YincangShijianClickTols.QingqiuMaidian(WUGONGZUOXINXIJINRUYEMIAN);
                    }
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")){
                    baseaNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.jingojian1fanhui:
//                YincangShijianClickTols.QingqiuMaidian(GONGZUOXINXIYEFANHUI);
//                YincangShijianClickTols.QingqiuMaidian(ZILIAOOVERFANHUI);
                finish();
                break;
            case R.id.jingojian1submit:


                if (!TextUtils.isEmpty(code1) && !TextUtils.isEmpty(code2) && !TextUtils.isEmpty(code3)) {
                    qingqiuJiekouHuixainshuju3();
                } else {
//                    Toast.makeText(JinJinGoGoJian1Activity.this, getString(R.string.tusitishi_dizih_04), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
                }

                break;

            case R.id.duquDiyihangRl1://主要收入来源workType
                type = "workType";
                qingqiuJiekouHuixainshuju2(type);
                break;
            case R.id.dididitwotwo://月平均收入incomeLevel
                type = "incomeLevel";
                qingqiuJiekouHuixainshuju2(type);
                break;
            case R.id.duquDiyihangRl3://主要贷款原因 loanPurpose
                type = "loanPurpose";
                qingqiuJiekouHuixainshuju2(type);
                break;

            case R.id.jingojian1dibuxieyi://跳转隐私协议
                XieyiShowTols.quH5YinsiPage(JinJinGoGoJian1Activity.this);
                break;


         /*   case R.id.readRl01:
            case R.id.readRl02:
            case R.id.readRl03:
                popupWindow.showPopup();
                break;*/
        }
    }


    //主要收入来源
    private void qingqiuJiekouHuixainshuju2(String hasifof) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_ZIDIAN_LEIXING, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian1Activity.this, BendiHuancunTols.YONGHU_ID));
                 String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                if(TextUtils.isEmpty(s1)){
                    s1="0";
                }
                if(TextUtils.isEmpty(s2)){
                    s2="0";
                }
                map.put("looseCivilInchCrowdedAnyone",  s1 + "," +  s2);//lbs
                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
                map.put("squareBookshop", hasifof);
            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    List<ConfigDianModel.RoughNaturalProBean> bigAncientTastyHeadteacher = response.bigAncientTastyHeadteacher;
                    strings.clear();
                    if (bigAncientTastyHeadteacher != null && bigAncientTastyHeadteacher.size() > 0) {
                        strings.addAll(bigAncientTastyHeadteacher);
                        read01Adapter.notifyDataSetChanged();
                        popupWindow.showPPw();
                    }
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")){
                    baseaNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);

            }
        });
    }

    private void qingqiuJiekouHuixainshuju3() {//FIND_PLEASENT_SPARROW
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SAVE_SHENFEN, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian1Activity.this, BendiHuancunTols.YONGHU_ID));
                 String s1 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_WEIJINGDU);
                String s2 = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.XITONG_JINGWEIDU);
                if(TextUtils.isEmpty(s1)){
                    s1="0";
                }
                if(TextUtils.isEmpty(s2)){
                    s2="0";
                }
                map.put("looseCivilInchCrowdedAnyone",  s1 + "," +  s2);//lbs
                map.put("coldSquidThoroughSoldier", YincangShijianClickTols.muyuyaaa);
                map.put("justVirtueChild", code1);
                map.put("dailyMoreBreak", code2);
                map.put("triangleAboveError", code3);
            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    if (!isData)
//                        YincangShijianClickTols.QingqiuMaidian(WUGONGZUOXINXITIJIAO);
//
//                        YincangShijianClickTols.QingqiuMaidian(DIANJIGONGZUOXINXITIJIAO);

                    isData = true;
                    Intent intent = new Intent(JinJinGoGoJian1Activity.this, JinJinGoGoJian2Activity.class);
                    startActivity(intent);
                }
                jiazaizhongWindows.hideKuangkuangIng();
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                if (error.contains("java.net.UnknownHostException:")){
                    baseaNonet.showPPw(Gravity.CENTER);
                }
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private void chushiHuaPPwindows() {
        popupWindow = new ChanpinMoxingPPWindows(this);
        LayoutInflater popInflater = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_gogoarrow_info, null);
        RecyclerView popJinJianZiLiao01Rv = popupView.findViewById(R.id.popJinJianZiLiao01Rv);
        strings = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(linearLayoutManager);
        read01Adapter = new ShuruZongXinxi2Shipei(strings);
        popJinJianZiLiao01Rv.setAdapter(read01Adapter);
        popupWindow.chushihuaPPW(popupView);
        read01Adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {


            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String sunnyJuniorDowntown = strings.get(position).sunnyJuniorDowntown;
                if ("workType".equals(type)) {
                    duquDiyihangTxt1.setText(sunnyJuniorDowntown);
                    code1 = strings.get(position).averageEmbassyNationalVictoryDepth;
                } else if ("incomeLevel".equals(type)) {
                    jingaojian1wenan2.setText(sunnyJuniorDowntown);
                    code2 = strings.get(position).averageEmbassyNationalVictoryDepth;
                } else if ("loanPurpose".equals(type)) {
                    duquDiyihangTxt2.setText(sunnyJuniorDowntown);
                    code3 = strings.get(position).averageEmbassyNationalVictoryDepth;
                }
                popupWindow.xiaohuiPPw();
            }
        });
    }


    /**
     * 按两次退出
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            YincangShijianClickTols.QingqiuMaidian(GONGZUOXINXIYEFANHUI);
//            YincangShijianClickTols.QingqiuMaidian(ZILIAOOVERFANHUI);
        }
        return super.onKeyDown(keyCode, event);
    }
}