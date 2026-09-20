package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: ol6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ol6 implements Executor {
    public final Object A;
    public final /* synthetic */ int w;
    public final Executor x;
    public final ArrayDeque y;
    public Runnable z;

    public ol6(Executor executor, int i) {
        this.w = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.x = executor;
                this.y = new ArrayDeque();
                this.A = new Object();
                return;
            default:
                this.x = executor;
                this.y = new ArrayDeque();
                this.A = new Object();
                return;
        }
    }

    public final void a() {
        switch (this.w) {
            case b85.b:
                Runnable runnable = (Runnable) this.y.poll();
                this.z = runnable;
                if (runnable != null) {
                    this.x.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.A) {
                    Object poll = this.y.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.z = runnable2;
                    if (poll != null) {
                        this.x.execute(runnable2);
                    }
                }
                return;
            default:
                synchronized (this.A) {
                    try {
                        Runnable runnable3 = (Runnable) this.y.poll();
                        this.z = runnable3;
                        if (runnable3 != null) {
                            ((gv1) this.x).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void execute(Runnable runnable) {
        switch (this.w) {
            case b85.b:
                synchronized (this.A) {
                    try {
                        this.y.add(new nt2(13, (Object) this, (Object) runnable));
                        if (this.z == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.A) {
                    this.y.offer(new e66(2, runnable, this));
                    if (this.z == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.A) {
                    try {
                        this.y.add(new ga(3, (Object) this, (Object) runnable));
                        if (this.z == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public ol6(gv1 gv1) {
        this.w = 2;
        this.A = new Object();
        this.y = new ArrayDeque();
        this.x = gv1;
    }
}
