package defpackage;

import java.util.ArrayList;

/* renamed from: ei2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ei2 extends pz2 {
    public m60 A0;
    public n21 B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public g31[] W0;
    public g31[] X0;
    public int[] Y0;
    public g31[] Z0;
    public int a1;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public int y0;
    public int z0;

    public final void N() {
        for (int i = 0; i < this.q0; i++) {
            g31 g31 = this.p0[i];
            if (g31 != null) {
                g31.E = true;
            }
        }
    }

    public final int O(g31 g31, int i) {
        g31 g312;
        if (g31 != null) {
            int[] iArr = g31.o0;
            if (iArr[1] == 3) {
                int i2 = g31.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (g31.y * ((float) i));
                        if (i3 != g31.k()) {
                            g31.g = true;
                            Q(iArr[0], g31.n(), 1, i3, g31);
                        }
                        return i3;
                    }
                    g312 = g31;
                    if (i2 == 1) {
                        return g312.k();
                    }
                    if (i2 == 3) {
                        return (int) ((((float) g312.n()) * g312.V) + 0.5f);
                    }
                }
            } else {
                g312 = g31;
            }
            return g312.k();
        }
        return 0;
    }

    public final int P(g31 g31, int i) {
        g31 g312;
        if (g31 != null) {
            int[] iArr = g31.o0;
            if (iArr[0] == 3) {
                int i2 = g31.q;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (g31.v * ((float) i));
                        if (i3 != g31.n()) {
                            g31.g = true;
                            Q(1, i3, iArr[1], g31.k(), g31);
                        }
                        return i3;
                    }
                    g312 = g31;
                    if (i2 == 1) {
                        return g312.n();
                    }
                    if (i2 == 3) {
                        return (int) ((((float) g312.k()) * g312.V) + 0.5f);
                    }
                }
            } else {
                g312 = g31;
            }
            return g312.n();
        }
        return 0;
    }

    public final void Q(int i, int i2, int i3, int i4, g31 g31) {
        n21 n21;
        g31 g312;
        m60 m60 = this.A0;
        while (true) {
            n21 = this.B0;
            if (n21 != null || (g312 = this.S) == null) {
                m60.a = i;
                m60.b = i3;
                m60.c = i2;
                m60.d = i4;
                n21.b(g31, m60);
                g31.J(m60.e);
                g31.G(m60.f);
                g31.D = m60.h;
                g31.D(m60.g);
            } else {
                this.B0 = ((h31) g312).t0;
            }
        }
        m60.a = i;
        m60.b = i3;
        m60.c = i2;
        m60.d = i4;
        n21.b(g31, m60);
        g31.J(m60.e);
        g31.G(m60.f);
        g31.D = m60.h;
        g31.D(m60.g);
    }

    public final void b(x64 x64, boolean z) {
        boolean z2;
        boolean z3;
        g31 g31;
        float f;
        int i;
        ArrayList arrayList = this.V0;
        super.b(x64, z);
        g31 g312 = this.S;
        if (g312 == null || !((h31) g312).u0) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i2 = this.S0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ci2 ci2 = (ci2) arrayList.get(i3);
                    if (i3 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ci2.b(i3, z2, z3);
                }
            } else if (!(i2 != 2 || this.Y0 == null || this.X0 == null || this.W0 == null)) {
                for (int i4 = 0; i4 < this.a1; i4++) {
                    this.Z0[i4].A();
                }
                int[] iArr = this.Y0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                float f2 = this.I0;
                g31 g313 = null;
                int i7 = 0;
                while (i7 < i5) {
                    if (z2) {
                        i = (i5 - i7) - 1;
                        f = 1.0f - this.I0;
                    } else {
                        f = f2;
                        i = i7;
                    }
                    g31 g314 = this.X0[i];
                    if (g314 != null) {
                        h21 h21 = g314.H;
                        if (g314.f0 != 8) {
                            if (i7 == 0) {
                                g314.f(h21, this.H, this.v0);
                                g314.h0 = this.C0;
                                g314.c0 = f;
                            }
                            if (i7 == i5 - 1) {
                                g314.f(g314.J, this.J, this.w0);
                            }
                            if (i7 > 0 && g313 != null) {
                                h21 h212 = g313.J;
                                g314.f(h21, h212, this.O0);
                                g313.f(h212, h21, 0);
                            }
                            g313 = g314;
                        }
                    }
                    i7++;
                    f2 = f;
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    g31 g315 = this.W0[i8];
                    if (g315 != null) {
                        h21 h213 = g315.I;
                        if (g315.f0 != 8) {
                            if (i8 == 0) {
                                g315.f(h213, this.I, this.r0);
                                g315.i0 = this.D0;
                                g315.d0 = this.J0;
                            }
                            if (i8 == i6 - 1) {
                                g315.f(g315.K, this.K, this.s0);
                            }
                            if (i8 > 0 && g313 != null) {
                                h21 h214 = g313.K;
                                g315.f(h213, h214, this.P0);
                                g313.f(h214, h213, 0);
                            }
                            g313 = g315;
                        }
                    }
                }
                for (int i9 = 0; i9 < i5; i9++) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = (i10 * i5) + i9;
                        if (this.U0 == 1) {
                            i11 = (i9 * i6) + i10;
                        }
                        g31[] g31Arr = this.Z0;
                        if (!(i11 >= g31Arr.length || (g31 = g31Arr[i11]) == null || g31.f0 == 8)) {
                            g31 g316 = this.X0[i9];
                            g31 g317 = this.W0[i10];
                            if (g31 != g316) {
                                g31.f(g31.H, g316.H, 0);
                                g31.f(g31.J, g316.J, 0);
                            }
                            if (g31 != g317) {
                                g31.f(g31.I, g317.I, 0);
                                g31.f(g31.K, g317.K, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((ci2) arrayList.get(0)).b(0, z2, true);
        }
        this.x0 = false;
    }
}
