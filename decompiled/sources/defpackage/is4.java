package defpackage;

import cu.lestebang.utiletecsa.sync.worker.DelegatingWorker;
import cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: is4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class is4 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ vs4 x;

    public /* synthetic */ is4(vs4 vs4, int i) {
        this.w = i;
        this.x = vs4;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        vs4 vs4 = this.x;
        switch (i) {
            case b85.b:
                String str = (String) obj;
                str.getClass();
                ar7.H(u58.a(vs4), (e81) null, (r81) null, new ju1(vs4, str, (f61) null, 26), 3);
                return vs7;
            default:
                long longValue = ((Long) obj).longValue();
                kr4 kr4 = vs4.c;
                kr4.getClass();
                yh7.a.getClass();
                hr2.m(new Object[0]);
                nd8 c = nd8.c(kr4.a);
                r55 r55 = new r55(DelegatingWorker.class);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                timeUnit.getClass();
                ((be8) r55.c).g = timeUnit.toMillis(longValue);
                if (Long.MAX_VALUE - System.currentTimeMillis() > ((be8) r55.c).g) {
                    ((be8) r55.c).e = we.i(b26.a.b(NautaLogoutWorker.class));
                    c.b("cu.lestebang.utiletecsa.sync.worker.nautalogout", w82.w, (s55) r55.a());
                    return vs7;
                }
                h.q("The given initial delay is too large and will cause an overflow!");
                return null;
        }
    }
}
