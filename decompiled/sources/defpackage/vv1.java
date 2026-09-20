package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* renamed from: vv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vv1 extends wb7 {
    public int y;

    public vv1(int i) {
        super(false, 0);
        this.y = i;
    }

    public abstract f61 d();

    public Throwable g(Object obj) {
        av0 av0;
        if (obj instanceof av0) {
            av0 = (av0) obj;
        } else {
            av0 = null;
        }
        if (av0 != null) {
            return av0.a;
        }
        return null;
    }

    public final void i(Throwable th) {
        bb0.p0(d().r(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    public final void run() {
        e81 r;
        Object c;
        os7 os7;
        try {
            f61 d = d();
            d.getClass();
            sv1 sv1 = (sv1) d;
            h61 h61 = sv1.A;
            Object obj = sv1.C;
            r = h61.r();
            c = gh7.c(r, obj);
            el3 el3 = null;
            if (c != gh7.a) {
                os7 = su0.R(h61, r, c);
            } else {
                os7 = null;
            }
            e81 r2 = h61.r();
            Object j = j();
            Throwable g = g(j);
            if (g == null) {
                int i = this.y;
                boolean z = true;
                if (i != 1) {
                    if (i != 2) {
                        z = false;
                    }
                }
                if (z) {
                    el3 = (el3) r2.a0(me6.E);
                }
            }
            if (el3 != null && !el3.l()) {
                CancellationException E = el3.E();
                c(E);
                h61.f(o85.b(E));
            } else if (g != null) {
                h61.f(new m66(g));
            } else {
                h61.f(h(j));
            }
            if (os7 != null) {
                if (!os7.z0()) {
                    return;
                }
            }
            gh7.a(r, c);
        } catch (DispatchException e) {
            bb0.p0(d().r(), e.w);
        } catch (Throwable th) {
            i(th);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
