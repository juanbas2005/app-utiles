package defpackage;

import sun.misc.Unsafe;

/* renamed from: t1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class t1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, x1 x1Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(x1Var, j, obj, obj2)) {
            if (unsafe.getObject(x1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
