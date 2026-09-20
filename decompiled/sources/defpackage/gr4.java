package defpackage;

/* renamed from: gr4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gr4 {
    public final String a;
    public final String b;
    public final long c;

    public gr4(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr4)) {
            return false;
        }
        gr4 gr4 = (gr4) obj;
        if (sg3.e(this.a, gr4.a) && sg3.e(this.b, gr4.b) && this.c == gr4.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + hl6.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f21.k(f21.o("NautaAccountEntity(email=", this.a, ", encryptedPassword=", this.b, ", lastUsed="), this.c, ")");
    }
}
