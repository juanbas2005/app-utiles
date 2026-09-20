package defpackage;

/* renamed from: hp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hp1 extends gp1 {
    public final fu6 x;

    public hp1(fu6 fu6) {
        this.x = fu6;
    }

    public final fu6 w0(boolean z) {
        if (z == Q()) {
            return this;
        }
        return this.x.o0(z).v0(J());
    }

    public final fu6 x0(ro7 ro7) {
        ro7.getClass();
        if (ro7 != J()) {
            return new iu6(this, ro7);
        }
        return this;
    }

    public final fu6 y0() {
        return this.x;
    }
}
