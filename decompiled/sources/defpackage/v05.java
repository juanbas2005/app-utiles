package defpackage;

/* renamed from: v05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v05 extends gp1 implements ad1 {
    public final fu6 x;

    public v05(fu6 fu6) {
        fu6.getClass();
        this.x = fu6;
    }

    public final gp1 A0(fu6 fu6) {
        return new v05(fu6);
    }

    public final boolean Q() {
        return false;
    }

    public final du7 t(vw3 vw3) {
        vw3.getClass();
        du7 n0 = vw3.n0();
        if (!iq7.f(n0) && !iq7.e(n0)) {
            return n0;
        }
        if (n0 instanceof fu6) {
            fu6 fu6 = (fu6) n0;
            fu6 w0 = fu6.o0(false);
            if (!iq7.f(fu6)) {
                return w0;
            }
            return new v05(w0);
        } else if (n0 instanceof zg2) {
            zg2 zg2 = (zg2) n0;
            fu6 fu62 = zg2.x;
            fu6 w02 = fu62.o0(false);
            if (iq7.f(fu62)) {
                w02 = new v05(w02);
            }
            fu6 fu63 = zg2.y;
            fu6 w03 = fu63.o0(false);
            if (iq7.f(fu63)) {
                w03 = new v05(w03);
            }
            return ub5.t(kl8.n(w02, w03), ub5.k(n0));
        } else {
            h.c();
            return null;
        }
    }

    public final boolean v() {
        return true;
    }

    public final du7 v0(ro7 ro7) {
        ro7.getClass();
        return new v05(this.x.v0(ro7));
    }

    public final fu6 w0(boolean z) {
        if (z) {
            return this.x.o0(true);
        }
        return this;
    }

    public final fu6 x0(ro7 ro7) {
        ro7.getClass();
        return new v05(this.x.v0(ro7));
    }

    public final fu6 y0() {
        return this.x;
    }
}
