package defpackage;

import java.util.Set;

/* renamed from: a47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a47 implements Runnable {
    public final lp5 w;
    public final v27 x;
    public final boolean y;
    public final int z;

    public a47(lp5 lp5, v27 v27, boolean z2, int i) {
        lp5.getClass();
        v27.getClass();
        this.w = lp5;
        this.x = v27;
        this.y = z2;
        this.z = i;
    }

    public final void run() {
        boolean z2;
        re8 b;
        boolean z3 = this.y;
        lp5 lp5 = this.w;
        v27 v27 = this.x;
        if (z3) {
            int i = this.z;
            lp5.getClass();
            String str = v27.a.a;
            synchronized (lp5.k) {
                b = lp5.b(str);
            }
            z2 = lp5.d(str, b, i);
        } else {
            int i2 = this.z;
            lp5.getClass();
            String str2 = v27.a.a;
            synchronized (lp5.k) {
                try {
                    if (lp5.f.get(str2) != null) {
                        bc4.k().e(lp5.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) lp5.h.get(str2);
                        if (set != null) {
                            if (set.contains(v27)) {
                                re8 b2 = lp5.b(str2);
                                z2 = lp5.d(str2, b2, i2);
                            }
                        }
                    }
                    z2 = false;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        bc4.k().e(bc4.p("StopWorkRunnable"), "StopWorkRunnable for " + this.x.a.a + "; Processor.stopWork = " + z2);
    }
}
