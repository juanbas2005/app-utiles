package defpackage;

/* renamed from: wy0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wy0 extends wx3 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int x = 0;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wy0(yx0 yx0, ve8 ve8, gs2 gs2) {
        super(2);
        this.z = yx0;
        this.A = ve8;
        this.y = gs2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.x;
        vs7 vs7 = vs7.a;
        gs2 gs2 = this.y;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i) {
            case b85.b:
                ((Number) obj2).intValue();
                xy0.a((p95) obj4, (hj) obj3, gs2, (yt2) obj, b85.v(1));
                return vs7;
            default:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    ((yx0) obj4).a(((ve8) obj3).w, gs2, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wy0(p95 p95, hj hjVar, gs2 gs2, int i) {
        super(2);
        this.z = p95;
        this.A = hjVar;
        this.y = gs2;
    }
}
