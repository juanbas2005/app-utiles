package defpackage;

import java.util.Map;

/* renamed from: gf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gf4 implements Map.Entry, ar3 {
    public final Object w;
    public final Object x;

    public gf4(Object obj, Object obj2) {
        this.w = obj;
        this.x = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf4)) {
            return false;
        }
        gf4 gf4 = (gf4) obj;
        if (sg3.e(this.w, gf4.w) && sg3.e(this.x, gf4.x)) {
            return true;
        }
        return false;
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
        Object obj = this.w;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = i * 31;
        Object obj2 = this.x;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.w + ", value=" + this.x + ')';
    }
}
