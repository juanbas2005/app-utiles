package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: l81  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l81 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(l81.class, "workerCtl$volatile");
    public long A;
    public int B;
    public boolean C;
    public final /* synthetic */ n81 D;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker = n81.G;
    public final wd8 w = new wd8();
    private volatile /* synthetic */ int workerCtl$volatile;
    public final h06 x = new Object();
    public m81 y = m81.z;
    public long z;

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, h06] */
    public l81(n81 n81, int i) {
        this.D = n81;
        setDaemon(true);
        setContextClassLoader(n81.class.getClassLoader());
        int nanoTime = (int) System.nanoTime();
        this.B = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final wb7 a(boolean z2) {
        wb7 e;
        wb7 e2;
        long j;
        m81 m81 = this.y;
        n81 n81 = this.D;
        boolean z3 = true;
        wd8 wd8 = this.w;
        m81 m812 = m81.w;
        if (m81 != m812) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n81.E;
            do {
                j = atomicLongFieldUpdater.get(n81);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    wb7 g = wd8.g();
                    if (g == null && (g = (wb7) n81.B.d()) == null) {
                        return i(1);
                    }
                    return g;
                }
            } while (!n81.E.compareAndSet(n81, j, j - 4398046511104L));
            this.y = m812;
        }
        if (z2) {
            if (d(n81.w * 2) != 0) {
                z3 = false;
            }
            if (z3 && (e2 = e()) != null) {
                return e2;
            }
            wb7 e3 = wd8.e();
            if (e3 != null) {
                return e3;
            }
            if (!z3 && (e = e()) != null) {
                return e;
            }
        } else {
            wb7 e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.B;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.B = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i6 & i5;
        }
        return (Integer.MAX_VALUE & i5) % i;
    }

    public final wb7 e() {
        int d = d(2);
        n81 n81 = this.D;
        bw2 bw2 = n81.B;
        bw2 bw22 = n81.A;
        if (d == 0) {
            wb7 wb7 = (wb7) bw22.d();
            if (wb7 != null) {
                return wb7;
            }
            return (wb7) bw2.d();
        }
        wb7 wb72 = (wb7) bw2.d();
        if (wb72 != null) {
            return wb72;
        }
        return (wb7) bw22.d();
    }

    public final void f(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.D.z);
        sb.append("-worker-");
        if (i == 0) {
            str = "TERMINATED";
        } else {
            str = String.valueOf(i);
        }
        sb.append(str);
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(m81 m81) {
        boolean z2;
        m81 m812 = this.y;
        if (m812 == m81.w) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            n81.E.addAndGet(this.D, 4398046511104L);
        }
        if (m812 != m81) {
            this.y = m81;
        }
        return z2;
    }

    public final wb7 i(int i) {
        wb7 wb7;
        long i2;
        int i3 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n81.E;
        n81 n81 = this.D;
        int i4 = (int) (atomicLongFieldUpdater.get(n81) & 2097151);
        if (i4 < 2) {
            return null;
        }
        int d = d(i4);
        long j = Long.MAX_VALUE;
        for (int i5 = 0; i5 < i4; i5++) {
            boolean z2 = true;
            d++;
            if (d > i4) {
                d = 1;
            }
            l81 l81 = (l81) n81.C.b(d);
            if (l81 != null && l81 != this) {
                wd8 wd8 = l81.w;
                wd8.getClass();
                if (i3 == 3) {
                    wb7 = wd8.f();
                } else {
                    if (i3 != 1) {
                        z2 = false;
                    }
                    int i6 = wd8.d.get(wd8);
                    int i7 = wd8.c.get(wd8);
                    while (true) {
                        if (i6 != i7 && (!z2 || wd8.e.get(wd8) != 0)) {
                            int i8 = i6 + 1;
                            wb7 = wd8.h(i6, z2);
                            if (wb7 != null) {
                                break;
                            }
                            i6 = i8;
                        } else {
                            wb7 = null;
                        }
                    }
                    wb7 = null;
                }
                h06 h06 = this.x;
                if (wb7 != null) {
                    h06.w = wb7;
                    i2 = -1;
                } else {
                    i2 = wd8.i(i3, h06);
                }
                if (i2 == -1) {
                    wb7 wb72 = (wb7) h06.w;
                    h06.w = null;
                    return wb72;
                } else if (i2 > 0) {
                    j = Math.min(j, i2);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.A = j;
        return null;
    }

    public final void run() {
        m81 m81;
        m81 m812;
        long j;
        boolean z2;
        loop0:
        while (true) {
            boolean z3 = false;
            while (true) {
                if (!(n81.F.get(this.D) == 1 || this.y == (m81 = m81.A))) {
                    wb7 a = a(this.C);
                    if (a != null) {
                        this.A = 0;
                        n81 n81 = this.D;
                        this.z = 0;
                        if (this.y == m81.y) {
                            this.y = m81.x;
                        }
                        if (a.x) {
                            if (h(m81.x) && !n81.v() && !n81.u(n81.E.get(n81))) {
                                n81.v();
                            }
                            try {
                                a.run();
                            } catch (Throwable th) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                            }
                            n81.E.addAndGet(n81, -2097152);
                            if (this.y != m81) {
                                this.y = m81.z;
                            }
                        } else {
                            try {
                                a.run();
                            } catch (Throwable th2) {
                                Thread currentThread2 = Thread.currentThread();
                                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                            }
                        }
                    } else {
                        this.C = false;
                        if (this.A != 0) {
                            if (z3) {
                                h(m81.y);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.A);
                                this.A = 0;
                                break;
                            }
                            z3 = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            py2 py2 = n81.G;
                            if (obj != py2) {
                                E.set(this, -1);
                                while (this.nextParkedWorker != n81.G) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    n81 n812 = this.D;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = n81.F;
                                    if (atomicIntegerFieldUpdater2.get(n812) == 1 || this.y == (m812 = m81.A)) {
                                        break;
                                    }
                                    h(m81.y);
                                    Thread.interrupted();
                                    if (this.z == 0) {
                                        j = 2097151;
                                        this.z = System.nanoTime() + this.D.y;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.D.y);
                                    if (System.nanoTime() - this.z >= 0) {
                                        this.z = 0;
                                        n81 n813 = this.D;
                                        synchronized (n813.C) {
                                            try {
                                                if (atomicIntegerFieldUpdater2.get(n813) == 1) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (!z2) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = n81.E;
                                                    if (((int) (atomicLongFieldUpdater.get(n813) & j)) > n813.w) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            n813.o(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(n813) & j);
                                                            if (andDecrement != i) {
                                                                Object b = n813.C.b(andDecrement);
                                                                b.getClass();
                                                                l81 l81 = (l81) b;
                                                                n813.C.c(i, l81);
                                                                l81.f(i);
                                                                n813.o(l81, andDecrement, i);
                                                            }
                                                            n813.C.c(andDecrement, (l81) null);
                                                            this.y = m812;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            } else {
                                n81 n814 = this.D;
                                if (this.nextParkedWorker == py2) {
                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = n81.D;
                                    while (true) {
                                        long j2 = atomicLongFieldUpdater2.get(n814);
                                        int i2 = this.indexInArray;
                                        this.nextParkedWorker = n814.C.b((int) (j2 & 2097151));
                                        n81 n815 = n814;
                                        if (n81.D.compareAndSet(n815, j2, ((j2 + 2097152) & -2097152) | ((long) i2))) {
                                            break;
                                        }
                                        n814 = n815;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        h(m81.A);
    }
}
