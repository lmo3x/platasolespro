package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.APPMINGZI;
import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols.COPY_USER_INFO;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZifuchuanPinjieSpanTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;

public class RYryBackqianSuceeOkActivity extends MyJichuBsActivity implements View.OnClickListener {
    private TextView yjhgrfeaesrdf,chenggongKhas;

    private String zhiFuJine = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_rycxxh_haoxinyu);
        //动态设置状态栏高度
        RelativeLayout.LayoutParams bujuguanli = (RelativeLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        bujuguanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(bujuguanli);

        yjhgrfeaesrdf = findViewById(R.id.yjhgrfeaesrdf);
        chenggongKhas = findViewById(R.id.chenggongKhas);

        DianjiQuickTols.kuaiLeMa(yjhgrfeaesrdf, this);

        if (getIntent() != null && getIntent().getStringExtra("zhifue") != null) {
            zhiFuJine = getIntent().getStringExtra("zhifue");
        }

        shezhixiaci();

        serachChanpin();
    }

    private void shezhixiaci() {
        ZifuchuanPinjieSpanTols.with(chenggongKhas).diejiaapped("¡Su límite de crédito se elevó a")
                .diejiaapped(" S/" + zhiFuJine + ", ")
                .setQianjingse(Color.parseColor("#E73D3D"))
                .diejiaapped("bienvenido a solicitar préstamo de nuevo!")
                .chuangjian();
    }

    @Override
    public void onClick(View view) {
        if (!WngluoTols.youWangluoFou(RYryBackqianSuceeOkActivity.this)) {
            baseaNonet.showPPw(Gravity.CENTER);
            return;
        }
        switch (view.getId()) {
            case R.id.yjhgrfeaesrdf:
                ImpZhuyaoActivity.shiFouFukuan = false;
                ImpZhuyaoActivity.shiFouFukuan_Exten = false;
                Intent sss = new Intent(this, ImpZhuyaoActivity.class);
                startActivity(sss);
                finish();
                break;
        }
    }


    //请求多产品首页接口
    public void serachChanpin() {
        BendiHuancunTols.commitZifuchuan(COPY_USER_INFO, "");
        BendiHuancunTols.commitZifuchuan(APPMINGZI, "");
    }

    @Override
    public void onBackPressed() {

    }
}