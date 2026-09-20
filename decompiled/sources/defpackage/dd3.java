package defpackage;

/* renamed from: dd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dd3 extends ll4 implements ln7 {
    public aa8 K;
    public aa8 L;

    public dd3() {
        fg2 fg2 = gl0.u;
        this.K = fg2;
        this.L = fg2;
    }

    public void N0() {
        h75.t(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new cd3(this, 1));
        W0();
    }

    public void O0() {
        this.L = this.K;
        h75.v(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new cd3(this, 0));
    }

    public final void P0() {
        this.K = gl0.u;
    }

    public abstract aa8 V0(aa8 aa8);

    public void W0() {
        this.L = V0(this.K);
        h75.v(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new cd3(this, 0));
    }

    public final Object m() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
