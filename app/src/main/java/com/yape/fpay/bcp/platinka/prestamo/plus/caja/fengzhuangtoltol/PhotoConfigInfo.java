package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.app.Activity;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PhotoConfigInfo implements Parcelable {

    private final boolean boolean_PreCamera;//相机方向,试试前置摄像头
    private final String str_finalSavePath;//最终保存路径
    private String str_TemporaryPath;//拍照的临时路径
    private final boolean isShowCropBox;//是否显示裁剪框
    private final boolean isShowChangeZmOrBackM;//是否显示切换相机正反面按钮
    private final String str_FocusCgTs;//聚焦成功提示
    private final String str_FocusSbTs;//聚焦失败提示
    private Activity mActivity;//
    private final boolean isShowFocusCGTips;//是否显示聚焦成功的提示
    private final int int_NewWorkQqCode;
    private final int int_ImageBhCodeInfo;

    private PhotoConfigInfo(Builder mBuilder) {
        boolean_PreCamera = mBuilder.isCheckInfo;
        str_finalSavePath = mBuilder.str_ImagePath;
        isShowCropBox = mBuilder.isShowMk;
        isShowChangeZmOrBackM = mBuilder.isUseIfE;
        str_FocusCgTs = mBuilder.str_JJCGTS;
        str_FocusSbTs = mBuilder.str_JJSBTS;
        mActivity = mBuilder.mActivity;
        isShowFocusCGTips = mBuilder.isXsFocusTips;
        int_NewWorkQqCode = mBuilder.int_first;
        int_ImageBhCodeInfo = mBuilder.int_second;
        if (mActivity == null) {
            throw new NullPointerException("Activity param is null");
        }
    }

    protected PhotoConfigInfo(Parcel in) {

        boolean_PreCamera = in.readByte() != 0;
        str_finalSavePath = in.readString();
        str_TemporaryPath = in.readString();
        isShowCropBox = in.readByte() != 0;
        isShowChangeZmOrBackM = in.readByte() != 0;
        str_FocusCgTs = in.readString();
        str_FocusSbTs = in.readString();
        isShowFocusCGTips = in.readByte() != 0;
        int_NewWorkQqCode = in.readInt();
        int_ImageBhCodeInfo = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel parcel, int code) {

        parcel.writeByte((byte) (boolean_PreCamera ? 1 : 0));
        parcel.writeString(str_finalSavePath);
        parcel.writeString(str_TemporaryPath);
        parcel.writeByte((byte) (isShowCropBox ? 1 : 0));
        parcel.writeByte((byte) (isShowChangeZmOrBackM ? 1 : 0));
        parcel.writeString(str_FocusCgTs);
        parcel.writeString(str_FocusSbTs);
        parcel.writeByte((byte) (isShowFocusCGTips ? 1 : 0));
        parcel.writeInt(int_NewWorkQqCode);
        parcel.writeInt(int_ImageBhCodeInfo);
    }

    @Override
    public int describeContents() {

        return 0;
    }

    public static final Creator<PhotoConfigInfo> CREATOR = new Creator<PhotoConfigInfo>() {
        @Override
        public PhotoConfigInfo createFromParcel(Parcel in) {

            return new PhotoConfigInfo(in);
        }

        @Override
        public PhotoConfigInfo[] newArray(int size) {
            return new PhotoConfigInfo[size];
        }
    };

    private PhotoConfigInfo startActivity(int requestCode) {
//        Intent intent = new Intent(mActivity, PhotoAboutAty.class);
//        intent.putExtra("camera_param_key", this);
//        intent.putExtra("camera_type", boolean_PreCamera ? "0" : "1");
//        mActivity.startActivityForResult(intent, requestCode);
        return this;
    }

    public boolean isBoolean_PreCamera() {

        return boolean_PreCamera;
    }

    public String getFinalSavePath() {
        return str_finalSavePath;
    }

    public boolean isShowCropBox() {
        return isShowCropBox;
    }

    public boolean isShowChangeZmOrBackM() {
        return isShowChangeZmOrBackM;
    }

    public String getPictureTempPath() {
        File file = new File(getFinalSavePath());
        String pictureName = file.getName();
        String newName = null;
        if (pictureName.contains(".")) {
            int lastDotIndex = pictureName.lastIndexOf('.');
            newName = pictureName.substring(0, lastDotIndex) + "_temp" + pictureName.substring(lastDotIndex);
        }
        if (newName == null) {
            newName = pictureName;
        }
        return file.getParent() + File.separator + newName;
    }

    public boolean isShowFocusCGTips() {
        return isShowFocusCGTips;
    }

    public int getNewWorkQqCodeInfo() {
        return int_NewWorkQqCode;
    }

    public static class Builder {
        private boolean isCheckInfo = false;
        private String str_ImagePath = obtainSaveBiamapPath();
        private boolean isShowMk = true;
        private boolean isUseIfE = false;
        private String str_JJCGTS;//聚焦成功提示
        private String str_JJSBTS;//聚焦失败提示
        private Activity mActivity;//
        private boolean isXsFocusTips = true;
        private int int_first = 0X1010;
        private int int_second = 0;

        public Builder setInt_second(int int2) {
            this.int_second = int2;
            return this;
        }

        public Builder setIsCheckInfo(boolean isCheckInfo) {
            this.isCheckInfo = isCheckInfo;
            return this;
        }

        public Builder setHaveImagePath(String path) {
            this.str_ImagePath = path;
            return this;
        }

        public Builder setIsShowMk(boolean is) {
            this.isShowMk = is;
            return this;
        }

        public Builder setIsUseIf(boolean q) {
            this.isUseIfE = q;
            return this;
        }

        public Builder setStr_JJCGTS(String tip) {

            this.str_JJCGTS = tip;
            return this;
        }

        public Builder setStr_JJSBTS(String tips) {
            this.str_JJSBTS = tips;
            return this;
        }

        public Builder setActivity(Activity mActivity) {
            this.mActivity = mActivity;
            return this;
        }

        public Builder setIsXsFocusTips(boolean check) {
            this.isXsFocusTips = check;
            return this;
        }

        public Builder setInt_first(int int_1) {

            this.int_first = int_1;
            return this;
        }

        public PhotoConfigInfo build() {

            return new PhotoConfigInfo(this).startActivity(int_first);
        }

        public static String obtainSaveBiamapPath() {
            String str_path = Environment.getExternalStorageDirectory().getPath() + File.separator + "DCIM" + File.separator + "Camera";
            File file = new File(str_path);
            if (!file.exists()) {
                file.mkdirs();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
            return file.getAbsolutePath() + File.separator + "IMG_" + simpleDateFormat.format(new Date()) + ".jpg";
        }
    }
}
