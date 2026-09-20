package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class MaterialButton extends bo implements Checkable, fr6 {
    public static final int[] e0 = {16842911};
    public static final int[] f0 = {16842912};
    public static final ag4 g0 = new Object();
    public final LinkedHashSet A = new LinkedHashSet();
    public bg4 B;
    public PorterDuff.Mode C;
    public ColorStateList D;
    public Drawable E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public int P;
    public int Q;
    public LinearLayout.LayoutParams R;
    public boolean S;
    public int T;
    public boolean U;
    public int V;
    public j37 W;
    public int a0;
    public float b0;
    public float c0;
    public u17 d0;
    public final eg4 z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(rg3.G(context, attributeSet, R.attr.materialButtonStyle, 2131887223, new int[]{R.attr.materialSizeOverlay}), attributeSet, R.attr.materialButtonStyle);
        rq6 rq6;
        boolean z2 = false;
        this.K = false;
        this.L = false;
        this.N = -1;
        this.O = -1.0f;
        this.P = -1;
        this.Q = -1;
        this.V = -1;
        Context context2 = getContext();
        AttributeSet attributeSet2 = attributeSet;
        TypedArray F2 = gw8.F(context2, attributeSet2, ov5.j, R.attr.materialButtonStyle, 2131887223, new int[0]);
        this.J = F2.getDimensionPixelSize(13, 0);
        int i = F2.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.C = ya5.n(i, mode);
        this.D = t49.L(getContext(), F2, 15);
        this.E = t49.N(getContext(), F2, 11);
        this.M = F2.getInteger(12, 1);
        this.G = F2.getDimensionPixelSize(14, 0);
        h37 b = h37.b(context2, F2, 19);
        if (b != null) {
            rq6 = b.c();
        } else {
            rq6 = rq6.b(context2, attributeSet2, R.attr.materialButtonStyle, 2131887223).a();
        }
        boolean z3 = F2.getBoolean(17, false);
        eg4 eg4 = new eg4(this, rq6);
        this.z = eg4;
        eg4.f = F2.getDimensionPixelOffset(2, 0);
        eg4.g = F2.getDimensionPixelOffset(3, 0);
        eg4.h = F2.getDimensionPixelOffset(4, 0);
        eg4.i = F2.getDimensionPixelOffset(5, 0);
        if (F2.hasValue(9)) {
            int dimensionPixelSize = F2.getDimensionPixelSize(9, -1);
            eg4.j = dimensionPixelSize;
            float f = (float) dimensionPixelSize;
            qq6 f2 = eg4.b.f();
            f2.e = new a0(f);
            f2.f = new a0(f);
            f2.g = new a0(f);
            f2.h = new a0(f);
            eg4.b = f2.a();
            eg4.c = null;
            eg4.d();
            eg4.s = true;
        }
        eg4.k = F2.getDimensionPixelSize(22, 0);
        eg4.l = ya5.n(F2.getInt(8, -1), mode);
        eg4.m = t49.L(getContext(), F2, 7);
        eg4.n = t49.L(getContext(), F2, 21);
        eg4.o = t49.L(getContext(), F2, 18);
        eg4.t = F2.getBoolean(6, false);
        eg4.w = F2.getDimensionPixelSize(10, 0);
        eg4.u = F2.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (F2.hasValue(0)) {
            eg4.r = true;
            setSupportBackgroundTintList(eg4.m);
            setSupportBackgroundTintMode(eg4.l);
        } else {
            eg4.c();
        }
        setPaddingRelative(paddingStart + eg4.f, paddingTop + eg4.h, paddingEnd + eg4.g, paddingBottom + eg4.i);
        setCheckedInternal(F2.getBoolean(1, false));
        if (b != null) {
            eg4.d = d();
            if (eg4.c != null) {
                eg4.d();
            }
            eg4.c = b;
            eg4.d();
        }
        setOpticalCenterEnabled(z3);
        F2.recycle();
        setCompoundDrawablePadding(this.J);
        h(this.E != null ? true : z2);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.T = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.b0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getOpticalCenterShift() {
        ug4 a;
        if (!this.S || !this.U || (a = this.z.a(false)) == null) {
            return 0;
        }
        return (int) (a.h() * 0.11f);
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil((double) f);
    }

    private void setCheckedInternal(boolean z2) {
        eg4 eg4 = this.z;
        if (eg4 != null && eg4.t && this.K != z2) {
            this.K = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.K;
                if (!materialButtonToggleGroup.H) {
                    materialButtonToggleGroup.f(getId(), z3);
                }
            }
            if (!this.L) {
                this.L = true;
                Iterator it = this.A.iterator();
                if (!it.hasNext()) {
                    this.L = false;
                    return;
                }
                throw pb4.g(it);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [android.view.View] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.b0 != f) {
            this.b0 = f;
            j();
            invalidate();
            if (getParent() instanceof dg4) {
                dg4 dg4 = (dg4) getParent();
                int i = (int) this.b0;
                int indexOfChild = dg4.indexOfChild(this);
                if (indexOfChild >= 0) {
                    int i2 = indexOfChild - 1;
                    while (true) {
                        materialButton = null;
                        if (i2 < 0) {
                            materialButton2 = null;
                            break;
                        } else if (dg4.c(i2)) {
                            materialButton2 = (MaterialButton) dg4.getChildAt(i2);
                            break;
                        } else {
                            i2--;
                        }
                    }
                    int childCount = dg4.getChildCount();
                    while (true) {
                        indexOfChild++;
                        if (indexOfChild < childCount) {
                            if (dg4.c(indexOfChild)) {
                                materialButton = dg4.getChildAt(indexOfChild);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (materialButton2 != null || materialButton != null) {
                        if (materialButton2 == null) {
                            materialButton.setDisplayedWidthDecrease(i);
                        }
                        if (materialButton == null) {
                            materialButton2.setDisplayedWidthDecrease(i);
                        }
                        if (materialButton2 != null && materialButton != null) {
                            materialButton2.setDisplayedWidthDecrease(i / 2);
                            materialButton.setDisplayedWidthDecrease((i + 1) / 2);
                        }
                    }
                }
            }
        }
    }

    public final v17 d() {
        TypedArray typedArray;
        Context context = getContext();
        TypedValue I2 = gw8.I(context, R.attr.motionSpringFastSpatial);
        int[] iArr = ov5.s;
        if (I2 == null) {
            typedArray = context.obtainStyledAttributes((AttributeSet) null, iArr, 0, 2131886407);
        } else {
            typedArray = context.obtainStyledAttributes(I2.resourceId, iArr);
        }
        v17 v17 = new v17();
        try {
            float f = typedArray.getFloat(1, Float.MIN_VALUE);
            if (f != Float.MIN_VALUE) {
                float f2 = typedArray.getFloat(0, Float.MIN_VALUE);
                if (f2 != Float.MIN_VALUE) {
                    v17.b(f);
                    v17.a(f2);
                    return v17;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            typedArray.recycle();
        }
    }

    public final boolean e() {
        eg4 eg4 = this.z;
        if (eg4 == null || eg4.r) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r1 == 2) goto L_0x006e;
     */
    public final void f(boolean z2) {
        int i;
        br4 br4;
        if (this.W != null) {
            if (this.d0 == null) {
                u17 u17 = new u17(this, g0);
                this.d0 = u17;
                u17.m = d();
            }
            if (this.U) {
                int i2 = this.a0;
                j37 j37 = this.W;
                int[] drawableState = getDrawableState();
                int[][] iArr = j37.c;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i = -1;
                    if (i4 >= j37.a) {
                        i4 = -1;
                        break;
                    } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 < 0) {
                    int[] iArr2 = StateSet.WILD_CARD;
                    int[][] iArr3 = j37.c;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= j37.a) {
                            break;
                        } else if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                            i = i5;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    i4 = i;
                }
                if (i4 < 0) {
                    br4 = j37.b;
                } else {
                    br4 = j37.d[i4];
                }
                i37 i37 = (i37) br4.x;
                int width = getWidth();
                float f = i37.b;
                int i6 = i37.a;
                if (i6 == 1) {
                    f *= (float) width;
                }
                i3 = (int) f;
                this.d0.a((float) Math.min(i2, i3));
                if (z2) {
                    this.d0.d();
                }
            }
        }
    }

    public final void g() {
        int i = this.M;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.E, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i == 3 || i == 4) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative((Drawable) null, this.E, (Drawable) null, (Drawable) null);
        }
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.F)) {
            return this.F;
        }
        eg4 eg4 = this.z;
        if (eg4 == null || !eg4.t) {
            cls = Button.class;
        } else {
            cls = CompoundButton.class;
        }
        return cls.getName();
    }

    public int getAllowedWidthDecrease() {
        return this.V;
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.z.j;
        }
        return 0;
    }

    public v17 getCornerSpringForce() {
        return this.z.d;
    }

    public Drawable getIcon() {
        return this.E;
    }

    public int getIconGravity() {
        return this.M;
    }

    public int getIconPadding() {
        return this.J;
    }

    public int getIconSize() {
        return this.G;
    }

    public ColorStateList getIconTint() {
        return this.D;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.C;
    }

    public int getInsetBottom() {
        return this.z.i;
    }

    public int getInsetTop() {
        return this.z.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.z.o;
        }
        return null;
    }

    public rq6 getShapeAppearanceModel() {
        if (e()) {
            return this.z.b;
        }
        h.s("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public h37 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.z.c;
        }
        h.s("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.z.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.z.k;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.z.m;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.z.l;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z2) {
        Drawable drawable = this.E;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.E = mutate;
            mutate.setTintList(this.D);
            PorterDuff.Mode mode = this.C;
            if (mode != null) {
                this.E.setTintMode(mode);
            }
            int i = this.G;
            if (i == 0) {
                i = this.E.getIntrinsicWidth();
            }
            int i2 = this.G;
            if (i2 == 0) {
                i2 = this.E.getIntrinsicHeight();
            }
            Drawable drawable2 = this.E;
            int i3 = this.H;
            int i4 = this.I;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.E.setVisible(true, z2);
        }
        if (z2) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.M;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.E) || (((i5 == 3 || i5 == 4) && drawable5 != this.E) || ((i5 == 16 || i5 == 32) && drawable4 != this.E))) {
            g();
        }
    }

    public final void i(int i, int i2) {
        boolean z2;
        if (this.E != null && getLayout() != null) {
            int i3 = this.M;
            boolean z3 = true;
            if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                this.I = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i4 = this.M;
                if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.H = 0;
                    h(false);
                    return;
                }
                int i5 = this.G;
                if (i5 == 0) {
                    i5 = this.E.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i5) - this.J) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.M != 4) {
                    z3 = false;
                }
                if (z2 != z3) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.H != textLayoutWidth) {
                    this.H = textLayoutWidth;
                    h(false);
                }
            } else if (i3 == 16 || i3 == 32) {
                this.H = 0;
                if (i3 == 16) {
                    this.I = 0;
                    h(false);
                    return;
                }
                int i6 = this.G;
                if (i6 == 0) {
                    i6 = this.E.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i6) - this.J) - getPaddingBottom()) / 2);
                if (this.I != max) {
                    this.I = max;
                    h(false);
                }
            }
        }
    }

    public final boolean isChecked() {
        return this.K;
    }

    public final void j() {
        int i = (int) (this.b0 - this.c0);
        int i2 = (i / 2) + this.T;
        getLayoutParams().width = (int) (this.O + ((float) i));
        setPaddingRelative(this.P + i2, getPaddingTop(), (this.Q + i) - i2, getPaddingBottom());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            rc9.S0(this, this.z.a(false));
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        eg4 eg4 = this.z;
        if (eg4 != null && eg4.t) {
            View.mergeDrawableStates(onCreateDrawableState, e0);
        }
        if (this.K) {
            View.mergeDrawableStates(onCreateDrawableState, f0);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.K);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        eg4 eg4 = this.z;
        if (eg4 == null || !eg4.t) {
            z2 = false;
        } else {
            z2 = true;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setChecked(this.K);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z2, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.N != i6) {
            this.N = i6;
            this.O = -1.0f;
        }
        if (this.O == -1.0f) {
            this.O = (float) getMeasuredWidth();
            if (this.R == null && (getParent() instanceof dg4) && ((dg4) getParent()).getButtonSizeChange() != null) {
                this.R = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.R);
                layoutParams.width = (int) this.O;
                setLayoutParams(layoutParams);
            }
        }
        boolean z3 = false;
        if (this.V == -1) {
            if (this.E == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.G;
                if (i7 == 0) {
                    i7 = this.E.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.V = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.P == -1) {
            this.P = getPaddingStart();
        }
        if (this.Q == -1) {
            this.Q = getPaddingEnd();
        }
        if ((getParent() instanceof dg4) && ((dg4) getParent()).getOrientation() == 0) {
            z3 = true;
        }
        this.U = z3;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof cg4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cg4 cg4 = (cg4) parcelable;
        super.onRestoreInstanceState(cg4.w);
        setChecked(cg4.y);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [cg4, android.os.Parcelable, x] */
    public final Parcelable onSaveInstanceState() {
        ? xVar = new x(super.onSaveInstanceState());
        xVar.y = this.K;
        return xVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (isEnabled() && this.z.u) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.E != null) {
            if (this.E.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.F = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (e()) {
            eg4 eg4 = this.z;
            if (eg4.a(false) != null) {
                eg4.a(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            eg4 eg4 = this.z;
            eg4.r = true;
            MaterialButton materialButton = eg4.a;
            materialButton.setSupportBackgroundTintList(eg4.m);
            materialButton.setSupportBackgroundTintMode(eg4.l);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = rc9.N(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (e()) {
            this.z.t = z2;
        }
    }

    public void setChecked(boolean z2) {
        setCheckedInternal(z2);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            eg4 eg4 = this.z;
            if (!eg4.s || eg4.j != i) {
                eg4.j = i;
                eg4.s = true;
                float f = (float) i;
                qq6 f2 = eg4.b.f();
                f2.e = new a0(f);
                f2.f = new a0(f);
                f2.g = new a0(f);
                f2.h = new a0(f);
                eg4.b = f2.a();
                eg4.c = null;
                eg4.d();
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(v17 v17) {
        eg4 eg4 = this.z;
        eg4.d = v17;
        if (eg4.c != null) {
            eg4.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.c0 = (float) Math.min(i, this.V);
        j();
        invalidate();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            this.z.a(false).m(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.E != drawable) {
            this.E = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.M != i) {
            this.M = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.J != i) {
            this.J = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = rc9.N(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            h.q("iconSize cannot be less than 0");
        } else if (this.G != i) {
            this.G = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.C != mode) {
            this.C = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(ag8.r(getContext(), i));
    }

    public void setInsetBottom(int i) {
        eg4 eg4 = this.z;
        eg4.b(eg4.h, i);
    }

    public void setInsetTop(int i) {
        eg4 eg4 = this.z;
        eg4.b(i, eg4.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(bg4 bg4) {
        this.B = bg4;
    }

    public void setOpticalCenterEnabled(boolean z2) {
        if (this.S != z2) {
            this.S = z2;
            eg4 eg4 = this.z;
            if (z2) {
                c9 c9Var = new c9(13, this);
                eg4.e = c9Var;
                ug4 a = eg4.a(false);
                if (a != null) {
                    a.Z = c9Var;
                }
            } else {
                eg4.e = null;
                ug4 a2 = eg4.a(false);
                if (a2 != null) {
                    a2.Z = null;
                }
            }
            post(new y0(18, this));
        }
    }

    public void setPressed(boolean z2) {
        bg4 bg4 = this.B;
        if (bg4 != null) {
            ((MaterialButtonToggleGroup) ((f96) bg4).x).invalidate();
        }
        super.setPressed(z2);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            eg4 eg4 = this.z;
            MaterialButton materialButton = eg4.a;
            if (eg4.o != colorStateList) {
                eg4.o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(r86.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(ag8.r(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(rq6 rq6) {
        if (e()) {
            eg4 eg4 = this.z;
            eg4.b = rq6;
            eg4.c = null;
            eg4.d();
            return;
        }
        h.s("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (e()) {
            eg4 eg4 = this.z;
            eg4.q = z2;
            eg4.e();
        }
    }

    public void setSizeChange(j37 j37) {
        if (this.W != j37) {
            this.W = j37;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(h37 h37) {
        if (e()) {
            eg4 eg4 = this.z;
            if (eg4.d == null && h37.d()) {
                eg4.d = d();
                if (eg4.c != null) {
                    eg4.d();
                }
            }
            eg4.c = h37;
            eg4.d();
            return;
        }
        h.s("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            eg4 eg4 = this.z;
            if (eg4.n != colorStateList) {
                eg4.n = colorStateList;
                eg4.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(ag8.r(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            eg4 eg4 = this.z;
            if (eg4.k != i) {
                eg4.k = i;
                eg4.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            eg4 eg4 = this.z;
            if (eg4.m != colorStateList) {
                eg4.m = colorStateList;
                if (eg4.a(false) != null) {
                    eg4.a(false).setTintList(eg4.m);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            eg4 eg4 = this.z;
            if (eg4.l != mode) {
                eg4.l = mode;
                if (eg4.a(false) != null && eg4.l != null) {
                    eg4.a(false).setTintMode(eg4.l);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.z.u = z2;
    }

    public void setWidth(int i) {
        this.O = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.a0 != i) {
            this.a0 = i;
            f(true);
        }
    }

    public final void toggle() {
        setChecked(!this.K);
    }
}
