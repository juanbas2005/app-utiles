package defpackage;

/* renamed from: g89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class g89 extends z79 {
    public boolean y;

    public g89(v89 v89) {
        super(v89);
        this.x.N++;
    }

    public final void d1() {
        if (!this.y) {
            h.s("Not initialized");
        }
    }

    public final void e1() {
        if (!this.y) {
            f1();
            this.x.O++;
            this.y = true;
            return;
        }
        h.s("Can't initialize twice");
    }

    public abstract void f1();
}
