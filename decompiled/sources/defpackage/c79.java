package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* renamed from: c79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c79 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ o79 y;

    public c79(o79 o79, long j, int i) {
        this.w = i;
        switch (i) {
            case 1:
                this.x = j;
                Objects.requireNonNull(o79);
                this.y = o79;
                return;
            default:
                this.x = j;
                Objects.requireNonNull(o79);
                this.y = o79;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ad, code lost:
        if (r10.O.a() != false) goto L_0x00af;
     */
    public final void run() {
        long j;
        int i = this.w;
        o79 o79 = this.y;
        switch (i) {
            case b85.b:
                r38 r38 = o79.B;
                o79.b1();
                o79.g1();
                y19 y19 = (y19) o79.w;
                pz8 pz8 = y19.B;
                y19.g(pz8);
                mz8 mz8 = pz8.J;
                long j2 = this.x;
                mz8.b("Activity resumed, time", Long.valueOf(j2));
                tp8 tp8 = y19.z;
                if (!tp8.n1((String) null, by8.S0)) {
                    if (!tp8.r1()) {
                        q09 q09 = y19.A;
                        y19.e(q09);
                        break;
                    }
                    ((o79) r38.z).b1();
                    ((h79) r38.y).c();
                    r38.w = j2;
                    r38.x = j2;
                } else if (tp8.r1() || o79.z) {
                    ((o79) r38.z).b1();
                    ((h79) r38.y).c();
                    r38.w = j2;
                    r38.x = j2;
                }
                k68 k68 = o79.C;
                o79 o792 = (o79) k68.y;
                o792.b1();
                f79 f79 = (f79) k68.x;
                if (f79 != null) {
                    o792.y.removeCallbacks(f79);
                }
                q09 q092 = ((y19) o792.w).A;
                y19.e(q092);
                q092.O.b(false);
                o792.b1();
                o792.z = false;
                uy5 uy5 = o79.A;
                o79 o793 = (o79) uy5.x;
                o793.b1();
                y19 y192 = (y19) o793.w;
                boolean a = y192.a();
                xb4 xb4 = y192.G;
                if (a) {
                    xb4.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (y192.z.n1((String) null, by8.e1)) {
                        j = SystemClock.elapsedRealtime();
                    } else {
                        j = 0;
                    }
                    uy5.l(currentTimeMillis, j);
                    return;
                }
                return;
            default:
                o79.b1();
                o79.g1();
                y19 y193 = (y19) o79.w;
                pz8 pz82 = y193.B;
                y19.g(pz82);
                mz8 mz82 = pz82.J;
                long j3 = this.x;
                mz82.b("Activity paused, time", Long.valueOf(j3));
                k68 k682 = o79.C;
                o79 o794 = (o79) k682.y;
                ((y19) o794.w).G.getClass();
                f79 f792 = new f79(k682, System.currentTimeMillis(), j3);
                k682.x = f792;
                o794.y.postDelayed(f792, 2000);
                if (y193.z.r1()) {
                    ((h79) o79.B.y).c();
                    return;
                }
                return;
        }
    }
}
