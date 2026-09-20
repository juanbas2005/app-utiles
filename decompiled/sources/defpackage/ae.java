package defpackage;

import android.view.KeyEvent;

/* renamed from: ae  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ae extends wx3 implements sr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(int i, Object obj, Object obj2) {
        super(0);
        this.x = i;
        this.y = obj;
        this.z = obj2;
    }

    public final Object b() {
        float f;
        float f2;
        fk6 fk6;
        uy3 uy3;
        ly5 ly5;
        int i = this.x;
        boolean z2 = false;
        vs7 vs7 = vs7.a;
        Object obj = this.z;
        Object obj2 = this.y;
        switch (i) {
            case b85.b /*0*/:
                return Boolean.valueOf(ae.super.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                oe oeVar = (oe) obj;
                dh6 dh6 = (dh6) obj2;
                vg6 vg6 = dh6.A;
                vg6 vg62 = dh6.B;
                Float f3 = dh6.y;
                Float f4 = dh6.z;
                if (vg6 == null || f3 == null) {
                    f = 0.0f;
                } else {
                    f = ((Number) vg6.a.b()).floatValue() - f3.floatValue();
                }
                if (vg62 == null || f4 == null) {
                    f2 = 0.0f;
                } else {
                    f2 = ((Number) vg62.a.b()).floatValue() - f4.floatValue();
                }
                if (!(f == 0.0f && f2 == 0.0f)) {
                    int z3 = oeVar.z(dh6.w);
                    hk6 hk6 = (hk6) oeVar.r().b(oeVar.G);
                    if (hk6 != null) {
                        try {
                            c5 c5Var = oeVar.I;
                            if (c5Var != null) {
                                c5Var.a.setBoundsInScreen(oeVar.k(hk6));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    hk6 hk62 = (hk6) oeVar.r().b(oeVar.H);
                    if (hk62 != null) {
                        try {
                            c5 c5Var2 = oeVar.J;
                            if (c5Var2 != null) {
                                c5Var2.a.setBoundsInScreen(oeVar.k(hk62));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    oeVar.z.invalidate();
                    hk6 hk63 = (hk6) oeVar.r().b(z3);
                    if (!(hk63 == null || (fk6 = hk63.a) == null || (uy3 = fk6.c) == null)) {
                        if (vg6 != null) {
                            oeVar.L.i(z3, vg6);
                        }
                        if (vg62 != null) {
                            oeVar.M.i(z3, vg62);
                        }
                        oeVar.v(uy3);
                    }
                }
                if (vg6 != null) {
                    dh6.y = (Float) vg6.a.b();
                }
                if (vg62 != null) {
                    dh6.z = (Float) vg62.a.b();
                }
                return vs7;
            case 2:
                sr2 sr2 = (sr2) obj2;
                if (sr2 != null && (ly5 = (ly5) sr2.b()) != null) {
                    return ly5;
                }
                xz4 xz4 = (xz4) obj;
                if (!xz4.c1().J) {
                    xz4 = null;
                }
                if (xz4 != null) {
                    return z85.c(0, pv8.O(xz4.y));
                }
                return null;
            case 3:
                ((bh0) obj2).M.y((ch0) obj);
                return vs7;
            case 4:
                ((h06) obj2).w = ((vk2) obj).X0();
                return vs7;
            case 5:
                ((c03) obj2).d((ll4) obj);
                return vs7;
            case 6:
                o00 o00 = ((uy3) obj2).a0;
                h06 h06 = (h06) obj;
                if ((((ll4) o00.g).z & 8) != 0) {
                    for (ll4 ll4 = (ib7) o00.f; ll4 != null; ll4 = ll4.A) {
                        if ((ll4.y & 8) != 0) {
                            ll4 ll42 = ll4;
                            eq4 eq4 = null;
                            while (ll42 != null) {
                                if (ll42 instanceof dk6) {
                                    dk6 dk6 = (dk6) ll42;
                                    if (dk6.J()) {
                                        ak6 ak6 = new ak6();
                                        h06.w = ak6;
                                        ak6.z = true;
                                    }
                                    if (dk6.G0()) {
                                        ((ak6) h06.w).y = true;
                                    }
                                    dk6.D0((ok6) h06.w);
                                } else if ((ll42.y & 8) != 0 && (ll42 instanceof wo1)) {
                                    int i2 = 0;
                                    for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                        if ((ll43.y & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                ll42 = ll43;
                                            } else {
                                                if (eq4 == null) {
                                                    eq4 = new eq4(new ll4[16]);
                                                }
                                                if (ll42 != null) {
                                                    eq4.b(ll42);
                                                    ll42 = null;
                                                }
                                                eq4.b(ll43);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ll42 = rc9.j(eq4);
                            }
                        }
                    }
                }
                return vs7;
            default:
                l76 l76 = xz4.m0;
                ((vr2) obj2).y(l76);
                xz4 xz42 = (xz4) obj;
                boolean e = sg3.e(xz42.d0, l76.K);
                boolean z4 = xz42.e0;
                boolean z5 = l76.L;
                if (z4 != z5) {
                    z2 = true;
                }
                if (!e || z2) {
                    xz42.d0 = l76.K;
                    xz42.e0 = z5;
                    if (xz42.f0 && (z2 || (z5 && !e))) {
                        xz42.O.H();
                    }
                }
                xz42.f0 = true;
                l76.T = l76.K.a(l76.N, l76.Q, l76.P);
                return vs7;
        }
    }
}
