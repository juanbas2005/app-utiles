package defpackage;

import java.util.Map;

/* renamed from: zm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zm8 implements Map.Entry, Comparable {
    public final Comparable w;
    public Object x;
    public final /* synthetic */ ym8 y;

    public zm8(ym8 ym8, Comparable comparable, Object obj) {
        this.y = ym8;
        this.w = comparable;
        this.x = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.w.compareTo(((zm8) obj).w);
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
                } else if (key != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    Object obj2 = this.x;
                    Object value = entry.getValue();
                    if (obj2 != null) {
                        z2 = obj2.equals(value);
                    } else if (value != null) {
                        z2 = false;
                    } else {
                        z2 = true;
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

    public final /* synthetic */ Object getKey() {
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
        this.y.g();
        Object obj2 = this.x;
        this.x = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.w);
        String valueOf2 = String.valueOf(this.x);
        return f21.m(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
