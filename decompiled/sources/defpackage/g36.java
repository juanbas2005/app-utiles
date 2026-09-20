package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lg36;", "Lr58;", "e36", "registro"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* renamed from: g36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g36 extends r58 {
    public final Context b;
    public final ye6 c;
    public final h81 d;
    public final d37 e;
    public final xw5 f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public List h;
    public List i;
    public final d37 j;
    public final xw5 k;

    public g36(Context context, ye6 ye6, h81 h81) {
        int i2;
        ye6.getClass();
        this.b = context;
        this.c = ye6;
        this.d = h81;
        d37 a = e37.a(new is7(6, new q26()));
        this.e = a;
        this.f = kl8.N(a, new is7(6, new q26()), u58.a(this));
        a42 a42 = a42.w;
        this.h = a42;
        this.i = a42;
        ar7.H(u58.a(this), h81, (r81) null, new f36(this, (f61) null), 2);
        Integer num = (Integer) ye6.a("registro_selected_tab");
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        d37 a2 = e37.a(Integer.valueOf(i2));
        this.j = a2;
        this.k = gr8.t(a2);
    }

    public static String f(ArrayList arrayList, boolean z) {
        double d2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((pl7) next).e == z) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        double d3 = 0.0d;
        while (it2.hasNext()) {
            Double i0 = j57.i0(d57.g1(((pl7) it2.next()).b, " CUP"));
            if (i0 != null) {
                d2 = i0.doubleValue();
            } else {
                d2 = 0.0d;
            }
            d3 += d2;
        }
        return String.format("%.2f CUP", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
    }

    public static String h(String str) {
        Character ch;
        if (str.length() == 0) {
            ch = null;
        } else {
            ch = Character.valueOf(str.charAt(0));
        }
        if (ch == null) {
            return "#";
        }
        char charValue = ch.charValue();
        if (!Character.isLetter(charValue)) {
            return "#";
        }
        String valueOf = String.valueOf(charValue);
        valueOf.getClass();
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static boolean i(String str, String str2) {
        String lowerCase = pb4.l(str, " ", str2).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (d57.x0(lowerCase, "etecsa", false) || d57.x0(lowerCase, "cubacel", false)) {
            return true;
        }
        String obj = d57.k1(str).toString();
        if (k57.u0(obj, "*", false) || k57.u0(obj, "#", false)) {
            return true;
        }
        String R0 = d57.R0(obj, "+");
        if (R0.length() > 0) {
            int i2 = 0;
            while (true) {
                if (i2 < R0.length()) {
                    if (!Character.isDigit(R0.charAt(i2))) {
                        break;
                    }
                    i2++;
                } else if (R0.length() <= 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public static qh5 j(long j2, String str) {
        xf4 a;
        String str2;
        boolean z;
        jh5 jh5;
        Double d2;
        Double d3;
        double d4;
        long j3;
        double d5;
        double doubleValue;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        Double d6 = null;
        if (!(!d57.x0(str6, "ha comprado", true) || (a = k26.a(h36.c, str6)) == null || (str2 = (String) ((vf4) a.a()).get(1)) == null)) {
            String obj = d57.k1(d57.l1(d57.k1(d57.g1(d57.g1(str2, " valido"), ", se activara")).toString(), 'x')).toString();
            String lowerCase = obj.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (d57.x0(lowerCase, "gb", false) || d57.x0(lowerCase, "mb", false)) {
                z = true;
            } else {
                z = false;
            }
            boolean x0 = d57.x0(lowerCase, "min", false);
            boolean x02 = d57.x0(lowerCase, "sms", false);
            if (z && (x0 || x02)) {
                jh5 = jh5.w;
            } else if (z) {
                jh5 = jh5.z;
            } else if (x0) {
                jh5 = jh5.x;
            } else if (x02) {
                jh5 = jh5.y;
            }
            jh5 jh52 = jh5;
            xf4 a2 = k26.a(h36.d, str6);
            if (a2 == null || (str5 = (String) ((vf4) a2.a()).get(1)) == null) {
                d2 = null;
            } else {
                d2 = j57.i0(k57.s0(str5, ",", ""));
            }
            xf4 a3 = k26.a(h36.e, str6);
            if (a3 == null || (str4 = (String) ((vf4) a3.a()).get(1)) == null) {
                d3 = null;
            } else {
                d3 = j57.i0(k57.s0(str4, ",", ""));
            }
            xf4 a4 = k26.a(h36.f, str6);
            if (!(a4 == null || (str3 = (String) ((vf4) a4.a()).get(1)) == null)) {
                d6 = j57.i0(k57.s0(str3, ",", ""));
            }
            if (d2 != null) {
                d4 = d2.doubleValue();
            } else if (d6 != null) {
                d4 = d6.doubleValue();
            } else {
                d4 = 0.0d;
            }
            double d7 = d4;
            if (d3 != null) {
                doubleValue = d3.doubleValue();
            } else if (d6 != null) {
                doubleValue = d6.doubleValue();
            } else {
                j3 = j2;
                d5 = d7;
                return new qh5(jh52, obj, d7, d5, j3);
            }
            j3 = j2;
            d5 = doubleValue;
            return new qh5(jh52, obj, d7, d5, j3);
        }
        return null;
    }

    public static pl7 k(long j2, String str) {
        String str2 = str;
        xf4 a = k26.a(h36.a, str2);
        if (a != null) {
            String str3 = (String) ((vf4) a.a()).get(1);
            String str4 = (String) ((vf4) a.a()).get(5);
            return new pl7(f21.h("Recibido: ", str3, " CUP"), b81.n(str3, " CUP"), h36.b(j2), pb4.m("De ", (String) ((vf4) a.a()).get(2), " | Saldo: ", (String) ((vf4) a.a()).get(3), " CUP"), true, j2);
        }
        xf4 a2 = k26.a(h36.b, str2);
        if (a2 == null) {
            return null;
        }
        String str5 = (String) ((vf4) a2.a()).get(1);
        String str6 = (String) ((vf4) a2.a()).get(5);
        return new pl7(f21.h("Transferido: ", str5, " CUP"), b81.n(str5, " CUP"), h36.b(j2), pb4.m("A ", (String) ((vf4) a2.a()).get(2), " | Saldo: ", (String) ((vf4) a2.a()).get(3), " CUP"), false, j2);
    }

    public final e36 e(Long l, Long l2) {
        Long l3;
        double d2;
        double d3;
        double d4;
        if (l2 != null) {
            l3 = Long.valueOf(l2.longValue() + 86399999);
        } else {
            l3 = null;
        }
        List list = this.h;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            long j2 = ((qh5) next).e;
            if ((l == null || j2 >= l.longValue()) && (l3 == null || j2 <= l3.longValue())) {
                arrayList.add(next);
            }
        }
        w52 w52 = jh5.B;
        ArrayList arrayList2 = new ArrayList(et0.e0(w52, 10));
        e2 e2Var = new e2(0, w52);
        while (true) {
            d2 = 0.0d;
            if (!e2Var.hasNext()) {
                break;
            }
            jh5 jh5 = (jh5) e2Var.next();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (((qh5) next2).a == jh5) {
                    arrayList3.add(next2);
                }
            }
            int size = arrayList3.size();
            Iterator it2 = arrayList3.iterator();
            double d5 = 0.0d;
            while (it2.hasNext()) {
                d5 += ((qh5) it2.next()).c;
            }
            String a = h36.a(d5);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                d2 += ((qh5) it3.next()).d;
            }
            arrayList2.add(new rh5(jh5, size, a, h36.a(d2)));
        }
        List list2 = this.i;
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : list2) {
            long j3 = ((pl7) next3).f;
            if ((l == null || j3 >= l.longValue()) && (l3 == null || j3 <= l3.longValue())) {
                arrayList4.add(next3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next4 = it4.next();
            if (!((pl7) next4).e) {
                arrayList5.add(next4);
            }
        }
        Iterator it5 = arrayList5.iterator();
        double d6 = 0.0d;
        while (it5.hasNext()) {
            Double i0 = j57.i0(d57.g1(((pl7) it5.next()).b, " CUP"));
            if (i0 != null) {
                d4 = i0.doubleValue();
            } else {
                d4 = 0.0d;
            }
            d6 += d4;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            Object next5 = it6.next();
            if (((pl7) next5).e) {
                arrayList6.add(next5);
            }
        }
        Iterator it7 = arrayList6.iterator();
        double d7 = 0.0d;
        while (it7.hasNext()) {
            Double i02 = j57.i0(d57.g1(((pl7) it7.next()).b, " CUP"));
            if (i02 != null) {
                d3 = i02.doubleValue();
            } else {
                d3 = 0.0d;
            }
            d7 += d3;
        }
        double size2 = ((double) arrayList5.size()) * 5.0d;
        String a2 = h36.a(d7);
        String a3 = h36.a(d6);
        String a4 = h36.a(size2);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            d2 += ((qh5) it8.next()).d;
        }
        return new e36(arrayList2, a2, a3, a4, h36.a(d2 + size2));
    }

    public final ArrayList g(Long l, Long l2) {
        Long l3;
        if (l2 != null) {
            l3 = Long.valueOf(l2.longValue() + 86399999);
        } else {
            l3 = null;
        }
        List list = this.i;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            pl7 pl7 = (pl7) next;
            if ((l == null || pl7.f >= l.longValue()) && (l3 == null || pl7.f <= l3.longValue())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final f41 l(String str) {
        f41 f41;
        Object obj;
        Throwable th;
        if (d57.I0(str)) {
            return new f41((String) null, (String) null);
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        f41 f412 = (f41) concurrentHashMap.get(str);
        if (f412 != null) {
            return f412;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            concurrentHashMap.put(str, new f41((String) null, (String) null));
            return new f41((String) null, (String) null);
        }
        Context context = this.b;
        if (sg3.A(context, "android.permission.READ_CONTACTS")) {
            try {
                n74 m = sg3.m();
                m.add(str);
                m.add(sb2);
                String j1 = d57.j1(sb2);
                if (j1.length() == 8) {
                    m.add(j1);
                    m.add("+53" + j1);
                    m.add("0053" + j1);
                    m.add("53" + j1);
                }
                ListIterator listIterator = sg3.i(m).listIterator(0);
                while (true) {
                    d03 d03 = (d03) listIterator;
                    if (!d03.hasNext()) {
                        obj = null;
                        break;
                    }
                    Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode((String) d03.next())), new String[]{"display_name", "photo_uri"}, (String) null, (String[]) null, (String) null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                obj = new f41(query.getString(0), query.getString(1));
                            } else {
                                obj = null;
                            }
                            query.close();
                            continue;
                        } catch (Throwable th2) {
                            ed1.i(query, th);
                            throw th2;
                        }
                    } else {
                        obj = null;
                        continue;
                    }
                    if (obj != null) {
                        break;
                    }
                }
            } catch (Throwable th3) {
                obj = new m66(th3);
            }
            if (obj instanceof m66) {
                obj = null;
            }
            f41 = (f41) obj;
            if (f41 == null) {
                f41 = new f41((String) null, (String) null);
            }
        } else {
            f41 = new f41((String) null, (String) null);
        }
        concurrentHashMap.put(str, f41);
        return f41;
    }
}
