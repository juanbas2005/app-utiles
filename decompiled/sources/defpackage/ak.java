package defpackage;

/* renamed from: ak  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ak extends wx3 implements hs2 {
    public final /* synthetic */ fw0 A;
    public final /* synthetic */ yx6 x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ mk z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak(yx6 yx6, Object obj, mk mkVar, fw0 fw0) {
        super(3);
        this.x = yx6;
        this.y = obj;
        this.z = mkVar;
        this.A = fw0;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z3;
        int i;
        xk xkVar = (xk) obj;
        yt2 yt2 = (yt2) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if ((intValue & 8) == 0) {
                z3 = yt2.g(xkVar);
            } else {
                z3 = yt2.i(xkVar);
            }
            if (z3) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            yx6 yx6 = this.x;
            boolean g = yt2.g(yx6);
            Object obj4 = this.y;
            boolean i2 = g | yt2.i(obj4);
            mk mkVar = this.z;
            boolean i3 = i2 | yt2.i(mkVar);
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (i3 || Q == d63) {
                Q = new zj(yx6, obj4, mkVar, 0);
                yt2.o0(Q);
            }
            t49.e(xkVar, (vr2) Q, yt2);
            tp4 tp4 = mkVar.d;
            xkVar.getClass();
            tp4.m(obj4, ((yk) xkVar).a);
            Object Q2 = yt2.Q();
            if (Q2 == d63) {
                Q2 = new Object();
                yt2.o0(Q2);
            }
            this.A.C((fk) Q2, obj4, yt2, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
