package defpackage;

/* renamed from: ge7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ge7 implements nh2, ps2 {
    public final /* synthetic */ sr2 w;

    public ge7(sr2 sr2) {
        this.w = sr2;
    }

    public final ds2 a() {
        return this.w;
    }

    public final /* synthetic */ float b() {
        return ((Number) this.w.b()).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nh2) || !(obj instanceof ps2)) {
            return false;
        }
        return sg3.e(this.w, ((ps2) obj).a());
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
