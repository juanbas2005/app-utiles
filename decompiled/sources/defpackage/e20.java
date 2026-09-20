package defpackage;

/* renamed from: e20  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e20 extends ll4 {
    public ph7 K;
    public final /* synthetic */ f20 L;

    public e20(f20 f20) {
        this.L = f20;
    }

    public final void N0() {
        f20 f20 = this.L;
        f20.w = this;
        if (f20.x != null) {
            this.K = f55.r(this, 0, 0, new m0(5, this, f20));
        }
    }

    public final void O0() {
        f20 f20 = this.L;
        if (f20.w == this) {
            f20.w = null;
        }
        ph7 ph7 = this.K;
        if (ph7 != null) {
            ph7.b();
        }
        this.K = null;
    }
}
