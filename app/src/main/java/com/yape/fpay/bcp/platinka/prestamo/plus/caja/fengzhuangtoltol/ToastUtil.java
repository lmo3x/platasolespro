package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;


public class ToastUtil {
    private static Toast mToast;
    private static Handler mHandler = new Handler(Looper.getMainLooper());
    private final static String THREAD_MAIN = "main";
 
    /**
     * 显示toast(可以子线程中使用Toast)-short
     *
     * @param msg Toast消息
     */
    @SuppressLint("ShowToast")
    public static void showShortToast(String msg) {
        try {
            // 判断是在子线程，还是主线程
            if (THREAD_MAIN.equals(Thread.currentThread().getName())) {
                if (mToast == null) {
                    mToast = Toast.makeText(MyJichuAplica.getInstance(), msg, Toast.LENGTH_SHORT);
                } else {
                    mToast.cancel();
                    mToast = Toast.makeText(MyJichuAplica.getInstance(), msg, Toast.LENGTH_SHORT);
//                    mToast.setText(msg);
                }

                View view = View.inflate(MyJichuAplica.getInstance(), R.layout.layout_toast,null);
                TextView ttutuss = view.findViewById(R.id.tv_msg);
                ttutuss.setText(msg);
                mToast.setView(view);
                mToast.setGravity(Gravity.CENTER, 0, 0);
                mToast.show();
            } else {
                // 子线程
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MyJichuAplica.getInstance(), msg, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
//            CrashHandler.postCatchedException(e);
            //android API25系统BUG,TOAST异常
        }
 
    }
 
    /**
     * 显示toast(可以子线程中使用Toast)-short
     *
     * @param msg Toast消息
     */
    @SuppressLint("ShowToast")
    public static void showLongToast(String msg) {
        try {
            // 判断是在子线程，还是主线程
            if (THREAD_MAIN.equals(Thread.currentThread().getName())) {
                if (mToast == null) {
                    mToast = Toast.makeText(MyJichuAplica.getInstance(), msg, Toast.LENGTH_LONG);
                } else {
                    mToast.cancel();
                    mToast = Toast.makeText(MyJichuAplica.getInstance(), msg, Toast.LENGTH_LONG);
                    mToast.setText(msg);
                }
                mToast.show();
            } else {
                // 子线程
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MyJichuAplica.getInstance(), msg, Toast.LENGTH_LONG).show();
                    }
                });
            }
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
//            CrashHandler.postCatchedException(e);
            //android API25系统BUG,TOAST异常
        }
 
    }
}