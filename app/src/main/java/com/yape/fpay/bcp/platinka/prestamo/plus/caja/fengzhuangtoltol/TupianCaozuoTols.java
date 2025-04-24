package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 集合一些图片工具
 * <p>
 * <p>
 * <p>
 * Created by zhuwentao on 2016-07-22.
 */

public class TupianCaozuoTols {

    /**
     * 存放拍摄图片的文件夹
     */

    private static final String WENJIAN_MING = "/MyPhoto";

    /**
     * 获取的时间格式
     */

    public static final String SHIJIAN_GESHIFROMAT = "yyyyMMddHHmmss";

    /**
     * 图片种类
     */

    public static final String TUPIAN_LEIXING = ".png";

// 防止实例化

    private TupianCaozuoTols() {

    }

    /**
     * 获取手机可存储路径
     *
     * @param chiyouzhe 上下文
     * @return 手机可存储路径
     */

    private static String huoquZhuajiCunchuLujing(Context chiyouzhe) {

// 是否有SD卡

        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)

                || !Environment.isExternalStorageRemovable()) {

// 获取SD卡根目录

            return chiyouzhe.getExternalCacheDir().getPath();

        } else {

// 获取apk包下的缓存路径

            return chiyouzhe.getCacheDir().getPath();

        }

    }

    /**
     * 使用当前系统时间作为上传图片的名称
     *
     * @return 存储的根路径+图片名称
     */

    public static String wenjianMingByXitongTime(Context chiyouzhe) {

        File wenjanming = new File(huoquZhuajiCunchuLujing(chiyouzhe) + WENJIAN_MING);

// 判断文件是否已经存在，不存在则创建

        if (!wenjanming.exists()) {

            wenjanming.mkdirs();

        }

// 设置图片文件名称

        SimpleDateFormat jiandanshijiangeshi = new SimpleDateFormat(SHIJIAN_GESHIFROMAT, Locale.getDefault());

        Date shijianchuo = new Date(System.currentTimeMillis());

        String shijianstrrrr = jiandanshijiangeshi.format(shijianchuo);

        String tupianMING = "/" + shijianstrrrr + TUPIAN_LEIXING;

        return wenjanming + tupianMING;

    }

    /**
     * 保存Bitmap图片在SD卡中
     * <p>
     * 如果没有SD卡则存在手机中
     *
     * @param tuxiang 需要保存的Bitmap图片
     * @return 保存成功时返回图片的路径，失败时返回null
     */

    public static String baocunTupainDaoSdKa(Bitmap tuxiang, Context chiyouzhe) {

        FileOutputStream shuchuLiu = null;

        String wenjianMing = wenjianMingByXitongTime(chiyouzhe);

        try {

            shuchuLiu = new FileOutputStream(wenjianMing);

// 把数据写入文件，100表示不压缩

            tuxiang.compress(Bitmap.CompressFormat.PNG, 100, shuchuLiu);

            return wenjianMing;

        } catch (Exception e) {

            e.printStackTrace();

            return null;

        } finally {

            try {

                if (shuchuLiu != null) {

// 记得要关闭流！

                    shuchuLiu.close();

                }

                if (tuxiang != null) {

                    tuxiang.recycle();

                }

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }

    /**
     * 把原图按1/10的比例压缩
     *
     * @param path 原图的路径
     * @return 压缩后的图片
     */

    public static Bitmap yaSuotupianBaifenzhishi(String path) {

        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = false;

        options.inSampleSize = 10; // 图片的大小设置为原来的十分之一

        Bitmap bmp = BitmapFactory.decodeFile(path, options);

        options = null;

        return bmp;

    }

    /**
     * 处理旋转后的图片
     *
     * @param yuanshiLujing 原图路径
     * @param chiyouzhe    上下文
     * @return 返回修复完毕后的图片路径
     */

    public static String chuliXuanzhuanhouTupian(String yuanshiLujing, Context chiyouzhe) {

// 取得图片旋转角度

        int xuanzhuanJiaodu = huoquTupianXuanzhuanJiaodu(yuanshiLujing);

// 把原图压缩后得到Bitmap对象

        Bitmap tuxiang = yaSuotupianBaifenzhishi(yuanshiLujing);
        ;

// 修复图片被旋转的角度

        Bitmap xiugfuhouTuxiang = zuoTupianXuanzhuan(xuanzhuanJiaodu, tuxiang);

// 保存修复后的图片并返回保存后的图片路径

        return baocunTupainDaoSdKa(xiugfuhouTuxiang, chiyouzhe);

    }

    /**
     * 读取照片旋转角度
     *
     * @param wiezhilujing 照片路径
     * @return 角度
     */

    public static int huoquTupianXuanzhuanJiaodu(String wiezhilujing) {

        int jiaoduba = 0;

        try {

            ExifInterface daochuJiekou = new ExifInterface(wiezhilujing);

            int orientation = daochuJiekou.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);

            switch (orientation) {

                case ExifInterface.ORIENTATION_ROTATE_90:

                    jiaoduba = 90;

                    break;

                case ExifInterface.ORIENTATION_ROTATE_180:

                    jiaoduba = 180;

                    break;

                case ExifInterface.ORIENTATION_ROTATE_270:

                    jiaoduba = 270;

                    break;

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        return jiaoduba;

    }

    /**
     * 旋转图片
     *
     * @param jioadu  被旋转角度
     * @param tuxiang 图片对象
     * @return 旋转后的图片
     */

    public static Bitmap zuoTupianXuanzhuan(int jioadu, Bitmap tuxiang) {

        Bitmap xuanzhuanJieguoTuxiang = null;

// 根据旋转角度，生成旋转矩阵

        Matrix juzheng = new Matrix();

        juzheng.postRotate(jioadu);

        try {

// 将原始图片按照旋转矩阵进行旋转，并得到新的图片

            xuanzhuanJieguoTuxiang = Bitmap.createBitmap(tuxiang, 0, 0, tuxiang.getWidth(), tuxiang.getHeight(), juzheng, true);

        } catch (OutOfMemoryError e) {

        }

        if (xuanzhuanJieguoTuxiang == null) {

            xuanzhuanJieguoTuxiang = tuxiang;

        }

        if (tuxiang != xuanzhuanJieguoTuxiang) {

            tuxiang.recycle();

        }

        return xuanzhuanJieguoTuxiang;

    }

}