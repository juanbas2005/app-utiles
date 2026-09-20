package defpackage;

/* renamed from: iw0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iw0 implements hs2 {
    public static final iw0 A = new iw0(3);
    public static final iw0 x = new iw0(0);
    public static final iw0 y = new iw0(1);
    public static final iw0 z = new iw0(2);
    public final /* synthetic */ int w;

    public /* synthetic */ iw0(int i) {
        this.w = i;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.w;
        jl4 jl4 = jl4.w;
        boolean z2 = true;
        int i2 = 2;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                long j = ((jt0) obj).a;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (yt2.f(j)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) == 18) {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    d83.a(p25.o(), (String) null, yu6.l(jl4, 18.0f), j, yt2, ((intValue << 9) & 7168) | 432, 0);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                long j2 = ((jt0) obj).a;
                yt2 yt22 = (yt2) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if (yt22.f(j2)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) == 18) {
                    z2 = false;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    d83.a(r16.G(), (String) null, yu6.l(jl4, 18.0f), j2, yt22, ((intValue2 << 9) & 7168) | 432, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 2:
                zs4 zs4 = (zs4) obj;
                yt2 yt23 = (yt2) obj2;
                ((Number) obj3).intValue();
                return vs7;
            case 3:
                return vs7;
            default:
                tx5 tx5 = (tx5) obj;
                yt2 yt24 = (yt2) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 14) == 0) {
                    if (yt24.g(tx5)) {
                        i2 = 4;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 91) != 18 || !yt24.F()) {
                    mt mtVar = (mt) tx5.b.M.getValue();
                    if (mtVar instanceof kt) {
                        yt24.f0(1739512213);
                        ie1.k.C(tx5, mtVar, yt24, Integer.valueOf((intValue3 & 14) | 64));
                        yt24.r(false);
                        return vs7;
                    }
                    if (mtVar instanceof lt) {
                        yt24.f0(1739605461);
                        yt24.r(false);
                    } else if (mtVar instanceof jt) {
                        yt24.f0(1739696601);
                        ie1.l.C(tx5, mtVar, yt24, Integer.valueOf((intValue3 & 14) | 64));
                        yt24.r(false);
                        return vs7;
                    } else if (mtVar instanceof ht) {
                        yt24.f0(1739782316);
                        yt24.r(false);
                    } else {
                        yt24.f0(-82435959);
                        yt24.r(false);
                        h.c();
                        return null;
                    }
                    k75.c(tx5, (ml4) null, (vb5) null, (jb) null, (j51) null, 0.0f, false, yt24, intValue3 & 14);
                    return vs7;
                }
                yt24.Y();
                return vs7;
        }
    }
}
