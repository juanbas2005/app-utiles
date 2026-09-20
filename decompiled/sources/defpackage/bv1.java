package defpackage;

/* renamed from: bv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bv1 extends mp7 {
    public final int L;

    public bv1(int i) {
        this.L = i;
        if (i <= 0) {
            h.q("px must be > 0.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv1) || this.L != ((bv1) obj).L) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.L;
    }

    public final String toString() {
        return String.valueOf(this.L);
    }
}
