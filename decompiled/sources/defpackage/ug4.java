package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* renamed from: ug4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ug4 extends Drawable implements fr6 {
    public static final Paint a0;
    public static final tg4[] b0 = new tg4[4];
    public final BitSet A;
    public boolean B;
    public boolean C;
    public final Matrix D;
    public final Path E;
    public final Path F;
    public final RectF G;
    public final RectF H;
    public final Region I;
    public final Region J;
    public final Paint K;
    public final Paint L;
    public final nq6 M;
    public final ns8 N;
    public final tq6 O;
    public PorterDuffColorFilter P;
    public PorterDuffColorFilter Q;
    public final RectF R;
    public final boolean S;
    public boolean T;
    public rq6 U;
    public v17 V;
    public final u17[] W;
    public float[] X;
    public float[] Y;
    public c9 Z;
    public final rg4 w;
    public sg4 x;
    public final cr6[] y;
    public final cr6[] z;

    static {
        Paint paint = new Paint(1);
        a0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        int i = 0;
        while (true) {
            tg4[] tg4Arr = b0;
            if (i < tg4Arr.length) {
                tg4Arr[i] = new tg4(i);
                i++;
            } else {
                return;
            }
        }
    }

    public ug4(sg4 sg4) {
        tq6 tq6;
        this.w = new rg4(0, (Object) this);
        this.y = new cr6[4];
        this.z = new cr6[4];
        this.A = new BitSet(8);
        this.D = new Matrix();
        this.E = new Path();
        this.F = new Path();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Region();
        this.J = new Region();
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint(1);
        this.L = paint2;
        this.M = new nq6();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            tq6 = sq6.a;
        } else {
            tq6 = new tq6();
        }
        this.O = tq6;
        this.R = new RectF();
        this.S = true;
        this.T = true;
        this.W = new u17[4];
        this.x = sg4;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.N = new ns8(29, (Object) this);
    }

    public static float b(RectF rectF, rq6 rq6, float[] fArr) {
        if (fArr != null) {
            if (fArr.length > 1) {
                float f = fArr[0];
                for (int i = 1; i < fArr.length; i++) {
                    if (fArr[i] != f) {
                        return -1.0f;
                    }
                }
            }
            if (rq6.d()) {
                return fArr[0];
            }
            return -1.0f;
        } else if (rq6.e(rectF)) {
            return rq6.e.a(rectF);
        } else {
            return -1.0f;
        }
    }

    public final void a(RectF rectF, Path path) {
        sg4 sg4 = this.x;
        RectF rectF2 = rectF;
        Path path2 = path;
        this.O.a(sg4.a, this.X, sg4.j, rectF2, this.N, path2);
        if (this.x.i != 1.0f) {
            Matrix matrix = this.D;
            matrix.reset();
            float f = this.x.i;
            matrix.setScale(f, f, rectF2.width() / 2.0f, rectF2.height() / 2.0f);
            path2.transform(matrix);
        }
        path2.computeBounds(this.R, true);
    }

    public final int c(int i) {
        float f;
        int i2;
        sg4 sg4 = this.x;
        float f2 = sg4.n + 0.0f + sg4.m;
        o22 o22 = sg4.c;
        if (o22 == null || !o22.a || yt0.d(i, 255) != o22.d) {
            return i;
        }
        float f3 = o22.e;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            f = 0.0f;
        } else {
            f = Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i);
        int G2 = h49.G(f, yt0.d(i, 255), o22.b);
        if (f > 0.0f && (i2 = o22.c) != 0) {
            G2 = yt0.b(yt0.d(i2, o22.f), G2);
        }
        return yt0.d(G2, alpha);
    }

    public final void d(Canvas canvas) {
        if (this.A.cardinality() > 0) {
            Log.w("ug4", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.x.p;
        Path path = this.E;
        nq6 nq6 = this.M;
        if (i != 0) {
            canvas.drawPath(path, nq6.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            cr6 cr6 = this.y[i2];
            int i3 = this.x.o;
            Matrix matrix = cr6.b;
            cr6.a(matrix, nq6, i3, canvas);
            this.z[i2].a(matrix, nq6, this.x.o, canvas);
        }
        if (this.S) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.x.p));
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.x.p));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, a0);
            canvas.translate((float) sin, (float) cos);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        if (r0.x.a.d() != false) goto L_0x0152;
     */
    public void draw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        PorterDuffColorFilter porterDuffColorFilter = this.P;
        Paint paint2 = this.K;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.x.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.Q;
        Paint paint3 = this.L;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.x.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.x.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.x.q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.B;
            paint = paint2;
            Path path = this.E;
            if (z2) {
                a(g(), path);
                this.B = false;
            }
            sg4 sg4 = this.x;
            sg4.getClass();
            if (sg4.o > 0 && !sg4.a.e(g())) {
                float[] fArr = this.X;
                if (fArr != null) {
                    int i3 = 1;
                    if (fArr.length > 1) {
                        float f = fArr[0];
                        while (true) {
                            if (i3 >= fArr.length) {
                                break;
                            } else if (fArr[i3] != f) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                if (!path.isConvex() && Build.VERSION.SDK_INT < 29) {
                    canvas2.save();
                    canvas2.translate((float) ((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.x.p))), (float) ((int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.x.p))));
                    if (!this.S) {
                        d(canvas);
                        canvas2.restore();
                    } else {
                        RectF rectF = this.R;
                        int width = (int) (rectF.width() - ((float) getBounds().width()));
                        int height = (int) (rectF.height() - ((float) getBounds().height()));
                        if (width < 0 || height < 0) {
                            h.s("Invalid shadow bounds. Check that the treatments result in a valid path.");
                            return;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap((this.x.o * 2) + ((int) rectF.width()) + width, (this.x.o * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                        Canvas canvas3 = new Canvas(createBitmap);
                        float f2 = (float) ((getBounds().left - this.x.o) - width);
                        float f3 = (float) ((getBounds().top - this.x.o) - height);
                        canvas3.translate(-f2, -f3);
                        d(canvas3);
                        canvas2.drawBitmap(createBitmap, f2, f3, (Paint) null);
                        createBitmap.recycle();
                        canvas2.restore();
                    }
                }
            }
            e(canvas2, paint, path, this.x.a, this.X, g());
        } else {
            paint = paint2;
        }
        if (j()) {
            if (this.C) {
                rq6 rq6 = this.x.a;
                qq6 f4 = rq6.f();
                z71 z71 = rq6.e;
                rg4 rg4 = this.w;
                f4.e = rg4.a(z71);
                f4.f = rg4.a(rq6.f);
                f4.h = rg4.a(rq6.h);
                f4.g = rg4.a(rq6.g);
                this.U = f4.a();
                float[] fArr2 = this.X;
                if (fArr2 != null) {
                    if (this.Y == null) {
                        this.Y = new float[fArr2.length];
                    }
                    float i4 = i();
                    int i5 = 0;
                    while (true) {
                        float[] fArr3 = this.X;
                        if (i5 >= fArr3.length) {
                            break;
                        }
                        this.Y[i5] = Math.max(0.0f, fArr3[i5] - i4);
                        i5++;
                    }
                } else {
                    this.Y = null;
                }
                rq6 rq62 = this.U;
                float[] fArr4 = this.Y;
                float f5 = this.x.j;
                RectF g = g();
                RectF rectF2 = this.H;
                rectF2.set(g);
                float i6 = i();
                rectF2.inset(i6, i6);
                this.O.a(rq62, fArr4, f5, rectF2, (ns8) null, this.F);
                this.C = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, rq6 rq6, float[] fArr, RectF rectF) {
        float b = b(rectF, rq6, fArr);
        if (b >= 0.0f) {
            float f = b * this.x.j;
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void f(Canvas canvas) {
        rq6 rq6 = this.U;
        float[] fArr = this.Y;
        RectF g = g();
        RectF rectF = this.H;
        rectF.set(g);
        float i = i();
        rectF.inset(i, i);
        e(canvas, this.L, this.F, rq6, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.G;
        rectF.set(bounds);
        return rectF;
    }

    public int getAlpha() {
        return this.x.l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.x;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        this.x.getClass();
        RectF g = g();
        if (!g.isEmpty()) {
            float b = b(g, this.x.a, this.X);
            if (b >= 0.0f) {
                outline.setRoundRect(getBounds(), b * this.x.j);
                return;
            }
            boolean z2 = this.B;
            Path path = this.E;
            if (z2) {
                a(g, path);
                this.B = false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                rz1.a(outline, path);
            } else if (i >= 29) {
                try {
                    qz1.a(outline, path);
                } catch (IllegalArgumentException unused) {
                }
            } else if (path.isConvex()) {
                qz1.a(outline, path);
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.x.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.I;
        region.set(bounds);
        RectF g = g();
        Path path = this.E;
        a(g, path);
        Region region2 = this.J;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.X;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g = g();
        rq6 rq6 = this.x.a;
        tq6 tq6 = this.O;
        tq6.getClass();
        float a = rq6.e.a(g);
        rq6 rq62 = this.x.a;
        tq6.getClass();
        float a2 = rq62.h.a(g) + a;
        rq6 rq63 = this.x.a;
        tq6.getClass();
        rq6 rq64 = this.x.a;
        tq6.getClass();
        return ((a2 - rq63.g.a(g)) - rq64.f.a(g)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.L.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final void invalidateSelf() {
        this.B = true;
        this.C = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.x.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.x.getClass();
        ColorStateList colorStateList2 = this.x.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.x.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        h37 h37 = this.x.b;
        if (h37 == null || !h37.d()) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        Paint.Style style = this.x.q;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.L.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void k(Context context) {
        this.x.c = new o22(context);
        s();
    }

    public final void l(v17 v17) {
        if (this.V != v17) {
            this.V = v17;
            int i = 0;
            while (true) {
                u17[] u17Arr = this.W;
                if (i < u17Arr.length) {
                    if (u17Arr[i] == null) {
                        u17Arr[i] = new u17(this, b0[i]);
                    }
                    u17 u17 = u17Arr[i];
                    v17 v172 = new v17();
                    v172.a((float) v17.b);
                    double d = v17.a;
                    v172.b((float) (d * d));
                    u17.m = v172;
                    i++;
                } else {
                    q(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    public final void m(float f) {
        sg4 sg4 = this.x;
        if (sg4.n != f) {
            sg4.n = f;
            s();
        }
    }

    public Drawable mutate() {
        this.x = new sg4(this.x);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        sg4 sg4 = this.x;
        if (sg4.d != colorStateList) {
            sg4.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(h37 h37) {
        sg4 sg4 = this.x;
        if (sg4.b != h37) {
            sg4.b = h37;
            q(getState(), true);
            invalidateSelf();
        }
    }

    public final void onBoundsChange(Rect rect) {
        this.B = true;
        this.C = true;
        super.onBoundsChange(rect);
        if (this.x.b != null && !rect.isEmpty()) {
            q(getState(), this.T);
        }
        this.T = rect.isEmpty();
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2 = false;
        if (this.x.b != null) {
            q(iArr, false);
        }
        boolean p = p(iArr);
        boolean r = r();
        if (p || r) {
            z2 = true;
        }
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final boolean p(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.x.d == null || (color2 = paint2.getColor()) == (colorForState2 = this.x.d.getColorForState(iArr, color2))) {
            z2 = false;
        } else {
            (paint2 = this.K).setColor(colorForState2);
            z2 = true;
        }
        if (this.x.e == null || (color = paint.getColor()) == (colorForState = this.x.e.getColorForState(iArr, color))) {
            return z2;
        }
        (paint = this.L).setColor(colorForState);
        return true;
    }

    public final void q(int[] iArr, boolean z2) {
        boolean z3;
        rq6 rq6;
        z71 z71;
        int i;
        int[] iArr2 = iArr;
        RectF g = g();
        if (this.x.b != null && !g.isEmpty()) {
            if (this.V == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            if (this.X == null) {
                this.X = new float[4];
            }
            h37 h37 = this.x.b;
            rq6[] rq6Arr = h37.d;
            int i2 = h37.a;
            int[][] iArr3 = h37.c;
            g37 g37 = h37.h;
            g37 g372 = h37.g;
            g37 g373 = h37.f;
            g37 g374 = h37.e;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    i3 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr3[i3], iArr2)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 < 0) {
                int[] iArr4 = StateSet.WILD_CARD;
                int i4 = 0;
                while (true) {
                    if (i4 >= i2) {
                        i = -1;
                        break;
                    } else if (StateSet.stateSetMatches(iArr3[i4], iArr4)) {
                        i = i4;
                        break;
                    } else {
                        i4++;
                    }
                }
                i3 = i;
            }
            if (g374 == null && g373 == null && g372 == null && g37 == null) {
                rq6 = rq6Arr[i3];
            } else {
                qq6 f = rq6Arr[i3].f();
                if (g374 != null) {
                    f.e = g374.c(iArr2);
                }
                if (g373 != null) {
                    f.f = g373.c(iArr2);
                }
                if (g372 != null) {
                    f.h = g372.c(iArr2);
                }
                if (g37 != null) {
                    f.g = g37.c(iArr2);
                }
                rq6 = f.a();
            }
            for (int i5 = 0; i5 < 4; i5++) {
                this.O.getClass();
                if (i5 == 1) {
                    z71 = rq6.g;
                } else if (i5 == 2) {
                    z71 = rq6.h;
                } else if (i5 != 3) {
                    z71 = rq6.f;
                } else {
                    z71 = rq6.e;
                }
                float a = z71.a(g);
                if (z4) {
                    this.X[i5] = a;
                }
                u17[] u17Arr = this.W;
                u17 u17 = u17Arr[i5];
                if (u17 != null) {
                    u17.a(a);
                    if (z4) {
                        u17Arr[i5].d();
                    }
                }
            }
            if (z4) {
                invalidateSelf();
            }
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.P;
        PorterDuffColorFilter porterDuffColorFilter3 = this.Q;
        sg4 sg4 = this.x;
        ColorStateList colorStateList = sg4.f;
        PorterDuff.Mode mode = sg4.g;
        if (colorStateList == null || mode == null) {
            int color = this.K.getColor();
            int c = c(color);
            if (c != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.P = porterDuffColorFilter;
        this.x.getClass();
        this.Q = null;
        this.x.getClass();
        if (!Objects.equals(porterDuffColorFilter2, this.P) || !Objects.equals(porterDuffColorFilter3, this.Q)) {
            return true;
        }
        return false;
    }

    public final void s() {
        sg4 sg4 = this.x;
        float f = sg4.n + 0.0f;
        sg4.o = (int) Math.ceil((double) (0.75f * f));
        this.x.p = (int) Math.ceil((double) (f * 0.25f));
        r();
        super.invalidateSelf();
    }

    public void setAlpha(int i) {
        sg4 sg4 = this.x;
        if (sg4.l != i) {
            sg4.l = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.x.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(rq6 rq6) {
        sg4 sg4 = this.x;
        sg4.a = rq6;
        sg4.b = null;
        this.X = null;
        this.Y = null;
        invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.x.f = colorStateList;
        r();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        sg4 sg4 = this.x;
        if (sg4.g != mode) {
            sg4.g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public ug4(Context context, AttributeSet attributeSet, int i, int i2) {
        this(rq6.b(context, attributeSet, i, i2).a());
    }

    public ug4(rq6 rq6) {
        this(new sg4(rq6));
    }

    public ug4() {
        this(new rq6());
    }
}
