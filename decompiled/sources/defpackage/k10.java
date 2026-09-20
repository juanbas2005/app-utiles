package defpackage;

/* renamed from: k10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k10 extends u86 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public k10(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.d = str3;
                if (str4 != null) {
                    this.e = str4;
                    this.f = j;
                    return;
                }
                ku4.j("Null variantId");
                throw null;
            }
            ku4.j("Null parameterKey");
            throw null;
        }
        ku4.j("Null rolloutId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u86)) {
            return false;
        }
        k10 k10 = (k10) ((u86) obj);
        if (!this.b.equals(k10.b) || !this.c.equals(k10.c) || !this.d.equals(k10.d) || !this.e.equals(k10.e) || this.f != k10.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return f21.k(sb, this.f, "}");
    }
}
