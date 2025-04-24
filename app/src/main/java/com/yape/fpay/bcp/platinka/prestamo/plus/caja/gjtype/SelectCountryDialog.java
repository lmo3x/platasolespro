package com.yape.fpay.bcp.platinka.prestamo.plus.caja.gjtype;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.JiazaizhongDialog;

public class SelectCountryDialog {

    private static boolean isShowEg = true;


    public static void openShow(Activity activity, boolean isLogin, OnCallback callback) {
        LayoutInflater chaungfanzhe = (LayoutInflater) (activity).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View chuangshitu = chaungfanzhe.inflate(R.layout.layout_select_country, null);

        JiazaizhongDialog jiazaizhongWindows = new JiazaizhongDialog(activity, R.style.CustomDialogTheme, chuangshitu);


        View ivClose = chuangshitu.findViewById(R.id.ivClose);
        ImageView ivEg = chuangshitu.findViewById(R.id.ivEg);
        TextView tvEg = chuangshitu.findViewById(R.id.tvEg);
        ImageView ivBl = chuangshitu.findViewById(R.id.ivBl);
        TextView tvBl = chuangshitu.findViewById(R.id.tvBl);

        if (SelectGuoJiaUtil.isGuoJiaBl()) {
            ivBl.setImageResource(R.mipmap.ic_selected1);
            ivEg.setImageResource(R.mipmap.ic_selected0);
            tvBl.setTextColor(activity.getColor(R.color.sezhi_argb_333333));
            tvEg.setTextColor(activity.getColor(R.color.sezhi_argb_999999));
        } else {
            ivBl.setImageResource(R.mipmap.ic_selected0);
            ivEg.setImageResource(R.mipmap.ic_selected1);
            tvBl.setTextColor(activity.getColor(R.color.sezhi_argb_999999));
            tvEg.setTextColor(activity.getColor(R.color.sezhi_argb_333333));
        }

        if (isLogin) {
            ivClose.setVisibility(View.VISIBLE);
        } else {
            ivClose.setVisibility(View.GONE);
        }

        chuangshitu.findViewById(R.id.bgEg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivBl.setImageResource(R.mipmap.ic_selected0);
                ivEg.setImageResource(R.mipmap.ic_selected1);
                tvBl.setTextColor(activity.getColor(R.color.sezhi_argb_999999));
                tvEg.setTextColor(activity.getColor(R.color.sezhi_argb_333333));
                isShowEg = true;
            }
        });

        chuangshitu.findViewById(R.id.bgBl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivBl.setImageResource(R.mipmap.ic_selected1);
                ivEg.setImageResource(R.mipmap.ic_selected0);
                tvBl.setTextColor(activity.getColor(R.color.sezhi_argb_333333));
                tvEg.setTextColor(activity.getColor(R.color.sezhi_argb_999999));
                isShowEg = false;
            }
        });

        chuangshitu.findViewById(R.id.tvConfirm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isShowEg) {
                   SelectGuoJiaUtil.saveGuoEg();
                } else {
                    SelectGuoJiaUtil.saveGuoEBl();
                }
                jiazaizhongWindows.hideKuangkuangIng();
                callback.callback(isShowEg ? "593" : "51");
            }
        });

        chuangshitu.findViewById(R.id.ivClose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jiazaizhongWindows.hideKuangkuangIng();
            }
        });

        jiazaizhongWindows.setKefouDianjiWaibu(false);
        jiazaizhongWindows.showKuangkuangIng();

    }

    public interface OnCallback {
        void callback(String type);
    }

}

