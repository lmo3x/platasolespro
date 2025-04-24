package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static android.content.Context.ACTIVITY_SERVICE;

public class CunchuTols {


    /**
     * 获取android总运行内存大小
     */
    public static long gaoDaoNeicunDaxiao() {
        String ddddd = "/proc/meminfo";
        String htgrefasg;
        String[] stringShuzu;
        long chushihuaNeicun = 0;
        try {
            FileReader localFileReader = new FileReader(ddddd);
            BufferedReader localBufferedReader = new BufferedReader(localFileReader, 8192);
            htgrefasg = localBufferedReader.readLine();
            stringShuzu = htgrefasg.split("\\s+");
            for (String num : stringShuzu) {
                Log.i(htgrefasg, num + "\t");
            }
            int i = Integer.valueOf(stringShuzu[1]).intValue();
            //int值乘以1024转换为long类型
            chushihuaNeicun = new Long((long) i * 1024);
            localBufferedReader.close();
        } catch (IOException e) {
        }
        return chushihuaNeicun;
    }

    /**
     * 分配内存大小
     */
    public static long peiZhiNeicun() {
        long totalMemory = Runtime.getRuntime().totalMemory();
        return totalMemory;
    }

    /**
     * 获取可用内存
     */
    public static long gaoDaoKeyongNeicun(Activity accccc) {
        ActivityManager aaaguanli = (ActivityManager)accccc.getSystemService(ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo neicunXinxi = new ActivityManager.MemoryInfo();
        aaaguanli.getMemoryInfo(neicunXinxi);
        // neicunXinxi.availMem; 当前系统的可用内存
        return neicunXinxi.availMem;
    }

    public static long gaoDaoKeyongNeicun2(Activity acccc) {
        ActivityManager aaaguanli = (ActivityManager) acccc.getSystemService(ACTIVITY_SERVICE);
        //最大分配内存
        int maxPeizhiNeicun = aaaguanli.getMemoryClass();
        System.out.println("maxPeizhiNeicun: "+maxPeizhiNeicun);
        //最大分配内存获取方法2
        float maxPeizhiNeicun2 = (float) (Runtime.getRuntime().maxMemory() * 1.0/ (1024 * 1024));
        //当前分配的总内存
        float fenPeiZongNeicun = (float) (Runtime.getRuntime().totalMemory() * 1.0/ (1024 * 1024));
        //剩余内存
        float shengYuNeicun = (float) (Runtime.getRuntime().freeMemory() * 1.0/ (1024 * 1024));
        System.out.println("maxPeizhiNeicun2: "+maxPeizhiNeicun2);
        System.out.println("fenPeiZongNeicun: "+fenPeiZongNeicun);
        System.out.println("shengYuNeicun: "+shengYuNeicun);
        return Runtime.getRuntime().freeMemory();
    }

    //当前分配的总内存
    public static long gaoDaoKeyongNeicun3(Activity aaaccc) {
        ActivityManager aaaGuanli = (ActivityManager) aaaccc.getSystemService(ACTIVITY_SERVICE);
        //最大分配内存
        int zuiDaNeicun = aaaGuanli.getMemoryClass();
        System.out.println("zuiDaNeicun: "+zuiDaNeicun);
        //最大分配内存获取方法2
        float zuiDaNeicun2 = (float) (Runtime.getRuntime().maxMemory() * 1.0/ (1024 * 1024));
        //当前分配的总内存
        float fenpeiZongneicun = (float) (Runtime.getRuntime().totalMemory() * 1.0/ (1024 * 1024));
        //剩余内存
        float shengYuNeicun = (float) (Runtime.getRuntime().freeMemory() * 1.0/ (1024 * 1024));
        System.out.println("zuiDaNeicun2: "+zuiDaNeicun2);
        System.out.println("fenpeiZongneicun: "+fenpeiZongneicun);
        System.out.println("shengYuNeicun: "+shengYuNeicun);
        return Runtime.getRuntime().totalMemory();
    }
    
    public static long xianZhiNeicun(Activity aaaccc) {
        //当前app的可用内存
        return Runtime.getRuntime().freeMemory();
    }

    public static long getZongdaxiaoForExternal() {
        return gaoDaoZongDaxiao(gaodaoSdKaLujingGenjuHuanjing());
    }

    public static long gaoDaoZongDaxiao(String lujing) {
        if (TextUtils.isEmpty(lujing)) return 0;
        StatFs statFs = new StatFs(lujing);
        long blockSize;
        long totalSize;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR2) {
            blockSize = statFs.getBlockSizeLong();
            totalSize = statFs.getBlockCountLong();
        } else {
            blockSize = statFs.getBlockSize();
            totalSize = statFs.getBlockCount();
        }
        return blockSize * totalSize;
    }

    public static String gaodaoSdKaLujingGenjuHuanjing() {
        if (sdKaShicouKeyongGenjuHuanjing()) {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        return "";
    }
    public static boolean sdKaShicouKeyongGenjuHuanjing() {
        return Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState());
    }

    public static long gaoDaoKeyongDaxiaoForExternal() {
        return gaoDaoKeyongDaxiao(gaodaoSdKaLujingGenjuHuanjing());
    }
    public static long gaoDaoKeyongDaxiao(final String lujing) {
        if (TextUtils.isEmpty(lujing)) return 0;
        StatFs sssfff = new StatFs(lujing);
        long kuaiDaxiao;//blockSize
        long keyongDaxiao;//availableSize
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR2) {
            kuaiDaxiao = sssfff.getBlockSizeLong();
            keyongDaxiao = sssfff.getAvailableBlocksLong();
        } else {
            kuaiDaxiao = sssfff.getBlockSize();
            keyongDaxiao = sssfff.getAvailableBlocks();
        }
        return kuaiDaxiao * keyongDaxiao;
    }

    public  static String gaoDaoWaibuCunchuLujing(Context chiyongzhe) {
        StorageManager cunChuGuanli = (StorageManager) chiyongzhe.getSystemService(Context
                .STORAGE_SERVICE);
        Class<?> cunchuLieZhi = null;
        try {
            cunchuLieZhi = Class.forName("android.os.storage.StorageVolume");
            Method lieList = cunChuGuanli.getClass().getMethod("getVolumeList");
            Method deDaoLujing = cunchuLieZhi.getMethod("getPath");
            Method shifouKeYichu = cunchuLieZhi.getMethod("isRemovable");
            Method deDaoMiaoshu = cunchuLieZhi.getMethod("getDescription", Context.class);
            Object result = lieList.invoke(cunChuGuanli);
            final int length = Array.getLength(result);
            for (int i = 0; i < length; i++) {
                Object cunChuLieYuansu = Array.get(result, i);
                String luJing = (String) deDaoLujing.invoke(cunChuLieYuansu);
                boolean isKeyichu = (Boolean) shifouKeYichu.invoke(cunChuLieYuansu);
                String miaoshu = (String) deDaoMiaoshu.invoke(cunChuLieYuansu, chiyongzhe);
                if (isKeyichu && miaoshu.contains("SD")) {
                    return luJing;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * ROM内存大小
     * @return
     */
    public static long deDaoRomZongdaxiao() {
        File shuJuMulu = Environment.getDataDirectory();
        StatFs ssfttff = new StatFs(shuJuMulu.getPath());
        long kuaiDaxiao = ssfttff.getBlockSizeLong();
        long zongKuaiShu = ssfttff.getBlockCountLong();
        long zongDaxiao = zongKuaiShu * kuaiDaxiao;
        return zongDaxiao;
    }

    /**
     * RAM内存总大小
     * @return
     */
    public static long deDaoNeicunDaxiao(Context chiyouZhe) {
        ActivityManager aaaGuanli = (ActivityManager) chiyouZhe.getSystemService(ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo neiCunXinxi = new ActivityManager.MemoryInfo();
        aaaGuanli.getMemoryInfo(neiCunXinxi );
        long availMem = neiCunXinxi.availMem;
        long totalMem = neiCunXinxi.totalMem;
        return totalMem;
    }

    /**
     * 应用程序最大内存
     * @return
     */
    public static long deDaoRomZongdaxiao(Context chiyouZhe) {
        ActivityManager aaaGuanli = (ActivityManager) chiyouZhe.getApplicationContext().getSystemService(ACTIVITY_SERVICE);
        int zuiXiaoNeicun = aaaGuanli.getMemoryClass();
        int zuiDaNeicun = aaaGuanli.getLargeMemoryClass();
        long maxMemory = Runtime.getRuntime().maxMemory();//根据是否largeHeap，等于limitMemory或largeMemory
        return maxMemory;
    }
}
