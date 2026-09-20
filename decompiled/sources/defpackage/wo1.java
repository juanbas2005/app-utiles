package defpackage;

/* renamed from: wo1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wo1 extends ll4 {
    public final int K = yz4.e(this);
    public ll4 L;

    public final void L0() {
        super.L0();
        for (ll4 ll4 = this.L; ll4 != null; ll4 = ll4.B) {
            ll4.U0(this.D);
            if (!ll4.J) {
                ll4.L0();
            }
        }
    }

    public final void M0() {
        for (ll4 ll4 = this.L; ll4 != null; ll4 = ll4.B) {
            ll4.M0();
        }
        super.M0();
    }

    public final void Q0() {
        super.Q0();
        for (ll4 ll4 = this.L; ll4 != null; ll4 = ll4.B) {
            ll4.Q0();
        }
    }

    public final void R0() {
        for (ll4 ll4 = this.L; ll4 != null; ll4 = ll4.B) {
            ll4.R0();
        }
        super.R0();
    }

    public final void S0() {
        super.S0();
        for (ll4 ll4 = this.L; ll4 != null; ll4 = ll4.B) {
            ll4.S0();
        }
    }

    public final void T0(ll4 ll4) {
        this.w = ll4;
        for (ll4 ll42 = this.L; ll42 != null; ll42 = ll42.B) {
            ll42.T0(ll4);
        }
    }

    public final void U0(xz4 xz4) {
        this.D = xz4;
        for (ll4 ll4 = this.L; ll4 != null; ll4 = ll4.B) {
            ll4.U0(xz4);
        }
    }

    public final vo1 V0(vo1 vo1) {
        ll4 ll4;
        ll4 ll42;
        ll4 ll43 = ((ll4) vo1).w;
        if (ll43 != vo1) {
            if (vo1 instanceof ll4) {
                ll4 = (ll4) vo1;
            } else {
                ll4 = null;
            }
            if (ll4 != null) {
                ll42 = ll4.A;
            } else {
                ll42 = null;
            }
            if (ll43 != this.w || !sg3.e(ll42, this)) {
                h.s("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (ll43.J) {
                yb3.b("Cannot delegate to an already attached node");
            }
            ll43.T0(this.w);
            int i = this.y;
            int f = yz4.f(ll43);
            ll43.y = f;
            int i2 = this.y;
            int i3 = f & 2;
            if (!(i3 == 0 || (i2 & 2) == 0 || (this instanceof my3))) {
                yb3.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + ll43);
            }
            ll43.B = this.L;
            this.L = ll43;
            ll43.A = this;
            X0(f | this.y, false);
            if (this.J) {
                if (i3 == 0 || (i & 2) != 0) {
                    U0(this.D);
                } else {
                    o00 o00 = rc9.O0(this).a0;
                    this.w.U0((xz4) null);
                    o00.i();
                }
                ll43.L0();
                ll43.R0();
                if (!ll43.J) {
                    yb3.b("autoInvalidateInsertedNode called on unattached node");
                }
                yz4.a(ll43, -1, 1);
            }
        }
        return vo1;
    }

    public final void W0(vo1 vo1) {
        ll4 ll4 = null;
        for (ll4 ll42 = this.L; ll42 != null; ll42 = ll42.B) {
            if (ll42 == vo1) {
                boolean z = ll42.J;
                if (z) {
                    hp4 hp4 = yz4.a;
                    if (!z) {
                        yb3.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    yz4.a(ll42, -1, 2);
                    ll42.S0();
                    ll42.M0();
                }
                ll42.T0(ll42);
                ll42.z = 0;
                ll4 ll43 = ll42.B;
                if (ll4 == null) {
                    this.L = ll43;
                } else {
                    ll4.B = ll43;
                }
                ll42.B = null;
                ll42.A = null;
                int i = this.y;
                int f = yz4.f(this);
                X0(f, true);
                if (this.J && (i & 2) != 0 && (f & 2) == 0) {
                    o00 o00 = rc9.O0(this).a0;
                    this.w.U0((xz4) null);
                    o00.i();
                    return;
                }
                return;
            }
            ll4 = ll42;
        }
        ta1.l("Could not find delegate: ", vo1);
    }

    public final void X0(int i, boolean z) {
        int i2;
        ll4 ll4;
        int i3 = this.y;
        this.y = i;
        if (i3 != i) {
            ll4 ll42 = this.w;
            if (ll42 == this) {
                this.z = i;
            }
            boolean z2 = this.J;
            this = this;
            if (z2) {
                while (this != null) {
                    i |= this.y;
                    this.y = i;
                    if (this == ll42) {
                        break;
                    }
                    this = this.A;
                }
                if (z && this == ll42) {
                    i = yz4.f(ll42);
                    ll42.y = i;
                }
                if (this == null || (ll4 = this.B) == null) {
                    i2 = 0;
                } else {
                    i2 = ll4.z;
                }
                int i4 = i | i2;
                for (ll4 ll43 = this; ll43 != null; ll43 = ll43.A) {
                    i4 |= ll43.y;
                    ll43.z = i4;
                }
            }
        }
    }
}
