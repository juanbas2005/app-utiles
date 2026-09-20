package defpackage;

/* renamed from: lr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lr7 implements Comparable {
    public final int w;

    public /* synthetic */ lr7(int i) {
        this.w = i;
    }

    public final int compareTo(Object obj) {
        return sg3.k(this.w ^ Integer.MIN_VALUE, ((lr7) obj).w ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof lr7) && this.w == ((lr7) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.w);
    }

    public final String toString() {
        return String.valueOf(((long) this.w) & 4294967295L);
    }
}
