package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: x39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x39 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ v49 y;

    public x39(v49 v49, long j, int i) {
        this.w = i;
        switch (i) {
            case 1:
                this.x = j;
                this.y = v49;
                return;
            default:
                this.x = j;
                Objects.requireNonNull(v49);
                this.y = v49;
                return;
        }
    }

    public final void run() {
        int i = this.w;
        long j = this.x;
        v49 v49 = this.y;
        switch (i) {
            case b85.b:
                y19 y19 = (y19) v49.w;
                q09 q09 = y19.A;
                y19.e(q09);
                q09.G.b(j);
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.I.b("Session timeout duration set", Long.valueOf(j));
                return;
            default:
                v49.b1();
                v49.d1();
                y19 y192 = (y19) v49.w;
                pz8 pz82 = y192.B;
                y19.g(pz82);
                pz82.I.a("Resetting analytics data (FE)");
                o79 o79 = y192.D;
                y19.f(o79);
                o79.b1();
                r38 r38 = o79.B;
                ((h79) r38.y).c();
                ((y19) ((o79) r38.z).w).G.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                r38.w = elapsedRealtime;
                r38.x = elapsedRealtime;
                y192.l().h1();
                boolean z = !y192.a();
                q09 q092 = y192.A;
                y19.e(q092);
                q092.B.b(j);
                y19 y193 = (y19) q092.w;
                q09 q093 = y193.A;
                y19.e(q093);
                if (!TextUtils.isEmpty(q093.R.j())) {
                    q092.R.k((String) null);
                }
                q092.L.b(0);
                q092.M.b(0);
                if (!y193.z.q1()) {
                    q092.k1(z);
                }
                q092.S.k((String) null);
                q092.T.b(0);
                q092.U.i((Bundle) null);
                r69 j2 = y192.j();
                j2.b1();
                j2.d1();
                z99 s1 = j2.s1(false);
                j2.o1();
                ((y19) j2.w).i().g1();
                j2.q1(new v59(j2, s1, 0));
                y19.f(o79);
                o79.A.k();
                v49.N = z;
                y192.j().g1(new AtomicReference());
                return;
        }
    }
}
