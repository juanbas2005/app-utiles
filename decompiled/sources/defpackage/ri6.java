package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: ri6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ri6 extends hz0 implements o05 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(ri6.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e;

    public ri6(long j, ri6 ri6, int i) {
        super(ri6);
        this.e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final boolean f() {
        if (f.get(this) != k() || c() == null) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        if (f.addAndGet(this, -65536) != k() || c() == null) {
            return false;
        }
        return true;
    }

    public abstract int k();

    public abstract void l(int i, e81 e81);

    public final void m() {
        if (f.incrementAndGet(this) == k()) {
            h();
        }
    }

    public final boolean n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == k() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
