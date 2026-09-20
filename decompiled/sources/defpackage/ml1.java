package defpackage;

/* renamed from: ml1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ml1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public ml1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml1)) {
            return false;
        }
        ml1 ml1 = (ml1) obj;
        if (jt0.c(this.a, ml1.a) && jt0.c(this.b, ml1.b) && jt0.c(this.c, ml1.c) && jt0.c(this.d, ml1.d) && jt0.c(this.e, ml1.e) && jt0.c(this.f, ml1.f) && jt0.c(this.g, ml1.g)) {
            return jt0.c(this.h, ml1.h);
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.h) + pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
