package defpackage;

/* renamed from: wj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wj7 {
    public static final float a = 200.0f;

    static {
        pv8.c(16.0f, 8.0f);
    }

    public static ck7 a(yt2 yt2) {
        pa5 pa5 = ak7.a;
        int r0 = ((tp1) yt2.k(xy0.h)).r0(4.0f);
        long a2 = ((k44) ((w98) yt2.k(xy0.v))).a();
        boolean e = yt2.e(r0) | yt2.f(a2);
        Object Q = yt2.Q();
        if (e || Q == ay0.a) {
            Q = new ck7(a2, r0);
            yt2.o0(Q);
        }
        return (ck7) Q;
    }
}
