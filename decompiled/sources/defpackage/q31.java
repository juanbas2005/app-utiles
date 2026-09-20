package defpackage;

/* renamed from: q31  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q31 extends r31 {
    public final int a;

    public q31(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q31) && this.a == ((q31) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return f21.j(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
    }
}
