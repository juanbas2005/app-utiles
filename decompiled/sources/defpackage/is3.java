package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: is3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class is3 {
    public static final is3 c;
    public static final is3 d;
    public final Map a;
    public final boolean b;

    static {
        b42 b42 = b42.w;
        c = new is3(b42, false);
        d = new is3(b42, true);
    }

    public is3(Map map, boolean z) {
        map.getClass();
        this.a = map;
        this.b = z;
    }

    public final is3 a(boolean z) {
        if (z == this.b) {
            return this;
        }
        Map map = this.a;
        if (map.isEmpty() && !z) {
            return c;
        }
        if (!map.isEmpty() || !z) {
            return new is3(map, z);
        }
        return d;
    }

    public final gs3 b(as3 as3, ks3 ks3) {
        as3.getClass();
        ks3.getClass();
        gs3 d2 = d(as3, ks3);
        as3 as32 = null;
        boolean z = this.b;
        if (z) {
            as3 as33 = d2.b;
            if (as33 != null) {
                as32 = fd1.E(as33, as33);
            }
            return new gs3(as32, d2.a);
        } else if (!z) {
            return d2;
        } else {
            h.c();
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [gq3] */
    /* JADX WARNING: type inference failed for: r2v3, types: [c2] */
    /* JADX WARNING: type inference failed for: r2v6, types: [c2] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ff, code lost:
        if (r7.v() == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0143, code lost:
        if (r7.v() == false) goto L_0x0145;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final gs3 d(as3 as3, ks3 ks3) {
        c2 c2Var;
        c2 c2Var2;
        c2 c2Var3;
        c2 c2Var4;
        c2 c2Var5;
        gs3 gs3;
        bh2 bh2;
        boolean z;
        c2 c2Var6;
        Boolean bool;
        Boolean bool2;
        c2 c2Var7;
        c2 K;
        c2 D;
        Map map = this.a;
        if (map.isEmpty()) {
            return new gs3(as3, ks3);
        }
        boolean z2 = as3 instanceof c2;
        ? r2 = 0;
        if (z2) {
            c2Var = (c2) as3;
        } else {
            c2Var = null;
        }
        if (c2Var != null) {
            c2Var2 = c2Var.D();
        } else {
            c2Var2 = null;
        }
        if (z2) {
            c2Var3 = (c2) as3;
        } else {
            c2Var3 = null;
        }
        if (c2Var3 != null) {
            c2Var4 = c2Var3.K();
        } else {
            c2Var4 = null;
        }
        if (c2Var2 == null || c2Var4 == null) {
            vq3 J = as3.J();
            if (J == null) {
                return new gs3(as3, ks3);
            }
            gs3 gs32 = (gs3) map.get(J);
            if (gs32 != null) {
                as3 as32 = gs32.b;
                ks3 ks32 = gs32.a;
                if (as32 == null || ks32 == null) {
                    return gs32;
                }
                ks3 ks33 = ks3.w;
                if (ks32 != ks33) {
                    if (ks3 == ks33 || ks32 == ks3) {
                        ks3 = ks32;
                    } else {
                        h.s("CONFLICTING_PROJECTION");
                        return null;
                    }
                }
                if (as3 instanceof zw3) {
                    zw3 zw3 = (zw3) as3;
                    if (!(zw3 instanceof c2) || ((c2) zw3).D() == null) {
                        bh2 = null;
                    } else {
                        bh2 = (bh2) zw3;
                    }
                    if (bh2 == null) {
                        if (as32 instanceof c2) {
                            c2 c2Var8 = (c2) as32;
                            c2 D2 = c2Var8.D();
                            if (D2 != null) {
                                bool = Boolean.valueOf(D2.v());
                            } else {
                                bool = null;
                            }
                            c2 K2 = c2Var8.K();
                            if (K2 != null) {
                                bool2 = Boolean.valueOf(K2.v());
                            } else {
                                bool2 = null;
                            }
                            if (!sg3.e(bool, bool2)) {
                            }
                        }
                        v76 v76 = (v76) as32;
                        boolean z3 = false;
                        if (as3.v() || as32.v()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c2 H = ((c2) v76).H(z);
                        if (as3 instanceof c2) {
                            c2Var6 = (c2) as3;
                        } else {
                            c2Var6 = null;
                        }
                        if (c2Var6 == null || !c2Var6.s()) {
                            if (v76 instanceof c2) {
                                r2 = (c2) v76;
                            }
                            if (r2 != 0) {
                                if (r2.s()) {
                                }
                            }
                            as32 = H.F(z3);
                            return new gs3(as32, ks3);
                        }
                        z3 = true;
                        as32 = H.F(z3);
                        return new gs3(as32, ks3);
                    }
                }
                h.p(as3, "' must be non flexible", "'");
                return null;
            }
            if (!as3.I().isEmpty()) {
                List<gs3> I = as3.I();
                ArrayList arrayList = new ArrayList(et0.e0(I, 10));
                for (gs3 gs33 : I) {
                    ks3 ks34 = gs33.a;
                    as3 as33 = gs33.b;
                    if (as33 == null || ks34 == null) {
                        gs3 = gs3.c;
                    } else {
                        gs3 = d(as33, ks34);
                    }
                    arrayList.add(gs3);
                }
                boolean v = as3.v();
                List annotations = as3.getAnnotations();
                if (as3 instanceof c2) {
                    c2Var5 = (c2) as3;
                } else {
                    c2Var5 = null;
                }
                if (c2Var5 != null) {
                    r2 = c2Var5.g();
                }
                as3 = bb0.d0(J, arrayList, v, annotations, r2);
            }
            return new gs3(as3, ks3);
        }
        gs3 d2 = d(c2Var2, ks3);
        as3 as34 = d2.b;
        if (as34 instanceof c2) {
            c2Var7 = (c2) as34;
        } else {
            c2Var7 = null;
        }
        if (!(c2Var7 == null || (D = c2Var7.D()) == null)) {
            d2 = new gs3(D, d2.a);
        }
        gs3 d3 = d(c2Var4, ks3);
        as3 as35 = d3.b;
        if (as35 instanceof c2) {
            r2 = (c2) as35;
        }
        if (!(r2 == 0 || (K = r2.K()) == null)) {
            d3 = new gs3(K, d3.a);
        }
        as3 as36 = d3.b;
        as3 as37 = d2.b;
        if (as36 == null || as37 == null) {
            return gs3.c;
        }
        return new gs3(w95.d(as37, as36, ((c2) as3).y()), d2.a);
    }
}
