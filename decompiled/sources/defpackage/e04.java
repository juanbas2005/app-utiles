package defpackage;

import java.util.List;

/* renamed from: e04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e04 implements k24 {
    public final int a;
    public final Object b;
    public final int c;
    public final ey3 d;
    public final List e;
    public final long f;
    public final Object g;
    public final wz0 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p = Integer.MIN_VALUE;
    public final long q;
    public long r;
    public int s;
    public int t;
    public boolean u;

    public e04(int i2, Object obj, int i3, int i4, ey3 ey3, int i5, int i6, List list, long j2, Object obj2, wz0 wz0, long j3, int i7, int i8) {
        this.a = i2;
        this.b = obj;
        this.c = i3;
        this.d = ey3;
        this.e = list;
        this.f = j2;
        this.g = obj2;
        this.h = wz0;
        this.i = i7;
        this.j = i8;
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = Math.max(i9, ((eh5) list.get(i10)).x);
        }
        this.k = i9;
        this.o = i4;
        this.m = i9;
        int i11 = this.c;
        this.l = i11;
        this.n = 0;
        this.q = (((long) i11) << 32) | (((long) i9) & 4294967295L);
        this.r = 0;
        this.s = -1;
        this.t = -1;
    }

    public final int a() {
        return this.n;
    }

    public final int b() {
        return this.j;
    }

    public final int c() {
        return this.m;
    }

    public final List d() {
        return this.e;
    }

    public final int e() {
        return this.o;
    }

    public final void f(int i2, int i3, int i4) {
        m(i2, 0, i3, i4, -1, -1);
    }

    public final long g(int i2) {
        return this.r;
    }

    public final int getIndex() {
        return this.a;
    }

    public final Object getKey() {
        return this.b;
    }

    public final int h() {
        return this.i;
    }

    public final int i() {
        return this.l;
    }

    public final void j() {
        this.u = true;
    }

    public final int k() {
        return this.m + this.o;
    }

    public final void l(dh5 dh5) {
        if (this.p == Integer.MIN_VALUE) {
            bc3.a("position() should be called first");
        }
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            eh5 eh5 = (eh5) list.get(i2);
            int i3 = eh5.x;
            long j2 = this.r;
            this.h.d(i2, this.b);
            dh5.r(dh5, eh5, oe3.c(j2, this.f));
        }
    }

    public final void m(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.p = i5;
        if (this.d == ey3.x) {
            i3 = (i4 - i3) - this.c;
        }
        this.r = (((long) i3) << 32) | (((long) i2) & 4294967295L);
        this.s = i6;
        this.t = i7;
    }
}
