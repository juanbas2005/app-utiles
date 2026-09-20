package defpackage;

/* renamed from: ox1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ox1 {
    public final long a;

    public /* synthetic */ ox1(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ox1)) {
            return false;
        }
        if (this.a != ((ox1) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j != 9205357640488583168L) {
            return pb4.m("(", lx1.c(a(j)), ", ", lx1.c(b(j)), ")");
        }
        return "DpOffset.Unspecified";
    }
}
