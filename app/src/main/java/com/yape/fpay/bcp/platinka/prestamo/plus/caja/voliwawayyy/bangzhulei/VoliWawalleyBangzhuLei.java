package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei;

import android.content.Context;
import android.text.TextUtils;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.Volley;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.peizhi.VowaliwawalleyPeizhiCong;

/**
 * han 2023.5.11
 */
public final class VoliWawalleyBangzhuLei {

    private static volatile VoliWawalleyBangzhuLei voBnagzhu = null;

    private static RequestQueue qingqiuDuilie = null;

    private static boolean shifouChushihua = false;

    private  String TAG = "VolleyTask";

    private VoliWawalleyBangzhuLei() {
    }

    public static VoliWawalleyBangzhuLei chshihuaDanli() {
        if (voBnagzhu == null) {
            synchronized (VoliWawalleyBangzhuLei.class) {
                if (voBnagzhu == null) {
                    voBnagzhu = new VoliWawalleyBangzhuLei();
                }
            }
        }
        return voBnagzhu;
    }

    public synchronized void chushihua(Context chiyouzhe) {
        if (shifouChushihua) {
            return;
        }
        qingqiuDuilie = Volley.newRequestQueue(chiyouzhe.getApplicationContext(), new OKwangHttpyeZhan());
        shifouChushihua = true;
    }

    //addToRequestQueue
    public <T> void tianjiadaoQingqiuDuilie(Request<T> qingqiu) {
        if (!shifouChushihua) {
            VolleyLog.e("VolleyHelper is not initialized");
            return;
        }
        qingqiu.setTag(TAG);
        qingqiu.setRetryPolicy(new DefaultRetryPolicy(VowaliwawalleyPeizhiCong.wanglOutShijian, 0, 1.0f));
        qingqiuDuilie.add(qingqiu);
    }

    public <T> void tianjiadaoQingqiuDuilie(Request<T> qingqiu, String tag) {
        if (!shifouChushihua) {
            VolleyLog.e("VolleyHelper is not initialized");
            return;
        }
        qingqiu.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        qingqiu.setRetryPolicy(new DefaultRetryPolicy(VowaliwawalleyPeizhiCong.wanglOutShijian,0,1.0f));
        VolleyLog.d("new Volley Request add to queue : %s", qingqiu.getUrl());
        qingqiuDuilie.add(qingqiu);
    }

    //cancelPendingRequests
    public void quxiaoDiejiadeQingqiu(Object tag) {
        if (qingqiuDuilie != null) {
            qingqiuDuilie.cancelAll(TextUtils.isEmpty(String.valueOf(tag)) ? TAG : tag);
        }
    }

//    public void setTAG(String TAG) {
//        this.TAG = TAG;
//    }
//
//    public String getTAG() {
//        return TAG;
//    }
}
