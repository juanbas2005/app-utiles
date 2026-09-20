package defpackage;

import java.util.Iterator;

/* renamed from: f02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f02 implements Iterator, ar3 {
    public final /* synthetic */ int w = 0;
    public final Iterator x;
    public int y;

    public f02(g02 g02) {
        this.x = g02.a.iterator();
        this.y = g02.b;
    }

    public final boolean hasNext() {
        int i = this.w;
        Iterator it = this.x;
        switch (i) {
            case b85.b:
                break;
            default:
                return it.hasNext();
        }
        while (this.y > 0 && it.hasNext()) {
            it.next();
            this.y--;
        }
        return it.hasNext();
    }

    public final Object next() {
        int i = this.w;
        Iterator it = this.x;
        switch (i) {
            case b85.b:
                break;
            default:
                int i2 = this.y;
                this.y = i2 + 1;
                if (i2 >= 0) {
                    return new ka3(i2, it.next());
                }
                sg3.Z();
                throw null;
        }
        while (this.y > 0 && it.hasNext()) {
            it.next();
            this.y--;
        }
        return it.next();
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f02(Iterator it) {
        it.getClass();
        this.x = it;
    }
}
