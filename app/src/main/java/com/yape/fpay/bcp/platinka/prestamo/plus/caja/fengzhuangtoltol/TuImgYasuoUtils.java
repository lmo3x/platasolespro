package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;

public  class TuImgYasuoUtils {
    private int maxWidth = 400;
    private int maxHeight = 300;
    private Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
    private int quality = 50;
    private String path;

    public TuImgYasuoUtils(Context context) {
        path = context.getExternalCacheDir().getPath() + File.separator + "images";
    }


    public File yasuoTu(File imageFile) throws IOException {
        return yasuoTu(imageFile, imageFile.getName());
    }

    public File yasuoTu(File imageFile, String compressedFileName) throws IOException {
        return ImageBaseCaozuoUtils.compressTuutuYa(imageFile, maxWidth, maxHeight, compressFormat, quality,
                path + File.separator + compressedFileName);
    }

}
