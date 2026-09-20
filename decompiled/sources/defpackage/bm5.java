package defpackage;

/* renamed from: bm5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bm5 extends hj8 implements xu {
    public String u;
    public ku4 v;
    public long w;

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm5)) {
            return false;
        }
        bm5 bm5 = (bm5) obj;
        if (this.u.equals(bm5.u) && this.v.equals(bm5.v) && u02.d(this.w, bm5.w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int e = f21.e(8000, hl6.i((this.v.hashCode() + (this.u.hashCode() * 31)) * 31, 31, false), 31);
        long j = this.w;
        xb4 xb4 = u02.x;
        return Integer.hashCode(3) + pb4.b(e, 31, j);
    }

    public final String toString() {
        return "Config(defaultSchema=" + this.u + ", propertyConversionMethod=" + this.v + ", requireValidSession=false, urlLengthLimit=8000, timeout=" + u02.k(this.w) + ", maxRetries=3)";
    }
}
