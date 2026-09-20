package defpackage;

/* renamed from: gk2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gk2 {
    public final lk2 a;
    public final je b;
    public final up4 c = new up4();
    public final up4 d = new up4();
    public boolean e;

    public gk2(lk2 lk2, je jeVar) {
        this.a = lk2;
        this.b = jeVar;
        up4 up4 = cg6.a;
    }

    public final void a() {
        if (!this.e) {
            yd ydVar = new yd(0, this, gk2.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 9);
            lp4 lp4 = this.b.J0;
            if (lp4.g(ydVar) < 0) {
                lp4.a(ydVar);
            }
            this.e = true;
        }
    }
}
