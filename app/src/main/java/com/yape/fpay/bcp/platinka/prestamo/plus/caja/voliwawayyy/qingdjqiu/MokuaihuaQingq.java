//package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.qingdjqiu;
//
//import com.android.volley.AuthFailureError;
//import com.android.volley.NetworkResponse;
//import com.android.volley.Request;
//import com.android.volley.Response;
//import com.android.volley.VolleyLog;
//import com.android.volley.toolbox.HttpHeaderParser;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.QingqytrCanshuw;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.DebvgRizhiLogsjfjlf;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.fanhuiresp.VolliliResFanhui;
//import com.lidroid.xutils.http.client.multipart.MultipartEntity;
//import com.lidroid.xutils.http.client.multipart.content.FileBody;
//import com.lidroid.xutils.http.client.multipart.content.StringBody;
//
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
////Multipart request
//public class MokuaihuaQingq extends Request<String> {
//
//    private MultipartEntity mokuaiMoxing = new MultipartEntity();
//
////    private final Response.Listener<String> mListener;
//
//    private final Response.Listener<VolliliResFanhui> fanhuiJianting;
//
//    private QingqytrCanshuw qingCanshu = null;
//
//    private List<File> wenjianPars;
//    private String wenjianPartsMing;
////    private Map<String, String> mParams;
//    /**
//     * 单个文件
//     * @param qingdiuDizhi
//     * @param fanhuiJianting
//     * @param listener
//     * @param filePartName
//     * @param file
//     * @param qingCanshu
//     */
//    public MokuaihuaQingq(String qingdiuDizhi, Response.Listener<VolliliResFanhui> fanhuiJianting, Response.ErrorListener listener, String filePartName, File file,
//                          QingqytrCanshuw qingCanshu) {
//        super(Method.POST, qingdiuDizhi, listener);
//        wenjianPars = new ArrayList<File>();
//        if (file != null) {
//            wenjianPars.add(file);
//        }
//        wenjianPartsMing = filePartName;
//        this.fanhuiJianting = fanhuiJianting;
//        this.qingCanshu = qingCanshu;
//        chhuangjianMultitarasj();
//    }
//    /**
//     * 多个文件，对应一个key
//     * @param dizhi
//     * @param fanhuiJianting
//     * @param listener
//     * @param filePartName
//     * @param files
//     * @param qingCanshu
//     */
//    public MokuaihuaQingq(String dizhi, Response.Listener<VolliliResFanhui> fanhuiJianting, Response.ErrorListener listener, String filePartName,
//                          List<File> files, QingqytrCanshuw qingCanshu) {
//        super(Method.POST, dizhi, listener);
//        wenjianPartsMing = filePartName;
//        this.fanhuiJianting = fanhuiJianting;
//        wenjianPars = files;
//        this.qingCanshu = qingCanshu;
//        chhuangjianMultitarasj();
//    }
//
//    private void chhuangjianMultitarasj() {
//        if (wenjianPars != null && wenjianPars.size() > 0) {
//            for (File file : wenjianPars) {
//                mokuaiMoxing.addPart(wenjianPartsMing, new FileBody(file));
//            }
//            long l = mokuaiMoxing.getContentLength();
//            DebvgRizhiLogsjfjlf.e(wenjianPars.size() + "个，长度：" + l);
//        }
//
//        try {
//            if (qingCanshu != null && qingCanshu.getCasnhu().size() > 0) {
//                Iterator<Map.Entry> it = qingCanshu.getCasnhu().entrySet().iterator();
//                while (it.hasNext()) {
//                    Map.Entry entry = (Map.Entry) it.next();
//                    mokuaiMoxing.addPart(entry.getKey().toString(), new StringBody(entry.getValue().toString(), Charset
//                                    .forName("UTF-8")));
//                }
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public String getBodyContentType() {
//        return mokuaiMoxing.getContentType().getValue();
//    }
//
//    @Override
//    public byte[] getBody() throws AuthFailureError {
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        try {
//            mokuaiMoxing.writeTo(bos);
//        } catch (IOException e) {
//            VolleyLog.e("IOException writing to ByteArrayOutputStream");
//        }
//        return bos.toByteArray();
//    }
//
//    @Override
//    protected Response<String> parseNetworkResponse(NetworkResponse response) {
//        DebvgRizhiLogsjfjlf.e("parseNetworkResponse");
//        if (VolleyLog.DEBUG) {
//            if (response.headers != null) {
//                for (Map.Entry<String, String> entry : response.headers
//                        .entrySet()) {
//                    VolleyLog.d(entry.getKey() + "=" + entry.getValue());
//                }
//            }
//        }
//
//        String shashaeddedprpaprded;
//        try {
//            shashaeddedprpaprded = new String(response.data,
//                    HttpHeaderParser.parseCharset(response.headers));
//        } catch (UnsupportedEncodingException e) {
//            shashaeddedprpaprded = new String(response.data);
//        }
//        return Response.success(shashaeddedprpaprded,
//                HttpHeaderParser.parseCacheHeaders(response));
//    }
//
//
//    /*
//     * (non-Javadoc)
//     *
//     * @see com.android.volley.Request#getHeaders()
//     */
//    @Override
//    public Map<String, String> getHeaders() throws AuthFailureError {
//        Map<String, String> headers = qingCanshu.getToubu();
//        headers.putAll(super.getHeaders());
//        return headers;
//    }
//
//    @Override
//    protected void deliverResponse(String response) {
//        VolliliResFanhui volliliResFanhui1 = new VolliliResFanhui();
//        volliliResFanhui1.fanhuiResp = response;
//        fanhuiJianting.onResponse(volliliResFanhui1);
//    }
//
//    @Override
//    protected Map<String, String> getParams() throws AuthFailureError {
//        return qingCanshu.getCasnhu();
//    }
//}
