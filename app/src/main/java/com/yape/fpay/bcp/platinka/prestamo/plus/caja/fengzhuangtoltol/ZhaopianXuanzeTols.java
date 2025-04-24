// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

/*
 * Copyright (C) 2007-2008 OpenIntents.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file was modified by the Flutter authors from the following original file:
 * https://raw.githubusercontent.com/iPaulPro/aFileChooser/master/aFileChooser/src/com/ipaulpro/afilechooser/utils/FileUtils.java
 */

package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;


public class ZhaopianXuanzeTols {

    private static String huoquTupianExtension(Context context, Uri uriImage) {
        String extension;

        try {
            if (uriImage.getScheme().equals(ContentResolver.SCHEME_CONTENT)) {
                final MimeTypeMap mime = MimeTypeMap.getSingleton();
                extension = mime.getExtensionFromMimeType(context.getContentResolver().getType(uriImage));
            } else {
                extension = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uriImage.getPath())).toString());
            }
        } catch (Exception e) {
            return null;
        }

        if (extension == null || extension.isEmpty()) {
            return null;
        }

        return "." + extension;
    }

    /**
     * @return name of the image provided by ContentResolver; this may be null.
     */
    private static String getImageName(Context context, Uri uriImage) {
        try (Cursor cursor = queryImageName(context, uriImage)) {
            if (cursor == null || !cursor.moveToFirst() || cursor.getColumnCount() < 1) return null;
            return cursor.getString(0);
        }
    }

    private static Cursor queryImageName(Context context, Uri uriImage) {
        return context.getContentResolver().query(uriImage, new String[]{MediaStore.MediaColumns.DISPLAY_NAME}, null, null, null);
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        final byte[] buffer = new byte[4 * 1024];
        int bytesRead;
        while ((bytesRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytesRead);
        }
        out.flush();
    }

    private static String getBaseName(String fileName) {
        // Basename is everything before the last '.'.
        return fileName.substring(0, fileName.lastIndexOf('.'));
    }


    public static String getPathFromUri(final Context context, final Uri uri) {
        try (InputStream inputStream = context.getContentResolver().openInputStream(uri)) {
            String uuid = UUID.randomUUID().toString();
            File targetDirectory = new File(context.getCacheDir(), uuid);
            targetDirectory.mkdir();
            targetDirectory.deleteOnExit();
            String fileName = getImageName(context, uri);
            String extension = huoquTupianExtension(context, uri);

            Log.d("getPathFroi", "" + fileName);
            Log.d("getPathFroi", "" + extension);

            try {
                if (fileName == null) {
                    if (extension == null) extension = ".jpg";
                    fileName = "image_picker" + extension;
                } else if (extension != null) {
                    fileName = getBaseName(fileName) + extension;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            File file = new File(targetDirectory, fileName);
            try (OutputStream outputStream = new FileOutputStream(file)) {
                copy(inputStream, outputStream);
                return file.getPath();
            }
        } catch (IOException e) {
            return null;
        } catch (SecurityException e) {
            return null;
        }
    }
}
