package defpackage;

/* renamed from: uf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uf4 {
    public final String a;
    public final re3 b;

    public uf4(String str, re3 re3) {
        this.a = str;
        this.b = re3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf4)) {
            return false;
        }
        uf4 uf4 = (uf4) obj;
        if (this.a.equals(uf4.a) && this.b.equals(uf4.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
