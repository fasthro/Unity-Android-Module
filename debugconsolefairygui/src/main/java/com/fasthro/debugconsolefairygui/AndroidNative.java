package com.fasthro.debugconsolefairygui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;

public class AndroidNative {

    /**
     * android 复制功能
     * */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @SuppressLint("NewApi")
    public static void Copy(final Context activity, final String content) throws Exception {
        ClipboardManager clipboard = (ClipboardManager) activity.getSystemService(Activity.CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("text", content);
        clipboard.setPrimaryClip(clipData);
    }

}
