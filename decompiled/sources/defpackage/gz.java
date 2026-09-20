package defpackage;

/* renamed from: gz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gz extends s91 {
    public final String a;
    public final String b;
    public final String c;

    public gz(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s91) {
            gz gzVar = (gz) ((s91) obj);
            if (!this.a.equals(gzVar.a) || !this.b.equals(gzVar.b) || !this.c.equals(gzVar.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return f21.l(sb, this.c, "}");
    }
}
