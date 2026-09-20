package defpackage;

import java.util.ListIterator;

/* renamed from: z84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z84 implements ListIterator {
    public boolean w;
    public final /* synthetic */ ListIterator x;
    public final /* synthetic */ a94 y;

    public z84(a94 a94, ListIterator listIterator) {
        this.y = a94;
        this.x = listIterator;
    }

    public final void add(Object obj) {
        ListIterator listIterator = this.x;
        listIterator.add(obj);
        listIterator.previous();
        this.w = false;
    }

    public final boolean hasNext() {
        return this.x.hasPrevious();
    }

    public final boolean hasPrevious() {
        return this.x.hasNext();
    }

    public final Object next() {
        ListIterator listIterator = this.x;
        if (listIterator.hasPrevious()) {
            this.w = true;
            return listIterator.previous();
        }
        rf2.c();
        return null;
    }

    public final int nextIndex() {
        return this.y.d(this.x.nextIndex());
    }

    public final Object previous() {
        ListIterator listIterator = this.x;
        if (listIterator.hasNext()) {
            this.w = true;
            return listIterator.next();
        }
        rf2.c();
        return null;
    }

    public final int previousIndex() {
        return nextIndex() - 1;
    }

    public final void remove() {
        g75.o("no calls to next() since the last call to remove()", this.w);
        this.x.remove();
        this.w = false;
    }

    public final void set(Object obj) {
        if (this.w) {
            this.x.set(obj);
            return;
        }
        throw new IllegalStateException();
    }
}
