package defpackage;

import java.util.Map;

/* renamed from: tb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tb2 implements Map.Entry, ar3 {
    public boolean A;
    public final Object w;
    public final v54 x;
    public tb2 y;
    public tb2 z;

    public tb2(s54 s54, v54 v54) {
        this.w = s54;
        this.x = v54;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tb2) {
            tb2 tb2 = (tb2) obj;
            if (sg3.e(this.w, tb2.w) && this.x == tb2.x) {
                return true;
            }
            return false;
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
        Object obj = this.w;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return this.x.hashCode() + (i * 31);
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.w + ", value=" + this.x + ")";
    }
}
