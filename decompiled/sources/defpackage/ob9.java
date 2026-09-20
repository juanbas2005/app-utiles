package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ob9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ob9 extends x1 {
    public kd6 D;
    public final int E;

    public ob9(kd6 kd6, int i) {
        this.D = kd6;
        this.E = i;
    }

    public final void c() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        kd6 kd6 = this.D;
        this.D = null;
        if (kd6 != null) {
            AtomicReference atomicReference = (AtomicReference) kd6.z;
            do {
                atomicLong = (AtomicLong) kd6.y;
                j = atomicLong.get();
                i = (int) j;
                long j2 = j >>> 32;
                if (i != Integer.MIN_VALUE) {
                    i2 = (int) j2;
                    if (i == -2147483647) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i2++;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                    sb.append("Refcount is: ");
                    sb.append(j);
                    throw new AssertionError(sb.toString());
                }
            } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (4294967295L & ((long) (i - 1)))));
            if (z) {
                while (true) {
                    pb9 pb9 = (pb9) atomicReference.get();
                    if (pb9 != null && pb9.D <= this.E) {
                        pb9.cancel(true);
                        while (true) {
                            if (!atomicReference.compareAndSet(pb9, (Object) null)) {
                                if (atomicReference.get() != pb9) {
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final String j() {
        ct ctVar;
        kd6 kd6 = this.D;
        if (kd6 == null || (ctVar = (ct) ((c49) kd6.x).x) == null) {
            return null;
        }
        String obj = ctVar.toString();
        String m = f21.m(new StringBuilder(obj.length() + 11), "callable=[", obj, "]");
        pb9 pb9 = (pb9) ((AtomicReference) this.D.z).get();
        if (pb9 == null) {
            return m;
        }
        int length = m.length();
        String x1Var = pb9.toString();
        return pb4.n(new StringBuilder(x1Var.length() + length + 9 + 1), m, ", trial=[", x1Var, "]");
    }
}
