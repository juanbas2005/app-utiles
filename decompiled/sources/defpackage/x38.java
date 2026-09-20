package defpackage;

/* renamed from: x38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x38 {
    public final long a;

    public /* synthetic */ x38(long j) {
        this.a = j;
    }

    public static long a(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long d(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final long e(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + intBitsToFloat);
        return (((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final long f(float f, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f);
        return (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static String g(long j) {
        float b = b(j);
        float c = c(j);
        return "(" + b + ", " + c + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x38)) {
            return false;
        }
        if (this.a != ((x38) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
