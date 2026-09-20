package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: u85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class u85 implements gs2 {
    public final /* synthetic */ hf7 A;
    public final /* synthetic */ vr2 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ tg7 D;
    public final /* synthetic */ bt3 E;
    public final /* synthetic */ zs3 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ m78 J;
    public final /* synthetic */ ap4 K;
    public final /* synthetic */ gs2 L;
    public final /* synthetic */ gs2 M;
    public final /* synthetic */ pq6 N;
    public final /* synthetic */ ml4 w;
    public final /* synthetic */ gs2 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ yd7 z;

    public /* synthetic */ u85(ml4 ml4, gs2 gs2, boolean z2, yd7 yd7, hf7 hf7, vr2 vr2, boolean z3, tg7 tg7, bt3 bt3, zs3 zs3, boolean z4, int i, int i2, m78 m78, ap4 ap4, gs2 gs22, gs2 gs23, pq6 pq6) {
        this.w = ml4;
        this.x = gs2;
        this.y = z2;
        this.z = yd7;
        this.A = hf7;
        this.B = vr2;
        this.C = z3;
        this.D = tg7;
        this.E = bt3;
        this.F = zs3;
        this.G = z4;
        this.H = i;
        this.I = i2;
        this.J = m78;
        this.K = ap4;
        this.L = gs22;
        this.M = gs23;
        this.N = pq6;
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
                Object Q = yt2.Q();
                if (Q == ay0.a) {
                    Q = new j5(20);
                    yt2.o0(Q);
                }
                ml4 = x91.O(ck6.a(ml4, true, (vr2) Q), 0.0f, g75.F(yt2), 0.0f, 0.0f, 13);
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
            hf7 hf7 = this.A;
            boolean z4 = this.C;
            boolean z5 = this.G;
            m78 m78 = this.J;
            ap4 ap4 = this.K;
            hf7 hf72 = hf7;
            boolean z6 = z4;
            boolean z7 = z5;
            m78 m782 = m78;
            ap4 ap42 = ap4;
            t60.a(hf72, this.B, a, z6, this.D, this.E, this.F, z5, this.H, this.I, m78, (vr2) null, ap4, ky6, su0.J(674541106, new w85(hf72, z6, z7, m782, ap42, z3, gs2, this.L, this.M, yd7, this.N), yt2), yt2, 0);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
