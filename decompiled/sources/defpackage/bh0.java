package defpackage;

/* renamed from: bh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bh0 extends ll4 implements h35, hd0, gz1 {
    public final ch0 K;
    public boolean L;
    public vr2 M;

    public bh0(ch0 ch0, vr2 vr2) {
        this.K = ch0;
        this.M = vr2;
        ch0.w = this;
    }

    public final void M() {
        V0();
    }

    public final void P0() {
        V0();
    }

    public final void R() {
        V0();
    }

    public final void V0() {
        this.L = false;
        this.K.x = null;
        rc9.e0(this);
    }

    public final tp1 b() {
        return rc9.O0(this).T;
    }

    public final void d() {
        V0();
    }

    public final long e() {
        return pv8.O(rc9.M0(this, 4).y);
    }

    public final ey3 getLayoutDirection() {
        return rc9.O0(this).U;
    }

    public final void m0() {
        V0();
    }

    public final void p0(wy3 wy3) {
        boolean z = this.L;
        ch0 ch0 = this.K;
        if (!z) {
            ch0.x = null;
            i35.o(this, new ae(3, this, ch0));
            if (ch0.x != null) {
                this.L = true;
            } else {
                throw b81.t("DrawResult not defined, did you forget to call onDraw?");
            }
        }
        wv2 wv2 = ch0.x;
        wv2.getClass();
        ((vr2) wv2.x).y(wy3);
    }

    public final void O0() {
    }
}
