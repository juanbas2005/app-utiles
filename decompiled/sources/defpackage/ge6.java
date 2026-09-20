package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: ge6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ge6 implements nz3, Serializable {
    public static final AtomicReferenceFieldUpdater y;
    public static final /* synthetic */ long z;
    public volatile sr2 w;
    public volatile Object x;

    static {
        Class<ge6> cls = ge6.class;
        y = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "x");
        z = y79.a.objectFieldOffset(cls.getDeclaredField("x"));
    }

    public final boolean a() {
        if (this.x != xb4.c0) {
            return true;
        }
        return false;
    }

    public final Object getValue() {
        ge6 ge6;
        Object obj = this.x;
        xb4 xb4 = xb4.c0;
        if (obj != xb4) {
            return obj;
        }
        sr2 sr2 = this.w;
        if (sr2 != null) {
            Object b = sr2.b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = y79.a;
                long j = z;
                ge6 = this;
                if (unsafe.compareAndSwapObject(ge6, j, xb4, b)) {
                    ge6.w = null;
                    return b;
                } else if (unsafe.getObjectVolatile(ge6, j) != xb4) {
                    break;
                } else {
                    this = ge6;
                }
            }
        } else {
            ge6 = this;
        }
        return ge6.x;
    }

    public final String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
