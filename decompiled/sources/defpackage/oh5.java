package defpackage;

/* renamed from: oh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oh5 {
    public final String a;
    public final x83 b;
    public final long c;
    public final long d;
    public final az7 e;
    public final String f;
    public final String g;

    public oh5(String str, x83 x83, long j, long j2, az7 az7, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = x83;
        this.c = j;
        this.d = j2;
        this.e = az7;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh5)) {
            return false;
        }
        oh5 oh5 = (oh5) obj;
        if (sg3.e(this.a, oh5.a) && this.b.equals(oh5.b) && jt0.c(this.c, oh5.c) && jt0.c(this.d, oh5.d) && this.e == oh5.e && sg3.e(this.f, oh5.f) && this.g.equals(oh5.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int i = jt0.h;
        return this.g.hashCode() + hl6.h((this.e.hashCode() + pb4.b(pb4.b((hashCode + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        String i = jt0.i(this.c);
        String i2 = jt0.i(this.d);
        StringBuilder sb = new StringBuilder("PlanItem(label=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", tile=");
        f21.v(sb, i, ", iconColor=", i2, ", ussdName=");
        sb.append(this.e);
        sb.append(", value=");
        sb.append(this.f);
        sb.append(", sub=");
        return f21.l(sb, this.g, ")");
    }
}
