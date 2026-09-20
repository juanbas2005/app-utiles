package defpackage;

/* renamed from: uj6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uj6 {
    public final cy2 a;
    public final long b;
    public final tj6 c;
    public final boolean d;

    public uj6(cy2 cy2, long j, tj6 tj6, boolean z) {
        this.a = cy2;
        this.b = j;
        this.c = tj6;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj6)) {
            return false;
        }
        uj6 uj6 = (uj6) obj;
        if (this.a == uj6.a && l35.b(this.b, uj6.b) && this.c == uj6.c && this.d == uj6.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b2 = pb4.b(this.a.hashCode() * 31, 31, this.b);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + b2) * 31);
    }

    public final String toString() {
        String g = l35.g(this.b);
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + g + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
