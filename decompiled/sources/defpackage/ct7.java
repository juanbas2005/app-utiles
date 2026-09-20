package defpackage;

import java.util.Iterator;

/* renamed from: ct7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ct7 implements Iterator {
    public final /* synthetic */ int w;
    public Iterator x;

    public ct7(ur8 ur8) {
        this.w = 2;
        this.x = ur8.w.keySet().iterator();
    }

    public final boolean hasNext() {
        switch (this.w) {
            case b85.b:
                return this.x.hasNext();
            case 1:
                return this.x.hasNext();
            default:
                return this.x.hasNext();
        }
    }

    public final Object next() {
        switch (this.w) {
            case b85.b:
                return (String) this.x.next();
            case 1:
                return (String) this.x.next();
            default:
                return (String) this.x.next();
        }
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public /* synthetic */ ct7(int i) {
        this.w = i;
    }
}
