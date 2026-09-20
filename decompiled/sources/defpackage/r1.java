package defpackage;

import sun.misc.Unsafe;

/* renamed from: r1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class r1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, x1 x1Var, long j, w1 w1Var, w1 w1Var2) {
        while (!unsafe.compareAndSwapObject(x1Var, j, w1Var, w1Var2)) {
            if (unsafe.getObject(x1Var, j) != w1Var) {
                return false;
            }
        }
        return true;
    }
}
