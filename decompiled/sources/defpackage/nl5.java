package defpackage;

/* renamed from: nl5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nl5 extends ml5 {
    public final Object c = new Object();

    public nl5() {
        super(12);
    }

    public final Object a() {
        Object a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    public final boolean c(Object obj) {
        boolean c2;
        synchronized (this.c) {
            c2 = super.c(obj);
        }
        return c2;
    }
}
