package defpackage;

/* renamed from: wz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wz extends ca1 {
    public final String a;
    public final String b;
    public final long c;

    public wz(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ca1) {
            wz wzVar = (wz) ((ca1) obj);
            if (!this.a.equals(wzVar.a) || !this.b.equals(wzVar.b) || this.c != wzVar.c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        return ((int) ((j >>> 32) ^ j)) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return f21.k(sb, this.c, "}");
    }
}
