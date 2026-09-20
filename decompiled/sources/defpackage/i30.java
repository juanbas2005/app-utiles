package defpackage;

/* renamed from: i30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i30 extends yv4 {
    public final Object a;
    public final long b;

    public i30(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i30)) {
            return false;
        }
        i30 i30 = (i30) obj;
        if (this.a.equals(i30.a) && this.b == i30.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.a + ", compositeKey=" + this.b + ')';
    }
}
