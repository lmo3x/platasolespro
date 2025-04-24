package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.myselfkongjian;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;

import java.util.ArrayList;
import java.util.List;

/**
 * han 2023.5.9
 */
public class GunlunZidingyiKongjian extends ScrollView {
    public static final String TTAGTT = GunlunZidingyiKongjian.class.getSimpleName();

    public static class OnGunlunJianting {
        public void onXuanzeOne(int xaunzesuoyin, String item) {
        }
    }


    private Context chiyouZhe;
//    private ScrollView scrollView;

    private LinearLayout bujuView;

    public GunlunZidingyiKongjian(Context chiyouZhe) {
        super(chiyouZhe);
        chushihuaKongjian(chiyouZhe);
    }

    public GunlunZidingyiKongjian(Context chiyouZhe, AttributeSet attrs) {
        super(chiyouZhe, attrs);
        chushihuaKongjian(chiyouZhe);
    }

    public GunlunZidingyiKongjian(Context chiyouZhe, AttributeSet attrs, int defStyle) {
        super(chiyouZhe, attrs, defStyle);
        chushihuaKongjian(chiyouZhe);
    }

    //    String[] items;
    List<String> allTiaomusList;

    private List<String> getAllTiaomusList() {
        return allTiaomusList;
    }

    public void setAllTiaomusList(List<String> list) {
        if (null == allTiaomusList) {
            allTiaomusList = new ArrayList<String>();
        }
        allTiaomusList.clear();
        allTiaomusList.addAll(list);

        // 前面和后面补全
        for (int i = 0; i < pianyiLiang; i++) {
            allTiaomusList.add(0, "");
            allTiaomusList.add("");
        }

        chushiHuashuju();

    }


    public static final int GUANBI_INDEX = 1;
    int pianyiLiang = GUANBI_INDEX; // 偏移量（需要在最前面和最后面补全）

    public int getPianyiLiang() {
        return pianyiLiang;
    }

    public void setPianyiLiang(int pianyiLiang) {
        this.pianyiLiang = pianyiLiang;
    }

    int onePageShuliang; // 每页显示的数量

    int xaunzeSuoyin = 1;


    private void chushihuaKongjian(Context chiyouzhe) {
        this.chiyouZhe = chiyouzhe;

//        scrollView = ((ScrollView)this.getParent());
//        Log.d(TAG, "scrollview: " + scrollView);
        Log.d(TTAGTT, "parent: " + this.getParent());
//        this.setOrientation(VERTICAL);
        this.setVerticalScrollBarEnabled(false);

        bujuView = new LinearLayout(chiyouzhe);
        bujuView.setOrientation(LinearLayout.VERTICAL);
        setOverScrollMode(OVER_SCROLL_NEVER);
        this.addView(bujuView);

        gundongRenwu = new Runnable() {

            public void run() {

                int newY = getScrollY();
                if (YzhouChushihua - newY == 0) { // stopped
                    final int remainder = YzhouChushihua % itemHeight;
                    final int divided = YzhouChushihua / itemHeight;
//                    Log.d(TAG, "initialY: " + initialY);
//                    Log.d(TAG, "remainder: " + remainder + ", divided: " + divided);
                    if (remainder == 0) {
                        xaunzeSuoyin = divided + pianyiLiang;

                        onXuanzhongHuidiaoJianting();
                    } else {
                        if (remainder > itemHeight / 2) {
                            GunlunZidingyiKongjian.this.post(new Runnable() {
                                @Override
                                public void run() {
                                    GunlunZidingyiKongjian.this.smoothScrollTo(0, YzhouChushihua - remainder + itemHeight);
                                    xaunzeSuoyin = divided + pianyiLiang + 1;
                                    onXuanzhongHuidiaoJianting();
                                }
                            });
                        } else {
                            GunlunZidingyiKongjian.this.post(new Runnable() {
                                @Override
                                public void run() {
                                    GunlunZidingyiKongjian.this.smoothScrollTo(0, YzhouChushihua - remainder);
                                    xaunzeSuoyin = divided + pianyiLiang;
                                    onXuanzhongHuidiaoJianting();
                                }
                            });
                        }


                    }


                } else {
                    YzhouChushihua = getScrollY();
                    GunlunZidingyiKongjian.this.postDelayed(gundongRenwu, jianchaNesss);
                }
            }
        };


    }

    int YzhouChushihua;

    Runnable gundongRenwu;
    int jianchaNesss = 50;

    public void qidongRenwu() {

        YzhouChushihua = getScrollY();
        this.postDelayed(gundongRenwu, jianchaNesss);
    }

    private void chushiHuashuju() {
        onePageShuliang = pianyiLiang * 2 + 1;

        for (String item : allTiaomusList) {
            bujuView.addView(chuangjianShitu(item));
        }

        shuaXintiaoMu(0);
    }

    int itemHeight = 0;

    private TextView chuangjianShitu(String tiaomu) {
        TextView wenan = new TextView(chiyouZhe);
        wenan.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        wenan.setSingleLine(true);
        wenan.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        wenan.setText(tiaomu);
        wenan.setGravity(Gravity.CENTER);
        int padding = zhuanhuaDpdaoPx(22);
        wenan.setPadding(padding, padding, padding, padding);
        if (0 == itemHeight) {
            itemHeight = dedaoGaodu(wenan);
            Log.d(TTAGTT, "itemHeight: " + itemHeight);
            bujuView.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, itemHeight * onePageShuliang));
            ViewGroup.LayoutParams lp = this.getLayoutParams();
            this.setLayoutParams(new LinearLayout.LayoutParams(lp.width, itemHeight * onePageShuliang));
        }
        return wenan;
    }


    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);

//        Log.d(TAG, "l: " + l + ", t: " + t + ", oldl: " + oldl + ", oldt: " + oldt);

//        try {
//            Field field = ScrollView.class.getDeclaredField("mScroller");
//            field.setAccessible(true);
//            OverScroller mScroller = (OverScroller) field.get(this);
//
//
//            if(mScroller.isFinished()){
//                Log.d(TAG, "isFinished...");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        shuaXintiaoMu(t);

        if (t > oldt) {
//            Log.d(TAG, "向下滚动");
            xaingdongXianghou = XAINGXIA_GUNDONG;
        } else {
//            Log.d(TAG, "向上滚动");
            xaingdongXianghou = XIANGSHANG_GUNDONG;

        }


    }

    //shuaxin itemview
    private void shuaXintiaoMu(int y) {
        int weizhi = y / itemHeight + pianyiLiang;
        int baifenbitishi = y % itemHeight;
        int zhanbi = y / itemHeight;

        if (baifenbitishi == 0) {
            weizhi = zhanbi + pianyiLiang;
        } else {
            if (baifenbitishi > itemHeight / 2) {
                weizhi = zhanbi + pianyiLiang + 1;
            }

//            if(remainder > itemHeight / 2){
//                if(scrollDirection == SCROLL_DIRECTION_DOWN){
//                    position = divided + offset;
//                    Log.d(TAG, ">down...position: " + position);
//                }else if(scrollDirection == SCROLL_DIRECTION_UP){
//                    position = divided + offset + 1;
//                    Log.d(TAG, ">up...position: " + position);
//                }
//            }else{
////                position = y / itemHeight + offset;
//                if(scrollDirection == SCROLL_DIRECTION_DOWN){
//                    position = divided + offset;
//                    Log.d(TAG, "<down...position: " + position);
//                }else if(scrollDirection == SCROLL_DIRECTION_UP){
//                    position = divided + offset + 1;
//                    Log.d(TAG, "<up...position: " + position);
//                }
//            }
//        }

//        if(scrollDirection == SCROLL_DIRECTION_DOWN){
//            position = divided + offset;
//        }else if(scrollDirection == SCROLL_DIRECTION_UP){
//            position = divided + offset + 1;
        }

        int ziviewShuliang = bujuView.getChildCount();
        for (int i = 0; i < ziviewShuliang; i++) {
            TextView tiaomuView = (TextView) bujuView.getChildAt(i);
            TextPaint wenziHuabi = tiaomuView.getPaint();
            if (null == tiaomuView) {
                return;
            }
            if (weizhi == i) {
                tiaomuView.setTextColor(getResources().getColor(R.color.sezhi_argb_d9000000));
                wenziHuabi.setFakeBoldText(true);
                tiaomuView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26);
            } else {
                tiaomuView.setTextColor(getResources().getColor(R.color.sezhi_argb_73000000));
                tiaomuView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
                wenziHuabi.setFakeBoldText(false);
            }
        }
    }

    /**
     * 获取选中区域的边界
     */
    int[] xuanzhognQuyuBianjie;

    private int[] jisaunBiajie() {
        if (null == xuanzhognQuyuBianjie) {
            xuanzhognQuyuBianjie = new int[2];
            xuanzhognQuyuBianjie[0] = itemHeight * pianyiLiang;
            xuanzhognQuyuBianjie[1] = itemHeight * (pianyiLiang + 1);
        }
        return xuanzhognQuyuBianjie;
    }


    private int xaingdongXianghou = -1;
    private static final int XIANGSHANG_GUNDONG = 0;
    private static final int XAINGXIA_GUNDONG = 1;

    Paint huabi;
    int shituKuandu;

    @Override
    public void setBackgroundDrawable(Drawable beijing) {

        if (shituKuandu == 0) {
            shituKuandu = ((Activity) chiyouZhe).getWindowManager().getDefaultDisplay().getWidth();
            Log.d(TTAGTT, "viewWidth: " + shituKuandu);
        }

        if (null == huabi) {
            huabi = new Paint();
            huabi.setColor(getResources().getColor(R.color.sezhi_argb_BEC8E1));
            huabi.setStrokeWidth(zhuanhuaDpdaoPx(1f));
        }

        beijing = new Drawable() {
            @Override
            public void draw(Canvas canvas) {
                canvas.drawLine(zhuanhuaDpdaoPx(22f), jisaunBiajie()[0], shituKuandu - zhuanhuaDpdaoPx(22f), jisaunBiajie()[0], huabi);
                canvas.drawLine(zhuanhuaDpdaoPx(22f), jisaunBiajie()[1], shituKuandu - zhuanhuaDpdaoPx(22f), jisaunBiajie()[1], huabi);
            }

            @Override
            public void setAlpha(int alpha) {

            }

            @Override
            public void setColorFilter(ColorFilter cf) {

            }

            @Override
            public int getOpacity() {
                return PixelFormat.OPAQUE;
            }
        };


        super.setBackgroundDrawable(beijing);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log.d(TTAGTT, "w: " + w + ", h: " + h + ", oldw: " + oldw + ", oldh: " + oldh);
        shituKuandu = w;
        setBackgroundDrawable(null);
    }

    /**
     * 选中回调
     */
    private void onXuanzhongHuidiaoJianting() {
        if (null != onGunlunJianting) {
            onGunlunJianting.onXuanzeOne(xaunzeSuoyin - pianyiLiang, allTiaomusList.get(xaunzeSuoyin));
        }

    }

    public void sehzhiXuanze(int WEIZHI) {
        if (WEIZHI >= 0) {
            final int p = WEIZHI;
            xaunzeSuoyin = p + pianyiLiang;
            this.post(new Runnable() {
                @Override
                public void run() {
                    GunlunZidingyiKongjian.this.smoothScrollTo(0, p * itemHeight);
                }
            });
        }
    }

    public String getxaunzeSuoyinItem() {
        return allTiaomusList.get(xaunzeSuoyin);
    }

    public int getxaunzeSuoyin() {
        return xaunzeSuoyin - pianyiLiang;
    }


    @Override
    public void fling(int velocityY) {
        super.fling(velocityY / 3);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_UP) {

            qidongRenwu();
        }
        return super.onTouchEvent(ev);
    }

    private OnGunlunJianting onGunlunJianting;

    public OnGunlunJianting getOnWheelViewListener() {
        return onGunlunJianting;
    }

    public void setOnOnGunlunJianting(OnGunlunJianting onGunlunJianting) {
        this.onGunlunJianting = onGunlunJianting;
    }

    //dip to px
    private int zhuanhuaDpdaoPx(float dpValue) {
        final float scale = chiyouZhe.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    //get measureheight
    private int dedaoGaodu(View view) {
        int width = MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED);
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        view.measure(width, expandSpec);
        return view.getMeasuredHeight();
    }

}
