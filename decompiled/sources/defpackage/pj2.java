package defpackage;

/* renamed from: pj2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pj2 {
    public final void a(gh4 gh4, gh4 gh42, long j) {
        long i = b85.i(j, jz3.w);
        if (gh4 != null) {
            int l = gh4.l(k31.g(i));
            new ie3(ie3.a(l, gh4.W(l)));
        }
        if (gh42 != null) {
            int l2 = gh42.l(k31.g(i));
            new ie3(ie3.a(l2, gh42.W(l2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj && !(obj instanceof pj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + f21.e(0, oj2.w.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + oj2.w + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
