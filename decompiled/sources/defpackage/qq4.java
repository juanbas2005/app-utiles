package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: qq4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qq4 extends sk6 implements oq4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater F;
    public static final /* synthetic */ long G;
    private volatile /* synthetic */ Object owner$volatile = rq4.a;

    static {
        Class<qq4> cls = qq4.class;
        F = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "owner$volatile");
        G = y79.a.objectFieldOffset(cls.getDeclaredField("owner$volatile"));
    }

    public qq4() {
        super(1);
    }

    public final Object a(f61 f61) {
        boolean g = g();
        vs7 vs7 = vs7.a;
        if (!g) {
            kk0 y = hj8.y(rc9.a0(f61));
            try {
                pq4 pq4 = new pq4(this, y);
                while (true) {
                    int andDecrement = sk6.C.getAndDecrement(this);
                    if (andDecrement <= this.w) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
                            qq4 qq4 = pq4.x;
                            atomicReferenceFieldUpdater.set(qq4, (Object) null);
                            pq4.w.E(new h43(17, qq4, pq4), vs7);
                            break;
                        } else if (c(pq4)) {
                            break;
                        }
                    }
                }
                Object t = y.t();
                p81 p81 = p81.w;
                if (t != p81) {
                    t = vs7;
                }
                if (t == p81) {
                    return t;
                }
            } catch (Throwable th) {
                y.C();
                throw th;
            }
        }
        return vs7;
    }

    public final boolean f() {
        if (Math.max(sk6.C.get(this), 0) == 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        int h = h();
        if (h == 0) {
            return true;
        }
        if (h == 1) {
            return false;
        }
        if (h != 2) {
            h.s("unexpected");
            return false;
        }
        ku4.g("This mutex is already locked by the specified owner: null");
        return false;
    }

    public final int h() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = sk6.C;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.w;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else if (i2 <= 0) {
                return 1;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    F.getClass();
                    y79.a.putObjectVolatile(this, G, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final void k(Object obj) {
        while (this.f()) {
            F.getClass();
            Unsafe unsafe = y79.a;
            long j = G;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            py2 py2 = rq4.a;
            if (objectVolatile != py2) {
                if (objectVolatile == obj || obj == null) {
                    while (true) {
                        Unsafe unsafe2 = y79.a;
                        qq4 qq4 = this;
                        if (unsafe2.compareAndSwapObject(qq4, G, objectVolatile, py2)) {
                            qq4.d();
                            return;
                        } else if (unsafe2.getObjectVolatile(qq4, j) != objectVolatile) {
                            this = qq4;
                            break;
                        } else {
                            this = qq4;
                        }
                    }
                } else {
                    rf2.t("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
            }
        }
        h.s("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(rj1.t(this));
        sb.append("[isLocked=");
        sb.append(f());
        sb.append(",owner=");
        F.getClass();
        sb.append(y79.a.getObjectVolatile(this, G));
        sb.append(']');
        return sb.toString();
    }
}
