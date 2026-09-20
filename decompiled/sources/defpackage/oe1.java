package defpackage;

/* renamed from: oe1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oe1 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe1)) {
            return false;
        }
        oe1 oe1 = (oe1) obj;
        if (this.a == oe1.a && Float.compare(this.b, oe1.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        long j = this.a;
        float f = this.b;
        return "DataPointAtTime(time=" + j + ", dataPoint=" + f + ")";
    }
}
