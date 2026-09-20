package defpackage;

/* renamed from: sb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sb0 implements pb0 {
    public final tp1 a;
    public final long b;

    public sb0(q67 q67, long j) {
        this.a = q67;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb0)) {
            return false;
        }
        sb0 sb0 = (sb0) obj;
        if (sg3.e(this.a, sb0.a) && k31.b(this.b, sb0.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String k = k31.k(this.b);
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + k + ")";
    }
}
