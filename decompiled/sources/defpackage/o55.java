package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: o55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class o55 implements ja9 {
    public static final /* synthetic */ int w = 0;
    public static x83 x;

    public static final long a(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
        int i = ql7.c;
        return floatToRawIntBits2;
    }

    public static final void b(a57 a57, a57 a572) {
        a57.getClass();
        a572.getClass();
        for (Map.Entry entry : a572.l()) {
            a57.L((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077 A[RETURN] */
    public static final boolean c(vk2 vk2, zj zjVar) {
        boolean z;
        int ordinal = vk2.a1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                vk2 k0 = bb0.k0(vk2);
                if (k0 != null) {
                    int ordinal2 = k0.a1().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    h.c();
                                    return false;
                                }
                                h.s("ActiveParent must have a focusedChild");
                                return false;
                            }
                        } else if (c(k0, zjVar) || i(vk2, k0, 2, zjVar) || (k0.X0().a && ((Boolean) zjVar.y(k0)).booleanValue())) {
                        }
                    }
                    return i(vk2, k0, 2, zjVar);
                }
                h.s("ActiveParent must have a focusedChild");
                return false;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    if (!n(vk2, zjVar)) {
                        if (vk2.X0().a) {
                            z = ((Boolean) zjVar.y(vk2)).booleanValue();
                        } else {
                            z = false;
                        }
                        if (z) {
                            return true;
                        }
                    }
                    return true;
                }
                h.c();
                return false;
            }
            return false;
        }
        return n(vk2, zjVar);
    }

    public static uv5 e(long j, long j2, yt2 yt2) {
        long j3;
        long j4;
        long j5;
        long j6 = jt0.g;
        qt0 qt0 = ((zg4) yt2.k(ch4.b)).a;
        uv5 uv5 = qt0.l0;
        if (uv5 == null) {
            uv5 uv52 = new uv5(st0.d(qt0, kl8.q), st0.d(qt0, kl8.s), jt0.b(0.38f, st0.d(qt0, kl8.n)), jt0.b(0.38f, st0.d(qt0, kl8.o)));
            qt0.l0 = uv52;
            uv5 = uv52;
        }
        if (j != 16) {
            j3 = j;
        } else {
            j3 = uv5.a;
        }
        if (j2 != 16) {
            j4 = j2;
        } else {
            j4 = uv5.b;
        }
        if (j6 != 16) {
            j5 = j6;
        } else {
            j5 = uv5.c;
        }
        if (j6 == 16) {
            j6 = uv5.d;
        }
        return new uv5(j3, j4, j5, j6);
    }

    public static final void f(sx2 sx2, b38 b38) {
        Path.FillType fillType;
        List list = b38.F;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h38 h38 = (h38) list.get(i);
            if (h38 instanceof l38) {
                ce5 ce5 = new ce5();
                l38 l38 = (l38) h38;
                ce5.d = l38.x;
                ce5.n = true;
                ce5.c();
                int i2 = l38.y;
                Path path = ce5.s.a;
                if (i2 == 1) {
                    fillType = Path.FillType.EVEN_ODD;
                } else {
                    fillType = Path.FillType.WINDING;
                }
                path.setFillType(fillType);
                ce5.c();
                ce5.c();
                ce5.b = l38.z;
                ce5.c();
                ce5.c = l38.A;
                ce5.c();
                ce5.g = l38.B;
                ce5.c();
                ce5.e = l38.C;
                ce5.c();
                ce5.f = l38.D;
                ce5.o = true;
                ce5.c();
                ce5.h = l38.E;
                ce5.o = true;
                ce5.c();
                ce5.i = l38.F;
                ce5.o = true;
                ce5.c();
                ce5.j = l38.G;
                ce5.o = true;
                ce5.c();
                ce5.k = l38.H;
                ce5.p = true;
                ce5.c();
                ce5.l = l38.I;
                ce5.p = true;
                ce5.c();
                ce5.m = l38.J;
                ce5.p = true;
                ce5.c();
                sx2.e(i, ce5);
            } else if (h38 instanceof b38) {
                sx2 sx22 = new sx2();
                b38 b382 = (b38) h38;
                sx22.k = b382.w;
                sx22.c();
                sx22.l = b382.x;
                sx22.s = true;
                sx22.c();
                sx22.o = b382.A;
                sx22.s = true;
                sx22.c();
                sx22.p = b382.B;
                sx22.s = true;
                sx22.c();
                sx22.q = b382.C;
                sx22.s = true;
                sx22.c();
                sx22.r = b382.D;
                sx22.s = true;
                sx22.c();
                sx22.m = b382.y;
                sx22.s = true;
                sx22.c();
                sx22.n = b382.z;
                sx22.s = true;
                sx22.c();
                sx22.f = b382.E;
                sx22.g = true;
                sx22.c();
                f(sx22, b382);
                sx2.e(i, sx22);
            }
        }
    }

    public static final void g(eh ehVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        boolean z3;
        double d10 = d;
        double d11 = d3;
        double d12 = d5;
        double d13 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d13);
        double sin = Math.sin(d13);
        double d14 = ((d2 * sin) + (d10 * cos)) / d12;
        double d15 = ((d2 * cos) + ((-d10) * sin)) / d6;
        double d16 = ((d4 * sin) + (d11 * cos)) / d12;
        double d17 = ((d4 * cos) + ((-d11) * sin)) / d6;
        double d18 = d14 - d16;
        double d19 = d15 - d17;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d15 + d17) / 2.0d;
        double d22 = (d19 * d19) + (d18 * d18);
        if (d22 != 0.0d) {
            double d23 = (1.0d / d22) - 0.25d;
            if (d23 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d22) / 1.99999d));
                g(ehVar, d10, d2, d11, d4, d12 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            boolean z4 = z2;
            double sqrt2 = Math.sqrt(d23);
            double d24 = d18 * sqrt2;
            double d25 = sqrt2 * d19;
            if (z == z4) {
                d9 = d20 - d25;
                d8 = d21 + d24;
            } else {
                d9 = d20 + d25;
                d8 = d21 - d24;
            }
            double atan2 = Math.atan2(d15 - d8, d14 - d9);
            double atan22 = Math.atan2(d17 - d8, d16 - d9) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z4 != z3) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d26 = d9 * d12;
            double d27 = d8 * d6;
            double d28 = (d26 * cos) - (d27 * sin);
            double d29 = (d27 * cos) + (d26 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d13);
            double sin2 = Math.sin(d13);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d30 = -d12;
            double d31 = d30 * cos2;
            double d32 = d6 * sin2;
            double d33 = (d31 * sin3) - (d32 * cos3);
            double d34 = d30 * sin2;
            double d35 = d6 * cos2;
            double d36 = (cos3 * d35) + (sin3 * d34);
            double d37 = atan22 / ((double) ceil);
            double d38 = atan2;
            double d39 = d33;
            int i2 = 0;
            double d40 = d36;
            double d41 = d2;
            while (i2 < ceil) {
                double d42 = d38 + d37;
                double sin4 = Math.sin(d42);
                double cos4 = Math.cos(d42);
                int i3 = ceil;
                double d43 = (((d12 * cos2) * cos4) + d28) - (d32 * sin4);
                int i4 = i3;
                double d44 = (d35 * sin4) + (d12 * sin2 * cos4) + d29;
                double d45 = (d31 * sin4) - (d32 * cos4);
                double d46 = (cos4 * d35) + (sin4 * d34);
                double d47 = d42 - d38;
                double tan = Math.tan(d47 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
                Path path = ehVar.a;
                path.cubicTo((float) ((d39 * sqrt3) + d), (float) ((d40 * sqrt3) + d41), (float) (d43 - (sqrt3 * d45)), (float) (d44 - (sqrt3 * d46)), (float) d43, (float) d44);
                d37 = d37;
                sin2 = sin2;
                d28 = d28;
                d = d43;
                i2++;
                d34 = d34;
                d38 = d42;
                d40 = d46;
                d39 = d45;
                ceil = i4;
                d41 = d44;
                d12 = d5;
            }
        }
    }

    public static final boolean h(vk2 vk2, zj zjVar) {
        int ordinal = vk2.a1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                vk2 k0 = bb0.k0(vk2);
                if (k0 == null) {
                    h.s("ActiveParent must have a focusedChild");
                    return false;
                } else if (h(k0, zjVar) || i(vk2, k0, 1, zjVar)) {
                    return true;
                } else {
                    return false;
                }
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    h.c();
                    return false;
                } else if (vk2.X0().a) {
                    return ((Boolean) zjVar.y(vk2)).booleanValue();
                } else {
                    return o(vk2, zjVar);
                }
            }
        }
        return o(vk2, zjVar);
    }

    public static final boolean i(vk2 vk2, vk2 vk22, int i, zj zjVar) {
        if (r(vk2, vk22, i, zjVar)) {
            return true;
        }
        vk2 vk23 = vk2;
        int i2 = i;
        Boolean bool = (Boolean) we.M(vk23, i2, new n55(((lk2) ((je) rc9.P0(vk2)).getFocusOwner()).g(), vk23, vk22, i2, zjVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final p56 j(bg7 bg7, int i) {
        ag7 ag7 = bg7.a;
        pn4 pn4 = bg7.b;
        if (ag7.a.x.length() != 0) {
            int d = pn4.d(i);
            if ((i != 0 && d == pn4.d(i - 1)) || (i != ag7.a.x.length() && d == pn4.d(i + 1))) {
                return bg7.a(i);
            }
        }
        return bg7.h(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        defpackage.dh4.f(r2, r0);
     */
    public static final int k(ua6 ua6) {
        ua6.getClass();
        ab6 k0 = ua6.k0("SELECT changes()");
        k0.i0();
        int i = (int) k0.getLong(0);
        dh4.f(k0, (Throwable) null);
        return i;
    }

    public static final long l(float f, long j) {
        if (Float.isNaN(f) || f >= 1.0f) {
            return j;
        }
        return jt0.b(jt0.d(j) * f, j);
    }

    public static final bd5 m(int i) {
        return new bd5(i);
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final boolean n(vk2 vk2, zj zjVar) {
        vk2[] vk2Arr = new vk2[16];
        if (!vk2.w.J) {
            yb3.b("visitChildren called on an unattached node");
        }
        eq4 eq4 = new eq4(new ll4[16]);
        ll4 ll4 = vk2.w;
        ll4 ll42 = ll4.B;
        if (ll42 == null) {
            rc9.h(eq4, ll4);
        } else {
            eq4.b(ll42);
        }
        int i = 0;
        while (true) {
            int i2 = eq4.y;
            if (i2 == 0) {
                break;
            }
            ll4 ll43 = (ll4) eq4.l(i2 - 1);
            if ((ll43.z & 1024) == 0) {
                rc9.h(eq4, ll43);
            } else {
                while (true) {
                    if (ll43 == null) {
                        break;
                    } else if ((ll43.y & 1024) != 0) {
                        eq4 eq42 = null;
                        while (ll43 != null) {
                            if (ll43 instanceof vk2) {
                                vk2 vk22 = (vk2) ll43;
                                int i3 = i + 1;
                                if (vk2Arr.length < i3) {
                                    int length = vk2Arr.length;
                                    ? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(vk2Arr, 0, r10, 0, length);
                                    vk2Arr = r10;
                                }
                                vk2Arr[i] = vk22;
                                i = i3;
                            } else if ((ll43.y & 1024) != 0 && (ll43 instanceof wo1)) {
                                int i4 = 0;
                                for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                    if ((ll44.y & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            ll43 = ll44;
                                        } else {
                                            if (eq42 == null) {
                                                eq42 = new eq4(new ll4[16]);
                                            }
                                            if (ll43 != null) {
                                                eq42.b(ll43);
                                                ll43 = null;
                                            }
                                            eq42.b(ll44);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            ll43 = rc9.j(eq42);
                        }
                    } else {
                        ll43 = ll43.B;
                    }
                }
            }
        }
        Arrays.sort(vk2Arr, 0, i, a91.y);
        int i5 = i - 1;
        if (i5 < vk2Arr.length) {
            while (i5 >= 0) {
                vk2 vk23 = vk2Arr[i5];
                if (bb0.q0(vk23) && c(vk23, zjVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final boolean o(vk2 vk2, zj zjVar) {
        vk2[] vk2Arr = new vk2[16];
        if (!vk2.w.J) {
            yb3.b("visitChildren called on an unattached node");
        }
        eq4 eq4 = new eq4(new ll4[16]);
        ll4 ll4 = vk2.w;
        ll4 ll42 = ll4.B;
        if (ll42 == null) {
            rc9.h(eq4, ll4);
        } else {
            eq4.b(ll42);
        }
        int i = 0;
        while (true) {
            int i2 = eq4.y;
            if (i2 == 0) {
                break;
            }
            ll4 ll43 = (ll4) eq4.l(i2 - 1);
            if ((ll43.z & 1024) == 0) {
                rc9.h(eq4, ll43);
            } else {
                while (true) {
                    if (ll43 == null) {
                        break;
                    } else if ((ll43.y & 1024) != 0) {
                        eq4 eq42 = null;
                        while (ll43 != null) {
                            if (ll43 instanceof vk2) {
                                vk2 vk22 = (vk2) ll43;
                                int i3 = i + 1;
                                if (vk2Arr.length < i3) {
                                    int length = vk2Arr.length;
                                    ? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(vk2Arr, 0, r10, 0, length);
                                    vk2Arr = r10;
                                }
                                vk2Arr[i] = vk22;
                                i = i3;
                            } else if ((ll43.y & 1024) != 0 && (ll43 instanceof wo1)) {
                                int i4 = 0;
                                for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                    if ((ll44.y & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            ll43 = ll44;
                                        } else {
                                            if (eq42 == null) {
                                                eq42 = new eq4(new ll4[16]);
                                            }
                                            if (ll43 != null) {
                                                eq42.b(ll43);
                                                ll43 = null;
                                            }
                                            eq42.b(ll44);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            ll43 = rc9.j(eq42);
                        }
                    } else {
                        ll43 = ll43.B;
                    }
                }
            }
        }
        Arrays.sort(vk2Arr, 0, i, a91.y);
        for (int i5 = 0; i5 < i; i5++) {
            vk2 vk23 = vk2Arr[i5];
            if (bb0.q0(vk23) && h(vk23, zjVar)) {
                return true;
            }
        }
        return false;
    }

    public static final cx0 p(k54 k54, yt2 yt2) {
        t54 t54 = (t54) yt2.k(ha4.a);
        boolean g = yt2.g(t54);
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (g || Q == d63) {
            Q = new cx0();
            yt2.o0(Q);
        }
        cx0 cx0 = (cx0) Q;
        boolean i = yt2.i(cx0) | yt2.i(t54);
        Object Q2 = yt2.Q();
        if (i || Q2 == d63) {
            Q2 = new w34(21, t54, cx0);
            yt2.o0(Q2);
        }
        t49.f(cx0, t54, (vr2) Q2, yt2);
        boolean i2 = yt2.i(cx0) | yt2.e(k54.ordinal());
        Object Q3 = yt2.Q();
        if (i2 || Q3 == d63) {
            Q3 = new tc1(cx0, k54, (f61) null, 14);
            yt2.o0(Q3);
        }
        t49.j(cx0, k54, (gs2) Q3, yt2);
        return cx0;
    }

    public static final k38 q(x83 x83, yt2 yt2) {
        u90 u90;
        tp1 tp1 = (tp1) yt2.k(xy0.h);
        float b = tp1.b();
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) x83.j);
        boolean f = yt2.f((((long) Float.floatToRawIntBits(b)) & 4294967295L) | (floatToRawIntBits << 32));
        Object Q = yt2.Q();
        if (f || Q == ay0.a) {
            sx2 sx2 = new sx2();
            f(sx2, x83.f);
            float f2 = x83.b;
            float f3 = x83.c;
            long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(tp1.e0(f2))) << 32) | (((long) Float.floatToRawIntBits(tp1.e0(f3))) & 4294967295L);
            float f4 = x83.d;
            float f5 = x83.e;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L));
            }
            long floatToRawIntBits3 = (((long) Float.floatToRawIntBits(f4)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f5)));
            k38 k38 = new k38(sx2);
            String str = x83.a;
            long j = x83.g;
            int i = x83.h;
            if (j != 16) {
                u90 = new u90(j, i);
            } else {
                u90 = null;
            }
            boolean z = x83.i;
            k38.A.setValue(new wu6(floatToRawIntBits2));
            k38.B.setValue(Boolean.valueOf(z));
            m28 m28 = k38.C;
            m28.g.setValue(u90);
            m28.i.setValue(new wu6(floatToRawIntBits3));
            m28.c = str;
            yt2.o0(k38);
            Q = k38;
        }
        return (k38) Q;
    }

    /* JADX WARNING: type inference failed for: r11v5, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x019b A[EDGE_INSN: B:148:0x019b->B:121:0x019b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012e  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final boolean r(vk2 vk2, vk2 vk22, int i, zj zjVar) {
        ll4 ll4;
        uy3 O0;
        o00 o00;
        if (vk2.a1() == sk2.x) {
            vk2[] vk2Arr = new vk2[16];
            if (!vk2.w.J) {
                yb3.b("visitChildren called on an unattached node");
            }
            eq4 eq4 = new eq4(new ll4[16]);
            ll4 ll42 = vk2.w;
            ll4 ll43 = ll42.B;
            if (ll43 == null) {
                rc9.h(eq4, ll42);
            } else {
                eq4.b(ll43);
            }
            int i2 = 0;
            while (true) {
                int i3 = eq4.y;
                ll4 = null;
                if (i3 == 0) {
                    break;
                }
                ll4 ll44 = (ll4) eq4.l(i3 - 1);
                if ((ll44.z & 1024) == 0) {
                    rc9.h(eq4, ll44);
                } else {
                    while (true) {
                        if (ll44 == null) {
                            break;
                        } else if ((ll44.y & 1024) != 0) {
                            eq4 eq42 = null;
                            while (ll44 != null) {
                                if (ll44 instanceof vk2) {
                                    vk2 vk23 = (vk2) ll44;
                                    int i4 = i2 + 1;
                                    if (vk2Arr.length < i4) {
                                        int length = vk2Arr.length;
                                        ? r11 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(vk2Arr, 0, r11, 0, length);
                                        vk2Arr = r11;
                                    }
                                    vk2Arr[i2] = vk23;
                                    i2 = i4;
                                } else if ((ll44.y & 1024) != 0 && (ll44 instanceof wo1)) {
                                    int i5 = 0;
                                    for (ll4 ll45 = ((wo1) ll44).L; ll45 != null; ll45 = ll45.B) {
                                        if ((ll45.y & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                ll44 = ll45;
                                            } else {
                                                if (eq42 == null) {
                                                    eq42 = new eq4(new ll4[16]);
                                                }
                                                if (ll44 != null) {
                                                    eq42.b(ll44);
                                                    ll44 = null;
                                                }
                                                eq42.b(ll45);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                ll44 = rc9.j(eq42);
                            }
                        } else {
                            ll44 = ll44.B;
                        }
                    }
                }
            }
            Arrays.sort(vk2Arr, 0, i2, a91.y);
            if (i == 1) {
                re3 V = z65.V(0, i2);
                int i6 = V.w;
                int i7 = V.x;
                if (i6 <= i7) {
                    boolean z = false;
                    while (true) {
                        if (z) {
                            vk2 vk24 = vk2Arr[i6];
                            if (bb0.q0(vk24) && h(vk24, zjVar)) {
                                break;
                            }
                        }
                        if (sg3.e(vk2Arr[i6], vk22)) {
                            z = true;
                        }
                        if (i6 == i7) {
                            break;
                        }
                        i6++;
                    }
                }
                if (i != 1 && vk2.X0().a) {
                    if (!vk2.w.J) {
                        yb3.b("visitAncestors called on an unattached node");
                    }
                    ll4 ll46 = vk2.w.A;
                    O0 = rc9.O0(vk2);
                    loop6:
                    while (true) {
                        if (O0 == null) {
                            break;
                        }
                        if ((((ll4) O0.a0.g).z & 1024) != 0) {
                            while (ll46 != null) {
                                if ((ll46.y & 1024) != 0) {
                                    ll4 ll47 = ll46;
                                    eq4 eq43 = null;
                                    while (ll47 != null) {
                                        if (ll47 instanceof vk2) {
                                            ll4 = ll47;
                                            break loop6;
                                        }
                                        if ((ll47.y & 1024) != 0 && (ll47 instanceof wo1)) {
                                            int i8 = 0;
                                            for (ll4 ll48 = ((wo1) ll47).L; ll48 != null; ll48 = ll48.B) {
                                                if ((ll48.y & 1024) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        ll47 = ll48;
                                                    } else {
                                                        if (eq43 == null) {
                                                            eq43 = new eq4(new ll4[16]);
                                                        }
                                                        if (ll47 != null) {
                                                            eq43.b(ll47);
                                                            ll47 = null;
                                                        }
                                                        eq43.b(ll48);
                                                    }
                                                }
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        ll47 = rc9.j(eq43);
                                    }
                                    continue;
                                }
                                ll46 = ll46.A;
                            }
                        }
                        O0 = O0.v();
                        if (O0 == null || (o00 = O0.a0) == null) {
                            ll46 = null;
                        } else {
                            ll46 = (ib7) o00.f;
                        }
                    }
                    if (ll4 != null) {
                        return ((Boolean) zjVar.y(vk2)).booleanValue();
                    }
                }
                return false;
            } else if (i == 2) {
                re3 V2 = z65.V(0, i2);
                int i9 = V2.w;
                int i10 = V2.x;
                if (i9 <= i10) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            vk2 vk25 = vk2Arr[i10];
                            if (bb0.q0(vk25) && c(vk25, zjVar)) {
                                break;
                            }
                        }
                        if (sg3.e(vk2Arr[i10], vk22)) {
                            z2 = true;
                        }
                        if (i10 == i9) {
                            break;
                        }
                        i10--;
                    }
                }
                if (!vk2.w.J) {
                }
                ll4 ll462 = vk2.w.A;
                O0 = rc9.O0(vk2);
                loop6:
                while (true) {
                    if (O0 == null) {
                    }
                }
                if (ll4 != null) {
                }
                return false;
            } else {
                h.s("This function should only be used for 1-D focus search");
                return false;
            }
            return true;
        }
        h.s("This function should only be used within a parent that has focus.");
        return false;
    }

    public static void s(Window window, boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            x4.g(window, z);
        } else if (i2 >= 30) {
            x4.f(window, z);
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & -1793;
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    public static final Object t(sg6 sg6, boolean z, sg6 sg62, gs2 gs2) {
        Object obj;
        Object d0;
        try {
            if (!(gs2 instanceof q50)) {
                obj = rc9.h1(gs2, sg62, sg6);
            } else {
                mp7.Q(2, gs2);
                obj = gs2.H(sg62, sg6);
            }
        } catch (DispatchException e) {
            Throwable th = e.w;
            sg6.c0(new av0(th, false));
            throw th;
        } catch (Throwable th2) {
            obj = new av0(th2, false);
        }
        p81 p81 = p81.w;
        if (obj == p81 || (d0 = sg6.d0(obj)) == ml3.b) {
            return p81;
        }
        sg6.y0();
        if (!(d0 instanceof av0)) {
            return ml3.a(d0);
        }
        if (!z) {
            Throwable th3 = ((av0) d0).a;
            if ((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).w == sg6) {
                if (!(obj instanceof av0)) {
                    return obj;
                }
                throw ((av0) obj).a;
            }
        }
        throw ((av0) d0).a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: we5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: float} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void u(List list, eh ehVar) {
        boolean z;
        we5 we5;
        float f;
        we5 we52;
        Path path;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        Path path2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        eh ehVar2 = ehVar;
        Path path3 = ehVar2.a;
        Path path4 = ehVar2.a;
        Path.FillType fillType = path3.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        if (fillType == fillType2) {
            z = true;
        } else {
            z = false;
        }
        ehVar2.h();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path4.setFillType(fillType2);
        if (list2.isEmpty()) {
            we5 = ee5.c;
        } else {
            we5 = (we5) list2.get(0);
        }
        int size = list2.size();
        float f11 = 0.0f;
        int i3 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i3 < size) {
            we5 we53 = list2.get(i3);
            if (we53 instanceof ee5) {
                path4.close();
                path = path4;
                i2 = size;
                f = f11;
                i = i3;
                we52 = we53;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (we53 instanceof qe5) {
                    qe5 qe5 = (qe5) we53;
                    float f18 = qe5.c;
                    f14 += f18;
                    float f19 = qe5.d;
                    f15 += f19;
                    path4.rMoveTo(f18, f19);
                    path = path4;
                    i2 = size;
                    f = f11;
                    i = i3;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (we53 instanceof ie5) {
                        ie5 ie5 = (ie5) we53;
                        float f20 = ie5.c;
                        float f21 = ie5.d;
                        path4.moveTo(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        path = path4;
                        f14 = f20;
                        f16 = f14;
                    } else {
                        if (we53 instanceof pe5) {
                            pe5 pe5 = (pe5) we53;
                            float f22 = pe5.d;
                            float f23 = pe5.c;
                            path4.rLineTo(f23, f22);
                            f14 += f23;
                            f15 += f22;
                        } else if (we53 instanceof he5) {
                            he5 he5 = (he5) we53;
                            float f24 = he5.d;
                            float f25 = he5.c;
                            ehVar2.e(f25, f24);
                            f14 = f25;
                            path = path4;
                            f15 = f24;
                        } else if (we53 instanceof oe5) {
                            float f26 = ((oe5) we53).c;
                            path4.rLineTo(f26, f11);
                            f14 += f26;
                        } else if (we53 instanceof ge5) {
                            float f27 = ((ge5) we53).c;
                            ehVar2.e(f27, f15);
                            f14 = f27;
                        } else {
                            if (we53 instanceof ue5) {
                                f10 = ((ue5) we53).c;
                                path4.rLineTo(f11, f10);
                            } else if (we53 instanceof ve5) {
                                float f28 = ((ve5) we53).c;
                                ehVar2.e(f14, f28);
                                f15 = f28;
                            } else if (we53 instanceof ne5) {
                                ne5 ne5 = (ne5) we53;
                                path4.rCubicTo(ne5.c, ne5.d, ne5.e, ne5.f, ne5.g, ne5.h);
                                f12 = ne5.e + f14;
                                f13 = ne5.f + f15;
                                f14 += ne5.g;
                                f10 = ne5.h;
                            } else {
                                if (we53 instanceof fe5) {
                                    fe5 fe5 = (fe5) we53;
                                    path4.cubicTo(fe5.c, fe5.d, fe5.e, fe5.f, fe5.g, fe5.h);
                                    f12 = fe5.e;
                                    f13 = fe5.f;
                                    f6 = fe5.g;
                                    f7 = fe5.h;
                                } else if (we53 instanceof se5) {
                                    if (we5.a) {
                                        f8 = f15 - f13;
                                        f9 = f14 - f12;
                                    } else {
                                        f9 = f11;
                                        f8 = f9;
                                    }
                                    se5 se5 = (se5) we53;
                                    path4.rCubicTo(f9, f8, se5.c, se5.d, se5.e, se5.f);
                                    f12 = se5.c + f14;
                                    f13 = se5.d + f15;
                                    f14 += se5.e;
                                    f10 = se5.f;
                                } else if (we53 instanceof ke5) {
                                    if (we5.a) {
                                        f14 = (f14 * 2.0f) - f12;
                                        f15 = (2.0f * f15) - f13;
                                    }
                                    ke5 ke5 = (ke5) we53;
                                    path4.cubicTo(f14, f15, ke5.c, ke5.d, ke5.e, ke5.f);
                                    f12 = ke5.c;
                                    f13 = ke5.d;
                                    f6 = ke5.e;
                                    f7 = ke5.f;
                                } else if (we53 instanceof re5) {
                                    re5 re5 = (re5) we53;
                                    float f29 = re5.f;
                                    float f30 = re5.e;
                                    float f31 = re5.d;
                                    float f32 = re5.c;
                                    path4.rQuadTo(f32, f31, f30, f29);
                                    float f33 = f32 + f14;
                                    float f34 = f31 + f15;
                                    f14 += f30;
                                    f15 += f29;
                                    f12 = f33;
                                    path = path4;
                                    f13 = f34;
                                } else {
                                    if (we53 instanceof je5) {
                                        je5 je5 = (je5) we53;
                                        float f35 = je5.f;
                                        float f36 = je5.e;
                                        float f37 = je5.d;
                                        f4 = je5.c;
                                        path4.quadTo(f4, f37, f36, f35);
                                        path2 = path4;
                                        f15 = f35;
                                        f14 = f36;
                                        f5 = f37;
                                    } else if (we53 instanceof te5) {
                                        if (we5.b) {
                                            f3 = f14 - f12;
                                            f2 = f15 - f13;
                                        } else {
                                            f3 = f11;
                                            f2 = f3;
                                        }
                                        te5 te5 = (te5) we53;
                                        float f38 = te5.d;
                                        float f39 = te5.c;
                                        path4.rQuadTo(f3, f2, f39, f38);
                                        f4 = f3 + f14;
                                        float f40 = f2 + f15;
                                        f14 += f39;
                                        f15 += f38;
                                        path2 = path4;
                                        f5 = f40;
                                    } else if (we53 instanceof le5) {
                                        if (we5.b) {
                                            f14 = (f14 * 2.0f) - f12;
                                            f15 = (2.0f * f15) - f13;
                                        }
                                        le5 le5 = (le5) we53;
                                        float f41 = le5.d;
                                        float f42 = le5.c;
                                        path4.quadTo(f14, f15, f42, f41);
                                        path = path4;
                                        i2 = size;
                                        f = f11;
                                        i = i3;
                                        f13 = f15;
                                        we52 = we53;
                                        f15 = f41;
                                        f12 = f14;
                                        f14 = f42;
                                    } else if (we53 instanceof me5) {
                                        me5 me5 = (me5) we53;
                                        float f43 = me5.h + f14;
                                        float f44 = me5.i + f15;
                                        double d = (double) me5.c;
                                        i2 = size;
                                        f = 0.0f;
                                        double d2 = d;
                                        path = path4;
                                        i = i3;
                                        float f45 = f43;
                                        double d3 = (double) f15;
                                        g(ehVar, (double) f14, d3, (double) f43, (double) f44, d2, (double) me5.d, (double) me5.e, me5.f, me5.g);
                                        f12 = f45;
                                        f14 = f12;
                                        f13 = f44;
                                        f15 = f13;
                                        we52 = we53;
                                    } else {
                                        path = path4;
                                        i2 = size;
                                        f = f11;
                                        i = i3;
                                        we5 we54 = we53;
                                        if (we54 instanceof de5) {
                                            de5 de5 = (de5) we54;
                                            float f46 = de5.i;
                                            float f47 = de5.h;
                                            double d4 = (double) f47;
                                            float f48 = f47;
                                            double d5 = (double) f46;
                                            we52 = we54;
                                            float f49 = f46;
                                            double d6 = (double) de5.e;
                                            boolean z2 = de5.f;
                                            boolean z3 = de5.g;
                                            boolean z4 = z3;
                                            g(ehVar, (double) f14, (double) f15, d4, d5, (double) de5.c, (double) de5.d, d6, z2, z4);
                                            f13 = f49;
                                            f15 = f13;
                                            f12 = f48;
                                            f14 = f12;
                                        } else {
                                            h.c();
                                            return;
                                        }
                                    }
                                    i2 = size;
                                    f = f11;
                                    i = i3;
                                    we52 = we53;
                                    f12 = f4;
                                }
                                f15 = f7;
                                path = path4;
                                f14 = f6;
                            }
                            f15 += f10;
                        }
                        path = path4;
                    }
                    i2 = size;
                    f = f11;
                    i = i3;
                }
                we52 = we53;
            }
            i3 = i + 1;
            list2 = list;
            ehVar2 = ehVar;
            size = i2;
            path4 = path;
            we5 = we52;
            f11 = f;
        }
    }

    public static String v(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                sb.append(str, i2, str.length());
            } else {
                sb.append(str, i2, indexOf);
                sb.append(w(objArr[i]));
                i2 = indexOf + 2;
                i++;
            }
        }
        sb.append(str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(w(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String w(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            Exception exc = e;
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String m = f21.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m), exc);
            String name2 = exc.getClass().getName();
            StringBuilder sb = new StringBuilder(m.length() + 8 + name2.length() + 1);
            f21.v(sb, "<", m, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static final InputStream x(ia9 ia9) {
        ga9 ga9;
        sa9 a = ia9.a.a(ia9.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        ArrayList arrayList2 = ia9.c;
        if (!arrayList2.isEmpty()) {
            int i = ga9.x;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                if (!arrayList3.isEmpty()) {
                    ga9 = new ga9(a, arrayList3);
                } else {
                    ga9 = null;
                }
                if (ga9 != null) {
                    arrayList.add(ga9);
                }
            } else {
                throw pb4.g(it);
            }
        }
        Iterator it2 = ia9.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        } else if (it2.next() != null) {
            ku4.a();
            return null;
        } else {
            InputStream inputStream = (InputStream) x91.B(arrayList);
            throw null;
        }
    }
}
