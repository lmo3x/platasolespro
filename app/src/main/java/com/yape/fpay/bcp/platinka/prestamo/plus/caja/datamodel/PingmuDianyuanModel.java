package com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel;

import com.google.gson.annotations.SerializedName;

//pingmu show shitilei
public class PingmuDianyuanModel {

    @SerializedName("ScreenRes")
    public String screenRes;//分辨率
    @SerializedName("ActiveTime")
    public int activeTime;
    @SerializedName("UpTime")
    public int upTime;
    @SerializedName("CpuFrequency")
    public int cpuFrequency;
    @SerializedName("BatteryCapacity")
    public int batteryCapacity;
}
