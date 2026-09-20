package defpackage;

/* renamed from: dn6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dn6 implements hn6 {
    public final sv a;

    public dn6(sv svVar) {
        this.a = svVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dn6) && this.a.equals(((dn6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SignIn(provider=" + this.a + ')';
    }
}
