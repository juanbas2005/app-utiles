package defpackage;

import java.util.ArrayList;

/* renamed from: zx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zx2 extends g31 {
    public float p0 = -1.0f;
    public int q0 = -1;
    public int r0 = -1;
    public h21 s0 = this.I;
    public int t0;
    public boolean u0;

    public zx2() {
        this.t0 = 0;
        this.Q.clear();
        this.Q.add(this.s0);
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            this.P[i] = this.s0;
        }
    }

    public final void L(x64 x64, boolean z) {
        if (this.S != null) {
            h21 h21 = this.s0;
            x64.getClass();
            int n = x64.n(h21);
            if (this.t0 == 1) {
                this.X = n;
                this.Y = 0;
                G(this.S.k());
                J(0);
                return;
            }
            this.X = 0;
            this.Y = n;
            J(this.S.n());
            G(0);
        }
    }

    public final void M(int i) {
        this.s0.l(i);
        this.u0 = true;
    }

    public final void N(int i) {
        if (this.t0 != i) {
            this.t0 = i;
            ArrayList arrayList = this.Q;
            arrayList.clear();
            if (this.t0 == 1) {
                this.s0 = this.H;
            } else {
                this.s0 = this.I;
            }
            arrayList.add(this.s0);
            h21[] h21Arr = this.P;
            int length = h21Arr.length;
            for (int i2 = 0; i2 < length; i2++) {
                h21Arr[i2] = this.s0;
            }
        }
    }

    public final void b(x64 x64, boolean z) {
        boolean z2;
        h31 h31 = (h31) this.S;
        if (h31 != null) {
            h21 i = h31.i(2);
            h21 i2 = h31.i(4);
            g31 g31 = this.S;
            boolean z3 = true;
            if (g31 == null || g31.o0[0] != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.t0 == 0) {
                i = h31.i(3);
                i2 = h31.i(5);
                g31 g312 = this.S;
                if (g312 == null || g312.o0[1] != 2) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.u0) {
                h21 h21 = this.s0;
                if (h21.c) {
                    ly6 k = x64.k(h21);
                    x64.d(k, this.s0.d());
                    if (this.q0 != -1) {
                        if (z2) {
                            x64.f(x64.k(i2), k, 0, 5);
                        }
                    } else if (this.r0 != -1 && z2) {
                        ly6 k2 = x64.k(i2);
                        x64.f(k, x64.k(i), 0, 5);
                        x64.f(k2, k, 0, 5);
                    }
                    this.u0 = false;
                    return;
                }
            }
            if (this.q0 != -1) {
                ly6 k3 = x64.k(this.s0);
                x64.e(k3, x64.k(i), this.q0, 8);
                if (z2) {
                    x64.f(x64.k(i2), k3, 0, 5);
                }
            } else if (this.r0 != -1) {
                ly6 k4 = x64.k(this.s0);
                ly6 k5 = x64.k(i2);
                x64.e(k4, k5, -this.r0, 8);
                if (z2) {
                    x64.f(k4, x64.k(i), 0, 5);
                    x64.f(k5, k4, 0, 5);
                }
            } else if (this.p0 != -1.0f) {
                ly6 k6 = x64.k(this.s0);
                ly6 k7 = x64.k(i2);
                float f = this.p0;
                ns l = x64.l();
                l.d.g(k6, -1.0f);
                l.d.g(k7, f);
                x64.c(l);
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final h21 i(int i) {
        int B = b81.B(i);
        if (B != 1) {
            if (B != 2) {
                if (B != 3) {
                    if (B != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
    }

    public final boolean x() {
        return this.u0;
    }

    public final boolean y() {
        return this.u0;
    }
}
