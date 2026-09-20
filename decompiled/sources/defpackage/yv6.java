package defpackage;

/* renamed from: yv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yv6 {
    public final String a;
    public final String b;
    public final String c;
    public final ew6 d;
    public final String e;
    public final long f;
    public final String g;
    public final boolean h;

    public yv6(String str, String str2, String str3, ew6 ew6, String str4, long j, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ew6;
        this.e = str4;
        this.f = j;
        this.g = str5;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv6)) {
            return false;
        }
        yv6 yv6 = (yv6) obj;
        if (this.a.equals(yv6.a) && this.b.equals(yv6.b) && this.c.equals(yv6.c) && this.d == yv6.d && this.e.equals(yv6.e) && this.f == yv6.f && sg3.e(this.g, yv6.g) && this.h == yv6.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int h2 = hl6.h(this.a.hashCode() * 31, 31, this.b);
        int b2 = pb4.b(hl6.h((this.d.hashCode() + ((((this.c.hashCode() + h2) * 31) + 1061677818) * 31)) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.h) + ((b2 + i) * 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("SmsRecord(name=", this.a, ", phone=", this.b, ", date=");
        o.append(this.c);
        o.append(", cost=$ 0.00, type=");
        o.append(this.d);
        o.append(", initial=");
        o.append(this.e);
        o.append(", avatarColor=");
        o.append(this.f);
        o.append(", photoUri=");
        o.append(this.g);
        o.append(", isEtecsaService=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
