package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: m1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m1 extends x91 {
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;
    public final AtomicReferenceFieldUpdater u;
    public final AtomicReferenceFieldUpdater v;
    public final AtomicReferenceFieldUpdater w;

    public m1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.s = atomicReferenceFieldUpdater;
        this.t = atomicReferenceFieldUpdater2;
        this.u = atomicReferenceFieldUpdater3;
        this.v = atomicReferenceFieldUpdater4;
        this.w = atomicReferenceFieldUpdater5;
    }

    public final void P(w1 w1Var, w1 w1Var2) {
        this.t.lazySet(w1Var, w1Var2);
    }

    public final void Q(w1 w1Var, Thread thread) {
        this.s.lazySet(w1Var, thread);
    }

    public final boolean m(x1 x1Var, l1 l1Var, l1 l1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.v;
            if (atomicReferenceFieldUpdater.compareAndSet(x1Var, l1Var, l1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x1Var) == l1Var);
        return false;
    }

    public final boolean n(x1 x1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.w;
            if (atomicReferenceFieldUpdater.compareAndSet(x1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x1Var) == obj);
        return false;
    }

    public final boolean o(x1 x1Var, w1 w1Var, w1 w1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.u;
            if (atomicReferenceFieldUpdater.compareAndSet(x1Var, w1Var, w1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x1Var) == w1Var);
        return false;
    }

    public final l1 y(x1 x1Var) {
        return (l1) this.v.getAndSet(x1Var, l1.d);
    }

    public final w1 z(x1 x1Var) {
        return (w1) this.u.getAndSet(x1Var, w1.c);
    }
}
