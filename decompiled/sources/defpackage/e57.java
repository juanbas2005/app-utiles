package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: e57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class e57 extends g75 {
    public static String e0(String str) {
        return cl6.T(new wl7(new ts(4, str), new cb("    ", 21)), "\n");
    }

    public static String f0(String str) {
        int i;
        Comparable comparable;
        int i2;
        String str2;
        List N0 = d57.N0(str);
        ArrayList arrayList = new ArrayList();
        for (Object next : N0) {
            if (!d57.I0((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (!rd3.C(str3.charAt(i))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                i = str3.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int length2 = str.length();
        N0.size();
        int size = N0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : N0) {
            int i3 = i + 1;
            if (i >= 0) {
                String str4 = (String) next2;
                if ((i == 0 || i == size) && d57.I0(str4)) {
                    str2 = null;
                } else {
                    str2 = d57.z0(i2, str4);
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i = i3;
            } else {
                sg3.Z();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        dt0.D0(arrayList3, sb, "\n", (String) null, (String) null, (vr2) null, 124);
        return sb.toString();
    }

    public static String g0(String str) {
        String str2;
        if (!d57.I0("|")) {
            List N0 = d57.N0(str);
            int length = str.length();
            N0.size();
            int size = N0.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object next : N0) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str3 = (String) next;
                    if ((i == 0 || i == size) && d57.I0(str3)) {
                        str3 = null;
                    } else {
                        int length2 = str3.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                i3 = -1;
                                break;
                            } else if (!rd3.C(str3.charAt(i3))) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 != -1 && k57.t0(i3, str3, "|", false)) {
                            str2 = str3.substring("|".length() + i3);
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str3 = str2;
                        }
                    }
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                    i = i2;
                } else {
                    sg3.Z();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            dt0.D0(arrayList, sb, "\n", (String) null, (String) null, (vr2) null, 124);
            return sb.toString();
        }
        h.q("marginPrefix must be non-blank string.");
        return null;
    }
}
