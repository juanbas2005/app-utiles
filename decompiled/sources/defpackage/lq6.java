package defpackage;

/* renamed from: lq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lq6 {
    public static final lq6 d = new lq6(uq3.d(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public lq6(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq6)) {
            return false;
        }
        lq6 lq6 = (lq6) obj;
        if (jt0.c(this.a, lq6.a) && l35.b(this.b, lq6.b) && this.c == lq6.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Float.hashCode(this.c) + pb4.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder o = f21.o("Shadow(color=", jt0.i(this.a), ", offset=", l35.g(this.b), ", blurRadius=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
