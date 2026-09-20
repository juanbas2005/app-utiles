package defpackage;

/* renamed from: l65  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l65 extends vg2 {
    public static final l65 d = new vg2(0, 3, 1);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        hv2 hv2;
        gv6 gv6 = (gv6) tt2.f(1);
        st2 st2 = (st2) tt2.f(0);
        kg2 kg2 = (kg2) tt2.f(2);
        jv6 o = gv6.o();
        if (f75 != null) {
            try {
                hv2 = new hv2(26, (Object) f75, (Object) jv6);
            } catch (Throwable th) {
                o.e(false);
                throw th;
            }
        } else {
            hv2 = null;
        }
        if (!kg2.h.r()) {
            ey0.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        kg2.g.q(krVar, o, u36, hv2);
        o.e(true);
        jv6.d();
        st2.getClass();
        jv6.A(gv6, gv6.f(st2));
        jv6.k();
    }
}
