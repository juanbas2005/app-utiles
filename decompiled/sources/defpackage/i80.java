package defpackage;

/* renamed from: i80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i80 implements jb {
    public final float a;
    public final float b;

    public i80(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final long a(long j, long j2, ey3 ey3) {
        float f = ((float) (((int) (j2 >> 32)) - ((int) (j >> 32)))) / 2.0f;
        float f2 = ((float) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) / 2.0f;
        ey3 ey32 = ey3.w;
        float f3 = this.a;
        if (ey3 != ey32) {
            f3 *= -1.0f;
        }
        int round = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round((1.0f + this.b) * f2)) & 4294967295L) | (((long) round) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i80)) {
            return false;
        }
        i80 i80 = (i80) obj;
        if (Float.compare(this.a, i80.a) == 0 && Float.compare(this.b, i80.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ")";
    }
}
