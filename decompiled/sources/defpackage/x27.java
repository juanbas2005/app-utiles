package defpackage;

/* renamed from: x27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x27 {
    public final long a;
    public final long b;

    public x27(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            h.j(f21.g(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        } else if (j2 < 0) {
            h.j(f21.g(j2, "replayExpiration(", " ms) cannot be negative"));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x27)) {
            return false;
        }
        x27 x27 = (x27) obj;
        if (this.a == x27.a && this.b == x27.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        n74 n74 = new n74(2);
        long j = this.a;
        if (j > 0) {
            n74.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            n74.add("replayExpiration=" + j2 + "ms");
        }
        return hl6.o(new StringBuilder("SharingStarted.WhileSubscribed("), dt0.E0(sg3.i(n74), (String) null, (String) null, (String) null, (vr2) null, 63), ')');
    }
}
