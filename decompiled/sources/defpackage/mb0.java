package defpackage;

/* renamed from: mb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mb0 {
    public static final tp4 a = c(true);
    public static final tp4 b = c(false);
    public static final pf c = pf.g;

    static {
        new ob0(xb4.y, false);
    }

    public static final void a(ml4 ml4, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        yt2.g0(-211209833);
        if ((i & 6) == 0) {
            if (yt2.g(ml4)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            int hashCode = Long.hashCode(yt2.T);
            ml4 E = gw8.E(yt2, ml4);
            vf5 m = yt2.m();
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, c);
            g75.Q(tx0.e, yt2, m);
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            yt2.r(true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new gf(ml4, i);
        }
    }

    public static final void b(dh5 dh5, eh5 eh5, gh4 gh4, ey3 ey3, int i, int i2, jb jbVar) {
        lb0 lb0;
        i80 i80;
        i80 i802;
        Object B = gh4.B();
        if (B instanceof lb0) {
            lb0 = (lb0) B;
        } else {
            lb0 = null;
        }
        if (lb0 == null || (i802 = lb0.K) == null) {
            i80 = jbVar;
        } else {
            i80 = i802;
        }
        dh5.j(dh5, eh5, i80.a((((long) eh5.w) << 32) | (((long) eh5.x) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), ey3));
    }

    public static final tp4 c(boolean z) {
        tp4 tp4 = new tp4(9);
        i80 i80 = xb4.y;
        tp4.m(i80, new ob0(i80, z));
        i80 i802 = xb4.z;
        tp4.m(i802, new ob0(i802, z));
        i80 i803 = xb4.A;
        tp4.m(i803, new ob0(i803, z));
        i80 i804 = xb4.B;
        tp4.m(i804, new ob0(i804, z));
        i80 i805 = xb4.C;
        tp4.m(i805, new ob0(i805, z));
        i80 i806 = xb4.D;
        tp4.m(i806, new ob0(i806, z));
        i80 i807 = xb4.E;
        tp4.m(i807, new ob0(i807, z));
        i80 i808 = xb4.F;
        tp4.m(i808, new ob0(i808, z));
        i80 i809 = xb4.G;
        tp4.m(i809, new ob0(i809, z));
        return tp4;
    }

    public static final lh4 d(jb jbVar, boolean z) {
        tp4 tp4;
        if (z) {
            tp4 = a;
        } else {
            tp4 = b;
        }
        lh4 lh4 = (lh4) tp4.g(jbVar);
        if (lh4 == null) {
            return new ob0(jbVar, z);
        }
        return lh4;
    }
}
