package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import defpackage.p66;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class BasePendingResult<R extends p66> {
    public static final cj j = new cj(3);
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public p66 e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public boolean i = false;

    public BasePendingResult(pg8 pg8) {
        Looper looper;
        if (pg8 != null) {
            looper = pg8.a.g;
        } else {
            looper = Looper.getMainLooper();
        }
        new ph8(looper, 0);
        new WeakReference(pg8);
    }

    public final void a(qh8 qh8) {
        synchronized (this.a) {
            try {
                if (d()) {
                    qh8.a(this.f);
                } else {
                    this.c.add(qh8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract p66 b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.b.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void e(p66 p66) {
        synchronized (this.a) {
            try {
                if (!this.h) {
                    d();
                    z65.m("Results have already been set", !d());
                    z65.m("Result has already been consumed", !this.g);
                    this.e = p66;
                    this.f = p66.d();
                    this.b.countDown();
                    ArrayList arrayList = this.c;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((qh8) arrayList.get(i2)).a(this.f);
                    }
                    arrayList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
