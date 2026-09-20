package defpackage;

/* renamed from: yt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yt3 extends xt3 {
    public final long a;

    public yt3(long j) {
        this.a = j;
    }

    public final Object a() {
        return Long.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yt3) && this.a == ((yt3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
