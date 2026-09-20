package defpackage;

/* renamed from: pz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pz7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public pz7(String str, String str2, String str3, String str4, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz7)) {
            return false;
        }
        pz7 pz7 = (pz7) obj;
        if (sg3.e(this.a, pz7.a) && sg3.e(this.b, pz7.b) && sg3.e(this.c, pz7.c) && sg3.e(this.d, pz7.d) && this.e == pz7.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + hl6.h(hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder o = f21.o("UssdResponseEntity(ussdCode=", this.a, ", fieldName=", this.b, ", value=");
        f21.v(o, this.c, ", rawResponse=", this.d, ", timestamp=");
        return f21.k(o, this.e, ")");
    }
}
