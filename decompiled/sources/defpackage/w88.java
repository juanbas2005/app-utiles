package defpackage;

/* renamed from: w88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class w88 {
    public static final pa5 a;

    static {
        float f = b98.c;
        a = new pa5(0.0f, f, 0.0f, f);
    }

    public static v88 a(int i, yt2 yt2) {
        qt0 qt0 = ((zg4) yt2.k(ch4.b)).a;
        v88 v88 = qt0.j0;
        if (v88 == null) {
            yt2.e0(1297532678);
            rt0 rt0 = pd8.m;
            long e = st0.e(rt0, yt2);
            long a2 = st0.a(qt0, st0.e(rt0, yt2));
            rt0 rt02 = hj8.i;
            v88 v882 = new v88(e, a2, st0.e(rt02, yt2), jt0.b(0.32f, st0.e(h49.A, yt2)), st0.a(qt0, st0.e(rt02, yt2)));
            qt0.j0 = v882;
            yt2.r(false);
            return v882;
        }
        yt2.e0(1297515721);
        yt2.r(false);
        return v88;
    }
}
