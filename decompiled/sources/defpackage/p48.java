package defpackage;

import java.util.ArrayList;

/* renamed from: p48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p48 extends h98 {
    public eq1 k;
    public g60 l;

    public final void a(aq1 aq1) {
        int i;
        float f;
        float f2;
        float f3;
        if (b81.B(this.j) != 3) {
            dv1 dv1 = this.e;
            if (dv1.c && !dv1.j && this.d == 3) {
                g31 g31 = this.b;
                int i2 = g31.r;
                if (i2 == 2) {
                    g31 g312 = g31.S;
                    if (g312 != null) {
                        dv1 dv12 = g312.e.e;
                        if (dv12.j) {
                            dv1.d((int) ((((float) dv12.g) * g31.y) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    dv1 dv13 = g31.d.e;
                    if (dv13.j) {
                        int i3 = g31.W;
                        if (i3 == -1) {
                            f = (float) dv13.g;
                            f2 = g31.V;
                        } else if (i3 == 0) {
                            f3 = ((float) dv13.g) * g31.V;
                            i = (int) (f3 + 0.5f);
                            dv1.d(i);
                        } else if (i3 != 1) {
                            i = 0;
                            dv1.d(i);
                        } else {
                            f = (float) dv13.g;
                            f2 = g31.V;
                        }
                        f3 = f / f2;
                        i = (int) (f3 + 0.5f);
                        dv1.d(i);
                    }
                }
            }
            eq1 eq1 = this.h;
            boolean z = eq1.c;
            ArrayList arrayList = eq1.l;
            if (z) {
                eq1 eq12 = this.i;
                boolean z2 = eq12.c;
                ArrayList arrayList2 = eq12.l;
                if (z2) {
                    if (!eq1.j || !eq12.j || !dv1.j) {
                        if (!dv1.j && this.d == 3) {
                            g31 g313 = this.b;
                            if (g313.q == 0 && !g313.v()) {
                                int i4 = ((eq1) arrayList.get(0)).g + eq1.f;
                                int i5 = ((eq1) arrayList2.get(0)).g + eq12.f;
                                eq1.d(i4);
                                eq12.d(i5);
                                dv1.d(i5 - i4);
                                return;
                            }
                        }
                        if (!dv1.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            int i6 = (((eq1) arrayList2.get(0)).g + eq12.f) - (((eq1) arrayList.get(0)).g + eq1.f);
                            int i7 = dv1.m;
                            if (i6 < i7) {
                                dv1.d(i6);
                            } else {
                                dv1.d(i7);
                            }
                        }
                        if (dv1.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            eq1 eq13 = (eq1) arrayList.get(0);
                            eq1 eq14 = (eq1) arrayList2.get(0);
                            int i8 = eq13.g;
                            int i9 = eq1.f + i8;
                            int i10 = eq14.g;
                            int i11 = eq12.f + i10;
                            float f4 = this.b.d0;
                            if (eq13 == eq14) {
                                f4 = 0.5f;
                            } else {
                                i8 = i9;
                                i10 = i11;
                            }
                            eq1.d((int) ((((float) ((i10 - i8) - dv1.g)) * f4) + ((float) i8) + 0.5f));
                            eq12.d(eq1.g + dv1.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        g31 g314 = this.b;
        l(g314.I, g314.K, 1);
    }

    /* JADX WARNING: type inference failed for: r1v105, types: [g60, dv1] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        r1 = r15.b;
     */
    public final void d() {
        g31 g31;
        g31 g312;
        g31 g313;
        g31 g314;
        eq1 eq1 = this.k;
        g31 g315 = this.b;
        boolean z = g315.a;
        dv1 dv1 = this.e;
        if (z) {
            dv1.d(g315.k());
        }
        boolean z2 = dv1.j;
        ArrayList arrayList = dv1.k;
        ArrayList arrayList2 = dv1.l;
        eq1 eq12 = this.i;
        eq1 eq13 = this.h;
        if (!z2) {
            g31 g316 = this.b;
            this.d = g316.o0[1];
            if (g316.D) {
                this.l = new dv1(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (g314 = this.b.S) != null && g314.o0[1] == 1) {
                    int k2 = (g314.k() - this.b.I.e()) - this.b.K.e();
                    h98.b(eq13, g314.e.h, this.b.I.e());
                    h98.b(eq12, g314.e.i, -this.b.K.e());
                    dv1.d(k2);
                    return;
                } else if (i == 1) {
                    dv1.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (g313 = g312.S) != null && g313.o0[1] == 1) {
            h98.b(eq13, g313.e.h, g312.I.e());
            h98.b(eq12, g313.e.i, -this.b.K.e());
            return;
        }
        boolean z3 = dv1.j;
        if (z3) {
            g31 g317 = this.b;
            if (g317.a) {
                h21[] h21Arr = g317.P;
                h21 h21 = h21Arr[2];
                h21 h212 = h21.f;
                if (h212 != null && h21Arr[3].f != null) {
                    boolean v = g317.v();
                    g31 g318 = this.b;
                    if (v) {
                        eq13.f = g318.P[2].e();
                        eq12.f = -this.b.P[3].e();
                    } else {
                        eq1 h = h98.h(g318.P[2]);
                        if (h != null) {
                            h98.b(eq13, h, this.b.P[2].e());
                        }
                        eq1 h2 = h98.h(this.b.P[3]);
                        if (h2 != null) {
                            h98.b(eq12, h2, -this.b.P[3].e());
                        }
                        eq13.b = true;
                        eq12.b = true;
                    }
                    g31 g319 = this.b;
                    if (g319.D) {
                        h98.b(eq1, eq13, g319.Z);
                        return;
                    }
                    return;
                } else if (h212 != null) {
                    eq1 h3 = h98.h(h21);
                    if (h3 != null) {
                        h98.b(eq13, h3, this.b.P[2].e());
                        h98.b(eq12, eq13, dv1.g);
                        g31 g3110 = this.b;
                        if (g3110.D) {
                            h98.b(eq1, eq13, g3110.Z);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    h21 h213 = h21Arr[3];
                    if (h213.f != null) {
                        eq1 h4 = h98.h(h213);
                        if (h4 != null) {
                            h98.b(eq12, h4, -this.b.P[3].e());
                            h98.b(eq13, eq12, -dv1.g);
                        }
                        g31 g3111 = this.b;
                        if (g3111.D) {
                            h98.b(eq1, eq13, g3111.Z);
                            return;
                        }
                        return;
                    }
                    h21 h214 = h21Arr[4];
                    if (h214.f != null) {
                        eq1 h5 = h98.h(h214);
                        if (h5 != null) {
                            h98.b(eq1, h5, 0);
                            h98.b(eq13, eq1, -this.b.Z);
                            h98.b(eq12, eq13, dv1.g);
                            return;
                        }
                        return;
                    } else if (!(g317 instanceof pz2) && g317.S != null && g317.i(7).f == null) {
                        g31 g3112 = this.b;
                        h98.b(eq13, g3112.S.e.h, g3112.p());
                        h98.b(eq12, eq13, dv1.g);
                        g31 g3113 = this.b;
                        if (g3113.D) {
                            h98.b(eq1, eq13, g3113.Z);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z3 || this.d != 3) {
            dv1.b(this);
        } else {
            g31 g3114 = this.b;
            int i2 = g3114.r;
            if (i2 == 2) {
                g31 g3115 = g3114.S;
                if (g3115 != null) {
                    dv1 dv12 = g3115.e.e;
                    arrayList2.add(dv12);
                    dv12.k.add(dv1);
                    dv1.b = true;
                    arrayList.add(eq13);
                    arrayList.add(eq12);
                }
            } else if (i2 == 3 && !g3114.v()) {
                g31 g3116 = this.b;
                if (g3116.q != 3) {
                    dv1 dv13 = g3116.d.e;
                    arrayList2.add(dv13);
                    dv13.k.add(dv1);
                    dv1.b = true;
                    arrayList.add(eq13);
                    arrayList.add(eq12);
                }
            }
        }
        g31 g3117 = this.b;
        h21[] h21Arr2 = g3117.P;
        h21 h215 = h21Arr2[2];
        h21 h216 = h215.f;
        if (h216 != null && h21Arr2[3].f != null) {
            boolean v2 = g3117.v();
            g31 g3118 = this.b;
            if (v2) {
                eq13.f = g3118.P[2].e();
                eq12.f = -this.b.P[3].e();
            } else {
                eq1 h6 = h98.h(g3118.P[2]);
                eq1 h7 = h98.h(this.b.P[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.b.D) {
                c(eq1, eq13, 1, this.l);
            }
        } else if (h216 != null) {
            eq1 h8 = h98.h(h215);
            if (h8 != null) {
                h98.b(eq13, h8, this.b.P[2].e());
                c(eq12, eq13, 1, dv1);
                if (this.b.D) {
                    c(eq1, eq13, 1, this.l);
                }
                if (this.d == 3) {
                    g31 g3119 = this.b;
                    if (g3119.V > 0.0f) {
                        n23 n23 = g3119.d;
                        if (n23.d == 3) {
                            n23.e.k.add(dv1);
                            arrayList2.add(this.b.d.e);
                            dv1.a = this;
                        }
                    }
                }
            }
        } else {
            h21 h217 = h21Arr2[3];
            if (h217.f != null) {
                eq1 h9 = h98.h(h217);
                if (h9 != null) {
                    h98.b(eq12, h9, -this.b.P[3].e());
                    c(eq13, eq12, -1, dv1);
                    if (this.b.D) {
                        c(eq1, eq13, 1, this.l);
                    }
                }
            } else {
                h21 h218 = h21Arr2[4];
                if (h218.f != null) {
                    eq1 h10 = h98.h(h218);
                    if (h10 != null) {
                        h98.b(eq1, h10, 0);
                        c(eq13, eq1, -1, this.l);
                        c(eq12, eq13, 1, dv1);
                    }
                } else if (!(g3117 instanceof pz2) && (g31 = g3117.S) != null) {
                    h98.b(eq13, g31.e.h, g3117.p());
                    c(eq12, eq13, 1, dv1);
                    if (this.b.D) {
                        c(eq1, eq13, 1, this.l);
                    }
                    if (this.d == 3) {
                        g31 g3120 = this.b;
                        if (g3120.V > 0.0f) {
                            n23 n232 = g3120.d;
                            if (n232.d == 3) {
                                n232.e.k.add(dv1);
                                arrayList2.add(this.b.d.e);
                                dv1.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            dv1.c = true;
        }
    }

    public final void e() {
        eq1 eq1 = this.h;
        if (eq1.j) {
            this.b.Y = eq1.g;
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    public final boolean k() {
        if (this.d != 3 || this.b.r == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.g = false;
        eq1 eq1 = this.h;
        eq1.c();
        eq1.j = false;
        eq1 eq12 = this.i;
        eq12.c();
        eq12.j = false;
        eq1 eq13 = this.k;
        eq13.c();
        eq13.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.g0;
    }
}
