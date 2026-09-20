package defpackage;

import java.util.Iterator;

/* renamed from: y1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class y1 implements Iterator, ar3 {
    public int w;
    public Object x;

    public abstract void a();

    public final boolean hasNext() {
        int i = this.w;
        if (i == 0) {
            this.w = 3;
            a();
            if (this.w == 1) {
                return true;
            }
            return false;
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                return false;
            }
            h.q("hasNext called when the iterator is in the FAILED state.");
            return false;
        }
    }

    public final Object next() {
        int i = this.w;
        if (i == 1) {
            this.w = 0;
            return this.x;
        }
        if (i != 2) {
            this.w = 3;
            a();
            if (this.w == 1) {
                this.w = 0;
                return this.x;
            }
        }
        rf2.c();
        return null;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
