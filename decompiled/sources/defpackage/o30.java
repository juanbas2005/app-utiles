package defpackage;

/* renamed from: o30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o30 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ cu4 x;

    public /* synthetic */ o30(cu4 cu4, int i) {
        this.w = i;
        this.x = cu4;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.w;
        vs7 vs7 = vs7.a;
        cu4 cu4 = this.x;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case b85.b:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    cu4.a(0, yt2);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    cu4.a(0, yt2);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt2.V(intValue & 1, z3)) {
                    cu4.a(0, yt2);
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }
}
