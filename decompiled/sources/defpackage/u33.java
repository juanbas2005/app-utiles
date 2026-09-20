package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: u33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u33 implements oy6 {
    public boolean A;
    public final /* synthetic */ w33 B;
    public final long w;
    public boolean x;
    public final sc0 y = new Object();
    public final sc0 z = new Object();

    /* JADX WARNING: type inference failed for: r1v1, types: [sc0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [sc0, java.lang.Object] */
    public u33(w33 w33, long j, boolean z2) {
        this.B = w33;
        this.w = j;
        this.x = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b4 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0053 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e3 A[SYNTHETIC, Splitter:B:60:0x00e3] */
    public final long Y(long j, sc0 sc0) {
        boolean z2;
        boolean z3;
        Throwable th;
        long j2;
        long j3;
        long j4 = j;
        sc0.getClass();
        long j5 = 0;
        if (j4 >= 0) {
            while (true) {
                w33 w33 = this.B;
                synchronized (w33) {
                    w33.x.getClass();
                    t33 t33 = w33.E;
                    z2 = true;
                    if (!t33.y) {
                        if (!t33.w) {
                            z3 = false;
                            if (z3) {
                                w33.F.h();
                            }
                            if (w33.g() == null || this.x) {
                                th = null;
                            } else {
                                th = w33.I;
                                if (th == null) {
                                    k62 g = w33.g();
                                    g.getClass();
                                    th = new StreamResetException(g);
                                }
                            }
                            if (this.A) {
                                sc0 sc02 = this.z;
                                long j6 = sc02.x;
                                if (j6 > j5) {
                                    j3 = sc02.Y(Math.min(j4, j6), sc0);
                                    ko7.c(w33.y, j3, 0, 2);
                                    long b = w33.y.b();
                                    if (th == null) {
                                        j2 = j5;
                                        if (b >= ((long) (w33.x.M.a() / 2))) {
                                            w33.x.D(b, w33.w);
                                            ko7.c(w33.y, 0, b, 1);
                                        }
                                    } else {
                                        j2 = j5;
                                    }
                                    z2 = false;
                                } else {
                                    sc0 sc03 = sc0;
                                    j2 = j5;
                                    if (this.x || th != null) {
                                        z2 = false;
                                    } else {
                                        w33.wait();
                                    }
                                    j3 = -1;
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        }
                    }
                    z3 = true;
                    if (z3) {
                    }
                    try {
                        if (w33.g() == null || this.x) {
                        }
                        if (this.A) {
                        }
                    } finally {
                        if (z3) {
                            w33.F.l();
                        }
                    }
                }
                this.B.x.L.getClass();
                if (z2) {
                    j5 = j2;
                } else if (j3 != -1) {
                    return j3;
                } else {
                    if (th == null) {
                        return -1;
                    }
                    throw th;
                }
            }
        } else {
            h.j(f21.f(j4, "byteCount < 0: "));
            return 0;
        }
    }

    public final void close() {
        long j;
        w33 w33 = this.B;
        synchronized (w33) {
            this.A = true;
            sc0 sc0 = this.z;
            j = sc0.x;
            sc0.a();
            w33.notifyAll();
        }
        if (j > 0) {
            w33 w332 = this.B;
            TimeZone timeZone = fg8.a;
            w332.x.u(j);
        }
        this.B.a();
    }

    public final ri7 g() {
        return this.B.F;
    }
}
