package defpackage;

import sun.misc.Unsafe;

/* renamed from: gn8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gn8 extends in8 {
    public final void U0(Object obj, long j, byte b) {
        if (jn8.f) {
            jn8.b(obj, j, b);
        } else {
            jn8.c(obj, j, b);
        }
    }

    public final boolean W0(long j, Object obj) {
        if (jn8.f) {
            return jn8.n(j, obj);
        }
        return jn8.o(j, obj);
    }

    public final void X0(Object obj, long j, boolean z) {
        if (jn8.f) {
            jn8.b(obj, j, z);
        } else {
            jn8.c(obj, j, z ? (byte) 1 : 0);
        }
    }

    public final float Y0(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.w).getInt(obj, j));
    }

    public final void Z0(Object obj, long j, float f) {
        ((Unsafe) this.w).putInt(obj, j, Float.floatToIntBits(f));
    }

    public final double a1(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.w).getLong(obj, j));
    }

    public final void c1(Object obj, long j, double d) {
        ((Unsafe) this.w).putLong(obj, j, Double.doubleToLongBits(d));
    }
}
