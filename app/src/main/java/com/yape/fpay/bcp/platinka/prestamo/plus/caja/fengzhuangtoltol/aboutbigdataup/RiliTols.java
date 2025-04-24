package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.text.TextUtils;

import androidx.annotation.RequiresApi;

import java.util.Calendar;
import java.util.TimeZone;

public class RiliTols {
    private static String RIZHIDIZHI = "content://com.android.calendar/calendars";
    private static String RIZHISHIJIANDIZHI = "content://com.android.calendar/events";
    private static String RIZHITIXINGDIZHI = "content://com.android.calendar/reminders";

    private static String RIZHIMINGCHENG = "boohee";
    private static String RIZHIZHANGHAO = "BOOHEE@boohee.com";
    private static String RIZHIZHANGHAOLEIXING = "com.android.boohee";
    private static String RIZHIXIANSHIMING = "BOOHEE账户";

    /**
     * 检查是否已经添加了日历账户，如果没有添加先添加一个日历账户再查询
     * 获取账户成功返回账户id，否则返回-1
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    private static int shiFouTianjiaToRili(Context chiyouZhe) {
        int jiuId = shiFouCunzaiZhanghao(chiyouZhe);
        if (jiuId >= 0) {
            return jiuId;
        } else {
            long tianjiaId = tianjiaRiliZhanghao(chiyouZhe);
            if (tianjiaId >= 0) {
                return shiFouCunzaiZhanghao(chiyouZhe);
            } else {
                return -1;
            }
        }
    }

    /**
     * 检查是否存在现有账户，存在则返回账户id，否则返回-1
     */
    @SuppressLint("Range")
    private static int shiFouCunzaiZhanghao(Context chiyouZhe) {
        Cursor rizhiyouBiao = chiyouZhe.getContentResolver().query(Uri.parse(RIZHIDIZHI), null, null, null, null);
        try {
            if (rizhiyouBiao == null) { //查询返回空值
                return -1;
            }
            int shumu = rizhiyouBiao.getCount();
            if (shumu > 0) { //存在现有账户，取第一个账户的id返回
                rizhiyouBiao.moveToFirst();
                return rizhiyouBiao.getInt(rizhiyouBiao.getColumnIndex(CalendarContract.Calendars._ID));
            } else {
                return -1;
            }
        } finally {
            if (rizhiyouBiao != null) {
                rizhiyouBiao.close();
            }
        }
    }

    /**
     * 添加日历账户，账户创建成功则返回账户id，否则返回-1
     */

    private static long tianjiaRiliZhanghao(Context chiyouzhe) {
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues value = new ContentValues();
        value.put(CalendarContract.Calendars.NAME, RIZHIMINGCHENG);
        value.put(CalendarContract.Calendars.ACCOUNT_NAME, RIZHIZHANGHAO);
        value.put(CalendarContract.Calendars.ACCOUNT_TYPE, RIZHIZHANGHAOLEIXING);
        value.put(CalendarContract.Calendars.CALENDAR_DISPLAY_NAME, RIZHIXIANSHIMING);
        value.put(CalendarContract.Calendars.VISIBLE, 1);
        value.put(CalendarContract.Calendars.CALENDAR_COLOR, Color.BLUE);
        value.put(CalendarContract.Calendars.CALENDAR_ACCESS_LEVEL, CalendarContract.Calendars.CAL_ACCESS_OWNER);
        value.put(CalendarContract.Calendars.SYNC_EVENTS, 1);
        value.put(CalendarContract.Calendars.CALENDAR_TIME_ZONE, timeZone.getID());
        value.put(CalendarContract.Calendars.OWNER_ACCOUNT, RIZHIZHANGHAO);
        value.put(CalendarContract.Calendars.CAN_ORGANIZER_RESPOND, 0);

        Uri calendarUri = Uri.parse(RIZHIDIZHI);
        calendarUri = calendarUri.buildUpon()
                .appendQueryParameter(CalendarContract.CALLER_IS_SYNCADAPTER, "true")
                .appendQueryParameter(CalendarContract.Calendars.ACCOUNT_NAME, RIZHIZHANGHAO)
                .appendQueryParameter(CalendarContract.Calendars.ACCOUNT_TYPE, RIZHIZHANGHAOLEIXING)
                .build();

        Uri result = chiyouzhe.getContentResolver().insert(calendarUri, value);
        long id = result == null ? -1 : ContentUris.parseId(result);
        return id;
    }

    /**
     * 添加日历事件
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void tainJaiShijian(Context chiyouzhe, String rilibaioti, String rilimiaoshu, long tixingshijian, int yujitianshu) {
        if (chiyouzhe == null) {
            return;
        }
        int calId = shiFouTianjiaToRili(chiyouzhe); //获取日历账户的id
        if (calId < 0) { //获取账户id失败直接返回，添加日历事件失败
            return;
        }

        //添加日历事件
        Calendar rili = Calendar.getInstance();
        rili.setTimeInMillis(tixingshijian);//设置开始时间
        long kaishishijian = rili.getTime().getTime();
        rili.setTimeInMillis(kaishishijian + 10 * 60 * 1000);//设置终止时间，开始时间加10分钟
        long jieshushijian = rili.getTime().getTime();
        ContentValues event = new ContentValues();
        event.put("title", rilibaioti);
        event.put("description", rilimiaoshu);
        event.put("calendar_id", calId); //插入账户的id
        event.put(CalendarContract.Events.DTSTART, kaishishijian);
        event.put(CalendarContract.Events.DTEND, jieshushijian);
        event.put(CalendarContract.Events.HAS_ALARM, 1);//设置有闹钟提醒
        event.put(CalendarContract.Events.EVENT_TIMEZONE, "Asia/Shanghai");//这个是时区，必须有
        Uri newEvent = chiyouzhe.getContentResolver().insert(Uri.parse(RIZHISHIJIANDIZHI), event); //添加事件
        if (newEvent == null) { //添加日历事件失败直接返回
            return;
        }

        //事件提醒的设定
        ContentValues tixingha = new ContentValues();
        tixingha.put(CalendarContract.Reminders.EVENT_ID, ContentUris.parseId(newEvent));
        tixingha.put(CalendarContract.Reminders.MINUTES, 0);// 提前previousDate天有提醒
        tixingha.put(CalendarContract.Reminders.METHOD, CalendarContract.Reminders.METHOD_ALERT);
        Uri uri = chiyouzhe.getContentResolver().insert(Uri.parse(RIZHITIXINGDIZHI), tixingha);
        if (uri == null) { //添加事件提醒失败直接返回
            return;
        }
    }

    /**
     * 删除日历事件
     */
    public static void shanChuRiliTiaomu(Context zhiyouzhe, String biaoti) {
        if (zhiyouzhe == null) {
            return;
        }
        Cursor shijianYoubiao = zhiyouzhe.getContentResolver().query(Uri.parse(RIZHISHIJIANDIZHI), null, null, null, null);
        try {
            if (shijianYoubiao == null) { //查询返回空值
                return;
            }
            if (shijianYoubiao.getCount() > 0) {
                //遍历所有事件，找到title跟需要查询的title一样的项
                for (shijianYoubiao.moveToFirst(); !shijianYoubiao.isAfterLast(); shijianYoubiao.moveToNext()) {
                    @SuppressLint("Range") String eventTitle = shijianYoubiao.getString(shijianYoubiao.getColumnIndex("title"));
                    if (!TextUtils.isEmpty(biaoti) && biaoti.equals(eventTitle)) {
                        @SuppressLint("Range") int id = shijianYoubiao.getInt(shijianYoubiao.getColumnIndex(CalendarContract.Calendars._ID));//取得id
                        Uri sahnchuUriZhixiang = ContentUris.withAppendedId(Uri.parse(RIZHISHIJIANDIZHI), id);
                        int hangShu = zhiyouzhe.getContentResolver().delete(sahnchuUriZhixiang, null, null);
                        if (hangShu == -1) { //事件删除失败
                            return;
                        }
                    }
                }
            }
        } finally {
            if (shijianYoubiao != null) {
                shijianYoubiao.close();
            }
        }
    }
}
