package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: ll4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ll4 implements vo1 {
    public ll4 A;
    public ll4 B;
    public j35 C;
    public xz4 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ae I;
    public boolean J;
    public ll4 w = this;
    public ig0 x;
    public int y;
    public int z = -1;

    public final o81 J0() {
        ig0 ig0 = this.x;
        if (ig0 != null) {
            return ig0;
        }
        ig0 E2 = gl0.E(((je) rc9.P0(this)).getCoroutineContext().X(new fl3((el3) ((je) rc9.P0(this)).getCoroutineContext().a0(me6.E))));
        this.x = E2;
        return E2;
    }

    public boolean K0() {
        return !(this instanceof b40);
    }

    public void L0() {
        if (this.J) {
            yb3.b("node attached multiple times");
        }
        if (this.D == null) {
            yb3.b("attach invoked on a node without a coordinator");
        }
        this.J = true;
        this.G = true;
    }

    public void M0() {
        if (!this.J) {
            yb3.b("Cannot detach a node that is not attached");
        }
        if (this.G) {
            yb3.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.H) {
            yb3.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.J = false;
        ig0 ig0 = this.x;
        if (ig0 != null) {
            gl0.J(ig0, new CancellationException("The Modifier.Node was detached"));
            this.x = null;
        }
    }

    public void Q0() {
        if (!this.J) {
            yb3.b("reset() called on an unattached node");
        }
        P0();
    }

    public void R0() {
        if (!this.J) {
            yb3.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.G) {
            yb3.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.G = false;
        N0();
        this.H = true;
    }

    public void S0() {
        if (!this.J) {
            yb3.b("node detached multiple times");
        }
        if (this.D == null) {
            yb3.b("detach invoked on a node without a coordinator");
        }
        if (!this.H) {
            yb3.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.H = false;
        ae aeVar = this.I;
        if (aeVar != null) {
            aeVar.b();
        }
        O0();
    }

    public void T0(ll4 ll4) {
        this.w = ll4;
    }

    public void U0(xz4 xz4) {
        this.D = xz4;
    }

    public void N0() {
    }

    public void O0() {
    }

    public void P0() {
    }
}
