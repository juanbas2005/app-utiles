package defpackage;

/* renamed from: ly5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ly5 {
    public static final ly5 e = new ly5(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ly5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z4 = false;
        if (intBitsToFloat >= this.a) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (intBitsToFloat2 >= this.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (intBitsToFloat2 < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f3);
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final ly5 e(ly5 ly5) {
        return new ly5(Math.max(this.a, ly5.a), Math.max(this.b, ly5.b), Math.min(this.c, ly5.c), Math.min(this.d, ly5.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly5)) {
            return false;
        }
        ly5 ly5 = (ly5) obj;
        if (Float.compare(this.a, ly5.a) == 0 && Float.compare(this.b, ly5.b) == 0 && Float.compare(this.c, ly5.c) == 0 && Float.compare(this.d, ly5.d) == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z;
        boolean z2 = false;
        if (this.a >= this.c) {
            z = true;
        } else {
            z = false;
        }
        if (this.b >= this.d) {
            z2 = true;
        }
        return z | z2;
    }

    public final boolean g(ly5 ly5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.a < ly5.c) {
            z = true;
        } else {
            z = false;
        }
        if (ly5.a < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (this.b < ly5.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (ly5.b < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final ly5 h(float f, float f2) {
        return new ly5(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + f21.d(this.c, f21.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final ly5 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new ly5(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String Y = gr8.Y(this.a);
        String Y2 = gr8.Y(this.b);
        return pb4.n(f21.o("Rect.fromLTRB(", Y, ", ", Y2, ", "), gr8.Y(this.c), ", ", gr8.Y(this.d), ")");
    }
}
