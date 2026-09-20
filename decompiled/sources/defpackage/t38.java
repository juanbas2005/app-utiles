package defpackage;

/* renamed from: t38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t38 implements o38 {
    public int[] A = n38.a;
    public float[] B;
    public ol C;
    public ol D;
    public ol E;
    public ol F;
    public float[] G;
    public float[] H;
    public wv2 I;
    public final xo4 w;
    public final yo4 x;
    public final int y;
    public final i12 z;

    public t38(xo4 xo4, yo4 yo4, int i, i12 i12) {
        this.w = xo4;
        this.x = yo4;
        this.y = i;
        this.z = i12;
        float[] fArr = n38.b;
        this.B = fArr;
        this.G = fArr;
        this.H = fArr;
        this.I = n38.c;
    }

    public final int b(int i) {
        int i2;
        xo4 xo4 = this.w;
        int i3 = xo4.b;
        int i4 = 0;
        if (i3 > 0) {
            int i5 = i3 - 1;
            while (true) {
                if (i4 <= i5) {
                    i2 = (i4 + i5) >>> 1;
                    int i6 = xo4.a[i2];
                    if (i6 >= i) {
                        if (i6 <= i) {
                            break;
                        }
                        i5 = i2 - 1;
                    } else {
                        i4 = i2 + 1;
                    }
                } else {
                    i2 = -(i4 + 1);
                    break;
                }
            }
            if (i2 < -1) {
                return -(i2 + 2);
            }
            return i2;
        }
        h.l("");
        return 0;
    }

    public final float c(int i, int i2, boolean z2) {
        i12 i12;
        float f;
        xo4 xo4 = this.w;
        if (i >= xo4.b - 1) {
            f = (float) i2;
        } else {
            int c = xo4.c(i);
            int c2 = xo4.c(i + 1);
            if (i2 == c) {
                f = (float) c;
            } else {
                int i3 = c2 - c;
                s38 s38 = (s38) this.x.b(c);
                if (s38 == null || (i12 = s38.b) == null) {
                    i12 = this.z;
                }
                float f2 = (float) i3;
                float b = i12.b(((float) (i2 - c)) / f2);
                if (z2) {
                    return b;
                }
                return ((f2 * b) + ((float) c)) / 1000.0f;
            }
        }
        return f / 1000.0f;
    }

    public final void e(ol olVar, ol olVar2, ol olVar3) {
        boolean z2;
        float[] fArr;
        if (this.I != n38.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        ol olVar4 = this.C;
        yo4 yo4 = this.x;
        xo4 xo4 = this.w;
        if (olVar4 == null) {
            this.C = olVar.c();
            this.D = olVar3.c();
            int i = xo4.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = ((float) xo4.c(i2)) / 1000.0f;
            }
            this.B = fArr2;
            int i3 = xo4.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                s38 s38 = (s38) yo4.b(xo4.c(i4));
                iArr[i4] = 0;
            }
            this.A = iArr;
        }
        if (z2) {
            if (this.I == n38.c || !sg3.e(this.E, olVar) || !sg3.e(this.F, olVar2)) {
                this.E = olVar;
                this.F = olVar2;
                int b = olVar.b() + (olVar.b() % 2);
                this.G = new float[b];
                this.H = new float[b];
                int i5 = xo4.b;
                float[][] fArr3 = new float[i5][];
                for (int i6 = 0; i6 < i5; i6++) {
                    int c = xo4.c(i6);
                    s38 s382 = (s38) yo4.b(c);
                    if (c == 0 && s382 == null) {
                        fArr = new float[b];
                        for (int i7 = 0; i7 < b; i7++) {
                            fArr[i7] = olVar.a(i7);
                        }
                    } else if (c == this.y && s382 == null) {
                        fArr = new float[b];
                        for (int i8 = 0; i8 < b; i8++) {
                            fArr[i8] = olVar2.a(i8);
                        }
                    } else {
                        s382.getClass();
                        ol olVar5 = s382.a;
                        float[] fArr4 = new float[b];
                        for (int i9 = 0; i9 < b; i9++) {
                            fArr4[i9] = olVar5.a(i9);
                        }
                        fArr = fArr4;
                    }
                    fArr3[i6] = fArr;
                }
                this.I = new wv2(this.A, this.B, fArr3);
            }
        }
    }

    public final ol j(long j, ol olVar, ol olVar2, ol olVar3) {
        long j2;
        ol olVar4 = olVar3;
        long j3 = j / 1000000;
        int[] iArr = n38.a;
        long j4 = (long) this.y;
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 < 0) {
            return olVar4;
        }
        ol olVar5 = olVar;
        ol olVar6 = olVar2;
        e(olVar5, olVar6, olVar4);
        ol olVar7 = this.D;
        olVar7.getClass();
        int i = 0;
        if (this.I != n38.c) {
            int i2 = (int) j2;
            float c = c(b(i2), i2, false);
            float[] fArr = this.H;
            nr[][] nrVarArr = (nr[][]) this.I.x;
            float f = nrVarArr[0][0].a;
            float f2 = nrVarArr[nrVarArr.length - 1][0].b;
            if (c < f) {
                c = f;
            }
            if (c <= f2) {
                f2 = c;
            }
            int length = fArr.length;
            int length2 = nrVarArr.length;
            boolean z2 = false;
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < length - 1) {
                    nr nrVar = nrVarArr[i3][i5];
                    if (f2 <= nrVar.b) {
                        if (nrVar.p) {
                            fArr[i4] = nrVar.q;
                            fArr[i4 + 1] = nrVar.r;
                        } else {
                            nrVar.c(f2);
                            fArr[i4] = nrVar.a();
                            fArr[i4 + 1] = nrVar.b();
                        }
                        z2 = true;
                    }
                    i4 += 2;
                    i5++;
                }
                if (z2) {
                    break;
                }
            }
            int length3 = fArr.length;
            while (i < length3) {
                olVar7.e(i, fArr[i]);
                i++;
            }
        } else {
            ol t = t((j2 - 1) * 1000000, olVar5, olVar6, olVar4);
            ol t2 = t(j2 * 1000000, olVar, olVar2, olVar3);
            int b = t.b();
            while (i < b) {
                olVar7.e(i, (t.a(i) - t2.a(i)) * 1000.0f);
                i++;
            }
        }
        return olVar7;
    }

    public final int n() {
        return 0;
    }

    public final int r() {
        return this.y;
    }

    public final ol t(long j, ol olVar, ol olVar2, ol olVar3) {
        ol olVar4;
        ol olVar5;
        nr[][] nrVarArr;
        ol olVar6 = olVar;
        ol olVar7 = olVar2;
        long j2 = j / 1000000;
        int[] iArr = n38.a;
        int i = this.y;
        long j3 = (long) i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        yo4 yo4 = this.x;
        s38 s38 = (s38) yo4.b(i2);
        if (s38 != null) {
            return s38.a;
        }
        if (i2 >= i) {
            return olVar7;
        }
        if (i2 <= 0) {
            return olVar6;
        }
        e(olVar6, olVar7, olVar3);
        ol olVar8 = this.C;
        olVar8.getClass();
        int i3 = 0;
        if (this.I != n38.c) {
            float c = c(b(i2), i2, false);
            float[] fArr = this.G;
            nr[][] nrVarArr2 = (nr[][]) this.I.x;
            int length = nrVarArr2.length - 1;
            float f = nrVarArr2[0][0].a;
            float f2 = nrVarArr2[length][0].b;
            int length2 = fArr.length;
            if (c < f || c > f2) {
                if (c > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = c - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    nr nrVar = nrVarArr2[length][i5];
                    boolean z2 = nrVar.p;
                    float f4 = nrVar.r;
                    float f5 = nrVar.q;
                    if (z2) {
                        float f6 = nrVar.a;
                        float f7 = nrVar.k;
                        float f8 = nrVar.c;
                        nrVarArr = nrVarArr2;
                        fArr[i4] = (f5 * f3) + b81.d(nrVar.e, f8, (f - f6) * f7, f8);
                        float f9 = nrVar.d;
                        fArr[i4 + 1] = (f4 * f3) + b81.d(nrVar.f, f9, (f - f6) * f7, f9);
                    } else {
                        nrVarArr = nrVarArr2;
                        nrVar.c(f);
                        fArr[i4] = (nrVar.a() * f3) + (nrVar.n * nrVar.h) + f5;
                        fArr[i4 + 1] = (nrVar.b() * f3) + (nrVar.o * nrVar.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    nrVarArr2 = nrVarArr;
                }
            } else {
                int length3 = nrVarArr2.length;
                int i6 = 0;
                boolean z3 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        nr nrVar2 = nrVarArr2[i6][i8];
                        if (c <= nrVar2.b) {
                            if (nrVar2.p) {
                                float f10 = nrVar2.a;
                                float f11 = nrVar2.k;
                                float f12 = nrVar2.c;
                                fArr[i7] = b81.d(nrVar2.e, f12, (c - f10) * f11, f12);
                                float f13 = nrVar2.d;
                                fArr[i7 + 1] = b81.d(nrVar2.f, f13, (c - f10) * f11, f13);
                            } else {
                                nrVar2.c(c);
                                fArr[i7] = (nrVar2.n * nrVar2.h) + nrVar2.q;
                                fArr[i7 + 1] = (nrVar2.o * nrVar2.i) + nrVar2.r;
                            }
                            z3 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z3) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                olVar8.e(i9, fArr[i9]);
            }
        } else {
            int b = b(i2);
            float c2 = c(b, i2, true);
            xo4 xo4 = this.w;
            s38 s382 = (s38) yo4.b(xo4.c(b));
            if (!(s382 == null || (olVar5 = s382.a) == null)) {
                olVar6 = olVar5;
            }
            s38 s383 = (s38) yo4.b(xo4.c(b + 1));
            if (s383 == null || (olVar4 = s383.a) == null) {
                olVar4 = olVar7;
            }
            int b2 = olVar8.b();
            for (int i10 = 0; i10 < b2; i10++) {
                olVar8.e(i10, (olVar4.a(i10) * c2) + ((1.0f - c2) * olVar6.a(i10)));
            }
        }
        return olVar8;
    }
}
