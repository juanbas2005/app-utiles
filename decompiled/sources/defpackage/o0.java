package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o0 extends ct2 implements vr2 {
    public final /* synthetic */ int D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.D = i4;
    }

    /* JADX INFO: finally extract failed */
    public final Object y(Object obj) {
        Object[] objArr;
        int i;
        Object[] objArr2;
        Object value;
        Object value2;
        is7 is7;
        mo2 mo2;
        Object value3;
        is7 is72;
        mo2 mo22;
        Object value4;
        Object obj2;
        String str;
        Object value5;
        Object value6;
        Object value7;
        long j;
        Object obj3 = obj;
        int i2 = this.D;
        char c = 7;
        Number number = null;
        vs7 vs7 = vs7.a;
        Object obj4 = this.x;
        switch (i2) {
            case b85.b:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                v0 v0Var = (v0) obj4;
                dp4 dp4 = v0Var.a0;
                if (booleanValue) {
                    v0Var.g1();
                } else {
                    if (v0Var.M != null) {
                        Object[] objArr3 = dp4.c;
                        long[] jArr = dp4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j2 = jArr[i3];
                                if ((((~j2) << c) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i4 = 8;
                                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((j2 & 255) < 128) {
                                            i = i4;
                                            objArr2 = objArr3;
                                            ar7.H(v0Var.J0(), (e81) null, (r81) null, new t0(v0Var, (eo5) objArr3[(i3 << 3) + i6], (f61) null, 0), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i4;
                                        }
                                        j2 >>= i;
                                        i6++;
                                        i4 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i5 != i4) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i3 != length) {
                                    i3++;
                                    objArr3 = objArr;
                                    c = 7;
                                }
                            }
                        }
                        eo5 eo5 = v0Var.c0;
                        if (eo5 != null) {
                            ar7.H(v0Var.J0(), (e81) null, (r81) null, new t0(v0Var, eo5, (f61) null, 1), 3);
                        }
                    }
                    dp4.a();
                    v0Var.c0 = null;
                    v0Var.h1();
                }
                return vs7;
            case 1:
                String str2 = (String) obj3;
                str2.getClass();
                return ((qe4) obj4).a(str2);
            case 2:
                return ((fg0) obj4).f((f61) obj3);
            case 3:
                String str3 = (String) obj3;
                str3.getClass();
                return ((ms1) obj4).m(str3);
            case 4:
                ax3 ax3 = (ax3) obj3;
                ax3.getClass();
                return new et1((gt1) obj4, ax3);
            case 5:
                String str4 = (String) obj3;
                str4.getClass();
                ku1 ku1 = (ku1) obj4;
                ku1.getClass();
                d37 d37 = ku1.f;
                do {
                    value = d37.getValue();
                } while (!d37.i(value, ((String) value) + str4));
                return vs7;
            case 6:
                String str5 = (String) obj3;
                str5.getClass();
                np2 np2 = (np2) obj4;
                np2.getClass();
                d37 d372 = np2.e;
                while (true) {
                    Object value8 = d372.getValue();
                    is7 is73 = (is7) value8;
                    mo2 mo23 = (mo2) is73.a;
                    mo23.getClass();
                    String str6 = str5;
                    if (d372.i(value8, is7.a(is73, mo2.a(mo23, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, str5, a42.w, false, (Boolean) null, (Map) null, false, false, 15999), false, (hv2) null, 6))) {
                        ar7.H(u58.a(np2), (e81) null, (r81) null, new lp2(np2, str6, (f61) null, 1), 3);
                        return vs7;
                    }
                    str5 = str6;
                }
            case 7:
                String str7 = (String) obj3;
                str7.getClass();
                np2 np22 = (np2) obj4;
                np22.getClass();
                String str8 = ((mo2) ((is7) np22.e.getValue()).a).h;
                if (str8 != null) {
                    ar7.H(u58.a(np22), (e81) null, (r81) null, new jp2(np22, str7, str8, (f61) null, 1), 3);
                }
                return vs7;
            case 8:
                String str9 = (String) obj3;
                str9.getClass();
                np2 np23 = (np2) obj4;
                np23.getClass();
                d37 d373 = np23.e;
                do {
                    value2 = d373.getValue();
                    is7 = (is7) value2;
                    mo2 = (mo2) is7.a;
                    mo2.getClass();
                } while (!d373.i(value2, is7.a(is7, mo2.a(mo2, (ArrayList) null, (List) null, (String) null, str9, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16375), false, (hv2) null, 6)));
                h27 h27 = np23.i;
                if (h27 != null) {
                    h27.o((CancellationException) null);
                }
                np23.i = ar7.H(u58.a(np23), (e81) null, (r81) null, new hp2(np23, (f61) null, 5), 3);
                return vs7;
            case 9:
                String str10 = (String) obj3;
                np2 np24 = (np2) obj4;
                d37 d374 = np24.e;
                do {
                    value3 = d374.getValue();
                    is72 = (is7) value3;
                    mo22 = (mo2) is72.a;
                    mo22.getClass();
                } while (!d374.i(value3, is7.a(is72, mo2.a(mo22, (ArrayList) null, (List) null, str10, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16379), false, (hv2) null, 6)));
                np24.g();
                return vs7;
            case 10:
                ez4 ez4 = (ez4) obj3;
                ez4.getClass();
                np2 np25 = (np2) obj4;
                np25.getClass();
                d37 d375 = np25.e;
                if (!((is7) d375.getValue()).b) {
                    do {
                        value4 = d375.getValue();
                    } while (!d375.i(value4, b81.h((Object) null, (is7) value4, (Object) null, true, 1)));
                    ar7.H(u58.a(np25), (e81) null, (r81) null, new ju1(np25, ez4, (f61) null, 7), 3);
                }
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                String str11 = (String) obj3;
                str11.getClass();
                np2 np26 = (np2) obj4;
                np26.getClass();
                d37 d376 = np26.e;
                if (!((is7) d376.getValue()).b) {
                    Iterator it = ((mo2) ((is7) d376.getValue()).a).a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (sg3.e(((en2) obj2).a, str11)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    en2 en2 = (en2) obj2;
                    if (en2 != null) {
                        str = en2.f;
                    } else {
                        str = null;
                    }
                    do {
                        value5 = d376.getValue();
                    } while (!d376.i(value5, b81.h((Object) null, (is7) value5, (Object) null, true, 1)));
                    ar7.H(u58.a(np26), (e81) null, (r81) null, new p0(np26, str11, str, (f61) null, 24), 3);
                }
                return vs7;
            case 12:
                String str12 = (String) obj3;
                str12.getClass();
                c23 c23 = (c23) obj4;
                c23.getClass();
                String l = pb4.l(c23.l, str12, "#");
                Context context = c23.h;
                boolean A = sg3.A(context, "android.permission.CALL_PHONE");
                rg5 rg5 = c23.g;
                if (A) {
                    int i7 = c23.q;
                    rg5.getClass();
                    rg5.b(context, l, i7);
                } else {
                    rg5.getClass();
                    rg5.e(context, l);
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                g40 g40 = (g40) obj3;
                g40.getClass();
                c23 c232 = (c23) obj4;
                c232.getClass();
                ar7.H(u58.a(c232), (e81) null, (r81) null, new ju1(c232, g40, (f61) null, 12), 3);
                return vs7;
            case 14:
                az7 az7 = (az7) obj3;
                az7.getClass();
                ((c23) obj4).g(az7);
                return vs7;
            case h75.g:
                String str13 = (String) obj3;
                str13.getClass();
                c23 c233 = (c23) obj4;
                c233.getClass();
                ar7.H(u58.a(c233), (e81) null, (r81) null, new b23(c233, str13, ((o03) ((is7) c233.j.getValue()).a).M.contains(str13), (f61) null), 3);
                return vs7;
            case 16:
                String str14 = (String) obj3;
                str14.getClass();
                c23 c234 = (c23) obj4;
                c234.getClass();
                ar7.H(u58.a(c234), c234.i, (r81) null, new y13(str14, c234, (f61) null), 2);
                return vs7;
            case 17:
                String str15 = (String) obj3;
                str15.getClass();
                c23 c235 = (c23) obj4;
                c235.getClass();
                ar7.H(u58.a(c235), c235.i, (r81) null, new y13(c235, str15, (f61) null, 1), 2);
                return vs7;
            case 18:
                String str16 = (String) obj3;
                str16.getClass();
                c23 c236 = (c23) obj4;
                c236.getClass();
                String concat = "*99".concat(str16);
                Context context2 = c236.h;
                boolean A2 = sg3.A(context2, "android.permission.CALL_PHONE");
                rg5 rg52 = c236.g;
                if (A2) {
                    int i8 = c236.q;
                    rg52.getClass();
                    rg5.b(context2, concat, i8);
                } else {
                    rg52.getClass();
                    rg5.e(context2, concat);
                }
                return vs7;
            case 19:
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                c23 c237 = (c23) obj4;
                c237.getClass();
                ar7.H(u58.a(c237), (e81) null, (r81) null, new a23(c237, booleanValue2, (f61) null, 0), 3);
                return vs7;
            case 20:
                ((Set) obj3).getClass();
                eh3 eh3 = (eh3) obj4;
                ReentrantLock reentrantLock = eh3.d;
                reentrantLock.lock();
                try {
                    List b1 = dt0.b1(eh3.c.values());
                    reentrantLock.unlock();
                    Iterator it2 = b1.iterator();
                    if (!it2.hasNext()) {
                        return vs7;
                    }
                    ((k35) it2.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 21:
                String str17 = (String) obj3;
                str17.getClass();
                rh3 rh3 = (rh3) obj4;
                rh3.getClass();
                d37 d377 = rh3.d;
                do {
                    value6 = d377.getValue();
                } while (!d377.i(value6, new is7(6, nh3.a((nh3) ((is7) value6).a, (String) null, str17, 0.0d, (hv2) null, 13))));
                return vs7;
            case 22:
                String str18 = (String) obj3;
                str18.getClass();
                rh3 rh32 = (rh3) obj4;
                rh32.getClass();
                Double i0 = j57.i0(d57.k1(str18).toString());
                if (i0 != null) {
                    double doubleValue = i0.doubleValue();
                    d37 d378 = rh32.d;
                    do {
                        value7 = d378.getValue();
                    } while (!d378.i(value7, new is7(6, nh3.a((nh3) ((is7) value7).a, (String) null, (String) null, doubleValue, (hv2) null, 11))));
                }
                return vs7;
            case 23:
                ((gl3) obj4).s((Throwable) obj3);
                return vs7;
            case 24:
                uq4 uq4 = (uq4) obj3;
                uq4.getClass();
                return ((a14) obj4).N(uq4);
            case 25:
                uq4 uq42 = (uq4) obj3;
                uq42.getClass();
                return ((a14) obj4).O(uq42);
            case 26:
                cr4 cr4 = (cr4) obj4;
                vt7 vt7 = cr4.a;
                zq5 zq5 = vt7.a;
                Object obj5 = zq5.w.get(obj3);
                if (obj5 != null) {
                    number = obj5;
                } else {
                    h.s(f21.l(new StringBuilder("Field "), zq5.x, " is not set"));
                }
                int intValue = number.intValue();
                String str19 = (String) dt0.z0(intValue - vt7.b, cr4.b);
                if (str19 == null) {
                    return f21.l(pb4.o(intValue, "The value ", " of "), vt7.d, " does not have a corresponding string representation");
                }
                return str19;
            case 27:
                y63 y63 = (y63) obj3;
                e45 e45 = ((h45) obj4).A;
                e45.getClass();
                c45 a = ((d45) h45.F.getValue()).a();
                a.a = new am6(11);
                e45.a.y(a);
                if (y63 != null) {
                    Long l2 = y63.b;
                    long j3 = 0;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        cc4 cc4 = a73.a;
                        if (longValue == Long.MAX_VALUE) {
                            longValue = 0;
                        }
                        a.a(longValue, timeUnit);
                    }
                    Long l3 = y63.c;
                    if (l3 != null) {
                        long longValue2 = l3.longValue();
                        cc4 cc42 = a73.a;
                        int i9 = (longValue2 > Long.MAX_VALUE ? 1 : (longValue2 == Long.MAX_VALUE ? 0 : -1));
                        if (i9 == 0) {
                            j = 0;
                        } else {
                            j = longValue2;
                        }
                        timeUnit.getClass();
                        a.y = fg8.b(j, timeUnit);
                        if (i9 != 0) {
                            j3 = longValue2;
                        }
                        a.z = fg8.b(j3, timeUnit);
                    }
                }
                return new d45(a);
            default:
                return ((zq5) obj4).w.get(obj3);
        }
    }
}
