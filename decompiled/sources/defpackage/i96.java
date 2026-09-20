package defpackage;

import java.util.Iterator;

/* renamed from: i96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i96 implements Iterator {
    public final h96 w;
    public uf0 x;
    public int y;

    public i96(j96 j96) {
        h96 h96 = new h96(j96);
        this.w = h96;
        this.x = new uf0(h96.next());
        this.y = j96.x;
    }

    public final boolean hasNext() {
        if (this.y > 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (!this.x.hasNext()) {
            this.x = new uf0(this.w.next());
        }
        this.y--;
        return Byte.valueOf(this.x.a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
