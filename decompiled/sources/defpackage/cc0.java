package defpackage;

import java.io.Serializable;

/* renamed from: cc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cc0 extends ll4 implements vb0, by3 {
    public s41 K;
    public boolean L;

    public static final ly5 V0(cc0 cc0, xz4 xz4, ae aeVar) {
        ly5 ly5;
        if (cc0.J && cc0.L) {
            xz4 N0 = rc9.N0(cc0);
            if (!xz4.c1().J) {
                xz4 = null;
            }
            if (!(xz4 == null || (ly5 = (ly5) aeVar.b()) == null)) {
                return ly5.i(N0.Q(xz4, false).d());
            }
        }
        return null;
    }

    public final Object H(xz4 xz4, ae aeVar, h61 h61) {
        Object L2 = gl0.L(new bc0((Object) this, (Object) xz4, (Serializable) aeVar, (Object) new g20(this, xz4, aeVar, 2), (f61) null, 0), h61);
        if (L2 == p81.w) {
            return L2;
        }
        return vs7.a;
    }

    public final boolean K0() {
        return false;
    }

    public final void l(dy3 dy3) {
        this.L = true;
    }
}
