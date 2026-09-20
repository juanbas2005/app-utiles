package defpackage;

/* renamed from: f80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f80 implements jb {
    public final float a;

    public f80(float f) {
        this.a = f;
    }

    public final long a(long j, long j2, ey3 ey3) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        int round = Math.round((1.0f + this.a) * (((float) ((int) (j3 >> 32))) / 2.0f));
        return (((long) Math.round((((float) ((int) (j3 & 4294967295L))) / 2.0f) * 0.0f)) & 4294967295L) | (((long) round) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f80) && Float.compare(this.a, ((f80) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
