package defpackage;

import java.util.WeakHashMap;

/* renamed from: qm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qm1 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gx4 x;

    public /* synthetic */ qm1(gx4 gx4, int i) {
        this.w = i;
        this.x = gx4;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        aa8 aa8;
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z2 = false;
        gx4 gx4 = this.x;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (yt2.V(intValue & 1, z2)) {
                    fx4.g(su0.J(-928075652, new qm1(gx4, 1), yt2), gx4.c, gx4.g, su0.J(-1546045569, new qm1(gx4, 2), yt2), yt2, 3078);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    fx4.c((ml4) null, gx4.c, gx4.d, gx4.a, yt22, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
            default:
                ix4 ix4 = gx4.g;
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt23.V(intValue3 & 1, z)) {
                    if (((jx4) ix4.b.getValue()) != jx4.x || ix4.a.e()) {
                        yt23.e0(986168274);
                        String str = gx4.c;
                        if (str.equals("NavigationBar")) {
                            yt23.e0(308911219);
                            WeakHashMap weakHashMap = ib8.w;
                            aa8 = new e64(new e64(new ss7(n63.h(yt23).g, n63.h(yt23).b), 15 | 32), 32);
                            yt23.r(false);
                        } else if (str.equals("NavigationRail")) {
                            yt23.e0(308919762);
                            WeakHashMap weakHashMap2 = ib8.w;
                            aa8 = new e64(new e64(new ss7(n63.h(yt23).g, n63.h(yt23).b), 48 | 9), 9);
                            yt23.r(false);
                        } else if (str.equals("NavigationDrawer")) {
                            yt23.e0(308927996);
                            e64 e64 = new e64(tz1.a(yt23), 9);
                            yt23.r(false);
                            aa8 = e64;
                        } else {
                            yt23.e0(308930349);
                            yt23.r(false);
                            aa8 = fx4.a;
                        }
                        yt23.r(false);
                    } else {
                        yt23.e0(986028309);
                        yt23.r(false);
                        aa8 = fx4.a;
                    }
                    ml4 r = x91.r(aa8);
                    lh4 d = mb0.d(xb4.y, false);
                    int hashCode = Long.hashCode(yt23.T);
                    vf5 m = yt23.m();
                    ml4 E = gw8.E(yt23, r);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt23.i0();
                    if (yt23.S) {
                        yt23.l(vy0);
                    } else {
                        yt23.r0();
                    }
                    g75.Q(tx0.f, yt23, d);
                    g75.Q(tx0.e, yt23, m);
                    g75.Q(tx0.g, yt23, Integer.valueOf(hashCode));
                    g75.O(yt23, tx0.h);
                    g75.Q(tx0.d, yt23, E);
                    f21.r(0, gx4.h, yt23, true);
                } else {
                    yt23.Y();
                }
                return vs7;
        }
    }
}
