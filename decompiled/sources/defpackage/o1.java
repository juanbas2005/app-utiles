package defpackage;

/* renamed from: o1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o1 extends x91 {
    public final void P(w1 w1Var, w1 w1Var2) {
        w1Var.b = w1Var2;
    }

    public final void Q(w1 w1Var, Thread thread) {
        w1Var.a = thread;
    }

    public final boolean m(x1 x1Var, l1 l1Var, l1 l1Var2) {
        synchronized (x1Var) {
            try {
                if (x1Var.x != l1Var) {
                    return false;
                }
                x1Var.x = l1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n(x1 x1Var, Object obj, Object obj2) {
        synchronized (x1Var) {
            try {
                if (x1Var.w != obj) {
                    return false;
                }
                x1Var.w = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o(x1 x1Var, w1 w1Var, w1 w1Var2) {
        synchronized (x1Var) {
            try {
                if (x1Var.y != w1Var) {
                    return false;
                }
                x1Var.y = w1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final l1 y(x1 x1Var) {
        l1 l1Var;
        l1 l1Var2 = l1.d;
        synchronized (x1Var) {
            try {
                l1Var = x1Var.x;
                if (l1Var != l1Var2) {
                    x1Var.x = l1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l1Var;
    }

    public final w1 z(x1 x1Var) {
        w1 w1Var;
        w1 w1Var2 = w1.c;
        synchronized (x1Var) {
            try {
                w1Var = x1Var.y;
                if (w1Var != w1Var2) {
                    x1Var.y = w1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w1Var;
    }
}
