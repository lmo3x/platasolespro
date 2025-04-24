package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.myselfkongjian;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.gjtype.SelectGuoJiaUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;


public class AuotmailEdit extends AppCompatAutoCompleteTextView {
    private String[] mailchuan = new String[]{"@gmail.com", "@hotmail.com", "@yahoo.com", "@outlook.com", "unh.edu", "speedy.com", "live.com", "continental.edu"};
    private String[] mailchuanEg = new String[]{"@yahoo.com", "@hotmail.com", "@gmail.com", "@outlook.com"};


    public AuotmailEdit(Context updownwen) {
        super(updownwen);
        xrdewsdrftgryhuj(updownwen);
    }

    public AuotmailEdit(Context updownwen, AttributeSet attr) {
        super(updownwen, attr);
        xrdewsdrftgryhuj(updownwen);
    }

    public AuotmailEdit(Context updownwen, AttributeSet asrr, int mjre) {
        super(updownwen, asrr, mjre);
        xrdewsdrftgryhuj(updownwen);
    }

    private void xrdewsdrftgryhuj(final Context updownwen) {

        String[] listEmail = mailchuan;
        if (SelectGuoJiaUtil.isGuoJiaEg()) {
            listEmail = mailchuanEg;
        }

        //adapter中使用默认的emailSufixs中的数据，可以通过setAdapterString来更改
        this.setAdapter(new AutmailhForlist(updownwen, R.layout.i_autmail, listEmail));
        //使得在输入1个字符之后便开启自动完成
        this.setThreshold(1);
        this.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    String text = AuotmailEdit.this.getText().toString().trim();
                    //当该文本域重新获得焦点后，重启自动完成
                    if (!"".equals(text))
                        performFiltering(text, 0);
                } else {
                    //当文本域丢失焦点后，检查输入email地址的格式
                    AuotmailEdit auotmailEdit = (AuotmailEdit) v;
                    String cssss = auotmailEdit.getText().toString().trim();
                    //这里正则写的有点粗暴:)
                    if (cssss != null && cssss.matches("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$")) {

                    } else {
//                        Toast toast = Toast.makeText(Context, getResources().getText(R.string.gram_error_info_email).toString(), Toast.LENGTH_SHORT);
//                        toast.show();
                    }
                }
            }
        });
    }

    @Override
    protected void replaceText(CharSequence cccsss) {
        //当我们在下拉框中选择一项时，android会默认使用AutoCompleteTextView中Adapter里的文本来填充文本域
        //因为这里Adapter中只是存了常用email的后缀
        //因此要重新replace逻辑，将用户输入的部分与后缀合并
//        Log.e("lngram", text.toString());
        String t = this.getText().toString().trim();
        int index = t.indexOf("@");
        if (index != -1)
            t = t.substring(0, index);
        super.replaceText(t + cccsss);
    }


    @Override
    protected void performFiltering(CharSequence cccssss, int aesrtu) {
        //该方法会在用户输入文本之后调用，将已输入的文本与adapter中的数据对比，若它匹配
        //adapter中数据的前半部分，那么adapter中的这条数据将会在下拉框中出现
//        Log.i("performFiltering" + " performFiltering", text.toString() + "   " + keyCode);
        String t = cccssss.toString().trim();
        //因为用户输入邮箱时，都是以字母，数字开始，而我们的adapter中只会提供以类似于"@163.com"
        //的邮箱后缀，因此在调用super.performFiltering时，传入的一定是以"@"开头的字符串
        int index = t.indexOf("@");
        if (index == -1) {
            if (t.matches("^[a-zA-Z0-9_]+$")) {
                super.performFiltering("@", aesrtu);
            } else
                this.dismissDropDown();//当用户中途输入非法字符时，关闭下拉提示框
        } else {
            super.performFiltering(t.substring(index), aesrtu);
        }
    }

    private class AutmailhForlist extends ArrayAdapter<String> {
        public AutmailhForlist(Context mailtxt, int vaee, String[] mailzu) {
            super(mailtxt, vaee, mailzu);
        }

        @Override
        public View getView(int position, View vvvv, ViewGroup parentsjdla) {
            //Log.i("getView", "in GetView");
            View v = vvvv;
            if (v == null)
                v = LayoutInflater.from(getContext()).inflate(
                        R.layout.i_autmail, null);
            TextView mailtxt = (TextView) v.findViewById(R.id.mailtxt);
            String t = AuotmailEdit.this.getText().toString().trim();

            if (!t.contains("@")) {
                SpannableStringBuilder crtvgyujhygtf = new SpannableStringBuilder(t + getItem(position));
                //设置文字颜色。
                crtvgyujhygtf.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.sezhi_argb_FD3A3A)), 0, t.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
                //将用户输入的文本与adapter中的email后缀拼接后，在下拉框中显示
//            dsgqejlbseajaxl.setText(t + getItem(position));
                mailtxt.setText(crtvgyujhygtf);
//                Log.i("lngram", dsgqejlbseajaxl.getWidgetText().toString());
//                Log.i("lngram", "t:" + t);
            } else {
                int index = t.indexOf("@");
                String t2 = "";
                if (index != -1)
                    t2 = t.substring(0, index);
                SpannableStringBuilder vbnutygrfdftg = new SpannableStringBuilder(t2 + getItem(position));
                //设置文字颜色。
                vbnutygrfdftg.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.sezhi_argb_FD3A3A)), 0, t.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
                //将用户输入的文本与adapter中的email后缀拼接后，在下拉框中显示
//            dsgqejlbseajaxl.setText(t + getItem(position));
                mailtxt.setText(vbnutygrfdftg);

            }
            return v;
        }


    }

    public void adfdfRREWsczx() {
        this.dismissDropDown();//关闭下拉提示框
    }
}
