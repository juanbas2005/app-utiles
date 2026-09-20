package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e82 extends AtomicReference implements Executor, Runnable {
    public static final /* synthetic */ int A = 0;
    public jz0 w;
    public Executor x;
    public Runnable y;
    public Thread z;

    public final void execute(Runnable runnable) {
        if (get() == d82.x) {
            this.x = null;
            this.w = null;
            return;
        }
        this.z = Thread.currentThread();
        try {
            jz0 jz0 = this.w;
            Objects.requireNonNull(jz0);
            wr0 wr0 = (wr0) jz0.y;
            if (((Thread) wr0.x) == this.z) {
                this.w = null;
                if (((Runnable) wr0.y) == null) {
                    wr0.y = runnable;
                    Executor executor = this.x;
                    Objects.requireNonNull(executor);
                    wr0.z = executor;
                    this.x = null;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                Executor executor2 = this.x;
                Objects.requireNonNull(executor2);
                this.x = null;
                this.y = runnable;
                executor2.execute(this);
            }
        } finally {
            this.z = null;
        }
    }

    public final void run() {
        Executor executor;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.z) {
            Runnable runnable = this.y;
            Objects.requireNonNull(runnable);
            this.y = null;
            runnable.run();
            return;
        }
        wr0 wr0 = new wr0(21, false);
        wr0.x = currentThread;
        jz0 jz0 = this.w;
        Objects.requireNonNull(jz0);
        jz0.y = wr0;
        this.w = null;
        try {
            Runnable runnable2 = this.y;
            Objects.requireNonNull(runnable2);
            this.y = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) wr0.y;
                if (runnable3 != null && (executor = (Executor) wr0.z) != null) {
                    wr0.y = null;
                    wr0.z = null;
                    executor.execute(runnable3);
                }
            }
        } finally {
            wr0.x = null;
        }
    }
}
