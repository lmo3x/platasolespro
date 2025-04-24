package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.app.Activity;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.text.DateFormat;
import java.util.Date;


public class DingWeiSinglebangzhuTols {


    private Activity chiyouzhe;


    private static final String DingweiSing = "DingWeiSinglebangzhuTolsTAG";


    /**
     * Constant used in the location settings dialog.
     */
    private static final int QINGQIUJIANCHASHEZHI = 0x1;

    /**
     * The desired interval for location updates. Inexact. Updates may be more or less frequent.
     */
    private static final long GENGXINWANGLUOSHIJIANDANWEI = 10000;

    /**
     * The fastest rate for active location updates. Exact. Updates will never be more frequent
     * than this value.
     */
    private static final long ZUIKUAIGENGXINSHIJIANDANWEI =
            GENGXINWANGLUOSHIJIANDANWEI / 2;


    /**
     * Provides access to the Fused Location Provider API.
     */
    private FusedLocationProviderClient dingweiKehuduan;

    /**
     * Provides access to the Location Settings API.
     */
    private SettingsClient shezhiKehuduan;

    /**
     * Stores parameters for requests to the FusedLocationProviderApi.
     */
    private LocationRequest dingweiQingqiu;

    /**
     * Stores the types of location services the client is interested in using. Used for checking
     * settings to determine if the device has optimal location settings.
     */
    private LocationSettingsRequest dingweiShezhiQingqiu;

    /**
     * Callback for Location events.
     */
    private LocationCallback dingweiHuidiao;

    /**
     * Represents a geographical location.
     */
    private Location dangqianWeizhi;

    /**
     * Tracks the status of the location updates request. Value changes when the user presses the
     * Start Updates and Stop Updates buttons.
     */
    private Boolean shifouQingqiuGengxinweizhi;

    /**
     * Time when the location was updated represented as a String.
     */
    private String zuihouGengxinweizhiShijian;

    public DingWeiSinglebangzhuTols(Activity chiyouzhe) {
        this.chiyouzhe = chiyouzhe;
        chushihuafuwu();
    }


    public void kaiqiDingwGongneng() {
        kaishiGengxinDingweiweizhi();
        Log.d("startLoction---->>>", "开始获取定位");
    }


    private void chushihuafuwu() {
        shifouQingqiuGengxinweizhi = false;
        zuihouGengxinweizhiShijian = "";

        // Update values using data stored in the Bundle.

        dingweiKehuduan = LocationServices.getFusedLocationProviderClient(chiyouzhe);
        shezhiKehuduan = LocationServices.getSettingsClient(chiyouzhe);
        // Kick off the process of building the LocationCallback, LocationRequest, and
        // LocationSettingsRequest objects.
        chuangjianDingweiHuidiao();
        chuangjiandingweiQingqiu();
        goujianDingweishezhiQingqiu();
    }


    /**
     * Creates a callback for receiving location events.
     */
    private void chuangjianDingweiHuidiao() {
        dingweiHuidiao = new LocationCallback() {


            @Override
            public void onLocationResult(LocationResult locationResult) {
                super.onLocationResult(locationResult);

                dangqianWeizhi = locationResult.getLastLocation();
                zuihouGengxinweizhiShijian = DateFormat.getTimeInstance().format(new Date());

//                SpUtils.getInstance().putString(GpsKeys.latitude, );
//                SpUtils.getInstance().putString(GpsKeys.longitude, );

                BendiHuancunTols.commitZifuchuan(BendiHuancunTols.XITONG_WEIJINGDU, TextUtils.isEmpty(dangqianWeizhi.getLatitude()+"")? "0":dangqianWeizhi.getLatitude()+"");
                BendiHuancunTols.commitZifuchuan(BendiHuancunTols.XITONG_JINGWEIDU, TextUtils.isEmpty(dangqianWeizhi.getLongitude()+"")? "0":dangqianWeizhi.getLongitude()+"");

                Log.e(DingweiSing, dangqianWeizhi.getLatitude() + "," + dangqianWeizhi.getLongitude());

                tingzhiDingweigongneng();
            }
        };
    }

    /**
     * Sets up the location request. Android has two location request settings:
     * {@code ACCESS_COARSE_LOCATION} and {@code ACCESS_FINE_LOCATION}. These settings control
     * the accuracy of the current location. This sample uses ACCESS_FINE_LOCATION, as defined in
     * the AndroidManifest.xml.
     * <p/>
     * When the ACCESS_FINE_LOCATION setting is specified, combined with a fast update
     * interval (5 seconds), the Fused Location Provider API returns location updates that are
     * accurate to within a few feet.
     * <p/>
     * These settings are appropriate for mapping applications that show real-time location
     * updates.
     */
    private void chuangjiandingweiQingqiu() {
        dingweiQingqiu = new LocationRequest();

        // Sets the desired interval for active location updates. This interval is
        // inexact. You may not receive updates at all if no location sources are available, or
        // you may receive them slower than requested. You may also receive updates faster than
        // requested if other applications are requesting location at a faster interval.
        dingweiQingqiu.setInterval(GENGXINWANGLUOSHIJIANDANWEI);

        // Sets the fastest rate for active location updates. This interval is exact, and your
        // application will never receive updates faster than this value.
        dingweiQingqiu.setFastestInterval(ZUIKUAIGENGXINSHIJIANDANWEI);

        dingweiQingqiu.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    }

    /**
     * Uses a {@link LocationSettingsRequest.Builder} to build
     * a {@link LocationSettingsRequest} that is used for checking
     * if a device has the needed location settings.
     */
    private void goujianDingweishezhiQingqiu() {
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
        builder.addLocationRequest(dingweiQingqiu);
        dingweiShezhiQingqiu = builder.build();
    }


    /**
     * Requests location updates from the FusedLocationApi. Note: we don't call this unless location
     * runtime permission has been granted.
     */
    private void kaishiGengxinDingweiweizhi() {
        //


        if (!shifouQingqiuGengxinweizhi) {
            shifouQingqiuGengxinweizhi = true;
        } else {
            return;
        }
        Log.i(DingweiSing, "Begin by checking if the device has the necessary location settings.");

        shezhiKehuduan.checkLocationSettings(dingweiShezhiQingqiu)
                .addOnSuccessListener(chiyouzhe, new OnSuccessListener<LocationSettingsResponse>() {
                    @Override
                    public void onSuccess(LocationSettingsResponse locationSettingsResponse) {
                        Log.i(DingweiSing, "All location settings are satisfied.");

                        //noinspection MissingPermission
                        dingweiKehuduan.requestLocationUpdates(dingweiQingqiu,
                                dingweiHuidiao, Looper.myLooper());

                    }
                })
                .addOnFailureListener(chiyouzhe, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        int statusCode = ((ApiException) e).getStatusCode();
                        switch (statusCode) {
                            case LocationSettingsStatusCodes.RESOLUTION_REQUIRED:
                                Log.i(DingweiSing, "Location settings are not satisfied. Attempting to upgrade " +
                                        "location settings ");
                                try {
                                    // Show the dialog by calling startResolutionForResult(), and check the
                                    // result in onActivityResult().
                                    ResolvableApiException rae = (ResolvableApiException) e;
                                    rae.startResolutionForResult(chiyouzhe, QINGQIUJIANCHASHEZHI);
                                } catch (IntentSender.SendIntentException sie) {
                                    Log.i(DingweiSing, "PendingIntent unable to execute request.");
                                }
                                break;
                            case LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE:
                                String errorMessage = "Location settings are inadequate, and cannot be " +
                                        "fixed here. Fix in Settings.";
                                Log.e(DingweiSing, errorMessage);
//                                Toast.makeText(chiyouzhe, errorMessage, Toast.LENGTH_LONG).show();
                                ToastUtil.showShortToast(errorMessage);
                                shifouQingqiuGengxinweizhi = false;
                        }

                    }
                });
    }

    /**
     * Removes location updates from the FusedLocationApi.
     */
    public void tingzhiDingweigongneng() {
        if (!shifouQingqiuGengxinweizhi) {
            Log.d(DingweiSing, "stopLocationUpdates: updates never requested, no-op.");
            return;
        }

        // It is a good practice to remove location requests when the activity is in a paused or
        // stopped state. Doing so helps battery performance and is especially
        // recommended in applications that request frequent location updates.
        dingweiKehuduan.removeLocationUpdates(dingweiHuidiao)
                .addOnCompleteListener(chiyouzhe, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        shifouQingqiuGengxinweizhi = false;

                    }
                });
    }
}
