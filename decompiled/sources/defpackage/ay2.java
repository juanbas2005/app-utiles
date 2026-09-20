package defpackage;

/* renamed from: ay2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ay2 extends h98 {
    public final void a(aq1 aq1) {
        eq1 eq1 = this.h;
        if (eq1.c && !eq1.j) {
            eq1.d((int) ((((float) ((eq1) eq1.l.get(0)).g) * ((zx2) this.b).p0) + 0.5f));
        }
    }

    public final void d() {
        g31 g31 = this.b;
        zx2 zx2 = (zx2) g31;
        int i = zx2.q0;
        int i2 = zx2.r0;
        int i3 = zx2.t0;
        eq1 eq1 = this.h;
        if (i3 == 1) {
            if (i != -1) {
                eq1.l.add(g31.S.d.h);
                this.b.S.d.h.k.add(eq1);
                eq1.f = i;
            } else if (i2 != -1) {
                eq1.l.add(g31.S.d.i);
                this.b.S.d.i.k.add(eq1);
                eq1.f = -i2;
            } else {
                eq1.b = true;
                eq1.l.add(g31.S.d.i);
                this.b.S.d.i.k.add(eq1);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            eq1.l.add(g31.S.e.h);
            this.b.S.e.h.k.add(eq1);
            eq1.f = i;
        } else if (i2 != -1) {
            eq1.l.add(g31.S.e.i);
            this.b.S.e.i.k.add(eq1);
            eq1.f = -i2;
        } else {
            eq1.b = true;
            eq1.l.add(g31.S.e.i);
            this.b.S.e.i.k.add(eq1);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public final void e() {
        g31 g31 = this.b;
        int i = ((zx2) g31).t0;
        eq1 eq1 = this.h;
        if (i == 1) {
            g31.X = eq1.g;
        } else {
            g31.Y = eq1.g;
        }
    }

    public final void f() {
        this.h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(eq1 eq1) {
        eq1 eq12 = this.h;
        eq12.k.add(eq1);
        eq1.l.add(eq12);
    }
}
