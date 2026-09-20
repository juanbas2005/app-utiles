package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: yd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yd6 implements f61, q81 {
    public static final AtomicReferenceFieldUpdater x;
    public static final /* synthetic */ long y;
    private volatile Object result;
    public final f61 w;

    static {
        Class<yd6> cls = yd6.class;
        x = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "result");
        y = y79.a.objectFieldOffset(cls.getDeclaredField("result"));
    }

    public yd6(f61 f61) {
        p81 p81 = p81.w;
        this.w = f61;
        this.result = p81;
    }

    public final q81 e() {
        f61 f61 = this.w;
        if (f61 instanceof q81) {
            return (q81) f61;
        }
        return null;
    }

    public final void f(Object obj) {
        yd6 yd6;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            p81 p81 = p81.x;
            if (obj3 == p81) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = y79.a;
                    long j2 = y;
                    yd6 = this;
                    obj2 = obj;
                    if (!unsafe2.compareAndSwapObject(yd6, j2, p81, obj2)) {
                        if (unsafe2.getObjectVolatile(yd6, j2) != p81) {
                            break;
                        }
                        this = yd6;
                        obj = obj2;
                    } else {
                        return;
                    }
                }
            } else {
                yd6 = this;
                obj2 = obj;
                p81 p812 = p81.w;
                if (obj3 == p812) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = x;
                    p81 p813 = p81.y;
                    do {
                        atomicReferenceFieldUpdater2.getClass();
                        unsafe = y79.a;
                        j = y;
                        if (unsafe.compareAndSwapObject(yd6, j, p812, p813)) {
                            yd6.w.f(obj2);
                            return;
                        }
                    } while (unsafe.getObjectVolatile(yd6, j) == p812);
                } else {
                    h.s("Already resumed");
                    return;
                }
            }
            this = yd6;
            obj = obj2;
        }
    }

    public final e81 r() {
        return this.w.r();
    }

    public final String toString() {
        return "SafeContinuation for " + this.w;
    }
}
