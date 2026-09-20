package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class Chip extends eo implements fr6, Checkable {
    public static final Rect S = new Rect();
    public static final int[] T = {16842913};
    public static final int[] U = {16842911};
    public lp0 A;
    public InsetDrawable B;
    public RippleDrawable C;
    public View.OnClickListener D;
    public CompoundButton.OnCheckedChangeListener E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public CharSequence M;
    public final jp0 N;
    public boolean O;
    public final Rect P = new Rect();
    public final RectF Q = new RectF();
    public final hp0 R = new hp0(0, this);

    /* JADX WARNING: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet) {
        super(rg3.F(context, r2, R.attr.chipStyle, 2131887237), r2, R.attr.chipStyle);
        sc7 sc7;
        wm4 wm4;
        wm4 wm42;
        float dimension;
        int resourceId;
        int resourceId2;
        int resourceId3;
        AttributeSet attributeSet2 = attributeSet;
        Context context2 = getContext();
        if (attributeSet2 != null) {
            if (attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                kj6.n("Please set left drawable using R.attr#chipIcon.");
                throw null;
            } else if (attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                kj6.n("Please set start drawable using R.attr#chipIcon.");
                throw null;
            } else if (attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                kj6.n("Please set end drawable using R.attr#closeIcon.");
                throw null;
            } else if (attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                kj6.n("Please set end drawable using R.attr#closeIcon.");
                throw null;
            } else if (!attributeSet2.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                kj6.n("Chip does not support multi-line text");
                throw null;
            } else if (attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        lp0 lp0 = new lp0(context2, attributeSet2);
        Context context3 = lp0.J0;
        int[] iArr = ov5.c;
        TypedArray F2 = gw8.F(context3, attributeSet2, iArr, R.attr.chipStyle, 2131887237, new int[0]);
        lp0.j1 = F2.hasValue(37);
        Context context4 = lp0.J0;
        ColorStateList L2 = t49.L(context4, F2, 24);
        if (lp0.c0 != L2) {
            lp0.c0 = L2;
            lp0.onStateChange(lp0.getState());
        }
        ColorStateList L3 = t49.L(context4, F2, 11);
        if (lp0.d0 != L3) {
            lp0.d0 = L3;
            lp0.onStateChange(lp0.getState());
        }
        float dimension2 = F2.getDimension(19, 0.0f);
        if (lp0.e0 != dimension2) {
            lp0.e0 = dimension2;
            lp0.invalidateSelf();
            lp0.A();
        }
        if (F2.hasValue(12)) {
            lp0.G(F2.getDimension(12, 0.0f));
        }
        lp0.L(t49.L(context4, F2, 22));
        lp0.M(F2.getDimension(23, 0.0f));
        lp0.W(t49.L(context4, F2, 36));
        String text = F2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(lp0.j0, text)) {
            lp0.j0 = text;
            lp0.P0.d = true;
            lp0.invalidateSelf();
            lp0.A();
        }
        if (!F2.hasValue(0) || (resourceId3 = F2.getResourceId(0, 0)) == 0) {
            sc7 = null;
        } else {
            sc7 = new sc7(context4, resourceId3);
        }
        sc7.l = F2.getDimension(1, sc7.l);
        lp0.X(sc7);
        int i = F2.getInt(3, 0);
        if (i == 1) {
            lp0.g1 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            lp0.g1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            lp0.g1 = TextUtils.TruncateAt.END;
        }
        lp0.K(F2.getBoolean(18, false));
        if (!(attributeSet2 == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            lp0.K(F2.getBoolean(15, false));
        }
        lp0.H(t49.N(context4, F2, 14));
        if (F2.hasValue(17)) {
            lp0.J(t49.L(context4, F2, 17));
        }
        lp0.I(F2.getDimension(16, -1.0f));
        lp0.T(F2.getBoolean(31, false));
        if (!(attributeSet2 == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            lp0.T(F2.getBoolean(26, false));
        }
        lp0.N(t49.N(context4, F2, 25));
        lp0.S(t49.L(context4, F2, 30));
        lp0.P(F2.getDimension(28, 0.0f));
        lp0.C(F2.getBoolean(6, false));
        lp0.F(F2.getBoolean(10, false));
        if (!(attributeSet2 == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            lp0.F(F2.getBoolean(8, false));
        }
        lp0.D(t49.N(context4, F2, 7));
        if (F2.hasValue(9)) {
            lp0.E(t49.L(context4, F2, 9));
        }
        if (!F2.hasValue(39) || (resourceId2 = F2.getResourceId(39, 0)) == 0) {
            wm4 = null;
        } else {
            wm4 = wm4.a(context4, resourceId2);
        }
        lp0.z0 = wm4;
        if (!F2.hasValue(33) || (resourceId = F2.getResourceId(33, 0)) == 0) {
            wm42 = null;
        } else {
            wm42 = wm4.a(context4, resourceId);
        }
        lp0.A0 = wm42;
        float dimension3 = F2.getDimension(21, 0.0f);
        if (lp0.B0 != dimension3) {
            lp0.B0 = dimension3;
            lp0.invalidateSelf();
            lp0.A();
        }
        lp0.V(F2.getDimension(35, 0.0f));
        lp0.U(F2.getDimension(34, 0.0f));
        float dimension4 = F2.getDimension(41, 0.0f);
        if (lp0.E0 != dimension4) {
            lp0.E0 = dimension4;
            lp0.invalidateSelf();
            lp0.A();
        }
        float dimension5 = F2.getDimension(40, 0.0f);
        if (lp0.F0 != dimension5) {
            lp0.F0 = dimension5;
            lp0.invalidateSelf();
            lp0.A();
        }
        lp0.Q(F2.getDimension(29, 0.0f));
        lp0.O(F2.getDimension(27, 0.0f));
        float dimension6 = F2.getDimension(13, 0.0f);
        if (lp0.I0 != dimension6) {
            lp0.I0 = dimension6;
            lp0.invalidateSelf();
            lp0.A();
        }
        lp0.i1 = F2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        F2.recycle();
        gw8.l(context2, attributeSet2, R.attr.chipStyle, 2131887237);
        Context context5 = context2;
        gw8.m(context5, attributeSet2, iArr, R.attr.chipStyle, 2131887237, new int[0]);
        TypedArray obtainStyledAttributes = context5.obtainStyledAttributes(attributeSet2, iArr, R.attr.chipStyle, 2131887237);
        this.J = obtainStyledAttributes.getBoolean(32, false);
        TypedValue I2 = gw8.I(context5, R.attr.minTouchTargetSize);
        if (I2 == null || I2.type != 5) {
            dimension = context5.getResources().getDimension(R.dimen.mtrl_min_touch_target_size);
        } else {
            dimension = I2.getDimension(context5.getResources().getDisplayMetrics());
        }
        this.L = (int) Math.ceil((double) obtainStyledAttributes.getDimension(20, (float) ((int) dimension)));
        obtainStyledAttributes.recycle();
        setChipDrawable(lp0);
        lp0.m(getElevation());
        gw8.l(context5, attributeSet2, R.attr.chipStyle, 2131887237);
        gw8.m(context5, attributeSet2, iArr, R.attr.chipStyle, 2131887237, new int[0]);
        TypedArray obtainStyledAttributes2 = context5.obtainStyledAttributes(attributeSet2, iArr, R.attr.chipStyle, 2131887237);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.N = new jp0(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new ip0(this));
        }
        setChecked(this.F);
        setText(lp0.j0);
        setEllipsize(lp0.g1);
        g();
        if (!this.A.h1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.J) {
            setMinHeight(this.L);
        }
        this.K = getLayoutDirection();
        super.setOnCheckedChangeListener(new gp0(this));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.Q;
        rectF.setEmpty();
        if (c() && this.D != null) {
            lp0 lp0 = this.A;
            Rect bounds = lp0.getBounds();
            rectF.setEmpty();
            if (lp0.a0()) {
                float f = lp0.I0 + lp0.H0 + lp0.t0 + lp0.G0 + lp0.F0;
                if (lp0.getLayoutDirection() == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.P;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private sc7 getTextAppearance() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.P0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.H != z) {
            this.H = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.G != z) {
            this.G = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        int i2;
        this.L = i;
        int i3 = 0;
        if (!this.J) {
            InsetDrawable insetDrawable = this.B;
            if (insetDrawable == null) {
                e();
            } else if (insetDrawable != null) {
                this.B = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                e();
            }
        } else {
            int max = Math.max(0, i - ((int) this.A.e0));
            int max2 = Math.max(0, i - this.A.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i2 = max2 / 2;
                } else {
                    i2 = 0;
                }
                if (max > 0) {
                    i3 = max / 2;
                }
                int i4 = i3;
                if (this.B != null) {
                    Rect rect = new Rect();
                    this.B.getPadding(rect);
                    if (rect.top == i4 && rect.bottom == i4 && rect.left == i2 && rect.right == i2) {
                        e();
                        return;
                    }
                }
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.B = new InsetDrawable(this.A, i2, i4, i2, i4);
                e();
                return;
            }
            InsetDrawable insetDrawable2 = this.B;
            if (insetDrawable2 == null) {
                e();
            } else if (insetDrawable2 != null) {
                this.B = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                e();
            }
        }
    }

    public final boolean c() {
        lp0 lp0 = this.A;
        if (lp0 == null) {
            return false;
        }
        Drawable drawable = lp0.q0;
        if (drawable == null) {
            drawable = null;
        }
        if (drawable != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        lp0 lp0;
        if (!c() || (lp0 = this.A) == null || !lp0.p0 || this.D == null) {
            e58.m(this, (k4) null);
            this.O = false;
            return;
        }
        e58.m(this, this.N);
        this.O = true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.O) {
            return super.dispatchHoverEvent(motionEvent);
        }
        jp0 jp0 = this.N;
        AccessibilityManager accessibilityManager = jp0.D;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = jp0.J;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = jp0.I;
                if (i3 != i2) {
                    jp0.I = i2;
                    jp0.r(i2, 128);
                    jp0.r(i3, 256);
                    return true;
                }
                return true;
            } else if (action == 10 && (i = jp0.I) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    jp0.I = Integer.MIN_VALUE;
                    jp0.r(Integer.MIN_VALUE, 128);
                    jp0.r(i, 256);
                    return true;
                }
                return true;
            }
        }
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.O) {
            return super.dispatchKeyEvent(keyEvent);
        }
        jp0 jp0 = this.N;
        jp0.getClass();
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i3 = 0;
                                while (i < repeatCount && jp0.m(i2, (Rect) null)) {
                                    i++;
                                    i3 = 1;
                                }
                                i = i3;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = jp0.H;
                    if (i4 != Integer.MIN_VALUE) {
                        Chip chip = jp0.J;
                        if (i4 == 0) {
                            chip.performClick();
                        } else if (i4 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.D;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.O) {
                                chip.N.r(1, 1);
                            }
                        }
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = jp0.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = jp0.m(1, (Rect) null);
            }
        }
        if (i == 0 || jp0.H == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lp0 lp0 = this.A;
        int i = 0;
        if (lp0 != null && lp0.z(lp0.q0)) {
            lp0 lp02 = this.A;
            int isEnabled = isEnabled();
            if (this.I) {
                isEnabled++;
            }
            if (this.H) {
                isEnabled++;
            }
            if (this.G) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.I) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.H) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.G) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            i = lp02.R(iArr);
        }
        if (i != 0) {
            invalidate();
        }
    }

    public final void e() {
        this.C = new RippleDrawable(r86.a(this.A.i0), getBackgroundDrawable(), (Drawable) null);
        this.A.getClass();
        setBackground(this.C);
        f();
    }

    public final void f() {
        lp0 lp0;
        if (!TextUtils.isEmpty(getText()) && (lp0 = this.A) != null) {
            int w = (int) (lp0.w() + lp0.I0 + lp0.F0);
            lp0 lp02 = this.A;
            int v = (int) (lp02.v() + lp02.B0 + lp02.E0);
            if (this.B != null) {
                Rect rect = new Rect();
                this.B.getPadding(rect);
                v += rect.left;
                w += rect.right;
            }
            setPaddingRelative(v, getPaddingTop(), w, getPaddingBottom());
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        lp0 lp0 = this.A;
        if (lp0 != null) {
            paint.drawableState = lp0.getState();
        }
        sc7 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.R);
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.M)) {
            return this.M;
        }
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.v0) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.B;
        if (insetDrawable == null) {
            return this.A;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.x0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.y0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.d0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return Math.max(0.0f, lp0.x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.A;
    }

    public float getChipEndPadding() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.I0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        lp0 lp0 = this.A;
        if (lp0 == null || (drawable = lp0.l0) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.n0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.m0;
        }
        return null;
    }

    public float getChipMinHeight() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.e0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.B0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.g0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.h0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        lp0 lp0 = this.A;
        if (lp0 == null || (drawable = lp0.q0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.u0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.H0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.t0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.G0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.s0;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.g1;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.O) {
            jp0 jp0 = this.N;
            if (jp0.H == 1 || jp0.G == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public wm4 getHideMotionSpec() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.A0;
        }
        return null;
    }

    public float getIconEndPadding() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.D0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.C0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.i0;
        }
        return null;
    }

    public rq6 getShapeAppearanceModel() {
        return this.A.x.a;
    }

    public wm4 getShowMotionSpec() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.z0;
        }
        return null;
    }

    public float getTextEndPadding() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.F0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            return lp0.E0;
        }
        return 0.0f;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rc9.S0(this, this.A);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.v0) {
            View.mergeDrawableStates(onCreateDrawableState, U);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.O) {
            jp0 jp0 = this.N;
            int i2 = jp0.H;
            if (i2 != Integer.MIN_VALUE) {
                jp0.j(i2);
            }
            if (z) {
                jp0.m(i, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        lp0 lp0 = this.A;
        if (lp0 == null || !lp0.v0) {
            z = false;
        } else {
            z = true;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.K != i) {
            this.K = i;
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.G) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                    }
                }
                z = false;
                if (z || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            } else if (this.G) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.D;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.O) {
                    this.N.r(1, 1);
                }
                z = true;
                setCloseIconPressed(false);
                if (z || super.onTouchEvent(motionEvent)) {
                }
            }
            z = false;
            setCloseIconPressed(false);
            if (z || super.onTouchEvent(motionEvent)) {
            }
        } else {
            if (contains) {
                setCloseIconPressed(true);
            }
            z = false;
            if (z || super.onTouchEvent(motionEvent)) {
            }
        }
        z = true;
        if (z || super.onTouchEvent(motionEvent)) {
        }
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.M = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.C) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.C) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.C(z);
        }
    }

    public void setCheckableResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.C(lp0.J0.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        lp0 lp0 = this.A;
        if (lp0 == null) {
            this.F = z;
        } else if (lp0.v0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.D(rc9.N(lp0.J0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.E(ag8.r(lp0.J0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.F(lp0.J0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.d0 != colorStateList) {
            lp0.d0 = colorStateList;
            lp0.onStateChange(lp0.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList r;
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.d0 != (r = ag8.r(lp0.J0, i))) {
            lp0.d0 = r;
            lp0.onStateChange(lp0.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.G(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.G(lp0.J0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(lp0 lp0) {
        lp0 lp02 = this.A;
        if (lp02 != lp0) {
            if (lp02 != null) {
                lp02.f1 = new WeakReference((Object) null);
            }
            this.A = lp0;
            lp0.h1 = false;
            lp0.f1 = new WeakReference(this);
            b(this.L);
        }
    }

    public void setChipEndPadding(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.I0 != f) {
            lp0.I0 = f;
            lp0.invalidateSelf();
            lp0.A();
        }
    }

    public void setChipEndPaddingResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            float dimension = lp0.J0.getResources().getDimension(i);
            if (lp0.I0 != dimension) {
                lp0.I0 = dimension;
                lp0.invalidateSelf();
                lp0.A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.H(rc9.N(lp0.J0, i));
        }
    }

    public void setChipIconSize(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.I(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.I(lp0.J0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.J(ag8.r(lp0.J0, i));
        }
    }

    public void setChipIconVisible(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.K(lp0.J0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.e0 != f) {
            lp0.e0 = f;
            lp0.invalidateSelf();
            lp0.A();
        }
    }

    public void setChipMinHeightResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            float dimension = lp0.J0.getResources().getDimension(i);
            if (lp0.e0 != dimension) {
                lp0.e0 = dimension;
                lp0.invalidateSelf();
                lp0.A();
            }
        }
    }

    public void setChipStartPadding(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.B0 != f) {
            lp0.B0 = f;
            lp0.invalidateSelf();
            lp0.A();
        }
    }

    public void setChipStartPaddingResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            float dimension = lp0.J0.getResources().getDimension(i);
            if (lp0.B0 != dimension) {
                lp0.B0 = dimension;
                lp0.invalidateSelf();
                lp0.A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.L(ag8.r(lp0.J0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.M(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.M(lp0.J0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.N(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        k80 k80;
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.u0 != charSequence) {
            String str = k80.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                k80 = k80.e;
            } else {
                k80 = k80.d;
            }
            k80.getClass();
            v70 v70 = vd7.a;
            lp0.u0 = k80.c(charSequence);
            lp0.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.O(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.O(lp0.J0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.N(rc9.N(lp0.J0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.P(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.P(lp0.J0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.Q(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.Q(lp0.J0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.S(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.S(ag8.r(lp0.J0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            kj6.n("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            kj6.n("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            kj6.n("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            kj6.n("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            kj6.n("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            kj6.n("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            kj6.n("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            kj6.n("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.m(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                lp0 lp0 = this.A;
                if (lp0 != null) {
                    lp0.g1 = truncateAt;
                    return;
                }
                return;
            }
            kj6.n("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.J = z;
        b(this.L);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(wm4 wm4) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.A0 = wm4;
        }
    }

    public void setHideMotionSpecResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.A0 = wm4.a(lp0.J0, i);
        }
    }

    public void setIconEndPadding(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.U(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.U(lp0.J0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.V(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.V(lp0.J0.getResources().getDimension(i));
        }
    }

    public void setLayoutDirection(int i) {
        if (this.A != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            kj6.n("Chip does not support multi-line text");
        }
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            kj6.n("Chip does not support multi-line text");
        }
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.i1 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            kj6.n("Chip does not support multi-line text");
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.E = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.D = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.W(colorStateList);
        }
        this.A.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.W(ag8.r(lp0.J0, i));
            this.A.getClass();
            e();
        }
    }

    public void setShapeAppearanceModel(rq6 rq6) {
        this.A.setShapeAppearanceModel(rq6);
    }

    public void setShowMotionSpec(wm4 wm4) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.z0 = wm4;
        }
    }

    public void setShowMotionSpecResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.z0 = wm4.a(lp0.J0, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            kj6.n("Chip does not support multi-line text");
        }
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        lp0 lp0 = this.A;
        if (lp0 != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (lp0.h1) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            lp0 lp02 = this.A;
            if (lp02 != null && !TextUtils.equals(lp02.j0, charSequence)) {
                lp02.j0 = charSequence;
                lp02.P0.d = true;
                lp02.invalidateSelf();
                lp02.A();
            }
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.X(new sc7(lp0.J0, i));
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.F0 != f) {
            lp0.F0 = f;
            lp0.invalidateSelf();
            lp0.A();
        }
    }

    public void setTextEndPaddingResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            float dimension = lp0.J0.getResources().getDimension(i);
            if (lp0.F0 != dimension) {
                lp0.F0 = dimension;
                lp0.invalidateSelf();
                lp0.A();
            }
        }
    }

    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        lp0 lp0 = this.A;
        if (lp0 != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            xd7 xd7 = lp0.P0;
            sc7 sc7 = xd7.f;
            if (sc7 != null) {
                sc7.l = applyDimension;
                xd7.a.setTextSize(applyDimension);
                lp0.A();
                lp0.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        lp0 lp0 = this.A;
        if (lp0 != null && lp0.E0 != f) {
            lp0.E0 = f;
            lp0.invalidateSelf();
            lp0.A();
        }
    }

    public void setTextStartPaddingResource(int i) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            float dimension = lp0.J0.getResources().getDimension(i);
            if (lp0.E0 != dimension) {
                lp0.E0 = dimension;
                lp0.invalidateSelf();
                lp0.A();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.T(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.F(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.K(z);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            kj6.n("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            kj6.n("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            kj6.n("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            kj6.n("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(sc7 sc7) {
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.X(sc7);
        }
        g();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        lp0 lp0 = this.A;
        if (lp0 != null) {
            lp0.X(new sc7(lp0.J0, i));
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(og4 og4) {
    }
}
