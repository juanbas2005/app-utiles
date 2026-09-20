package defpackage;

import java.util.Iterator;

/* renamed from: be9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class be9 implements Iterator {
    public final id9 w;
    public int x;
    public int y;
    public final /* synthetic */ ce9 z;

    public /* synthetic */ be9(ce9 ce9, id9 id9, int i) {
        this.z = ce9;
        this.w = id9;
        int i2 = i & 31;
        this.x = i2;
        this.y = i >>> (i2 + 5);
    }

    public final boolean hasNext() {
        if (this.x >= 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        Object obj;
        int i = this.x;
        ce9 ce9 = this.z;
        b85 b85 = ce9.b;
        int w2 = b85.w();
        if (i >= w2) {
            obj = ce9.c.z(i - w2);
        } else {
            obj = b85.z(i);
        }
        Object cast = this.w.b.cast(obj);
        int i2 = this.y;
        if (i2 != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
            this.y >>>= numberOfTrailingZeros;
            this.x += numberOfTrailingZeros;
            return cast;
        }
        this.x = -1;
        return cast;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
