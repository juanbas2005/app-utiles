package defpackage;

/* renamed from: wi4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wi4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public wi4(long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = jt0.g;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = j8;
        this.h = j8;
        this.i = j8;
        this.j = j8;
        this.k = j8;
        this.l = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wi4)) {
            return false;
        }
        wi4 wi4 = (wi4) obj;
        if (jt0.c(this.a, wi4.a) && jt0.c(this.g, wi4.g) && jt0.c(this.b, wi4.b) && jt0.c(this.c, wi4.c) && jt0.c(this.d, wi4.d) && jt0.c(this.e, wi4.e) && jt0.c(this.f, wi4.f) && jt0.c(this.h, wi4.h) && jt0.c(this.i, wi4.i) && jt0.c(this.j, wi4.j) && jt0.c(this.k, wi4.k) && jt0.c(this.l, wi4.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = jt0.h;
        return Long.hashCode(this.l) + pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.g), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
