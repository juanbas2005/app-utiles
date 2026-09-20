package defpackage;

import java.io.Serializable;

/* renamed from: o66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o66 implements Serializable {
    public final Object w;

    public /* synthetic */ o66(Object obj) {
        this.w = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof m66) {
            return ((m66) obj).w;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o66)) {
            return false;
        }
        if (!sg3.e(this.w, ((o66) obj).w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.w;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.w;
        if (obj instanceof m66) {
            return ((m66) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
