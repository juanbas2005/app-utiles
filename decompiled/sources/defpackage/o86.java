package defpackage;

/* renamed from: o86  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o86 implements oa3 {
    public final boolean a;
    public final float b;
    public final long c;
    public final pq6 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public o86(boolean z, float f2, long j, pq6 pq6, boolean z2) {
        if (pq6 == null) {
            lx1 lx1 = lx1.b(f2, Float.NaN) ? null : new lx1(f2);
            if (lx1 != null) {
                pq6 = q96.a(lx1.w);
            } else {
                pq6 = null;
            }
            if (pq6 == null) {
                pq6 = gr8.h;
            }
        }
        this.a = z;
        this.b = f2;
        this.c = j;
        this.d = pq6;
        this.e = true;
        this.f = z2;
        this.g = true;
        this.h = true;
    }

    public final vo1 a(ef3 ef3) {
        return new kp1(ef3, this.a, this.b, new uy5(1, (Object) this), this.d, this.e, this.f, this.g, this.h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r5 = (defpackage.o86) r5;
     */
    public final boolean equals(Object obj) {
        o86 o86;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o86) && this.a == o86.a && lx1.b(this.b, o86.b) && jt0.c(this.c, o86.c) && sg3.e(this.d, o86.d) && this.e == o86.e && this.f == o86.f && this.g == o86.g && this.h == o86.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d2 = f21.d(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = jt0.h;
        return Boolean.hashCode(this.h) + hl6.i(hl6.i(hl6.i((this.d.hashCode() + pb4.b(d2, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }
}
