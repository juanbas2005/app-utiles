package defpackage;

import java.util.ArrayList;

/* renamed from: n23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n23 extends h98 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0243, code lost:
        if (r5 != 1) goto L_0x02a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    public final void a(aq1 aq1) {
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        float f2;
        float f3;
        float f4;
        if (b81.B(this.j) != 3) {
            dv1 dv1 = this.e;
            boolean z6 = dv1.j;
            eq1 eq1 = this.h;
            eq1 eq12 = this.i;
            if (!z6 && this.d == 3) {
                g31 g31 = this.b;
                int i2 = g31.q;
                if (i2 == 2) {
                    f = 0.5f;
                    g31 g312 = g31.S;
                    if (g312 != null) {
                        dv1 dv12 = g312.d.e;
                        if (dv12.j) {
                            dv1.d((int) ((((float) dv12.g) * g31.v) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    int i3 = g31.r;
                    if (i3 == 0 || i3 == 3) {
                        p48 p48 = g31.e;
                        eq1 eq13 = p48.h;
                        eq1 eq14 = p48.i;
                        if (g31.H.f != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (g31.I.f != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (g31.J.f != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (g31.K.f != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        f = 0.5f;
                        int i4 = g31.W;
                        if (z2 && z3 && z4 && z5) {
                            float f5 = g31.V;
                            boolean z7 = eq13.j;
                            ArrayList arrayList = eq13.l;
                            int[] iArr = k;
                            if (!z7 || !eq14.j) {
                                float f6 = f5;
                                int i5 = i4;
                                if (eq1.j && eq12.j) {
                                    if (eq13.c && eq14.c) {
                                        m(iArr, eq1.g + eq1.f, eq12.g - eq12.f, ((eq1) arrayList.get(0)).g + eq13.f, ((eq1) eq14.l.get(0)).g - eq14.f, f6, i5);
                                        dv1.d(iArr[0]);
                                        this.b.e.e.d(iArr[1]);
                                    } else {
                                        return;
                                    }
                                }
                                if (eq1.c && eq12.c && eq13.c && eq14.c) {
                                    m(iArr, ((eq1) eq1.l.get(0)).g + eq1.f, ((eq1) eq12.l.get(0)).g - eq12.f, ((eq1) arrayList.get(0)).g + eq13.f, ((eq1) eq14.l.get(0)).g - eq14.f, f6, i5);
                                    dv1.d(iArr[0]);
                                    this.b.e.e.d(iArr[1]);
                                } else {
                                    return;
                                }
                            } else if (eq1.c && eq12.c) {
                                m(iArr, ((eq1) eq1.l.get(0)).g + eq1.f, ((eq1) eq12.l.get(0)).g - eq12.f, eq13.g + eq13.f, eq14.g - eq14.f, f5, i4);
                                dv1.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            } else {
                                return;
                            }
                        } else if (!z2 || !z4) {
                            if (z3 && z5) {
                                if (eq13.c && eq14.c) {
                                    float f7 = g31.V;
                                    int i6 = ((eq1) eq13.l.get(0)).g + eq13.f;
                                    int i7 = ((eq1) eq14.l.get(0)).g - eq14.f;
                                    if (i4 != -1) {
                                        if (i4 == 0) {
                                            int g = g(i7 - i6, 1);
                                            int i8 = (int) ((((float) g) * f7) + 0.5f);
                                            int g2 = g(i8, 0);
                                            if (i8 != g2) {
                                                g = (int) ((((float) g2) / f7) + 0.5f);
                                            }
                                            dv1.d(g2);
                                            this.b.e.e.d(g);
                                        }
                                    }
                                    int g3 = g(i7 - i6, 1);
                                    int i9 = (int) ((((float) g3) / f7) + 0.5f);
                                    int g4 = g(i9, 0);
                                    if (i9 != g4) {
                                        g3 = (int) ((((float) g4) * f7) + 0.5f);
                                    }
                                    dv1.d(g4);
                                    this.b.e.e.d(g3);
                                } else {
                                    return;
                                }
                            }
                        } else if (eq1.c && eq12.c) {
                            float f8 = g31.V;
                            int i10 = ((eq1) eq1.l.get(0)).g + eq1.f;
                            int i11 = ((eq1) eq12.l.get(0)).g - eq12.f;
                            if (i4 == -1 || i4 == 0) {
                                int g5 = g(i11 - i10, 0);
                                int i12 = (int) ((((float) g5) * f8) + 0.5f);
                                int g6 = g(i12, 1);
                                if (i12 != g6) {
                                    g5 = (int) ((((float) g6) / f8) + 0.5f);
                                }
                                dv1.d(g5);
                                this.b.e.e.d(g6);
                            } else if (i4 == 1) {
                                int g7 = g(i11 - i10, 0);
                                int i13 = (int) ((((float) g7) / f8) + 0.5f);
                                int g8 = g(i13, 1);
                                if (i13 != g8) {
                                    g7 = (int) ((((float) g8) * f8) + 0.5f);
                                }
                                dv1.d(g7);
                                this.b.e.e.d(g8);
                            }
                        } else {
                            return;
                        }
                    } else {
                        int i14 = g31.W;
                        if (i14 == -1) {
                            f2 = (float) g31.e.e.g;
                            f3 = g31.V;
                        } else if (i14 == 0) {
                            f4 = ((float) g31.e.e.g) / g31.V;
                            i = (int) (f4 + 0.5f);
                            dv1.d(i);
                        } else if (i14 != 1) {
                            i = 0;
                            dv1.d(i);
                        } else {
                            f2 = (float) g31.e.e.g;
                            f3 = g31.V;
                        }
                        f4 = f2 * f3;
                        i = (int) (f4 + 0.5f);
                        dv1.d(i);
                    }
                }
                z = eq1.c;
                ArrayList arrayList2 = eq1.l;
                if (!z) {
                    boolean z8 = eq12.c;
                    ArrayList arrayList3 = eq12.l;
                    if (z8) {
                        if (!eq1.j || !eq12.j || !dv1.j) {
                            if (!dv1.j && this.d == 3) {
                                g31 g313 = this.b;
                                if (g313.q == 0 && !g313.u()) {
                                    int i15 = ((eq1) arrayList2.get(0)).g + eq1.f;
                                    int i16 = ((eq1) arrayList3.get(0)).g + eq12.f;
                                    eq1.d(i15);
                                    eq12.d(i16);
                                    dv1.d(i16 - i15);
                                    return;
                                }
                            }
                            if (!dv1.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                                int min = Math.min((((eq1) arrayList3.get(0)).g + eq12.f) - (((eq1) arrayList2.get(0)).g + eq1.f), dv1.m);
                                g31 g314 = this.b;
                                int i17 = g314.u;
                                int max = Math.max(g314.t, min);
                                if (i17 > 0) {
                                    max = Math.min(i17, max);
                                }
                                dv1.d(max);
                            }
                            if (dv1.j) {
                                eq1 eq15 = (eq1) arrayList2.get(0);
                                eq1 eq16 = (eq1) arrayList3.get(0);
                                int i18 = eq15.g;
                                int i19 = eq1.f + i18;
                                int i20 = eq16.g;
                                int i21 = eq12.f + i20;
                                float f9 = this.b.c0;
                                if (eq15 == eq16) {
                                    f9 = f;
                                } else {
                                    i18 = i19;
                                    i20 = i21;
                                }
                                eq1.d((int) ((((float) ((i20 - i18) - dv1.g)) * f9) + ((float) i18) + f));
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
            f = 0.5f;
            z = eq1.c;
            ArrayList arrayList22 = eq1.l;
            if (!z) {
            }
        } else {
            g31 g315 = this.b;
            l(g315.H, g315.J, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        r0 = r13.b;
     */
    public final void d() {
        g31 g31;
        g31 g312;
        g31 g313;
        int i;
        g31 g314;
        int i2;
        g31 g315 = this.b;
        boolean z = g315.a;
        dv1 dv1 = this.e;
        if (z) {
            dv1.d(g315.n());
        }
        boolean z2 = dv1.j;
        ArrayList arrayList = dv1.k;
        ArrayList arrayList2 = dv1.l;
        eq1 eq1 = this.i;
        eq1 eq12 = this.h;
        if (!z2) {
            g31 g316 = this.b;
            int i3 = g316.o0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (g314 = g316.S) != null && ((i2 = g314.o0[0]) == 1 || i2 == 4)) {
                    int n = (g314.n() - this.b.H.e()) - this.b.J.e();
                    h98.b(eq12, g314.d.h, this.b.H.e());
                    h98.b(eq1, g314.d.i, -this.b.J.e());
                    dv1.d(n);
                    return;
                } else if (i3 == 1) {
                    dv1.d(g316.n());
                }
            }
        } else if (this.d == 4 && (g313 = g312.S) != null && ((i = g313.o0[0]) == 1 || i == 4)) {
            h98.b(eq12, g313.d.h, g312.H.e());
            h98.b(eq1, g313.d.i, -this.b.J.e());
            return;
        }
        if (dv1.j) {
            g31 g317 = this.b;
            if (g317.a) {
                h21[] h21Arr = g317.P;
                h21 h21 = h21Arr[0];
                h21 h212 = h21.f;
                if (h212 != null && h21Arr[1].f != null) {
                    boolean u = g317.u();
                    g31 g318 = this.b;
                    if (u) {
                        eq12.f = g318.P[0].e();
                        eq1.f = -this.b.P[1].e();
                        return;
                    }
                    eq1 h = h98.h(g318.P[0]);
                    if (h != null) {
                        h98.b(eq12, h, this.b.P[0].e());
                    }
                    eq1 h2 = h98.h(this.b.P[1]);
                    if (h2 != null) {
                        h98.b(eq1, h2, -this.b.P[1].e());
                    }
                    eq12.b = true;
                    eq1.b = true;
                    return;
                } else if (h212 != null) {
                    eq1 h3 = h98.h(h21);
                    if (h3 != null) {
                        h98.b(eq12, h3, this.b.P[0].e());
                        h98.b(eq1, eq12, dv1.g);
                        return;
                    }
                    return;
                } else {
                    h21 h213 = h21Arr[1];
                    if (h213.f != null) {
                        eq1 h4 = h98.h(h213);
                        if (h4 != null) {
                            h98.b(eq1, h4, -this.b.P[1].e());
                            h98.b(eq12, eq1, -dv1.g);
                            return;
                        }
                        return;
                    } else if (!(g317 instanceof pz2) && g317.S != null && g317.i(7).f == null) {
                        g31 g319 = this.b;
                        h98.b(eq12, g319.S.d.h, g319.o());
                        h98.b(eq1, eq12, dv1.g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.d == 3) {
            g31 g3110 = this.b;
            int i4 = g3110.q;
            if (i4 == 2) {
                g31 g3111 = g3110.S;
                if (g3111 != null) {
                    dv1 dv12 = g3111.e.e;
                    arrayList2.add(dv12);
                    dv12.k.add(dv1);
                    dv1.b = true;
                    arrayList.add(eq12);
                    arrayList.add(eq1);
                }
            } else if (i4 == 3) {
                if (g3110.r == 3) {
                    eq12.a = this;
                    eq1.a = this;
                    p48 p48 = g3110.e;
                    p48.h.a = this;
                    p48.i.a = this;
                    dv1.a = this;
                    if (g3110.v()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(dv1);
                        p48 p482 = this.b.e;
                        p482.e.a = this;
                        arrayList2.add(p482.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(dv1);
                        this.b.e.i.k.add(dv1);
                    } else {
                        boolean u2 = this.b.u();
                        g31 g3112 = this.b;
                        if (u2) {
                            g3112.e.e.l.add(dv1);
                            arrayList.add(this.b.e.e);
                        } else {
                            g3112.e.e.l.add(dv1);
                        }
                    }
                } else {
                    dv1 dv13 = g3110.e.e;
                    arrayList2.add(dv13);
                    dv13.k.add(dv1);
                    this.b.e.h.k.add(dv1);
                    this.b.e.i.k.add(dv1);
                    dv1.b = true;
                    arrayList.add(eq12);
                    arrayList.add(eq1);
                    eq12.l.add(dv1);
                    eq1.l.add(dv1);
                }
            }
        }
        g31 g3113 = this.b;
        h21[] h21Arr2 = g3113.P;
        h21 h214 = h21Arr2[0];
        h21 h215 = h214.f;
        if (h215 != null && h21Arr2[1].f != null) {
            boolean u3 = g3113.u();
            g31 g3114 = this.b;
            if (u3) {
                eq12.f = g3114.P[0].e();
                eq1.f = -this.b.P[1].e();
                return;
            }
            eq1 h5 = h98.h(g3114.P[0]);
            eq1 h6 = h98.h(this.b.P[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
        } else if (h215 != null) {
            eq1 h7 = h98.h(h214);
            if (h7 != null) {
                h98.b(eq12, h7, this.b.P[0].e());
                c(eq1, eq12, 1, dv1);
            }
        } else {
            h21 h216 = h21Arr2[1];
            if (h216.f != null) {
                eq1 h8 = h98.h(h216);
                if (h8 != null) {
                    h98.b(eq1, h8, -this.b.P[1].e());
                    c(eq12, eq1, -1, dv1);
                }
            } else if (!(g3113 instanceof pz2) && (g31 = g3113.S) != null) {
                h98.b(eq12, g31.d.h, g3113.o());
                c(eq1, eq12, 1, dv1);
            }
        }
    }

    public final void e() {
        eq1 eq1 = this.h;
        if (eq1.j) {
            this.b.X = eq1.g;
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    public final boolean k() {
        if (this.d != 3 || this.b.q == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.g = false;
        eq1 eq1 = this.h;
        eq1.c();
        eq1.j = false;
        eq1 eq12 = this.i;
        eq12.c();
        eq12.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.g0;
    }
}
