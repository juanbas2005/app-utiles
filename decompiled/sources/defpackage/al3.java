package defpackage;

/* renamed from: al3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class al3 {
    public final String a;
    public final String b;
    public final double c;
    public final String d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final q97 i;

    public al3(String str, String str2, double d2, String str3, long j, long j2, boolean z, boolean z2, q97 q97) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        q97.getClass();
        this.a = str;
        this.b = str2;
        this.c = d2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = z2;
        this.i = q97;
    }

    public static al3 a(al3 al3, String str, long j) {
        String str2 = al3.a;
        String str3 = al3.b;
        double d2 = al3.c;
        long j2 = al3.f;
        boolean z = al3.h;
        str2.getClass();
        str3.getClass();
        str.getClass();
        return new al3(str2, str3, d2, str, j, j2, true, z, q97.x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al3)) {
            return false;
        }
        al3 al3 = (al3) obj;
        if (sg3.e(this.a, al3.a) && sg3.e(this.b, al3.b) && Double.compare(this.c, al3.c) == 0 && sg3.e(this.d, al3.d) && this.e == al3.e && this.f == al3.f && this.g == al3.g && this.h == al3.h && this.i == al3.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + hl6.i(hl6.i(pb4.b(pb4.b(hl6.h((Double.hashCode(this.c) + hl6.h(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder o = f21.o("JetpackEntity(id=", this.a, ", name=", this.b, ", price=");
        o.append(this.c);
        o.append(", userId=");
        o.append(this.d);
        o.append(", lastUpdated=");
        o.append(this.e);
        o.append(", lastSynced=");
        o.append(this.f);
        o.append(", needsSync=");
        o.append(this.g);
        o.append(", deleted=");
        o.append(this.h);
        o.append(", syncAction=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
