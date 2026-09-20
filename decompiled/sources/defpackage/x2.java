package defpackage;

/* renamed from: x2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x2 extends rd3 {
    public final void G(y2 y2Var, y2 y2Var2) {
        y2Var.b = y2Var2;
    }

    public final void H(y2 y2Var, Thread thread) {
        y2Var.a = thread;
    }

    public final boolean e(z2 z2Var, v2 v2Var, v2 v2Var2) {
        synchronized (z2Var) {
            try {
                if (z2Var.x != v2Var) {
                    return false;
                }
                z2Var.x = v2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(z2 z2Var, Object obj, Object obj2) {
        synchronized (z2Var) {
            try {
                if (z2Var.w != obj) {
                    return false;
                }
                z2Var.w = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(z2 z2Var, y2 y2Var, y2 y2Var2) {
        synchronized (z2Var) {
            try {
                if (z2Var.y != y2Var) {
                    return false;
                }
                z2Var.y = y2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
