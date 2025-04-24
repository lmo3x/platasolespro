package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei;

import com.android.volley.toolbox.HurlStack;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/**
 * okhttpstack
 */
public class OKwangHttpyeZhan extends HurlStack {

    private OkHttpClient okqingqiuKehuduan = null;

    public OKwangHttpyeZhan() {
        this(new OkHttpClient());
    }

    public OKwangHttpyeZhan(OkHttpClient client) {
        this.okqingqiuKehuduan = client;
    }

    @Override
    protected HttpURLConnection createConnection(URL dizhirur) throws IOException {
        String xieyi = dizhirur.getProtocol();
        if (xieyi.toLowerCase().startsWith("https")) {
            HttpsURLConnection lianjie = (HttpsURLConnection) new OkUrlFactory(okqingqiuKehuduan).open(dizhirur);
            lianjie.setSSLSocketFactory((SSLSocketFactory) new WanglYinqingShixian().chuangjianSocketGongchang(dizhirur));
            return lianjie;
        } else {
            OkUrlFactory okUrlFactory = new OkUrlFactory(okqingqiuKehuduan);
            return okUrlFactory.open(dizhirur);
        }
    }

}
