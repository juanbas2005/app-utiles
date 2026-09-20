package defpackage;

/* renamed from: hd1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hd1 {
    public final av5 a;
    public final boolean b;

    public hd1(av5 av5, boolean z) {
        this.a = av5;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hd1) {
            hd1 hd1 = (hd1) obj;
            if (!hd1.a.equals(this.a) || hd1.b != this.b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
