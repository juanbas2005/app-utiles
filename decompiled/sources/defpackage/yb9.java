package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: yb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yb9 {
    public final Object a = new Object();
    public final zc9 b = new zc9();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final void a(Executor executor, x45 x45) {
        this.b.g(new a09(executor, x45));
        r();
    }

    public final void b(y45 y45) {
        this.b.g(new a09((Executor) yb7.a, y45));
        r();
    }

    public final void c(Executor executor, y45 y45) {
        this.b.g(new a09(executor, y45));
        r();
    }

    public final void d(Executor executor, c55 c55) {
        this.b.g(new a09(executor, c55));
        r();
    }

    public final void e(Executor executor, k55 k55) {
        this.b.g(new a09(executor, k55));
        r();
    }

    public final yb9 f(Executor executor, g61 g61) {
        yb9 yb9 = new yb9();
        this.b.g(new wu8(executor, g61, yb9, 0));
        r();
        return yb9;
    }

    public final yb9 g(Executor executor, g61 g61) {
        yb9 yb9 = new yb9();
        this.b.g(new wu8(executor, g61, yb9, 1));
        r();
        return yb9;
    }

    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object i() {
        Object obj;
        synchronized (this.a) {
            try {
                z65.m("Task is not yet complete", this.c);
                if (!this.d) {
                    Exception exc = this.f;
                    if (exc == null) {
                        obj = this.e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final yb9 l(Executor executor, e77 e77) {
        yb9 yb9 = new yb9();
        this.b.g(new a09(executor, e77, yb9));
        r();
        return yb9;
    }

    public final void m(Object obj) {
        synchronized (this.a) {
            q();
            this.c = true;
            this.e = obj;
        }
        this.b.h(this);
    }

    public final boolean n(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.h(this);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void o(Exception exc) {
        z65.l("Exception must not be null", exc);
        synchronized (this.a) {
            q();
            this.c = true;
            this.f = exc;
        }
        this.b.h(this);
    }

    public final void p() {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.d = true;
                    this.b.h(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void q() {
        IllegalStateException illegalStateException;
        String str;
        if (this.c) {
            if (j()) {
                Exception h = h();
                if (h != null) {
                    str = "failure";
                } else if (k()) {
                    str = "result ".concat(String.valueOf(i()));
                } else if (this.d) {
                    str = "cancellation";
                } else {
                    str = "unknown issue";
                }
                illegalStateException = new IllegalStateException("Complete with: ".concat(str), h);
            } else {
                illegalStateException = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw illegalStateException;
        }
    }

    public final void r() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.h(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
