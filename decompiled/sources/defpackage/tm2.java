package defpackage;

/* renamed from: tm2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tm2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final int h;
    public final boolean i;

    public tm2(String str, String str2, String str3, String str4, String str5, long j, long j2, int i2, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = j2;
        this.h = i2;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm2)) {
            return false;
        }
        tm2 tm2 = (tm2) obj;
        if (sg3.e(this.a, tm2.a) && sg3.e(this.b, tm2.b) && sg3.e(this.c, tm2.c) && sg3.e(this.d, tm2.d) && this.e.equals(tm2.e) && this.f == tm2.f && this.g == tm2.g && this.h == tm2.h && this.i == tm2.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + f21.e(this.h, pb4.b(pb4.b(hl6.h(hl6.h(hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("ForumComment(id=", this.a, ", postId=", this.b, ", body=");
        f21.v(o, this.c, ", authorName=", this.d, ", createdAt=");
        o.append(this.e);
        o.append(", likes=");
        o.append(this.f);
        o.append(", dislikes=");
        o.append(this.g);
        o.append(", myVote=");
        o.append(this.h);
        o.append(", mine=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
