package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: x85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class x85 implements gs2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ vr2 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ tg7 E;
    public final /* synthetic */ bt3 F;
    public final /* synthetic */ zs3 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ m78 K;
    public final /* synthetic */ ap4 L;
    public final /* synthetic */ gs2 M;
    public final /* synthetic */ gs2 N;
    public final /* synthetic */ gs2 O;
    public final /* synthetic */ gs2 P;
    public final /* synthetic */ pq6 Q;
    public final /* synthetic */ ml4 w;
    public final /* synthetic */ gs2 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ yd7 z;

    public /* synthetic */ x85(ml4 ml4, gs2 gs2, boolean z2, yd7 yd7, String str, vr2 vr2, boolean z3, boolean z4, tg7 tg7, bt3 bt3, zs3 zs3, boolean z5, int i, int i2, m78 m78, ap4 ap4, gs2 gs22, gs2 gs23, gs2 gs24, gs2 gs25, pq6 pq6) {
        this.w = ml4;
        this.x = gs2;
        this.y = z2;
        this.z = yd7;
        this.A = str;
        this.B = vr2;
        this.C = z3;
        this.D = z4;
        this.E = tg7;
        this.F = bt3;
        this.G = zs3;
        this.H = z5;
        this.I = i;
        this.J = i2;
        this.K = m78;
        this.L = ap4;
        this.M = gs22;
        this.N = gs23;
        this.O = gs24;
        this.P = gs25;
        this.Q = pq6;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        long j;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            gs2 gs2 = this.x;
            ml4 ml4 = jl4.w;
            if (gs2 != null) {
                yt2.e0(-2119688641);
                Object Q2 = yt2.Q();
                if (Q2 == ay0.a) {
                    Q2 = new j5(20);
                    yt2.o0(Q2);
                }
                ml4 = x91.O(ck6.a(ml4, true, (vr2) Q2), 0.0f, g75.F(yt2), 0.0f, 0.0f, 13);
                yt2.r(false);
            } else {
                yt2.e0(-2119398202);
                yt2.r(false);
            }
            ml4 d = this.w.d(ml4);
            String i = h75.i(R.string.default_error_message, yt2);
            boolean z3 = this.y;
            if (z3) {
                d = ck6.a(d, false, new cb(i, 24));
            }
            ml4 a = yu6.a(d, 280.0f, 56.0f);
            yd7 yd7 = this.z;
            if (z3) {
                j = yd7.j;
            } else {
                j = yd7.i;
            }
            ky6 ky6 = new ky6(j);
            String str = this.A;
            boolean z4 = this.C;
            boolean z5 = this.H;
            m78 m78 = this.K;
            ap4 ap4 = this.L;
            ml4 ml42 = a;
            fw0 J2 = su0.J(-1189274459, new s85(str, z4, z5, m78, ap4, z3, gs2, this.M, this.N, this.O, this.P, yd7, this.Q), yt2);
            yt2 yt22 = yt2;
            vr2 vr2 = this.B;
            boolean z6 = this.D;
            tg7 tg7 = this.E;
            bt3 bt3 = this.F;
            zs3 zs3 = this.G;
            ky6 ky62 = ky6;
            boolean z7 = z4;
            int i2 = this.I;
            boolean z8 = z5;
            int i3 = this.J;
            t60.b(str, vr2, ml42, z7, z6, tg7, bt3, zs3, z8, i2, i3, m78, (vr2) null, ap4, ky62, J2, yt22, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
