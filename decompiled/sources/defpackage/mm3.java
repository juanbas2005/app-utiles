package defpackage;

import java.util.Iterator;

/* renamed from: mm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mm3 implements Iterator, ar3 {
    public final pl3 w;
    public final sw5 x;
    public final zr3 y;

    public mm3(pl3 pl3, sw5 sw5, zr3 zr3) {
        pl3.getClass();
        this.w = pl3;
        this.x = sw5;
        this.y = zr3;
    }

    public final boolean hasNext() {
        if (this.x.z() != 10) {
            return true;
        }
        return false;
    }

    public final Object next() {
        zr3 zr3 = this.y;
        return new l47(this.w, ef8.OBJ, this.x, zr3.getDescriptor(), (py2) null).g(zr3);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
