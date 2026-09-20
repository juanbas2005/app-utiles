package defpackage;

/* renamed from: v88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v88 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public v88(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v88)) {
            return false;
        }
        v88 v88 = (v88) obj;
        if (jt0.c(this.a, v88.a) && jt0.c(this.b, v88.b) && jt0.c(this.c, v88.c) && jt0.c(this.d, v88.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.e) + pb4.b(pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
