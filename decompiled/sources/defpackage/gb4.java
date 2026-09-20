package defpackage;

/* renamed from: gb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gb4 {
    public final Object a;
    public final sr2 b;

    public gb4(Object obj, sr2 sr2) {
        this.a = obj;
        this.b = sr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gb4.class != obj.getClass() || !this.a.equals(((gb4) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
