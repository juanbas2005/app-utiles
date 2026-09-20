package defpackage;

/* renamed from: hc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hc implements oj4 {
    public final h80 a;
    public final h80 b;

    public hc(h80 h80, h80 h802) {
        this.a = h80;
        this.b = h802;
    }

    public final int a(se3 se3, long j, int i) {
        return se3.b + this.b.a(0, se3.b()) + (-this.a.a(0, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        if (this.a.equals(hcVar.a) && this.b.equals(hcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ")";
    }
}
