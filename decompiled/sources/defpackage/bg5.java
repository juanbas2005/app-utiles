package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bg5 implements Iterator, ar3 {
    public final /* synthetic */ int w = 2;
    public final Iterator x;

    public bg5(yf5 yf5) {
        sn7[] sn7Arr = new sn7[8];
        for (int i = 0; i < 8; i++) {
            sn7Arr[i] = new un7(this);
        }
        this.x = new zf5(yf5, sn7Arr);
    }

    public final boolean hasNext() {
        switch (this.w) {
            case b85.b:
                return ((zf5) this.x).y;
            case 1:
                return ((e2) this.x).hasNext();
            default:
                return this.x.hasNext();
        }
    }

    public final Object next() {
        switch (this.w) {
            case b85.b:
                return (Map.Entry) ((zf5) this.x).next();
            case 1:
                return ((e2) this.x).next();
            default:
                return (h38) this.x.next();
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                ((zf5) this.x).remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bg5(Object[] objArr) {
        objArr.getClass();
        this.x = new e2(objArr);
    }

    public bg5(b38 b38) {
        this.x = b38.F.iterator();
    }
}
