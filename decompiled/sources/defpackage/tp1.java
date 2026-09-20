package defpackage;

/* renamed from: tp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface tp1 {
    long A0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return (((long) Float.floatToRawIntBits(e0(px1.b(j)))) << 32) | (((long) Float.floatToRawIntBits(e0(px1.a(j)))) & 4294967295L);
    }

    float C0(long j) {
        if (!xg7.a(wg7.b(j), 4294967296L)) {
            ac3.b("Only Sp can convert to Px");
        }
        return e0(z(j));
    }

    long L(float f) {
        return o(S(f));
    }

    float P(int i) {
        return ((float) i) / b();
    }

    float S(float f) {
        return f / b();
    }

    float Y();

    float b();

    float e0(float f) {
        return b() * f;
    }

    int l0(long j) {
        return Math.round(C0(j));
    }

    long o(float f) {
        float f2;
        float[] fArr = wl2.a;
        if (Y() < 1.03f) {
            return ya5.m(f / Y(), 4294967296L);
        }
        vl2 a = wl2.a(Y());
        if (a != null) {
            f2 = a.a(f);
        } else {
            f2 = f / Y();
        }
        return ya5.m(f2, 4294967296L);
    }

    long p(long j) {
        if (j != 9205357640488583168L) {
            return pv8.c(S(Float.intBitsToFloat((int) (j >> 32))), S(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    int r0(float f) {
        float e0 = e0(f);
        if (Float.isInfinite(e0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(e0);
    }

    float z(long j) {
        if (!xg7.a(wg7.b(j), 4294967296L)) {
            ac3.b("Only Sp can convert to Px");
        }
        float[] fArr = wl2.a;
        if (Y() >= 1.03f) {
            vl2 a = wl2.a(Y());
            if (a != null) {
                return a.b(wg7.c(j));
            }
            return Y() * wg7.c(j);
        }
        return Y() * wg7.c(j);
    }
}
