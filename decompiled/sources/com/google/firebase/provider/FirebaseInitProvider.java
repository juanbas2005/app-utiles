package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebaseInitProvider extends ContentProvider {
    public static final o10 w = new o10(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    public static final AtomicBoolean x = new AtomicBoolean(false);

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        z65.l("FirebaseInitProvider ProviderInfo cannot be null.", providerInfo);
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
        } else {
            h.s("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        AtomicBoolean atomicBoolean = x;
        try {
            atomicBoolean.set(true);
            if (oe2.f(getContext()) == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            return false;
        } finally {
            atomicBoolean.set(false);
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
