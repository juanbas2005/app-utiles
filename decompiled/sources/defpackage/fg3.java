package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: fg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fg3 extends AtomicReference implements Runnable {
    public static final z22 w = new z22(1);
    public static final z22 x = new z22(1);

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        z22 z22 = x;
        z22 z222 = w;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            eg3 eg3 = new eg3(this);
            eg3.a(eg3, Thread.currentThread());
            if (compareAndSet(runnable, eg3)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(z222)) == z22) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        eg3 eg3 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof eg3;
            z22 z22 = x;
            if (!z2 && runnable != z22) {
                break;
            }
            if (z2) {
                eg3 = (eg3) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == z22 || compareAndSet(runnable, z22)) {
                if (Thread.interrupted() || z) {
                    z = true;
                } else {
                    z = false;
                }
                LockSupport.park(eg3);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean d = d();
            z22 z22 = w;
            if (!d) {
                try {
                    obj = e();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, z22)) {
                        g(currentThread);
                    }
                    if (!d) {
                        a(th);
                        return;
                    }
                    return;
                }
            }
            if (!compareAndSet(currentThread, z22)) {
                g(currentThread);
            }
            if (!d) {
                b(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == w) {
            str = "running=[DONE]";
        } else if (runnable instanceof eg3) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String f = f();
        StringBuilder sb2 = new StringBuilder(String.valueOf(f).length() + str.length() + 2);
        sb2.append(str);
        sb2.append(", ");
        sb2.append(f);
        return sb2.toString();
    }
}
