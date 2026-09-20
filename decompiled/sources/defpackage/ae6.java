package defpackage;

import java.util.Map;

/* renamed from: ae6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ae6 implements Map.Entry {
    public final Object w;
    public final e94 x;
    public ae6 y;
    public ae6 z;

    public ae6(Object obj, e94 e94) {
        this.w = obj;
        this.x = e94;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ae6)) {
            return false;
        }
        ae6 ae6 = (ae6) obj;
        if (!this.w.equals(ae6.w) || !this.x.equals(ae6.x)) {
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
        return this.x.hashCode() ^ this.w.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.w + "=" + this.x;
    }
}
