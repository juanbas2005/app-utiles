package defpackage;

/* renamed from: li1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class li1 implements pf1, ei7, c08, d71 {
    public final ba3 a;
    public final da3 b;
    public final fa3 c;
    public String d;

    public li1(ba3 ba3, da3 da3, fa3 fa3, String str) {
        this.a = ba3;
        this.b = da3;
        this.c = fa3;
        this.d = str;
    }

    public final void A(Integer num) {
        this.b.a = num;
    }

    public final Integer B() {
        return this.b.a;
    }

    public final Integer C() {
        return this.b.e;
    }

    public final Boolean D() {
        return this.c.a;
    }

    public final void E(Integer num) {
        this.b.e = num;
    }

    public final void F(Integer num) {
        this.a.d = num;
    }

    public final void a(uj1 uj1) {
        this.b.a(uj1);
    }

    public final ub b() {
        return this.b.c;
    }

    public final Integer c() {
        return this.c.d;
    }

    public final Object copy() {
        ba3 a2 = this.a.copy();
        da3 c2 = this.b.copy();
        fa3 fa3 = this.c;
        return new li1(a2, c2, new fa3(fa3.a, fa3.b, fa3.c, fa3.d), this.d);
    }

    public final void d(Integer num) {
        this.c.d = num;
    }

    public final void e(Integer num) {
        this.b.b = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof li1)) {
            return false;
        }
        li1 li1 = (li1) obj;
        if (!li1.a.equals(this.a) || !li1.b.equals(this.b) || !li1.c.equals(this.c) || !sg3.e(li1.d, this.d)) {
            return false;
        }
        return true;
    }

    public final void f(Integer num) {
        this.b.f = num;
    }

    public final void g(Integer num) {
        this.a.a.b = num;
    }

    public final Integer h() {
        return this.b.d;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i ^ hashCode;
    }

    public final void i(Integer num) {
        this.c.c = num;
    }

    public final void j(Integer num) {
        this.c.b = num;
    }

    public final void k(Integer num) {
        this.b.d = num;
    }

    public final Integer l() {
        return this.a.a.a;
    }

    public final Integer m() {
        return this.a.c;
    }

    public final uj1 n() {
        return this.b.n();
    }

    public final Integer o() {
        return this.b.f;
    }

    public final void p(Boolean bool) {
        this.c.a = bool;
    }

    public final Integer q() {
        return this.b.b;
    }

    public final Integer r() {
        return this.a.b;
    }

    public final void s(Integer num) {
        this.a.b = num;
    }

    public final void t(ub ubVar) {
        this.b.c = ubVar;
    }

    public final Integer u() {
        return this.a.d;
    }

    public final void v(Integer num) {
        this.a.a.a = num;
    }

    public final Integer w() {
        return this.c.b;
    }

    public final Integer x() {
        return this.c.c;
    }

    public final Integer y() {
        return this.a.a.b;
    }

    public final void z(Integer num) {
        this.a.c = num;
    }
}
