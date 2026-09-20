package defpackage;

/* renamed from: xw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xw2 {
    public final long a;
    public final long b;
    public final long c;

    public xw2(long j, int i) {
        long j2 = jt0.g;
        j = (i & 4) != 0 ? j2 : j;
        this.a = j2;
        this.b = j2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw2)) {
            return false;
        }
        xw2 xw2 = (xw2) obj;
        if (jt0.c(this.a, xw2.a) && jt0.c(this.b, xw2.b) && jt0.c(this.c, xw2.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.c) + pb4.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String i = jt0.i(this.a);
        String i2 = jt0.i(this.b);
        return f21.l(f21.o("GradientColors(top=", i, ", bottom=", i2, ", container="), jt0.i(this.c), ")");
    }
}
