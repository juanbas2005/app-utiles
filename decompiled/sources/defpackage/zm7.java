package defpackage;

/* renamed from: zm7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zm7 extends ix6 {
    public final ix6 e;
    public final boolean f;
    public final boolean g;
    public vr2 h;
    public final long i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r4 = r4.e();
     */
    public zm7(ix6 ix6, vr2 vr2, boolean z, boolean z2) {
        super(0, mx6.A);
        nf6 nf6 = nx6.a;
        this.e = ix6;
        this.f = z;
        this.g = z2;
        vr2 vr22 = (ix6 == null || vr22 == null) ? nx6.j.e : vr22;
        this.h = nx6.k(vr2, vr22, z);
        this.i = jb5.f();
    }

    public final void c() {
        ix6 ix6;
        this.c = true;
        if (this.g && (ix6 = this.e) != null) {
            ix6.c();
        }
    }

    public final mx6 d() {
        return v().d();
    }

    public final vr2 e() {
        return this.h;
    }

    public final boolean f() {
        return v().f();
    }

    public final long g() {
        return v().g();
    }

    public final vr2 i() {
        return null;
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
        v().m();
    }

    public final void n(n37 n37) {
        v().n(n37);
    }

    public final ix6 u(vr2 vr2) {
        vr2 k = nx6.k(vr2, this.h, true);
        if (!this.f) {
            return nx6.g(v().u((vr2) null), k, true);
        }
        return v().u(k);
    }

    public final ix6 v() {
        ix6 ix6 = this.e;
        if (ix6 == null) {
            return nx6.j;
        }
        return ix6;
    }
}
