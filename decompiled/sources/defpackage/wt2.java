package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: wt2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wt2 extends ky0 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final up4 e = new up4();
    public final ed5 f = new ed5(vf5.z, pe2.L);
    public final /* synthetic */ yt2 g;

    public wt2(yt2 yt2, long j, boolean z, boolean z2, f96 f96) {
        this.g = yt2;
        this.a = j;
        this.b = z;
        this.c = z2;
        up4 up4 = cg6.a;
    }

    public final void a(py0 py0, gs2 gs2) {
        this.g.b.a(py0, gs2);
    }

    public final up4 b(py0 py0, ps6 ps6, gs2 gs2) {
        return this.g.b.b(py0, ps6, gs2);
    }

    public final void c(hn4 hn4) {
        this.g.b.c(hn4);
    }

    public final void d() {
        yt2 yt2 = this.g;
        yt2.A--;
    }

    public final boolean e() {
        return this.g.b.e();
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        return this.c;
    }

    public final long h() {
        return this.a;
    }

    public final jy0 i() {
        return this.g.h;
    }

    public final vf5 j() {
        return (vf5) this.f.getValue();
    }

    public final e81 k() {
        return this.g.b.k();
    }

    public final boolean l() {
        return this.g.b.l();
    }

    public final void m(hn4 hn4) {
        this.g.b.m(hn4);
    }

    public final void n(py0 py0) {
        yt2 yt2 = this.g;
        yt2.b.n(yt2.h);
        yt2.b.n(py0);
    }

    public final void o(hn4 hn4, gn4 gn4, kr krVar) {
        this.g.b.o(hn4, gn4, krVar);
    }

    public final gn4 p(hn4 hn4) {
        return this.g.b.p(hn4);
    }

    public final up4 q(py0 py0, ps6 ps6, up4 up4) {
        return this.g.b.q(py0, ps6, up4);
    }

    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    public final void s(yt2 yt2) {
        this.e.a(yt2);
    }

    public final void t(yx5 yx5) {
        this.g.b.t(yx5);
    }

    public final void u(py0 py0) {
        this.g.b.u(py0);
    }

    public final mk0 v(kh khVar) {
        return this.g.b.v(khVar);
    }

    public final void w() {
        this.g.A++;
    }

    public final void x(yt2 yt2) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                yt2.getClass();
                ((Set) it.next()).remove(yt2.z());
            }
        }
        if (yt2 != null) {
            this.e.l(yt2);
        }
    }

    public final void y(py0 py0) {
        this.g.b.y(py0);
    }

    public final void z() {
        up4 up4 = this.e;
        if (up4.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
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
                                    yt2 yt2 = (yt2) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(yt2.z());
                                    }
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
            }
            up4.b();
        }
    }
}
