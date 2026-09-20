package defpackage;

/* renamed from: b65  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b65 extends vg2 {
    public static final b65 d = new vg2(0, 2, 1);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        int i;
        int i2;
        te3 te3 = (te3) tt2.f(0);
        int c = jv6.c((st2) tt2.f(1));
        if (jv6.t >= c) {
            ey0.a("Check failed");
        }
        h75.j(jv6, krVar, c);
        int i3 = jv6.t;
        int i4 = jv6.v;
        while (i4 >= 0 && !jv6.y(i4)) {
            i4 = jv6.G(jv6.b, i4);
        }
        int i5 = i4 + 1;
        int i6 = 0;
        while (i5 < i3) {
            if (jv6.v(i3, i5)) {
                if (jv6.y(i5)) {
                    i6 = 0;
                }
                i5++;
            } else {
                if (jv6.y(i5)) {
                    i2 = 1;
                } else {
                    i2 = jv6.F(i5);
                }
                i6 += i2;
                i5 += jv6.u(i5);
            }
        }
        while (true) {
            i = jv6.t;
            if (i >= c) {
                break;
            } else if (jv6.v(c, i)) {
                int i7 = jv6.t;
                if (i7 < jv6.u && (jv6.b[(jv6.r(i7) * 5) + 1] & 1073741824) != 0) {
                    krVar.c(jv6.E(jv6.t));
                    i6 = 0;
                }
                jv6.R();
            } else {
                i6 += jv6.N();
            }
        }
        if (i != c) {
            ey0.a("Check failed");
        }
        te3.a = i6;
    }
}
