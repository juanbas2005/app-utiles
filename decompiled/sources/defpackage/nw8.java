package defpackage;

import sun.misc.Unsafe;

/* renamed from: nw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class nw8 {
    public static /* synthetic */ boolean a(Unsafe unsafe, y99 y99, long j, Object obj) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            y99 y992 = y99;
            long j2 = j;
            Object obj2 = obj;
            if (unsafe2.compareAndSwapObject(y992, j2, obj2, kw8.b)) {
                return true;
            }
            if (unsafe2.getObject(y992, j2) != obj2) {
                return false;
            }
            unsafe = unsafe2;
            y99 = y992;
            j = j2;
            obj = obj2;
        }
    }
}
