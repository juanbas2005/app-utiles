package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* renamed from: p87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class p87 implements gs2 {
    public final /* synthetic */ ua0 A;
    public final /* synthetic */ float B;
    public final /* synthetic */ fw0 C;
    public final /* synthetic */ ml4 w;
    public final /* synthetic */ pq6 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ float z;

    public /* synthetic */ p87(ml4 ml4, pq6 pq6, long j, float f, ua0 ua0, float f2, fw0 fw0) {
        this.w = ml4;
        this.x = pq6;
        this.y = j;
        this.z = f;
        this.A = ua0;
        this.B = f2;
        this.C = fw0;
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
        boolean V = yt2.V(intValue & 1, z2);
        vs7 vs7 = vs7.a;
        if (V) {
            ml4 d = s87.d(this.w, this.x, s87.e(this.y, this.z, yt2), this.A, ((tp1) yt2.k(xy0.h)).e0(this.B));
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = new nf6(27);
                yt2.o0(Q);
            }
            ml4 a = ck6.a(d, false, (vr2) Q);
            Object Q2 = yt2.Q();
            if (Q2 == d63) {
                Q2 = un.c;
                yt2.o0(Q2);
            }
            ml4 a2 = d97.a(a, vs7, (PointerInputEventHandler) Q2);
            lh4 d2 = mb0.d(xb4.y, true);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, a2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, d2);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            f21.r(0, this.C, yt2, true);
            return vs7;
        }
        yt2.Y();
        return vs7;
    }
}
