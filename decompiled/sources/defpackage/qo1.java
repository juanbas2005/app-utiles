package defpackage;

/* renamed from: qo1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qo1 extends gp1 implements ad1, ro1 {
    public final fu6 x;
    public final boolean y;

    public qo1(fu6 fu6, boolean z) {
        this.x = fu6;
        this.y = z;
    }

    public final gp1 A0(fu6 fu6) {
        return new qo1(fu6, this.y);
    }

    public final boolean Q() {
        return false;
    }

    public final du7 t(vw3 vw3) {
        vw3.getClass();
        return o85.m(vw3.n0(), this.y);
    }

    public final String toString() {
        return this.x + " & Any";
    }

    public final boolean v() {
        fu6 fu6 = this.x;
        fu6.L();
        if (fu6.L().u() instanceof qp7) {
            return true;
        }
        return false;
    }

    public final fu6 w0(boolean z) {
        if (z) {
            return this.x.o0(z);
        }
        return this;
    }

    public final fu6 x0(ro7 ro7) {
        ro7.getClass();
        return new qo1(this.x.v0(ro7), this.y);
    }

    public final fu6 y0() {
        return this.x;
    }
}
