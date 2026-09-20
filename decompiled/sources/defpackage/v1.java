package defpackage;

import sun.misc.Unsafe;

/* renamed from: v1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v1 extends x91 {
    public static final Unsafe s;
    public static final long t;
    public static final long u;
    public static final long v;
    public static final long w;
    public static final long x;

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:3|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        defpackage.ku4.o("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.lang.Object());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    static {
        Class<w1> cls = w1.class;
        Unsafe unsafe = Unsafe.getUnsafe();
        Class<x1> cls2 = x1.class;
        try {
            u = unsafe.objectFieldOffset(cls2.getDeclaredField("y"));
            t = unsafe.objectFieldOffset(cls2.getDeclaredField("x"));
            v = unsafe.objectFieldOffset(cls2.getDeclaredField("w"));
            w = unsafe.objectFieldOffset(cls.getDeclaredField("a"));
            x = unsafe.objectFieldOffset(cls.getDeclaredField("b"));
            s = unsafe;
        } catch (Exception e) {
            Object obj = rh7.a;
            if (!(e instanceof RuntimeException)) {
                rf2.o(e);
                return;
            }
            throw ((RuntimeException) e);
        }
    }

    public final void P(w1 w1Var, w1 w1Var2) {
        s.putObject(w1Var, x, w1Var2);
    }

    public final void Q(w1 w1Var, Thread thread) {
        s.putObject(w1Var, w, thread);
    }

    public final boolean m(x1 x1Var, l1 l1Var, l1 l1Var2) {
        return s1.a(s, x1Var, t, l1Var, l1Var2);
    }

    public final boolean n(x1 x1Var, Object obj, Object obj2) {
        return t1.a(s, x1Var, v, obj, obj2);
    }

    public final boolean o(x1 x1Var, w1 w1Var, w1 w1Var2) {
        return r1.a(s, x1Var, u, w1Var, w1Var2);
    }

    public final l1 y(x1 x1Var) {
        l1 l1Var;
        l1 l1Var2 = l1.d;
        do {
            l1Var = x1Var.x;
            if (l1Var2 == l1Var || m(x1Var, l1Var, l1Var2)) {
                return l1Var;
            }
            l1Var = x1Var.x;
            break;
        } while (m(x1Var, l1Var, l1Var2));
        return l1Var;
    }

    public final w1 z(x1 x1Var) {
        w1 w1Var;
        w1 w1Var2 = w1.c;
        do {
            w1Var = x1Var.y;
            if (w1Var2 == w1Var || o(x1Var, w1Var, w1Var2)) {
                return w1Var;
            }
            w1Var = x1Var.y;
            break;
        } while (o(x1Var, w1Var, w1Var2));
        return w1Var;
    }
}
