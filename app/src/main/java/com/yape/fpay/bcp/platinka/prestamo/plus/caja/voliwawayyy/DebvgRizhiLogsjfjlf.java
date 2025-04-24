package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy;

import android.util.Log;

public final class DebvgRizhiLogsjfjlf {
    public static StringBuffer pingjiechuanLog = new StringBuffer();
    private static String RrixiTAG = "XLog";
    private static boolean shifouKaiRizhi = false;


    public static void setRrixiTAG(String TAG) {
        DebvgRizhiLogsjfjlf.RrixiTAG = TAG;
    }

    public static void setRrixiTOpen(boolean isOpenLog) {
        DebvgRizhiLogsjfjlf.shifouKaiRizhi = isOpenLog;
    }

    public static void d(String tag, String msg){
        if(shifouKaiRizhi){
            Log.d(tag,msg);
        }
    }

    public static void e(String tag,String msg){
        if(shifouKaiRizhi){
            Log.e(tag, msg);
        }
    }

    public static void d(String msg){
        if(shifouKaiRizhi){
            Log.d(RrixiTAG,msg);
        }
    }

    public static void e(String msg){
        if(shifouKaiRizhi){
            Log.e(RrixiTAG,msg);
        }
    }

    public static void tianjairizhixian(){
        if(shifouKaiRizhi){
            if(null != pingjiechuanLog){
                pingjiechuanLog.append("\r\n--------------------------------\r\n");
            }
        }
    }

    public static void tainjiarizhicanshu(String mParams){
        if(shifouKaiRizhi){
            if(null != pingjiechuanLog){
                pingjiechuanLog.append("入参:::\r\n" + mParams);
            }
        }
    }

    public static void tainjiaDizhiurl(String targetUrl){
        if(shifouKaiRizhi){
            if(null != pingjiechuanLog){
                pingjiechuanLog.append(targetUrl);
            }
        }
    }

    public static void tianjiaFanhui(String resp){
        if(shifouKaiRizhi){
            if(null != pingjiechuanLog){
                pingjiechuanLog.append("\r\n\r\n" + resp + "\r\n\r\n");
            }
        }
    }

    public static void qingkongRzhiNrigon(){
        if(shifouKaiRizhi){
            if(null != pingjiechuanLog){
                pingjiechuanLog.setLength(0);
            }
        }

    }

}
