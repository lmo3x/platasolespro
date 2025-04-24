package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.anquanzhengshu.MiyaoSSlGongchang;

import java.io.InputStream;
import java.net.URL;
import java.security.KeyStore;

import javax.net.SocketFactory;

/**
 * wangye yinqing shixianlei
 */
public class WanglYinqingShixian implements IWanglYinqingJiekou {

    @Override
    public SocketFactory chuangjianSocketGongchang(URL dizhi) {
        InputStream ins = null;
        KeyStore keyStore = null;
//        try {
//            CertificateFactory cerFactory = CertificateFactory.getInstance("X.509");
//            ins = LeafApplication.getContext().getAssets().open("leaf.cer");
//            Certificate cer = cerFactory.generateCertificate(ins);
//            keyStore = KeyStore.getInstance("PKCS12", "BC");
//            keyStore.load(null, null);
//            keyStore.setCertificateEntry("LeafCA", cer);
//        } catch (Exception e) {
//            XLog.e("error >>>>> " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            if (null != ins)
//                try {
//                    ins.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//        }
        return chaungjianSSLSocketGongchang(keyStore);
    }

    @Override
    public SocketFactory chaungjianSSLSocketGongchang(KeyStore jiancunchu) {
//        if (keyStore == null) {
//            throw new IllegalArgumentException("keystore can not be null !");
//        }
        return new MiyaoSSlGongchang(jiancunchu);
    }
}
