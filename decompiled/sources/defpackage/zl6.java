package defpackage;

/* renamed from: zl6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zl6 implements Runnable {
    public final w54 w;
    public final j54 x;
    public boolean y;

    public zl6(w54 w54, j54 j54) {
        w54.getClass();
        j54.getClass();
        this.w = w54;
        this.x = j54;
    }

    public final void run() {
        if (!this.y) {
            this.w.f1(this.x);
            this.y = true;
        }
    }
}
