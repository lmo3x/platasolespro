package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QingqPeizhisSsf {
    private static QingqPeizhisSsf peichiInst = null;
    private QingqPeizhisSsf(){
        qingqiuTou = new HashMap<>();
        qingqiuZhuji = new ArrayList<>();//requestHost
    }

    private Map<String,String> qingqiuTou;
    private List<String> qingqiuZhuji;

    public static QingqPeizhisSsf getPeichiInst() {
        if (peichiInst == null) {
            synchronized (QingqPeizhisSsf.class) {
                if (peichiInst == null) {
                    peichiInst = new QingqPeizhisSsf();
                }
            }
        }
        return peichiInst;
    }

    public Map getHeader(){
        return qingqiuTou;
    }

    public void setHeader(Map<String,String> header){
        qingqiuTou.clear();
        qingqiuTou.putAll(header);
    }

    public List<String> getHost(){
        return qingqiuZhuji;
    }

    public void setHost(List<String> host){
        qingqiuZhuji.clear();
        qingqiuZhuji.addAll(host);
    }
}
