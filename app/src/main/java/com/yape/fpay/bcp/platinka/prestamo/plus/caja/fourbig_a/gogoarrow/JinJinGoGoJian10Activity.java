package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.gogoarrow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.WngluoTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;

public class JinJinGoGoJian10Activity extends MyJichuBsActivity implements View.OnClickListener {

    private ImageView jingojian1fanhui;
    private TextView jingogojian_wanshan1,jingogojian_wanshan3,jingogojian_wanshan4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        setContentView(R.layout.activity_jin_jin_go_go_jian10);

        //动态设置状态栏高度
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        layoutParams.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(layoutParams);

        jingogojian_wanshan1 = findViewById(R.id.jingogojian_wanshan1);
        jingogojian_wanshan3 =findViewById(R.id.jingogojian_wanshan3);
        jingogojian_wanshan4 =findViewById(R.id.jingogojian_wanshan4);
        jingojian1fanhui = findViewById(R.id.jingojian1fanhui);


        jingogojian_wanshan1.setOnClickListener(this);
        jingogojian_wanshan3.setOnClickListener(this);
        jingogojian_wanshan4.setOnClickListener(this);
        jingojian1fanhui.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (DianjiQuickTols.clickkuaikuai()) {
            return;
        }
        switch (v.getId()){
            case R.id.jingojian1fanhui:
                JinJinGoGoJian10Activity.this.finish();
                break;
            case R.id.jingogojian_wanshan1:
                Intent intent = new Intent(this, JinJinGoGoJian11Activity.class);
                startActivity(intent);
                break;
            case R.id.jingogojian_wanshan3:
                intent = new Intent(this, JinJinGoGoJian12Activity.class);
                startActivity(intent);
                break;
            case R.id.jingogojian_wanshan4:
                intent = new Intent(this, JinJinGoGoJian13Activity.class);
                startActivity(intent);
                break;
        }
    }
}