package com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;

/**
 * author：luck
 * project：PictureSelector
 * package：com.luck.picture.lib.permissions
 * email：893855882@qq.com
 * data：2017/5/31
 */

public class SanfangRxppp {
    public static final String RxxxTAG = "RxPermissions";
    public static final Object CHUFAQI = new Object();

    public RxPppQxFragment mRxxxxPPf;

    public SanfangRxppp(@NonNull Activity activity) {
        mRxxxxPPf = getmRxxxxPPfFragment(activity);
    }

    private RxPppQxFragment getmRxxxxPPfFragment(Activity actv) {
        RxPppQxFragment rxxperfragm = null;
        try {
            rxxperfragm = findRxPermissionsFragment(actv);
            boolean isNewInstance = rxxperfragm == null;
            if (isNewInstance) {
                rxxperfragm = new RxPppQxFragment();
                FragmentManager fragmentManager = actv.getFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .add(rxxperfragm, RxxxTAG)
                        .commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rxxperfragm;
    }

    private RxPppQxFragment findRxPermissionsFragment(Activity actv) {
        return (RxPppQxFragment) actv.getFragmentManager().findFragmentByTag(RxxxTAG);
    }

    public void setLogging(boolean logging) {
        mRxxxxPPf.setRizhidsd(logging);
    }

    /**
     * Map emitted items from the source observable into {@code true} if permissions in parameters
     * are granted, or {@code false} if not.
     * <p>
     * If one or several permissions have never been requested, invoke the related framework method
     * to ask the user if he allows the permissions.
     */
    @SuppressWarnings("WeakerAccess")
    public <T> ObservableTransformer<T, Boolean> queBaoOk(final String... ppps) {
        return new ObservableTransformer<T, Boolean>() {
            @Override
            public ObservableSource<Boolean> apply(Observable<T> o) {
                return qingQiu(o, ppps)
                        // Transform Observable<Permission> to Observable<Boolean>
                        .buffer(ppps.length)
                        .flatMap(new Function<List<QxPppBean>, ObservableSource<Boolean>>() {
                            @Override
                            public ObservableSource<Boolean> apply(List<QxPppBean> qxPppBeans) throws Exception {
                                if (qxPppBeans.isEmpty()) {
                                    // Occurs during orientation change, when the subject receives onComplete.
                                    // In that case we don't want to propagate that empty list to the
                                    // subscriber, only the onComplete.
                                    return Observable.empty();
                                }
                                // Return true if all permissions are granted.
                                for (QxPppBean p : qxPppBeans) {
                                    if (!p.granted) {
                                        return Observable.just(false);
                                    }
                                }
                                return Observable.just(true);
                            }
                        });
            }
        };
    }

    /**
     * ensureEach
     * Map emitted items from the source observable into {@link QxPppBean} objects for each
     * permission in parameters.
     * <p>
     * If one or several permissions have never been requested, invoke the related framework method
     * to ask the user if he allows the permissions.
     */
    @SuppressWarnings("WeakerAccess")
    public <T> ObservableTransformer<T, QxPppBean> quebaoOkEveryOne(final String... permissions) {
        return new ObservableTransformer<T, QxPppBean>() {
            @Override
            public ObservableSource<QxPppBean> apply(Observable<T> o) {
                return qingQiu(o, permissions);
            }
        };
    }

    /**
     * Request permissions immediately, <b>must be invoked during initialization phase
     * of your application</b>.
     */
    @SuppressWarnings({"WeakerAccess", "unused"})
    public Observable<Boolean> qingQiu(final String... ppp) {
        return Observable.just(CHUFAQI).compose(queBaoOk(ppp));
    }

    /**
     * Request permissions immediately, <b>must be invoked during initialization phase
     * of your application</b>.
     */
    @SuppressWarnings({"WeakerAccess", "unused"})
    public Observable<QxPppBean> qingqiuEveryOne(final String... ppp) {
        return Observable.just(CHUFAQI).compose(quebaoOkEveryOne(ppp));
    }

    private Observable<QxPppBean> qingQiu(final Observable<?> trigger, final String... permissions) {
        if (permissions == null || permissions.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return qizhongYige(trigger, zhuijajsd(permissions))
                .flatMap(new Function<Object, Observable<QxPppBean>>() {
                    @Override
                    public Observable<QxPppBean> apply(Object o) throws Exception {
                        return qingqiuImplYilai(permissions);
                    }
                });
    }

    //pending
    private Observable<?> zhuijajsd(final String... ppp) {
        for (String p : ppp) {
            if (!mRxxxxPPf.shifouBaohanByPpp(p)) {
                return Observable.empty();
            }
        }
        return Observable.just(CHUFAQI);
    }

    //oneof
    private Observable<?> qizhongYige(Observable<?> trigger, Observable<?> pending) {
        if (trigger == null) {
            return Observable.just(CHUFAQI);
        }
        return Observable.merge(trigger, pending);
    }

    @TargetApi(Build.VERSION_CODES.M)
    private Observable<QxPppBean> qingqiuImplYilai(final String... permissions) {
        List<Observable<QxPppBean>> list = new ArrayList<>(permissions.length);
        List<String> unrequestedPermissions = new ArrayList<>();

        // In case of multiple permissions, we create an Observable for each of them.
        // At the end, the observables are combined to have a unique response.
        for (String permission : permissions) {
            mRxxxxPPf.rizhiDDIJLGGLGO("Requesting permission " + permission);
            if (shifouTongyi(permission)) {
                // Already granted, or not Android M
                // Return a granted Permission object.
                list.add(Observable.just(new QxPppBean(permission, true, false)));
                continue;
            }

            if (shiFouchexiao2(permission)) {
                // Revoked by a policy, return a denied Permission object.
                list.add(Observable.just(new QxPppBean(permission, false, false)));
                continue;
            }

            PublishSubject<QxPppBean> subject = mRxxxxPPf.huoquZhuceGengjuPpp(permission);
            // Create a new subject if not exists
            if (subject == null) {
                unrequestedPermissions.add(permission);
                subject = PublishSubject.create();
                mRxxxxPPf.shezhiZhuceGengjuPpp(permission, subject);
            }

            list.add(subject);
        }

        if (!unrequestedPermissions.isEmpty()) {
            String[] unrequestedPermissionsArray = unrequestedPermissions.toArray(new String[unrequestedPermissions.size()]);
            zaiFragmentQingqiuPpp(unrequestedPermissionsArray);
        }
        return Observable.concat(Observable.fromIterable(list));
    }

    /**
     * Invokes Activity.shouldShowRequestPermissionRationale and wraps
     * the returned value in an observable.
     * <p>
     * In case of multiple permissions, only emits true if
     * Activity.shouldShowRequestPermissionRationale returned true for
     * all revoked permissions.
     * <p>
     * You shouldn't call this method if all permissions have been granted.
     * <p>
     * For SDK &lt; 23, the observable will always emit false.
     */
    @SuppressWarnings("WeakerAccess")
    public Observable<Boolean> xainshiQingqiuPppLiyou(final Activity activity, final String... permissions) {
        if (!shiFouXXbanbenYishang()) {
            return Observable.just(false);
        }
        return Observable.just(xianshiQingqiuPppYilaiLiyou(activity, permissions));
    }

    @TargetApi(Build.VERSION_CODES.M)
    private boolean xianshiQingqiuPppYilaiLiyou(final Activity activity, final String... permissions) {
        for (String p : permissions) {
            if (!shifouTongyi(p) && !activity.shouldShowRequestPermissionRationale(p)) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(Build.VERSION_CODES.M)
    void zaiFragmentQingqiuPpp(String[] permissions) {
        mRxxxxPPf.rizhiDDIJLGGLGO("requestPermissionsFromFragment " + TextUtils.join(", ", permissions));
        mRxxxxPPf.qingqiuQuax(permissions);
    }

    /**
     * Returns true if the permission is already granted.
     * <p>
     * Always true if SDK &lt; 23.
     */
    @SuppressWarnings("WeakerAccess")
    public boolean shifouTongyi(String permission) {
        return !shiFouXXbanbenYishang() || mRxxxxPPf.shiFouGeiyu(permission);
    }

    /**
     * Returns true if the permission has been revoked by a policy.
     * <p>
     * Always false if SDK &lt; 23.
     */
    @SuppressWarnings("WeakerAccess")
    public boolean shiFouchexiao2(String permission) {
        return shiFouXXbanbenYishang() && mRxxxxPPf.shiFouChexiao(permission);
    }

    boolean shiFouXXbanbenYishang() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    }

    void qingqiuJieguoPPp(String permissions[], int[] grantResults) {
        mRxxxxPPf.onQingqiuPPPResult(permissions, grantResults, new boolean[permissions.length]);
    }
}
