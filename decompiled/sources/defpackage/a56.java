package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: a56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a56 {
    public final double a;
    public final double b;
    public final long c;
    public final long d = SystemClock.elapsedRealtime();
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final o9 h;
    public final hv2 i;
    public int j;
    public long k;

    public a56(o9 o9Var, bo6 bo6, hv2 hv2) {
        double d2 = bo6.d;
        double d3 = bo6.e;
        this.a = d2;
        this.b = d3;
        this.c = ((long) bo6.f) * 1000;
        this.h = o9Var;
        this.i = hv2;
        int i2 = (int) d2;
        this.e = i2;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0;
    }

    public final int a() {
        int i2;
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i3 = this.j;
        if (size == this.e) {
            i2 = Math.min(100, i3 + currentTimeMillis);
        } else {
            i2 = Math.max(0, i3 - currentTimeMillis);
        }
        if (this.j != i2) {
            this.j = i2;
            this.k = System.currentTimeMillis();
        }
        return i2;
    }

    public final void b(dz dzVar, xb7 xb7) {
        boolean z;
        String str = "Sending report through Google DataTransport: " + dzVar.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, (Throwable) null);
        }
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z = true;
        } else {
            z = false;
        }
        this.h.K(new n00(dzVar.a, to5.y, (h10) null), new y46(this, xb7, z, dzVar));
    }
}
