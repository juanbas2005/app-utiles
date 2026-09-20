package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: oz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oz2 extends h98 {
    public final void a(aq1 aq1) {
        j50 j50 = (j50) this.b;
        int i = j50.r0;
        eq1 eq1 = this.h;
        Iterator it = eq1.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((eq1) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            eq1.d(i3 + j50.t0);
        } else {
            eq1.d(i2 + j50.t0);
        }
    }

    public final void d() {
        g31 g31 = this.b;
        if (g31 instanceof j50) {
            eq1 eq1 = this.h;
            eq1.b = true;
            ArrayList arrayList = eq1.l;
            j50 j50 = (j50) g31;
            int i = j50.r0;
            boolean z = j50.s0;
            int i2 = 0;
            if (i == 0) {
                eq1.e = 4;
                while (i2 < j50.q0) {
                    g31 g312 = j50.p0[i2];
                    if (z || g312.f0 != 8) {
                        eq1 eq12 = g312.d.h;
                        eq12.k.add(eq1);
                        arrayList.add(eq12);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 1) {
                eq1.e = 5;
                while (i2 < j50.q0) {
                    g31 g313 = j50.p0[i2];
                    if (z || g313.f0 != 8) {
                        eq1 eq13 = g313.d.i;
                        eq13.k.add(eq1);
                        arrayList.add(eq13);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 2) {
                eq1.e = 6;
                while (i2 < j50.q0) {
                    g31 g314 = j50.p0[i2];
                    if (z || g314.f0 != 8) {
                        eq1 eq14 = g314.e.h;
                        eq14.k.add(eq1);
                        arrayList.add(eq14);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            } else if (i == 3) {
                eq1.e = 7;
                while (i2 < j50.q0) {
                    g31 g315 = j50.p0[i2];
                    if (z || g315.f0 != 8) {
                        eq1 eq15 = g315.e.i;
                        eq15.k.add(eq1);
                        arrayList.add(eq15);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            }
        }
    }

    public final void e() {
        g31 g31 = this.b;
        if (g31 instanceof j50) {
            int i = ((j50) g31).r0;
            eq1 eq1 = this.h;
            if (i == 0 || i == 1) {
                g31.X = eq1.g;
            } else {
                g31.Y = eq1.g;
            }
        }
    }

    public final void f() {
        this.c = null;
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
