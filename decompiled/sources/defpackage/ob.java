package defpackage;

/* renamed from: ob  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ob {
    public final kb a;

    public ob(kb kbVar) {
        this.a = kbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ob) && sg3.e(this.a, ((ob) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.a + ")";
    }
}
