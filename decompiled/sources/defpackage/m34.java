package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: m34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m34 implements mh4 {
    public final n34 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final mh4 e;
    public final float f;
    public final boolean g;
    public final o81 h;
    public final tp1 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final z75 o;
    public final int p;
    public final int q;

    public m34(n34 n34, int i2, boolean z, float f2, mh4 mh4, float f3, boolean z2, o81 o81, tp1 tp1, long j2, List list, int i3, int i4, int i5, z75 z75, int i6, int i7) {
        this.a = n34;
        this.b = i2;
        this.c = z;
        this.d = f2;
        this.e = mh4;
        this.f = f3;
        this.g = z2;
        this.h = o81;
        this.i = tp1;
        this.j = j2;
        this.k = list;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = z75;
        this.p = i6;
        this.q = i7;
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

    public final m34 h(int i2, boolean z) {
        n34 n34;
        int i3 = i2;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (n34 = this.a) == null) {
            return null;
        }
        int k2 = n34.k();
        int i4 = this.b - i3;
        if (i4 < 0 || i4 >= k2) {
            return null;
        }
        n34 n342 = (n34) dt0.w0(list);
        n34 n343 = (n34) dt0.G0(list);
        if (n342.s || n343.s) {
            return null;
        }
        int i5 = n342.l;
        int i6 = this.m;
        int i7 = this.l;
        if (i3 < 0) {
            if (Math.min((n342.k() + i5) - i7, (n343.k() + n343.l) - i6) <= (-i3)) {
                return null;
            }
        } else if (Math.min(i7 - i5, i6 - n343.l) <= i3) {
            return null;
        }
        int size = list.size();
        boolean z2 = false;
        for (int i8 = 0; i8 < size; i8++) {
            n34 n344 = (n34) list.get(i8);
            boolean z3 = n344.c;
            int[] iArr = n344.u;
            if (!n344.s) {
                n344.l += i3;
                int length = iArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 & 1;
                    if ((z3 && i10 != 0) || (!z3 && i10 == 0)) {
                        iArr[i9] = iArr[i9] + i3;
                    }
                }
                if (z) {
                    int size2 = n344.b.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        n344.k.d(i11, n344.i);
                    }
                }
            }
        }
        if (this.c || i3 > 0) {
            z2 = true;
        }
        boolean z4 = z2;
        float f2 = (float) i3;
        int i12 = this.p;
        return new m34(this.a, i4, z4, f2, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, i12, this.q);
    }

    public final long i() {
        mh4 mh4 = this.e;
        return (((long) mh4.e()) << 32) | (((long) mh4.c()) & 4294967295L);
    }
}
