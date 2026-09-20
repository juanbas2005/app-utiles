package defpackage;

/* renamed from: qh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qh7 {
    public final yo4 a = new yo4();
    public ph7 b;
    public long c = -1;
    public long d = 0;
    public long e = 0;
    public long f;
    public float[] g;

    public qh7() {
        yo4 yo4 = ne3.a;
    }

    public static long a(ph7 ph7, long j, long j2, float[] fArr, long j3, long j4) {
        long j5 = j3;
        long j6 = j4;
        long j7 = ph7.c;
        if (j7 > 0) {
            long j8 = ph7.j;
            if (j8 > 0) {
                if (j5 - j8 < j7) {
                    return Math.min(j6, j8 + j7);
                }
                ph7.i = j5;
                ph7.j = -1;
                ph7.a(ph7.g, ph7.h, j, j2, fArr);
                return j6;
            }
        }
        return j6;
    }

    public final void b(ph7 ph7, long j, long j2, float[] fArr, long j3) {
        boolean z;
        boolean z2;
        ph7 ph72 = ph7;
        long j4 = j3;
        long j5 = ph72.i;
        long j6 = ph72.c;
        if (j4 - j5 > ph72.b || j5 == Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (j6 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ph72.j = j4;
        if (z && z2) {
            ph72.i = j4;
            ph72.a(ph72.g, ph72.h, j, j2, fArr);
        }
        if (!z2) {
            long j7 = this.c;
            long j8 = j4 + j6;
            if (j7 > 0 && j8 < j7) {
                this.c = j7;
            }
        }
    }

    public final boolean c(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (!oe3.a(j2, this.d)) {
            this.d = j2;
            z = true;
        } else {
            z = false;
        }
        if (!oe3.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
