package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: mo2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mo2 {
    public final List a;
    public final List b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final hv2 g;
    public final String h;
    public final List i;
    public final boolean j;
    public final Boolean k;
    public final Map l;
    public final boolean m;
    public final boolean n;

    public mo2(List list, List list2, String str, String str2, boolean z, boolean z2, hv2 hv2, String str3, List list3, boolean z3, Boolean bool, Map map, boolean z4, boolean z5) {
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = hv2;
        this.h = str3;
        this.i = list3;
        this.j = z3;
        this.k = bool;
        this.l = map;
        this.m = z4;
        this.n = z5;
    }

    public static mo2 a(mo2 mo2, ArrayList arrayList, List list, String str, String str2, boolean z, boolean z2, hv2 hv2, String str3, List list2, boolean z3, Boolean bool, Map map, boolean z4, boolean z5, int i2) {
        List list3;
        List list4;
        String str4;
        String str5;
        boolean z6;
        boolean z7;
        hv2 hv22;
        String str6;
        List list5;
        boolean z8;
        Boolean bool2;
        Map map2;
        boolean z9;
        boolean z10;
        int i3 = i2;
        if ((i3 & 1) != 0) {
            list3 = mo2.a;
        } else {
            list3 = arrayList;
        }
        if ((i3 & 2) != 0) {
            list4 = mo2.b;
        } else {
            list4 = list;
        }
        if ((i3 & 4) != 0) {
            str4 = mo2.c;
        } else {
            str4 = str;
        }
        if ((i3 & 8) != 0) {
            str5 = mo2.d;
        } else {
            str5 = str2;
        }
        if ((i3 & 16) != 0) {
            z6 = mo2.e;
        } else {
            z6 = z;
        }
        if ((i3 & 32) != 0) {
            z7 = mo2.f;
        } else {
            z7 = z2;
        }
        if ((i3 & 64) != 0) {
            hv22 = mo2.g;
        } else {
            hv22 = hv2;
        }
        if ((i3 & 128) != 0) {
            str6 = mo2.h;
        } else {
            str6 = str3;
        }
        if ((i3 & 256) != 0) {
            list5 = mo2.i;
        } else {
            list5 = list2;
        }
        if ((i3 & 512) != 0) {
            z8 = mo2.j;
        } else {
            z8 = z3;
        }
        if ((i3 & 1024) != 0) {
            bool2 = mo2.k;
        } else {
            bool2 = bool;
        }
        if ((i3 & 2048) != 0) {
            map2 = mo2.l;
        } else {
            map2 = map;
        }
        if ((i3 & 4096) != 0) {
            z9 = mo2.m;
        } else {
            z9 = z4;
        }
        if ((i3 & 8192) != 0) {
            z10 = mo2.n;
        } else {
            z10 = z5;
        }
        mo2.getClass();
        list3.getClass();
        list4.getClass();
        str5.getClass();
        hv22.getClass();
        list5.getClass();
        map2.getClass();
        return new mo2(list3, list4, str4, str5, z6, z7, hv22, str6, list5, z8, bool2, map2, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo2)) {
            return false;
        }
        mo2 mo2 = (mo2) obj;
        if (sg3.e(this.a, mo2.a) && sg3.e(this.b, mo2.b) && sg3.e(this.c, mo2.c) && sg3.e(this.d, mo2.d) && this.e == mo2.e && this.f == mo2.f && sg3.e(this.g, mo2.g) && sg3.e(this.h, mo2.h) && sg3.e(this.i, mo2.i) && this.j == mo2.j && sg3.e(this.k, mo2.k) && sg3.e(this.l, mo2.l) && this.m == mo2.m && this.n == mo2.n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int j2 = hl6.j(this.b, this.a.hashCode() * 31, 31);
        int i4 = 0;
        String str = this.c;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int hashCode = (this.g.hashCode() + hl6.i(hl6.i(hl6.h((j2 + i2) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31;
        String str2 = this.h;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i5 = hl6.i(hl6.j(this.i, (hashCode + i3) * 31, 31), 31, this.j);
        Boolean bool = this.k;
        if (bool != null) {
            i4 = bool.hashCode();
        }
        return Boolean.hashCode(this.n) + hl6.i((this.l.hashCode() + ((i5 + i4) * 31)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForumScreenData(posts=");
        sb.append(this.a);
        sb.append(", categories=");
        sb.append(this.b);
        sb.append(", categoryFilter=");
        f21.v(sb, this.c, ", query=", this.d, ", isAuthenticated=");
        pb4.s(sb, this.e, ", isAdmin=", this.f, ", published=");
        sb.append(this.g);
        sb.append(", commentsPostId=");
        sb.append(this.h);
        sb.append(", comments=");
        sb.append(this.i);
        sb.append(", commentsLoading=");
        sb.append(this.j);
        sb.append(", termsAccepted=");
        sb.append(this.k);
        sb.append(", postImages=");
        sb.append(this.l);
        sb.append(", loadingMore=");
        sb.append(this.m);
        sb.append(", endReached=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ mo2() {
        this(r1, r1, (String) null, "", false, false, r7, (String) null, r1, false, (Boolean) null, b42.w, false, false);
        hv2 hv2 = new hv2(25, (Object) null);
        a42 a42 = a42.w;
    }
}
