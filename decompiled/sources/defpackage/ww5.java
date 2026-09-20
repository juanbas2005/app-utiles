package defpackage;

/* renamed from: ww5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ww5 extends ix6 {
    public final vr2 e;
    public int f = 1;

    public ww5(long j, mx6 mx6, vr2 vr2) {
        super(j, mx6);
        this.e = vr2;
    }

    public final void c() {
        if (!this.c) {
            l();
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
        this.f++;
    }

    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    public final void n(n37 n37) {
        nf6 nf6 = nx6.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final ix6 u(vr2 vr2) {
        nx6.c(this);
        return new sx4(this.b, this.a, nx6.k(vr2, this.e, true), this);
    }

    public final void m() {
    }
}
