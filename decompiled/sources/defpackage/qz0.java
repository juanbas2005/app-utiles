package defpackage;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: qz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qz0 {
    public static final HashMap d = new HashMap();
    public static final or e = new or(1);
    public final Executor a;
    public final e01 b;
    public yb9 c = null;

    public qz0(Executor executor, e01 e01) {
        this.a = executor;
        this.b = e01;
    }

    public static Object a(yb9 yb9) {
        wv2 wv2 = new wv2(8);
        or orVar = e;
        yb9.e(orVar, wv2);
        yb9.d(orVar, wv2);
        yb9.a(orVar, wv2);
        if (!((CountDownLatch) wv2.x).await(5, TimeUnit.SECONDS)) {
            throw new TimeoutException("Task await timed out.");
        } else if (yb9.k()) {
            return yb9.i();
        } else {
            throw new ExecutionException(yb9.h());
        }
    }

    public final synchronized yb9 b() {
        try {
            yb9 yb9 = this.c;
            if (yb9 != null) {
                if (yb9.j() && !this.c.k()) {
                }
            }
            this.c = b35.d(this.a, new oz0(0, this.b));
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return (defpackage.sz0) a(b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return null;
     */
    public final sz0 c() {
        synchronized (this) {
            try {
                yb9 yb9 = this.c;
                if (yb9 != null && yb9.k()) {
                    sz0 sz0 = (sz0) this.c.i();
                    return sz0;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
