package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* renamed from: t33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t33 implements tu6 {
    public final boolean w;
    public final sc0 x = new Object();
    public boolean y;
    public final /* synthetic */ w33 z;

    /* JADX WARNING: type inference failed for: r1v1, types: [sc0, java.lang.Object] */
    public t33(w33 w33, boolean z2) {
        this.z = w33;
        this.w = z2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0022 */
    public final void a(boolean z2) {
        long min;
        boolean z3;
        boolean z4;
        w33 w33 = this.z;
        synchronized (w33) {
            try {
                w33.G.h();
                while (w33.z >= w33.A && !this.w && !this.y && w33.g() == null) {
                    w33.wait();
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
                w33.G.l();
                w33.b();
                min = Math.min(w33.A - w33.z, this.x.x);
                w33.z += min;
                if (!z2 || min != this.x.x) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z4 = z3;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.z.G.h();
        try {
            w33 w332 = this.z;
            w332.x.v(w332.w, z4, this.x, min);
            this.z.G.l();
        } catch (Throwable th2) {
            Throwable th3 = th2;
            this.z.G.l();
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        r1 = r13.z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        if (r1.E.w != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (r13.x.x <= 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r13.x.x <= 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r0 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r1.x.v(r1.w, true, (defpackage.sc0) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r1 = r13.z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r13.y = true;
        r1.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r13.z.x.flush();
        r13.z.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        throw r0;
     */
    public final void close() {
        boolean z2;
        w33 w33 = this.z;
        TimeZone timeZone = fg8.a;
        synchronized (w33) {
            try {
                if (!this.y) {
                    if (w33.g() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            } finally {
                Throwable th = th;
            }
        }
    }

    public final void flush() {
        w33 w33 = this.z;
        TimeZone timeZone = fg8.a;
        synchronized (w33) {
            w33.b();
        }
        while (this.x.x > 0) {
            a(false);
            this.z.x.flush();
        }
    }

    public final ri7 g() {
        return this.z.G;
    }

    public final void g0(long j, sc0 sc0) {
        TimeZone timeZone = fg8.a;
        sc0 sc02 = this.x;
        sc02.g0(j, sc0);
        while (sc02.x >= 16384) {
            a(false);
        }
    }
}
