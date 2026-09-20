package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.UndeliveredElementException;
import sun.misc.Unsafe;

/* renamed from: ad0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ad0 implements en0 {
    public static final /* synthetic */ AtomicLongFieldUpdater A;
    public static final /* synthetic */ AtomicLongFieldUpdater B;
    public static final /* synthetic */ AtomicReferenceFieldUpdater C;
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    public static final /* synthetic */ AtomicReferenceFieldUpdater E;
    public static final /* synthetic */ AtomicReferenceFieldUpdater F;
    public static final /* synthetic */ AtomicReferenceFieldUpdater G;
    public static final /* synthetic */ long H;
    public static final /* synthetic */ long I;
    public static final /* synthetic */ long J;
    public static final /* synthetic */ long K;
    public static final /* synthetic */ long L;
    public static final /* synthetic */ AtomicLongFieldUpdater y;
    public static final /* synthetic */ AtomicLongFieldUpdater z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public final int w;
    public final vr2 x;

    static {
        Class<ad0> cls = ad0.class;
        y = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus$volatile");
        z = AtomicLongFieldUpdater.newUpdater(cls, "receivers$volatile");
        A = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd$volatile");
        B = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag$volatile");
        Class<Object> cls2 = Object.class;
        C = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment$volatile");
        Unsafe unsafe = y79.a;
        L = unsafe.objectFieldOffset(cls.getDeclaredField("sendSegment$volatile"));
        D = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment$volatile");
        K = unsafe.objectFieldOffset(cls.getDeclaredField("receiveSegment$volatile"));
        E = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment$volatile");
        I = unsafe.objectFieldOffset(cls.getDeclaredField("bufferEndSegment$volatile"));
        F = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause$volatile");
        H = unsafe.objectFieldOffset(cls.getDeclaredField("_closeCause$volatile"));
        G = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler$volatile");
        J = unsafe.objectFieldOffset(cls.getDeclaredField("closeHandler$volatile"));
    }

    public ad0(int i, vr2 vr2) {
        long j;
        this.w = i;
        this.x = vr2;
        if (i >= 0) {
            sn0 sn0 = cd0.a;
            if (i == 0) {
                j = 0;
            } else if (i != Integer.MAX_VALUE) {
                j = (long) i;
            } else {
                j = Long.MAX_VALUE;
            }
            this.bufferEnd$volatile = j;
            this.completedExpandBuffersAndPauseFlag$volatile = A.get(this);
            sn0 sn02 = new sn0(0, (sn0) null, this, 3);
            this.sendSegment$volatile = sn02;
            this.receiveSegment$volatile = sn02;
            if (G()) {
                sn02 = cd0.a;
                sn02.getClass();
            }
            this.bufferEndSegment$volatile = sn02;
            this._closeCause$volatile = cd0.s;
            return;
        }
        h.j(pb4.i(i, "Invalid channel capacity: ", ", should be >=0"));
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f9, code lost:
        if (r13 != null) goto L_0x00fb;
     */
    public static Object J(ad0 ad0, a97 a97) {
        sn0 sn0;
        Throwable th;
        kk0 kk0;
        sn0 sn02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
        atomicReferenceFieldUpdater.getClass();
        xc0 xc0 = null;
        if (ad0 != null) {
            sn0 sn03 = (sn0) y79.a.getObjectVolatile(ad0, K);
            while (!ad0.D()) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = z;
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(ad0);
                long j = (long) cd0.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (sn03.e != j2) {
                    sn0 r = ad0.r(j2, sn03);
                    if (r == null) {
                        continue;
                    } else {
                        sn0 = r;
                    }
                } else {
                    sn0 = sn03;
                }
                ad0 ad02 = ad0;
                Object Q = ad02.Q(sn0, i, andIncrement, (Object) null);
                py2 py2 = cd0.m;
                if (Q != py2) {
                    py2 py22 = cd0.o;
                    if (Q == py22) {
                        if (andIncrement < ad02.x()) {
                            sn0.a();
                        }
                        ad0 = ad02;
                        sn03 = sn0;
                    } else if (Q == cd0.n) {
                        vr2 vr2 = ad02.x;
                        kk0 y2 = hj8.y(rc9.a0(a97));
                        try {
                            Object Q2 = ad02.Q(sn0, i, andIncrement, y2);
                            if (Q2 == py2) {
                                y2.b(sn0, i);
                            } else {
                                if (Q2 == py22) {
                                    if (andIncrement < ad02.x()) {
                                        sn0.a();
                                    }
                                    sn0 sn04 = (sn0) atomicReferenceFieldUpdater.get(ad02);
                                    while (true) {
                                        if (ad02.D()) {
                                            y2.f(new m66(ad02.v()));
                                            break;
                                        }
                                        kk0 = y2;
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(ad02);
                                        long j3 = (long) cd0.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (sn04.e != j4) {
                                            try {
                                                sn0 r2 = ad02.r(j4, sn04);
                                                if (r2 == null) {
                                                    y2 = kk0;
                                                } else {
                                                    sn02 = r2;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                y2 = kk0;
                                                y2.C();
                                                throw th;
                                            }
                                        } else {
                                            sn02 = sn04;
                                        }
                                        int i3 = i2;
                                        ad0 ad03 = ad02;
                                        Q2 = ad03.Q(sn02, i3, andIncrement2, kk0);
                                        ad02 = ad03;
                                        sn0 sn05 = sn02;
                                        long j5 = andIncrement2;
                                        y2 = kk0;
                                        if (Q2 == cd0.m) {
                                            y2.b(sn05, i3);
                                            break;
                                        } else if (Q2 == cd0.o) {
                                            if (j5 < ad02.x()) {
                                                sn05.a();
                                            }
                                            sn04 = sn05;
                                        } else if (Q2 != cd0.n) {
                                            sn05.a();
                                            if (vr2 != null) {
                                            }
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                    xc0 = ad02.e();
                                } else {
                                    sn0.a();
                                }
                                y2.J(Q2, xc0);
                            }
                            return y2.t();
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            y2.C();
                            throw th;
                        }
                    } else {
                        sn0.a();
                        return Q;
                    }
                } else {
                    h.s("unexpected");
                    return null;
                }
            }
            Throwable v = ad0.v();
            int i4 = z17.a;
            throw v;
        }
        ku4.a();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    public static Object K(ad0 ad0, h61 h61) {
        yc0 yc0;
        int i;
        sn0 sn0;
        if (h61 instanceof yc0) {
            yc0 = (yc0) h61;
            int i2 = yc0.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yc0.B = i2 - Integer.MIN_VALUE;
                yc0 yc022 = yc0;
                Object obj2 = yc022.z;
                i = yc022.B;
                if (i != 0) {
                    o85.q(obj2);
                    D.getClass();
                    sn0 sn02 = (sn0) y79.a.getObjectVolatile(ad0, K);
                    while (!ad0.D()) {
                        long andIncrement = z.getAndIncrement(ad0);
                        long j = (long) cd0.b;
                        long j2 = andIncrement / j;
                        int i3 = (int) (andIncrement % j);
                        if (sn02.e != j2) {
                            sn0 r = ad0.r(j2, sn02);
                            if (r == null) {
                                continue;
                            } else {
                                sn0 = r;
                            }
                        } else {
                            sn0 = sn02;
                        }
                        ad0 ad02 = ad0;
                        Object Q = ad02.Q(sn0, i3, andIncrement, (Object) null);
                        if (Q == cd0.m) {
                            h.s("unexpected");
                            return null;
                        } else if (Q == cd0.o) {
                            if (andIncrement < ad02.x()) {
                                sn0.a();
                            }
                            ad0 = ad02;
                            sn02 = sn0;
                        } else if (Q == cd0.n) {
                            yc022.B = 1;
                            Object L2 = ad02.L(sn0, i3, andIncrement, yc022);
                            p81 p81 = p81.w;
                            if (L2 == p81) {
                                return p81;
                            }
                            return L2;
                        } else {
                            sn0.a();
                            return Q;
                        }
                    }
                    return new pn0(ad0.u());
                } else if (i == 1) {
                    o85.q(obj2);
                    return ((rn0) obj2).a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        yc0 = new yc0(ad0, h61);
        yc0 yc0222 = yc0;
        Object obj22 = yc0222.z;
        i = yc0222.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0158 A[RETURN] */
    public static Object N(ad0 ad0, Object obj, f61 f61) {
        vs7 vs7;
        p81 p81;
        Object t;
        p81 p812;
        ad0 ad02 = ad0;
        Object obj2 = obj;
        f61 f612 = f61;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
        atomicReferenceFieldUpdater.getClass();
        sn0 sn0 = (sn0) y79.a.getObjectVolatile(ad02, L);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = y;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(ad02);
            long j = andIncrement & 1152921504606846975L;
            boolean C2 = ad02.C(false, andIncrement);
            int i = cd0.b;
            long j2 = (long) i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            int i3 = i;
            int i4 = (sn0.e > j3 ? 1 : (sn0.e == j3 ? 0 : -1));
            p81 p813 = p81.w;
            vs7 = vs7.a;
            if (i4 != 0) {
                sn0 t2 = ad02.t(j3, sn0);
                if (t2 != null) {
                    sn0 = t2;
                } else if (C2) {
                    Object I2 = ad02.I(f612, obj2);
                    if (I2 == p813) {
                        return I2;
                    }
                }
            }
            boolean z2 = C2;
            int i5 = i2;
            long j4 = j;
            int d = d(ad02, sn0, i5, obj2, j4, (Object) null, z2);
            if (d == 0) {
                sn0.a();
                return vs7;
            } else if (d == 1) {
                break;
            } else if (d != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = z;
                if (d == 3) {
                    kk0 y2 = hj8.y(rc9.a0(f612));
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                    try {
                        int d2 = d(ad02, sn0, i5, obj2, j4, y2, false);
                        if (d2 != 0) {
                            if (d2 == 1) {
                                p81 = p813;
                                y2.f(vs7);
                            } else if (d2 != 2) {
                                if (d2 == 4) {
                                    p81 = p813;
                                    if (j4 < atomicLongFieldUpdater3.get(ad02)) {
                                        sn0.a();
                                    }
                                } else if (d2 == 5) {
                                    sn0.a();
                                    sn0 sn02 = (sn0) atomicReferenceFieldUpdater.get(ad02);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(ad02);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean C3 = ad02.C(false, andIncrement2);
                                        int i6 = cd0.b;
                                        long j6 = (long) i6;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater;
                                        long j7 = j5 / j6;
                                        int i7 = (int) (j5 % j6);
                                        p81 = p813;
                                        if (sn02.e != j7) {
                                            sn0 t3 = ad02.t(j7, sn02);
                                            if (t3 != null) {
                                                sn02 = t3;
                                            } else if (C3) {
                                                break;
                                            } else {
                                                atomicLongFieldUpdater = atomicLongFieldUpdater4;
                                                p813 = p81;
                                            }
                                        }
                                        int i8 = i6;
                                        int i9 = i7;
                                        long j8 = j5;
                                        int d3 = d(ad02, sn02, i9, obj2, j8, y2, C3);
                                        if (d3 != 0) {
                                            if (d3 == 1) {
                                                break;
                                            } else if (d3 != 2) {
                                                if (d3 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                } else if (d3 != 4) {
                                                    if (d3 == 5) {
                                                        sn02.a();
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater4;
                                                    p813 = p81;
                                                } else if (j8 < atomicLongFieldUpdater3.get(ad02)) {
                                                    sn02.a();
                                                }
                                            } else if (C3) {
                                                sn02.m();
                                            } else {
                                                y2.b(sn02, i9 + i8);
                                            }
                                        } else {
                                            sn02.a();
                                            break;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected");
                                }
                                a(ad02, obj2, y2);
                            } else {
                                p81 = p813;
                                y2.b(sn0, i5 + i3);
                            }
                            t = y2.t();
                            p812 = p81;
                            if (t != p812) {
                                t = vs7;
                            }
                            if (t != p812) {
                                return t;
                            }
                        } else {
                            p81 = p813;
                            sn0.a();
                        }
                        y2.f(vs7);
                        t = y2.t();
                        p812 = p81;
                        if (t != p812) {
                        }
                        if (t != p812) {
                            return vs7;
                        }
                    } catch (Throwable th) {
                        y2.C();
                        throw th;
                    }
                } else if (d == 4) {
                    if (j4 < atomicLongFieldUpdater2.get(ad02)) {
                        sn0.a();
                    }
                    Object I3 = ad02.I(f612, obj2);
                    if (I3 == p813) {
                        return I3;
                    }
                } else if (d == 5) {
                    sn0.a();
                }
            } else {
                p81 p814 = p813;
                if (z2) {
                    sn0.m();
                    Object I4 = ad02.I(f612, obj2);
                    if (I4 == p814) {
                        return I4;
                    }
                }
            }
        }
        return vs7;
    }

    public static boolean P(Object obj) {
        if (obj instanceof ik0) {
            return cd0.a((ik0) obj, vs7.a, (hs2) null);
        }
        ta1.l("Unexpected waiter: ", obj);
        return false;
    }

    public static final void a(ad0 ad0, Object obj, kk0 kk0) {
        vr2 vr2 = ad0.x;
        if (vr2 != null) {
            l55.d(vr2, obj, kk0.A);
        }
        kk0.f(new m66(ad0.w()));
    }

    public static final int d(ad0 ad0, sn0 sn0, int i, Object obj, long j, Object obj2, boolean z2) {
        sn0.r(i, obj);
        if (z2) {
            return ad0.R(sn0, i, obj, j, obj2, z2);
        }
        Object p = sn0.p(i);
        if (p == null) {
            if (ad0.g(j)) {
                if (sn0.o(i, (Object) null, cd0.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (sn0.o(i, (Object) null, obj2)) {
                    return 2;
                }
            }
        } else if (p instanceof g88) {
            sn0.r(i, (Object) null);
            if (ad0.O(p, obj)) {
                sn0.s(i, cd0.i);
                return 0;
            }
            py2 py2 = cd0.k;
            if (sn0.h.getAndSet((i * 2) + 1, py2) == py2) {
                return 5;
            }
            sn0.q(i, true);
            return 5;
        }
        return ad0.R(sn0, i, obj, j, obj2, z2);
    }

    public static void z(ad0 ad0) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        if ((atomicLongFieldUpdater.addAndGet(ad0, 1) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(ad0) & 4611686018427387904L) != 0);
        }
    }

    public final void A() {
        Object objectVolatile;
        py2 py2;
        ad0 ad0;
        loop0:
        while (true) {
            G.getClass();
            Unsafe unsafe = y79.a;
            long j = J;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                py2 = cd0.q;
            } else {
                py2 = cd0.r;
            }
            py2 py22 = py2;
            while (true) {
                Unsafe unsafe2 = y79.a;
                ad0 = this;
                if (unsafe2.compareAndSwapObject(ad0, J, objectVolatile, py22)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(ad0, j) != objectVolatile) {
                    break;
                } else {
                    this = ad0;
                }
            }
            this = ad0;
        }
        if (objectVolatile != null) {
            mp7.Q(1, objectVolatile);
            vr2 vr2 = (vr2) objectVolatile;
            ((vr2) objectVolatile).y(ad0.u());
        }
    }

    public final void B(b0 b0Var) {
        while (true) {
            G.getClass();
            Unsafe unsafe = y79.a;
            ad0 ad0 = this;
            if (!unsafe.compareAndSwapObject(ad0, J, (Object) null, b0Var)) {
                long j = J;
                if (unsafe.getObjectVolatile(ad0, j) != null) {
                    while (true) {
                        Object objectVolatile = y79.a.getObjectVolatile(ad0, j);
                        py2 py2 = cd0.q;
                        if (objectVolatile == py2) {
                            py2 py22 = cd0.r;
                            while (true) {
                                ad0 ad02 = ad0;
                                Unsafe unsafe2 = y79.a;
                                boolean compareAndSwapObject = unsafe2.compareAndSwapObject(ad02, J, py2, py22);
                                Unsafe unsafe3 = unsafe2;
                                ad0 = ad02;
                                if (compareAndSwapObject) {
                                    b0Var.y(ad0.u());
                                    return;
                                } else if (unsafe3.getObjectVolatile(ad0, j) != py2) {
                                }
                            }
                        } else if (objectVolatile == cd0.r) {
                            h.s("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            ta1.l("Another handler is already registered: ", objectVolatile);
                            return;
                        }
                    }
                } else {
                    this = ad0;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        r13 = (defpackage.sn0) r13.e();
     */
    public final boolean C(boolean z2, long j) {
        g88 g88;
        int i = (int) (j >> 60);
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                k(j & 1152921504606846975L);
                if (!z2 || !y()) {
                    return true;
                }
            } else if (i == 3) {
                sn0 k = k(j & 1152921504606846975L);
                UndeliveredElementException undeliveredElementException = null;
                Object obj = null;
                loop0:
                do {
                    AtomicReferenceArray atomicReferenceArray = k.h;
                    int i2 = cd0.b - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (k.e * ((long) cd0.b)) + ((long) i2);
                        while (true) {
                            Object p = k.p(i2);
                            if (p == cd0.i) {
                                break loop0;
                            }
                            py2 py2 = cd0.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = z;
                            vr2 vr2 = this.x;
                            if (p != py2) {
                                if (p != cd0.e && p != null) {
                                    if ((p instanceof g88) || (p instanceof h88)) {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        if (p instanceof h88) {
                                            g88 = ((h88) p).a;
                                        } else {
                                            g88 = (g88) p;
                                        }
                                        if (k.o(i2, p, cd0.l)) {
                                            if (vr2 != null) {
                                                undeliveredElementException = l55.e(vr2, atomicReferenceArray.get(i2 * 2), undeliveredElementException);
                                            }
                                            obj = ar7.M(obj, g88);
                                            k.r(i2, (Object) null);
                                            k.m();
                                        }
                                    } else {
                                        py2 py22 = cd0.g;
                                        if (p == py22 || p == cd0.f) {
                                            break loop0;
                                        } else if (p != py22) {
                                            break;
                                        }
                                    }
                                } else if (k.o(i2, p, cd0.l)) {
                                    k.m();
                                    break;
                                }
                            } else if (j2 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            } else if (k.o(i2, p, cd0.l)) {
                                if (vr2 != null) {
                                    undeliveredElementException = l55.e(vr2, atomicReferenceArray.get(i2 * 2), undeliveredElementException);
                                }
                                k.r(i2, (Object) null);
                                k.m();
                            }
                        }
                        i2--;
                    }
                } while (k != null);
                if (obj != null) {
                    if (!(obj instanceof ArrayList)) {
                        M((g88) obj, false);
                    } else {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            M((g88) arrayList.get(size), false);
                        }
                    }
                }
                if (undeliveredElementException != null) {
                    throw undeliveredElementException;
                }
            } else {
                ku4.g(hl6.k(i, "unexpected close status: "));
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean D() {
        return C(true, y.get(this));
    }

    public final boolean E() {
        return C(false, y.get(this));
    }

    public boolean F() {
        return false;
    }

    public final boolean G() {
        long j = A.get(this);
        if (j == 0 || j == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r5.j() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r5.h();
     */
    public final void H(long j, sn0 sn0) {
        ad0 ad0;
        sn0 sn02;
        sn0 sn03;
        while (sn0.e < j && (sn03 = (sn0) sn0.c()) != null) {
            sn0 = sn03;
        }
        while (true) {
            sn0 sn04 = sn0;
            while (sn04.f() && (sn02 = (sn0) sn04.c()) != null) {
                sn04 = sn02;
            }
            while (true) {
                E.getClass();
                Unsafe unsafe = y79.a;
                long j2 = I;
                ri6 ri6 = (ri6) unsafe.getObjectVolatile(this, j2);
                if (ri6.e < sn04.e) {
                    if (!sn04.n()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe2 = y79.a;
                        ad0 = this;
                        if (unsafe2.compareAndSwapObject(ad0, I, ri6, sn04)) {
                            if (ri6.j()) {
                                ri6.h();
                                return;
                            }
                            return;
                        } else if (unsafe2.getObjectVolatile(ad0, j2) != ri6) {
                            break;
                        } else {
                            this = ad0;
                        }
                    }
                } else {
                    return;
                }
                this = ad0;
            }
            sn0 = sn04;
        }
    }

    public final Object I(f61 f61, Object obj) {
        UndeliveredElementException e;
        kk0 kk0 = new kk0(1, rc9.a0(f61));
        kk0.v();
        vr2 vr2 = this.x;
        if (vr2 == null || (e = l55.e(vr2, obj, (UndeliveredElementException) null)) == null) {
            kk0.f(new m66(w()));
        } else {
            su0.b(e, w());
            kk0.f(new m66(e));
        }
        Object t = kk0.t();
        if (t == p81.w) {
            return t;
        }
        return vs7.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ce, code lost:
        if (r11 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e8, code lost:
        if (r11 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object L(sn0 sn0, int i, long j, h61 h61) {
        zc0 zc0;
        int i2;
        rn0 rn0;
        sn0 sn02;
        if (h61 instanceof zc0) {
            zc0 = (zc0) h61;
            int i3 = zc0.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zc0.B = i3 - Integer.MIN_VALUE;
                Object obj2 = zc0.z;
                i2 = zc0.B;
                xc0 xc02 = null;
                if (i2 != 0) {
                    o85.q(obj2);
                    zc0.B = 1;
                    kk0 y2 = hj8.y(rc9.a0(zc0));
                    try {
                        vx5 vx5 = new vx5(y2);
                        sn0 sn03 = sn0;
                        int i4 = i;
                        long j2 = j;
                        Object Q = Q(sn03, i4, j2, vx5);
                        if (Q == cd0.m) {
                            vx5.b(sn03, i4);
                        } else {
                            py2 py2 = cd0.o;
                            vr2 vr2 = this.x;
                            if (Q == py2) {
                                if (j2 < x()) {
                                    sn03.a();
                                }
                                sn0 sn04 = (sn0) D.get(this);
                                while (true) {
                                    if (D()) {
                                        y2.f(new rn0(new pn0(u())));
                                        break;
                                    }
                                    long andIncrement = z.getAndIncrement(this);
                                    long j3 = (long) cd0.b;
                                    long j4 = andIncrement / j3;
                                    int i5 = (int) (andIncrement % j3);
                                    if (sn04.e != j4) {
                                        sn0 r = r(j4, sn04);
                                        if (r != null) {
                                            sn02 = r;
                                        }
                                    } else {
                                        sn02 = sn04;
                                    }
                                    Object Q2 = Q(sn02, i5, andIncrement, vx5);
                                    sn0 sn05 = sn02;
                                    if (Q2 == cd0.m) {
                                        vx5.b(sn05, i5);
                                        break;
                                    } else if (Q2 == cd0.o) {
                                        if (andIncrement < x()) {
                                            sn05.a();
                                        }
                                        sn04 = sn05;
                                    } else if (Q2 != cd0.n) {
                                        sn05.a();
                                        rn0 = new rn0(Q2);
                                    } else {
                                        throw new IllegalStateException("unexpected");
                                    }
                                }
                                y2.J(rn0, xc02);
                            } else {
                                sn03.a();
                                rn0 = new rn0(Q);
                            }
                            xc02 = f();
                            y2.J(rn0, xc02);
                        }
                        obj2 = y2.t();
                        p81 p81 = p81.w;
                        if (obj2 == p81) {
                            return p81;
                        }
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        y2.C();
                        throw th2;
                    }
                } else if (i2 == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((rn0) obj2).a;
            }
        }
        zc0 = new zc0(this, h61);
        Object obj22 = zc0.z;
        i2 = zc0.B;
        xc0 xc022 = null;
        if (i2 != 0) {
        }
        return ((rn0) obj22).a;
    }

    public final void M(g88 g88, boolean z2) {
        Throwable th;
        if (g88 instanceof ik0) {
            f61 f61 = (f61) g88;
            if (z2) {
                th = v();
            } else {
                th = w();
            }
            f61.f(new m66(th));
        } else if (g88 instanceof vx5) {
            ((vx5) g88).w.f(new rn0(new pn0(u())));
        } else if (g88 instanceof wc0) {
            wc0 wc0 = (wc0) g88;
            kk0 kk0 = wc0.x;
            kk0.getClass();
            wc0.x = null;
            wc0.w = cd0.l;
            Throwable u = wc0.y.u();
            if (u == null) {
                kk0.f(Boolean.FALSE);
            } else {
                kk0.f(new m66(u));
            }
        } else {
            ta1.l("Unexpected waiter: ", g88);
        }
    }

    public final boolean O(Object obj, Object obj2) {
        boolean z2 = obj instanceof vx5;
        vr2 vr2 = this.x;
        hs2 hs2 = null;
        if (z2) {
            kk0 kk0 = ((vx5) obj).w;
            rn0 rn0 = new rn0(obj2);
            if (vr2 != null) {
                hs2 = f();
            }
            return cd0.a(kk0, rn0, hs2);
        } else if (obj instanceof wc0) {
            wc0 wc0 = (wc0) obj;
            kk0 kk02 = wc0.x;
            kk02.getClass();
            wc0.x = null;
            wc0.w = obj2;
            Boolean bool = Boolean.TRUE;
            vr2 vr22 = wc0.y.x;
            if (vr22 != null) {
                hs2 = new gc5(vr22, obj2, 5);
            }
            return cd0.a(kk02, bool, hs2);
        } else if (obj instanceof ik0) {
            ik0 ik0 = (ik0) obj;
            if (vr2 != null) {
                hs2 = e();
            }
            return cd0.a(ik0, obj2, hs2);
        } else {
            ta1.l("Unexpected receiver type: ", obj);
            return false;
        }
    }

    public final Object Q(sn0 sn0, int i, long j, Object obj) {
        Object p = sn0.p(i);
        AtomicReferenceArray atomicReferenceArray = sn0.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = y;
        if (p == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return cd0.n;
                }
                if (sn0.o(i, p, obj)) {
                    m();
                    return cd0.m;
                }
            }
        } else if (p == cd0.d && sn0.o(i, p, cd0.i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i * 2);
            sn0.r(i, (Object) null);
            return obj2;
        }
        while (true) {
            Object p2 = sn0.p(i);
            if (p2 == null || p2 == cd0.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (sn0.o(i, p2, cd0.h)) {
                        m();
                        return cd0.o;
                    }
                } else if (obj == null) {
                    return cd0.n;
                } else {
                    if (sn0.o(i, p2, obj)) {
                        m();
                        return cd0.m;
                    }
                }
            } else if (p2 != cd0.d) {
                py2 py2 = cd0.j;
                if (p2 == py2) {
                    return cd0.o;
                }
                if (p2 == cd0.h) {
                    return cd0.o;
                }
                if (p2 == cd0.l) {
                    m();
                    return cd0.o;
                } else if (p2 != cd0.g && sn0.o(i, p2, cd0.f)) {
                    boolean z2 = p2 instanceof h88;
                    if (z2) {
                        p2 = ((h88) p2).a;
                    }
                    if (P(p2)) {
                        sn0.s(i, cd0.i);
                        m();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        sn0.r(i, (Object) null);
                        return obj3;
                    }
                    sn0.s(i, py2);
                    sn0.m();
                    if (z2) {
                        m();
                    }
                    return cd0.o;
                }
            } else if (sn0.o(i, p2, cd0.i)) {
                m();
                Object obj4 = atomicReferenceArray.get(i * 2);
                sn0.r(i, (Object) null);
                return obj4;
            }
        }
    }

    public final int R(sn0 sn0, int i, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object p = sn0.p(i);
            if (p == null) {
                if (!g(j) || z2) {
                    if (z2) {
                        if (sn0.o(i, (Object) null, cd0.j)) {
                            sn0.m();
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (sn0.o(i, (Object) null, obj2)) {
                            return 2;
                        }
                    }
                } else if (sn0.o(i, (Object) null, cd0.d)) {
                    break;
                }
            } else if (p != cd0.e) {
                py2 py2 = cd0.k;
                if (p == py2) {
                    sn0.r(i, (Object) null);
                    return 5;
                } else if (p == cd0.h) {
                    sn0.r(i, (Object) null);
                    return 5;
                } else if (p == cd0.l) {
                    sn0.r(i, (Object) null);
                    E();
                    return 4;
                } else {
                    sn0.r(i, (Object) null);
                    if (p instanceof h88) {
                        p = ((h88) p).a;
                    }
                    if (O(p, obj)) {
                        sn0.s(i, cd0.i);
                        return 0;
                    }
                    if (sn0.h.getAndSet((i * 2) + 1, py2) != py2) {
                        sn0.q(i, true);
                    }
                    return 5;
                }
            } else if (sn0.o(i, p, cd0.d)) {
                break;
            }
        }
        return 1;
    }

    public final void S(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        ad0 ad0;
        boolean z2;
        ad0 ad02 = this;
        if (!ad02.G()) {
            while (true) {
                atomicLongFieldUpdater = A;
                if (atomicLongFieldUpdater.get(ad02) > j) {
                    break;
                }
                ad02 = this;
            }
            int i = cd0.c;
            int i2 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = B;
                if (i2 < i) {
                    long j2 = atomicLongFieldUpdater.get(ad02);
                    if (j2 != (4611686018427387903L & atomicLongFieldUpdater2.get(ad02)) || j2 != atomicLongFieldUpdater.get(ad02)) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                    while (true) {
                        long j3 = atomicLongFieldUpdater3.get(ad0);
                        if (atomicLongFieldUpdater3.compareAndSet(ad0, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        ad02 = this;
                    }
                    while (true) {
                        long j4 = atomicLongFieldUpdater.get(ad0);
                        long j5 = atomicLongFieldUpdater3.get(ad0);
                        long j6 = j5 & 4611686018427387903L;
                        if ((j5 & 4611686018427387904L) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (j4 == j6 && j4 == atomicLongFieldUpdater.get(ad0)) {
                            break;
                        } else if (!z2) {
                            ad0 = this;
                            atomicLongFieldUpdater3.compareAndSet(ad0, j5, 4611686018427387904L + j6);
                        } else {
                            ad0 = this;
                        }
                    }
                    while (true) {
                        long j7 = atomicLongFieldUpdater3.get(ad0);
                        if (!atomicLongFieldUpdater3.compareAndSet(ad0, j7, j7 & 4611686018427387903L)) {
                            ad0 = this;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public Object b(f61 f61, Object obj) {
        return N(this, obj, f61);
    }

    public Object c(Object obj) {
        boolean z2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = y;
        long j = atomicLongFieldUpdater.get(this);
        boolean z3 = false;
        long j2 = 1152921504606846975L;
        if (C(false, j)) {
            z2 = false;
        } else {
            z2 = !g(j & 1152921504606846975L);
        }
        qn0 qn0 = rn0.b;
        if (z2) {
            return qn0;
        }
        py2 py2 = cd0.j;
        C.getClass();
        sn0 sn0 = (sn0) y79.a.getObjectVolatile(this, L);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean C2 = C(z3, andIncrement);
            int i = cd0.b;
            long j4 = (long) i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (sn0.e != j5) {
                sn0 t = t(j5, sn0);
                if (t != null) {
                    sn0 = t;
                } else if (C2) {
                    return new pn0(w());
                } else {
                    z3 = false;
                    j2 = 1152921504606846975L;
                }
            }
            int d = d(this, sn0, i2, obj, j3, py2, C2);
            vs7 vs7 = vs7.a;
            if (d == 0) {
                sn0.a();
                return vs7;
            } else if (d == 1) {
                return vs7;
            } else {
                g88 g88 = null;
                if (d != 2) {
                    if (d == 3) {
                        h.s("unexpected");
                        return null;
                    } else if (d != 4) {
                        if (d == 5) {
                            sn0.a();
                        }
                        z3 = false;
                        j2 = 1152921504606846975L;
                    } else {
                        if (j3 < z.get(this)) {
                            sn0.a();
                        }
                        return new pn0(w());
                    }
                } else if (C2) {
                    sn0.m();
                    return new pn0(w());
                } else {
                    if (py2 instanceof g88) {
                        g88 = (g88) py2;
                    }
                    if (g88 != null) {
                        g88.b(sn0, i2 + i);
                    }
                    sn0.m();
                    return qn0;
                }
            }
        }
    }

    public final xc0 e() {
        return new xc0(3, this, ad0.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 0);
    }

    public final xc0 f() {
        return new xc0(3, this, ad0.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0, 1);
    }

    public final boolean g(long j) {
        if (j < A.get(this) || j < z.get(this) + ((long) this.w)) {
            return true;
        }
        return false;
    }

    public final boolean h(Throwable th) {
        return j(th, false);
    }

    public final sn0 i() {
        E.getClass();
        Unsafe unsafe = y79.a;
        sn0 objectVolatile = unsafe.getObjectVolatile(this, I);
        C.getClass();
        sn0 sn0 = (sn0) unsafe.getObjectVolatile(this, L);
        if (sn0.e > ((sn0) objectVolatile).e) {
            objectVolatile = sn0;
        }
        D.getClass();
        sn0 sn02 = (sn0) unsafe.getObjectVolatile(this, K);
        if (sn02.e > ((sn0) objectVolatile).e) {
            objectVolatile = sn02;
        }
        hz0 hz0 = (hz0) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hz0.a;
            Object d = hz0.d();
            if (d == gz0.a) {
                break;
            }
            hz0 hz02 = (hz0) d;
            if (hz02 != null) {
                hz0 = hz02;
            } else if (hz0.g()) {
                break;
            }
        }
        return (sn0) hz0;
    }

    public final wc0 iterator() {
        return new wc0(this);
    }

    public final boolean j(Throwable th, boolean z2) {
        ad0 ad0;
        boolean z3;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = y;
        if (z2) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                sn0 sn0 = cd0.a;
                ad0 = this;
                if (atomicLongFieldUpdater.compareAndSet(ad0, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = ad0;
            }
        }
        ad0 = this;
        py2 py2 = cd0.s;
        while (true) {
            F.getClass();
            ad0 ad02 = ad0;
            Unsafe unsafe = y79.a;
            long j5 = H;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(ad02, j5, py2, th2);
            Unsafe unsafe2 = unsafe;
            ad0 = ad02;
            if (compareAndSwapObject) {
                z3 = true;
                break;
            } else if (unsafe2.getObjectVolatile(ad0, j5) != py2) {
                z3 = false;
                break;
            } else {
                th = th2;
            }
        }
        if (z2) {
            do {
                j3 = atomicLongFieldUpdater.get(ad0);
            } while (!atomicLongFieldUpdater.compareAndSet(ad0, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(ad0);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else if (i != 1) {
                    break;
                } else {
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(ad0, j, j2));
        }
        ad0.E();
        if (z3) {
            ad0.A();
        }
        return z3;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r1 = (defpackage.sn0) r1.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r7 = -1;
     */
    public final defpackage.sn0 k(long r12) {
        /*
            r11 = this;
            sn0 r0 = r11.i()
            boolean r1 = r11.F()
            r2 = 1
            r3 = -1
            if (r1 == 0) goto L_0x0056
            r1 = r0
        L_0x000d:
            int r4 = defpackage.cd0.b
            int r4 = r4 - r2
        L_0x0010:
            r5 = -1
            if (r3 >= r4) goto L_0x0046
            long r7 = r1.e
            int r9 = defpackage.cd0.b
            long r9 = (long) r9
            long r7 = r7 * r9
            long r9 = (long) r4
            long r7 = r7 + r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = z
            long r9 = r9.get(r11)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0028
        L_0x0026:
            r7 = r5
            goto L_0x004f
        L_0x0028:
            java.lang.Object r9 = r1.p(r4)
            if (r9 == 0) goto L_0x0038
            py2 r10 = defpackage.cd0.e
            if (r9 != r10) goto L_0x0033
            goto L_0x0038
        L_0x0033:
            py2 r10 = defpackage.cd0.d
            if (r9 != r10) goto L_0x0043
            goto L_0x004f
        L_0x0038:
            py2 r10 = defpackage.cd0.l
            boolean r9 = r1.o(r4, r9, r10)
            if (r9 == 0) goto L_0x0028
            r1.m()
        L_0x0043:
            int r4 = r4 + -1
            goto L_0x0010
        L_0x0046:
            hz0 r1 = r1.e()
            sn0 r1 = (defpackage.sn0) r1
            if (r1 != 0) goto L_0x000d
            goto L_0x0026
        L_0x004f:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            r11.l(r7)
        L_0x0056:
            r1 = 0
            r4 = r0
        L_0x0058:
            if (r4 == 0) goto L_0x00b7
            int r5 = defpackage.cd0.b
            int r5 = r5 - r2
        L_0x005d:
            if (r3 >= r5) goto L_0x00b0
            long r6 = r4.e
            int r8 = defpackage.cd0.b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r5
            long r6 = r6 + r8
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x00b7
        L_0x006b:
            java.lang.Object r6 = r4.p(r5)
            if (r6 == 0) goto L_0x00a2
            py2 r7 = defpackage.cd0.e
            if (r6 != r7) goto L_0x0076
            goto L_0x00a2
        L_0x0076:
            boolean r7 = r6 instanceof defpackage.h88
            if (r7 == 0) goto L_0x008e
            py2 r7 = defpackage.cd0.l
            boolean r7 = r4.o(r5, r6, r7)
            if (r7 == 0) goto L_0x006b
            h88 r6 = (defpackage.h88) r6
            g88 r6 = r6.a
            java.lang.Object r1 = defpackage.ar7.M(r1, r6)
            r4.q(r5, r2)
            goto L_0x00ad
        L_0x008e:
            boolean r7 = r6 instanceof defpackage.g88
            if (r7 == 0) goto L_0x00ad
            py2 r7 = defpackage.cd0.l
            boolean r7 = r4.o(r5, r6, r7)
            if (r7 == 0) goto L_0x006b
            java.lang.Object r1 = defpackage.ar7.M(r1, r6)
            r4.q(r5, r2)
            goto L_0x00ad
        L_0x00a2:
            py2 r7 = defpackage.cd0.l
            boolean r6 = r4.o(r5, r6, r7)
            if (r6 == 0) goto L_0x006b
            r4.m()
        L_0x00ad:
            int r5 = r5 + -1
            goto L_0x005d
        L_0x00b0:
            hz0 r4 = r4.e()
            sn0 r4 = (defpackage.sn0) r4
            goto L_0x0058
        L_0x00b7:
            if (r1 == 0) goto L_0x00d8
            boolean r12 = r1 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00c3
            g88 r1 = (defpackage.g88) r1
            r11.M(r1, r2)
            return r0
        L_0x00c3:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r12 = r1.size()
            int r12 = r12 - r2
        L_0x00ca:
            if (r3 >= r12) goto L_0x00d8
            java.lang.Object r13 = r1.get(r12)
            g88 r13 = (defpackage.g88) r13
            r11.M(r13, r2)
            int r12 = r12 + -1
            goto L_0x00ca
        L_0x00d8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad0.k(long):sn0");
    }

    public final void l(long j) {
        UndeliveredElementException e;
        D.getClass();
        sn0 sn0 = (sn0) y79.a.getObjectVolatile(this, K);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = z;
            long j2 = atomicLongFieldUpdater.get(r9);
            if (j >= Math.max(((long) r9.w) + j2, A.get(r9))) {
                ad0 ad0 = r9;
                if (atomicLongFieldUpdater.compareAndSet(ad0, j2, 1 + j2)) {
                    long j3 = (long) cd0.b;
                    long j4 = j2 / j3;
                    int i = (int) (j2 % j3);
                    if (sn0.e != j4) {
                        sn0 r = ad0.r(j4, sn0);
                        if (r != null) {
                            sn0 = r;
                        }
                    }
                    long j5 = j2;
                    sn0 sn02 = sn0;
                    Object Q = ad0.Q(sn02, i, j5, (Object) null);
                    if (Q != cd0.o) {
                        sn02.a();
                        vr2 vr2 = ad0.x;
                        if (!(vr2 == null || (e = l55.e(vr2, Q, (UndeliveredElementException) null)) == null)) {
                            throw e;
                        }
                    } else if (j5 < ad0.x()) {
                        sn02.a();
                    }
                    r9 = ad0;
                    sn0 = sn02;
                }
                r9 = ad0;
            } else {
                return;
            }
        }
    }

    public final void m() {
        ad0 ad0;
        if (!G()) {
            E.getClass();
            sn0 sn0 = (sn0) y79.a.getObjectVolatile(this, I);
            loop0:
            while (true) {
                long andIncrement = A.getAndIncrement(this);
                long j = (long) cd0.b;
                long j2 = andIncrement / j;
                if (this.x() <= andIncrement) {
                    if (sn0.e < j2 && sn0.c() != null) {
                        this.H(j2, sn0);
                    }
                    z(this);
                    return;
                }
                ad0 = this;
                if (sn0.e != j2) {
                    sn0 n = ad0.n(j2, sn0, andIncrement);
                    if (n == null) {
                        continue;
                        this = ad0;
                    } else {
                        sn0 = n;
                    }
                }
                int i = (int) (andIncrement % j);
                Object p = sn0.p(i);
                boolean z2 = p instanceof g88;
                AtomicLongFieldUpdater atomicLongFieldUpdater = z;
                if (!z2 || andIncrement < atomicLongFieldUpdater.get(ad0) || !sn0.o(i, p, cd0.g)) {
                    while (true) {
                        Object p2 = sn0.p(i);
                        if (!(p2 instanceof g88)) {
                            if (p2 != cd0.j) {
                                if (p2 != null) {
                                    if (p2 == cd0.d || p2 == cd0.h || p2 == cd0.i || p2 == cd0.k || p2 == cd0.l) {
                                        break loop0;
                                    } else if (p2 != cd0.f) {
                                        ta1.l("Unexpected cell state: ", p2);
                                        return;
                                    }
                                } else if (sn0.o(i, p2, cd0.e)) {
                                    break loop0;
                                }
                            } else {
                                break;
                            }
                        } else if (andIncrement < atomicLongFieldUpdater.get(ad0)) {
                            if (sn0.o(i, p2, new h88((g88) p2))) {
                                break loop0;
                            }
                        } else if (sn0.o(i, p2, cd0.g)) {
                            if (P(p2)) {
                                sn0.s(i, cd0.d);
                                break;
                            } else {
                                sn0.s(i, cd0.j);
                                sn0.m();
                            }
                        }
                    }
                } else if (P(p)) {
                    sn0.s(i, cd0.d);
                    break;
                } else {
                    sn0.s(i, cd0.j);
                    sn0.m();
                }
                z(ad0);
                this = ad0;
            }
            z(ad0);
        }
    }

    public final sn0 n(long j, sn0 sn0, long j2) {
        Object a;
        Unsafe unsafe;
        long j3 = j;
        sn0 sn02 = cd0.a;
        bd0 bd0 = bd0.D;
        sn0 sn03 = sn0;
        loop0:
        while (true) {
            a = gz0.a(sn03, j3, bd0);
            if (i35.k(a)) {
                break;
            }
            ri6 i = i35.i(a);
            while (true) {
                E.getClass();
                Unsafe unsafe2 = y79.a;
                long j4 = I;
                ri6 ri6 = (ri6) unsafe2.getObjectVolatile(this, j4);
                if (ri6.e >= i.e) {
                    break loop0;
                } else if (i.n()) {
                    do {
                        unsafe = y79.a;
                        if (unsafe.compareAndSwapObject(this, I, ri6, i)) {
                            if (ri6.j()) {
                                ri6.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == ri6);
                    if (i.j()) {
                        i.h();
                    }
                }
            }
        }
        if (i35.k(a)) {
            E();
            H(j, sn0);
            z(this);
            return null;
        }
        sn0 sn04 = (sn0) i35.i(a);
        long j5 = sn04.e;
        if (j5 <= j3) {
            return sn04;
        }
        long j6 = j2 + 1;
        long j7 = j5 * ((long) cd0.b);
        if (A.compareAndSet(this, j6, j7)) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = B;
            if ((atomicLongFieldUpdater.addAndGet(this, j7 - j2) & 4611686018427387904L) != 0) {
                do {
                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
            }
            return null;
        }
        z(this);
        return null;
    }

    public final void o(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(cancellationException, true);
    }

    public final Object p() {
        sn0 sn0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = z;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = y.get(this);
        if (C(true, j2)) {
            return new pn0(u());
        }
        int i = (j > (j2 & 1152921504606846975L) ? 1 : (j == (j2 & 1152921504606846975L) ? 0 : -1));
        qn0 qn0 = rn0.b;
        if (i >= 0) {
            return qn0;
        }
        py2 py2 = cd0.k;
        D.getClass();
        sn0 sn02 = (sn0) y79.a.getObjectVolatile(this, K);
        while (!this.D()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = (long) cd0.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (sn02.e != j4) {
                sn0 r = this.r(j4, sn02);
                if (r == null) {
                    continue;
                } else {
                    sn0 = r;
                }
            } else {
                sn0 = sn02;
            }
            ad0 ad0 = this;
            Object Q = ad0.Q(sn0, i2, andIncrement, py2);
            sn02 = sn0;
            g88 g88 = null;
            if (Q == cd0.m) {
                if (py2 instanceof g88) {
                    g88 = (g88) py2;
                }
                if (g88 != null) {
                    g88.b(sn02, i2);
                }
                ad0.S(andIncrement);
                sn02.m();
                return qn0;
            } else if (Q == cd0.o) {
                if (andIncrement < ad0.x()) {
                    sn02.a();
                }
                this = ad0;
            } else if (Q != cd0.n) {
                sn02.a();
                return Q;
            } else {
                h.s("unexpected");
                return null;
            }
        }
        return new pn0(this.u());
    }

    public final Object q(a97 a97) {
        return J(this, a97);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if (r8.j() == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d2, code lost:
        r8.h();
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0107 A[RETURN] */
    public final sn0 r(long j, sn0 sn0) {
        Object a;
        sn0 sn02;
        long j2;
        Unsafe unsafe;
        long j3 = j;
        sn0 sn03 = sn0;
        sn0 sn04 = cd0.a;
        bd0 bd0 = bd0.D;
        loop0:
        while (true) {
            a = gz0.a(sn03, j3, bd0);
            if (i35.k(a)) {
                break;
            }
            ri6 i = i35.i(a);
            while (true) {
                D.getClass();
                Unsafe unsafe2 = y79.a;
                long j4 = K;
                ri6 ri6 = (ri6) unsafe2.getObjectVolatile(this, j4);
                if (ri6.e >= i.e) {
                    break loop0;
                } else if (i.n()) {
                    do {
                        unsafe = y79.a;
                        if (unsafe.compareAndSwapObject(this, K, ri6, i)) {
                            if (ri6.j()) {
                                ri6.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == ri6);
                    if (i.j()) {
                        i.h();
                    }
                }
            }
        }
        if (i35.k(a)) {
            E();
            if (sn03.e * ((long) cd0.b) < x()) {
                sn03.a();
                return null;
            }
        } else {
            sn0 sn05 = (sn0) i35.i(a);
            long j5 = sn05.e;
            if (!G() && j3 <= A.get(this) / ((long) cd0.b)) {
                while (true) {
                    E.getClass();
                    Unsafe unsafe3 = y79.a;
                    long j6 = I;
                    ri6 ri62 = (ri6) unsafe3.getObjectVolatile(this, j6);
                    if (ri62.e >= j5 || !sn05.n()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = y79.a;
                        sn02 = sn05;
                        if (unsafe4.compareAndSwapObject(this, I, ri62, sn05)) {
                            if (ri62.j()) {
                                ri62.h();
                            }
                        } else if (unsafe4.getObjectVolatile(this, j6) != ri62) {
                            break;
                        } else {
                            sn05 = sn02;
                        }
                    }
                    sn05 = sn02;
                }
                if (j5 > j3) {
                    return sn02;
                }
                long j7 = j5 * ((long) cd0.b);
                do {
                    j2 = z.get(this);
                    if (j2 >= j7 || z.compareAndSet(this, j2, j7)) {
                    }
                    j2 = z.get(this);
                    break;
                } while (z.compareAndSet(this, j2, j7));
                if (j5 * ((long) cd0.b) < x()) {
                    sn02.a();
                }
            }
            sn02 = sn05;
            if (j5 > j3) {
            }
        }
        return null;
    }

    public final Object s(fu0 fu0) {
        return K(this, fu0);
    }

    public final sn0 t(long j, sn0 sn0) {
        Object a;
        long j2;
        long j3;
        Unsafe unsafe;
        long j4 = j;
        sn0 sn02 = sn0;
        sn0 sn03 = cd0.a;
        bd0 bd0 = bd0.D;
        loop0:
        while (true) {
            a = gz0.a(sn02, j4, bd0);
            if (i35.k(a)) {
                break;
            }
            ri6 i = i35.i(a);
            while (true) {
                C.getClass();
                Unsafe unsafe2 = y79.a;
                long j5 = L;
                ri6 ri6 = (ri6) unsafe2.getObjectVolatile(this, j5);
                if (ri6.e >= i.e) {
                    break loop0;
                } else if (i.n()) {
                    do {
                        unsafe = y79.a;
                        if (unsafe.compareAndSwapObject(this, L, ri6, i)) {
                            if (ri6.j()) {
                                ri6.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j5) == ri6);
                    if (i.j()) {
                        i.h();
                    }
                }
            }
        }
        boolean k = i35.k(a);
        AtomicLongFieldUpdater atomicLongFieldUpdater = z;
        if (k) {
            E();
            if (sn02.e * ((long) cd0.b) < atomicLongFieldUpdater.get(this)) {
                sn02.a();
                return null;
            }
        } else {
            sn0 sn04 = (sn0) i35.i(a);
            long j6 = sn04.e;
            if (j6 <= j4) {
                return sn04;
            }
            long j7 = j6 * ((long) cd0.b);
            do {
                j2 = y.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j7) {
                    break;
                }
            } while (!y.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j6 * ((long) cd0.b) < atomicLongFieldUpdater.get(this)) {
                sn04.a();
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [hz0] */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ab, code lost:
        r15 = r8;
        r3 = r3.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b3, code lost:
        if (r3 != null) goto L_0x01d1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final String toString() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (y.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.w + ',');
        sb.append("data=[");
        D.getClass();
        Unsafe unsafe = y79.a;
        int i3 = 0;
        C.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, L);
        int i4 = 1;
        E.getClass();
        List E2 = sg3.E(unsafe.getObjectVolatile(this, K), objectVolatile, unsafe.getObjectVolatile(this, I));
        ArrayList arrayList = new ArrayList();
        for (Object next : E2) {
            if (((sn0) next) != cd0.a) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next2 = it.next();
            if (!it.hasNext()) {
                sn0 sn0 = (sn0) next2;
                long j = z.get(this);
                long x2 = x();
            } else {
                long j2 = ((sn0) next2).e;
                do {
                    Object next3 = it.next();
                    long j3 = ((sn0) next3).e;
                    if (j2 > j3) {
                        next2 = next3;
                        j2 = j3;
                    }
                } while (it.hasNext());
            }
            sn0 sn02 = (sn0) next2;
            long j4 = z.get(this);
            long x22 = x();
            loop2:
            while (true) {
                int i5 = cd0.b;
                int i6 = i3;
                while (true) {
                    if (i6 >= i5) {
                        break;
                    }
                    i = i4;
                    long j5 = (sn02.e * ((long) cd0.b)) + ((long) i6);
                    int i7 = (j5 > x22 ? 1 : (j5 == x22 ? 0 : -1));
                    if (i7 >= 0 && j5 >= j4) {
                        break loop2;
                    }
                    Object p = sn02.p(i6);
                    Object obj = sn02.h.get(i6 * 2);
                    if (p instanceof ik0) {
                        if (x22 <= j5 && j5 < j4) {
                            str = "receive";
                        } else if (j4 > j5 || i7 >= 0) {
                            str = "cont";
                        } else {
                            str = "send";
                        }
                    } else if (p instanceof vx5) {
                        str = "receiveCatching";
                    } else if (p instanceof h88) {
                        str = "EB(" + p + ')';
                    } else if (sg3.e(p, cd0.f) || sg3.e(p, cd0.g)) {
                        str = "resuming_sender";
                    } else {
                        if (p != null && !p.equals(cd0.e) && !p.equals(cd0.i) && !p.equals(cd0.h) && !p.equals(cd0.k) && !p.equals(cd0.j) && !p.equals(cd0.l)) {
                            str = p.toString();
                        }
                        i6++;
                        i4 = i;
                    }
                    if (obj != null) {
                        sb.append("(" + str + ',' + obj + "),");
                    } else {
                        sb.append(str + ',');
                    }
                    i6++;
                    i4 = i;
                }
                i4 = i;
                i3 = 0;
            }
            if (d57.J0(sb) == ',') {
                sb.deleteCharAt(sb.length() - i).getClass();
            }
            sb.append("]");
            return sb.toString();
        }
        rf2.c();
        return null;
    }

    public final Throwable u() {
        F.getClass();
        return (Throwable) y79.a.getObjectVolatile(this, H);
    }

    public final Throwable v() {
        Throwable u = u();
        if (u == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return u;
    }

    public final Throwable w() {
        Throwable u = u();
        if (u == null) {
            return new IllegalStateException("Channel was closed");
        }
        return u;
    }

    public final long x() {
        return y.get(this) & 1152921504606846975L;
    }

    public final boolean y() {
        while (true) {
            D.getClass();
            Unsafe unsafe = y79.a;
            long j = K;
            sn0 sn0 = (sn0) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = z;
            long j2 = atomicLongFieldUpdater.get(this);
            if (x() <= j2) {
                return false;
            }
            long j3 = (long) cd0.b;
            long j4 = j2 / j3;
            if (sn0.e == j4 || (sn0 = r(j4, sn0)) != null) {
                sn0.a();
                int i = (int) (j2 % j3);
                while (true) {
                    Object p = sn0.p(i);
                    if (p == null || p == cd0.e) {
                        if (sn0.o(i, p, cd0.h)) {
                            m();
                            break;
                        }
                    } else if (p == cd0.d) {
                        return true;
                    } else {
                        if (p != cd0.j && p != cd0.l && p != cd0.i && p != cd0.h) {
                            if (p == cd0.g) {
                                return true;
                            }
                            if (p != cd0.f && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                z.compareAndSet(this, j2, j2 + 1);
            } else if (((sn0) unsafe.getObjectVolatile(this, j)).e < j4) {
                return false;
            }
        }
    }
}
