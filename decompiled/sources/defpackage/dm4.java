package defpackage;

/* renamed from: dm4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dm4 extends cr4 {
    public final fm4 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dm4(fm4 fm4) {
        super(pf8.b, fm4.a, "monthName");
        fm4.getClass();
        this.d = fm4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dm4) || !this.d.a.equals(((dm4) obj).d.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}
