package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: sm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sm1 implements tx4 {
    public final ob5 w;

    public sm1(ob5 ob5) {
        this.w = ob5;
    }

    public final Object A(long j, long j2, f61 f61) {
        return new x38(x38.a(j2, 0.0f, 0.0f, 1));
    }

    public final long X(long j, int i) {
        if (i != 1) {
            return 0;
        }
        ob5 ob5 = this.w;
        if (((double) Math.abs(ob5.l())) <= 1.0E-6d) {
            return 0;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0;
        }
        db5 m = ob5.m();
        float l = ob5.l() * ((float) ob5.o());
        float f = (((float) (m.b + m.c)) * (-Math.signum(ob5.l()))) + l;
        if (ob5.l() > 0.0f) {
            float f2 = l;
            l = f;
            f = f2;
        }
        hn1 hn1 = ob5.k;
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (long) Float.floatToRawIntBits(-hn1.e(-z65.o(Float.intBitsToFloat(i2), l, f)));
        return (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public final long n0(int i, long j, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
