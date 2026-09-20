package defpackage;

/* renamed from: ck7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ck7 implements sl5 {
    public final int w;
    public final long x;

    public ck7(long j, int i) {
        this.w = i;
        this.x = j;
    }

    public final long y(se3 se3, long j, ey3 ey3, long j2) {
        int i = (int) (j2 >> 32);
        int d = ((se3.d() - i) / 2) + se3.a;
        long j3 = this.x;
        int i2 = 0;
        if (d < 0) {
            int i3 = se3.a;
            int i4 = (i + i3) - ((int) (j3 >> 32));
            if (i4 >= 0) {
                i2 = i4;
            }
            d = i3 - i2;
        } else if (d + i > ((int) (j3 >> 32)) && (d = se3.c - i) < 0) {
            d = 0;
        }
        int i5 = this.w;
        int i6 = (se3.b - ((int) (j2 & 4294967295L))) - i5;
        if (i6 < 0) {
            i6 = se3.d + i5;
        }
        return (((long) d) << 32) | (((long) i6) & 4294967295L);
    }
}
