package defpackage;

/* renamed from: e07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e07 {
    public final yz6 a;
    public final long b;
    public final double c;
    public final double d;
    public final float e;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ e07(yz6 yz6, long j, double d2, float f, int i) {
        this(yz6, r2, r4, 0.0d, r8);
        double d3;
        float f2;
        long j2 = (i & 2) != 0 ? 0 : j;
        if ((i & 4) != 0) {
            d3 = 0.0d;
        } else {
            d3 = d2;
        }
        if ((i & 16) != 0) {
            f2 = 0.0f;
        } else {
            f2 = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e07)) {
            return false;
        }
        e07 e07 = (e07) obj;
        if (this.a == e07.a && this.b == e07.b && Double.compare(this.c, e07.c) == 0 && Double.compare(this.d, e07.d) == 0 && Float.compare(this.e, e07.e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b2 = pb4.b(this.a.hashCode() * 31, 31, this.b);
        int hashCode = Double.hashCode(this.d);
        return Float.hashCode(this.e) + ((hashCode + ((Double.hashCode(this.c) + b2) * 31)) * 31);
    }

    public final String toString() {
        return "SpeedTestResult(phase=" + this.a + ", pingMs=" + this.b + ", downloadMbps=" + this.c + ", uploadMbps=" + this.d + ", progress=" + this.e + ")";
    }

    public e07(yz6 yz6, long j, double d2, double d3, float f) {
        this.a = yz6;
        this.b = j;
        this.c = d2;
        this.d = d3;
        this.e = f;
    }
}
