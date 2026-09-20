package defpackage;

/* renamed from: ec3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ec3 {
    public static final long a = a(Float.NaN, Float.NaN);
    public static final /* synthetic */ int b = 0;

    public static long a(float f, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static String b(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return "InlineDensity(density=" + intBitsToFloat + ", fontScale=" + intBitsToFloat2 + ")";
    }
}
