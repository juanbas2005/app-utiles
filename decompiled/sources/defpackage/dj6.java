package defpackage;

/* renamed from: dj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dj6 {
    public final float a;
    public final float b;

    public dj6(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dj6)) {
            return false;
        }
        dj6 dj6 = (dj6) obj;
        if (lx1.b(0.0f, 0.0f) && lx1.b(0.0f, 0.0f) && lx1.b(0.0f, 0.0f) && lx1.b(this.a, dj6.a) && lx1.b(0.0f, 0.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + f21.d(this.a, f21.d(0.0f, f21.d(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
