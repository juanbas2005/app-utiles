package defpackage;

/* renamed from: q74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q74 extends r74 {
    public final void a(long j, Object obj) {
        r2 r2Var = (r2) ((pf3) st7.c.i(j, obj));
        if (r2Var.w) {
            r2Var.w = false;
        }
    }

    public final void b(Object obj, long j, Object obj2) {
        qt7 qt7 = st7.c;
        pf3 pf3 = (pf3) qt7.i(j, obj);
        pf3 pf32 = (pf3) qt7.i(j, obj2);
        int size = pf3.size();
        int size2 = pf32.size();
        if (size > 0 && size2 > 0) {
            if (!((r2) pf3).w) {
                pf3 = pf3.j(size2 + size);
            }
            pf3.addAll(pf32);
        }
        if (size > 0) {
            pf32 = pf3;
        }
        st7.o(obj, j, pf32);
    }
}
