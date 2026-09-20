package defpackage;

/* renamed from: gk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gk3 {
    public final String a;
    public final String b;
    public final double c;
    public final long d;
    public final long e;
    public final boolean f;
    public final String g;

    public gk3(String str, String str2, double d2, long j, long j2, boolean z, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = d2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk3)) {
            return false;
        }
        gk3 gk3 = (gk3) obj;
        if (sg3.e(this.a, gk3.a) && sg3.e(this.b, gk3.b) && Double.compare(this.c, gk3.c) == 0 && this.d == gk3.d && this.e == gk3.e && this.f == gk3.f && this.g.equals(gk3.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + hl6.i(pb4.b(pb4.b((Double.hashCode(this.c) + hl6.h(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder o = f21.o("Jetpack(id=", this.a, ", name=", this.b, ", price=");
        o.append(this.c);
        o.append(", lastUpdated=");
        o.append(this.d);
        o.append(", lastSynced=");
        o.append(this.e);
        o.append(", needsSync=");
        o.append(this.f);
        return f21.m(o, ", formattedDate=", this.g, ")");
    }
}
