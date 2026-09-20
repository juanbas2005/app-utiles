package defpackage;

import java.util.List;

/* renamed from: z55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z55 extends vg2 {
    public static final z55 d = new vg2(0, 4, 1);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        hn4 hn4 = (hn4) tt2.f(2);
        hn4 hn42 = (hn4) tt2.f(3);
        ky0 ky0 = (ky0) tt2.f(1);
        gn4 gn4 = (gn4) tt2.f(0);
        if (gn4 == null && (gn4 = ky0.p(hn4)) == null) {
            ey0.b("Could not resolve state for movable content");
            ta1.e();
            return;
        }
        gv6 d2 = iv6.d(gn4.a);
        if (jv6.n > 0 || jv6.u(jv6.t + 1) != 1) {
            ey0.a("Check failed");
        }
        int i = jv6.t;
        int i2 = jv6.i;
        int i3 = jv6.j;
        jv6.a(1);
        jv6.R();
        jv6.d();
        jv6 o = d2.o();
        jv6 jv62 = jv6;
        try {
            List B = jb5.B(o, 2, jv62, false, true, true);
            o.e(true);
            jv62.k();
            jv62.j();
            jv62.t = i;
            jv62.i = i2;
            jv62.j = i3;
            t75.b(jv62, B, hn42.c);
        } catch (Throwable th) {
            Throwable th2 = th;
            o.e(false);
            throw th2;
        }
    }
}
