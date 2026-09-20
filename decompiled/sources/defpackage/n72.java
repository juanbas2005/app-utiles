package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* renamed from: n72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class n72 extends i72 implements so1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C;
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    public static final /* synthetic */ AtomicIntegerFieldUpdater E;
    public static final /* synthetic */ long F;
    public static final /* synthetic */ long G;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Class<n72> cls = n72.class;
        Class<Object> cls2 = Object.class;
        C = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue$volatile");
        Unsafe unsafe = y79.a;
        G = unsafe.objectFieldOffset(cls.getDeclaredField("_queue$volatile"));
        D = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed$volatile");
        F = unsafe.objectFieldOffset(cls.getDeclaredField("_delayed$volatile"));
        E = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted$volatile");
    }

    public final boolean A0() {
        boolean z;
        as asVar = this.A;
        if (asVar != null) {
            z = asVar.isEmpty();
        } else {
            z = true;
        }
        if (z) {
            D.getClass();
            Unsafe unsafe = y79.a;
            m72 m72 = (m72) unsafe.getObjectVolatile(this, F);
            if (m72 != null && lh7.b.get(m72) != 0) {
                return false;
            }
            C.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, G);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ob4) {
                    long j = ob4.f.get((ob4) objectVolatile);
                    if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                } else if (objectVolatile == o72.b) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public void B0(long j, l72 l72) {
        ol1.H.E0(j, l72);
    }

    public final void C0() {
        l72 l72;
        long nanoTime = System.nanoTime();
        while (true) {
            D.getClass();
            m72 m72 = (m72) y79.a.getObjectVolatile(this, F);
            if (m72 != null) {
                synchronized (m72) {
                    if (lh7.b.get(m72) > 0) {
                        l72 = m72.b(0);
                    } else {
                        l72 = null;
                    }
                }
                if (l72 != null) {
                    B0(nanoTime, l72);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void D(e81 e81, Runnable runnable) {
        v0(runnable);
    }

    public final void D0() {
        C.getClass();
        Unsafe unsafe = y79.a;
        unsafe.putObjectVolatile(this, G, (Object) null);
        D.getClass();
        unsafe.putObjectVolatile(this, F, (Object) null);
    }

    public final void E0(long j, l72 l72) {
        Thread z0;
        int F0 = F0(j, l72);
        if (F0 != 0) {
            if (F0 == 1) {
                B0(j, l72);
            } else if (F0 != 2) {
                h.s("unexpected result");
            }
        } else if (G0(l72) && Thread.currentThread() != (z0 = z0())) {
            LockSupport.unpark(z0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: m72} */
    /* JADX WARNING: type inference failed for: r8v0, types: [m72, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final int F0(long j, l72 l72) {
        n72 n72;
        Unsafe unsafe;
        if (E.get(this) == 1) {
            return 1;
        }
        D.getClass();
        Unsafe unsafe2 = y79.a;
        long j2 = F;
        m72 m72 = (m72) unsafe2.getObjectVolatile(this, j2);
        if (m72 == null) {
            ? obj = new Object();
            obj.c = j;
            while (true) {
                unsafe = y79.a;
                n72 = this;
                if (!unsafe.compareAndSwapObject(n72, F, (Object) null, obj) && unsafe.getObjectVolatile(n72, j2) == null) {
                    this = n72;
                }
            }
            Object objectVolatile = unsafe.getObjectVolatile(n72, j2);
            objectVolatile.getClass();
            m72 = objectVolatile;
        } else {
            n72 = this;
        }
        return l72.c(j, m72, n72);
    }

    public final boolean G0(l72 l72) {
        D.getClass();
        m72 m72 = (m72) y79.a.getObjectVolatile(this, F);
        l72 l722 = null;
        if (m72 != null) {
            synchronized (m72) {
                l72[] l72Arr = m72.a;
                if (l72Arr != null) {
                    l722 = l72Arr[0];
                }
            }
        }
        if (l722 == l72) {
            return true;
        }
        return false;
    }

    public final void k(long j, kk0 kk0) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            j72 j72 = new j72(this, j2 + nanoTime, kk0);
            E0(nanoTime, j72);
            kk0.y(new fk0(2, j72));
        }
    }

    public final long r0() {
        if (s0()) {
            return 0;
        }
        w0();
        Runnable u0 = u0();
        if (u0 == null) {
            return y0();
        }
        u0.run();
        return 0;
    }

    public void shutdown() {
        ih7.a.set((Object) null);
        E.set(this, 1);
        t0();
        do {
        } while (r0() <= 0);
        C0();
    }

    public final void t0() {
        n72 n72;
        Unsafe unsafe;
        while (true) {
            C.getClass();
            Unsafe unsafe2 = y79.a;
            long j = G;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            py2 py2 = o72.b;
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = y79.a;
                    n72 n722 = this;
                    n72 = n722;
                    if (!unsafe3.compareAndSwapObject(n722, G, (Object) null, py2)) {
                        if (unsafe3.getObjectVolatile(n72, j) != null) {
                            break;
                        }
                        this = n72;
                    } else {
                        return;
                    }
                }
            } else {
                n72 = this;
                if (objectVolatile instanceof ob4) {
                    ((ob4) objectVolatile).c();
                    return;
                } else if (objectVolatile != py2) {
                    ob4 ob4 = new ob4(8, true);
                    ob4.a((Runnable) objectVolatile);
                    do {
                        unsafe = y79.a;
                        if (unsafe.compareAndSwapObject(n72, G, objectVolatile, ob4)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(n72, j) == objectVolatile);
                } else {
                    return;
                }
            }
            this = n72;
        }
    }

    public final Runnable u0() {
        n72 n72;
        Unsafe unsafe;
        while (true) {
            C.getClass();
            Unsafe unsafe2 = y79.a;
            long j = G;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof ob4) {
                ob4 ob4 = (ob4) objectVolatile;
                Object e = ob4.e();
                if (e != ob4.g) {
                    return (Runnable) e;
                }
                ob4 d = ob4.d();
                while (true) {
                    Unsafe unsafe3 = y79.a;
                    n72 = this;
                    if (!unsafe3.compareAndSwapObject(n72, G, objectVolatile, d) && unsafe3.getObjectVolatile(n72, j) == objectVolatile) {
                        this = n72;
                    }
                }
            } else {
                n72 = this;
                if (objectVolatile == o72.b) {
                    return null;
                }
                do {
                    unsafe = y79.a;
                    if (unsafe.compareAndSwapObject(n72, G, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(n72, j) == objectVolatile);
            }
            this = n72;
        }
    }

    public void v0(Runnable runnable) {
        w0();
        if (x0(runnable)) {
            Thread z0 = z0();
            if (Thread.currentThread() != z0) {
                LockSupport.unpark(z0);
                return;
            }
            return;
        }
        ol1.H.v0(runnable);
    }

    public final void w0() {
        l72 l72;
        l72 l722;
        boolean z;
        D.getClass();
        m72 m72 = (m72) y79.a.getObjectVolatile(this, F);
        if (m72 != null && lh7.b.get(m72) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (m72) {
                    try {
                        l72[] l72Arr = m72.a;
                        l72 = null;
                        if (l72Arr != null) {
                            l722 = l72Arr[0];
                        } else {
                            l722 = null;
                        }
                        if (l722 != null) {
                            if (nanoTime - l722.w >= 0) {
                                z = x0(l722);
                            } else {
                                z = false;
                            }
                            if (z) {
                                l72 = m72.b(0);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (l72 != null);
        }
    }

    public final boolean x0(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0:
        while (true) {
            C.getClass();
            Unsafe unsafe4 = y79.a;
            long j = G;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (E.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe3 = y79.a;
                    if (unsafe3.compareAndSwapObject(this, G, (Object) null, runnable)) {
                        break loop0;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof ob4) {
                ob4 ob4 = (ob4) objectVolatile;
                int a = ob4.a(runnable);
                if (a != 0) {
                    if (a == 1) {
                        ob4 d = ob4.d();
                        do {
                            unsafe2 = y79.a;
                            if (unsafe2.compareAndSwapObject(this, G, objectVolatile, d)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                    } else if (a == 2) {
                        return false;
                    }
                } else {
                    break;
                }
            } else if (objectVolatile == o72.b) {
                return false;
            } else {
                ob4 ob42 = new ob4(8, true);
                ob42.a((Runnable) objectVolatile);
                ob42.a(runnable);
                do {
                    unsafe = y79.a;
                    if (unsafe.compareAndSwapObject(this, G, objectVolatile, ob42)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        return true;
    }

    public final long y0() {
        long j;
        l72 l72;
        as asVar = this.A;
        if (asVar != null && !asVar.isEmpty()) {
            j = 0;
        } else {
            j = Long.MAX_VALUE;
        }
        if (j != 0) {
            C.getClass();
            Unsafe unsafe = y79.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, G);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ob4) {
                    long j2 = ob4.f.get((ob4) objectVolatile);
                    if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                        return 0;
                    }
                } else if (objectVolatile == o72.b) {
                    return Long.MAX_VALUE;
                }
            }
            D.getClass();
            m72 m72 = (m72) unsafe.getObjectVolatile(this, F);
            if (m72 != null) {
                synchronized (m72) {
                    l72[] l72Arr = m72.a;
                    if (l72Arr != null) {
                        l72 = l72Arr[0];
                    } else {
                        l72 = null;
                    }
                }
                if (l72 != null) {
                    long nanoTime = l72.w - System.nanoTime();
                    if (nanoTime < 0) {
                        return 0;
                    }
                    return nanoTime;
                }
            }
            return Long.MAX_VALUE;
        }
        return 0;
    }

    public abstract Thread z0();
}
