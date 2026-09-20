package defpackage;

/* renamed from: lq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lq1 {
    public static final lq1 c = new lq1(0, 0);
    public final long a;
    public final long b;

    public lq1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lq1) {
            lq1 lq1 = (lq1) obj;
            if (we3.a(this.a, lq1.a) && this.b == lq1.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
