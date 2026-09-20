package defpackage;

/* renamed from: ah2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ah2 extends zg2 implements ad1 {
    public final vw3 Y(ax3 ax3) {
        ax3.getClass();
        fu6 fu6 = this.x;
        fu6.getClass();
        fu6 fu62 = this.y;
        fu62.getClass();
        return new zg2(fu6, fu62);
    }

    public final du7 o0(boolean z) {
        return kl8.n(this.x.o0(z), this.y.o0(z));
    }

    public final du7 p0(ax3 ax3) {
        ax3.getClass();
        fu6 fu6 = this.x;
        fu6.getClass();
        fu6 fu62 = this.y;
        fu62.getClass();
        return new zg2(fu6, fu62);
    }

    public final du7 t(vw3 vw3) {
        du7 du7;
        vw3.getClass();
        du7 n0 = vw3.n0();
        if (n0 instanceof zg2) {
            du7 = n0;
        } else if (n0 instanceof fu6) {
            fu6 fu6 = (fu6) n0;
            du7 = kl8.n(fu6, fu6.o0(true));
        } else {
            h.c();
            return null;
        }
        return ub5.m(du7, n0);
    }

    public final String toString() {
        return "(" + this.x + ".." + this.y + ')';
    }

    public final boolean v() {
        fu6 fu6 = this.x;
        if (!(fu6.L().u() instanceof qp7) || !sg3.e(fu6.L(), this.y.L())) {
            return false;
        }
        return true;
    }

    public final du7 v0(ro7 ro7) {
        ro7.getClass();
        return kl8.n(this.x.v0(ro7), this.y.v0(ro7));
    }

    public final fu6 w0() {
        return this.x;
    }

    public final String x0(ms1 ms1, ms1 ms12) {
        boolean p = ms12.a.p();
        fu6 fu6 = this.y;
        fu6 fu62 = this.x;
        if (!p) {
            return ms1.x(ms1.P(fu62), ms1.P(fu6), jb5.k(this));
        }
        return "(" + ms1.P(fu62) + ".." + ms1.P(fu6) + ')';
    }
}
