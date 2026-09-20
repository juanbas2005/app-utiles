package defpackage;

/* renamed from: hy5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hy5 implements kr {
    public final xo4 w = new xo4();
    public final lp4 x = new lp4();
    public final Object y;

    public hy5(Object obj) {
        this.y = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r4 = r7;
     */
    public final void a(gs7 gs7, u36 u36) {
        Exception exc;
        int i;
        int i2;
        xo4 xo4 = this.w;
        int i3 = xo4.b;
        lp4 lp4 = new lp4();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            lp4 lp42 = this.x;
            if (i4 < i3) {
                int i6 = i4 + 1;
                try {
                    switch (xo4.c(i4)) {
                        case b85.b:
                            gs7.i();
                            break;
                        case 1:
                            int i7 = i5 + 1;
                            gs7.c(lp42.f(i5));
                            i5 = i7;
                            break;
                        case 2:
                            i = i4 + 2;
                            i4 += 3;
                            gs7.g(xo4.c(i6), xo4.c(i));
                            break;
                        case 3:
                            i = i4 + 2;
                            try {
                                i2 = i4 + 3;
                            } catch (Exception e) {
                                exc = e;
                                i4 = i;
                                try {
                                    throw new lx0(lp42, lp4, xo4, i4 - 1, exc);
                                } catch (Throwable th) {
                                    Throwable th2 = th;
                                    gs7.l();
                                    throw th2;
                                }
                            }
                            try {
                                i4 += 4;
                                gs7.f(xo4.c(i6), xo4.c(i), xo4.c(i2));
                                break;
                            } catch (Exception e2) {
                                exc = e2;
                                i4 = i2;
                                throw new lx0(lp42, lp4, xo4, i4 - 1, exc);
                            }
                        case 4:
                            gs7.a();
                            break;
                        case 5:
                            i4 += 2;
                            int i8 = i5 + 1;
                            gs7.b(xo4.c(i6), lp42.f(i5));
                            i5 = i8;
                            break;
                        case 6:
                            i4 += 2;
                            try {
                                xo4.c(i6);
                                int i9 = i5 + 1;
                                uy3 uy3 = (uy3) lp42.f(i5);
                                i5 = i9;
                                break;
                            } catch (Exception e3) {
                                exc = e3;
                                break;
                            }
                        case 7:
                            int i10 = i5 + 1;
                            Object f = lp42.f(i5);
                            f.getClass();
                            mp7.Q(2, f);
                            i5 += 2;
                            gs7.o((gs2) f, lp42.f(i10));
                            break;
                        case 8:
                            Object obj = gs7.y;
                            if (obj instanceof jx0) {
                                jx0 jx0 = (jx0) obj;
                                if (u36.f.k(jx0)) {
                                    jx0.b();
                                }
                            }
                            lp4.a(obj);
                            gs7.e();
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i4 = i6;
                }
            } else {
                if (i5 != lp42.b) {
                    ey0.a("Applier operation size mismatch");
                }
                lp42.d();
                xo4.b = 0;
                gs7.l();
                return;
            }
        }
    }

    public final void b(int i, Object obj) {
        xo4 xo4 = this.w;
        xo4.a(5);
        xo4.a(i);
        this.x.a(obj);
    }

    public final void c(Object obj) {
        this.w.a(1);
        this.x.a(obj);
    }

    public final void e() {
        this.w.a(8);
    }

    public final void f(int i, int i2, int i3) {
        xo4 xo4 = this.w;
        xo4.a(3);
        xo4.a(i);
        xo4.a(i2);
        xo4.a(i3);
    }

    public final void g(int i, int i2) {
        xo4 xo4 = this.w;
        xo4.a(2);
        xo4.a(i);
        xo4.a(i2);
    }

    public final void i() {
        this.w.a(0);
    }

    public final void k(int i, Object obj) {
        xo4 xo4 = this.w;
        xo4.a(6);
        xo4.a(i);
        this.x.a(obj);
    }

    public final Object m() {
        return this.y;
    }

    public final void o(gs2 gs2, Object obj) {
        this.w.a(7);
        lp4 lp4 = this.x;
        lp4.a(gs2);
        lp4.a(obj);
    }
}
