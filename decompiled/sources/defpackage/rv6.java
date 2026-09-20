package defpackage;

import java.util.Map;

/* renamed from: rv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rv6 implements Map.Entry, Comparable {
    public final Comparable w;
    public Object x;
    public final /* synthetic */ nv6 y;

    public rv6(nv6 nv6, Comparable comparable, Object obj) {
        this.y = nv6;
        this.w = comparable;
        this.x = obj;
    }

    public final int compareTo(Object obj) {
        return this.w.compareTo(((rv6) obj).w);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.w;
                if (comparable != null) {
                    z = comparable.equals(key);
                } else if (key == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Object obj2 = this.x;
                    Object value = entry.getValue();
                    if (obj2 != null) {
                        z2 = obj2.equals(value);
                    } else if (value == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.w;
    }

    public final Object getValue() {
        return this.x;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Comparable comparable = this.w;
        if (comparable == null) {
            i = 0;
        } else {
            i = comparable.hashCode();
        }
        Object obj = this.x;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        this.y.b();
        Object obj2 = this.x;
        this.x = obj;
        return obj2;
    }

    public final String toString() {
        return this.w + "=" + this.x;
    }
}
