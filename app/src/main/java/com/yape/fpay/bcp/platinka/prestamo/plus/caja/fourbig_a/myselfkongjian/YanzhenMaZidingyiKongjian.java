package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.myselfkongjian;

import static android.content.Context.CLIPBOARD_SERVICE;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;

import java.lang.reflect.Field;


/**
 * @Date 2023/5/9
 * @describe 自定义方形验证码输入框
 */

public class YanzhenMaZidingyiKongjian extends LinearLayout implements TextWatcher, View.OnKeyListener, View.OnFocusChangeListener, ZhantieShrukZidingyiKongjian.ZhantieHuidiaoJianting {

    private Context dangqianchiyouzhe;
    private OnShuruOverListener onShuruOverListener;

    /**
     * 输入框数量
     */
    private int shurukuangShuliang;

    /**
     * 输入框类型
     */
    private KuangLeixing shurukuangLeixing;
    /**
     * 输入框的宽度
     */
    private int shurukuangKuandu;

    /**
     * 输入框的高度
     */
    private int shurukuangGaodu;

    /**
     * 文字颜色
     */
    private int wenziYanse;

    /**
     * 文字大小
     */
    private float wenziDaxiao;

    /**
     * 输入框背景
     */
    private int shurukuangBeijing;

    /**
     * 输入框间距
     */
    private int shurukuangJianju;

    /**
     * 平分后的间距
     */
    private int jianjuPingfen;

    /**
     * 判断是否平分
     */
    private boolean isPingjunfen = false;

    /**
     * 是否显示光标
     */
    private boolean shifouXianGuangbiao;

    /**
     * 光标样式
     */
    private int guangbiaoYangzi;

    /**
     * 输入框宽度
     */
    private int zongKuandu;

    /**
     * 输入框间距
     */
    private int bianjuZhi;

    public OnShuruOverListener getOnCodeFinishListener() {
        return onShuruOverListener;
    }

    public void setOnShuruOverListener(OnShuruOverListener onShuruOverListener) {
        this.onShuruOverListener = onShuruOverListener;
    }

    public int getShurukuangShuliang() {
        return shurukuangShuliang;
    }

    public void setShurukuangShuliang(int shurukuangShuliang) {
        this.shurukuangShuliang = shurukuangShuliang;
    }

    public KuangLeixing getShurukuangLeixing() {
        return shurukuangLeixing;
    }

    public void setShurukuangLeixing(KuangLeixing shurukuangLeixing) {
        this.shurukuangLeixing = shurukuangLeixing;
    }

    public int getShurukuangKuandu() {
        return shurukuangKuandu;
    }

    public int getShurukuangGaodu() {
        return shurukuangGaodu;
    }

    public void setShurukuangKuandu(int shurukuangKuandu) {
        this.shurukuangKuandu = shurukuangKuandu;
    }

    public void setShurukuangGaodu(int shurukuangGaodu) {
        this.shurukuangGaodu = shurukuangGaodu;
    }

    public int getWenziYanse() {
        return wenziYanse;
    }

    public void setWenziYanse(int wenziYanse) {
        this.wenziYanse = wenziYanse;
    }

    public float getWenziDaxiao() {
        return wenziDaxiao;
    }

    public void setWenziDaxiao(float wenziDaxiao) {
        this.wenziDaxiao = wenziDaxiao;
    }

    public int getShurukuangBeijing() {
        return shurukuangBeijing;
    }

    public void setShurukuangBeijing(int shurukuangBeijing) {
        this.shurukuangBeijing = shurukuangBeijing;
    }

    public int getGuangbiaoYangzi() {
        return guangbiaoYangzi;
    }

    public void setGuangbiaoYangzi(int guangbiaoYangzi) {
        this.guangbiaoYangzi = guangbiaoYangzi;
    }

    public enum KuangLeixing {
        /**
         * 数字类型
         */
        SHUZILEIXING,

        /**
         * 数字密码
         */
        SHUZIMIMA,
        /**
         * 文字
         */
        WENANZI,
        /**
         * 文字密码
         */
        WENZIMIMA,
    }

    public YanzhenMaZidingyiKongjian(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.dangqianchiyouzhe = context;
        @SuppressLint({"Recycle", "CustomViewStyleable"})
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.shurukuangShuliang);
        shurukuangShuliang = typedArray.getInteger(R.styleable.shurukuangShuliang_yzm_shurukuang_shuliang, 4);
        int inputType = typedArray.getInt(R.styleable.shurukuangShuliang_yzm_shurukuang_leixing, KuangLeixing.SHUZILEIXING.ordinal());
        shurukuangLeixing = KuangLeixing.values()[inputType];
        shurukuangKuandu = typedArray.getDimensionPixelSize(R.styleable.shurukuangShuliang_yzm_shurukuang_kuandu, 96);
        shurukuangGaodu = typedArray.getDimensionPixelSize(R.styleable.shurukuangShuliang_yzm_shurukuang_gaodu, 96);
        wenziYanse = typedArray.getColor(R.styleable.shurukuangShuliang_yzm_shurukuang_yanse, Color.BLACK);
        wenziDaxiao = typedArray.getInteger(R.styleable.shurukuangShuliang_yzm_shurukuang_daxiao, 16);
//        mEtTextSize = typedArray.getDimensionPixelSize(R.styleable.shurukuangShuliang_vcv_et_text_size, 16);
        shurukuangBeijing = typedArray.getResourceId(R.styleable.shurukuangShuliang_yzm_shurukuang_beijing, R.drawable.lylt_baishfif);
        guangbiaoYangzi = typedArray.getResourceId(R.styleable.shurukuangShuliang_yzm_shurukuang_guangbiaoyangzi, R.drawable.nonggehao_youbiao);
        shifouXianGuangbiao = typedArray.getBoolean(R.styleable.shurukuangShuliang_yzm_shurukuang_guangbiaokejian, false);

        isPingjunfen = typedArray.hasValue(R.styleable.shurukuangShuliang_yzm_shurukuang_pingfenfou);
        if (isPingjunfen) {
            shurukuangJianju = typedArray.getDimensionPixelSize(R.styleable.shurukuangShuliang_yzm_shurukuang_pingfenfou, 0);
        }
        chushiHuashitu();
        //释放资源
        typedArray.recycle();
    }

    @SuppressLint("ResourceAsColor")
    private void chushiHuashitu() {
        for (int i = 0; i < shurukuangShuliang; i++) {
            ZhantieShrukZidingyiKongjian zhantieShrukZidingyiKongjian = new ZhantieShrukZidingyiKongjian(dangqianchiyouzhe);
            chushihuaShurukuang(zhantieShrukZidingyiKongjian, i);
            addView(zhantieShrukZidingyiKongjian);
            //设置第一个editText获取焦点
            if (i == 0) {
                zhantieShrukZidingyiKongjian.setFocusable(true);
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private void chushihuaShurukuang(ZhantieShrukZidingyiKongjian shrukuang, int i) {
//        Typeface typeFace = Typeface.createFromAsset(getResources().getAssets(), ConfigConst.TEXT_TYPE_FACE_BOLD);
        shrukuang.setLayoutParams(huoquShurukuangBujucanshu(i));
        shrukuang.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        shrukuang.setGravity(Gravity.CENTER);
        shrukuang.setId(i);
        shrukuang.setCursorVisible(true);
//        editText.setMaxEms(1);
        shrukuang.setTextColor(wenziYanse);
        shrukuang.setTextSize(TypedValue.COMPLEX_UNIT_SP, wenziDaxiao);
        shrukuang.setCursorVisible(shifouXianGuangbiao);
        shrukuang.setMaxLines(1);
//        editText.setTypeface(typeFace);
//        editText.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        if (i == 0) {
            shrukuang.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        } else {
            shrukuang.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
        }
        switch (shurukuangLeixing) {
            case SHUZILEIXING:
                shrukuang.setInputType(InputType.TYPE_CLASS_NUMBER);
                break;
            case SHUZIMIMA:
                shrukuang.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                shrukuang.setTransformationMethod(new ReplaceHidePwdTxt());
                break;
            case WENANZI:
                shrukuang.setInputType(InputType.TYPE_CLASS_TEXT);
                break;
            case WENZIMIMA:
                shrukuang.setInputType(InputType.TYPE_CLASS_NUMBER);
                break;
            default:
                shrukuang.setInputType(InputType.TYPE_CLASS_NUMBER);
        }
        shrukuang.setPadding(0, 0, 0, 0);
        shrukuang.setOnKeyListener(this);
        shrukuang.setBackgroundResource(shurukuangBeijing);
//        editText.setTextCursorDrawable(R.drawable.login_edt_cursor_verifiation); 系统提供的方法 但是需要升级compileSdkVersion 到 30以后才能用
        sehzhiShrukuangGuangbiao(shrukuang);
        shrukuang.addTextChangedListener(this);
        shrukuang.setOnKeyListener(this);
        shrukuang.setOnFocusChangeListener(this);
        shrukuang.setOnZhantieHuidiaoJianting(this);
        shrukuang.setOnKeyListener(new RunajiKeyJianting());
    }

    /**
     * 获取EditText 的 LayoutParams
     */
    public LayoutParams huoquShurukuangBujucanshu(int i) {
        LayoutParams bujucanshu = new LayoutParams(shurukuangKuandu, shurukuangGaodu);
        if (!isPingjunfen) {
            //平分Margin，把第一个EditText跟最后一个EditText的间距同设为平分
            jianjuPingfen = (zongKuandu - shurukuangShuliang * shurukuangKuandu) / (shurukuangShuliang - 1);
            if (i == 0) {
                //考虑到需求左又边距固定24dp,故将边距设置为0
                bujucanshu.leftMargin = 0;
//                layoutParams.leftMargin = mEtBisectSpacing;
                bujucanshu.rightMargin = jianjuPingfen / 2;
            } else if (i == shurukuangShuliang - 1) {
                bujucanshu.leftMargin = jianjuPingfen / 2;
                bujucanshu.rightMargin = 0;
//                layoutParams.rightMargin = mEtBisectSpacing;
            } else {
//                layoutParams.leftMargin = 0;
//                layoutParams.rightMargin = 0;
                bujucanshu.leftMargin = jianjuPingfen / 2;
                bujucanshu.rightMargin = jianjuPingfen / 2;
            }
        } else {
            bujucanshu.leftMargin = shurukuangJianju / 2;
            bujucanshu.rightMargin = shurukuangJianju / 2;
        }

        bujucanshu.gravity = Gravity.CENTER;
        return bujucanshu;
    }

    //设置光标
    public void sehzhiShrukuangGuangbiao(EditText shruk) {
        //修改光标的颜色（反射）
        if (shifouXianGuangbiao) {
            try {
                Field f = TextView.class.getDeclaredField("mCursorDrawableRes");
                f.setAccessible(true);
                f.set(shruk, guangbiaoYangzi);
            } catch (Exception ignored) {

            }
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        zongKuandu = getMeasuredWidth();
        gengxinWaijianju();
    }

    private void gengxinWaijianju() {
        for (int i = 0; i < shurukuangShuliang; i++) {
            EditText kkk = (EditText) getChildAt(i);
            kkk.setLayoutParams(huoquShurukuangBujucanshu(i));
        }
    }


    @Override
    public void onFocusChange(View view, boolean b) {
        if (b) {
            gaodaoJujiaodian();
            //当获取焦点时取消红框
//            setAllEdtBackground(R.drawable.login_edt_code);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String content = s.toString().trim();
        //判断粘贴板当前是否为6位纯数字验证码
        if (content != null && content.length() == shurukuangShuliang && shifouChuanNumer(content)) {
            for (int i = 0; i < shurukuangShuliang; i++) {
                EditText editText = (EditText) getChildAt(i);
                editText.setText(content.substring(i, i + 1));
                editText.setSelection(1);
            }
        }
    }


    @Override
    public void zhanTie() {
        ClipboardManager cm = (ClipboardManager) getContext().getSystemService(CLIPBOARD_SERVICE);
        ClipData data = cm.getPrimaryClip();
        ClipData.Item item = data.getItemAt(0);
        String content = item.getText().toString().replaceAll("[^0-9]", "");

        sehzhiYazzma(content);

//        char[] shuzuKRYzm = content.toCharArray();
//        //判断粘贴板当前是否为6位纯数字验证码
//        if (content != null && content.length() >= shurukuangShuliang){
//            for (int i = 0; i < shurukuangShuliang; i++) {
//                EditText editText = (EditText) getChildAt(i);
//                editText.setText(String.valueOf(shuzuKRYzm[i]));
//                editText.setSelection(1);
//            }
//        }else {
//            for (int i = 0; i < content.length(); i++) {
//                EditText editText = (EditText) getChildAt(i);
//                editText.setText(String.valueOf(shuzuKRYzm[i]));
//                editText.setSelection(1);
//            }
//        }
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (s.length() != 0) {
            gaodaoJujiaodian();
        }
        if (onShuruOverListener != null && s.length() == 1) {
            onShuruOverListener.onShuruBianhua(this, huoquJieguoPinjie());
            //如果最后一个输入框有字符，则返回结果
            EditText lastEditText = (EditText) getChildAt(shurukuangShuliang - 1);
            if (lastEditText.getText().length() > 0) {
                onShuruOverListener.onShuruWancheng(this, huoquJieguoPinjie());
            }
        }

        onShuruOverListener.onShuruBianhua(this, huoquJieguoPinjie());
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_DEL && event.getAction() == KeyEvent.ACTION_DOWN) {
            fanhuiHuoquJiaodian();
        }
        return false;
    }

    @Override
    public void setEnabled(boolean enabled) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            child.setEnabled(enabled);
        }
    }

    /**
     * 获取焦点
     */
    private void gaodaoJujiaodian() {
        int shumu = getChildCount();
        EditText kaungkuang;
        //利用for循环找出还最前面那个还没被输入字符的EditText，并把焦点移交给它。
        for (int i = 0; i < shumu; i++) {
            kaungkuang = (EditText) getChildAt(i);
            if (kaungkuang.getText().length() < 1) {
                if (shifouXianGuangbiao) {
                    kaungkuang.setCursorVisible(false);
                } else {
                    kaungkuang.setCursorVisible(false);
                }
                kaungkuang.requestFocus();
                return;
            } else if (i == shumu - 1) {
                if (shifouXianGuangbiao) {
                    kaungkuang.setCursorVisible(false);
                } else {
                    kaungkuang.setCursorVisible(false);
                }
                kaungkuang.requestFocus();
            } else {
                kaungkuang.setCursorVisible(false);
                if (i == shumu - 1) {
                    kaungkuang.requestFocus();
                }
            }
        }
    }

    /**
     * 删除一位
     */
    private void shanchuShuruNrigon() {
        int shumu = getChildCount();
        EditText kuangkuang;
        //利用for循环找出还最前面那个还没被输入字符的EditText，并把焦点移交给它。
        for (int i = 0; i < shumu; i++) {
            kuangkuang = (EditText) getChildAt(i);
            if (kuangkuang.getText().length() < 1) {
                EditText frontEditText = (EditText) getChildAt(i - 1);
                //清空最后一位
                if (frontEditText != null)
                    frontEditText.getText().clear();
                //切换光标
                gaodaoJujiaodian();
                return;
            } else if (i == shumu - 1) {
                EditText frontEditText = (EditText) getChildAt(i);
                //清空最后一位
                if (frontEditText != null)
                    frontEditText.getText().clear();
                //切换光标
                gaodaoJujiaodian();
            }
        }
    }

    //返回上一个输入框，并获取焦点
    private void fanhuiHuoquJiaodian() {
        EditText kuangkuang;
        //循环检测有字符的`editText`，把其置空，并获取焦点。
        for (int i = shurukuangShuliang - 1; i >= 0; i--) {
            kuangkuang = (EditText) getChildAt(i);
            if (kuangkuang.getText().length() >= 1) {
                kuangkuang.setText("");
                if (shifouXianGuangbiao) {
                    kuangkuang.setCursorVisible(false);
                } else {
                    kuangkuang.setCursorVisible(false);
                }
                kuangkuang.requestFocus();
                return;
            }
        }
    }

    //获取结果
    private String huoquJieguoPinjie() {
        StringBuilder ssbb = new StringBuilder();
        EditText kuangk;
        for (int i = 0; i < shurukuangShuliang; i++) {
            kuangk = (EditText) getChildAt(i);
            ssbb.append(kuangk.getText());
        }
        return ssbb.toString();
    }

    public void sehzhiAllBeijing(int errorEdtBack) {
        EditText sdjgojdf;
        for (int i = 0; i < shurukuangShuliang; i++) {
            sdjgojdf = (EditText) getChildAt(i);
            sdjgojdf.setBackgroundResource(errorEdtBack);
        }
    }

    public interface OnShuruOverListener {
        /**
         * 文本改变
         */
        void onShuruBianhua(View view, String content);

        /**
         * 输入完成
         */
        void onShuruWancheng(View view, String content);
    }

    /**
     * 清空验证码输入框
     */
    public void qingkongShurukuang() {
        EditText etaksjfff;
        for (int i = shurukuangShuliang - 1; i >= 0; i--) {
            etaksjfff = (EditText) getChildAt(i);
            etaksjfff.setText("");
//            if (i == 0) {
//                if (cursorVisible) {
//                    editText.setCursorVisible(true);
//                } else {
//                    editText.setCursorVisible(false);
//                }
//                editText.requestFocus();
//            }
        }
    }

    /**
     * 设置验证码
     */
    public void sehzhiYazzma(String code) {
        char[] shuzuKRAJSDJ = code.toCharArray();
        if (shuzuKRAJSDJ.length >= shurukuangShuliang) {
            for (int i = 0; i < shurukuangShuliang; i++) {
                EditText editText = (EditText) getChildAt(i);
                editText.setText(String.valueOf(shuzuKRAJSDJ[i]));
                editText.setSelection(1);
            }
        }else {//处理粘贴验证码情况
            for (int i = 0; i < shuzuKRAJSDJ.length; i++) {
                EditText editText = (EditText) getChildAt(i);
                editText.setText(String.valueOf(shuzuKRAJSDJ[i]));
                editText.setSelection(i);
                Log.d("粘贴验证码情况","轮到"+i);
            }
        }
    }

    public class ReplaceHidePwdTxt extends PasswordTransformationMethod {
        @Override
        public CharSequence getTransformation(CharSequence source, View view) {
            return new PasswordCharSequence(source);
        }

        private class PasswordCharSequence implements CharSequence {
            private CharSequence mimayuan;

            public PasswordCharSequence(CharSequence source) {
                mimayuan = source; // Store char sequence
            }

            @Override
            public char charAt(int index) {
                return '•'; // This is the important part
            }

            @Override
            public int length() {
                return mimayuan.length(); // Return default
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                return mimayuan.subSequence(start, end); // Return default
            }
        }
    }

    /**
     * 得到屏幕宽度
     *
     * @return
     */
    private int gaodPingmuKuandu() {
        WindowManager chaungkouGuanli = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics thgrfeafsg = new DisplayMetrics();
        chaungkouGuanli.getDefaultDisplay().getMetrics(thgrfeafsg);
        return thgrfeafsg.widthPixels;
    }

    //判断当前字符串内是否为纯数字
    public static boolean shifouChuanNumer(String str) {
        for (int i = str.length(); --i >= 0; ) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    //软键盘监听
    class RunajiKeyJianting implements OnKeyListener {
        @Override
        public boolean onKey(View view, int keyCode, KeyEvent event) {
            EditText djwad = (EditText) view;
            int index = djwad.getSelectionStart();
            Editable editable = djwad.getText();
            String editableString = editable.toString();
//            XLog.e("EditKeyListener --event.getAction():    ",event.getAction()+"");
//            XLog.e("EditKeyListener --keyCode:  ",keyCode+"");
            if (event.getAction() == KeyEvent.ACTION_DOWN) {
                if (keyCode == KeyEvent.KEYCODE_DEL) {
                    shanchuShuruNrigon();//删除一位
                    return true;
                }
            }
            return false;
        }
    }
}
