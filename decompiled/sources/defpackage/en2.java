package defpackage;

/* renamed from: en2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class en2 {
    public final String a;
    public final qm2 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;
    public final long l;
    public final int m;
    public final boolean n;

    public en2(String str, qm2 qm2, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, long j2, long j3, long j4, int i2, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        this.a = str;
        this.b = qm2;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = str6;
        this.i = str7;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = i2;
        this.n = z2;
    }

    public static en2 a(en2 en2, qm2 qm2, String str, String str2, String str3, String str4, boolean z, long j2, long j3, long j4, int i2, int i3) {
        qm2 qm22;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z2;
        long j5;
        long j6;
        long j7;
        int i4;
        en2 en22 = en2;
        int i5 = i3;
        String str9 = en22.a;
        if ((i5 & 2) != 0) {
            qm22 = en22.b;
        } else {
            qm22 = qm2;
        }
        if ((i5 & 4) != 0) {
            str5 = en22.c;
        } else {
            str5 = str;
        }
        if ((i5 & 8) != 0) {
            str6 = en22.d;
        } else {
            str6 = str2;
        }
        if ((i5 & 16) != 0) {
            str7 = en22.e;
        } else {
            str7 = str3;
        }
        if ((i5 & 32) != 0) {
            str8 = en22.f;
        } else {
            str8 = str4;
        }
        if ((i5 & 64) != 0) {
            z2 = en22.g;
        } else {
            z2 = z;
        }
        String str10 = str9;
        qm2 qm23 = qm22;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        boolean z3 = z2;
        String str15 = en22.h;
        String str16 = en22.i;
        if ((i5 & 512) != 0) {
            j5 = en22.j;
        } else {
            j5 = j2;
        }
        if ((i5 & 1024) != 0) {
            j6 = en22.k;
        } else {
            j6 = j3;
        }
        qm2 qm24 = qm23;
        String str17 = str11;
        if ((i5 & 2048) != 0) {
            j7 = en22.l;
        } else {
            j7 = j4;
        }
        if ((i5 & 4096) != 0) {
            i4 = en22.m;
        } else {
            i4 = i2;
        }
        boolean z4 = en22.n;
        en22.getClass();
        str10.getClass();
        str17.getClass();
        str12.getClass();
        str15.getClass();
        long j8 = j7;
        return new en2(str10, qm24, str17, str12, str13, str14, z3, str15, str16, j5, j6, j8, i4, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en2)) {
            return false;
        }
        en2 en2 = (en2) obj;
        if (sg3.e(this.a, en2.a) && this.b.equals(en2.b) && sg3.e(this.c, en2.c) && sg3.e(this.d, en2.d) && sg3.e(this.e, en2.e) && sg3.e(this.f, en2.f) && this.g == en2.g && sg3.e(this.h, en2.h) && this.i.equals(en2.i) && this.j == en2.j && this.k == en2.k && this.l == en2.l && this.m == en2.m && this.n == en2.n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int h2 = hl6.h(hl6.h((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        int i3 = 0;
        String str = this.e;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i4 = (h2 + i2) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Boolean.hashCode(this.n) + f21.e(this.m, pb4.b(pb4.b(pb4.b(hl6.h(hl6.h(hl6.i((i4 + i3) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForumPost(id=");
        sb.append(this.a);
        sb.append(", category=");
        sb.append(this.b);
        sb.append(", title=");
        f21.v(sb, this.c, ", body=", this.d, ", imageUrl=");
        f21.v(sb, this.e, ", imagePath=", this.f, ", hasImage=");
        sb.append(this.g);
        sb.append(", authorName=");
        sb.append(this.h);
        sb.append(", createdAt=");
        sb.append(this.i);
        sb.append(", likes=");
        sb.append(this.j);
        sb.append(", dislikes=");
        sb.append(this.k);
        sb.append(", commentCount=");
        sb.append(this.l);
        sb.append(", myVote=");
        sb.append(this.m);
        sb.append(", mine=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
