package defpackage;

import java.util.Arrays;

/* renamed from: bs  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bs {
    public int a = 0;
    public final ns b;
    public final wr0 c;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public bs(ns nsVar, wr0 wr0) {
        this.b = nsVar;
        this.c = wr0;
    }

    public final void a(ly6 ly6, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.h;
            ns nsVar = this.b;
            if (i2 == -1) {
                this.h = 0;
                this.g[0] = f2;
                this.e[0] = ly6.x;
                this.f[0] = -1;
                ly6.G++;
                ly6.a(nsVar);
                this.a++;
                if (!this.j) {
                    int i3 = this.i + 1;
                    this.i = i3;
                    int[] iArr = this.e;
                    if (i3 >= iArr.length) {
                        this.j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.a) {
                int i6 = this.e[i2];
                int i7 = ly6.x;
                if (i6 == i7) {
                    float[] fArr = this.g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        int i8 = this.h;
                        int[] iArr2 = this.f;
                        if (i2 == i8) {
                            this.h = iArr2[i2];
                        } else {
                            iArr2[i5] = iArr2[i2];
                        }
                        if (z) {
                            ly6.b(nsVar);
                        }
                        if (this.j) {
                            this.i = i2;
                        }
                        ly6.G--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i5 = i2;
                }
                i2 = this.f[i2];
                i4++;
            }
            int i9 = this.i;
            int i10 = i9 + 1;
            if (this.j) {
                int[] iArr3 = this.e;
                if (iArr3[i9] != -1) {
                    i9 = iArr3.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr4 = this.e;
            if (i9 >= iArr4.length && this.a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i11 >= iArr5.length) {
                        break;
                    } else if (iArr5[i11] == -1) {
                        i9 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            int[] iArr6 = this.e;
            if (i9 >= iArr6.length) {
                i9 = iArr6.length;
                int i12 = this.d * 2;
                this.d = i12;
                this.j = false;
                this.i = i9 - 1;
                this.g = Arrays.copyOf(this.g, i12);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[i9] = ly6.x;
            this.g[i9] = f2;
            int[] iArr7 = this.f;
            if (i5 != -1) {
                iArr7[i9] = iArr7[i5];
                iArr7[i5] = i9;
            } else {
                iArr7[i9] = this.h;
                this.h = i9;
            }
            ly6.G++;
            ly6.a(nsVar);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i13 = this.i;
            int[] iArr8 = this.e;
            if (i13 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            ly6 ly6 = ((ly6[]) this.c.z)[this.e[i2]];
            if (ly6 != null) {
                ly6.b(this.b);
            }
            i2 = this.f[i2];
            i3++;
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final float c(ly6 ly6) {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == ly6.x) {
                return this.g[i2];
            }
            i2 = this.f[i2];
            i3++;
        }
        return 0.0f;
    }

    public final int d() {
        return this.a;
    }

    public final ly6 e(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return ((ly6[]) this.c.z)[this.e[i3]];
            }
            i3 = this.f[i3];
            i4++;
        }
        return null;
    }

    public final float f(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.g[i3];
            }
            i3 = this.f[i3];
            i4++;
        }
        return 0.0f;
    }

    public final void g(ly6 ly6, float f2) {
        if (f2 == 0.0f) {
            h(ly6, true);
            return;
        }
        int i2 = this.h;
        ns nsVar = this.b;
        if (i2 == -1) {
            this.h = 0;
            this.g[0] = f2;
            this.e[0] = ly6.x;
            this.f[0] = -1;
            ly6.G++;
            ly6.a(nsVar);
            this.a++;
            if (!this.j) {
                int i3 = this.i + 1;
                this.i = i3;
                int[] iArr = this.e;
                if (i3 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.a) {
            int i6 = this.e[i2];
            int i7 = ly6.x;
            if (i6 == i7) {
                this.g[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i5 = i2;
            }
            i2 = this.f[i2];
            i4++;
        }
        int i8 = this.i;
        int i9 = i8 + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.e;
        if (i8 >= iArr3.length && this.a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i10 >= iArr4.length) {
                    break;
                } else if (iArr4[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr5 = this.e;
        if (i8 >= iArr5.length) {
            i8 = iArr5.length;
            int i11 = this.d * 2;
            this.d = i11;
            this.j = false;
            this.i = i8 - 1;
            this.g = Arrays.copyOf(this.g, i11);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i8] = ly6.x;
        this.g[i8] = f2;
        int[] iArr6 = this.f;
        if (i5 != -1) {
            iArr6[i8] = iArr6[i5];
            iArr6[i5] = i8;
        } else {
            iArr6[i8] = this.h;
            this.h = i8;
        }
        ly6.G++;
        ly6.a(nsVar);
        int i12 = this.a + 1;
        this.a = i12;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i12 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(ly6 ly6, boolean z) {
        int i2 = this.h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == ly6.x) {
                int i5 = this.h;
                int[] iArr = this.f;
                if (i2 == i5) {
                    this.h = iArr[i2];
                } else {
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    ly6.b(this.b);
                }
                ly6.G--;
                this.a--;
                this.e[i2] = -1;
                if (this.j) {
                    this.i = i2;
                }
                return this.g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.h;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            StringBuilder o = b81.o(str.concat(" -> "));
            o.append(this.g[i2]);
            o.append(" : ");
            StringBuilder o2 = b81.o(o.toString());
            o2.append(((ly6[]) this.c.z)[this.e[i2]]);
            str = o2.toString();
            i2 = this.f[i2];
            i3++;
        }
        return str;
    }
}
