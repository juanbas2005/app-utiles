package defpackage;

import java.util.List;

/* renamed from: lc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lc7 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ nc7 x;

    public /* synthetic */ lc7(nc7 nc7, int i) {
        this.w = i;
        this.x = nc7;
    }

    public final Object y(Object obj) {
        boolean z;
        boolean z2;
        int i = this.w;
        bg7 bg7 = null;
        nc7 nc7 = this.x;
        switch (i) {
            case b85.b:
                List list = (List) obj;
                bg7 bg72 = nc7.V0().n;
                if (bg72 != null) {
                    ag7 ag7 = bg72.a;
                    bg7 bg73 = new bg7(new ag7(ag7.a, tg7.e(nc7.L, jt0.g, 0, (am2) null, (ea7) null, 0, (rd7) null, 0, 0, 16777214), ag7.c, ag7.d, ag7.e, ag7.f, ag7.g, ag7.h, ag7.i, ag7.j), bg72.b, bg72.c);
                    list.add(bg73);
                    bg7 = bg73;
                }
                if (bg7 != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                vl vlVar = (vl) obj;
                mc7 mc7 = nc7.Y;
                a42 a42 = a42.w;
                if (mc7 == null) {
                    mc7 mc72 = new mc7(nc7.K, vlVar);
                    rn4 rn4 = new rn4(vlVar, nc7.L, nc7.M, nc7.O, nc7.P, nc7.Q, nc7.R, a42);
                    rn4.d(nc7.V0().j);
                    mc72.d = rn4;
                    nc7.Y = mc72;
                } else if (!sg3.e(vlVar, mc7.b)) {
                    mc7.b = vlVar;
                    rn4 rn42 = mc7.d;
                    if (rn42 != null) {
                        tg7 tg7 = nc7.L;
                        dl2 dl2 = nc7.M;
                        int i2 = nc7.O;
                        boolean z3 = nc7.P;
                        int i3 = nc7.Q;
                        int i4 = nc7.R;
                        rn42.a = vlVar;
                        boolean c = tg7.c(rn42.k);
                        rn42.k = tg7;
                        if (!c) {
                            rn42.q <<= 2;
                            rn42.l = null;
                            rn42.n = null;
                            rn42.p = -1;
                            rn42.o = -1;
                        }
                        rn42.b = dl2;
                        rn42.c = i2;
                        rn42.d = z3;
                        rn42.e = i3;
                        rn42.f = i4;
                        rn42.g = a42;
                        rn42.q = (rn42.q << 2) | 2;
                        rn42.l = null;
                        rn42.n = null;
                        rn42.p = -1;
                        rn42.o = -1;
                    }
                }
                g75.D(nc7);
                su0.B(nc7);
                rc9.e0(nc7);
                return Boolean.TRUE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mc7 mc73 = nc7.Y;
                if (mc73 == null) {
                    z2 = false;
                } else {
                    vr2 vr2 = nc7.U;
                    if (vr2 != null) {
                        vr2.y(mc73);
                    }
                    mc7 mc74 = nc7.Y;
                    if (mc74 != null) {
                        mc74.c = booleanValue;
                    }
                    g75.D(nc7);
                    su0.B(nc7);
                    rc9.e0(nc7);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
