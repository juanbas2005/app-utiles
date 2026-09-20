package defpackage;

/* renamed from: t9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t9 implements aa8 {
    public final aa8 a;
    public final qa5 b;

    public t9(aa8 aa8, qa5 qa5) {
        this.a = aa8;
        this.b = qa5;
    }

    public final int a(tp1 tp1) {
        return this.b.a(tp1) + this.a.a(tp1);
    }

    public final int b(tp1 tp1, ey3 ey3) {
        return this.b.b(tp1, ey3) + this.a.b(tp1, ey3);
    }

    public final int c(tp1 tp1) {
        return this.b.c(tp1) + this.a.c(tp1);
    }

    public final int d(tp1 tp1, ey3 ey3) {
        return this.b.d(tp1, ey3) + this.a.d(tp1, ey3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        if (!sg3.e(t9Var.a, this.a) || !t9Var.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ")";
    }
}
