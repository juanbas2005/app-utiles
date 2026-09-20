package defpackage;

/* renamed from: ch6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ch6 extends ll4 implements my3, dk6 {
    public gh6 K;
    public boolean L;

    public final void D0(ok6 ok6) {
        mk6.i(ok6);
        vg6 vg6 = new vg6(new bh6(this, 0), new bh6(this, 1));
        if (this.L) {
            nk6 nk6 = jk6.w;
            yr3 yr3 = mk6.a[13];
            ok6.f(nk6, vg6);
            return;
        }
        nk6 nk62 = jk6.v;
        yr3 yr32 = mk6.a[12];
        ok6.f(nk62, vg6);
    }

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        if (!this.L) {
            i = Integer.MAX_VALUE;
        }
        return gh4.c(i);
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        z75 z75;
        int i;
        vr2 vr2;
        int i2;
        int i3;
        if (this.L) {
            z75 = z75.w;
        } else {
            z75 = z75.x;
        }
        ag8.j(j, z75);
        int i4 = Integer.MAX_VALUE;
        if (this.L) {
            i = Integer.MAX_VALUE;
        } else {
            i = k31.g(j);
        }
        if (this.L) {
            i4 = k31.h(j);
        }
        long j2 = j;
        eh5 y = gh4.y(k31.a(j2, 0, i4, 0, i, 5));
        int i5 = y.w;
        int h = k31.h(j2);
        if (i5 > h) {
            i5 = h;
        }
        int i6 = y.x;
        int g = k31.g(j2);
        if (i6 > g) {
            i6 = g;
        }
        int i7 = y.x - i6;
        int i8 = y.w - i5;
        if (!this.L) {
            i7 = i8;
        }
        gh6 gh6 = this.K;
        bd5 bd5 = gh6.f;
        bd5 bd52 = gh6.a;
        bd5.e(i7);
        ix6 h2 = j45.h();
        if (h2 != null) {
            vr2 = h2.e();
        } else {
            vr2 = null;
        }
        ix6 j3 = j45.j(h2);
        try {
            if (bd52.d() > i7) {
                bd52.e(i7);
            }
            j45.m(h2, j3, vr2);
            gh6 gh62 = this.K;
            if (this.L) {
                i2 = i6;
            } else {
                i2 = i5;
            }
            gh62.b.e(i2);
            gh6 gh63 = this.K;
            if (this.L) {
                i3 = y.x;
            } else {
                i3 = y.w;
            }
            gh63.c.e(i3);
            this.K.d.setValue(Boolean.FALSE);
            return oh4.d0(i5, i6, b42.w, new mp2(this, i7, y, 3));
        } catch (Throwable th) {
            Throwable th2 = th;
            j45.m(h2, j3, vr2);
            throw th2;
        }
    }

    public final int f(dd4 dd4, gh4 gh4, int i) {
        if (this.L) {
            i = Integer.MAX_VALUE;
        }
        return gh4.v(i);
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        if (!this.L) {
            i = Integer.MAX_VALUE;
        }
        return gh4.W(i);
    }

    public final int s0(dd4 dd4, gh4 gh4, int i) {
        if (this.L) {
            i = Integer.MAX_VALUE;
        }
        return gh4.l(i);
    }
}
