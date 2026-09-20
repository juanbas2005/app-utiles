package defpackage;

import android.widget.EdgeEffect;

/* renamed from: xh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xh6 {
    public final /* synthetic */ zh6 a;

    public xh6(zh6 zh6) {
        this.a = zh6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f8  */
    public final long a(long j, int i) {
        float f;
        long j2;
        float f2;
        int i2;
        float f3;
        long floatToRawIntBits;
        long d;
        boolean z;
        boolean z2;
        boolean z3;
        float f4;
        float f5;
        boolean z4;
        int i3;
        boolean z5;
        float h;
        long j3 = j;
        int i4 = i;
        zh6 zh6 = this.a;
        zh6.j = i4;
        xf xfVar = zh6.b;
        if (xfVar == null || !zh6.b()) {
            return zh6.d(zh6.k, j3, i4);
        }
        int i5 = zh6.j;
        ay5 ay5 = zh6.m;
        w12 w12 = xfVar.c;
        if (wu6.e(xfVar.g)) {
            return ((l35) ay5.y(new l35(j3))).a;
        }
        if (!xfVar.f) {
            if (w12.g(w12.f)) {
                xfVar.g(0);
            }
            if (w12.g(w12.g)) {
                xfVar.h(0);
            }
            if (w12.g(w12.d)) {
                xfVar.i(0);
            }
            if (w12.g(w12.e)) {
                xfVar.f(0);
            }
            xfVar.f = true;
        }
        int i6 = wg.a;
        if (i5 == 2) {
            f = 4.0f;
        } else {
            f = 1.0f;
        }
        long f6 = l35.f(f, j3);
        int i7 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i7) == 0.0f) {
            j2 = 4294967295L;
        } else if (!w12.g(w12.d) || Float.intBitsToFloat(i7) >= 0.0f) {
            j2 = 4294967295L;
            if (w12.g(w12.e) && Float.intBitsToFloat(i7) > 0.0f) {
                float f7 = xfVar.f(f6);
                if (!w12.g(w12.e)) {
                    w12.b().finish();
                }
                if (f7 == Float.intBitsToFloat((int) (f6 & 4294967295L))) {
                    f2 = Float.intBitsToFloat(i7);
                } else {
                    f2 = f7 / f;
                }
                i2 = (int) (j3 >> 32);
                if (Float.intBitsToFloat(i2) != 0.0f) {
                    if (w12.g(w12.f) && Float.intBitsToFloat(i2) < 0.0f) {
                        h = xfVar.g(f6);
                        if (!w12.g(w12.f)) {
                            w12.c().finish();
                        }
                        if (h == Float.intBitsToFloat((int) (f6 >> 32))) {
                            f3 = Float.intBitsToFloat(i2);
                            floatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & j2);
                            if (!l35.b(floatToRawIntBits, 0)) {
                            }
                            d = l35.d(j3, floatToRawIntBits);
                            long j4 = ((l35) ay5.y(new l35(d))).a;
                            long j5 = floatToRawIntBits;
                            long d2 = l35.d(d, j4);
                            int i8 = i2;
                            xfVar.a();
                            if (i5 == 1) {
                            }
                            z = false;
                            if (!l35.b(d, 0)) {
                            }
                            if (z) {
                            }
                            return l35.e(j5, j4);
                        }
                    } else if (w12.g(w12.g) && Float.intBitsToFloat(i2) > 0.0f) {
                        h = xfVar.h(f6);
                        if (!w12.g(w12.g)) {
                            w12.d().finish();
                        }
                        if (h == Float.intBitsToFloat((int) (f6 >> 32))) {
                            f3 = Float.intBitsToFloat(i2);
                            floatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & j2);
                            if (!l35.b(floatToRawIntBits, 0)) {
                                xfVar.d();
                            }
                            d = l35.d(j3, floatToRawIntBits);
                            long j42 = ((l35) ay5.y(new l35(d))).a;
                            long j52 = floatToRawIntBits;
                            long d22 = l35.d(d, j42);
                            int i82 = i2;
                            if (!(Float.intBitsToFloat((int) (d >> 32)) == 0.0f && Float.intBitsToFloat((int) (d & j2)) == 0.0f) && (!(Float.intBitsToFloat((int) (j42 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j42 & j2)) == 0.0f) && (w12.g(w12.f) || w12.g(w12.d) || w12.g(w12.g) || w12.g(w12.e)))) {
                                xfVar.a();
                            }
                            if (i5 == 1) {
                                int i9 = (int) (d22 >> 32);
                                if (Float.intBitsToFloat(i9) > 0.5f) {
                                    xfVar.g(d22);
                                } else if (Float.intBitsToFloat(i9) < -0.5f) {
                                    xfVar.h(d22);
                                } else {
                                    f5 = 0.5f;
                                    f4 = -0.5f;
                                    z4 = false;
                                    i3 = (int) (d22 & j2);
                                    if (Float.intBitsToFloat(i3) <= f5) {
                                        xfVar.i(d22);
                                    } else if (Float.intBitsToFloat(i3) < f4) {
                                        xfVar.f(d22);
                                    } else {
                                        z5 = false;
                                        if (z4 || z5) {
                                            z = true;
                                            if (!l35.b(d, 0)) {
                                                if (!w12.f(w12.f) || Float.intBitsToFloat(i82) >= 0.0f) {
                                                    z2 = false;
                                                } else {
                                                    EdgeEffect c = w12.c();
                                                    float intBitsToFloat = Float.intBitsToFloat(i82);
                                                    if (c instanceof gw2) {
                                                        gw2 gw2 = (gw2) c;
                                                        float f8 = gw2.b + intBitsToFloat;
                                                        gw2.b = f8;
                                                        if (Math.abs(f8) > gw2.a) {
                                                            gw2.onRelease();
                                                        }
                                                    } else {
                                                        c.onRelease();
                                                    }
                                                    z2 = w12.f(w12.f);
                                                }
                                                if (w12.f(w12.g) && Float.intBitsToFloat(i82) > 0.0f) {
                                                    EdgeEffect d3 = w12.d();
                                                    float intBitsToFloat2 = Float.intBitsToFloat(i82);
                                                    if (d3 instanceof gw2) {
                                                        gw2 gw22 = (gw2) d3;
                                                        float f9 = gw22.b + intBitsToFloat2;
                                                        gw22.b = f9;
                                                        if (Math.abs(f9) > gw22.a) {
                                                            gw22.onRelease();
                                                        }
                                                    } else {
                                                        d3.onRelease();
                                                    }
                                                    if (z2 || w12.f(w12.g)) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                }
                                                if (w12.f(w12.d) && Float.intBitsToFloat(i7) < 0.0f) {
                                                    EdgeEffect e = w12.e();
                                                    float intBitsToFloat3 = Float.intBitsToFloat(i7);
                                                    if (e instanceof gw2) {
                                                        gw2 gw23 = (gw2) e;
                                                        float f10 = gw23.b + intBitsToFloat3;
                                                        gw23.b = f10;
                                                        if (Math.abs(f10) > gw23.a) {
                                                            gw23.onRelease();
                                                        }
                                                    } else {
                                                        e.onRelease();
                                                    }
                                                    if (z2 || w12.f(w12.d)) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                }
                                                if (w12.f(w12.e) && Float.intBitsToFloat(i7) > 0.0f) {
                                                    EdgeEffect b = w12.b();
                                                    float intBitsToFloat4 = Float.intBitsToFloat(i7);
                                                    if (b instanceof gw2) {
                                                        gw2 gw24 = (gw2) b;
                                                        float f11 = gw24.b + intBitsToFloat4;
                                                        gw24.b = f11;
                                                        if (Math.abs(f11) > gw24.a) {
                                                            gw24.onRelease();
                                                        }
                                                    } else {
                                                        b.onRelease();
                                                    }
                                                    if (z2 || w12.f(w12.e)) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                }
                                                if (z2 || z) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                z = z3;
                                            }
                                            if (z) {
                                                xfVar.d();
                                            }
                                            return l35.e(j52, j42);
                                        }
                                    }
                                    z5 = true;
                                    z = true;
                                    if (!l35.b(d, 0)) {
                                    }
                                    if (z) {
                                    }
                                    return l35.e(j52, j42);
                                }
                                f5 = 0.5f;
                                f4 = -0.5f;
                                z4 = true;
                                i3 = (int) (d22 & j2);
                                if (Float.intBitsToFloat(i3) <= f5) {
                                }
                                z5 = true;
                                z = true;
                                if (!l35.b(d, 0)) {
                                }
                                if (z) {
                                }
                                return l35.e(j52, j42);
                            }
                            z = false;
                            if (!l35.b(d, 0)) {
                            }
                            if (z) {
                            }
                            return l35.e(j52, j42);
                        }
                    }
                    f3 = h / f;
                    floatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & j2);
                    if (!l35.b(floatToRawIntBits, 0)) {
                    }
                    d = l35.d(j3, floatToRawIntBits);
                    long j422 = ((l35) ay5.y(new l35(d))).a;
                    long j522 = floatToRawIntBits;
                    long d222 = l35.d(d, j422);
                    int i822 = i2;
                    xfVar.a();
                    if (i5 == 1) {
                    }
                    z = false;
                    if (!l35.b(d, 0)) {
                    }
                    if (z) {
                    }
                    return l35.e(j522, j422);
                }
                f3 = 0.0f;
                floatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & j2);
                if (!l35.b(floatToRawIntBits, 0)) {
                }
                d = l35.d(j3, floatToRawIntBits);
                long j4222 = ((l35) ay5.y(new l35(d))).a;
                long j5222 = floatToRawIntBits;
                long d2222 = l35.d(d, j4222);
                int i8222 = i2;
                xfVar.a();
                if (i5 == 1) {
                }
                z = false;
                if (!l35.b(d, 0)) {
                }
                if (z) {
                }
                return l35.e(j5222, j4222);
            }
        } else {
            float i10 = xfVar.i(f6);
            j2 = 4294967295L;
            if (!w12.g(w12.d)) {
                w12.e().finish();
            }
            if (i10 == Float.intBitsToFloat((int) (f6 & 4294967295L))) {
                f2 = Float.intBitsToFloat(i7);
            } else {
                f2 = i10 / f;
            }
            i2 = (int) (j3 >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
            }
            f3 = 0.0f;
            floatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & j2);
            if (!l35.b(floatToRawIntBits, 0)) {
            }
            d = l35.d(j3, floatToRawIntBits);
            long j42222 = ((l35) ay5.y(new l35(d))).a;
            long j52222 = floatToRawIntBits;
            long d22222 = l35.d(d, j42222);
            int i82222 = i2;
            xfVar.a();
            if (i5 == 1) {
            }
            z = false;
            if (!l35.b(d, 0)) {
            }
            if (z) {
            }
            return l35.e(j52222, j42222);
        }
        f2 = 0.0f;
        i2 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        f3 = 0.0f;
        floatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & j2);
        if (!l35.b(floatToRawIntBits, 0)) {
        }
        d = l35.d(j3, floatToRawIntBits);
        long j422222 = ((l35) ay5.y(new l35(d))).a;
        long j522222 = floatToRawIntBits;
        long d222222 = l35.d(d, j422222);
        int i822222 = i2;
        xfVar.a();
        if (i5 == 1) {
        }
        z = false;
        if (!l35.b(d, 0)) {
        }
        if (z) {
        }
        return l35.e(j522222, j422222);
    }
}
