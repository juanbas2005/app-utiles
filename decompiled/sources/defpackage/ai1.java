package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ai1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ai1 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ai1(lk7 lk7, boolean z2, boolean z3, sr2 sr2, int i) {
        this.z = lk7;
        this.x = z2;
        this.y = z3;
        this.A = sr2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        long j;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i) {
            case b85.b /*0*/:
                String str = (String) obj4;
                ig1 ig1 = (ig1) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    sd2 sd2 = yu6.a;
                    lh4 d = mb0.d(xb4.C, false);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    ml4 E = gw8.E(yt2, sd2);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, d);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    Object Q = yt2.Q();
                    if (Q == ay0.a) {
                        Q = new f81(6);
                        yt2.o0(Q);
                    }
                    AtomicInteger atomicInteger = ck6.a;
                    zq0 zq0 = new zq0((vr2) Q);
                    ig1.getClass();
                    if (this.y) {
                        j = ig1.j;
                    } else if (this.x) {
                        j = ig1.i;
                    } else {
                        j = ig1.g;
                    }
                    yf7.b(str, zq0, ((jt0) ru6.a(j, hj8.H(vm4.y, yt2), (String) null, yt2, 0, 12).getValue()).a, 0, (am2) null, (ea7) null, 0, (rd7) null, new hc7(3), 0, 0, false, 0, 0, (tg7) null, yt2, 0, 0, 261112);
                    yt2.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                ((Integer) obj2).getClass();
                pk3.b((lk7) obj4, this.x, this.y, (sr2) obj3, (yt2) obj, b85.v(1));
                return vs7;
        }
    }

    public /* synthetic */ ai1(String str, ig1 ig1, boolean z2, boolean z3) {
        this.z = str;
        this.A = ig1;
        this.x = z2;
        this.y = z3;
    }
}
