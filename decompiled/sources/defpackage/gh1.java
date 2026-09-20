package defpackage;

/* renamed from: gh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gh1 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;

    public /* synthetic */ gh1(String str, int i) {
        this.w = i;
        this.x = str;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        boolean z2;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        boolean z3 = false;
        switch (i2) {
            case b85.b:
                dk7 dk7 = (dk7) obj;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        z = yt2.g(dk7);
                    } else {
                        z = yt2.i(dk7);
                    }
                    if (z) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z3 = true;
                }
                if (yt2.V(intValue & 1, z3)) {
                    String str = this.x;
                    ak7.b(dk7, str, (ml4) null, 0.0f, (pq6) null, 0, 0, su0.J(1330618970, new q20(str, 4), yt2), yt2, intValue & 14);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                fa6 fa6 = (fa6) obj;
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z3 = true;
                }
                if (yt22.V(intValue2 & 1, z3)) {
                    yf7.b(this.x, (ml4) null, 0, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 0, 0, 262142);
                } else {
                    yt22.Y();
                }
                return vs7;
            default:
                yt2 yt23 = (yt2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xk) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt23.V(intValue3 & 1, z2)) {
                    String str2 = this.x;
                    if (str2 == null) {
                        yt23.e0(1963969311);
                        yt23.r(false);
                    } else {
                        yt23.e0(1963969312);
                        t37 t37 = ch4.b;
                        yt2 yt24 = yt23;
                        yf7.b(str2, (ml4) null, ((zg4) yt23.k(t37)).a.w, 0, (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, ((zg4) yt23.k(t37)).b.l, yt24, 0, 0, 131066);
                        yt24.r(false);
                    }
                } else {
                    yt23.Y();
                }
                return vs7;
        }
    }
}
