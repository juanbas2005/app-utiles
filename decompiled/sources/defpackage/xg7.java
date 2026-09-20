package defpackage;

/* renamed from: xg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xg7 {
    public final long a;

    public /* synthetic */ xg7(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static String b(long j) {
        if (a(j, 0)) {
            return "Unspecified";
        }
        if (a(j, 4294967296L)) {
            return "Sp";
        }
        if (a(j, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xg7)) {
            return false;
        }
        if (this.a != ((xg7) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
