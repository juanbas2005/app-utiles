package defpackage;

import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

/* renamed from: b1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b1 extends ll3 implements f61, o81 {
    public final e81 A;

    public b1(e81 e81, boolean z) {
        super(z);
        W((el3) e81.a0(me6.E));
        this.A = e81.X(this);
    }

    public final void U(CompletionHandlerException completionHandlerException) {
        bb0.p0(this.A, completionHandlerException);
    }

    public final void f(Object obj) {
        Throwable a = o66.a(obj);
        if (a != null) {
            obj = new av0(a, false);
        }
        Object d0 = d0(obj);
        if (d0 != ml3.b) {
            g(d0);
        }
    }

    public final void i0(Object obj) {
        if (obj instanceof av0) {
            av0 av0 = (av0) obj;
            Throwable th = av0.a;
            boolean z = true;
            if (av0.b.get(av0) != 1) {
                z = false;
            }
            v0(th, z);
            return;
        }
        w0(obj);
    }

    public final e81 k() {
        return this.A;
    }

    public final e81 r() {
        return this.A;
    }

    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public final void x0(r81 r81, b1 b1Var, gs2 gs2) {
        e81 e81;
        Object c;
        Object obj;
        int ordinal = r81.ordinal();
        vs7 vs7 = vs7.a;
        if (ordinal == 0) {
            try {
                tv1.a(rc9.a0(rc9.C(b1Var, this, gs2)), vs7);
            } catch (Throwable th) {
                kl8.k(this, th);
                throw null;
            }
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                gs2.getClass();
                rc9.a0(rc9.C(b1Var, this, gs2)).f(vs7);
            } else if (ordinal == 3) {
                try {
                    e81 = this.A;
                    c = gh7.c(e81, (Object) null);
                    if (!(gs2 instanceof q50)) {
                        obj = rc9.h1(gs2, b1Var, this);
                    } else {
                        mp7.Q(2, gs2);
                        obj = gs2.H(b1Var, this);
                    }
                    gh7.a(e81, c);
                    if (obj != p81.w) {
                        f(obj);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof DispatchException) {
                        th = ((DispatchException) th).w;
                    }
                    f(o85.b(th));
                }
            } else {
                h.c();
            }
        }
    }

    public void w0(Object obj) {
    }

    public void v0(Throwable th, boolean z) {
    }
}
