package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: vp8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class vp8 implements bq8, qp8 {
    public final HashMap w = new HashMap();

    public final Iterator d() {
        return new kp8(this.w.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp8)) {
            return false;
        }
        return this.w.equals(((vp8) obj).w);
    }

    public final Boolean f() {
        return Boolean.TRUE;
    }

    public final String g() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public bq8 k(String str, no7 no7, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new mq8(toString());
        }
        return qp8.n(this, new mq8(str), no7, arrayList);
    }

    public final bq8 l(String str) {
        HashMap hashMap = this.w;
        if (hashMap.containsKey(str)) {
            return (bq8) hashMap.get(str);
        }
        return bq8.o;
    }

    public final void o(String str, bq8 bq8) {
        HashMap hashMap = this.w;
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
        return this.w.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.w;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, hashMap.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final bq8 v() {
        vp8 vp8 = new vp8();
        for (Map.Entry entry : this.w.entrySet()) {
            boolean z = entry.getValue() instanceof qp8;
            HashMap hashMap = vp8.w;
            if (z) {
                hashMap.put((String) entry.getKey(), (bq8) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((bq8) entry.getValue()).v());
            }
        }
        return vp8;
    }
}
