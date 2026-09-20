package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: hz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hz0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Class<hz0> cls = hz0.class;
        Class<Object> cls2 = Object.class;
        a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        Unsafe unsafe = y79.a;
        c = unsafe.objectFieldOffset(cls.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
        d = unsafe.objectFieldOffset(cls.getDeclaredField("_prev$volatile"));
    }

    public hz0(ri6 ri6) {
        this._prev$volatile = ri6;
    }

    public final void a() {
        b.getClass();
        y79.a.putObjectVolatile(this, d, (Object) null);
    }

    public final hz0 b() {
        hz0 e = e();
        while (e != null && e.f()) {
            b.getClass();
            e = (hz0) y79.a.getObjectVolatile(e, d);
        }
        return e;
    }

    public final hz0 c() {
        Object d2 = d();
        if (d2 == gz0.a) {
            return null;
        }
        return (hz0) d2;
    }

    public final Object d() {
        a.getClass();
        return y79.a.getObjectVolatile(this, c);
    }

    public final hz0 e() {
        b.getClass();
        return (hz0) y79.a.getObjectVolatile(this, d);
    }

    public abstract boolean f();

    public final boolean g() {
        while (true) {
            a.getClass();
            Unsafe unsafe = y79.a;
            long j = c;
            hz0 hz0 = this;
            if (unsafe.compareAndSwapObject(hz0, j, (Object) null, gz0.a)) {
                return true;
            }
            if (unsafe.getObjectVolatile(hz0, j) != null) {
                return false;
            }
            this = hz0;
        }
    }

    public final void h() {
        hz0 hz0;
        hz0 hz02;
        Unsafe unsafe;
        if (c() != null) {
            while (true) {
                hz0 b2 = b();
                hz0 c2 = c();
                c2.getClass();
                do {
                    hz0 = c2;
                    if (!hz0.f() || (c2 = hz0.c()) == null) {
                    }
                    hz0 = c2;
                    break;
                } while ((c2 = hz0.c()) == null);
                while (true) {
                    b.getClass();
                    Unsafe unsafe2 = y79.a;
                    long j = d;
                    Object objectVolatile = unsafe2.getObjectVolatile(hz0, j);
                    if (((hz0) objectVolatile) == null) {
                        hz02 = null;
                    } else {
                        hz02 = b2;
                    }
                    while (true) {
                        unsafe = y79.a;
                        if (unsafe.compareAndSwapObject(hz0, d, objectVolatile, hz02)) {
                            break;
                        } else if (unsafe.getObjectVolatile(hz0, j) != objectVolatile) {
                        }
                    }
                }
                if (b2 != null) {
                    a.getClass();
                    unsafe.putObjectVolatile(b2, c, hz0);
                }
                if ((!hz0.f() || hz0.c() == null) && (b2 == null || !b2.f())) {
                    return;
                }
            }
        }
    }

    public final boolean i(ri6 ri6) {
        while (true) {
            a.getClass();
            Unsafe unsafe = y79.a;
            long j = c;
            hz0 hz0 = this;
            ri6 ri62 = ri6;
            if (unsafe.compareAndSwapObject(hz0, j, (Object) null, ri62)) {
                return true;
            }
            if (unsafe.getObjectVolatile(hz0, j) != null) {
                return false;
            }
            this = hz0;
            ri6 = ri62;
        }
    }
}
