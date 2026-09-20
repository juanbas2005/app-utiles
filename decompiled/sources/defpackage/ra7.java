package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ra7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ra7 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ ds2 C;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ fw0 z;

    public /* synthetic */ ra7(ml4 ml4, boolean z2, o86 o86, boolean z3, sr2 sr2, fw0 fw0) {
        this.A = ml4;
        this.x = z2;
        this.B = o86;
        this.y = z3;
        this.C = sr2;
        this.z = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        long j;
        ml4 ml4;
        int i = this.w;
        vs7 vs7 = vs7.a;
        boolean z3 = false;
        fw0 fw0 = this.z;
        ds2 ds2 = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        switch (i) {
            case b85.b:
                ml4 ml42 = (ml4) obj4;
                oa3 oa3 = (oa3) obj3;
                sr2 sr2 = (sr2) ds2;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (yt2.V(intValue & 1, z3)) {
                    ml4 d = su0.L(ml42, this.x, (ap4) null, oa3, this.y, new s86(4), sr2).d(yu6.a);
                    au0 a = zt0.a(wr.e, xb4.L, yt2, 54);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, d);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, a);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    fw0.u(bu0.a, yt2, 6);
                    yt2.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                rw4 rw4 = (rw4) obj4;
                je2 je2 = (je2) obj3;
                gs2 gs2 = (gs2) ds2;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt22.V(intValue2 & 1, z2)) {
                    boolean z4 = this.x;
                    if (z4) {
                        j = rw4.a;
                    } else {
                        j = rw4.d;
                    }
                    a37 a2 = ru6.a(j, je2, (String) null, yt22, 0, 12);
                    if (gs2 == null || (!this.y && !z4)) {
                        yt22.e0(453016797);
                        yt22.r(false);
                        ml4 = jl4.w;
                    } else {
                        yt22.e0(453015884);
                        Object Q = yt22.Q();
                        if (Q == ay0.a) {
                            Q = new ot4(15);
                            yt22.o0(Q);
                        }
                        AtomicInteger atomicInteger = ck6.a;
                        ml4 = new zq0((vr2) Q);
                        yt22.r(false);
                    }
                    lh4 d2 = mb0.d(xb4.y, false);
                    int hashCode2 = Long.hashCode(yt22.T);
                    vf5 m2 = yt22.m();
                    ml4 E2 = gw8.E(yt22, ml4);
                    ux0.d.getClass();
                    vy0 vy02 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy02);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(tx0.f, yt22, d2);
                    g75.Q(tx0.e, yt22, m2);
                    g75.Q(tx0.g, yt22, Integer.valueOf(hashCode2));
                    g75.O(yt22, tx0.h);
                    g75.Q(tx0.d, yt22, E2);
                    t49.c(b81.g(((jt0) a2.getValue()).a, j41.a), fw0, yt22, 8);
                    yt22.r(true);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ ra7(rw4 rw4, boolean z2, je2 je2, gs2 gs2, boolean z3, fw0 fw0) {
        this.A = rw4;
        this.x = z2;
        this.B = je2;
        this.C = gs2;
        this.y = z3;
        this.z = fw0;
    }
}
