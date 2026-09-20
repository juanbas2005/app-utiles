package defpackage;

import android.os.Handler;

/* renamed from: xq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xq8 {
    public static volatile ph8 d;
    public final a39 a;
    public final nt2 b;
    public volatile long c;

    public xq8(a39 a39) {
        z65.k(a39);
        this.a = a39;
        this.b = new nt2(this, false, a39, 19);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            a39 a39 = this.a;
            a39.Q().getClass();
            this.c = System.currentTimeMillis();
            if (!d().postDelayed(this.b, j)) {
                a39.G().B.b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final void c() {
        this.c = 0;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        ph8 ph8;
        if (d != null) {
            return d;
        }
        synchronized (xq8.class) {
            try {
                if (d == null) {
                    d = new ph8(this.a.o0().getMainLooper(), 2);
                }
                ph8 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ph8;
    }
}
