package defpackage;

/* renamed from: jj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jj1 extends cr4 {
    public final lj1 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jj1(lj1 lj1) {
        super(tf1.b, lj1.a, "dayOfWeekName");
        lj1.getClass();
        this.d = lj1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jj1) || !this.d.a.equals(((jj1) obj).d.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.a.hashCode();
    }
}
