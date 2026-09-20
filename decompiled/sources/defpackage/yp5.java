package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: yp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yp5 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ yp5(boolean z, int i) {
        this.w = i;
        this.x = z;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4 = this.w;
        vs7 vs7 = vs7.a;
        boolean z2 = false;
        boolean z3 = this.x;
        switch (i4) {
            case b85.b:
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (yt2.V(intValue & 1, z2)) {
                    if (z3) {
                        i = R.string.sign_up;
                    } else {
                        i = R.string.sign_in;
                    }
                    yf7.b(l55.u(i, yt2), (ml4) null, ((zg4) yt2.k(ch4.b)).a.a, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 0, 0, 262138);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    if (z3) {
                        i2 = 112361270;
                        i3 = R.string.button_stop_test;
                    } else {
                        i2 = 112362775;
                        i3 = R.string.button_start_test;
                    }
                    yt2 yt23 = yt22;
                    yf7.b(hl6.l(yt22, i2, i3, yt22, false), (ml4) null, 0, ya5.k(14), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597440, 0, 262062);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
