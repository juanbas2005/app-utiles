package defpackage;

/* renamed from: px2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class px2 {
    public final long a;

    public /* synthetic */ px2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof px2)) {
            return false;
        }
        if (this.a != ((px2) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f21.g(this.a, "GridItemSpan(packedValue=", ")");
    }
}
