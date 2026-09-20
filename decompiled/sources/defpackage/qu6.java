package defpackage;

/* renamed from: qu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qu6 extends in8 {
    public up4 A;
    public xk6 B;
    public final ay5 C = new ay5(13, (Object) this);
    public final c9 D;
    public Object x;
    public Object y;
    public up4 z;

    public qu6() {
        super(7);
        ph6 ph6 = new ph6(6, this);
        nx6.e(nx6.a);
        synchronized (nx6.c) {
            nx6.h = dt0.N0(nx6.h, ph6);
        }
        this.D = new c9(16, ph6);
    }

    public final void A0(xk6 xk6) {
        this.y = null;
        this.A = null;
    }

    public final void B0() {
        synchronized (this.w) {
            try {
                this.x = this.y;
                if (this.A == null) {
                    this.z = null;
                } else {
                    if (this.z == null) {
                        up4 up4 = cg6.a;
                        this.z = new up4();
                    }
                    up4 up42 = this.z;
                    this.z = this.A;
                    this.A = up42;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C0() {
        this.D.h();
        this.y = null;
        this.A = null;
        synchronized (this.w) {
            this.B = null;
            this.x = null;
            this.z = null;
        }
    }

    public final vr2 L0(xk6 xk6) {
        xk6 xk62 = this.B;
        if (xk62 != null && !xk62.equals(xk6)) {
            vm5.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.B = xk6;
        return this.C;
    }

    public final void N0(en0 en0) {
        this.B = null;
        this.y = null;
        this.A = null;
        B0();
    }
}
