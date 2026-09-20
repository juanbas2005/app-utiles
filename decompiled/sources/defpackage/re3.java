package defpackage;

/* renamed from: re3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class re3 extends pe3 {
    public static final re3 z = new pe3(1, 0, 1);

    public final boolean equals(Object obj) {
        if (!(obj instanceof re3)) {
            return false;
        }
        if (isEmpty() && ((re3) obj).isEmpty()) {
            return true;
        }
        re3 re3 = (re3) obj;
        if (this.w == re3.w && this.x == re3.x) {
            return true;
        }
        return false;
    }

    public final boolean f(int i) {
        if (this.w > i || i > this.x) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.w * 31) + this.x;
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
