package defpackage;

/* renamed from: x51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x51 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public x51(long j, long j2, long j3, long j4, long j5) {
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
        if (obj == null || !(obj instanceof x51)) {
            return false;
        }
        x51 x51 = (x51) obj;
        if (jt0.c(this.a, x51.a) && jt0.c(this.b, x51.b) && jt0.c(this.c, x51.c) && jt0.c(this.d, x51.d) && jt0.c(this.e, x51.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.e) + pb4.b(pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String i = jt0.i(this.a);
        String i2 = jt0.i(this.b);
        String i3 = jt0.i(this.c);
        String i4 = jt0.i(this.d);
        String i5 = jt0.i(this.e);
        StringBuilder o = f21.o("ContextMenuColors(backgroundColor=", i, ", textColor=", i2, ", iconColor=");
        f21.v(o, i3, ", disabledTextColor=", i4, ", disabledIconColor=");
        return f21.l(o, i5, ")");
    }
}
