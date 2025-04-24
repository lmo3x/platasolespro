package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntDef;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import static android.graphics.BlurMaskFilter.Blur;

/**
 *
 */
public final class ZifuchuanPinjieSpanTols {

    private static final int MOREN_YANSHAI = 0xFEFFFFFF;

    public static final int BUJU_DIBU = 0;
    public static final int BUJU_JIXIAN = 1;
    public static final int BUJU_ZHONGXIN = 2;
    public static final int BUJU_DINGBU = 3;

    @IntDef({BUJU_DIBU, BUJU_JIXIAN, BUJU_ZHONGXIN, BUJU_DINGBU})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Align {
    }

    private static final String FENGEXIAN = System.getProperty("line.separator");

    private TextView mtextWenben; //mTextview
    private CharSequence mNeirongWenben; // mText
    private int flgBiaoshi; //flag
    private int qianjingse;//foregroundColor
    private int beijingse;//backgroundColor
    private int xianGaodu;//lineHeight
    private int duiqiXian;//alignLine
    private int yinyongSe;//quoteColor
    private int tiaowenKuandu;//stripeWidth
    private int jianjuKuandu;//quoteGapWidth
    private int diyige;//first
    private int xiuxixiuxi;//rest
    private int zhuozhongSe;//bulletColor
    private int zhuozhongYuanjiao;//bulletRadius
    private int zhuozhongJiange;//bulletGapWidth
    private int zitiDaxiao;//fontSize
    private boolean zitiDaxiaoByDp;//fontSizeIsDp
    private float biliBaifenbi;//proportion
    private float xxxBili;//xProportion
    private boolean shifouShanchuxian;//isStrikethrough
    private boolean shifouXiahuaxain;//isUnderline
    private boolean shifouShangbiao;//isSuperscript
    private boolean shifouXiabiao;//isSubscript
    private boolean shifouJiacu;//isBold
    private boolean shifouXieti;//isItalic
    private boolean shifouJiacuXieti;//isBoldItalic
    private String tiziJihe;//fontFamily
    private Typeface ziti;//typeface
    private Alignment duiqi;//alignment
    private int chuizhiDuiqi;//verticalAlign
    private ClickableSpan dianjiSpan;//clickSpan
    private String ruldizhi;//url
    private float yuanjiao;//blurRadius
    private Blur fengge;//style
    private Shader zhuoseqi;//shader
    private float yinyingyuanjiao;//shadowRadius
    private float yinyingDx;//shadowDx
    private float yinyingDy;//shadowDy
    private int yinyingYanse;//shadowColor
    private Object[] chixushijian;//spans

    private Bitmap tupianWeitu;//imageBitmap
    private Drawable tupianHuizhi;//imageDrawable
    private Uri tupianDizhi;//imageUri
    private int tupianZiyuanId;//imageResourceId
    private int tupianDuiqi;//alignImage

    private int quyuDaxiao;//spaceSize
    private int quyuYanse;//spaceColor

    private XielieHuaSpanStringGoujianzhe xuliehuaSpanJianZaozhe;

    private       int wodeLeixing;//mType
    private final int zifuLeixing = 0;//mTypeCharSequence
    private final int tupianLeixing = 1;//mTypeImage
    private final int tupianQuyu = 2;//mTypeSpace

    private ZifuchuanPinjieSpanTols(TextView txt) {
        this();
        mtextWenben = txt;
    }

    public ZifuchuanPinjieSpanTols() {
        xuliehuaSpanJianZaozhe = new XielieHuaSpanStringGoujianzhe();
        mNeirongWenben = "";
        wodeLeixing = -1;
        sehzhiChushihua();
    }

    private void sehzhiChushihua() {
        flgBiaoshi = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE;
        qianjingse = MOREN_YANSHAI;
        beijingse = MOREN_YANSHAI;
        xianGaodu = -1;
        yinyongSe = MOREN_YANSHAI;
        diyige = -1;
        zhuozhongSe = MOREN_YANSHAI;
        zitiDaxiao = -1;
        biliBaifenbi = -1;
        xxxBili = -1;
        shifouShanchuxian = false;
        shifouXiahuaxain = false;
        shifouShangbiao = false;
        shifouXiabiao = false;
        shifouJiacu = false;
        shifouXieti = false;
        shifouJiacuXieti = false;
        tiziJihe = null;
        ziti = null;
        duiqi = null;
        chuizhiDuiqi = -1;
        dianjiSpan = null;
        ruldizhi = null;
        yuanjiao = -1;
        zhuoseqi = null;
        yinyingyuanjiao = -1;
        chixushijian = null;

        tupianWeitu = null;
        tupianHuizhi = null;
        tupianDizhi = null;
        tupianZiyuanId = -1;

        quyuDaxiao = -1;
    }

    /**
     * Set the span of flag.
     *
     * @param flgBiaoshi The flag.
     *             <ul>
     *             <li>{@link Spanned#SPAN_INCLUSIVE_EXCLUSIVE}</li>
     *             <li>{@link Spanned#SPAN_INCLUSIVE_INCLUSIVE}</li>
     *             <li>{@link Spanned#SPAN_EXCLUSIVE_EXCLUSIVE}</li>
     *             <li>{@link Spanned#SPAN_EXCLUSIVE_INCLUSIVE}</li>
     *             </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setFlgBiaoshi(final int flgBiaoshi) {
        this.flgBiaoshi = flgBiaoshi;
        return this;
    }

    /**
     * Set the span of foreground's color.
     *
     * @param yanse The color of foreground
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setQianjingse(@ColorInt final int yanse) {
        this.qianjingse = yanse;
        return this;
    }

    /**
     * Set the span of background's color.
     *
     * @param yanse The color of background
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setBeijingse(@ColorInt final int yanse) {
        this.beijingse = yanse;
        return this;
    }

    /**
     * Set the span of line height.
     *
     * @param xianGaodu The line height, in pixel.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setXianGaodu(@IntRange(from = 0) final int xianGaodu) {
        return setLineHeight(xianGaodu, BUJU_ZHONGXIN);
    }

    /**
     * Set the span of line height.
     *
     * @param xiangaodu The line height, in pixel.
     * @param duiqi      The alignment.
     *                   <ul>
     *                   <li>{@link Align#BUJU_DINGBU   }</li>
     *                   <li>{@link Align#BUJU_ZHONGXIN}</li>
     *                   <li>{@link Align#BUJU_DIBU}</li>
     *                   </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setLineHeight(@IntRange(from = 0) final int xiangaodu,
                                                 @Align final int duiqi) {
        this.xianGaodu = xiangaodu;
        this.duiqiXian = duiqi;
        return this;
    }

    /**
     * Set the span of quote's color.
     *
     * @param yanse The color of quote
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setYinyongSe(@ColorInt final int yanse) {
        return shezhiYinyongYanse(yanse, 2, 2);
    }

    /**
     * Set the span of quote's color.
     *
     * @param yanse       The color of quote.
     * @param tiaowenkuandu The width of stripe, in pixel.
     * @param gapkuandu    The width of gap, in pixel.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiYinyongYanse(@ColorInt final int yanse,
                                                      @IntRange(from = 1) final int tiaowenkuandu,
                                                      @IntRange(from = 0) final int gapkuandu) {
        this.yinyongSe = yanse;
        this.tiaowenKuandu = tiaowenkuandu;
        this.jianjuKuandu = gapkuandu;
        return this;
    }

    /**
     * Set the span of leading margin.
     *
     * @param diyidiyi The indent for the first line of the paragraph.
     * @param xiuxixiuxi  The indent for the remaining lines of the paragraph.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiTouBianju(@IntRange(from = 0) final int diyidiyi,
                                                   @IntRange(from = 0) final int xiuxixiuxi) {
        this.diyige = diyidiyi;
        this.xiuxixiuxi = xiuxixiuxi;
        return this;
    }

    /**
     * Set the span of bullet.
     *
     * @param zhuozhongKuandu The width of gap, in pixel.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiZhuozhong(@IntRange(from = 0) final int zhuozhongKuandu) {
        return shezhiZhuozhong(0, 3, zhuozhongKuandu);
    }

    /**
     * Set the span of bullet.
     *
     * @param yanshai    The color of bullet.
     * @param radius   The radius of bullet, in pixel.
     * @param gapWidth The width of gap, in pixel.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiZhuozhong(@ColorInt final int yanshai,
                                                   @IntRange(from = 0) final int radius,
                                                   @IntRange(from = 0) final int gapWidth) {
        this.zhuozhongSe = yanshai;
        this.zhuozhongYuanjiao = radius;
        this.zhuozhongJiange = gapWidth;
        return this;
    }

    /**
     * Set the span of font's size.
     *
     * @param size The size of font.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setZitiDaxiao(@IntRange(from = 0) final int size) {
        return setZitiDaxiao2(size, false);
    }

    /**
     * Set the span of size of font.
     *
     * @param size The size of font.
     * @param isSp True to use sp, false to use pixel.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setZitiDaxiao2(@IntRange(from = 0) final int size, final boolean isSp) {
        this.zitiDaxiao = size;
        this.zitiDaxiaoByDp = isSp;
        return this;
    }

    /**
     * Set the span of proportion of font.
     *
     * @param bili The proportion of font.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiZitiBaifenbi(final float bili) {
        this.biliBaifenbi = bili;
        return this;
    }

    /**
     * Set the span of transverse proportion of font.
     *
     * @param bili The transverse proportion of font.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiZitiBaifenbi2(final float bili) {
        this.xxxBili = bili;
        return this;
    }

    /**
     * Set the span of strikethrough.
     *
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiTiaowen() {
        this.shifouShanchuxian = true;
        return this;
    }

    /**
     * Set the span of underline.
     *
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols sheziXianhuaxian() {
        this.shifouXiahuaxain = true;
        return this;
    }

    /**
     * Set the span of superscript.
     *
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiChaojijiaoben() {
        this.shifouShangbiao = true;
        return this;
    }

    /**
     * Set the span of subscript.
     *
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols sehzhiJiaoben() {
        this.shifouXiabiao = true;
        return this;
    }

    /**
     * Set the span of bold.
     *
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols sehzhiJiacu() {
        shifouJiacu = true;
        return this;
    }

    /**
     * Set the span of italic.
     *
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiXieti() {
        shifouXieti = true;
        return this;
    }

    /**
     * Set the span of bold italic.
     *
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols sehzhiJiacuXieti() {
        shifouJiacuXieti = true;
        return this;
    }

    /**
     * Set the span of font family.
     *
     * @param tiziJihe The font family.
     *                   <ul>
     *                   <li>monospace</li>
     *                   <li>serif</li>
     *                   <li>sans-serif</li>
     *                   </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setTiziJihe(@NonNull final String tiziJihe) {
        this.tiziJihe = tiziJihe;
        return this;
    }

    /**
     * Set the span of typeface.
     *
     * @param ziti The typeface.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setZiti(@NonNull final Typeface ziti) {
        this.ziti = ziti;
        return this;
    }

    /**
     * Set the span of horizontal alignment.
     *
     * @param duiqifangshi The alignment.
     *                  <ul>
     *                  <li>{@link Alignment#ALIGN_NORMAL  }</li>
     *                  <li>{@link Alignment#ALIGN_OPPOSITE}</li>
     *                  <li>{@link Alignment#ALIGN_CENTER  }</li>
     *                  </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiShuipingDuiqi(@NonNull final Alignment duiqifangshi) {
        this.duiqi = duiqifangshi;
        return this;
    }

    /**
     * Set the span of vertical alignment.
     *
     * @param duiqi The alignment.
     *              <ul>
     *              <li>{@link Align#BUJU_DINGBU     }</li>
     *              <li>{@link Align#BUJU_ZHONGXIN  }</li>
     *              <li>{@link Align#BUJU_JIXIAN}</li>
     *              <li>{@link Align#BUJU_DIBU  }</li>
     *              </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setChuizhiDuiqi(@Align final int duiqi) {
        this.chuizhiDuiqi = duiqi;
        return this;
    }

    /**
     * Set the span of click.
     * <p>Must set {@code view.setMovementMethod(LinkMovementMethod.getInstance())}</p>
     *
     * @param dianjiSpan The span of click.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setDianjiSpan(@NonNull final ClickableSpan dianjiSpan) {
        if (mtextWenben != null && mtextWenben.getMovementMethod() == null) {
            mtextWenben.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.dianjiSpan = dianjiSpan;

        return this;
    }

    /**
     * Set the span of click.
     * <p>Must set {@code view.setMovementMethod(LinkMovementMethod.getInstance())}</p>
     *
     * @param clickSpan The span of click.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setClickSpan2(@NonNull final ClickableSpan clickSpan) {
        if (mtextWenben != null && mtextWenben.getMovementMethod() == null) {
            mtextWenben.setMovementMethod(LinkMovementMethod.getInstance());
        }
        setChixushijian(clickSpan, 0, 24, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        this.dianjiSpan = clickSpan;
        return this;
    }

    /**
     * Set the span of url.
     * <p>Must set {@code view.setMovementMethod(LinkMovementMethod.getInstance())}</p>
     *
     * @param ruldizhi The url.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setRuldizhi(@NonNull final String ruldizhi) {
        if (mtextWenben != null && mtextWenben.getMovementMethod() == null) {
            mtextWenben.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.ruldizhi = ruldizhi;
        return this;
    }

    /**
     * Set the span of blur.
     *
     * @param radius The radius of blur.
     * @param yangshi  The style.
     *               <ul>
     *               <li>{@link Blur#NORMAL}</li>
     *               <li>{@link Blur#SOLID}</li>
     *               <li>{@link Blur#OUTER}</li>
     *               <li>{@link Blur#INNER}</li>
     *               </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiMohu(@FloatRange(from = 0, fromInclusive = false) final float radius,
                                              final Blur yangshi) {
        this.yuanjiao = radius;
        this.fengge = yangshi;
        return this;
    }

    /**
     * Set the span of shader.
     *
     * @param zhuoseqi The shader.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setZhuoseqi(@NonNull final Shader zhuoseqi) {
        this.zhuoseqi = zhuoseqi;
        return this;
    }

    /**
     * Set the span of shadow.
     *
     * @param yuanjiao      The radius of shadow.
     * @param dx          X-axis offset, in pixel.
     * @param dy          Y-axis offset, in pixel.
     * @param shadowColor The color of shadow.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols shezhiYinying(@FloatRange(from = 0, fromInclusive = false) final float yuanjiao,
                                                 final float dx,
                                                 final float dy,
                                                 final int shadowColor) {
        this.yinyingyuanjiao = yuanjiao;
        this.yinyingDx = dx;
        this.yinyingDy = dy;
        this.yinyingYanse = shadowColor;
        return this;
    }


    /**
     * Set the spans.
     *
     * @param chixushijian The spans.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols setChixushijian(@NonNull final Object... chixushijian) {
        if (chixushijian.length > 0) {
            this.chixushijian = chixushijian;
        }
        return this;
    }

    /**
     * Append the text text.
     *
     * @param text The text.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaapped(@NonNull final CharSequence text) {
        apply(zifuLeixing);
        mNeirongWenben = text;
        return this;
    }

    /**
     * Append one line.
     *
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaXian() {
        apply(zifuLeixing);
        mNeirongWenben = FENGEXIAN;
        return this;
    }

    /**
     * Append text and one line.
     *
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaXian(@NonNull final CharSequence wenan) {
        apply(zifuLeixing);
        mNeirongWenben = wenan + FENGEXIAN;
        return this;
    }

    /**
     * Append one image.
     *
     * @param weitu The bitmap of image.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaTupian(@NonNull final Bitmap weitu) {
        return diejiaTupian(weitu, BUJU_DIBU);
    }

    /**
     * Append one image.
     *
     * @param weitu The bitmap.
     * @param align  The alignment.
     *               <ul>
     *               <li>{@link Align#BUJU_DINGBU     }</li>
     *               <li>{@link Align#BUJU_ZHONGXIN  }</li>
     *               <li>{@link Align#BUJU_JIXIAN}</li>
     *               <li>{@link Align#BUJU_DIBU  }</li>
     *               </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaTupian(@NonNull final Bitmap weitu, @Align final int align) {
        apply(tupianLeixing);
        this.tupianWeitu = weitu;
        this.tupianDuiqi = align;
        return this;
    }

    /**
     * Append one image.
     *
     * @param drrrll The drawable of image.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaTupian(@NonNull final Drawable drrrll) {
        return diejiaTupian(drrrll, BUJU_DIBU);
    }

    /**
     * Append one image.
     *
     * @param drawable The drawable of image.
     * @param align    The alignment.
     *                 <ul>
     *                 <li>{@link Align#BUJU_DINGBU     }</li>
     *                 <li>{@link Align#BUJU_ZHONGXIN  }</li>
     *                 <li>{@link Align#BUJU_JIXIAN}</li>
     *                 <li>{@link Align#BUJU_DIBU  }</li>
     *                 </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaTupian(@NonNull final Drawable drawable, @Align final int align) {
        apply(tupianLeixing);
        this.tupianHuizhi = drawable;
        this.tupianDuiqi = align;
        return this;
    }

    /**
     * Append one image.
     *
     * @param dizhidizhi The uri of image.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaTupian(@NonNull final Uri dizhidizhi) {
        return diejiaTupian(dizhidizhi, BUJU_DIBU);
    }

    /**
     * Append one image.
     *
     * @param dizhi   The uri of image.
     * @param duiqi The alignment.
     *              <ul>
     *              <li>{@link Align#BUJU_DINGBU     }</li>
     *              <li>{@link Align#BUJU_ZHONGXIN  }</li>
     *              <li>{@link Align#BUJU_JIXIAN}</li>
     *              <li>{@link Align#BUJU_DIBU  }</li>
     *              </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaTupian(@NonNull final Uri dizhi, @Align final int duiqi) {
        apply(tupianLeixing);
        this.tupianDizhi = dizhi;
        this.tupianDuiqi = duiqi;
        return this;
    }

    /**
     * Append one image.
     *
     * @param ziyuanid The resource id of image.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaTupian(@DrawableRes final int ziyuanid) {
        return diejiaTupian(ziyuanid, BUJU_DIBU);
    }

    /**
     * Append one image.
     *
     * @param ziyuanid The resource id of image.
     * @param duiqi      The alignment.
     *                   <ul>
     *                   <li>{@link Align#BUJU_DINGBU     }</li>
     *                   <li>{@link Align#BUJU_ZHONGXIN  }</li>
     *                   <li>{@link Align#BUJU_JIXIAN}</li>
     *                   <li>{@link Align#BUJU_DIBU  }</li>
     *                   </ul>
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaTupian(@DrawableRes final int ziyuanid, @Align final int duiqi) {
        apply(tupianLeixing);
        this.tupianZiyuanId = ziyuanid;
        this.tupianDuiqi = duiqi;
        return this;
    }

    /**
     * Append space.
     *
     * @param daxiao The size of space.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaQuyu(@IntRange(from = 0) final int daxiao) {
        return diejiaQuyu(daxiao, Color.TRANSPARENT);
    }

    /**
     * Append space.
     *
     * @param daxiao  The size of space.
     * @param yanshai The color of space.
     * @return the single {@link ZifuchuanPinjieSpanTols} instance
     */
    public ZifuchuanPinjieSpanTols diejiaQuyu(@IntRange(from = 0) final int daxiao, @ColorInt final int yanshai) {
        apply(tupianQuyu);
        quyuDaxiao = daxiao;
        quyuYanse = yanshai;
        return this;
    }

    private void apply(final int type) {
        applyLast();
        wodeLeixing = type;
    }

    public SpannableStringBuilder get() {
        return xuliehuaSpanJianZaozhe;
    }

    /**
     * Create the span string.
     *
     * @return the span string
     */
    public SpannableStringBuilder chuangjian() {
        applyLast();
        if (mtextWenben != null) {
            mtextWenben.setText(xuliehuaSpanJianZaozhe);
        }
        return xuliehuaSpanJianZaozhe;
    }

    private void applyLast() {
        if (wodeLeixing == zifuLeixing) {
            gengxinZifuZiJie();
        } else if (wodeLeixing == tupianLeixing) {
            gengxinTupian();
        } else if (wodeLeixing == tupianQuyu) {
            gengxinQuyu();
        }
        sehzhiChushihua();
    }

    //update char
    private void gengxinZifuZiJie() {
        if (mNeirongWenben.length() == 0) return;
        int start = xuliehuaSpanJianZaozhe.length();
        if (start == 0 && xianGaodu != -1) {// bug of LineHeightSpan when first line
            xuliehuaSpanJianZaozhe.append(Character.toString((char) 2))
                    .append("\n")
                    .setSpan(new AbsoluteSizeSpan(0), 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            start = 2;
        }
        xuliehuaSpanJianZaozhe.append(mNeirongWenben);
        int end = xuliehuaSpanJianZaozhe.length();
        if (chuizhiDuiqi != -1) {
            xuliehuaSpanJianZaozhe.setSpan(new ChuizhiDuiqiSpan(chuizhiDuiqi), start, end, flgBiaoshi);
        }
        if (qianjingse != MOREN_YANSHAI) {
            xuliehuaSpanJianZaozhe.setSpan(new ForegroundColorSpan(qianjingse), start, end, flgBiaoshi);
        }
        if (beijingse != MOREN_YANSHAI) {
            xuliehuaSpanJianZaozhe.setSpan(new BackgroundColorSpan(beijingse), start, end, flgBiaoshi);
        }
        if (diyige != -1) {
            xuliehuaSpanJianZaozhe.setSpan(new LeadingMarginSpan.Standard(diyige, xiuxixiuxi), start, end, flgBiaoshi);
        }
        if (yinyongSe != MOREN_YANSHAI) {
            xuliehuaSpanJianZaozhe.setSpan(
                    new TongongYinyongSpan(yinyongSe, tiaowenKuandu, jianjuKuandu),
                    start,
                    end,
                    flgBiaoshi
            );
        }
        if (zhuozhongSe != MOREN_YANSHAI) {
            xuliehuaSpanJianZaozhe.setSpan(
                    new TongyongJiazhongSpan(zhuozhongSe, zhuozhongYuanjiao, zhuozhongJiange),
                    start,
                    end,
                    flgBiaoshi
            );
        }
        if (zitiDaxiao != -1) {
            xuliehuaSpanJianZaozhe.setSpan(new AbsoluteSizeSpan(zitiDaxiao, zitiDaxiaoByDp), start, end, flgBiaoshi);
        }
        if (biliBaifenbi != -1) {
            xuliehuaSpanJianZaozhe.setSpan(new RelativeSizeSpan(biliBaifenbi), start, end, flgBiaoshi);
        }
        if (xxxBili != -1) {
            xuliehuaSpanJianZaozhe.setSpan(new ScaleXSpan(xxxBili), start, end, flgBiaoshi);
        }
        if (xianGaodu != -1) {
            xuliehuaSpanJianZaozhe.setSpan(new TongyongXiangaoduSpan(xianGaodu, duiqiXian), start, end, flgBiaoshi);
        }
        if (shifouShanchuxian) {
            xuliehuaSpanJianZaozhe.setSpan(new StrikethroughSpan(), start, end, flgBiaoshi);
        }
        if (shifouXiahuaxain) {
            xuliehuaSpanJianZaozhe.setSpan(new UnderlineSpan(), start, end, flgBiaoshi);
        }
        if (shifouShangbiao) {
            xuliehuaSpanJianZaozhe.setSpan(new SuperscriptSpan(), start, end, flgBiaoshi);
        }
        if (shifouXiabiao) {
            xuliehuaSpanJianZaozhe.setSpan(new SubscriptSpan(), start, end, flgBiaoshi);
        }
        if (shifouJiacu) {
            xuliehuaSpanJianZaozhe.setSpan(new StyleSpan(Typeface.BOLD), start, end, flgBiaoshi);
        }
        if (shifouXieti) {
            xuliehuaSpanJianZaozhe.setSpan(new StyleSpan(Typeface.ITALIC), start, end, flgBiaoshi);
        }
        if (shifouJiacuXieti) {
            xuliehuaSpanJianZaozhe.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), start, end, flgBiaoshi);
        }
        if (tiziJihe != null) {
            xuliehuaSpanJianZaozhe.setSpan(new TypefaceSpan(tiziJihe), start, end, flgBiaoshi);
        }
        if (ziti != null) {
            xuliehuaSpanJianZaozhe.setSpan(new TongyongZitiSpan(ziti), start, end, flgBiaoshi);
        }
        if (duiqi != null) {
            xuliehuaSpanJianZaozhe.setSpan(new AlignmentSpan.Standard(duiqi), start, end, flgBiaoshi);
        }
        if (dianjiSpan != null) {
            xuliehuaSpanJianZaozhe.setSpan(dianjiSpan, start, end, flgBiaoshi);
        }
        if (ruldizhi != null) {
            xuliehuaSpanJianZaozhe.setSpan(new URLSpan(ruldizhi), start, end, flgBiaoshi);
        }
        if (yuanjiao != -1) {
            xuliehuaSpanJianZaozhe.setSpan(
                    new MaskFilterSpan(new BlurMaskFilter(yuanjiao, fengge)),
                    start,
                    end,
                    flgBiaoshi
            );
        }
        if (zhuoseqi != null) {
            xuliehuaSpanJianZaozhe.setSpan(new ZhuoseqiSpan(zhuoseqi), start, end, flgBiaoshi);
        }
        if (yinyingyuanjiao != -1) {
            xuliehuaSpanJianZaozhe.setSpan(
                    new ShadowSpan(yinyingyuanjiao, yinyingDx, yinyingDy, yinyingYanse),
                    start,
                    end,
                    flgBiaoshi
            );
        }
        if (chixushijian != null) {
            for (Object span : chixushijian) {
                xuliehuaSpanJianZaozhe.setSpan(span, start, end, flgBiaoshi);
            }
        }
    }

    private void gengxinTupian() {
        int start = xuliehuaSpanJianZaozhe.length();
        mNeirongWenben = "<img>";
        gengxinZifuZiJie();
        int end = xuliehuaSpanJianZaozhe.length();
        if (tupianWeitu != null) {
            xuliehuaSpanJianZaozhe.setSpan(new TongyongTupainSpan(tupianWeitu, tupianDuiqi), start, end, flgBiaoshi);
        } else if (tupianHuizhi != null) {
            xuliehuaSpanJianZaozhe.setSpan(new TongyongTupainSpan(tupianHuizhi, tupianDuiqi), start, end, flgBiaoshi);
        } else if (tupianDizhi != null) {
            xuliehuaSpanJianZaozhe.setSpan(new TongyongTupainSpan(tupianDizhi, tupianDuiqi), start, end, flgBiaoshi);
        } else if (tupianZiyuanId != -1) {
            xuliehuaSpanJianZaozhe.setSpan(new TongyongTupainSpan(tupianZiyuanId, tupianDuiqi), start, end, flgBiaoshi);
        }
    }

    //更新区域
    private void gengxinQuyu() {
        int start = xuliehuaSpanJianZaozhe.length();
        mNeirongWenben = "< >";
        gengxinZifuZiJie();
        int end = xuliehuaSpanJianZaozhe.length();
        xuliehuaSpanJianZaozhe.setSpan(new QuyuSpan(quyuDaxiao, quyuYanse), start, end, flgBiaoshi);
    }

    static class ChuizhiDuiqiSpan extends ReplacementSpan {

        static final int BUJU_ZAIZHONGXIN = 2;
        static final int BUJU_ZAIDINGBU = 3;

        final int chuizhiDuiqi;

        ChuizhiDuiqiSpan(int verticalAlignment) {
            chuizhiDuiqi = verticalAlignment;
        }

        @Override
        public int getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
            text = text.subSequence(start, end);
            return (int) paint.measureText(text.toString());
        }

        @Override
        public void draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint) {
            text = text.subSequence(start, end);
            Paint.FontMetricsInt fm = paint.getFontMetricsInt();
//            int need = height - (v + fm.descent - fm.ascent - spanstartv);
//            if (need > 0) {
//                if (mVerticalAlignment == ALIGN_TOP) {
//                    fm.descent += need;
//                } else if (mVerticalAlignment == ALIGN_CENTER) {
//                    fm.descent += need / 2;
//                    fm.ascent -= need / 2;
//                } else {
//                    fm.ascent -= need;
//                }
//            }
//            need = height - (v + fm.bottom - fm.top - spanstartv);
//            if (need > 0) {
//                if (mVerticalAlignment == ALIGN_TOP) {
//                    fm.bottom += need;
//                } else if (mVerticalAlignment == ALIGN_CENTER) {
//                    fm.bottom += need / 2;
//                    fm.top -= need / 2;
//                } else {
//                    fm.top -= need;
//                }
//            }

            canvas.drawText(text.toString(), x, y - ((y + fm.descent + y + fm.ascent) / 2 - (bottom + top) / 2), paint);
        }
    }

    static class TongyongXiangaoduSpan implements LineHeightSpan {

        private final int xiangaodu;

        static final int BUJU_ZHONGJIAN = 2;
        static final int BUJU_DINGBU = 3;

        final  int chuizhiduiqi;
        static Paint.FontMetricsInt zitiMetrInt;

        TongyongXiangaoduSpan(int xiangaodu, int verticalAlignment) {
            this.xiangaodu = xiangaodu;
            chuizhiduiqi = verticalAlignment;
        }

        @Override
        public void chooseHeight(final CharSequence text, final int start, final int end,
                                 final int spanstartv, final int v, final Paint.FontMetricsInt fm) {
            if (zitiMetrInt == null) {
                zitiMetrInt = new Paint.FontMetricsInt();
                zitiMetrInt.top = fm.top;
                zitiMetrInt.ascent = fm.ascent;
                zitiMetrInt.descent = fm.descent;
                zitiMetrInt.bottom = fm.bottom;
                zitiMetrInt.leading = fm.leading;
            } else {
                fm.top = zitiMetrInt.top;
                fm.ascent = zitiMetrInt.ascent;
                fm.descent = zitiMetrInt.descent;
                fm.bottom = zitiMetrInt.bottom;
                fm.leading = zitiMetrInt.leading;
            }
            int need = xiangaodu - (v + fm.descent - fm.ascent - spanstartv);
            if (need > 0) {
                if (chuizhiduiqi == BUJU_DINGBU) {
                    fm.descent += need;
                } else if (chuizhiduiqi == BUJU_ZHONGJIAN) {
                    fm.descent += need / 2;
                    fm.ascent -= need / 2;
                } else {
                    fm.ascent -= need;
                }
            }
            need = xiangaodu - (v + fm.bottom - fm.top - spanstartv);
            if (need > 0) {
                if (chuizhiduiqi == BUJU_DINGBU) {
                    fm.bottom += need;
                } else if (chuizhiduiqi == BUJU_ZHONGJIAN) {
                    fm.bottom += need / 2;
                    fm.top -= need / 2;
                } else {
                    fm.top -= need;
                }
            }
            if (end == ((Spanned) text).getSpanEnd(this)) {
                zitiMetrInt = null;
            }
        }
    }

    static class QuyuSpan extends ReplacementSpan {

        private final int kuandu;
        private final Paint huabi = new Paint();

        private QuyuSpan(final int kuandu) {
            this(kuandu, Color.TRANSPARENT);
        }

        private QuyuSpan(final int kuandu, final int color) {
            super();
            this.kuandu = kuandu;
            huabi.setColor(color);
            huabi.setStyle(Paint.Style.FILL);
        }

        @Override
        public int getSize(@NonNull final Paint paint, final CharSequence text,
                           @IntRange(from = 0) final int start,
                           @IntRange(from = 0) final int end,
                           @Nullable final Paint.FontMetricsInt fm) {
            return kuandu;
        }

        @Override
        public void draw(@NonNull final Canvas canvas, final CharSequence text,
                         @IntRange(from = 0) final int start,
                         @IntRange(from = 0) final int end,
                         final float x, final int top, final int y, final int bottom,
                         @NonNull final Paint paint) {
            canvas.drawRect(x, top, x + kuandu, bottom, this.huabi);
        }
    }

    static class TongongYinyongSpan implements LeadingMarginSpan {

        private final int yanse;
        private final int tiaowenKuandu;
        private final int jiashenKuandu;

        private TongongYinyongSpan(final int yanse, final int tiaowenKuandu, final int jiashenKuandu) {
            super();
            this.yanse = yanse;
            this.tiaowenKuandu = tiaowenKuandu;
            this.jiashenKuandu = jiashenKuandu;
        }

        public int getLeadingMargin(final boolean first) {
            return tiaowenKuandu + jiashenKuandu;
        }

        public void drawLeadingMargin(final Canvas c, final Paint p, final int x, final int dir,
                                      final int top, final int baseline, final int bottom,
                                      final CharSequence text, final int start, final int end,
                                      final boolean first, final Layout layout) {
            Paint.Style style = p.getStyle();
            int color = p.getColor();

            p.setStyle(Paint.Style.FILL);
            p.setColor(this.yanse);

            c.drawRect(x, top, x + dir * tiaowenKuandu, bottom, p);

            p.setStyle(style);
            p.setColor(color);
        }
    }

    static class TongyongJiazhongSpan implements LeadingMarginSpan {

        private final int yanshai;
        private final int yuanjiao;
        private final int jiazhongKuandu;

        private Path sBulletPath = null;

        private TongyongJiazhongSpan(final int yanshai, final int yuanjiao, final int jiazhongKuandu) {
            this.yanshai = yanshai;
            this.yuanjiao = yuanjiao;
            this.jiazhongKuandu = jiazhongKuandu;
        }

        public int getLeadingMargin(final boolean first) {
            return 2 * yuanjiao + jiazhongKuandu;
        }

        public void drawLeadingMargin(final Canvas c, final Paint p, final int x, final int dir,
                                      final int top, final int baseline, final int bottom,
                                      final CharSequence text, final int start, final int end,
                                      final boolean first, final Layout l) {
            if (((Spanned) text).getSpanStart(this) == start) {
                Paint.Style huabifengge = p.getStyle();
                int oldColor = 0;
                oldColor = p.getColor();
                p.setColor(yanshai);
                p.setStyle(Paint.Style.FILL);
                if (c.isHardwareAccelerated()) {
                    if (sBulletPath == null) {
                        sBulletPath = new Path();
                        // Bullet is slightly better to avoid aliasing artifacts on mdpi devices.
                        sBulletPath.addCircle(0.0f, 0.0f, yuanjiao, Path.Direction.CW);
                    }
                    c.save();
                    c.translate(x + dir * yuanjiao, (top + bottom) / 2.0f);
                    c.drawPath(sBulletPath, p);
                    c.restore();
                } else {
                    c.drawCircle(x + dir * yuanjiao, (top + bottom) / 2.0f, yuanjiao, p);
                }
                p.setColor(oldColor);
                p.setStyle(huabifengge);
            }
        }
    }

    @SuppressLint("ParcelCreator")
    static class TongyongZitiSpan extends TypefaceSpan {

        private final Typeface zitihatyp;

        private TongyongZitiSpan(final Typeface type) {
            super("");
            zitihatyp = type;
        }

        @Override
        public void updateDrawState(final TextPaint textPaint) {
            apply(textPaint, zitihatyp);
        }

        @Override
        public void updateMeasureState(final TextPaint paint) {
            apply(paint, zitihatyp);
        }

        private void apply(final Paint paint, final Typeface tf) {
            int oldStyle;
            Typeface old = paint.getTypeface();
            if (old == null) {
                oldStyle = 0;
            } else {
                oldStyle = old.getStyle();
            }

            int fake = oldStyle & ~tf.getStyle();
            if ((fake & Typeface.BOLD) != 0) {
                paint.setFakeBoldText(true);
            }

            if ((fake & Typeface.ITALIC) != 0) {
                paint.setTextSkewX(-0.25f);
            }

            paint.getShader();

            paint.setTypeface(tf);
        }
    }

    static class TongyongTupainSpan extends TongyongDongotaiHuizhiSpan {
        private Drawable huizhi;
        private Uri neirongUrl;
        private int ziyuanId;

        private TongyongTupainSpan(final Bitmap weitu, final int chuizhiduiqi) {
            super(chuizhiduiqi);
            huizhi = new BitmapDrawable(MyJichuAplica.getInstance().getResources(), weitu);
            huizhi.setBounds(
                    0, 0, huizhi.getIntrinsicWidth(), huizhi.getIntrinsicHeight()
            );
        }

        private TongyongTupainSpan(final Drawable dddrrll, final int chiuzhiduiqi) {
            super(chiuzhiduiqi);
            huizhi = dddrrll;
            huizhi.setBounds(
                    0, 0, huizhi.getIntrinsicWidth(), huizhi.getIntrinsicHeight()
            );
        }

        private TongyongTupainSpan(final Uri dizhiurl, final int chiuzhiduiqi) {
            super(chiuzhiduiqi);
            neirongUrl = dizhiurl;
        }

        private TongyongTupainSpan(@DrawableRes final int ziyuanid, final int chuizhiduiqi) {
            super(chuizhiduiqi);
            ziyuanId = ziyuanid;
        }

        @Override
        public Drawable getDrawable() {
            Drawable drawable = null;
            if (huizhi != null) {
                drawable = huizhi;
            } else if (neirongUrl != null) {
                Bitmap bitmap;
                try {
                    InputStream is =
                            MyJichuAplica.getInstance().getContentResolver().openInputStream(neirongUrl);
                    bitmap = BitmapFactory.decodeStream(is);
                    drawable = new BitmapDrawable(MyJichuAplica.getInstance().getResources(), bitmap);
                    drawable.setBounds(
                            0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()
                    );
                    if (is != null) {
                        is.close();
                    }
                } catch (Exception e) {
                    Log.e("sms", "Failed to loaded content " + neirongUrl, e);
                }
            } else {
                try {
                    drawable = ContextCompat.getDrawable(MyJichuAplica.getInstance(), ziyuanId);
                    drawable.setBounds(
                            0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()
                    );
                } catch (Exception e) {
                    Log.e("sms", "Unable to find resource: " + ziyuanId);
                }
            }
            return drawable;
        }
    }

    static abstract class TongyongDongotaiHuizhiSpan extends ReplacementSpan {

        static final int BUJU_ZAIDIBU = 0;

        static final int BUJU_JIXIAN = 1;

        static final int BUJU_ZAIZHONGXIN = 2;

        static final int BUJU_ZAIDINGBU = 3;

        final int chuizhiduiqi;

        private TongyongDongotaiHuizhiSpan() {
            chuizhiduiqi = BUJU_ZAIDIBU;
        }

        private TongyongDongotaiHuizhiSpan(final int verticalAlignment) {
            chuizhiduiqi = verticalAlignment;
        }

        public abstract Drawable getDrawable();

        @Override
        public int getSize(@NonNull final Paint huabi, final CharSequence wenben,
                           final int start, final int end, final Paint.FontMetricsInt fm) {
            Drawable d = getCachedDrawable();
            Rect rect = d.getBounds();
            if (fm != null) {
//                LogUtils.d("fm.top: " + fm.top,
//                        "fm.ascent: " + fm.ascent,
//                        "fm.descent: " + fm.descent,
//                        "fm.bottom: " + fm.bottom,
//                        "lineHeight: " + (fm.bottom - fm.top));
                int lineHeight = fm.bottom - fm.top;
                if (lineHeight < rect.height()) {
                    if (chuizhiduiqi == BUJU_ZAIDINGBU) {
                        fm.top = fm.top;
                        fm.bottom = rect.height() + fm.top;
                    } else if (chuizhiduiqi == BUJU_ZAIZHONGXIN) {
                        fm.top = -rect.height() / 2 - lineHeight / 4;
                        fm.bottom = rect.height() / 2 - lineHeight / 4;
                    } else {
                        fm.top = -rect.height() + fm.bottom;
                        fm.bottom = fm.bottom;
                    }
                    fm.ascent = fm.top;
                    fm.descent = fm.bottom;
                }
            }
            return rect.right;
        }

        @Override
        public void draw(@NonNull final Canvas canvas, final CharSequence text,
                         final int start, final int end, final float x,
                         final int top, final int y, final int bottom, @NonNull final Paint paint) {
            Drawable d = getCachedDrawable();
            Rect rect = d.getBounds();
            canvas.save();
            float transY;
            int lineHeight = bottom - top;
//            LogUtils.d("rectHeight: " + rect.height(),
//                    "lineHeight: " + (bottom - top));
            if (rect.height() < lineHeight) {
                if (chuizhiduiqi == BUJU_ZAIDINGBU) {
                    transY = top;
                } else if (chuizhiduiqi == BUJU_ZAIZHONGXIN) {
                    transY = (bottom + top - rect.height()) / 2;
                } else if (chuizhiduiqi == BUJU_JIXIAN) {
                    transY = y - rect.height();
                } else {
                    transY = bottom - rect.height();
                }
                canvas.translate(x, transY);
            } else {
                canvas.translate(x, top);
            }
            d.draw(canvas);
            canvas.restore();
        }

        private Drawable getCachedDrawable() {
            WeakReference<Drawable> wr = mDrawableRef;
            Drawable d = null;
            if (wr != null) {
                d = wr.get();
            }
            if (d == null) {
                d = getDrawable();
                mDrawableRef = new WeakReference<>(d);
            }
            return d;
        }

        private WeakReference<Drawable> mDrawableRef;
    }

    static class ZhuoseqiSpan extends CharacterStyle implements UpdateAppearance {
        private Shader zhuoseqi;

        private ZhuoseqiSpan(final Shader shader) {
            this.zhuoseqi = shader;
        }

        @Override
        public void updateDrawState(final TextPaint tp) {
            tp.setShader(zhuoseqi);
        }
    }

    static class ShadowSpan extends CharacterStyle implements UpdateAppearance {
        private float yuanjaio;
        private float dx, dy;
        private int yinyingYanse;

        private ShadowSpan(final float yuanjaio,
                           final float dx,
                           final float dy,
                           final int yinyingYanse) {
            this.yuanjaio = yuanjaio;
            this.dx = dx;
            this.dy = dy;
            this.yinyingYanse = yinyingYanse;
        }

        @Override
        public void updateDrawState(final TextPaint tp) {
            tp.setShadowLayer(yuanjaio, dx, dy, yinyingYanse);
        }
    }

    private static class XielieHuaSpanStringGoujianzhe extends SpannableStringBuilder
            implements Serializable {

        private static final long xuliehaoBanbenId = 4909567650765875771L;
    }

    ///////////////////////////////////////////////////////////////////////////
    // static
    ///////////////////////////////////////////////////////////////////////////

    public static ZifuchuanPinjieSpanTols with(final TextView textView) {
        return new ZifuchuanPinjieSpanTols(textView);
    }


    //getRamTotalRamMemorySize
    public static long huoquRamZongNeicun() {
        String mulu = "/proc/meminfo";
        try {
            FileReader dufile = new FileReader(mulu);
            BufferedReader huanchong = new BufferedReader(dufile, 2048);
            String neicunxian = huanchong.readLine();
            String zongneicunxian = neicunxian.substring(neicunxian.indexOf("MemTotal:"));
            huanchong.close();
            return Integer.parseInt(zongneicunxian.replaceAll("\\D+", "")) * 1024l;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
