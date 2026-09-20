package defpackage;

/* renamed from: o67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o67 extends wx3 implements gs2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ p67 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o67(p67 p67, int i) {
        super(2);
        this.x = i;
        this.y = p67;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.x;
        vs7 vs7 = vs7.a;
        p67 p67 = this.y;
        switch (i) {
            case b85.b:
                uy3 uy3 = (uy3) obj;
                p67.a().x = (ky0) obj2;
                return vs7;
            case 1:
                iz3 a = p67.a();
                ((uy3) obj).g0(new ez3(a, (gs2) obj2, a.L));
                return vs7;
            default:
                uy3 uy32 = (uy3) obj;
                p67 p672 = (p67) obj2;
                s67 s67 = p67.a;
                iz3 iz3 = uy32.c0;
                if (iz3 == null) {
                    iz3 = new iz3(uy32, s67);
                    uy32.c0 = iz3;
                }
                p67.b = iz3;
                p67.a().h();
                iz3 a2 = p67.a();
                if (a2.y != s67) {
                    a2.y = s67;
                    a2.i(false);
                    uy3.Z(a2.w, false, 7);
                }
                return vs7;
        }
    }
}
