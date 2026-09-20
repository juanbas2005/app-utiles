package defpackage;

/* renamed from: fy8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fy8 extends cx8 {
    public boolean x;

    public fy8(y19 y19) {
        super(y19);
        ((y19) this.w).W++;
    }

    public final void d1() {
        if (!this.x) {
            h.s("Not initialized");
        }
    }

    public final void e1() {
        if (this.x) {
            h.s("Can't initialize twice");
        } else if (!f1()) {
            ((y19) this.w).Y.incrementAndGet();
            this.x = true;
        }
    }

    public abstract boolean f1();
}
