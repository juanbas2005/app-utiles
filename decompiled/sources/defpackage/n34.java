package defpackage;

import java.util.List;

/* renamed from: n34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n34 implements k24 {
    public final int a;
    public final List b;
    public final boolean c;
    public final ib d;
    public final h80 e;
    public final ey3 f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final wz0 k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public boolean s;
    public int t = Integer.MIN_VALUE;
    public final int[] u;

    public n34(int i2, List list, boolean z, ib ibVar, h80 h80, ey3 ey3, int i3, int i4, int i5, long j2, Object obj, Object obj2, wz0 wz0, long j3) {
        int i6;
        int i7;
        this.a = i2;
        this.b = list;
        this.c = z;
        this.d = ibVar;
        this.e = h80;
        this.f = ey3;
        this.g = i5;
        this.h = j2;
        this.i = obj;
        this.j = obj2;
        this.k = wz0;
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            eh5 eh5 = (eh5) list.get(i10);
            boolean z2 = this.c;
            if (z2) {
                i6 = eh5.x;
            } else {
                i6 = eh5.w;
            }
            i8 += i6;
            if (!z2) {
                i7 = eh5.x;
            } else {
                i7 = eh5.w;
            }
            i9 = Math.max(i9, i7);
        }
        this.m = i8;
        this.r = i9;
        this.u = new int[(this.b.size() * 2)];
        if (this.c) {
            this.q = this.g;
            this.o = i8;
            this.n = i9;
            this.p = 0;
            return;
        }
        this.q = 0;
        this.o = i9;
        this.n = i8;
        this.p = this.g;
    }

    public final int a() {
        return this.p;
    }

    public final int b() {
        return 1;
    }

    public final int c() {
        return this.o;
    }

    public final List d() {
        return this.b;
    }

    public final int e() {
        return this.q;
    }

    public final void f(int i2, int i3, int i4) {
        m(i2, i3, i4);
    }

    public final long g(int i2) {
        if (i2 == 0 && this.b.size() == 0) {
            int i3 = this.l;
            if (this.c) {
                return ((long) i3) & 4294967295L;
            }
            return ((long) i3) << 32;
        }
        int i4 = i2 * 2;
        int[] iArr = this.u;
        int i5 = iArr[i4];
        return (((long) iArr[i4 + 1]) & 4294967295L) | (((long) i5) << 32);
    }

    public final int getIndex() {
        return this.a;
    }

    public final Object getKey() {
        return this.i;
    }

    public final int h() {
        return 0;
    }

    public final int i() {
        return this.n;
    }

    public final void j() {
        this.s = true;
    }

    public final int k() {
        int i2;
        int i3;
        if (this.c) {
            i2 = this.o;
            i3 = this.q;
        } else {
            i2 = this.n;
            i3 = this.p;
        }
        int i4 = i2 + i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public final void l(dh5 dh5) {
        if (this.t == Integer.MIN_VALUE) {
            bc3.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            eh5 eh5 = (eh5) list.get(i2);
            boolean z = this.c;
            if (z) {
                int i3 = eh5.x;
            } else {
                int i4 = eh5.w;
            }
            long g2 = g(i2);
            this.k.d(i2, this.i);
            long c2 = oe3.c(g2, this.h);
            if (z) {
                dh5.r(dh5, eh5, c2);
            } else {
                dh5.m(dh5, eh5, c2);
            }
        }
    }

    public final void m(int i2, int i3, int i4) {
        int i5;
        int i6;
        this.l = i2;
        boolean z = this.c;
        if (z) {
            i5 = i4;
        } else {
            i5 = i3;
        }
        this.t = i5;
        List list = this.b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            eh5 eh5 = (eh5) list.get(i7);
            int i8 = i7 * 2;
            int[] iArr = this.u;
            if (z) {
                ib ibVar = this.d;
                if (ibVar != null) {
                    iArr[i8] = ibVar.a(eh5.w, i3, this.f);
                    iArr[i8 + 1] = i2;
                    i6 = eh5.x;
                } else {
                    throw f21.p("null horizontalAlignment when isVertical == true");
                }
            } else {
                iArr[i8] = i2;
                int i9 = i8 + 1;
                h80 h80 = this.e;
                if (h80 != null) {
                    iArr[i9] = h80.a(eh5.x, i4);
                    i6 = eh5.w;
                } else {
                    throw f21.p("null verticalAlignment when isVertical == false");
                }
            }
            i2 += i6;
        }
    }
}
