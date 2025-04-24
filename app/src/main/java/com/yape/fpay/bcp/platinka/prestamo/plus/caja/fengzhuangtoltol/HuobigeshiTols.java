package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class HuobigeshiTols {

    public static String tianjia0houzhui(String neirong) {
        if (neirong.contains(".")) {
            String[] split = neirong.split("\\.");
            if (split[1].length() >= 2) {
                return split[0] + "." + split[1].substring(0, 2);
            } else if (split[1].length() > 0&&split[1].length() < 2) {
                return neirong + "0";
            }
        } else {
            return neirong + ".00";
        }
        return neirong;
    }


    //带千分符 不带小数点
    public static String formatPrice(double price) {

        DecimalFormat df = new DecimalFormat("0");
        String s = df.format(price);

        DecimalFormat formater = new DecimalFormat();
        // keep 2 decimal places
//        formater.setMaximumFractionDigits(2);
        formater.setGroupingSize(3);
//        formater.setRoundingMode(halfUp ? RoundingMode.HALF_UP:RoundingMode.FLOOR);
        return formater.format(s);
    }



    //带千分符 不带小数点  string参数
    public static String FormatNumberQianfenZhijie(String price) {
//        DecimalFormat df = new DecimalFormat("0");
//        String s = df.format(price);

        StringBuffer tmp = new StringBuffer().append(price).reverse();
        String retNum = Pattern.compile("(\\d{3})(?=\\d)").matcher(tmp.toString()).replaceAll("$1,");
        return new StringBuffer().append(retNum).reverse().toString();
    }

    //带千分符 不带小数点  string参数
    public static String FormatNumber(String price) {
        DecimalFormat df = new DecimalFormat("0");
        String s = df.format(price);

        StringBuffer tmp = new StringBuffer().append(s).reverse();
        String retNum = Pattern.compile("(\\d{3})(?=\\d)").matcher(tmp.toString()).replaceAll("$1,");
        return new StringBuffer().append(retNum).reverse().toString();
    }

    //带千分符 不带小数点 double参数
    public static String FormatNumber(double price) {
        DecimalFormat df = new DecimalFormat("0");
        String s = df.format(price);

        StringBuffer tmp = new StringBuffer().append(s).reverse();
        String retNum = Pattern.compile("(\\d{3})(?=\\d)").matcher(tmp.toString()).replaceAll("$1,");
        return new StringBuffer().append(retNum).reverse().toString();
    }

    //带千分符 带小数点 double参数
    public static String FormatNumberWithXiaoshudian(String price) {

        StringBuffer tmp = new StringBuffer().append(price).reverse();
        String retNum = Pattern.compile("(\\d{3})(?=\\d)").matcher(tmp.toString()).replaceAll("$1,");
        return new StringBuffer().append(retNum).reverse().toString();
    }

    public static String FormatNumberWithXiaoshudian(double price) {

        StringBuffer tmp = new StringBuffer().append(price).reverse();
        String retNum = Pattern.compile("(\\d{3})(?=\\d)").matcher(tmp.toString()).replaceAll("$1,");
        return new StringBuffer().append(retNum).reverse().toString();
    }
}
