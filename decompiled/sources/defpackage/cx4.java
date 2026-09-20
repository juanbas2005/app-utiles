package defpackage;

/* renamed from: cx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cx4 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ a37 x;
    public final /* synthetic */ cf4 y;

    public /* synthetic */ cx4(a37 a37, cf4 cf4, int i) {
        this.w = i;
        this.x = a37;
        this.y = cf4;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        cv4 cv4;
        boolean z2;
        rw4 rw4;
        boolean z3;
        ml1 ml1;
        int i = this.w;
        int i2 = 2;
        vs7 vs7 = vs7.a;
        cf4 cf4 = this.y;
        a37 a37 = this.x;
        int i3 = 0;
        switch (i) {
            case b85.b:
                fa6 fa6 = (fa6) obj;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (yt2.g(fa6)) {
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
                    eq4 eq4 = ((kx4) a37.getValue()).a;
                    Object[] objArr = eq4.w;
                    int i4 = eq4.y;
                    while (i3 < i4) {
                        yw4 yw4 = (yw4) objArr[i3];
                        ml4 ml4 = yw4.d;
                        boolean z4 = yw4.a;
                        f5 f5Var = yw4.b;
                        gs2 gs2 = yw4.e;
                        cf4 cf42 = yw4.f;
                        if (cf42 != null) {
                            cv4 = (cv4) cf42.x;
                        } else {
                            cv4 = (cv4) cf4.x;
                        }
                        hv4.b(fa6, z4, f5Var, su0.J(2036857247, new ax4(yw4, 1), yt2), ml4, gs2, cv4, yt2, (intValue & 14) | 3072);
                        i3++;
                    }
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                bu0 bu0 = (bu0) obj;
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    eq4 eq42 = ((kx4) a37.getValue()).a;
                    Object[] objArr2 = eq42.w;
                    int i5 = eq42.y;
                    for (int i6 = 0; i6 < i5; i6++) {
                        yw4 yw42 = (yw4) objArr2[i6];
                        ml4 ml42 = yw42.d;
                        boolean z5 = yw42.a;
                        f5 f5Var2 = yw42.b;
                        gs2 gs22 = yw42.e;
                        cf4 cf43 = yw42.f;
                        if (cf43 != null) {
                            rw4 = (rw4) cf43.y;
                        } else {
                            rw4 = (rw4) cf4.y;
                        }
                        ww4.b(z5, f5Var2, su0.J(715622380, new ax4(yw42, 0), yt22), ml42, gs22, true, rw4, yt22, 384, 0);
                    }
                } else {
                    yt22.Y();
                }
                return vs7;
            default:
                bu0 bu02 = (bu0) obj;
                yt2 yt23 = (yt2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt23.V(intValue3 & 1, z3)) {
                    eq4 eq43 = ((kx4) a37.getValue()).a;
                    Object[] objArr3 = eq43.w;
                    int i7 = eq43.y;
                    while (i3 < i7) {
                        yw4 yw43 = (yw4) objArr3[i3];
                        ml4 ml43 = yw43.d;
                        boolean z6 = yw43.a;
                        f5 f5Var3 = yw43.b;
                        fw0 fw0 = yw43.c;
                        cf4 cf44 = yw43.f;
                        if (cf44 != null) {
                            ml1 = (ml1) cf44.z;
                        } else {
                            ml1 = (ml1) cf4.z;
                        }
                        pv4.d(su0.J(-1790578429, new ax4(yw43, 2), yt23), z6, f5Var3, ml43, fw0, (pq6) null, ml1, yt23, 6);
                        i3++;
                    }
                } else {
                    yt23.Y();
                }
                return vs7;
        }
    }
}
