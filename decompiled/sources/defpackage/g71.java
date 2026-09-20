package defpackage;

/* renamed from: g71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class g71 implements gs2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ se7 B;
    public final /* synthetic */ hf7 C;
    public final /* synthetic */ m78 D;
    public final /* synthetic */ ml4 E;
    public final /* synthetic */ ml4 F;
    public final /* synthetic */ ml4 G;
    public final /* synthetic */ ml4 H;
    public final /* synthetic */ yb0 I;
    public final /* synthetic */ ze7 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ w98 M;
    public final /* synthetic */ o81 N;
    public final /* synthetic */ vr2 O;
    public final /* synthetic */ v35 P;
    public final /* synthetic */ tp1 Q;
    public final /* synthetic */ tg7 w;
    public final /* synthetic */ u44 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ g71(tg7 tg7, u44 u44, int i, int i2, boolean z2, boolean z3, se7 se7, hf7 hf7, m78 m78, ml4 ml4, ml4 ml42, ml4 ml43, ml4 ml44, yb0 yb0, ze7 ze7, boolean z4, boolean z5, w98 w98, o81 o81, vr2 vr2, v35 v35, tp1 tp1) {
        this.w = tg7;
        this.x = u44;
        this.y = i;
        this.z = i2;
        this.A = z3;
        this.B = se7;
        this.C = hf7;
        this.D = m78;
        this.E = ml4;
        this.F = ml42;
        this.G = ml43;
        this.H = ml44;
        this.I = yb0;
        this.J = ze7;
        this.K = z4;
        this.L = z5;
        this.M = w98;
        this.N = o81;
        this.O = vr2;
        this.P = v35;
        this.Q = tp1;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        float f;
        ml4 ml4;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            u44 u44 = this.x;
            float f2 = ((lx1) u44.g.getValue()).w;
            if (lx1.b(f2, 0.0f)) {
                f = Float.NaN;
            } else {
                f = f2;
            }
            ml4 e = yu6.e(jl4.w, f2, f);
            int i = this.y;
            int i2 = this.z;
            rd3.K(i, i2);
            tg7 tg7 = this.w;
            if (!(i == 1 && i2 == Integer.MAX_VALUE) && this.A) {
                e = e.d(new lz2(tg7, i, i2));
            }
            boolean i3 = yt2.i(u44);
            Object Q2 = yt2.Q();
            if (i3 || Q2 == ay0.a) {
                Q2 = new zh(9, (Object) u44);
                yt2.o0(Q2);
            }
            sr2 sr2 = (sr2) Q2;
            se7 se7 = this.B;
            z75 z75 = (z75) se7.f.getValue();
            hf7 hf7 = this.C;
            long j = hf7.b;
            int i4 = lg7.c;
            int i5 = (int) (j >> 32);
            tg7 tg72 = tg7;
            int i6 = i2;
            long j2 = se7.e;
            if (i5 == ((int) (j2 >> 32)) && (i5 = (int) (j & 4294967295L)) == ((int) (j2 & 4294967295L))) {
                i5 = lg7.f(j);
            }
            se7.e = hf7.b;
            tl7 a = w18.a(this.D, hf7.a);
            int ordinal = z75.ordinal();
            if (ordinal == 0) {
                ml4 = new o48(se7, i5, a, sr2);
            } else if (ordinal == 1) {
                ml4 = new l23(se7, i5, a, sr2);
            } else {
                h.c();
                return null;
            }
            ml4 d = we.g(l95.a(e)).d(ml4).d(this.E).d(this.F).d(new ff7(tg72)).d(this.G).d(this.H);
            yb0 yb0 = this.I;
            za5.a(ag8.g(d, yb0), su0.J(1412697320, new h71(this.J, u44, this.K, this.L, this.M, this.N, this.O, hf7, this.P, this.Q, yb0, i6), yt2), yt2, 48);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
