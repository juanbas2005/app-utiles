package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class AppMeasurementReceiver extends l88 {
    public rg4 c;

    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new rg4(20, (Object) this);
        }
        rg4 rg4 = this.c;
        rg4.getClass();
        pz8 pz8 = y19.m(context, (iv8) null, (Long) null, (Long) null).B;
        y19.g(pz8);
        if (intent == null) {
            pz8.E.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        pz8.J.b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            pz8.J.a("Starting wakeful intent.");
            ((AppMeasurementReceiver) rg4.x).getClass();
            SparseArray sparseArray = l88.a;
            synchronized (sparseArray) {
                try {
                    int i = l88.b;
                    int i2 = i + 1;
                    l88.b = i2;
                    if (i2 <= 0) {
                        l88.b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i);
                    ComponentName startService = context.startService(className);
                    if (startService != null) {
                        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                        newWakeLock.setReferenceCounted(false);
                        newWakeLock.acquire(60000);
                        sparseArray.put(i, newWakeLock);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            pz8.E.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
