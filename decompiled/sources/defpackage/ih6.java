package defpackage;

/* renamed from: ih6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ih6 extends wo1 implements ry0, h35 {
    public uh6 M;
    public z75 N;
    public boolean O;
    public eh2 P;
    public ap4 Q;
    public fc0 R;
    public boolean S;
    public xf T;
    public th6 U;
    public vo1 V;
    public yf W;
    public xf X;
    public boolean Y;

    public final boolean K0() {
        return false;
    }

    public final void N0() {
        xf xfVar;
        this.Y = Z0();
        Y0();
        if (this.U == null) {
            uh6 uh6 = this.M;
            if (this.S) {
                xfVar = this.X;
            } else {
                xfVar = this.T;
            }
            xf xfVar2 = xfVar;
            eh2 eh2 = this.P;
            z75 z75 = this.N;
            boolean z = this.O;
            boolean z2 = this.Y;
            th6 th6 = new th6(xfVar2, this.R, eh2, this.Q, z75, uh6, z, z2);
            V0(th6);
            this.U = th6;
        }
    }

    public final void O0() {
        vo1 vo1 = this.V;
        if (vo1 != null) {
            W0(vo1);
        }
    }

    public final void R() {
        xf xfVar;
        boolean Z0 = Z0();
        if (this.Y != Z0) {
            this.Y = Z0;
            uh6 uh6 = this.M;
            z75 z75 = this.N;
            boolean z = this.S;
            if (z) {
                xfVar = this.X;
            } else {
                xfVar = this.T;
            }
            xf xfVar2 = xfVar;
            boolean z2 = this.O;
            a1(xfVar2, this.R, this.P, this.Q, z75, uh6, z, z2);
        }
    }

    public final void Y0() {
        xf xfVar;
        vo1 vo1 = this.V;
        if (vo1 == null) {
            if (this.S) {
                i35.o(this, new hx4(19, this));
            }
            if (this.S) {
                xfVar = this.X;
            } else {
                xfVar = this.T;
            }
            if (xfVar != null) {
                wo1 wo1 = xfVar.i;
                if (!wo1.w.J) {
                    V0(wo1);
                    this.V = wo1;
                }
            }
        } else if (!((ll4) vo1).w.J) {
            V0(vo1);
        }
    }

    public final boolean Z0() {
        ey3 ey3;
        if (this.J) {
            ey3 = rc9.O0(this).U;
        } else {
            ey3 = ey3.w;
        }
        z75 z75 = this.N;
        if (ey3 != ey3.x || z75 == z75.w) {
            return true;
        }
        return false;
    }

    public final void a1(xf xfVar, fc0 fc0, eh2 eh2, ap4 ap4, z75 z75, uh6 uh6, boolean z, boolean z2) {
        boolean z3;
        xf xfVar2;
        boolean z4 = z;
        this.M = uh6;
        this.N = z75;
        boolean z5 = true;
        if (this.S != z4) {
            this.S = z4;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!sg3.e(this.T, xfVar)) {
            this.T = xfVar;
        } else {
            z5 = false;
        }
        if (z3 || (z5 && !z4)) {
            vo1 vo1 = this.V;
            if (vo1 != null) {
                W0(vo1);
            }
            this.V = null;
            Y0();
        }
        boolean z6 = z2;
        this.O = z6;
        this.P = eh2;
        this.Q = ap4;
        this.R = fc0;
        boolean Z0 = Z0();
        this.Y = Z0;
        th6 th6 = this.U;
        if (th6 != null) {
            if (this.S) {
                xfVar2 = this.X;
            } else {
                xfVar2 = this.T;
            }
            th6.q1(xfVar2, fc0, eh2, ap4, z75, uh6, z6, Z0);
        }
    }

    public final void m0() {
        xf xfVar;
        yf yfVar = (yf) h49.w(this, l95.a);
        if (!sg3.e(yfVar, this.W)) {
            this.W = yfVar;
            this.X = null;
            vo1 vo1 = this.V;
            if (vo1 != null) {
                W0(vo1);
            }
            this.V = null;
            Y0();
            th6 th6 = this.U;
            if (th6 != null) {
                uh6 uh6 = this.M;
                z75 z75 = this.N;
                if (this.S) {
                    xfVar = this.X;
                } else {
                    xfVar = this.T;
                }
                xf xfVar2 = xfVar;
                boolean z = this.O;
                boolean z2 = this.Y;
                th6.q1(xfVar2, this.R, this.P, this.Q, z75, uh6, z, z2);
            }
        }
    }
}
