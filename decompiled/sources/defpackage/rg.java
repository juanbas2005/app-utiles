package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: rg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rg {
    public static volatile rg c;
    public final xb4 a;
    public boolean b = false;

    public rg() {
        xb4 xb4;
        synchronized (xb4.class) {
            try {
                if (xb4.x == null) {
                    xb4.x = new xb4(0);
                }
                xb4 = xb4.x;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.a = xb4;
    }

    public static rg d() {
        if (c == null) {
            synchronized (rg.class) {
                try {
                    if (c == null) {
                        c = new rg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final void a(String str) {
        if (this.b) {
            this.a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.d("FirebasePerformance", format);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.e("FirebasePerformance", format);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.i("FirebasePerformance", format);
        }
    }

    public final void f(String str) {
        if (this.b) {
            this.a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.w("FirebasePerformance", format);
        }
    }
}
