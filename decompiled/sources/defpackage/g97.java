package defpackage;

import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;

/* renamed from: g97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g97 implements tp1, f61 {
    public final x32 A = x32.w;
    public final /* synthetic */ h97 B;
    public final /* synthetic */ h97 w;
    public final kk0 x;
    public kk0 y;
    public lk5 z = lk5.x;

    public g97(h97 h97, kk0 kk0) {
        this.B = h97;
        this.w = h97;
        this.x = kk0;
    }

    public final long A0(long j) {
        return this.w.A0(j);
    }

    public final float C0(long j) {
        return this.w.C0(j);
    }

    public final long L(float f) {
        return this.w.L(f);
    }

    public final float P(int i) {
        return this.w.P(i);
    }

    public final float S(float f) {
        return f / this.w.b();
    }

    public final float Y() {
        return this.w.Y();
    }

    public final float b() {
        return this.w.b();
    }

    public final Object c(lk5 lk5, q50 q50) {
        kk0 kk0 = new kk0(1, rc9.a0(q50));
        kk0.v();
        this.z = lk5;
        this.y = kk0;
        return kk0.t();
    }

    public final long d() {
        h97 h97 = this.B;
        long A0 = h97.A0(rc9.O0(h97).V.d());
        long j = h97.T;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (A0 >> 32)) - ((float) ((int) (j >> 32)))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (A0 & 4294967295L)) - ((float) ((int) (j & 4294967295L)))) / 2.0f)) & 4294967295L);
    }

    public final float e0(float f) {
        return this.w.b() * f;
    }

    public final void f(Object obj) {
        h97 h97 = this.B;
        synchronized (h97.Q) {
            h97.P.k(this);
        }
        this.x.f(obj);
    }

    public final g58 g() {
        return rc9.O0(this.B).V;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object h(long j, gs2 gs2, q50 q50) {
        e97 e97;
        int i;
        Throwable th;
        h27 h27;
        kk0 kk0;
        if (q50 instanceof e97) {
            e97 = (e97) q50;
            int i2 = e97.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e97.C = i2 - Integer.MIN_VALUE;
                Object obj = e97.A;
                i = e97.C;
                if (i != 0) {
                    o85.q(obj);
                    if (j <= 0 && (kk0 = this.y) != null) {
                        kk0.f(new m66(new PointerEventTimeoutCancellationException(j)));
                    }
                    h27 H = ar7.H(this.B.J0(), (e81) null, (r81) null, new wj6(j, this, (f61) null), 3);
                    try {
                        e97.z = H;
                        e97.C = 1;
                        obj = gs2.H(this, e97);
                        p81 p81 = p81.w;
                        if (obj == p81) {
                            return p81;
                        }
                        h27 = H;
                    } catch (Throwable th2) {
                        h27 h272 = H;
                        th = th2;
                        h27 = h272;
                        h27.o(CancelTimeoutCancellationException.w);
                        throw th;
                    }
                } else if (i == 1) {
                    h27 = e97.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h27.o(CancelTimeoutCancellationException.w);
                return obj;
            }
        }
        e97 = new e97(this, q50);
        Object obj2 = e97.A;
        i = e97.C;
        if (i != 0) {
        }
        h27.o(CancelTimeoutCancellationException.w);
        return obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object j(long j, gs2 gs2, h61 h61) {
        f97 f97;
        int i;
        if (h61 instanceof f97) {
            f97 = (f97) h61;
            int i2 = f97.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f97.B = i2 - Integer.MIN_VALUE;
                Object obj = f97.z;
                i = f97.B;
                if (i != 0) {
                    o85.q(obj);
                    f97.B = 1;
                    Object h = h(j, gs2, f97);
                    p81 p81 = p81.w;
                    if (h == p81) {
                        return p81;
                    }
                    return h;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (PointerEventTimeoutCancellationException unused) {
                        return null;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        f97 = new f97(this, h61);
        Object obj2 = f97.z;
        i = f97.B;
        if (i != 0) {
        }
    }

    public final int l0(long j) {
        return this.w.l0(j);
    }

    public final long o(float f) {
        return this.w.o(f);
    }

    public final long p(long j) {
        return this.w.p(j);
    }

    public final e81 r() {
        return this.A;
    }

    public final int r0(float f) {
        return this.w.r0(f);
    }

    public final float z(long j) {
        return this.w.z(j);
    }
}
