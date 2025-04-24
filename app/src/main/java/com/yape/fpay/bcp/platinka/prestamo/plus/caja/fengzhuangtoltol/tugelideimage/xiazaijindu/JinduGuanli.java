package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.tugelideimage.xiazaijindu;

import android.text.TextUtils;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JinduGuanli {

    private static Map<String, JinduJianting> jiantingBiao = Collections.synchronizedMap(new HashMap<String, JinduJianting>());
    private static OkHttpClient wangqingOkthree;

    private JinduGuanli() {
    }

    public static OkHttpClient getWangqingOkthree() {
        if (wangqingOkthree == null) {
            wangqingOkthree = new OkHttpClient.Builder()
                    .addNetworkInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request request = chain.request();
                            Response response = chain.proceed(request);
                            return response.newBuilder()
                                    .body(new JinduFanhuiTi(request.url().toString(), LISTENER, response.body()))
                                    .build();
                        }
                    })
                    .build();
        }
        return wangqingOkthree;
    }

    private static final JinduFanhuiTi.NeibuJinduJianting LISTENER = new JinduFanhuiTi.NeibuJinduJianting() {
        @Override
        public void jinduJtdddd(String dizhi, long zijieDu, long zongZijie) {
            JinduJianting jinduJianting = getProgressListener(dizhi);
            if (jinduJianting != null) {
                int percentage = (int) ((zijieDu * 1f / zongZijie) * 100f);
                boolean isComplete = percentage >= 100;
                jinduJianting.onProgress(isComplete, percentage, zijieDu, zongZijie);
                if (isComplete) {
                    deltachJianting(dizhi);
                }
            }
        }
    };

    public static void attachJianting(String url, JinduJianting listener) {
        if (!TextUtils.isEmpty(url) && listener != null) {
            jiantingBiao.put(url, listener);
            listener.onProgress(false, 0, 0, 0);
        }
    }

    public static void deltachJianting(String url) {
        if (!TextUtils.isEmpty(url)) {
            jiantingBiao.remove(url);
        }
    }

    public static JinduJianting getProgressListener(String url) {
        if (TextUtils.isEmpty(url) || jiantingBiao == null || jiantingBiao.size() == 0) {
            return null;
        }

        JinduJianting listenerWeakReference = jiantingBiao.get(url);
        if (listenerWeakReference != null) {
            return listenerWeakReference;
        }
        return null;
    }
}
