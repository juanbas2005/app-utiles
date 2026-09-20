package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: mb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class mb4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ long b;
    private volatile /* synthetic */ Object _cur$volatile = new ob4(8, false);

    static {
        Class<mb4> cls = mb4.class;
        a = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_cur$volatile");
        b = y79.a.objectFieldOffset(cls.getDeclaredField("_cur$volatile"));
    }

    public final boolean a(Runnable runnable) {
        mb4 mb4;
        while (true) {
            a.getClass();
            Unsafe unsafe = y79.a;
            long j = b;
            ob4 ob4 = (ob4) unsafe.getObjectVolatile(this, j);
            int a2 = ob4.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                ob4 d = ob4.d();
                while (true) {
                    Unsafe unsafe2 = y79.a;
                    mb4 = this;
                    if (unsafe2.compareAndSwapObject(mb4, b, ob4, d) || unsafe2.getObjectVolatile(mb4, j) != ob4) {
                        break;
                    }
                    this = mb4;
                }
            } else if (a2 == 2) {
                return false;
            } else {
                mb4 = this;
            }
            this = mb4;
        }
    }

    public final void b() {
        mb4 mb4;
        while (true) {
            a.getClass();
            Unsafe unsafe = y79.a;
            long j = b;
            ob4 ob4 = (ob4) unsafe.getObjectVolatile(this, j);
            if (!ob4.c()) {
                ob4 d = ob4.d();
                while (true) {
                    Unsafe unsafe2 = y79.a;
                    mb4 = this;
                    if (!unsafe2.compareAndSwapObject(mb4, b, ob4, d) && unsafe2.getObjectVolatile(mb4, j) == ob4) {
                        this = mb4;
                    }
                }
                this = mb4;
            } else {
                return;
            }
        }
    }

    public final int c() {
        a.getClass();
        ob4 ob4 = (ob4) y79.a.getObjectVolatile(this, b);
        ob4.getClass();
        long j = ob4.f.get(ob4);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        mb4 mb4;
        while (true) {
            a.getClass();
            Unsafe unsafe = y79.a;
            long j = b;
            ob4 ob4 = (ob4) unsafe.getObjectVolatile(this, j);
            Object e = ob4.e();
            if (e != ob4.g) {
                return e;
            }
            ob4 d = ob4.d();
            while (true) {
                Unsafe unsafe2 = y79.a;
                mb4 = this;
                if (!unsafe2.compareAndSwapObject(mb4, b, ob4, d) && unsafe2.getObjectVolatile(mb4, j) == ob4) {
                    this = mb4;
                }
            }
            this = mb4;
        }
    }
}
