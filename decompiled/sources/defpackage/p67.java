package defpackage;

/* renamed from: p67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p67 {
    public final s67 a;
    public iz3 b;
    public final o67 c = new o67(this, 2);
    public final o67 d = new o67(this, 0);
    public final o67 e = new o67(this, 1);

    public p67(s67 s67) {
        this.a = s67;
    }

    public final iz3 a() {
        iz3 iz3 = this.b;
        if (iz3 != null) {
            return iz3;
        }
        h.q("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
