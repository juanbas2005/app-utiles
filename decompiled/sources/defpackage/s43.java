package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: s43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class s43 implements q43 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y;
    public static final /* synthetic */ AtomicIntegerFieldUpdater z;
    public volatile /* synthetic */ int clientRefCount$internal = 0;
    private volatile /* synthetic */ int closed = 0;
    public final z97 w = new z97(new r43(this, 0));
    public final z97 x = new z97(new r43(this, 1));

    static {
        Class<s43> cls = s43.class;
        y = AtomicIntegerFieldUpdater.newUpdater(cls, "closed");
        z = AtomicIntegerFieldUpdater.newUpdater(cls, "clientRefCount$internal");
    }

    public void close() {
        fl3 fl3;
        if (y.compareAndSet(this, 0, 1)) {
            c81 a0 = k().a0(me6.E);
            if (a0 instanceof fl3) {
                fl3 = (fl3) a0;
            } else {
                fl3 = null;
            }
            if (fl3 != null) {
                fl3.v0();
            }
        }
    }

    public e81 k() {
        return (e81) this.x.getValue();
    }
}
