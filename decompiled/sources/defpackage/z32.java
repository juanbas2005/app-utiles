package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: z32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z32 implements ListIterator, ar3 {
    public static final z32 w = new Object();

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return 0;
    }

    public final Object previous() {
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
