package defpackage;

/* renamed from: e76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e76 extends f76 {
    public final String b;

    public e76(String str) {
        super("representation");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e76) && this.b.equals(((e76) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Representation(columns=");
        sb.append("Columns(value=" + this.b + ')');
        sb.append(')');
        return sb.toString();
    }
}
