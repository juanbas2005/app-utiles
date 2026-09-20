package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: a87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a87 implements x77, Serializable {
    public final Object w;

    public a87(Object obj) {
        this.w = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a87) {
            return a35.h(this.w, ((a87) obj).w);
        }
        return false;
    }

    public final Object get() {
        return this.w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.w);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
