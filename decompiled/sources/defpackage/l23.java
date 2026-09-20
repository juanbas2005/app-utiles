package defpackage;

/* renamed from: l23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l23 implements ky3 {
    public final se7 w;
    public final int x;
    public final tl7 y;
    public final sr2 z;

    public l23(se7 se7, int i, tl7 tl7, sr2 sr2) {
        this.w = se7;
        this.x = i;
        this.y = tl7;
        this.z = sr2;
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        long j2;
        if (gh4.v(k31.g(j)) < k31.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = k31.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        eh5 y2 = gh4.y(j);
        int min = Math.min(y2.w, k31.h(j2));
        oh4 oh42 = oh4;
        return oh42.d0(min, y2.x, b42.w, new mq1(min, 1, this, oh42, y2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l23) {
            l23 l23 = (l23) obj;
            if (this.w == l23.w && this.x == l23.x && this.y.equals(l23.y) && sg3.e(this.z, l23.z)) {
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
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.w + ", cursorOffset=" + this.x + ", transformedText=" + this.y + ", textLayoutResultProvider=" + this.z + ")";
    }
}
