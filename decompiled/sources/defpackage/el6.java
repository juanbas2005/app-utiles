package defpackage;

import java.util.Iterator;

/* renamed from: el6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class el6 implements Iterator, ar3 {
    public final /* synthetic */ int w;
    public final Object x;
    public boolean y = true;

    public /* synthetic */ el6(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final boolean hasNext() {
        switch (this.w) {
            case b85.b:
                return this.y;
            case 1:
                return this.y;
            default:
                return this.y;
        }
    }

    public final Object next() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                if (this.y) {
                    this.y = false;
                    return obj;
                }
                rf2.c();
                return null;
            case 1:
                if (this.y) {
                    this.y = false;
                    return obj;
                }
                rf2.c();
                return null;
            default:
                if (this.y) {
                    this.y = false;
                    return ((p55) obj).w;
                }
                rf2.c();
                return null;
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
