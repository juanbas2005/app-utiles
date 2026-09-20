package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hx2 implements ex2 {
    public static final AtomicBoolean J = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final uk0 b;
    public final tk0 c;
    public final RenderNode d;
    public long e = 0;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i = 0;
    public int j;
    public int k;
    public lt0 l;
    public float m;
    public boolean n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public hx2(je jeVar, uk0 uk0, tk0 tk0) {
        this.b = uk0;
        this.c = tk0;
        RenderNode create = RenderNode.create("Compose", jeVar);
        this.d = create;
        if (J.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                k46.c(create, k46.a(create));
                k46.d(create, k46.b(create));
            }
            j46.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        P(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j2 = jt0.b;
        this.u = j2;
        this.v = j2;
        this.z = 8.0f;
    }

    public final float A() {
        return this.z;
    }

    public final float B() {
        return this.r;
    }

    public final void C(boolean z2) {
        this.A = z2;
        O();
    }

    public final float D() {
        return this.w;
    }

    public final void E(tp1 tp1, ey3 ey3, cx2 cx2, pb pbVar) {
        DisplayListCanvas displayListCanvas;
        long j2;
        DisplayListCanvas displayListCanvas2;
        Canvas canvas;
        tp1 H2;
        ey3 J2;
        qk0 D2;
        long L;
        cx2 cx22;
        cx2 cx23;
        tp1 tp12 = tp1;
        ey3 ey32 = ey3;
        cx2 cx24 = cx2;
        pb pbVar2 = pbVar;
        tk0 tk0 = this.c;
        wr0 wr0 = tk0.x;
        Canvas start = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        long floatToRawIntBits = (((long) Float.floatToRawIntBits((float) this.C)) & 4294967295L) | (((long) Float.floatToRawIntBits((float) this.B)) << 32);
        try {
            od odVar = this.b.a;
            Canvas canvas2 = odVar.a;
            odVar.a = start;
            if (((float) this.B) <= 0.0f) {
                try {
                    if (((float) this.C) > 0.0f) {
                        displayListCanvas2 = start;
                        j2 = 4294967295L;
                        canvas = canvas2;
                        int i2 = (int) (floatToRawIntBits >> 32);
                        int i3 = (int) (floatToRawIntBits & j2);
                        odVar.o(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                        long O = pv8.O(this.e);
                        H2 = wr0.H();
                        J2 = wr0.J();
                        D2 = wr0.D();
                        int i4 = i2;
                        int i5 = i3;
                        L = wr0.L();
                        int i6 = i4;
                        cx22 = (cx2) wr0.y;
                        wr0.c0(tp12);
                        wr0.d0(ey32);
                        wr0.b0(odVar);
                        wr0.e0(O);
                        wr0.y = cx24;
                        odVar.h();
                        try {
                            pbVar2.y(tk0);
                            odVar.p();
                            wr0.c0(H2);
                            wr0.d0(J2);
                            wr0.b0(D2);
                            wr0.e0(L);
                            wr0.y = cx22;
                            odVar.o(-Float.intBitsToFloat(i6), -Float.intBitsToFloat(i5));
                        } catch (Throwable th) {
                            th = th;
                            this.d.end(displayListCanvas);
                            throw th;
                        }
                    } else {
                        long O2 = pv8.O(this.e);
                        tp1 H3 = wr0.H();
                        ey3 J3 = wr0.J();
                        qk0 D3 = wr0.D();
                        canvas = canvas2;
                        long L2 = wr0.L();
                        displayListCanvas2 = start;
                        try {
                            cx23 = (cx2) wr0.y;
                            wr0.c0(tp12);
                            wr0.d0(ey32);
                            wr0.b0(odVar);
                            wr0.e0(O2);
                            wr0.y = cx24;
                            odVar.h();
                            pbVar2.y(tk0);
                            odVar.p();
                            wr0.c0(H3);
                            wr0.d0(J3);
                            wr0.b0(D3);
                            wr0.e0(L2);
                            wr0.y = cx23;
                        } catch (Throwable th2) {
                            th = th2;
                            displayListCanvas = displayListCanvas2;
                            this.d.end(displayListCanvas);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    displayListCanvas2 = start;
                    displayListCanvas = displayListCanvas2;
                    this.d.end(displayListCanvas);
                    throw th;
                }
            } else {
                displayListCanvas2 = start;
                canvas = canvas2;
                j2 = 4294967295L;
                int i22 = (int) (floatToRawIntBits >> 32);
                int i32 = (int) (floatToRawIntBits & j2);
                odVar.o(Float.intBitsToFloat(i22), Float.intBitsToFloat(i32));
                long O3 = pv8.O(this.e);
                H2 = wr0.H();
                J2 = wr0.J();
                D2 = wr0.D();
                int i42 = i22;
                int i52 = i32;
                L = wr0.L();
                int i62 = i42;
                cx22 = (cx2) wr0.y;
                wr0.c0(tp12);
                wr0.d0(ey32);
                wr0.b0(odVar);
                wr0.e0(O3);
                wr0.y = cx24;
                odVar.h();
                pbVar2.y(tk0);
                odVar.p();
                wr0.c0(H2);
                wr0.d0(J2);
                wr0.b0(D2);
                wr0.e0(L);
                wr0.y = cx22;
                odVar.o(-Float.intBitsToFloat(i62), -Float.intBitsToFloat(i52));
            }
            odVar.a = canvas;
            this.d.end(displayListCanvas2);
        } catch (Throwable th4) {
            th = th4;
            displayListCanvas = start;
            this.d.end(displayListCanvas);
            throw th;
        }
    }

    public final void F(int i2) {
        this.j = i2;
        Q();
    }

    public final void G(float f2) {
        this.r = f2;
        this.d.setTranslationX(f2);
    }

    public final void H(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j2;
            k46.d(this.d, uq3.M(j2));
        }
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
        this.z = f2;
        this.d.setCameraDistance(-f2);
    }

    public final float K() {
        return this.t;
    }

    public final float L() {
        return this.q;
    }

    public final void M(float f2) {
        this.w = f2;
        this.d.setRotationX(f2);
    }

    public final int N() {
        return this.k;
    }

    public final void O() {
        boolean z2;
        boolean z3 = this.A;
        boolean z4 = false;
        if (!z3 || this.h) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z3 && this.h) {
            z4 = true;
        }
        if (z2 != this.F) {
            this.F = z2;
            this.d.setClipToBounds(z2);
        }
        if (z4 != this.G) {
            this.G = z4;
            this.d.setClipToOutline(z4);
        }
    }

    public final void P(int i2) {
        RenderNode renderNode = this.d;
        if (i2 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i2 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i2 = this.j;
        if (i2 != 1 && this.k == 3 && this.l == null) {
            P(i2);
        } else {
            P(1);
        }
    }

    public final void R() {
        long j2 = this.o;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((float) ((int) (this.e >> 32))) / 2.0f) + ((float) this.B));
            this.d.setPivotY((((float) ((int) (4294967295L & this.e))) / 2.0f) + ((float) this.C));
            return;
        }
        this.n = false;
        this.d.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) + ((float) this.B));
        this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + ((float) this.C));
    }

    public final void S() {
        RenderNode renderNode = this.d;
        int i2 = this.H;
        int i3 = this.I;
        long j2 = this.e;
        renderNode.setLeftTopRightBottom(i2 - this.B, i3 - this.C, i2 + ((int) (j2 >> 32)) + this.D, i3 + ((int) (j2 & 4294967295L)) + this.E);
    }

    public final float a() {
        return this.m;
    }

    public final void b(float f2) {
        this.x = f2;
        this.d.setRotationY(f2);
    }

    public final float c() {
        return this.p;
    }

    public final void d(float f2) {
        this.t = f2;
        this.d.setElevation(f2);
    }

    public final void e(float f2) {
        this.y = f2;
        this.d.setRotation(f2);
    }

    public final void f(float f2) {
        this.s = f2;
        this.d.setTranslationY(f2);
    }

    public final void g(Outline outline, long j2) {
        boolean z2;
        this.i = j2;
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
        if (this.k != i2) {
            this.k = i2;
            Paint paint = this.f;
            if (paint == null) {
                paint = new Paint();
                this.f = paint;
            }
            paint.setXfermode(new PorterDuffXfermode(bb0.C0(i2)));
            Q();
        }
    }

    public final void i() {
        j46.a(this.d);
    }

    public final void j(qk0 qk0) {
        Canvas canvas = pd.a;
        DisplayListCanvas displayListCanvas = ((od) qk0).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    public final int k() {
        return this.j;
    }

    public final lt0 l() {
        return this.l;
    }

    public final void m(float f2) {
        this.q = f2;
        this.d.setScaleY(f2);
    }

    public final void n(int i2, int i3, long j2) {
        this.H = i2;
        this.I = i3;
        boolean a = we3.a(this.e, j2);
        this.e = j2;
        S();
        if (a) {
            return;
        }
        if (this.n || l35.b(this.o, 9205357640488583168L)) {
            this.d.setPivotX((((float) ((int) (j2 >> 32))) / 2.0f) + ((float) this.B));
            this.d.setPivotY((((float) ((int) (j2 & 4294967295L))) / 2.0f) + ((float) this.C));
        }
    }

    public final float o() {
        return this.x;
    }

    public final boolean p() {
        return this.d.isValid();
    }

    public final float q() {
        return this.y;
    }

    public final void r(long j2) {
        this.o = j2;
        R();
    }

    public final long s() {
        return this.u;
    }

    public final void t(float f2) {
        this.m = f2;
        this.d.setAlpha(f2);
    }

    public final void u(lt0 lt0) {
        this.l = lt0;
        if (lt0 != null) {
            P(1);
            RenderNode renderNode = this.d;
            Paint paint = this.f;
            if (paint == null) {
                paint = new Paint();
                this.f = paint;
            }
            paint.setColorFilter(lt0.a);
            renderNode.setLayerPaint(paint);
            return;
        }
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
        int i6 = this.B;
        if (i2 != i6 || i3 != this.C || i4 != this.D || i5 != this.E) {
            if (!(i2 == i6 && i3 == this.C)) {
                z3 = true;
            }
            this.B = i2;
            this.C = i3;
            this.D = i4;
            this.E = i5;
            S();
            if (z3) {
                R();
            }
        }
    }

    public final float w() {
        return this.s;
    }

    public final long x() {
        return this.v;
    }

    public final void y(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j2;
            k46.c(this.d, uq3.M(j2));
        }
    }

    public final void z(float f2) {
        this.p = f2;
        this.d.setScaleX(f2);
    }
}
