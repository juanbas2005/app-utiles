package defpackage;

import java.util.Arrays;

/* renamed from: uo5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uo5 extends ns {
    public ly6[] f;
    public ly6[] g;
    public int h;
    public kg5 i;

    public final ly6 d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.h; i3++) {
            ly6[] ly6Arr = this.f;
            ly6 ly6 = ly6Arr[i3];
            if (!zArr[ly6.x]) {
                kg5 kg5 = this.i;
                kg5.x = ly6;
                int i4 = 8;
                if (i2 != -1) {
                    ly6 ly62 = ly6Arr[i2];
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f2 = ly62.D[i4];
                        float f3 = ((ly6) kg5.x).D[i4];
                        if (f3 == f2) {
                            i4--;
                        } else if (f3 >= f2) {
                        }
                    }
                } else {
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f4 = ((ly6) kg5.x).D[i4];
                        if (f4 > 0.0f) {
                            break;
                        } else if (f4 < 0.0f) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f[i2];
    }

    public final boolean e() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    public final void i(x64 x64, ns nsVar, boolean z) {
        ns nsVar2 = nsVar;
        ly6 ly6 = nsVar2.a;
        if (ly6 != null) {
            float[] fArr = ly6.D;
            bs bsVar = nsVar2.d;
            int d = bsVar.d();
            for (int i2 = 0; i2 < d; i2++) {
                ly6 e = bsVar.e(i2);
                float f2 = bsVar.f(i2);
                kg5 kg5 = this.i;
                kg5.x = e;
                if (e.w) {
                    boolean z2 = true;
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr2 = ((ly6) kg5.x).D;
                        float f3 = (fArr[i3] * f2) + fArr2[i3];
                        fArr2[i3] = f3;
                        if (Math.abs(f3) < 1.0E-4f) {
                            ((ly6) kg5.x).D[i3] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        ((uo5) kg5.y).k((ly6) kg5.x);
                    }
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f4 = fArr[i4];
                        if (f4 != 0.0f) {
                            float f5 = f4 * f2;
                            if (Math.abs(f5) < 1.0E-4f) {
                                f5 = 0.0f;
                            }
                            ((ly6) kg5.x).D[i4] = f5;
                        } else {
                            ((ly6) kg5.x).D[i4] = 0.0f;
                        }
                    }
                    j(e);
                }
                this.b = (nsVar2.b * f2) + this.b;
            }
            k(ly6);
        }
    }

    public final void j(ly6 ly6) {
        int i2;
        ly6[] ly6Arr;
        int i3 = this.h + 1;
        ly6[] ly6Arr2 = this.f;
        if (i3 > ly6Arr2.length) {
            ly6[] ly6Arr3 = (ly6[]) Arrays.copyOf(ly6Arr2, ly6Arr2.length * 2);
            this.f = ly6Arr3;
            this.g = (ly6[]) Arrays.copyOf(ly6Arr3, ly6Arr3.length * 2);
        }
        ly6[] ly6Arr4 = this.f;
        int i4 = this.h;
        ly6Arr4[i4] = ly6;
        int i5 = i4 + 1;
        this.h = i5;
        if (i5 > 1 && ly6Arr4[i4].x > ly6.x) {
            int i6 = 0;
            while (true) {
                i2 = this.h;
                ly6Arr = this.g;
                if (i6 >= i2) {
                    break;
                }
                ly6Arr[i6] = this.f[i6];
                i6++;
            }
            Arrays.sort(ly6Arr, 0, i2, new a91(23));
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f[i7] = this.g[i7];
            }
        }
        ly6.w = true;
        ly6.a(this);
    }

    public final void k(ly6 ly6) {
        int i2 = 0;
        while (i2 < this.h) {
            if (this.f[i2] == ly6) {
                while (true) {
                    int i3 = this.h;
                    if (i2 < i3 - 1) {
                        ly6[] ly6Arr = this.f;
                        int i4 = i2 + 1;
                        ly6Arr[i2] = ly6Arr[i4];
                        i2 = i4;
                    } else {
                        this.h = i3 - 1;
                        ly6.w = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public final String toString() {
        kg5 kg5 = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i2 = 0; i2 < this.h; i2++) {
            kg5.x = this.f[i2];
            str = str + kg5 + " ";
        }
        return str;
    }
}
