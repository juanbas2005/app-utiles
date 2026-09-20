package defpackage;

/* renamed from: gj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gj8 {
    public final dk8 a = dk8.b;
    public final String b;

    public gj8(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gj8)) {
            return false;
        }
        gj8 gj8 = (gj8) obj;
        if (!this.a.equals(gj8.a) || !this.b.equals(gj8.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
}
