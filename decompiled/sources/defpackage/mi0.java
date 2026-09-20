package defpackage;

/* renamed from: mi0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final oi0 e;
    public final String f;
    public final long g;
    public final String h;
    public final boolean i;

    public mi0(String str, String str2, String str3, String str4, oi0 oi0, String str5, long j, String str6, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = oi0;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi0)) {
            return false;
        }
        mi0 mi0 = (mi0) obj;
        if (this.a.equals(mi0.a) && this.b.equals(mi0.b) && this.c.equals(mi0.c) && this.d.equals(mi0.d) && this.e == mi0.e && this.f.equals(mi0.f) && this.g == mi0.g && sg3.e(this.h, mi0.h) && this.i == mi0.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int h2 = hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int b2 = pb4.b(hl6.h((this.e.hashCode() + ((((this.d.hashCode() + h2) * 31) + 1061677818) * 31)) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        return Boolean.hashCode(this.i) + ((b2 + i2) * 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("CallRecord(name=", this.a, ", phone=", this.b, ", date=");
        f21.v(o, this.c, ", duration=", this.d, ", cost=$ 0.00, type=");
        o.append(this.e);
        o.append(", initial=");
        o.append(this.f);
        o.append(", avatarColor=");
        o.append(this.g);
        o.append(", photoUri=");
        o.append(this.h);
        o.append(", isEtecsaService=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
