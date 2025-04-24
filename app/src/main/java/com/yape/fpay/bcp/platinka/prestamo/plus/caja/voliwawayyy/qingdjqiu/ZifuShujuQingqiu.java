package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.qingdjqiu;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.QingqPeizhisSsf;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.QingqytrCanshuw;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.DebvgRizhiLogsjfjlf;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.fanhuiresp.VolliliResFanhui;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Map;

/**
 * bytearray request
 */
public class ZifuShujuQingqiu extends Request<byte[]> {

    private final Listener<VolliliResFanhui> vofanhuiJaint;

    private QingqytrCanshuw qingCanshu = null;

    private VolliliResFanhui volliliResFanhui = null;

    public ZifuShujuQingqiu(int fangfa, String dizhi, QingqytrCanshuw canshu, Listener<VolliliResFanhui> vofanhuiJaint, Response.ErrorListener jjtt) {
        super(fangfa, dizhi, jjtt);
        this.vofanhuiJaint = vofanhuiJaint;
        this.qingCanshu = canshu;
        this.volliliResFanhui = new VolliliResFanhui();
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        if (!qingCanshu.hasJson()) {
            return qingCanshu.getCasnhu();
        }
        return null;    //process as json, xml...
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> toutous = qingCanshu.getToubu();
        toutous.putAll(super.getHeaders());
        toutous.put("time", String.valueOf(Calendar.getInstance().getTimeInMillis()));
        toutous.putAll(QingqPeizhisSsf.getPeichiInst().getHeader());
        DebvgRizhiLogsjfjlf.e("headers---->>" + toutous.toString());
        if (qingCanshu.hasJson()) {
            toutous.put("Accept", "application/json");
            toutous.put("Content-Type", "application/json; charset=UTF-8");
        }
        return toutous;
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        if (qingCanshu.hasJson()) {    //process json
            if (null != qingCanshu.getJieSenCanshu()) {
                DebvgRizhiLogsjfjlf.tainjiarizhicanshu(qingCanshu.getJieSenCanshu().toString());
                DebvgRizhiLogsjfjlf.tianjairizhixian();
                return qingCanshu.getJieSenCanshu().toString().getBytes();
            } else if (null != qingCanshu.getJieSenArrayCanshu()) {
                DebvgRizhiLogsjfjlf.tainjiarizhicanshu(qingCanshu.getJieSenArrayCanshu().toString());
                DebvgRizhiLogsjfjlf.tianjairizhixian();
                return qingCanshu.getJieSenArrayCanshu().toString().getBytes();
            }

        }
        //TODO process as MultipartRequestParams or XML
        return super.getBody();
    }

    //    public String cookieFromResponse;
    @Override
    protected Response<byte[]> parseNetworkResponse(NetworkResponse wangluoHuidiaoLei) {
        this.volliliResFanhui.toubuBiaodan = wangluoHuidiaoLei.headers;
        return Response.success(wangluoHuidiaoLei.data, HttpHeaderParser.parseCacheHeaders(wangluoHuidiaoLei));
    }

    @Override
    protected void deliverResponse(byte[] zijie) {
        if (isCanceled()) {
            return;
        }
        String neirong_lei = this.volliliResFanhui.toubuBiaodan.get("Content-Type");
        if (neirong_lei != null && (neirong_lei.indexOf("image") != -1 || neirong_lei.indexOf("pdf") != -1)) {
            this.volliliResFanhui.bytes = zijie;
        } else {
            String data = null;
            try {
                data = new String(zijie, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            volliliResFanhui.fanhuiResp = data;
        }

        this.vofanhuiJaint.onResponse(volliliResFanhui);
    }

    @Override
    public void deliverError(VolleyError cuo) {
        if (isCanceled()) {
            return;
        }
        super.deliverError(cuo);

    }


}
