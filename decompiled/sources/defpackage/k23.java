package defpackage;

/* renamed from: k23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k23 {
    public final gs2 a;
    public final /* synthetic */ int b;

    public k23(int i, gs2 gs2) {
        this.b = i;
        this.a = gs2;
    }

    public final float a(float f, dy3 dy3, dy3 dy32) {
        switch (this.b) {
            case b85.b:
                long floatToRawIntBits = (long) Float.floatToRawIntBits(((float) ((int) (dy3.k() >> 32))) / 2.0f);
                return Float.intBitsToFloat((int) (dy32.M(dy3, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (floatToRawIntBits << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (dy32.M(dy3, (((long) Float.floatToRawIntBits(((float) ((int) (dy3.k() & 4294967295L))) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32)) >> 32));
        }
    }
}
