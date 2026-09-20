package defpackage;

import android.view.View;

/* renamed from: s64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s64 {
    public t22 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public s64() {
        c();
    }

    public final void a() {
        int i;
        boolean z = this.d;
        t22 t22 = this.a;
        if (z) {
            i = t22.i();
        } else {
            i = t22.m();
        }
        this.c = i;
    }

    public final void b(View view, int i) {
        int i2;
        t22 t22 = this.a;
        int i3 = 0;
        if (Integer.MIN_VALUE == t22.a) {
            i2 = 0;
        } else {
            i2 = t22.n() - t22.a;
        }
        if (i2 >= 0) {
            boolean z = this.d;
            t22 t222 = this.a;
            if (z) {
                int d2 = t222.d(view);
                t22 t223 = this.a;
                if (Integer.MIN_VALUE != t223.a) {
                    i3 = t223.n() - t223.a;
                }
                this.c = i3 + d2;
            } else {
                this.c = t222.g(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        t22 t224 = this.a;
        if (z2) {
            int i4 = (t224.i() - i2) - this.a.d(view);
            this.c = this.a.i() - i4;
            if (i4 > 0) {
                int e2 = this.c - this.a.e(view);
                int m = this.a.m();
                int min = e2 - (Math.min(this.a.g(view) - m, 0) + m);
                if (min < 0) {
                    this.c = Math.min(i4, -min) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int g = t224.g(view);
        int m2 = g - this.a.m();
        this.c = g;
        if (m2 > 0) {
            int i5 = (this.a.i() - Math.min(0, (this.a.i() - i2) - this.a.d(view))) - (this.a.e(view) + g);
            if (i5 < 0) {
                this.c -= Math.min(m2, -i5);
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
