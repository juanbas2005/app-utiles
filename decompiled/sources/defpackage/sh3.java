package defpackage;

/* renamed from: sh3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sh3 extends at7 {
    public boolean x;
    public final /* synthetic */ Object y;

    public sh3(Object obj) {
        super(0);
        this.y = obj;
    }

    public final boolean hasNext() {
        return !this.x;
    }

    public final Object next() {
        if (!this.x) {
            this.x = true;
            return this.y;
        }
        rf2.c();
        return null;
    }
}
