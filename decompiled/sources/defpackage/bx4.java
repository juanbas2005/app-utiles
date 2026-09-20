package defpackage;

/* renamed from: bx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bx4 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gs2 x;

    public /* synthetic */ bx4(int i, gs2 gs2) {
        this.w = i;
        this.x = gs2;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.w;
        vs7 vs7 = vs7.a;
        gs2 gs2 = this.x;
        switch (i) {
            case b85.b:
                bu0 bu0 = (bu0) obj;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    gs2.H(yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                pb0 pb0 = (pb0) obj;
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    gs2.H(yt22, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 2:
                pb0 pb02 = (pb0) obj;
                yt2 yt23 = (yt2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt23.V(intValue3 & 1, z3)) {
                    gs2.H(yt23, 0);
                } else {
                    yt23.Y();
                }
                return vs7;
            default:
                ee7 ee7 = (ee7) obj;
                yt2 yt24 = (yt2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (yt24.V(intValue4 & 1, z4)) {
                    gs2.H(yt24, 0);
                } else {
                    yt24.Y();
                }
                return vs7;
        }
    }
}
