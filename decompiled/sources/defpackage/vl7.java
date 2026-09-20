package defpackage;

import java.util.Iterator;

/* renamed from: vl7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vl7 implements Iterator, ar3 {
    public final Iterator w;
    public final /* synthetic */ wl7 x;

    public vl7(wl7 wl7) {
        this.x = wl7;
        this.w = wl7.a.iterator();
    }

    public final boolean hasNext() {
        return this.w.hasNext();
    }

    public final Object next() {
        return this.x.b.y(this.w.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
