package defpackage;

/* renamed from: ss7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ss7 implements aa8 {
    public final aa8 a;
    public final aa8 b;

    public ss7(aa8 aa8, aa8 aa82) {
        this.a = aa8;
        this.b = aa82;
    }

    public final int a(tp1 tp1) {
        return Math.max(this.a.a(tp1), this.b.a(tp1));
    }

    public final int b(tp1 tp1, ey3 ey3) {
        return Math.max(this.a.b(tp1, ey3), this.b.b(tp1, ey3));
    }

    public final int c(tp1 tp1) {
        return Math.max(this.a.c(tp1), this.b.c(tp1));
    }

    public final int d(tp1 tp1, ey3 ey3) {
        return Math.max(this.a.d(tp1, ey3), this.b.d(tp1, ey3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss7)) {
            return false;
        }
        ss7 ss7 = (ss7) obj;
        if (!sg3.e(ss7.a, this.a) || !sg3.e(ss7.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
