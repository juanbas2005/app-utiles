package defpackage;

import sun.misc.Unsafe;

/* renamed from: qw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qw8 extends o85 {
    public static final Unsafe d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        defpackage.ku4.o("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(defpackage.uw8.a);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    static {
        Class<rw8> cls = rw8.class;
        Unsafe unsafe = Unsafe.getUnsafe();
        Class<sw8> cls2 = sw8.class;
        try {
            f = unsafe.objectFieldOffset(cls2.getDeclaredField("y"));
            e = unsafe.objectFieldOffset(cls2.getDeclaredField("x"));
            g = unsafe.objectFieldOffset(cls2.getDeclaredField("w"));
            h = unsafe.objectFieldOffset(cls.getDeclaredField("a"));
            i = unsafe.objectFieldOffset(cls.getDeclaredField("b"));
            d = unsafe;
        } catch (NoSuchFieldException e2) {
            rf2.o(e2);
        }
    }

    public final void A(rw8 rw8, rw8 rw82) {
        d.putObject(rw8, i, rw82);
    }

    public final boolean B(sw8 sw8, rw8 rw8, rw8 rw82) {
        return ow8.a(d, sw8, f, rw8, rw82);
    }

    public final rw8 C(y99 y99) {
        rw8 rw8;
        rw8 rw82 = rw8.c;
        do {
            rw8 = y99.y;
            if (rw82 == rw8 || B(y99, rw8, rw82)) {
                return rw8;
            }
            rw8 = y99.y;
            break;
        } while (B(y99, rw8, rw82));
        return rw8;
    }

    public final kw8 D(y99 y99) {
        kw8 kw8;
        kw8 kw82 = kw8.b;
        do {
            kw8 = y99.x;
            if (kw82 == kw8 || nw8.a(d, y99, e, kw8)) {
                return kw8;
            }
            kw8 = y99.x;
            break;
        } while (nw8.a(d, y99, e, kw8));
        return kw8;
    }

    public final boolean E(sw8 sw8, Object obj, Object obj2) {
        return pw8.a(d, sw8, g, obj, obj2);
    }

    public final void z(rw8 rw8, Thread thread) {
        d.putObject(rw8, h, thread);
    }
}
