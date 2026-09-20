package defpackage;

import java.util.List;

/* renamed from: q23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class q23 extends ll4 implements ln7, tk5, ry0 {
    public qx1 K;
    public nh L;
    public boolean M;

    public q23(nh nhVar, qx1 qx1) {
        this.K = qx1;
        this.L = nhVar;
    }

    public final void I() {
        Z0();
    }

    public final void O0() {
        Z0();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h06] */
    public final void V0() {
        nh nhVar;
        ? obj = new Object();
        h75.u(this, new xc4((h06) obj));
        q23 q23 = (q23) obj.w;
        if (q23 == null || (nhVar = q23.L) == null) {
            nhVar = this.L;
        }
        W0(nhVar);
    }

    public abstract void W0(ok5 ok5);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, d06] */
    public final void X0() {
        ? obj = new Object();
        obj.w = true;
        h75.w(this, new tx1(obj));
        if (obj.w) {
            V0();
        }
    }

    public abstract boolean Y0(int i);

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, h06] */
    public final void Z0() {
        if (this.M) {
            this.M = false;
            if (this.J) {
                ? obj = new Object();
                h75.u(this, new be(1, obj));
                q23 q23 = (q23) obj.w;
                if (q23 != null) {
                    q23.V0();
                } else {
                    W0((ok5) null);
                }
            }
        }
    }

    public final long n() {
        if (this.K == null) {
            return sk7.a;
        }
        tp1 tp1 = rc9.O0(this).T;
        int i = sk7.b;
        return ts2.m(tp1.r0(10.0f), tp1.r0(40.0f), tp1.r0(10.0f), tp1.r0(40.0f));
    }

    public final void y(kk5 kk5, lk5 lk5, long j) {
        if (lk5 == lk5.x) {
            List list = kk5.a;
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (Y0(((qk5) list.get(i)).i)) {
                    int i2 = kk5.f;
                    if (i2 == 4) {
                        this.M = true;
                        X0();
                        return;
                    } else if (i2 == 5) {
                        Z0();
                        return;
                    } else {
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
    }
}
