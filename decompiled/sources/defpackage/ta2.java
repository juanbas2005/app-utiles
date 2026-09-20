package defpackage;

/* renamed from: ta2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ta2 {
    public final x83 a;
    public final String b;
    public final sr2 c;

    public ta2(x83 x83, String str, sr2 sr2) {
        str.getClass();
        sr2.getClass();
        this.a = x83;
        this.b = str;
        this.c = sr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta2)) {
            return false;
        }
        ta2 ta2 = (ta2) obj;
        if (this.a.equals(ta2.a) && sg3.e(this.b, ta2.b) && sg3.e(this.c, ta2.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl6.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FabAction(icon=" + this.a + ", label=" + this.b + ", onClick=" + this.c + ")";
    }
}
