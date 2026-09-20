package defpackage;

/* renamed from: rw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rw4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public rw4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rw4)) {
            return false;
        }
        rw4 rw4 = (rw4) obj;
        if (jt0.c(this.a, rw4.a) && jt0.c(this.d, rw4.d) && jt0.c(this.b, rw4.b) && jt0.c(this.e, rw4.e) && jt0.c(this.c, rw4.c) && jt0.c(this.f, rw4.f) && jt0.c(this.g, rw4.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.g) + pb4.b(pb4.b(pb4.b(pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.d), 31, this.b), 31, this.e), 31, this.c), 31, this.f);
    }
}
