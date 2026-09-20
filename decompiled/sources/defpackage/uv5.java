package defpackage;

/* renamed from: uv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uv5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public uv5(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uv5)) {
            return false;
        }
        uv5 uv5 = (uv5) obj;
        if (jt0.c(this.a, uv5.a) && jt0.c(this.b, uv5.b) && jt0.c(this.c, uv5.c) && jt0.c(this.d, uv5.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.d) + pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
