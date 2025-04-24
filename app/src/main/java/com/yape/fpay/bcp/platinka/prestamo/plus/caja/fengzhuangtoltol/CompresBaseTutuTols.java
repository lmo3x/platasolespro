package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 压缩获取到的图片，并返回地址，用于aadhaar--onActivityResult
 */
public class CompresBaseTutuTols {

    private static final int HIWDe_SXAZSF = 1080;


    /**
     * 质量压缩方法----当前
     */
    public static String yasuoTufanhuiLujing(String bWdweDdxsDs, Context context) {

        Bitmap yuanshiimage = BitmapFactory.decodeFile(bWdweDdxsDs);

        int size = 0;
        Log.d("imgsize","init_0");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { // API 19
            size = yuanshiimage.getAllocationByteCount();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1) { // API 12
            size = yuanshiimage.getByteCount();
        } else { // pre-API 12
            size = yuanshiimage.getRowBytes() * yuanshiimage.getHeight(); // older method
        }
        Log.d("imgsize","getsize"+size);
        String filePath = "";
        Bitmap image =null;
        if (size / 1000 > 100) {

            image = yasuoByperbili(bWdweDdxsDs, 2);
        }else {
            image =yuanshiimage;
        }

        if (image == null) {
            return "";
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 100, baos);// 质量压缩方法，这里100表示不压缩，把压缩后的数据存放到baos中
        int options = 90;
        while (baos.toByteArray().length / 1024 > 100) { // 循环判断如果压缩后图片是否大于100k,大于继续压缩
            baos.reset(); // 重置baos即清空baos
            image.compress(Bitmap.CompressFormat.JPEG, options, baos);// 这里压缩options%，把压缩后的数据存放到baos中
            if (options > 10) {
                options -= 5;// 每次都减少10
            } else {
                options -= 5;
            }

            if (options == 5) {
                break;
            }
        }
        Log.d("imgsize","end"+baos.toByteArray());
        FileOutputStream outStream = null;
        filePath = chuangjianPaituSaveLujing(context);
        try {
            outStream = new FileOutputStream(filePath);
            // 把数据写入文件
            outStream.write(baos.toByteArray());
            // 记得要关闭流！
            outStream.close();
            return filePath;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (outStream != null) {
                    // 记得要关闭流！
                    outStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 创建拍照照片保存路径
     */
    public static String chuangjianPaituSaveLujing(Context context) {
        String path = "";
        path = context.getFilesDir() + File.separator + "cameraPic";

        try {
            File file = new File(path);

            File dir = new File(file.getParent());
            //创建目录
            if (!dir.exists()) {
                dir.mkdirs();
            }


            if (!file.exists()) {
                file.mkdir();
            }
            File output = new File(file, System.currentTimeMillis() + ".png");

            if (output.exists()) {
                output.delete();
            } else {
                output.createNewFile();
            }
            path = output.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    /**
     * 把原图按比例压缩
     *
     * @param yuanlU 原图的路径
     * @return 压缩后的图片
     */
    public static Bitmap yasuoByperbili(String yuanlU, int shDos) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        //开始读入图片，此时把options.inJustDecodeBounds 设回true了
        options.inJustDecodeBounds = true;
        Bitmap bitmap = BitmapFactory.decodeFile(yuanlU, options);//此时返回bm为空

        options.inJustDecodeBounds = false;
        int maxSize = HIWDe_SXAZSF;

        if (options.outHeight > 0 && options.outWidth > 0) {
            while (options.outHeight / shDos > maxSize || options.outWidth / shDos > maxSize) {
                shDos = shDos + 1;
            }
        } else {
            shDos = shDos << 1;
        }
        options.inSampleSize = shDos;//设置缩放比例
        try {
            //重新读入图片，注意此时已经把options.inJustDecodeBounds 设回false了
            bitmap = BitmapFactory.decodeFile(yuanlU, options);
        } catch (OutOfMemoryError e) {
            options.inSampleSize *= 2;
            bitmap = BitmapFactory.decodeFile(yuanlU, options);
        }
        return bitmap;
    }

}
