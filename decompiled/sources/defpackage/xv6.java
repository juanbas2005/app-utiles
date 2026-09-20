package defpackage;

/* renamed from: xv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xv6 {
    public final String a;
    public final String b;
    public final String c;

    public xv6(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv6)) {
            return false;
        }
        xv6 xv6 = (xv6) obj;
        if (sg3.e(this.a, xv6.a) && sg3.e(this.b, xv6.b) && sg3.e(this.c, xv6.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl6.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f21.l(f21.o("SmsCommand(name=", this.a, ", to=", this.b, ", body="), this.c, ")");
    }
}
