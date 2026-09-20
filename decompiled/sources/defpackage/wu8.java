package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wu8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wu8 implements k99, k55, c55, x45 {
    public final /* synthetic */ int w;
    public final Executor x;
    public final g61 y;
    public final yb9 z;

    public /* synthetic */ wu8(Executor executor, g61 g61, yb9 yb9, int i) {
        this.w = i;
        this.x = executor;
        this.y = g61;
        this.z = yb9;
    }

    public final void a(yb9 yb9) {
        switch (this.w) {
            case b85.b:
                this.x.execute(new nt2(this, false, yb9, 20));
                return;
            default:
                this.x.execute(new nt2(this, false, yb9, 21));
                return;
        }
    }

    public void f() {
        this.z.p();
    }

    public void g(Object obj) {
        this.z.m(obj);
    }

    public void j(Exception exc) {
        this.z.o(exc);
    }
}
