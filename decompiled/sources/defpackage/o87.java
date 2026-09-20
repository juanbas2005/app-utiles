package defpackage;

/* renamed from: o87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class o87 implements ab6 {
    public final ir2 w;
    public final String x;
    public boolean y;

    public o87(ir2 ir2, String str) {
        this.w = ir2;
        this.x = str;
    }

    public final void a() {
        if (this.y) {
            l55.w(21, "statement is closed");
            throw null;
        }
    }

    public void n() {
        a();
    }

    public void reset() {
        a();
    }
}
