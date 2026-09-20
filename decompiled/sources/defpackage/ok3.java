package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: ok3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ok3 implements is2 {
    public final /* synthetic */ xz1 A;
    public final /* synthetic */ a37 B;
    public final /* synthetic */ List w;
    public final /* synthetic */ qt4 x;
    public final /* synthetic */ sk3 y;
    public final /* synthetic */ o81 z;

    public ok3(w52 w52, qt4 qt4, sk3 sk3, o81 o81, xz1 xz1, a37 a37) {
        this.w = w52;
        this.x = qt4;
        this.y = sk3;
        this.z = o81;
        this.A = xz1;
        this.B = a37;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z2;
        int i2;
        int i3;
        yz3 yz3 = (yz3) obj;
        int intValue = ((Number) obj2).intValue();
        yt2 yt2 = (yt2) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (yt2.g(yz3)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (yt2.e(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i & 1, z2)) {
            lk7 lk7 = (lk7) this.w.get(intValue);
            yt2.e0(-1719949683);
            boolean f = pk3.f(this.x, lk7);
            boolean contains = ((Set) this.B.getValue()).contains(lk7);
            sk3 sk3 = this.y;
            o81 o81 = this.z;
            xz1 xz1 = this.A;
            boolean g = yt2.g(xz1) | yt2.g(sk3) | yt2.e(lk7.ordinal()) | yt2.i(o81);
            Object Q = yt2.Q();
            if (g || Q == ay0.a) {
                nk3 nk3 = new nk3(sk3, lk7, o81, xz1, 0);
                yt2.o0(nk3);
                Q = nk3;
            }
            pk3.b(lk7, f, contains, (sr2) Q, yt2, 0);
            yt2.r(false);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
