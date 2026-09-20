package defpackage;

/* renamed from: xd0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xd0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public xd0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final xd0 a(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        long j8;
        if (j != 16) {
            j5 = j;
        } else {
            j5 = this.a;
        }
        if (j2 != 16) {
            j6 = j2;
        } else {
            j6 = this.b;
        }
        if (j3 != 16) {
            j7 = j3;
        } else {
            j7 = this.c;
        }
        if (j4 != 16) {
            j8 = j4;
        } else {
            j8 = this.d;
        }
        return new xd0(j5, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xd0)) {
            return false;
        }
        xd0 xd0 = (xd0) obj;
        if (jt0.c(this.a, xd0.a) && jt0.c(this.b, xd0.b) && jt0.c(this.c, xd0.c) && jt0.c(this.d, xd0.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.d) + pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
