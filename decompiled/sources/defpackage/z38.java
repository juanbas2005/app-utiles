package defpackage;

/* renamed from: z38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z38 {
    public final boolean a;
    public final y38 b;
    public final int c;
    public final oe1[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public z38(boolean z, y38 y38) {
        int i;
        this.a = z;
        this.b = y38;
        if (!z || !y38.equals(y38.w)) {
            int ordinal = y38.ordinal();
            if (ordinal == 0) {
                i = 3;
            } else if (ordinal == 1) {
                i = 2;
            } else {
                h.c();
                throw null;
            }
            this.c = i;
            this.d = new oe1[20];
            this.f = new float[20];
            this.g = new float[20];
            this.h = new float[3];
            return;
        }
        h.s("Lsq2 not (yet) supported for differential axes");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: oe1[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: oe1} */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, oe1] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void a(float f2, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        oe1[] oe1Arr = this.d;
        oe1 oe1 = oe1Arr[i];
        if (oe1 == 0) {
            ? obj = new Object();
            obj.a = j;
            obj.b = f2;
            oe1Arr[i] = obj;
            return;
        }
        oe1.a = j;
        oe1.b = f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r5 = r16;
     */
    public final float b() {
        boolean z;
        y38 y38;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        int i3 = this.e;
        oe1[] oe1Arr = this.d;
        oe1 oe1 = oe1Arr[i3];
        if (oe1 == null) {
            return 0.0f;
        }
        int i4 = 0;
        oe1 oe12 = oe1;
        while (true) {
            oe1 oe13 = oe1Arr[i3];
            z = this.a;
            y38 = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (oe13 != null) {
                long j = oe1.a;
                i = i4;
                f2 = 0.0f;
                long j2 = oe13.a;
                float f6 = (float) (j - j2);
                fArr2 = fArr3;
                i2 = 1;
                float abs = (float) Math.abs(j2 - oe12.a);
                if (y38 == y38.w || z) {
                    oe12 = oe13;
                } else {
                    oe12 = oe1;
                }
                if (f6 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr2[i] = oe13.b;
                fArr[i] = -f6;
                if (i3 == 0) {
                    i3 = 20;
                }
                i3--;
                i4 = i + 1;
                if (i4 >= 20) {
                    break;
                }
            } else {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f2 = 0.0f;
                break;
            }
        }
        if (i4 < this.c) {
            return f2;
        }
        int ordinal = y38.ordinal();
        if (ordinal == 0) {
            try {
                float[] fArr4 = this.h;
                z65.J(fArr, fArr2, i4, fArr4);
                f4 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f4 = f2;
            }
            f3 = f4;
        } else if (ordinal == i2) {
            int i5 = i4 - i2;
            float f7 = fArr[i5];
            int i6 = i5;
            float f8 = f2;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f9 = fArr[i7];
                if (f7 != f9) {
                    if (z) {
                        f5 = -fArr2[i7];
                    } else {
                        f5 = fArr2[i6] - fArr2[i7];
                    }
                    float f10 = f5 / (f7 - f9);
                    float abs2 = (Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt((double) (Math.abs(f8) * 2.0f)))))) + f8;
                    if (i6 == i5) {
                        abs2 *= 0.5f;
                    }
                    f8 = abs2;
                }
                i6--;
                f7 = f9;
            }
            f3 = Math.signum(f8) * ((float) Math.sqrt((double) (Math.abs(f8) * 2.0f)));
        } else {
            h.c();
            return f2;
        }
        return f3 * 1000.0f;
    }

    public final float c(float f2) {
        if (f2 <= 0.0f) {
            yb3.b("maximumVelocity should be a positive value. You specified=" + f2);
        }
        float b2 = b();
        if (b2 == 0.0f || Float.isNaN(b2)) {
            return 0.0f;
        }
        if (b2 <= 0.0f) {
            float f3 = -f2;
            if (b2 < f3) {
                return f3;
            }
        } else if (b2 > f2) {
            return f2;
        }
        return b2;
    }

    public /* synthetic */ z38() {
        this(false, y38.w);
    }

    public z38(boolean z) {
        this(z, y38.x);
    }
}
