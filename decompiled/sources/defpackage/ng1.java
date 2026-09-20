package defpackage;

/* renamed from: ng1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ng1 implements gs2 {
    public final /* synthetic */ fw0 A;
    public final /* synthetic */ int w;
    public final /* synthetic */ ik2 x;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ ng1(ik2 ik2, gs2 gs2, boolean z2, fw0 fw0, int i) {
        this.w = i;
        this.x = ik2;
        this.y = gs2;
        this.z = z2;
        this.A = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = this.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                vs7 vs72 = vs7;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    float f = ((lx1) yt2.k(hf3.c)).w;
                    if (Float.isNaN(f)) {
                        f = 0.0f;
                    }
                    float e = f - yd0.e();
                    float f2 = qg1.b;
                    float f3 = qg1.c;
                    eb.b(f2, ((lx1) z65.s(new lx1(f3 - e), new lx1(0.0f), new lx1(f3))).w, su0.J(-1980163584, new ng1(this.x, this.y, this.z, this.A, 1), yt2), yt2, 390);
                } else {
                    yt2.Y();
                }
                return vs72;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt22.V(intValue2 & 1, z3)) {
                    ik2 ik2 = this.x;
                    boolean i2 = yt22.i(ik2);
                    gs2 gs2 = this.y;
                    boolean g = i2 | yt22.g(gs2);
                    boolean z6 = this.z;
                    boolean h = g | yt22.h(z6);
                    Object Q = yt22.Q();
                    d63 d63 = ay0.a;
                    if (h || Q == d63) {
                        Q = new og1(ik2, gs2, z6);
                        yt22.o0(Q);
                    }
                    jl4 jl4 = jl4.w;
                    ml4 U = t49.U(jl4, (vr2) Q);
                    i80 i80 = xb4.y;
                    lh4 d = mb0.d(i80, false);
                    int hashCode = Long.hashCode(yt22.T);
                    vf5 m = yt22.m();
                    ml4 E = gw8.E(yt22, U);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt22, d);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt22, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt22, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt22, ceVar);
                    vs7 vs73 = vs7;
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt22, E);
                    this.A.H(yt22, 0);
                    yt22.r(true);
                    boolean h2 = yt22.h(z6) | yt22.i(ik2);
                    Object Q2 = yt22.Q();
                    if (h2 || Q2 == d63) {
                        z4 = false;
                        Q2 = new pg1(0, ik2, z6);
                        yt22.o0(Q2);
                    } else {
                        z4 = false;
                    }
                    ml4 U2 = t49.U(jl4, (vr2) Q2);
                    lh4 d2 = mb0.d(i80, z4);
                    int hashCode2 = Long.hashCode(yt22.T);
                    vf5 m2 = yt22.m();
                    ml4 E2 = gw8.E(yt22, U2);
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(ckVar, yt22, d2);
                    g75.Q(ckVar2, yt22, m2);
                    f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                    g75.Q(ckVar4, yt22, E2);
                    if (gs2 == null) {
                        yt22.e0(39777878);
                        z5 = false;
                    } else {
                        z5 = false;
                        yt22.e0(1802398475);
                        gs2.H(yt22, 0);
                    }
                    yt22.r(z5);
                    yt22.r(true);
                    return vs73;
                }
                vs7 vs74 = vs7;
                yt22.Y();
                return vs74;
        }
    }
}
