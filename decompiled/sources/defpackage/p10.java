package defpackage;

/* renamed from: p10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p10 {
    public final q10 a;
    public final s10 b;
    public final r10 c;

    public p10(q10 q10, s10 s10, r10 r10) {
        this.a = q10;
        this.b = s10;
        this.c = r10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p10)) {
            return false;
        }
        p10 p10 = (p10) obj;
        if (!this.a.equals(p10.a) || !this.b.equals(p10.b) || !this.c.equals(p10.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
