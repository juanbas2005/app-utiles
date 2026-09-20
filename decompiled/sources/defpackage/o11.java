package defpackage;

/* renamed from: o11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o11 {
    public final String a;
    public final String b;
    public final r11 c;
    public final q07 d;
    public final String e;
    public final String f;
    public final String g;
    public final Double h;
    public final Double i;
    public final String j;
    public final long k;
    public final long l;
    public final int m;
    public final boolean n;

    public o11(String str, String str2, r11 r11, q07 q07, String str3, String str4, String str5, Double d2, Double d3, String str6, long j2, long j3, int i2, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = r11;
        this.d = q07;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = d2;
        this.i = d3;
        this.j = str6;
        this.k = j2;
        this.l = j3;
        this.m = i2;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o11)) {
            return false;
        }
        o11 o11 = (o11) obj;
        if (sg3.e(this.a, o11.a) && sg3.e(this.b, o11.b) && this.c == o11.c && this.d == o11.d && sg3.e(this.e, o11.e) && this.f.equals(o11.f) && this.g.equals(o11.g) && sg3.e(this.h, o11.h) && sg3.e(this.i, o11.i) && this.j.equals(o11.j) && this.k == o11.k && this.l == o11.l && this.m == o11.m && this.n == o11.n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int h2 = hl6.h(hl6.h(hl6.h((this.d.hashCode() + ((this.c.hashCode() + hl6.h(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        int i3 = 0;
        Double d2 = this.h;
        if (d2 == null) {
            i2 = 0;
        } else {
            i2 = d2.hashCode();
        }
        int i4 = (h2 + i2) * 31;
        Double d3 = this.i;
        if (d3 != null) {
            i3 = d3.hashCode();
        }
        return Boolean.hashCode(this.n) + f21.e(this.m, pb4.b(pb4.b(hl6.h((i4 + i3) * 31, 31, this.j), 31, this.k), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("ConnectionSpot(id=", this.a, ", nick=", this.b, ", type=");
        o.append(this.c);
        o.append(", quality=");
        o.append(this.d);
        o.append(", address=");
        f21.v(o, this.e, ", province=", this.f, ", note=");
        o.append(this.g);
        o.append(", latitude=");
        o.append(this.h);
        o.append(", longitude=");
        o.append(this.i);
        o.append(", createdAt=");
        o.append(this.j);
        o.append(", likes=");
        o.append(this.k);
        o.append(", dislikes=");
        o.append(this.l);
        o.append(", myVote=");
        o.append(this.m);
        o.append(", mine=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }
}
