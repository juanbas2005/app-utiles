package defpackage;

/* renamed from: bs7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bs7 implements Comparable {
    public final short w;

    public /* synthetic */ bs7(short s) {
        this.w = s;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return sg3.k(this.w & 65535, ((bs7) obj).w & 65535);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof bs7) && this.w == ((bs7) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.w);
    }

    public final String toString() {
        return String.valueOf(this.w & 65535);
    }
}
