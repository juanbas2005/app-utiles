package defpackage;

/* renamed from: y76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y76 {
    public final long a = jt0.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y76)) {
            return false;
        }
        if (!jt0.c(this.a, ((y76) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = jt0.h;
        return Long.hashCode(this.a) * 961;
    }

    public final String toString() {
        return f21.h("RippleConfiguration(color=", jt0.i(this.a), ", focus=null, rippleAlpha=null)");
    }
}
