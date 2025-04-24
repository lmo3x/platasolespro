package com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;

/**
 * 公共popWindows
 * Created by Mr.Ren on 2018/7/23.
 */

public class ChanpinMoxingPPWindows {

    private Context chiyou;
    private OnDianjiHuidiaoJianting onDianjiHuidiaoJianting = null;
    private static ChanpinMoxingPPWindows instance;
    private PopupWindow popupWindow;
    private RelativeLayout layoutLayoutFl;

    public ChanpinMoxingPPWindows(Context  chiyouzhe) {
        this.chiyou = chiyouzhe;
    }

    //回调接口
    public interface OnDianjiHuidiaoJianting {
        void onDianjiQUxioa();
    }

    //设置回调接口的方法
    public void setOnDianjiHuidiaoJianting(OnDianjiHuidiaoJianting onDianjiHuidiaoJianting) {
        this.onDianjiHuidiaoJianting = onDianjiHuidiaoJianting;
    }


    public void chushihuaPPW(View ppwShitu) {
        chushihuaPPW(ppwShitu, false, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, null);
    }

    public void chushihuaPPW(View ppwShitu, boolean donghua) {
        chushihuaPPW(ppwShitu, donghua, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, null);
    }

    /**
     * 产品型号选择
     *
     * @param ppwShitu
     */
    public void chushihuaPPW(View ppwShitu, boolean donghua, int width, int height) {
        chushihuaPPW(ppwShitu, donghua, width, height, null);
    }

    /**
     * 产品型号选择
     *
     * @param popupView
     * @param onDianjiHuidiaoJianting
     */
    public void chushihuaPPW(View popupView, boolean isAnim, int width, int height, OnDianjiHuidiaoJianting onDianjiHuidiaoJianting) {
        chushihuaPPW(popupView, isAnim, width, height, onDianjiHuidiaoJianting, true);
    }

    public void chushihuaPPW(View popupView, boolean isAnim, int width, int height,
                             OnDianjiHuidiaoJianting onDianjiHuidiaoJianting, boolean isOutside) {

        LayoutInflater chaungkouFanzhe = (LayoutInflater) (chiyou).getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View kuangShiwu = chaungkouFanzhe.inflate(R.layout.wndw_buzhidaosha, null);
        layoutLayoutFl = kuangShiwu.findViewById(R.id.layoutLayoutFl);
        layoutLayoutFl.removeAllViews();
        layoutLayoutFl.addView(popupView);
        RelativeLayout.LayoutParams bujucanshu = (RelativeLayout.LayoutParams) popupView.getLayoutParams();
        bujucanshu.width = width;
        bujucanshu.height = height;
        popupView.setLayoutParams(bujucanshu);

        popupWindow = new PopupWindow(kuangShiwu, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        popupWindow.setTouchable(true);
        // 设置popWindow弹出窗体可点击
        popupWindow.setFocusable(isOutside);
        // 设置触摸外面时消失
        popupWindow.setOutsideTouchable(isOutside);
        popupWindow.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        if (isAnim)
            popupWindow.setAnimationStyle(R.style.mypopwindow_anim_style);

        // 监听PopupWindow关闭，如果为关闭状态则设置为空
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                // 主界面完全显示
                ((Activity) chiyou).getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                WindowManager.LayoutParams params = ((Activity) chiyou).getWindow().getAttributes();
                params.alpha = 1.0f;
                ((Activity) chiyou).getWindow().setAttributes(params);
                if (onDianjiHuidiaoJianting != null)
                    onDianjiHuidiaoJianting.onDianjiQUxioa();
            }
        });

    }

    public void showPPw() {
        showPPw(Gravity.BOTTOM);
    }

    public void showPPw(int weizhi) {
        if (popupWindow != null) {
            // 实例化一个ColorDrawable颜色为透明，不设置为半透明是因为带圆角
            ColorDrawable dw = new ColorDrawable(chiyou.getResources().getColor(android.R.color.transparent));
            popupWindow.setBackgroundDrawable(dw);

            layoutLayoutFl.setGravity(weizhi);

            if (chiyou instanceof Activity && !((Activity) chiyou).isDestroyed())
                popupWindow.showAtLocation(new View(chiyou), Gravity.CENTER, 0, 0);
            else
                return;

            ((Activity) chiyou).getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            // 主界面变暗
            WindowManager.LayoutParams params = ((Activity) chiyou).getWindow().getAttributes();
            params.alpha = 1f;
            ((Activity) chiyou).getWindow().setAttributes(params);
        }
    }

    public boolean huoquPPwShifouShow() {
        if (popupWindow == null) {
            return false;
        } else {
            return true;
        }
    }

    public void xiaohuiPPw() {
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }

    public boolean huoquPPwShowFou() {
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    public void shezhiWaibuDianji(boolean isDismiss) {
        popupWindow.setOutsideTouchable(isDismiss);
    }
}
