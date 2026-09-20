package defpackage;

import java.io.Serializable;

/* renamed from: su8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class su8 extends lu8 implements Serializable {
    public final lu8 w;

    public su8(lu8 lu8) {
        this.w = lu8;
    }

    public final lu8 a() {
        return this.w;
    }

    public final int compare(Object obj, Object obj2) {
        return this.w.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof su8) {
            return this.w.equals(((su8) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return -this.w.hashCode();
    }

    public final String toString() {
        return this.w.toString().concat(".reverse()");
    }
}
