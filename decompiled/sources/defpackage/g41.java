package defpackage;

/* renamed from: g41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g41 {
    public final String a;
    public final ew6 b;
    public final String c;

    public g41(String str, ew6 ew6, String str2) {
        this.a = str;
        this.b = ew6;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g41)) {
            return false;
        }
        g41 g41 = (g41) obj;
        if (this.a.equals(g41.a) && this.b == g41.b && this.c.equals(g41.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactSmsEntry(date=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", body=");
        return f21.l(sb, this.c, ")");
    }
}
