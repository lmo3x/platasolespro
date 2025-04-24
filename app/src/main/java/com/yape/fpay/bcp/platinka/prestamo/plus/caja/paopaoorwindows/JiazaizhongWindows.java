package com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;


/**
 * @创建者 任伟
 * @创建时间 2017/07/22 17:07
 * @描述 ${等待提示框}
 */

public class JiazaizhongWindows extends Dialog {

    /**
     * dialog的布局文件
     **/
    private int yemianZiyuan;
    private Context chiyouzhe;
    public boolean kefouDianjiWaibu = true;

    public JiazaizhongWindows(Context chiyouzhe) {
        this(chiyouzhe, R.style.DialogTheme, R.layout.wndw_jiazai_ing);
        this.chiyouzhe = chiyouzhe;
    }


    public JiazaizhongWindows(Context chiyouzhe, int zhuti, int resLayout) {
        super(chiyouzhe, zhuti);
        this.chiyouzhe = chiyouzhe;
        this.yemianZiyuan = resLayout;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(yemianZiyuan);
        setCanceledOnTouchOutside(kefouDianjiWaibu);
        setCancelable(false);
    }

    public void setKefouDianjiWaibu(boolean isTouchOutside){
        this.kefouDianjiWaibu = isTouchOutside;
    }

    public void showKuangkuangIng() {
        if (this.isShowing()) {
            dismiss();
        }
        if(!((Activity) chiyouzhe).isFinishing())
        {
            show();
        }
    }

    public void hideKuangkuangIng() {
//        if (this.isShowing()) {
            dismiss();
//        }
    }

    public boolean isShowingKuangkuangIng() {
        if (this.isShowing()) {
            return true;
        }
        return false;
    }
}
