package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ImageBianxiaoUtil;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhaopianXuanzeTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuBsActivity;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols;

import java.io.File;
import java.util.List;

import javax.annotation.Nullable;

import top.zibin.luban.Luban;
import top.zibin.luban.OnCompressListener;

@SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
public class WangyeHelperActivity extends MyJichuBsActivity implements View.OnClickListener {

    String wangyeLianjieDizhi = "";
    WebView wodeWangyeWWV;
    boolean shifouAnjian = false;

    String pagetype = "0";

    private ImageView zhuyemianDingbutu;
    private TextView title;
    private LinearLayout wangluocuowu;

    ValueCallback mUploadCallBack;
    ValueCallback<Uri[]> mUploadCallBackAboveL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏状态栏
        shezhiChuangkouSHiepi();
        setContentView(R.layout.a_qianruwebpage);

        //动态设置状态栏高度
        RelativeLayout.LayoutParams bujuguanli = (RelativeLayout.LayoutParams) findViewById(R.id.golbe_sjflT123_dingbuview).getLayoutParams();
        bujuguanli.height = ZhuajiPingmuTols.huoquZhuangtaiLanGaodu(this);
        findViewById(R.id.golbe_sjflT123_dingbuview).setLayoutParams(bujuguanli);

        if (getIntent() != null && getIntent().getStringExtra("webViewUrl") != null) {
            wangyeLianjieDizhi = getIntent().getStringExtra("webViewUrl");
        }

        if (getIntent() != null && getIntent().getStringExtra("showtype") != null) {
            pagetype = getIntent().getStringExtra("showtype");
        }

        wodeWangyeWWV = findViewById(R.id.webView);
        zhuyemianDingbutu = findViewById(R.id.sjljf_Uudiog_djgodg);
        wangluocuowu = findViewById(R.id.wangluocuowu);
        title = findViewById(R.id.title);
//        if (!TextUtils.isEmpty(BendiHuancunTols.huoQuZifuchuan(WangyeHelperActivity.this, APPMINGZI))) {
//            title.setText(BendiHuancunTols.huoQuZifuchuan(WangyeHelperActivity.this, APPMINGZI));
//        }
        //标题设置
        if("0".equals(pagetype)){//隐私协议
            title.setText(getString(R.string.peizhiandout_egdsgj_avi));
        }else if("1".equals(pagetype)){//投诉书
            title.setText(getString(R.string.peizhiandout_egdsgj_lib));
        }else if("2".equals(pagetype)){//服务条款
            title.setText(getString(R.string.qxppp_usestr_jieshou4));
        }else if("3".equals(pagetype)){//客服聚合
            title.setText(getString(R.string.ruanjianapp_mingzi));
        }else {
            title.setText(pagetype);
        }

        zhuyemianDingbutu.setOnClickListener(this);
        jiazaiWangYemian();



        jiazaizhongWindows.showKuangkuangIng();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sjljf_Uudiog_djgodg:
                finish();
                break;
        }
    }

    public void jiazaiWangYemian() {
        WebSettings wangPeizhi = wodeWangyeWWV.getSettings();
        wangPeizhi.setJavaScriptEnabled(true);
        wangPeizhi.setLoadWithOverviewMode(true); // 设置可以加载更多格式页面
        wangPeizhi.setUseWideViewPort(true); // 使用广泛的视窗
        wangPeizhi.setDomStorageEnabled(true); // 启用Dom storage api
        wangPeizhi.setJavaScriptCanOpenWindowsAutomatically(true); // 自动打开窗口

        wangPeizhi.setDefaultTextEncodingName("UTF-8");
        wangPeizhi.setAllowContentAccess(true); // 是否可访问Content Provider的资源，默认值 true
        wangPeizhi.setAllowFileAccess(true);    // 是否可访问本地文件，默认值 true
        // 是否允许通过file url加载的Javascript读取本地文件，默认值 false
        wangPeizhi.setAllowFileAccessFromFileURLs(false);
        // 是否允许通过file url加载的Javascript读取全部资源(包括文件,http,https)，默认值 false
        wangPeizhi.setAllowUniversalAccessFromFileURLs(false);
        // 支持缩放
        wangPeizhi.setSupportZoom(true);

        wangPeizhi.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS); // 排版适应屏幕
        wangPeizhi.setCacheMode(WebSettings.LOAD_DEFAULT);

        wodeWangyeWWV.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                try {
                    if (!url.startsWith("http") && !url.startsWith("https")) {
                        if (url.startsWith("whatsapp://")){
                            try {
                                String mobileNum = url.split("/?")[0];
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=" + mobileNum));
                                intent.setPackage("com.whatsapp");
                                startActivity(intent);
                            } catch (Exception e) {
                                e.printStackTrace();
                                Intent intent = new Intent(Intent.ACTION_VIEW);
                                intent.setData(Uri.parse("https://api.whatsapp.com"));
                                startActivity(intent);
                            }
                        }else if(url.startsWith("mailto:")){
                            if(hasEmailClient(WangyeHelperActivity.this)){
                                try {
                                    Intent indsd = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                                    startActivity(indsd);
                                }catch (Exception e){
                                }
                            }else {
                                Intent intent = new Intent(Intent.ACTION_SEND);
                                intent.setData(Uri.parse("mailto:"));
                                intent.putExtra(Intent.EXTRA_EMAIL, Uri.parse(url));
                                intent.setType("text/plain");
                                startActivity(Intent.createChooser(intent, ""));
                            }

                        }else if(url.startsWith("tel:")){
                            Intent indsd = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                            startActivity(indsd);
                        }
                        return true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return super.shouldOverrideUrlLoading(view, url);
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                wodeWangyeWWV.setVisibility(View.GONE);
                wangluocuowu.setVisibility(View.VISIBLE);
                jiazaizhongWindows.hideKuangkuangIng();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                jiazaizhongWindows.hideKuangkuangIng();
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                try {
                    if (url.contains("/MPsuccess.html")) {

                        //关闭当前页面 finish
                        finish();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        wodeWangyeWWV.setWebChromeClient(new MyWebChromeClient());

        wodeWangyeWWV.loadUrl(wangyeLianjieDizhi);
    }

    public boolean hasEmailClient(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"));
        List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
        return activities.size() > 0;
    }



    //返回按钮
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //如果按下的是回退键且历史记录里确实还有页面
        if (shifouAnjian) {
            return true;
        }
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wodeWangyeWWV.canGoBack()) {
            wodeWangyeWWV.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    public  final int SELECT_PHOTO = 2;//启动相册标识
    private void showFileChooser() {

//        Toast.makeText(this, "打开相册" + Thread.currentThread().getName(), Toast.LENGTH_SHORT).show();
//        Intent pickImageIntent;
//        boolean usePhotoPicker = false;
//        pickImageIntent = new Intent(Intent.ACTION_GET_CONTENT);
//        pickImageIntent.setType("image/*");
//        startActivityForResult(pickImageIntent, SELECT_PHOTO);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Intent pickImageIntent = new Intent();
            pickImageIntent.setAction(Intent.ACTION_PICK);
            pickImageIntent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//            Intent  pickImageIntent = new ActivityResultContracts.PickVisualMedia().createIntent(JinJinGoGoJian4Activity.this, new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
            startActivityForResult(pickImageIntent, SELECT_PHOTO);
        } else {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            startActivityForResult(intent, SELECT_PHOTO);
        }
    }

    Uri[] results = null;
    Uri imageUri = null;
    private void Lubancompress(Context context, String imagepath) {
        if (TextUtils.isEmpty(imagepath)) {
            return;
        }
        new Thread() {
            @Override
            public void run() {
                super.run();

                Luban.with(context).load(imagepath).ignoreBy(350).setCompressListener(new OnCompressListener() {

                    @Override
                    public void onStart() {

                    }

                    @Override
                    public void onSuccess(File file) {
//                        toLone = false;
                        Log.d("compress", "=======end===11==" + file.getAbsolutePath());
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (file != null) {
                                    try {
                                        Log.d("compress", "=======end===12==");
//                                        imageUri = FileProvider.getUriForFile(WangyeHelperActivity.this, "com.yape.fpay.bbva.platinka.credit.plus.caja.bcp.agora.prestamo.fileprovider", file);
                                        imageUri = Uri.fromFile(file);
                                        results = new Uri[]{imageUri};
                                    } catch (Exception e) {
                                    }
//                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                        if (mUploadCallBackAboveL != null) {
//                                            if (imageUri != null) {
////                                                Toast.makeText(this, "开始返回html", Toast.LENGTH_SHORT).show();
//                                                Log.d("compress", "=======end===result1=="+results);
//                                                mUploadCallBackAboveL.onReceiveValue(results);
//                                                mUploadCallBackAboveL = null;
////                                                return;
//                                            }
//                                        }
//                                    } else if (mUploadCallBack != null) {
//                                        if (imageUri != null) {
//                                            Log.d("compress", "=======end===result2=="+imageUri);
//                                            mUploadCallBack.onReceiveValue(imageUri);
//                                            mUploadCallBack = null;
////                                            return;
//                                        }
//                                    }



//
                                }
                                Log.d("compress", "=======end===results=="+results);
                                mUploadCallBackAboveL.onReceiveValue(results);
                                Log.d("compress", "=======end===13==");
//                                mUploadCallBackAboveL = null;
                            }
                        });

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                }).launch();
            }
        }.start();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case SELECT_PHOTO:
                if (resultCode == RESULT_OK && data != null) {

                    if (Build.MODEL.equals("Nexus 5X")) {
                        try {
                            String compressPath = ZhaopianXuanzeTols.getPathFromUri(this, data.getData());
//                        TuImgYasuoUtils tuImgYasuoUtils = new TuImgYasuoUtils(WangyeHelperActivity.this);
//
//
//                            String yasuotupianhou_uri = CompresImgTols.yasuoTufanhuiLujing(compressPath, this);
                            Uri newUri = null;
                            newUri = Uri.fromFile(new File(compressPath));
                            mUploadCallBackAboveL.onReceiveValue(new Uri[]{newUri});
                            mUploadCallBackAboveL = null;


//                        Lubancompress(this, compressPath);
                        } catch (Exception e) {
                            e.printStackTrace();
                            mUploadCallBackAboveL = null;
                        }
                    } else {
                        try {
                            Uri d32j2 = null;
                            if (data != null) {
                                if (data.getDataString() != null) {
                                    d32j2 = Uri.parse(data.getDataString());
                                } else if (data.getClipData() != null) {
                                    ClipData d323fw3 = data.getClipData();
                                    d32j2 = d323fw3.getItemAt(0).getUri();
                                }
                            }
                            if (d32j2 == null || mUploadCallBackAboveL == null) {
                                clearUploadMessage();
                                return;
                            }
                            Bitmap d3dSize = ImageBianxiaoUtil.getBitemap(this, d32j2);
                            if (d3dSize == null) {
                                return;
                            }
                            d3dSize = ImageBianxiaoUtil.compBianxiaodianress(d3dSize);
                            int rcr3rdwO = ImageBianxiaoUtil.getImtutuageO(this, d32j2);
                            if (rcr3rdwO > 0) {
                                d3dSize = ImageBianxiaoUtil.rotatingImage(d3dSize, rcr3rdwO);
                            }
                            int rcr3rdwO2 = ImageBianxiaoUtil.getJtutujjjjpgO(this, d32j2);
                            if (rcr3rdwO2 > 0) {
                                d3dSize = ImageBianxiaoUtil.rotatingImage(d3dSize, rcr3rdwO2);
                            }
                            String s = ImageBianxiaoUtil.bittutuimgmapTowenFile(ImageBianxiaoUtil.getPath(this, true), d3dSize);
                            mUploadCallBackAboveL.onReceiveValue(new Uri[]{Uri.fromFile(new File(s))});
                        } catch (Exception e) {
                            e.printStackTrace();
                            clearUploadMessage();
                        }
                    }

                } else {
                    clearUploadMessage();
                }
                break;
        }

    }

    private void clearUploadMessage() {
        if (mUploadCallBackAboveL != null) {
            mUploadCallBackAboveL.onReceiveValue(null);
            mUploadCallBackAboveL = null;
        }
        if (mUploadCallBack != null) {
            mUploadCallBack.onReceiveValue(null);
            mUploadCallBack = null;
        }
    }

    @Override
    public void onBackPressed() {
        wodeWangyeWWV.evaluateJavascript("javascript:onBackPressed()", new ValueCallback<String>() {
            @Override
            public void onReceiveValue(String s) {
                if ("0".equals(s)) {

                    Toast.makeText(WangyeHelperActivity.this, "not back error", Toast.LENGTH_SHORT).show();

                } else {
                    if (wodeWangyeWWV.canGoBack()) {
                        wodeWangyeWWV.goBack();
                    } else {
                        WangyeHelperActivity.super.onBackPressed();
                    }
                }
            }
        });
    }



    private class MyWebChromeClient extends WebChromeClient {


        // For Android < 3.0
        public void openFileChooser(ValueCallback<Uri> valueCallback) {
            mUploadCallBack = valueCallback;
            showFileChooser();
        }

        // For Android  >= 3.0
        public void openFileChooser(ValueCallback valueCallback, String acceptType) {
            mUploadCallBack = valueCallback;
            showFileChooser();
        }

        //For Android  >= 4.1
        public void openFileChooser(ValueCallback<Uri> valueCallback, String acceptType, String capture) {
            mUploadCallBack = valueCallback;
            showFileChooser();
        }

        // For Android >= 5.0
        @Override
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            mUploadCallBackAboveL = filePathCallback;
            fileChooserParams.getMode();
            showFileChooser();
            return true;
        }

        @Override
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            if (TextUtils.isEmpty(title)) {
                //赋值标题赋值操作
            }
        }

        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }
    }
}
