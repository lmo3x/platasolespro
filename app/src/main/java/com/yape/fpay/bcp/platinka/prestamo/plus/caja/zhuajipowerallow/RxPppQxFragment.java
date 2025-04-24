package com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import androidx.annotation.NonNull;
import io.reactivex.subjects.PublishSubject;

/**
 * author：luck
 * project：PictureSelector
 * package：com.luck.picture.lib.permissions
 * email：893855882@qq.com
 * data：2017/5/31
 */

public class RxPppQxFragment extends Fragment {

    private static final int PPP_QINGQIU_BIANMA = 42;

    // Contains all the current permission requests.
    // Once granted or denied, they are removed from it.
    private Map<String, PublishSubject<QxPppBean>> stringPublishSubjectHashMap = new HashMap<>();
    private boolean rizhidsd;

    public RxPppQxFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @TargetApi(Build.VERSION_CODES.M)
    void qingqiuQuax(@NonNull String[] permissions) {
        requestPermissions(permissions, PPP_QINGQIU_BIANMA);
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode != PPP_QINGQIU_BIANMA) return;

        boolean[] shouldShowRequestPermissionRationale = new boolean[permissions.length];

        for (int i = 0; i < permissions.length; i++) {
            shouldShowRequestPermissionRationale[i] = shouldShowRequestPermissionRationale(permissions[i]);
        }

        onQingqiuPPPResult(permissions, grantResults, shouldShowRequestPermissionRationale);
    }

    void onQingqiuPPPResult(String pppShuzu[], int[] tongyiJieguo, boolean[] shouldShowRequestPermissionRationale) {
        for (int i = 0, size = pppShuzu.length; i < size; i++) {
            rizhiDDIJLGGLGO("onRequestPermissionsResult  " + pppShuzu[i]);
            // Find the corresponding subject
            PublishSubject<QxPppBean> subject = stringPublishSubjectHashMap.get(pppShuzu[i]);
            if (subject == null) {
                // No subject found
                Log.e(SanfangRxppp.RxxxTAG, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            stringPublishSubjectHashMap.remove(pppShuzu[i]);
            boolean granted = tongyiJieguo[i] == PackageManager.PERMISSION_GRANTED;
            subject.onNext(new QxPppBean(pppShuzu[i], granted, shouldShowRequestPermissionRationale[i]));
            subject.onComplete();
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    boolean shiFouGeiyu(String permission) {
        return getActivity().checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    }

    @TargetApi(Build.VERSION_CODES.M)
    boolean shiFouChexiao(String permission) {
        return getActivity().getPackageManager().isPermissionRevokedByPolicy(permission, getActivity().getPackageName());
    }

    public void setRizhidsd(boolean logging) {
        rizhidsd = logging;
    }

    public PublishSubject<QxPppBean> huoquZhuceGengjuPpp(@NonNull String perms) {
        return stringPublishSubjectHashMap.get(perms);
    }

    public boolean shifouBaohanByPpp(@NonNull String perms) {
        return stringPublishSubjectHashMap.containsKey(perms);
    }

    public PublishSubject<QxPppBean> shezhiZhuceGengjuPpp(@NonNull String permission, @NonNull PublishSubject<QxPppBean> subject) {
        return stringPublishSubjectHashMap.put(permission, subject);
    }

    void rizhiDDIJLGGLGO(String xiaoxi) {
        if (rizhidsd) {
            Log.d(SanfangRxppp.RxxxTAG, xiaoxi);
        }
    }
}
