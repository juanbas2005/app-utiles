package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: eh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class eh1 implements hs2 {
    public final /* synthetic */ re3 A;
    public final /* synthetic */ yh0 B;
    public final /* synthetic */ kg1 C;
    public final /* synthetic */ vh0 D;
    public final /* synthetic */ ig1 E;
    public final /* synthetic */ ok2 F;
    public final /* synthetic */ ok2 G;
    public final /* synthetic */ ok2 H;
    public final /* synthetic */ ik2 I;
    public final /* synthetic */ long w;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ o81 y;
    public final /* synthetic */ s34 z;

    public /* synthetic */ eh1(long j, aq4 aq4, o81 o81, s34 s34, re3 re3, yh0 yh0, kg1 kg1, vh0 vh0, ig1 ig1, ok2 ok2, ok2 ok22, ok2 ok23, ik2 ik2) {
        this.w = j;
        this.x = aq4;
        this.y = o81;
        this.z = s34;
        this.A = re3;
        this.B = yh0;
        this.C = kg1;
        this.D = vh0;
        this.E = ig1;
        this.F = ok2;
        this.G = ok22;
        this.H = ok23;
        this.I = ik2;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        xk xkVar = (xk) obj;
        yt2 yt2 = (yt2) obj2;
        ((Integer) obj3).getClass();
        String i = h75.i(R.string.m3c_date_picker_year_picker_pane_title, yt2);
        boolean g = yt2.g(i);
        Object Q = yt2.Q();
        Object obj4 = ay0.a;
        if (g || Q == obj4) {
            Q = new cb(i, 4);
            yt2.o0(Q);
        }
        jl4 jl4 = jl4.w;
        ml4 a = ck6.a(jl4, false, (vr2) Q);
        au0 a2 = zt0.a(wr.c, xb4.K, yt2, 0);
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
        g75.Q(tx0.f, yt2, a2);
        g75.Q(tx0.e, yt2, m);
        g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
        g75.O(yt2, tx0.h);
        g75.Q(tx0.d, yt2, E2);
        ml4 M = x91.M(yu6.g(jl4, 336.0f - vw1.a), 12.0f, 0.0f, 2);
        aq4 aq4 = this.x;
        boolean g2 = yt2.g(aq4);
        o81 o81 = this.y;
        boolean i2 = g2 | yt2.i(o81);
        s34 s34 = this.z;
        boolean g3 = i2 | yt2.g(s34);
        re3 re3 = this.A;
        boolean i3 = g3 | yt2.i(re3);
        yh0 yh0 = this.B;
        boolean g4 = i3 | yt2.g(yh0);
        Object Q2 = yt2.Q();
        if (g4 || Q2 == obj4) {
            b9 b9Var = new b9(o81, aq4, (Object) s34, (Object) re3, (Object) yh0, 2);
            yt2.o0(b9Var);
            Q2 = b9Var;
        }
        vr2 vr2 = (vr2) Q2;
        ok2 ok2 = this.G;
        boolean g5 = yt2.g(ok2);
        Object Q3 = yt2.Q();
        if (g5 || Q3 == obj4) {
            Q3 = new dh1(ok2, 1);
            yt2.o0(Q3);
        }
        sr2 sr2 = (sr2) Q3;
        ok2 ok22 = this.H;
        boolean g6 = yt2.g(ok22);
        ik2 ik2 = this.I;
        boolean i4 = g6 | yt2.i(ik2);
        Object Q4 = yt2.Q();
        if (i4 || Q4 == obj4) {
            Q4 = new ch1(ok22, ik2, 1);
            yt2.o0(Q4);
        }
        ok2 ok23 = ok22;
        long j = this.w;
        ik2 ik22 = ik2;
        kg1 kg1 = this.C;
        re3 re32 = re3;
        vh0 vh0 = this.D;
        ok2 ok24 = ok23;
        ig1 ig1 = this.E;
        Object obj5 = obj4;
        ik2 ik23 = ik22;
        ok2 ok25 = this.F;
        gi1.n(M, j, vr2, kg1, vh0, re32, ig1, ok25, sr2, (sr2) Q4, yt2, 6);
        long j2 = ig1.x;
        ml4 s = uq3.s(jl4, ok24);
        boolean i5 = yt2.i(ik23) | yt2.g(ok25);
        Object Q5 = yt2.Q();
        if (i5 || Q5 == obj5) {
            Q5 = new e3(5, (Object) ik23, (Object) ok25);
            yt2.o0(Q5);
        }
        kl8.c(t49.U(s, (vr2) Q5).d(uk2.w), 0.0f, j2, yt2, 0, 2);
        yt2.r(true);
        return vs7.a;
    }
}
