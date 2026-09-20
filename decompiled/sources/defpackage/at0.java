package defpackage;

/* renamed from: at0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class at0 {
    public final int a;
    public final int b;

    public at0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.at0) r5;
     */
    public final boolean equals(Object obj) {
        at0 at0;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof at0) && this.a == at0.a && this.b == at0.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pb4.k("CollectionInfo(rowCount=", this.a, ", columnCount=", this.b, ")");
    }
}
