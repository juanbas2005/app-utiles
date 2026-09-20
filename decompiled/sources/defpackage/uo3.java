package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: uo3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uo3 implements vq4 {
    public static final List d;
    public final String[] a;
    public final Set b;
    public final ArrayList c;

    static {
        String E0 = dt0.E0(sg3.E('k', 'o', 't', 'l', 'i', 'n'), "", (String) null, (String) null, (vr2) null, 62);
        List E = sg3.E(E0.concat("/Any"), E0.concat("/Nothing"), E0.concat("/Unit"), E0.concat("/Throwable"), E0.concat("/Number"), E0.concat("/Byte"), E0.concat("/Double"), E0.concat("/Float"), E0.concat("/Int"), E0.concat("/Long"), E0.concat("/Short"), E0.concat("/Boolean"), E0.concat("/Char"), E0.concat("/CharSequence"), E0.concat("/String"), E0.concat("/Comparable"), E0.concat("/Enum"), E0.concat("/Array"), E0.concat("/ByteArray"), E0.concat("/DoubleArray"), E0.concat("/FloatArray"), E0.concat("/IntArray"), E0.concat("/LongArray"), E0.concat("/ShortArray"), E0.concat("/BooleanArray"), E0.concat("/CharArray"), E0.concat("/Cloneable"), E0.concat("/Annotation"), E0.concat("/collections/Iterable"), E0.concat("/collections/MutableIterable"), E0.concat("/collections/Collection"), E0.concat("/collections/MutableCollection"), E0.concat("/collections/List"), E0.concat("/collections/MutableList"), E0.concat("/collections/Set"), E0.concat("/collections/MutableSet"), E0.concat("/collections/Map"), E0.concat("/collections/MutableMap"), E0.concat("/collections/Map.Entry"), E0.concat("/collections/MutableMap.MutableEntry"), E0.concat("/collections/Iterator"), E0.concat("/collections/MutableIterator"), E0.concat("/collections/ListIterator"), E0.concat("/collections/MutableListIterator"));
        d = E;
        ss h1 = dt0.h1(E);
        int F = tf4.F(et0.e0(h1, 10));
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F);
        Iterator it = h1.iterator();
        while (true) {
            f02 f02 = (f02) it;
            if (f02.x.hasNext()) {
                ka3 ka3 = (ka3) f02.next();
                linkedHashMap.put((String) ka3.b, Integer.valueOf(ka3.a));
            } else {
                return;
            }
        }
    }

    public uo3(pp3 pp3, String[] strArr) {
        Set set;
        strArr.getClass();
        List list = pp3.y;
        if (list.isEmpty()) {
            set = g42.w;
        } else {
            set = dt0.g1(list);
        }
        List<op3> list2 = pp3.x;
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (op3 op3 : list2) {
            int i = op3.y;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(op3);
            }
        }
        arrayList.trimToSize();
        this.a = strArr;
        this.b = set;
        this.c = arrayList;
    }

    public final String a(int i) {
        return getString(i);
    }

    public final boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    public final String getString(int i) {
        String str;
        op3 op3 = (op3) this.c.get(i);
        int i2 = op3.x;
        if ((i2 & 4) == 4) {
            Object obj = op3.A;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                bg0 bg0 = (bg0) obj;
                String z = bg0.z();
                if (bg0.o()) {
                    op3.A = z;
                }
                str = z;
            }
        } else {
            if ((i2 & 2) == 2) {
                List list = d;
                int size = list.size();
                int i3 = op3.z;
                if (i3 >= 0 && i3 < size) {
                    str = (String) list.get(i3);
                }
            }
            str = this.a[i];
        }
        if (op3.C.size() >= 2) {
            List list2 = op3.C;
            list2.getClass();
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= str.length()) {
                str = str.substring(num.intValue(), num2.intValue());
            }
        }
        if (op3.E.size() >= 2) {
            List list3 = op3.E;
            list3.getClass();
            str.getClass();
            str = str.replace((char) ((Integer) list3.get(0)).intValue(), (char) ((Integer) list3.get(1)).intValue());
            str.getClass();
        }
        np3 np3 = op3.B;
        if (np3 == null) {
            np3 = np3.x;
        }
        int ordinal = np3.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str.getClass();
                str = str.replace('$', '.');
                str.getClass();
            } else if (ordinal == 2) {
                if (str.length() >= 2) {
                    str = str.substring(1, str.length() - 1);
                }
                str = str.replace('$', '.');
                str.getClass();
            } else {
                h.c();
                return null;
            }
        }
        str.getClass();
        return str;
    }
}
