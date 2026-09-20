package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: h75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h75 {
    public static x83 a = null;
    public static x83 b = null;
    public static final int c = 9;
    public static final int d = 6;
    public static final int e = 10;
    public static final int f = 5;
    public static final int g = 15;
    public static final int h = 48;

    public static void A(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int M = M(parcel, i);
            parcel.writeByteArray(bArr);
            O(parcel, M);
        }
    }

    public static void B(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int M = M(parcel, i);
            parcel.writeInt(r0);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            O(parcel, M);
        }
    }

    public static void C(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int M = M(parcel, i);
            parcel.writeStrongBinder(iBinder);
            O(parcel, M);
        }
    }

    public static void D(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int M = M(parcel, i);
            parcel.writeIntArray(iArr);
            O(parcel, M);
        }
    }

    public static void E(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int M = M(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            O(parcel, M);
        }
    }

    public static void F(Parcel parcel, int i, String str) {
        if (str != null) {
            int M = M(parcel, i);
            parcel.writeString(str);
            O(parcel, M);
        }
    }

    public static void G(Parcel parcel, int i, List list) {
        if (list != null) {
            int M = M(parcel, i);
            parcel.writeStringList(list);
            O(parcel, M);
        }
    }

    public static void H(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int M = M(parcel, i);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i2);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            O(parcel, M);
        }
    }

    public static void I(Parcel parcel, int i, List list) {
        if (list != null) {
            int M = M(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            O(parcel, M);
        }
    }

    public static String J(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    Exception exc = e2;
                    String l = pb4.l(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(l), exc);
                    str2 = pb4.m("<", l, " threw ", exc.getClass().getName(), ">");
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                sb.append(str, i3, str.length());
            } else {
                sb.append(str, i3, indexOf);
                sb.append(objArr[i]);
                i++;
                i3 = indexOf + 2;
            }
        }
        sb.append(str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void K(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static String L(String str, Object... objArr) {
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
                sb.append(N(objArr[i]));
                i2 = indexOf + 2;
                i++;
            }
        }
        sb.append(str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(N(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static int M(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static String N(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            Exception exc = e2;
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

    public static void O(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static final void a(String str, vr2 vr2, sr2 sr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        String str2 = str;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        str2.getClass();
        vr22.getClass();
        sr2.getClass();
        yt22.g0(479345620);
        if (yt22.g(str2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (yt22.i(vr22)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i5 & 1, z)) {
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = u55.p("");
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            su0.a(sr2, su0.J(-880820084, new r46(vr22, aq4, 0), yt22), (ml4) null, su0.J(66217802, new ce4(28, sr2), yt22), (gs2) null, hj8.d, su0.J(1486774631, new p13(3, (Object) str2, (Object) aq4), yt22), (pq6) null, 0, 0, 0, 0, (wu1) null, yt22, 1772598, 16276);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new s46(str2, vr22, sr2, i, 0);
        }
    }

    public static final fk6 b(uy3 uy3, boolean z) {
        ll4 ll4 = (ll4) uy3.a0.g;
        dk6 dk6 = null;
        if ((ll4.z & 8) != 0) {
            loop0:
            while (true) {
                if (ll4 != null) {
                    if ((ll4.y & 8) != 0) {
                        ll4 ll42 = ll4;
                        eq4 eq4 = null;
                        while (true) {
                            if (ll42 == null) {
                                break;
                            } else if (ll42 instanceof dk6) {
                                dk6 = ll42;
                                break loop0;
                            } else {
                                if ((ll42.y & 8) != 0 && (ll42 instanceof wo1)) {
                                    int i = 0;
                                    for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                        if ((ll43.y & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                ll42 = ll43;
                                            } else {
                                                if (eq4 == null) {
                                                    eq4 = new eq4(new ll4[16]);
                                                }
                                                if (ll42 != null) {
                                                    eq4.b(ll42);
                                                    ll42 = null;
                                                }
                                                eq4.b(ll43);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ll42 = rc9.j(eq4);
                            }
                        }
                    }
                    if ((ll4.z & 8) == 0) {
                        break;
                    }
                    ll4 = ll4.B;
                } else {
                    break;
                }
            }
        }
        dk6.getClass();
        ll4 ll44 = ((ll4) dk6).w;
        ak6 x = uy3.x();
        if (x == null) {
            x = new ak6();
        }
        return new fk6(ll44, z, uy3, x);
    }

    public static final ly5 c(dh5 dh5, int i, tl7 tl7, bg7 bg7, boolean z, int i2) {
        ly5 ly5;
        float f2;
        float f3;
        if (bg7 != null) {
            ly5 = bg7.c(tl7.b.p(i));
        } else {
            ly5 = ly5.e;
        }
        float f4 = ly5.a;
        int r0 = dh5.r0(2.0f);
        if (z) {
            f2 = (((float) i2) - f4) - ((float) r0);
        } else {
            f2 = f4;
        }
        if (z) {
            f3 = ((float) i2) - f4;
        } else {
            f3 = ((float) r0) + f4;
        }
        return new ly5(f2, ly5.b, f3, ly5.d);
    }

    public static void d(String str, Object obj) {
        if (obj == null) {
            ku4.j(str);
        }
    }

    public static i48 e(ot5 ot5) {
        ot5.getClass();
        if (ot5.x.size() == 0) {
            return i48.b;
        }
        List list = ot5.x;
        list.getClass();
        return new i48(list);
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [b57, uc5] */
    public static final uc5 f(a57 a57) {
        a57.getClass();
        dz2 dz2 = new dz2(1);
        for (String str : a57.names()) {
            Iterable<String> v = a57.v(str);
            if (v == null) {
                v = a42.w;
            }
            String d2 = ss0.d(0, 0, 15, str);
            ArrayList arrayList = new ArrayList(et0.e0(v, 10));
            for (String d3 : v) {
                arrayList.add(ss0.d(0, 0, 11, d3));
            }
            dz2.L(d2, arrayList);
        }
        Map map = (Map) dz2.w;
        map.getClass();
        return new b57(map, true);
    }

    public static final ln7 g(ll4 ll4, Object obj) {
        o00 o00;
        if (!ll4.w.J) {
            yb3.b("visitAncestors called on an unattached node");
        }
        ll4 ll42 = ll4.w.A;
        uy3 O0 = rc9.O0(ll4);
        while (O0 != null) {
            if ((((ll4) O0.a0.g).z & 262144) != 0) {
                while (ll42 != null) {
                    if ((ll42.y & 262144) != 0) {
                        ll4 ll43 = ll42;
                        eq4 eq4 = null;
                        while (ll43 != null) {
                            if (ll43 instanceof ln7) {
                                ln7 ln7 = (ln7) ll43;
                                if (obj.equals(ln7.m())) {
                                    return ln7;
                                }
                            }
                            if ((ll43.y & 262144) != 0 && (ll43 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                    if ((ll44.y & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ll43 = ll44;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll43 != null) {
                                                eq4.b(ll43);
                                                ll43 = null;
                                            }
                                            eq4.b(ll44);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ll43 = rc9.j(eq4);
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
        return null;
    }

    public static final int h(int i) {
        return wg2.b(wg2.c.e(i).booleanValue(), (pt5) wg2.d.e(i), (ls5) wg2.e.e(i));
    }

    public static final String i(int i, yt2 yt2) {
        yt2.k(ye.a);
        return ((Resources) yt2.k(ye.c)).getString(i);
    }

    public static final void j(jv6 jv6, kr krVar, int i) {
        while (true) {
            int i2 = jv6.v;
            if (i > i2 && i < jv6.u) {
                return;
            }
            if (i2 != 0 || i != 0) {
                jv6.O();
                if (jv6.y(jv6.v)) {
                    krVar.i();
                }
                jv6.j();
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: h48} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014f  */
    public static final o9 k(int i, au1 au1) {
        o9 o9Var;
        mt5 mt5;
        int i2;
        cv3 cv3;
        hq1 hq1;
        int i3;
        bv3 bv3;
        Integer num;
        Integer num2;
        Integer num3;
        h48 h48;
        hq1 hq12;
        Integer num4;
        String str;
        au1 au12 = au1;
        o9 o9Var2 = new o9(8, false);
        vq4 vq4 = (vq4) au12.b;
        i48 i48 = (i48) au12.d;
        vq4.getClass();
        i48.getClass();
        nt5 nt5 = (nt5) dt0.z0(i, i48.a);
        h48 h482 = h48.d;
        String str2 = null;
        if (nt5 == null) {
            o9Var = null;
        } else {
            if ((nt5.x & 1) == 1) {
                num2 = Integer.valueOf(nt5.y);
            } else {
                num2 = null;
            }
            if ((nt5.x & 2) == 2) {
                num3 = Integer.valueOf(nt5.z);
            } else {
                num3 = null;
            }
            if (num3 != null) {
                h48 = new h48(num3.intValue() & 255, (num3.intValue() >> 8) & 255, (num3.intValue() >> 16) & 255);
            } else if (num2 != null) {
                h48 = new h48(num2.intValue() & 7, (num2.intValue() >> 3) & 15, (num2.intValue() >> 7) & 127);
            } else {
                h48 = h482;
            }
            lt5 lt5 = nt5.A;
            lt5.getClass();
            int ordinal = lt5.ordinal();
            if (ordinal == 0) {
                hq12 = hq1.w;
            } else if (ordinal == 1) {
                hq12 = hq1.x;
            } else if (ordinal == 2) {
                hq12 = hq1.y;
            } else {
                h.c();
                return null;
            }
            hq1 hq13 = hq12;
            if ((nt5.x & 8) == 8) {
                num4 = Integer.valueOf(nt5.B);
            } else {
                num4 = null;
            }
            if ((nt5.x & 16) == 16) {
                str = vq4.getString(nt5.C);
            } else {
                str = null;
            }
            mt5 mt52 = nt5.D;
            mt52.getClass();
            o9Var = new o9(h48, mt52, hq13, num4, str);
        }
        if (o9Var != null || au12.a) {
            if (o9Var != null) {
                mt5 = (mt5) o9Var.y;
            } else {
                mt5 = null;
            }
            if (mt5 == null) {
                i2 = -1;
            } else {
                i2 = uw5.a[mt5.ordinal()];
            }
            if (i2 == -1) {
                cv3 = cv3.z;
            } else if (i2 == 1) {
                cv3 = cv3.w;
            } else if (i2 == 2) {
                cv3 = cv3.x;
            } else if (i2 == 3) {
                cv3 = cv3.y;
            } else {
                h.c();
                return null;
            }
            if (o9Var != null) {
                hq1 = (hq1) o9Var.z;
            } else {
                hq1 = null;
            }
            if (hq1 == null) {
                i3 = -1;
            } else {
                i3 = uw5.b[hq1.ordinal()];
            }
            if (i3 != -1) {
                if (i3 == 1) {
                    bv3 = bv3.w;
                } else if (i3 == 2) {
                    bv3 = bv3.x;
                } else if (i3 != 3) {
                    h.c();
                    return null;
                }
                o9Var2.x = cv3;
                o9Var2.y = bv3;
                if (o9Var == null) {
                    num = (Integer) o9Var.A;
                } else {
                    num = null;
                }
                o9Var2.z = num;
                if (o9Var != null) {
                    str2 = o9Var.B;
                }
                o9Var2.A = str2;
                if (o9Var != null) {
                    h482 = o9Var.x;
                }
                o9Var2.B = new av3(h482.a, h482.b, h482.c);
                return o9Var2;
            }
            bv3 = bv3.y;
            o9Var2.x = cv3;
            o9Var2.y = bv3;
            if (o9Var == null) {
            }
            o9Var2.z = num;
            if (o9Var != null) {
            }
            o9Var2.A = str2;
            if (o9Var != null) {
            }
            o9Var2.B = new av3(h482.a, h482.b, h482.c);
            return o9Var2;
        }
        throw new IllegalArgumentException("No VersionRequirement with the given id in the table", (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: qs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: qs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: qs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: qs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: qs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: qs5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: qs5} */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02bb, code lost:
        if (r0 == false) goto L_0x02b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public static gu3 l(tr5 tr5, vq4 vq4, boolean z, int i) {
        boolean z2;
        uu3 uu3;
        bt5 bt5;
        String str;
        to3 to3;
        boolean z3 = false;
        if ((i & 2) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        tr5.getClass();
        vq4.getClass();
        gu3 gu3 = new gu3();
        ht5 ht5 = tr5.W;
        ht5.getClass();
        wv1 wv1 = new wv1(ht5);
        i48 i48 = i48.b;
        ot5 ot5 = tr5.Y;
        ot5.getClass();
        au1 au1 = new au1(vq4, wv1, e(ot5), z2, (List) a42.w, 16);
        List list = tr5.C;
        list.getClass();
        au1 d2 = au1.d(list);
        List<nk4> list2 = (List) d2.h;
        wv1 wv12 = (wv1) d2.c;
        gu3.a = tr5.z;
        int i2 = tr5.A;
        vq4 vq42 = (vq4) d2.b;
        gu3.b = g75.A(vq42, i2);
        List<gt5> list3 = tr5.C;
        list3.getClass();
        for (gt5 gt5 : list3) {
            gt5.getClass();
            gu3.c.add(r(gt5, d2));
        }
        for (bt5 q : p25.D(tr5, wv12)) {
            gu3.d.add(q(q, d2));
        }
        List list4 = tr5.L;
        list4.getClass();
        Iterator it = list4.iterator();
        while (true) {
            uu3 = null;
            if (!it.hasNext()) {
                break;
            }
            wr5 wr5 = (wr5) it.next();
            wr5.getClass();
            ku3 ku3 = new ku3(wr5.z);
            List<jt5> list5 = wr5.A;
            list5.getClass();
            for (jt5 jt5 : list5) {
                jt5.getClass();
                ku3.b.add(s(jt5, d2));
            }
            List<Integer> list6 = wr5.B;
            list6.getClass();
            for (Integer num : list6) {
                num.getClass();
                ku3.c.add(k(num.intValue(), d2));
            }
            List<ur5> list7 = wr5.C;
            list7.getClass();
            for (ur5 ur5 : list7) {
                ku3.d.put(vq42.getString(ur5.y), ur5.z.x());
            }
            for (nk4 nk4 : list2) {
                ((ro3) nk4).getClass();
                do3 x = tf4.x(ku3);
                List<qr5> list8 = wr5.D;
                list8.getClass();
                for (qr5 qr5 : list8) {
                    qr5.getClass();
                    ku3.e.add(g75.H(qr5, vq42));
                }
                y92 y92 = rp3.a;
                qo3 a2 = rp3.a(wr5, vq42, wv12);
                if (a2 != null) {
                    to3 = new to3(a2.t, a2.u);
                } else {
                    to3 = null;
                }
                x.a = to3;
            }
            gu3.h.add(ku3);
        }
        List list9 = tr5.M;
        list9.getClass();
        List list10 = tr5.N;
        list10.getClass();
        List list11 = tr5.O;
        list11.getClass();
        y(gu3, list9, list10, list11, d2);
        if ((tr5.y & 4) == 4) {
            vq42.getString(tr5.B);
        }
        List<Integer> list12 = tr5.G;
        list12.getClass();
        for (Integer num2 : list12) {
            num2.getClass();
            gu3.i.add(vq42.getString(num2.intValue()));
        }
        for (es5 es5 : tr5.P) {
            if ((es5.y & 1) == 1) {
                gu3.j.add(vq42.getString(es5.z));
                bt2 bt2 = new bt2(vq42.getString(es5.z));
                for (nk4 nk42 : list2) {
                    ((ro3) nk42).getClass();
                    for (qr5 qr52 : es5.A) {
                        qr52.getClass();
                        bt2.c.add(g75.H(qr52, vq42));
                    }
                }
                gu3.k.add(bt2);
            } else {
                throw new IllegalArgumentException("No name for EnumEntry", (Throwable) null);
            }
        }
        List<Integer> list13 = tr5.Q;
        list13.getClass();
        for (Integer num3 : list13) {
            num3.getClass();
            gu3.l.add(g75.A(vq42, num3.intValue()));
        }
        if ((tr5.y & 8) == 8) {
            gu3.m = vq42.getString(tr5.S);
        }
        int i3 = tr5.y;
        if ((i3 & 16) == 16) {
            bt5 = tr5.T;
        } else if ((i3 & 32) == 32) {
            bt5 = wv12.a(tr5.U);
        } else {
            bt5 = null;
        }
        if (bt5 == null) {
            if ((tr5.y & 8) == 8) {
                List list14 = tr5.N;
                list14.getClass();
                Iterator it2 = list14.iterator();
                qs5 qs5 = null;
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        qs5 qs52 = next;
                        qs52.getClass();
                        if (p25.A(qs52, wv12) == null && vq42.getString(qs52.B).equals(vq42.getString(tr5.S))) {
                            if (z3) {
                                break;
                            }
                            z3 = true;
                            qs5 = next;
                        }
                    }
                }
                qs5 = null;
                qs5 qs53 = qs5;
                if (qs53 != null) {
                    bt5 = p25.C(qs53, wv12);
                }
            }
            bt5 = null;
        }
        if (bt5 != null) {
            uu3 = q(bt5, d2);
        }
        gu3.n = uu3;
        for (bt5 q2 : p25.h(tr5, wv12)) {
            gu3.p.add(q(q2, d2));
        }
        List<Integer> list15 = tr5.X;
        list15.getClass();
        for (Integer num4 : list15) {
            num4.getClass();
            gu3.q.add(k(num4.intValue(), d2));
        }
        List<ur5> list16 = tr5.Z;
        list16.getClass();
        for (ur5 ur52 : list16) {
            gu3.r.put(vq42.getString(ur52.y), ur52.z.x());
        }
        for (nk4 nk43 : list2) {
            ((ro3) nk43).getClass();
            bo3 w = tf4.w(gu3);
            List<qr5> list17 = tr5.V;
            list17.getClass();
            for (qr5 qr53 : list17) {
                qr53.getClass();
                gu3.o.add(g75.H(qr53, vq42));
            }
            yu2 yu2 = qp3.i;
            yu2.getClass();
            Integer num5 = (Integer) jb5.n(tr5, yu2);
            if (num5 != null) {
                vq42.getString(num5.intValue());
            }
            for (qs5 qs54 : (List) tr5.k(qp3.h)) {
                ArrayList arrayList = w.a;
                qs54.getClass();
                arrayList.add(p(qs54, d2));
            }
            yu2 yu22 = qp3.g;
            yu22.getClass();
            Integer num6 = (Integer) jb5.n(tr5, yu22);
            if (num6 != null) {
                str = vq42.getString(num6.intValue());
            } else {
                str = "main";
            }
            w.b = str;
            yu2 yu23 = qp3.j;
            yu23.getClass();
            Integer num7 = (Integer) jb5.n(tr5, yu23);
        }
        return gu3;
    }

    public static final h12 m(hs5 hs5, au1 au1) {
        h12 h12 = new h12(2);
        int i = hs5.y;
        bt5 bt5 = null;
        if ((hs5.x & 4) == 4) {
            gs5 gs5 = hs5.A;
            if (gs5 != null) {
                int ordinal = gs5.ordinal();
                if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
                    h.c();
                    return null;
                }
            } else {
                h.q("Required value was null.");
                return null;
            }
        }
        wv1 wv1 = (wv1) au1.c;
        wv1.getClass();
        int i2 = hs5.x;
        if ((i2 & 8) == 8) {
            bt5 = hs5.B;
        } else if ((i2 & 16) == 16) {
            bt5 = wv1.a(hs5.C);
        }
        if (bt5 != null) {
            q(bt5, au1);
        }
        List<hs5> list = hs5.D;
        list.getClass();
        for (hs5 hs52 : list) {
            hs52.getClass();
            h12.a.add(m(hs52, au1));
        }
        List<hs5> list2 = hs5.E;
        list2.getClass();
        for (hs5 hs53 : list2) {
            hs53.getClass();
            h12.b.add(m(hs53, au1));
        }
        return h12;
    }

    public static final qu3 n(js5 js5, au1 au1) {
        uu3 uu3;
        ArrayList arrayList;
        to3 to3;
        mu3 mu3;
        qu3 qu3 = new qu3(js5.z, ((vq4) au1.b).getString(js5.B));
        List list = js5.E;
        list.getClass();
        au1 d2 = au1.d(list);
        vq4 vq4 = (vq4) d2.b;
        wv1 wv1 = (wv1) d2.c;
        List<gt5> list2 = js5.E;
        list2.getClass();
        for (gt5 gt5 : list2) {
            gt5.getClass();
            qu3.c.add(r(gt5, d2));
        }
        bt5 z = p25.z(js5, wv1);
        if (z != null) {
            uu3 = q(z, d2);
        } else {
            uu3 = null;
        }
        qu3.d = uu3;
        List list3 = js5.K;
        list3.getClass();
        Iterator it = list3.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = qu3.g;
            if (!hasNext) {
                break;
            }
            jt5 jt5 = (jt5) it.next();
            jt5.getClass();
            arrayList.add(s(jt5, d2));
        }
        if (js5.K.isEmpty()) {
            List list4 = js5.H;
            list4.getClass();
            if (!list4.isEmpty()) {
                for (bt5 q : p25.i(js5, wv1)) {
                    uu3 q2 = q(q, d2);
                    yu3 yu3 = new yu3(0, "_");
                    yu3.c = q2;
                    arrayList.add(yu3);
                }
            }
        }
        List<jt5> list5 = js5.L;
        list5.getClass();
        for (jt5 jt52 : list5) {
            jt52.getClass();
            qu3.f.add(s(jt52, d2));
        }
        qu3.h = q(p25.B(js5, wv1), d2);
        if ((js5.y & 256) == 256) {
            yr5 yr5 = js5.O;
            yr5.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            for (cs5 cs5 : yr5.x) {
                if ((cs5.x & 1) == 1) {
                    as5 as5 = cs5.y;
                    if (as5 != null) {
                        int ordinal = as5.ordinal();
                        if (ordinal == 0) {
                            mu3 = mu3.w;
                        } else if (ordinal == 1) {
                            mu3 = mu3.x;
                        } else if (ordinal == 2) {
                            mu3 = mu3.y;
                        } else if (ordinal == 3) {
                            mu3 = mu3.z;
                        } else {
                            h.c();
                            return null;
                        }
                        if ((cs5.x & 4) == 4) {
                            bs5 bs5 = cs5.B;
                            if (bs5 != null) {
                                int ordinal2 = bs5.ordinal();
                                if (!(ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2)) {
                                    h.c();
                                    return null;
                                }
                            } else {
                                h.q("Required value was null.");
                                return null;
                            }
                        }
                        wg0 wg0 = new wg0(mu3);
                        List<hs5> list6 = cs5.z;
                        list6.getClass();
                        ArrayList arrayList3 = wg0.b;
                        for (hs5 hs5 : list6) {
                            hs5.getClass();
                            arrayList3.add(m(hs5, d2));
                        }
                        if ((cs5.x & 2) == 2) {
                            hs5 hs52 = cs5.A;
                            hs52.getClass();
                            m(hs52, d2);
                        }
                        arrayList2.add(wg0);
                    } else {
                        h.q("Required value was null.");
                        return null;
                    }
                }
            }
        }
        List<Integer> list7 = js5.N;
        list7.getClass();
        for (Integer num : list7) {
            num.getClass();
            qu3.i.add(k(num.intValue(), d2));
        }
        List<ur5> list8 = js5.P;
        list8.getClass();
        for (ur5 ur5 : list8) {
            qu3.j.put(vq4.getString(ur5.y), ur5.z.x());
        }
        for (nk4 nk4 : (List) d2.h) {
            ((ro3) nk4).getClass();
            io3 y = tf4.y(qu3);
            List<qr5> list9 = js5.Q;
            list9.getClass();
            for (qr5 qr5 : list9) {
                qr5.getClass();
                qu3.k.add(g75.H(qr5, vq4));
            }
            List<qr5> list10 = js5.R;
            list10.getClass();
            for (qr5 qr52 : list10) {
                qr52.getClass();
                qu3.e.add(g75.H(qr52, vq4));
            }
            y92 y92 = rp3.a;
            qo3 c2 = rp3.c(js5, vq4, wv1);
            if (c2 != null) {
                to3 = new to3(c2.t, c2.u);
            } else {
                to3 = null;
            }
            y.a = to3;
            yu2 yu2 = qp3.c;
            yu2.getClass();
            Integer num2 = (Integer) jb5.n(js5, yu2);
            if (num2 != null) {
                vq4.getString(num2.intValue());
            }
        }
        return qu3;
    }

    public static ru3 o(ns5 ns5, vq4 vq4, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        ns5.getClass();
        vq4.getClass();
        ru3 ru3 = new ru3();
        ht5 ht5 = ns5.C;
        ht5.getClass();
        wv1 wv1 = new wv1(ht5);
        i48 i48 = i48.b;
        ot5 ot5 = ns5.D;
        ot5.getClass();
        au1 au1 = new au1(vq4, wv1, e(ot5), z2, (List) a42.w, 16);
        List list = ns5.z;
        list.getClass();
        List list2 = ns5.A;
        list2.getClass();
        List list3 = ns5.B;
        list3.getClass();
        y(ru3, list, list2, list3, au1);
        for (nk4 nk4 : (List) au1.h) {
            ((ro3) nk4).getClass();
            ou3 ou3 = vo3.b;
            ou3.getClass();
            vo3 vo3 = (vo3) rj1.I(ru3.d, ou3);
            for (qs5 qs5 : (List) ns5.k(qp3.l)) {
                ArrayList arrayList = vo3.a;
                qs5.getClass();
                arrayList.add(p(qs5, au1));
            }
            yu2 yu2 = qp3.k;
            yu2.getClass();
            Integer num = (Integer) jb5.n(ns5, yu2);
            if (num != null) {
                ((vq4) au1.b).getString(num.intValue());
            }
        }
        return ru3;
    }

    public static final su3 p(qs5 qs5, au1 au1) {
        int i;
        int i2;
        uu3 uu3;
        ArrayList arrayList;
        ip3 ip3;
        ip3 ip32;
        fo3 fo3;
        to3 to3;
        to3 to32;
        ip3 ip33;
        to3 to33;
        ip3 ip34;
        to3 to34;
        qs5.getClass();
        int i3 = qs5.z;
        String string = ((vq4) au1.b).getString(qs5.B);
        if ((qs5.y & 256) == 256) {
            i = qs5.M;
        } else {
            i = h(qs5.z);
        }
        if ((qs5.y & 512) == 512) {
            i2 = qs5.N;
        } else {
            i2 = h(qs5.z);
        }
        su3 su3 = new su3(i3, i, i2, string);
        List list = qs5.E;
        list.getClass();
        au1 d2 = au1.d(list);
        vq4 vq4 = (vq4) d2.b;
        wv1 wv1 = (wv1) d2.c;
        List<gt5> list2 = qs5.E;
        list2.getClass();
        for (gt5 gt5 : list2) {
            gt5.getClass();
            su3.e.add(r(gt5, d2));
        }
        bt5 A = p25.A(qs5, wv1);
        if (A != null) {
            uu3 = q(A, d2);
        } else {
            uu3 = null;
        }
        su3.f = uu3;
        List list3 = qs5.K;
        list3.getClass();
        Iterator it = list3.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = su3.h;
            if (!hasNext) {
                break;
            }
            jt5 jt5 = (jt5) it.next();
            jt5.getClass();
            arrayList.add(s(jt5, d2));
        }
        if (qs5.K.isEmpty()) {
            List list4 = qs5.H;
            list4.getClass();
            if (!list4.isEmpty()) {
                for (bt5 q : p25.j(qs5, wv1)) {
                    uu3 q2 = q(q, d2);
                    yu3 yu3 = new yu3(0, "_");
                    yu3.c = q2;
                    arrayList.add(yu3);
                }
            }
        }
        if ((qs5.y & 128) == 128) {
            jt5 jt52 = qs5.L;
            jt52.getClass();
            su3.i = s(jt52, d2);
        }
        su3.j = q(p25.C(qs5, wv1), d2);
        List<Integer> list5 = qs5.O;
        list5.getClass();
        for (Integer num : list5) {
            num.getClass();
            su3.k.add(k(num.intValue(), d2));
        }
        List<ur5> list6 = qs5.P;
        list6.getClass();
        for (ur5 ur5 : list6) {
            su3.l.put(vq4.getString(ur5.y), ur5.z.x());
        }
        for (nk4 nk4 : (List) d2.h) {
            ((ro3) nk4).getClass();
            ap3 z = tf4.z(su3);
            List<qr5> list7 = qs5.Q;
            list7.getClass();
            for (qr5 qr5 : list7) {
                qr5.getClass();
                su3.m.add(g75.H(qr5, vq4));
            }
            List<qr5> list8 = qs5.R;
            list8.getClass();
            ArrayList arrayList2 = su3.c.b;
            for (qr5 qr52 : list8) {
                qr52.getClass();
                arrayList2.add(g75.H(qr52, vq4));
            }
            tu3 tu3 = su3.d;
            if (tu3 != null) {
                List<qr5> list9 = qs5.S;
                list9.getClass();
                ArrayList arrayList3 = tu3.b;
                for (qr5 qr53 : list9) {
                    qr53.getClass();
                    arrayList3.add(g75.H(qr53, vq4));
                }
            }
            List<qr5> list10 = qs5.T;
            list10.getClass();
            for (qr5 qr54 : list10) {
                qr54.getClass();
                su3.g.add(g75.H(qr54, vq4));
            }
            List<qr5> list11 = qs5.U;
            list11.getClass();
            for (qr5 qr55 : list11) {
                qr55.getClass();
                su3.n.add(g75.H(qr55, vq4));
            }
            List<qr5> list12 = qs5.V;
            list12.getClass();
            for (qr5 qr56 : list12) {
                qr56.getClass();
                su3.o.add(g75.H(qr56, vq4));
            }
            y92 y92 = rp3.a;
            po3 b2 = rp3.b(qs5, vq4, wv1, true);
            yu2 yu2 = qp3.d;
            yu2.getClass();
            kp3 kp3 = (kp3) jb5.n(qs5, yu2);
            if (kp3 == null || !kp3.i()) {
                ip3 = null;
            } else {
                ip3 = kp3.A;
            }
            if (kp3 == null || (kp3.x & 8) != 8) {
                ip32 = null;
            } else {
                ip32 = kp3.B;
            }
            Object k = qs5.k(qp3.e);
            k.getClass();
            z.a = ((Number) k).intValue();
            if (b2 != null) {
                fo3 = new fo3(b2.t, b2.u);
            } else {
                fo3 = null;
            }
            z.b = fo3;
            if (ip3 != null) {
                to3 = new to3(vq4.getString(ip3.y), vq4.getString(ip3.z));
            } else {
                to3 = null;
            }
            z.c = to3;
            if (ip32 != null) {
                to32 = new to3(vq4.getString(ip32.y), vq4.getString(ip32.z));
            } else {
                to32 = null;
            }
            z.d = to32;
            if (kp3 == null || (kp3.x & 2) != 2) {
                ip33 = null;
            } else {
                ip33 = kp3.z;
            }
            if (ip33 != null) {
                to33 = new to3(vq4.getString(ip33.y), vq4.getString(ip33.z));
            } else {
                to33 = null;
            }
            z.e = to33;
            if (kp3 == null || (kp3.x & 16) != 16) {
                ip34 = null;
            } else {
                ip34 = kp3.C;
            }
            if (ip34 != null) {
                to34 = new to3(vq4.getString(ip34.y), vq4.getString(ip34.z));
            } else {
                to34 = null;
            }
            z.f = to34;
        }
        return su3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: pu3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r3v19, types: [java.lang.Object, pu3] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final uu3 q(bt5 bt5, au1 au1) {
        r16 r16;
        bt5 bt52;
        uu3 uu3;
        uu3 uu32;
        bt5 bt53;
        zu3 zu3;
        bt5 bt54;
        wv1 wv1 = (wv1) au1.c;
        vq4 vq4 = (vq4) au1.b;
        uu3 uu33 = new uu3(bt5.A + (bt5.M << 1));
        ? r4 = 0;
        if (bt5.p()) {
            r16 = new hu3(g75.A(vq4, bt5.E));
        } else {
            int i = bt5.y;
            if ((i & 128) == 128) {
                r16 = new iu3(g75.A(vq4, bt5.H));
            } else if ((i & 32) == 32) {
                r16 = new ju3(bt5.F);
            } else if ((i & 64) == 64) {
                Integer a2 = au1.a(bt5.G);
                if (a2 != null) {
                    r16 = new ju3(a2.intValue());
                } else {
                    throw new IllegalArgumentException("No type parameter id for ".concat(vq4.getString(bt5.G)), (Throwable) null);
                }
            } else {
                throw new IllegalArgumentException("No classifier (class, type alias or type parameter) recorded for Type", (Throwable) null);
            }
        }
        uu33.b = r16;
        for (zs5 zs5 : bt5.z) {
            ys5 ys5 = zs5.y;
            if (ys5 != null) {
                int ordinal = ys5.ordinal();
                if (ordinal == 0) {
                    zu3 = zu3.x;
                } else if (ordinal == 1) {
                    zu3 = zu3.y;
                } else if (ordinal == 2) {
                    zu3 = zu3.w;
                } else if (ordinal == 3) {
                    zu3 = null;
                } else {
                    h.c();
                    return null;
                }
                ArrayList arrayList = uu33.c;
                if (zu3 != null) {
                    wv1.getClass();
                    int i2 = zs5.x;
                    if ((i2 & 2) == 2) {
                        bt54 = zs5.z;
                    } else if ((i2 & 4) == 4) {
                        bt54 = wv1.a(zs5.A);
                    } else {
                        bt54 = null;
                    }
                    if (bt54 != null) {
                        arrayList.add(new xu3(zu3, q(bt54, au1)));
                    } else {
                        throw new IllegalArgumentException("No type argument for non-STAR projection in Type", (Throwable) null);
                    }
                } else {
                    arrayList.add(xu3.c);
                }
            } else {
                h.q("Required value was null.");
                return null;
            }
        }
        wv1.getClass();
        int i3 = bt5.y;
        if ((i3 & 1024) == 1024) {
            bt52 = bt5.K;
        } else if ((i3 & 2048) == 2048) {
            bt52 = wv1.a(bt5.L);
        } else {
            bt52 = null;
        }
        if (bt52 != null) {
            uu3 = q(bt52, au1);
        } else {
            uu3 = null;
        }
        uu33.d = uu3;
        bt5 w = p25.w(bt5, wv1);
        if (w != null) {
            uu32 = q(w, au1);
        } else {
            uu32 = null;
        }
        uu33.e = uu32;
        int i4 = bt5.y;
        if ((i4 & 4) == 4) {
            bt53 = bt5.C;
        } else if ((i4 & 8) == 8) {
            bt53 = wv1.a(bt5.D);
        } else {
            bt53 = null;
        }
        if (bt53 != null) {
            uu3 q = q(bt53, au1);
            if ((bt5.y & 2) == 2) {
                r4 = vq4.getString(bt5.B);
            }
            ? obj = new Object();
            obj.a = q;
            obj.b = r4;
            r4 = obj;
        }
        uu33.f = r4;
        for (nk4 nk4 : (List) au1.h) {
            ((ro3) nk4).getClass();
            ou3 ou3 = xp3.c;
            ou3.getClass();
            xp3 xp3 = (xp3) rj1.I(uu33.g, ou3);
            Object k = bt5.k(qp3.f);
            k.getClass();
            xp3.a = ((Boolean) k).booleanValue();
            for (qr5 qr5 : bt5.N) {
                ArrayList arrayList2 = xp3.b;
                qr5.getClass();
                arrayList2.add(g75.H(qr5, vq4));
            }
        }
        return uu33;
    }

    public static final wu3 r(gt5 gt5, au1 au1) {
        zu3 zu3;
        vq4 vq4 = (vq4) au1.b;
        ft5 ft5 = gt5.C;
        if (ft5 != null) {
            int ordinal = ft5.ordinal();
            if (ordinal == 0) {
                zu3 = zu3.x;
            } else if (ordinal == 1) {
                zu3 = zu3.y;
            } else if (ordinal == 2) {
                zu3 = zu3.w;
            } else {
                h.c();
                return null;
            }
            boolean z = gt5.B;
            wu3 wu3 = new wu3(z ? 1 : 0, vq4.getString(gt5.A), gt5.z, zu3);
            for (bt5 q : p25.G(gt5, (wv1) au1.c)) {
                wu3.e.add(q(q, au1));
            }
            for (nk4 nk4 : (List) au1.h) {
                ((ro3) nk4).getClass();
                ou3 ou3 = yp3.b;
                ou3.getClass();
                yp3 yp3 = (yp3) rj1.I(wu3.f, ou3);
                for (qr5 qr5 : gt5.G) {
                    ArrayList arrayList = yp3.a;
                    qr5.getClass();
                    arrayList.add(g75.H(qr5, vq4));
                }
            }
            return wu3;
        }
        h.q("Required value was null.");
        return null;
    }

    public static final yu3 s(jt5 jt5, au1 au1) {
        bt5 bt5;
        int i = jt5.z;
        int i2 = jt5.A;
        vq4 vq4 = (vq4) au1.b;
        yu3 yu3 = new yu3(i, vq4.getString(i2));
        wv1 wv1 = (wv1) au1.c;
        yu3.c = q(p25.E(jt5, wv1), au1);
        int i3 = jt5.y;
        uu3 uu3 = null;
        if ((i3 & 16) == 16) {
            bt5 = jt5.D;
        } else if ((i3 & 32) == 32) {
            bt5 = wv1.a(jt5.E);
        } else {
            bt5 = null;
        }
        if (bt5 != null) {
            uu3 = q(bt5, au1);
        }
        yu3.d = uu3;
        if ((jt5.y & 64) == 64) {
            nr5 nr5 = jt5.G;
            nr5.getClass();
            g75.I(nr5, vq4);
        }
        for (nk4 nk4 : (List) au1.h) {
            ((ro3) nk4).getClass();
            List<qr5> list = jt5.F;
            list.getClass();
            for (qr5 qr5 : list) {
                qr5.getClass();
                yu3.e.add(g75.H(qr5, vq4));
            }
        }
        return yu3;
    }

    public static final void t(vo1 vo1, Object obj, vr2 vr2) {
        o00 o00;
        if (!((ll4) vo1).w.J) {
            yb3.b("visitAncestors called on an unattached node");
        }
        ll4 ll4 = ((ll4) vo1).w.A;
        uy3 O0 = rc9.O0(vo1);
        while (O0 != null) {
            if ((((ll4) O0.a0.g).z & 262144) != 0) {
                while (ll4 != null) {
                    if ((ll4.y & 262144) != 0) {
                        ll4 ll42 = ll4;
                        eq4 eq4 = null;
                        while (ll42 != null) {
                            boolean z = true;
                            if (ll42 instanceof ln7) {
                                ln7 ln7 = (ln7) ll42;
                                if (obj.equals(ln7.m())) {
                                    z = ((Boolean) vr2.y(ln7)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((ll42.y & 262144) != 0 && (ll42 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                    if ((ll43.y & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ll42 = ll43;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll42 != null) {
                                                eq4.b(ll42);
                                                ll42 = null;
                                            }
                                            eq4.b(ll43);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ll42 = rc9.j(eq4);
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
    }

    public static final void u(ln7 ln7, vr2 vr2) {
        o00 o00;
        ll4 ll4 = (ll4) ln7;
        if (!ll4.w.J) {
            yb3.b("visitAncestors called on an unattached node");
        }
        ll4 ll42 = ll4.w.A;
        uy3 O0 = rc9.O0(ln7);
        while (O0 != null) {
            if ((((ll4) O0.a0.g).z & 262144) != 0) {
                while (ll42 != null) {
                    if ((ll42.y & 262144) != 0) {
                        ll4 ll43 = ll42;
                        eq4 eq4 = null;
                        while (ll43 != null) {
                            boolean z = true;
                            if (ll43 instanceof ln7) {
                                ln7 ln72 = (ln7) ll43;
                                if (sg3.e(ln7.m(), ln72.m()) && ln7.getClass() == ln72.getClass()) {
                                    z = ((Boolean) vr2.y(ln72)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((ll43.y & 262144) != 0 && (ll43 instanceof wo1)) {
                                int i = 0;
                                for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                    if ((ll44.y & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ll43 = ll44;
                                        } else {
                                            if (eq4 == null) {
                                                eq4 = new eq4(new ll4[16]);
                                            }
                                            if (ll43 != null) {
                                                eq4.b(ll43);
                                                ll43 = null;
                                            }
                                            eq4.b(ll44);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ll43 = rc9.j(eq4);
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
    }

    public static final void v(ll4 ll4, String str, vr2 vr2) {
        kn7 kn7;
        if (!ll4.w.J) {
            yb3.b("visitSubtreeIf called on an unattached node");
        }
        eq4 eq4 = new eq4(new ll4[16]);
        ll4 ll42 = ll4.w;
        ll4 ll43 = ll42.B;
        if (ll43 == null) {
            rc9.h(eq4, ll42);
        } else {
            eq4.b(ll43);
        }
        while (true) {
            int i = eq4.y;
            if (i != 0) {
                ll4 ll44 = (ll4) eq4.l(i - 1);
                if ((ll44.z & 262144) != 0) {
                    ll4 ll45 = ll44;
                    while (true) {
                        if (ll45 == null || !ll45.J) {
                            break;
                        }
                        if ((ll45.y & 262144) != 0) {
                            ll4 ll46 = ll45;
                            eq4 eq42 = null;
                            while (ll46 != null) {
                                if (ll46 instanceof ln7) {
                                    ln7 ln7 = (ln7) ll46;
                                    if (str.equals(ln7.m())) {
                                        kn7 = (kn7) vr2.y(ln7);
                                    } else {
                                        kn7 = kn7.w;
                                    }
                                    if (kn7 != kn7.y) {
                                        if (kn7 == kn7.x) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((ll46.y & 262144) != 0 && (ll46 instanceof wo1)) {
                                    int i2 = 0;
                                    for (ll4 ll47 = ((wo1) ll46).L; ll47 != null; ll47 = ll47.B) {
                                        if ((ll47.y & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                ll46 = ll47;
                                            } else {
                                                if (eq42 == null) {
                                                    eq42 = new eq4(new ll4[16]);
                                                }
                                                if (ll46 != null) {
                                                    eq42.b(ll46);
                                                    ll46 = null;
                                                }
                                                eq42.b(ll47);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ll46 = rc9.j(eq42);
                            }
                            continue;
                        }
                        ll45 = ll45.B;
                    }
                }
                rc9.h(eq4, ll44);
            } else {
                return;
            }
        }
    }

    public static final void w(ln7 ln7, vr2 vr2) {
        kn7 kn7;
        ll4 ll4 = (ll4) ln7;
        if (!ll4.w.J) {
            yb3.b("visitSubtreeIf called on an unattached node");
        }
        eq4 eq4 = new eq4(new ll4[16]);
        ll4 ll42 = ll4.w;
        ll4 ll43 = ll42.B;
        if (ll43 == null) {
            rc9.h(eq4, ll42);
        } else {
            eq4.b(ll43);
        }
        while (true) {
            int i = eq4.y;
            if (i != 0) {
                ll4 ll44 = (ll4) eq4.l(i - 1);
                if ((ll44.z & 262144) != 0) {
                    ll4 ll45 = ll44;
                    while (true) {
                        if (ll45 == null || !ll45.J) {
                            break;
                        }
                        if ((ll45.y & 262144) != 0) {
                            ll4 ll46 = ll45;
                            eq4 eq42 = null;
                            while (ll46 != null) {
                                if (ll46 instanceof ln7) {
                                    ln7 ln72 = (ln7) ll46;
                                    if (!sg3.e(ln7.m(), ln72.m()) || ln7.getClass() != ln72.getClass()) {
                                        kn7 = kn7.w;
                                    } else {
                                        kn7 = (kn7) vr2.y(ln72);
                                    }
                                    if (kn7 != kn7.y) {
                                        if (kn7 == kn7.x) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((ll46.y & 262144) != 0 && (ll46 instanceof wo1)) {
                                    int i2 = 0;
                                    for (ll4 ll47 = ((wo1) ll46).L; ll47 != null; ll47 = ll47.B) {
                                        if ((ll47.y & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                ll46 = ll47;
                                            } else {
                                                if (eq42 == null) {
                                                    eq42 = new eq4(new ll4[16]);
                                                }
                                                if (ll46 != null) {
                                                    eq42.b(ll46);
                                                    ll46 = null;
                                                }
                                                eq42.b(ll47);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ll46 = rc9.j(eq42);
                            }
                            continue;
                        }
                        ll45 = ll45.B;
                    }
                }
                rc9.h(eq4, ll44);
            } else {
                return;
            }
        }
    }

    public static final void x(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final void y(lu3 lu3, List list, List list2, List list3, au1 au1) {
        List b2 = lu3.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b2.add(n((js5) it.next(), au1));
        }
        ArrayList a2 = lu3.a();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            a2.add(p((qs5) it2.next(), au1));
        }
        ArrayList c2 = lu3.c();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dt5 dt5 = (dt5) it3.next();
            vu3 vu3 = new vu3(dt5.z, ((vq4) au1.b).getString(dt5.A));
            List list4 = dt5.B;
            list4.getClass();
            au1 d2 = au1.d(list4);
            vq4 vq4 = (vq4) d2.b;
            wv1 wv1 = (wv1) d2.c;
            List<gt5> list5 = dt5.B;
            list5.getClass();
            for (gt5 gt5 : list5) {
                gt5.getClass();
                vu3.b.add(r(gt5, d2));
            }
            q(p25.F(dt5, wv1), d2);
            q(p25.k(dt5, wv1), d2);
            List<qr5> list6 = dt5.G;
            list6.getClass();
            for (qr5 qr5 : list6) {
                qr5.getClass();
                vu3.c.add(g75.H(qr5, vq4));
            }
            List<Integer> list7 = dt5.H;
            list7.getClass();
            for (Integer num : list7) {
                num.getClass();
                vu3.d.add(k(num.intValue(), d2));
            }
            List<ur5> list8 = dt5.I;
            list8.getClass();
            for (ur5 ur5 : list8) {
                vu3.e.put(vq4.getString(ur5.y), ur5.z.x());
            }
            for (nk4 nk4 : (List) d2.h) {
                nk4.getClass();
            }
            c2.add(vu3);
        }
    }

    public static void z(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int M = M(parcel, i);
            parcel.writeBundle(bundle);
            O(parcel, M);
        }
    }
}
