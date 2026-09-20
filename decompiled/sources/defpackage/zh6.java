package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* renamed from: zh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zh6 {
    public uh6 a;
    public xf b;
    public eh2 c;
    public z75 d;
    public boolean e;
    public am6 f;
    public final th6 g;
    public final oh6 h;
    public boolean i;
    public int j = 1;
    public eh6 k = mh6.b;
    public final xh6 l = new xh6(this);
    public final ay5 m = new ay5(11, (Object) this);

    public zh6(uh6 uh6, xf xfVar, eh2 eh2, z75 z75, boolean z, am6 am6, th6 th6, oh6 oh6) {
        this.a = uh6;
        this.b = xfVar;
        this.c = eh2;
        this.d = z75;
        this.e = z;
        this.f = am6;
        this.g = th6;
        this.h = oh6;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, g06] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object a(long j2, h61 h61) {
        wh6 wh6;
        int i2;
        Throwable th;
        zh6 zh6;
        g06 g06;
        if (h61 instanceof wh6) {
            wh6 = (wh6) h61;
            int i3 = wh6.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wh6.C = i3 - Integer.MIN_VALUE;
                Object obj = wh6.A;
                i2 = wh6.C;
                if (i2 != 0) {
                    o85.q(obj);
                    ? obj2 = new Object();
                    obj2.w = j2;
                    this.i = true;
                    try {
                        hq4 hq4 = hq4.w;
                        zh6 = this;
                        try {
                            vj5 vj5 = new vj5(zh6, (g06) obj2, j2, (f61) null);
                            wh6.z = obj2;
                            wh6.C = 1;
                            Object g2 = zh6.g(hq4, vj5, wh6);
                            p81 p81 = p81.w;
                            if (g2 == p81) {
                                return p81;
                            }
                            g06 = obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            zh6.i = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zh6 = this;
                        th = th;
                        zh6.i = false;
                        throw th;
                    }
                } else if (i2 == 1) {
                    g06 = wh6.z;
                    try {
                        o85.q(obj);
                        zh6 = this;
                    } catch (Throwable th4) {
                        th = th4;
                        zh6 = this;
                        zh6.i = false;
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zh6.i = false;
                return new x38(g06.w);
            }
        }
        wh6 = new wh6(this, h61);
        Object obj3 = wh6.A;
        i2 = wh6.C;
        if (i2 != 0) {
        }
        zh6.i = false;
        return new x38(g06.w);
    }

    public final boolean b() {
        xf xfVar;
        if (this.a.c() || this.a.b() || ((xfVar = this.b) != null && xfVar.e())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if ((r7 instanceof defpackage.rl1) != false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    public final Object c(long j2, boolean z, a97 a97) {
        int i2;
        vs7 vs7 = vs7.a;
        if (z) {
            eh2 eh2 = this.c;
            nf6 nf6 = mh6.a;
        }
        if (this.d == z75.x) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        long a2 = x38.a(j2, 0.0f, 0.0f, i2);
        yh6 yh6 = new yh6(this, (f61) null);
        xf xfVar = this.b;
        p81 p81 = p81.w;
        if (xfVar == null || !b()) {
            yh6 yh62 = new yh6(this, a97);
            yh62.C = a2;
            Object s = yh62.s(vs7);
            if (s == p81) {
                return s;
            }
            return vs7;
        }
        Object b2 = xfVar.b(a2, yh6, a97);
        if (b2 == p81) {
            return b2;
        }
    }

    public final long d(eh6 eh6, long j2, int i2) {
        zx4 zx4;
        long j3;
        long j4;
        long j5 = j2;
        zx4 zx42 = (zx4) this.f.x;
        zx4 zx43 = null;
        if (zx42 != null) {
            zx4 = zx42.W0();
        } else {
            zx4 = null;
        }
        long j6 = 0;
        int i3 = i2;
        if (zx4 != null) {
            j3 = zx4.X(j5, i3);
        } else {
            j3 = 0;
        }
        long d2 = l35.d(j5, j3);
        if (this.d == z75.x) {
            j4 = l35.a(d2, 0.0f, 1);
        } else {
            j4 = l35.a(d2, 0.0f, 2);
        }
        long f2 = f(i(eh6.a(h(f(j4)))));
        th6 th6 = this.g;
        if (th6.J) {
            ViewTreeObserver viewTreeObserver = ((je) rc9.P0(th6)).getViewTreeObserver();
            try {
                if (je.h1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", (Class[]) null);
                    declaredMethod.setAccessible(true);
                    je.h1 = declaredMethod;
                }
                Method method = je.h1;
                if (method != null) {
                    method.invoke(viewTreeObserver, (Object[]) null);
                }
            } catch (Exception unused) {
            }
        }
        long d3 = l35.d(d2, f2);
        zx4 zx44 = (zx4) this.f.x;
        if (zx44 != null) {
            zx43 = zx44.W0();
        }
        zx4 zx45 = zx43;
        long j7 = f2;
        if (zx45 != null) {
            j6 = zx45.n0(i3, j7, d3);
        }
        return l35.e(l35.e(j3, j7), j6);
    }

    public final float e(float f2) {
        if (this.e) {
            return f2 * -1.0f;
        }
        return f2;
    }

    public final long f(long j2) {
        if (this.e) {
            return l35.f(-1.0f, j2);
        }
        return j2;
    }

    public final Object g(hq4 hq4, gs2 gs2, h61 h61) {
        Object d2 = this.a.d(hq4, new ii3((Object) this, (Object) gs2, (f61) null, 22), h61);
        if (d2 == p81.w) {
            return d2;
        }
        return vs7.a;
    }

    public final float h(long j2) {
        long j3;
        if (this.d == z75.x) {
            j3 = j2 >> 32;
        } else {
            j3 = j2 & 4294967295L;
        }
        return Float.intBitsToFloat((int) j3);
    }

    public final long i(float f2) {
        if (f2 == 0.0f) {
            return 0;
        }
        if (this.d == z75.x) {
            return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        long floatToRawIntBits = (long) Float.floatToRawIntBits(0.0f);
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public final float j(long j2) {
        int i2 = (int) (4294967295L & j2);
        int i3 = (int) (j2 >> 32);
        int i4 = (((double) ((float) Math.atan2((double) Math.abs(Float.intBitsToFloat(i2)), (double) Math.abs(Float.intBitsToFloat(i3))))) > 0.7853981633974483d ? 1 : (((double) ((float) Math.atan2((double) Math.abs(Float.intBitsToFloat(i2)), (double) Math.abs(Float.intBitsToFloat(i3))))) == 0.7853981633974483d ? 0 : -1));
        z75 z75 = this.d;
        if (i4 >= 0) {
            if (z75 == z75.w) {
                return Float.intBitsToFloat(i2);
            }
            return 0.0f;
        } else if (z75 == z75.x) {
            return Float.intBitsToFloat(i3);
        } else {
            return 0.0f;
        }
    }
}
