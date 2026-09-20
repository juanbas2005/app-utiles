package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* renamed from: we  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class we {
    public static final lo7 A = new lo7(new f08(15), new f08(16));
    public static final lo7 B = new lo7(new f08(17), new f08(18));
    public static final lo7 C = new lo7(new f08(19), new f08(20));
    public static final lo7 D = new lo7(new f08(21), new f08(22));
    public static x83 E;
    public static final /* synthetic */ int F = 0;
    public static final f80 a = new f80(-1.0f);
    public static final f80 b = new f80(1.0f);
    public static final e80 c = new e80(-1.0f);
    public static final e80 d = new e80(1.0f);
    public static final fw0 e = new fw0(-1342205566, new nw0(6), false);
    public static final fw0 f = new fw0(2136598717, new nw0(7), false);
    public static final fw0 g = new fw0(2026994362, new ww0(23), false);
    public static final fw0 h = new fw0(-500303688, new ww0(24), false);
    public static final cr7 i;
    public static final rt0 j;
    public static final float k = 0.38f;
    public static final float l = 0.12f;
    public static final cr7 m;
    public static final rt0 n = rt0.F;
    public static final float o = 1.0f;
    public static final rt0 p = rt0.L;
    public static final rt0 q = rt0.C;
    public static final vq6 r = vq6.y;
    public static final rt0 s;
    public static final float t = 18.0f;
    public static final ly5 u = new ly5(0.0f, 0.0f, 10.0f, 10.0f);
    public static final lo7 v = new lo7(new f08(6), new f08(23));
    public static final lo7 w = new lo7(new f08(7), new f08(8));
    public static final lo7 x = new lo7(new f08(9), new f08(10));
    public static final lo7 y = new lo7(new f08(11), new f08(12));
    public static final lo7 z = new lo7(new f08(13), new f08(14));

    static {
        new fw0(2094288676, new vw0(6), false);
        new fw0(-684072357, new vw0(7), false);
        cr7 cr7 = cr7.B;
        i = cr7;
        rt0 rt0 = rt0.D;
        j = rt0;
        m = cr7;
        s = rt0;
    }

    public static final boolean A(fk6 fk6) {
        if (!z(fk6)) {
            ak6 ak6 = fk6.d;
            if (ak6.y) {
                return true;
            }
            tp4 tp4 = ak6.w;
            Object[] objArr = tp4.b;
            Object[] objArr2 = tp4.c;
            long[] jArr = tp4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((nk6) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public static final boolean B(uy3 uy3) {
        uy3 uy32;
        if (uy3.D == null) {
            return false;
        }
        uy3 v2 = uy3.v();
        if (v2 != null) {
            uy32 = v2.D;
        } else {
            uy32 = null;
        }
        if (uy32 == null || uy3.b0.b) {
            return true;
        }
        return false;
    }

    public static final boolean C(sc0 sc0) {
        sc0.getClass();
        try {
            zw5 zw5 = new zw5(new df5(sc0));
            for (long j2 = 0; j2 < 16; j2++) {
                if (zw5.x()) {
                    return true;
                }
                zw5.p(1);
                sc0 sc02 = zw5.x;
                byte u2 = sc02.u(0);
                if ((u2 & 224) == 192) {
                    zw5.p(2);
                } else if ((u2 & 240) == 224) {
                    zw5.p(3);
                } else if ((u2 & 248) == 240) {
                    zw5.p(4);
                }
                int M = sc02.M();
                if (Character.isISOControl(M) && !Character.isWhitespace(M)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static final ml4 D(ml4 ml4, hs2 hs2) {
        return ml4.d(new fy3(hs2));
    }

    public static final float E(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int F(float f2, int i2, int i3) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f2)));
    }

    public static final xc1 G(vk2 vk2) {
        int ordinal = vk2.a1().ordinal();
        xc1 xc1 = xc1.w;
        if (ordinal != 0) {
            xc1 xc12 = null;
            xc1 xc13 = xc1.x;
            if (ordinal == 1) {
                vk2 k0 = bb0.k0(vk2);
                if (k0 != null) {
                    xc1 G = G(k0);
                    if (G != xc1) {
                        xc12 = G;
                    }
                    if (xc12 != null) {
                        return xc12;
                    }
                    if (vk2.L) {
                        return xc1;
                    }
                    vk2.L = true;
                    try {
                        mk2 X0 = vk2.X0();
                        lk2 lk2 = (lk2) ((je) rc9.P0(vk2)).getFocusOwner();
                        vk2 g2 = lk2.g();
                        X0.k.getClass();
                        vk2 g3 = lk2.g();
                        if (g2 == g3 || g3 == null) {
                            vk2.L = false;
                            return xc1;
                        } else if (ok2.d == ok2.c) {
                            return xc13;
                        } else {
                            xc1 xc14 = xc1.y;
                            vk2.L = false;
                            return xc14;
                        }
                    } finally {
                        vk2.L = false;
                    }
                } else {
                    h.q("ActiveParent with no focused child");
                    return null;
                }
            } else if (ordinal == 2) {
                return xc13;
            } else {
                if (ordinal != 3) {
                    h.c();
                    return null;
                }
            }
        }
        return xc1;
    }

    public static final xc1 H(vk2 vk2) {
        if (!vk2.M) {
            vk2.M = true;
            try {
                mk2 X0 = vk2.X0();
                lk2 lk2 = (lk2) ((je) rc9.P0(vk2)).getFocusOwner();
                vk2 g2 = lk2.g();
                X0.j.getClass();
                vk2 g3 = lk2.g();
                if (g2 == g3 || g3 == null) {
                    vk2.M = false;
                } else if (ok2.d == ok2.c) {
                    return xc1.x;
                } else {
                    xc1 xc1 = xc1.y;
                    vk2.M = false;
                    return xc1;
                }
            } finally {
                vk2.M = false;
            }
        }
        return xc1.w;
    }

    public static final xc1 I(vk2 vk2) {
        vk2 vk22;
        o00 o00;
        int ordinal = vk2.a1().ordinal();
        xc1 xc1 = xc1.w;
        if (ordinal != 0) {
            xc1 xc12 = null;
            if (ordinal == 1) {
                vk2 k0 = bb0.k0(vk2);
                if (k0 != null) {
                    return G(k0);
                }
                h.q("ActiveParent with no focused child");
                return null;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    if (!vk2.w.J) {
                        yb3.b("visitAncestors called on an unattached node");
                    }
                    ll4 ll4 = vk2.w.A;
                    uy3 O0 = rc9.O0(vk2);
                    loop0:
                    while (true) {
                        if (O0 == null) {
                            vk22 = null;
                            break;
                        }
                        if ((((ll4) O0.a0.g).z & 1024) != 0) {
                            while (ll4 != null) {
                                if ((ll4.y & 1024) != 0) {
                                    vk22 = ll4;
                                    eq4 eq4 = null;
                                    while (vk22 != null) {
                                        if (vk22 instanceof vk2) {
                                            break loop0;
                                        }
                                        if ((vk22.y & 1024) != 0 && (vk22 instanceof wo1)) {
                                            int i2 = 0;
                                            for (ll4 ll42 = ((wo1) vk22).L; ll42 != null; ll42 = ll42.B) {
                                                if ((ll42.y & 1024) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        vk22 = ll42;
                                                    } else {
                                                        if (eq4 == null) {
                                                            eq4 = new eq4(new ll4[16]);
                                                        }
                                                        if (vk22 != null) {
                                                            eq4.b(vk22);
                                                            vk22 = null;
                                                        }
                                                        eq4.b(ll42);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        vk22 = rc9.j(eq4);
                                    }
                                    continue;
                                }
                                ll4 = ll4.A;
                            }
                        }
                        O0 = O0.v();
                        if (O0 == null || (o00 = O0.a0) == null) {
                            ll4 = null;
                        } else {
                            ll4 = (ib7) o00.f;
                        }
                    }
                    vk2 vk23 = vk22;
                    if (vk23 == null) {
                        return xc1;
                    }
                    int ordinal2 = vk23.a1().ordinal();
                    if (ordinal2 == 0) {
                        return H(vk23);
                    }
                    if (ordinal2 == 1) {
                        return I(vk23);
                    }
                    if (ordinal2 == 2) {
                        return xc1.x;
                    }
                    if (ordinal2 == 3) {
                        xc1 I = I(vk23);
                        if (I != xc1) {
                            xc12 = I;
                        }
                        if (xc12 == null) {
                            return H(vk23);
                        }
                        return xc12;
                    }
                    h.c();
                    return null;
                }
                h.c();
                return null;
            }
        }
        return xc1;
    }

    public static final void J(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float j2 = j(fArr4, 0, fArr3, 0);
        float j3 = j(fArr4, 0, fArr3, 1);
        float j4 = j(fArr4, 0, fArr3, 2);
        float j5 = j(fArr4, 0, fArr3, 3);
        float j6 = j(fArr4, 1, fArr3, 0);
        float j7 = j(fArr4, 1, fArr3, 1);
        float j8 = j(fArr4, 1, fArr3, 2);
        float j9 = j(fArr4, 1, fArr3, 3);
        float j10 = j(fArr4, 2, fArr3, 0);
        float j11 = j(fArr4, 2, fArr3, 1);
        float j12 = j(fArr4, 2, fArr3, 2);
        float j13 = j(fArr4, 2, fArr3, 3);
        float j14 = j(fArr4, 3, fArr3, 0);
        float j15 = j(fArr4, 3, fArr3, 1);
        float j16 = j(fArr4, 3, fArr3, 2);
        float j17 = j(fArr4, 3, fArr3, 3);
        fArr3[0] = j2;
        fArr3[1] = j3;
        fArr3[2] = j4;
        fArr3[3] = j5;
        fArr3[4] = j6;
        fArr3[5] = j7;
        fArr3[6] = j8;
        fArr3[7] = j9;
        fArr3[8] = j10;
        fArr3[9] = j11;
        fArr3[10] = j12;
        fArr3[11] = j13;
        fArr3[12] = j14;
        fArr3[13] = j15;
        fArr3[14] = j16;
        fArr3[15] = j17;
    }

    public static final boolean K(vk2 vk2, boolean z2) {
        boolean z3;
        int ordinal = vk2.a1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                vk2 k0 = bb0.k0(vk2);
                if (k0 != null) {
                    z3 = K(k0, z2);
                } else {
                    z3 = true;
                }
                if (!z3) {
                    return false;
                }
                vk2.W0(sk2.x, sk2.y);
                return true;
            } else if (ordinal == 2) {
                return z2;
            } else {
                if (ordinal != 3) {
                    h.c();
                    return false;
                }
            }
        }
        return true;
    }

    public static final void L(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: vk2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: vk2} */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, h06] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0171  */
    public static final Object M(vk2 vk2, int i2, vr2 vr2) {
        int i3;
        int i4;
        Object obj;
        ll4 ll4;
        b24 Z0;
        int i5;
        o00 o00;
        if (!vk2.w.J) {
            yb3.b("visitAncestors called on an unattached node");
        }
        ll4 ll42 = vk2.w.A;
        uy3 O0 = rc9.O0(vk2);
        loop0:
        while (true) {
            i3 = 0;
            i4 = 1;
            obj = null;
            if (O0 == null) {
                ll4 = null;
                break;
            }
            if ((((ll4) O0.a0.g).z & 1024) != 0) {
                while (ll42 != null) {
                    if ((ll42.y & 1024) != 0) {
                        ll4 = ll42;
                        eq4 eq4 = null;
                        while (ll4 != null) {
                            if (ll4 instanceof vk2) {
                                break loop0;
                            }
                            if ((ll4.y & 1024) != 0 && (ll4 instanceof wo1)) {
                                int i6 = 0;
                                for (ll4 ll43 = ((wo1) ll4).L; ll43 != null; ll43 = ll43.B) {
                                    if ((ll43.y & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            ll4 = ll43;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll4 != null) {
                                                eq4.b(ll4);
                                                ll4 = null;
                                            }
                                            eq4.b(ll43);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            ll4 = rc9.j(eq4);
                        }
                        continue;
                    }
                    ll42 = ll42.A;
                }
            }
            O0 = O0.v();
            if (O0 == null || (o00 = O0.a0) == null) {
                ll42 = null;
            } else {
                ll42 = (ib7) o00.f;
            }
        }
        vk2 vk22 = (vk2) ll4;
        if ((vk22 == null || !sg3.e(vk22.Z0(), vk2.Z0())) && (Z0 = vk2.Z0()) != null) {
            int i7 = 5;
            if (i2 != 5) {
                i7 = 6;
                if (i2 != 6) {
                    i7 = 3;
                    if (i2 != 3) {
                        i7 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i4 = 2;
                            } else if (i2 != 2) {
                                h.s("Unsupported direction for beyond bounds layout");
                            }
                            if (Z0.K.a() <= 0 || !Z0.K.d() || !Z0.J) {
                                return vr2.y(b24.N);
                            }
                            boolean W0 = Z0.W0(i4);
                            c24 c24 = Z0.K;
                            if (W0) {
                                i5 = c24.b();
                            } else {
                                i5 = c24.e();
                            }
                            ? obj2 = new Object();
                            ji8 ji8 = Z0.L;
                            ji8.getClass();
                            x14 x14 = new x14(i5, i5);
                            ((eq4) ji8.x).b(x14);
                            obj2.w = x14;
                            int c2 = Z0.K.c() * 2;
                            int a2 = Z0.K.a();
                            if (c2 > a2) {
                                c2 = a2;
                            }
                            while (obj == null && Z0.V0((x14) obj2.w, i4) && i3 < c2) {
                                x14 x142 = (x14) obj2.w;
                                int i8 = x142.a;
                                int i9 = x142.b;
                                if (Z0.W0(i4)) {
                                    i9++;
                                } else {
                                    i8--;
                                }
                                ji8 ji82 = Z0.L;
                                ji82.getClass();
                                x14 x143 = new x14(i8, i9);
                                ((eq4) ji82.x).b(x143);
                                ((eq4) Z0.L.x).k((x14) obj2.w);
                                obj2.w = x143;
                                i3++;
                                rc9.O0(Z0).k();
                                obj = vr2.y(new a24(Z0, obj2, i4));
                            }
                            ((eq4) Z0.L.x).k((x14) obj2.w);
                            rc9.O0(Z0).k();
                            return obj;
                        }
                    }
                }
            }
            i4 = i7;
            if (Z0.K.a() <= 0 || !Z0.K.d() || !Z0.J) {
            }
        }
        return null;
    }

    public static byte[] N(tf0 tf0) {
        int i2;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i3 = 0;
        while (i3 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i3);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < min2) {
                int read = tf0.read(bArr, i4, min2 - i4);
                if (read == -1) {
                    return h(arrayDeque, i3);
                }
                i4 += read;
                i3 += read;
            }
            long j2 = (long) min;
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            long j3 = j2 * ((long) i2);
            if (j3 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j3 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j3;
            }
        }
        if (tf0.read() == -1) {
            return h(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final void a(sr2 sr2, ml4 ml4, boolean z2, pq6 pq6, pl0 pl0, ql0 ql0, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        long j2;
        long j3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        pl0 pl02 = pl0;
        ql0 ql02 = ql0;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i10 = i2;
        yt22.g0(2136075085);
        sr2 sr22 = sr2;
        if ((i10 & 6) == 0) {
            if (yt22.i(sr22)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            i3 = i10;
        }
        ml4 ml42 = ml4;
        if ((i10 & 48) == 0) {
            if (yt22.g(ml42)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        int i11 = i3 | 384;
        pq6 pq62 = pq6;
        if ((i10 & 3072) == 0) {
            if (yt22.g(pq62)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i11 |= i7;
        }
        if ((i10 & 24576) == 0) {
            if (yt22.g(pl02)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i11 |= i6;
        }
        if ((196608 & i10) == 0) {
            if (yt22.g(ql02)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i11 |= i5;
        }
        int i12 = i11 | 14155776;
        if ((100663296 & i10) == 0) {
            if (yt22.i(fw02)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i12 |= i4;
        }
        boolean z5 = true;
        if ((38347923 & i12) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i12 & 1, z3)) {
            yt22.a0();
            if ((i10 & 1) != 0 && !yt22.C()) {
                yt22.Y();
                z5 = z2;
            }
            yt22.s();
            yt22.e0(1577873102);
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = b81.e(yt22);
            }
            ap4 ap4 = (ap4) Q;
            yt22.r(false);
            if (z5) {
                j2 = pl02.a;
            } else {
                j2 = pl02.c;
            }
            if (z5) {
                j3 = pl02.b;
            } else {
                j3 = pl02.d;
            }
            float f2 = ((lx1) ql02.a(z5, ap4, yt22, ((i12 >> 6) & 14) | ((i12 >> 9) & 896)).getValue()).w;
            boolean z6 = z5;
            long j4 = j2;
            long j5 = j3;
            sr2 sr23 = sr2;
            ml4 ml43 = ml4;
            s87.c(sr23, ml43, z6, pq62, j4, j5, 0.0f, f2, (ua0) null, ap4, su0.J(-1347531112, new x30(fw02, 3), yt22), yt22, (i12 & 8190) | ((i12 << 6) & 234881024), 64);
            z4 = z6;
        } else {
            yt2.Y();
            z4 = z2;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new sl0(sr2, ml4, z4, pq6, pl02, ql02, fw02, i10);
        }
    }

    public static final void b(ml4 ml4, pq6 pq6, pl0 pl0, ql0 ql0, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        ml4 ml42;
        pq6 pq62;
        pl0 pl02;
        ql0 ql02;
        boolean z2;
        ql0 ql03;
        pl0 pl03;
        pq6 pq63;
        ml4 ml43;
        ml4 ml44;
        pq6 pq64;
        pl0 pl04;
        ml4 ml45;
        pl0 pl05;
        pq6 pq65;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i10 = i2;
        yt22.g0(1359693790);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i10 | 6;
            ml42 = ml4;
        } else if ((i10 & 6) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i10;
        } else {
            ml42 = ml4;
            i4 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i3 & 2) == 0) {
                pq62 = pq6;
                if (yt22.g(pq62)) {
                    i8 = 32;
                    i4 |= i8;
                }
            } else {
                pq62 = pq6;
            }
            i8 = 16;
            i4 |= i8;
        } else {
            pq62 = pq6;
        }
        if ((i10 & 384) == 0) {
            if ((i3 & 4) == 0) {
                pl02 = pl0;
                if (yt22.g(pl02)) {
                    i7 = 256;
                    i4 |= i7;
                }
            } else {
                pl02 = pl0;
            }
            i7 = 128;
            i4 |= i7;
        } else {
            pl02 = pl0;
        }
        if ((i10 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                ql02 = ql0;
                if (yt22.g(ql02)) {
                    i6 = 2048;
                    i4 |= i6;
                }
            } else {
                ql02 = ql0;
            }
            i6 = 1024;
            i4 |= i6;
        } else {
            ql02 = ql0;
        }
        int i12 = i4 | 24576;
        if ((196608 & i10) == 0) {
            if (yt22.i(fw02)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i12 |= i5;
        }
        if ((74899 & i12) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i12 & 1, z2)) {
            yt22.a0();
            if ((i10 & 1) == 0 || yt22.C()) {
                if (i11 != 0) {
                    ml44 = jl4.w;
                } else {
                    ml44 = ml42;
                }
                if ((i3 & 2) != 0) {
                    pq64 = hr6.a(rj1.x, yt22);
                    i12 &= -113;
                } else {
                    pq64 = pq62;
                }
                if ((i3 & 4) != 0) {
                    pl04 = rc9.M(((zg4) yt22.k(ch4.b)).a);
                    i12 &= -897;
                } else {
                    pl04 = pl02;
                }
                if ((i3 & 8) != 0) {
                    i12 &= -7169;
                    ql02 = rc9.x(63, 0.0f);
                }
                pl0 pl06 = pl04;
                ml45 = ml44;
                pl05 = pl06;
                pq65 = pq64;
            } else {
                yt22.Y();
                if ((i3 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i12 &= -7169;
                }
                pl05 = pl02;
                pq65 = pq62;
                ml45 = ml42;
            }
            ql0 ql04 = ql02;
            yt22.s();
            s87.a(ml45, pq65, pl05.a, pl05.b, 0.0f, ((lx1) ql04.a(true, (ap4) null, yt22, ((i12 >> 3) & 896) | 54).getValue()).w, su0.J(-97109725, new x30(fw02, 2), yt22), yt22, (i12 & 14) | 12582912 | (i12 & 112) | ((i12 << 6) & 3670016), 16);
            ql03 = ql04;
            pq63 = pq65;
            pl03 = pl05;
            ml43 = ml45;
        } else {
            yt2.Y();
            ml43 = ml42;
            pq63 = pq62;
            pl03 = pl02;
            ql03 = ql02;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new rl0(ml43, pq63, pl03, ql03, fw02, i2, i3, 0);
        }
    }

    public static final boolean c(ak6 ak6) {
        nk6 nk6 = jk6.s;
        tp4 tp4 = ak6.w;
        Object g2 = tp4.g(nk6);
        if (g2 == null) {
            g2 = null;
        }
        if (sg3.e(g2, pe2.z)) {
            return false;
        }
        if (tp4.b(zj6.g) || tp4.b(zj6.h)) {
            return true;
        }
        return false;
    }

    public static final void d(float[] fArr, float f2, float f3, float[] fArr2) {
        eh4.d(fArr2);
        eh4.h(fArr2, f2, f3);
        J(fArr, fArr2);
    }

    public static final String e(Object[] objArr, int i2, int i3, l2 l2Var) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            l2 l2Var2 = objArr[i2 + i4];
            if (l2Var2 == l2Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(l2Var2);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final ml4 f(ml4 ml4, pq6 pq6) {
        return mp7.Y(ml4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pq6, true, 1042431);
    }

    public static final ml4 g(ml4 ml4) {
        return mp7.Y(ml4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (pq6) null, true, 1044479);
    }

    public static byte[] h(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static ce1 i(gq3 gq3) {
        gq3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("JetpackWorkerClassName", gq3.l());
        ce1 ce1 = new ce1(linkedHashMap);
        r16.g0(ce1);
        return ce1;
    }

    public static final float j(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        float f2 = (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + f2;
    }

    public static final float k(float f2) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / 3)) + 709952852);
        float f3 = intBitsToFloat - ((intBitsToFloat - (f2 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final h81 l(Executor executor) {
        return new g82(executor);
    }

    public static final yo4 m(ik6 ik6, vr2 vr2) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            fk6 a2 = ik6.a();
            uy3 uy3 = a2.c;
            if (uy3.K()) {
                if (uy3.J()) {
                    ly5 g2 = a2.g();
                    yo4 yo4 = new yo4(48);
                    ay4 ay4 = new ay4(8);
                    ay4.w(tf4.O(g2));
                    p(vr2, yo4, new ay4(8), ay4, a2, a2);
                    Trace.endSection();
                    return yo4;
                }
            }
            yo4 yo42 = ne3.a;
            yo42.getClass();
            Trace.endSection();
            return yo42;
        } catch (Throwable th) {
            Throwable th2 = th;
            Trace.endSection();
            throw th2;
        }
    }

    public static final void n(vr2 vr2, yo4 yo4, ay4 ay4, ay4 ay42, fk6 fk6, fk6 fk62) {
        boolean z2;
        yo4 yo42 = yo4;
        ay4 ay43 = ay4;
        fk6 fk63 = fk6;
        fk6 fk64 = fk62;
        Region region = (Region) ay43.x;
        ay4 ay44 = ay42;
        Region region2 = (Region) ay44.x;
        uy3 uy3 = fk64.c;
        uy3 uy32 = fk64.c;
        if (uy3.K() && uy32.J() && !region2.isEmpty()) {
            ly5 m2 = fk64.m();
            if (m2.f()) {
                dk6 f2 = fk64.f();
                if (f2 == null) {
                    hc3 hc3 = (hc3) uy32.a0.d;
                    m2 = t49.I(hc3).Q(hc3, false);
                } else {
                    ll4 ll4 = ((ll4) f2).w;
                    Object g2 = fk64.d.w.g(zj6.b);
                    if (g2 == null) {
                        g2 = null;
                    }
                    if (g2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m2 = g75.y(ll4, z2, false);
                }
            }
            se3 O = tf4.O(m2);
            ay43.w(O);
            if (region.op(region2, Region.Op.INTERSECT)) {
                int i2 = fk64.f;
                if (i2 == fk63.f) {
                    i2 = -1;
                }
                Rect bounds = region.getBounds();
                yo42.i(i2, new hk6(fk64, new se3(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                List j2 = fk6.j(4, fk64);
                int size = j2.size() - 1;
                while (-1 < size) {
                    vr2 vr22 = vr2;
                    if (!((Boolean) vr22.y(j2.get(size))).booleanValue()) {
                        n(vr22, yo42, ay43, ay44, fk63, (fk6) j2.get(size));
                    }
                    size--;
                    ay43 = ay4;
                    ay44 = ay42;
                }
                if (A(fk64)) {
                    region2.op(O.a, O.b, O.c, O.d, Region.Op.DIFFERENCE);
                }
            }
        } else if (fk64.o()) {
            o(yo42, fk63, fk64);
        }
    }

    public static final void o(yo4 yo4, fk6 fk6, fk6 fk62) {
        ly5 ly5;
        uy3 uy3;
        fk6 l2 = fk62.l();
        if (l2 == null || (uy3 = l2.c) == null || !uy3.K()) {
            ly5 = u;
        } else {
            ly5 = l2.g();
        }
        int i2 = fk62.f;
        if (i2 == fk6.f) {
            i2 = -1;
        }
        yo4.i(i2, new hk6(fk62, tf4.O(ly5)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ad, code lost:
        if (r5 != null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        if (r2 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void p(vr2 vr2, yo4 yo4, ay4 ay4, ay4 ay42, fk6 fk6, fk6 fk62) {
        boolean z2;
        boolean z3;
        ly5 ly5;
        Object obj;
        boolean z4;
        vr2 vr22 = vr2;
        yo4 yo42 = yo4;
        ay4 ay43 = ay4;
        fk6 fk63 = fk6;
        fk6 fk64 = fk62;
        int i2 = fk63.f;
        Region region = (Region) ay43.x;
        ay4 ay44 = ay42;
        Region region2 = (Region) ay44.x;
        uy3 uy3 = fk64.c;
        ak6 ak6 = fk64.d;
        uy3 uy32 = fk64.c;
        int i3 = fk64.f;
        if (!uy3.K() || !uy32.J()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (region2.isEmpty() && i3 != i2) {
            return;
        }
        if (!z2 || fk64.o()) {
            se3 O = tf4.O(fk64.m());
            ay43.w(O);
            if (i3 == i2) {
                i3 = -1;
            }
            if (region.op(region2, Region.Op.INTERSECT)) {
                Rect bounds = region.getBounds();
                yo42.i(i3, new hk6(fk64, new se3(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                List j2 = fk6.j(4, fk64);
                if (ak6.y) {
                    fk6 l2 = fk64.l();
                    while (true) {
                        if (l2 == null) {
                            l2 = null;
                            break;
                        }
                        tp4 tp4 = l2.d.w;
                        if (tp4.c(jk6.w) || tp4.c(jk6.v)) {
                            break;
                        }
                        l2 = l2.l();
                    }
                    if (l2 != null) {
                        xz4 d2 = fk64.d();
                        if (d2 != null) {
                            if (!d2.c1().J) {
                                d2 = null;
                            }
                        }
                        d2 = null;
                        xz4 d3 = l2.d();
                        if (d3 != null) {
                            if (!d3.c1().J) {
                                d3 = null;
                            }
                        }
                        d3 = null;
                        if (!(d2 == null || d3 == null)) {
                            ly5 Q = d3.Q(d2, false);
                            z3 = !Q.equals(Q.e(z85.c(0, pv8.O(d3.y))));
                            if (z3) {
                                ay4 ay45 = new ay4(8);
                                dk6 f2 = fk64.f();
                                if (f2 == null) {
                                    hc3 hc3 = (hc3) uy32.a0.d;
                                    ly5 = t49.I(hc3).Q(hc3, false);
                                } else {
                                    ll4 ll4 = ((ll4) f2).w;
                                    Object g2 = ak6.w.g(zj6.b);
                                    if (g2 == null) {
                                        obj = null;
                                    } else {
                                        obj = g2;
                                    }
                                    if (obj != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    ly5 = g75.y(ll4, z4, false);
                                }
                                ay45.w(tf4.O(ly5));
                                int size = j2.size() - 1;
                                while (-1 < size) {
                                    if (!((Boolean) vr22.y(j2.get(size))).booleanValue()) {
                                        n(vr22, yo42, new ay4(8), ay45, fk6, (fk6) j2.get(size));
                                    }
                                    size--;
                                    yo42 = yo4;
                                }
                                if (!A(fk64)) {
                                    region2.op(O.a, O.b, O.c, O.d, Region.Op.DIFFERENCE);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z3 = false;
                    if (z3) {
                    }
                }
                int size2 = j2.size() - 1;
                while (-1 < size2) {
                    if (((Boolean) vr22.y(j2.get(size2))).booleanValue()) {
                        yo4 yo43 = yo4;
                        fk6 fk65 = fk6;
                    } else {
                        p(vr22, yo4, ay4, ay44, fk6, (fk6) j2.get(size2));
                    }
                    size2--;
                    vr22 = vr2;
                    ay44 = ay42;
                }
                if (!A(fk64)) {
                }
            } else if (fk64.o()) {
                o(yo42, fk63, fk64);
            } else if (i3 == -1) {
                Rect bounds2 = region.getBounds();
                yo42.i(i3, new hk6(fk64, new se3(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
            }
        }
    }

    public static ColorStateList q(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !wk0.u(drawable)) {
            return null;
        }
        return wk0.g(drawable).getColorStateList();
    }

    public static final li4 t(qs5 qs5, vq4 vq4, wv1 wv1, boolean z2, boolean z3, boolean z4) {
        qs5.getClass();
        vq4.getClass();
        yu2 yu2 = qp3.d;
        yu2.getClass();
        kp3 kp3 = (kp3) jb5.n(qs5, yu2);
        if (kp3 != null) {
            if (z2) {
                y92 y92 = rp3.a;
                po3 b2 = rp3.b(qs5, vq4, wv1, z4);
                if (b2 != null) {
                    return rd3.r(b2);
                }
            } else if (z3 && (kp3.x & 2) == 2) {
                ip3 ip3 = kp3.z;
                ip3.getClass();
                return new li4(vq4.getString(ip3.y).concat(vq4.getString(ip3.z)));
            }
        }
        return null;
    }

    public static /* synthetic */ li4 u(qs5 qs5, vq4 vq4, wv1 wv1, int i2) {
        boolean z2;
        boolean z3;
        if ((i2 & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i2 & 16) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        return t(qs5, vq4, wv1, z2, z3, true);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, mi8] */
    public static wh8 v(Context context) {
        z65.k(context);
        return new wh8(context, new Object());
    }

    public static final void w(e81 e81, Throwable th) {
        Throwable th2;
        for (i81 B2 : j81.a) {
            try {
                B2.B(e81, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable unused2) {
            }
        }
        try {
            su0.b(th, new DiagnosticCoroutineContextException(e81));
        } catch (Throwable unused3) {
        }
        Thread currentThread = Thread.currentThread();
        try {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        } catch (Throwable unused4) {
        }
    }

    public static final int x(os osVar, Object obj, int i2) {
        int i3 = osVar.y;
        if (i3 == 0) {
            return -1;
        }
        try {
            int q2 = ie1.q(i3, i2, osVar.w);
            if (q2 < 0 || sg3.e(obj, osVar.x[q2])) {
                return q2;
            }
            int i4 = q2 + 1;
            while (i4 < i3 && osVar.w[i4] == i2) {
                if (sg3.e(obj, osVar.x[i4])) {
                    return i4;
                }
                i4++;
            }
            int i5 = q2 - 1;
            while (i5 >= 0 && osVar.w[i5] == i2) {
                if (sg3.e(obj, osVar.x[i5])) {
                    return i5;
                }
                i5--;
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[RETURN] */
    public static final boolean y(u16 u16) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (u16 instanceof kr3) {
            Field j2 = wn6.j(u16);
            if (j2 != null) {
                z4 = j2.isAccessible();
            } else {
                z4 = true;
            }
            if (!z4) {
                return false;
            }
            Method k2 = wn6.k(u16.c());
            if (k2 != null) {
                z5 = k2.isAccessible();
            } else {
                z5 = true;
            }
            if (!z5) {
                return false;
            }
            Method k3 = wn6.k(((kr3) u16).d());
            if (k3 != null) {
                z6 = k3.isAccessible();
            } else {
                z6 = true;
            }
            if (z6) {
                return true;
            }
            return false;
        }
        Field j3 = wn6.j(u16);
        if (j3 != null) {
            z2 = j3.isAccessible();
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        Method k4 = wn6.k(u16.c());
        if (k4 != null) {
            z3 = k4.isAccessible();
        } else {
            z3 = true;
        }
        if (!z3) {
            return false;
        }
        return true;
    }

    public static final boolean z(fk6 fk6) {
        boolean z2;
        xz4 d2 = fk6.d();
        tp4 tp4 = fk6.d.w;
        if (d2 != null) {
            z2 = d2.k1();
        } else {
            z2 = false;
        }
        if (z2 || tp4.c(jk6.q) || tp4.c(jk6.p)) {
            return true;
        }
        return false;
    }

    public String r() {
        return null;
    }

    public String s() {
        return null;
    }
}
