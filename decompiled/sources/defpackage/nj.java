package defpackage;

/* renamed from: nj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nj implements aa8 {
    public final int a;
    public final String b;
    public final ed5 c = u55.p(ad3.e);
    public final ed5 d = u55.p(Boolean.TRUE);

    public nj(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a(tp1 tp1) {
        return e().b;
    }

    public final int b(tp1 tp1, ey3 ey3) {
        return e().c;
    }

    public final int c(tp1 tp1) {
        return e().d;
    }

    public final int d(tp1 tp1, ey3 ey3) {
        return e().a;
    }

    public final ad3 e() {
        return (ad3) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nj) && this.a == ((nj) obj).a) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(db8 db8, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(db8.a.h(i2));
            f(db8.a.t(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = e().a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        return this.b + "(" + i + ", " + i2 + ", " + i3 + ", " + i4 + ")";
    }
}
