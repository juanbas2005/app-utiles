package defpackage;

/* renamed from: y31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y31 {
    public final String a;
    public final String b;
    public final oi0 c;

    public y31(String str, String str2, oi0 oi0) {
        this.a = str;
        this.b = str2;
        this.c = oi0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y31)) {
            return false;
        }
        y31 y31 = (y31) obj;
        if (this.a.equals(y31.a) && this.b.equals(y31.b) && this.c == y31.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl6.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder o = f21.o("ContactCallEntry(date=", this.a, ", duration=", this.b, ", type=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
