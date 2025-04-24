package com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow;

import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.content.ContextCompat;

/**
 * permiss cheker
 */

public class PppQxPanduaner {
    private final Context mChiyouzhe;

    public PppQxPanduaner(Context chiyouzhe) {
        mChiyouzhe = chiyouzhe.getApplicationContext();
    }

    // 判断权限集合
    public boolean checkShaoPppp(String... pppquxList) {
        if(pppquxList == null ){
        }else{
            for (String permission : pppquxList) {
                if (shaoNegePPP(permission)) {
                    return true;
                }
            }
        }

        return false;
    }

    // 判断是否缺少权限
    private boolean shaoNegePPP(String permission) {
        return ContextCompat.checkSelfPermission(mChiyouzhe, permission) ==
                PackageManager.PERMISSION_DENIED;
    }
}
