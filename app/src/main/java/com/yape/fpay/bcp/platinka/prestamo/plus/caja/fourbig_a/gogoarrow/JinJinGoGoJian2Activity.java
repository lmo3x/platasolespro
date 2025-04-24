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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ToastUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei.ShuruZongXinxi3Shipei;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DizhiDiquModel;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import im.crisp.client.Crisp;

public class JinJinGoGoJian2Activity extends MyJichuBsActivity implements View.OnClickListener {

    private ImageView jingojian1fanhui;
    private TextView jingojian1submit;
    private EditText duquDiyihangTxt1, jingaojian1wenan2, duquDiyihangTxt3, duhalashaoTxt5, duhalashaoTxt6;
    private TextView duquDiyihangTxt2, jingojian1dibuxieyi;
    private ShuruZongXinxi3Shipei read02Adapter;
    private List<DizhiDiquModel.RoughNaturalProBean> strings;
    private String regionlevel;
    private StringBuffer sbAddress;
    private int index;
    private int addressCode1;
    private int addressCode2;
    private String address1;
    private String address2;

    private boolean isData = false;

    private RelativeLayout jingaojian1dibtnbuju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_gogoarrow2);
        chushihuaTankuangWindows();
        //动态设置状态栏高度
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        layoutParams.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(layoutParams);

        jingojian1fanhui = findViewById(R.id.jingojian1fanhui);
        duquDiyihangTxt1 = findViewById(R.id.duquDiyihangTxt1);
        jingaojian1wenan2 = findViewById(R.id.jingaojian1wenan2);
        duquDiyihangTxt3 = findViewById(R.id.duquDiyihangTxt3);
        duhalashaoTxt5 = findViewById(R.id.duhalashaoTxt5);
        duhalashaoTxt6 = findViewById(R.id.duhalashaoTxt6);
        duquDiyihangTxt2 = findViewById(R.id.duquDiyihangTxt2);
        qingqiujiekouHuixain3();
        RelativeLayout duquDiyihangRl2 = findViewById(R.id.duquDiyihangRl2);
        jingojian1submit = findViewById(R.id.jingojian1submit);
        jingojian1dibuxieyi = findViewById(R.id.jingojian1dibuxieyi);

        DianjiQuickTols.kuaiLeMa(jingojian1dibuxieyi, this);
        DianjiQuickTols.kuaiLeMa(jingojian1fanhui, this);
        DianjiQuickTols.kuaiLeMa(jingojian1submit, this);
        DianjiQuickTols.kuaiLeMa(duquDiyihangRl2, this);

        jiazaizhongWindows.setCanceledOnTouchOutside(false);

        jingaojian1dibtnbuju = findViewById(R.id.jingaojian1dibtnbuju);
        jingaojian1dibtnbuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.jingojian1fanhui:
//                YincangShijianClickTols.QingqiuMaidian(GERENXINXIYEFANHUIBTN);
                finish();
                break;
            case R.id.jingojian1submit:

                if (!TextUtils.isEmpty(jingaojian1wenan2.getText().toString().trim())
                        && !TextUtils.isEmpty(address1)
                        && !TextUtils.isEmpty(address2)
                        && !TextUtils.isEmpty(duquDiyihangTxt3.getText().toString().trim())
                        && !TextUtils.isEmpty(duquDiyihangTxt1.getText().toString().trim())
                        && !TextUtils.isEmpty(duhalashaoTxt5.getText().toString().trim())
                        && !TextUtils.isEmpty(duhalashaoTxt6.getText().toString().trim())) {
                    //提交数据
                    if (!jianchaYouxiang(duquDiyihangTxt1.getText().toString().trim())) {
//                        Toast.makeText(JinJinGoGoJian2Activity.this, getString(R.string.tusitishi_dizih_05), Toast.LENGTH_SHORT).show();
                        ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_05));
                        return;
                    }
                    qingqiujiekouHuixain2();
                } else {
//                    Toast.makeText(JinJinGoGoJian2Activity.this, getString(R.string.tusitishi_dizih_04), Toast.LENGTH_SHORT).show();
                    ToastUtil.showShortToast(getString(R.string.tusitishi_dizih_04));
                }

                break;
            case R.id.duquDiyihangRl2:
                //地区
                index = 0;
                sbAddress = new StringBuffer();
                String regionParentId = "-1";
                regionlevel = "1";
                address1 = "";
                address2 = "";
                qingqiujiekouHuixain1(regionParentId, regionlevel);
                break;
            case R.id.jingojian1dibuxieyi://跳转隐私协议
                XieyiShowTols.quH5YinsiPage(JinJinGoGoJian2Activity.this);
                break;
        }
    }

    private void qingqiujiekouHuixain1(String fubuid, String dengji) {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.SEARCH_DIQUQUARE, DizhiDiquModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<DizhiDiquModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian2Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("blankApplicationNearbySheep", fubuid);
                map.put("fairHelmetModernCourseHoney", dengji);
            }

            @Override
            public void onSuccess(DizhiDiquModel response) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
                    index++;
                    List<DizhiDiquModel.RoughNaturalProBean> bigAncientTastyHeadteacher = response.bigAncientTastyHeadteacher;
                    if (bigAncientTastyHeadteacher != null && bigAncientTastyHeadteacher.size() > 0) {
                        strings.clear();
                        strings.addAll(bigAncientTastyHeadteacher);
                        read02Adapter.notifyDataSetChanged();
                    }
                    if (index < 3)
                        chanpinMoxingPPWindows.showPPw();
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

    private void qingqiujiekouHuixain2() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SAVE_SHENFEN, ConfigDianModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<ConfigDianModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian2Activity.this, BendiHuancunTols.YONGHU_ID));
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
                map.put("snowyFirstAny", address1);//residentialProvince
                map.put("regularUnmarriedBed", addressCode1 + "");//residentialProvinceCode
                map.put("suchIceSuddenEnergySilver", address2);//residentialCity
                map.put("gentlePulseEntireDistantDeer", addressCode2 + "");//residentialCityCode
                map.put("eastAloneAggressiveMankind", duquDiyihangTxt1.getText().toString().trim());//email
                map.put("minusSavageBlowLorry", jingaojian1wenan2.getText().toString().trim());//whatsapp
                map.put("youngMakeLocalCompetitionDampIts", duquDiyihangTxt3.getText().toString().trim());//codePin 邮编
                map.put("physicalUncertainSmoothCongratulation", duhalashaoTxt5.getText().toString().trim());//homeAddress 街道
                map.put("livelyBrainSimpleFrequentRay", duhalashaoTxt6.getText().toString().trim());//fullAddress 楼号
            }

            @Override
            public void onSuccess(ConfigDianModel response) {
                Log.e("TAG", "response---->" + response);
                if (response.getaverageEmbassyNationalVictoryDepth() == 1000) {
//                    if (!isData)
//                        YincangShijianClickTols.QingqiuMaidian(WUGERENXINXISHIDIANJITIJIAO);

//                    YincangShijianClickTols.QingqiuMaidian(DIANJIGERENXINXITIJIAO);


//                    Crisp.setUserEmail(duquDiyihangTxt3.getText().toString().trim());// 进件⻚⼿动输的邮箱

                    isData = true;
                    Intent intent = new Intent(JinJinGoGoJian2Activity.this, JinJinGoGoJian3Activity.class);
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

    public boolean jianchaYouxiang(String youxiang) {
        if (youxiang != null || youxiang.length() > 0) {
            Pattern geshi = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
            Matcher pipei = geshi.matcher(youxiang);
            return pipei.find();
        }
        return false;

    }

    private void qingqiujiekouHuixain3() {
        jiazaizhongWindows.showKuangkuangIng();
        WangluoQingqiuVolyeyeTols.chuangjianInit(this).post(ChangliangConfigTols.GONGZUOLXR_SERACH_SHENFEN, SuoyouXinxiModel.class, new WangluoQingqiuVolyeyeTols.OnResponse<SuoyouXinxiModel>() {
            @Override
            public void OnMap(Map<String, String> map) {
//                map.put("firmHappyAtlanticAustralia", YincangShijianClickTols.appshasahId);
//                map.put("singleComfortClerkSwissMachine", BendiHuancunTols.huoQuZifuchuan(JinJinGoGoJian2Activity.this, BendiHuancunTols.YONGHU_ID));
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
                    if (!TextUtils.isEmpty(bean.eastAloneAggressiveMankind)) {//v-pleasedStoneFactoryBrokenHole : "Empleado"
                        duquDiyihangTxt1.setText(bean.eastAloneAggressiveMankind);
                    }
                    if (!TextUtils.isEmpty(bean.minusSavageBlowLorry)) {
                        jingaojian1wenan2.setText(bean.minusSavageBlowLorry);
                    }

                    if (!TextUtils.isEmpty(bean.snowyFirstAny)) {
                        //CALDAS  chinchina
                        address1 = bean.snowyFirstAny;
                    }
                    if (!TextUtils.isEmpty(bean.suchIceSuddenEnergySilver)) {
                        //CALDAS  chinchina
                        address2 = bean.suchIceSuddenEnergySilver;
                    }
                    //v-regularUnmarriedBed : "6"
                    //v-gentlePulseEntireDistantDeer : "387"
                    addressCode1 = bean.regularUnmarriedBed;
                    addressCode2 = bean.gentlePulseEntireDistantDeer;
                    if (address1 != null && address2 != null) {
                        duquDiyihangTxt2.setText(address1 + " " + address2);
                    }
                    //
                    if (!TextUtils.isEmpty(bean.youngMakeLocalCompetitionDampIts)) {
                        duquDiyihangTxt3.setText(bean.youngMakeLocalCompetitionDampIts);
                    }
                    if (!TextUtils.isEmpty(bean.physicalUncertainSmoothCongratulation)) {
                        duhalashaoTxt5.setText(bean.physicalUncertainSmoothCongratulation);
                    }
                    if (!TextUtils.isEmpty(bean.livelyBrainSimpleFrequentRay)) {
                        duhalashaoTxt6.setText(bean.livelyBrainSimpleFrequentRay);
                    }

                    isData = !TextUtils.isEmpty(bean.eastAloneAggressiveMankind);
                    if (!isData) {
//                        YincangShijianClickTols.QingqiuMaidian(WUGERENXINXISHIJINRUYEMIAN);
                    }
                }
            }

            @Override
            public void onError(String error) {
                jiazaizhongWindows.hideKuangkuangIng();
                Log.e("TAG", "error---->" + error);
            }
        });
    }

    private ChanpinMoxingPPWindows chanpinMoxingPPWindows;

    private void chushihuaTankuangWindows() {
        chanpinMoxingPPWindows = new ChanpinMoxingPPWindows(this);
        LayoutInflater chuangkouInflt = (LayoutInflater) (this).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View chuangkouView = chuangkouInflt.inflate(R.layout.wndw_gogoarrow_info, null);
        RecyclerView popJinJianZiLiao01Rv = chuangkouView.findViewById(R.id.popJinJianZiLiao01Rv);
        strings = new ArrayList<>();
        LinearLayoutManager bujuguanli = new LinearLayoutManager(this);
        popJinJianZiLiao01Rv.setLayoutManager(bujuguanli);
        read02Adapter = new ShuruZongXinxi3Shipei(strings);
        popJinJianZiLiao01Rv.setAdapter(read02Adapter);
        chanpinMoxingPPWindows.chushihuaPPW(chuangkouView);
        read02Adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                String challengingSwimmingDeepAdvertisement = strings.get(position).challengingSwimmingDeepAdvertisement;
                if (index == 1) {
                    addressCode1 = strings.get(position).deliciousUpperYesterday;
                    address1 = challengingSwimmingDeepAdvertisement;
                } else if (index == 2) {
                    addressCode2 = strings.get(position).deliciousUpperYesterday;
                    address2 = challengingSwimmingDeepAdvertisement;
                }
                sbAddress.append(challengingSwimmingDeepAdvertisement + " ");
                duquDiyihangTxt2.setText(sbAddress);
                int deliciousUpperYesterday = strings.get(position).deliciousUpperYesterday;
                String regionParentId = deliciousUpperYesterday + "";
                regionlevel = "2";
                qingqiujiekouHuixain1(regionParentId, regionlevel);
                chanpinMoxingPPWindows.xiaohuiPPw();
            }
        });
    }


    /**
     * 按两次退出
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            YincangShijianClickTols.QingqiuMaidian(GERENXINXIYEFANHUIBTN);
        }
        return super.onKeyDown(keyCode, event);
    }
}