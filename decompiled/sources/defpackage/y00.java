package defpackage;

/* renamed from: y00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y00 {
    public final String a;
    public final String b;

    public y00(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            ku4.j("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00 = (y00) obj;
        if (!this.a.equals(y00.a) || !this.b.equals(y00.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return f21.l(sb, this.b, "}");
    }
}
