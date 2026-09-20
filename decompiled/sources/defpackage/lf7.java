package defpackage;

/* renamed from: lf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lf7 {
    public static final lf7 c = new lf7(1.0f, 0.0f);
    public final float a;
    public final float b;

    public lf7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf7)) {
            return false;
        }
        lf7 lf7 = (lf7) obj;
        if (this.a == lf7.a && this.b == lf7.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ")";
    }
}
