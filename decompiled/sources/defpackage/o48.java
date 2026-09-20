package defpackage;

/* renamed from: o48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o48 implements ky3 {
    public final se7 w;
    public final int x;
    public final tl7 y;
    public final sr2 z;

    public o48(se7 se7, int i, tl7 tl7, sr2 sr2) {
        this.w = se7;
        this.x = i;
        this.y = tl7;
        this.z = sr2;
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        long j2 = j;
        eh5 y2 = gh4.y(k31.a(j2, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(y2.x, k31.g(j2));
        return oh4.d0(y2.w, min, b42.w, new mp2(this, y2, min));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o48) {
            o48 o48 = (o48) obj;
            if (this.w == o48.w && this.x == o48.x && this.y.equals(o48.y) && sg3.e(this.z, o48.z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = f21.e(this.x, this.w.hashCode() * 31, 31);
        return this.z.hashCode() + ((this.y.hashCode() + e) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.w + ", cursorOffset=" + this.x + ", transformedText=" + this.y + ", textLayoutResultProvider=" + this.z + ")";
    }
}
