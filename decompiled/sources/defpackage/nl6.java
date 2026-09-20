package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: nl6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nl6 implements ll6, nh0 {
    public final String a;
    public final n85 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final ll6[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final ll6[] k;
    public final z97 l;

    public nl6(String str, n85 n85, int i2, List list, nq0 nq0) {
        this.a = str;
        this.b = n85;
        this.c = i2;
        this.d = nq0.b;
        ArrayList arrayList = nq0.c;
        arrayList.getClass();
        HashSet hashSet = new HashSet(tf4.F(et0.e0(arrayList, 12)));
        dt0.Y0(arrayList, hashSet);
        this.e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = uq3.m(nq0.e);
        this.h = (List[]) nq0.f.toArray(new List[0]);
        this.i = dt0.X0(nq0.g);
        strArr.getClass();
        ss ssVar = new ss(1, new zh(2, (Object) strArr));
        ArrayList arrayList2 = new ArrayList(et0.e0(ssVar, 10));
        Iterator it = ssVar.iterator();
        while (true) {
            f02 f02 = (f02) it;
            if (f02.x.hasNext()) {
                ka3 ka3 = (ka3) f02.next();
                arrayList2.add(new yb5(ka3.b, Integer.valueOf(ka3.a)));
            } else {
                this.j = sf4.a0(arrayList2);
                this.k = uq3.m(list);
                this.l = new z97(new hx4(22, this));
                return;
            }
        }
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.e;
    }

    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof nl6) {
            ll6 ll6 = (ll6) obj;
            if (this.a.equals(ll6.a()) && Arrays.equals(this.k, ((nl6) obj).k) && (i2 = this.c) == ll6.e()) {
                int i3 = 0;
                while (i3 < i2) {
                    ll6[] ll6Arr = this.g;
                    if (sg3.e(ll6Arr[i3].a(), ll6.h(i3).a()) && sg3.e(ll6Arr[i3].u(), ll6.h(i3).u())) {
                        i3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String f(int i2) {
        return this.f[i2];
    }

    public final List g(int i2) {
        return this.h[i2];
    }

    public final List getAnnotations() {
        return this.d;
    }

    public final ll6 h(int i2) {
        return this.g[i2];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    public final boolean i(int i2) {
        return this.i[i2];
    }

    public final String toString() {
        return fb5.v(this);
    }

    public final n85 u() {
        return this.b;
    }
}
