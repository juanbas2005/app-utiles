package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: ms8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ms8 implements Serializable {
    public final Object w;

    public ms8(Object obj) {
        this.w = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ms8) {
            return u55.A(this.w, ((ms8) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w});
    }

    public final String toString() {
        return f21.h("Suppliers.ofInstance(", this.w.toString(), ")");
    }
}
