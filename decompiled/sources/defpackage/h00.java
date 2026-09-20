package defpackage;

/* renamed from: h00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h00 extends ka1 {
    public final String a;
    public final String b;

    public h00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ka1) {
            h00 h00 = (h00) ((ka1) obj);
            if (!this.a.equals(h00.a) || !this.b.equals(h00.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return f21.l(sb, this.b, "}");
    }
}
