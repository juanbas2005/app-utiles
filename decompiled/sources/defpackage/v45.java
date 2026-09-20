package defpackage;

import android.window.OnBackInvokedDispatcher;

/* renamed from: v45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v45 {
    public final Runnable a;
    public final z97 b = new z97(new hx4(3, this));

    public v45(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(g30 g30, t54 t54) {
        g30.getClass();
        in8 k = t54.k();
        if (k.G0() != k54.w) {
            q45 q45 = new q45(g30, new r45(g30, t54));
            g30.a.add(q45);
            q45.j(false);
            rv4.a(b().c, q45);
            pm1 pm1 = new pm1(q45, this, k);
            k.x0(pm1);
            g30.c.add(new s45(k, pm1));
        }
    }

    public final t45 b() {
        return (t45) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.c(new o45(onBackInvokedDispatcher, 0), 1);
        b().c.c(new o45(onBackInvokedDispatcher, 1000000), 0);
    }
}
