package defpackage;

/* renamed from: so0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class so0 {
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
    public final long m;

    public so0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = j8;
        this.h = j9;
        this.i = j10;
        this.j = j11;
        this.k = j12;
        this.l = j13;
        this.m = j14;
    }

    public static je2 a(ij7 ij7, yt2 yt2) {
        if (ij7 == ij7.x) {
            yt2.e0(1539238463);
            je2 H = hj8.H(vm4.z, yt2);
            yt2.r(false);
            return H;
        }
        yt2.e0(1539331773);
        je2 H2 = hj8.H(vm4.y, yt2);
        yt2.r(false);
        return H2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof so0)) {
            return false;
        }
        so0 so0 = (so0) obj;
        if (jt0.c(this.a, so0.a) && jt0.c(this.b, so0.b) && jt0.c(this.m, so0.m) && jt0.c(this.c, so0.c) && jt0.c(this.d, so0.d) && jt0.c(this.e, so0.e) && jt0.c(this.f, so0.f) && jt0.c(this.g, so0.g) && jt0.c(this.h, so0.h) && jt0.c(this.i, so0.i) && jt0.c(this.j, so0.j) && jt0.c(this.k, so0.k) && jt0.c(this.l, so0.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = jt0.h;
        return Long.hashCode(this.l) + pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.m), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
