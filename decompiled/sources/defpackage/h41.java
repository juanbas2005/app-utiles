package defpackage;

/* renamed from: h41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h41 {
    public final int a;
    public final long b;
    public final i41 c;
    public final rg4 d;

    public h41(int i, long j, i41 i41, rg4 rg4) {
        this.a = i;
        this.b = j;
        this.c = i41;
        this.d = rg4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h41)) {
            return false;
        }
        h41 h41 = (h41) obj;
        if (this.a == h41.a && this.b == h41.b && this.c == h41.c && sg3.e(this.d, h41.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.c.hashCode() + pb4.b(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        rg4 rg4 = this.d;
        if (rg4 == null) {
            i = 0;
        } else {
            i = rg4.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
