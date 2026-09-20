package defpackage;

import java.util.List;

/* renamed from: xf1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xf1 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ xf1(vr2 vr2, hs2 hs2, gs2 gs2, vr2 vr22, String str, List list, String str2, vr2 vr23, int i) {
        this.x = vr2;
        this.y = hs2;
        this.z = gs2;
        this.A = vr22;
        this.B = str;
        this.C = list;
        this.D = str2;
        this.E = vr23;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        String str;
        boolean z3;
        float f;
        int i = this.w;
        boolean z4 = false;
        Object obj3 = ay0.a;
        vs7 vs7 = vs7.a;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        Object obj7 = this.B;
        Object obj8 = this.A;
        Object obj9 = this.z;
        Object obj10 = this.x;
        Object obj11 = this.y;
        switch (i) {
            case b85.b:
                ((Integer) obj2).getClass();
                vr2 vr2 = (vr2) obj10;
                ok2 ok2 = (ok2) obj4;
                vr2 vr22 = vr2;
                vh0 vh0 = (vh0) obj9;
                ig1 ig1 = (ig1) obj5;
                vh0 vh02 = vh0;
                re3 re3 = (re3) obj8;
                kg1 kg1 = (kg1) obj6;
                cg1.a((Long) obj11, vr22, vh02, re3, (rg1) obj7, kg1, ig1, ok2, (yt2) obj, b85.v(1));
                return vs7;
            case 1:
                vr2 vr23 = (vr2) obj10;
                String str2 = (String) obj11;
                aq4 aq4 = (aq4) obj9;
                aq4 aq42 = (aq4) obj8;
                aq4 aq43 = (aq4) obj7;
                aq4 aq44 = (aq4) obj6;
                aq4 aq45 = (aq4) obj5;
                en2 en2 = (en2) obj4;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    boolean g = yt2.g(vr23) | yt2.g(str2) | yt2.g(aq4) | yt2.g(aq42);
                    Object Q = yt2.Q();
                    if (g || Q == obj3) {
                        str = str2;
                        Q = new zo2(vr23, str, aq43, aq44, aq4, aq42);
                        yt2.o0(Q);
                    } else {
                        str = str2;
                    }
                    sr2 sr2 = (sr2) Q;
                    if (str == null || d57.I0((String) aq43.getValue()) || d57.I0((String) aq44.getValue()) || ((Boolean) aq45.getValue()).booleanValue()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    gw8.e(sr2, (ml4) null, z3, (pq6) null, (xd0) null, (la5) null, su0.J(-699354480, new xa7(3, (Object) en2), yt2), yt2, 805306368, 506);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 2:
                ((Integer) obj2).getClass();
                gs2 gs2 = (gs2) obj9;
                String str3 = (String) obj5;
                gs2 gs22 = gs2;
                vr2 vr24 = (vr2) obj8;
                List list = (List) obj6;
                vr2 vr25 = vr24;
                t13.y((vr2) obj10, (hs2) obj11, gs22, vr25, (String) obj7, list, str3, (vr2) obj4, (yt2) obj, b85.v(1));
                return vs7;
            default:
                sk3 sk3 = (sk3) obj11;
                qw6 qw6 = (qw6) obj10;
                sr2 sr22 = (sr2) obj9;
                o81 o81 = (o81) obj8;
                xz1 xz1 = (xz1) obj7;
                ml4 ml4 = (ml4) obj6;
                String str4 = (String) obj5;
                aq4 aq46 = (aq4) obj4;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                }
                if (yt22.V(intValue2 & 1, z4)) {
                    boolean i2 = yt22.i(o81) | yt22.g(xz1);
                    Object Q2 = yt22.Q();
                    if (i2 || Q2 == obj3) {
                        Q2 = new hk3(o81, xz1, 2);
                        yt22.o0(Q2);
                    }
                    sr2 sr23 = (sr2) Q2;
                    Object Q3 = yt22.Q();
                    if (Q3 == obj3) {
                        Q3 = new ns4(aq46, 8);
                        yt22.o0(Q3);
                    }
                    gs2 gs23 = (gs2) Q3;
                    if (str4.equals("NavigationBar")) {
                        f = dl3.c;
                    } else {
                        f = 0.0f;
                    }
                    pk3.e(sk3, qw6, sr22, sr23, gs23, ml4, f, yt22, 24576, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ xf1(vr2 vr2, String str, aq4 aq4, aq4 aq42, aq4 aq43, aq4 aq44, aq4 aq45, en2 en2) {
        this.x = vr2;
        this.y = str;
        this.z = aq4;
        this.A = aq42;
        this.B = aq43;
        this.C = aq44;
        this.D = aq45;
        this.E = en2;
    }

    public /* synthetic */ xf1(sk3 sk3, qw6 qw6, sr2 sr2, o81 o81, xz1 xz1, ml4 ml4, String str, aq4 aq4) {
        this.y = sk3;
        this.x = qw6;
        this.z = sr2;
        this.A = o81;
        this.B = xz1;
        this.C = ml4;
        this.D = str;
        this.E = aq4;
    }

    public /* synthetic */ xf1(Long l, vr2 vr2, vh0 vh0, re3 re3, rg1 rg1, kg1 kg1, ig1 ig1, ok2 ok2, int i) {
        this.y = l;
        this.x = vr2;
        this.z = vh0;
        this.A = re3;
        this.B = rg1;
        this.C = kg1;
        this.D = ig1;
        this.E = ok2;
    }
}
