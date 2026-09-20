package defpackage;

/* renamed from: oh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class oh6 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ th6 x;

    public /* synthetic */ oh6(th6 th6, int i) {
        this.w = i;
        this.x = th6;
    }

    public final Object b() {
        int i = this.w;
        th6 th6 = this.x;
        switch (i) {
            case b85.b:
                return Boolean.valueOf(th6.J);
            default:
                vk2 vk2 = th6.l0;
                if (!vk2.w.J) {
                    return null;
                }
                sk2 a1 = vk2.a1();
                int ordinal = a1.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    if (a1.a()) {
                        return vk2.Y0((dy3) null);
                    }
                    vk2 g = ((lk2) ((je) rc9.P0(vk2)).getFocusOwner()).g();
                    if (g != null) {
                        return g.Y0(rc9.N0(vk2));
                    }
                    return null;
                } else if (ordinal == 3) {
                    return null;
                } else {
                    h.c();
                    return null;
                }
        }
    }
}
