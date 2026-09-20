package defpackage;

/* renamed from: mb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mb9 {
    public final d79 a;
    public final gl8 b;

    public mb9(d79 d79, gl8 gl8) {
        this.a = d79;
        if (gl8 != null) {
            this.b = gl8;
        } else {
            ku4.j("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mb9)) {
            return false;
        }
        mb9 mb9 = (mb9) obj;
        if (!this.a.equals(mb9.a) || !this.b.equals(mb9.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String nl8 = this.a.toString();
        int length = nl8.length();
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 53 + obj.length() + 1);
        f21.v(sb, "ProtoSerializer{defaultValue=", nl8, ", extensionRegistryLite=", obj);
        sb.append("}");
        return sb.toString();
    }
}
