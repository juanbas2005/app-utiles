package defpackage;

import android.os.Build;
import android.view.ViewParent;

/* renamed from: fx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fx2 implements o95 {
    public sr2 A;
    public long B = 9223372034707292159L;
    public boolean C;
    public final float[] D = eh4.a();
    public float[] E;
    public boolean F;
    public tp1 G = gl0.F();
    public ey3 H = ey3.w;
    public final tk0 I = new tk0();
    public int J;
    public long K = ql7.b;
    public n85 L;
    public boolean M;
    public boolean N;
    public boolean O = true;
    public boolean P;
    public final pb Q = new pb(13, this);
    public cx2 w;
    public final bx2 x;
    public final je y;
    public gs2 z;

    public fx2(cx2 cx2, bx2 bx2, je jeVar, gs2 gs2, sr2 sr2) {
        this.w = cx2;
        this.x = bx2;
        this.y = jeVar;
        this.z = gs2;
        this.A = sr2;
    }

    public final float[] a() {
        float[] fArr = this.E;
        if (fArr == null) {
            fArr = eh4.a();
            this.E = fArr;
        }
        if (this.N) {
            this.N = false;
            float[] b = b();
            if (this.O) {
                return b;
            }
            if (!su0.C(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z2 = this.M;
        float[] fArr = this.D;
        if (z2) {
            cx2 cx2 = this.w;
            long j = cx2.z;
            ex2 ex2 = cx2.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = fb5.k(pv8.O(this.B));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float B2 = ex2.B();
            float w2 = ex2.w();
            float D2 = ex2.D();
            float o = ex2.o();
            float q = ex2.q();
            float c = ex2.c();
            float L2 = ex2.L();
            double d = ((double) D2) * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (w2 * cos) - (0.0f * sin);
            float f3 = (0.0f * cos) + (w2 * sin);
            double d2 = ((double) o) * 0.017453292519943295d;
            float f4 = sin;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f5 = -sin2;
            float f6 = f4 * sin2;
            float f7 = f4 * cos2;
            float f8 = cos * sin2;
            float f9 = cos * cos2;
            float f10 = (f3 * sin2) + (B2 * cos2);
            float f11 = (f3 * cos2) + ((-B2) * sin2);
            float f12 = intBitsToFloat2;
            double d3 = ((double) q) * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float f13 = f12;
            float f14 = cos2;
            float cos3 = (float) Math.cos(d3);
            float f15 = -sin3;
            float f16 = (cos3 * f6) + (f15 * f14);
            float f17 = (f6 * sin3) + (f14 * cos3);
            float f18 = sin3 * cos;
            float f19 = f17 * c;
            float f20 = f18 * c;
            float f21 = ((sin3 * f7) + (cos3 * f5)) * c;
            float f22 = f16 * L2;
            float f23 = cos * cos3 * L2;
            float f24 = ((cos3 * f7) + (f15 * f5)) * L2;
            float f25 = f8 * 1.0f;
            float f26 = f * 1.0f;
            float f27 = f9 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f19;
                fArr[1] = f20;
                fArr[2] = f21;
                fArr[3] = 0.0f;
                fArr[4] = f22;
                fArr[5] = f23;
                fArr[6] = f24;
                fArr[7] = 0.0f;
                fArr[8] = f25;
                fArr[9] = f26;
                fArr[10] = f27;
                fArr[11] = 0.0f;
                float f28 = -intBitsToFloat;
                fArr[12] = ((f19 * f28) - (f13 * f22)) + f10 + intBitsToFloat;
                fArr[13] = ((f20 * f28) - (f13 * f23)) + f2 + f13;
                fArr[14] = ((f28 * f21) - (f13 * f24)) + f11;
                fArr[15] = 1.0f;
            }
            this.M = false;
            this.O = x91.D(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (!this.F && !this.C) {
            this.y.invalidate();
            f(true);
        }
    }

    public final void d(long j) {
        boolean j2 = je.j();
        je jeVar = this.y;
        if (j2) {
            jeVar.M(-4.0f);
        }
        cx2 cx2 = this.w;
        if (!oe3.a(cx2.t, j)) {
            cx2.t = j;
            cx2.a.n((int) (j >> 32), (int) (j & 4294967295L), cx2.u);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = jeVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(jeVar, jeVar);
                return;
            }
            return;
        }
        jeVar.invalidate();
    }

    public final void e(long j) {
        if (!we3.a(j, this.B)) {
            if (je.j()) {
                this.y.M(-4.0f);
            }
            this.B = j;
            c();
        }
    }

    public final void f(boolean z2) {
        if (z2 != this.F) {
            this.F = z2;
            je jeVar = this.y;
            lp4 lp4 = jeVar.V;
            boolean z3 = jeVar.a0;
            if (!z2) {
                if (!z3) {
                    lp4.j(this);
                    lp4 lp42 = jeVar.W;
                    if (lp42 != null) {
                        lp42.j(this);
                    }
                }
            } else if (!z3) {
                lp4.a(this);
            } else {
                lp4 lp43 = jeVar.W;
                if (lp43 == null) {
                    lp43 = new lp4();
                    jeVar.W = lp43;
                }
                lp43.a(this);
            }
        }
    }

    public final void g() {
        je.j();
        if (this.F) {
            if (!ql7.a(this.K, ql7.b) && !we3.a(this.w.u, this.B)) {
                cx2 cx2 = this.w;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.K >> 32)) * ((float) ((int) (this.B >> 32)));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.K & 4294967295L)) * ((float) ((int) (this.B & 4294967295L)));
                long floatToRawIntBits = (long) Float.floatToRawIntBits(intBitsToFloat);
                long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L) | (floatToRawIntBits << 32);
                if (!l35.b(cx2.z, floatToRawIntBits2)) {
                    cx2.z = floatToRawIntBits2;
                    cx2.a.r(floatToRawIntBits2);
                }
            }
            this.w.e(this.G, this.H, this.B, this.Q);
            f(false);
        }
    }
}
