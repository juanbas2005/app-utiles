package defpackage;

/* renamed from: wd1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wd1 implements lu5 {
    public final vd1 a;
    public final xd1 b;
    public final int c;

    public wd1(vd1 vd1, xd1 xd1, int i) {
        this.a = vd1;
        this.b = xd1;
        this.c = i;
    }

    public final Object get() {
        xd1 xd1 = this.b;
        vd1 vd1 = this.a;
        int i = this.c;
        switch (i) {
            case b85.b:
                return new c30((nz7) vd1.m.get(), (gc2) vd1.T.get());
            case 1:
                return new e41(xd1.a, vd1.a.a, zv1.a(), (rg5) vd1.P.get(), (nz7) vd1.m.get(), (vp6) vd1.x.get());
            case 2:
                return new ku1(xd1.a, (rg5) vd1.P.get(), (vp6) vd1.x.get(), vd1.a.a);
            case 3:
                return new np2((sn2) vd1.U.get(), (p7) vd1.S.get(), (dv7) vd1.l.get());
            case 4:
                return new c23((nz7) vd1.m.get(), (k40) vd1.s.get(), (vp6) vd1.x.get(), (yq5) vd1.V.get(), (p7) vd1.S.get(), (rg5) vd1.P.get(), vd1.a.a, zv1.a());
            case 5:
                return new qb3();
            case 6:
                return new rh3((i03) vd1.I.get(), xd1.a);
            case 7:
                return new ne4((dv7) vd1.l.get(), (p7) vd1.S.get(), (s77) vd1.W.get());
            case 8:
                return new vs4((ur4) vd1.C.get(), (kr4) vd1.X.get(), vd1.a.a, zv1.a());
            case 9:
                return new ic5((dc5) vd1.Y.get());
            case 10:
                return new dj5((ni5) vd1.Z.get(), (rg5) vd1.P.get(), (vp6) vd1.x.get(), vd1.a.a);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return new pm5();
            case 12:
                return new lq5((p7) vd1.S.get());
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return new a06((my4) vd1.b0.get(), (d07) vd1.c0.get(), (p7) vd1.S.get());
            case 14:
                return new g36(vd1.a.a, xd1.a, zv1.a());
            case h75.g:
                return new c56((gc2) vd1.T.get(), (f91) vd1.O.get());
            case 16:
                return new gm6((nz7) vd1.m.get(), (rg5) vd1.P.get(), (vp6) vd1.x.get(), vd1.a.a);
            case 17:
                return new fq6((vp6) vd1.x.get(), (p7) vd1.S.get());
            case 18:
                ((tv) vd1.d0.get()).getClass();
                r58 r58 = new r58();
                e37.a(new is7(6, new it6()));
                return r58;
            case 19:
                ((tv) vd1.d0.get()).getClass();
                r58 r582 = new r58();
                e37.a(new is7(6, new nt6()));
                return r582;
            case 20:
                return new hw6((nz7) vd1.m.get(), (rg5) vd1.P.get(), (vp6) vd1.x.get(), vd1.a.a);
            case 21:
                return new t17((d17) vd1.e0.get());
            case 22:
                return new e88((v78) vd1.L.get());
            default:
                throw new AssertionError(i);
        }
    }
}
