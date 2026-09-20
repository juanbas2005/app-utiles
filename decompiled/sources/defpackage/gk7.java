package defpackage;

import java.util.WeakHashMap;

/* renamed from: gk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gk7 {
    public static final pa5 a = new pa5(0.0f, 0.0f, 0.0f, 0.0f);
    public static final float b = 64.0f;

    public static fk7 a(qt0 qt0) {
        fk7 fk7 = qt0.b0;
        if (fk7 != null) {
            return fk7;
        }
        fk7 fk72 = new fk7(st0.d(qt0, h03.a), st0.d(qt0, h03.c), st0.d(qt0, h03.b), st0.d(qt0, h03.e), st0.d(qt0, h03.f), st0.d(qt0, h03.d));
        qt0.b0 = fk72;
        return fk72;
    }

    public static e64 b(yt2 yt2) {
        WeakHashMap weakHashMap = ib8.w;
        return new e64(new ss7(n63.h(yt2).g, n63.h(yt2).b), h75.g | 16);
    }

    public static fk7 c(long j, yt2 yt2) {
        long j2 = jt0.g;
        return a(((zg4) yt2.k(ch4.b)).a).a(j, j2, j2, j2, j2, j2);
    }
}
