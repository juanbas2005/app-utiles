package defpackage;

/* renamed from: ie7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ie7 implements hs2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ v35 B;
    public final /* synthetic */ ps7 C;
    public final /* synthetic */ vr2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ u44 w;
    public final /* synthetic */ ze7 x;
    public final /* synthetic */ hf7 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ ie7(u44 u44, ze7 ze7, hf7 hf7, boolean z2, boolean z3, v35 v35, ps7 ps7, vr2 vr2, int i) {
        this.w = u44;
        this.x = ze7;
        this.y = hf7;
        this.z = z2;
        this.A = z3;
        this.B = v35;
        this.C = ps7;
        this.D = vr2;
        this.E = i;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        ml4 ml4 = (ml4) obj;
        yt2 yt2 = (yt2) obj2;
        ((Integer) obj3).getClass();
        yt2.e0(851809892);
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (Q == d63) {
            Q = new Object();
            yt2.o0(Q);
        }
        kg7 kg7 = (kg7) Q;
        Object Q2 = yt2.Q();
        if (Q2 == d63) {
            Q2 = new Object();
            yt2.o0(Q2);
        }
        he7 he7 = new he7(this.w, this.x, this.y, this.z, this.A, kg7, this.B, this.C, (nj1) Q2, this.D, this.E);
        boolean i = yt2.i(he7);
        Object Q3 = yt2.Q();
        if (i || Q3 == d63) {
            je7 je7 = new je7(1, he7, he7.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 0);
            yt2.o0(je7);
            Q3 = je7;
        }
        ml4 U = t49.U(jl4.w, (vr2) ((zq3) Q3));
        yt2.r(false);
        return U;
    }
}
