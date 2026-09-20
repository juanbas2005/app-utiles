package defpackage;

/* renamed from: hz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hz extends u91 {
    public final String a;
    public final String b;

    public hz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u91)) {
            return false;
        }
        hz hzVar = (hz) ((u91) obj);
        if (!this.a.equals(hzVar.a) || !this.b.equals(hzVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return f21.l(sb, this.b, "}");
    }
}
