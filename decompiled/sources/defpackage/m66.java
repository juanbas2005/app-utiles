package defpackage;

import java.io.Serializable;

/* renamed from: m66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m66 implements Serializable {
    public final Throwable w;

    public m66(Throwable th) {
        th.getClass();
        this.w = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m66)) {
            return false;
        }
        if (sg3.e(this.w, ((m66) obj).w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.w + ')';
    }
}
