package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: rz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class rz5 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ sr2 x;

    public /* synthetic */ rz5(int i, sr2 sr2) {
        this.w = i;
        this.x = sr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((bu0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    jl4 jl4 = jl4.w;
                    ml4 K = x91.K(jl4, 20.0f);
                    au0 a = zt0.a(wr.c, xb4.L, yt2, 48);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, K);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, a);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    d83.a(rg3.x(), (String) null, yu6.l(jl4, 36.0f), xz5.r(), yt2, 432, 0);
                    yt2 yt22 = yt2;
                    yf7.b(pb4.j(jl4, 10.0f, yt2, R.string.title_required_permissions, yt2), (ml4) null, xz5.w(), ya5.k(16), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 1597440, 0, 262058);
                    yt2 yt23 = yt22;
                    yf7.b(pb4.j(jl4, 6.0f, yt23, R.string.body_required_permissions, yt23), (ml4) null, xz5.s(), ya5.k(13), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(20), 0, false, 0, 0, (tg7) null, yt22, 24576, 48, 260074);
                    k75.a(yt22, yu6.d(jl4, 14.0f));
                    o96 a2 = q96.a(12.0f);
                    pa5 pa5 = yd0.a;
                    yt2 yt24 = yt22;
                    yt2 yt25 = yt24;
                    gw8.a(this.x, (ml4) null, false, a2, yd0.a(xz5.r(), 0, 0, 0, yt24, 14), (ce0) null, (ua0) null, (la5) null, pd8.b, yt25, 805306368, 486);
                    yt25.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                oh4 oh4 = (oh4) obj;
                gh4 gh4 = (gh4) obj2;
                k31 k31 = (k31) obj3;
                float f = ((lx1) this.x.b()).w;
                long j = k31.a;
                if (!lx1.b(f, Float.NaN)) {
                    z = oh4.r0(f);
                }
                eh5 y = gh4.y(k31.a(k31.a, 0, 0, m31.f(j, z), 0, 11));
                return oh4.d0(y.w, y.x, b42.w, new ws(y, 13));
            default:
                yt2 yt26 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (yt26.V(intValue2 & 1, z)) {
                    pv8.e(this.x, x91.O(jl4.w, 0.0f, 0.0f, 16.0f, 0.0f, 11), false, (la5) null, su0.J(2046087217, new ww0(29), yt26), yt26, 24624, 12);
                } else {
                    yt26.Y();
                }
                return vs7;
        }
    }
}
