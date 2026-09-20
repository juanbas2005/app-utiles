package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: wd8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wd8 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public static final /* synthetic */ long f;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Class<wd8> cls = wd8.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask$volatile");
        f = y79.a.objectFieldOffset(cls.getDeclaredField("lastScheduledTask$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer$volatile");
    }

    public final wb7 a(wb7 wb7, boolean z) {
        if (z) {
            return b(wb7);
        }
        b.getClass();
        wb7 wb72 = (wb7) y79.a.getAndSetObject(this, f, wb7);
        if (wb72 == null) {
            return null;
        }
        return b(wb72);
    }

    public final wb7 b(wb7 wb7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return wb7;
        }
        if (wb7.x) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, wb7);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = y79.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        if (objectVolatile != null) {
            return (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1;
        }
        return atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(bw2 bw2) {
        b.getClass();
        wb7 wb7 = (wb7) y79.a.getAndSetObject(this, f, (Object) null);
        if (wb7 != null) {
            bw2.a(wb7);
        }
        while (true) {
            wb7 f2 = f();
            if (f2 != null) {
                bw2.a(f2);
            } else {
                return;
            }
        }
    }

    public final wb7 e() {
        b.getClass();
        wb7 wb7 = (wb7) y79.a.getAndSetObject(this, f, (Object) null);
        if (wb7 == null) {
            return f();
        }
        return wb7;
    }

    public final wb7 f() {
        wb7 wb7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (wb7 = (wb7) this.a.getAndSet(i2, (Object) null)) != null) {
                if (wb7.x) {
                    e.decrementAndGet(this);
                }
                return wb7;
            }
        }
    }

    public final wb7 g() {
        wd8 wd8;
        while (true) {
            b.getClass();
            Unsafe unsafe = y79.a;
            long j = f;
            wb7 wb7 = (wb7) unsafe.getObjectVolatile(this, j);
            if (wb7 != null && wb7.x) {
                while (true) {
                    Unsafe unsafe2 = y79.a;
                    wd8 = this;
                    if (unsafe2.compareAndSwapObject(wd8, f, wb7, (Object) null)) {
                        return wb7;
                    }
                    if (unsafe2.getObjectVolatile(wd8, j) != wb7) {
                        break;
                    }
                    this = wd8;
                }
            }
            this = wd8;
        }
        wd8 wd82 = this;
        int i = d.get(wd82);
        int i2 = c.get(wd82);
        while (i != i2 && e.get(wd82) != 0) {
            i2--;
            wb7 h = wd82.h(i2, true);
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    public final wb7 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        wb7 wb7 = (wb7) atomicReferenceArray.get(i2);
        if (wb7 == null || wb7.x != z) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i2, wb7, (Object) null)) {
            if (atomicReferenceArray.get(i2) != wb7) {
                return null;
            }
        }
        if (z) {
            e.decrementAndGet(this);
        }
        return wb7;
    }

    public final long i(int i, h06 h06) {
        int i2;
        wd8 wd8;
        while (true) {
            b.getClass();
            Unsafe unsafe = y79.a;
            long j = f;
            wb7 wb7 = (wb7) unsafe.getObjectVolatile(this, j);
            if (wb7 == null) {
                return -2;
            }
            if (wb7.x) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if ((i2 & i) == 0) {
                return -2;
            }
            cc7.f.getClass();
            long nanoTime = System.nanoTime() - wb7.w;
            long j2 = cc7.b;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            while (true) {
                Unsafe unsafe2 = y79.a;
                wd8 = this;
                if (unsafe2.compareAndSwapObject(wd8, f, wb7, (Object) null)) {
                    h06.w = wb7;
                    return -1;
                } else if (unsafe2.getObjectVolatile(wd8, j) != wb7) {
                    break;
                } else {
                    this = wd8;
                }
            }
            this = wd8;
        }
    }
}
