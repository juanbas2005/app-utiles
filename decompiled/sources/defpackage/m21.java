package defpackage;

import android.view.ViewGroup;

/* renamed from: m21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m21 extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public String F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public String X;
    public int Y;
    public boolean Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public int d;
    public boolean d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public float k0;
    public int l;
    public int l0;
    public int m;
    public int m0;
    public int n;
    public float n0;
    public int o;
    public g31 o0;
    public int p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public final void a() {
        this.c0 = false;
        this.Z = true;
        this.a0 = true;
        int i2 = this.width;
        if (i2 == -2 && this.V) {
            this.Z = false;
            if (this.K == 0) {
                this.K = 1;
            }
        }
        int i3 = this.height;
        if (i3 == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.Z = false;
            if (i2 == 0 && this.K == 1) {
                this.width = -2;
                this.V = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.a0 = false;
            if (i3 == 0 && this.L == 1) {
                this.height = -2;
                this.W = true;
            }
        }
        if (this.c != -1.0f || this.a != -1 || this.b != -1) {
            this.c0 = true;
            this.Z = true;
            this.a0 = true;
            if (!(this.o0 instanceof zx2)) {
                this.o0 = new zx2();
            }
            ((zx2) this.o0).N(this.U);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    public final void resolveLayoutDirection(int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.leftMargin;
        int i8 = this.rightMargin;
        super.resolveLayoutDirection(i2);
        boolean z3 = false;
        if (1 == getLayoutDirection()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.g0 = -1;
        this.h0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.i0 = this.v;
        this.j0 = this.x;
        float f2 = this.D;
        this.k0 = f2;
        int i9 = this.a;
        this.l0 = i9;
        int i10 = this.b;
        this.m0 = i10;
        float f3 = this.c;
        this.n0 = f3;
        int i11 = this.r;
        if (z2) {
            if (i11 != -1) {
                this.g0 = i11;
            } else {
                int i12 = this.s;
                if (i12 != -1) {
                    this.h0 = i12;
                }
                i3 = this.t;
                if (i3 != -1) {
                    this.f0 = i3;
                    z3 = true;
                }
                i4 = this.u;
                if (i4 != -1) {
                    this.e0 = i4;
                    z3 = true;
                }
                i5 = this.z;
                if (i5 != Integer.MIN_VALUE) {
                    this.j0 = i5;
                }
                i6 = this.A;
                if (i6 != Integer.MIN_VALUE) {
                    this.i0 = i6;
                }
                if (z3) {
                    this.k0 = 1.0f - f2;
                }
                if (this.c0 && this.U == 1) {
                    if (f3 == -1.0f) {
                        this.n0 = 1.0f - f3;
                        this.l0 = -1;
                        this.m0 = -1;
                    } else if (i9 != -1) {
                        this.m0 = i9;
                        this.l0 = -1;
                        this.n0 = -1.0f;
                    } else if (i10 != -1) {
                        this.l0 = i10;
                        this.m0 = -1;
                        this.n0 = -1.0f;
                    }
                }
            }
            z3 = true;
            i3 = this.t;
            if (i3 != -1) {
            }
            i4 = this.u;
            if (i4 != -1) {
            }
            i5 = this.z;
            if (i5 != Integer.MIN_VALUE) {
            }
            i6 = this.A;
            if (i6 != Integer.MIN_VALUE) {
            }
            if (z3) {
            }
            if (f3 == -1.0f) {
            }
        } else {
            if (i11 != -1) {
                this.f0 = i11;
            }
            int i13 = this.s;
            if (i13 != -1) {
                this.e0 = i13;
            }
            int i14 = this.t;
            if (i14 != -1) {
                this.g0 = i14;
            }
            int i15 = this.u;
            if (i15 != -1) {
                this.h0 = i15;
            }
            int i16 = this.z;
            if (i16 != Integer.MIN_VALUE) {
                this.i0 = i16;
            }
            int i17 = this.A;
            if (i17 != Integer.MIN_VALUE) {
                this.j0 = i17;
            }
        }
        if (this.t == -1 && this.u == -1 && this.s == -1 && i11 == -1) {
            int i18 = this.f;
            if (i18 != -1) {
                this.g0 = i18;
                if (this.rightMargin <= 0 && i8 > 0) {
                    this.rightMargin = i8;
                }
            } else {
                int i19 = this.g;
                if (i19 != -1) {
                    this.h0 = i19;
                    if (this.rightMargin <= 0 && i8 > 0) {
                        this.rightMargin = i8;
                    }
                }
            }
            int i20 = this.d;
            if (i20 != -1) {
                this.e0 = i20;
                if (this.leftMargin <= 0 && i7 > 0) {
                    this.leftMargin = i7;
                    return;
                }
                return;
            }
            int i21 = this.e;
            if (i21 != -1) {
                this.f0 = i21;
                if (this.leftMargin <= 0 && i7 > 0) {
                    this.leftMargin = i7;
                }
            }
        }
    }
}
