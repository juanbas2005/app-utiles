package defpackage;

/* renamed from: rh2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rh2 implements ih2 {
    public final int a;
    public final i12 b;
    public final long c;
    public final long d;

    public rh2(int i, int i2, i12 i12) {
        this.a = i;
        this.b = i12;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    public final float b(long j, float f, float f2, float f3) {
        long j2;
        long j3 = j - this.d;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.c;
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 == 0) {
            return f3;
        }
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        return (e(j2, f4, f5, f6) - e(j2 - 1000000, f4, f5, f6)) * 1000.0f;
    }

    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    public final float e(long j, float f, float f2, float f3) {
        float f4;
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        if (this.a == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) j2) / ((float) j3);
        }
        float b2 = this.b.b(f4);
        return (f2 * b2) + ((1.0f - b2) * f);
    }
}
