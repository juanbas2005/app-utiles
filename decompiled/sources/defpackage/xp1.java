package defpackage;

/* renamed from: xp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xp1 implements tp1 {
    public final float w;
    public final float x;
    public final vl2 y;

    public xp1(float f, float f2, vl2 vl2) {
        this.w = f;
        this.x = f2;
        this.y = vl2;
    }

    public final float Y() {
        return this.x;
    }

    public final float b() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp1)) {
            return false;
        }
        xp1 xp1 = (xp1) obj;
        if (Float.compare(this.w, xp1.w) == 0 && Float.compare(this.x, xp1.x) == 0 && this.y.equals(xp1.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode() + f21.d(this.x, Float.hashCode(this.w) * 31, 31);
    }

    public final long o(float f) {
        return ya5.m(this.y.a(f), 4294967296L);
    }

    public final String toString() {
        StringBuilder n = f21.n("DensityWithConverter(density=", this.w, ", fontScale=", this.x, ", converter=");
        n.append(this.y);
        n.append(")");
        return n.toString();
    }

    public final float z(long j) {
        if (xg7.a(wg7.b(j), 4294967296L)) {
            return this.y.b(wg7.c(j));
        }
        h.s("Only Sp can convert to Px");
        return 0.0f;
    }
}
