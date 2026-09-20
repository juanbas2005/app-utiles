package defpackage;

import java.util.concurrent.Executor;

/* renamed from: a09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a09 implements k99, k55, c55, x45 {
    public final /* synthetic */ int w;
    public final Executor x;
    public final Object y;
    public final Object z;

    public a09(Executor executor, x45 x45) {
        this.w = 0;
        this.y = new Object();
        this.x = executor;
        this.z = x45;
    }

    public final void a(yb9 yb9) {
        switch (this.w) {
            case b85.b /*0*/:
                if (yb9.d) {
                    synchronized (this.y) {
                        try {
                            if (((x45) this.z) != null) {
                                this.x.execute(new ge(25, (Object) this));
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            case 1:
                synchronized (this.y) {
                }
                this.x.execute(new nt2(this, false, yb9, 23));
                return;
            case 2:
                if (!yb9.k() && !yb9.d) {
                    synchronized (this.y) {
                        try {
                            if (((c55) this.z) != null) {
                                this.x.execute(new nt2(this, false, yb9, 26));
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            case 3:
                if (yb9.k()) {
                    synchronized (this.y) {
                        try {
                            if (((k55) this.z) != null) {
                                this.x.execute(new c49(4, (Object) this, (Object) yb9));
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            while (true) {
                                throw th3;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            default:
                this.x.execute(new c49(11, (Object) this, (Object) yb9));
                return;
        }
    }

    public void f() {
        ((yb9) this.z).p();
    }

    public void g(Object obj) {
        ((yb9) this.z).m(obj);
    }

    public void j(Exception exc) {
        ((yb9) this.z).o(exc);
    }

    public a09(Executor executor, y45 y45) {
        this.w = 1;
        this.y = new Object();
        this.x = executor;
        this.z = y45;
    }

    public a09(Executor executor, c55 c55) {
        this.w = 2;
        this.y = new Object();
        this.x = executor;
        this.z = c55;
    }

    public a09(Executor executor, k55 k55) {
        this.w = 3;
        this.y = new Object();
        this.x = executor;
        this.z = k55;
    }

    public a09(Executor executor, e77 e77, yb9 yb9) {
        this.w = 4;
        this.x = executor;
        this.y = e77;
        this.z = yb9;
    }
}
