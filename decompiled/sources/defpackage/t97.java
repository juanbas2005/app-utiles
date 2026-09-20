package defpackage;

import android.content.Context;
import android.net.NetworkRequest;
import cu.lestebang.utiletecsa.sync.worker.DelegatingWorker;
import cu.lestebang.utiletecsa.sync.worker.SyncWorker;
import java.util.LinkedHashSet;

/* renamed from: t97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t97 {
    public final Context a;

    public t97(Context context) {
        this.a = context;
        gr8.u(new c6(nd8.c(context).d("cu.lestebang.utiletecsa.jetpack.sync.worker"), 14), -1);
    }

    public final void a() {
        yh7.a.getClass();
        hr2.m(new Object[0]);
        nd8 c = nd8.c(this.a);
        hr2.m(new Object[0]);
        r55 r55 = new r55(DelegatingWorker.class);
        be8 be8 = (be8) r55.c;
        be8.q = true;
        be8.r = g85.w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ((be8) r55.c).j = new j31(new ny4((NetworkRequest) null), yy4.x, false, false, false, false, -1, -1, dt0.g1(linkedHashSet));
        ((be8) r55.c).e = we.i(b26.a.b(SyncWorker.class));
        c.b("cu.lestebang.utiletecsa.jetpack.sync.worker", w82.x, (s55) r55.a());
    }
}
