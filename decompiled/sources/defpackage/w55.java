package defpackage;

/* renamed from: w55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w55 extends vg2 {
    public static final w55 d = new vg2(0, 2, 1);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        st2 st2 = (st2) tt2.f(0);
        Object f = tt2.f(1);
        if (f instanceof cu2) {
            cu2 cu2 = (cu2) f;
            u36.e.b(cu2);
            u36.d.a(cu2);
        }
        if (jv6.n != 0) {
            ey0.a("Can only append a slot if not current inserting");
        }
        int i = jv6.i;
        int i2 = jv6.j;
        int c = jv6.c(st2);
        int g = jv6.g(jv6.b, jv6.r(c + 1));
        jv6.i = g;
        jv6.j = g;
        jv6.x(1, c);
        if (i >= g) {
            i++;
            i2++;
        }
        jv6.c[g] = f;
        jv6.i = i;
        jv6.j = i2;
    }
}
