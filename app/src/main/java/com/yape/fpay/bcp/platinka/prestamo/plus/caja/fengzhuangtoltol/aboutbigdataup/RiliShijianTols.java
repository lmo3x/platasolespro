package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji.MyJichuAplica;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.RiliCnlderModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiliShijianTols {
    private static String RILISHIJIAN = "content://com.android.calendar/events";
    //获取日历类信息
    public static List<RiliCnlderModel> naRiliXinxi() {
        String kaishiShijian = "";
        String jieshuShijian = "";
        String shijianBiaoti = "";
        String miaoshu = "";
        String weizhi = "";
        List<RiliCnlderModel> riliList = new ArrayList<>();
        Cursor shijianYoubiao = MyJichuAplica.getInstance().getContentResolver().query(Uri.parse(RILISHIJIAN), null,
                null, null, null);
        while (shijianYoubiao.moveToNext()) {
            RiliCnlderModel rili = new RiliCnlderModel();
            shijianBiaoti = shijianYoubiao.getString(shijianYoubiao.getColumnIndex("title"));
            miaoshu = shijianYoubiao.getString(shijianYoubiao.getColumnIndex("description"));
            weizhi = shijianYoubiao.getString(shijianYoubiao.getColumnIndex("eventLocation"));
            String dtstart = shijianYoubiao.getString(shijianYoubiao.getColumnIndex("dtstart"));
            if (!TextUtils.isEmpty(dtstart)) {
                kaishiShijian = shijianChuoToZifuchuan(Long.parseLong(dtstart));
            }
            String rilitengddd = shijianYoubiao.getString(shijianYoubiao.getColumnIndex("dtend"));
            if (!TextUtils.isEmpty(rilitengddd)) {
                jieshuShijian = shijianChuoToZifuchuan(Long.parseLong(rilitengddd));
            }
            try {
                rili.perfectBornChainBrunch = shijianBiaoti;
                rili.hugeEagleFavouriteHersInstitution = miaoshu;
                rili.angryBlindBoneGallery = kaishiShijian;
                rili.ableEachFan = jieshuShijian;
                riliList.add(rili);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return riliList;
    }


    /**
     * 时间戳转换为字符串
     *
     * @param shijianChuo:时间戳
     * @return
     */
    private static String shijianChuoToZifuchuan(long shijianChuo) {
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat shijianGeshihua = new SimpleDateFormat(format);
        return shijianGeshihua.format(new Date(shijianChuo));
    }
}
