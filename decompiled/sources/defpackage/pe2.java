package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import java.util.Collection;

/* renamed from: pe2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pe2 implements u9, ib0, q77, ux6, eb0, vb8, tr, vr, j51, e77 {
    public static final cf A = new cf(1);
    public static final cf B = new cf(2);
    public static final pe2 C = new pe2(4);
    public static final pe2 D = new pe2(5);
    public static final pe2 E = new pe2(6);
    public static final pe2 F = new pe2(7);
    public static final pe2 G = new pe2(8);
    public static final pe2 H = new pe2(9);
    public static final pe2 I = new pe2(10);
    public static final pe2 J = new pe2(11);
    public static final /* synthetic */ pe2 K = new pe2(12);
    public static final pe2 L = new pe2(13);
    public static final pe2 M = new pe2(14);
    public static final pe2 N = new pe2(15);
    public static final pe2 O = new pe2(16);
    public static final pe2 P = new pe2(17);
    public static final pe2 Q = new pe2(18);
    public static final pe2 x = new pe2(1);
    public static final pe2 y = new pe2(2);
    public static final cf z = new cf(0);
    public final /* synthetic */ int w;

    public /* synthetic */ pe2(int i) {
        this.w = i;
    }

    public static yd7 r(int i, yt2 yt2) {
        return v(((zg4) yt2.k(ch4.b)).a, yt2);
    }

    public static yd7 t(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, yt2 yt2, int i) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        yt2 yt22 = yt2;
        int i2 = i;
        long j17 = jt0.g;
        if ((i2 & 4) != 0) {
            j10 = j17;
        } else {
            j10 = j;
        }
        if ((i2 & 8) != 0) {
            j11 = j17;
        } else {
            j11 = j2;
        }
        if ((i2 & 16) != 0) {
            j12 = j17;
        } else {
            j12 = j3;
        }
        if ((i2 & 32) != 0) {
            j13 = j17;
        } else {
            j13 = j4;
        }
        if ((i2 & 64) != 0) {
            j14 = j17;
        } else {
            j14 = j5;
        }
        if ((i2 & 8192) != 0) {
            j15 = j17;
        } else {
            j15 = j8;
        }
        if ((i2 & 16384) != 0) {
            j16 = j17;
        } else {
            j16 = j9;
        }
        return v(((zg4) yt22.k(ch4.b)).a, yt22).a(j17, j17, j10, j11, j12, j13, j14, j17, j17, j17, (ng7) null, j6, j7, j15, j16, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17);
    }

    public static yd7 v(qt0 qt0, yt2 yt2) {
        boolean z2;
        qt0 qt02 = qt0;
        yt2 yt22 = yt2;
        yd7 yd7 = qt02.o0;
        if (yd7 == null) {
            yt22.e0(390452338);
            yt22.r(false);
            yd7 = null;
            z2 = false;
        } else {
            yt22.e0(390452339);
            ng7 ng7 = (ng7) yt22.k(og7.a);
            if (sg3.e(yd7.k, ng7)) {
                z2 = false;
            } else {
                long j = yd7.a;
                long j2 = yd7.b;
                long j3 = yd7.c;
                long j4 = yd7.d;
                long j5 = yd7.e;
                long j6 = yd7.f;
                long j7 = yd7.g;
                long j8 = yd7.h;
                long j9 = yd7.i;
                long j10 = yd7.j;
                long j11 = j;
                long j12 = j7;
                long j13 = j8;
                long j14 = j9;
                long j15 = j10;
                yd7 = yd7.a(j11, j2, j3, j4, j5, j6, j12, j13, j14, j15, ng7, yd7.l, yd7.m, yd7.n, yd7.o, yd7.p, yd7.q, yd7.r, yd7.s, yd7.t, yd7.u, yd7.v, yd7.w, yd7.x, yd7.y, yd7.z, yd7.A, yd7.B, yd7.C, yd7.D, yd7.E, yd7.F, yd7.G, yd7.H, yd7.I, yd7.J, yd7.K, yd7.L, yd7.M, yd7.N, yd7.O, yd7.P, yd7.Q);
                qt02.o0 = yd7;
                z2 = false;
            }
            yt22.r(z2);
        }
        if (yd7 == null) {
            yt22.e0(-1788321191);
            long d = st0.d(qt02, bb0.G);
            long d2 = st0.d(qt02, bb0.M);
            rt0 rt0 = bb0.t;
            long b = jt0.b(0.38f, st0.d(qt02, rt0));
            long d3 = st0.d(qt02, bb0.A);
            long j16 = jt0.f;
            long d4 = st0.d(qt02, bb0.J);
            long d5 = st0.d(qt02, bb0.S);
            long b2 = jt0.b(0.12f, st0.d(qt02, bb0.w));
            long d6 = st0.d(qt02, bb0.D);
            long d7 = st0.d(qt02, bb0.I);
            long d8 = st0.d(qt02, bb0.R);
            long b3 = jt0.b(0.38f, st0.d(qt02, bb0.v));
            long d9 = st0.d(qt02, bb0.C);
            long d10 = st0.d(qt02, bb0.L);
            long d11 = st0.d(qt02, bb0.U);
            long b4 = jt0.b(0.38f, st0.d(qt02, bb0.y));
            long d12 = st0.d(qt02, bb0.F);
            long d13 = st0.d(qt02, bb0.H);
            long d14 = st0.d(qt02, bb0.Q);
            long b5 = jt0.b(0.38f, st0.d(qt02, bb0.u));
            long d15 = st0.d(qt02, bb0.B);
            rt0 rt02 = bb0.N;
            long d16 = st0.d(qt02, rt02);
            long d17 = st0.d(qt02, rt02);
            long b6 = jt0.b(0.38f, st0.d(qt02, rt0));
            long d18 = st0.d(qt02, rt02);
            long d19 = st0.d(qt02, bb0.K);
            long d20 = st0.d(qt02, bb0.T);
            long b7 = jt0.b(0.38f, st0.d(qt02, bb0.x));
            long d21 = st0.d(qt02, bb0.E);
            rt0 rt03 = bb0.O;
            long d22 = st0.d(qt02, rt03);
            long d23 = st0.d(qt02, rt03);
            long b8 = jt0.b(0.38f, st0.d(qt02, rt03));
            long d24 = st0.d(qt02, rt03);
            rt0 rt04 = bb0.P;
            yd7 = new yd7(d, d2, b, d3, j16, j16, j16, j16, st0.d(qt02, bb0.r), st0.d(qt02, bb0.z), (ng7) yt22.k(og7.a), d4, d5, b2, d6, d7, d8, b3, d9, d10, d11, b4, d12, d13, d14, b5, d15, d16, d17, b6, d18, d19, d20, b7, d21, d22, d23, b8, d24, st0.d(qt02, rt04), st0.d(qt02, rt04), jt0.b(0.38f, st0.d(qt02, rt04)), st0.d(qt02, rt04));
            qt02.o0 = yd7;
        } else {
            yt22.e0(-1788515437);
        }
        yt22.r(z2);
        return yd7;
    }

    public static qo1 w(du7 du7, boolean z2) {
        boolean z3;
        rp7 rp7;
        du7.getClass();
        if (du7 instanceof qo1) {
            return (qo1) du7;
        }
        du7.L();
        if ((du7.L().u() instanceof qp7) || (du7 instanceof bz4)) {
            vq0 u = du7.L().u();
            if (u instanceof rp7) {
                rp7 = (rp7) u;
            } else {
                rp7 = null;
            }
            z3 = true;
            if (rp7 == null || rp7.H) {
                if (!z2 || !(du7.L().u() instanceof qp7)) {
                    z3 = true ^ rj1.y(hz2.L.L0(), mp7.f0(du7), to7.e);
                } else {
                    z3 = iq7.e(du7);
                }
            }
        } else {
            z3 = false;
        }
        if (!z3) {
            return null;
        }
        if (du7 instanceof zg2) {
            zg2 zg2 = (zg2) du7;
            sg3.e(zg2.x.L(), zg2.y.L());
        }
        return new qo1(mp7.f0(du7).o0(false), z2);
    }

    public static sy6 x(pi0 pi0) {
        while (pi0 instanceof ri0) {
            ri0 ri0 = (ri0) pi0;
            if (ri0.u() != 2) {
                break;
            }
            Collection s = ri0.s();
            s.getClass();
            pi0 = (ri0) dt0.R0(s);
            if (pi0 == null) {
                return null;
            }
        }
        return pi0.e();
    }

    public long A(int i, tt2 tt2) {
        String str = ((bg7) tt2.e).a.a.x;
        return i95.a(i35.f(i, str), i35.e(i, str));
    }

    public float a() {
        return 0.0f;
    }

    public qb8 b(Activity activity, up1 up1) {
        up1.getClass();
        ib0.b.getClass();
        return new qb8(new gb0(hb0.a().s(activity)), up1.f(activity));
    }

    public long c(long j, long j2) {
        float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(max)) << 32) | (((long) Float.floatToRawIntBits(max)) & 4294967295L);
        int i = yf6.a;
        return floatToRawIntBits;
    }

    public Collection d(ql4 ql4) {
        return a42.w;
    }

    public qe4 e(j77 j77, Object obj) {
        bm5 bm5 = (bm5) obj;
        j77.getClass();
        bm5.getClass();
        return new gm5(j77, bm5);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, bm5] */
    public Object f(vr2 vr2) {
        ku4 ku4 = xb4.X;
        xb4 xb4 = u02.x;
        long e0 = gl0.e0(30, y02.SECONDS);
        ? obj = new Object();
        obj.u = "public";
        obj.v = ku4;
        obj.w = e0;
        vr2.y(obj);
        return obj;
    }

    public Collection g(ql4 ql4) {
        ql4.getClass();
        return a42.w;
    }

    public String getKey() {
        return "rest";
    }

    public qb8 h(Context context, up1 up1) {
        up1.getClass();
        Context context2 = context;
        while (true) {
            if (context2 instanceof ContextWrapper) {
                if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) context2;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                context2 = contextWrapper.getBaseContext();
                context2.getClass();
            } else {
                context2 = context;
                break;
            }
        }
        if (context2 instanceof Activity) {
            return b((Activity) context2, up1);
        }
        if ((context2 instanceof InputMethodService) || (context2 instanceof Application)) {
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            defaultDisplay.getClass();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            return new qb8(new Rect(0, 0, point.x, point.y), up1.f(context));
        }
        h.q("Must provide a UiContext or Application Context");
        return null;
    }

    public boolean i(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    public Collection j(ql4 ql4) {
        return a42.w;
    }

    public Collection k(uq4 uq4, ql4 ql4) {
        uq4.getClass();
        ql4.getClass();
        return a42.w;
    }

    public void l(cy6 cy6, Object obj) {
        bm5 bm5 = (bm5) obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c0  */
    public void m(boolean z2, boolean z3, ef3 ef3, ml4 ml4, yd7 yd7, pq6 pq6, float f, float f2, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        ml4 ml42;
        int i6;
        int i7;
        int i8;
        float f3;
        float f4;
        boolean z4;
        float f5;
        float f6;
        yx5 v;
        float f7;
        float f8;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i9;
        ml4 ml43;
        ml4 ml44;
        float f9;
        int i10;
        int i11;
        int i12;
        ef3 ef32 = ef3;
        yd7 yd72 = yd7;
        pq6 pq62 = pq6;
        yt2 yt22 = yt2;
        int i13 = i;
        int i14 = i2;
        yt22.g0(1035477640);
        boolean z12 = z2;
        if (yt22.h(z12)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i15 = i3 | i13;
        boolean z13 = z3;
        if (yt22.h(z13)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i16 = i15 | i4;
        if (yt22.g(ef32)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i17 = i16 | i5;
        int i18 = i14 & 8;
        if (i18 != 0) {
            i17 |= 3072;
        } else if ((i13 & 3072) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i17 |= i12;
            if (!yt22.g(yd72)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            int i19 = i17 | i6;
            if (!yt22.g(pq62)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i8 = i19 | i7;
            if ((i13 & 1572864) != 0) {
                f3 = f;
                if ((i14 & 64) != 0 || !yt22.d(f3)) {
                    i11 = 524288;
                } else {
                    i11 = 1048576;
                }
                i8 |= i11;
            } else {
                f3 = f;
            }
            if ((i13 & 12582912) != 0) {
                if ((i14 & 128) == 0) {
                    f4 = f2;
                    if (yt22.d(f4)) {
                        i10 = 8388608;
                        i8 |= i10;
                    }
                } else {
                    f4 = f2;
                }
                i10 = 4194304;
                i8 |= i10;
            } else {
                f4 = f2;
            }
            boolean z14 = true;
            if ((i8 & 38347923) == 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!yt22.V(i8 & 1, z4)) {
                yt22.a0();
                if ((i13 & 1) == 0 || yt22.C()) {
                    if (i18 != 0) {
                        ml44 = jl4.w;
                    } else {
                        ml44 = ml42;
                    }
                    if ((i14 & 64) != 0) {
                        i8 &= -3670017;
                        f9 = 2.0f;
                    } else {
                        f9 = f3;
                    }
                    if ((i14 & 128) != 0) {
                        i8 &= -29360129;
                        f4 = 1.0f;
                    }
                    ml42 = ml44;
                    f8 = f4;
                    z5 = false;
                    f7 = f9;
                } else {
                    yt22.Y();
                    if ((i14 & 64) != 0) {
                        i8 &= -3670017;
                    }
                    if ((i14 & 128) != 0) {
                        i8 &= -29360129;
                    }
                    f8 = f4;
                    z5 = false;
                    f7 = f3;
                }
                yt22.s();
                if ((i8 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                Object Q2 = yt22.Q();
                d63 d63 = ay0.a;
                if (z6 || Q2 == d63) {
                    Q2 = new cq4(ef32);
                    yt22.o0(Q2);
                }
                cq4 cq4 = (cq4) Q2;
                je2 H2 = hj8.H(vm4.z, yt22);
                if ((((i8 & 458752) ^ 196608) <= 131072 || !yt22.g(pq62)) && (i8 & 196608) != 131072) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                boolean z15 = z7;
                if ((((57344 & i8) ^ 24576) <= 16384 || !yt22.g(yd72)) && (i8 & 24576) != 16384) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                boolean z16 = z15 | z8;
                if ((i8 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z17 = z16 | z9;
                if ((i8 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z18 = z17 | z10;
                if ((((29360128 & i8) ^ 12582912) <= 8388608 || !yt22.d(f8)) && (i8 & 12582912) != 8388608) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean i20 = z18 | z11 | yt22.i(H2);
                if ((((3670016 & i8) ^ 1572864) <= 1048576 || !yt22.d(f7)) && (i8 & 1572864) != 1048576) {
                    z14 = false;
                }
                boolean z19 = i20 | z14;
                Object Q3 = yt22.Q();
                if (z19 || Q3 == d63) {
                    pq6 pq63 = pq62;
                    yd7 yd73 = yd72;
                    pq6 pq64 = pq63;
                    i9 = 0;
                    p85 p85 = new p85(pq64, yd73, z12, z13, f8, H2, f7);
                    yt22.o0(p85);
                    Q3 = p85;
                } else {
                    i9 = 0;
                }
                p57 p57 = (p57) Q3;
                if (p57 == o57.a) {
                    ml43 = ml42;
                } else {
                    ml43 = ml42.d(new s57(cq4, p57)).d(t57.w);
                }
                mb0.a(ml43, yt22, i9);
                f5 = f8;
                f6 = f7;
            } else {
                yt22.Y();
                f5 = f4;
                f6 = f3;
            }
            ml4 ml45 = ml42;
            v = yt22.v();
            if (v == null) {
                v.d = new q85(this, z2, z3, ef32, ml45, yd7, pq6, f6, f5, i, i14);
                return;
            }
            return;
        }
        ml42 = ml4;
        if (!yt22.g(yd72)) {
        }
        int i192 = i17 | i6;
        if (!yt22.g(pq62)) {
        }
        i8 = i192 | i7;
        if ((i13 & 1572864) != 0) {
        }
        if ((i13 & 12582912) != 0) {
        }
        boolean z142 = true;
        if ((i8 & 38347923) == 38347922) {
        }
        if (!yt22.V(i8 & 1, z4)) {
        }
        ml4 ml452 = ml42;
        v = yt22.v();
        if (v == null) {
        }
    }

    public void n(String str, gs2 gs2, boolean z2, boolean z3, m78 m78, ef3 ef3, boolean z4, gs2 gs22, gs2 gs23, gs2 gs24, gs2 gs25, gs2 gs26, yd7 yd7, la5 la5, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z5;
        boolean z6;
        la5 la52;
        pa5 pa5;
        int i3;
        fw0 fw02;
        String str2 = str;
        m78 m782 = m78;
        gs2 gs27 = gs22;
        yt2 yt22 = yt2;
        int i4 = i;
        yt22.g0(-1732281618);
        if ((i4 & 6) == 0) {
            i2 = (yt22.g(str2) ? 4 : 2) | i4;
        } else {
            i2 = i4;
        }
        gs2 gs28 = gs2;
        if ((i4 & 48) == 0) {
            i2 |= yt22.i(gs28) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            z5 = z2;
            i2 |= yt22.h(z5) ? 256 : 128;
        } else {
            z5 = z2;
        }
        int i5 = 2048;
        if ((i4 & 3072) == 0) {
            z6 = z3;
            i2 |= yt22.h(z6) ? 2048 : 1024;
        } else {
            z6 = z3;
        }
        int i6 = 8192;
        if ((i4 & 24576) == 0) {
            i2 |= yt22.g(m782) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i2 |= yt22.g(ef3) ? 131072 : 65536;
        } else {
            ef3 ef32 = ef3;
        }
        boolean z7 = z4;
        if ((i4 & 1572864) == 0) {
            i2 |= yt22.h(z7) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i2 |= yt22.i(gs27) ? 8388608 : 4194304;
        }
        gs2 gs29 = gs23;
        if ((i4 & 100663296) == 0) {
            i2 |= yt22.i(gs29) ? 67108864 : 33554432;
        }
        gs2 gs210 = gs24;
        if ((i4 & 805306368) == 0) {
            i2 |= yt22.i(gs210) ? 536870912 : 268435456;
        }
        gs2 gs211 = gs25;
        int i7 = 14155776 | (yt22.i(gs211) ? 4 : 2) | (yt22.i((Object) null) ? 32 : 16) | (yt22.i((Object) null) ? 256 : 128);
        gs2 gs212 = gs26;
        if (!yt22.i(gs212)) {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        yd7 yd72 = yd7;
        if (yt22.g(yd72)) {
            i6 = 16384;
        }
        int i9 = i8 | i6 | 65536;
        int i10 = i2;
        boolean z8 = true;
        if (yt22.V(i10 & 1, ((i2 & 306783379) == 306783378 && (i9 & 4793491) == 4793490) ? false : true)) {
            yt22.a0();
            if ((i & 1) == 0 || yt22.C()) {
                pa5 = new pa5(16.0f, 16.0f, 16.0f, 16.0f);
                i3 = i9 & -458753;
            } else {
                yt22.Y();
                i3 = i9 & -458753;
                pa5 = la5;
            }
            yt22.s();
            boolean z9 = (i10 & 14) == 4;
            int i11 = i3;
            if ((i10 & 57344) != 16384) {
                z8 = false;
            }
            boolean z10 = z9 | z8;
            Object Q2 = yt22.Q();
            if (z10 || Q2 == ay0.a) {
                Q2 = m782.e(new vl(str2));
                yt22.o0(Q2);
            }
            String str3 = ((tl7) Q2).a.x;
            me7 me7 = new me7();
            if (gs27 == null) {
                yt22.e0(1927010204);
                yt22.r(false);
                fw02 = null;
            } else {
                yt22.e0(1927010205);
                fw02 = su0.J(-1819131923, new bx4(3, gs27), yt22);
                yt22.r(false);
            }
            int i12 = i10 >> 12;
            int i13 = i11 << 18;
            g75.a(str3, gs28, me7, fw02, gs23, gs210, gs211, gs212, z6, z5, z7, ef3, pa5, yd72, fw0, yt2, (i10 & 112) | (i12 & 57344) | (i12 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), (i12 & 896) | ((i10 >> 9) & 14) | ((i10 >> 3) & 112) | ((i10 >> 6) & 7168) | ((i11 << 3) & 458752) | 1572864);
            la52 = pa5;
        } else {
            yt2.Y();
            la52 = la5;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new r85(this, str2, gs2, z2, z3, m782, ef3, z4, gs27, gs23, gs24, gs25, gs26, yd7, la52, fw0, i);
        }
    }

    public boolean o(vj1 vj1, vj1 vj12, boolean z2) {
        boolean z3;
        if ((vj1 instanceof ql4) && (vj12 instanceof ql4)) {
            return sg3.e(((ql4) vj1).n(), ((ql4) vj12).n());
        }
        if ((vj1 instanceof qp7) && (vj12 instanceof qp7)) {
            return p((qp7) vj1, (qp7) vj12, z2, c0.z);
        }
        if ((vj1 instanceof pi0) && (vj12 instanceof pi0)) {
            pi0 pi0 = (pi0) vj1;
            pi0 pi02 = (pi0) vj12;
            if (!pi0.equals(pi02)) {
                if (sg3.e(pi0.getName(), pi02.getName()) && ((!(pi0 instanceof zh4) || !(pi02 instanceof zh4) || ((zh4) pi0).H() == ((zh4) pi02).H()) && ((!sg3.e(pi0.r(), pi02.r()) || (z2 && sg3.e(x(pi0), x(pi02)))) && !rs1.m(pi0) && !rs1.m(pi02)))) {
                    vj1 r = pi0.r();
                    vj1 r2 = pi02.r();
                    if ((r instanceof ri0) || (r2 instanceof ri0)) {
                        z3 = false;
                    } else {
                        z3 = o(r, r2, z2);
                    }
                    if (z3) {
                        h95 h95 = new h95(new zc9(z2, pi0, pi02, 1));
                        if (!(h95.m(pi0, pi02, (ql4) null, true).b() == 1 && h95.m(pi02, pi0, (ql4) null, true).b() == 1)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        } else if (!(vj1 instanceof x95) || !(vj12 instanceof x95)) {
            return sg3.e(vj1, vj12);
        } else {
            return sg3.e(((y95) ((x95) vj1)).A, ((y95) ((x95) vj12)).A);
        }
    }

    public boolean p(qp7 qp7, qp7 qp72, boolean z2, gs2 gs2) {
        boolean z3;
        qp7.getClass();
        qp72.getClass();
        if (qp7.equals(qp72)) {
            return true;
        }
        if (sg3.e(qp7.r(), qp72.r())) {
            return false;
        }
        vj1 r = qp7.r();
        vj1 r2 = qp72.r();
        if ((r instanceof ri0) || (r2 instanceof ri0)) {
            z3 = ((Boolean) gs2.H(r, r2)).booleanValue();
        } else {
            z3 = o(r, r2, z2);
        }
        if (z3 && qp7.getIndex() == qp72.getIndex()) {
            return true;
        }
        return false;
    }

    public yb9 q(Object obj) {
        Void voidR = (Void) obj;
        return b35.l(Boolean.TRUE);
    }

    public Rect s(Activity activity) {
        int i;
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
                return rect;
            }
            int i3 = rect.right + i;
            if (i3 == point.x) {
                rect.right = i3;
            }
        }
        return rect;
    }

    public void s0(tp1 tp1, int i, int[] iArr, int[] iArr2) {
        wr.a(i, iArr, iArr2, false);
    }

    public String toString() {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return "ReferentialEqualityPolicy";
            case 20:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    public void u(tp1 tp1, int i, int[] iArr, ey3 ey3, int[] iArr2) {
        if (ey3 == ey3.w) {
            wr.a(i, iArr, iArr2, false);
        } else {
            wr.a(i, iArr, iArr2, true);
        }
    }
}
