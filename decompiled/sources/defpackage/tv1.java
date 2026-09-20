package defpackage;

import kotlinx.coroutines.DispatchException;

/* renamed from: tv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tv1 {
    public static final py2 a = new py2("UNDEFINED", 4);
    public static final py2 b = new py2("REUSABLE_CLAIMED", 4);

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        if (r5.z0() != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        if (r5.z0() != false) goto L_0x00a0;
     */
    public static final void a(f61 f61, Object obj) {
        Object obj2;
        e81 r;
        Object c;
        os7 os7;
        if (f61 instanceof sv1) {
            sv1 sv1 = (sv1) f61;
            h81 h81 = sv1.z;
            h61 h61 = sv1.A;
            Throwable a2 = o66.a(obj);
            if (a2 == null) {
                obj2 = obj;
            } else {
                obj2 = new av0(a2, false);
            }
            if (c(h81, h61.r())) {
                sv1.B = obj2;
                sv1.y = 1;
                b(h81, h61.r(), sv1);
                return;
            }
            i72 a3 = ih7.a();
            if (a3.y >= 4294967296L) {
                sv1.B = obj2;
                sv1.y = 1;
                a3.p0(sv1);
                return;
            }
            a3.q0(true);
            try {
                el3 el3 = (el3) h61.r().a0(me6.E);
                if (el3 == null || el3.l()) {
                    Object obj3 = sv1.C;
                    r = h61.r();
                    c = gh7.c(r, obj3);
                    if (c != gh7.a) {
                        os7 = su0.R(h61, r, c);
                    } else {
                        os7 = null;
                    }
                    h61.f(obj);
                    if (os7 != null) {
                    }
                    gh7.a(r, c);
                } else {
                    sv1.f(o85.b(el3.E()));
                }
                do {
                } while (a3.s0());
            } catch (Throwable th) {
                a3.o0(true);
                throw th;
            }
            a3.o0(true);
            return;
        }
        f61.f(obj);
    }

    public static final void b(h81 h81, e81 e81, Runnable runnable) {
        try {
            h81.D(e81, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, h81, e81);
        }
    }

    public static final boolean c(h81 h81, e81 e81) {
        try {
            return h81.m0(e81);
        } catch (Throwable th) {
            throw new DispatchException(th, h81, e81);
        }
    }
}
