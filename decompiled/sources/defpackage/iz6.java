package defpackage;

/* renamed from: iz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iz6 {
    public final String a;
    public final uq4 b;
    public final String c;
    public final String d;
    public final String e;

    public iz6(String str, uq4 uq4, String str2, String str3) {
        uq4.getClass();
        this.a = str;
        this.b = uq4;
        this.c = str2;
        this.d = str3;
        this.e = str + '.' + (uq4 + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz6)) {
            return false;
        }
        iz6 iz6 = (iz6) obj;
        if (this.a.equals(iz6.a) && sg3.e(this.b, iz6.b) && this.c.equals(iz6.c) && this.d.equals(iz6.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + hl6.h((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", parameters=");
        sb.append(this.c);
        sb.append(", returnType=");
        return hl6.o(sb, this.d, ')');
    }
}
