package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: db5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class db5 implements mh4 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final z75 e;
    public final int f;
    public final int g;
    public final int h;
    public final ph4 i;
    public final ph4 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final gx6 n;
    public final mh4 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final o81 s;
    public final tp1 t;
    public final long u;

    public db5(List list, int i2, int i3, int i4, z75 z75, int i5, int i6, int i7, ph4 ph4, ph4 ph42, float f2, int i8, boolean z, gx6 gx6, mh4 mh4, boolean z2, List list2, List list3, o81 o81, tp1 tp1, long j2) {
        this.a = list;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z75;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = ph4;
        this.j = ph42;
        this.k = f2;
        this.l = i8;
        this.m = z;
        this.n = gx6;
        this.o = mh4;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = o81;
        this.t = tp1;
        this.u = j2;
    }

    public final Map a() {
        return this.o.a();
    }

    public final void b() {
        this.o.b();
    }

    public final int c() {
        return this.o.c();
    }

    public final vr2 d() {
        return this.o.d();
    }

    public final int e() {
        return this.o.e();
    }

    public final gs2 f() {
        return this.o.f();
    }

    public final vr2 g() {
        return this.o.g();
    }

    public final db5 h(int i2) {
        int i3;
        float f2;
        int i4 = i2;
        int i5 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i3 = this.l - i4) < 0 || i3 >= i5) {
            return null;
        }
        if (i5 != 0) {
            f2 = ((float) i4) / ((float) i5);
        } else {
            f2 = 0.0f;
        }
        float f3 = this.k - f2;
        if (this.j == null || f3 >= 0.5f || f3 <= -0.5f) {
            return null;
        }
        ph4 ph4 = (ph4) dt0.w0(list);
        ph4 ph42 = (ph4) dt0.G0(list);
        int i6 = this.g;
        int i7 = this.f;
        if (i4 < 0) {
            if (Math.min((ph4.j + i5) - i7, (ph42.j + i5) - i6) <= (-i4)) {
                return null;
            }
        } else if (Math.min(i7 - ph4.j, i6 - ph42.j) <= i4) {
            return null;
        }
        int size = list.size();
        boolean z = false;
        for (int i8 = 0; i8 < size; i8++) {
            ((ph4) list.get(i8)).a(i4);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((ph4) list2.get(i9)).a(i4);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i10 = 0; i10 < size3; i10++) {
            ((ph4) list3.get(i10)).a(i4);
        }
        if (this.m || i4 > 0) {
            z = true;
        }
        boolean z2 = z;
        tp1 tp1 = this.t;
        long j2 = this.u;
        return new db5(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f3, i3, z2, this.n, this.o, this.p, this.q, this.r, this.s, tp1, j2);
    }

    public final long i() {
        mh4 mh4 = this.o;
        return (((long) mh4.e()) << 32) | (((long) mh4.c()) & 4294967295L);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ db5(int i2, int i3, int i4, int i5, int i6, int i7, gx6 gx6, mh4 mh4, o81 o81, tp1 tp1, long j2) {
        this(r1, i2, i3, i4, z75.x, i5, i6, i7, (ph4) null, (ph4) null, 0.0f, 0, false, gx6, mh4, false, r1, r1, o81, tp1, j2);
        a42 a42 = a42.w;
    }
}
