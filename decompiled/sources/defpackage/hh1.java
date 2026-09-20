package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hh1 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ hh1(sr2 sr2, ml4 ml4, boolean z2, x83 x83, String str) {
        this.y = sr2;
        this.z = ml4;
        this.x = z2;
        this.A = x83;
        this.B = str;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        long j;
        ml4 ml4;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (i) {
            case b85.b:
                sr2 sr2 = (sr2) obj6;
                ml4 ml42 = (ml4) obj5;
                x83 x83 = (x83) obj4;
                String str = (String) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(1 & intValue, z2)) {
                    hj8.e(sr2, ml42, this.x, (a83) null, (pq6) null, su0.J(-1301085432, new nh1(x83, str, 0), yt2), yt2, 1572864, 56);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                cv4 cv4 = (cv4) obj6;
                je2 je2 = (je2) obj5;
                gs2 gs2 = (gs2) obj4;
                fw0 fw0 = (fw0) obj3;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt22.V(intValue2 & 1, z3)) {
                    if (this.x) {
                        j = cv4.a;
                    } else {
                        j = cv4.d;
                    }
                    a37 a = ru6.a(j, je2, (String) null, yt22, 0, 12);
                    if (gs2 != null) {
                        yt22.e0(-634794445);
                        Object Q = yt22.Q();
                        if (Q == ay0.a) {
                            Q = new ot4(10);
                            yt22.o0(Q);
                        }
                        AtomicInteger atomicInteger = ck6.a;
                        ml4 = new zq0((vr2) Q);
                        yt22.r(false);
                    } else {
                        yt22.e0(-634793532);
                        yt22.r(false);
                        ml4 = jl4.w;
                    }
                    lh4 d = mb0.d(xb4.y, false);
                    int hashCode = Long.hashCode(yt22.T);
                    vf5 m = yt22.m();
                    ml4 E = gw8.E(yt22, ml4);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(tx0.f, yt22, d);
                    g75.Q(tx0.e, yt22, m);
                    g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                    g75.O(yt22, tx0.h);
                    g75.Q(tx0.d, yt22, E);
                    t49.c(b81.g(((jt0) a.getValue()).a, j41.a), fw0, yt22, 8);
                    yt22.r(true);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ hh1(cv4 cv4, boolean z2, je2 je2, gs2 gs2, fw0 fw0) {
        this.y = cv4;
        this.x = z2;
        this.z = je2;
        this.A = gs2;
        this.B = fw0;
    }
}
