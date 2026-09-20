package defpackage;

/* renamed from: vg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vg4 {
    public final long a;
    public final y71 b;

    public vg4(long j, y71 y71) {
        this.a = j;
        this.b = y71;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg4)) {
            return false;
        }
        vg4 vg4 = (vg4) obj;
        if (l35.b(this.a, vg4.a) && sg3.e(this.b, vg4.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String g = l35.g(this.a);
        return "PointNRound(o=" + g + ", r=" + this.b + ")";
    }
}
