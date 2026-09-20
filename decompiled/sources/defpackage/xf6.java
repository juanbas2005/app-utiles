package defpackage;

/* renamed from: xf6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xf6 {
    public final float a;
    public final long b;
    public final je2 c;

    public xf6(float f, long j, je2 je2) {
        this.a = f;
        this.b = j;
        this.c = je2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf6)) {
            return false;
        }
        xf6 xf6 = (xf6) obj;
        if (Float.compare(this.a, xf6.a) == 0 && ql7.a(this.b, xf6.b) && sg3.e(this.c, xf6.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = ql7.c;
        return this.c.hashCode() + pb4.b(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String b2 = ql7.b(this.b);
        return "Scale(scale=" + this.a + ", transformOrigin=" + b2 + ", animationSpec=" + this.c + ")";
    }
}
