package defpackage;

import com.google.zxing.NotFoundException;

/* renamed from: u88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u88 {
    public final k90 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public u88(k90 k90, int i, int i2, int i3) {
        this.a = k90;
        int i4 = k90.x;
        this.b = i4;
        int i5 = k90.w;
        this.c = i5;
        int i6 = i / 2;
        int i7 = i2 - i6;
        this.d = i7;
        int i8 = i2 + i6;
        this.e = i8;
        int i9 = i3 - i6;
        this.g = i9;
        int i10 = i3 + i6;
        this.f = i10;
        if (i9 < 0 || i7 < 0 || i10 >= i4 || i8 >= i5) {
            throw NotFoundException.y;
        }
    }

    public final boolean a(int i, int i2, int i3, boolean z) {
        k90 k90 = this.a;
        if (z) {
            while (i <= i2) {
                if (k90.b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (k90.b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final r66[] b() {
        int i;
        int i2;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.g;
        int i6 = this.f;
        boolean z = false;
        int i7 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        while (true) {
            i = this.c;
            if (!z6) {
                break;
            }
            boolean z7 = false;
            boolean z8 = true;
            while (true) {
                if ((z8 || !z2) && i4 < i) {
                    z8 = a(i5, i6, i4, false);
                    if (z8) {
                        i4++;
                        z2 = true;
                        z7 = true;
                    } else if (!z2) {
                        i4++;
                    }
                }
            }
            if (i4 < i) {
                boolean z9 = true;
                while (true) {
                    i2 = this.b;
                    if ((z9 || !z3) && i6 < i2) {
                        z9 = a(i3, i4, i6, true);
                        if (z9) {
                            i6++;
                            z3 = true;
                            z7 = true;
                        } else if (!z3) {
                            i6++;
                        }
                    }
                }
                if (i6 < i2) {
                    boolean z10 = true;
                    while (true) {
                        if ((z10 || !z4) && i3 >= 0) {
                            z10 = a(i5, i6, i3, false);
                            if (z10) {
                                i3--;
                                z4 = true;
                                z7 = true;
                            } else if (!z4) {
                                i3--;
                            }
                        }
                    }
                    if (i3 >= 0) {
                        z6 = z7;
                        boolean z11 = true;
                        while (true) {
                            if ((z11 || !z5) && i5 >= 0) {
                                z11 = a(i3, i4, i5, true);
                                if (z11) {
                                    i5--;
                                    z6 = true;
                                    z5 = true;
                                } else if (!z5) {
                                    i5--;
                                }
                            }
                        }
                        if (i5 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        if (!z) {
            int i8 = i4 - i3;
            r66 r66 = null;
            int i9 = 1;
            r66 r662 = null;
            while (r662 == null && i9 < i8) {
                r662 = c((float) i3, (float) (i6 - i9), (float) (i3 + i9), (float) i6);
                i9++;
            }
            if (r662 != null) {
                int i10 = 1;
                r66 r663 = null;
                while (r663 == null && i10 < i8) {
                    r663 = c((float) i3, (float) (i5 + i10), (float) (i3 + i10), (float) i5);
                    i10++;
                }
                if (r663 != null) {
                    int i11 = 1;
                    r66 r664 = null;
                    while (r664 == null && i11 < i8) {
                        r664 = c((float) i4, (float) (i5 + i11), (float) (i4 - i11), (float) i5);
                        i11++;
                    }
                    if (r664 != null) {
                        while (r66 == null && i7 < i8) {
                            r66 = c((float) i4, (float) (i6 - i7), (float) (i4 - i7), (float) i6);
                            i7++;
                        }
                        if (r66 != null) {
                            float f2 = r66.a;
                            float f3 = r66.b;
                            float f4 = r662.a;
                            float f5 = r662.b;
                            float f6 = r664.a;
                            float f7 = r664.b;
                            float f8 = r663.a;
                            float f9 = r663.b;
                            if (f2 < ((float) i) / 2.0f) {
                                return new r66[]{new r66(f8 - 1.0f, f9 + 1.0f), new r66(f4 + 1.0f, f5 + 1.0f), new r66(f6 - 1.0f, f7 - 1.0f), new r66(f2 + 1.0f, f3 - 1.0f)};
                            }
                            return new r66[]{new r66(f8 + 1.0f, f9 + 1.0f), new r66(f4 + 1.0f, f5 - 1.0f), new r66(f6 - 1.0f, f7 + 1.0f), new r66(f2 - 1.0f, f3 - 1.0f)};
                        }
                        throw NotFoundException.y;
                    }
                    throw NotFoundException.y;
                }
                throw NotFoundException.y;
            }
            throw NotFoundException.y;
        }
        throw NotFoundException.y;
    }

    public final r66 c(float f2, float f3, float f4, float f5) {
        int w0 = bb0.w0(bb0.f0(f2, f3, f4, f5));
        float f6 = (float) w0;
        float f7 = (f4 - f2) / f6;
        float f8 = (f5 - f3) / f6;
        for (int i = 0; i < w0; i++) {
            float f9 = (float) i;
            int w02 = bb0.w0((f9 * f7) + f2);
            int w03 = bb0.w0((f9 * f8) + f3);
            if (this.a.b(w02, w03)) {
                return new r66((float) w02, (float) w03);
            }
        }
        return null;
    }

    public u88(k90 k90) {
        this(k90, 10, k90.w / 2, k90.x / 2);
    }
}
