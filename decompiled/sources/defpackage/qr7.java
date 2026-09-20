package defpackage;

/* renamed from: qr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qr7 implements Comparable {
    public final long w;

    public /* synthetic */ qr7(long j) {
        this.w = j;
    }

    public final int compareTo(Object obj) {
        return sg3.l(this.w ^ Long.MIN_VALUE, ((qr7) obj).w ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qr7)) {
            return false;
        }
        if (this.w != ((qr7) obj).w) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.w);
    }

    public final String toString() {
        return z65.U(this.w, 10);
    }
}
