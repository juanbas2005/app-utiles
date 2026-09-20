package defpackage;

/* renamed from: fh2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fh2 {
    public final float a;
    public final float b;
    public final long c;

    public fh2(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh2)) {
            return false;
        }
        fh2 fh2 = (fh2) obj;
        if (Float.compare(this.a, fh2.a) == 0 && Float.compare(this.b, fh2.b) == 0 && this.c == fh2.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + f21.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return f21.k(f21.n("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="), this.c, ")");
    }
}
