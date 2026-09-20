package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: hh3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hh3 extends gl3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(hh3.class, "_invoked$volatile");
    public final vr2 D;
    private volatile /* synthetic */ int _invoked$volatile;

    public hh3(vr2 vr2) {
        this.D = vr2;
    }

    public final boolean r() {
        return true;
    }

    public final void s(Throwable th) {
        if (E.compareAndSet(this, 0, 1)) {
            this.D.y(th);
        }
    }
}
