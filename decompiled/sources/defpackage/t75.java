package defpackage;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: t75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class t75 {
    public static x83 a;
    public static x83 b;

    public static final float E(long j, float f, tp1 tp1) {
        float c;
        long b2 = wg7.b(j);
        if (xg7.a(b2, 4294967296L)) {
            if (((double) tp1.Y()) <= 1.05d) {
                return tp1.C0(j);
            }
            c = wg7.c(j) / wg7.c(tp1.L(f));
        } else if (!xg7.a(b2, 8589934592L)) {
            return Float.NaN;
        } else {
            c = wg7.c(j);
        }
        return c * f;
    }

    public static final boolean F(int i, zj zjVar, vk2 vk2, ly5 ly5) {
        vk2 k;
        eq4 eq4 = new eq4(new vk2[16]);
        if (!vk2.w.J) {
            yb3.b("visitChildren called on an unattached node");
        }
        eq4 eq42 = new eq4(new ll4[16]);
        ll4 ll4 = vk2.w;
        ll4 ll42 = ll4.B;
        if (ll42 == null) {
            rc9.h(eq42, ll4);
        } else {
            eq42.b(ll42);
        }
        while (true) {
            int i2 = eq42.y;
            if (i2 == 0) {
                break;
            }
            ll4 ll43 = (ll4) eq42.l(i2 - 1);
            if ((ll43.z & 1024) == 0) {
                rc9.h(eq42, ll43);
            } else {
                while (true) {
                    if (ll43 == null) {
                        break;
                    } else if ((ll43.y & 1024) != 0) {
                        eq4 eq43 = null;
                        while (ll43 != null) {
                            if (ll43 instanceof vk2) {
                                vk2 vk22 = (vk2) ll43;
                                if (vk22.J) {
                                    eq4.b(vk22);
                                }
                            } else if ((ll43.y & 1024) != 0 && (ll43 instanceof wo1)) {
                                int i3 = 0;
                                for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                    if ((ll44.y & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            ll43 = ll44;
                                        } else {
                                            if (eq43 == null) {
                                                eq43 = new eq4(new ll4[16]);
                                            }
                                            if (ll43 != null) {
                                                eq43.b(ll43);
                                                ll43 = null;
                                            }
                                            eq43.b(ll44);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            ll43 = rc9.j(eq43);
                        }
                    } else {
                        ll43 = ll43.B;
                    }
                }
            }
        }
        while (eq4.y != 0 && (k = k(eq4, ly5, i)) != null) {
            if (k.X0().a) {
                return ((Boolean) zjVar.y(k)).booleanValue();
            }
            if (m(i, zjVar, k, ly5)) {
                return true;
            }
            eq4.k(k);
        }
        return false;
    }

    public static final void G(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(uq3.M(j)), i, i2, 33);
        }
    }

    public static final void H(Spannable spannable, long j, tp1 tp1, int i, int i2) {
        long b2 = wg7.b(j);
        if (xg7.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(dh4.C(tp1.C0(j)), false), i, i2, 33);
        } else if (xg7.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(wg7.c(j)), i, i2, 33);
        }
    }

    public static final void I(Spannable spannable, ya4 ya4, int i, int i2) {
        if (ya4 != null) {
            ArrayList arrayList = new ArrayList(et0.e0(ya4, 10));
            for (xa4 xa4 : ya4.w) {
                arrayList.add(xa4.a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [m66] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final vy7 J(yy7 yy7) {
        uy7 uy7;
        yy7.getClass();
        String str = yy7.a;
        String str2 = yy7.b;
        String str3 = yy7.c;
        try {
            uy7 = uy7.valueOf(yy7.d);
        } catch (Throwable th) {
            uy7 = new m66(th);
        }
        if (uy7 instanceof m66) {
            uy7 = uy7.SALDO;
        }
        return new vy7(str, str2, str3, uy7, yy7.e);
    }

    public static final Boolean L(int i, zj zjVar, vk2 vk2, ly5 ly5) {
        int ordinal = vk2.a1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                vk2 k0 = bb0.k0(vk2);
                if (k0 != null) {
                    int ordinal2 = k0.a1().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            Boolean L = L(i, zjVar, k0, ly5);
                            if (!sg3.e(L, Boolean.FALSE)) {
                                return L;
                            }
                            if (ly5 == null) {
                                if (k0.a1() == sk2.x) {
                                    vk2 i0 = bb0.i0(k0);
                                    if (i0 != null) {
                                        ly5 = bb0.j0(i0);
                                    } else {
                                        h.s("ActiveParent must have a focusedChild");
                                        return null;
                                    }
                                } else {
                                    h.s("Searching for active node in inactive hierarchy");
                                    return null;
                                }
                            }
                            return Boolean.valueOf(m(i, zjVar, vk2, ly5));
                        } else if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                h.c();
                                return null;
                            }
                            h.s("ActiveParent must have a focusedChild");
                            return null;
                        }
                    }
                    if (ly5 == null) {
                        ly5 = bb0.j0(k0);
                    }
                    return Boolean.valueOf(m(i, zjVar, vk2, ly5));
                }
                h.s("ActiveParent must have a focusedChild");
                return null;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    h.c();
                    return null;
                } else if (vk2.X0().a) {
                    return (Boolean) zjVar.y(vk2);
                } else {
                    if (ly5 == null) {
                        return Boolean.valueOf(l(vk2, i, zjVar));
                    }
                    return Boolean.valueOf(F(i, zjVar, vk2, ly5));
                }
            }
        }
        return Boolean.valueOf(l(vk2, i, zjVar));
    }

    public static int M(rt8 rt8) {
        int i;
        int i2 = 0;
        for (Object next : rt8) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public static /* synthetic */ boolean N(int i, fd9 fd9, StringBuilder sb) {
        if (i - 1 != 0 || fd9 == fd9.a) {
            return false;
        }
        sb.append(fd9.a());
        sb.append('.');
        sb.append(fd9.b());
        sb.append(':');
        sb.append(fd9.c());
        return true;
    }

    public static final void a(boolean z, gs2 gs2, yt2 yt2, int i) {
        int i2;
        boolean z2;
        boolean z3;
        sv4 sv4;
        rv4 rv4;
        w45 w45;
        int i3;
        int i4;
        boolean z4 = z;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i5 = i;
        yt22.g0(-642000585);
        if ((i5 & 6) == 0) {
            if (yt22.h(z4)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 48) == 0) {
            if (yt22.i(gs22)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i2 & 1, z2)) {
            Object obj = (sv4) yt22.k(ja4.a);
            if (obj == null) {
                yt22.e0(1512740606);
                obj = la4.a(yt22);
            } else {
                yt22.e0(1512737723);
            }
            yt22.r(false);
            if (obj != null) {
                boolean g = yt22.g(obj);
                Object Q = yt22.Q();
                Object obj2 = ay0.a;
                if (g || Q == obj2) {
                    v45 v45 = null;
                    if (obj instanceof sv4) {
                        sv4 = (sv4) obj;
                    } else {
                        sv4 = null;
                    }
                    if (sv4 != null) {
                        rv4 = sv4.getNavigationEventDispatcher();
                    } else {
                        rv4 = null;
                    }
                    if (obj instanceof w45) {
                        w45 = (w45) obj;
                    } else {
                        w45 = null;
                    }
                    if (w45 != null) {
                        v45 = w45.b();
                    }
                    Q = new h30(rv4, v45);
                    yt22.o0(Q);
                }
                h30 h30 = (h30) Q;
                Object Q2 = yt22.Q();
                if (Q2 == obj2) {
                    Q2 = t49.D(yt22);
                    yt22.o0(Q2);
                }
                o81 o81 = (o81) Q2;
                long j = yt22.T;
                boolean g2 = yt22.g(h30) | yt22.f(j);
                Object Q3 = yt22.Q();
                if (g2 || Q3 == obj2) {
                    Q3 = new mx0(o81, new cn5(j, obj));
                    yt22.o0(Q3);
                }
                mx0 mx0 = (mx0) Q3;
                yt22.e0(-348514256);
                boolean i6 = yt22.i(mx0) | yt22.i(gs22);
                Object Q4 = yt22.Q();
                if (i6 || Q4 == obj2) {
                    Q4 = new qm3(15, (Object) mx0, (Object) gs22);
                    yt22.o0(Q4);
                }
                t49.l((sr2) Q4, yt22);
                int i7 = i2;
                Boolean valueOf = Boolean.valueOf(z4);
                boolean i8 = yt22.i(mx0);
                int i9 = i7 & 14;
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z5 = z3 | i8;
                Object Q5 = yt22.Q();
                if (z5 || Q5 == obj2) {
                    Q5 = new j30(3, mx0, z4);
                    yt22.o0(Q5);
                }
                mx0 mx02 = mx0;
                h49.k(valueOf, mx02, (t54) null, (vr2) Q5, yt22, i9);
                boolean i10 = yt22.i(h30) | yt22.i(mx02);
                Object Q6 = yt22.Q();
                if (i10 || Q6 == obj2) {
                    Q6 = new w34(17, h30, mx02);
                    yt22.o0(Q6);
                }
                t49.f(h30, mx02, (vr2) Q6, yt22);
                yt22.r(false);
            } else {
                h.s("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new pi5(z4, gs22, i5, 1);
        }
    }

    public static void b(jv6 jv6, List list, zx5 zx5) {
        Object obj;
        yx5 yx5;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int c = jv6.c((st2) list.get(i));
                int P = jv6.P(jv6.b, jv6.r(c));
                if (P < jv6.g(jv6.b, jv6.r(c + 1))) {
                    obj = jv6.c[jv6.h(P)];
                } else {
                    obj = ay0.a;
                }
                if (obj instanceof yx5) {
                    yx5 = (yx5) obj;
                } else {
                    yx5 = null;
                }
                if (yx5 != null) {
                    yx5.a = zx5;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r10 <= r7) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r9 >= r6) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r8 <= r5) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r11 >= r2) goto L_0x004a;
     */
    public static final boolean c(ly5 ly5, ly5 ly52, ly5 ly53, int i) {
        float f;
        float f2;
        ly5 ly54 = ly5;
        ly5 ly55 = ly52;
        ly5 ly56 = ly53;
        int i2 = i;
        boolean d = d(i2, ly56, ly54);
        float f3 = ly56.b;
        float f4 = ly56.d;
        float f5 = ly56.a;
        float f6 = ly56.c;
        float f7 = ly54.d;
        float f8 = ly54.b;
        float f9 = ly54.c;
        float f10 = ly54.a;
        if (!d && d(i2, ly55, ly54)) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            h.s("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
            if (i2 == 3 || i2 == 4) {
                return true;
            }
            if (i2 == 3) {
                f = f10 - ly55.c;
            } else if (i2 == 4) {
                f = ly55.a - f9;
            } else if (i2 == 5) {
                f = f8 - ly55.d;
            } else if (i2 == 6) {
                f = ly55.b - f7;
            } else {
                h.s("This function should only be used for 2-D focus search");
                return false;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (i2 == 3) {
                f2 = f10 - f5;
            } else if (i2 == 4) {
                f2 = f6 - f9;
            } else if (i2 == 5) {
                f2 = f8 - f3;
            } else if (i2 == 6) {
                f2 = f4 - f7;
            } else {
                h.s("This function should only be used for 2-D focus search");
                return false;
            }
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            if (f < f2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean d(int i, ly5 ly5, ly5 ly52) {
        if (i == 3 || i == 4) {
            if (ly5.d <= ly52.b || ly5.b >= ly52.d) {
                return false;
            }
            return true;
        } else if (i != 5 && i != 6) {
            h.s("This function should only be used for 2-D focus search");
            return false;
        } else if (ly5.c <= ly52.a || ly5.a >= ly52.c) {
            return false;
        } else {
            return true;
        }
    }

    public static float e(int i) {
        Set set = dc8.x;
        if (i == 2) {
            return 840.0f;
        }
        if (i == 1) {
            return 600.0f;
        }
        return 0.0f;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [sc0, java.lang.Object, oy6] */
    /* JADX WARNING: type inference failed for: r4v9, types: [sc0, java.lang.Object, oy6] */
    public static void f(long j, sc0 sc0, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        int i6;
        long j2;
        sc0 sc02 = sc0;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        int i8 = i2;
        int i9 = i3;
        ArrayList arrayList5 = arrayList2;
        if (i8 < i9) {
            int i10 = i8;
            while (i10 < i9) {
                if (((dg0) arrayList4.get(i10)).d() >= i7) {
                    i10++;
                } else {
                    h.q("Failed requirement.");
                    return;
                }
            }
            dg0 dg0 = (dg0) arrayList.get(i2);
            dg0 dg02 = (dg0) arrayList4.get(i9 - 1);
            if (i7 == dg0.d()) {
                int intValue = ((Number) arrayList5.get(i8)).intValue();
                int i11 = i8 + 1;
                dg0 dg03 = (dg0) arrayList4.get(i11);
                i4 = i11;
                i5 = intValue;
                dg0 = dg03;
            } else {
                i4 = i8;
                i5 = -1;
            }
            if (dg0.i(i7) != dg02.i(i7)) {
                int i12 = 1;
                for (int i13 = i4 + 1; i13 < i9; i13++) {
                    if (((dg0) arrayList4.get(i13 - 1)).i(i7) != ((dg0) arrayList4.get(i13)).i(i7)) {
                        i12++;
                    }
                }
                long j3 = (sc02.x / 4) + j + 2 + ((long) (i12 * 2));
                sc02.j0(i12);
                sc02.j0(i5);
                for (int i14 = i4; i14 < i9; i14++) {
                    byte i15 = ((dg0) arrayList4.get(i14)).i(i7);
                    if (i14 == i4 || i15 != ((dg0) arrayList4.get(i14 - 1)).i(i7)) {
                        sc02.j0(i15 & 255);
                    }
                }
                ? obj = new Object();
                int i16 = i4;
                while (i16 < i9) {
                    byte i17 = ((dg0) arrayList4.get(i16)).i(i7);
                    int i18 = i16 + 1;
                    int i19 = i18;
                    while (true) {
                        if (i19 >= i9) {
                            i19 = i9;
                            break;
                        } else if (i17 != ((dg0) arrayList4.get(i19)).i(i7)) {
                            break;
                        } else {
                            i19++;
                        }
                    }
                    if (i18 == i19 && i7 + 1 == ((dg0) arrayList4.get(i16)).d()) {
                        sc02.j0(((Number) arrayList5.get(i16)).intValue());
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i19;
                    } else {
                        sc02.j0(((int) ((obj.x / 4) + j3)) * -1);
                        arrayList3 = arrayList5;
                        j2 = j3;
                        i6 = i19;
                        ArrayList arrayList6 = arrayList;
                        f(j2, obj, i7 + 1, arrayList6, i16, i6, arrayList3);
                        arrayList4 = arrayList6;
                    }
                    j3 = j2;
                    i16 = i6;
                    arrayList5 = arrayList3;
                }
                sc02.t(obj);
                return;
            }
            ArrayList arrayList7 = arrayList5;
            int min = Math.min(dg0.d(), dg02.d());
            int i20 = 0;
            int i21 = i7;
            while (i21 < min && dg0.i(i21) == dg02.i(i21)) {
                i20++;
                i21++;
            }
            long j4 = (sc02.x / 4) + j + 2 + ((long) i20) + 1;
            sc02.j0(-i20);
            sc02.j0(i5);
            int i22 = i7 + i20;
            while (i7 < i22) {
                sc02.j0(dg0.i(i7) & 255);
                i7++;
            }
            if (i4 + 1 != i9) {
                ? obj2 = new Object();
                sc02.j0(((int) ((obj2.x / 4) + j4)) * -1);
                long j5 = j4;
                f(j5, obj2, i22, arrayList4, i4, i9, arrayList7);
                sc02.t(obj2);
            } else if (i22 == ((dg0) arrayList4.get(i4)).d()) {
                sc02.j0(((Number) arrayList7.get(i4)).intValue());
            } else {
                h.s("Check failed.");
            }
        } else {
            h.q("Failed requirement.");
        }
    }

    public static final void i(vk2 vk2, eq4 eq4) {
        if (!vk2.w.J) {
            yb3.b("visitChildren called on an unattached node");
        }
        eq4 eq42 = new eq4(new ll4[16]);
        ll4 ll4 = vk2.w;
        ll4 ll42 = ll4.B;
        if (ll42 == null) {
            rc9.h(eq42, ll4);
        } else {
            eq42.b(ll42);
        }
        while (true) {
            int i = eq42.y;
            if (i != 0) {
                ll4 ll43 = (ll4) eq42.l(i - 1);
                if ((ll43.z & 1024) == 0) {
                    rc9.h(eq42, ll43);
                } else {
                    while (true) {
                        if (ll43 == null) {
                            break;
                        } else if ((ll43.y & 1024) != 0) {
                            eq4 eq43 = null;
                            while (ll43 != null) {
                                if (ll43 instanceof vk2) {
                                    vk2 vk22 = (vk2) ll43;
                                    if (vk22.J && !rc9.O0(vk22).j0) {
                                        if (vk22.X0().a) {
                                            eq4.b(vk22);
                                        } else {
                                            i(vk22, eq4);
                                        }
                                    }
                                } else if ((ll43.y & 1024) != 0 && (ll43 instanceof wo1)) {
                                    int i2 = 0;
                                    for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                        if ((ll44.y & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                ll43 = ll44;
                                            } else {
                                                if (eq43 == null) {
                                                    eq43 = new eq4(new ll4[16]);
                                                }
                                                if (ll43 != null) {
                                                    eq43.b(ll43);
                                                    ll43 = null;
                                                }
                                                eq43.b(ll44);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ll43 = rc9.j(eq43);
                            }
                        } else {
                            ll43 = ll43.B;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final cf4 j(j77 j77, String str, ub4 ub4, vr2 vr2) {
        j77.getClass();
        if (ub4 == null) {
            ub4 = (ub4) ((m77) j77).f.x;
        }
        if (vr2 == null) {
            vr2 = ((m77) j77).a.b.b;
        }
        return new cf4(ub4, str, vr2);
    }

    public static final vk2 k(eq4 eq4, ly5 ly5, int i) {
        ly5 ly52;
        vk2 vk2 = null;
        if (i == 3) {
            ly52 = ly5.h((ly5.c - ly5.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            ly52 = ly5.h(-((ly5.c - ly5.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            ly52 = ly5.h(0.0f, (ly5.d - ly5.b) + 1.0f);
        } else if (i == 6) {
            ly52 = ly5.h(0.0f, -((ly5.d - ly5.b) + 1.0f));
        } else {
            h.s("This function should only be used for 2-D focus search");
            return null;
        }
        Object[] objArr = eq4.w;
        int i2 = eq4.y;
        for (int i3 = 0; i3 < i2; i3++) {
            vk2 vk22 = (vk2) objArr[i3];
            if (bb0.q0(vk22)) {
                ly5 j0 = bb0.j0(vk22);
                if (v(j0, ly52, ly5, i)) {
                    vk2 = vk22;
                    ly52 = j0;
                }
            }
        }
        return vk2;
    }

    public static final boolean l(vk2 vk2, int i, vr2 vr2) {
        ly5 ly5;
        Object obj;
        eq4 eq4 = new eq4(new vk2[16]);
        i(vk2, eq4);
        int i2 = eq4.y;
        if (i2 <= 1) {
            if (i2 == 0) {
                obj = null;
            } else {
                obj = eq4.w[0];
            }
            vk2 vk22 = (vk2) obj;
            if (vk22 != null) {
                return ((Boolean) vr2.y(vk22)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                ly5 j0 = bb0.j0(vk2);
                float f = j0.a;
                float f2 = j0.b;
                ly5 = new ly5(f, f2, f, f2);
            } else if (i == 3 || i == 5) {
                ly5 j02 = bb0.j0(vk2);
                float f3 = j02.c;
                float f4 = j02.d;
                ly5 = new ly5(f3, f4, f3, f4);
            } else {
                h.s("This function should only be used for 2-D focus search");
                return false;
            }
            vk2 k = k(eq4, ly5, i);
            if (k != null) {
                return ((Boolean) vr2.y(k)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean m(int i, zj zjVar, vk2 vk2, ly5 ly5) {
        if (F(i, zjVar, vk2, ly5)) {
            return true;
        }
        int i2 = i;
        vk2 vk22 = vk2;
        Boolean bool = (Boolean) we.M(vk22, i2, new n55(((lk2) ((je) rc9.P0(vk2)).getFocusOwner()).g(), vk22, ly5, i2, zjVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Collection n(ji4 ji4, is1 is1, int i) {
        if ((i & 1) != 0) {
            is1 = is1.m;
        }
        ji4.a.getClass();
        return ji4.a(is1, jo3.Q);
    }

    public static fw4 o(qt0 qt0) {
        qt0 qt02 = qt0;
        fw4 fw4 = qt02.h0;
        if (fw4 != null) {
            return fw4;
        }
        long d = st0.d(qt02, r16.f);
        long d2 = st0.d(qt02, r16.j);
        long d3 = st0.d(qt02, r16.g);
        rt0 rt0 = r16.k;
        long d4 = st0.d(qt02, rt0);
        rt0 rt02 = r16.l;
        long j = d;
        fw4 fw42 = new fw4(j, d2, d3, d4, st0.d(qt02, rt02), jt0.b(0.38f, st0.d(qt02, rt0)), jt0.b(0.38f, st0.d(qt02, rt02)));
        qt02.h0 = fw42;
        return fw42;
    }

    public static final x83 p() {
        x83 x83 = a;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.PhoneMissed", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e = pb4.e(23.09f, 16.2f);
        e.e(-6.33f, -5.59f, -15.86f, -5.59f, -22.18f, 0.0f);
        e.e(-0.84f, 0.74f, -0.84f, 2.05f, -0.05f, 2.84f);
        e.i(1.2f, 1.2f);
        e.e(0.71f, 0.71f, 1.84f, 0.77f, 2.62f, 0.15f);
        e.i(1.97f, -1.57f);
        e.e(0.47f, -0.37f, 0.75f, -0.94f, 0.75f, -1.55f);
        e.m(14.7f);
        e.e(2.98f, -0.97f, 6.21f, -0.98f, 9.2f, 0.0f);
        e.n(2.58f);
        e.e(0.0f, 0.6f, 0.28f, 1.17f, 0.75f, 1.55f);
        e.i(1.96f, 1.56f);
        e.e(0.79f, 0.62f, 1.91f, 0.56f, 2.62f, -0.15f);
        e.i(1.2f, -1.2f);
        e.e(0.8f, -0.79f, 0.79f, -2.1f, -0.04f, -2.84f);
        e.c();
        e.j(6.0f, 9.0f);
        e.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.m(6.43f);
        e.i(4.24f, 4.24f);
        e.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.i(5.66f, -5.66f);
        e.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        e.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.i(-4.95f, 4.95f);
        e.h(8.4f, 5.0f);
        e.f(10.0f);
        e.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.l(-0.45f, -1.0f, -1.0f, -1.0f);
        e.f(6.0f);
        e.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.n(4.0f);
        e.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.c();
        w83.a(w83, e.a, ky6, 14336);
        x83 b2 = w83.b();
        a = b2;
        return b2;
    }

    public static final vl q(hf7 hf7) {
        vl vlVar = hf7.a;
        long j = hf7.b;
        vlVar.getClass();
        return vlVar.subSequence(lg7.f(j), lg7.e(j));
    }

    public static final vl r(hf7 hf7, int i) {
        vl vlVar = hf7.a;
        vl vlVar2 = hf7.a;
        long j = hf7.b;
        int e = lg7.e(j);
        int e2 = lg7.e(j);
        int i2 = e2 + i;
        if (((i ^ i2) & (e2 ^ i2)) < 0) {
            i2 = vlVar2.x.length();
        }
        return vlVar.subSequence(e, Math.min(i2, vlVar2.x.length()));
    }

    public static final vl s(hf7 hf7, int i) {
        vl vlVar = hf7.a;
        long j = hf7.b;
        int f = lg7.f(j);
        int i2 = f - i;
        if (((f ^ i2) & (i ^ f)) < 0) {
            i2 = 0;
        }
        return vlVar.subSequence(Math.max(0, i2), lg7.f(j));
    }

    public static final boolean v(ly5 ly5, ly5 ly52, ly5 ly53, int i) {
        if (!w(i, ly5, ly53)) {
            return false;
        }
        if (!w(i, ly52, ly53) || c(ly53, ly5, ly52, i)) {
            return true;
        }
        if (!c(ly53, ly52, ly5, i) && x(i, ly53, ly5) < x(i, ly53, ly52)) {
            return true;
        }
        return false;
    }

    public static final boolean w(int i, ly5 ly5, ly5 ly52) {
        if (i == 3) {
            float f = ly52.c;
            float f2 = ly52.a;
            float f3 = ly5.c;
            if ((f > f3 || f2 >= f3) && f2 > ly5.a) {
                return true;
            }
            return false;
        } else if (i == 4) {
            float f4 = ly52.a;
            float f5 = ly52.c;
            float f6 = ly5.a;
            if ((f4 < f6 || f5 <= f6) && f5 < ly5.c) {
                return true;
            }
            return false;
        } else if (i == 5) {
            float f7 = ly52.d;
            float f8 = ly52.b;
            float f9 = ly5.d;
            if ((f7 > f9 || f8 >= f9) && f8 > ly5.b) {
                return true;
            }
            return false;
        } else if (i == 6) {
            float f10 = ly52.b;
            float f11 = ly52.d;
            float f12 = ly5.b;
            if ((f10 < f12 || f11 <= f12) && f11 < ly5.d) {
                return true;
            }
            return false;
        } else {
            h.s("This function should only be used for 2-D focus search");
            return false;
        }
    }

    public static final long x(int i, ly5 ly5, ly5 ly52) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = ly5.a;
            f2 = ly52.c;
        } else if (i == 4) {
            f = ly52.a;
            f2 = ly5.c;
        } else if (i == 5) {
            f = ly5.b;
            f2 = ly52.d;
        } else if (i == 6) {
            f = ly52.b;
            f2 = ly5.d;
        } else {
            h.s("This function should only be used for 2-D focus search");
            return 0;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = ly5.b;
            f4 = ((ly5.d - f7) / 2.0f) + f7;
            f5 = ly52.b;
            f3 = ly52.d;
        } else if (i == 5 || i == 6) {
            float f8 = ly5.a;
            f4 = ((ly5.c - f8) / 2.0f) + f8;
            f5 = ly52.a;
            f3 = ly52.c;
        } else {
            h.s("This function should only be used for 2-D focus search");
            return 0;
        }
        long j2 = (long) (f4 - (((f3 - f5) / 2.0f) + f5));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [f61, java.lang.Object, bl6] */
    public static bl6 y(gs2 gs2) {
        ? obj = new Object();
        obj.z = rc9.C(obj, obj, gs2);
        return obj;
    }

    public static final ArrayList z(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(J((yy7) it.next()));
        }
        return arrayList;
    }

    public abstract void B(int i);

    public abstract void C(View view, int i, int i2);

    public abstract void D(View view, float f, float f2);

    public abstract boolean K(View view, int i);

    public abstract int g(View view, int i);

    public abstract int h(View view, int i);

    public int t(View view) {
        return 0;
    }

    public int u() {
        return 0;
    }

    public void A(View view, int i) {
    }
}
