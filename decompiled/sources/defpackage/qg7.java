package defpackage;

import java.util.List;

/* renamed from: qg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qg7 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ sg7 x;

    public /* synthetic */ qg7(sg7 sg7, int i) {
        this.w = i;
        this.x = sg7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0126  */
    public final Object y(Object obj) {
        bg7 bg7;
        tp1 tp1;
        int i = this.w;
        boolean z = true;
        sg7 sg7 = this.x;
        switch (i) {
            case b85.b:
                List list = (List) obj;
                mc5 V0 = sg7.V0();
                tg7 e = tg7.e(sg7.L, jt0.g, 0, (am2) null, (ea7) null, 0, (rd7) null, 0, 0, 16777214);
                ey3 ey3 = V0.o;
                bg7 bg72 = null;
                if (!(ey3 == null || (tp1 = V0.i) == null)) {
                    vl vlVar = new vl(V0.a);
                    if (!(V0.j == null || V0.n == null)) {
                        long j = V0.p & -8589934589L;
                        int i2 = V0.f;
                        boolean z2 = V0.e;
                        int i3 = V0.d;
                        dl2 dl2 = V0.c;
                        a42 a42 = a42.w;
                        tp1 tp12 = tp1;
                        vl vlVar2 = vlVar;
                        dl2 dl22 = dl2;
                        bg7 = new bg7(new ag7(vlVar2, e, a42, i2, z2, i3, tp12, ey3, dl22, j), new pn4(new o9(vlVar2, e, (List) a42, tp12, dl22), j, V0.f, V0.d), V0.l);
                        if (bg7 != null) {
                            list.add(bg7);
                            bg72 = bg7;
                        }
                        if (bg72 == null) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }
                bg7 = null;
                if (bg7 != null) {
                }
                if (bg72 == null) {
                }
                return Boolean.valueOf(z);
            case 1:
                String str = ((vl) obj).x;
                rg7 rg7 = sg7.U;
                if (rg7 == null) {
                    rg7 rg72 = new rg7(sg7.K, str);
                    mc5 mc5 = new mc5(str, sg7.L, sg7.M, sg7.N, sg7.O, sg7.P, sg7.Q);
                    mc5.d(sg7.V0().i);
                    rg72.d = mc5;
                    sg7.U = rg72;
                } else if (!sg3.e(str, rg7.b)) {
                    rg7.b = str;
                    mc5 mc52 = rg7.d;
                    if (mc52 != null) {
                        tg7 tg7 = sg7.L;
                        dl2 dl23 = sg7.M;
                        int i4 = sg7.N;
                        boolean z3 = sg7.O;
                        int i5 = sg7.P;
                        int i6 = sg7.Q;
                        mc52.a = str;
                        mc52.b = tg7;
                        mc52.c = dl23;
                        mc52.d = i4;
                        mc52.e = z3;
                        mc52.f = i5;
                        mc52.g = i6;
                        mc52.s = (mc52.s << 2) | 2;
                        mc52.c();
                    }
                }
                g75.D(sg7);
                su0.B(sg7);
                rc9.e0(sg7);
                return Boolean.TRUE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                rg7 rg73 = sg7.U;
                if (rg73 == null) {
                    z = false;
                } else {
                    rg73.c = booleanValue;
                    g75.D(sg7);
                    su0.B(sg7);
                    rc9.e0(sg7);
                }
                return Boolean.valueOf(z);
        }
    }
}
