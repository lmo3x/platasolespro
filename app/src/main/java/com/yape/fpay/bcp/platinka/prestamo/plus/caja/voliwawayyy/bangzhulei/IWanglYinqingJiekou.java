package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei;


import java.net.URL;
import java.security.KeyStore;

import javax.net.SocketFactory;

/**
 * http egine inferface
 */
public interface IWanglYinqingJiekou {

    SocketFactory chuangjianSocketGongchang(URL dizhi);

    SocketFactory chaungjianSSLSocketGongchang(KeyStore jiancunchu);
}
