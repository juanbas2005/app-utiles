package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: eg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class eg3 extends AbstractOwnableSynchronizer implements Runnable {
    public final fg3 w;

    public eg3(fg3 fg3) {
        this.w = fg3;
    }

    public static void a(eg3 eg3, Thread thread) {
        eg3.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.w.toString();
    }

    public final void run() {
    }
}
