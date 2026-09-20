package defpackage;

/* renamed from: ms0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ms0 {
    public final float a;

    public ms0(float f) {
        this.a = f;
    }

    public static boolean b(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).floatValue() <= ((Number) comparable2).floatValue()) {
            return true;
        }
        return false;
    }

    public final Comparable a() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ms0)) {
            return false;
        }
        float f = this.a;
        if ((0.0f <= f || 0.0f <= ((ms0) obj).a) && f != ((ms0) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        float f = this.a;
        if (0.0f > f) {
            return -1;
        }
        return Float.hashCode(f) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}
