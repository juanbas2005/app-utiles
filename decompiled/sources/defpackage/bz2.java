package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bz2 implements Iterable, ar3 {
    public static final bz2 x = new bz2(new String[0]);
    public final String[] w;

    public bz2(String[] strArr) {
        strArr.getClass();
        this.w = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bz2)) {
            return false;
        }
        if (Arrays.equals(this.w, ((bz2) obj).w)) {
            return true;
        }
        return false;
    }

    public final String f(String str) {
        String[] strArr = this.w;
        strArr.getClass();
        int length = strArr.length - 2;
        int m = wn6.m(length, 0, -2);
        if (m > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == m) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String g(int i) {
        String str = (String) qs.b1(i * 2, this.w);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w);
    }

    public final Iterator iterator() {
        int size = size();
        yb5[] yb5Arr = new yb5[size];
        for (int i = 0; i < size; i++) {
            yb5Arr[i] = new yb5(g(i), l(i));
        }
        return new e2((Object[]) yb5Arr);
    }

    public final zy2 k() {
        zy2 zy2 = new zy2();
        ArrayList arrayList = zy2.w;
        arrayList.getClass();
        String[] strArr = this.w;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return zy2;
    }

    public final String l(int i) {
        String str = (String) qs.b1((i * 2) + 1, this.w);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final List n(String str) {
        str.getClass();
        int size = size();
        List list = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(g(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(l(i));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        }
        if (list == null) {
            return a42.w;
        }
        return list;
    }

    public final int size() {
        return this.w.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String g = g(i);
            String l = l(i);
            sb.append(g);
            sb.append(": ");
            if (dg8.k(g)) {
                l = "██";
            }
            sb.append(l);
            sb.append("\n");
        }
        return sb.toString();
    }
}
