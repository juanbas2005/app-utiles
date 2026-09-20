package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: r19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r19 extends y29 {
    public static final AtomicLong G = new AtomicLong(Long.MIN_VALUE);
    public final PriorityBlockingQueue A = new PriorityBlockingQueue();
    public final LinkedBlockingQueue B = new LinkedBlockingQueue();
    public final m19 C = new m19(this, "Thread death: Uncaught exception on worker thread");
    public final m19 D = new m19(this, "Thread death: Uncaught exception on network thread");
    public final Object E = new Object();
    public final Semaphore F = new Semaphore(2);
    public p19 y;
    public p19 z;

    public r19(y19 y19) {
        super(y19);
    }

    public final void b1() {
        if (Thread.currentThread() != this.y) {
            h.s("Call expected from worker thread");
        }
    }

    public final boolean d1() {
        return false;
    }

    public final void g1() {
        if (Thread.currentThread() != this.z) {
            h.s("Call expected from network thread");
        }
    }

    public final void h1() {
        if (Thread.currentThread() == this.y) {
            h.s("Call not expected from worker thread");
        }
    }

    public final boolean i1() {
        if (Thread.currentThread() == this.y) {
            return true;
        }
        return false;
    }

    public final o19 j1(Callable callable) {
        e1();
        o19 o19 = new o19(this, callable, false);
        if (Thread.currentThread() == this.y) {
            if (!this.A.isEmpty()) {
                pz8 pz8 = ((y19) this.w).B;
                y19.g(pz8);
                pz8.E.a("Callable skipped the worker queue.");
            }
            o19.run();
            return o19;
        }
        p1(o19);
        return o19;
    }

    public final o19 k1(Callable callable) {
        e1();
        o19 o19 = new o19(this, callable, true);
        if (Thread.currentThread() == this.y) {
            o19.run();
            return o19;
        }
        p1(o19);
        return o19;
    }

    public final void l1(Runnable runnable) {
        e1();
        z65.k(runnable);
        p1(new o19(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r2 = ((defpackage.y19) r2.w).B;
        defpackage.y19.g(r2);
        r2.E.a("Timed out waiting for ".concat(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = ((defpackage.y19) r2.w).B;
        defpackage.y19.g(r2);
        r2 = r2.E;
        r5 = new java.lang.StringBuilder(r6.length() + 24);
        r5.append("Interrupted waiting for ");
        r5.append(r6);
        r2.a(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r3 = r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r3 != null) goto L_0x002d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0030 */
    public final Object m1(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            r19 r19 = ((y19) this.w).C;
            y19.g(r19);
            r19.l1(runnable);
            atomicReference.wait(j);
        }
    }

    public final void n1(Runnable runnable) {
        e1();
        p1(new o19(this, runnable, true, "Task exception on worker thread"));
    }

    public final void o1(Runnable runnable) {
        e1();
        o19 o19 = new o19(this, runnable, false, "Task exception on network thread");
        synchronized (this.E) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.B;
                linkedBlockingQueue.add(o19);
                p19 p19 = this.z;
                if (p19 == null) {
                    p19 p192 = new p19(this, "Measurement Network", linkedBlockingQueue);
                    this.z = p192;
                    p192.setUncaughtExceptionHandler(this.D);
                    this.z.start();
                } else {
                    Object obj = p19.w;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p1(o19 o19) {
        synchronized (this.E) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.A;
                priorityBlockingQueue.add(o19);
                p19 p19 = this.y;
                if (p19 == null) {
                    p19 p192 = new p19(this, "Measurement Worker", priorityBlockingQueue);
                    this.y = p192;
                    p192.setUncaughtExceptionHandler(this.C);
                    this.y.start();
                } else {
                    Object obj = p19.w;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
