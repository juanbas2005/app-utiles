package defpackage;

/* renamed from: x83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x83 {
    public static int k;
    public static final ts2 l = new ts2(1);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final b38 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public x83(String str, float f2, float f3, float f4, float f5, b38 b38, long j2, int i2, boolean z) {
        int i3;
        synchronized (l) {
            i3 = k;
            k = i3 + 1;
        }
        this.a = str;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = b38;
        this.g = j2;
        this.h = i2;
        this.i = z;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x83)) {
            return false;
        }
        x83 x83 = (x83) obj;
        if (sg3.e(this.a, x83.a) && lx1.b(this.b, x83.b) && lx1.b(this.c, x83.c) && this.d == x83.d && this.e == x83.e && this.f.equals(x83.f) && jt0.c(this.g, x83.g) && this.h == x83.h && this.i == x83.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d2 = f21.d(this.e, f21.d(this.d, f21.d(this.c, f21.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        int i2 = jt0.h;
        return Boolean.hashCode(this.i) + f21.e(this.h, pb4.b((this.f.hashCode() + d2) * 31, 31, this.g), 31);
    }
}
