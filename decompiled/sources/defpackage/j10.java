package defpackage;

/* renamed from: j10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j10 extends t86 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public j10(String str, String str2, String str3, String str4, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t86) {
            j10 j10 = (j10) ((t86) obj);
            if (!this.b.equals(j10.b) || !this.c.equals(j10.c) || !this.d.equals(j10.d) || !this.e.equals(j10.e) || this.f != j10.f) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", variantId=");
        sb.append(this.c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return f21.k(sb, this.f, "}");
    }
}
