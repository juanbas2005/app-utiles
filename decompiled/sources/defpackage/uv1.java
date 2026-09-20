package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: uv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uv1 extends sg6 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(uv1.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public final void d(Object obj) {
        g(obj);
    }

    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = C;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    tv1.a(rc9.a0(this.B), hj8.E(obj));
                    return;
                } else {
                    h.s("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
