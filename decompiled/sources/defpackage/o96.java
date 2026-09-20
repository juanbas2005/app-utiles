package defpackage;

/* renamed from: o96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o96 implements pq6, dg3 {
    public final a81 a;
    public final a81 b;
    public final a81 c;
    public final a81 d;

    public o96(a81 a81, a81 a812, a81 a813, a81 a814) {
        this.a = a81;
        this.b = a812;
        this.c = a813;
        this.d = a814;
    }

    public static o96 c(o96 o96, a81 a81, a81 a812, a81 a813, a81 a814, int i) {
        if ((i & 1) != 0) {
            a81 = o96.a;
        }
        if ((i & 2) != 0) {
            a812 = o96.b;
        }
        if ((i & 4) != 0) {
            a813 = o96.c;
        }
        if ((i & 8) != 0) {
            a814 = o96.d;
        }
        o96.getClass();
        return new o96(a81, a812, a813, a814);
    }

    public final n85 a(long j, ey3 ey3, tp1 tp1) {
        float f;
        float f2;
        long j2 = j;
        ey3 ey32 = ey3;
        tp1 tp12 = tp1;
        float a2 = this.a.a(j2, tp12);
        float a3 = this.b.a(j2, tp12);
        float a4 = this.c.a(j2, tp12);
        float a5 = this.d.a(j2, tp12);
        float c2 = wu6.c(j2);
        float f3 = a2 + a5;
        if (f3 > c2) {
            float f4 = c2 / f3;
            a2 *= f4;
            a5 *= f4;
        }
        float f5 = a3 + a4;
        if (f5 > c2) {
            float f6 = c2 / f5;
            a3 *= f6;
            a4 *= f6;
        }
        if (a2 < 0.0f || a3 < 0.0f || a4 < 0.0f || a5 < 0.0f) {
            StringBuilder n = f21.n("Corner size in Px can't be negative(topStart = ", a2, ", topEnd = ", a3, ", bottomEnd = ");
            n.append(a4);
            n.append(", bottomStart = ");
            n.append(a5);
            n.append(")!");
            bc3.a(n.toString());
        }
        if (a2 + a3 + a4 + a5 == 0.0f) {
            return new l85(z85.c(0, j2));
        }
        ly5 c3 = z85.c(0, j2);
        ey3 ey33 = ey3.w;
        if (ey32 == ey33) {
            f = a2;
        } else {
            f = a3;
        }
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        if (ey32 == ey33) {
            a2 = a3;
        }
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(a2)) << 32) | (((long) Float.floatToRawIntBits(a2)) & 4294967295L);
        if (ey32 == ey33) {
            f2 = a4;
        } else {
            f2 = a5;
        }
        long floatToRawIntBits3 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (ey32 != ey33) {
            a5 = a4;
        }
        long floatToRawIntBits4 = (((long) Float.floatToRawIntBits(a5)) << 32) | (((long) Float.floatToRawIntBits(a5)) & 4294967295L);
        float f7 = c3.a;
        float f8 = c3.b;
        return new m85(new l96(f7, f8, c3.c, c3.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, floatToRawIntBits4));
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [java.lang.Object, a81] */
    public final Object b(Object obj, float f) {
        if (sg3.e(obj, gr8.h) || obj == null) {
            o96 o96 = q96.a;
            ? obj2 = new Object();
            obj = new o96(obj2, obj2, obj2, obj2);
        }
        if (!(obj instanceof o96)) {
            return null;
        }
        o96 o962 = (o96) obj;
        o96 o963 = q96.a;
        return new o96(new p96(this.a, o962.a, f), new p96(this.b, o962.b, f), new p96(this.c, o962.c, f), new p96(this.d, o962.d, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o96)) {
            return false;
        }
        o96 o96 = (o96) obj;
        if (sg3.e(this.a, o96.a) && sg3.e(this.b, o96.b) && sg3.e(this.c, o96.c) && sg3.e(this.d, o96.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
