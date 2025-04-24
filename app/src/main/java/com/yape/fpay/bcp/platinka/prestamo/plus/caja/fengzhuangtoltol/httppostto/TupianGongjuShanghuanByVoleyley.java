package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.httppostto;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei.OKwangHttpyeZhan;

/**
 * Created by gyzhong on 15/3/1.
 */
public class TupianGongjuShanghuanByVoleyley {

    private static RequestQueue qingqiuDuilie;

    public static synchronized void chushiHuaInstantize(Context chiyouzhe){
        if (qingqiuDuilie == null){
            synchronized (TupianGongjuShanghuanByVoleyley.class){
                if (qingqiuDuilie == null){
//                    mRequestQueue = Volley.newRequestQueue(context) ;
                    qingqiuDuilie = Volley.newRequestQueue(chiyouzhe, new OKwangHttpyeZhan());
                }
            }
        }
        qingqiuDuilie.start();
    }

    //获取请求队列
    public static RequestQueue huquQingqiuDuilie(){
        if (qingqiuDuilie == null)
            throw new RuntimeException("请先初始化mRequestQueue") ;
        return qingqiuDuilie;
    }
}
