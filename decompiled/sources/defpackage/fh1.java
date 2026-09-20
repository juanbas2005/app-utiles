package defpackage;

import java.io.Serializable;

/* renamed from: fh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fh1 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ long x;
    public final /* synthetic */ Serializable y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fh1(d06 d06, long j, g06 g06, zw5 zw5, g06 g062, g06 g063, h06 h06, h06 h062, h06 h063) {
        this.y = d06;
        this.x = j;
        this.z = g06;
        this.A = zw5;
        this.B = g062;
        this.C = g063;
        this.D = h06;
        this.E = h062;
        this.F = h063;
    }

    public final Object H(Object obj, Object obj2) {
        long j;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        Object obj7 = this.B;
        Object obj8 = this.A;
        Object obj9 = this.z;
        Serializable serializable = this.y;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                int v = b85.v(1);
                Long l = (Long) serializable;
                vr2 vr2 = (vr2) obj9;
                rg1 rg1 = (rg1) obj5;
                vr2 vr22 = vr2;
                vr2 vr23 = (vr2) obj8;
                re3 re3 = (re3) obj6;
                gi1.c(l, this.x, vr22, vr23, (vh0) obj7, re3, rg1, (kg1) obj4, (ig1) obj3, (yt2) obj, v);
                return vs7;
            default:
                d06 d06 = (d06) serializable;
                g06 g06 = (g06) obj9;
                zw5 zw5 = (zw5) obj8;
                g06 g062 = (g06) obj7;
                g06 g063 = (g06) obj6;
                h06 h06 = (h06) obj5;
                h06 h062 = (h06) obj4;
                h06 h063 = (h06) obj3;
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue != 1) {
                    if (intValue != 10) {
                        return vs7;
                    }
                    if (longValue >= 4) {
                        zw5.skip(4);
                        ya5.r(zw5, (int) (longValue - 4), new yf8(h06, zw5, h062, h063));
                        return vs7;
                    }
                    rf2.i("bad zip: NTFS extra too short");
                } else if (!d06.w) {
                    d06.w = true;
                    if (longValue >= this.x) {
                        long j2 = g06.w;
                        if (j2 == 4294967295L) {
                            j2 = zw5.l();
                        }
                        g06.w = j2;
                        long j3 = 0;
                        if (g062.w == 4294967295L) {
                            j = zw5.l();
                        } else {
                            j = 0;
                        }
                        g062.w = j;
                        if (g063.w == 4294967295L) {
                            j3 = zw5.l();
                        }
                        g063.w = j3;
                        return vs7;
                    }
                    rf2.i("bad zip: zip64 extra too short");
                } else {
                    rf2.i("bad zip: zip64 extra repeated");
                }
                return null;
        }
    }

    public /* synthetic */ fh1(Long l, long j, vr2 vr2, vr2 vr22, vh0 vh0, re3 re3, rg1 rg1, kg1 kg1, ig1 ig1, int i) {
        this.y = l;
        this.x = j;
        this.z = vr2;
        this.A = vr22;
        this.B = vh0;
        this.C = re3;
        this.D = rg1;
        this.E = kg1;
        this.F = ig1;
    }
}
