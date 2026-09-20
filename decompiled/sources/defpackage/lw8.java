package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: lw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lw8 extends o85 {
    public static final AtomicReferenceFieldUpdater d;
    public static final AtomicReferenceFieldUpdater e;
    public static final AtomicReferenceFieldUpdater f;
    public static final AtomicReferenceFieldUpdater g;
    public static final AtomicReferenceFieldUpdater h;

    static {
        Class<rw8> cls = rw8.class;
        d = AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "a");
        e = AtomicReferenceFieldUpdater.newUpdater(cls, cls, "b");
        Class<sw8> cls2 = sw8.class;
        f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "y");
        g = AtomicReferenceFieldUpdater.newUpdater(cls2, kw8.class, "x");
        h = AtomicReferenceFieldUpdater.newUpdater(cls2, Object.class, "w");
    }

    public final void A(rw8 rw8, rw8 rw82) {
        e.lazySet(rw8, rw82);
    }

    public final boolean B(sw8 sw8, rw8 rw8, rw8 rw82) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(sw8, rw8, rw82)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(sw8) == rw8);
        return false;
    }

    public final rw8 C(y99 y99) {
        return (rw8) f.getAndSet(y99, rw8.c);
    }

    public final kw8 D(y99 y99) {
        return (kw8) g.getAndSet(y99, kw8.b);
    }

    public final boolean E(sw8 sw8, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(sw8, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(sw8) == obj);
        return false;
    }

    public final void z(rw8 rw8, Thread thread) {
        d.lazySet(rw8, thread);
    }
}
