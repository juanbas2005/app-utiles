package defpackage;

/* renamed from: y88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class y88 implements gs2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ a37 B;
    public final /* synthetic */ a37 C;
    public final /* synthetic */ a37 D;
    public final /* synthetic */ bd5 E;
    public final /* synthetic */ bd5 F;
    public final /* synthetic */ vr G;
    public final /* synthetic */ a37 H;
    public final /* synthetic */ gs2 I;
    public final /* synthetic */ aa8 w;
    public final /* synthetic */ la5 x;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ y88(aa8 aa8, la5 la5, gs2 gs2, boolean z2, float f, a37 a37, a37 a372, a37 a373, bd5 bd5, bd5 bd52, vr vrVar, a37 a374, gs2 gs22) {
        this.w = aa8;
        this.x = la5;
        this.y = gs2;
        this.z = z2;
        this.A = f;
        this.B = a37;
        this.C = a372;
        this.D = a373;
        this.E = bd5;
        this.F = bd52;
        this.G = vrVar;
        this.H = a374;
        this.I = gs22;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            ml4 o = j45.o(x91.J(yu6.q(x91.T(yu6.b, this.w), 0.0f, b98.g, 1), this.x));
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                Q = new f08(26);
                yt2.o0(Q);
            }
            ml4 a = ck6.a(o, false, (vr2) Q);
            gs2 gs2 = this.y;
            a98 a98 = new a98(gs2, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E2 = gw8.E(yt2, a);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt2, a98);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt2, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt2, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt2, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt2, E2);
            if (gs2 != null) {
                yt2.e0(1497295659);
                ml4 w0 = rc9.w0(jl4.w, "header");
                lh4 d = mb0.d(xb4.y, false);
                int hashCode2 = Long.hashCode(yt2.T);
                vf5 m2 = yt2.m();
                ml4 E3 = gw8.E(yt2, w0);
                yt2.i0();
                if (yt2.S) {
                    yt2.l(vy0);
                } else {
                    yt2.r0();
                }
                g75.Q(ckVar, yt2, d);
                g75.Q(ckVar2, yt2, m2);
                f21.s(hashCode2, yt2, ckVar3, yt2, ceVar);
                g75.Q(ckVar4, yt2, E3);
                gs2.H(yt2, 0);
                z3 = true;
                yt2.r(true);
                yt2.r(false);
            } else {
                z3 = true;
                yt2.e0(1497385993);
                yt2.r(false);
            }
            this.I.H(yt2, 0);
            yt2.r(z3);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
