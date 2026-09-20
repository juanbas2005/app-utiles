package defpackage;

/* renamed from: qq1  reason: default package */
public final class qq1 implements gs2 {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;

    public /* synthetic */ qq1(String str, ml4 ml4, int i) {
        this.w = 4;
        this.x = str;
        this.y = ml4;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.w;
        boolean z = true;
        vs7 vs7 = vs7.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        boolean z2 = false;
        switch (i) {
            case b85.b:
                pi0 pi0 = (pi0) obj3;
                vj1 vj1 = (vj1) obj2;
                if (!sg3.e((vj1) obj, (pi0) obj4) || !sg3.e(vj1, pi0)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                yt2 yt2 = (yt2) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !yt2.F()) {
                    ((uu1) obj4).C.u((zs4) obj3, yt2, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 2:
                yt2 yt22 = (yt2) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !yt22.F()) {
                    x91.h((oe6) obj4, (fw0) obj3, yt22, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 3:
                yt2 yt23 = (yt2) obj;
                zs4 zs4 = (zs4) obj4;
                if ((((Number) obj2).intValue() & 3) != 2 || !yt23.F()) {
                    qt4 qt4 = zs4.x;
                    qt4.getClass();
                    ((gx0) qt4).B.C((fk) obj3, zs4, yt23, 0);
                } else {
                    yt23.Y();
                }
                return vs7;
            case 4:
                ((Integer) obj2).getClass();
                i35.t((String) obj4, (ml4) obj3, (yt2) obj, b85.v(1));
                return vs7;
            case 5:
                int intValue = ((Integer) obj2).intValue();
                int i2 = intValue & 1;
                if ((intValue & 3) == 2) {
                    z = false;
                }
                yt2 yt24 = (yt2) obj;
                if (yt24.V(i2, z)) {
                    vn.c(su0.J(2104559859, new zi8(2, (jb9) obj4), yt24), (ml4) null, su0.J(23976181, new m49(0, (sr2) obj3), yt24), (hs2) null, 0.0f, (aa8) null, (fk7) null, (la5) null, yt24, 390, 506);
                } else {
                    yt24.Y();
                }
                return vs7;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = intValue2 & 1;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                yt2 yt25 = (yt2) obj;
                if (yt25.V(i3, z2)) {
                    vn.c(su0.J(1620876422, new zi8(3, (String) obj4), yt25), (ml4) null, su0.J(-453144380, new m49(1, (sr2) obj3), yt25), (hs2) null, 0.0f, (aa8) null, (fk7) null, (la5) null, yt25, 390, 506);
                } else {
                    yt25.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ qq1(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
