package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: zt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zt1 {
    public static final rg c = rg.d();
    public static zt1 d;
    public volatile SharedPreferences a;
    public final ExecutorService b;

    public zt1(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            oe2.c();
            oe2 c2 = oe2.c();
            c2.a();
            return c2.a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized zt1 b() {
        zt1 zt1;
        synchronized (zt1.class) {
            try {
                if (d == null) {
                    d = new zt1(Executors.newSingleThreadExecutor());
                }
                zt1 = d;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return zt1;
    }

    public final synchronized void c(Context context) {
        if (this.a == null && context != null) {
            this.b.execute(new ga(21, (Object) this, (Object) context));
        }
    }

    public final void d(long j, String str) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, j).apply();
    }

    public final void e(String str, double d2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void f(String str, String str2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        SharedPreferences sharedPreferences = this.a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putBoolean(str, z).apply();
    }
}
