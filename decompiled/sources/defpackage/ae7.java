package defpackage;

/* renamed from: ae7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ae7 implements gs2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ mm7 D;
    public final /* synthetic */ tg7 E;
    public final /* synthetic */ tg7 F;
    public final /* synthetic */ hs2 G;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ a37 x;
    public final /* synthetic */ yd7 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ ae7(a37 a37, yd7 yd7, boolean z2, boolean z3, boolean z4, boolean z5, mm7 mm7, tg7 tg7, tg7 tg72, hs2 hs2, int i) {
        this.x = a37;
        this.y = yd7;
        this.z = z2;
        this.A = z3;
        this.B = z4;
        this.C = z5;
        this.D = mm7;
        this.E = tg7;
        this.F = tg72;
        this.G = hs2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b /*0*/:
                ((Integer) obj2).getClass();
                int v = b85.v(1);
                a37 a37 = this.x;
                yd7 yd7 = this.y;
                boolean z3 = this.z;
                boolean z4 = this.A;
                boolean z5 = this.B;
                boolean z6 = this.C;
                mm7 mm7 = this.D;
                tg7 tg7 = this.E;
                g75.c(a37, yd7, z3, z4, z5, z6, mm7, tg7, this.F, this.G, (yt2) obj, v);
                return vs7;
            default:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    g75.c(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ ae7(im7 im7, yd7 yd7, boolean z2, boolean z3, boolean z4, boolean z5, mm7 mm7, tg7 tg7, tg7 tg72, hs2 hs2) {
        this.x = im7;
        this.y = yd7;
        this.z = z2;
        this.A = z3;
        this.B = z4;
        this.C = z5;
        this.D = mm7;
        this.E = tg7;
        this.F = tg72;
        this.G = hs2;
    }
}
