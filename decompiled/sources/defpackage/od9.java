package defpackage;

/* renamed from: od9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class od9 implements gd9 {
    public final gd9 a;
    public final Object b;

    public od9(gd9 gd9, Object obj) {
        this.a = gd9;
        jb5.K("log site qualifier", obj);
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof od9)) {
            return false;
        }
        od9 od9 = (od9) obj;
        if (!this.a.equals(od9.a) || !this.b.equals(od9.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String obj2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + obj2.length() + 3);
        f21.v(sb, "SpecializedLogSiteKey{ delegate='", obj, "', qualifier='", obj2);
        sb.append("' }");
        return sb.toString();
    }
}
