package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.tugelideimage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.tugelideimage.xiazaijindu.JinduJianting;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.tugelideimage.xiazaijindu.JinduGuanli;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.tugelideimage.zhuanhuazhuanbian.RoundedCornersTransformation;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.DrawableImageViewTarget;
import com.bumptech.glide.request.transition.Transition;

import java.lang.ref.WeakReference;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TupianGelideXiazaiqi {

    private static final String ANZHUO_YUAN = "android.resource://";
    private static final String FENGEXIAN = "/";

    private TupianGelideXiazaiqi tupianGelideXiazaiqi;
    private GlideRequest<Drawable> tupianQingqiu;
    private WeakReference<ImageView> tupianRuoyinyong;
    private String url;

    public static TupianGelideXiazaiqi chushihua(ImageView imageView) {
//        synchronized (GlideImageLoader.class) {
//            if (instance == null) {
//                instance = new GlideImageLoader(imageView);
//            }
//        }
//        return instance;
        return  new TupianGelideXiazaiqi(imageView);
    }



    private TupianGelideXiazaiqi(@NonNull ImageView imageView) {
        tupianRuoyinyong = new WeakReference<>(imageView);
        tupianQingqiu = GlideApp.with(getChiyouzhe()).asDrawable();
    }


    //get tupian view
    private ImageView getTupianShitu() {
        if (tupianRuoyinyong != null) {
            return tupianRuoyinyong.get();
        }
        return null;
    }
    //getContext
    private Context getChiyouzhe() {
        if (getTupianShitu() != null) {
            return getTupianShitu().getContext();
        }
        return null;
    }
    

    public GlideRequest getTupianQingqiu() {
        if (tupianQingqiu == null) {
            tupianQingqiu = GlideApp.with(getChiyouzhe()).asDrawable();
        }
        return tupianQingqiu;
    }




    @SuppressLint("CheckResult")
    public TupianGelideXiazaiqi yingyong(RequestOptions options){
          getTupianQingqiu().apply(options);
          return this;
        
    }




    @SuppressLint("CheckResult")
    public TupianGelideXiazaiqi zhongxin() {
          getTupianQingqiu().centerCrop();
          return this;
    }

    @SuppressLint("CheckResult")
    public TupianGelideXiazaiqi shipeizhongxin() {
            getTupianQingqiu().fitCenter();
            return  this;
    }

    @SuppressLint("CheckResult")
    public TupianGelideXiazaiqi yingpanhuancun(@NonNull DiskCacheStrategy strategy) {
         getTupianQingqiu().diskCacheStrategy(strategy);
         return this;
    }

    @SuppressLint("CheckResult")
    public TupianGelideXiazaiqi placeaeggggholder(@DrawableRes int resId) {
         getTupianQingqiu().placeholder(resId);
         return this;
    }

    @SuppressLint("CheckResult")
    public TupianGelideXiazaiqi cuowu(@DrawableRes int resId) {
         getTupianQingqiu().error(resId);
         return this;
    }

    @SuppressLint("CheckResult")
    public TupianGelideXiazaiqi shibaifanhui(@DrawableRes int resId) {
         getTupianQingqiu().fallback(resId);
         return this;
    }

    @SuppressLint("CheckResult")
    public TupianGelideXiazaiqi buyaodonghua() {
         getTupianQingqiu().dontTransform();
         return this;
    }

    @SuppressLint("CheckResult")
    public TupianGelideXiazaiqi buyaozhaunyi() {
         getTupianQingqiu().dontTransform();
         return  this;

    }

    private GlideRequest<Drawable> xaizaiTupian(Object wanduixiang) {
        if (wanduixiang instanceof String) {
            url = (String) wanduixiang;
        }
        return tupianQingqiu.load(wanduixiang);
    }

    private TupianGelideXiazaiqi xiazaiXiazai(@DrawableRes int resId, @DrawableRes int placeholder, @DrawableRes int errHolder, @NonNull Transformation<Bitmap> transformation) {
        return xaizaiTupian(resId2Uri(resId), placeholder,errHolder, transformation);
    }

    private TupianGelideXiazaiqi xiazaiXiazai(@DrawableRes int resId, @DrawableRes int placeholder, @DrawableRes int errHolder, boolean isCenterCropWithRadius, @NonNull Transformation<Bitmap> transformation) {
        return xaizaiTupian(resId2Uri(resId), placeholder,errHolder, isCenterCropWithRadius, transformation);
    }

    private Uri resId2Uri(@DrawableRes int resId) {
        return Uri.parse(ANZHUO_YUAN + getChiyouzhe().getPackageName() + FENGEXIAN + resId);
    }




    public void xiazaiXiazai(String url) {
        xiazaiXiazai(url, 0);
    }

    public void xiazaiXiazai(String url, @DrawableRes int placeholder) {
        xiazaiXiazai(url, placeholder,0);
    }

    public void xiazaiXiazai(String url, @DrawableRes int placeholder, @DrawableRes int errHolder) {
        xiazaiXiazai(url, placeholder,errHolder, 0);
    }

    public void xiazaiXiazai(String url, @DrawableRes int placeholder, @DrawableRes int errHolder, int radius) {
        xiazaiXiazai(url, placeholder,errHolder, radius, null);
    }

    public void xiazaiXiazai(String url, @DrawableRes int placeholder, @DrawableRes int errHolder, RoundedCornersTransformation.CornerType cornerType, int radius) {
        xiazaiXiazai(url, placeholder,errHolder, cornerType, radius, null);
    }


    public void xiazaiXiazai(String url, @DrawableRes int placeholder, @DrawableRes int errHolder, int radius, boolean isCenterCropWithRadius) {
        xiazaiXiazai(url, placeholder,errHolder, radius, isCenterCropWithRadius, null);
    }

    public void xiazaiXiazai(String url, @DrawableRes int placeholder, @DrawableRes int errHolder, RoundedCornersTransformation.CornerType cornerType, int radius, boolean isCenterCropWithRadius) {
        xiazaiXiazai(url, placeholder,errHolder, cornerType, radius, isCenterCropWithRadius,null);
    }

    public void xiazaiXiazai(String url, @DrawableRes int placeholder, @DrawableRes int errHolder, int radius, JinduJianting jinduJianting) {
        xiazaiXiazai(url, placeholder,errHolder,  new RoundedCornersTransformation(radius,0), jinduJianting);
    }

    public void xiazaiXiazai(String url, @DrawableRes int placeholder, @DrawableRes int errHolder, RoundedCornersTransformation.CornerType cornerType, int radius, JinduJianting jinduJianting) {
        xiazaiXiazai(url, placeholder,errHolder,  new RoundedCornersTransformation(radius, 0, cornerType), jinduJianting);
    }

    public void xiazaiXiazai(String url, @DrawableRes int placeholder, @DrawableRes int errHolder, int radius, boolean isCenterCropWithRadius, JinduJianting jinduJianting) {
        xiazaiXiazai(url, placeholder,errHolder,  isCenterCropWithRadius, new RoundedCornersTransformation(radius,0), jinduJianting);
    }
    public void xiazaiXiazai(String url, @DrawableRes int placeholder, @DrawableRes int errHolder, RoundedCornersTransformation.CornerType cornerType, int radius, boolean isCenterCropWithRadius, JinduJianting jinduJianting) {
        xiazaiXiazai(url, placeholder,errHolder,  isCenterCropWithRadius, new RoundedCornersTransformation(radius,0,cornerType), jinduJianting);
    }
    public void xiazaiXiazai(String url, JinduJianting jinduJianting) {
        xiazaiXiazai(url, 0, 0, null, jinduJianting);
    }

    public void xiazaiXiazai(Object obj, @DrawableRes int placeholder, @DrawableRes int errHolder, Transformation<Bitmap> transformation, JinduJianting jinduJianting) {
       listener(obj, jinduJianting).xaizaiTupian(obj, placeholder,errHolder, transformation);
    }

    public void xiazaiXiazai(Object obj, @DrawableRes int placeholder, @DrawableRes int errHolder, boolean isCenterCropWithRadius, Transformation<Bitmap> transformation, JinduJianting jinduJianting) {
        listener(obj, jinduJianting).xaizaiTupian(obj, placeholder,errHolder, isCenterCropWithRadius, transformation);
    }

    public void xiazaiXiazai(Object obj, @DrawableRes int placeholder, @DrawableRes int errHolder, Transformation<Bitmap> transformation) {
        xaizaiTupian(obj, placeholder,errHolder, transformation);
    }

    public void xiazaiXiazai(Object obj, @DrawableRes int placeholder, @DrawableRes int errHolder, boolean isCenterCropWithRadius, Transformation<Bitmap> transformation) {
        xaizaiTupian(obj, placeholder,errHolder, isCenterCropWithRadius, transformation);
    }

    public void loadCircle(String url) {
        loadCircle(url, 0,0);
    }

    public void loadCircle(String url, @DrawableRes int placeholder,@DrawableRes int errHolder) {
        loadCircle(url, placeholder,errHolder, null);
    }

    public void loadCircle(String url, @DrawableRes int placeholder,@DrawableRes int errHolder, JinduJianting jinduJianting) {
        xiazaiXiazai(url, placeholder,errHolder, new CircleCrop(), jinduJianting);
    }

    public void loadDrawable(@DrawableRes int resId) {
        loadDrawable(resId, 0);
    }

    public void loadDrawable(@DrawableRes int resId, @DrawableRes int placeholder) {
        loadDrawable(resId, placeholder, null);
    }

    public void loadDrawable(@DrawableRes int resId, @DrawableRes int placeholder, @NonNull Transformation<Bitmap> transformation) {
       xiazaiXiazai(resId, placeholder,0, transformation);
    }



    private TupianGelideXiazaiqi xaizaiTupian(Object obj, @DrawableRes int placeholder, @DrawableRes int errHolder, Transformation<Bitmap> transformation) {
        return xaizaiTupian(obj, placeholder, errHolder, false, transformation);
    }

    private TupianGelideXiazaiqi xaizaiTupian(Object obj, @DrawableRes int placeholder, @DrawableRes int errHolder, boolean isCenterCropWithRadius, Transformation<Bitmap> transformation) {
        tupianQingqiu = xaizaiTupian(obj);
        if (placeholder != 0) {
            tupianQingqiu = tupianQingqiu.placeholder(placeholder);
        }

        if (errHolder != 0) {
            tupianQingqiu = tupianQingqiu.error(errHolder);
        }

        if (transformation != null) {
            if(isCenterCropWithRadius) tupianQingqiu = tupianQingqiu.transform(new CenterCrop());
            else tupianQingqiu = tupianQingqiu.transform(transformation);
        }

        tupianQingqiu.into(new GlideRequestTarget(getTupianShitu()));
        return this;
    }

    private TupianGelideXiazaiqi listener(Object obj, JinduJianting jinduJianting) {
        if (obj instanceof String) {
            url = (String) obj;
        }
        JinduGuanli.attachJianting(url, jinduJianting);
        return this;
    }

   

    public String getUrl() {
        return url;
    }


    private class GlideRequestTarget extends DrawableImageViewTarget {
        GlideRequestTarget(ImageView view) {
            super(view);
        }

        @Override
        public void onLoadStarted(Drawable placeholder) {
            super.onLoadStarted(placeholder);
        }

        @Override
        public void onLoadFailed(@Nullable Drawable errorDrawable) {
            JinduJianting jinduJianting = JinduGuanli.getProgressListener(getUrl());
            if (jinduJianting != null) {
                jinduJianting.onProgress(true, 0, 0, 0);
                JinduGuanli.deltachJianting(getUrl());
            }
            super.onLoadFailed(errorDrawable);
        }

        @Override
        public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
            JinduJianting jinduJianting = JinduGuanli.getProgressListener(getUrl());
            if (jinduJianting != null) {
                jinduJianting.onProgress(true, 100, 0, 0);
                JinduGuanli.deltachJianting(getUrl());
            }
            super.onResourceReady(resource, transition);
        }
    }
}
