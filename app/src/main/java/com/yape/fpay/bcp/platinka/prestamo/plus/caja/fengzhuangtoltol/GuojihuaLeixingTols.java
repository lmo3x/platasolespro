package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

/**
 * Created by dumingwei on 2018/5/31 0031.
 */
public enum GuojihuaLeixingTols {

    CHINESE("zh"),
    ENGLISH("en"),
    SPANISH("es_ES"),//西班牙
    PERU("es_PE"),//秘鲁
    CHINESE_TW("zh_TW");

    private String yanyu;

    GuojihuaLeixingTols(String yanyu) {
        this.yanyu = yanyu;
    }

    public String getYanyu() {
        return yanyu == null ? "" : yanyu;
    }
}
