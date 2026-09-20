package defpackage;

import java.util.List;

/* renamed from: sz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sz3 implements c24 {
    public final n04 a;

    public sz3(n04 n04) {
        this.a = n04;
    }

    public final int a() {
        return this.a.g().p;
    }

    public final int b() {
        return ((e04) dt0.G0(this.a.g().m)).a;
    }

    public final int c() {
        long i;
        boolean z;
        int i2;
        int i3;
        int i4;
        long j;
        n04 n04 = this.a;
        int i5 = 0;
        if (n04.g().m.isEmpty()) {
            return 0;
        }
        d04 g = n04.g();
        z75 z75 = g.q;
        z75 z752 = z75.w;
        if (z75 == z752) {
            i = g.i() & 4294967295L;
        } else {
            i = g.i() >> 32;
        }
        int i6 = (int) i;
        d04 g2 = n04.g();
        z75 z753 = g2.q;
        List list = g2.m;
        if (z753 == z752) {
            z = true;
        } else {
            z = false;
        }
        if (!list.isEmpty()) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i7 < list.size()) {
                e04 e04 = (e04) list.get(i7);
                if (z) {
                    i3 = e04.s;
                } else {
                    i3 = e04.t;
                }
                if (i3 == -1) {
                    i7++;
                } else {
                    int i10 = 0;
                    while (i7 < list.size()) {
                        e04 e042 = (e04) list.get(i7);
                        if (z) {
                            i4 = e042.s;
                        } else {
                            i4 = e042.t;
                        }
                        if (i4 != i3) {
                            break;
                        }
                        if (z) {
                            j = ((e04) list.get(i7)).q & 4294967295L;
                        } else {
                            j = ((e04) list.get(i7)).q >> 32;
                        }
                        i10 = Math.max(i10, (int) j);
                        i7++;
                    }
                    i8 += i10;
                    i9++;
                }
            }
            i5 = (i8 / i9) + g2.s;
        }
        if (i5 != 0 && (i2 = i6 / i5) >= 1) {
            return i2;
        }
        return 1;
    }

    public final boolean d() {
        return !this.a.g().m.isEmpty();
    }

    public final int e() {
        return this.a.d.b.d();
    }
}
