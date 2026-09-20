package defpackage;

/* renamed from: l96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l96 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        p25.a(0.0f, 0.0f, 0.0f, 0.0f, 0);
    }

    public l96(float f2, float f3, float f4, float f5, long j, long j2, long j3, long j4) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l96)) {
            return false;
        }
        l96 l96 = (l96) obj;
        if (Float.compare(this.a, l96.a) == 0 && Float.compare(this.b, l96.b) == 0 && Float.compare(this.c, l96.c) == 0 && Float.compare(this.d, l96.d) == 0 && gw8.t(this.e, l96.e) && gw8.t(this.f, l96.f) && gw8.t(this.g, l96.g) && gw8.t(this.h, l96.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + pb4.b(pb4.b(pb4.b(f21.d(this.d, f21.d(this.c, f21.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String Y = gr8.Y(this.a);
        String Y2 = gr8.Y(this.b);
        String Y3 = gr8.Y(this.c);
        String Y4 = gr8.Y(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(Y);
        sb.append(", ");
        sb.append(Y2);
        sb.append(", ");
        sb.append(Y3);
        String l = f21.l(sb, ", ", Y4);
        long j = this.e;
        long j2 = this.f;
        boolean t = gw8.t(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!t || !gw8.t(j2, j3) || !gw8.t(j3, j4)) {
            String O = gw8.O(j);
            String O2 = gw8.O(j2);
            String O3 = gw8.O(j3);
            String O4 = gw8.O(j4);
            StringBuilder o = f21.o("RoundRect(rect=", l, ", topLeft=", O, ", topRight=");
            f21.v(o, O2, ", bottomRight=", O3, ", bottomLeft=");
            return f21.l(o, O4, ")");
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return pb4.m("RoundRect(rect=", l, ", radius=", gr8.Y(Float.intBitsToFloat(i)), ")");
        }
        String Y5 = gr8.Y(Float.intBitsToFloat(i));
        return f21.l(f21.o("RoundRect(rect=", l, ", x=", Y5, ", y="), gr8.Y(Float.intBitsToFloat(i2)), ")");
    }
}
