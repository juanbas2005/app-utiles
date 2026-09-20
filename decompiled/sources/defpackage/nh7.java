package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: nh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nh7 extends gl3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(nh7.class, "_state$volatile");
    public final Thread D = Thread.currentThread();
    public mw1 E;
    private volatile /* synthetic */ int _state$volatile;

    public static void u(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final boolean r() {
        return true;
    }

    public final void s(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = F;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    u(i);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.D.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void t() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = F;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        u(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                mw1 mw1 = this.E;
                if (mw1 != null) {
                    mw1.b();
                    return;
                }
                return;
            }
        }
    }
}
