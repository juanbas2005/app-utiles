package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: d04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d04 implements mh4 {
    public final f04 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final mh4 e;
    public final float f;
    public final boolean g;
    public final o81 h;
    public final tp1 i;
    public final int j;
    public final vr2 k;
    public final vr2 l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final z75 q;
    public final int r;
    public final int s;

    public d04(f04 f04, int i2, boolean z, float f2, mh4 mh4, float f3, boolean z2, o81 o81, tp1 tp1, int i3, vr2 vr2, vr2 vr22, List list, int i4, int i5, int i6, z75 z75, int i7, int i8) {
        this.a = f04;
        this.b = i2;
        this.c = z;
        this.d = f2;
        this.e = mh4;
        this.f = f3;
        this.g = z2;
        this.h = o81;
        this.i = tp1;
        this.j = i3;
        this.k = vr2;
        this.l = vr22;
        this.m = list;
        this.n = i4;
        this.o = i5;
        this.p = i6;
        this.q = z75;
        this.r = i7;
        this.s = i8;
    }

    public final Map a() {
        return this.e.a();
    }

    public final void b() {
        this.e.b();
    }

    public final int c() {
        return this.e.c();
    }

    public final vr2 d() {
        return this.e.d();
    }

    public final int e() {
        return this.e.e();
    }

    public final gs2 f() {
        return this.e.f();
    }

    public final vr2 g() {
        return this.e.g();
    }

    public final d04 h(int i2, boolean z) {
        f04 f04;
        boolean z2;
        int i3;
        int i4 = i2;
        if (this.g) {
            return null;
        }
        List list = this.m;
        if (list.isEmpty() || (f04 = this.a) == null) {
            return null;
        }
        int i5 = f04.g;
        int i6 = this.b - i4;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        e04 e04 = (e04) dt0.w0(list);
        e04 e042 = (e04) dt0.G0(list);
        if (e04.u || e042.u) {
            return null;
        }
        int i7 = this.o;
        int i8 = this.n;
        z75 z75 = this.q;
        if (i4 < 0) {
            if (Math.min((e04.k() + ie1.S(e04, z75)) - i8, (e042.k() + ie1.S(e042, z75)) - i7) <= (-i4)) {
                return null;
            }
        } else if (Math.min(i8 - ie1.S(e04, z75), i7 - ie1.S(e042, z75)) <= i4) {
            return null;
        }
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            e04 e043 = (e04) list.get(i9);
            e043.getClass();
            if (e043.u) {
                i3 = i6;
            } else {
                long j2 = e043.r;
                i3 = i6;
                e043.r = (((long) ((int) (j2 >> 32))) << 32) | (((long) (((int) (j2 & 4294967295L)) + i4)) & 4294967295L);
                if (z) {
                    int size2 = e043.e.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        e043.h.d(i10, e043.b);
                    }
                }
            }
            i9++;
            i6 = i3;
        }
        int i11 = i6;
        if (this.c || i4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new d04(this.a, i11, z2, (float) i4, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, list, this.n, this.o, this.p, z75, this.r, this.s);
    }

    public final long i() {
        mh4 mh4 = this.e;
        return (((long) mh4.e()) << 32) | (((long) mh4.c()) & 4294967295L);
    }
}
