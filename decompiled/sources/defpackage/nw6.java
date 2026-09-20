package defpackage;

/* renamed from: nw6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nw6 {
    public final ow6 a;
    public final kk0 b;

    public nw6(ow6 ow6, kk0 kk0) {
        this.a = ow6;
        this.b = kk0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nw6.class == obj.getClass()) {
            nw6 nw6 = (nw6) obj;
            if (sg3.e(this.a, nw6.a) && this.b == nw6.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
