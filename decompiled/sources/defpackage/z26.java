package defpackage;

import java.util.List;

/* renamed from: z26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class z26 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    public /* synthetic */ z26(int i, int i2) {
        this.w = i2;
        this.x = i;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.w;
        int i2 = 2;
        vs7 vs7 = vs7.a;
        int i3 = this.x;
        boolean z4 = false;
        switch (i) {
            case b85.b:
                List list = (List) obj;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                list.getClass();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        z2 = yt2.g(list);
                    } else {
                        z2 = yt2.i(list);
                    }
                    if (z2) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    d63 d63 = d63.Q;
                    zx0 zx0 = new zx0(new xa7(0, (Object) (wa7) list.get(i3)));
                    int i4 = x08.b;
                    d63.j(zx0, 3.0f, x08.f(uq3.d(4279381056L), uq3.d(4293127927L)), yt2, 3120, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((pb0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!yt22.V(intValue2 & 1, z3)) {
                    yt22.Y();
                } else if (i3 == 0 || i3 == 1) {
                    yt22.e0(273258273);
                    mp7.f((ml4) null, ((zg4) yt22.k(ch4.b)).a.b, 0, su0.J(1705070613, new z26(i3, 2), yt22), yt22, 3072);
                    yt22.r(false);
                } else {
                    yt22.e0(273400501);
                    yt22.r(false);
                }
                return vs7;
            default:
                yt2 yt23 = (yt2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z4 = true;
                }
                if (yt23.V(intValue3 & 1, z4)) {
                    yf7.b(String.valueOf(i3 + 1), (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 0, 0, 262142);
                } else {
                    yt23.Y();
                }
                return vs7;
        }
    }
}
