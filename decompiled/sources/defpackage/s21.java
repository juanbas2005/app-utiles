package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* renamed from: s21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s21 {
    public static final SparseIntArray o0;
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public int b;
    public int b0;
    public int c;
    public float c0;
    public int d;
    public float d0;
    public int e;
    public int e0;
    public float f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int[] h0;
    public int i;
    public String i0;
    public int j;
    public String j0;
    public int k;
    public boolean k0;
    public int l;
    public boolean l0;
    public int m;
    public boolean m0;
    public int n;
    public int n0;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public float v;
    public float w;
    public String x;
    public int y;
    public int z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        o0 = sparseIntArray;
        sparseIntArray.append(42, 24);
        sparseIntArray.append(43, 25);
        sparseIntArray.append(45, 28);
        sparseIntArray.append(46, 29);
        sparseIntArray.append(51, 35);
        sparseIntArray.append(50, 34);
        sparseIntArray.append(23, 4);
        sparseIntArray.append(22, 3);
        sparseIntArray.append(18, 1);
        sparseIntArray.append(60, 6);
        sparseIntArray.append(61, 7);
        sparseIntArray.append(30, 17);
        sparseIntArray.append(31, 18);
        sparseIntArray.append(32, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(47, 31);
        sparseIntArray.append(48, 32);
        sparseIntArray.append(29, 10);
        sparseIntArray.append(28, 9);
        sparseIntArray.append(65, 13);
        sparseIntArray.append(68, 16);
        sparseIntArray.append(66, 14);
        sparseIntArray.append(63, 11);
        sparseIntArray.append(67, 15);
        sparseIntArray.append(64, 12);
        sparseIntArray.append(54, 38);
        sparseIntArray.append(40, 37);
        sparseIntArray.append(39, 39);
        sparseIntArray.append(53, 40);
        sparseIntArray.append(38, 20);
        sparseIntArray.append(52, 36);
        sparseIntArray.append(27, 5);
        sparseIntArray.append(41, 76);
        sparseIntArray.append(49, 76);
        sparseIntArray.append(44, 76);
        sparseIntArray.append(21, 76);
        sparseIntArray.append(17, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(55, 41);
        sparseIntArray.append(33, 42);
        sparseIntArray.append(16, 41);
        sparseIntArray.append(15, 42);
        sparseIntArray.append(70, 97);
        sparseIntArray.append(24, 61);
        sparseIntArray.append(26, 62);
        sparseIntArray.append(25, 63);
        sparseIntArray.append(59, 69);
        sparseIntArray.append(37, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jv5.e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray = o0;
            int i3 = sparseIntArray.get(index);
            if (i3 == 80) {
                this.k0 = obtainStyledAttributes.getBoolean(index, this.k0);
            } else if (i3 == 81) {
                this.l0 = obtainStyledAttributes.getBoolean(index, this.l0);
            } else if (i3 != 97) {
                switch (i3) {
                    case 1:
                        this.o = w21.f(obtainStyledAttributes, index, this.o);
                        break;
                    case 2:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 3:
                        this.n = w21.f(obtainStyledAttributes, index, this.n);
                        break;
                    case 4:
                        this.m = w21.f(obtainStyledAttributes, index, this.m);
                        break;
                    case 5:
                        this.x = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                        break;
                    case 7:
                        this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 8:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 9:
                        this.u = w21.f(obtainStyledAttributes, index, this.u);
                        break;
                    case 10:
                        this.t = w21.f(obtainStyledAttributes, index, this.t);
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 12:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 14:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case h75.g:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 16:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 17:
                        this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                        break;
                    case 18:
                        this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 19:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 20:
                        this.v = obtainStyledAttributes.getFloat(index, this.v);
                        break;
                    case 21:
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 22:
                        this.b = obtainStyledAttributes.getLayoutDimension(index, this.b);
                        break;
                    case 23:
                        this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                        break;
                    case 24:
                        this.g = w21.f(obtainStyledAttributes, index, this.g);
                        break;
                    case 25:
                        this.h = w21.f(obtainStyledAttributes, index, this.h);
                        break;
                    case 26:
                        this.D = obtainStyledAttributes.getInt(index, this.D);
                        break;
                    case 27:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 28:
                        this.i = w21.f(obtainStyledAttributes, index, this.i);
                        break;
                    case 29:
                        this.j = w21.f(obtainStyledAttributes, index, this.j);
                        break;
                    case 30:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 31:
                        this.r = w21.f(obtainStyledAttributes, index, this.r);
                        break;
                    case 32:
                        this.s = w21.f(obtainStyledAttributes, index, this.s);
                        break;
                    case 33:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 34:
                        this.l = w21.f(obtainStyledAttributes, index, this.l);
                        break;
                    case 35:
                        this.k = w21.f(obtainStyledAttributes, index, this.k);
                        break;
                    case 36:
                        this.w = obtainStyledAttributes.getFloat(index, this.w);
                        break;
                    case 37:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 38:
                        this.S = obtainStyledAttributes.getFloat(index, this.S);
                        break;
                    case 39:
                        this.U = obtainStyledAttributes.getInt(index, this.U);
                        break;
                    case 40:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 41:
                        w21.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        w21.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i3) {
                            case 54:
                                this.W = obtainStyledAttributes.getInt(index, this.W);
                                break;
                            case 55:
                                this.X = obtainStyledAttributes.getInt(index, this.X);
                                break;
                            case 56:
                                this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                break;
                            case 57:
                                this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                break;
                            case 58:
                                this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                break;
                            case 59:
                                this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                break;
                            default:
                                switch (i3) {
                                    case 61:
                                        this.y = w21.f(obtainStyledAttributes, index, this.y);
                                        break;
                                    case 62:
                                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                                        break;
                                    case 63:
                                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                                        break;
                                    default:
                                        switch (i3) {
                                            case 69:
                                                this.c0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                this.d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                break;
                                            case 72:
                                                this.e0 = obtainStyledAttributes.getInt(index, this.e0);
                                                break;
                                            case 73:
                                                this.f0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f0);
                                                break;
                                            case 74:
                                                this.i0 = obtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                                break;
                                            case 76:
                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                break;
                                            case 77:
                                                this.j0 = obtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 91:
                                                        this.p = w21.f(obtainStyledAttributes, index, this.p);
                                                        break;
                                                    case 92:
                                                        this.q = w21.f(obtainStyledAttributes, index, this.q);
                                                        break;
                                                    case 93:
                                                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                                        break;
                                                    case 94:
                                                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                        break;
                                                }
                                        }
                                }
                        }
                }
            } else {
                this.n0 = obtainStyledAttributes.getInt(index, this.n0);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
