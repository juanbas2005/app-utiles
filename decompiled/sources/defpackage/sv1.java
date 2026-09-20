package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: sv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sv1 extends vv1 implements q81, f61 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    public static final /* synthetic */ long E;
    public final h61 A;
    public Object B = tv1.a;
    public final Object C;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final h81 z;

    static {
        Class<sv1> cls = sv1.class;
        D = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_reusableCancellableContinuation$volatile");
        E = y79.a.objectFieldOffset(cls.getDeclaredField("_reusableCancellableContinuation$volatile"));
    }

    public sv1(h81 h81, h61 h61) {
        super(-1);
        this.z = h81;
        this.A = h61;
        this.C = gh7.b(h61.r());
    }

    public final q81 e() {
        return this.A;
    }

    public final void f(Object obj) {
        Object obj2;
        e81 r;
        Object c;
        Throwable a = o66.a(obj);
        if (a == null) {
            obj2 = obj;
        } else {
            obj2 = new av0(a, false);
        }
        h61 h61 = this.A;
        e81 r2 = h61.r();
        h81 h81 = this.z;
        if (tv1.c(h81, r2)) {
            this.B = obj2;
            this.y = 0;
            tv1.b(h81, h61.r(), this);
            return;
        }
        i72 a2 = ih7.a();
        if (a2.y >= 4294967296L) {
            this.B = obj2;
            this.y = 0;
            a2.p0(this);
            return;
        }
        a2.q0(true);
        try {
            r = h61.r();
            c = gh7.c(r, this.C);
            h61.f(obj);
            gh7.a(r, c);
            do {
            } while (a2.s0());
        } catch (Throwable th) {
            a2.o0(true);
            throw th;
        }
        a2.o0(true);
    }

    public final Object j() {
        Object obj = this.B;
        this.B = tv1.a;
        return obj;
    }

    public final void k() {
        do {
            D.getClass();
        } while (y79.a.getObjectVolatile(this, E) == tv1.b);
    }

    public final kk0 l() {
        sv1 sv1;
        while (true) {
            D.getClass();
            Unsafe unsafe = y79.a;
            long j = E;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            py2 py2 = tv1.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, py2);
                return null;
            }
            if (objectVolatile instanceof kk0) {
                while (true) {
                    Unsafe unsafe2 = y79.a;
                    sv1 = this;
                    if (unsafe2.compareAndSwapObject(sv1, E, objectVolatile, py2)) {
                        return (kk0) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(sv1, j) != objectVolatile) {
                        break;
                    }
                    this = sv1;
                }
            } else {
                sv1 = this;
                if (objectVolatile != py2 && !(objectVolatile instanceof Throwable)) {
                    ta1.l("Inconsistent state ", objectVolatile);
                    return null;
                }
            }
            this = sv1;
        }
    }

    public final kk0 m() {
        D.getClass();
        Object objectVolatile = y79.a.getObjectVolatile(this, E);
        if (objectVolatile instanceof kk0) {
            return (kk0) objectVolatile;
        }
        return null;
    }

    public final boolean o() {
        D.getClass();
        if (y79.a.getObjectVolatile(this, E) != null) {
            return true;
        }
        return false;
    }

    public final boolean p(Throwable th) {
        Throwable th2;
        sv1 sv1;
        Unsafe unsafe;
        while (true) {
            D.getClass();
            Unsafe unsafe2 = y79.a;
            long j = E;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            py2 py2 = tv1.b;
            if (sg3.e(objectVolatile, py2)) {
                while (true) {
                    Unsafe unsafe3 = y79.a;
                    sv1 sv12 = this;
                    th2 = th;
                    sv1 = sv12;
                    if (unsafe3.compareAndSwapObject(sv12, E, py2, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(sv1, j) != py2) {
                        break;
                    }
                    this = sv1;
                    th = th2;
                }
            } else {
                sv1 = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = y79.a;
                    if (unsafe.compareAndSwapObject(sv1, E, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(sv1, j) == objectVolatile);
            }
            this = sv1;
            th = th2;
        }
    }

    public final Throwable q(kk0 kk0) {
        Unsafe unsafe;
        kk0 kk02;
        sv1 sv1;
        while (true) {
            D.getClass();
            Unsafe unsafe2 = y79.a;
            long j = E;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            py2 py2 = tv1.b;
            if (objectVolatile == py2) {
                while (true) {
                    Unsafe unsafe3 = y79.a;
                    sv1 sv12 = this;
                    kk02 = kk0;
                    sv1 = sv12;
                    if (unsafe3.compareAndSwapObject(sv12, E, py2, kk02)) {
                        return null;
                    }
                    if (unsafe3.getObjectVolatile(sv1, j) != py2) {
                        break;
                    }
                    this = sv1;
                    kk0 = kk02;
                }
            } else {
                sv1 sv13 = this;
                if (objectVolatile instanceof Throwable) {
                    do {
                        unsafe = y79.a;
                        if (unsafe.compareAndSwapObject(sv13, E, objectVolatile, (Object) null)) {
                            return (Throwable) objectVolatile;
                        }
                    } while (unsafe.getObjectVolatile(sv13, j) == objectVolatile);
                    h.q("Failed requirement.");
                    return null;
                }
                ta1.l("Inconsistent state ", objectVolatile);
                return null;
            }
            this = sv1;
            kk0 = kk02;
        }
    }

    public final e81 r() {
        return this.A.r();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.z + ", " + rj1.K(this.A) + ']';
    }

    public final f61 d() {
        return this;
    }
}
