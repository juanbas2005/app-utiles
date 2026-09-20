package defpackage;

import java.util.Iterator;

/* renamed from: hv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hv6 implements my0, Iterable, ar3 {
    public final gv6 w;
    public final int x;
    public final int y;

    public hv6(gv6 gv6, int i, int i2) {
        this.w = gv6;
        this.x = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hv6)) {
            return false;
        }
        hv6 hv6 = (hv6) obj;
        if (hv6.x == this.x && hv6.y == this.y && hv6.w == this.w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.w.hashCode() * 31) + this.x;
    }

    public final Iterator iterator() {
        gv6 gv6 = this.w;
        if (gv6.D != this.y) {
            iv6.f();
        }
        int i = this.x;
        gv6.s(i);
        return new ux2(gv6, i + 1, gv6.w[(i * 5) + 3] + i);
    }
}
