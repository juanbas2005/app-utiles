package defpackage;

/* renamed from: ci2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ci2 {
    public int a;
    public g31 b = null;
    public int c = 0;
    public h21 d;
    public h21 e;
    public h21 f;
    public h21 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q;
    public final /* synthetic */ ei2 r;

    public ci2(ei2 ei2, int i2, h21 h21, h21 h212, h21 h213, h21 h214, int i3) {
        this.r = ei2;
        this.a = i2;
        this.d = h21;
        this.e = h212;
        this.f = h213;
        this.g = h214;
        this.h = ei2.v0;
        this.i = ei2.r0;
        this.j = ei2.w0;
        this.k = ei2.s0;
        this.q = i3;
    }

    public final void a(g31 g31) {
        int i2 = this.a;
        int i3 = this.q;
        int i4 = 0;
        ei2 ei2 = this.r;
        if (i2 == 0) {
            int P = ei2.P(g31, i3);
            if (g31.o0[0] == 3) {
                this.p++;
                P = 0;
            }
            int i5 = ei2.O0;
            if (g31.f0 != 8) {
                i4 = i5;
            }
            this.l = P + i4 + this.l;
            int O = ei2.O(g31, this.q);
            if (this.b == null || this.c < O) {
                this.b = g31;
                this.c = O;
                this.m = O;
            }
        } else {
            int P2 = ei2.P(g31, i3);
            int O2 = ei2.O(g31, this.q);
            if (g31.o0[1] == 3) {
                this.p++;
                O2 = 0;
            }
            int i6 = ei2.P0;
            if (g31.f0 != 8) {
                i4 = i6;
            }
            this.m = O2 + i4 + this.m;
            if (this.b == null || this.c < P2) {
                this.b = g31;
                this.c = P2;
                this.l = P2;
            }
        }
        this.o++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102  */
    public final void b(int i2, boolean z, boolean z2) {
        boolean z3;
        int i3;
        int i4;
        g31 g31;
        int i5;
        char c2;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = this.o;
        int i14 = 0;
        while (true) {
            ei2 ei2 = this.r;
            if (i14 < i13 && (i12 = this.n + i14) < ei2.a1) {
                g31 g312 = ei2.Z0[i12];
                if (g312 != null) {
                    g312.A();
                }
                i14++;
            } else if (i13 == 0 && this.b == null) {
                if (!z2 || i2 != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int i15 = -1;
                int i16 = -1;
                for (int i17 = 0; i17 < i13; i17++) {
                    if (z) {
                        i11 = (i13 - 1) - i17;
                    } else {
                        i11 = i17;
                    }
                    int i18 = this.n + i11;
                    if (i18 >= ei2.a1) {
                        break;
                    }
                    if (ei2.Z0[i18].f0 == 0) {
                        if (i15 == -1) {
                            i15 = i17;
                        }
                        i16 = i17;
                    }
                }
                int i19 = this.a;
                g31 g313 = this.b;
                if (i19 == 0) {
                    g313.i0 = ei2.D0;
                    h21 h21 = g313.K;
                    h21 h212 = g313.I;
                    int i20 = this.i;
                    if (i2 > 0) {
                        i20 += ei2.P0;
                    }
                    h212.a(this.e, i20);
                    if (z2) {
                        h21.a(this.g, this.k);
                    }
                    if (i2 > 0) {
                        this.e.d.K.a(h212, 0);
                    }
                    if (ei2.R0 == 3 && !g313.D) {
                        int i21 = 0;
                        while (true) {
                            if (i21 >= i13) {
                                break;
                            }
                            if (z) {
                                i10 = (i13 - 1) - i21;
                            } else {
                                i10 = i21;
                            }
                            int i22 = this.n + i10;
                            if (i22 >= ei2.a1) {
                                break;
                            }
                            g31 = ei2.Z0[i22];
                            if (g31.D) {
                                break;
                            }
                            i21++;
                        }
                    }
                    g31 = g313;
                    int i23 = 0;
                    g31 g314 = null;
                    while (i23 < i13) {
                        if (z) {
                            i5 = (i13 - 1) - i23;
                        } else {
                            i5 = i23;
                        }
                        int i24 = this.n + i5;
                        if (i24 < ei2.a1) {
                            g31 g315 = ei2.Z0[i24];
                            if (i23 == 0) {
                                g315.f(g315.H, this.d, this.h);
                            }
                            if (i5 == 0) {
                                int i25 = ei2.C0;
                                float f3 = ei2.I0;
                                if (z) {
                                    f3 = 1.0f - f3;
                                }
                                if (this.n == 0) {
                                    i9 = ei2.E0;
                                    i7 = i25;
                                    i8 = -1;
                                    if (i9 != -1) {
                                        f2 = ei2.K0;
                                        if (z) {
                                            f2 = 1.0f - f2;
                                        }
                                    }
                                    if (!z2 || (i9 = ei2.G0) == i8) {
                                        i6 = i7;
                                        g315.h0 = i6;
                                        g315.c0 = f2;
                                    } else {
                                        float f4 = ei2.M0;
                                        if (z) {
                                            f4 = 1.0f - f4;
                                        }
                                        f2 = f4;
                                    }
                                } else {
                                    i7 = i25;
                                    i8 = -1;
                                    if (!z2 || (i9 = ei2.G0) == i8) {
                                    }
                                }
                                i6 = i9;
                                g315.h0 = i6;
                                g315.c0 = f2;
                            }
                            if (i23 == i13 - 1) {
                                g315.f(g315.J, this.f, this.j);
                            }
                            if (g314 != null) {
                                h21 h213 = g314.J;
                                h21 h214 = g315.H;
                                h214.a(h213, ei2.O0);
                                if (i23 == i15) {
                                    int i26 = this.h;
                                    if (h214.h()) {
                                        h214.h = i26;
                                    }
                                }
                                h213.a(h214, 0);
                                if (i23 == i16 + 1) {
                                    int i27 = this.j;
                                    if (h213.h()) {
                                        h213.h = i27;
                                    }
                                }
                            }
                            if (g315 != g313) {
                                int i28 = ei2.R0;
                                c2 = 3;
                                if (i28 == 3 && g31.D && g315 != g31 && g315.D) {
                                    g315.L.a(g31.L, 0);
                                } else if (i28 == 0) {
                                    g315.I.a(h212, 0);
                                } else if (i28 == 1) {
                                    g315.K.a(h21, 0);
                                } else if (z3) {
                                    g315.I.a(this.e, this.i);
                                    g315.K.a(this.g, this.k);
                                } else {
                                    g315.I.a(h212, 0);
                                    g315.K.a(h21, 0);
                                }
                            } else {
                                c2 = 3;
                            }
                            i23++;
                            g314 = g315;
                            char c3 = c2;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                g313.h0 = ei2.C0;
                h21 h215 = g313.H;
                h21 h216 = g313.J;
                int i29 = this.h;
                if (i2 > 0) {
                    i29 += ei2.O0;
                }
                if (z) {
                    h216.a(this.f, i29);
                    if (z2) {
                        h215.a(this.d, this.j);
                    }
                    if (i2 > 0) {
                        this.f.d.H.a(h216, 0);
                    }
                } else {
                    h215.a(this.d, i29);
                    if (z2) {
                        h216.a(this.f, this.j);
                    }
                    if (i2 > 0) {
                        this.d.d.J.a(h215, 0);
                    }
                }
                g31 g316 = null;
                int i30 = 0;
                while (i30 < i13) {
                    int i31 = this.n + i30;
                    if (i31 < ei2.a1) {
                        g31 g317 = ei2.Z0[i31];
                        if (i30 == 0) {
                            g317.f(g317.I, this.e, this.i);
                            int i32 = ei2.D0;
                            float f5 = ei2.J0;
                            if (this.n == 0) {
                                i4 = ei2.F0;
                                i3 = -1;
                                if (i4 != -1) {
                                    f5 = ei2.L0;
                                }
                                if (z2 && (i4 = ei2.H0) != i3) {
                                    f5 = ei2.N0;
                                }
                                g317.i0 = i32;
                                g317.d0 = f5;
                            } else {
                                i3 = -1;
                                f5 = ei2.N0;
                            }
                            i32 = i4;
                            g317.i0 = i32;
                            g317.d0 = f5;
                        }
                        if (i30 == i13 - 1) {
                            g317.f(g317.K, this.g, this.k);
                        }
                        if (g316 != null) {
                            h21 h217 = g316.K;
                            h21 h218 = g317.I;
                            h218.a(h217, ei2.P0);
                            if (i30 == i15) {
                                int i33 = this.i;
                                if (h218.h()) {
                                    h218.h = i33;
                                }
                            }
                            h217.a(h218, 0);
                            if (i30 == i16 + 1) {
                                int i34 = this.k;
                                if (h217.h()) {
                                    h217.h = i34;
                                }
                            }
                        }
                        if (g317 != g313) {
                            int i35 = ei2.Q0;
                            if (!z) {
                                if (i35 == 0) {
                                    g317.H.a(h215, 0);
                                } else if (i35 == 1) {
                                    g317.J.a(h216, 0);
                                } else if (i35 == 2) {
                                    if (z3) {
                                        g317.H.a(this.d, this.h);
                                        g317.J.a(this.f, this.j);
                                    } else {
                                        g317.H.a(h215, 0);
                                        g317.J.a(h216, 0);
                                    }
                                }
                                i30++;
                                g316 = g317;
                            } else if (i35 == 0) {
                                g317.J.a(h216, 0);
                            } else if (i35 == 1) {
                                g317.H.a(h215, 0);
                            } else if (i35 == 2) {
                                g317.H.a(h215, 0);
                                g317.J.a(h216, 0);
                            }
                        }
                        i30++;
                        g316 = g317;
                    } else {
                        return;
                    }
                }
                return;
            } else {
                return;
            }
        }
        if (i13 == 0 && this.b == null) {
        }
    }

    public final int c() {
        int i2 = this.a;
        int i3 = this.m;
        if (i2 == 1) {
            return i3 - this.r.P0;
        }
        return i3;
    }

    public final int d() {
        int i2 = this.a;
        int i3 = this.l;
        if (i2 == 0) {
            return i3 - this.r.O0;
        }
        return i3;
    }

    public final void e(int i2) {
        ei2 ei2;
        int i3;
        int i4 = this.p;
        if (i4 != 0) {
            int i5 = this.o;
            int i6 = i2 / i4;
            int i7 = 0;
            while (true) {
                ei2 = this.r;
                if (i7 >= i5 || (i3 = this.n + i7) >= ei2.a1) {
                    this.l = 0;
                    this.m = 0;
                    this.b = null;
                    this.c = 0;
                    int i8 = this.o;
                    int i9 = 0;
                } else {
                    g31 g31 = ei2.Z0[i3];
                    if (this.a == 0) {
                        if (g31 != null) {
                            int[] iArr = g31.o0;
                            if (iArr[0] == 3 && g31.q == 0) {
                                ei2.Q(1, i6, iArr[1], g31.k(), g31);
                            }
                        }
                    } else if (g31 != null) {
                        int[] iArr2 = g31.o0;
                        if (iArr2[1] == 3 && g31.r == 0) {
                            int i10 = i6;
                            ei2.Q(iArr2[0], g31.n(), 1, i10, g31);
                            i6 = i10;
                        }
                    }
                    i7++;
                }
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i82 = this.o;
            int i92 = 0;
            while (i92 < i82) {
                int i11 = this.n + i92;
                if (i11 < ei2.a1) {
                    g31 g312 = ei2.Z0[i11];
                    if (this.a == 0) {
                        int n2 = g312.n();
                        int i12 = ei2.O0;
                        if (g312.f0 == 8) {
                            i12 = 0;
                        }
                        this.l = n2 + i12 + this.l;
                        int O = ei2.O(g312, this.q);
                        if (this.b == null || this.c < O) {
                            this.b = g312;
                            this.c = O;
                            this.m = O;
                        }
                    } else {
                        int P = ei2.P(g312, this.q);
                        int O2 = ei2.O(g312, this.q);
                        int i13 = ei2.P0;
                        if (g312.f0 == 8) {
                            i13 = 0;
                        }
                        this.m = O2 + i13 + this.m;
                        if (this.b == null || this.c < P) {
                            this.b = g312;
                            this.c = P;
                            this.l = P;
                        }
                    }
                    i92++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i2, h21 h21, h21 h212, h21 h213, h21 h214, int i3, int i4, int i5, int i6, int i7) {
        this.a = i2;
        this.d = h21;
        this.e = h212;
        this.f = h213;
        this.g = h214;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.q = i7;
    }
}
