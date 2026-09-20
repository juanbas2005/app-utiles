package defpackage;

/* renamed from: yy6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yy6 implements rl {
    public final kf7 a;
    public final long b;
    public final am2 c;
    public final yl2 d;
    public final zl2 e;
    public final ea7 f;
    public final String g;
    public final long h;
    public final h60 i;
    public final lf7 j;
    public final ya4 k;
    public final long l;
    public final rd7 m;
    public final lq6 n;
    public final yj5 o;
    public final iz1 p;

    /* JADX WARNING: Illegal instructions before constructor call */
    public yy6(long j2, long j3, am2 am2, yl2 yl2, zl2 zl2, ea7 ea7, String str, long j4, h60 h60, lf7 lf7, ya4 ya4, long j5, rd7 rd7, lq6 lq6, int i2) {
        this(r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, (yj5) null, (iz1) null);
        long j6;
        long j7;
        am2 am22;
        yl2 yl22;
        zl2 zl22;
        ea7 ea72;
        String str2;
        long j8;
        h60 h602;
        lf7 lf72;
        ya4 ya42;
        long j9;
        rd7 rd72;
        lq6 lq62;
        int i3 = i2;
        if ((i3 & 1) != 0) {
            j6 = jt0.g;
        } else {
            j6 = j2;
        }
        if ((i3 & 2) != 0) {
            j7 = wg7.c;
        } else {
            j7 = j3;
        }
        if ((i3 & 4) != 0) {
            am22 = null;
        } else {
            am22 = am2;
        }
        if ((i3 & 8) != 0) {
            yl22 = null;
        } else {
            yl22 = yl2;
        }
        if ((i3 & 16) != 0) {
            zl22 = null;
        } else {
            zl22 = zl2;
        }
        if ((i3 & 32) != 0) {
            ea72 = null;
        } else {
            ea72 = ea7;
        }
        if ((i3 & 64) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i3 & 128) != 0) {
            j8 = wg7.c;
        } else {
            j8 = j4;
        }
        if ((i3 & 256) != 0) {
            h602 = null;
        } else {
            h602 = h60;
        }
        if ((i3 & 512) != 0) {
            lf72 = null;
        } else {
            lf72 = lf7;
        }
        if ((i3 & 1024) != 0) {
            ya42 = null;
        } else {
            ya42 = ya4;
        }
        if ((i3 & 2048) != 0) {
            j9 = jt0.g;
        } else {
            j9 = j5;
        }
        if ((i3 & 4096) != 0) {
            rd72 = null;
        } else {
            rd72 = rd7;
        }
        if ((i3 & 8192) != 0) {
            lq62 = null;
        } else {
            lq62 = lq6;
        }
    }

    public final boolean a(yy6 yy6) {
        if (this == yy6) {
            return true;
        }
        if (wg7.a(this.b, yy6.b) && sg3.e(this.c, yy6.c) && sg3.e(this.d, yy6.d) && sg3.e(this.e, yy6.e) && sg3.e(this.f, yy6.f) && sg3.e(this.g, yy6.g) && wg7.a(this.h, yy6.h) && sg3.e(this.i, yy6.i) && sg3.e(this.j, yy6.j) && sg3.e(this.k, yy6.k) && jt0.c(this.l, yy6.l) && sg3.e(this.o, yy6.o)) {
            return true;
        }
        return false;
    }

    public final boolean b(yy6 yy6) {
        if (sg3.e(this.a, yy6.a) && sg3.e(this.m, yy6.m) && sg3.e(this.n, yy6.n) && sg3.e(this.p, yy6.p)) {
            return true;
        }
        return false;
    }

    public final yy6 c(yy6 yy6) {
        yy6 yy62 = yy6;
        if (yy62 == null) {
            return this;
        }
        kf7 kf7 = yy62.a;
        long b2 = kf7.b();
        kc0 c2 = kf7.c();
        float a2 = kf7.a();
        long j2 = yy62.b;
        am2 am2 = yy62.c;
        yl2 yl2 = yy62.d;
        zl2 zl2 = yy62.e;
        ea7 ea7 = yy62.f;
        String str = yy62.g;
        long j3 = yy62.h;
        h60 h60 = yy62.i;
        lf7 lf7 = yy62.j;
        h60 h602 = h60;
        ya4 ya4 = yy62.k;
        lf7 lf72 = lf7;
        long j4 = yy62.l;
        rd7 rd7 = yy62.m;
        lq6 lq6 = yy62.n;
        lq6 lq62 = lq6;
        return zy6.a(this, b2, c2, a2, j2, am2, yl2, zl2, ea7, str, j3, h602, lf72, ya4, j4, rd7, lq62, yy62.o, yy62.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy6)) {
            return false;
        }
        yy6 yy6 = (yy6) obj;
        if (!a(yy6) || !b(yy6)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        kf7 kf7 = this.a;
        long b2 = kf7.b();
        int i14 = jt0.h;
        int hashCode = Long.hashCode(b2) * 31;
        kc0 c2 = kf7.c();
        int i15 = 0;
        if (c2 != null) {
            i2 = c2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = Float.hashCode(kf7.a());
        xg7[] xg7Arr = wg7.b;
        int b3 = pb4.b((hashCode2 + ((hashCode + i2) * 31)) * 31, 31, this.b);
        am2 am2 = this.c;
        if (am2 != null) {
            i3 = am2.w;
        } else {
            i3 = 0;
        }
        int i16 = (b3 + i3) * 31;
        yl2 yl2 = this.d;
        if (yl2 != null) {
            i4 = Integer.hashCode(yl2.a);
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        zl2 zl2 = this.e;
        if (zl2 != null) {
            i5 = Integer.hashCode(zl2.a);
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        ea7 ea7 = this.f;
        if (ea7 != null) {
            i6 = ea7.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 31;
        String str = this.g;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int b4 = pb4.b((i19 + i7) * 31, 31, this.h);
        h60 h60 = this.i;
        if (h60 != null) {
            i8 = Float.hashCode(h60.a);
        } else {
            i8 = 0;
        }
        int i20 = (b4 + i8) * 31;
        lf7 lf7 = this.j;
        if (lf7 != null) {
            i9 = lf7.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 31;
        ya4 ya4 = this.k;
        if (ya4 != null) {
            i10 = ya4.w.hashCode();
        } else {
            i10 = 0;
        }
        int b5 = pb4.b((i21 + i10) * 31, 31, this.l);
        rd7 rd7 = this.m;
        if (rd7 != null) {
            i11 = rd7.a;
        } else {
            i11 = 0;
        }
        int i22 = (b5 + i11) * 31;
        lq6 lq6 = this.n;
        if (lq6 != null) {
            i12 = lq6.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (i22 + i12) * 31;
        yj5 yj5 = this.o;
        if (yj5 != null) {
            i13 = yj5.hashCode();
        } else {
            i13 = 0;
        }
        int i24 = (i23 + i13) * 31;
        iz1 iz1 = this.p;
        if (iz1 != null) {
            i15 = iz1.hashCode();
        }
        return i24 + i15;
    }

    public final String toString() {
        kf7 kf7 = this.a;
        String i2 = jt0.i(kf7.b());
        kc0 c2 = kf7.c();
        float a2 = kf7.a();
        String d2 = wg7.d(this.b);
        String d3 = wg7.d(this.h);
        String i3 = jt0.i(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(i2);
        sb.append(", brush=");
        sb.append(c2);
        sb.append(", alpha=");
        sb.append(a2);
        sb.append(", fontSize=");
        sb.append(d2);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        f21.v(sb, this.g, ", letterSpacing=", d3, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(i3);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public yy6(kf7 kf7, long j2, am2 am2, yl2 yl2, zl2 zl2, ea7 ea7, String str, long j3, h60 h60, lf7 lf7, ya4 ya4, long j4, rd7 rd7, lq6 lq6, yj5 yj5, iz1 iz1) {
        this.a = kf7;
        this.b = j2;
        this.c = am2;
        this.d = yl2;
        this.e = zl2;
        this.f = ea7;
        this.g = str;
        this.h = j3;
        this.i = h60;
        this.j = lf7;
        this.k = ya4;
        this.l = j4;
        this.m = rd7;
        this.n = lq6;
        this.o = yj5;
        this.p = iz1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public yy6(long j2, long j3, am2 am2, yl2 yl2, zl2 zl2, ea7 ea7, String str, long j4, h60 h60, lf7 lf7, ya4 ya4, long j5, rd7 rd7, lq6 lq6, yj5 yj5, iz1 iz1) {
        this(r0 != 16 ? new xt0(r0) : jf7.a, j3, am2, yl2, zl2, ea7, str, j4, h60, lf7, ya4, j5, rd7, lq6, yj5, iz1);
        long j6 = j2;
    }
}
