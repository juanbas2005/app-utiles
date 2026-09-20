package defpackage;

/* renamed from: qq3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qq3 extends rq3 {
    public final jq0 a;

    public qq3(jq0 jq0) {
        this.a = jq0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qq3) && this.a.equals(((qq3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.a + ')';
    }
}
