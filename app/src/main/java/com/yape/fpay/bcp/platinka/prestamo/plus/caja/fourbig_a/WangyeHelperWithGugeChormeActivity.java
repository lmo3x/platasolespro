package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.DianjiQuickTols;

public class WangyeHelperWithGugeChormeActivity extends MyJichuBsActivity implements View.OnClickListener {

    private WebView mwodewwvvb;
    private TextView wangyemingzi;
    private LinearLayout wangluocuowu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_qianruwebpage2);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        //动态设置状态栏高度
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        layoutParams.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(layoutParams);

        mwodewwvvb = findViewById(R.id.mwodewwvvb);
        wangyemingzi = findViewById(R.id.wangyemingzi);
        wangluocuowu = findViewById(R.id.wangluocuowu);
        View backIv = findViewById(R.id.hgfasgBAKCKC);
        DianjiQuickTols.kuaiLeMa(backIv, this);

//        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(this, APPMINGZI))) {
//            wangyemingzi.setText(BendiHuancunTols.huoQuZifuchuan(this, APPMINGZI));
//        }

//        mwodewwvvb.removeJavascriptInterface("searchBoxJavaBridge_");
//        mwodewwvvb.removeJavascriptInterface("accessibilityTraversal");
//        mwodewwvvb.removeJavascriptInterface("accessibility");
        mwodewwvvb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        // 修改ua使得web端正确判断
        String ua = mwodewwvvb.getSettings().getUserAgentString();
        mwodewwvvb.getSettings().setJavaScriptEnabled(true);
        mwodewwvvb.getSettings().setDomStorageEnabled(true);

        mwodewwvvb.getSettings().setUseWideViewPort(true);
        mwodewwvvb.getSettings().setAllowFileAccess(true);
//        mwodewwvvb.getSettings().setCacheMode();setAppCacheEnabled(true);
        mwodewwvvb.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        mwodewwvvb.getSettings().setSaveFormData(false);
        mwodewwvvb.getSettings().setLoadsImagesAutomatically(true);
        mwodewwvvb.getSettings().setDatabaseEnabled(true);
        mwodewwvvb.getSettings().setBlockNetworkImage(false);//解决图片不显示
        mwodewwvvb.setWebChromeClient(new WOdeGugeNeikeLiualanqi());
//
        mwodewwvvb.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("http://") || url.startsWith("https://")) { // 4.0以上必须要加
                    view.loadUrl(url);
                    return true;
                }
                return false;
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                if (mwodewwvvb!=null&&wangluocuowu!=null){
                    mwodewwvvb.setVisibility(View.GONE);
                    wangluocuowu.setVisibility(View.VISIBLE);
                }
                jiazaizhongWindows.hideKuangkuangIng();
            }

//            @Override
//            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                super.onReceivedError(view, errorCode, description, failingUrl);
//                mwodewwvvb.setVisibility(View.GONE);
//                wangluocuowu.setVisibility(View.VISIBLE);
//            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                jiazaizhongWindows.hideKuangkuangIng();
            }
        });


        jiazaizhongWindows.showKuangkuangIng();

        String mUrl = getIntent().getStringExtra("web_url");
        mwodewwvvb.loadUrl(mUrl);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.hgfasgBAKCKC:
                finish();
                break;
        }
    }

    final class WOdeGugeNeikeLiualanqi extends WebChromeClient {
        @Override
        public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
            result.confirm();
            return true;
        }

        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }
    }

}
