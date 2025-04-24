package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * han 2023.5.11
 */
public class QingqytrCanshuw<K, V> {

    private Map<K, V> casnhu = new HashMap<>();

    private Map<String, String> toubu = new HashMap<>();

    private boolean youJieSenjs;

    private JSONObject jieSenCanshu = null;

    private JSONArray jieSenArrayCanshu = null;

    public QingqytrCanshuw() {
        this(false);
    }

    public QingqytrCanshuw(boolean youJieSenjs) {
        this.youJieSenjs = youJieSenjs;
    }

    public void addParams(K key, V value) {
        casnhu.put(key, value);
    }

    public void addParams(Map<K, V> params){
        Iterator<Map.Entry<K, V>> it = params.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) it.next();
            this.casnhu.put(entry.getKey(), entry.getValue());
        }
    }

    public void addHeader(String key, String value) {
        toubu.put(key, value);
    }

    public void setToubu(Map<String, String> toubu) {
        this.toubu.putAll(toubu);
    }

    public void setCookie(String cookie){
//        header.put("Cookie", "JSESSIONID=" + cookie);
        toubu.put("Cookie", "APP_SERVICE_SESSION=" + cookie);
    }

    public Map<String, String> getToubu() {
        return this.toubu;
    }

    public Map<K, V> getCasnhu() {
        return this.casnhu;
    }

    public boolean hasJson() {
        return this.youJieSenjs || jieSenCanshu != null || jieSenArrayCanshu != null;
    }

    public void setJieSenCanshu(JSONObject params) {
        this.jieSenCanshu = params;
    }

    public JSONObject getJieSenCanshu(){
//        return jsonParams == null ? new JSONObject(params) : jsonParams;
        return jieSenCanshu;
    }

    public void setJieSenArrayCanshu(JSONArray params){
        this.jieSenArrayCanshu = params;
    }

    public JSONArray getJieSenArrayCanshu(){
//        return jsonArrayParams == null ? new JSONArray() : jsonArrayParams;
        return jieSenArrayCanshu;
    }
}
