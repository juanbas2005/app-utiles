package defpackage;

/* renamed from: nc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nc5 implements rl {
    public final int a;
    public final int b;
    public final long c;
    public final mf7 d;
    public final qj5 e;
    public final m64 f;
    public final int g;
    public final int h;
    public final jg7 i;

    public nc5(int i2, int i3, long j, mf7 mf7, qj5 qj5, m64 m64, int i4, int i5, jg7 jg7) {
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.d = mf7;
        this.e = qj5;
        this.f = m64;
        this.g = i4;
        this.h = i5;
        this.i = jg7;
        if (!wg7.a(j, wg7.c) && wg7.c(j) < 0.0f) {
            float c2 = wg7.c(j);
            zb3.b("lineHeight can't be negative (" + c2 + ")");
        }
    }

    public final nc5 a(nc5 nc5) {
        if (nc5 == null) {
            return this;
        }
        return oc5.a(this, nc5.a, nc5.b, nc5.c, nc5.d, nc5.e, nc5.f, nc5.g, nc5.h, nc5.i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r5 = (defpackage.nc5) r5;
     */
    public final boolean equals(Object obj) {
        nc5 nc5;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nc5) && this.a == nc5.a && this.b == nc5.b && wg7.a(this.c, nc5.c) && sg3.e(this.d, nc5.d) && sg3.e(this.e, nc5.e) && sg3.e(this.f, nc5.f) && this.g == nc5.g && this.h == nc5.h && sg3.e(this.i, nc5.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int e2 = f21.e(this.b, Integer.hashCode(this.a) * 31, 31);
        xg7[] xg7Arr = wg7.b;
        int b2 = pb4.b(e2, 31, this.c);
        int i5 = 0;
        mf7 mf7 = this.d;
        if (mf7 != null) {
            i2 = mf7.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (b2 + i2) * 31;
        qj5 qj5 = this.e;
        if (qj5 != null) {
            i3 = qj5.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        m64 m64 = this.f;
        if (m64 != null) {
            i4 = m64.hashCode();
        } else {
            i4 = 0;
        }
        int e3 = f21.e(this.h, f21.e(this.g, (i7 + i4) * 31, 31), 31);
        jg7 jg7 = this.i;
        if (jg7 != null) {
            i5 = jg7.hashCode();
        }
        return e3 + i5;
    }

    public final String toString() {
        String a2 = hc7.a(this.a);
        String a3 = ud7.a(this.b);
        String d2 = wg7.d(this.c);
        String a4 = g64.a(this.g);
        String a5 = i73.a(this.h);
        StringBuilder o = f21.o("ParagraphStyle(textAlign=", a2, ", textDirection=", a3, ", lineHeight=");
        o.append(d2);
        o.append(", textIndent=");
        o.append(this.d);
        o.append(", platformStyle=");
        o.append(this.e);
        o.append(", lineHeightStyle=");
        o.append(this.f);
        o.append(", lineBreak=");
        f21.v(o, a4, ", hyphens=", a5, ", textMotion=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
