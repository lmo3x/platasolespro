package com.yape.fpay.bcp.platinka.prestamo.plus.caja.gjtype;

import android.text.TextUtils;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.BendiHuancunTols;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;

public class SelectGuoJiaUtil {

    public static final String GUO_CODE_BL = "51";
    public static final String GUO_CODE_BL_ADD = "+51 ";
    public static final String GUO_CODE_EG = "593";
    public static final String GUO_CODE_EG_ADD = "+593 ";

    public static void saveGuoEg(){
        BendiHuancunTols.commitZifuchuan(BendiHuancunTols.GUO_JIA_CODE, GUO_CODE_EG);
    }

    public static void saveGuoEBl(){
        BendiHuancunTols.commitZifuchuan(BendiHuancunTols.GUO_JIA_CODE, GUO_CODE_BL);
    }

    public static String getCode() {
        String guoCode = BendiHuancunTols.huoQuZifuchuan(MyJichuAplica.getInstance(), BendiHuancunTols.GUO_JIA_CODE);
        return guoCode;
    }

    public static boolean isGuoJiaEg() {
        return TextUtils.equals(getCode(), GUO_CODE_EG);
    }

    public static boolean isGuoJiaBl() {
        return TextUtils.equals(getCode(), GUO_CODE_BL);
    }
}
