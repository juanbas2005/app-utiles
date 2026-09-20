package defpackage;

/* renamed from: xb7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xb7 {
    public final yb9 a = new yb9();

    public xb7(br4 br4) {
        uy5 uy5 = new uy5(22, (Object) this);
        br4.getClass();
        ((yb9) br4.x).e(yb7.a, new rg4(br4, uy5));
    }

    public final void a(Exception exc) {
        this.a.o(exc);
    }

    public final void b(Object obj) {
        this.a.m(obj);
    }

    public final boolean c(Exception exc) {
        yb9 yb9 = this.a;
        yb9.getClass();
        z65.l("Exception must not be null", exc);
        synchronized (yb9.a) {
            try {
                if (yb9.c) {
                    return false;
                }
                yb9.c = true;
                yb9.f = exc;
                yb9.b.h(yb9);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void d(Object obj) {
        this.a.n(obj);
    }

    public xb7() {
    }
}
