package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: p91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p91 {
    public final Context a;
    public final ge1 b;
    public final hv2 c = new hv2(22);
    public final long d = System.currentTimeMillis();
    public jz0 e;
    public jz0 f;
    public k91 g;
    public final f83 h;
    public final md2 i;
    public final cc j;
    public final cc k;
    public final h91 l;
    public final q91 m;
    public final ay4 n;
    public final wr0 o;

    public p91(oe2 oe2, f83 f83, q91 q91, ge1 ge1, cc ccVar, cc ccVar2, md2 md2, h91 h91, ay4 ay4, wr0 wr0) {
        this.b = ge1;
        oe2.a();
        this.a = oe2.a;
        this.h = f83;
        this.m = q91;
        this.j = ccVar;
        this.k = ccVar2;
        this.i = md2;
        this.l = h91;
        this.n = ay4;
        this.o = wr0;
    }

    public final void a(z00 z00) {
        wr0.p();
        wr0.p();
        this.e.l();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", (Throwable) null);
        }
        try {
            this.j.m(new m91(this));
            this.g.f();
            if (z00.d().b.a) {
                if (!this.g.d(z00)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", (Throwable) null);
                }
                this.g.g(((xb7) ((AtomicReference) z00.i).get()).a);
                c();
                return;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", (Throwable) null);
            }
            throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
        } catch (Exception e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e2);
            c();
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(z00 z00) {
        Future<?> submit = ((ya1) this.o.x).w.submit(new l91(this, z00, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", (Throwable) null);
        }
        try {
            submit.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e3);
        } catch (TimeoutException e4) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e4);
        }
    }

    public final void c() {
        wr0.p();
        try {
            jz0 jz0 = this.e;
            md2 md2 = (md2) jz0.y;
            md2.getClass();
            if (!new File((File) md2.d, (String) jz0.x).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", (Throwable) null);
            }
        } catch (Exception e2) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e2);
        }
    }
}
