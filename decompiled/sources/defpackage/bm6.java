package defpackage;

/* renamed from: bm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bm6 {
    public final x83 a;
    public final long b;
    public final long c;

    public bm6(x83 x83, long j, long j2) {
        this.a = x83;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm6)) {
            return false;
        }
        bm6 bm6 = (bm6) obj;
        if (this.a.equals(bm6.a) && jt0.c(this.b, bm6.b) && jt0.c(this.c, bm6.c)) {
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
        StringBuilder sb = new StringBuilder("ServiceStyle(icon=");
        sb.append(this.a);
        sb.append(", tile=");
        sb.append(i);
        sb.append(", iconColor=");
        return f21.l(sb, i2, ")");
    }
}
