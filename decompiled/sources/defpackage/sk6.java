package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: sk6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class sk6 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A;
    public static final /* synthetic */ AtomicLongFieldUpdater B;
    public static final /* synthetic */ AtomicIntegerFieldUpdater C;
    public static final /* synthetic */ long D;
    public static final /* synthetic */ long E;
    public static final /* synthetic */ AtomicReferenceFieldUpdater y;
    public static final /* synthetic */ AtomicLongFieldUpdater z;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public final int w;
    public final xa7 x;

    static {
        Class<sk6> cls = sk6.class;
        Class<Object> cls2 = Object.class;
        y = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head$volatile");
        Unsafe unsafe = y79.a;
        D = unsafe.objectFieldOffset(cls.getDeclaredField("head$volatile"));
        z = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx$volatile");
        A = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail$volatile");
        E = unsafe.objectFieldOffset(cls.getDeclaredField("tail$volatile"));
        B = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx$volatile");
        C = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits$volatile");
    }

    public sk6(int i) {
        this.w = i;
        if (i <= 0) {
            h.j(hl6.k(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        } else if (i >= 0) {
            vk6 vk6 = new vk6(0, (vk6) null, 2);
            this.head$volatile = vk6;
            this.tail$volatile = vk6;
            this._availablePermits$volatile = i;
            this.x = new xa7(17, (Object) this);
        } else {
            h.j(hl6.k(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
    }

    public final Object b(h61 h61) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = C;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.w;
        } while (andDecrement > i);
        vs7 vs7 = vs7.a;
        if (andDecrement <= 0) {
            kk0 y2 = hj8.y(rc9.a0(h61));
            try {
                if (!c(y2)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                y2.J(vs7, this.x);
                                break;
                            } else if (c(y2)) {
                                break;
                            }
                        }
                    }
                }
                Object t = y2.t();
                p81 p81 = p81.w;
                if (t != p81) {
                    t = vs7;
                }
                if (t == p81) {
                    return t;
                }
            } catch (Throwable th) {
                y2.C();
                throw th;
            }
        }
        return vs7;
    }

    public final boolean c(g88 g88) {
        Object a;
        Unsafe unsafe;
        sk6 sk6 = this;
        g88 g882 = g88;
        A.getClass();
        Unsafe unsafe2 = y79.a;
        long j = E;
        vk6 vk6 = (vk6) unsafe2.getObjectVolatile(sk6, j);
        long andIncrement = B.getAndIncrement(sk6);
        qk6 qk6 = qk6.D;
        long j2 = andIncrement / ((long) uk6.f);
        loop0:
        while (true) {
            a = gz0.a(vk6, j2, qk6);
            if (i35.k(a)) {
                break;
            }
            ri6 i = i35.i(a);
            while (true) {
                ri6 ri6 = (ri6) y79.a.getObjectVolatile(sk6, j);
                if (ri6.e >= i.e) {
                    sk6 = this;
                    break loop0;
                } else if (!i.n()) {
                    break;
                } else {
                    do {
                        unsafe = y79.a;
                        sk6 = this;
                        if (unsafe.compareAndSwapObject(sk6, E, ri6, i)) {
                            if (ri6.j()) {
                                ri6.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(sk6, j) == ri6);
                    if (i.j()) {
                        i.h();
                    }
                }
            }
            sk6 = this;
        }
        vk6 vk62 = (vk6) i35.i(a);
        AtomicReferenceArray atomicReferenceArray = vk62.g;
        int i2 = (int) (andIncrement % ((long) uk6.f));
        while (!atomicReferenceArray.compareAndSet(i2, (Object) null, g882)) {
            if (atomicReferenceArray.get(i2) != null) {
                py2 py2 = uk6.b;
                py2 py22 = uk6.c;
                while (!atomicReferenceArray.compareAndSet(i2, py2, py22)) {
                    if (atomicReferenceArray.get(i2) != py2) {
                        return false;
                    }
                }
                ((ik0) g882).J(vs7.a, sk6.x);
                return true;
            }
        }
        g882.b(vk62, i2);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    public final void d() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.w;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2 || atomicIntegerFieldUpdater.compareAndSet(this, i, i2)) {
                        ku4.c(i2, "The number of released permits cannot be greater than ");
                    }
                    i = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                ku4.c(i2, "The number of released permits cannot be greater than ");
                return;
            } else if (andIncrement >= 0 || e()) {
            }
        } while (e());
    }

    public final boolean e() {
        Object a;
        Unsafe unsafe;
        y.getClass();
        Unsafe unsafe2 = y79.a;
        long j = D;
        vk6 vk6 = (vk6) unsafe2.getObjectVolatile(this, j);
        long andIncrement = z.getAndIncrement(this);
        long j2 = andIncrement / ((long) uk6.f);
        rk6 rk6 = rk6.D;
        loop0:
        while (true) {
            a = gz0.a(vk6, j2, rk6);
            if (i35.k(a)) {
                break;
            }
            ri6 i = i35.i(a);
            while (true) {
                ri6 ri6 = (ri6) y79.a.getObjectVolatile(this, j);
                if (ri6.e >= i.e) {
                    break loop0;
                } else if (i.n()) {
                    do {
                        unsafe = y79.a;
                        if (unsafe.compareAndSwapObject(this, D, ri6, i)) {
                            if (ri6.j()) {
                                ri6.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j) == ri6);
                    if (i.j()) {
                        i.h();
                    }
                }
            }
        }
        vk6 vk62 = (vk6) i35.i(a);
        AtomicReferenceArray atomicReferenceArray = vk62.g;
        vk62.a();
        boolean z2 = false;
        if (vk62.e <= j2) {
            int i2 = (int) (andIncrement % ((long) uk6.f));
            Object andSet = atomicReferenceArray.getAndSet(i2, uk6.b);
            if (andSet == null) {
                int i3 = uk6.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (atomicReferenceArray.get(i2) == uk6.c) {
                        return true;
                    }
                }
                py2 py2 = uk6.b;
                py2 py22 = uk6.d;
                while (true) {
                    if (!atomicReferenceArray.compareAndSet(i2, py2, py22)) {
                        if (atomicReferenceArray.get(i2) != py2) {
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                return !z2;
            } else if (andSet != uk6.e) {
                if (andSet instanceof ik0) {
                    ik0 ik0 = (ik0) andSet;
                    py2 n = ik0.n(vs7.a, this.x);
                    if (n != null) {
                        ik0.N(n);
                        return true;
                    }
                } else {
                    ta1.l("unexpected: ", andSet);
                    return false;
                }
            }
        }
        return false;
    }
}
