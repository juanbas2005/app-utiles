package defpackage;

/* renamed from: a75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a75 extends vg2 {
    public static final a75 d = new vg2(1, 0, 2);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        int e = tt2.e(0);
        int i = jv6.v;
        int P = jv6.P(jv6.b, jv6.r(i));
        int g = jv6.g(jv6.b, jv6.r(i + 1));
        for (int max = Math.max(P, g - e); max < g; max++) {
            Object obj = jv6.c[jv6.h(max)];
            if (obj instanceof cu2) {
                u36.e((cu2) obj);
            } else if (obj instanceof yx5) {
                ((yx5) obj).c();
            }
        }
        if (e <= 0) {
            ey0.a("Check failed");
        }
        int i2 = jv6.v;
        int P2 = jv6.P(jv6.b, jv6.r(i2));
        int g2 = jv6.g(jv6.b, jv6.r(i2 + 1)) - e;
        if (g2 < P2) {
            ey0.a("Check failed");
        }
        jv6.L(g2, e, i2);
        int i3 = jv6.i;
        if (i3 >= P2) {
            jv6.i = i3 - e;
        }
    }
}
