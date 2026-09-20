package defpackage;

/* renamed from: zy  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zy extends tr0 {
    public final wy a;

    public zy(wy wyVar) {
        this.a = wyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tr0)) {
            return false;
        }
        tr0 tr0 = (tr0) obj;
        sr0 sr0 = sr0.w;
        if (!sr0.equals(sr0)) {
            return false;
        }
        if (this.a.equals(((zy) tr0).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((sr0.w.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + sr0.w + ", androidClientInfo=" + this.a + "}";
    }
}
