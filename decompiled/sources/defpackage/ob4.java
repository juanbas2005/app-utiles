package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: ob4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ob4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final py2 g = new py2("REMOVE_FROZEN", 4);
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Class<ob4> cls = ob4.class;
        e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next$volatile");
        h = y79.a.objectFieldOffset(cls.getDeclaredField("_next$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(cls, "_state$volatile");
    }

    public ob4(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            h.s("Check failed.");
            throw null;
        } else if ((i & i2) != 0) {
            h.s("Check failed.");
            throw null;
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) == 0) {
                int i = (int) (1073741823 & j);
                int i2 = (int) ((1152921503533105152L & j) >> 30);
                int i3 = this.c;
                if (((i2 + 2) & i3) == (i & i3)) {
                    return 1;
                }
                boolean z = this.b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (z || atomicReferenceArray.get(i2 & i3) == null) {
                    ob4 ob4 = this;
                    if (f.compareAndSet(ob4, j, (-1152921503533105153L & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                        atomicReferenceArray.set(i2 & i3, obj);
                        ob4 ob42 = ob4;
                        while ((atomicLongFieldUpdater.get(ob42) & 1152921504606846976L) != 0) {
                            ob42 = ob42.d();
                            AtomicReferenceArray atomicReferenceArray2 = ob42.d;
                            int i4 = ob42.c & i2;
                            Object obj2 = atomicReferenceArray2.get(i4);
                            if (!(obj2 instanceof nb4) || ((nb4) obj2).a != i2) {
                                ob42 = null;
                                continue;
                            } else {
                                atomicReferenceArray2.set(i4, obj);
                                continue;
                            }
                            if (ob42 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    this = ob4;
                } else {
                    int i5 = this.a;
                    if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                        return 1;
                    }
                }
            } else if ((2305843009213693952L & j) != 0) {
                return 2;
            } else {
                return 1;
            }
        }
    }

    public final ob4 b(long j) {
        ob4 ob4;
        while (true) {
            e.getClass();
            Unsafe unsafe = y79.a;
            long j2 = h;
            ob4 ob42 = (ob4) unsafe.getObjectVolatile(this, j2);
            if (ob42 != null) {
                return ob42;
            }
            ob4 ob43 = new ob4(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new nb4(i);
                }
                ob43.d.set(ob43.c & i, obj);
                i++;
            }
            f.set(ob43, -1152921504606846977L & j);
            while (true) {
                Unsafe unsafe2 = y79.a;
                ob4 = this;
                if (!unsafe2.compareAndSwapObject(ob4, h, (Object) null, ob43) && unsafe2.getObjectVolatile(ob4, j2) == null) {
                    this = ob4;
                }
            }
            this = ob4;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            ob4 ob4 = this;
            if (atomicLongFieldUpdater.compareAndSet(ob4, j, 2305843009213693952L | j)) {
                return true;
            }
            this = ob4;
        }
    }

    public final ob4 d() {
        long j;
        ob4 ob4;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                ob4 = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            ob4 = this;
            if (atomicLongFieldUpdater.compareAndSet(ob4, j, j2)) {
                j = j2;
                break;
            }
            this = ob4;
        }
        return ob4.b(j);
    }

    public final Object e() {
        ob4 ob4 = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(ob4);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = ob4.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = ob4.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = ob4.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else if (obj instanceof nb4) {
                break;
            } else {
                long j2 = (long) ((i + 1) & 1073741823);
                Object obj2 = obj;
                boolean z2 = z;
                if (f.compareAndSet(ob4, j, (j & -1073741824) | j2)) {
                    atomicReferenceArray.set(i3, (Object) null);
                    return obj2;
                }
                ob4 = this;
                if (z2) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(ob4);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            ob4 = ob4.d();
                        } else {
                            ob4 ob42 = ob4;
                            ob4 ob43 = ob42;
                            if (f.compareAndSet(ob42, j3, (j3 & -1073741824) | j2)) {
                                ob43.d.set(i4 & ob43.c, (Object) null);
                                ob4 = null;
                            } else {
                                ob4 = ob43;
                            }
                        }
                        if (ob4 == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
        return null;
    }
}
