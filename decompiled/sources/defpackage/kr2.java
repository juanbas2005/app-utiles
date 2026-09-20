package defpackage;

/* renamed from: kr2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kr2 extends RuntimeException {
    public final lr2 w;
    public final Throwable x;

    public kr2(lr2 lr2, Throwable th) {
        super(th);
        this.w = lr2;
        this.x = th;
    }

    public final Throwable getCause() {
        return this.x;
    }
}
