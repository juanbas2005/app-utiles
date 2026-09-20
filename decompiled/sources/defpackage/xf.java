package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: xf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xf {
    public final tp1 a;
    public long b = 9205357640488583168L;
    public final w12 c;
    public final ed5 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final wo1 i;

    public xf(Context context, tp1 tp1, long j, la5 la5) {
        hw2 hw2;
        this.a = tp1;
        w12 w12 = new w12(context, uq3.M(j));
        this.c = w12;
        this.d = new ed5(vs7.a, d63.G);
        this.e = true;
        this.g = 0;
        this.h = -1;
        wf wfVar = new wf(0, this);
        kk5 kk5 = d97.a;
        h97 h97 = new h97((Object) null, (Object) null, wfVar);
        if (Build.VERSION.SDK_INT >= 31) {
            hw2 = new hw2(h97, this, w12);
        } else {
            hw2 = new hw2(h97, this, w12, la5);
        }
        this.i = hw2;
    }

    public final void a() {
        boolean z;
        w12 w12 = this.c;
        EdgeEffect edgeEffect = w12.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = w12.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (!edgeEffect2.isFinished() || z) {
                z = true;
            } else {
                z = false;
            }
        }
        EdgeEffect edgeEffect3 = w12.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (!edgeEffect3.isFinished() || z) {
                z = true;
            } else {
                z = false;
            }
        }
        EdgeEffect edgeEffect4 = w12.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0129, code lost:
        if (r4 == r6) goto L_0x012b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    public final Object b(long j, gs2 gs2, h61 h61) {
        uf ufVar;
        int i2;
        long j2;
        long d2;
        float f2;
        float f3;
        long j3 = j;
        gs2 gs22 = gs2;
        h61 h612 = h61;
        if (h612 instanceof uf) {
            ufVar = (uf) h612;
            int i3 = ufVar.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ufVar.C = i3 - Integer.MIN_VALUE;
                Object obj = ufVar.A;
                i2 = ufVar.C;
                vs7 vs7 = vs7.a;
                w12 w12 = this.c;
                if (i2 != 0) {
                    o85.q(obj);
                    boolean e2 = wu6.e(this.g);
                    p81 p81 = p81.w;
                    if (e2) {
                        x38 x38 = new x38(j3);
                        ufVar.C = 1;
                        if (gs22.H(x38, ufVar) == p81) {
                            return p81;
                        }
                        return vs7;
                    }
                    boolean g2 = w12.g(w12.f);
                    tp1 tp1 = this.a;
                    if (g2 && x38.b(j3) < 0.0f) {
                        f2 = ie1.i(w12.c(), x38.b(j3), Float.intBitsToFloat((int) (this.g >> 32)), tp1);
                    } else if (!w12.g(w12.g) || x38.b(j3) <= 0.0f) {
                        f2 = 0.0f;
                    } else {
                        f2 = -ie1.i(w12.d(), -x38.b(j3), Float.intBitsToFloat((int) (this.g >> 32)), tp1);
                    }
                    if (w12.g(w12.d) && x38.c(j3) < 0.0f) {
                        f3 = ie1.i(w12.e(), x38.c(j3), Float.intBitsToFloat((int) (this.g & 4294967295L)), tp1);
                    } else if (!w12.g(w12.e) || x38.c(j3) <= 0.0f) {
                        f3 = 0.0f;
                    } else {
                        f3 = -ie1.i(w12.b(), -x38.c(j3), Float.intBitsToFloat((int) (this.g & 4294967295L)), tp1);
                    }
                    long b2 = u55.b(f2, f3);
                    if (b2 != 0) {
                        d();
                    }
                    j2 = x38.d(j3, b2);
                    x38 x382 = new x38(j2);
                    ufVar.z = j2;
                    ufVar.C = 2;
                    obj = gs22.H(x382, ufVar);
                    return p81;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else if (i2 == 2) {
                    j2 = ufVar.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d2 = x38.d(j2, ((x38) obj).a);
                this.f = false;
                if (x38.b(d2) <= 0.0f) {
                    EdgeEffect c2 = w12.c();
                    int C = dh4.C(x38.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c2.onAbsorb(C);
                    } else if (c2.isFinished()) {
                        c2.onAbsorb(C);
                    }
                } else if (x38.b(d2) < 0.0f) {
                    EdgeEffect d3 = w12.d();
                    int i4 = -dh4.C(x38.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d3.onAbsorb(i4);
                    } else if (d3.isFinished()) {
                        d3.onAbsorb(i4);
                    }
                }
                if (x38.c(d2) <= 0.0f) {
                    EdgeEffect e3 = w12.e();
                    int C2 = dh4.C(x38.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e3.onAbsorb(C2);
                    } else if (e3.isFinished()) {
                        e3.onAbsorb(C2);
                    }
                } else if (x38.c(d2) < 0.0f) {
                    EdgeEffect b3 = w12.b();
                    int i5 = -dh4.C(x38.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b3.onAbsorb(i5);
                    } else if (b3.isFinished()) {
                        b3.onAbsorb(i5);
                    }
                }
                a();
                return vs7;
            }
        }
        ufVar = new uf(this, h612);
        Object obj2 = ufVar.A;
        i2 = ufVar.C;
        vs7 vs72 = vs7.a;
        w12 w122 = this.c;
        if (i2 != 0) {
        }
        d2 = x38.d(j2, ((x38) obj2).a);
        this.f = false;
        if (x38.b(d2) <= 0.0f) {
        }
        if (x38.c(d2) <= 0.0f) {
        }
        a();
        return vs72;
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = fb5.k(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32)));
        return (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(vs7.a);
        }
    }

    public final boolean e() {
        float f2;
        float f3;
        float f4;
        float f5;
        w12 w12 = this.c;
        EdgeEffect edgeEffect = w12.d;
        if (edgeEffect != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f5 = hn.c(edgeEffect);
            } else {
                f5 = 0.0f;
            }
            if (f5 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = w12.e;
        if (edgeEffect2 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f4 = hn.c(edgeEffect2);
            } else {
                f4 = 0.0f;
            }
            if (f4 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = w12.f;
        if (edgeEffect3 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f3 = hn.c(edgeEffect3);
            } else {
                f3 = 0.0f;
            }
            if (f3 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = w12.g;
        if (edgeEffect4 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f2 = hn.c(edgeEffect4);
        } else {
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            return false;
        }
        return true;
    }

    public final float f(long j) {
        float f2;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b2 = this.c.b();
        float f3 = -intBitsToFloat2;
        float f4 = 1.0f - intBitsToFloat;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            f3 = hn.e(b2, f3, f4);
        } else {
            b2.onPull(f3, f4);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f3);
        if (i3 >= 31) {
            f2 = hn.c(b2);
        } else {
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }

    public final float g(long j) {
        float f2;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i2 = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c2 = this.c.c();
        float f3 = 1.0f - intBitsToFloat;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            intBitsToFloat2 = hn.e(c2, intBitsToFloat2, f3);
        } else {
            c2.onPull(intBitsToFloat2, f3);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2;
        if (i3 >= 31) {
            f2 = hn.c(c2);
        } else {
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }

    public final float h(long j) {
        float f2;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i2 = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d2 = this.c.d();
        float f3 = -intBitsToFloat2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            f3 = hn.e(d2, f3, intBitsToFloat);
        } else {
            d2.onPull(f3, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * (-f3);
        if (i3 >= 31) {
            f2 = hn.c(d2);
        } else {
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }

    public final float i(long j) {
        float f2;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e2 = this.c.e();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            intBitsToFloat2 = hn.e(e2, intBitsToFloat2, intBitsToFloat);
        } else {
            e2.onPull(intBitsToFloat2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2;
        if (i3 >= 31) {
            f2 = hn.c(e2);
        } else {
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }

    public final void j(long j) {
        boolean a2 = wu6.a(this.g, 0);
        boolean a3 = wu6.a(j, this.g);
        this.g = j;
        if (!a3) {
            int C = dh4.C(Float.intBitsToFloat((int) (j >> 32)));
            long C2 = (((long) dh4.C(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) C) << 32);
            w12 w12 = this.c;
            w12.c = C2;
            EdgeEffect edgeEffect = w12.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (C2 >> 32), (int) (C2 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = w12.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (C2 >> 32), (int) (C2 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = w12.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (C2 & 4294967295L), (int) (C2 >> 32));
            }
            EdgeEffect edgeEffect4 = w12.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (C2 & 4294967295L), (int) (C2 >> 32));
            }
            EdgeEffect edgeEffect5 = w12.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (C2 >> 32), (int) (C2 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = w12.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (C2 >> 32), (int) (C2 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = w12.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (C2 & 4294967295L), (int) (C2 >> 32));
            }
            EdgeEffect edgeEffect8 = w12.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & C2), (int) (C2 >> 32));
            }
        }
        if (!a2 && !a3) {
            a();
        }
    }
}
