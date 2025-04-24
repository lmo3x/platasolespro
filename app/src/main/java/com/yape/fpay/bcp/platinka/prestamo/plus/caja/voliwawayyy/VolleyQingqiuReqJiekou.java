//package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy;
//
//import com.alibaba.fastjson.JSONObject;
//import com.android.volley.Request;
//import com.android.volley.Response;
//import com.android.volley.VolleyError;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei.FanzehInokeSKdsdTols;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei.VoliWawalleyBangzhuLei;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.jiantingfsd.QingqJiantingskjf;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.jiantingfsd.QingqJiantingskjf1;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.qingdjqiu.ZifuShujuQingqiu;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.qingdjqiu.MokuaihuaQingq;
//import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.fanhuiresp.VolliliResFanhui;
//
//import java.io.File;
//import java.util.List;
//
///**
// * han 2023.5.11
// */
//public class VolleyQingqiuReqJiekou implements IQingqiuReqJiekou {
//
//    private static volatile VolleyQingqiuReqJiekou danliInstan = null;
//
//    private VoliWawalleyBangzhuLei voliWawalleyBangzhuLei = null;
//
//    private VolleyQingqiuReqJiekou() {
//        if (voliWawalleyBangzhuLei == null) {
//            voliWawalleyBangzhuLei = VoliWawalleyBangzhuLei.chshihuaDanli();
//        }
//    }
//
//    public static VolleyQingqiuReqJiekou ChuangjinDanli() {
//        if (danliInstan == null) {
//            synchronized (VolleyQingqiuReqJiekou.class) {
//                if (danliInstan == null) {
//                    danliInstan = new VolleyQingqiuReqJiekou();
//                }
//            }
//        }
//        return danliInstan;
//    }
//// 增加请求标记-删除原有请求方法
////    @Override
////    public void doRequest(int method, String target, RequestParams params, RequestListener l) {
////        XLog.e("doRequest >>>>> " + target);
////        switch (method) {
////            case GET:
////                get(target, params, l);
////                break;
////            case POST:
////                 post(target, params, l);
////                break;
////            default:
////                throw new UnsupportedOperationException("unSupport request method ");
////        }
////    }
//
//    @Override
//    public void todoReqQingq(int fangfa, String target, QingqytrCanshuw params, QingqJiantingskjf l) {
//        DebvgRizhiLogsjfjlf.e("doRequest >>>>> " + target);
//        switch (fangfa) {
//            case GET:
//                getQingqiu(target, params, "", l);
//                break;
//            case POST:
//                postQingqiu(target, params, "", l);
//                break;
//            default:
//                throw new UnsupportedOperationException("unSupport request method ");
//        }
//    }
//
//    @Override
//    public <T> void todoReqQingq(int fangfa, String biaozhu/*target*/, QingqytrCanshuw params, String tag, QingqJiantingskjf1<T> l) {
//        DebvgRizhiLogsjfjlf.e("doRequest >>>>> " + biaozhu);
//        switch (fangfa) {
//            case GET:
//                //target,params,tag,requestjianting
//                getQingqiu(biaozhu, params, tag, l);
//                break;
//            case POST:
//                postQingqiu(biaozhu, params, tag, l);
//                break;
//            default:
//                throw new UnsupportedOperationException("unSupport request method ");
//        }
//    }
//
//    public void quxiaoSuoyou(Object tag) {
//        voliWawalleyBangzhuLei.quxiaoDiejiadeQingqiu(tag);
//    }
//
//    private void getQingqiu(String target, final QingqytrCanshuw params, QingqJiantingskjf listener) {
//        DebvgRizhiLogsjfjlf.tainjiaDizhiurl(target);
//        DebvgRizhiLogsjfjlf.tianjairizhixian();
//        ZifuShujuQingqiu request = new ZifuShujuQingqiu(Request.Method.GET, target, params, respListener(listener), respError(listener));
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request);
//    }
//
//    private void postQingqiu(String target, QingqytrCanshuw params, QingqJiantingskjf listener) {
//        DebvgRizhiLogsjfjlf.tainjiaDizhiurl(target);
//        DebvgRizhiLogsjfjlf.tianjairizhixian();
//        ZifuShujuQingqiu request = new ZifuShujuQingqiu(Request.Method.POST, target, params, respListener(listener), respError(listener));
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request);
//    }
//
//    private void getQingqiu(String target, final QingqytrCanshuw params, String tag, QingqJiantingskjf listener) {
//        DebvgRizhiLogsjfjlf.tainjiaDizhiurl(target);
//        DebvgRizhiLogsjfjlf.tianjairizhixian();
//        ZifuShujuQingqiu request = new ZifuShujuQingqiu(Request.Method.GET, target, params, respListener(listener), respError(listener));
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request, tag);
//    }
//
//    private void postQingqiu(String target, QingqytrCanshuw params, String tag, QingqJiantingskjf listener) {
//        DebvgRizhiLogsjfjlf.tainjiaDizhiurl(target);
//        DebvgRizhiLogsjfjlf.tianjairizhixian();
//        ZifuShujuQingqiu request = new ZifuShujuQingqiu(Request.Method.POST, target, params, respListener(listener), respError(listener));
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request, tag);
//    }
//
//
//    private <T> void getQingqiu(String target, final QingqytrCanshuw params, String tag, QingqJiantingskjf1<T> listener) {
//        DebvgRizhiLogsjfjlf.tainjiaDizhiurl(target);
//        DebvgRizhiLogsjfjlf.tianjairizhixian();
//        ZifuShujuQingqiu request = new ZifuShujuQingqiu(Request.Method.GET, target, params, respListener(listener), respError(listener));
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request, tag);
//    }
//
//    private <T> void postQingqiu(String target, QingqytrCanshuw params, String tag, QingqJiantingskjf1<T> listener) {
//        DebvgRizhiLogsjfjlf.tainjiaDizhiurl(target);
//        DebvgRizhiLogsjfjlf.tianjairizhixian();
//        ZifuShujuQingqiu request = new ZifuShujuQingqiu(Request.Method.POST, target, params, respListener(listener), respError(listener));
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request, tag);
//    }
//
//    private Response.Listener<VolliliResFanhui> respListener(final QingqJiantingskjf l) {
//        return new Response.Listener<VolliliResFanhui>() {
//            @Override
//            public void onResponse(VolliliResFanhui resp) {
//                if(null != resp && null != resp.fanhuiResp){
//                    DebvgRizhiLogsjfjlf.tianjiaFanhui(resp.fanhuiResp.toString());
//                }
//                l.onSuccess(resp);
//            }
//        };
//    }
//
//    @SuppressWarnings("unchecked")
//    private <T> Response.Listener<VolliliResFanhui> respListener(final QingqJiantingskjf1<T> l) {
//        return new Response.Listener<VolliliResFanhui>() {
//            @Override
//            public void onResponse(VolliliResFanhui resp) {
//                if(null != resp && null != resp.fanhuiResp){
//                    DebvgRizhiLogsjfjlf.tianjiaFanhui(resp.fanhuiResp.toString());
//                }
////                l.onSuccess(resp);
//                try {
//                    l.onSuccess((T) JSONObject.parseObject(resp.fanhuiResp, FanzehInokeSKdsdTols.huoquJeikouleixing(l, 0)));
//                }catch (Exception e){
//                    DebvgRizhiLogsjfjlf.e("onResponse Exception---->>>" + e.toString());
//                    l.onFailed(e);
//                }
//
//            }
//        };
//    }
//
//    private Response.ErrorListener respError(final QingqJiantingskjf l) {
//        return new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError e) {
//                l.onFailed(e);
//            }
//        };
//    }
//
//    private <T> Response.ErrorListener respError(final QingqJiantingskjf1<T> l) {
//        return new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError e) {
//                l.onFailed(e);
//            }
//        };
//    }
//
//    public void upload(String target, QingqytrCanshuw<String,String> params, String fileName, File file, QingqJiantingskjf listener){
//        MokuaihuaQingq request = new MokuaihuaQingq(target,respListener(listener),respError(listener),fileName,file,params);
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request);
//    }
//
//    public void uploadFiles(String target, QingqytrCanshuw<String,String> params, String fileName, List<File> files, QingqJiantingskjf listener){
//        MokuaihuaQingq request = new MokuaihuaQingq(target,respListener(listener),respError(listener),fileName,files,params);
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request);
//    }
//
//    public void upload(String target, String tag, QingqytrCanshuw<String,String> params, String fileName, File file, QingqJiantingskjf listener){
//        MokuaihuaQingq request = new MokuaihuaQingq(target,respListener(listener),respError(listener),fileName,file,params);
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request, tag);
//    }
//
//    public void uploadFiles(String target, String tag, QingqytrCanshuw<String,String> params, String fileName, List<File> files, QingqJiantingskjf listener){
//        MokuaihuaQingq request = new MokuaihuaQingq(target,respListener(listener),respError(listener),fileName,files,params);
//        voliWawalleyBangzhuLei.tianjiadaoQingqiuDuilie(request, tag);
//    }
//}
