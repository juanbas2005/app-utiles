package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* renamed from: lx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lx2 implements ex2 {
    public static final kx2 H = new Canvas();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final ez1 b;
    public final uk0 c;
    public final p58 d;
    public final Resources e;
    public final Rect f = new Rect();
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public lt0 o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public lx2(ez1 ez1) {
        uk0 uk0 = new uk0();
        tk0 tk0 = new tk0();
        this.b = ez1;
        this.c = uk0;
        p58 p58 = new p58(ez1, uk0, tk0);
        this.d = p58;
        this.e = ez1.getResources();
        ez1.addView(p58);
        p58.setClipBounds((Rect) null);
        this.j = 0;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j2 = jt0.b;
        this.y = j2;
        this.z = j2;
    }

    public final float A() {
        return this.d.getCameraDistance() / ((float) this.e.getDisplayMetrics().densityDpi);
    }

    public final float B() {
        return this.v;
    }

    public final void C(boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (!z2 || this.l) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.m = z3;
        this.k = true;
        if (z2 && this.l) {
            z4 = true;
        }
        this.d.setClipToOutline(z4);
    }

    public final float D() {
        return this.A;
    }

    public final void E(tp1 tp1, ey3 ey3, cx2 cx2, pb pbVar) {
        p58 p58 = this.d;
        ViewParent parent = p58.getParent();
        ez1 ez1 = this.b;
        if (parent == null) {
            ez1.addView(p58);
        }
        long floatToRawIntBits = (((long) Float.floatToRawIntBits((float) this.D)) << 32) | (((long) Float.floatToRawIntBits((float) this.E)) & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        p58.C = tp1;
        p58.D = ey3;
        p58.E = pbVar;
        p58.F = cx2;
        p58.G = intBitsToFloat;
        p58.H = intBitsToFloat2;
        if (p58.isAttachedToWindow()) {
            p58.setVisibility(4);
            p58.setVisibility(0);
            try {
                uk0 uk0 = this.c;
                kx2 kx2 = H;
                od odVar = uk0.a;
                Canvas canvas = odVar.a;
                odVar.a = kx2;
                ez1.a(odVar, p58, p58.getDrawingTime());
                uk0.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    public final void F(int i2) {
        this.p = i2;
        Q();
    }

    public final void G(float f2) {
        this.v = f2;
        this.d.setTranslationX(f2);
    }

    public final void H(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j2;
            this.d.setOutlineSpotShadowColor(uq3.M(j2));
        }
    }

    public final Matrix I() {
        return this.d.getMatrix();
    }

    public final void J(float f2) {
        this.d.setCameraDistance(f2 * ((float) this.e.getDisplayMetrics().densityDpi));
    }

    public final float K() {
        return this.x;
    }

    public final float L() {
        return this.u;
    }

    public final void M(float f2) {
        this.A = f2;
        this.d.setRotationX(f2);
    }

    public final int N() {
        return this.n;
    }

    public final void O(int i2) {
        p58 p58 = this.d;
        boolean z2 = true;
        if (i2 == 1) {
            p58.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i2 == 2) {
                p58.setLayerType(0, paint);
                z2 = false;
            } else {
                p58.setLayerType(0, paint);
            }
        }
        p58.setCanUseCompositingLayer$ui_graphics(z2);
    }

    public final void P() {
        boolean z2 = this.m;
        p58 p58 = this.d;
        if (z2 || p58.getClipToOutline()) {
            this.k = true;
        }
        int i2 = this.h;
        int i3 = this.i;
        long j2 = this.j;
        p58.layout(i2 - this.D, i3 - this.E, i2 + ((int) (j2 >> 32)) + this.F, i3 + ((int) (j2 & 4294967295L)) + this.G);
    }

    public final void Q() {
        int i2 = this.p;
        if (i2 != 1 && this.n == 3 && this.o == null) {
            O(i2);
        } else {
            O(1);
        }
    }

    public final void R() {
        boolean z2 = this.r;
        p58 p58 = this.d;
        if (z2 || l35.b(this.s, 9205357640488583168L)) {
            p58.setPivotX((((float) ((int) (this.j >> 32))) / 2.0f) + ((float) this.D));
            p58.setPivotY((((float) ((int) (this.j & 4294967295L))) / 2.0f) + ((float) this.E));
            return;
        }
        p58.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + ((float) this.D));
        p58.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + ((float) this.E));
    }

    public final float a() {
        return this.q;
    }

    public final void b(float f2) {
        this.B = f2;
        this.d.setRotationY(f2);
    }

    public final float c() {
        return this.t;
    }

    public final void d(float f2) {
        this.x = f2;
        this.d.setElevation(f2);
    }

    public final void e(float f2) {
        this.C = f2;
        this.d.setRotation(f2);
    }

    public final void f(float f2) {
        this.w = f2;
        this.d.setTranslationY(f2);
    }

    public final void g(Outline outline, long j2) {
        p58 p58 = this.d;
        p58.A = outline;
        p58.invalidateOutline();
        boolean z2 = false;
        if ((this.m || p58.getClipToOutline()) && outline != null) {
            p58.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        if (outline != null) {
            z2 = true;
        }
        this.l = z2;
    }

    public final void h(int i2) {
        this.n = i2;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(bb0.C0(i2)));
        Q();
    }

    public final void i() {
        this.b.removeViewInLayout(this.d);
    }

    public final void j(qk0 qk0) {
        Rect rect;
        boolean z2 = this.k;
        p58 p58 = this.d;
        if (z2) {
            if ((this.m || p58.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = p58.getWidth();
                rect.bottom = p58.getHeight();
            } else {
                rect = null;
            }
            p58.setClipBounds(rect);
        }
        Canvas canvas = pd.a;
        if (((od) qk0).a.isHardwareAccelerated()) {
            this.b.a(qk0, p58, p58.getDrawingTime());
        }
    }

    public final int k() {
        return this.p;
    }

    public final lt0 l() {
        return this.o;
    }

    public final void m(float f2) {
        this.u = f2;
        this.d.setScaleY(f2);
    }

    public final void n(int i2, int i3, long j2) {
        if (!we3.a(this.j, j2)) {
            this.h = i2;
            this.i = i3;
            this.j = j2;
            P();
            return;
        }
        int i4 = this.h;
        p58 p58 = this.d;
        if (i4 != i2) {
            p58.offsetLeftAndRight(i2 - i4);
        }
        int i5 = this.i;
        if (i5 != i3) {
            p58.offsetTopAndBottom(i3 - i5);
        }
        this.h = i2;
        this.i = i3;
    }

    public final float o() {
        return this.B;
    }

    public final float q() {
        return this.C;
    }

    public final void r(long j2) {
        boolean z2;
        this.s = j2;
        if ((j2 & 9223372034707292159L) == 9205357640488583168L) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.r = z2;
        R();
    }

    public final long s() {
        return this.y;
    }

    public final void t(float f2) {
        this.q = f2;
        this.d.setAlpha(f2);
    }

    public final void u(lt0 lt0) {
        ColorFilter colorFilter;
        this.o = lt0;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
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
        int i6 = this.D;
        if (i2 != i6 || i3 != this.E || i4 != this.F || i5 != this.G) {
            if (!(i2 == i6 && i3 == this.E)) {
                z3 = true;
            }
            this.D = i2;
            this.E = i3;
            this.F = i4;
            this.G = i5;
            P();
            if (z3) {
                R();
            }
        }
    }

    public final float w() {
        return this.w;
    }

    public final long x() {
        return this.z;
    }

    public final void y(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j2;
            this.d.setOutlineAmbientShadowColor(uq3.M(j2));
        }
    }

    public final void z(float f2) {
        this.t = f2;
        this.d.setScaleX(f2);
    }
}
