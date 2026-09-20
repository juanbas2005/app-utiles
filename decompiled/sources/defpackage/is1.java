package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: is1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class is1 {
    public static final d63 c = new d63(26);
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final is1 m;
    public static final is1 n;
    public static final is1 o;
    public static final is1 p;
    public static final is1 q;
    public static final z97 r = new z97(x10.C);
    public static final z97 s = new z97(x10.D);
    public final List a;
    public final int b;

    static {
        int i2 = d;
        int i3 = i2 << 1;
        e = i2;
        int i4 = i2 << 2;
        f = i3;
        int i5 = i2 << 3;
        g = i4;
        int i6 = i2 << 4;
        h = i5;
        int i7 = i2 << 5;
        i = i6;
        j = i7;
        d = i2 << 7;
        int i8 = (i2 << 6) - 1;
        k = i8;
        int i9 = i2 | i3 | i4;
        l = i9;
        m = new is1(i8);
        n = new is1(i6 | i7);
        new is1(i2);
        new is1(i3);
        new is1(i4);
        o = new is1(i9);
        new is1(i5);
        p = new is1(i6);
        q = new is1(i7);
        new is1(i3 | i6 | i7);
    }

    public is1(int i2, List list) {
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((gs1) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        if ((this.b & i2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!is1.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        is1 is1 = (is1) obj;
        if (sg3.e(this.a, is1.a) && this.b == is1.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        Object obj;
        String str;
        String str2;
        Iterator it = ((List) r.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((hs1) obj).a == this.b) {
                break;
            }
        }
        hs1 hs1 = (hs1) obj;
        if (hs1 != null) {
            str = hs1.b;
        } else {
            str = null;
        }
        if (str == null) {
            ArrayList arrayList = new ArrayList();
            for (hs1 hs12 : (List) s.getValue()) {
                if (a(hs12.a)) {
                    str2 = hs12.b;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = dt0.E0(arrayList, " | ", (String) null, (String) null, (vr2) null, 62);
        }
        StringBuilder q2 = b81.q("DescriptorKindFilter(", str, ", ");
        q2.append(this.a);
        q2.append(')');
        return q2.toString();
    }

    public /* synthetic */ is1(int i2) {
        this(i2, a42.w);
    }
}
