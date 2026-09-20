package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: ro8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ro8 implements bq8, qp8 {
    public final String w;
    public final HashMap x = new HashMap();

    public ro8(String str) {
        this.w = str;
    }

    public abstract bq8 a(no7 no7, List list);

    public final Iterator d() {
        return new kp8(this.x.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro8)) {
            return false;
        }
        ro8 ro8 = (ro8) obj;
        String str = this.w;
        if (str != null) {
            return str.equals(ro8.w);
        }
        return false;
    }

    public final Boolean f() {
        return Boolean.TRUE;
    }

    public final String g() {
        return this.w;
    }

    public final int hashCode() {
        String str = this.w;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final bq8 k(String str, no7 no7, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new mq8(this.w);
        }
        return qp8.n(this, new mq8(str), no7, arrayList);
    }

    public final bq8 l(String str) {
        HashMap hashMap = this.x;
        if (hashMap.containsKey(str)) {
            return (bq8) hashMap.get(str);
        }
        return bq8.o;
    }

    public final void o(String str, bq8 bq8) {
        HashMap hashMap = this.x;
        if (bq8 == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, bq8);
        }
    }

    public final Double p() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean s(String str) {
        return this.x.containsKey(str);
    }

    public bq8 v() {
        return this;
    }
}
