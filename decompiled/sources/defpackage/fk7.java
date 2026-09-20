package defpackage;

/* renamed from: fk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fk7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public fk7(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final fk7 a(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        if (j != 16) {
            j7 = j;
        } else {
            j7 = this.a;
        }
        if (j2 != 16) {
            j8 = j2;
        } else {
            j8 = this.b;
        }
        if (j3 != 16) {
            j9 = j3;
        } else {
            j9 = this.c;
        }
        if (j4 != 16) {
            j10 = j4;
        } else {
            j10 = this.d;
        }
        if (j5 != 16) {
            j11 = j5;
        } else {
            j11 = this.e;
        }
        if (j6 != 16) {
            j12 = j6;
        } else {
            j12 = this.f;
        }
        return new fk7(j7, j8, j9, j10, j11, j12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fk7)) {
            return false;
        }
        fk7 fk7 = (fk7) obj;
        if (jt0.c(this.a, fk7.a) && jt0.c(this.b, fk7.b) && jt0.c(this.c, fk7.c) && jt0.c(this.d, fk7.d) && jt0.c(this.e, fk7.e) && jt0.c(this.f, fk7.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.f) + pb4.b(pb4.b(pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
