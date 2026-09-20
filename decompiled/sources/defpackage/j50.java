package defpackage;

/* renamed from: j50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j50 extends pz2 {
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final boolean O() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            g31 g31 = this.p0[i4];
            if ((this.s0 || g31.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !g31.x()) || (((i3 = this.r0) == 2 || i3 == 3) && !g31.y()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.q0; i6++) {
            g31 g312 = this.p0[i6];
            if (this.s0 || g312.c()) {
                if (!z2) {
                    int i7 = this.r0;
                    if (i7 == 0) {
                        i5 = g312.i(2).d();
                    } else if (i7 == 1) {
                        i5 = g312.i(4).d();
                    } else if (i7 == 2) {
                        i5 = g312.i(3).d();
                    } else if (i7 == 3) {
                        i5 = g312.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.r0;
                if (i8 == 0) {
                    i5 = Math.min(i5, g312.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, g312.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, g312.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, g312.i(5).d());
                }
            }
        }
        int i9 = i5 + this.t0;
        int i10 = this.r0;
        if (i10 == 0 || i10 == 1) {
            E(i9, i9);
        } else {
            F(i9, i9);
        }
        this.u0 = true;
        return true;
    }

    public final int P() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        return -1;
    }

    public final void b(x64 x64, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        x64 x642 = x64;
        h21[] h21Arr = this.P;
        h21 h21 = this.H;
        h21Arr[0] = h21;
        int i5 = 2;
        h21 h212 = this.I;
        h21Arr[2] = h212;
        h21 h213 = this.J;
        h21Arr[1] = h213;
        h21 h214 = this.K;
        h21Arr[3] = h214;
        for (h21 h215 : h21Arr) {
            h215.i = x642.k(h215);
        }
        int i6 = this.r0;
        if (i6 >= 0 && i6 < 4) {
            h21 h216 = h21Arr[i6];
            if (!this.u0) {
                O();
            }
            if (this.u0) {
                this.u0 = false;
                int i7 = this.r0;
                if (i7 == 0 || i7 == 1) {
                    x642.d(h21.i, this.X);
                    x642.d(h213.i, this.X);
                } else if (i7 == 2 || i7 == 3) {
                    x642.d(h212.i, this.Y);
                    x642.d(h214.i, this.Y);
                }
            } else {
                int i8 = 0;
                while (true) {
                    if (i8 >= this.q0) {
                        z2 = false;
                        break;
                    }
                    g31 g31 = this.p0[i8];
                    if ((this.s0 || g31.c()) && ((((i4 = this.r0) == 0 || i4 == 1) && g31.o0[0] == 3 && g31.H.f != null && g31.J.f != null) || ((i4 == 2 || i4 == 3) && g31.o0[1] == 3 && g31.I.f != null && g31.K.f != null))) {
                        z2 = true;
                    } else {
                        i8++;
                    }
                }
                if (h21.g() || h213.g()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (h212.g() || h214.g()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z2 || (((i3 = this.r0) != 0 || !z3) && ((i3 != 2 || !z4) && ((i3 != 1 || !z3) && (i3 != 3 || !z4))))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    i = 4;
                } else {
                    i = 5;
                }
                int i9 = 0;
                while (i9 < this.q0) {
                    g31 g312 = this.p0[i9];
                    if (this.s0 || g312.c()) {
                        ly6 k = x642.k(g312.P[this.r0]);
                        h21[] h21Arr2 = g312.P;
                        int i10 = this.r0;
                        h21 h217 = h21Arr2[i10];
                        h217.i = k;
                        h21 h218 = h217.f;
                        if (h218 == null || h218.d != this) {
                            i2 = 0;
                        } else {
                            i2 = h217.g;
                        }
                        if (i10 == 0 || i10 == i5) {
                            ns l = x642.l();
                            ly6 m = x642.m();
                            m.z = 0;
                            l.c(h216.i, k, m, this.t0 - i2);
                            x642.c(l);
                        } else {
                            ns l2 = x642.l();
                            ly6 m2 = x642.m();
                            m2.z = 0;
                            l2.b(h216.i, k, m2, this.t0 + i2);
                            x642.c(l2);
                        }
                        x642.e(h216.i, k, this.t0 + i2, i);
                    }
                    i9++;
                    i5 = 2;
                }
                int i11 = this.r0;
                if (i11 == 0) {
                    x642.e(h213.i, h21.i, 0, 8);
                    x642.e(h21.i, this.S.J.i, 0, 4);
                    x642.e(h21.i, this.S.H.i, 0, 0);
                } else if (i11 == 1) {
                    x642.e(h21.i, h213.i, 0, 8);
                    x642.e(h21.i, this.S.H.i, 0, 4);
                    x642.e(h21.i, this.S.J.i, 0, 0);
                } else if (i11 == 2) {
                    x642.e(h214.i, h212.i, 0, 8);
                    x642.e(h212.i, this.S.K.i, 0, 4);
                    x642.e(h212.i, this.S.I.i, 0, 0);
                } else if (i11 == 3) {
                    x642.e(h212.i, h214.i, 0, 8);
                    x642.e(h212.i, this.S.I.i, 0, 4);
                    x642.e(h212.i, this.S.K.i, 0, 0);
                }
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final String toString() {
        String l = f21.l(new StringBuilder("[Barrier] "), this.g0, " {");
        for (int i = 0; i < this.q0; i++) {
            g31 g31 = this.p0[i];
            if (i > 0) {
                l = l.concat(", ");
            }
            StringBuilder o = b81.o(l);
            o.append(g31.g0);
            l = o.toString();
        }
        return l.concat("}");
    }

    public final boolean x() {
        return this.u0;
    }

    public final boolean y() {
        return this.u0;
    }
}
