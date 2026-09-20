package defpackage;

/* renamed from: um  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class um {
    public final rm a;

    public um(rm rmVar) {
        rmVar.getClass();
        this.a = rmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof um)) {
            return false;
        }
        return sg3.e(((um) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
