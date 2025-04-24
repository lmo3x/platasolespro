package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.tugelideimage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.tugelideimage.xiazaijindu.JinduGuanli;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;

import java.io.InputStream;

import androidx.annotation.NonNull;

@GlideModule
public class TupianGelidePezhi extends AppGlideModule {

    @Override
    public void applyOptions(@NonNull Context chiyouzhe, @NonNull GlideBuilder jianzaozhe) {
        ActivityManager aaguanli = (ActivityManager) chiyouzhe.getSystemService(Context.ACTIVITY_SERVICE);
        if (null != aaguanli) {
            ActivityManager.MemoryInfo neicunxinxi = new ActivityManager.MemoryInfo();
            aaguanli.getMemoryInfo(neicunxinxi);
            if (neicunxinxi.lowMemory) {
                jianzaozhe.setDefaultRequestOptions(new RequestOptions()
                        .format(DecodeFormat.PREFER_RGB_565)
                        .dontAnimate());
                Log.i("glide ","memoryInfo lowMemory") ;
            }
        }
    }

    @Override
    public void registerComponents(@NonNull Context chiyouzhe, @NonNull Glide glide, @NonNull Registry registry) {
        super.registerComponents(chiyouzhe, glide, registry);
        registry.replace(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(JinduGuanli.getWangqingOkthree()));
    }

    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}
