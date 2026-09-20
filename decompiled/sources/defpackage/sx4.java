package defpackage;

/* renamed from: sx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sx4 extends ix6 {
    public final vr2 e;
    public final ix6 f;

    public sx4(long j, mx6 mx6, vr2 vr2, ix6 ix6) {
        super(j, mx6);
        this.e = vr2;
        this.f = ix6;
        ix6.k();
    }

    public final void c() {
        ix6 ix6 = this.f;
        if (!this.c) {
            if (this.b != ix6.g()) {
                a();
            }
            ix6.l();
            this.c = true;
            synchronized (nx6.c) {
                o();
            }
        }
    }

    public final vr2 e() {
        return this.e;
    }

    public final boolean f() {
        return true;
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

    public final void n(n37 n37) {
        nf6 nf6 = nx6.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final ix6 u(vr2 vr2) {
        return new sx4(this.b, this.a, nx6.k(vr2, this.e, true), this.f);
    }

    public final void m() {
    }
}
