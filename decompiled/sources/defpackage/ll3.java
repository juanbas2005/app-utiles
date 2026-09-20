package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import sun.misc.Unsafe;

/* renamed from: ll3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ll3 implements el3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w;
    public static final /* synthetic */ AtomicReferenceFieldUpdater x;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Class<ll3> cls = ll3.class;
        Class<Object> cls2 = Object.class;
        w = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        Unsafe unsafe = y79.a;
        z = unsafe.objectFieldOffset(cls.getDeclaredField("_state$volatile"));
        x = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
        y = unsafe.objectFieldOffset(cls.getDeclaredField("_parentHandle$volatile"));
    }

    public ll3(boolean z2) {
        q32 q32;
        if (z2) {
            q32 = ml3.g;
        } else {
            q32 = ml3.f;
        }
        this._state$volatile = q32;
    }

    public static bp0 f0(lb4 lb4) {
        while (lb4.n()) {
            lb4 = lb4.k();
        }
        while (true) {
            lb4 = lb4.j();
            if (!lb4.n()) {
                if (lb4 instanceof bp0) {
                    return (bp0) lb4;
                }
                if (lb4 instanceof zz4) {
                    return null;
                }
            }
        }
    }

    public static String q0(Object obj) {
        if (obj instanceof kl3) {
            kl3 kl3 = (kl3) obj;
            if (kl3.d()) {
                return "Cancelling";
            }
            if (kl3.x.get(kl3) == 1) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof aa3) {
            if (((aa3) obj).l()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof av0) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public final Object C() {
        Object R = R();
        if (R instanceof aa3) {
            h.s("This job has not completed yet");
            return null;
        } else if (!(R instanceof av0)) {
            return ml3.a(R);
        } else {
            throw ((av0) R).a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final CancellationException E() {
        Object R = R();
        CancellationException cancellationException = null;
        if (R instanceof kl3) {
            Throwable c = ((kl3) R).c();
            if (c != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c instanceof CancellationException) {
                    cancellationException = (CancellationException) c;
                }
                if (cancellationException == null) {
                    return new JobCancellationException(concat, c, this);
                }
                return cancellationException;
            }
            ta1.l("Job is still new or active: ", this);
            return null;
        } else if (R instanceof aa3) {
            ta1.l("Job is still new or active: ", this);
            return null;
        } else if (!(R instanceof av0)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), (Throwable) null, this);
        } else {
            Throwable th = ((av0) R).a;
            if (th instanceof CancellationException) {
                cancellationException = th;
            }
            if (cancellationException == null) {
                return new JobCancellationException(t(), th, this);
            }
            return cancellationException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Throwable F(kl3 kl3, ArrayList arrayList) {
        Object obj;
        Throwable th = null;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th2 = (Throwable) obj;
            if (th2 != null) {
                return th2;
            }
            Throwable th3 = (Throwable) arrayList.get(0);
            if (th3 instanceof TimeoutCancellationException) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Throwable th4 = next;
                    if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                        th = next;
                        break;
                    }
                }
                Throwable th5 = th;
                if (th5 != null) {
                    return th5;
                }
            }
            return th3;
        } else if (kl3.d()) {
            return new JobCancellationException(t(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    public final Object G(gs2 gs2, Object obj) {
        return gs2.H(obj, this);
    }

    public boolean H() {
        return true;
    }

    public Object I(p6 p6Var) {
        return h(p6Var);
    }

    public boolean K() {
        return this instanceof xu0;
    }

    public final e81 L(d81 d81) {
        return rc9.A0(this, d81);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [zz4, lb4] */
    public final zz4 P(aa3 aa3) {
        zz4 m = aa3.m();
        if (m != null) {
            return m;
        }
        if (aa3 instanceof q32) {
            return new lb4();
        }
        if (aa3 instanceof gl3) {
            m0((gl3) aa3);
            return null;
        }
        ta1.l("State should have list: ", aa3);
        return null;
    }

    public final ap0 Q() {
        x.getClass();
        return (ap0) y79.a.getObjectVolatile(this, y);
    }

    public final Object R() {
        w.getClass();
        return y79.a.getObjectVolatile(this, z);
    }

    public boolean S(Throwable th) {
        return false;
    }

    public final mw1 T(boolean z2, boolean z3, vr2 vr2) {
        gl3 gl3;
        if (z2) {
            gl3 = new hh3(vr2);
        } else {
            gl3 = new ih3(vr2);
        }
        return Y(z3, gl3);
    }

    public final void W(el3 el3) {
        f05 f05 = f05.w;
        if (el3 == null) {
            o0(f05);
            return;
        }
        el3.start();
        ap0 u = el3.u(this);
        o0(u);
        if (!(R() instanceof aa3)) {
            u.b();
            o0(f05);
        }
    }

    public final e81 X(e81 e81) {
        return rc9.D0(this, e81);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        return r5;
     */
    public final mw1 Y(boolean z2, gl3 gl3) {
        gl3 gl32;
        ll3 ll3;
        f05 f05;
        av0 av0;
        boolean z3;
        kl3 kl3;
        gl3.C = this;
        loop0:
        while (true) {
            Object R = this.R();
            if (R instanceof q32) {
                q32 q32 = (q32) R;
                if (q32.w) {
                    while (true) {
                        w.getClass();
                        Unsafe unsafe = y79.a;
                        long j = z;
                        ll3 = this;
                        gl32 = gl3;
                        if (unsafe.compareAndSwapObject(ll3, j, R, gl32)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(ll3, j) != R) {
                            break;
                        } else {
                            this = ll3;
                            gl3 = gl32;
                        }
                    }
                } else {
                    ll3 = this;
                    gl32 = gl3;
                    ll3.l0(q32);
                }
                this = ll3;
                gl3 = gl32;
            } else {
                ll3 = this;
                gl32 = gl3;
                boolean z4 = R instanceof aa3;
                f05 = f05.w;
                Throwable th = null;
                if (z4) {
                    aa3 aa3 = (aa3) R;
                    zz4 m = aa3.m();
                    if (m == null) {
                        ll3.m0((gl3) R);
                    } else {
                        if (gl32.r()) {
                            if (aa3 instanceof kl3) {
                                kl3 = (kl3) aa3;
                            } else {
                                kl3 = null;
                            }
                            if (kl3 != null) {
                                th = kl3.c();
                            }
                            if (th == null) {
                                z3 = m.c(gl32, 5);
                            } else if (z2) {
                                gl32.s(th);
                                return f05;
                            }
                        } else {
                            z3 = m.c(gl32, 1);
                        }
                        if (z3) {
                            break;
                        }
                    }
                    this = ll3;
                    gl3 = gl32;
                } else if (z2) {
                    Object R2 = ll3.R();
                    if (R2 instanceof av0) {
                        av0 = (av0) R2;
                    } else {
                        av0 = null;
                    }
                    if (av0 != null) {
                        th = av0.a;
                    }
                    gl32.s(th);
                }
            }
        }
        return f05;
    }

    public boolean Z() {
        return this instanceof y90;
    }

    public final c81 a0(d81 d81) {
        return rc9.J(this, d81);
    }

    public final boolean c0(Object obj) {
        Object t0;
        do {
            t0 = t0(R(), obj);
            if (t0 == ml3.a) {
                return false;
            }
            if (t0 == ml3.b) {
                return true;
            }
        } while (t0 == ml3.c);
        d(t0);
        return true;
    }

    public final Object d0(Object obj) {
        Object t0;
        av0 av0;
        do {
            t0 = t0(R(), obj);
            if (t0 == ml3.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof av0) {
                    av0 = (av0) obj;
                } else {
                    av0 = null;
                }
                if (av0 != null) {
                    th = av0.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (t0 == ml3.c);
        return t0;
    }

    public String e0() {
        return getClass().getSimpleName();
    }

    public void g(Object obj) {
        d(obj);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void g0(zz4 zz4, Throwable th) {
        CompletionHandlerException completionHandlerException;
        zz4.c(new o74(4), 4);
        Object i = zz4.i();
        i.getClass();
        lb4 lb4 = (lb4) i;
        CompletionHandlerException completionHandlerException2 = null;
        while (!lb4.equals(zz4)) {
            if ((lb4 instanceof gl3) && ((gl3) lb4).r()) {
                try {
                    ((gl3) lb4).s(th);
                    completionHandlerException = completionHandlerException2;
                } catch (Throwable th2) {
                    if (completionHandlerException2 != null) {
                        su0.b(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    } else {
                        completionHandlerException = new RuntimeException("Exception in completion handler " + lb4 + " for " + this, th2);
                    }
                }
            }
            lb4 = lb4.j();
            completionHandlerException2 = completionHandlerException;
        }
        if (completionHandlerException2 != null) {
            U(completionHandlerException2);
        }
        m(th);
    }

    public final d81 getKey() {
        return me6.E;
    }

    public final Object h(h61 h61) {
        Object R;
        do {
            R = R();
            if (!(R instanceof aa3)) {
                if (!(R instanceof av0)) {
                    return ml3.a(R);
                }
                throw ((av0) R).a;
            }
        } while (p0(R) < 0);
        il3 il3 = new il3(rc9.a0(h61), this);
        il3.v();
        il3.y(new fk0(2, r16.W(this, true, new v66(il3))));
        return il3.t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r0 == defpackage.ml3.b) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r0 = r8;
     */
    public final boolean i(Object obj) {
        py2 py2;
        py2 py22 = ml3.a;
        if (K()) {
            while (true) {
                Object R = R();
                if (R instanceof aa3) {
                    if (R instanceof kl3) {
                        if (kl3.x.get((kl3) R) == 1) {
                            break;
                        }
                    }
                    py22 = t0(R, new av0(y(obj), false));
                    if (py22 != ml3.c) {
                        break;
                    }
                } else {
                    break;
                }
            }
            py22 = ml3.a;
        }
        if (py22 == ml3.a) {
            Throwable th = null;
            Throwable th2 = null;
            while (true) {
                Object R2 = R();
                if (!(R2 instanceof kl3)) {
                    if (!(R2 instanceof aa3)) {
                        py2 = ml3.d;
                        break;
                    }
                    if (th2 == null) {
                        th2 = y(obj);
                    }
                    aa3 aa3 = (aa3) R2;
                    if (!aa3.l()) {
                        Object t0 = t0(R2, new av0(th2, false));
                        if (t0 == ml3.a) {
                            ta1.l("Cannot happen in ", R2);
                            return false;
                        } else if (t0 != ml3.c) {
                            py22 = t0;
                            break;
                        }
                    } else if (s0(aa3, th2)) {
                        py2 = ml3.a;
                        break;
                    }
                } else {
                    synchronized (R2) {
                        if (((kl3) R2).b() == ml3.e) {
                            py2 = ml3.d;
                        } else {
                            boolean d = ((kl3) R2).d();
                            if (th2 == null) {
                                th2 = y(obj);
                            }
                            ((kl3) R2).a(th2);
                            Throwable c = ((kl3) R2).c();
                            if (!d) {
                                th = c;
                            }
                            if (th != null) {
                                g0(((kl3) R2).w, th);
                            }
                            py2 = ml3.a;
                        }
                    }
                }
            }
        }
        if (!(py22 == ml3.a || py22 == ml3.b)) {
            if (py22 == ml3.d) {
                return false;
            }
            d(py22);
            return true;
        }
        return true;
    }

    public final boolean isCancelled() {
        Object R = R();
        if (R instanceof av0) {
            return true;
        }
        if (!(R instanceof kl3) || !((kl3) R).d()) {
            return false;
        }
        return true;
    }

    public void j(CancellationException cancellationException) {
        i(cancellationException);
    }

    public final Object j0(h61 h61) {
        Object R;
        vs7 vs7;
        do {
            R = R();
            boolean z2 = R instanceof aa3;
            vs7 = vs7.a;
            if (!z2) {
                r16.x(h61.r());
                return vs7;
            }
        } while (p0(R) < 0);
        kk0 kk0 = new kk0(1, rc9.a0(h61));
        kk0.v();
        kk0.y(new fk0(2, r16.W(this, true, new w66(kk0))));
        Object t = kk0.t();
        p81 p81 = p81.w;
        if (t != p81) {
            t = vs7;
        }
        if (t == p81) {
            return t;
        }
        return vs7;
    }

    public boolean l() {
        Object R = R();
        if (!(R instanceof aa3) || !((aa3) R).l()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [zz4, lb4] */
    public final void l0(q32 q32) {
        y93 y93;
        ? lb4 = new lb4();
        if (q32.w) {
            y93 = lb4;
        } else {
            y93 = new y93(lb4);
        }
        while (true) {
            w.getClass();
            Unsafe unsafe = y79.a;
            long j = z;
            ll3 ll3 = this;
            q32 q322 = q32;
            if (!unsafe.compareAndSwapObject(ll3, j, q322, y93) && unsafe.getObjectVolatile(ll3, j) == q322) {
                this = ll3;
                q32 = q322;
            } else {
                return;
            }
        }
    }

    public final boolean m(Throwable th) {
        if (Z()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        ap0 Q = Q();
        if (Q == null || Q == f05.w) {
            return z2;
        }
        if (Q.a(th) || z2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [zz4, lb4] */
    public final void m0(gl3 gl3) {
        gl3.e(new lb4());
        lb4 j = gl3.j();
        while (true) {
            w.getClass();
            Unsafe unsafe = y79.a;
            long j2 = z;
            ll3 ll3 = this;
            gl3 gl32 = gl3;
            if (!unsafe.compareAndSwapObject(ll3, j2, gl32, j) && unsafe.getObjectVolatile(ll3, j2) == gl32) {
                this = ll3;
                gl3 = gl32;
            } else {
                return;
            }
        }
    }

    public final void n0(gl3 gl3) {
        ll3 ll3;
        while (true) {
            Object R = this.R();
            if (R instanceof gl3) {
                if (R == gl3) {
                    while (true) {
                        w.getClass();
                        Unsafe unsafe = y79.a;
                        long j = z;
                        ll3 = this;
                        if (!unsafe.compareAndSwapObject(ll3, j, R, ml3.g)) {
                            if (unsafe.getObjectVolatile(ll3, j) != R) {
                                break;
                            }
                            this = ll3;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else if ((R instanceof aa3) && ((aa3) R).m() != null) {
                gl3.o();
                return;
            } else {
                return;
            }
            this = ll3;
        }
    }

    public void o(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(t(), (Throwable) null, this);
        }
        j(cancellationException);
    }

    public final void o0(ap0 ap0) {
        x.getClass();
        y79.a.putObjectVolatile(this, y, ap0);
    }

    public final int p0(Object obj) {
        Unsafe unsafe;
        boolean z2 = obj instanceof q32;
        long j = z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        if (!z2) {
            ll3 ll3 = this;
            Object obj2 = obj;
            if (!(obj2 instanceof y93)) {
                return 0;
            }
            zz4 zz4 = ((y93) obj2).w;
            do {
                atomicReferenceFieldUpdater.getClass();
                ll3 ll32 = ll3;
                Unsafe unsafe2 = y79.a;
                Object obj3 = obj2;
                boolean compareAndSwapObject = unsafe2.compareAndSwapObject(ll32, z, obj3, zz4);
                unsafe = unsafe2;
                ll3 = ll32;
                obj2 = obj3;
                if (compareAndSwapObject) {
                    ll3.k0();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(ll3, j) == obj2);
            return -1;
        } else if (((q32) obj).w) {
            return 0;
        } else {
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe3 = y79.a;
                ll3 ll33 = this;
                Object obj4 = obj;
                if (unsafe3.compareAndSwapObject(ll33, z, obj4, ml3.g)) {
                    ll33.k0();
                    return 1;
                } else if (unsafe3.getObjectVolatile(ll33, j) != obj4) {
                    return -1;
                } else {
                    this = ll33;
                    obj = obj4;
                }
            }
        }
    }

    public final boolean r0(aa3 aa3, Object obj) {
        ea3 ea3;
        if (obj instanceof aa3) {
            ea3 = new ea3((aa3) obj);
        } else {
            ea3 = obj;
        }
        while (true) {
            w.getClass();
            Unsafe unsafe = y79.a;
            long j = z;
            ll3 ll3 = this;
            aa3 aa32 = aa3;
            if (unsafe.compareAndSwapObject(ll3, j, aa32, ea3)) {
                ll3.i0(obj);
                ll3.x(aa32, obj);
                return true;
            } else if (unsafe.getObjectVolatile(ll3, j) != aa32) {
                return false;
            } else {
                this = ll3;
                aa3 = aa32;
            }
        }
    }

    public final boolean s0(aa3 aa3, Throwable th) {
        zz4 P = P(aa3);
        if (P == null) {
            return false;
        }
        kl3 kl3 = new kl3(P, th);
        while (true) {
            w.getClass();
            Unsafe unsafe = y79.a;
            long j = z;
            ll3 ll3 = this;
            aa3 aa32 = aa3;
            if (unsafe.compareAndSwapObject(ll3, j, aa32, kl3)) {
                ll3.g0(P, th);
                return true;
            } else if (unsafe.getObjectVolatile(ll3, j) != aa32) {
                return false;
            } else {
                this = ll3;
                aa3 = aa32;
            }
        }
    }

    public final boolean start() {
        int p0;
        do {
            p0 = p0(R());
            if (p0 == 0) {
                return false;
            }
        } while (p0 != 1);
        return true;
    }

    public String t() {
        return "Job was cancelled";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0088, code lost:
        if (r2 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008a, code lost:
        g0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008d, code lost:
        r7 = f0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0091, code lost:
        if (r7 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0097, code lost:
        if (u0(r1, r7, r8) == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x009b, code lost:
        return defpackage.ml3.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x009c, code lost:
        r0.c(new defpackage.o74(2), 2);
        r7 = f0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00a9, code lost:
        if (r7 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00af, code lost:
        if (u0(r1, r7, r8) == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00b3, code lost:
        return defpackage.ml3.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00b8, code lost:
        return z(r1, r8);
     */
    public final Object t0(Object obj, Object obj2) {
        kl3 kl3;
        boolean z2;
        av0 av0;
        if (!(obj instanceof aa3)) {
            return ml3.a;
        }
        if ((!(obj instanceof q32) && !(obj instanceof gl3)) || (obj instanceof bp0) || (obj2 instanceof av0)) {
            aa3 aa3 = (aa3) obj;
            zz4 P = P(aa3);
            if (P == null) {
                return ml3.c;
            }
            Throwable th = null;
            if (aa3 instanceof kl3) {
                kl3 = (kl3) aa3;
            } else {
                kl3 = null;
            }
            if (kl3 == null) {
                kl3 = new kl3(P, (Throwable) null);
            }
            synchronized (kl3) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = kl3.x;
                if (atomicIntegerFieldUpdater.get(kl3) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    py2 py2 = ml3.a;
                    return py2;
                }
                atomicIntegerFieldUpdater.set(kl3, 1);
                if (kl3 != aa3) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, aa3, kl3)) {
                        if (atomicReferenceFieldUpdater.get(this) != aa3) {
                            py2 py22 = ml3.c;
                            return py22;
                        }
                    }
                }
                boolean d = kl3.d();
                if (obj2 instanceof av0) {
                    av0 = (av0) obj2;
                } else {
                    av0 = null;
                }
                if (av0 != null) {
                    kl3.a(av0.a);
                }
                Throwable c = kl3.c();
                if (!d) {
                    th = c;
                }
            }
        } else if (r0((aa3) obj, obj2)) {
            return obj2;
        } else {
            return ml3.c;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(e0() + '{' + q0(R()) + '}');
        sb.append('@');
        sb.append(rj1.t(this));
        return sb.toString();
    }

    public final ap0 u(ll3 ll3) {
        ll3 ll32;
        av0 av0;
        av0 av02;
        bp0 bp0 = new bp0(ll3);
        bp0.C = this;
        loop0:
        while (true) {
            Object R = this.R();
            if (R instanceof q32) {
                q32 q32 = (q32) R;
                if (q32.w) {
                    while (true) {
                        w.getClass();
                        Unsafe unsafe = y79.a;
                        long j = z;
                        ll32 = this;
                        if (unsafe.compareAndSwapObject(ll32, j, R, bp0)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(ll32, j) != R) {
                            break;
                        } else {
                            this = ll32;
                        }
                    }
                } else {
                    ll32 = this;
                    ll32.l0(q32);
                }
            } else {
                ll32 = this;
                boolean z2 = R instanceof aa3;
                f05 f05 = f05.w;
                Throwable th = null;
                if (z2) {
                    zz4 m = ((aa3) R).m();
                    if (m == null) {
                        ll32.m0((gl3) R);
                    } else if (!m.c(bp0, 7)) {
                        boolean c = m.c(bp0, 3);
                        Object R2 = ll32.R();
                        if (R2 instanceof kl3) {
                            th = ((kl3) R2).c();
                        } else {
                            if (R2 instanceof av0) {
                                av02 = (av0) R2;
                            } else {
                                av02 = null;
                            }
                            if (av02 != null) {
                                th = av02.a;
                            }
                        }
                        bp0.s(th);
                        if (c) {
                            return bp0;
                        }
                        return f05;
                    }
                } else {
                    Object R3 = ll32.R();
                    if (R3 instanceof av0) {
                        av0 = (av0) R3;
                    } else {
                        av0 = null;
                    }
                    if (av0 != null) {
                        th = av0.a;
                    }
                    bp0.s(th);
                    return f05;
                }
            }
            this = ll32;
        }
        return bp0;
    }

    public final boolean u0(kl3 kl3, bp0 bp0, Object obj) {
        while (r16.W(bp0.D, false, new jl3(this, kl3, bp0, obj)) == f05.w) {
            bp0 = f0(bp0);
            if (bp0 == null) {
                return false;
            }
        }
        return true;
    }

    public final mw1 v(vr2 vr2) {
        return Y(true, new ih3(vr2));
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!i(th) || !H()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.RuntimeException, kotlinx.coroutines.CompletionHandlerException] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void x(aa3 aa3, Object obj) {
        av0 av0;
        Throwable th;
        CompletionHandlerException completionHandlerException;
        ap0 Q = Q();
        if (Q != null) {
            Q.b();
            o0(f05.w);
        }
        CompletionHandlerException completionHandlerException2 = null;
        if (obj instanceof av0) {
            av0 = (av0) obj;
        } else {
            av0 = null;
        }
        if (av0 != null) {
            th = av0.a;
        } else {
            th = null;
        }
        if (aa3 instanceof gl3) {
            try {
                ((gl3) aa3).s(th);
            } catch (Throwable th2) {
                U(new RuntimeException("Exception in completion handler " + aa3 + " for " + this, th2));
            }
        } else {
            zz4 m = aa3.m();
            if (m != null) {
                m.c(new o74(1), 1);
                Object i = m.i();
                i.getClass();
                lb4 lb4 = (lb4) i;
                while (!lb4.equals(m)) {
                    if (lb4 instanceof gl3) {
                        try {
                            ((gl3) lb4).s(th);
                            completionHandlerException = completionHandlerException2;
                        } catch (Throwable th3) {
                            if (completionHandlerException2 != null) {
                                su0.b(completionHandlerException2, th3);
                                completionHandlerException = completionHandlerException2;
                            } else {
                                completionHandlerException = new RuntimeException("Exception in completion handler " + lb4 + " for " + this, th3);
                            }
                        }
                    } else {
                        completionHandlerException = completionHandlerException2;
                    }
                    lb4 = lb4.j();
                    completionHandlerException2 = completionHandlerException;
                }
                if (completionHandlerException2 != null) {
                    U(completionHandlerException2);
                }
            }
        }
    }

    public final Throwable y(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        ll3 ll3 = (ll3) obj;
        Object R = ll3.R();
        CancellationException cancellationException = null;
        if (R instanceof kl3) {
            th = ((kl3) R).c();
        } else if (R instanceof av0) {
            th = ((av0) R).a;
        } else if (!(R instanceof aa3)) {
            th = null;
        } else {
            ta1.l("Cannot be cancelling child in this state: ", R);
            return null;
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is ".concat(q0(R)), th, ll3);
        }
        return cancellationException;
    }

    public final Object z(kl3 kl3, Object obj) {
        av0 av0;
        Throwable th;
        kl3 kl32;
        Throwable F;
        ea3 ea3;
        ll3 ll3;
        kl3 kl33;
        Throwable th2 = null;
        if (obj instanceof av0) {
            av0 = (av0) obj;
        } else {
            av0 = null;
        }
        if (av0 != null) {
            th2 = av0.a;
        }
        synchronized (kl3) {
            try {
                kl3.d();
                ArrayList<Throwable> e = kl3.e(th2);
                F = F(kl3, e);
                if (F != null) {
                    try {
                        if (e.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(e.size()));
                            for (Throwable th3 : e) {
                                if (th3 != F && th3 != F && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    su0.b(F, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        kl32 = kl3;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                kl32 = kl3;
                th = th5;
                throw th;
            }
        }
        if (!(F == null || F == th2)) {
            obj = new av0(F, false);
        }
        if (F != null && (m(F) || S(F))) {
            obj.getClass();
            av0.b.compareAndSet((av0) obj, 0, 1);
        }
        i0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        if (obj instanceof aa3) {
            ea3 = new ea3((aa3) obj);
        } else {
            ea3 = obj;
        }
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = y79.a;
            long j = z;
            ll3 = this;
            kl33 = kl3;
            if (!unsafe.compareAndSwapObject(ll3, j, kl33, ea3) && unsafe.getObjectVolatile(ll3, j) == kl33) {
                this = ll3;
                kl3 = kl33;
            }
        }
        ll3.x(kl33, obj);
        return obj;
    }

    public void k0() {
    }

    public void U(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void d(Object obj) {
    }

    public void i0(Object obj) {
    }
}
