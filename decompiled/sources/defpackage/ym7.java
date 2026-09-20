package defpackage;

/* renamed from: ym7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ym7 extends yp4 {
    public final yp4 o;
    public final boolean p;
    public final boolean q;
    public vr2 r;
    public vr2 s;
    public final long t;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r8.e();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    public ym7(yp4 yp4, vr2 vr2, vr2 vr22, boolean z, boolean z2) {
        super(0, mx6.A, nx6.k(vr2, r0, z), nx6.l(vr22, (yp4 == null || (r9 = yp4.i()) == null) ? nx6.j.f : r9));
        vr2 vr23;
        nf6 nf6 = nx6.a;
        vr2 vr24 = (yp4 == null || vr24 == null) ? nx6.j.e : vr24;
        this.o = yp4;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = jb5.f();
    }

    public final void B(up4 up4) {
        h03.w();
        throw null;
    }

    public final yp4 C(vr2 vr2, vr2 vr22) {
        vr2 k = nx6.k(vr2, this.r, true);
        vr2 l = nx6.l(vr22, this.s);
        if (!this.p) {
            return new ym7(D().C((vr2) null, l), k, l, false, true);
        }
        return D().C(k, l);
    }

    public final yp4 D() {
        yp4 yp4 = this.o;
        if (yp4 == null) {
            return nx6.j;
        }
        return yp4;
    }

    public final void c() {
        yp4 yp4;
        this.c = true;
        if (this.q && (yp4 = this.o) != null) {
            yp4.c();
        }
    }

    public final mx6 d() {
        return D().d();
    }

    public final vr2 e() {
        return this.r;
    }

    public final boolean f() {
        return D().f();
    }

    public final long g() {
        return D().g();
    }

    public final int h() {
        return D().h();
    }

    public final vr2 i() {
        return this.s;
    }

    public final void k() {
        h03.w();
        throw null;
    }

    public final void l() {
        h03.w();
        throw null;
    }

    public final void m() {
        D().m();
    }

    public final void n(n37 n37) {
        D().n(n37);
    }

    public final void r(mx6 mx6) {
        h03.w();
        throw null;
    }

    public final void s(long j) {
        h03.w();
        throw null;
    }

    public final void t(int i) {
        D().t(i);
    }

    public final ix6 u(vr2 vr2) {
        vr2 k = nx6.k(vr2, this.r, true);
        if (!this.p) {
            return nx6.g(D().u((vr2) null), k, true);
        }
        return D().u(k);
    }

    public final f55 w() {
        return D().w();
    }

    public final up4 x() {
        return D().x();
    }

    public final vr2 y() {
        return this.r;
    }
}
