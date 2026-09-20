package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker;

/* renamed from: kh5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kh5 {
    public final Context a;

    public kh5(Context context) {
        this.a = context;
    }

    public final void a() {
        yh7.a.getClass();
        hr2.m(new Object[0]);
        nd8 c = nd8.c(this.a);
        td0 td0 = c.b.m;
        String concat = "CancelWorkByName_".concat("cu.lestebang.utiletecsa.sync.worker.planexpiry");
        ol6 ol6 = c.d.a;
        ol6.getClass();
        g75.E(td0, concat, ol6, new f5(11, "cu.lestebang.utiletecsa.sync.worker.planexpiry", c));
    }

    public final void b() {
        yh7.a.getClass();
        hr2.m(new Object[0]);
        nd8 c = nd8.c(this.a);
        k26 k26 = PlanExpiryWorker.k;
        r55 r55 = new r55(12);
        ((be8) r55.c).e = we.i(b26.a.b(PlanExpiryWorker.class));
        c.a("cu.lestebang.utiletecsa.sync.worker.planexpiry", (tf5) r55.a());
    }
}
