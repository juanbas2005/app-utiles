package defpackage;

/* renamed from: ab  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ab implements gs2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ fw0 D;
    public final /* synthetic */ gs2 w;
    public final /* synthetic */ gs2 x;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ long z;

    public /* synthetic */ ab(gs2 gs2, gs2 gs22, gs2 gs23, long j, long j2, long j3, long j4, fw0 fw0) {
        this.w = gs2;
        this.x = gs22;
        this.y = gs23;
        this.z = j;
        this.A = j2;
        this.B = j3;
        this.C = j4;
        this.D = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        float f;
        vy0 vy0;
        boolean z3;
        boolean z4;
        tg7 a;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            ed5 ed5 = rm5.a;
            if (((Boolean) ed5.getValue()).booleanValue()) {
                f = 20.0f;
            } else {
                f = 24.0f;
            }
            ml4 J = x91.J(jl4.w, new pa5(f, f, f, f));
            au0 a2 = zt0.a(wr.c, xb4.K, yt2, 0);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, J);
            ux0.d.getClass();
            vy0 vy02 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy02);
            } else {
                yt2.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt2, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt2, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt2, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt2, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt2, E);
            gs2 gs2 = this.w;
            if (gs2 == null) {
                yt2.e0(346092326);
                yt2.r(false);
                z3 = false;
                vy0 = vy02;
            } else {
                yt2.e0(346092327);
                vy0 = vy02;
                t49.c(b81.g(this.z, j41.a), su0.J(-1128150638, new sa(1, gs2), yt2), yt2, 56);
                z3 = false;
                yt2.r(false);
            }
            gs2 gs22 = this.x;
            if (gs22 == null) {
                yt2.e0(346408309);
                yt2.r(z3);
                z4 = z3;
            } else {
                yt2.e0(346408310);
                if (((Boolean) ed5.getValue()).booleanValue()) {
                    yt2.e0(1812109189);
                    a = tg7.a(((zg4) yt2.k(ch4.b)).b.f, 0, ya5.k(20), (am2) null, (ea7) null, 0, ya5.k(26), (dk5) null, (m64) null, 16646141);
                    z4 = false;
                    yt2.r(false);
                } else {
                    z4 = false;
                    yt2.e0(1812321322);
                    a = dr7.a(ar7.k0, yt2);
                    yt2.r(false);
                }
                a35.a(this.A, a, su0.J(71284337, new db(gs2, gs22), yt2), yt2, 384);
                yt2.r(z4);
            }
            gs2 gs23 = this.y;
            if (gs23 == null) {
                yt2.e0(347551589);
                yt2.r(z4);
            } else {
                yt2.e0(347551590);
                a35.a(this.B, dr7.a(ar7.m0, yt2), su0.J(705583346, new sa(z4 ? 1 : 0, gs23), yt2), yt2, 384);
                yt2.r(z4);
            }
            f23 f23 = new f23(xb4.M);
            lh4 d = mb0.d(xb4.y, z4);
            int hashCode2 = Long.hashCode(yt2.T);
            vf5 m2 = yt2.m();
            ml4 E2 = gw8.E(yt2, f23);
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(ckVar, yt2, d);
            g75.Q(ckVar2, yt2, m2);
            f21.s(hashCode2, yt2, ckVar3, yt2, ceVar);
            g75.Q(ckVar4, yt2, E2);
            yt2 yt22 = yt2;
            a35.a(this.C, dr7.a(ar7.g0, yt2), this.D, yt22, 0);
            yt2 yt23 = yt22;
            yt23.r(true);
            yt23.r(true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
