package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: kk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class kk0 extends vv1 implements ik0, q81, g88 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B;
    public static final /* synthetic */ AtomicReferenceFieldUpdater C;
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    public static final /* synthetic */ long E;
    public static final /* synthetic */ long F;
    public final e81 A;
    private volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile = i8.a;
    public final f61 z;

    static {
        Class<kk0> cls = kk0.class;
        B = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex$volatile");
        Class<Object> cls2 = Object.class;
        C = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        Unsafe unsafe = y79.a;
        F = unsafe.objectFieldOffset(cls.getDeclaredField("_state$volatile"));
        D = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
        E = unsafe.objectFieldOffset(cls.getDeclaredField("_parentHandle$volatile"));
    }

    public kk0(int i, f61 f61) {
        super(i);
        this.z = f61;
        this.A = f61.r();
    }

    public static void A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object H(o05 o05, Object obj, int i, hs2 hs2) {
        fk0 fk0;
        if (obj instanceof av0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (hs2 == null && !(o05 instanceof fk0)) {
            return obj;
        }
        if (o05 instanceof fk0) {
            fk0 = (fk0) o05;
        } else {
            fk0 = null;
        }
        return new yu0(obj, fk0, hs2, (Throwable) null, 16);
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        sv1 sv1;
        Throwable q;
        f61 f61 = this.z;
        if (f61 instanceof sv1) {
            sv1 = (sv1) f61;
        } else {
            sv1 = null;
        }
        if (sv1 != null && (q = sv1.q(this)) != null) {
            o();
            a(q);
        }
    }

    public final boolean D() {
        C.getClass();
        Unsafe unsafe = y79.a;
        long j = F;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (!(objectVolatile instanceof yu0) || ((yu0) objectVolatile).d == null) {
            B.set(this, 536870911);
            unsafe.putObjectVolatile(this, j, i8.a);
            return true;
        }
        o();
        return false;
    }

    public final void E(vr2 vr2, Object obj) {
        jk0 jk0;
        int i = this.y;
        if (vr2 != null) {
            jk0 = new jk0(0, vr2);
        } else {
            jk0 = null;
        }
        F(obj, i, jk0);
    }

    public final void F(Object obj, int i, hs2 hs2) {
        kk0 kk0;
        while (true) {
            C.getClass();
            Unsafe unsafe = y79.a;
            long j = F;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof o05) {
                Object H = H((o05) objectVolatile, obj, i, hs2);
                while (true) {
                    Unsafe unsafe2 = y79.a;
                    kk0 = this;
                    if (unsafe2.compareAndSwapObject(kk0, F, objectVolatile, H)) {
                        if (!kk0.z()) {
                            kk0.o();
                        }
                        kk0.p(i);
                        return;
                    } else if (unsafe2.getObjectVolatile(kk0, j) != objectVolatile) {
                        break;
                    } else {
                        this = kk0;
                    }
                }
            } else {
                kk0 kk02 = this;
                if (objectVolatile instanceof ok0) {
                    ok0 ok0 = (ok0) objectVolatile;
                    if (ok0.c.compareAndSet(ok0, 0, 1)) {
                        if (hs2 != null) {
                            kk02.l(hs2, ok0.a, obj);
                            return;
                        }
                        return;
                    }
                }
                ta1.l("Already resumed, but proposed with update ", obj);
                return;
            }
            this = kk0;
        }
    }

    public final void G(h81 h81) {
        sv1 sv1;
        h81 h812;
        int i;
        f61 f61 = this.z;
        if (f61 instanceof sv1) {
            sv1 = (sv1) f61;
        } else {
            sv1 = null;
        }
        if (sv1 != null) {
            h812 = sv1.z;
        } else {
            h812 = null;
        }
        if (h812 == h81) {
            i = 4;
        } else {
            i = this.y;
        }
        F(vs7.a, i, (hs2) null);
    }

    public final py2 I(Object obj, hs2 hs2) {
        kk0 kk0;
        while (true) {
            C.getClass();
            Unsafe unsafe = y79.a;
            long j = F;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof o05)) {
                return null;
            }
            Object H = H((o05) objectVolatile, obj, this.y, hs2);
            while (true) {
                Unsafe unsafe2 = y79.a;
                kk0 = this;
                if (unsafe2.compareAndSwapObject(kk0, F, objectVolatile, H)) {
                    boolean z2 = kk0.z();
                    py2 py2 = lk0.a;
                    if (!z2) {
                        kk0.o();
                    }
                    return py2;
                } else if (unsafe2.getObjectVolatile(kk0, j) != objectVolatile) {
                    break;
                } else {
                    this = kk0;
                }
            }
            this = kk0;
        }
    }

    public final void J(Object obj, hs2 hs2) {
        F(obj, this.y, hs2);
    }

    public final void N(Object obj) {
        p(this.y);
    }

    public final boolean a(Throwable th) {
        Throwable th2;
        kk0 kk0;
        while (true) {
            C.getClass();
            Unsafe unsafe = y79.a;
            long j = F;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            boolean z2 = false;
            if (!(objectVolatile instanceof o05)) {
                return false;
            }
            if ((objectVolatile instanceof fk0) || (objectVolatile instanceof ri6)) {
                z2 = true;
            }
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            av0 av0 = new av0(th2, z2);
            while (true) {
                Unsafe unsafe2 = y79.a;
                kk0 = this;
                if (unsafe2.compareAndSwapObject(kk0, F, objectVolatile, av0)) {
                    o05 o05 = (o05) objectVolatile;
                    if (o05 instanceof fk0) {
                        kk0.k((fk0) objectVolatile, th);
                    } else if (o05 instanceof ri6) {
                        kk0.m((ri6) objectVolatile, th);
                    }
                    if (!kk0.z()) {
                        kk0.o();
                    }
                    kk0.p(kk0.y);
                    return true;
                } else if (unsafe2.getObjectVolatile(kk0, j) != objectVolatile) {
                    break;
                } else {
                    this = kk0;
                }
            }
            this = kk0;
        }
    }

    public final void b(ri6 ri6, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = B;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                h.s("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        y(ri6);
    }

    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        kk0 kk0;
        while (true) {
            C.getClass();
            Unsafe unsafe = y79.a;
            long j = F;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof o05) {
                h.s("Not completed");
                return;
            } else if (!(objectVolatile instanceof av0)) {
                if (objectVolatile instanceof yu0) {
                    yu0 yu0 = (yu0) objectVolatile;
                    if (yu0.e == null) {
                        yu0 a = yu0.a(yu0, (fk0) null, cancellationException, 15);
                        while (true) {
                            Unsafe unsafe2 = y79.a;
                            kk0 kk02 = this;
                            kk0 kk03 = kk02;
                            if (unsafe2.compareAndSwapObject(kk02, F, objectVolatile, a)) {
                                fk0 fk0 = yu0.b;
                                if (fk0 != null) {
                                    kk03.k(fk0, cancellationException);
                                }
                                hs2 hs2 = yu0.c;
                                if (hs2 != null) {
                                    kk03.l(hs2, cancellationException, yu0.a);
                                    return;
                                }
                                return;
                            } else if (unsafe2.getObjectVolatile(kk03, j) != objectVolatile) {
                                cancellationException2 = cancellationException;
                                kk0 = kk03;
                                break;
                            } else {
                                this = kk03;
                            }
                        }
                    } else {
                        h.s("Must be called at most once");
                        return;
                    }
                } else {
                    kk0 kk04 = this;
                    Object obj = objectVolatile;
                    CancellationException cancellationException3 = cancellationException;
                    yu0 yu02 = new yu0(obj, (fk0) null, (hs2) null, (Throwable) cancellationException3, 14);
                    cancellationException2 = cancellationException3;
                    Object obj2 = obj;
                    while (true) {
                        yu0 yu03 = yu02;
                        Unsafe unsafe3 = y79.a;
                        kk0 = kk04;
                        boolean compareAndSwapObject = unsafe3.compareAndSwapObject(kk0, F, obj2, yu03);
                        Unsafe unsafe4 = unsafe3;
                        yu02 = yu03;
                        if (!compareAndSwapObject) {
                            if (unsafe4.getObjectVolatile(kk0, j) != obj2) {
                                break;
                            }
                            kk04 = kk0;
                        } else {
                            return;
                        }
                    }
                }
                cancellationException = cancellationException2;
                this = kk0;
            } else {
                return;
            }
        }
    }

    public final f61 d() {
        return this.z;
    }

    public final q81 e() {
        f61 f61 = this.z;
        if (f61 instanceof q81) {
            return (q81) f61;
        }
        return null;
    }

    public final void f(Object obj) {
        Throwable a = o66.a(obj);
        if (a != null) {
            obj = new av0(a, false);
        }
        F(obj, this.y, (hs2) null);
    }

    public final Throwable g(Object obj) {
        Throwable g = super.g(obj);
        if (g != null) {
            return g;
        }
        return null;
    }

    public final Object h(Object obj) {
        if (obj instanceof yu0) {
            return ((yu0) obj).a;
        }
        return obj;
    }

    public final Object j() {
        return u();
    }

    public final void k(fk0 fk0, Throwable th) {
        try {
            switch (fk0.a) {
                case b85.b:
                    ((ScheduledFuture) fk0.b).cancel(false);
                    return;
                case 1:
                    ((vr2) fk0.b).y(th);
                    return;
                default:
                    ((mw1) fk0.b).b();
                    return;
            }
        } catch (Throwable th2) {
            bb0.p0(this.A, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(hs2 hs2, Throwable th, Object obj) {
        e81 e81 = this.A;
        try {
            hs2.u(th, obj, e81);
        } catch (Throwable th2) {
            bb0.p0(e81, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(ri6 ri6, Throwable th) {
        e81 e81 = this.A;
        int i = B.get(this) & 536870911;
        if (i != 536870911) {
            try {
                ri6.l(i, e81);
            } catch (Throwable th2) {
                bb0.p0(e81, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            h.s("The index for Segment.onCancellation(..) is broken");
        }
    }

    public final py2 n(Object obj, hs2 hs2) {
        return I(obj, hs2);
    }

    public final void o() {
        mw1 s = s();
        if (s != null) {
            s.b();
            D.getClass();
            y79.a.putObjectVolatile(this, E, f05.w);
        }
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean z2;
        boolean z3;
        do {
            atomicIntegerFieldUpdater = B;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z4 = false;
                    if (i == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    f61 f61 = this.z;
                    if (!z2 && (f61 instanceof sv1)) {
                        if (i == 1 || i == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i4 = this.y;
                        if (i4 == 1 || i4 == 2) {
                            z4 = true;
                        }
                        if (z3 == z4) {
                            sv1 sv1 = (sv1) f61;
                            h81 h81 = sv1.z;
                            e81 r = sv1.A.r();
                            if (tv1.c(h81, r)) {
                                tv1.b(h81, r, this);
                                return;
                            }
                            i72 a = ih7.a();
                            if (a.y >= 4294967296L) {
                                a.p0(this);
                                return;
                            }
                            a.q0(true);
                            try {
                                pd8.A(this, f61, true);
                                do {
                                } while (a.s0());
                            } catch (Throwable th) {
                                a.o0(true);
                                throw th;
                            }
                            a.o0(true);
                            return;
                        }
                    }
                    pd8.A(this, f61, z2);
                    return;
                }
                h.s("Already resumed");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(ll3 ll3) {
        return ll3.E();
    }

    public final e81 r() {
        return this.A;
    }

    public final mw1 s() {
        D.getClass();
        return (mw1) y79.a.getObjectVolatile(this, E);
    }

    public final Object t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        el3 el3;
        boolean z2 = z();
        do {
            atomicIntegerFieldUpdater = B;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (z2) {
                        C();
                    }
                    Object u = u();
                    if (!(u instanceof av0)) {
                        int i3 = this.y;
                        if ((i3 != 1 && i3 != 2) || (el3 = (el3) this.A.a0(me6.E)) == null || el3.l()) {
                            return h(u);
                        }
                        CancellationException E2 = el3.E();
                        c(E2);
                        throw E2;
                    }
                    throw ((av0) u).a;
                }
                h.s("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (s() == null) {
            w();
        }
        if (z2) {
            C();
        }
        return p81.w;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(rj1.K(this.z));
        sb.append("){");
        Object u = u();
        if (u instanceof o05) {
            str = "Active";
        } else if (u instanceof ok0) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(rj1.t(this));
        return sb.toString();
    }

    public final Object u() {
        C.getClass();
        return y79.a.getObjectVolatile(this, F);
    }

    public final void v() {
        mw1 w = w();
        if (w != null && !(u() instanceof o05)) {
            w.b();
            D.getClass();
            y79.a.putObjectVolatile(this, E, f05.w);
        }
    }

    public final mw1 w() {
        el3 el3 = (el3) this.A.a0(me6.E);
        if (el3 == null) {
            return null;
        }
        mw1 W = r16.W(el3, true, new zo0(this));
        while (true) {
            D.getClass();
            Unsafe unsafe = y79.a;
            long j = E;
            kk0 kk0 = this;
            if (!unsafe.compareAndSwapObject(kk0, j, (Object) null, W) && unsafe.getObjectVolatile(kk0, j) == null) {
                this = kk0;
            }
        }
        return W;
    }

    public final void x(vr2 vr2) {
        y(new fk0(1, vr2));
    }

    public final void y(o05 o05) {
        Object objectVolatile;
        kk0 kk0;
        Unsafe unsafe;
        kk0 kk02;
        while (true) {
            C.getClass();
            Unsafe unsafe2 = y79.a;
            long j = F;
            objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof i8) {
                while (true) {
                    Unsafe unsafe3 = y79.a;
                    kk0 = this;
                    if (!unsafe3.compareAndSwapObject(kk0, F, objectVolatile, o05)) {
                        if (unsafe3.getObjectVolatile(kk0, j) != objectVolatile) {
                            break;
                        }
                        this = kk0;
                    } else {
                        return;
                    }
                }
            } else {
                kk0 = this;
                if ((objectVolatile instanceof fk0) || (objectVolatile instanceof ri6)) {
                    A(o05, objectVolatile);
                } else if (objectVolatile instanceof av0) {
                    av0 av0 = (av0) objectVolatile;
                    if (!av0.b.compareAndSet(av0, 0, 1)) {
                        A(o05, objectVolatile);
                        throw null;
                    } else if (objectVolatile instanceof ok0) {
                        Throwable th = av0.a;
                        if (o05 instanceof fk0) {
                            kk0.k((fk0) o05, th);
                            return;
                        }
                        o05.getClass();
                        kk0.m((ri6) o05, th);
                        return;
                    } else {
                        return;
                    }
                } else if (objectVolatile instanceof yu0) {
                    yu0 yu0 = (yu0) objectVolatile;
                    if (yu0.b != null) {
                        A(o05, objectVolatile);
                        throw null;
                    } else if (!(o05 instanceof ri6)) {
                        o05.getClass();
                        fk0 fk0 = (fk0) o05;
                        Throwable th2 = yu0.e;
                        if (th2 != null) {
                            kk0.k(fk0, th2);
                            return;
                        }
                        yu0 a = yu0.a(yu0, fk0, (Throwable) null, 29);
                        do {
                            unsafe = y79.a;
                            kk02 = kk0;
                            if (!unsafe.compareAndSwapObject(kk0, F, objectVolatile, a)) {
                                kk0 = kk02;
                            } else {
                                return;
                            }
                        } while (unsafe.getObjectVolatile(kk02, j) == objectVolatile);
                    } else {
                        return;
                    }
                } else {
                    kk0 kk03 = kk0;
                    if (!(o05 instanceof ri6)) {
                        o05.getClass();
                        Object obj = objectVolatile;
                        yu0 yu02 = new yu0(obj, (fk0) o05, (hs2) null, (Throwable) null, 28);
                        Object obj2 = obj;
                        while (true) {
                            yu0 yu03 = yu02;
                            Unsafe unsafe4 = y79.a;
                            kk0 = kk03;
                            boolean compareAndSwapObject = unsafe4.compareAndSwapObject(kk0, F, obj2, yu03);
                            Unsafe unsafe5 = unsafe4;
                            yu02 = yu03;
                            if (!compareAndSwapObject) {
                                if (unsafe5.getObjectVolatile(kk0, j) != obj2) {
                                    break;
                                }
                                kk03 = kk0;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            this = kk0;
        }
        A(o05, objectVolatile);
        throw null;
    }

    public final boolean z() {
        if (this.y != 2 || !((sv1) this.z).o()) {
            return false;
        }
        return true;
    }
}
