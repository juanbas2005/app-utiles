package defpackage;

/* renamed from: r66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class r66 {
    public final float a;
    public final float b;

    public r66(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(r66 r66, r66 r662) {
        return bb0.f0(r66.a, r66.b, r662.a, r662.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r66) {
            r66 r66 = (r66) obj;
            if (this.a == r66.a && this.b == r66.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "(" + this.a + ',' + this.b + ')';
    }
}
