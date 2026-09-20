package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: q26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q26 {
    public final List a;
    public final List b;
    public final List c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final List h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Long m;
    public final Long n;
    public final boolean o;
    public final boolean p;

    /* JADX WARNING: Illegal instructions before constructor call */
    public q26() {
        this(r1, r1, r1, "0.00 CUP", "0.00 CUP", (Long) null, (Long) null, r8, "0.00 CUP", "0.00 CUP", "0.00 CUP", "0.00 CUP", (Long) null, (Long) null, true, true);
        w52 w52 = jh5.B;
        ArrayList arrayList = new ArrayList(et0.e0(w52, 10));
        e2 e2Var = new e2(0, w52);
        while (e2Var.hasNext()) {
            arrayList.add(new rh5((jh5) e2Var.next(), 0, "0.00 CUP", "0.00 CUP"));
        }
        a42 a42 = a42.w;
    }

    public static q26 a(q26 q26, List list, List list2, ArrayList arrayList, String str, String str2, Long l2, Long l3, ArrayList arrayList2, String str3, String str4, String str5, String str6, Long l4, Long l5, boolean z, boolean z2, int i2) {
        q26 q262 = q26;
        int i3 = i2;
        List list3 = (i3 & 1) != 0 ? q262.a : list;
        List list4 = (i3 & 2) != 0 ? q262.b : list2;
        List list5 = (i3 & 4) != 0 ? q262.c : arrayList;
        String str7 = (i3 & 8) != 0 ? q262.d : str;
        String str8 = (i3 & 16) != 0 ? q262.e : str2;
        Long l6 = (i3 & 32) != 0 ? q262.f : l2;
        Long l7 = (i3 & 64) != 0 ? q262.g : l3;
        List list6 = (i3 & 128) != 0 ? q262.h : arrayList2;
        String str9 = (i3 & 256) != 0 ? q262.i : str3;
        String str10 = (i3 & 512) != 0 ? q262.j : str4;
        String str11 = (i3 & 1024) != 0 ? q262.k : str5;
        String str12 = (i3 & 2048) != 0 ? q262.l : str6;
        Long l8 = (i3 & 4096) != 0 ? q262.m : l4;
        Long l9 = (i3 & 8192) != 0 ? q262.n : l5;
        List list7 = list3;
        boolean z3 = (i3 & 16384) != 0 ? q262.o : z;
        boolean z4 = (i3 & 32768) != 0 ? q262.p : z2;
        q262.getClass();
        list7.getClass();
        list4.getClass();
        list5.getClass();
        str7.getClass();
        str8.getClass();
        list6.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        return new q26(list7, list4, list5, str7, str8, l6, l7, list6, str9, str10, str11, str12, l8, l9, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q26)) {
            return false;
        }
        q26 q26 = (q26) obj;
        if (sg3.e(this.a, q26.a) && sg3.e(this.b, q26.b) && sg3.e(this.c, q26.c) && sg3.e(this.d, q26.d) && sg3.e(this.e, q26.e) && sg3.e(this.f, q26.f) && sg3.e(this.g, q26.g) && sg3.e(this.h, q26.h) && sg3.e(this.i, q26.i) && sg3.e(this.j, q26.j) && sg3.e(this.k, q26.k) && sg3.e(this.l, q26.l) && sg3.e(this.m, q26.m) && sg3.e(this.n, q26.n) && this.o == q26.o && this.p == q26.p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int h2 = hl6.h(hl6.h(hl6.j(this.c, hl6.j(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
        int i5 = 0;
        Long l2 = this.f;
        if (l2 == null) {
            i2 = 0;
        } else {
            i2 = l2.hashCode();
        }
        int i6 = (h2 + i2) * 31;
        Long l3 = this.g;
        if (l3 == null) {
            i3 = 0;
        } else {
            i3 = l3.hashCode();
        }
        int h3 = hl6.h(hl6.h(hl6.h(hl6.h(hl6.j(this.h, (i6 + i3) * 31, 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        Long l4 = this.m;
        if (l4 == null) {
            i4 = 0;
        } else {
            i4 = l4.hashCode();
        }
        int i7 = (h3 + i4) * 31;
        Long l5 = this.n;
        if (l5 != null) {
            i5 = l5.hashCode();
        }
        return Boolean.hashCode(this.p) + hl6.i((i7 + i5) * 31, 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistroScreenData(calls=");
        sb.append(this.a);
        sb.append(", messages=");
        sb.append(this.b);
        sb.append(", transfers=");
        sb.append(this.c);
        sb.append(", transferTotalReceived=");
        sb.append(this.d);
        sb.append(", transferTotalSent=");
        sb.append(this.e);
        sb.append(", transfersStartMillis=");
        sb.append(this.f);
        sb.append(", transfersEndMillis=");
        sb.append(this.g);
        sb.append(", planStats=");
        sb.append(this.h);
        sb.append(", statsTransferReceived=");
        f21.v(sb, this.i, ", statsTransferSent=", this.j, ", statsTransferCommission=");
        f21.v(sb, this.k, ", statsTotal=", this.l, ", statsStartMillis=");
        sb.append(this.m);
        sb.append(", statsEndMillis=");
        sb.append(this.n);
        sb.append(", hasCallLogPermission=");
        sb.append(this.o);
        sb.append(", hasSmsPermission=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public q26(List list, List list2, List list3, String str, String str2, Long l2, Long l3, List list4, String str3, String str4, String str5, String str6, Long l4, Long l5, boolean z, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = str;
        this.e = str2;
        this.f = l2;
        this.g = l3;
        this.h = list4;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = l4;
        this.n = l5;
        this.o = z;
        this.p = z2;
    }
}
