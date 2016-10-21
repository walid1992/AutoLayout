package com.walid.sample.utils;

import android.util.Log;

import com.walid.sample.BuildConfig;

/**
 * Author   : walid
 * Data     : 2016-09-15  14:29
 * Describe :
 */
public class Logger {

    private static final String TAG = "haobaobei";

    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, buildMessage(msg));
        }
    }

    public static void d(Object obj) {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, buildMessage(String.valueOf(obj)));
        }
    }

    public static void v(String msg) {
        if (BuildConfig.DEBUG) {
            Log.v(TAG, buildMessage(msg));
        }
    }

    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            Log.i(TAG, buildMessage(msg));
        }
    }

    public static void w(String msg) {
        Log.w(TAG, buildMessage(msg));
    }

    public static void e(String msg) {
        if (BuildConfig.DEBUG) {
            String errorMsg = buildMessage(msg);
            Log.e(TAG, errorMsg);
        }
    }

    private static String buildMessage(String msg) {
        StackTraceElement caller = new Throwable().fillInStackTrace().getStackTrace()[2];
        return "### " + caller.toString() + msg;
    }

}
