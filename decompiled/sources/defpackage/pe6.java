package defpackage;

import java.util.Map;

/* renamed from: pe6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pe6 implements oe6 {
    public static final kg5 A = new kg5(12, new ud6(1), new b86(2));
    public final Map w;
    public final tp4 x = new tp4();
    public re6 y;
    public final ay5 z = new ay5(7, (Object) this);

    public pe6(Map map) {
        this.w = map;
        long[] jArr = bg6.a;
    }

    public final void b(Object obj, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        yt2.g0(533563200);
        if ((i & 6) == 0) {
            if (yt2.i(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.i(fw0)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (yt2.i(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i2 & 1, z2)) {
            yt2.h0(obj);
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                ay5 ay5 = this.z;
                if (((Boolean) ay5.y(obj)).booleanValue()) {
                    t37 t37 = te6.a;
                    ue6 ue6 = new ue6(new se6((Map) this.w.get(obj), ay5));
                    yt2.o0(ue6);
                    Q = ue6;
                } else {
                    ku4.w(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
            }
            ue6 ue62 = (ue6) Q;
            t49.d(new ju5[]{te6.a.a(ue62), oa4.a.a(ue62)}, fw0, yt2, (i2 & 112) | 8);
            boolean i6 = yt2.i(this) | yt2.i(obj) | yt2.i(ue62);
            Object Q2 = yt2.Q();
            if (i6 || Q2 == d63) {
                Q2 = new g5((Object) this, obj, (Object) ue62, 24);
                yt2.o0(Q2);
            }
            t49.e(vs7.a, (vr2) Q2, yt2);
            if (yt2.y && yt2.G.i == yt2.z) {
                yt2.z = -1;
                yt2.y = false;
            }
            yt2.r(false);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(i, 17, (Object) this, obj, (Object) fw0);
        }
    }

    public final void f(Object obj) {
        if (this.x.k(obj) == null) {
            this.w.remove(obj);
        }
    }
}
