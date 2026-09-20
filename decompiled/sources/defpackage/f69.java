package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: f69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f69 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ iy8 x;
    public final /* synthetic */ m69 y;

    public /* synthetic */ f69(m69 m69, iy8 iy8, int i) {
        this.w = i;
        this.x = iy8;
        this.y = m69;
    }

    public final void run() {
        switch (this.w) {
            case b85.b:
                m69 m69 = this.y;
                synchronized (m69) {
                    try {
                        m69.w = false;
                        r69 r69 = m69.y;
                        if (!r69.t1()) {
                            pz8 pz8 = ((y19) r69.w).B;
                            y19.g(pz8);
                            pz8.J.a("Connected to service");
                            iy8 iy8 = this.x;
                            r69.b1();
                            r69.z = iy8;
                            r69.p1();
                            r69.r1();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                m69 m692 = this.y;
                synchronized (m692) {
                    try {
                        m692.w = false;
                        r69 r692 = m692.y;
                        if (!r692.t1()) {
                            pz8 pz82 = ((y19) r692.w).B;
                            y19.g(pz82);
                            pz82.I.a("Connected to remote service");
                            iy8 iy82 = this.x;
                            r692.b1();
                            r692.z = iy82;
                            r692.p1();
                            r692.r1();
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                r69 r693 = this.y.y;
                ScheduledExecutorService scheduledExecutorService = r693.C;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    r693.C = null;
                    return;
                }
                return;
        }
    }
}
