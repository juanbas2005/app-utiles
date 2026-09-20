package defpackage;

import java.util.ListIterator;

/* renamed from: bt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bt7 implements ListIterator {
    public final /* synthetic */ int w;
    public ListIterator x;

    public /* synthetic */ bt7(int i) {
        this.w = i;
    }

    public final void add(Object obj) {
        switch (this.w) {
            case b85.b:
                String str = (String) obj;
                throw new UnsupportedOperationException();
            default:
                String str2 = (String) obj;
                throw new UnsupportedOperationException();
        }
    }

    public final boolean hasNext() {
        switch (this.w) {
            case b85.b:
                return this.x.hasNext();
            default:
                return this.x.hasNext();
        }
    }

    public final boolean hasPrevious() {
        switch (this.w) {
            case b85.b:
                return this.x.hasPrevious();
            default:
                return this.x.hasPrevious();
        }
    }

    public final Object next() {
        switch (this.w) {
            case b85.b:
                return (String) this.x.next();
            default:
                return (String) this.x.next();
        }
    }

    public final int nextIndex() {
        switch (this.w) {
            case b85.b:
                return this.x.nextIndex();
            default:
                return this.x.nextIndex();
        }
    }

    public final Object previous() {
        switch (this.w) {
            case b85.b:
                return (String) this.x.previous();
            default:
                return (String) this.x.previous();
        }
    }

    public final int previousIndex() {
        switch (this.w) {
            case b85.b:
                return this.x.previousIndex();
            default:
                return this.x.previousIndex();
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void set(Object obj) {
        switch (this.w) {
            case b85.b:
                String str = (String) obj;
                throw new UnsupportedOperationException();
            default:
                String str2 = (String) obj;
                throw new UnsupportedOperationException();
        }
    }
}
