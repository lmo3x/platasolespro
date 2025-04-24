package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class ShijianTols {

    private static SimpleDateFormat shijianGeshi = null;

    /*获取系统时间 格式为："yyyy/MM/dd "*/

    public static String huoquDangqianShijian() {

        Date d = new Date();

        shijianGeshi = new SimpleDateFormat("yyyy年MM月dd日");

        return shijianGeshi.format(d);

    }
    public static Date huoquNian() {
        SimpleDateFormat formats = new SimpleDateFormat("yyyy");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, -10);
        Date date = c.getTime();
        return date;
    }
    /**
     * 获取当前时间戳
     *
     * @return 当前时间戳
     */
    public static long huoquDangqianShijianChuo() {
        long timeMillis = System.currentTimeMillis();
        return timeMillis;
    }

    /*时间戳转换成字符窜*/
    public static String shijianChuoZhuanZifuchuan(long lonshijianchuo) {
        Date d = new Date(lonshijianchuo);
        shijianGeshi = new SimpleDateFormat("yyyy-MM-dd");
        String[] strArr = shijianGeshi.format(d).split("-");
        return strArr[2] + "-" + strArr[1] + "-" + strArr[0];
    }

    /*将字符串转为时间戳 包含时分秒*/
    public static long zifuchuanZhuanShijianchuo(String shijianchuan) {
        shijianGeshi = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        try {
            date = shijianGeshi.parse(shijianchuan);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    /*将字符串转为时间戳 不含时分秒*/
    public static long zifuchuanZhuanShijianchuo2(String shijain) {
        shijianGeshi = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        try {
            date = shijianGeshi.parse(shijain);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    /**
     * 直接获取时间戳
     *
     * @return
     */

    public static String huoquShijianchuo() {

        String dangqianchuo = huoquDangqianShijian();

        shijianGeshi = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = new Date();

        try {

            date = shijianGeshi.parse(dangqianchuo);

        } catch (ParseException e) {

            e.printStackTrace();

        }

        return String.valueOf(date.getTime());

    }

}