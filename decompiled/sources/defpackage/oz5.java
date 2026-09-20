package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: oz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oz5 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;
    public final boolean o;
    public final yz6 p;
    public final long q;
    public final double r;
    public final double s;
    public final float t;
    public final double u;
    public final boolean v;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ oz5(String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList arrayList, boolean z, int i4) {
        this(r3, r4, r5, r1, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, yz6.w, 0, 0.0d, 0.0d, 0.0f, 0.0d, false);
        String str12;
        String str13;
        int i5;
        int i6;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        List list;
        boolean z2;
        int i7 = i4;
        if ((i7 & 1) != 0) {
            str12 = "Cubacel";
        } else {
            str12 = str;
        }
        if ((i7 & 2) != 0) {
            str13 = "--";
        } else {
            str13 = str2;
        }
        if ((i7 & 4) != 0) {
            i5 = Integer.MIN_VALUE;
        } else {
            i5 = i2;
        }
        if ((i7 & 8) != 0) {
            i6 = 0;
        } else {
            i6 = i3;
        }
        if ((i7 & 16) != 0) {
            str14 = "--";
        } else {
            str14 = str3;
        }
        if ((i7 & 32) != 0) {
            str15 = "--";
        } else {
            str15 = str4;
        }
        if ((i7 & 64) != 0) {
            str16 = "--";
        } else {
            str16 = str5;
        }
        if ((i7 & 128) != 0) {
            str17 = "--";
        } else {
            str17 = str6;
        }
        if ((i7 & 256) != 0) {
            str18 = "--";
        } else {
            str18 = str7;
        }
        if ((i7 & 512) != 0) {
            str19 = "--";
        } else {
            str19 = str8;
        }
        if ((i7 & 1024) != 0) {
            str20 = "--";
        } else {
            str20 = str9;
        }
        if ((i7 & 2048) != 0) {
            str21 = "--";
        } else {
            str21 = str10;
        }
        if ((i7 & 4096) != 0) {
            str22 = "--";
        } else {
            str22 = str11;
        }
        if ((i7 & 8192) != 0) {
            list = a42.w;
        } else {
            list = arrayList;
        }
        if ((i7 & 16384) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
    }

    public static oz5 a(oz5 oz5, yz6 yz6, long j2, double d2, double d3, float f2, double d4, boolean z, int i2) {
        String str;
        yz6 yz62;
        String str2;
        long j3;
        double d5;
        double d6;
        float f3;
        double d7;
        boolean z2;
        oz5 oz52 = oz5;
        String str3 = oz52.a;
        String str4 = oz52.b;
        int i3 = oz52.c;
        int i4 = oz52.d;
        String str5 = oz52.e;
        String str6 = oz52.f;
        String str7 = oz52.g;
        String str8 = oz52.h;
        String str9 = oz52.i;
        String str10 = oz52.j;
        String str11 = oz52.k;
        String str12 = oz52.l;
        String str13 = oz52.m;
        List list = oz52.n;
        boolean z3 = oz52.o;
        if ((i2 & 32768) != 0) {
            str = str3;
            yz62 = oz52.p;
        } else {
            str = str3;
            yz62 = yz6;
        }
        yz6 yz63 = yz62;
        if ((i2 & 65536) != 0) {
            str2 = str4;
            j3 = oz52.q;
        } else {
            str2 = str4;
            j3 = j2;
        }
        long j4 = j3;
        if ((i2 & 131072) != 0) {
            d5 = oz52.r;
        } else {
            d5 = d2;
        }
        if ((i2 & 262144) != 0) {
            d6 = oz52.s;
        } else {
            d6 = d3;
        }
        if ((i2 & 524288) != 0) {
            f3 = oz52.t;
        } else {
            f3 = f2;
        }
        if ((i2 & 1048576) != 0) {
            d7 = oz52.u;
        } else {
            d7 = d4;
        }
        if ((i2 & 2097152) != 0) {
            z2 = oz52.v;
        } else {
            z2 = z;
        }
        oz52.getClass();
        str.getClass();
        str2.getClass();
        str5.getClass();
        str6.getClass();
        hl6.t(str7, str8, str9, str10, str11);
        str12.getClass();
        str13.getClass();
        list.getClass();
        yz63.getClass();
        return new oz5(str, str2, i3, i4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, z3, yz63, j4, d5, d6, f3, d7, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz5)) {
            return false;
        }
        oz5 oz5 = (oz5) obj;
        if (sg3.e(this.a, oz5.a) && sg3.e(this.b, oz5.b) && this.c == oz5.c && this.d == oz5.d && sg3.e(this.e, oz5.e) && sg3.e(this.f, oz5.f) && sg3.e(this.g, oz5.g) && sg3.e(this.h, oz5.h) && sg3.e(this.i, oz5.i) && sg3.e(this.j, oz5.j) && sg3.e(this.k, oz5.k) && sg3.e(this.l, oz5.l) && sg3.e(this.m, oz5.m) && sg3.e(this.n, oz5.n) && this.o == oz5.o && this.p == oz5.p && this.q == oz5.q && Double.compare(this.r, oz5.r) == 0 && Double.compare(this.s, oz5.s) == 0 && Float.compare(this.t, oz5.t) == 0 && Double.compare(this.u, oz5.u) == 0 && this.v == oz5.v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b2 = pb4.b((this.p.hashCode() + hl6.i(hl6.j(this.n, hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(f21.e(this.d, f21.e(this.c, hl6.h(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31, this.o)) * 31, 31, this.q);
        int hashCode = Double.hashCode(this.s);
        int d2 = f21.d(this.t, (hashCode + ((Double.hashCode(this.r) + b2) * 31)) * 31, 31);
        return Boolean.hashCode(this.v) + ((Double.hashCode(this.u) + d2) * 31);
    }

    public final String toString() {
        StringBuilder o2 = f21.o("RedScreenData(operatorName=", this.a, ", networkTypeName=", this.b, ", signalDbm=");
        o2.append(this.c);
        o2.append(", signalLevel=");
        o2.append(this.d);
        o2.append(", cellType=");
        f21.v(o2, this.e, ", cellId=", this.f, ", areaCode=");
        f21.v(o2, this.g, ", physicalCellId=", this.h, ", channel=");
        f21.v(o2, this.i, ", band=", this.j, ", frequency=");
        f21.v(o2, this.k, ", rsrq=", this.l, ", bandwidth=");
        o2.append(this.m);
        o2.append(", nearbyCells=");
        o2.append(this.n);
        o2.append(", hasPermission=");
        o2.append(this.o);
        o2.append(", speedTestPhase=");
        o2.append(this.p);
        o2.append(", pingMs=");
        o2.append(this.q);
        o2.append(", downloadMbps=");
        o2.append(this.r);
        o2.append(", uploadMbps=");
        o2.append(this.s);
        o2.append(", speedTestProgress=");
        o2.append(this.t);
        o2.append(", currentSpeedMbps=");
        o2.append(this.u);
        o2.append(", licenseActive=");
        o2.append(this.v);
        o2.append(")");
        return o2.toString();
    }

    public oz5(String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, boolean z, yz6 yz6, long j2, double d2, double d3, float f2, double d4, boolean z2) {
        hl6.t(str, str2, str3, str4, str5);
        hl6.t(str6, str7, str8, str9, str10);
        str11.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = list;
        this.o = z;
        this.p = yz6;
        this.q = j2;
        this.r = d2;
        this.s = d3;
        this.t = f2;
        this.u = d4;
        this.v = z2;
    }
}
