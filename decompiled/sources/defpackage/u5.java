package defpackage;

/* renamed from: u5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public u5(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        if (sg3.e(this.a, u5Var.a) && sg3.e(this.b, u5Var.b) && sg3.e(this.c, u5Var.c) && sg3.e(this.d, u5Var.d) && sg3.e(this.e, u5Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + hl6.h(hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder o = f21.o("Account(id=", this.a, ", name=", this.b, ", email=");
        f21.v(o, this.c, ", avatarUrl=", this.d, ", invitationCode=");
        return f21.l(o, this.e, ")");
    }
}
