package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AppMeasurementSdk {
    public final yw8 a;

    public AppMeasurementSdk(yw8 yw8) {
        this.a = yw8;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return yw8.e(context, (Bundle) null).b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r3.f == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.f.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        android.util.Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r3.c(new defpackage.kv8(r3, r1, 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return;
     */
    public final void a(yu8 yu8) {
        yw8 yw8 = this.a;
        ArrayList arrayList = yw8.c;
        synchronized (arrayList) {
            int i = 0;
            while (i < arrayList.size()) {
                try {
                    if (yu8.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                    i++;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            ww8 ww8 = new ww8(yu8);
            arrayList.add(new Pair(yu8, ww8));
        }
    }

    public void beginAdUnitExposure(String str) {
        yw8 yw8 = this.a;
        yw8.c(new vv8(yw8, str, 0));
    }

    public void endAdUnitExposure(String str) {
        yw8 yw8 = this.a;
        yw8.c(new vv8(yw8, str, 1));
    }

    public long generateEventId() {
        return this.a.g();
    }

    public String getAppInstanceId() {
        xt8 xt8 = new xt8();
        yw8 yw8 = this.a;
        yw8.c(new zv8(yw8, xt8, 1));
        return (String) xt8.e(xt8.b(50), String.class);
    }

    public String getGmpAppId() {
        xt8 xt8 = new xt8();
        yw8 yw8 = this.a;
        yw8.c(new zv8(yw8, xt8, 0));
        return (String) xt8.e(xt8.b(500), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        yw8 yw8 = this.a;
        yw8.c(new mv8(yw8, str, str2, bundle, 1));
    }
}
