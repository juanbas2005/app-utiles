package defpackage;

/* renamed from: ju7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ju7 {
    public final qy6 a;
    public final long b;

    public ju7(qy6 qy6, long j) {
        this.a = qy6;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ju7) {
            ju7 ju7 = (ju7) obj;
            if (this.a == ju7.a && this.b == ju7.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UploadData(stream=" + this.a + ", size=" + this.b + ')';
    }
}
