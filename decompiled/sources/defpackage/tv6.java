package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: tv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tv6 implements Iterator {
    public static final tv6 x = new tv6(0);
    public final /* synthetic */ int w;

    public /* synthetic */ tv6(int i) {
        this.w = i;
    }

    public final boolean hasNext() {
        switch (this.w) {
            case b85.b:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    public final Object next() {
        switch (this.w) {
            case b85.b:
                throw new NoSuchElementException();
            case 1:
                throw new NoSuchElementException();
            default:
                throw new NoSuchElementException();
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new IllegalStateException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
