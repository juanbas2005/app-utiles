package defpackage;

import sun.misc.Unsafe;

/* renamed from: mt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mt7 extends qt7 {
    public final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt7(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case b85.b:
                if (st7.g) {
                    if (st7.h(j, obj) == 0) {
                        return false;
                    }
                } else if (st7.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (st7.g) {
                    if (st7.h(j, obj) == 0) {
                        return false;
                    }
                } else if (st7.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    public final byte d(long j, Object obj) {
        switch (this.b) {
            case b85.b:
                if (st7.g) {
                    return st7.h(j, obj);
                }
                return st7.i(j, obj);
            default:
                if (st7.g) {
                    return st7.h(j, obj);
                }
                return st7.i(j, obj);
        }
    }

    public final double e(long j, Object obj) {
        switch (this.b) {
            case b85.b:
                return Double.longBitsToDouble(h(j, obj));
            default:
                return Double.longBitsToDouble(h(j, obj));
        }
    }

    public final float f(long j, Object obj) {
        switch (this.b) {
            case b85.b:
                return Float.intBitsToFloat(g(j, obj));
            default:
                return Float.intBitsToFloat(g(j, obj));
        }
    }

    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case b85.b:
                if (st7.g) {
                    st7.l(obj, j, z ? (byte) 1 : 0);
                    return;
                } else {
                    st7.m(obj, j, z ? (byte) 1 : 0);
                    return;
                }
            default:
                if (st7.g) {
                    st7.l(obj, j, z ? (byte) 1 : 0);
                    return;
                } else {
                    st7.m(obj, j, z ? (byte) 1 : 0);
                    return;
                }
        }
    }

    public final void l(Object obj, long j, byte b2) {
        switch (this.b) {
            case b85.b:
                if (st7.g) {
                    st7.l(obj, j, b2);
                    return;
                } else {
                    st7.m(obj, j, b2);
                    return;
                }
            default:
                if (st7.g) {
                    st7.l(obj, j, b2);
                    return;
                } else {
                    st7.m(obj, j, b2);
                    return;
                }
        }
    }

    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case b85.b:
                p(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                p(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case b85.b:
                o(Float.floatToIntBits(f), j, obj);
                return;
            default:
                o(Float.floatToIntBits(f), j, obj);
                return;
        }
    }

    public final boolean s() {
        switch (this.b) {
            case b85.b:
                return false;
            default:
                return false;
        }
    }
}
