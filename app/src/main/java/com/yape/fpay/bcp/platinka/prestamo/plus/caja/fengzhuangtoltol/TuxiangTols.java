package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.widget.ImageView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import top.zibin.luban.Luban;
import top.zibin.luban.OnCompressListener;

public class TuxiangTols {

    //bitmap2uri
    public static Uri tuxiangZhuanLujing(Context chiyouzhe, Bitmap tuxiang) {
        File path = new File(chiyouzhe.getCacheDir() + File.separator + System.currentTimeMillis() + ".jpg");
        try {
            OutputStream shuchuLiu = new FileOutputStream(path);
            tuxiang.compress(Bitmap.CompressFormat.JPEG, 100, shuchuLiu);
            shuchuLiu.close();
            return Uri.fromFile(path);
        } catch (Exception ignored) {
        }
        return null;
    }

    //图片空间
    public static Bitmap tuPianKongjian(Bitmap tuxiang) {
        Log.d("shoujixinghao", Build.MODEL);
//        if (Build.MODEL.equals("V1824A")) {
//            tuxiang = xuanZhuanTupian(90, tuxiang);
//
//        }
        //图片允许最大空间   单位：KB
        double allZuidaKongjian = 100.00;
        //将bitmap放至数组中，意在bitmap的大小（与实际读取的原文件要大）
        ByteArrayOutputStream zijieShujuShuchu = new ByteArrayOutputStream();
        tuxiang.compress(Bitmap.CompressFormat.JPEG, 100, zijieShujuShuchu);
        byte[] tuxaingShuzu = zijieShujuShuchu.toByteArray();
        //将字节换成KB
        double shuzuZijieDaxiao = tuxaingShuzu.length / 1024;
        //判断bitmap占用空间是否大于允许最大空间  如果大于则压缩 小于则不压缩
        if (shuzuZijieDaxiao > allZuidaKongjian) {
            //获取bitmap大小 是允许最大大小的多少倍
            double i = shuzuZijieDaxiao / allZuidaKongjian;
            //开始压缩  此处用到平方根 将宽带和高度压缩掉对应的平方根倍 （1.保持刻度和高度和原bitmap比率一致，压缩后也达到了最大大小占用空间的大小）
            tuxiang = yaSuoTupain(tuxiang, tuxiang.getWidth() / Math.sqrt(i),
                    tuxiang.getHeight() / Math.sqrt(i));
            return tuxiang;
        }
        return tuxiang;
    }

    //比例压缩
    public static Bitmap comp(Bitmap image) {
        if (image != null) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            image.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            if (baos.toByteArray().length / 1024 > 1024) {//判断如果图片大于1M,进行压缩避免在生成图片（BitmapFactory.decodeStream）时溢出
                baos.reset();//重置baos即清空baos
                image.compress(Bitmap.CompressFormat.JPEG, 50, baos);//这里压缩50%，把压缩后的数据存放到baos中
            }
            ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());
            BitmapFactory.Options newOpts = new BitmapFactory.Options();
            //开始读入图片，此时把options.inJustDecodeBounds 设回true了
            newOpts.inJustDecodeBounds = true;
            Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, newOpts);
            newOpts.inJustDecodeBounds = false;
            int w = newOpts.outWidth;
            int h = newOpts.outHeight;
            //现在主流手机比较多是800*480分辨率，所以高和宽我们设置为
            float hh = 800f;//这里设置高度为800f
            float ww = 480f;//这里设置宽度为480f
            //缩放比。由于是固定比例缩放，只用高或者宽其中一个数据进行计算即可
            int be = 1;//be=1表示不缩放
            if (w > h && w > ww) {//如果宽度大的话根据宽度固定大小缩放
                be = (int) (newOpts.outWidth / ww);
            } else if (w < h && h > hh) {//如果高度高的话根据宽度固定大小缩放
                be = (int) (newOpts.outHeight / hh);
            }
            if (be <= 0)
                be = 1;
            newOpts.inSampleSize = be;//设置缩放比例
            newOpts.inPreferredConfig = Bitmap.Config.RGB_565;//降低图片从ARGB888到RGB565
            //重新读入图片，注意此时已经把options.inJustDecodeBounds 设回false了
            isBm = new ByteArrayInputStream(baos.toByteArray());
            bitmap = BitmapFactory.decodeStream(isBm, null, newOpts);
            return bitmap;//压缩好比例大小后再进行质量压缩
        } else {
            return null;
        }

    }


    /***
     * 图片的缩放方法
     *
     * @param tupian
     *            ：源图片资源
     * @param xinKuandu
     *            ：缩放后宽度
     * @param xinGaodu
     *            ：缩放后高度
     * @return
     */
    public static Bitmap yaSuoTupain(Bitmap tupian, double xinKuandu,
                                     double xinGaodu) {
        // 获取这个图片的宽和高
        float dangqianKuandu = tupian.getWidth();
        float dangqianGaodu = tupian.getHeight();
        // 创建操作图片用的matrix对象
        Matrix tupianCaozuoDuixiang = new Matrix();
        // 计算宽高缩放率
        float kuanduSuofangLv = ((float) xinKuandu) / dangqianKuandu;
        float GaoduSuofangLv = ((float) xinGaodu) / dangqianGaodu;
        // 缩放图片动作
        tupianCaozuoDuixiang.postScale(kuanduSuofangLv, GaoduSuofangLv);
        Bitmap zuihouTupian = Bitmap.createBitmap(tupian, 0, 0, (int) dangqianKuandu,
                (int) dangqianGaodu, tupianCaozuoDuixiang, true);
        int width1 = zuihouTupian.getWidth();
        int height1 = zuihouTupian.getHeight();
        return zuihouTupian;
    }


    /**
     * 保存bitmap到本地
     *
     * @param tupian Bitmap
     */

    public static File baocunTupianDaoBendi(Bitmap tupian, String mingzi, Context chiyouzhe) {
        String baocunLujing;
        File tupianWenjian;
        baocunLujing = chiyouzhe.getExternalFilesDir(null) + "/" + mingzi + ".png";
        try {
            tupianWenjian = new File(baocunLujing);
            if (!tupianWenjian.exists()) {
                tupianWenjian.getParentFile().mkdirs();
                tupianWenjian.createNewFile();
            }
            FileOutputStream wenjanShuchuliu = new FileOutputStream(tupianWenjian);
            tupian.compress(Bitmap.CompressFormat.JPEG, 100, wenjanShuchuliu);
            wenjanShuchuliu.flush();
            wenjanShuchuliu.close();
        } catch (IOException e) {

            return null;
        }
        return tupianWenjian;
    }

    /**
     * 处理旋转后的图片
     *
     * @param yuanshiLujing 原图路径
     * @param chiyouzhe    上下文
     * @return 返回修复完毕后的图片路径
     */
    public static String chuliXuanhuanhouTupian(String yuanshiLujing, Context chiyouzhe) {
        // 取得图片旋转角度
        int tupianXuanZhuanJidou = huoquTupianXuanzhaunJiaodu(yuanshiLujing);
        // 把原图压缩后得到Bitmap对象
        Bitmap yasuohouTupian = huoquyasuoTu(yuanshiLujing);
        // 修复图片被旋转的角度
        Bitmap xiuFuhouTupian = xuanZhuanTupian(tupianXuanZhuanJidou, yasuohouTupian);
        // 保存修复后的图片并返回保存后的图片路径
        return baocunTupianDaoSD(xiuFuhouTupian, chiyouzhe);
    }


    /**
     * 读取照片旋转角度
     *
     * @param lujing 照片路径
     * @return 角度
     */
    public static int huoquTupianXuanzhaunJiaodu(String lujing) {
        int jiaodu = 0;
        try {
            ExifInterface daochuJiekou = new ExifInterface(lujing);
            int tupianFangxiang = daochuJiekou.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);
            switch (tupianFangxiang) {
                case ExifInterface.ORIENTATION_ROTATE_90:
                    jiaodu = 90;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_180:
                    jiaodu = 180;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_270:
                    jiaodu = 270;
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String shoujiXinghao = Build.MODEL;
        if (shoujiXinghao.contains("Redmi Note 8 Pro") || shoujiXinghao.contains("M2007J17C")) {
            jiaodu = 90;
        }
        return jiaodu;
    }

    //获取压缩图片
    public static Bitmap huoquyasuoTu(String lujing) {
        BitmapFactory.Options tupianCaozuo = new BitmapFactory.Options();
        Bitmap yasuoHouTupian = BitmapFactory.decodeFile(lujing, tupianCaozuo);
        tupianCaozuo = null;
        return yasuoHouTupian;
    }

    /**
     * 旋转图片
     *
     * @param angle  被旋转角度
     * @param bitmap 图片对象
     * @return 旋转后的图片
     */
    public static Bitmap xuanZhuanTupian(int angle, Bitmap bitmap) {
        Bitmap zuizhongTupian = null;
// 根据旋转角度，生成旋转矩阵
        Matrix xuanzhanJuzheng = new Matrix();
        xuanzhanJuzheng.postRotate(angle);
        try {
// 将原始图片按照旋转矩阵进行旋转，并得到新的图片
            zuizhongTupian = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), xuanzhanJuzheng, true);
        } catch (OutOfMemoryError e) {
        }
        if (zuizhongTupian == null) {
            zuizhongTupian = bitmap;
        }
        if (bitmap != zuizhongTupian) {
            bitmap.recycle();
        }
        return zuizhongTupian;
    }

    //保存图片到sd卡
    public static String baocunTupianDaoSD(Bitmap tuxiang, Context chiouzhe) {
        FileOutputStream shuchuLiu = null;
        String wenjianMing = huoquTupianMing(chiouzhe);
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
     * 存放拍摄图片的文件夹
     */
    private static final String SAVETUPIAN_FILEPATH = "/Photos";
    /**
     * 获取的时间格式
     */
    public static final String SHIJIAN_LEIXING = "yyyyMMddHHmmss";
    /**
     * 图片种类
     */
    public static final String TUPIAN_LEIXING = ".png";

    //获取图片名
    public static String huoquTupianMing(Context chiyouZhe) {
        File wenjianming = new File(getPhoneRootPath(chiyouZhe) + SAVETUPIAN_FILEPATH);
// 判断文件是否已经存在，不存在则创建
        if (!wenjianming.exists()) {
            wenjianming.mkdirs();
        }
// 设置图片文件名称
        SimpleDateFormat tupianGeshi = new SimpleDateFormat(SHIJIAN_LEIXING, Locale.getDefault());
        Date shijianchuo = new Date(System.currentTimeMillis());
        String shijianStr = tupianGeshi.format(shijianchuo);
        String tupianMingzi = "/" + shijianStr + TUPIAN_LEIXING;
        return wenjianming + tupianMingzi;
    }

    private static String getPhoneRootPath(Context chiyouZhe) {
// 是否有SD卡
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)
                || !Environment.isExternalStorageRemovable()) {
// 获取SD卡根目录
            return chiyouZhe.getExternalCacheDir().getPath();
        } else {
// 获取apk包下的缓存路径
            return chiyouZhe.getCacheDir().getPath();
        }
    }

    //tupian base64 jiami
    public static String tuxiangZhuanBase64(Bitmap tuxiang) {
        String result = null; ByteArrayOutputStream baos = null;
        try {
            if (tuxiang != null) {
                baos = new ByteArrayOutputStream();
                tuxiang.compress(Bitmap.CompressFormat.JPEG, 100, baos);
                baos.flush(); baos.close(); byte[] bitmapBytes = baos.toByteArray();
                result = Base64.encodeToString(bitmapBytes, Base64.DEFAULT);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (baos != null) {
                    baos.flush(); baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    //luban do image
    public static File chuliImage(Context context, String imagepath){

//        Luban.with(context)
//                .load(imagepath)
//                .ignoreBy(100)
//                .setTargetDir(huoquTupianMing(context))
//                .filter(new CompressionPredicate() {
//                    @Override
//                    public boolean apply(String path) {
//                        return !(TextUtils.isEmpty(path) || path.toLowerCase().endsWith(".gif"));
//                    }
//                })
//                .setCompressListener(new OnCompressListener() {
//                    @Override
//                    public void onStart() {
//                        // TODO 压缩开始前调用，可以在方法内启动 loading UI
//                    }
//
//                    @Override
//                    public void onSuccess(File file) {
//                        // TODO 压缩成功后调用，返回压缩后的图片文件
//                        Log.d("luban","chenggong");
//                        return file;
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        // TODO 当压缩过程出现问题时调用
//                        return null;
//                    }
//                }).launch();
        return  null;
    }

    private static void Lubancompress(Context context, String imagepath, ImageView imageView) {
//        setTest();
        Log.d("compress", "======start===0===" + imagepath);
        if ("moto e40".equals(Build.MODEL)) {
            //系统照相机
        }


        new Thread() {
            @Override
            public void run() {
                super.run();

//                try {
//                    Thread.sleep(3000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                Log.d("compress", "=======start===000==");

                Luban.with(context).load(imagepath).ignoreBy(350).setCompressListener(new OnCompressListener() {

                    @Override
                    public void onStart() {

                    }

                    @Override
                    public void onSuccess(File file) {
//                        toLone = false;
                        Log.d("compress", "=======end===11==" + file.getAbsolutePath());

//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                Glide.with(context).load(file).into(imageView);
//                            }
//                        });
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                }).launch();
            }
        }.start();
    }
}
