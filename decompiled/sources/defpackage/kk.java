package defpackage;

/* renamed from: kk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kk extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ lk y;
    public final /* synthetic */ long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk(lk lkVar, long j, int i) {
        super(1);
        this.x = i;
        this.y = lkVar;
        this.z = j;
    }

    public final Object y(Object obj) {
        je2 je2;
        int i = this.x;
        long j = 0;
        long j2 = this.z;
        lk lkVar = this.y;
        switch (i) {
            case b85.b:
                gm7 gm7 = (gm7) obj;
                if (!sg3.e(gm7.b(), lkVar.N.b())) {
                    a37 a37 = (a37) lkVar.N.d.g(gm7.b());
                    if (a37 != null) {
                        j2 = ((we3) a37.getValue()).a;
                    } else {
                        j2 = 0;
                    }
                } else if (!we3.a(lkVar.O, -9223372034707292160L)) {
                    j2 = lkVar.O;
                }
                a37 a372 = (a37) lkVar.N.d.g(gm7.d());
                if (a372 != null) {
                    j = ((we3) a372.getValue()).a;
                }
                bv6 bv6 = (bv6) lkVar.M.getValue();
                if (bv6 == null || (je2 = (je2) bv6.a.H(new we3(j2), new we3(j))) == null) {
                    return kl8.M(0.0f, 400.0f, (Object) null, 5);
                }
                return je2;
            default:
                if (!sg3.e(obj, lkVar.N.b())) {
                    a37 a373 = (a37) lkVar.N.d.g(obj);
                    if (a373 != null) {
                        j = ((we3) a373.getValue()).a;
                    }
                } else if (we3.a(lkVar.O, -9223372034707292160L)) {
                    j = j2;
                } else {
                    j = lkVar.O;
                }
                return new we3(j);
        }
    }
}
