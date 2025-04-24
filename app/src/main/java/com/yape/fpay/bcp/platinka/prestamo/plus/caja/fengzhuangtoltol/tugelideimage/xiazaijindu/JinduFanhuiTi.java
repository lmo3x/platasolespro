package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.tugelideimage.xiazaijindu;

import android.os.Handler;
import android.os.Looper;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class JinduFanhuiTi extends ResponseBody {

    private static final Handler zhuxianchengCaozuozhe = new Handler(Looper.getMainLooper());

    private String tupianDizhi;
    private NeibuJinduJianting neibuJinduJianting;

    private ResponseBody fanhuiShiti;
    private BufferedSource huanchongYuan;

    JinduFanhuiTi(String tupianDizhi, NeibuJinduJianting neibuJinduJianting, ResponseBody fanhuiShiti) {
        this.tupianDizhi = tupianDizhi;
        this.neibuJinduJianting = neibuJinduJianting;
        this.fanhuiShiti = fanhuiShiti;
    }

    @Override
    public MediaType contentType() {
        return fanhuiShiti.contentType();
    }

    @Override
    public long contentLength() {
        return fanhuiShiti.contentLength();
    }

    @Override
    public BufferedSource source() {
        if (huanchongYuan == null) {
            huanchongYuan = Okio.buffer(shujuYuan(fanhuiShiti.source()));
        }
        return huanchongYuan;
    }

    private Source shujuYuan(Source yuan) {
        return new ForwardingSource(yuan) {
            long totalBytesRead;
            long lastTotalBytesRead;

            @Override
            public long read(Buffer sink, long byteCount) throws IOException {
                long bytesRead = super.read(sink, byteCount);
                totalBytesRead += (bytesRead == -1) ? 0 : bytesRead;

                if (neibuJinduJianting != null && lastTotalBytesRead != totalBytesRead) {
                    lastTotalBytesRead = totalBytesRead;
                    zhuxianchengCaozuozhe.post(new Runnable() {
                        @Override
                        public void run() {
                            neibuJinduJianting.jinduJtdddd(tupianDizhi, totalBytesRead, contentLength());
                        }
                    });
                }
                return bytesRead;
            }
        };
    }

    interface NeibuJinduJianting {
        void jinduJtdddd(String url, long bytesRead, long totalBytes);
    }
}
