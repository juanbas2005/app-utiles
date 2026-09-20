package defpackage;

/* renamed from: jh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jh0 {
    public final ag7 a;

    public jh0(ag7 ag7) {
        this.a = ag7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh0)) {
            return false;
        }
        ag7 ag7 = this.a;
        vl vlVar = ag7.a;
        ag7 ag72 = ((jh0) obj).a;
        if (sg3.e(vlVar, ag72.a) && ag7.b.c(ag72.b) && sg3.e(ag7.c, ag72.c) && ag7.d == ag72.d && ag7.e == ag72.e && ag7.f == ag72.f && sg3.e(ag7.g, ag72.g) && ag7.h == ag72.h && ag7.i == ag72.i && k31.b(ag7.j, ag72.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ag7 ag7 = this.a;
        int hashCode = ag7.a.hashCode() * 31;
        tg7 tg7 = ag7.b;
        yy6 yy6 = tg7.a;
        long j = yy6.b;
        xg7[] xg7Arr = wg7.b;
        int hashCode2 = Long.hashCode(j) * 31;
        am2 am2 = yy6.c;
        int i10 = 0;
        if (am2 != null) {
            i = am2.w;
        } else {
            i = 0;
        }
        int i11 = (hashCode2 + i) * 31;
        yl2 yl2 = yy6.d;
        if (yl2 != null) {
            i2 = Integer.hashCode(yl2.a);
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        zl2 zl2 = yy6.e;
        if (zl2 != null) {
            i3 = Integer.hashCode(zl2.a);
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        ea7 ea7 = yy6.f;
        if (ea7 != null) {
            i4 = ea7.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        String str = yy6.g;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int b = pb4.b((i14 + i5) * 31, 31, yy6.h);
        h60 h60 = yy6.i;
        if (h60 != null) {
            i6 = Float.hashCode(h60.a);
        } else {
            i6 = 0;
        }
        int i15 = (b + i6) * 31;
        lf7 lf7 = yy6.j;
        if (lf7 != null) {
            i7 = lf7.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 31;
        ya4 ya4 = yy6.k;
        if (ya4 != null) {
            i8 = ya4.w.hashCode();
        } else {
            i8 = 0;
        }
        long j2 = yy6.l;
        int i17 = jt0.h;
        int b2 = pb4.b((i16 + i8) * 31, 31, j2);
        yj5 yj5 = yy6.o;
        if (yj5 != null) {
            i9 = yj5.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode3 = (tg7.b.hashCode() + ((b2 + i9) * 31)) * 31;
        dk5 dk5 = tg7.c;
        if (dk5 != null) {
            i10 = dk5.hashCode();
        }
        int e = f21.e(ag7.f, hl6.i((hl6.j(ag7.c, (hashCode3 + i10 + hashCode) * 31, 31) + ag7.d) * 31, 31, ag7.e), 31);
        int hashCode4 = ag7.h.hashCode();
        return Long.hashCode(ag7.j) + ((ag7.i.hashCode() + ((hashCode4 + ((ag7.g.hashCode() + e) * 31)) * 31)) * 31);
    }
}
