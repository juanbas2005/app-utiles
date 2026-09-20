package defpackage;

import java.util.Arrays;
import java.util.concurrent.CancellationException;

/* renamed from: y57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y57 extends wo1 implements my3, gz1, ln7, ry0, h35, qy0 {
    public v57 M;
    public p57 N;
    public final n56 O;
    public z57 P = new z57();
    public z57 Q;
    public cx2 R;
    public hx4 S;
    public final o9 T = new o9(3, false);
    public cq4 U;
    public ef3 V;
    public ay5 W;
    public long X;
    public ey3 Y;
    public pq6 Z;
    public n85 a0;
    public kq6[] b0;
    public jc3[] c0;
    public kq6[] d0;
    public h02[] e0;
    public h27 f0;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, n56] */
    public y57(cq4 cq4, p57 p57) {
        this.N = p57;
        ? obj = new Object();
        obj.w = 1.0f;
        cu7 cu7 = cu7.a;
        obj.H = cu7;
        obj.I = cu7;
        this.O = obj;
        this.U = cq4 == null ? new cq4((ef3) null) : cq4;
        this.X = 9205357640488583168L;
    }

    public static z57 a1(y57 y57, int i) {
        z57 z57 = y57.P;
        n56 n56 = y57.O;
        if ((n56.d() & i) == 0) {
            return z57;
        }
        z57 z572 = new z57();
        n56.h(i, z572);
        return z572;
    }

    public final boolean K0() {
        return false;
    }

    public final void O0() {
        cx2 cx2 = this.R;
        if (cx2 != null) {
            ((je) rc9.P0(this)).getGraphicsContext().a(cx2);
            this.R = null;
        }
        this.S = null;
    }

    public final void Y0(wy3 wy3, int i, pq6 pq6, kq6 kq6) {
        kq6 kq62;
        kq6[] kq6Arr = this.d0;
        h02 h02 = null;
        if (kq6Arr != null) {
            kq62 = (kq6) qs.b1(i, kq6Arr);
        } else {
            kq62 = null;
        }
        h02[] h02Arr = this.e0;
        if (h02Arr != null) {
            h02 = (h02) qs.b1(i, h02Arr);
        }
        if (!sg3.e(kq62, kq6) || h02 == null) {
            qc3 b = ((je) rc9.P0(this)).getGraphicsContext().b();
            b.getClass();
            h02 = new h02(pq6, kq6, b);
        }
        kq6[] kq6Arr2 = this.d0;
        if (kq6Arr2 != null) {
            kq6Arr2[i] = kq6;
        }
        h02[] h02Arr2 = this.e0;
        if (h02Arr2 != null) {
            h02Arr2[i] = h02;
        }
        h02.g(wy3, wy3.w.e(), 1.0f, (lt0) null);
    }

    public final void Z0(wy3 wy3, int i, pq6 pq6, kq6 kq6) {
        kq6 kq62;
        kq6[] kq6Arr = this.b0;
        jc3 jc3 = null;
        if (kq6Arr != null) {
            kq62 = (kq6) qs.b1(i, kq6Arr);
        } else {
            kq62 = null;
        }
        jc3[] jc3Arr = this.c0;
        if (jc3Arr != null) {
            jc3 = (jc3) qs.b1(i, jc3Arr);
        }
        if (!sg3.e(kq62, kq6) || jc3 == null) {
            qc3 b = ((je) rc9.P0(this)).getGraphicsContext().b();
            b.getClass();
            jc3 = new jc3(pq6, kq6, b);
        }
        kq6[] kq6Arr2 = this.b0;
        if (kq6Arr2 != null) {
            kq6Arr2[i] = kq6;
        }
        jc3[] jc3Arr2 = this.c0;
        if (jc3Arr2 != null) {
            jc3Arr2[i] = jc3;
        }
        jc3.g(wy3, wy3.w.e(), 1.0f, (lt0) null);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, f06] */
    public final void b1(boolean z) {
        z57 z57;
        z57 z572;
        int i;
        z57 z573;
        if (this.J) {
            if (z) {
                z57 = null;
            } else {
                z57 = this.P;
            }
            if (z) {
                z572 = this.P;
            } else {
                if (this.Q == null) {
                    this.Q = new z57();
                }
                z572 = this.Q;
                z572.getClass();
            }
            z57 z574 = z572;
            tp1 tp1 = rc9.O0(this).T;
            ? obj = new Object();
            n56 n56 = this.O;
            kg5 kg5 = n56.J;
            z57 z575 = n56.y;
            if (kg5 == null || z575 == null) {
                n56.A = null;
            } else {
                long y = kg5.y();
                if (y != 0) {
                    long j = y & 2251799813685247L;
                    int i2 = (int) (y >> 50);
                    z57 z576 = new z57();
                    kg5 kg52 = n56.J;
                    if (!(kg52 == null || ((z573 = n56.B) == null && (z573 = n56.z) == null))) {
                        z57 z577 = z573;
                        z57 z578 = n56.y;
                        if (z578 != null) {
                            a67.a(z577, z578, kg52, j, i2, z576);
                        }
                    }
                    n56.A = z576;
                } else {
                    n56.A = null;
                }
            }
            i35.o(this, new yf1(this, tp1, z574, z57, obj, 4));
            int i3 = obj.w;
            if (z57 != null) {
                long j2 = a67.b | a67.c | a67.d;
                long j3 = a67.e;
                long j4 = j2 | j3 | a67.f | a67.g;
                int i4 = a67.h | a67.i | a67.j;
                int i5 = a67.k;
                long i6 = z57.i(z574, j4);
                int h = z57.h(i4 | i5 | a67.l | a67.m, z574);
                i = a67.g(i6) | a67.e(h);
                if (!((h & 8) == 0 || ((z57.a & j3) == 0 && (z57.b & i5) == 0 && (j3 & z574.a) == 0 && (z574.b & i5) == 0))) {
                    i |= 4;
                }
            } else {
                i = z574.r();
            }
            int i7 = i3 | i;
            if (!sg3.e(this.U.a, this.V)) {
                h27 h27 = this.f0;
                if (h27 != null) {
                    h27.o((CancellationException) null);
                }
                ef3 ef3 = this.U.a;
                this.V = ef3;
                if (ef3 != null) {
                    this.f0 = ar7.H(J0(), (e81) null, (r81) null, new k05(this, ef3, (f61) null, 24), 3);
                }
            }
            if (!z) {
                if ((i7 & 1) != 0) {
                    v57 v57 = this.M;
                    if (v57 != null) {
                        su0.B(v57);
                    } else {
                        h.s("StyleOuterNode with no corresponding StyleInnerNode");
                        return;
                    }
                }
                if ((i7 & 8) != 0) {
                    su0.B(this);
                }
                if ((i7 & 2) != 0) {
                    rc9.e0(this);
                    v57 v572 = this.M;
                    if (v572 != null) {
                        su0.A(v572);
                    } else {
                        h.s("StyleOuterNode with no corresponding StyleInnerNode");
                        return;
                    }
                }
                if ((i7 & 4) != 0) {
                    ay5 ay5 = this.W;
                    if (ay5 == null) {
                        ay5 = new ay5(18, (Object) this);
                        this.W = ay5;
                    }
                    su0.Q(this, ay5);
                }
                if ((i7 & 16) != 0 && this.w.J) {
                    rc9.O0(this).F();
                }
                if ((i7 & 32) != 0 && this.w.J) {
                    rc9.O0(this).C(true);
                }
            }
        }
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        z57 a1 = a1(this, 12);
        float f8 = 0.0f;
        if (a1.v((byte) 4)) {
            f = a1.g;
        } else {
            f = 0.0f;
        }
        if (a1.v((byte) 13)) {
            f2 = a1.p;
        } else {
            f2 = 0.0f;
        }
        if (!Float.isNaN(f2)) {
            f += f2;
        }
        float f9 = f;
        if (a1.v((byte) 5)) {
            f3 = a1.h;
        } else {
            f3 = 0.0f;
        }
        if (a1.v((byte) 15)) {
            f4 = a1.r;
        } else {
            f4 = 0.0f;
        }
        if (!Float.isNaN(f4)) {
            f3 += f4;
        }
        if (a1.v((byte) 6)) {
            f5 = a1.i;
        } else {
            f5 = 0.0f;
        }
        if (a1.v((byte) 14)) {
            f6 = a1.q;
        } else {
            f6 = 0.0f;
        }
        if (!Float.isNaN(f6)) {
            f5 += f6;
        }
        if (a1.v((byte) 7)) {
            f7 = a1.j;
        } else {
            f7 = 0.0f;
        }
        if (a1.v((byte) 16)) {
            f8 = a1.s;
        }
        if (!Float.isNaN(f8)) {
            f7 += f8;
        }
        int round = Math.round(f9 + f3);
        int round2 = Math.round(f5 + f7);
        int j2 = k31.j(j) - round;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = k31.h(j);
        if (h != Integer.MAX_VALUE && (h = h + round) < 0) {
            h = 0;
        }
        int i6 = k31.i(j) - round2;
        if (i6 < 0) {
            i = 0;
        } else {
            i = i6;
        }
        int g = k31.g(j);
        if (g != Integer.MAX_VALUE && (g = g + round2) < 0) {
            g = 0;
        }
        if (a1.v((byte) 19)) {
            i2 = Math.round(a1.w);
            if (i2 < 0) {
                i2 = 0;
            }
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (a1.v((byte) 17)) {
            i3 = Math.round(a1.v);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i2) {
                i3 = i2;
            }
        } else {
            i3 = 0;
        }
        if (a1.v((byte) 9)) {
            int round3 = Math.round(a1.l);
            if (round3 >= i3) {
                i3 = round3;
            }
            if (i3 <= i2) {
                i2 = i3;
            }
            i3 = i2;
        }
        if (i3 != 0) {
            if (i3 >= j2) {
                j2 = i3;
            }
            if (j2 > h) {
                j2 = h;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            if (i2 < j2) {
                i2 = j2;
            }
            if (i2 <= h) {
                h = i2;
            }
        }
        if (!a1.v((byte) 9)) {
            if (a1.v((byte) 11) && k31.d(j)) {
                int round4 = Math.round(((float) h) * a1.n);
                if (round4 >= j2) {
                    j2 = round4;
                }
                if (j2 > h) {
                    j2 = h;
                }
                h = j2;
            } else if (a1.v((byte) 13) && a1.v((byte) 15)) {
                j2 = h;
            }
        }
        if (a1.v((byte) 20)) {
            i4 = Math.round(a1.u);
            if (i4 < 0) {
                i4 = 0;
            }
        } else {
            i4 = Integer.MAX_VALUE;
        }
        if (a1.v((byte) 18)) {
            i5 = Math.round(a1.t);
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 > i4) {
                i5 = i4;
            }
        } else {
            i5 = 0;
        }
        if (a1.v((byte) 10)) {
            int round5 = Math.round(a1.m);
            if (round5 >= i5) {
                i5 = round5;
            }
            if (i5 <= i4) {
                i4 = i5;
            }
            i5 = i4;
        }
        if (i5 != 0) {
            if (i5 >= i) {
                i = i5;
            }
            if (i > g) {
                i = g;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            if (i4 < i) {
                i4 = i;
            }
            if (i4 <= g) {
                g = i4;
            }
        }
        if (!a1.v((byte) 10)) {
            if (a1.v((byte) 12) && k31.c(j)) {
                int round6 = Math.round(((float) g) * a1.o);
                if (round6 >= i) {
                    i = round6;
                }
                if (i > g) {
                    i = g;
                }
                g = i;
            } else if (a1.v((byte) 14) && a1.v((byte) 16)) {
                i = g;
            }
        }
        eh5 y = gh4.y(m31.a(j2, h, i, g));
        return oh4.d0(y.w + round, y.x + round2, b42.w, new x57(this, j, y, f3, f9, f7, f5));
    }

    public final Object g0(hu5 hu5) {
        return h49.w(this, hu5);
    }

    public final Object m() {
        return "StyleOuterNode";
    }

    public final void m0() {
        b1(false);
    }

    /* JADX WARNING: type inference failed for: r4v27, types: [java.lang.Object, e06] */
    public final void p0(wy3 wy3) {
        long j;
        kc0 kc0;
        kc0 kc02;
        kc0 kc03;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        float f2;
        tk0 tk0;
        z57 z57;
        kc0 kc04;
        n85 n85;
        float f3;
        Object obj;
        pq6 pq6;
        int i;
        jc3[] jc3Arr;
        kc0 kc05;
        o9 o9Var;
        Object obj2;
        Object obj3;
        Object obj4;
        pq6 pq62;
        int i2;
        h02[] h02Arr;
        wy3 wy32 = wy3;
        tk0 tk02 = wy32.w;
        pq6 pq63 = gr8.h;
        z57 a1 = a1(this, 2);
        long j3 = jt0.g;
        if (a1.v((byte) 34)) {
            j = a1.z;
        } else {
            j = j3;
        }
        if (a1.w(51)) {
            kc0 = a1.A;
            kc0.getClass();
        } else {
            kc0 = null;
        }
        if (a1.v((byte) 36)) {
            j3 = a1.B;
        }
        if (a1.w(52)) {
            kc02 = a1.C;
            kc02.getClass();
        } else {
            kc02 = null;
        }
        long j4 = jt0.b;
        if (a1.v((byte) 35)) {
            j4 = a1.x;
        }
        if (a1.w(50)) {
            kc03 = a1.y;
            kc03.getClass();
        } else {
            kc03 = null;
        }
        if (a1.v((byte) 8)) {
            f = a1.k;
        } else {
            f = 0.0f;
        }
        pq6 pq64 = a1.E;
        pq6 pq65 = pq63;
        if (f / 2.0f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (j == 16 && kc0 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (j3 == 16 && kc02 == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (a1.w(55) && (obj4 = a1.F) != null) {
            kc04 = kc03;
            if (a1.w(53)) {
                pq62 = a1.E;
            } else {
                pq62 = pq65;
            }
            z57 = a1;
            kq6[] kq6Arr = this.d0;
            tk0 = tk02;
            h02[] h02Arr2 = this.e0;
            f2 = f;
            boolean z4 = obj4 instanceof Object[];
            boolean z5 = z4;
            if (z4) {
                i2 = ((Object[]) obj4).length;
            } else {
                i2 = 1;
            }
            j2 = j4;
            if (kq6Arr == null || !sg3.e(this.Z, pq62)) {
                kq6[] kq6Arr2 = new kq6[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    kq6Arr2[i3] = null;
                }
                this.d0 = kq6Arr2;
                h02[] h02Arr3 = new h02[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    h02Arr3[i4] = null;
                }
                this.e0 = h02Arr3;
            } else if (kq6Arr.length != i2) {
                this.d0 = (kq6[]) Arrays.copyOf(kq6Arr, i2);
                if (h02Arr2 != null) {
                    h02Arr = (h02[]) Arrays.copyOf(h02Arr2, i2);
                } else {
                    h02Arr = new h02[i2];
                    for (int i5 = 0; i5 < i2; i5++) {
                        h02Arr[i5] = null;
                    }
                }
                this.e0 = h02Arr;
            }
            if (z5) {
                Object[] objArr = (Object[]) obj4;
                int length = objArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    Object obj5 = objArr[i6];
                    if (obj5 instanceof kq6) {
                        Y0(wy32, i6, pq62, (kq6) obj5);
                    }
                }
            } else if (obj4 instanceof kq6) {
                Y0(wy32, 0, pq62, (kq6) obj4);
            }
        } else {
            tk0 = tk02;
            z57 = a1;
            j2 = j4;
            kc04 = kc03;
            f2 = f;
        }
        long e = tk0.e();
        if (!wu6.a(this.X, e) || this.Y != wy32.getLayoutDirection() || !sg3.e(this.Z, pq64)) {
            n85 = pq64.a(e, wy32.getLayoutDirection(), wy32);
        } else {
            n85 = this.a0;
            n85.getClass();
        }
        this.a0 = n85;
        this.X = e;
        this.Y = wy32.getLayoutDirection();
        if (!z2) {
            f3 = 0.0f;
        } else if (kc0 != null) {
            f3 = 0.0f;
            o85.d(wy32, n85, kc0, 0.0f, 60);
        } else {
            f3 = 0.0f;
            o85.e(wy32, n85, j);
        }
        wy32.a();
        if (z3) {
            if (kc02 != null) {
                o85.d(wy32, n85, kc02, f3, 60);
            } else {
                o85.e(wy32, n85, j3);
            }
        }
        if (z) {
            if (kc04 == null) {
                kc05 = new ky6(j2);
            } else {
                kc05 = kc04;
            }
            w57 w57 = new w57(f2);
            hx4 hx4 = this.S;
            if (hx4 == null) {
                hx4 = new hx4(27, this);
                this.S = hx4;
            }
            hx4 hx42 = hx4;
            o9 o9Var2 = this.T;
            o9Var2.y = w57;
            if (!kc05.equals((kc0) o9Var2.z) || !sg3.e(n85, (n85) o9Var2.A) || ((vr2) o9Var2.B) == null) {
                o9Var2.z = kc05;
                o9Var2.A = n85;
                if (n85 instanceof k85) {
                    k85 k85 = (k85) n85;
                    eh ehVar = k85.l;
                    ly5 d = ehVar.d();
                    float f4 = d.b;
                    float f5 = d.d;
                    float f6 = d.a;
                    float f7 = d.c;
                    float min = Math.min(Math.abs(f7 - f6), Math.abs(f5 - f4));
                    eh ehVar2 = (eh) o9Var2.x;
                    if (ehVar2 == null) {
                        ehVar2 = gh.a();
                        o9Var2.x = ehVar2;
                    }
                    ehVar2.g();
                    eh.b(ehVar2, d);
                    ehVar2.f(ehVar2, ehVar, 0);
                    o9 o9Var3 = o9Var2;
                    obj2 = new oa0(o9Var3, min, k85, kc05, hx42, d, (((long) ((int) ((float) Math.ceil((double) (f7 - f6))))) << 32) | (((long) ((int) ((float) Math.ceil((double) (f5 - f4))))) & 4294967295L), ehVar2);
                    o9Var = o9Var3;
                } else {
                    o9Var = o9Var2;
                    if (n85 instanceof m85) {
                        l96 l96 = ((m85) n85).l;
                        if (p25.t(l96)) {
                            obj3 = new g5((Object) o9Var, (Object) l96, (Object) kc05, 6);
                        } else {
                            eh ehVar3 = (eh) o9Var.x;
                            if (ehVar3 == null) {
                                ehVar3 = gh.a();
                                o9Var.x = ehVar3;
                            }
                            eh ehVar4 = ehVar3;
                            ? obj6 = new Object();
                            obj6.w = Float.NaN;
                            obj3 = new na0(o9Var, l96, obj6, new Object(), ehVar4, kc05, 0);
                        }
                        obj2 = obj3;
                    } else if (n85 instanceof l85) {
                        obj2 = new g5((Object) o9Var, (Object) ((l85) n85).l, (Object) kc05, 7);
                    } else {
                        h.c();
                        return;
                    }
                }
                o9Var.B = obj2;
            } else {
                o9Var = o9Var2;
            }
            if (l35.b(0, 0)) {
                vr2 vr2 = (vr2) o9Var.B;
                vr2.getClass();
                vr2.y(wy32);
            } else {
                float intBitsToFloat = Float.intBitsToFloat(0);
                float intBitsToFloat2 = Float.intBitsToFloat(0);
                tk0 tk03 = tk0;
                ((ji8) tk03.x.x).F(intBitsToFloat, intBitsToFloat2);
                try {
                    vr2 vr22 = (vr2) o9Var.B;
                    vr22.getClass();
                    vr22.y(wy32);
                } finally {
                    ((ji8) tk03.x.x).F(-intBitsToFloat, -intBitsToFloat2);
                }
            }
        }
        z57 z572 = z57;
        if (z572.w(56) && (obj = z572.G) != null) {
            if (z572.w(53)) {
                pq6 = z572.E;
            } else {
                pq6 = pq65;
            }
            kq6[] kq6Arr3 = this.b0;
            jc3[] jc3Arr2 = this.c0;
            boolean z6 = obj instanceof Object[];
            if (z6) {
                i = ((Object[]) obj).length;
            } else {
                i = 1;
            }
            if (kq6Arr3 == null || !sg3.e(this.Z, pq6)) {
                kq6[] kq6Arr4 = new kq6[i];
                for (int i7 = 0; i7 < i; i7++) {
                    kq6Arr4[i7] = null;
                }
                this.b0 = kq6Arr4;
                jc3[] jc3Arr3 = new jc3[i];
                for (int i8 = 0; i8 < i; i8++) {
                    jc3Arr3[i8] = null;
                }
                this.c0 = jc3Arr3;
            } else if (kq6Arr3.length != i) {
                this.b0 = (kq6[]) Arrays.copyOf(kq6Arr3, i);
                if (jc3Arr2 != null) {
                    jc3Arr = (jc3[]) Arrays.copyOf(jc3Arr2, i);
                } else {
                    jc3Arr = new jc3[i];
                    for (int i9 = 0; i9 < i; i9++) {
                        jc3Arr[i9] = null;
                    }
                }
                this.c0 = jc3Arr;
            }
            if (z6) {
                Object[] objArr2 = (Object[]) obj;
                int length2 = objArr2.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    Object obj7 = objArr2[i10];
                    if (obj7 instanceof kq6) {
                        Z0(wy32, i10, pq6, (kq6) obj7);
                    }
                }
            } else if (obj instanceof kq6) {
                Z0(wy32, 0, pq6, (kq6) obj);
            }
        }
        this.Z = pq64;
    }
}
