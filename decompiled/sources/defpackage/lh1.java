package defpackage;

/* renamed from: lh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lh1 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ vr2 x;
    public final /* synthetic */ sr2 y;
    public final /* synthetic */ Object z;

    public /* synthetic */ lh1(u5 u5Var, a54 a54, b54 b54, Integer num, if7 if7, if7 if72, vr2 vr2, vr2 vr22, vr2 vr23, sr2 sr2, sr2 sr22, sr2 sr23, int i) {
        this.z = u5Var;
        this.A = a54;
        this.B = b54;
        this.C = num;
        this.D = if7;
        this.E = if72;
        this.x = vr2;
        this.F = vr22;
        this.G = vr23;
        this.y = sr2;
        this.H = sr22;
        this.I = sr23;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        d63 d63;
        ik2 ik2;
        s34 s34;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        Object obj6 = this.F;
        Object obj7 = this.E;
        Object obj8 = this.D;
        Object obj9 = this.C;
        Object obj10 = this.B;
        Object obj11 = this.A;
        Object obj12 = this.z;
        switch (i) {
            case b85.b:
                s34 s342 = (s34) obj12;
                re3 re3 = (re3) obj11;
                vh0 vh0 = (vh0) obj10;
                yh0 yh0 = (yh0) obj9;
                th0 th0 = (th0) obj8;
                Long l = (Long) obj7;
                rg1 rg1 = (rg1) obj6;
                kg1 kg1 = (kg1) obj5;
                ig1 ig1 = (ig1) obj4;
                ik2 ik22 = (ik2) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                vs7 vs72 = vs7;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    Object Q = yt2.Q();
                    d63 d632 = ay0.a;
                    if (Q == d632) {
                        Q = new f81(5);
                        yt2.o0(Q);
                    }
                    ml4 a = ck6.a(jl4.w, false, (vr2) Q);
                    lg1 lg1 = lg1.a;
                    tj1 m = kl8.m();
                    je2 H2 = hj8.H(vm4.y, yt2);
                    boolean g = yt2.g(m) | yt2.g(s342);
                    ml4 ml4 = a;
                    Object Q2 = yt2.Q();
                    if (g || Q2 == d632) {
                        d63 = d632;
                        ik2 = ik22;
                        ax6 ax6 = new ax6(new ns8(15, (Object) new hv2(11, (Object) s342, (Object) xb4.a0)), m, H2);
                        yt2.o0(ax6);
                        Q2 = ax6;
                    } else {
                        ik2 = ik22;
                        d63 = d632;
                    }
                    ax6 ax62 = (ax6) Q2;
                    boolean i2 = yt2.i(re3) | yt2.i(vh0) | yt2.g(yh0);
                    vr2 vr2 = this.x;
                    boolean g2 = i2 | yt2.g(vr2) | yt2.g(th0) | yt2.g(l) | yt2.i(rg1) | yt2.g(kg1) | yt2.g(ig1) | yt2.g(s342);
                    ik2 ik23 = ik2;
                    sr2 sr2 = this.y;
                    boolean i3 = g2 | yt2.i(ik23) | yt2.g(sr2);
                    Object Q3 = yt2.Q();
                    if (i3 || Q3 == d63) {
                        vh0 vh02 = vh0;
                        s34 s343 = s342;
                        Q3 = new ph1(th0, vh02, yh0, ig1, kg1, rg1, ik23, sr2, vr2, re3, s343, l);
                        s34 = s343;
                        yt2.o0(Q3);
                    } else {
                        s34 = s342;
                    }
                    x91.b(ml4, s34, (la5) null, (tr) null, (h80) null, ax62, false, (xf) null, (vr2) Q3, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs72;
            default:
                ((Integer) obj2).getClass();
                int v = b85.v(1);
                mp7.c((u5) obj12, (a54) obj11, (b54) obj10, (Integer) obj9, (if7) obj8, (if7) obj7, this.x, (vr2) obj6, (vr2) obj5, this.y, (sr2) obj4, (sr2) obj3, (yt2) obj, v);
                return vs7;
        }
    }

    public /* synthetic */ lh1(th0 th0, vh0 vh0, yh0 yh0, ig1 ig1, kg1 kg1, rg1 rg1, ik2 ik2, sr2 sr2, vr2 vr2, re3 re3, s34 s34, Long l) {
        this.z = s34;
        this.A = re3;
        this.B = vh0;
        this.C = yh0;
        this.x = vr2;
        this.D = th0;
        this.E = l;
        this.F = rg1;
        this.G = kg1;
        this.H = ig1;
        this.I = ik2;
        this.y = sr2;
    }
}
