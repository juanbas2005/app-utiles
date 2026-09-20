package defpackage;

/* renamed from: b47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b47 {
    public long a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b47) && u02.d(this.a, ((b47) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        xb4 xb4 = u02.x;
        return Boolean.hashCode(false) + (Long.hashCode(j) * 31);
    }

    public final String toString() {
        return "Resumable(cache=null, retryTimeout=" + u02.k(this.a) + ", onlyUpdateStateAfterChunk=false)";
    }
}
