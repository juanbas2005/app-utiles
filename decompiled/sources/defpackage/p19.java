package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: p19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p19 extends Thread {
    public final Object w;
    public final BlockingQueue x;
    public boolean y = false;
    public final /* synthetic */ r19 z;

    public p19(r19 r19, String str, BlockingQueue blockingQueue) {
        this.z = r19;
        z65.k(blockingQueue);
        this.w = new Object();
        this.x = blockingQueue;
        setName(str);
    }

    public final void a() {
        r19 r19 = this.z;
        synchronized (r19.E) {
            try {
                if (!this.y) {
                    r19.F.release();
                    r19.E.notifyAll();
                    if (this == r19.y) {
                        r19.y = null;
                    } else if (this == r19.z) {
                        r19.z = null;
                    } else {
                        pz8 pz8 = ((y19) r19.w).B;
                        y19.g(pz8);
                        pz8.B.a("Current scheduler thread is neither worker nor network");
                    }
                    this.y = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void run() {
        int i;
        boolean z2 = false;
        while (!z2) {
            try {
                this.z.F.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                pz8 pz8 = ((y19) this.z.w).B;
                y19.g(pz8);
                pz8.E.b(String.valueOf(getName()).concat(" was interrupted"), e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.x;
                o19 o19 = (o19) blockingQueue.poll();
                if (o19 != null) {
                    if (true != o19.x) {
                        i = 10;
                    } else {
                        i = threadPriority;
                    }
                    Process.setThreadPriority(i);
                    o19.run();
                } else {
                    Object obj = this.w;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.z.getClass();
                            try {
                                obj.wait(30000);
                            } catch (InterruptedException e2) {
                                pz8 pz82 = ((y19) this.z.w).B;
                                y19.g(pz82);
                                pz82.E.b(String.valueOf(getName()).concat(" was interrupted"), e2);
                            }
                        }
                    }
                    synchronized (this.z.E) {
                        if (this.x.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
