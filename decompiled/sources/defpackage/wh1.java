package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wh1 implements gs2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String w;
    public final /* synthetic */ ig1 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ wh1(String str, ig1 ig1, boolean z2, boolean z3, boolean z4) {
        this.w = str;
        this.x = ig1;
        this.y = z2;
        this.z = z3;
        this.A = z4;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            ml4 i = yu6.i(jl4.w, h03.x, h03.v);
            lh4 d = mb0.d(xb4.C, false);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, i);
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
            ig1 ig1 = this.x;
            long j = ig1.o;
            boolean z3 = this.z;
            boolean z4 = this.A;
            if (z3 && z4) {
                j = ig1.p;
            } else if (z3 && !z4) {
                j = ig1.q;
            } else if (this.y && z4) {
                j = ig1.t;
            } else if (z4) {
                j = ig1.n;
            }
            long j2 = j;
            yt2.e0(-969442410);
            a37 a = ru6.a(j2, hj8.H(vm4.y, yt2), (String) null, yt2, 0, 12);
            yt2.r(false);
            yt2 yt22 = yt2;
            yf7.b(this.w, zq0, ((jt0) a.getValue()).a, 0, (am2) null, (ea7) null, 0, (rd7) null, new hc7(3), 0, 0, false, 0, 0, (tg7) null, yt22, 0, 0, 261112);
            yt22.r(true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
