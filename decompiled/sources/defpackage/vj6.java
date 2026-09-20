package defpackage;

/* renamed from: vj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vj6 {
    public static final nk6 a = new nk6("SelectionHandleInfo");

    public static final long a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32);
    }
}
