package defpackage;

/* renamed from: wp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wp1 implements tp1 {
    public final float w;
    public final float x;

    public wp1(float f, float f2) {
        this.w = f;
        this.x = f2;
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
        if (!(obj instanceof wp1)) {
            return false;
        }
        wp1 wp1 = (wp1) obj;
        if (Float.compare(this.w, wp1.w) == 0 && Float.compare(this.x, wp1.x) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.x) + (Float.hashCode(this.w) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.w + ", fontScale=" + this.x + ")";
    }
}
