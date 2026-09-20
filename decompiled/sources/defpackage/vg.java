package defpackage;

/* renamed from: vg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vg {
    static {
        float f = ui4.a;
    }

    public static final void a(fw0 fw0, sr2 sr2, ml4 ml4, boolean z, wi4 wi4, la5 la5, yt2 yt2, int i) {
        int i2;
        boolean z2;
        la5 la52;
        wi4 wi42;
        boolean z3;
        ml4 ml42;
        pa5 pa5;
        wi4 wi43;
        boolean z4;
        jl4 jl4;
        int i3;
        int i4;
        yt2 yt22 = yt2;
        yt22.g0(-532959117);
        sr2 sr22 = sr2;
        if (yt22.i(sr22)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2 | 113995136;
        if ((38347923 & i5) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i5 & 1, z2)) {
            yt22.a0();
            if ((i & 1) == 0 || yt22.C()) {
                float f = ui4.a;
                qt0 qt0 = ((zg4) yt22.k(ch4.b)).a;
                wi4 wi44 = qt0.f0;
                if (wi44 == null) {
                    i4 = -3670017;
                    wi4 wi45 = new wi4(st0.d(qt0, ie1.P), st0.d(qt0, ie1.Q), st0.d(qt0, ie1.R), jt0.b(ie1.K, st0.d(qt0, ie1.J)), jt0.b(ie1.M, st0.d(qt0, ie1.L)), jt0.b(ie1.O, st0.d(qt0, ie1.N)));
                    qt0.f0 = wi45;
                    wi44 = wi45;
                } else {
                    i4 = -3670017;
                }
                i3 = i5 & i4;
                wi43 = wi44;
                pa5 = ui4.b;
                jl4 = jl4.w;
                z4 = true;
            } else {
                yt22.Y();
                i3 = i5 & -3670017;
                jl4 = ml4;
                z4 = z;
                wi43 = wi4;
                pa5 = la5;
            }
            yt22.s();
            fj4.b(fw0, sr22, jl4, z4, wi43, pa5, yt22, 268435454 & i3);
            wi42 = wi43;
            la52 = pa5;
            ml42 = jl4;
            z3 = z4;
        } else {
            yt2.Y();
            ml42 = ml4;
            z3 = z;
            wi42 = wi4;
            la52 = la5;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ug(fw0, sr2, ml42, z3, wi42, la52, i);
        }
    }
}
