package defpackage;

/* renamed from: h98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h98 implements aq1 {
    public int a;
    public g31 b;
    public pa6 c;
    public int d;
    public final dv1 e = new dv1(this);
    public int f = 0;
    public boolean g = false;
    public final eq1 h = new eq1(this);
    public final eq1 i = new eq1(this);
    public int j = 1;

    public h98(g31 g31) {
        this.b = g31;
    }

    public static void b(eq1 eq1, eq1 eq12, int i2) {
        eq1.l.add(eq12);
        eq1.f = i2;
        eq12.k.add(eq1);
    }

    public static eq1 h(h21 h21) {
        h21 h212 = h21.f;
        if (h212 == null) {
            return null;
        }
        g31 g31 = h212.d;
        int B = b81.B(h212.e);
        if (B == 1) {
            return g31.d.h;
        }
        if (B == 2) {
            return g31.e.h;
        }
        if (B == 3) {
            return g31.d.i;
        }
        if (B == 4) {
            return g31.e.i;
        }
        if (B != 5) {
            return null;
        }
        return g31.e.k;
    }

    public static eq1 i(h21 h21, int i2) {
        h98 h98;
        h21 h212 = h21.f;
        if (h212 == null) {
            return null;
        }
        g31 g31 = h212.d;
        if (i2 == 0) {
            h98 = g31.d;
        } else {
            h98 = g31.e;
        }
        int B = b81.B(h212.e);
        if (B == 1 || B == 2) {
            return h98.h;
        }
        if (B == 3 || B == 4) {
            return h98.i;
        }
        return null;
    }

    public final void c(eq1 eq1, eq1 eq12, int i2, dv1 dv1) {
        eq1.l.add(eq12);
        eq1.l.add(this.e);
        eq1.h = i2;
        eq1.i = dv1;
        eq12.k.add(eq1);
        dv1.k.add(eq1);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        g31 g31 = this.b;
        if (i3 == 0) {
            int i4 = g31.u;
            int max = Math.max(g31.t, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max != i2) {
                return max;
            }
        } else {
            int i5 = g31.x;
            int max2 = Math.max(g31.w, i2);
            if (i5 > 0) {
                max2 = Math.min(i5, i2);
            }
            if (max2 != i2) {
                return max2;
            }
        }
        return i2;
    }

    public long j() {
        dv1 dv1 = this.e;
        if (dv1.j) {
            return (long) dv1.g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.a == 3) goto L_0x00ae;
     */
    public final void l(h21 h21, h21 h212, int i2) {
        float f2;
        h98 h98;
        float f3;
        int i3;
        eq1 h2 = h(h21);
        eq1 h3 = h(h212);
        if (h2.j && h3.j) {
            int e2 = h21.e() + h2.g;
            int e3 = h3.g - h212.e();
            int i4 = e3 - e2;
            dv1 dv1 = this.e;
            if (!dv1.j && this.d == 3) {
                int i5 = this.a;
                if (i5 == 0) {
                    dv1.d(g(i4, i2));
                } else if (i5 == 1) {
                    dv1.d(Math.min(g(dv1.m, i2), i4));
                } else if (i5 == 2) {
                    g31 g31 = this.b;
                    g31 g312 = g31.S;
                    if (g312 != null) {
                        if (i2 == 0) {
                            h98 = g312.d;
                        } else {
                            h98 = g312.e;
                        }
                        dv1 dv12 = h98.e;
                        if (dv12.j) {
                            if (i2 == 0) {
                                f3 = g31.v;
                            } else {
                                f3 = g31.y;
                            }
                            dv1.d(g((int) ((((float) dv12.g) * f3) + 0.5f), i2));
                        }
                    }
                } else if (i5 == 3) {
                    g31 g313 = this.b;
                    h98 h982 = g313.d;
                    if (h982.d == 3 && h982.a == 3) {
                        p48 p48 = g313.e;
                        if (p48.d == 3) {
                        }
                    }
                    if (i2 == 0) {
                        h982 = g313.e;
                    }
                    dv1 dv13 = h982.e;
                    if (dv13.j) {
                        float f4 = g313.V;
                        int i6 = dv13.g;
                        if (i2 == 1) {
                            i3 = (int) ((((float) i6) / f4) + 0.5f);
                        } else {
                            i3 = (int) ((f4 * ((float) i6)) + 0.5f);
                        }
                        dv1.d(i3);
                    }
                }
            }
            if (dv1.j) {
                int i7 = dv1.g;
                eq1 eq1 = this.i;
                eq1 eq12 = this.h;
                if (i7 == i4) {
                    eq12.d(e2);
                    eq1.d(e3);
                    return;
                }
                g31 g314 = this.b;
                if (i2 == 0) {
                    f2 = g314.c0;
                } else {
                    f2 = g314.d0;
                }
                if (h2 == h3) {
                    e2 = h2.g;
                    e3 = h3.g;
                    f2 = 0.5f;
                }
                eq12.d((int) ((((float) ((e3 - e2) - i7)) * f2) + ((float) e2) + 0.5f));
                eq1.d(eq12.g + dv1.g);
            }
        }
    }
}
