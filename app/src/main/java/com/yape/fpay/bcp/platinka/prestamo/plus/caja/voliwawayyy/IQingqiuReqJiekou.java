package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.jiantingfsd.QingqJiantingskjf;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.jiantingfsd.QingqJiantingskjf1;

/**
 * han 2023.5.11
 */
public interface IQingqiuReqJiekou {

    public static final int GET = 0;

    public static final int POST = 1;

//    void doRequest(int method, String target, RequestParams params, RequestListener l);
    void todoReqQingq(int method, String target, QingqytrCanshuw params, QingqJiantingskjf l);
    <T> void todoReqQingq(int method, String target, QingqytrCanshuw params, String tag, QingqJiantingskjf1<T> l);
}
