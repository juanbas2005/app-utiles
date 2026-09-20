package defpackage;

import java.util.Map;

/* renamed from: x34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x34 implements re6, oe6 {
    public final se6 w;
    public final oe6 x;
    public final up4 y = new up4();

    public x34(re6 re6, Map map, oe6 oe6) {
        h43 h43 = new h43(13, re6);
        t37 t37 = te6.a;
        this.w = new se6(map, h43);
        this.x = oe6;
        up4 up4 = cg6.a;
    }

    public final cf4 a(sr2 sr2, String str) {
        return this.w.a(sr2, str);
    }

    public final void b(Object obj, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        yt2.g0(-858296452);
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
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            this.x.b(obj, fw0, yt2, i2 & 126);
            boolean i6 = yt2.i(this) | yt2.i(obj);
            Object Q = yt2.Q();
            if (i6 || Q == ay0.a) {
                Q = new m0(29, this, obj);
                yt2.o0(Q);
            }
            t49.e(obj, (vr2) Q, yt2);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(i, 12, (Object) this, obj, (Object) fw0);
        }
    }

    public final boolean c(Object obj) {
        return this.w.c(obj);
    }

    public final Map d() {
        up4 up4 = this.y;
        Object[] objArr = up4.b;
        long[] jArr = up4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.x.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.w.d();
    }

    public final Object e(String str) {
        return this.w.e(str);
    }

    public final void f(Object obj) {
        this.x.f(obj);
    }
}
