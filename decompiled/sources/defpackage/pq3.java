package defpackage;

/* renamed from: pq3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pq3 extends rq3 {
    public final vw3 a;

    public pq3(vw3 vw3) {
        this.a = vw3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pq3) && this.a.equals(((pq3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.a + ')';
    }
}
