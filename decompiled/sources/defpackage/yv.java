package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: yv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yv extends ct2 implements gs2 {
    public final /* synthetic */ int D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.D = i4;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [df3, java.lang.Object, dk2] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.Object, h06] */
    public final Object H(Object obj, Object obj2) {
        boolean a;
        Object obj3;
        int i;
        int i2;
        int i3;
        int i4;
        Object obj4;
        String str;
        Object value;
        Object obj5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.D;
        boolean z = false;
        vs7 vs7 = vs7.a;
        Object obj6 = this.x;
        switch (i10) {
            case b85.b:
                return ((qe4) obj6).e((yl1) obj, (f61) obj2);
            case 1:
                b56 b56 = (b56) obj;
                String str2 = (String) obj2;
                b56.getClass();
                str2.getClass();
                c30 c30 = (c30) obj6;
                c30.getClass();
                d37 d37 = c30.c;
                if (!((is7) d37.getValue()).b) {
                    ar7.H(u58.a(c30), (e81) null, (r81) null, new w6(d37, (f61) null, c30, b56, str2), 3);
                }
                return vs7;
            case 2:
                sk2 sk2 = (sk2) obj;
                sk2 sk22 = (sk2) obj2;
                xk2 xk2 = (xk2) obj6;
                if (xk2.J && (a = sk22.a()) != sk2.a()) {
                    vr2 vr2 = xk2.N;
                    if (vr2 != null) {
                        vr2.y(Boolean.valueOf(a));
                    }
                    d63 d63 = yk2.K;
                    if (a) {
                        ar7.H(xk2.J0(), (e81) null, (r81) null, new ot(xk2, (f61) null, 8), 3);
                        ? obj7 = new Object();
                        i35.o(xk2, new f5(20, obj7, xk2));
                        o24 o24 = (o24) obj7.w;
                        if (o24 != null) {
                            o24.a();
                        } else {
                            o24 = null;
                        }
                        xk2.P = o24;
                        xz4 xz4 = xk2.Q;
                        if (xz4 != null && xz4.c1().J && xk2.J) {
                            h75.g(xk2, d63);
                        }
                    } else {
                        o24 o242 = xk2.P;
                        if (o242 != null) {
                            o242.b();
                        }
                        xk2.P = null;
                        if (xk2.J) {
                            h75.g(xk2, d63);
                        }
                    }
                    g75.D(xk2);
                    ap4 ap4 = xk2.M;
                    if (ap4 != null) {
                        dk2 dk2 = xk2.O;
                        if (a) {
                            if (dk2 != null) {
                                xk2.Y0(ap4, new ek2(dk2));
                                xk2.O = null;
                            }
                            ? obj8 = new Object();
                            xk2.Y0(ap4, obj8);
                            xk2.O = obj8;
                        } else if (dk2 != null) {
                            xk2.Y0(ap4, new ek2(dk2));
                            xk2.O = null;
                        }
                    }
                }
                return vs7;
            case 3:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                np2 np2 = (np2) obj6;
                np2.getClass();
                ar7.H(u58.a(np2), (e81) null, (r81) null, new jp2(np2, str3, str4, (f61) null, 0), 3);
                return vs7;
            case 4:
                String str5 = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                str5.getClass();
                np2 np22 = (np2) obj6;
                np22.getClass();
                Iterator it = ((mo2) ((is7) np22.e.getValue()).a).i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (sg3.e(((tm2) obj3).a, str5)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                tm2 tm2 = (tm2) obj3;
                if (tm2 != null) {
                    if (booleanValue) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    int i11 = tm2.h;
                    if (i11 == i) {
                        i = 0;
                    }
                    long j = tm2.f;
                    if (i11 == 1) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    long j2 = j - ((long) i2);
                    if (i == 1) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    long j3 = j2 + ((long) i3);
                    long j4 = tm2.g;
                    if (i11 == -1) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    long j5 = j4 - ((long) i4);
                    if (i == -1) {
                        z = true;
                    }
                    String str6 = tm2.a;
                    String str7 = tm2.b;
                    String str8 = tm2.c;
                    String str9 = tm2.d;
                    String str10 = tm2.e;
                    boolean z2 = tm2.i;
                    str6.getClass();
                    str7.getClass();
                    str8.getClass();
                    str9.getClass();
                    int i12 = i;
                    np22.h(new m0(22, str5, new tm2(str6, str7, str8, str9, str10, j3, j5 + (z ? 1 : 0), i12, z2)));
                    ar7.H(u58.a(np22), (e81) null, (r81) null, new eu0(np22, str5, i12, (Object) tm2, (f61) null, 3), 3);
                }
                return vs7;
            case 5:
                String str11 = (String) obj;
                ez4 ez4 = (ez4) obj2;
                str11.getClass();
                ez4.getClass();
                np2 np23 = (np2) obj6;
                np23.getClass();
                d37 d372 = np23.e;
                if (!((is7) d372.getValue()).b) {
                    Iterator it2 = ((mo2) ((is7) d372.getValue()).a).a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj4 = it2.next();
                            if (sg3.e(((en2) obj4).a, str11)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    en2 en2 = (en2) obj4;
                    if (en2 != null) {
                        str = en2.f;
                    } else {
                        str = null;
                    }
                    do {
                        value = d372.getValue();
                    } while (!d372.i(value, b81.h((Object) null, (is7) value, (Object) null, true, 1)));
                    ar7.H(u58.a(np23), (e81) null, (r81) null, new ng(np23, str11, ez4, str, (f61) null, 9), 3);
                }
                return vs7;
            case 6:
                String str12 = (String) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                str12.getClass();
                np2 np24 = (np2) obj6;
                np24.getClass();
                Iterator it3 = ((mo2) ((is7) np24.e.getValue()).a).a.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj5 = it3.next();
                        if (sg3.e(((en2) obj5).a, str12)) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                en2 en22 = (en2) obj5;
                if (en22 != null) {
                    if (booleanValue2) {
                        i5 = 1;
                    } else {
                        i5 = -1;
                    }
                    int i13 = en22.m;
                    if (i13 == i5) {
                        i6 = 0;
                    } else {
                        i6 = i5;
                    }
                    long j6 = en22.j;
                    if (i13 == 1) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    long j7 = j6 - ((long) i7);
                    if (i6 == 1) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    long j8 = j7 + ((long) i8);
                    long j9 = en22.k;
                    if (i13 == -1) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    long j10 = j9 - ((long) i9);
                    if (i6 == -1) {
                        z = true;
                    }
                    int i14 = i6;
                    en2 en23 = en22;
                    np24.h(new m0(21, str12, en2.a(en23, (qm2) null, (String) null, (String) null, (String) null, (String) null, false, j8, j10 + (z ? 1 : 0), 0, i14, 10751)));
                    ar7.H(u58.a(np24), (e81) null, (r81) null, new eu0(np24, str12, i14, (Object) en23, (f61) null, 4), 3);
                }
                return vs7;
            case 7:
                String str13 = (String) obj;
                String str14 = (String) obj2;
                str13.getClass();
                str14.getClass();
                c23 c23 = (c23) obj6;
                c23.getClass();
                String str15 = c23.n + str13 + "*" + str14 + "#";
                Context context = c23.h;
                boolean A = sg3.A(context, "android.permission.CALL_PHONE");
                rg5 rg5 = c23.g;
                if (A) {
                    int i15 = c23.q;
                    rg5.getClass();
                    rg5.b(context, str15, i15);
                } else {
                    rg5.getClass();
                    rg5.e(context, str15);
                }
                return vs7;
            case 8:
                ll6 ll6 = (ll6) obj;
                int intValue = ((Number) obj2).intValue();
                ll6.getClass();
                fm3 fm3 = (fm3) obj6;
                fm3.getClass();
                if (!ll6.i(intValue) && ll6.h(intValue).c()) {
                    z = true;
                }
                fm3.b = z;
                return Boolean.valueOf(z);
            case 9:
                Long l = (Long) obj;
                Long l2 = (Long) obj2;
                g36 g36 = (g36) obj6;
                d37 d373 = g36.e;
                while (true) {
                    Object value2 = d373.getValue();
                    e36 e = g36.e(l, l2);
                    Long l3 = l;
                    Long l4 = l2;
                    if (d373.i(value2, new is7(6, q26.a((q26) ((is7) value2).a, (List) null, (List) null, (ArrayList) null, (String) null, (String) null, (Long) null, (Long) null, e.a, e.b, e.c, e.d, e.e, l3, l4, false, false, 49279)))) {
                        return vs7;
                    }
                    l = l3;
                    l2 = l4;
                }
            case 10:
                Long l5 = (Long) obj;
                Long l6 = (Long) obj2;
                g36 g362 = (g36) obj6;
                d37 d374 = g362.e;
                while (true) {
                    Object value3 = d374.getValue();
                    ArrayList g = g362.g(l5, l6);
                    Long l7 = l6;
                    if (d374.i(value3, new is7(6, q26.a((q26) ((is7) value3).a, (List) null, (List) null, g, g36.f(g, true), g36.f(g, false), l5, l7, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, false, false, 65411)))) {
                        return vs7;
                    }
                    l6 = l7;
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return jb5.a((a96) obj6, (vr2) obj, (f61) obj2);
            case 12:
                return jb5.a((a96) obj6, (vr2) obj, (f61) obj2);
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                int intValue2 = ((Number) obj).intValue();
                az7 az7 = (az7) obj2;
                az7.getClass();
                fq6 fq6 = (fq6) obj6;
                fq6.getClass();
                d37 d375 = fq6.c;
                if (!((is7) d375.getValue()).b) {
                    ar7.H(u58.a(fq6), (e81) null, (r81) null, new eu0(d375, (f61) null, fq6, intValue2, az7), 3);
                }
                return vs7;
            case 14:
                String str16 = (String) obj;
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                str16.getClass();
                t17 t17 = (t17) obj6;
                t17.getClass();
                d37 d376 = t17.c;
                if (!((is7) d376.getValue()).b) {
                    ar7.H(u58.a(t17), (e81) null, (r81) null, new s17(d376, (f61) null, t17, str16, booleanValue3), 3);
                }
                return vs7;
            case h75.g:
                return ((qe4) obj6).e((yl1) obj, (f61) obj2);
            case 16:
                vw3 vw3 = (vw3) obj;
                vw3 vw32 = (vw3) obj2;
                vw3.getClass();
                vw32.getClass();
                ((lp7) obj6).getClass();
                kz4.b.getClass();
                lz4 lz4 = jz4.b;
                if (lz4.b(vw3, vw32) && !lz4.b(vw32, vw3)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                vw3 vw33 = (vw3) obj;
                vw3 vw34 = (vw3) obj2;
                vw33.getClass();
                vw34.getClass();
                return Boolean.valueOf(((lz4) obj6).a(vw33, vw34));
        }
    }
}
