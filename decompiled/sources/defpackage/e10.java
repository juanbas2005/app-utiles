package defpackage;

/* renamed from: e10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e10 {
    public final long a;
    public final u10 b;
    public final p00 c;

    public e10(long j, u10 u10, p00 p00) {
        this.a = j;
        this.b = u10;
        this.c = p00;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e10)) {
            return false;
        }
        e10 e10 = (e10) obj;
        if (this.a != e10.a || !this.b.equals(e10.b) || !this.c.equals(e10.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
