package defpackage;

import java.util.concurrent.locks.LockSupport;

/* renamed from: y90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y90 extends b1 {
    public final Thread B;
    public final i72 C;

    public y90(e81 e81, Thread thread, i72 i72) {
        super(e81, true);
        this.B = thread;
        this.C = i72;
    }

    public final void d(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.B;
        if (!sg3.e(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
