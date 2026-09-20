package defpackage;

/* renamed from: h60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h60 {
    public final float a;

    public /* synthetic */ h60(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h60)) {
            return false;
        }
        if (Float.compare(this.a, ((h60) obj).a) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ")";
    }
}
