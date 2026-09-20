package defpackage;

/* renamed from: g00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g00 extends la1 {
    public final ka1 a;
    public final String b;
    public final String c;
    public final long d;

    public g00(h00 h00, String str, String str2, long j) {
        this.a = h00;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof la1) {
            g00 g00 = (g00) ((la1) obj);
            if (!this.a.equals(g00.a) || !this.b.equals(g00.b) || !this.c.equals(g00.c) || this.d != g00.d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return f21.k(sb, this.d, "}");
    }
}
