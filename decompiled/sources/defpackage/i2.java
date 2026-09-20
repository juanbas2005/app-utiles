package defpackage;

import java.util.ListIterator;

/* renamed from: i2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i2 implements ListIterator, ar3 {
    public int w;
    public int x;

    public i2(int i, int i2) {
        this.w = i;
        this.x = i2;
    }

    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        if (this.w < this.x) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.w > 0) {
            return true;
        }
        return false;
    }

    public final int nextIndex() {
        return this.w;
    }

    public final int previousIndex() {
        return this.w - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
