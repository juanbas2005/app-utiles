package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: rs8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rs8 extends lu8 implements Serializable {
    public final Comparator w;

    public rs8(Comparator comparator) {
        comparator.getClass();
        this.w = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.w.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rs8) {
            return this.w.equals(((rs8) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return this.w.toString();
    }
}
