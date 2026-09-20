package defpackage;

/* renamed from: e40  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e40 extends ll4 implements my3, gz1, dk6, tk5, ol4, gd5, by3, aw2, ck2, qk2, q95, hd0 {
    public kl4 K;

    public final void D(sk2 sk2) {
        kl4 kl4 = this.K;
        yb3.b("onFocusEvent called on wrong node");
        kl4.getClass();
        throw new ClassCastException();
    }

    public final void D0(ok6 ok6) {
        kl4 kl4 = this.K;
        kl4.getClass();
        ak6 f = ((bk6) kl4).f();
        ok6.getClass();
        ak6 ak6 = (ak6) ok6;
        tp4 tp4 = ak6.w;
        if (f.y) {
            ak6.y = true;
        }
        if (f.z) {
            ak6.z = true;
        }
        tp4 tp42 = f.w;
        Object[] objArr = tp42.b;
        Object[] objArr2 = tp42.c;
        long[] jArr = tp42.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            nk6 nk6 = (nk6) obj;
                            if (!tp4.b(nk6)) {
                                tp4.m(nk6, obj2);
                            } else if (obj2 instanceof h4) {
                                Object g = tp4.g(nk6);
                                g.getClass();
                                h4 h4Var = (h4) g;
                                String str = h4Var.a;
                                if (str == null) {
                                    str = ((h4) obj2).a;
                                }
                                ds2 ds2 = h4Var.b;
                                if (ds2 == null) {
                                    ds2 = ((h4) obj2).b;
                                }
                                tp4.m(nk6, new h4(str, ds2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void I() {
        this.K.getClass();
        throw new ClassCastException();
    }

    public final void M() {
        rc9.e0(this);
    }

    public final boolean N() {
        this.K.getClass();
        throw new ClassCastException();
    }

    public final void N0() {
        V0(true);
    }

    public final void O0() {
        if (!this.J) {
            yb3.b("unInitializeModifier called on unattached node");
        }
        if ((this.y & 8) != 0) {
            ((je) rc9.P0(this)).y();
        }
    }

    public final td0 V() {
        return td0.B;
    }

    public final void V0(boolean z) {
        if (!this.J) {
            yb3.b("initializeModifier called on unattached node");
        }
        kl4 kl4 = this.K;
        if ((this.y & 4) != 0 && !z) {
            su0.A(this);
        }
        if ((this.y & 2) != 0) {
            ib7 ib7 = (ib7) rc9.O0(this).a0.f;
            ib7.getClass();
            if (ib7.K) {
                xz4 xz4 = this.D;
                xz4.getClass();
                ((oy3) xz4).E1(this);
                o95 o95 = xz4.l0;
                if (o95 != null) {
                    ((fx2) o95).c();
                }
            }
            if (!z) {
                su0.A(this);
                rc9.O0(this).G();
            }
        }
        if (kl4 instanceof l04) {
            l04 l04 = (l04) kl4;
            uy3 O0 = rc9.O0(this);
            switch (l04.w) {
                case b85.b:
                    ((n04) l04.x).j = O0;
                    break;
                case 1:
                    ((s34) l04.x).l = O0;
                    break;
                default:
                    ((ob5) l04.x).x.setValue(O0);
                    break;
            }
        }
        if ((this.y & 8) != 0) {
            ((je) rc9.P0(this)).y();
        }
    }

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        kl4 kl4 = this.K;
        kl4.getClass();
        return ((ky3) kl4).c(new zg3(dd4, dd4.getLayoutDirection()), new bm1(gh4, wh4.x, xh4.x, 1), m31.b(0, i, 0, 0, 13)).c();
    }

    public final tp1 b() {
        return rc9.O0(this).T;
    }

    public final void b0(xz4 xz4) {
        this.K.getClass();
        throw new ClassCastException();
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        kl4 kl4 = this.K;
        kl4.getClass();
        return ((ky3) kl4).c(oh4, gh4, j);
    }

    public final long e() {
        return pv8.O(rc9.M0(this, 128).y);
    }

    public final int f(dd4 dd4, gh4 gh4, int i) {
        kl4 kl4 = this.K;
        kl4.getClass();
        return ((ky3) kl4).c(new zg3(dd4, dd4.getLayoutDirection()), new bm1(gh4, wh4.x, xh4.w, 1), m31.b(0, 0, 0, i, 7)).e();
    }

    public final ey3 getLayoutDirection() {
        return rc9.O0(this).U;
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        kl4 kl4 = this.K;
        kl4.getClass();
        return ((ky3) kl4).c(new zg3(dd4, dd4.getLayoutDirection()), new bm1(gh4, wh4.w, xh4.x, 1), m31.b(0, i, 0, 0, 13)).c();
    }

    public final void p0(wy3 wy3) {
        kl4 kl4 = this.K;
        kl4.getClass();
        fz1 fz1 = (fz1) kl4;
        wy3.a();
    }

    public final boolean r() {
        return this.J;
    }

    public final int s0(dd4 dd4, gh4 gh4, int i) {
        kl4 kl4 = this.K;
        kl4.getClass();
        return ((ky3) kl4).c(new zg3(dd4, dd4.getLayoutDirection()), new bm1(gh4, wh4.w, xh4.w, 1), m31.b(0, 0, 0, i, 7)).e();
    }

    public final String toString() {
        return this.K.toString();
    }

    public final Object v(tp1 tp1, Object obj) {
        kl4 kl4 = this.K;
        kl4.getClass();
        return ((fd5) kl4).e();
    }

    public final boolean x0() {
        this.K.getClass();
        throw new ClassCastException();
    }

    public final void y(kk5 kk5, lk5 lk5, long j) {
        this.K.getClass();
        throw new ClassCastException();
    }

    public final void d() {
    }

    public final void a(long j) {
    }

    public final void l(dy3 dy3) {
    }
}
