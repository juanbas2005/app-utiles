package defpackage;

/* renamed from: da5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class da5 implements vp0 {
    public final Class w;

    public da5(Class cls) {
        cls.getClass();
        this.w = cls;
    }

    public final Class b() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof da5)) {
            return false;
        }
        if (sg3.e(this.w, ((da5) obj).w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return this.w.toString() + " (Kotlin reflection is not available)";
    }
}
