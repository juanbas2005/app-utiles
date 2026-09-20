package defpackage;

/* renamed from: k98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k98 {
    public final bc8 a;
    public final km5 b;

    public k98(bc8 bc8, km5 km5) {
        this.a = bc8;
        this.b = km5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k98)) {
            return false;
        }
        k98 k98 = (k98) obj;
        if (this.a.equals(k98.a) && this.b.equals(k98.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.a + ", windowPosture=" + this.b + ')';
    }
}
