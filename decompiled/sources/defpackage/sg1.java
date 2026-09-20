package defpackage;

/* renamed from: sg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sg1 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ hi1 x;
    public final /* synthetic */ ig1 y;

    public /* synthetic */ sg1(hi1 hi1, ig1 ig1, int i) {
        this.w = i;
        this.x = hi1;
        this.y = ig1;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        int i = this.w;
        vs7 vs7 = vs7.a;
        jl4 jl4 = jl4.w;
        hi1 hi1 = this.x;
        boolean z2 = false;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (yt2.V(intValue & 1, z2)) {
                    lg1.a.b(hi1.a(), x91.J(jl4, gi1.b), this.y.b, yt2, 3120);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    ml4 J = x91.J(jl4, gi1.a);
                    int a = hi1.a();
                    boolean g = yt22.g(hi1);
                    Object Q = yt22.Q();
                    if (g || Q == ay0.a) {
                        Q = new zh1(hi1, 0);
                        yt22.o0(Q);
                    }
                    gi1.f(J, a, (vr2) Q, this.y, yt22, 6);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
