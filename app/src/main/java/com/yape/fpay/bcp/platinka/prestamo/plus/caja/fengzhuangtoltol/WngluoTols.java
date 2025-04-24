package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by han on 2023/5/9.
 */
public class WngluoTols {

    //判断是否有网络
    public static boolean youWangluoFou(Context chiyouZhe) {
        //得到网络的管理者
        ConnectivityManager lianjieGuanli = (ConnectivityManager) chiyouZhe.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wangXinxi = null;
        if (lianjieGuanli != null) {
            wangXinxi = lianjieGuanli.getActiveNetworkInfo();
        }
        return wangXinxi != null;
    }


    /**
     * // 获取手机所有连接管理对象（包括对wi-fi,net等连接的管理）
     *
     * @param context
     * @return
     */
    public static boolean lianJieGuanli(Context context) {
        try {
            ConnectivityManager lienajieGuanjia = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            if (lienajieGuanjia != null) {
                // 获取网络连接管理的对象
                NetworkInfo wangluoDuixiang = lienajieGuanjia.getActiveNetworkInfo();
                if (wangluoDuixiang != null && wangluoDuixiang.isConnected()) {
                    // 判断当前网络是否已经连接
                    if (wangluoDuixiang.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            String TAG = "NetUtils";
            Log.e(TAG, e.getMessage());
        }
        return false;
    }

    /**
     * 获取当前ip地址
     *
     * @param chiyouzhe
     * @return
     */
    public static String huoquDangqianIpAddress(Context chiyouzhe) {
        try {
            // for (Enumeration<NetworkInterface> en = NetworkInterface
            // .getNetworkInterfaces(); en.hasMoreElements();) {
            // NetworkInterface intf = en.nextElement();
            // for (Enumeration<InetAddress> enumIpAddr = intf
            // .getInetAddresses(); enumIpAddr.hasMoreElements();) {
            // InetAddress inetAddress = enumIpAddr.nextElement();
            // if (!inetAddress.isLoopbackAddress()) {
            // return inetAddress.getHostAddress().toString();
            // }
            // }
            // }
            WifiManager wuxainGuanli = (WifiManager) chiyouzhe
                    .getSystemService(Context.WIFI_SERVICE);
            WifiInfo wuxianDuixaing = wuxainGuanli.getConnectionInfo();
            int i = wuxianDuixaing.getIpAddress();
            return zhengxingZhuanIP(i);
        } catch (Exception ex) {
            return " 获取IP出错鸟!!!!请保证是WIFI,或者请重新打开网络!\n" + ex.getMessage();
        }
        // return null;
    }


    /**
     * 将ip的整数形式转换成ip形式
     *
     * @param ipInt
     * @return
     */
    public static String zhengxingZhuanIP(int ipInt) {
        StringBuilder pinjieChuan = new StringBuilder();
        pinjieChuan.append(ipInt & 0xFF).append(".");
        pinjieChuan.append((ipInt >> 8) & 0xFF).append(".");
        pinjieChuan.append((ipInt >> 16) & 0xFF).append(".");
        pinjieChuan.append((ipInt >> 24) & 0xFF);
        return pinjieChuan.toString();
    }



    // 实现第二步 Bitmap 转 Base64 的字节流
    public static String tuxiangZhuanJiamiliu(Bitmap bitmap) {

        String zhuanhuanJieguo = null;
        ByteArrayOutputStream ZijieShuchuLiu = null;

        try {

            if (bitmap != null) {

                ZijieShuchuLiu = new ByteArrayOutputStream();

                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, ZijieShuchuLiu);

                ZijieShuchuLiu.flush();
                ZijieShuchuLiu.close();
                byte[] tuxiangZijie = ZijieShuchuLiu.toByteArray();

                zhuanhuanJieguo = Base64.encodeToString(tuxiangZijie, Base64.DEFAULT);

            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (ZijieShuchuLiu != null) {

                    ZijieShuchuLiu.flush();
                    ZijieShuchuLiu.close();

                }
            } catch (IOException e) {

                e.printStackTrace();

            }
        }
        return zhuanhuanJieguo;
    }

    public static ChanpinMoxingPPWindows fjalgjsafff = null;
    //无网络
    public static void chaungjianPPw(Context chiyouzhe) {
        fjalgjsafff = new ChanpinMoxingPPWindows(chiyouzhe);

        LayoutInflater popInflater = (LayoutInflater) (chiyouzhe).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_xuancxxh_chanpin2, null);
        TextView jythgrsdtfygukyjh = popupView.findViewById(R.id.jythgrsdtfygukyjh);
        TextView quxiaoquxiao_fjdoj_buyaoquan = popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        TextView gaoding_sure_djdj_yaogeiwo = popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);

        jythgrsdtfygukyjh.setText(chiyouzhe.getString(R.string.tusitishi_dizih_00));
        quxiaoquxiao_fjdoj_buyaoquan.setText(chiyouzhe.getString(R.string.shangpins_foryo_can2));
        gaoding_sure_djdj_yaogeiwo.setText(chiyouzhe.getString(R.string.shangpins_foryo_abr));

        popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fjalgjsafff.xiaohuiPPw();
            }
        });
        popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fjalgjsafff.xiaohuiPPw();

                Intent intent = new Intent();
                intent.setAction("android.net.wifi.PICK_WIFI_NETWORK");
                chiyouzhe.startActivity(intent);
            }
        });

        fjalgjsafff.chushihuaPPW(popupView, false, (int) (huoquPingmuKuandu(chiyouzhe) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

    }

}
