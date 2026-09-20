package defpackage;

/* renamed from: d28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d28 implements aa8 {
    public final String a;
    public final ed5 b;

    public d28(jd3 jd3, String str) {
        this.a = str;
        this.b = u55.p(jd3);
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

    public final jd3 e() {
        return (jd3) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d28)) {
            return false;
        }
        return sg3.e(e(), ((d28) obj).e());
    }

    public final void f(jd3 jd3) {
        this.b.setValue(jd3);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = e().a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        return this.a + "(left=" + i + ", top=" + i2 + ", right=" + i3 + ", bottom=" + i4 + ")";
    }
}
