package defpackage;

/* renamed from: tg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tg7 {
    public static final tg7 d = new tg7(0, 0, (am2) null, 0, (l57) null, 0, 0, (dk5) null, (m64) null, 16777215);
    public final yy6 a;
    public final nc5 b;
    public final dk5 c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public tg7(long j, long j2, am2 am2, long j3, l57 l57, int i, long j4, dk5 dk5, m64 m64, int i2) {
        this(r3, new nc5(r1, 0, r31, (mf7) null, r5, r0, 0, 0, (jg7) null), r2);
        long j5;
        long j6;
        am2 am22;
        long j7;
        l57 l572;
        int i3;
        long j8;
        dk5 dk52;
        m64 m642;
        yj5 yj5;
        qj5 qj5;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            j5 = jt0.g;
        } else {
            j5 = j;
        }
        if ((i4 & 2) != 0) {
            j6 = wg7.c;
        } else {
            j6 = j2;
        }
        if ((i4 & 4) != 0) {
            am22 = null;
        } else {
            am22 = am2;
        }
        if ((i4 & 128) != 0) {
            j7 = wg7.c;
        } else {
            j7 = j3;
        }
        long j9 = jt0.g;
        if ((i4 & 16384) != 0) {
            l572 = null;
        } else {
            l572 = l57;
        }
        if ((32768 & i4) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((131072 & i4) != 0) {
            j8 = wg7.c;
        } else {
            j8 = j4;
        }
        if ((524288 & i4) != 0) {
            dk52 = null;
        } else {
            dk52 = dk5;
        }
        if ((i4 & 1048576) != 0) {
            m642 = null;
        } else {
            m642 = m64;
        }
        if (dk52 != null) {
            yj5 = dk52.a;
        } else {
            yj5 = null;
        }
        dk5 dk53 = dk52;
        dk5 dk54 = dk53;
        yy6 yy6 = new yy6(j5, j6, am22, (yl2) null, (zl2) null, (ea7) null, (String) null, j7, (h60) null, (lf7) null, (ya4) null, j9, (rd7) null, (lq6) null, yj5, (iz1) l572);
        if (dk54 != null) {
            qj5 = dk54.b;
        } else {
            qj5 = null;
        }
        long j10 = j8;
    }

    public static tg7 a(tg7 tg7, long j, long j2, am2 am2, ea7 ea7, long j3, long j4, dk5 dk5, m64 m64, int i) {
        long j5;
        long j6;
        am2 am22;
        ea7 ea72;
        long j7;
        int i2;
        int i3;
        long j8;
        long j9;
        dk5 dk52;
        m64 m642;
        kf7 kf7;
        yj5 yj5;
        yy6 yy6;
        tg7 tg72 = tg7;
        int i4 = i;
        if ((i4 & 1) != 0) {
            j5 = tg72.a.a.b();
        } else {
            j5 = j;
        }
        if ((i4 & 2) != 0) {
            j6 = tg72.a.b;
        } else {
            j6 = j2;
        }
        if ((i4 & 4) != 0) {
            am22 = tg72.a.c;
        } else {
            am22 = am2;
        }
        yy6 yy62 = tg72.a;
        yl2 yl2 = yy62.d;
        zl2 zl2 = yy62.e;
        if ((i4 & 32) != 0) {
            ea72 = yy62.f;
        } else {
            ea72 = ea7;
        }
        String str = yy62.g;
        if ((i4 & 128) != 0) {
            j7 = yy62.h;
        } else {
            j7 = j3;
        }
        h60 h60 = yy62.i;
        lf7 lf7 = yy62.j;
        ya4 ya4 = yy62.k;
        h60 h602 = h60;
        lf7 lf72 = lf7;
        long j10 = yy62.l;
        rd7 rd7 = yy62.m;
        lq6 lq6 = yy62.n;
        int i5 = i & 32768;
        iz1 iz1 = yy62.p;
        if (i5 != 0) {
            i2 = tg72.b.a;
        } else {
            i2 = 3;
        }
        int i6 = i2;
        if ((i & 65536) != 0) {
            i3 = tg72.b.b;
        } else {
            i3 = 1;
        }
        int i7 = i3;
        if ((i & 131072) != 0) {
            j9 = j10;
            j8 = tg72.b.c;
        } else {
            j9 = j10;
            j8 = j4;
        }
        nc5 nc5 = tg72.b;
        mf7 mf7 = nc5.d;
        if ((i & 524288) != 0) {
            dk52 = tg72.c;
        } else {
            dk52 = dk5;
        }
        if ((i & 1048576) != 0) {
            m642 = nc5.f;
        } else {
            m642 = m64;
        }
        int i8 = nc5.g;
        mf7 mf72 = mf7;
        int i9 = nc5.h;
        jg7 jg7 = nc5.i;
        int i10 = i8;
        int i11 = i9;
        if (jt0.c(j5, yy62.a.b())) {
            kf7 = yy62.a;
        } else if (j5 != 16) {
            kf7 = new xt0(j5);
        } else {
            kf7 = jf7.a;
        }
        qj5 qj5 = null;
        if (dk52 != null) {
            yj5 = dk52.a;
        } else {
            yj5 = null;
        }
        ya4 ya42 = ya4;
        kf7 kf72 = kf7;
        int i12 = i10;
        ya4 ya43 = ya42;
        yy6 = new yy6(kf72, j6, am22, yl2, zl2, ea72, str, j7, h602, lf72, ya43, j9, rd7, lq6, yj5, iz1);
        if (dk52 != null) {
            qj5 = dk52.b;
        }
        return new tg7(yy6, new nc5(i6, i7, j8, mf72, qj5, m642, i12, i11, jg7), dk52);
    }

    public static tg7 e(tg7 tg7, long j, long j2, am2 am2, ea7 ea7, long j3, rd7 rd7, int i, long j4, int i2) {
        long j5;
        am2 am22;
        ea7 ea72;
        long j6;
        rd7 rd72;
        int i3;
        long j7;
        tg7 tg72 = tg7;
        int i4 = i2;
        if ((i4 & 2) != 0) {
            j5 = wg7.c;
        } else {
            j5 = j2;
        }
        if ((i4 & 4) != 0) {
            am22 = null;
        } else {
            am22 = am2;
        }
        if ((i4 & 32) != 0) {
            ea72 = null;
        } else {
            ea72 = ea7;
        }
        if ((i4 & 128) != 0) {
            j6 = wg7.c;
        } else {
            j6 = j3;
        }
        long j8 = jt0.g;
        if ((i4 & 4096) != 0) {
            rd72 = null;
        } else {
            rd72 = rd7;
        }
        if ((32768 & i4) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i4 & 131072) != 0) {
            j7 = wg7.c;
        } else {
            j7 = j4;
        }
        yy6 a2 = zy6.a(tg72.a, j, (kc0) null, Float.NaN, j5, am22, (yl2) null, (zl2) null, ea72, (String) null, j6, (h60) null, (lf7) null, (ya4) null, j8, rd72, (lq6) null, (yj5) null, (iz1) null);
        nc5 a3 = oc5.a(tg72.b, i3, 0, j7, (mf7) null, (qj5) null, (m64) null, 0, 0, (jg7) null);
        if (tg72.a == a2 && tg72.b == a3) {
            return tg72;
        }
        return new tg7(a2, a3);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(tg7 tg7) {
        if (this == tg7) {
            return true;
        }
        if (!sg3.e(this.b, tg7.b) || !this.a.a(tg7.a)) {
            return false;
        }
        return true;
    }

    public final tg7 d(tg7 tg7) {
        if (tg7 == null || tg7.equals(d)) {
            return this;
        }
        return new tg7(this.a.c(tg7.a), this.b.a(tg7.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg7)) {
            return false;
        }
        tg7 tg7 = (tg7) obj;
        if (sg3.e(this.a, tg7.a) && sg3.e(this.b, tg7.b) && sg3.e(this.c, tg7.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        dk5 dk5 = this.c;
        if (dk5 != null) {
            i = dk5.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        String i = jt0.i(b());
        yy6 yy6 = this.a;
        kc0 c2 = yy6.a.c();
        float a2 = yy6.a.a();
        String d2 = wg7.d(yy6.b);
        am2 am2 = yy6.c;
        yl2 yl2 = yy6.d;
        zl2 zl2 = yy6.e;
        ea7 ea7 = yy6.f;
        String str = yy6.g;
        String d3 = wg7.d(yy6.h);
        h60 h60 = yy6.i;
        lf7 lf7 = yy6.j;
        ya4 ya4 = yy6.k;
        String i2 = jt0.i(yy6.l);
        rd7 rd7 = yy6.m;
        lq6 lq6 = yy6.n;
        iz1 iz1 = yy6.p;
        nc5 nc5 = this.b;
        String a3 = hc7.a(nc5.a);
        String a4 = ud7.a(nc5.b);
        String str2 = i2;
        lq6 lq62 = lq6;
        String d4 = wg7.d(nc5.c);
        mf7 mf7 = nc5.d;
        m64 m64 = nc5.f;
        String a5 = g64.a(nc5.g);
        String a6 = i73.a(nc5.h);
        jg7 jg7 = nc5.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(i);
        sb.append(", brush=");
        sb.append(c2);
        sb.append(", alpha=");
        sb.append(a2);
        sb.append(", fontSize=");
        sb.append(d2);
        sb.append(", fontWeight=");
        sb.append(am2);
        sb.append(", fontStyle=");
        sb.append(yl2);
        sb.append(", fontSynthesis=");
        sb.append(zl2);
        sb.append(", fontFamily=");
        sb.append(ea7);
        sb.append(", fontFeatureSettings=");
        f21.v(sb, str, ", letterSpacing=", d3, ", baselineShift=");
        sb.append(h60);
        sb.append(", textGeometricTransform=");
        sb.append(lf7);
        sb.append(", localeList=");
        sb.append(ya4);
        sb.append(", background=");
        sb.append(str2);
        sb.append(", textDecoration=");
        sb.append(rd7);
        sb.append(", shadow=");
        sb.append(lq62);
        sb.append(", drawStyle=");
        sb.append(iz1);
        sb.append(", textAlign=");
        sb.append(a3);
        sb.append(", textDirection=");
        f21.v(sb, a4, ", lineHeight=", d4, ", textIndent=");
        sb.append(mf7);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(m64);
        sb.append(", lineBreak=");
        sb.append(a5);
        sb.append(", hyphens=");
        sb.append(a6);
        sb.append(", textMotion=");
        sb.append(jg7);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public tg7(yy6 yy6, nc5 nc5) {
        this(yy6, nc5, r0);
        dk5 dk5;
        yj5 yj5 = yy6.o;
        qj5 qj5 = nc5.e;
        if (yj5 == null && qj5 == null) {
            dk5 = null;
        } else {
            dk5 = new dk5(yj5, qj5);
        }
    }

    public tg7(yy6 yy6, nc5 nc5, dk5 dk5) {
        this.a = yy6;
        this.b = nc5;
        this.c = dk5;
    }
}
