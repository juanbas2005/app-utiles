package defpackage;

import java.util.List;

/* renamed from: yl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yl {
    public static final yb5 a;

    static {
        a42 a42 = a42.w;
        a = new yb5(a42, a42);
    }

    public static final void a(vl vlVar, List list, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        vl vlVar2 = vlVar;
        List list2 = list;
        yt2 yt22 = yt2;
        int i5 = i;
        yt22.g0(-1794596951);
        if ((i5 & 6) == 0) {
            if (yt22.g(vlVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 48) == 0) {
            if (yt22.i(list2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            int size = list2.size();
            for (int i6 = 0; i6 < size; i6++) {
                ul ulVar = (ul) list2.get(i6);
                hs2 hs2 = (hs2) ulVar.a;
                int i7 = ulVar.b;
                int i8 = ulVar.c;
                Object Q = yt22.Q();
                if (Q == ay0.a) {
                    Q = pf.d;
                    yt22.o0(Q);
                }
                lh4 lh4 = (lh4) Q;
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E = gw8.E(yt22, jl4.w);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, lh4);
                g75.Q(tx0.e, yt22, m);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E);
                hs2.u(vlVar2.subSequence(i7, i8).x, yt22, 0);
                yt22.r(true);
            }
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dj7((Object) vlVar2, (Object) list2, i5, 1);
        }
    }
}
