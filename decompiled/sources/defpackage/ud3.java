package defpackage;

/* renamed from: ud3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ud3 implements vd3 {
    public final int w;
    public final long x;

    public /* synthetic */ ud3(long j, int i) {
        this.x = j;
        this.w = i;
    }

    public static ud3 a(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (charAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new ud3(j, i3);
    }

    public qd3 toInstant() {
        qd3 qd3 = qd3.y;
        long j = qd3.y.w;
        long j2 = this.x;
        if (j2 >= j && j2 <= qd3.z.w) {
            return tz2.i(j2, (long) this.w);
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
