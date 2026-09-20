package defpackage;

/* renamed from: ce0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ce0 {
    public final float a;

    public ce0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ce0)) {
            return false;
        }
        ce0 ce0 = (ce0) obj;
        if (lx1.b(0.0f, 0.0f) && lx1.b(0.0f, 0.0f) && lx1.b(0.0f, 0.0f) && lx1.b(this.a, ce0.a) && lx1.b(0.0f, 0.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + f21.d(this.a, f21.d(0.0f, f21.d(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
