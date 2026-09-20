package defpackage;

/* renamed from: dz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dz4 {
    public final String a;
    public final r11 b;
    public final q07 c;
    public final String d;
    public final String e;
    public final String f;
    public final Double g;
    public final Double h;

    public dz4(String str, r11 r11, q07 q07, String str2, String str3, String str4, Double d2, Double d3) {
        str.getClass();
        r11.getClass();
        q07.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = r11;
        this.c = q07;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = d2;
        this.h = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4)) {
            return false;
        }
        dz4 dz4 = (dz4) obj;
        if (sg3.e(this.a, dz4.a) && this.b == dz4.b && this.c == dz4.c && sg3.e(this.d, dz4.d) && sg3.e(this.e, dz4.e) && sg3.e(this.f, dz4.f) && sg3.e(this.g, dz4.g) && sg3.e(this.h, dz4.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int h2 = hl6.h(hl6.h(hl6.h((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        int i2 = 0;
        Double d2 = this.g;
        if (d2 == null) {
            i = 0;
        } else {
            i = d2.hashCode();
        }
        int i3 = (h2 + i) * 31;
        Double d3 = this.h;
        if (d3 != null) {
            i2 = d3.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewConnectionSpot(nick=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", quality=");
        sb.append(this.c);
        sb.append(", address=");
        sb.append(this.d);
        sb.append(", province=");
        f21.v(sb, this.e, ", note=", this.f, ", latitude=");
        sb.append(this.g);
        sb.append(", longitude=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
