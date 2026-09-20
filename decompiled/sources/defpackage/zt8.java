package defpackage;

/* renamed from: zt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zt8 extends at7 {
    public static final Object y = new Object();
    public Object x;

    public zt8(Object obj) {
        super(3);
        this.x = obj;
    }

    public final boolean hasNext() {
        if (this.x != y) {
            return true;
        }
        return false;
    }

    public final Object next() {
        Object obj = this.x;
        Object obj2 = y;
        if (obj != obj2) {
            this.x = obj2;
            return obj;
        }
        rf2.c();
        return null;
    }
}
