package defpackage;

/* renamed from: n92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n92 implements hs2 {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ n92(se7 se7, boolean z2, ap4 ap4) {
        this.y = se7;
        this.x = z2;
        this.z = ap4;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z2;
        boolean z3;
        int i2 = this.w;
        Object obj4 = this.z;
        boolean z4 = this.x;
        Object obj5 = this.y;
        switch (i2) {
            case b85.b:
                oh4 oh4 = (oh4) obj;
                gh4 gh4 = (gh4) obj2;
                k31 k31 = (k31) obj3;
                int g = m31.g(k31.a, ((bd5) obj5).d());
                long j = k31.a;
                int f = m31.f(j, ((bd5) obj4).d());
                if (z4) {
                    i = g;
                } else {
                    i = k31.j(j);
                }
                if (!z4) {
                    g = k31.h(j);
                }
                eh5 y2 = gh4.y(k31.a(k31.a, i, g, 0, f, 4));
                return oh4.d0(y2.w, y2.x, b42.w, new ws(y2, 5));
            default:
                se7 se7 = (se7) obj5;
                ed5 ed5 = se7.f;
                ap4 ap4 = (ap4) obj4;
                ml4 ml4 = (ml4) obj;
                yt2 yt2 = (yt2) obj2;
                ((Integer) obj3).getClass();
                yt2.e0(-2137546592);
                boolean z5 = true;
                if (yt2.k(xy0.n) == ey3.x) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((z75) ed5.getValue()) == z75.w || !z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean g2 = yt2.g(se7);
                Object Q = yt2.Q();
                d63 d63 = ay0.a;
                if (g2 || Q == d63) {
                    Q = new ay5(23, (Object) se7);
                    yt2.o0(Q);
                }
                aq4 v = u55.v((vr2) Q, yt2);
                Object Q2 = yt2.Q();
                if (Q2 == d63) {
                    hn1 hn1 = new hn1(new t46(v, 1));
                    yt2.o0(hn1);
                    Q2 = hn1;
                }
                uh6 uh6 = (uh6) Q2;
                boolean g3 = yt2.g(uh6) | yt2.g(se7);
                Object Q3 = yt2.Q();
                if (g3 || Q3 == d63) {
                    Q3 = new re7(uh6, se7);
                    yt2.o0(Q3);
                }
                re7 re7 = (re7) Q3;
                z75 z75 = (z75) ed5.getValue();
                if (!z4 || se7.b.d() == 0.0f) {
                    z5 = false;
                }
                ml4 b = mh6.b(re7, z75, z5, z3, ap4);
                yt2.r(false);
                return b;
        }
    }

    public /* synthetic */ n92(boolean z2, bd5 bd5, bd5 bd52) {
        this.x = z2;
        this.y = bd5;
        this.z = bd52;
    }
}
