package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.CancellationException;

/* renamed from: v0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class v0 extends wo1 implements tk5, us3, dk6, ry0, h35, bb3, iv2 {
    public ap4 M;
    public oa3 N;
    public boolean O;
    public String P;
    public s86 Q;
    public boolean R;
    public sr2 S;
    public final xk2 T;
    public oa3 U;
    public kv2 V;
    public String W = "idle";
    public vo1 X;
    public eo5 Y;
    public r23 Z;
    public final dp4 a0;
    public long b0;
    public eo5 c0;
    public ap4 d0;
    public boolean e0;
    public h27 f0;

    public v0(ap4 ap4, oa3 oa3, boolean z, boolean z2, String str, s86 s86, sr2 sr2) {
        this.M = ap4;
        this.N = oa3;
        this.O = z;
        this.P = str;
        this.Q = s86;
        this.R = z2;
        this.S = sr2;
        boolean z3 = false;
        this.T = new xk2(ap4, 0, new o0(1, this, v0.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = ic4.a;
        this.a0 = new dp4(6);
        this.b0 = 0;
        ap4 ap42 = this.M;
        this.d0 = ap42;
        this.e0 = ap42 == null ? true : z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    public final boolean B(KeyEvent keyEvent) {
        boolean z;
        g1();
        long x = rd3.x(keyEvent);
        boolean z2 = this.R;
        dp4 dp4 = this.a0;
        if (!z2 || rd3.A(keyEvent) != 2 || !h49.F(keyEvent)) {
            if (this.R && rd3.A(keyEvent) == 1 && h49.F(keyEvent)) {
                eo5 eo5 = (eo5) dp4.f(x);
                if (eo5 != null) {
                    if (this.M != null) {
                        ar7.H(J0(), (e81) null, (r81) null, new t0(this, eo5, (f61) null, 3), 3);
                    }
                    j1(keyEvent);
                }
                if (eo5 != null) {
                    return true;
                }
            }
            return false;
        }
        if (!dp4.b(x)) {
            eo5 eo52 = new eo5(this.b0);
            dp4.g(x, eo52);
            if (this.M != null) {
                ar7.H(J0(), (e81) null, (r81) null, new t0(this, eo52, (f61) null, 2), 3);
            }
            z = true;
        } else {
            z = false;
        }
        if (!i1(keyEvent) && !z) {
            return false;
        }
        return true;
    }

    public final void D0(ok6 ok6) {
        s86 s86 = this.Q;
        if (s86 != null) {
            mk6.f(ok6, s86.a);
        }
        String str = this.P;
        l0 l0Var = new l0(this, 1);
        yr3[] yr3Arr = mk6.a;
        ok6.f(zj6.b, new h4(str, l0Var));
        if (this.R) {
            this.T.D0(ok6);
        } else {
            ok6.f(jk6.j, vs7.a);
        }
        Y0(ok6);
    }

    public final boolean G0() {
        return true;
    }

    public final boolean K0() {
        return false;
    }

    public final void N0() {
        m0();
        if (!this.e0) {
            g1();
        }
        if (this.R) {
            V0(this.T);
        }
    }

    public final String O() {
        return this.W;
    }

    public final void O0() {
        a1();
        if (this.d0 == null) {
            this.M = null;
        }
        vo1 vo1 = this.X;
        if (vo1 != null) {
            W0(vo1);
        }
        this.X = null;
        kv2 kv2 = this.V;
        if (kv2 != null) {
            W0(kv2);
        }
        this.V = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h06] */
    public final boolean Z0() {
        ? obj = new Object();
        h75.t(this, kv2.L, new vz1(1, new mr0(0, obj)));
        if (obj.w == null) {
            int i = pr0.b;
            ViewParent parent = su0.K(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    public final void a1() {
        ap4 ap4 = this.M;
        dp4 dp4 = this.a0;
        if (ap4 != null) {
            eo5 eo5 = this.Y;
            if (eo5 != null) {
                ap4.c(new do5(eo5));
            }
            eo5 eo52 = this.c0;
            if (eo52 != null) {
                ap4.c(new do5(eo52));
            }
            r23 r23 = this.Z;
            if (r23 != null) {
                ap4.c(new s23(r23));
            }
            Object[] objArr = dp4.c;
            long[] jArr = dp4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ap4.c(new do5((eo5) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        this.Y = null;
        this.c0 = null;
        this.Z = null;
        dp4.a();
    }

    public final long b1(long j) {
        long A0 = rc9.O0(this).T.A0(((g58) h49.w(this, xy0.u)).d());
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (A0 & 4294967295L)) - ((float) ((int) (j & 4294967295L)))) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (A0 >> 32)) - ((float) ((int) (j >> 32)))) / 2.0f)) << 32);
    }

    public final void c1(boolean z) {
        eo5 eo5;
        mw1 mw1;
        ap4 ap4 = this.M;
        if (ap4 != null) {
            h27 h27 = this.f0;
            if (h27 == null || !h27.l()) {
                if (z) {
                    eo5 = this.c0;
                } else {
                    eo5 = this.Y;
                }
                if (eo5 != null) {
                    do5 do5 = new do5(eo5);
                    el3 el3 = (el3) ((ig0) J0()).x.a0(me6.E);
                    if (el3 != null) {
                        mw1 = el3.v(new m0(0, ap4, do5));
                    } else {
                        mw1 = null;
                    }
                    ar7.H(J0(), (e81) null, (r81) null, new p0(ap4, do5, mw1, (f61) null, 0), 3);
                }
            } else {
                h27 h272 = this.f0;
                if (h272 != null) {
                    h272.o((CancellationException) null);
                }
            }
            if (z) {
                this.c0 = null;
            } else {
                this.Y = null;
            }
        }
    }

    public final void d1(boolean z, long j) {
        eo5 eo5;
        ap4 ap4 = this.M;
        if (ap4 != null) {
            h27 h27 = this.f0;
            if (h27 == null || !h27.l()) {
                if (z) {
                    eo5 = this.c0;
                } else {
                    eo5 = this.Y;
                }
                if (eo5 != null) {
                    ar7.H(J0(), (e81) null, (r81) null, new r0(eo5, ap4, (f61) null), 3);
                }
            } else {
                h27.o((CancellationException) null);
                ar7.H(J0(), (e81) null, (r81) null, new q0((Object) h27, j, (Object) ap4, (f61) null, 0), 3);
            }
            if (z) {
                this.c0 = null;
            } else {
                this.Y = null;
            }
        }
    }

    public final void e1(ta3 ta3) {
        ap4 ap4 = this.M;
        if (ap4 != null) {
            eo5 eo5 = new eo5(ta3.c);
            if (Z0()) {
                this.f0 = ar7.H(J0(), (e81) null, (r81) null, new s0(ap4, eo5, this, (f61) null, 0), 3);
                return;
            }
            this.c0 = eo5;
            ar7.H(J0(), (e81) null, (r81) null, new r0(ap4, eo5, (f61) null, 1), 3);
        }
    }

    public final void f1(qk5 qk5) {
        ap4 ap4 = this.M;
        if (ap4 != null) {
            eo5 eo5 = new eo5(qk5.c);
            if (Z0()) {
                this.f0 = ar7.H(J0(), (e81) null, (r81) null, new s0(ap4, eo5, this, (f61) null, 1), 3);
                return;
            }
            this.Y = eo5;
            ar7.H(J0(), (e81) null, (r81) null, new r0(ap4, eo5, (f61) null, 2), 3);
        }
    }

    public final void g1() {
        oa3 oa3;
        if (this.X == null) {
            if (this.O) {
                oa3 = this.U;
            } else {
                oa3 = this.N;
            }
            if (oa3 != null) {
                if (this.M == null) {
                    this.M = new ap4();
                }
                this.T.Z0(this.M);
                ap4 ap4 = this.M;
                ap4.getClass();
                vo1 a = oa3.a(ap4);
                V0(a);
                this.X = a;
            }
        }
    }

    public abstract boolean i1(KeyEvent keyEvent);

    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    public abstract void j1(KeyEvent keyEvent);

    public final void k1() {
        ny6 ny6 = (ny6) h49.w(this, xy0.w);
        if (ny6 != null) {
            ny6.a();
        }
        this.S.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        if (r3.X == null) goto L_0x0086;
     */
    public final void l1(ap4 ap4, oa3 oa3, boolean z, boolean z2, String str, s86 s86, sr2 sr2) {
        boolean z3;
        boolean z4;
        vo1 vo1;
        boolean z5 = true;
        boolean z6 = false;
        if (!sg3.e(this.d0, ap4)) {
            a1();
            this.d0 = ap4;
            this.M = ap4;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!sg3.e(this.N, oa3)) {
            this.N = oa3;
            z3 = true;
        }
        if (this.O != z) {
            this.O = z;
            if (z) {
                m0();
            }
            z3 = true;
        }
        boolean z7 = this.R;
        xk2 xk2 = this.T;
        if (z7 != z2) {
            if (z2) {
                V0(xk2);
            } else {
                W0(xk2);
                a1();
            }
            g75.D(this);
            if (!z2) {
                kv2 kv2 = this.V;
                if (kv2 != null) {
                    W0(kv2);
                }
                this.V = null;
                this.W = "idle";
            }
            this.R = z2;
        }
        if (!sg3.e(this.P, str)) {
            this.P = str;
            g75.D(this);
        }
        if (!sg3.e(this.Q, s86)) {
            this.Q = s86;
            g75.D(this);
        }
        this.S = sr2;
        boolean z8 = this.e0;
        ap4 ap42 = this.d0;
        if (ap42 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z8 != z4) {
            if (ap42 == null) {
                z6 = true;
            }
            this.e0 = z6;
            if (!z6) {
            }
        }
        z5 = z3;
        if (z5 && ((vo1 = this.X) != null || !this.e0)) {
            if (vo1 != null) {
                W0(vo1);
            }
            this.X = null;
            g1();
        }
        xk2.Z0(this.M);
    }

    public final void m0() {
        if (this.O) {
            i35.o(this, new l0(this, 0));
        }
    }

    public void y(kk5 kk5, lk5 lk5, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.b0 = (((long) Float.floatToRawIntBits((float) ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) ((int) (j2 >> 32)))) << 32);
        g1();
        if (this.R) {
            if (this.V == null) {
                kv2 kv2 = new kv2(this);
                V0(kv2);
                this.V = kv2;
            }
            if (lk5 == lk5.x) {
                int i = kk5.f;
                if (i == 4) {
                    ar7.H(J0(), (e81) null, (r81) null, new u0(this, (f61) null, 0), 3);
                } else if (i == 5) {
                    ar7.H(J0(), (e81) null, (r81) null, new u0(this, (f61) null, 1), 3);
                }
            }
        }
    }

    public void h1() {
    }

    public void Y0(ok6 ok6) {
    }
}
