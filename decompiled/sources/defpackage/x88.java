package defpackage;

/* renamed from: x88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x88 {
    public static final pa5 a;
    public static final pa5 b;

    static {
        float f = b98.j;
        float f2 = b98.i;
        a = new pa5(f, f2, f, f2);
        float f3 = b98.k;
        b = new pa5(16.0f, f3, 16.0f, f3);
    }

    public static fw4 a(yt2 yt2) {
        qt0 qt0 = ((zg4) yt2.k(ch4.b)).a;
        fw4 fw4 = qt0.k0;
        if (fw4 != null) {
            return fw4;
        }
        long d = st0.d(qt0, ag8.e);
        long d2 = st0.d(qt0, ag8.g);
        long d3 = st0.d(qt0, ag8.f);
        rt0 rt0 = ag8.h;
        long d4 = st0.d(qt0, rt0);
        rt0 rt02 = ag8.i;
        long j = d;
        fw4 fw42 = new fw4(j, d2, d3, d4, st0.d(qt0, rt02), jt0.b(0.38f, st0.d(qt0, rt0)), jt0.b(0.38f, st0.d(qt0, rt02)));
        qt0.k0 = fw42;
        return fw42;
    }
}
