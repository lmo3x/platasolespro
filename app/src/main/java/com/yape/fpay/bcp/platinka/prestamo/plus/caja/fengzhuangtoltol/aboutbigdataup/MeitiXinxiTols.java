package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.aboutbigdataup;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.ContactsContract;
import android.provider.MediaStore;

public class MeitiXinxiTols {


    //GET image
    public static int gaoDaoNeicunTupian(Activity aaacccc) {
        int shuLiang=0;
        try {
            String[] meiTishuzu = {MediaStore.Images.Media.DATA};
            shuLiang = jisuanZongshu(MediaStore.Images.Media.INTERNAL_CONTENT_URI, meiTishuzu,aaacccc);
        }catch (Exception e){

        }

        return shuLiang;
    }
    //GET image
    public static int gaoDaoNeicunTupian2(Activity aaacccccc) {
        int shuliang=0;
        try {
            String[] shujuShuzu = {MediaStore.Images.Media.DATA};
            shuliang = jisuanZongshu(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, shujuShuzu,aaacccccc);
        }catch (Exception e){

        }

        return shuliang;
    }

    //GET image count
    public static int jisuanZongshu(Uri dizhi, String[] shuju, Activity aacccc) {
        //因为去掉权限 所以不要了
//        if (ActivityCompat.checkSelfPermission(aacccc, Manifest.permission.READ_EXTERNAL_STORAGE)
//                != PackageManager.PERMISSION_GRANTED) {
//            return 0;
//        }
        int shuliang = 0;
        ContentResolver jiejueZhe = aacccc.getContentResolver();
        Cursor youbiaoKachi = jiejueZhe.query(dizhi, shuju, null, null, null);
        if (youbiaoKachi != null) {
            shuliang = youbiaoKachi.getCount();
            youbiaoKachi.close();
        }
        return shuliang;
    }

    //GET video
    public static int naDaoNeibuShipin(Activity activity) {
        int count=0;
        try {
            String[] projection = {MediaStore.Video.Media.DATA};
            count = jisuanZongshu(MediaStore.Video.Media.INTERNAL_CONTENT_URI, projection,activity);
        }catch (Exception e){

        }

        return count;
    }
    public static int getVideoExternal(Activity activity) {
        int count=0;
        try{
            String[] projection = {MediaStore.Video.Media.DATA};
            count = jisuanZongshu(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, projection,activity);
        }catch (Exception e){

        }

        return count;
    }


    //GET down files count
    public static int jiSuanXiazaiWenjianShuliang() {

            return -1;

    }
    //GET lianxiren
    public static int huoQuLianxiPeople(Activity accttt) {
        int lianxiRenShuliang=0;
        //解毒
        try{
            Cursor youbiao =accttt.getContentResolver().query(
                    ContactsContract.Groups.CONTENT_URI,
                    new String[]{
                            ContactsContract.Groups._ID,
                            ContactsContract.Groups.TITLE
                    }, null, null, null
            );
            while (youbiao.moveToNext()) {
                //读取通讯录的姓名
                lianxiRenShuliang = youbiao.getInt(youbiao
                        .getColumnIndex(ContactsContract.Groups._COUNT));//contact_group
            }
            youbiao.close();
        }catch (Exception e){
        }
        return lianxiRenShuliang;
    }
}
