package defpackage;

/* renamed from: qa5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qa5 implements aa8 {
    public final la5 a;

    public qa5(la5 la5) {
        this.a = la5;
    }

    public final int a(tp1 tp1) {
        return tp1.r0(this.a.d());
    }

    public final int b(tp1 tp1, ey3 ey3) {
        return tp1.r0(this.a.c(ey3));
    }

    public final int c(tp1 tp1) {
        return tp1.r0(this.a.a());
    }

    public final int d(tp1 tp1, ey3 ey3) {
        return tp1.r0(this.a.b(ey3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa5)) {
            return false;
        }
        return sg3.e(((qa5) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        la5 la5 = this.a;
        ey3 ey3 = ey3.w;
        float b = la5.b(ey3);
        float d = la5.d();
        float c = la5.c(ey3);
        float a2 = la5.a();
        String c2 = lx1.c(b);
        String c3 = lx1.c(d);
        return pb4.n(f21.o("PaddingValues(", c2, ", ", c3, ", "), lx1.c(c), ", ", lx1.c(a2), ")");
    }
}
