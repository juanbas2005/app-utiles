package defpackage;

import java.util.Iterator;

/* renamed from: sn7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sn7 implements Iterator, ar3 {
    public Object[] w = rn7.e.d;
    public int x;
    public int y;

    public final void a(Object[] objArr, int i, int i2) {
        this.w = objArr;
        this.x = i;
        this.y = i2;
    }

    public final boolean hasNext() {
        if (this.y < this.x) {
            return true;
        }
        return false;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
