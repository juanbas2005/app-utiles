package defpackage;

/* renamed from: sa3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sa3 {
    public final int a;

    public /* synthetic */ sa3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof sa3) && this.a == ((sa3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pb4.i(this.a, "IndirectPointerEventPrimaryDirectionalMotionAxis(value=", ")");
    }
}
