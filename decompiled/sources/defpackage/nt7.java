package defpackage;

import sun.misc.Unsafe;

/* renamed from: nt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nt7 extends rt7 {
    public final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt7(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case b85.b:
                if (tt7.g) {
                    return tt7.b(j, obj);
                }
                return tt7.c(j, obj);
            default:
                if (tt7.g) {
                    return tt7.b(j, obj);
                }
                return tt7.c(j, obj);
        }
    }

    public final double d(long j, Object obj) {
        switch (this.b) {
            case b85.b:
                return Double.longBitsToDouble(g(j, obj));
            default:
                return Double.longBitsToDouble(g(j, obj));
        }
    }

    public final float e(long j, Object obj) {
        switch (this.b) {
            case b85.b:
                return Float.intBitsToFloat(f(j, obj));
            default:
                return Float.intBitsToFloat(f(j, obj));
        }
    }

    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case b85.b:
                if (tt7.g) {
                    tt7.k(obj, j, z ? (byte) 1 : 0);
                    return;
                } else {
                    tt7.l(obj, j, z ? (byte) 1 : 0);
                    return;
                }
            default:
                if (tt7.g) {
                    tt7.k(obj, j, z ? (byte) 1 : 0);
                    return;
                } else {
                    tt7.l(obj, j, z ? (byte) 1 : 0);
                    return;
                }
        }
    }

    public final void k(Object obj, long j, byte b2) {
        switch (this.b) {
            case b85.b:
                if (tt7.g) {
                    tt7.k(obj, j, b2);
                    return;
                } else {
                    tt7.l(obj, j, b2);
                    return;
                }
            default:
                if (tt7.g) {
                    tt7.k(obj, j, b2);
                    return;
                } else {
                    tt7.l(obj, j, b2);
                    return;
                }
        }
    }

    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case b85.b:
                o(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case b85.b:
                n(Float.floatToIntBits(f), j, obj);
                return;
            default:
                n(Float.floatToIntBits(f), j, obj);
                return;
        }
    }

    public final boolean r() {
        switch (this.b) {
            case b85.b:
                return false;
            default:
                return false;
        }
    }
}
