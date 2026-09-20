package defpackage;

/* renamed from: c47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c47 extends hj8 implements xu {
    public long u;
    public b47 v;

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c47)) {
            return false;
        }
        c47 c47 = (c47) obj;
        if (u02.d(this.u, c47.u) && this.v.equals(c47.v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.u;
        xb4 xb4 = u02.x;
        int hashCode = this.v.hashCode();
        return Boolean.hashCode(false) + ((hashCode + (Long.hashCode(j) * 31)) * 961);
    }

    public final String toString() {
        return "Config(transferTimeout=" + u02.k(this.u) + ", resumable=" + this.v + ", serializer=null, requireValidSession=false)";
    }
}
