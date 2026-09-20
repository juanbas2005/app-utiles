package defpackage;

/* renamed from: wx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wx0 extends wx3 implements gs2 {
    public final /* synthetic */ gs2 A;
    public final /* synthetic */ int x = 0;
    public final /* synthetic */ yx0 y;
    public final /* synthetic */ je z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wx0(je jeVar, yx0 yx0, gs2 gs2) {
        super(2);
        this.z = jeVar;
        this.y = yx0;
        this.A = gs2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.x;
        vs7 vs7 = vs7.a;
        gs2 gs2 = this.A;
        je jeVar = this.z;
        yx0 yx0 = this.y;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    yt2.e0(866651995);
                    xy0.a(jeVar, yx0.l, gs2, yt2, 0);
                    yt2.r(false);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                ((Number) obj2).intValue();
                yx0.a(jeVar, gs2, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wx0(yx0 yx0, je jeVar, gs2 gs2, int i) {
        super(2);
        this.y = yx0;
        this.z = jeVar;
        this.A = gs2;
    }
}
