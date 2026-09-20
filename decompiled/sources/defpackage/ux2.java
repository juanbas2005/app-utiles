package defpackage;

import java.util.Iterator;

/* renamed from: ux2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ux2 implements Iterator, ar3 {
    public final gv6 w;
    public final int x;
    public int y;
    public final int z;

    public ux2(gv6 gv6, int i, int i2) {
        this.w = gv6;
        this.x = i2;
        this.y = i;
        this.z = gv6.D;
        if (gv6.C) {
            iv6.f();
        }
    }

    public final boolean hasNext() {
        if (this.y < this.x) {
            return true;
        }
        return false;
    }

    public final Object next() {
        gv6 gv6 = this.w;
        int i = gv6.D;
        int i2 = this.z;
        if (i != i2) {
            iv6.f();
        }
        int i3 = this.y;
        this.y = gv6.w[(i3 * 5) + 3] + i3;
        return new hv6(gv6, i3, i2);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
