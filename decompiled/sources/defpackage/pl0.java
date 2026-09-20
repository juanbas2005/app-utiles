package defpackage;

/* renamed from: pl0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pl0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public pl0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pl0)) {
            return false;
        }
        pl0 pl0 = (pl0) obj;
        if (jt0.c(this.a, pl0.a) && jt0.c(this.b, pl0.b) && jt0.c(this.c, pl0.c) && jt0.c(this.d, pl0.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.d) + pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
