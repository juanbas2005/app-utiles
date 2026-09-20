package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: n81  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n81 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater D;
    public static final /* synthetic */ AtomicLongFieldUpdater E;
    public static final /* synthetic */ AtomicIntegerFieldUpdater F;
    public static final py2 G = new py2("NOT_IN_STACK", 4);
    public final bw2 A;
    public final bw2 B;
    public final k56 C;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final int w;
    public final int x;
    public final long y;
    public final String z;

    static {
        Class<n81> cls = n81.class;
        D = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack$volatile");
        E = AtomicLongFieldUpdater.newUpdater(cls, "controlState$volatile");
        F = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated$volatile");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [bw2, mb4] */
    /* JADX WARNING: type inference failed for: r4v4, types: [bw2, mb4] */
    public n81(int i, int i2, long j, String str) {
        this.w = i;
        this.x = i2;
        this.y = j;
        this.z = str;
        if (i < 1) {
            h.j(pb4.i(i, "Core pool size ", " should be at least 1"));
            throw null;
        } else if (i2 < i) {
            h.j(b81.l(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        } else if (i2 > 2097150) {
            h.j(pb4.i(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        } else if (j > 0) {
            this.A = new mb4();
            this.B = new mb4();
            this.C = new k56((i + 1) * 2);
            this.controlState$volatile = ((long) i) << 42;
        } else {
            h.j(f21.g(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
    }

    public static /* synthetic */ void l(n81 n81, Runnable runnable, int i) {
        boolean z2;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        n81.k(runnable, false, z2);
    }

    public final int a() {
        boolean z2;
        synchronized (this.C) {
            try {
                if (F.get(this) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = E;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.w) {
                    return 0;
                }
                if (i >= this.x) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.C.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                l81 l81 = new l81(this, i3);
                this.C.c(i3, l81);
                if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i4 = i2 + 1;
                    l81.start();
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r0 == null) goto L_0x006e;
     */
    public final void close() {
        l81 l81;
        int i;
        wb7 wb7;
        if (F.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            l81 l812 = null;
            if (currentThread instanceof l81) {
                l81 = (l81) currentThread;
            } else {
                l81 = null;
            }
            if (l81 != null && l81.D == this) {
                l812 = l81;
            }
            synchronized (this.C) {
                i = (int) (E.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.C.b(i2);
                    b.getClass();
                    l81 l813 = (l81) b;
                    if (l813 != l812) {
                        while (l813.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(l813);
                            l813.join(10000);
                        }
                        l813.w.d(this.B);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.B.b();
            this.A.b();
            while (true) {
                if (l812 != null) {
                    wb7 = l812.a(true);
                }
                wb7 = (wb7) this.A.d();
                if (wb7 == null && (wb7 = (wb7) this.B.d()) == null) {
                    break;
                }
                try {
                    wb7.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (l812 != null) {
                l812.h(m81.A);
            }
            D.set(this, 0);
            E.set(this, 0);
        }
    }

    public final void execute(Runnable runnable) {
        l(this, runnable, 6);
    }

    public final void k(Runnable runnable, boolean z2, boolean z3) {
        wb7 wb7;
        long j;
        l81 l81;
        boolean z4;
        m81 m81;
        cc7.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof wb7) {
            wb7 = (wb7) runnable;
            wb7.w = nanoTime;
            wb7.x = z2;
        } else {
            wb7 = new zb7(runnable, nanoTime, z2);
        }
        boolean z5 = wb7.x;
        AtomicLongFieldUpdater atomicLongFieldUpdater = E;
        if (z5) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        l81 l812 = null;
        if (currentThread instanceof l81) {
            l81 = (l81) currentThread;
        } else {
            l81 = null;
        }
        if (l81 != null && l81.D == this) {
            l812 = l81;
        }
        if (!(l812 == null || (m81 = l812.y) == m81.A || (!wb7.x && m81 == m81.x))) {
            l812.C = true;
            wb7 = l812.w.a(wb7, z3);
        }
        if (wb7 != null) {
            if (wb7.x) {
                z4 = this.B.a(wb7);
            } else {
                z4 = this.A.a(wb7);
            }
            if (!z4) {
                throw new RejectedExecutionException(f21.l(new StringBuilder(), this.z, " was terminated"));
            }
        }
        if (z5) {
            if (!v() && !u(j)) {
                v();
            }
        } else if (!v() && !u(atomicLongFieldUpdater.get(this))) {
            v();
        }
    }

    public final void o(l81 l81, int i, int i2) {
        while (true) {
            long j = D.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = l81.c();
                    while (true) {
                        if (c == G) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            l81 l812 = (l81) c;
                            int b = l812.b();
                            if (b != 0) {
                                i3 = b;
                                break;
                            }
                            c = l812.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                n81 n81 = this;
                if (!D.compareAndSet(n81, j, ((long) i3) | j2)) {
                    this = n81;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        k56 k56 = this.C;
        int a = k56.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            l81 l81 = (l81) k56.b(i6);
            if (l81 != null) {
                int c = l81.w.c();
                int ordinal = l81.y.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i5++;
                } else {
                    h.c();
                    return null;
                }
            }
        }
        long j = E.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.z);
        sb4.append('@');
        sb4.append(rj1.t(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.w;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.x);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.A.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.B.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean u(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.w;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        n81 n81;
        py2 py2;
        int i;
        while (true) {
            long j = D.get(this);
            l81 l81 = (l81) this.C.b((int) (2097151 & j));
            if (l81 == null) {
                l81 = null;
                n81 = this;
            } else {
                long j2 = (2097152 + j) & -2097152;
                Object c = l81.c();
                while (true) {
                    py2 = G;
                    if (c == py2) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        l81 l812 = (l81) c;
                        i = l812.b();
                        if (i != 0) {
                            break;
                        }
                        long j3 = j;
                        n81 n812 = this;
                        c = l812.c();
                        j = j3;
                    }
                }
                if (i >= 0) {
                    n81 n813 = this;
                    boolean compareAndSet = D.compareAndSet(n813, j, ((long) i) | j2);
                    n81 = n813;
                    if (compareAndSet) {
                        l81.g(py2);
                    }
                    this = n81;
                } else {
                    continue;
                }
            }
            if (l81 == null) {
                return false;
            }
            if (l81.E.compareAndSet(l81, -1, 0)) {
                LockSupport.unpark(l81);
                return true;
            }
            this = n81;
        }
    }
}
