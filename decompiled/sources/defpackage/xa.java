package defpackage;

/* renamed from: xa  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xa implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ fw0 x;
    public final /* synthetic */ gs2 y;

    public /* synthetic */ xa(fw0 fw0, gs2 gs2, int i) {
        this.w = 2;
        this.x = fw0;
        this.y = gs2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        gs2 gs2 = this.y;
        fw0 fw0 = this.x;
        yt2 yt2 = (yt2) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case b85.b:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    float f = ((lx1) yt2.k(hf3.c)).w;
                    if (Float.isNaN(f)) {
                        f = 0.0f;
                    }
                    eb.b(8.0f, ((lx1) z65.s(new lx1(8.0f - (f - yd0.e())), new lx1(0.0f), new lx1(8.0f))).w, su0.J(-459506658, new xa(fw0, gs2, 1, (byte) 0), yt2), yt2, 390);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue2 & 1, z2)) {
                    fw0.H(yt2, 0);
                    if (gs2 == null) {
                        yt2.e0(-1102003461);
                    } else {
                        yt2.e0(795735494);
                        gs2.H(yt2, 0);
                    }
                    yt2.r(false);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                num.getClass();
                pv8.f(fw0, gs2, yt2, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ xa(fw0 fw0, gs2 gs2, int i, byte b) {
        this.w = i;
        this.x = fw0;
        this.y = gs2;
    }
}
