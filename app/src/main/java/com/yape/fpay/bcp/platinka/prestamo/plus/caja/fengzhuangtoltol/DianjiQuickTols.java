package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.view.View;

public class DianjiQuickTols {


    private static final int MIN_CLICK_DELAY_TIME = 600;
    private static long lastClickTime11;

    public static void kuaiLeMa(final View v, final View.OnClickListener listener) {
        if (v == null) return;
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
// 两次点击按钮之间的点击间隔不能少于600毫秒




                listener.onClick(v1);
                v1.setClickable(false);

                long curClickTime = System.currentTimeMillis();
                long l = curClickTime - lastClickTime11;
                if(l>MIN_CLICK_DELAY_TIME){
                    v.setClickable(true);
                }
                lastClickTime11 = curClickTime;
//
//                v.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        v.setClickable(true);
//                    }
//                }, 600);
            }
        });
    }

    public static boolean clickkuaikuai() {
        boolean flag = true;
        long curClickTime = System.currentTimeMillis();
        if ((curClickTime - lastClickTime11) >= MIN_CLICK_DELAY_TIME) {
            flag = false;
        }
        lastClickTime11 = curClickTime;
        return flag;
    }
}
