package defpackage;

import java.util.HashMap;

/* renamed from: wi8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wi8 {
    public static final s93 d = s93.s(3, "_syn", "_err", "_el");
    public String a;
    public final long b;
    public final HashMap c;

    public wi8(String str, long j, HashMap hashMap) {
        this.a = str;
        this.b = j;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: a */
    public final wi8 clone() {
        return new wi8(this.a, this.b, new HashMap(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi8)) {
            return false;
        }
        wi8 wi8 = (wi8) obj;
        if (this.b == wi8.b && this.a.equals(wi8.a)) {
            return this.c.equals(wi8.c);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return this.c.hashCode() + (((this.a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        String obj = this.c.toString();
        int length = String.valueOf(str).length();
        long j = this.b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
