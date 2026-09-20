package defpackage;

import sun.misc.Unsafe;

/* renamed from: ow8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class ow8 {
    public static /* synthetic */ boolean a(Unsafe unsafe, sw8 sw8, long j, rw8 rw8, rw8 rw82) {
        while (!unsafe.compareAndSwapObject(sw8, j, rw8, rw82)) {
            if (unsafe.getObject(sw8, j) != rw8) {
                return false;
            }
        }
        return true;
    }
}
