package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* renamed from: jx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jx2 implements ex2 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public final uk0 b;
    public final tk0 c;
    public final RenderNode d;
    public long e = 0;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public lt0 k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public jx2() {
        uk0 uk0 = new uk0();
        tk0 tk0 = new tk0();
        this.b = uk0;
        this.c = tk0;
        RenderNode e2 = vw2.e();
        this.d = e2;
        e2.setClipToBounds(false);
        P(e2, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j2 = jt0.b;
        this.r = j2;
        this.s = j2;
        this.w = 8.0f;
        this.G = 0;
    }

    public final float A() {
        return this.w;
    }

    public final float B() {
        return this.o;
    }

    public final void C(boolean z2) {
        this.x = z2;
        O();
    }

    public final float D() {
        return this.t;
    }

    public final void E(tp1 tp1, ey3 ey3, cx2 cx2, pb pbVar) {
        tk0 tk0 = this.c;
        RecordingCanvas d2 = this.d.beginRecording();
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) this.y);
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits((float) this.z)) & 4294967295L) | (floatToRawIntBits << 32);
        try {
            uk0 uk0 = this.b;
            od odVar = uk0.a;
            Canvas canvas = odVar.a;
            odVar.a = d2;
            wr0 wr0 = tk0.x;
            wr0.c0(tp1);
            wr0.d0(ey3);
            wr0.y = cx2;
            wr0.e0(this.e);
            wr0.b0(odVar);
            if (((float) this.y) <= 0.0f) {
                if (((float) this.z) <= 0.0f) {
                    pbVar.y(tk0);
                    uk0.a.a = canvas;
                    this.d.endRecording();
                }
            }
            int i2 = (int) (floatToRawIntBits2 >> 32);
            int i3 = (int) (floatToRawIntBits2 & 4294967295L);
            odVar.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
            pbVar.y(tk0);
            odVar.o(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
            uk0.a.a = canvas;
            this.d.endRecording();
        } catch (Throwable th) {
            this.d.endRecording();
            throw th;
        }
    }

    public final void F(int i2) {
        this.G = i2;
        Q();
    }

    public final void G(float f2) {
        this.o = f2;
        this.d.setTranslationX(f2);
    }

    public final void H(long j2) {
        this.s = j2;
        this.d.setSpotShadowColor(uq3.M(j2));
    }

    public final Matrix I() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    public final void J(float f2) {
        this.w = f2;
        this.d.setCameraDistance(f2);
    }

    public final float K() {
        return this.q;
    }

    public final float L() {
        return this.n;
    }

    public final void M(float f2) {
        this.t = f2;
        this.d.setRotationX(f2);
    }

    public final int N() {
        return this.j;
    }

    public final void O() {
        boolean z2;
        boolean z3 = this.x;
        boolean z4 = false;
        if (!z3 || this.h) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z3 && this.h) {
            z4 = true;
        }
        if (z2 != this.C) {
            this.C = z2;
            this.d.setClipToBounds(z2);
        }
        if (z4 != this.D) {
            this.D = z4;
            this.d.setClipToOutline(z4);
        }
    }

    public final void P(RenderNode renderNode, int i2) {
        Paint paint = this.f;
        if (i2 == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i2 == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i2 = this.G;
        if (i2 != 1 && this.j == 3 && this.k == null) {
            P(this.d, i2);
        } else {
            P(this.d, 1);
        }
    }

    public final void R() {
        long j2 = this.l;
        int i2 = ((9223372034707292159L & j2) > 9205357640488583168L ? 1 : ((9223372034707292159L & j2) == 9205357640488583168L ? 0 : -1));
        RenderNode renderNode = this.d;
        if (i2 == 0) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + ((float) this.y));
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + ((float) this.z));
            return;
        }
        renderNode.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) + ((float) this.y));
        this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + ((float) this.z));
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i2 = this.E;
        renderNode.setPosition(i2 - this.y, this.F - this.z, i2 + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    public final float a() {
        return this.i;
    }

    public final void b(float f2) {
        this.u = f2;
        this.d.setRotationY(f2);
    }

    public final float c() {
        return this.m;
    }

    public final void d(float f2) {
        this.q = f2;
        this.d.setElevation(f2);
    }

    public final void e(float f2) {
        this.v = f2;
        this.d.setRotationZ(f2);
    }

    public final void f(float f2) {
        this.p = f2;
        this.d.setTranslationY(f2);
    }

    public final void g(Outline outline, long j2) {
        boolean z2;
        this.d.setOutline(outline);
        if (outline != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        O();
    }

    public final void h(int i2) {
        this.j = i2;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(bb0.A0(i2));
        Q();
    }

    public final void i() {
        this.d.discardDisplayList();
    }

    public final void j(qk0 qk0) {
        Canvas canvas = pd.a;
        ((od) qk0).a.drawRenderNode(this.d);
    }

    public final int k() {
        return this.G;
    }

    public final lt0 l() {
        return this.k;
    }

    public final void m(float f2) {
        this.n = f2;
        this.d.setScaleY(f2);
    }

    public final void n(int i2, int i3, long j2) {
        this.E = i2;
        this.F = i3;
        boolean a = wu6.a(this.e, pv8.O(j2));
        this.e = pv8.O(j2);
        S();
        if (!a && l35.b(this.l, 9205357640488583168L)) {
            this.d.setPivotX((((float) ((int) (j2 >> 32))) / 2.0f) + ((float) this.y));
            this.d.setPivotY((((float) ((int) (j2 & 4294967295L))) / 2.0f) + ((float) this.z));
        }
    }

    public final float o() {
        return this.u;
    }

    public final boolean p() {
        return this.d.hasDisplayList();
    }

    public final float q() {
        return this.v;
    }

    public final void r(long j2) {
        this.l = j2;
        R();
    }

    public final long s() {
        return this.r;
    }

    public final void t(float f2) {
        this.i = f2;
        this.d.setAlpha(f2);
    }

    public final void u(lt0 lt0) {
        ColorFilter colorFilter;
        this.k = lt0;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        if (lt0 != null) {
            colorFilter = lt0.a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
        Q();
    }

    public final void v(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3 = false;
        if (i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            StringBuilder p2 = pb4.p("Outsets cannot be negative! Left: ", i2, ", Top: ", i3, ", Right: ");
            p2.append(i4);
            p2.append(", Bottom: ");
            p2.append(i5);
            xb3.a(p2.toString());
        }
        int i6 = this.y;
        if (i2 != i6 || i3 != this.z || i4 != this.A || i5 != this.B) {
            if (!(i2 == i6 && i3 == this.z)) {
                z3 = true;
            }
            this.y = i2;
            this.z = i3;
            this.A = i4;
            this.B = i5;
            S();
            if (z3) {
                R();
            }
        }
    }

    public final float w() {
        return this.p;
    }

    public final long x() {
        return this.s;
    }

    public final void y(long j2) {
        this.r = j2;
        this.d.setAmbientShadowColor(uq3.M(j2));
    }

    public final void z(float f2) {
        this.m = f2;
        this.d.setScaleX(f2);
    }
}
