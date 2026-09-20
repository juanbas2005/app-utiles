package defpackage;

/* renamed from: wg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wg7 {
    public static final xg7[] b = {new xg7(0), new xg7(4294967296L), new xg7(8589934592L)};
    public static final long c = ya5.m(Float.NaN, 0);
    public final long a;

    public /* synthetic */ wg7(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (xg7.a(b2, 0)) {
            return "Unspecified";
        }
        if (xg7.a(b2, 4294967296L)) {
            float c2 = c(j);
            return c2 + ".sp";
        } else if (!xg7.a(b2, 8589934592L)) {
            return "Invalid";
        } else {
            float c3 = c(j);
            return c3 + ".em";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wg7)) {
            return false;
        }
        if (this.a != ((wg7) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
