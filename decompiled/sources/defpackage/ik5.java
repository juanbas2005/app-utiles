package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ik5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ik5 implements ll6, nh0 {
    public final String a;
    public final av2 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final nz3 i;
    public final nz3 j;
    public final nz3 k;

    public ik5(String str, av2 av2, int i2) {
        this.a = str;
        this.b = av2;
        this.c = i2;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = b42.w;
        hk5 hk5 = new hk5(this, 0);
        i44 i44 = i44.w;
        this.i = rg3.y(i44, hk5);
        this.j = rg3.y(i44, new hk5(this, 1));
        this.k = rg3.y(i44, new hk5(this, 2));
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.h.keySet();
    }

    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ik5) {
            ll6 ll6 = (ll6) obj;
            if (this.a.equals(ll6.a()) && Arrays.equals((ll6[]) this.j.getValue(), (ll6[]) ((ik5) obj).j.getValue()) && (i2 = this.c) == ll6.e()) {
                int i3 = 0;
                while (i3 < i2) {
                    if (sg3.e(h(i3).a(), ll6.h(i3).a()) && sg3.e(h(i3).u(), ll6.h(i3).u())) {
                        i3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String f(int i2) {
        return this.e[i2];
    }

    public final List g(int i2) {
        List list = this.f[i2];
        if (list == null) {
            return a42.w;
        }
        return list;
    }

    public final List getAnnotations() {
        return a42.w;
    }

    public ll6 h(int i2) {
        return ((zr3[]) this.i.getValue())[i2].getDescriptor();
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    public final boolean i(int i2) {
        return this.g[i2];
    }

    public final void k(String str, boolean z) {
        str.getClass();
        int i2 = this.d + 1;
        this.d = i2;
        String[] strArr = this.e;
        strArr[i2] = str;
        this.g[i2] = z;
        this.f[i2] = null;
        if (i2 == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                hashMap.put(strArr[i3], Integer.valueOf(i3));
            }
            this.h = hashMap;
        }
    }

    public final void l(Annotation annotation) {
        annotation.getClass();
        int i2 = this.d;
        List[] listArr = this.f;
        List list = listArr[i2];
        if (list == null) {
            list = new ArrayList(1);
            listArr[this.d] = list;
        }
        list.add(annotation);
    }

    public String toString() {
        return fb5.v(this);
    }

    public n85 u() {
        return n57.l;
    }
}
