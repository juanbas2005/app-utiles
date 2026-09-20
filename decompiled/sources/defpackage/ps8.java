package defpackage;

/* renamed from: ps8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ps8 extends at7 {
    public final Object x;
    public boolean y;

    public ps8(Object obj) {
        super(2);
        this.x = obj;
    }

    public final boolean hasNext() {
        if (!this.y) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (!this.y) {
            this.y = true;
            return this.x;
        }
        rf2.c();
        return null;
    }
}
