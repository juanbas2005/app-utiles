package defpackage;

/* renamed from: cg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cg7 {
    public final bg7 a;
    public dy3 b = null;
    public dy3 c;

    public cg7(bg7 bg7, dy3 dy3) {
        this.a = bg7;
        this.c = dy3;
    }

    public final long a(long j) {
        ly5 ly5;
        dy3 dy3 = this.b;
        ly5 ly52 = ly5.e;
        if (dy3 != null) {
            if (dy3.n()) {
                dy3 dy32 = this.c;
                if (dy32 != null) {
                    ly5 = dy32.Q(dy3, true);
                } else {
                    ly5 = null;
                }
            } else {
                ly5 = ly52;
            }
            if (ly5 != null) {
                ly52 = ly5;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = ly52.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = ly52.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = ly52.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = ly52.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public final int b(boolean z, long j) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        bg7 bg7 = this.a;
        int e = bg7.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        if (Float.intBitsToFloat(i) < bg7.e(e) || Float.intBitsToFloat(i) > bg7.f(e)) {
            return false;
        }
        return true;
    }

    public final long d(long j) {
        dy3 dy3;
        dy3 dy32 = this.b;
        if (dy32 != null) {
            dy3 dy33 = null;
            if (!dy32.n()) {
                dy32 = null;
            }
            if (!(dy32 == null || (dy3 = this.c) == null)) {
                if (dy3.n()) {
                    dy33 = dy3;
                }
                if (dy33 != null) {
                    return dy32.M(dy33, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        dy3 dy3;
        dy3 dy32 = this.b;
        if (dy32 != null) {
            dy3 dy33 = null;
            if (!dy32.n()) {
                dy32 = null;
            }
            if (!(dy32 == null || (dy3 = this.c) == null)) {
                if (dy3.n()) {
                    dy33 = dy3;
                }
                if (dy33 != null) {
                    return dy33.M(dy32, j);
                }
            }
        }
        return j;
    }
}
