package defpackage;

import sun.misc.Unsafe;

/* renamed from: pw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class pw8 {
    public static /* synthetic */ boolean a(Unsafe unsafe, sw8 sw8, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(sw8, j, obj, obj2)) {
            if (unsafe.getObject(sw8, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
