package defpackage;

/* renamed from: vz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vz5 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ Object y;

    public /* synthetic */ vz5(int i, long j, Object obj) {
        this.w = i;
        this.x = j;
        this.y = obj;
    }

    public final Object y(Object obj) {
        long j;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj2 = this.y;
        switch (i) {
            case b85.b:
                hz1 hz1 = (hz1) obj;
                hz1.getClass();
                float e0 = hz1.e0(22.0f);
                float intBitsToFloat = (Float.intBitsToFloat((int) (hz1.e() >> 32)) / 2.0f) - (hz1.e0(18.0f) + e0);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (hz1.e() >> 32)) / 2.0f;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (hz1.e() & 4294967295L));
                long floatToRawIntBits = (((long) Float.floatToRawIntBits(intBitsToFloat2 - intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat3 - intBitsToFloat)) & 4294967295L);
                float f = 2.0f * intBitsToFloat;
                long floatToRawIntBits2 = (long) Float.floatToRawIntBits(f);
                a37 a37 = (a37) obj2;
                float f2 = e0;
                long j2 = floatToRawIntBits;
                long floatToRawIntBits3 = (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (floatToRawIntBits2 << 32);
                hz1.i(xz5.x(uq3.d(4293784311L), uq3.d(4280432202L)), 180.0f, 180.0f, j2, floatToRawIntBits3, new l57(e0, 0.0f, 1, 0, 26));
                float f3 = intBitsToFloat;
                vs7 vs72 = vs7;
                long j3 = j2;
                for (yb5 yb5 : sg3.E(new yb5(new jt0(xz5.v()), Float.valueOf(0.0f)), new yb5(new jt0(xz5.x(uq3.d(4279974492L), uq3.d(4288329942L))), Float.valueOf(45.0f)), new yb5(new jt0(xz5.x(uq3.d(4282219166L), uq3.d(4285510102L))), Float.valueOf(90.0f)), new yb5(new jt0(xz5.x(uq3.d(4281298912L), uq3.d(4286360048L))), Float.valueOf(135.0f)))) {
                    long j4 = ((jt0) yb5.w).a;
                    float floatValue = ((Number) yb5.x).floatValue();
                    long b = jt0.b(0.22f, j4);
                    hz1.i(b, floatValue + 180.0f, 44.0f, j3, floatToRawIntBits3, new l57(f2, 0.0f, 0, 0, 26));
                }
                int i2 = (((Number) a37.getValue()).floatValue() > 0.005f ? 1 : (((Number) a37.getValue()).floatValue() == 0.005f ? 0 : -1));
                long j5 = this.x;
                if (i2 > 0) {
                    j = j5;
                    long j6 = j;
                    hz1.i(j6, 180.0f, ((Number) a37.getValue()).floatValue() * 180.0f, j3, floatToRawIntBits3, new l57(f2, 0.0f, 1, 0, 26));
                } else {
                    j = j5;
                }
                double radians = Math.toRadians((((double) ((Number) a37.getValue()).floatValue()) * 180.0d) + 180.0d);
                float e02 = f3 - hz1.e0(6.0f);
                float cos = (((float) Math.cos(radians)) * e02) + intBitsToFloat2;
                float sin = (e02 * ((float) Math.sin(radians))) + intBitsToFloat3;
                hz1.q0(hz1, jt0.b(0.25f, j), (((long) Float.floatToRawIntBits(intBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat2)) << 32), (((long) Float.floatToRawIntBits(sin)) & 4294967295L) | (((long) Float.floatToRawIntBits(cos)) << 32), hz1.e0(8.0f), 1, 480);
                hz1.q0(hz1, xz5.w(), (((long) Float.floatToRawIntBits(intBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat2)) << 32), (((long) Float.floatToRawIntBits(sin)) & 4294967295L) | (((long) Float.floatToRawIntBits(cos)) << 32), hz1.e0(2.5f), 1, 480);
                long x2 = xz5.x(uq3.d(4293784311L), uq3.d(4280432202L));
                float e03 = hz1.e0(10.0f);
                long floatToRawIntBits4 = (long) Float.floatToRawIntBits(intBitsToFloat2);
                hz1.k0(hz1, x2, e03, (((long) Float.floatToRawIntBits(intBitsToFloat3)) & 4294967295L) | (floatToRawIntBits4 << 32), (iz1) null, 120);
                hz1.k0(hz1, j, hz1.e0(7.0f), (((long) Float.floatToRawIntBits(intBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat3)) & 4294967295L), (iz1) null, 120);
                hz1.k0(hz1, jt0.c, hz1.e0(3.5f), (((long) Float.floatToRawIntBits(intBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat3)) & 4294967295L), (iz1) null, 120);
                return vs72;
            default:
                hz1.f0((hz1) obj, this.x, 0, 0, z65.o(((Number) ((sr2) obj2).b()).floatValue(), 0.0f, 1.0f), 118);
                return vs7;
        }
    }
}
