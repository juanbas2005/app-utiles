package defpackage;

import io.ktor.utils.io.ConcurrentIOException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: af0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class af0 implements hf0, fg0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public static final /* synthetic */ AtomicReferenceFieldUpdater g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    volatile /* synthetic */ Object _closedCause = null;
    public final tc0 b = new Object();
    public final Object c = new Object();
    public final tc0 d = new Object();
    public final tc0 e = new Object();
    private volatile int flushBufferSize;
    volatile /* synthetic */ Object suspensionSlot = qe0.b;

    static {
        Class<af0> cls = af0.class;
        Class<Object> cls2 = Object.class;
        f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "suspensionSlot");
        Unsafe unsafe = y79.a;
        i = unsafe.objectFieldOffset(cls.getDeclaredField("suspensionSlot"));
        g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closedCause");
        h = unsafe.objectFieldOffset(cls.getDeclaredField("_closedCause"));
    }

    public final void a(Throwable th) {
        af0 af0;
        if (this._closedCause == null) {
            js0 js0 = new js0(th);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = y79.a;
                long j = h;
                af0 = this;
                if (!unsafe.compareAndSwapObject(af0, j, (Object) null, js0) && unsafe.getObjectVolatile(af0, j) == null) {
                    this = af0;
                }
            }
            af0.k(js0.a(is0.D));
        }
    }

    public final Throwable b() {
        js0 js0 = (js0) this._closedCause;
        if (js0 != null) {
            return js0.a(is0.D);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    public final Object c(h61 h61) {
        we0 we0;
        p81 p81;
        int i2;
        int i3;
        Object obj;
        af0 af0;
        int i4;
        we0 we02;
        boolean z;
        we0 we03;
        kk0 kk0;
        ue0 ue0;
        te0 te0;
        h61 h612 = h61;
        qe0 qe0 = qe0.b;
        vs7 vs7 = vs7.a;
        if (h612 instanceof we0) {
            we0 = (we0) h612;
            int i5 = we0.D;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                we0.D = i5 - Integer.MIN_VALUE;
                Object obj2 = we0.B;
                p81 = p81.w;
                i2 = we0.D;
                Object obj3 = null;
                i3 = 1;
                if (i2 != 0) {
                    o85.q(obj2);
                    Throwable b2 = b();
                    if (b2 == null) {
                        l();
                        if (this.flushBufferSize >= 1048576) {
                            af0 = this;
                            i4 = 0;
                            we02 = we0;
                        }
                        return vs7;
                    }
                    throw b2;
                } else if (i2 == 1) {
                    int i6 = we0.A;
                    af0 af02 = we0.z;
                    o85.q(obj2);
                    we02 = we0;
                    i4 = i6;
                    af0 = af02;
                    obj = null;
                    obj3 = obj;
                    i3 = 1;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (this.flushBufferSize >= 1048576 && this._closedCause == null) {
                    we02.z = af0;
                    we02.A = i4;
                    we02.D = i3;
                    kk0 kk02 = new kk0(i3, rc9.a0(we02));
                    kk02.v();
                    te0 te02 = new te0(kk02);
                    ue0 ue02 = (ue0) af0.suspensionSlot;
                    z = ue02 instanceof pe0;
                    if (!z) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                        while (true) {
                            atomicReferenceFieldUpdater.getClass();
                            Unsafe unsafe = y79.a;
                            long j = i;
                            te0 te03 = te02;
                            ue0 ue03 = ue02;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(af0, j, ue03, te03);
                            we03 = we02;
                            long j2 = j;
                            obj = obj3;
                            Unsafe unsafe2 = unsafe;
                            ue0 = ue03;
                            te0 = te03;
                            if (!compareAndSwapObject) {
                                if (unsafe2.getObjectVolatile(af0, j2) != ue0) {
                                    te0.b();
                                    break;
                                }
                                obj3 = obj;
                                te02 = te0;
                                ue02 = ue0;
                                we02 = we03;
                            }
                            break;
                        }
                        if (ue0 instanceof te0) {
                            se0 se0 = (se0) ue0;
                            se0.a(new ConcurrentIOException("write", se0.c()));
                        } else if (!(ue0 instanceof se0)) {
                            if (!z) {
                                if (!sg3.e(ue0, qe0)) {
                                    h.c();
                                    return obj;
                                }
                            }
                            te0.a(((pe0) ue0).b);
                        } else {
                            ((se0) ue0).b();
                        }
                        if (this.flushBufferSize < 1048576 || this._closedCause != null) {
                            ue0 ue04 = (ue0) af0.suspensionSlot;
                            if (ue04 instanceof te0) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                                while (true) {
                                    atomicReferenceFieldUpdater2.getClass();
                                    kk0 kk03 = kk02;
                                    Unsafe unsafe3 = y79.a;
                                    long j3 = i;
                                    kk0 = kk03;
                                    if (unsafe3.compareAndSwapObject(af0, j3, ue04, qe0)) {
                                        ((se0) ue04).b();
                                        break;
                                    }
                                    if (unsafe3.getObjectVolatile(af0, j3) != ue04) {
                                        break;
                                    }
                                    kk02 = kk0;
                                }
                                if (kk0.t() == p81) {
                                    return p81;
                                }
                                we02 = we03;
                                obj3 = obj;
                                i3 = 1;
                                we02.z = af0;
                                we02.A = i4;
                                we02.D = i3;
                                kk0 kk022 = new kk0(i3, rc9.a0(we02));
                                kk022.v();
                                te0 te022 = new te0(kk022);
                                ue0 ue022 = (ue0) af0.suspensionSlot;
                                z = ue022 instanceof pe0;
                                if (!z) {
                                    ue0 = ue022;
                                    obj = obj3;
                                    we03 = we02;
                                    te0 = te022;
                                    if (ue0 instanceof te0) {
                                    }
                                    ue0 ue042 = (ue0) af0.suspensionSlot;
                                    if (ue042 instanceof te0) {
                                    }
                                }
                                return p81;
                            }
                        }
                    }
                    kk0 = kk022;
                    if (kk0.t() == p81) {
                    }
                    return p81;
                }
                return vs7;
            }
        }
        we0 = new we0(this, h612);
        Object obj22 = we0.B;
        p81 = p81.w;
        i2 = we0.D;
        Object obj32 = null;
        i3 = 1;
        if (i2 != 0) {
        }
        we02.z = af0;
        we02.A = i4;
        we02.D = i3;
        kk0 kk0222 = new kk0(i3, rc9.a0(we02));
        kk0222.v();
        te0 te0222 = new te0(kk0222);
        ue0 ue0222 = (ue0) af0.suspensionSlot;
        z = ue0222 instanceof pe0;
        if (!z) {
        }
        kk0 = kk0222;
        if (kk0.t() == p81) {
        }
        return p81;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    public final Object d(int i2, h61 h61) {
        ve0 ve0;
        int i3;
        Object obj;
        af0 af0;
        int i4;
        ve0 ve02;
        int i5;
        long j;
        boolean z;
        int i6;
        kk0 kk0;
        re0 re0;
        ue0 ue0;
        boolean z2;
        h61 h612 = h61;
        qe0 qe0 = qe0.b;
        if (h612 instanceof ve0) {
            ve0 = (ve0) h612;
            int i7 = ve0.E;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ve0.E = i7 - Integer.MIN_VALUE;
                Object obj2 = ve0.C;
                p81 p81 = p81.w;
                i3 = ve0.E;
                Object obj3 = null;
                int i8 = 1;
                if (i3 != 0) {
                    o85.q(obj2);
                    Throwable b2 = b();
                    if (b2 == null) {
                        int i9 = i2;
                        if (this.d.y >= ((long) i9)) {
                            return Boolean.TRUE;
                        }
                        af0 = this;
                        i5 = i9;
                        ve02 = ve0;
                        i4 = 0;
                    } else {
                        throw b2;
                    }
                } else if (i3 == 1) {
                    int i10 = ve0.A;
                    int i11 = ve0.z;
                    af0 af02 = ve0.B;
                    o85.q(obj2);
                    ve02 = ve0;
                    i4 = i10;
                    i5 = i11;
                    af0 = af02;
                    obj = null;
                    obj3 = obj;
                    i8 = 1;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = (long) i5;
                if (((long) this.flushBufferSize) + this.d.y >= j || this._closedCause != null) {
                    if (this.d.y < 1048576) {
                        m();
                    }
                    if (this.d.y >= j) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                ve02.B = af0;
                ve02.z = i5;
                ve02.A = i4;
                ve02.E = i8;
                kk0 kk02 = new kk0(i8, rc9.a0(ve02));
                kk02.v();
                re0 re02 = new re0(kk02);
                ue0 ue02 = (ue0) af0.suspensionSlot;
                boolean z3 = ue02 instanceof pe0;
                if (!z3) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    while (true) {
                        atomicReferenceFieldUpdater.getClass();
                        boolean z4 = z3;
                        Unsafe unsafe = y79.a;
                        boolean z5 = z4;
                        long j2 = i;
                        re0 re03 = re02;
                        z2 = z5;
                        ue0 ue03 = ue02;
                        boolean compareAndSwapObject = unsafe.compareAndSwapObject(af0, j2, ue03, re03);
                        obj = obj3;
                        Unsafe unsafe2 = unsafe;
                        ue0 = ue03;
                        re0 = re03;
                        i6 = i5;
                        long j3 = j2;
                        if (!compareAndSwapObject) {
                            if (unsafe2.getObjectVolatile(af0, j3) != ue0) {
                                re0.b();
                                break;
                            }
                            re0 re04 = re0;
                            z3 = z2;
                            re02 = re04;
                            ue02 = ue0;
                            i5 = i6;
                            obj3 = obj;
                        }
                        break;
                    }
                } else {
                    boolean z6 = z3;
                    re0 = re02;
                    z2 = z6;
                    obj = obj3;
                    i6 = i5;
                    ue0 = ue02;
                    if (ue0 instanceof re0) {
                        se0 se0 = (se0) ue0;
                        se0.a(new ConcurrentIOException("read", se0.c()));
                    } else if (!(ue0 instanceof se0)) {
                        if (!z2) {
                            if (!sg3.e(ue0, qe0)) {
                                h.c();
                                return obj;
                            }
                        }
                        re0.a(((pe0) ue0).b);
                    } else {
                        ((se0) ue0).b();
                    }
                    if (((long) this.flushBufferSize) + this.d.y >= j || this._closedCause != null) {
                        ue0 ue04 = (ue0) af0.suspensionSlot;
                        if (ue04 instanceof re0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                            while (true) {
                                atomicReferenceFieldUpdater2.getClass();
                                kk0 kk03 = kk02;
                                Unsafe unsafe3 = y79.a;
                                long j4 = i;
                                kk0 = kk03;
                                if (unsafe3.compareAndSwapObject(af0, j4, ue04, qe0)) {
                                    ((se0) ue04).b();
                                    break;
                                }
                                if (unsafe3.getObjectVolatile(af0, j4) != ue04) {
                                    break;
                                }
                                kk02 = kk0;
                            }
                            if (kk0.t() != p81) {
                                return p81;
                            }
                            i5 = i6;
                            obj3 = obj;
                            i8 = 1;
                            j = (long) i5;
                            if (((long) this.flushBufferSize) + this.d.y >= j || this._closedCause != null) {
                            }
                            return p81;
                        }
                    }
                }
                kk0 = kk02;
                if (kk0.t() != p81) {
                }
                return p81;
            }
        }
        ve0 = new ve0(this, h612);
        Object obj22 = ve0.C;
        p81 p812 = p81.w;
        i3 = ve0.E;
        Object obj32 = null;
        int i82 = 1;
        if (i3 != 0) {
        }
        j = (long) i5;
        if (((long) this.flushBufferSize) + this.d.y >= j || this._closedCause != null) {
        }
    }

    public final tc0 e() {
        Throwable a;
        if (this._closedCause == null) {
            return this.e;
        }
        js0 js0 = (js0) this._closedCause;
        if (js0 == null || (a = js0.a(ze0.D)) == null) {
            throw new IOException((String) null, (Throwable) null);
        }
        throw a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object f(f61 f61) {
        xe0 xe0;
        int i2;
        js0 js0;
        af0 af0;
        boolean compareAndSwapObject;
        if (f61 instanceof xe0) {
            xe0 = (xe0) f61;
            int i3 = xe0.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xe0.B = i3 - Integer.MIN_VALUE;
                Object obj = xe0.z;
                i2 = xe0.B;
                if (i2 != 0) {
                    o85.q(obj);
                    xe0.B = 1;
                    Object c2 = c(xe0);
                    p81 p81 = p81.w;
                    if (c2 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable unused) {
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js0 = t49.b;
                while (true) {
                    g.getClass();
                    Unsafe unsafe = y79.a;
                    long j = h;
                    af0 = this;
                    compareAndSwapObject = unsafe.compareAndSwapObject(af0, j, (Object) null, js0);
                    vs7 vs7 = vs7.a;
                    if (!compareAndSwapObject) {
                        af0.k((Throwable) null);
                        return vs7;
                    } else if (unsafe.getObjectVolatile(af0, j) != null) {
                        return vs7;
                    } else {
                        this = af0;
                    }
                }
            }
        }
        xe0 = new xe0(this, f61);
        Object obj2 = xe0.z;
        i2 = xe0.B;
        if (i2 != 0) {
        }
        js0 = t49.b;
        while (true) {
            g.getClass();
            Unsafe unsafe2 = y79.a;
            long j2 = h;
            af0 = this;
            compareAndSwapObject = unsafe2.compareAndSwapObject(af0, j2, (Object) null, js0);
            vs7 vs72 = vs7.a;
            if (!compareAndSwapObject) {
            }
            this = af0;
        }
    }

    public final tc0 g() {
        Throwable a;
        js0 js0 = (js0) this._closedCause;
        if (js0 == null || (a = js0.a(ye0.D)) == null) {
            if (this.d.x()) {
                m();
            }
            return this.d;
        }
        throw a;
    }

    public final boolean h() {
        if (b() != null) {
            return true;
        }
        if (this._closedCause == null || this.flushBufferSize != 0 || !this.d.x()) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final void j() {
        l();
        js0 js0 = t49.b;
        while (true) {
            g.getClass();
            Unsafe unsafe = y79.a;
            long j = h;
            af0 af0 = this;
            if (unsafe.compareAndSwapObject(af0, j, (Object) null, js0)) {
                af0.k((Throwable) null);
                return;
            } else if (unsafe.getObjectVolatile(af0, j) == null) {
                this = af0;
            } else {
                return;
            }
        }
    }

    public final void k(Throwable th) {
        pe0 pe0;
        if (th != null) {
            pe0 = new pe0(th);
        } else {
            ue0.a.getClass();
            pe0 = xb4.O;
        }
        f.getClass();
        ue0 ue0 = (ue0) y79.a.getAndSetObject(this, i, pe0);
        if (ue0 instanceof se0) {
            ((se0) ue0).a(th);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void l() {
        if (!this.e.x()) {
            synchronized (this.c) {
                try {
                    tc0 tc0 = this.e;
                    this.b.u(tc0);
                    this.flushBufferSize += (int) tc0.y;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ue0 ue0 = (ue0) this.suspensionSlot;
            if (ue0 instanceof re0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                qe0 qe0 = qe0.b;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = y79.a;
                    long j = i;
                    af0 af0 = this;
                    if (unsafe.compareAndSwapObject(af0, j, ue0, qe0)) {
                        ((se0) ue0).b();
                        return;
                    } else if (unsafe.getObjectVolatile(af0, j) == ue0) {
                        this = af0;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void m() {
        synchronized (this.c) {
            try {
                this.b.v(this.d);
                this.flushBufferSize = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        ue0 ue0 = (ue0) this.suspensionSlot;
        if (ue0 instanceof te0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            qe0 qe0 = qe0.b;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = y79.a;
                long j = i;
                af0 af0 = this;
                if (unsafe.compareAndSwapObject(af0, j, ue0, qe0)) {
                    ((se0) ue0).b();
                    return;
                } else if (unsafe.getObjectVolatile(af0, j) == ue0) {
                    this = af0;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
