package defpackage;

/* renamed from: sc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sc4 extends qc4 {
    public final boolean equals(Object obj) {
        if (!(obj instanceof sc4)) {
            return false;
        }
        if (isEmpty() && ((sc4) obj).isEmpty()) {
            return true;
        }
        sc4 sc4 = (sc4) obj;
        if (this.w == sc4.w && this.x == sc4.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.x) + (Long.hashCode(this.w) * 31);
    }

    public final boolean isEmpty() {
        if (this.w > this.x) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.w + ".." + this.x;
    }
}
