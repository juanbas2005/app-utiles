package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: lp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lp0 extends ug4 implements Drawable.Callback {
    public static final int[] k1 = {16842910};
    public static final ShapeDrawable l1 = new ShapeDrawable(new OvalShape());
    public wm4 A0;
    public float B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public final Context J0;
    public final Paint K0 = new Paint(1);
    public final Paint.FontMetrics L0 = new Paint.FontMetrics();
    public final RectF M0 = new RectF();
    public final PointF N0 = new PointF();
    public final Path O0 = new Path();
    public final xd7 P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public boolean W0;
    public int X0;
    public int Y0 = 255;
    public ColorFilter Z0;
    public PorterDuffColorFilter a1;
    public ColorStateList b1;
    public ColorStateList c0;
    public PorterDuff.Mode c1 = PorterDuff.Mode.SRC_IN;
    public ColorStateList d0;
    public int[] d1;
    public float e0;
    public ColorStateList e1;
    public float f0 = -1.0f;
    public WeakReference f1 = new WeakReference((Object) null);
    public ColorStateList g0;
    public TextUtils.TruncateAt g1;
    public float h0;
    public boolean h1;
    public ColorStateList i0;
    public int i1;
    public CharSequence j0;
    public boolean j1;
    public boolean k0;
    public Drawable l0;
    public ColorStateList m0;
    public float n0;
    public boolean o0;
    public boolean p0;
    public Drawable q0;
    public RippleDrawable r0;
    public ColorStateList s0;
    public float t0;
    public SpannableStringBuilder u0;
    public boolean v0;
    public boolean w0;
    public Drawable x0;
    public ColorStateList y0;
    public wm4 z0;

    public lp0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131887237);
        k(context);
        this.J0 = context;
        xd7 xd7 = new xd7(this);
        this.P0 = xd7;
        this.j0 = "";
        xd7.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = k1;
        setState(iArr);
        R(iArr);
        this.h1 = true;
        l1.setTint(-1);
    }

    public static void b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean y(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public static boolean z(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    public final void A() {
        Chip chip = (Chip) this.f1.get();
        if (chip != null) {
            chip.b(chip.L);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012f  */
    public final boolean B(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        sc7 sc7;
        int i5;
        int[] state;
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        int i6;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList2;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList3 = this.c0;
        if (colorStateList3 != null) {
            i = colorStateList3.getColorForState(iArr, this.Q0);
        } else {
            i = 0;
        }
        int c = c(i);
        boolean z5 = true;
        if (this.Q0 != c) {
            this.Q0 = c;
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.d0;
        if (colorStateList4 != null) {
            i2 = colorStateList4.getColorForState(iArr, this.R0);
        } else {
            i2 = 0;
        }
        int c2 = c(i2);
        if (this.R0 != c2) {
            this.R0 = c2;
            onStateChange = true;
        }
        int b = yt0.b(c2, c);
        if (this.S0 != b) {
            z = true;
        } else {
            z = false;
        }
        if (this.x.d == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            this.S0 = b;
            n(ColorStateList.valueOf(b));
            onStateChange = true;
        }
        ColorStateList colorStateList5 = this.g0;
        if (colorStateList5 != null) {
            i3 = colorStateList5.getColorForState(iArr, this.T0);
        } else {
            i3 = 0;
        }
        if (this.T0 != i3) {
            this.T0 = i3;
            onStateChange = true;
        }
        if (this.e1 != null) {
            int[] iArr3 = r86.a;
            boolean z6 = false;
            boolean z7 = false;
            for (int i7 : iArr) {
                if (i7 == 16842910) {
                    z6 = true;
                } else if (i7 == 16842908 || i7 == 16842919 || i7 == 16843623) {
                    z7 = true;
                }
            }
            if (z6 && z7) {
                i4 = this.e1.getColorForState(iArr, this.U0);
                if (this.U0 != i4) {
                    this.U0 = i4;
                }
                sc7 = this.P0.f;
                if (sc7 == null || (colorStateList2 = sc7.k) == null) {
                    i5 = 0;
                } else {
                    i5 = colorStateList2.getColorForState(iArr, this.V0);
                }
                if (this.V0 != i5) {
                    this.V0 = i5;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        } else if (state[i8] != 16842912) {
                            i8++;
                        } else if (this.v0) {
                            z3 = true;
                        }
                    }
                }
                z3 = false;
                if (this.W0 == z3 || this.x0 == null) {
                    z4 = false;
                } else {
                    float v = v();
                    this.W0 = z3;
                    if (v != v()) {
                        onStateChange = true;
                        z4 = true;
                    } else {
                        z4 = false;
                        onStateChange = true;
                    }
                }
                colorStateList = this.b1;
                if (colorStateList == null) {
                    i6 = colorStateList.getColorForState(iArr, this.X0);
                } else {
                    i6 = 0;
                }
                if (this.X0 == i6) {
                    this.X0 = i6;
                    ColorStateList colorStateList6 = this.b1;
                    PorterDuff.Mode mode = this.c1;
                    if (colorStateList6 == null || mode == null) {
                        porterDuffColorFilter = null;
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                    }
                    this.a1 = porterDuffColorFilter;
                } else {
                    z5 = onStateChange;
                }
                if (z(this.l0)) {
                    z5 |= this.l0.setState(iArr);
                }
                if (z(this.x0)) {
                    z5 |= this.x0.setState(iArr);
                }
                if (z(this.q0)) {
                    int[] iArr4 = new int[(iArr.length + iArr2.length)];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z5 |= this.q0.setState(iArr4);
                }
                if (z(this.r0)) {
                    z5 |= this.r0.setState(iArr2);
                }
                if (z5) {
                    invalidateSelf();
                }
                if (z4) {
                    A();
                }
                return z5;
            }
        }
        i4 = 0;
        if (this.U0 != i4) {
        }
        sc7 = this.P0.f;
        if (sc7 == null || (colorStateList2 = sc7.k) == null) {
        }
        if (this.V0 != i5) {
        }
        state = getState();
        if (state != null) {
        }
        z3 = false;
        if (this.W0 == z3 || this.x0 == null) {
        }
        colorStateList = this.b1;
        if (colorStateList == null) {
        }
        if (this.X0 == i6) {
        }
        if (z(this.l0)) {
        }
        if (z(this.x0)) {
        }
        if (z(this.q0)) {
        }
        if (z(this.r0)) {
        }
        if (z5) {
        }
        if (z4) {
        }
        return z5;
    }

    public final void C(boolean z) {
        if (this.v0 != z) {
            this.v0 = z;
            float v = v();
            if (!z && this.W0) {
                this.W0 = false;
            }
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.x0 != drawable) {
            float v = v();
            this.x0 = drawable;
            float v2 = v();
            b0(this.x0);
            t(this.x0);
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            if (this.w0 && (drawable = this.x0) != null && this.v0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z) {
        if (this.w0 != z) {
            boolean Y = Y();
            this.w0 = z;
            boolean Y2 = Y();
            if (Y != Y2) {
                Drawable drawable = this.x0;
                if (Y2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void G(float f) {
        if (this.f0 != f) {
            this.f0 = f;
            qq6 f2 = this.x.a.f();
            f2.e = new a0(f);
            f2.f = new a0(f);
            f2.g = new a0(f);
            f2.h = new a0(f);
            setShapeAppearanceModel(f2.a());
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.l0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float v = v();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.l0 = drawable3;
            float v2 = v();
            b0(drawable2);
            if (Z()) {
                t(this.l0);
            }
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void I(float f) {
        if (this.n0 != f) {
            float v = v();
            this.n0 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.o0 = true;
        if (this.m0 != colorStateList) {
            this.m0 = colorStateList;
            if (Z()) {
                this.l0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z) {
        if (this.k0 != z) {
            boolean Z = Z();
            this.k0 = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.l0;
                if (Z2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.g0 != colorStateList) {
            this.g0 = colorStateList;
            if (this.j1) {
                sg4 sg4 = this.x;
                if (sg4.e != colorStateList) {
                    sg4.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f) {
        if (this.h0 != f) {
            this.h0 = f;
            this.K0.setStrokeWidth(f);
            if (this.j1) {
                this.x.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void N(Drawable drawable) {
        Drawable drawable2 = this.q0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float w = w();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q0 = drawable3;
            this.r0 = new RippleDrawable(r86.a(this.i0), this.q0, l1);
            float w2 = w();
            b0(drawable2);
            if (a0()) {
                t(this.q0);
            }
            invalidateSelf();
            if (w != w2) {
                A();
            }
        }
    }

    public final void O(float f) {
        if (this.H0 != f) {
            this.H0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void P(float f) {
        if (this.t0 != f) {
            this.t0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f) {
        if (this.G0 != f) {
            this.G0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean R(int[] iArr) {
        if (Arrays.equals(this.d1, iArr)) {
            return false;
        }
        this.d1 = iArr;
        if (a0()) {
            return B(getState(), iArr);
        }
        return false;
    }

    public final void S(ColorStateList colorStateList) {
        if (this.s0 != colorStateList) {
            this.s0 = colorStateList;
            if (a0()) {
                this.q0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z) {
        if (this.p0 != z) {
            boolean a0 = a0();
            this.p0 = z;
            boolean a02 = a0();
            if (a0 != a02) {
                Drawable drawable = this.q0;
                if (a02) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void U(float f) {
        if (this.D0 != f) {
            float v = v();
            this.D0 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void V(float f) {
        if (this.C0 != f) {
            float v = v();
            this.C0 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.i0 != colorStateList) {
            this.i0 = colorStateList;
            this.e1 = null;
            onStateChange(getState());
        }
    }

    public final void X(sc7 sc7) {
        xd7 xd7 = this.P0;
        hp0 hp0 = xd7.b;
        TextPaint textPaint = xd7.a;
        if (xd7.f != sc7) {
            xd7.f = sc7;
            if (sc7 != null) {
                Context context = this.J0;
                sc7.e(context, textPaint, hp0);
                lp0 lp0 = (lp0) xd7.e.get();
                if (lp0 != null) {
                    textPaint.drawableState = lp0.getState();
                }
                sc7.d(context, textPaint, hp0);
                xd7.d = true;
            }
            lp0 lp02 = (lp0) xd7.e.get();
            if (lp02 != null) {
                lp02.A();
                lp02.invalidateSelf();
                lp02.onStateChange(lp02.getState());
            }
        }
    }

    public final boolean Y() {
        if (!this.w0 || this.x0 == null || !this.W0) {
            return false;
        }
        return true;
    }

    public final boolean Z() {
        if (!this.k0 || this.l0 == null) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        if (!this.p0 || this.q0 == null) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        float f;
        boolean z;
        int i3;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.Y0) != 0) {
            if (i < 255) {
                canvas2 = canvas;
                i2 = canvas2.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i);
            } else {
                canvas2 = canvas;
                i2 = 0;
            }
            boolean z2 = this.j1;
            Paint paint = this.K0;
            RectF rectF = this.M0;
            if (!z2) {
                paint.setColor(this.Q0);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (!this.j1) {
                paint.setColor(this.R0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.Z0;
                if (colorFilter == null) {
                    colorFilter = this.a1;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (this.j1) {
                super.draw(canvas);
            }
            if (this.h0 > 0.0f && !this.j1) {
                paint.setColor(this.T0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.j1) {
                    ColorFilter colorFilter2 = this.Z0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.a1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f2 = this.h0 / 2.0f;
                rectF.set(((float) bounds.left) + f2, ((float) bounds.top) + f2, ((float) bounds.right) - f2, ((float) bounds.bottom) - f2);
                float f3 = this.f0 - (this.h0 / 2.0f);
                canvas2.drawRoundRect(rectF, f3, f3, paint);
            }
            paint.setColor(this.U0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.j1) {
                canvas2.drawRoundRect(rectF, x(), x(), paint);
                f = 2.0f;
            } else {
                RectF rectF2 = new RectF(bounds);
                sg4 sg4 = this.x;
                rq6 rq6 = sg4.a;
                float[] fArr = this.X;
                float f4 = sg4.j;
                ns8 ns8 = this.N;
                f = 2.0f;
                Path path = this.O0;
                this.O.a(rq6, fArr, f4, rectF2, ns8, path);
                e(canvas2, paint, path, this.x.a, this.X, g());
            }
            if (Z()) {
                u(bounds, rectF);
                float f5 = rectF.left;
                float f6 = rectF.top;
                canvas2.translate(f5, f6);
                this.l0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.l0.draw(canvas2);
                canvas2.translate(-f5, -f6);
            }
            if (Y()) {
                u(bounds, rectF);
                float f7 = rectF.left;
                float f8 = rectF.top;
                canvas2.translate(f7, f8);
                this.x0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.x0.draw(canvas2);
                canvas2.translate(-f7, -f8);
            }
            if (this.h1 && this.j0 != null) {
                PointF pointF = this.N0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.j0;
                xd7 xd7 = this.P0;
                if (charSequence != null) {
                    float v = v() + this.B0 + this.E0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = ((float) bounds.left) + v;
                    } else {
                        pointF.x = ((float) bounds.right) - v;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = xd7.a;
                    Paint.FontMetrics fontMetrics = this.L0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / f);
                }
                rectF.setEmpty();
                if (this.j0 != null) {
                    float v2 = v() + this.B0 + this.E0;
                    float w = w() + this.I0 + this.F0;
                    int layoutDirection = getLayoutDirection();
                    int i4 = bounds.left;
                    if (layoutDirection == 0) {
                        rectF.left = ((float) i4) + v2;
                        rectF.right = ((float) bounds.right) - w;
                    } else {
                        rectF.left = ((float) i4) + w;
                        rectF.right = ((float) bounds.right) - v2;
                    }
                    rectF.top = (float) bounds.top;
                    rectF.bottom = (float) bounds.bottom;
                }
                sc7 sc7 = xd7.f;
                TextPaint textPaint2 = xd7.a;
                if (sc7 != null) {
                    textPaint2.drawableState = getState();
                    xd7.f.d(this.J0, textPaint2, xd7.b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(xd7.a(this.j0.toString())) > Math.round(rectF.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                CharSequence charSequence2 = this.j0;
                if (z && this.g1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.g1);
                }
                int length = charSequence2.length();
                float f9 = pointF.x;
                float f10 = pointF.y;
                Canvas canvas3 = canvas;
                canvas3.drawText(charSequence2, 0, length, f9, f10, textPaint2);
                canvas2 = canvas3;
                if (z) {
                    canvas2.restoreToCount(i3);
                }
            }
            if (a0()) {
                rectF.setEmpty();
                if (a0()) {
                    float f11 = this.I0 + this.H0;
                    if (getLayoutDirection() == 0) {
                        float f12 = ((float) bounds.right) - f11;
                        rectF.right = f12;
                        rectF.left = f12 - this.t0;
                    } else {
                        float f13 = ((float) bounds.left) + f11;
                        rectF.left = f13;
                        rectF.right = f13 + this.t0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f14 = this.t0;
                    float f15 = exactCenterY - (f14 / f);
                    rectF.top = f15;
                    rectF.bottom = f15 + f14;
                }
                float f16 = rectF.left;
                float f17 = rectF.top;
                canvas2.translate(f16, f17);
                this.q0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.r0.setBounds(this.q0.getBounds());
                this.r0.jumpToCurrentState();
                this.r0.draw(canvas2);
                canvas2.translate(-f16, -f17);
            }
            if (this.Y0 < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    public final int getAlpha() {
        return this.Y0;
    }

    public final ColorFilter getColorFilter() {
        return this.Z0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.e0;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(w() + this.P0.a(this.j0.toString()) + v() + this.B0 + this.E0 + this.F0 + this.I0), this.i1);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.j1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f0);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.e0, this.f0);
        }
        outline2.setAlpha(((float) this.Y0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (y(this.c0) || y(this.d0) || y(this.g0)) {
            return true;
        }
        sc7 sc7 = this.P0.f;
        if (sc7 != null && (colorStateList = sc7.k) != null && colorStateList.isStateful()) {
            return true;
        }
        if ((!this.w0 || this.x0 == null || !this.v0) && !z(this.l0) && !z(this.x0) && !y(this.b1)) {
            return false;
        }
        return true;
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Z()) {
            onLayoutDirectionChanged |= this.l0.setLayoutDirection(i);
        }
        if (Y()) {
            onLayoutDirectionChanged |= this.x0.setLayoutDirection(i);
        }
        if (a0()) {
            onLayoutDirectionChanged |= this.q0.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (Z()) {
            onLevelChange |= this.l0.setLevel(i);
        }
        if (Y()) {
            onLevelChange |= this.x0.setLevel(i);
        }
        if (a0()) {
            onLevelChange |= this.q0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.j1) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.d1);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.Y0 != i) {
            this.Y0 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.Z0 != colorFilter) {
            this.Z0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.b1 != colorStateList) {
            this.b1 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.c1 != mode) {
            this.c1 = mode;
            ColorStateList colorStateList = this.b1;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.a1 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Z()) {
            visible |= this.l0.setVisible(z, z2);
        }
        if (Y()) {
            visible |= this.x0.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.q0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.q0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.d1);
                }
                drawable.setTintList(this.s0);
                return;
            }
            Drawable drawable2 = this.l0;
            if (drawable == drawable2 && this.o0) {
                drawable2.setTintList(this.m0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void u(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (Z() || Y()) {
            float f = this.B0 + this.C0;
            if (this.W0) {
                drawable = this.x0;
            } else {
                drawable = this.l0;
            }
            float f2 = this.n0;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.W0) {
                drawable2 = this.x0;
            } else {
                drawable2 = this.l0;
            }
            float f5 = this.n0;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil((double) TypedValue.applyDimension(1, 24.0f, this.J0.getResources().getDisplayMetrics()));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        Drawable drawable;
        if (!Z() && !Y()) {
            return 0.0f;
        }
        float f = this.C0;
        if (this.W0) {
            drawable = this.x0;
        } else {
            drawable = this.l0;
        }
        float f2 = this.n0;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f2 + f + this.D0;
    }

    public final float w() {
        if (a0()) {
            return this.G0 + this.t0 + this.H0;
        }
        return 0.0f;
    }

    public final float x() {
        if (!this.j1) {
            return this.f0;
        }
        float[] fArr = this.X;
        if (fArr != null) {
            return fArr[3];
        }
        return this.x.a.e.a(g());
    }
}
