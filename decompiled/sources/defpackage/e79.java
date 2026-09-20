package defpackage;

/* renamed from: e79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e79 {
    public final l69 a;
    public final dv5 b;

    public e79(l69 l69, dv5 dv5) {
        this.a = l69;
        this.b = dv5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e79) {
            e79 e79 = (e79) obj;
            l69 l69 = e79.a;
            l69 l692 = this.a;
            if (l692 != null ? l692 == l69 : l69 == null) {
                if (this.b != e79.b) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        l69 l69 = this.a;
        if (l69 == null) {
            i = 0;
        } else {
            i = l69.hashCode();
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(valueOf.length() + 52 + obj.length() + 1);
        f21.v(sb, "SnapshotBlobAndResult{snapshotBlob=", valueOf, ", snapshotResult=", obj);
        sb.append("}");
        return sb.toString();
    }
}
