package defpackage;

/* renamed from: n86  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n86 {
    public final za5 a;
    public final aa5 b;
    public final ya5 c;
    public final w95 d;

    public n86(za5 za5, aa5 aa5, ya5 ya5, w95 w95) {
        this.a = za5;
        this.b = aa5;
        this.c = ya5;
        this.d = w95;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n86)) {
            return false;
        }
        n86 n86 = (n86) obj;
        if (this.a.equals(n86.a) && this.b.equals(n86.b) && this.c.equals(n86.c) && this.d.equals(n86.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
