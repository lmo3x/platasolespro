package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.TOUSUH5TOEKN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.TOUSU_APP;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ISTEST;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.ImpZhuyaoActivity.ZHUYEMIAN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ID;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_TOKEN;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.YONGHU_ZHUAJI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianFinalStr.DIANJIWODETUICHU;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick.YincangShijianClickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.GuojihuaTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;

//select language
public class PeizhiLeiActivity extends MyJichuBsActivity implements View.OnClickListener {

    private ImageView sjljf_Uudiog_djgodg;
    private LinearLayout chasidjan_sssy_buju1, chasidjan_sssy_buju2;
    private ImageView chasidjan_sssy_iv1, chasidjan_sssy_iv2;
    private TextView chasidjan_sssy_tv1, chasidjan_sssy_tv2;
    private TextView jfgdfsajosichuchu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_diff_yingyu_xibanya);


        //动态设置状态栏高度
        RelativeLayout.LayoutParams bugjuguanli = (RelativeLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        bugjuguanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(bugjuguanli);

        sjljf_Uudiog_djgodg = findViewById(R.id.sjljf_Uudiog_djgodg);
        chasidjan_sssy_buju1 = findViewById(R.id.chasidjan_sssy_buju1);
        chasidjan_sssy_buju2 = findViewById(R.id.chasidjan_sssy_buju2);
        chasidjan_sssy_iv1 = findViewById(R.id.chasidjan_sssy_iv1);
        chasidjan_sssy_iv2 = findViewById(R.id.chasidjan_sssy_iv2);
        chasidjan_sssy_tv1 = findViewById(R.id.chasidjan_sssy_tv1);
        chasidjan_sssy_tv2 = findViewById(R.id.chasidjan_sssy_tv2);
        jfgdfsajosichuchu = findViewById(R.id.jfgdfsajosichuchu);

        DianjiQuickTols.kuaiLeMa(sjljf_Uudiog_djgodg, this);
//        DianjiQuickTols.kuaiLeMa(chasidjan_sssy_buju1, this);
//        DianjiQuickTols.kuaiLeMa(chasidjan_sssy_buju2, this);
        DianjiQuickTols.kuaiLeMa(jfgdfsajosichuchu, this);

//        if (TextUtils.equals("en", GuojihuaTols.huoquYuaynLlll(this))) {
//
//            chasidjan_sssy_buju1.setBackgroundResource(R.drawable.dageiwm_beijingck);
//            chasidjan_sssy_buju2.setBackgroundResource(R.drawable.dageiwm_beijingunck);
//            chasidjan_sssy_iv1.setImageResource(R.mipmap.useimg_uk);
//            chasidjan_sssy_iv2.setImageResource(R.mipmap.useimg_hgfeaesgrfea);
//            chasidjan_sssy_tv1.setTextColor(getColor(R.color.sezhi_argb_baise));
//            chasidjan_sssy_tv2.setTextColor(getColor(R.color.sezhi_argb_FF674F));
//
//        } else {
//            chasidjan_sssy_buju1.setBackgroundResource(R.drawable.dageiwm_beijingunck);
//            chasidjan_sssy_buju2.setBackgroundResource(R.drawable.dageiwm_beijingck);
//            chasidjan_sssy_iv1.setImageResource(R.mipmap.useimg_hgfeaesgrfea);
//            chasidjan_sssy_iv2.setImageResource(R.mipmap.useimg_uk);
//            chasidjan_sssy_tv1.setTextColor(getColor(R.color.sezhi_argb_FF674F));
//            chasidjan_sssy_tv2.setTextColor(getColor(R.color.sezhi_argb_baise));
//        }

        chasidjan_sssy_buju2.setBackgroundResource(R.drawable.dageiwm_beijingck);
        chasidjan_sssy_iv2.setImageResource(R.mipmap.useimg_uk);
        chasidjan_sssy_tv2.setTextColor(getColor(R.color.sezhi_argb_baise));
    }

    @Override
    public void onClick(View view) {
        if (!WngluoTols.youWangluoFou(PeizhiLeiActivity.this)) {
            baseaNonet.showPPw(Gravity.CENTER);
            return;
        }
        Intent intent;
        switch (view.getId()) {
            case R.id.sjljf_Uudiog_djgodg:
                finish();
                break;
            case R.id.chasidjan_sssy_buju1:
                chasidjan_sssy_buju1.setBackgroundResource(R.drawable.dageiwm_beijingck);
                chasidjan_sssy_buju2.setBackgroundResource(R.drawable.dageiwm_beijingunck);
                chasidjan_sssy_iv1.setImageResource(R.mipmap.useimg_uk);
                chasidjan_sssy_iv2.setImageResource(R.mipmap.useimg_hgfeaesgrfea);
                chasidjan_sssy_tv1.setTextColor(getColor(R.color.sezhi_argb_baise));
                chasidjan_sssy_tv2.setTextColor(getColor(R.color.sezhi_argb_FF674F));
                BendiHuancunTols.commitZifuchuan(BendiHuancunTols.XITONG_YUYAN, "en");
                break;
            case R.id.chasidjan_sssy_buju2:
                chasidjan_sssy_buju1.setBackgroundResource(R.drawable.dageiwm_beijingunck);
                chasidjan_sssy_buju2.setBackgroundResource(R.drawable.dageiwm_beijingck);
                chasidjan_sssy_iv1.setImageResource(R.mipmap.useimg_hgfeaesgrfea);
                chasidjan_sssy_iv2.setImageResource(R.mipmap.useimg_uk);
                chasidjan_sssy_tv1.setTextColor(getColor(R.color.sezhi_argb_FF674F));
                chasidjan_sssy_tv2.setTextColor(getColor(R.color.sezhi_argb_baise));
                BendiHuancunTols.commitZifuchuan(BendiHuancunTols.XITONG_YUYAN, "es");
                break;
            case R.id.jfgdfsajosichuchu:

                //埋点 退出app
                YincangShijianClickTols.QingqiuMaidian(DIANJIWODETUICHU);
                BendiHuancunTols.qingChuZifuchuan(this, YONGHU_ID);
                BendiHuancunTols.qingChuZifuchuan(this, YONGHU_TOKEN);
                BendiHuancunTols.qingChuZifuchuan(this, YONGHU_ZHUAJI);
                BendiHuancunTols.qingChuZifuchuan(this,TOUSUH5TOEKN);
                BendiHuancunTols.qingChuZifuchuan(this,YONGHU_ISTEST);
                BendiHuancunTols.qingChuZifuchuan(this,TOUSU_APP);

                ImpZhuyaoActivity.shiFouFukuan = false;
                ImpZhuyaoActivity.shiFouFukuan_Exten = false;
                ImpZhuyaoActivity.shiFou_ry_extenDingId = 0;
                ImpZhuyaoActivity.shiFou_rest_Menu = "1";
                Main2Activity.isZhiFu = false;
                Main2Activity.isZhiFu_zhanQi = false;
                Main2Activity.isZhiFu_zhanQi_orderId = 0;


                Intent broadcastIntent = new Intent(ZHUYEMIAN);
                sendBroadcast(broadcastIntent);

                intent = new Intent(PeizhiLeiActivity.this, GaogeZhanghaoIntoActivity.class);
                startActivity(intent);
                finish();

//                impZhuyaoActivity.shezhiDibuMenuColor(0);
//                impZhuyaoActivity.qingchuDibuMenuColro(1);
//
//                impZhuyaoActivity.dangqianZhusenceF = impZhuyaoActivity.stringFragmentHashMap.get(FIRSTJIE);
//                impZhuyaoActivity.kongzhiFragChange(impZhuyaoActivity.dangqianF, impZhuyaoActivity.dangqianZhusenceF);
                break;
        }
    }
}