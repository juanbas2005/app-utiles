package defpackage;

/* renamed from: nu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nu0 {
    public final x83 a;
    public final long b;
    public final long c;

    public nu0(x83 x83, long j, long j2) {
        this.a = x83;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0 = (nu0) obj;
        if (this.a.equals(nu0.a) && jt0.c(this.b, nu0.b) && jt0.c(this.c, nu0.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.c) + pb4.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String i = jt0.i(this.b);
        String i2 = jt0.i(this.c);
        StringBuilder sb = new StringBuilder("CommandStyle(icon=");
        sb.append(this.a);
        sb.append(", tile=");
        sb.append(i);
        sb.append(", iconColor=");
        return f21.l(sb, i2, ")");
    }
}
