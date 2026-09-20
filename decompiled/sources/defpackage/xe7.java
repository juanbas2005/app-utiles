package defpackage;

/* renamed from: xe7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xe7 implements wd7 {
    public boolean a = true;
    public lg7 b;
    public lj6 c = d63.K;
    public final /* synthetic */ ze7 d;

    public xe7(ze7 ze7) {
        this.d = ze7;
    }

    public final void a(long j, lj6 lj6) {
        long j2;
        cg7 d2;
        cg7 d3;
        ze7 ze7 = this.d;
        ed5 ed5 = ze7.r;
        if (ze7.k() && ((cy2) ed5.getValue()) == null) {
            ed5.setValue(cy2.y);
            ze7.t = -1;
            this.a = true;
            this.c = lj6;
            ze7.o();
            u44 u44 = ze7.d;
            if (u44 == null || (d3 = u44.d()) == null || !d3.c(j)) {
                j2 = j;
                u44 u442 = ze7.d;
                if (!(u442 == null || (d2 = u442.d()) == null)) {
                    int h = ze7.b.h(d2.b(true, j2));
                    hf7 e = ze7.e(ze7.n().a, i95.a(h, h));
                    ze7.h(false);
                    my2 my2 = ze7.k;
                    if (my2 != null) {
                        ((ij5) my2).a(0);
                    }
                    ze7.c.y(e);
                    ze7.w = new lg7(e.b);
                }
                this.a = false;
            } else if (ze7.n().a.x.length() != 0) {
                ze7.h(false);
                long j3 = j;
                long c2 = ze7.c(ze7, hf7.a(ze7.n(), (vl) null, lg7.b, 5), j3, true, false, this.c, true, new ny2(0));
                j2 = j3;
                ze7.p = new lg7(c2);
                this.b = new lg7(c2);
            } else {
                return;
            }
            ze7.q(ey2.w);
            ze7.o = j2;
            ze7.s.setValue(new l35(j2));
            ze7.q = 0;
        }
    }

    public final void b() {
        f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e6  */
    public final void e(long j) {
        cg7 d2;
        long j2;
        int i;
        ku4 ku4;
        ze7 ze7 = this.d;
        if (ze7.k() && ze7.n().a.x.length() != 0) {
            ze7.q = l35.e(ze7.q, j);
            u44 u44 = ze7.d;
            if (!(u44 == null || (d2 = u44.d()) == null)) {
                ze7.s.setValue(new l35(l35.e(ze7.o, ze7.q)));
                if (ze7.p == null) {
                    l35 i2 = ze7.i();
                    i2.getClass();
                    if (!d2.c(i2.a)) {
                        int h = ze7.b.h(d2.b(true, ze7.o));
                        v35 v35 = ze7.b;
                        l35 i3 = ze7.i();
                        i3.getClass();
                        if (h == v35.h(d2.b(true, i3.a))) {
                            ku4 = d63.K;
                        } else {
                            ku4 = d63.L;
                        }
                        ku4 ku42 = ku4;
                        hf7 n = ze7.n();
                        l35 i4 = ze7.i();
                        i4.getClass();
                        j2 = ze7.c(ze7, n, i4.a, false, false, ku42, true, new ny2(9));
                        this.b = new lg7(j2);
                        if (!lg7.a(j2, ze7.p)) {
                            this.a = false;
                        }
                    }
                }
                lg7 lg7 = ze7.p;
                if (lg7 != null) {
                    i = (int) (lg7.a >> 32);
                } else {
                    i = d2.b(false, ze7.o);
                }
                l35 i5 = ze7.i();
                i5.getClass();
                int b2 = d2.b(false, i5.a);
                if (ze7.p != null || i != b2) {
                    hf7 n2 = ze7.n();
                    l35 i6 = ze7.i();
                    i6.getClass();
                    j2 = ze7.c(ze7, n2, i6.a, false, false, this.c, true, new ny2(9));
                    this.b = new lg7(j2);
                    if (!lg7.a(j2, ze7.p)) {
                    }
                } else {
                    return;
                }
            }
            ze7.t(false);
        }
    }

    public final void f() {
        long j;
        ey2 ey2;
        boolean z;
        boolean z2;
        ze7 ze7 = this.d;
        ze7.r.setValue((Object) null);
        ze7.s.setValue((Object) null);
        this.c = d63.K;
        boolean z3 = true;
        ze7.t(true);
        lg7 lg7 = this.b;
        if (lg7 != null) {
            j = lg7.a;
        } else {
            j = ze7.n().b;
        }
        boolean c2 = lg7.c(j);
        if (c2) {
            ey2 = ey2.y;
        } else {
            ey2 = ey2.x;
        }
        ze7.q(ey2);
        u44 u44 = ze7.d;
        if (u44 != null) {
            if (c2 || !k75.m(ze7, true)) {
                z2 = false;
            } else {
                z2 = true;
            }
            u44.m.setValue(Boolean.valueOf(z2));
        }
        u44 u442 = ze7.d;
        if (u442 != null) {
            if (c2 || !k75.m(ze7, false)) {
                z = false;
            } else {
                z = true;
            }
            u442.n.setValue(Boolean.valueOf(z));
        }
        u44 u443 = ze7.d;
        if (u443 != null) {
            if (!c2 || !k75.m(ze7, true)) {
                z3 = false;
            }
            u443.o.setValue(Boolean.valueOf(z3));
        }
        if (this.a) {
            ze7.b(ze7, ze7.p);
        }
        ze7.p = null;
    }

    public final void onCancel() {
        f();
    }

    public final void c() {
    }

    public final void d() {
    }
}
