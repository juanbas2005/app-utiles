package defpackage;

import java.util.Iterator;

/* renamed from: eo0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eo0 implements Iterator, ar3 {
    public final int w;
    public final int x;
    public boolean y;
    public int z;

    public eo0(char c, char c2, int i) {
        this.w = i;
        this.x = c2;
        boolean z2 = false;
        if (i <= 0 ? c >= c2 : c <= c2) {
            z2 = true;
        }
        this.y = z2;
        this.z = !z2 ? c2 : c;
    }

    public final boolean hasNext() {
        return this.y;
    }

    public final Object next() {
        int i = this.z;
        if (i != this.x) {
            this.z = this.w + i;
        } else if (this.y) {
            this.y = false;
        } else {
            rf2.c();
            return null;
        }
        return Character.valueOf((char) i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
