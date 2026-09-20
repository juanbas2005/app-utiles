package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: w2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w2 extends rd3 {
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;
    public final AtomicReferenceFieldUpdater u;
    public final AtomicReferenceFieldUpdater v;
    public final AtomicReferenceFieldUpdater w;

    public w2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.s = atomicReferenceFieldUpdater;
        this.t = atomicReferenceFieldUpdater2;
        this.u = atomicReferenceFieldUpdater3;
        this.v = atomicReferenceFieldUpdater4;
        this.w = atomicReferenceFieldUpdater5;
    }

    public final void G(y2 y2Var, y2 y2Var2) {
        this.t.lazySet(y2Var, y2Var2);
    }

    public final void H(y2 y2Var, Thread thread) {
        this.s.lazySet(y2Var, thread);
    }

    public final boolean e(z2 z2Var, v2 v2Var, v2 v2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.v;
            if (atomicReferenceFieldUpdater.compareAndSet(z2Var, v2Var, v2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z2Var) == v2Var);
        return false;
    }

    public final boolean f(z2 z2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.w;
            if (atomicReferenceFieldUpdater.compareAndSet(z2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z2Var) == obj);
        return false;
    }

    public final boolean g(z2 z2Var, y2 y2Var, y2 y2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.u;
            if (atomicReferenceFieldUpdater.compareAndSet(z2Var, y2Var, y2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z2Var) == y2Var);
        return false;
    }
}
