package defpackage;

/* renamed from: yy7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yy7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public yy7(String str, String str2, String str3, String str4, String str5) {
        hl6.t(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy7)) {
            return false;
        }
        yy7 yy7 = (yy7) obj;
        if (sg3.e(this.a, yy7.a) && sg3.e(this.b, yy7.b) && sg3.e(this.c, yy7.c) && sg3.e(this.d, yy7.d) && sg3.e(this.e, yy7.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + hl6.h(hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder o = f21.o("UssdCodeEntity(id=", this.a, ", name=", this.b, ", code=");
        f21.v(o, this.c, ", category=", this.d, ", description=");
        return f21.l(o, this.e, ")");
    }
}
