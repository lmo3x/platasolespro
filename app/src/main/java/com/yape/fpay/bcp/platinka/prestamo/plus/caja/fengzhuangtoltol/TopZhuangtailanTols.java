package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;

/**
 * Created by han on 2023.5.8.
 */
public class TopZhuangtailanTols {

    public static final int ZHUANGTAILAN_TOUMINGDU = 0;
    private static final int ZHAUNGTAILAN_SHITUID = R.id.zhuangtailan_gongjuid_view;
    private static final int BANTOUMING_SHITUID = R.id.zhuangtailan_touming_view;
    private static final int BIANYILIANG_KEY = -123;

    /**
     * 设置状态栏颜色
     *
     * @param accttyyy 需要设置的 activity
     * @param yanse    状态栏颜色值
     */
    public static void shezhiBaryanse(Activity accttyyy, @ColorInt int yanse) {
        shezhiBaryanse(accttyyy, yanse, ZHUANGTAILAN_TOUMINGDU);
    }

    /**
     * 设置状态栏颜色
     *
     * @param accttyyy       需要设置的activity
     * @param yanse          状态栏颜色值
     * @param statusBarAlpha 状态栏透明度
     */

    public static void shezhiBaryanse(Activity accttyyy, @ColorInt int yanse, @IntRange(from = 0, to = 255) int statusBarAlpha) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            accttyyy.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            accttyyy.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            accttyyy.getWindow().setStatusBarColor(jisuanZhuangtailanYanse(yanse, statusBarAlpha));
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            accttyyy.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            ViewGroup zongfubujurongqi = (ViewGroup) accttyyy.getWindow().getDecorView();
            View zhaungtailanshitu = zongfubujurongqi.findViewById(ZHAUNGTAILAN_SHITUID);
            if (zhaungtailanshitu != null) {
                if (zhaungtailanshitu.getVisibility() == View.GONE) {
                    zhaungtailanshitu.setVisibility(View.VISIBLE);
                }
                zhaungtailanshitu.setBackgroundColor(jisuanZhuangtailanYanse(yanse, statusBarAlpha));
            } else {
                zongfubujurongqi.addView(chuangjianZhuangtailanView(accttyyy, yanse, statusBarAlpha));
            }
            shezhiGenBuju(accttyyy);
        }
    }

    /**
     * 为滑动返回界面设置状态栏颜色
     *
     * @param acctyyy 需要设置的activity
     * @param color    状态栏颜色值
     */
    public static void shezhiHuadongfanhuiBaryan(Activity acctyyy, int color) {
        shezhiHuadongfanhuiBaryan(acctyyy, color, ZHUANGTAILAN_TOUMINGDU);
    }

    /**
     * 为滑动返回界面设置状态栏颜色
     *
     * @param aaccttyyy       需要设置的activity
     * @param color          状态栏颜色值
     * @param statusBarAlpha 状态栏透明度
     */
    public static void shezhiHuadongfanhuiBaryan(Activity aaccttyyy, @ColorInt int color,
                                                 @IntRange(from = 0, to = 255) int statusBarAlpha) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            ViewGroup shituZu = (aaccttyyy.findViewById(android.R.id.content));
            View genbuju = shituZu.getChildAt(0);
            int zhuangtaiLangaodu = huoquZhuangtaialnGaodu(aaccttyyy);
            if (genbuju != null && genbuju instanceof CoordinatorLayout) {
                final CoordinatorLayout coordinatorLayout = (CoordinatorLayout) genbuju;
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    coordinatorLayout.setFitsSystemWindows(false);
                    shituZu.setBackgroundColor(jisuanZhuangtailanYanse(color, statusBarAlpha));
                    boolean shifouYaolayou = shituZu.getPaddingTop() < zhuangtaiLangaodu;
                    if (shifouYaolayou) {
                        shituZu.setPadding(0, zhuangtaiLangaodu, 0, 0);
                        coordinatorLayout.post(new Runnable() {
                            @Override
                            public void run() {
                                coordinatorLayout.requestLayout();
                            }
                        });
                    }
                } else {
                    coordinatorLayout.setStatusBarBackgroundColor(jisuanZhuangtailanYanse(color, statusBarAlpha));
                }
            } else {
                shituZu.setPadding(0, zhuangtaiLangaodu, 0, 0);
                shituZu.setBackgroundColor(jisuanZhuangtailanYanse(color, statusBarAlpha));
            }
            shezhiWindowTouming(aaccttyyy);
        }
    }

    /**
     * 设置状态栏纯色 不加半透明效果
     *
     * @param aacctty 需要设置的 activity
     * @param color    状态栏颜色值
     */
    public static void shezhiBarYanseWithoutBantouming(Activity aacctty, @ColorInt int color) {
        shezhiBaryanse(aacctty, color, 0);
    }

    /**
     * 设置状态栏颜色(5.0以下无半透明效果,不建议使用)
     *
     * @param accyytt 需要设置的 activity
     * @param cccyanse    状态栏颜色值
     */
    @Deprecated
    public static void sehzhiBarCoyanse(Activity accyytt, @ColorInt int cccyanse) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        shezhiZhuangtailanTouming(accyytt);
        ViewGroup shituZu = accyytt.findViewById(android.R.id.content);
        // 移除半透明矩形,以免叠加
        View zhaungtaishitu = shituZu.findViewById(ZHAUNGTAILAN_SHITUID);
        if (zhaungtaishitu != null) {
            if (zhaungtaishitu.getVisibility() == View.GONE) {
                zhaungtaishitu.setVisibility(View.VISIBLE);
            }
            zhaungtaishitu.setBackgroundColor(cccyanse);
        } else {
            shituZu.addView(chuangjianZhuangtailanView(accyytt, cccyanse));
        }
        shezhiGenBuju(accyytt);
    }

    /**
     * 使状态栏半透明
     * <p>
     * 适用于图片作为背景的界面,此时需要图片填充到状态栏
     *
     * @param accastig 需要设置的activity
     */
    public static void shezhiBantoumingBar(Activity accastig) {
        shezhiBantoumingBar(accastig, ZHUANGTAILAN_TOUMINGDU);
    }

    /**
     * 使状态栏半透明
     * <p>
     * 适用于图片作为背景的界面,此时需要图片填充到状态栏
     *
     * @param aactutugn       需要设置的activity
     * @param statusBarAlpha 状态栏透明度
     */
    public static void shezhiBantoumingBar(Activity aactutugn, @IntRange(from = 0, to = 255) int statusBarAlpha) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        sehzhiBarQuantouming(aactutugn);
        tianjiaBantoumingTiao(aactutugn, statusBarAlpha);
    }

    /**
     * 针对根布局是 CoordinatorLayout, 使状态栏半透明
     * <p>
     * 适用于图片作为背景的界面,此时需要图片填充到状态栏
     *
     * @param acythgn       需要设置的activity
     * @param toumingzhi 状态栏透明度
     */
    public static void shezhiCoorBjuBantouming(Activity acythgn, @IntRange(from = 0, to = 255) int toumingzhi) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        shezhiZhuangtailanTouming(acythgn);
        tianjiaBantoumingTiao(acythgn, toumingzhi);
    }

    /**
     * 设置状态栏全透明
     *
     * @param activity 需要设置的activity
     */
    public static void sehzhiBarQuantouming(Activity activity) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        shezhiZhuangtailanTouming(activity);
        shezhiGenBuju(activity);
    }

    /**
     * 使状态栏透明(5.0以上半透明效果,不建议使用)
     * <p>
     * 适用于图片作为背景的界面,此时需要图片填充到状态栏
     *
     * @param aaacytytyt 需要设置的activity
     */
    @Deprecated
    public static void shezhiToumingBarshhs(Activity aaacytytyt) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            // 设置状态栏透明
            aaacytytyt.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            shezhiGenBuju(aaacytytyt);
        }
    }

    /**
     * 为DrawerLayout 布局设置状态栏变色
     *
     * @param aactytyf     需要设置的activity
     * @param drawerLayout DrawerLayout
     * @param color        状态栏颜色值
     */
    public static void shezhiDrawarBjuYanse(Activity aactytyf, DrawerLayout drawerLayout, @ColorInt int color) {
        shezhiDrawarBjuYanse(aactytyf, drawerLayout, color, ZHUANGTAILAN_TOUMINGDU);
    }

    /**
     * 为DrawerLayout 布局设置状态栏颜色,纯色
     *
     * @param aaccttyhuii     需要设置的activity
     * @param dddlll DrawerLayout
     * @param color        状态栏颜色值
     */
    public static void shezhiDrawarBjuBianYanse(Activity aaccttyhuii, DrawerLayout dddlll, @ColorInt int color) {
        shezhiDrawarBjuYanse(aaccttyhuii, dddlll, color, 0);
    }

    /**
     * 为DrawerLayout 布局设置状态栏变色
     *
     * @param aacfyyy       需要设置的activity
     * @param drawerLayout   DrawerLayout
     * @param color          状态栏颜色值
     * @param statusBarAlpha 状态栏透明度
     */
    public static void shezhiDrawarBjuYanse(Activity aacfyyy, DrawerLayout drawerLayout, @ColorInt int color,
                                            @IntRange(from = 0, to = 255) int statusBarAlpha) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            aacfyyy.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            aacfyyy.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            aacfyyy.getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else {
            aacfyyy.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        // 生成一个状态栏大小的矩形
        // 添加 statusBarView 到布局中
        ViewGroup shituZu = (ViewGroup) drawerLayout.getChildAt(0);
        View zhuangtailaiShitu = shituZu.findViewById(ZHAUNGTAILAN_SHITUID);
        if (zhuangtailaiShitu != null) {
            if (zhuangtailaiShitu.getVisibility() == View.GONE) {
                zhuangtailaiShitu.setVisibility(View.VISIBLE);
            }
            zhuangtailaiShitu.setBackgroundColor(color);
        } else {
            shituZu.addView(chuangjianZhuangtailanView(aacfyyy, color), 0);
        }
        // 内容布局不是 LinearLayout 时,设置padding top
        if (!(shituZu instanceof LinearLayout) && shituZu.getChildAt(1) != null) {
            shituZu.getChildAt(1)
                    .setPadding(shituZu.getPaddingLeft(), huoquZhuangtaialnGaodu(aacfyyy) + shituZu.getPaddingTop(),
                            shituZu.getPaddingRight(), shituZu.getPaddingBottom());
        }
        // 设置属性
        sehzhiDLzhuangtailanShuxing(drawerLayout, shituZu);
        tianjiaBantoumingTiao(aacfyyy, statusBarAlpha);
    }

    /**
     * 设置 DrawerLayout 属性
     *
     * @param drawerLayout              DrawerLayout
     * @param drawerLayoutContentLayout DrawerLayout 的内容布局
     */
    private static void sehzhiDLzhuangtailanShuxing(DrawerLayout drawerLayout, ViewGroup drawerLayoutContentLayout) {
        ViewGroup dddrrll = (ViewGroup) drawerLayout.getChildAt(1);
        drawerLayout.setFitsSystemWindows(false);
        drawerLayoutContentLayout.setFitsSystemWindows(false);
        drawerLayoutContentLayout.setClipToPadding(true);
        dddrrll.setFitsSystemWindows(false);
    }

    /**
     * 为DrawerLayout 布局设置状态栏变色(5.0以下无半透明效果,不建议使用)
     *
     * @param actyiv     需要设置的activity
     * @param ddrrll DrawerLayout
     * @param color        状态栏颜色值
     */
    @Deprecated
    public static void shezhiDLzhuangtailanYnaseDiff(Activity actyiv, DrawerLayout ddrrll, @ColorInt int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            actyiv.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            // 生成一个状态栏大小的矩形
            ViewGroup neirongBuju = (ViewGroup) ddrrll.getChildAt(0);
            View zhuangtailanShitu = neirongBuju.findViewById(ZHAUNGTAILAN_SHITUID);
            if (zhuangtailanShitu != null) {
                if (zhuangtailanShitu.getVisibility() == View.GONE) {
                    zhuangtailanShitu.setVisibility(View.VISIBLE);
                }
                zhuangtailanShitu.setBackgroundColor(jisuanZhuangtailanYanse(color, ZHUANGTAILAN_TOUMINGDU));
            } else {
                // 添加 statusBarView 到布局中
                neirongBuju.addView(chuangjianZhuangtailanView(actyiv, color), 0);
            }
            // 内容布局不是 LinearLayout 时,设置padding top
            if (!(neirongBuju instanceof LinearLayout) && neirongBuju.getChildAt(1) != null) {
                neirongBuju.getChildAt(1).setPadding(0, huoquZhuangtaialnGaodu(actyiv), 0, 0);
            }
            // 设置属性
            sehzhiDLzhuangtailanShuxing(ddrrll, neirongBuju);
        }
    }

    /**
     * 为 DrawerLayout 布局设置状态栏透明
     *
     * @param aacyt     需要设置的activity
     * @param ddlllyy DrawerLayout
     */
    public static void shezhiDlzhuangtailanTouming(Activity aacyt, DrawerLayout ddlllyy) {
        shezhiDlzhuangtailanTouming(aacyt, ddlllyy, ZHUANGTAILAN_TOUMINGDU);
    }

    /**
     * 为 DrawerLayout 布局设置状态栏透明
     *
     * @param aacctytyt     需要设置的activity
     * @param dddrrl DrawerLayout
     */
    public static void shezhiDlzhuangtailanTouming(Activity aacctytyt, DrawerLayout dddrrl,
                                                   @IntRange(from = 0, to = 255) int statusBarAlpha) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        shezhiDlzhuangtailanToumingsss(aacctytyt, dddrrl);
        tianjiaBantoumingTiao(aacctytyt, statusBarAlpha);
    }

    /**
     * 为 DrawerLayout 布局设置状态栏透明
     *
     * @param aaccttyy     需要设置的activity
     * @param ddrrrlll DrawerLayout
     */
    public static void shezhiDlzhuangtailanToumingsss(Activity aaccttyy, DrawerLayout ddrrrlll) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            aaccttyy.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            aaccttyy.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            aaccttyy.getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else {
            aaccttyy.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        ViewGroup shituBju = (ViewGroup) ddrrrlll.getChildAt(0);
        // 内容布局不是 LinearLayout 时,设置padding top
        if (!(shituBju instanceof LinearLayout) && shituBju.getChildAt(1) != null) {
            shituBju.getChildAt(1).setPadding(0, huoquZhuangtaialnGaodu(aaccttyy), 0, 0);
        }

        // 设置属性
        sehzhiDLzhuangtailanShuxing(ddrrrlll, shituBju);
    }

    /**
     * 为 DrawerLayout 布局设置状态栏透明(5.0以上半透明效果,不建议使用)
     *
     * @param acty     需要设置的activity
     * @param drrlll DrawerLayout
     */
    @Deprecated
    public static void shezhiDLzhuangtailanToumingSs(Activity acty, DrawerLayout drrlll) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            // 设置状态栏透明
            acty.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            // 设置内容布局属性
            ViewGroup contentLayout = (ViewGroup) drrlll.getChildAt(0);
            contentLayout.setFitsSystemWindows(true);
            contentLayout.setClipToPadding(true);
            // 设置抽屉布局属性
            ViewGroup vg = (ViewGroup) drrlll.getChildAt(1);
            vg.setFitsSystemWindows(false);
            // 设置 DrawerLayout 属性
            drrlll.setFitsSystemWindows(false);
        }
    }

    /**
     * 为头部是 ImageView 的界面设置状态栏全透明
     *
     * @param activity       需要设置的activity
     * @param needOffsetView 需要向下偏移的 View
     */
    public static void shezhiTopIsImageTouming(Activity activity, View needOffsetView) {
        shezhiTopIsImageTouming2(activity, 0, needOffsetView);
    }

    /**
     * 为头部是 ImageView 的界面设置状态栏透明(使用默认透明度)
     *
     * @param activity       需要设置的activity
     * @param needOffsetView 需要向下偏移的 View
     */
    public static void shezhiTopIsImageTouming2(Activity activity, View needOffsetView) {
        shezhiTopIsImageTouming2(activity, ZHUANGTAILAN_TOUMINGDU, needOffsetView);
    }

    /**
     * 为头部是 ImageView 的界面设置状态栏透明
     *
     * @param aaccctyiivv       需要设置的activity
     * @param statusBarAlpha 状态栏透明度
     * @param needOffsetView 需要向下偏移的 View
     */
    public static void shezhiTopIsImageTouming2(Activity aaccctyiivv, @IntRange(from = 0, to = 255) int statusBarAlpha,
                                                View needOffsetView) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        shezhiWindowTouming(aaccctyiivv);
        tianjiaBantoumingTiao(aaccctyiivv, statusBarAlpha);
        if (needOffsetView != null) {
            Object guanbibibubu = needOffsetView.getTag(BIANYILIANG_KEY);
            if (guanbibibubu != null && (Boolean) guanbibibubu) {
                return;
            }
            ViewGroup.MarginLayoutParams alyoucanshu = (ViewGroup.MarginLayoutParams) needOffsetView.getLayoutParams();
            alyoucanshu.setMargins(alyoucanshu.leftMargin, alyoucanshu.topMargin + huoquZhuangtaialnGaodu(aaccctyiivv),
                    alyoucanshu.rightMargin, alyoucanshu.bottomMargin);
            needOffsetView.setTag(BIANYILIANG_KEY, true);
        }
    }

    /**
     * 为 fragment 头部是 ImageView 的设置状态栏透明
     *
     * @param actyyy       fragment 对应的 activity
     * @param pianyi 需要向下偏移的 View
     */
    public static void shezhiFragmentZhuangtailanTouming(Activity actyyy, View pianyi) {
        shezhiFragmentZhuangtailanTouming(actyyy, ZHUANGTAILAN_TOUMINGDU, pianyi);
    }

    /**
     * 为 fragment 头部是 ImageView 的设置状态栏透明
     *
     * @param aaactttyy       fragment 对应的 activity
     * @param pianyi 需要向下偏移的 View
     */
    public static void shezhiFragmentZhuangtailanToumingssssa(Activity aaactttyy, View pianyi) {
        shezhiFragmentZhuangtailanTouming(aaactttyy, 0, pianyi);
    }

    /**
     * 为 fragment 头部是 ImageView 的设置状态栏透明
     *
     * @param accttyy       fragment 对应的 activity
     * @param statusBarAlpha 状态栏透明度
     * @param shifouPianyi 需要向下偏移的 View
     */
    public static void shezhiFragmentZhuangtailanTouming(Activity accttyy, @IntRange(from = 0, to = 255) int statusBarAlpha,
                                                         View shifouPianyi) {
        shezhiTopIsImageTouming2(accttyy, statusBarAlpha, shifouPianyi);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT && Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            qingchuYushezhi(accttyy);
        }
    }

    /**
     * 隐藏伪状态栏 View
     *
     * @param aacctty 调用的 Activity
     */
    public static void yincangJiaZhuangtailan(Activity aacctty) {
        ViewGroup genshitu = (ViewGroup) aacctty.getWindow().getDecorView();
        View zhuangtaiShitu = genshitu.findViewById(ZHAUNGTAILAN_SHITUID);
        if (zhuangtaiShitu != null) {
            zhuangtaiShitu.setVisibility(View.GONE);
        }
        View fakeTranslucentView = genshitu.findViewById(BANTOUMING_SHITUID);
        if (fakeTranslucentView != null) {
            fakeTranslucentView.setVisibility(View.GONE);
        }
    }

    /**
     * android 6.0设置字体颜色
     */
    @TargetApi(Build.VERSION_CODES.M)
    public static void shezhiZhuangtailanForM(Window chaungkou) {
        chaungkou.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }

    /**
     * 设置MIUI6+的状态栏是否为darkMode,darkMode时候字体颜色及icon变黑
     * https://dev.mi.com/console/doc/detail?pId=1159
     */
    public static boolean shezhiZhuangtailanForMFor6(Window chuangkou, boolean asdthg) {
        boolean result = false;
        if (chuangkou != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (asdthg) {
                    chuangkou.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                    chuangkou.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                    chuangkou.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                } else {
                    chuangkou.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
                }
                result = true;
            } else {
                Class<? extends Window> fansheLei = chuangkou.getClass();
                try {
                    int darkModeFlag = 0;
                    Class<?> layoutParams = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                    Field casnhsushus = layoutParams.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
                    darkModeFlag = casnhsushus.getInt(layoutParams);
                    Method fangfaLisff = fansheLei.getMethod("setExtraFlags", int.class, int.class);
                    fangfaLisff.invoke(chuangkou, asdthg ? darkModeFlag : 0, darkModeFlag);
                    result = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    ///////////////////////////////////////////////////////////////////////////////////


    //清除预设置
    @TargetApi(Build.VERSION_CODES.KITKAT)
    private static void qingchuYushezhi(Activity activity) {
        ViewGroup hytgrfesg = (ViewGroup) activity.getWindow().getDecorView();
        View shitu = hytgrfesg.findViewById(ZHAUNGTAILAN_SHITUID);
        if (shitu != null) {
            hytgrfesg.removeView(shitu);
            ViewGroup rootView = (ViewGroup) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0);
            rootView.setPadding(0, 0, 0, 0);
        }
    }

    /**
     * 添加半透明矩形条
     *
     * @param aacctyyy       需要设置的 activity
     * @param toumingDu 透明值
     */
    private static void tianjiaBantoumingTiao(Activity aacctyyy, @IntRange(from = 0, to = 255) int toumingDu) {
        ViewGroup shtuZU = aacctyyy.findViewById(android.R.id.content);
        View shitu = shtuZU.findViewById(BANTOUMING_SHITUID);
        if (shitu != null) {
            if (shitu.getVisibility() == View.GONE) {
                shitu.setVisibility(View.VISIBLE);
            }
            shitu.setBackgroundColor(Color.argb(toumingDu, 0, 0, 0));
        } else {
            shtuZU.addView(chuanjianBantoumingView(aacctyyy, toumingDu));
        }
    }

    /**
     * 生成一个和状态栏大小相同的彩色矩形条
     *
     * @param aaccttyyvv 需要设置的 activity
     * @param color    状态栏颜色值
     * @return 状态栏矩形条
     */
    private static View chuangjianZhuangtailanView(Activity aaccttyyvv, @ColorInt int color) {
        return chuangjianZhuangtailanView(aaccttyyvv, color, 0);
    }

    /**
     * 生成一个和状态栏大小相同的半透明矩形条
     *
     * @param aaccttiivv 需要设置的activity
     * @param color    状态栏颜色值
     * @param alpha    透明值
     * @return 状态栏矩形条
     */
    private static View chuangjianZhuangtailanView(Activity aaccttiivv, @ColorInt int color, int alpha) {
        // 绘制一个和状态栏一样高的矩形
        View zhaungtishitu = new View(aaccttiivv);
        LinearLayout.LayoutParams bujucanshu =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, huoquZhuangtaialnGaodu(aaccttiivv));
        zhaungtishitu.setLayoutParams(bujucanshu);
        zhaungtishitu.setBackgroundColor(jisuanZhuangtailanYanse(color, alpha));
        zhaungtishitu.setId(ZHAUNGTAILAN_SHITUID);
        return zhaungtishitu;
    }

    /**
     * 设置根布局参数
     */
    private static void shezhiGenBuju(Activity actvv) {
        ViewGroup fubuju = actvv.findViewById(android.R.id.content);
        for (int i = 0, count = fubuju.getChildCount(); i < count; i++) {
            View zibuju = fubuju.getChildAt(i);
            if (zibuju instanceof ViewGroup) {
                zibuju.setFitsSystemWindows(true);
                ((ViewGroup) zibuju).setClipToPadding(true);
            }
        }
    }

    /**
     * 设置透明
     */
    public static void shezhiWindowTouming(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().setStatusBarColor(Color.TRANSPARENT);
            activity.getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            activity.getWindow()
                    .setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }

    /**
     * 使状态栏透明
     */
    @TargetApi(Build.VERSION_CODES.KITKAT)
    private static void shezhiZhuangtailanTouming(Activity accttvv) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            accttvv.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            accttvv.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            accttvv.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            accttvv.getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else {
            accttvv.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }

    /**
     * 创建半透明矩形 View
     *
     * @param toumingdu 透明值
     * @return 半透明 View
     */
    private static View chuanjianBantoumingView(Activity actv, int toumingdu) {
        // 绘制一个和状态栏一样高的矩形
        View statusBarView = new View(actv);
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, huoquZhuangtaialnGaodu(actv));
        statusBarView.setLayoutParams(params);
        statusBarView.setBackgroundColor(Color.argb(toumingdu, 0, 0, 0));
        statusBarView.setId(BANTOUMING_SHITUID);
        return statusBarView;
    }

//    /**
//     * 获取状态栏高度
//     *
//     * @param context context
//     * @return 状态栏高度
//     */
//    private static int getStatusBarHeight(Context context) {
//        // 获得状态栏高度
//        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
//        return context.getResources().getDimensionPixelSize(resourceId);
//    }

    /**
     * 计算状态栏颜色
     *
     * @param yanshai color值
     * @param toumingdu alpha值
     * @return 最终的状态栏颜色
     */
    private static int jisuanZhuangtailanYanse(@ColorInt int yanshai, int toumingdu) {
        if (toumingdu == 0) {
            return yanshai;
        }
        float a = 1 - toumingdu / 255f;
        int red = yanshai >> 16 & 0xff;
        int green = yanshai >> 8 & 0xff;
        int blue = yanshai & 0xff;
        red = (int) (red * a + 0.5);
        green = (int) (green * a + 0.5);
        blue = (int) (blue * a + 0.5);
        return 0xff << 24 | red << 16 | green << 8 | blue;
    }

    /**
     * 增加View的高度以及paddingTop,增加的值为状态栏高度.一般是在沉浸式全屏给ToolBar用的
     */
    public static void zengjiaGaoduHePading(Context chiyouzhe, View vshitu) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            ViewGroup.LayoutParams lp = vshitu.getLayoutParams();
            lp.height += huoquZhuangtaialnGaodu(chiyouzhe);//增高
            vshitu.setPadding(vshitu.getPaddingLeft(), vshitu.getPaddingTop() + huoquZhuangtaialnGaodu(chiyouzhe),
                    vshitu.getPaddingRight(), vshitu.getPaddingBottom());
        }
    }

    /**
     * 增加View的paddingTop,增加的值为状态栏高度
     */
    public static void shezhiNeibianju(Context chiyouzhe, View vshitu) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            vshitu.setPadding(vshitu.getPaddingLeft(), vshitu.getPaddingTop() + huoquZhuangtaialnGaodu(chiyouzhe),
                    vshitu.getPaddingRight(), vshitu.getPaddingBottom());
        }
    }


    /**
     * 获取状态栏高度
     */
    public static int huoquZhuangtaialnGaodu(Context chiyouzhe) {
        int jieguo = 0;
        int ziyuanid = chiyouzhe.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (ziyuanid > 0) {
            jieguo = chiyouzhe.getResources().getDimensionPixelSize(ziyuanid);
        }
        return jieguo;
    }

    public static boolean xianshiDaohanglan(Activity actv) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
            return false;
        }
        WindowManager chuangkouGuanli = (WindowManager) actv.getSystemService(Context.WINDOW_SERVICE);
        Display zhanshi = chuangkouGuanli.getDefaultDisplay();
        DisplayMetrics zhanshimetr = new DisplayMetrics();
        //获取整个屏幕的高度
        zhanshi.getRealMetrics(zhanshimetr);
        int heightPixels = zhanshimetr.heightPixels;
        int widthPixels = zhanshimetr.widthPixels;
        //获取内容展示部分的高度
        zhanshimetr = new DisplayMetrics();
        zhanshi.getMetrics(zhanshimetr);
        int heightPixelsContent = zhanshimetr.heightPixels;
        int widthPixelsContent = zhanshimetr.widthPixels;
        int h = heightPixels - heightPixelsContent;
        int w = widthPixels - widthPixelsContent;
        return w > 0 || h > 0; //竖屏和横屏两种情况
    }

    /**
     * 获取导航栏高度
     *
     * @param chiyouzhe
     * @return
     */
    public static int huoquDaohanglanGaodu(Context chiyouzhe) {
        return huoquXitongZujianSize(chiyouzhe, "navigation_bar_height");
    }

    //获取系统组件尺寸 get System ComponentDimen
    public static int huoquXitongZujianSize(Context chiyouzhe, String juliMing) {
        // 反射手机运行的类：android.R.dimen.status_bar_height.
        int statusHeight = -1;
        try {
            Class<?> fansheLei = Class.forName("com.android.internal.R$dimen");
            Object jieDuixaing = fansheLei.newInstance();
            String gaoduStr = fansheLei.getField(juliMing).get(jieDuixaing).toString();
            int height = Integer.parseInt(gaoduStr);
            //dp->px
            statusHeight = chiyouzhe.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusHeight;
    }
}
