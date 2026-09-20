package defpackage;

/* renamed from: zi7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zi7 {
    public final jt0 a;

    public zi7(jt0 jt0) {
        this.a = jt0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zi7) && sg3.e(this.a, ((zi7) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        jt0 jt0 = this.a;
        if (jt0 == null) {
            return 0;
        }
        return Long.hashCode(jt0.a);
    }

    public final String toString() {
        return "TintTheme(iconTint=" + this.a + ")";
    }
}
