package defpackage;

/* renamed from: d00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d00 extends ia1 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public d00(Double d2, int i, boolean z, int i2, long j, long j2) {
        this.a = d2;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ia1) {
            ia1 ia1 = (ia1) obj;
            Double d2 = this.a;
            if (d2 != null ? d2.equals(((d00) ia1).a) : ((d00) ia1).a == null) {
                d00 d00 = (d00) ia1;
                if (this.b == d00.b && this.c == d00.c && this.d == d00.d && this.e == d00.e && this.f == d00.f) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        Double d2 = this.a;
        if (d2 == null) {
            i = 0;
        } else {
            i = d2.hashCode();
        }
        int i3 = (((i ^ 1000003) * 1000003) ^ this.b) * 1000003;
        if (this.c) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        long j = this.e;
        long j2 = this.f;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((((i3 ^ i2) * 1000003) ^ this.d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return f21.k(sb, this.f, "}");
    }
}
