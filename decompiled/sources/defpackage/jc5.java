package defpackage;

/* renamed from: jc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jc5 {
    public final zg a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public jc5(zg zgVar, int i, int i2, int i3, int i4, float f2, float f3) {
        this.a = zgVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f2;
        this.g = f3;
    }

    public final ly5 a(ly5 ly5) {
        return ly5.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(boolean z, long j) {
        if (z) {
            long j2 = lg7.b;
            if (lg7.b(j, j2)) {
                return j2;
            }
        }
        int i = lg7.c;
        int i2 = this.b;
        return i95.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final ly5 c(ly5 ly5) {
        return ly5.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-this.f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return z65.p(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jc5) {
            jc5 jc5 = (jc5) obj;
            if (this.a == jc5.a && this.b == jc5.b && this.c == jc5.c && this.d == jc5.d && this.e == jc5.e && Float.compare(this.f, jc5.f) == 0 && Float.compare(this.g, jc5.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + f21.d(this.f, f21.e(this.e, f21.e(this.d, f21.e(this.c, f21.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ")";
    }
}
