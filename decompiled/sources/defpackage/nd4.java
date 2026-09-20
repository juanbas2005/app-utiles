package defpackage;

/* renamed from: nd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nd4 {
    public final re3 a;
    public final String b;
    public final double c;

    public nd4(re3 re3, String str, double d) {
        this.a = re3;
        this.b = str;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd4)) {
            return false;
        }
        nd4 nd4 = (nd4) obj;
        if (this.a.equals(nd4.a) && this.b.equals(nd4.b) && Double.compare(this.c, nd4.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + hl6.h(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LteBandSpec(earfcns=" + this.a + ", name=" + this.b + ", dlLowMhz=" + this.c + ")";
    }
}
