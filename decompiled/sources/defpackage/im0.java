package defpackage;

/* renamed from: im0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class im0 {
    public final String a;
    public final double b;

    public im0(String str, double d) {
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im0)) {
            return false;
        }
        im0 im0 = (im0) obj;
        if (this.a.equals(im0.a) && Double.compare(this.b, im0.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CellBand(name=" + this.a + ", downlinkMhz=" + this.b + ")";
    }
}
