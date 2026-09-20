package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ha  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ha extends t49 {
    public final AtomicReferenceFieldUpdater f;
    public final AtomicIntegerFieldUpdater g;

    public ha(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f = atomicReferenceFieldUpdater;
        this.g = atomicIntegerFieldUpdater;
    }

    public final int F(lu0 lu0) {
        return this.g.decrementAndGet(lu0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    public final void y(lu0 lu0, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(lu0, (Object) null, set) || atomicReferenceFieldUpdater.get(lu0) != null) {
            }
        } while (atomicReferenceFieldUpdater.get(lu0) != null);
    }
}
