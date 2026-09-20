package defpackage;

/* renamed from: m67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class m67 {
    public static final s63 a = new s63(10);
    public static final Object b = new Object();

    public static final void a(ml4 ml4, gs2 gs2, yt2 yt2, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        yt2.g0(-1298353104);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (yt2.g(ml4)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.i(gs2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            if (i6 != 0) {
                ml4 = jl4.w;
            }
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                Q = new p67(kw5.H);
                yt2.o0(Q);
            }
            b((p67) Q, ml4, gs2, yt2, (i3 << 3) & 1008);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new l67(ml4, gs2, i, i2);
        }
    }

    public static final void b(p67 p67, ml4 ml4, gs2 gs2, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        yt2.g0(-511989831);
        if ((i & 6) == 0) {
            if (yt2.i(p67)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.g(ml4)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (yt2.i(gs2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            int hashCode = Long.hashCode(yt2.T);
            wt2 E = kl8.E(yt2);
            ml4 E2 = gw8.E(yt2, ml4);
            vf5 m = yt2.m();
            vy0 vy0 = vy0.I;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(p67.c, yt2, p67);
            g75.Q(p67.d, yt2, E);
            g75.Q(p67.e, yt2, gs2);
            ux0.d.getClass();
            g75.Q(tx0.e, yt2, m);
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E2);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            yt2.r(true);
            if (!yt2.F()) {
                yt2.e0(-1259245908);
                boolean i6 = yt2.i(p67);
                Object Q = yt2.Q();
                if (i6 || Q == ay0.a) {
                    Q = new kh(15, p67);
                    yt2.o0(Q);
                }
                t49.l((sr2) Q, yt2);
                yt2.r(false);
            } else {
                yt2.e0(-1259187287);
                yt2.r(false);
            }
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new nf(p67, ml4, gs2, i, 1);
        }
    }
}
