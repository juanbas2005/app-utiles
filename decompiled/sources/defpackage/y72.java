package defpackage;

/* renamed from: y72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y72 implements aa8 {
    public final aa8 a;
    public final aa8 b;

    public y72(aa8 aa8, aa8 aa82) {
        this.a = aa8;
        this.b = aa82;
    }

    public final int a(tp1 tp1) {
        int a2 = this.a.a(tp1) - this.b.a(tp1);
        if (a2 < 0) {
            return 0;
        }
        return a2;
    }

    public final int b(tp1 tp1, ey3 ey3) {
        int b2 = this.a.b(tp1, ey3) - this.b.b(tp1, ey3);
        if (b2 < 0) {
            return 0;
        }
        return b2;
    }

    public final int c(tp1 tp1) {
        int c = this.a.c(tp1) - this.b.c(tp1);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    public final int d(tp1 tp1, ey3 ey3) {
        int d = this.a.d(tp1, ey3) - this.b.d(tp1, ey3);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y72)) {
            return false;
        }
        y72 y72 = (y72) obj;
        if (!sg3.e(y72.a, this.a) || !sg3.e(y72.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
