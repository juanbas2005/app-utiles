package defpackage;

import java.util.List;

/* renamed from: zp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zp5 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int w = 3;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ zp5(aq4 aq4, im7 im7, im7 im72, a37 a37, fw0 fw0, dk7 dk7) {
        this.x = aq4;
        this.y = im7;
        this.z = im72;
        this.A = a37;
        this.B = fw0;
        this.C = dk7;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.A;
        Object obj6 = this.z;
        Object obj7 = this.y;
        Object obj8 = this.x;
        switch (i) {
            case b85.b:
                vs7 vs72 = vs7;
                ((Integer) obj2).getClass();
                mp7.L((String) obj8, (if7) obj7, (vr2) obj6, (sr2) obj5, (sr2) obj4, (sr2) obj3, (yt2) obj, b85.v(1));
                return vs72;
            case 1:
                vs7 vs73 = vs7;
                ((Integer) obj2).getClass();
                d36.s((List) obj7, (String) obj8, (String) obj6, (Long) obj5, (Long) obj4, (gs2) obj3, (yt2) obj, b85.v(1));
                return vs73;
            case 2:
                vs7 vs74 = vs7;
                ((Integer) obj2).getClass();
                q17.f((String) obj8, (vr2) obj6, (String) obj7, (ml4) obj5, (m78) obj4, (gs2) obj3, (yt2) obj, b85.v(12804145));
                return vs74;
            default:
                aq4 aq4 = (aq4) obj8;
                a37 a37 = (a37) obj7;
                a37 a372 = (a37) obj6;
                a37 a373 = (a37) obj5;
                fw0 fw0 = (fw0) obj4;
                dk7 dk7 = (dk7) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    Object Q = yt2.Q();
                    d63 d63 = ay0.a;
                    if (Q == d63) {
                        Q = new t46(aq4, 16);
                        yt2.o0(Q);
                    }
                    jl4 jl4 = jl4.w;
                    ml4 I = h49.I(jl4, (vr2) Q);
                    i80 i80 = xb4.y;
                    lh4 d = mb0.d(i80, false);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, I);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt2, d);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt2, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt2, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt2, ceVar);
                    vs7 vs75 = vs7;
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt2, E);
                    yt2.c0(-1350495383, Integer.valueOf(((Number) a373.getValue()).intValue()));
                    boolean g = yt2.g(a37) | yt2.g(a372);
                    Object Q2 = yt2.Q();
                    if (g || Q2 == d63) {
                        Q2 = new vv5(a37, a372, 1);
                        yt2.o0(Q2);
                    }
                    ml4 X = mp7.X(jl4, (vr2) Q2);
                    lh4 d2 = mb0.d(i80, false);
                    int hashCode2 = Long.hashCode(yt2.T);
                    vf5 m2 = yt2.m();
                    ml4 E2 = gw8.E(yt2, X);
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(ckVar, yt2, d2);
                    g75.Q(ckVar2, yt2, m2);
                    f21.s(hashCode2, yt2, ckVar3, yt2, ceVar);
                    g75.Q(ckVar4, yt2, E2);
                    fw0.u(dk7, yt2, 6);
                    yt2.r(true);
                    yt2.r(false);
                    yt2.r(true);
                    return vs75;
                }
                vs7 vs76 = vs7;
                yt2.Y();
                return vs76;
        }
    }

    public /* synthetic */ zp5(String str, vr2 vr2, String str2, ml4 ml4, m78 m78, gs2 gs2, int i) {
        this.x = str;
        this.z = vr2;
        this.y = str2;
        this.A = ml4;
        this.B = m78;
        this.C = gs2;
    }

    public /* synthetic */ zp5(String str, if7 if7, vr2 vr2, sr2 sr2, sr2 sr22, sr2 sr23, int i) {
        this.x = str;
        this.y = if7;
        this.z = vr2;
        this.A = sr2;
        this.B = sr22;
        this.C = sr23;
    }

    public /* synthetic */ zp5(List list, String str, String str2, Long l, Long l2, gs2 gs2, int i) {
        this.y = list;
        this.x = str;
        this.z = str2;
        this.A = l;
        this.B = l2;
        this.C = gs2;
    }
}
