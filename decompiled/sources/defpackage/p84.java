package defpackage;

/* renamed from: p84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p84 extends s84 {
    public final ce1 a = ce1.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p84.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((p84) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (p84.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
