package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Log;

import androidx.exifinterface.media.ExifInterface;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ImageBianxiaoUtil {
//
//    public static Uri pathToUri(Context context, String path) {
//        File file = new File(path);
//        Uri fileUri = null;
//        if (file.exists()) {
//            ContentValues values = new ContentValues();
//            values.put(MediaStore.Images.Media.DATA, file.getAbsolutePath());
//            ContentResolver contentResolver = context.getContentResolver();
//            fileUri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
//        }
//        return fileUri;
//    }


    public static String bittutuimgmapTowenFile(String dirPath, Bitmap bitmap) throws FileNotFoundException {
        File file = new File(dirPath);
        FileOutputStream outputStream = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bos);
        try {
            outputStream.flush();
            outputStream.close();
        } catch (IOException ignored) {

        }
        return file.getPath();
    }

    public static Bitmap getBitemap(Context context, Uri uri) {
        Log.d("getb","1");

        try {
            Log.d("getb","2");
            Bitmap bitmap = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, new BitmapFactory.Options());
            if (bitmap != null) {
                ByteArrayOutputStream dd3 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, dd3);
                byte[] bs = dd3.toByteArray();
                try {
                    Log.d("getb","21");
                    dd3.close();
                } catch (IOException e) {
                    Log.d("getb","22");
                    e.printStackTrace();
                }
                if (bs.length < 100 * 1024) {
                    return bitmap;
                } else {
                    bitmap.recycle();
                }
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
            int ow = options.outWidth;
            int oh = options.outHeight;
            int size = 1;
            if (ow > 900 && oh > 900) {
                while (ow / size > 900 && oh / size > 900) {
                    size = size * 2;
                }
            }
            options.inSampleSize = size;
            options.inJustDecodeBounds = false;
            Log.d("getb","23");
            return BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
        } catch (Throwable throwable) {
            Log.d("getb","3");
            throwable.printStackTrace();
        }
        Log.d("getb","4");
        return null;
    }

    public static Bitmap compBianxiaodianress(Bitmap bitmap) {
        ByteArrayOutputStream dqd2 = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, dqd2);
        byte[] bs = dqd2.toByteArray();
        try {
            dqd2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return BitmapFactory.decodeByteArray(bs, 0, bs.length);
    }

    public static int getJtutujjjjpgO(Context context, Uri uri) {
        int o = 0;
        try {
            InputStream is = context.getContentResolver().openInputStream(uri);
            if (is == null) {
                return o;
            }
            if (isJpg(toByteArray(is))) {
                o = getOrientation(toByteArray(is));
            }
        } catch (Throwable ignored) {
        }
        return o;
    }

    public static int getImtutuageO(Context context, Uri uri) {
        int o = 0;
        try {
            InputStream is = context.getContentResolver().openInputStream(uri);
            if (is == null) {
                return o;
            }
            ExifInterface exifInterface = new ExifInterface(is);
            int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, -1);
            switch (attributeInt) {
                case ExifInterface.ORIENTATION_ROTATE_90:
                    o = 90;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_180:
                    o = 180;
                    break;
                case ExifInterface.ORIENTATION_ROTATE_270:
                    o = 270;
                    break;
            }
        } catch (Throwable ignored) {
        }
        return o;
    }

    public static Bitmap rotatingImage(Bitmap bitmap, int o) {
        Matrix matrix = new Matrix();
        matrix.postRotate(o);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private static boolean isJpg(byte[] data) {
        if (data == null || data.length < 3) {
            return false;
        }
        byte[] signatureB = new byte[]{data[0], data[1], data[2]};
        return Arrays.equals(new byte[]{(byte) 0xFF, (byte) 0xD8, (byte) 0xFF}, signatureB);
    }

    private static int getOrientation(byte[] jpeg) {
        if (jpeg == null) {
            return 0;
        }

        int offset = 0;
        int length = 0;

        // ISO/IEC 10918-1:1993(E)
        while (offset + 3 < jpeg.length && (jpeg[offset++] & 0xFF) == 0xFF) {
            int marker = jpeg[offset] & 0xFF;

            // Check if the marker is a padding.
            if (marker == 0xFF) {
                continue;
            }
            offset++;

            // Check if the marker is SOI or TEM.
            if (marker == 0xD8 || marker == 0x01) {
                continue;
            }
            // Check if the marker is EOI or SOS.
            if (marker == 0xD9 || marker == 0xDA) {
                break;
            }

            // Get the length and check if it is reasonable.
            length = pack(jpeg, offset, 2, false);
            if (length < 2 || offset + length > jpeg.length) {
                return 0;
            }

            // Break if the marker is EXIF in APP1.
            if (marker == 0xE1 && length >= 8 && pack(jpeg, offset + 2, 4, false) == 0x45786966 && pack(jpeg, offset + 6, 2, false) == 0) {
                offset += 8;
                length -= 8;
                break;
            }

            // Skip other markers.
            offset += length;
            length = 0;
        }

        // JEITA CP-3451 Exif Version 2.2
        if (length > 8) {
            // Identify the byte order.
            int tag = pack(jpeg, offset, 4, false);
            if (tag != 0x49492A00 && tag != 0x4D4D002A) {
                return 0;
            }
            boolean littleEndian = (tag == 0x49492A00);

            // Get the offset and check if it is reasonable.
            int count = pack(jpeg, offset + 4, 4, littleEndian) + 2;
            if (count < 10 || count > length) {
                return 0;
            }
            offset += count;
            length -= count;

            // Get the count and go through all the elements.
            count = pack(jpeg, offset - 2, 2, littleEndian);
            while (count-- > 0 && length >= 12) {
                // Get the tag and check if it is orientation.
                tag = pack(jpeg, offset, 2, littleEndian);
                if (tag == 0x0112) {
                    int orientation = pack(jpeg, offset + 8, 2, littleEndian);
                    switch (orientation) {
                        case 1:
                            return 0;
                        case 3:
                            return 180;
                        case 6:
                            return 90;
                        case 8:
                            return 270;
                    }
                    return 0;
                }
                offset += 12;
                length -= 12;
            }
        }

        return 0;
    }

    private static int pack(byte[] bytes, int offset, int length, boolean littleEndian) {
        int step = 1;
        if (littleEndian) {
            offset += length - 1;
            step = -1;
        }

        int value = 0;
        while (length-- > 0) {
            value = (value << 8) | (bytes[offset] & 0xFF);
            offset += step;
        }
        return value;
    }

    private static byte[] toByteArray(InputStream is) {
        if (is == null) {
            return new byte[0];
        }

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        int read;
        byte[] data = new byte[4096];

        try {
            while ((read = is.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, read);
            }
        } catch (Exception ignored) {
            return new byte[0];
        } finally {
            try {
                buffer.close();
            } catch (IOException ignored) {
            }
        }

        return buffer.toByteArray();
    }

    public static String getPath(Context context, Boolean isAdd) {
        if (isAdd) {
            return context.getExternalFilesDir(null).getPath() + "/image_" + System.currentTimeMillis() + ".jpg";
        } else {
            return context.getExternalFilesDir(null).getPath() + "/";
        }
    }
}
