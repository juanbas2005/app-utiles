package defpackage;

/* renamed from: wu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wu6 {
    public final long a;

    public /* synthetic */ wu6(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean e(long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (j == 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        if (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f) {
            z3 = true;
        }
        return z4 | z3;
    }

    public static String f(long j) {
        if (j != 9205357640488583168L) {
            return pb4.m("Size(", gr8.Y(Float.intBitsToFloat((int) (j >> 32))), ", ", gr8.Y(Float.intBitsToFloat((int) (j & 4294967295L))), ")");
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wu6)) {
            return false;
        }
        if (this.a != ((wu6) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f(this.a);
    }
}
