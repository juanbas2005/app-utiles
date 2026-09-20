package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] Z0 = {new int[]{16842919}, new int[0]};
    public EditText A;
    public int A0;
    public CharSequence B;
    public final LinkedHashSet B0 = new LinkedHashSet();
    public int C = -1;
    public ColorDrawable C0;
    public int D = -1;
    public int D0;
    public int E = -1;
    public Drawable E0;
    public int F = -1;
    public ColorStateList F0;
    public final ra3 G = new ra3(this);
    public ColorStateList G0;
    public boolean H;
    public int H0;
    public int I;
    public int I0;
    public boolean J;
    public int J0;
    public pf7 K = new kj6(10);
    public ColorStateList K0;
    public gq L;
    public int L0;
    public int M;
    public int M0;
    public int N;
    public int N0;
    public CharSequence O;
    public int O0;
    public boolean P;
    public int P0;
    public gq Q;
    public int Q0;
    public ColorStateList R;
    public boolean R0;
    public int S;
    public final zs0 S0;
    public fb2 T;
    public boolean T0;
    public fb2 U;
    public boolean U0;
    public ColorStateList V;
    public ValueAnimator V0;
    public ColorStateList W;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public ColorStateList a0;
    public ColorStateList b0;
    public boolean c0;
    public CharSequence d0;
    public boolean e0;
    public ug4 f0;
    public ug4 g0;
    public StateListDrawable h0;
    public boolean i0;
    public ug4 j0;
    public ug4 k0;
    public rq6 l0;
    public boolean m0;
    public final int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public final Rect v0 = new Rect();
    public final FrameLayout w;
    public final Rect w0 = new Rect();
    public final r27 x;
    public final RectF x0 = new RectF();
    public final p42 y;
    public Typeface y0;
    public final int z;
    public ColorDrawable z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(rg3.F(context, r2, R.attr.textInputStyle, 2131887001), r2, R.attr.textInputStyle);
        AttributeSet attributeSet2 = attributeSet;
        zs0 zs0 = new zs0(this);
        this.S0 = zs0;
        this.Y0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.w = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = jl.a;
        zs0.R = linearInterpolator;
        zs0.j(false);
        zs0.Q = linearInterpolator;
        zs0.j(false);
        if (zs0.g != 8388659) {
            zs0.g = 8388659;
            zs0.j(false);
        }
        gw8.l(context2, attributeSet2, R.attr.textInputStyle, 2131887001);
        Context context3 = context2;
        int[] iArr = ov5.D;
        gw8.m(context3, attributeSet2, iArr, R.attr.textInputStyle, 2131887001, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet2, iArr, R.attr.textInputStyle, 2131887001);
        cf4 cf4 = new cf4(context3, obtainStyledAttributes);
        r27 r27 = new r27(this, cf4);
        this.x = r27;
        this.c0 = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.U0 = obtainStyledAttributes.getBoolean(47, true);
        this.T0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.l0 = rq6.b(context3, attributeSet2, R.attr.textInputStyle, 2131887001).a();
        this.n0 = context3.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.p0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.z = getResources().getDimensionPixelSize(R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.r0 = obtainStyledAttributes.getDimensionPixelSize(16, context3.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.s0 = obtainStyledAttributes.getDimensionPixelSize(17, context3.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.q0 = this.r0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        qq6 f = this.l0.f();
        if (dimension >= 0.0f) {
            f.e = new a0(dimension);
        }
        if (dimension2 >= 0.0f) {
            f.f = new a0(dimension2);
        }
        if (dimension3 >= 0.0f) {
            f.g = new a0(dimension3);
        }
        if (dimension4 >= 0.0f) {
            f.h = new a0(dimension4);
        }
        this.l0 = f.a();
        ColorStateList K2 = t49.K(context3, cf4, 7);
        if (K2 != null) {
            int defaultColor = K2.getDefaultColor();
            this.L0 = defaultColor;
            this.u0 = defaultColor;
            if (K2.isStateful()) {
                this.M0 = K2.getColorForState(new int[]{-16842910}, -1);
                this.N0 = K2.getColorForState(new int[]{16842908, 16842910}, -1);
                this.O0 = K2.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.N0 = this.L0;
                ColorStateList r = ag8.r(context3, R.color.mtrl_filled_background_color);
                this.M0 = r.getColorForState(new int[]{-16842910}, -1);
                this.O0 = r.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.u0 = 0;
            this.L0 = 0;
            this.M0 = 0;
            this.N0 = 0;
            this.O0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g = cf4.g(1);
            this.G0 = g;
            this.F0 = g;
        }
        ColorStateList K3 = t49.K(context3, cf4, 14);
        this.J0 = obtainStyledAttributes.getColor(14, 0);
        this.H0 = context3.getColor(R.color.mtrl_textinput_default_box_stroke_color);
        this.P0 = context3.getColor(R.color.mtrl_textinput_disabled_color);
        this.I0 = context3.getColor(R.color.mtrl_textinput_hovered_box_stroke_color);
        if (K3 != null) {
            setBoxStrokeColorStateList(K3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(t49.K(context3, cf4, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.a0 = cf4.g(24);
        this.b0 = cf4.g(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z4 = obtainStyledAttributes.getBoolean(18, false);
        CharSequence charSequence = text2;
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.N = obtainStyledAttributes.getResourceId(22, 0);
        this.M = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.M);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.N);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(cf4.g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(cf4.g(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(cf4.g(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(cf4.g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(cf4.g(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(cf4.g(59));
        }
        p42 p42 = new p42(this, cf4);
        this.y = p42;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        cf4.A();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(r27);
        frameLayout.addView(p42);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(charSequence);
    }

    private Drawable getEditTextBoxBackground() {
        int i;
        EditText editText = this.A;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f0;
        }
        int z2 = h49.z(this.A, R.attr.colorControlHighlight);
        int i2 = this.o0;
        int[][] iArr = Z0;
        if (i2 == 2) {
            Context context = getContext();
            ug4 ug4 = this.f0;
            TypedValue K2 = gw8.K(context, "TextInputLayout", R.attr.colorSurface);
            int i3 = K2.resourceId;
            if (i3 != 0) {
                i = context.getColor(i3);
            } else {
                i = K2.data;
            }
            ug4 ug42 = new ug4(ug4.x.a);
            int G2 = h49.G(0.1f, z2, i);
            ug42.n(new ColorStateList(iArr, new int[]{G2, 0}));
            ug42.setTint(i);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{G2, i});
            ug4 ug43 = new ug4(ug4.x.a);
            ug43.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, ug42, ug43), ug4});
        } else if (i2 != 1) {
            return null;
        } else {
            ug4 ug44 = this.f0;
            int i4 = this.u0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{h49.G(0.1f, z2, i4), i4}), ug44, ug44);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.h0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.h0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.h0.addState(new int[0], h(false));
        }
        return this.h0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.g0 == null) {
            this.g0 = h(true);
        }
        return this.g0;
    }

    public static void m(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.A == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.A = editText;
            int i = this.C;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.E);
            }
            int i2 = this.D;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.F);
            }
            this.i0 = false;
            k();
            setTextInputAccessibilityDelegate(new of7(this));
            Typeface typeface = this.A.getTypeface();
            zs0 zs0 = this.S0;
            zs0.n(typeface);
            float textSize = this.A.getTextSize();
            if (zs0.h != textSize) {
                zs0.h = textSize;
                zs0.j(false);
            }
            float letterSpacing = this.A.getLetterSpacing();
            if (zs0.X != letterSpacing) {
                zs0.X = letterSpacing;
                zs0.j(false);
            }
            int gravity = this.A.getGravity();
            int i3 = (gravity & -113) | 48;
            if (zs0.g != i3) {
                zs0.g = i3;
                zs0.j(false);
            }
            if (zs0.f != gravity) {
                zs0.f = gravity;
                zs0.j(false);
            }
            this.Q0 = editText.getMinimumHeight();
            this.A.addTextChangedListener(new nf7(this, editText));
            if (this.F0 == null) {
                this.F0 = this.A.getHintTextColors();
            }
            if (this.c0) {
                if (TextUtils.isEmpty(this.d0)) {
                    CharSequence hint = this.A.getHint();
                    this.B = hint;
                    setHint(hint);
                    this.A.setHint((CharSequence) null);
                }
                this.e0 = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            if (this.L != null) {
                p(this.A.getText());
            }
            t();
            this.G.b();
            this.x.bringToFront();
            p42 p42 = this.y;
            p42.bringToFront();
            Iterator it = this.B0.iterator();
            while (it.hasNext()) {
                ((o42) it.next()).a(this);
            }
            p42.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w(false, true);
            return;
        }
        h.q("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.d0)) {
            this.d0 = charSequence;
            zs0 zs0 = this.S0;
            if (charSequence == null || !TextUtils.equals(zs0.B, charSequence)) {
                zs0.B = charSequence;
                zs0.C = null;
                zs0.j(false);
            }
            if (!this.R0) {
                l();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.P != z2) {
            gq gqVar = this.Q;
            if (!z2) {
                if (gqVar != null) {
                    gqVar.setVisibility(8);
                }
                this.Q = null;
            } else if (gqVar != null) {
                this.w.addView(gqVar);
                this.Q.setVisibility(0);
            }
            this.P = z2;
        }
    }

    public final void a() {
        if (this.A != null && this.o0 == 1) {
            if (getHintMaxLines() != 1) {
                EditText editText = this.A;
                editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.S0.f() + ((float) this.z)), this.A.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText2 = this.A;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.A.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (t49.R(getContext())) {
                EditText editText3 = this.A;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.A.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.w;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            v();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(float f) {
        zs0 zs0 = this.S0;
        if (zs0.b != f) {
            if (this.V0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.V0 = valueAnimator;
                valueAnimator.setInterpolator(kl8.G(getContext(), R.attr.motionEasingEmphasizedInterpolator, jl.b));
                this.V0.setDuration((long) kl8.F(getContext(), R.attr.motionDurationMedium4, 167));
                this.V0.addUpdateListener(new wa0(2, this));
            }
            this.V0.setFloatValues(new float[]{zs0.b, f});
            this.V0.start();
        }
    }

    public final void c() {
        ColorStateList colorStateList;
        int i;
        int i2;
        ug4 ug4 = this.f0;
        if (ug4 != null) {
            rq6 rq6 = ug4.x.a;
            rq6 rq62 = this.l0;
            if (rq6 != rq62) {
                ug4.setShapeAppearanceModel(rq62);
            }
            if (this.o0 == 2 && (i = this.q0) > -1 && (i2 = this.t0) != 0) {
                ug4 ug42 = this.f0;
                ug42.x.k = (float) i;
                ug42.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i2);
                sg4 sg4 = ug42.x;
                if (sg4.e != valueOf) {
                    sg4.e = valueOf;
                    ug42.onStateChange(ug42.getState());
                }
            }
            int i3 = this.u0;
            if (this.o0 == 1) {
                i3 = yt0.b(this.u0, h49.y(getContext(), R.attr.colorSurface, 0));
            }
            this.u0 = i3;
            this.f0.n(ColorStateList.valueOf(i3));
            ug4 ug43 = this.j0;
            if (!(ug43 == null || this.k0 == null)) {
                if (this.q0 > -1 && this.t0 != 0) {
                    if (this.A.isFocused()) {
                        colorStateList = ColorStateList.valueOf(this.H0);
                    } else {
                        colorStateList = ColorStateList.valueOf(this.t0);
                    }
                    ug43.n(colorStateList);
                    this.k0.n(ColorStateList.valueOf(this.t0));
                }
                invalidate();
            }
            u();
        }
    }

    public final Rect d(Rect rect) {
        boolean z2;
        if (this.A != null) {
            if (getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = rect.bottom;
            Rect rect2 = this.w0;
            rect2.bottom = i;
            int i2 = this.o0;
            if (i2 != 1) {
                int i3 = rect.left;
                if (i2 != 2) {
                    rect2.left = i(i3, z2);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z2);
                    return rect2;
                }
                rect2.left = this.A.getPaddingLeft() + i3;
                rect2.top = rect.top - e();
                rect2.right = rect.right - this.A.getPaddingRight();
                return rect2;
            }
            rect2.left = i(rect.left, z2);
            rect2.top = rect.top + this.p0;
            rect2.right = j(rect.right, z2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.A;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.B != null) {
            boolean z2 = this.e0;
            this.e0 = false;
            CharSequence hint = editText.getHint();
            this.A.setHint(this.B);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.A.setHint(hint);
                this.e0 = z2;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            FrameLayout frameLayout = this.w;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
                View childAt = frameLayout.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.A) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.X0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.X0 = false;
    }

    public final void draw(Canvas canvas) {
        ug4 ug4;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.c0;
        zs0 zs0 = this.S0;
        if (z2) {
            TextPaint textPaint = zs0.O;
            RectF rectF = zs0.e;
            int save = canvas2.save();
            if (zs0.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(zs0.G);
                float f = zs0.q;
                float f2 = zs0.r;
                float f3 = zs0.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((zs0.e0 > 1 || zs0.f0 > 1) && !zs0.D && zs0.o()) {
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(zs0.q - ((float) zs0.Z.getLineStart(0)), f2);
                    float f4 = (float) alpha;
                    textPaint.setAlpha((int) (zs0.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = zs0.H;
                        float f6 = zs0.I;
                        float f7 = zs0.J;
                        int i2 = zs0.K;
                        textPaint.setShadowLayer(f5, f6, f7, yt0.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    zs0.Z.draw(canvas2);
                    textPaint.setAlpha((int) (zs0.b0 * f4));
                    if (i >= 31) {
                        float f8 = zs0.H;
                        float f9 = zs0.I;
                        float f10 = zs0.J;
                        int i3 = zs0.K;
                        textPaint.setShadowLayer(f8, f9, f10, yt0.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = zs0.Z.getLineBaseline(0);
                    CharSequence charSequence = zs0.d0;
                    float f11 = (float) lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(zs0.H, zs0.I, zs0.J, zs0.K);
                    }
                    String trim = zs0.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(zs0.Z.getLineEnd(0), str.length()), 0.0f, f11, textPaint);
                } else {
                    canvas2.translate(f, f2);
                    zs0.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.k0 != null && (ug4 = this.j0) != null) {
            ug4.draw(canvas2);
            if (this.A.isFocused()) {
                Rect bounds = this.k0.getBounds();
                Rect bounds2 = this.j0.getBounds();
                float f12 = zs0.b;
                int centerX = bounds2.centerX();
                bounds.left = jl.c(f12, centerX, bounds2.left);
                bounds.right = jl.c(f12, centerX, bounds2.right);
                this.k0.draw(canvas2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        if (!this.W0) {
            boolean z3 = true;
            this.W0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            zs0 zs0 = this.S0;
            if (zs0 != null) {
                zs0.M = drawableState;
                ColorStateList colorStateList2 = zs0.k;
                if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = zs0.j) != null && colorStateList.isStateful())) {
                    zs0.j(false);
                    z2 = true;
                    if (this.A != null) {
                        if (!isLaidOut() || !isEnabled()) {
                            z3 = false;
                        }
                        w(z3, false);
                    }
                    t();
                    z();
                    if (z2) {
                        invalidate();
                    }
                    this.W0 = false;
                }
            }
            z2 = false;
            if (this.A != null) {
            }
            t();
            z();
            if (z2) {
            }
            this.W0 = false;
        }
    }

    public final int e() {
        if (this.c0) {
            int i = this.o0;
            zs0 zs0 = this.S0;
            if (i == 0) {
                return (int) zs0.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (zs0.f() / 2.0f);
                }
                float f = zs0.f();
                TextPaint textPaint = zs0.P;
                textPaint.setTextSize(zs0.i);
                textPaint.setTypeface(zs0.s);
                textPaint.setLetterSpacing(zs0.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final fb2 f() {
        fb2 fb2 = new fb2();
        fb2.y = (long) kl8.F(getContext(), R.attr.motionDurationShort2, 87);
        fb2.z = kl8.G(getContext(), R.attr.motionEasingLinearInterpolator, jl.a);
        return fb2;
    }

    public final boolean g() {
        if (!this.c0 || TextUtils.isEmpty(this.d0) || !(this.f0 instanceof dd1)) {
            return false;
        }
        return true;
    }

    public int getBaseline() {
        EditText editText = this.A;
        if (editText == null) {
            return super.getBaseline();
        }
        int baseline = editText.getBaseline();
        return e() + getPaddingTop() + baseline;
    }

    public ug4 getBoxBackground() {
        int i = this.o0;
        if (i == 1 || i == 2) {
            return this.f0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.u0;
    }

    public int getBoxBackgroundMode() {
        return this.o0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.p0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        rq6 rq6 = this.l0;
        RectF rectF = this.x0;
        if (layoutDirection == 1) {
            return rq6.h.a(rectF);
        }
        return rq6.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        rq6 rq6 = this.l0;
        RectF rectF = this.x0;
        if (layoutDirection == 1) {
            return rq6.g.a(rectF);
        }
        return rq6.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        rq6 rq6 = this.l0;
        RectF rectF = this.x0;
        if (layoutDirection == 1) {
            return rq6.e.a(rectF);
        }
        return rq6.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        rq6 rq6 = this.l0;
        RectF rectF = this.x0;
        if (layoutDirection == 1) {
            return rq6.f.a(rectF);
        }
        return rq6.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.J0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.K0;
    }

    public int getBoxStrokeWidth() {
        return this.r0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.s0;
    }

    public int getCounterMaxLength() {
        return this.I;
    }

    public CharSequence getCounterOverflowDescription() {
        gq gqVar;
        if (!this.H || !this.J || (gqVar = this.L) == null) {
            return null;
        }
        return gqVar.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.W;
    }

    public ColorStateList getCounterTextColor() {
        return this.V;
    }

    public ColorStateList getCursorColor() {
        return this.a0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.b0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.F0;
    }

    public EditText getEditText() {
        return this.A;
    }

    public CharSequence getEndIconContentDescription() {
        return this.y.C.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.y.C.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.y.I;
    }

    public int getEndIconMode() {
        return this.y.E;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.y.J;
    }

    public CheckableImageButton getEndIconView() {
        return this.y.C;
    }

    public CharSequence getError() {
        ra3 ra3 = this.G;
        if (ra3.q) {
            return ra3.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.G.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.G.s;
    }

    public int getErrorCurrentTextColors() {
        gq gqVar = this.G.r;
        if (gqVar != null) {
            return gqVar.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.y.y.getDrawable();
    }

    public CharSequence getHelperText() {
        ra3 ra3 = this.G;
        if (ra3.x) {
            return ra3.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        gq gqVar = this.G.y;
        if (gqVar != null) {
            return gqVar.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.c0) {
            return this.d0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.S0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        zs0 zs0 = this.S0;
        return zs0.g(zs0.k);
    }

    public int getHintMaxLines() {
        return this.S0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.G0;
    }

    public pf7 getLengthCounter() {
        return this.K;
    }

    public int getMaxEms() {
        return this.D;
    }

    public int getMaxWidth() {
        return this.F;
    }

    public int getMinEms() {
        return this.C;
    }

    public int getMinWidth() {
        return this.E;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.y.C.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.y.C.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.P) {
            return this.O;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.S;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.R;
    }

    public CharSequence getPrefixText() {
        return this.x.y;
    }

    public ColorStateList getPrefixTextColor() {
        return this.x.x.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.x.x;
    }

    public rq6 getShapeAppearanceModel() {
        return this.l0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.x.z.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.x.z.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.x.C;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.x.D;
    }

    public CharSequence getSuffixText() {
        return this.y.L;
    }

    public ColorStateList getSuffixTextColor() {
        return this.y.M.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.y.M;
    }

    public Typeface getTypeface() {
        return this.y0;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, h49] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, h49] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, h49] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, h49] */
    /* JADX WARNING: type inference failed for: r1v3, types: [rq6, java.lang.Object] */
    public final ug4 h(boolean z2) {
        float f;
        float f2;
        ColorStateList colorStateList;
        int i;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z2) {
            f = dimensionPixelOffset;
        } else {
            f = 0.0f;
        }
        EditText editText = this.A;
        if (editText instanceof zf4) {
            f2 = ((zf4) editText).getPopupElevation();
        } else {
            f2 = (float) getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        g22 g22 = new g22(0);
        g22 g222 = new g22(0);
        g22 g223 = new g22(0);
        g22 g224 = new g22(0);
        a0 a0Var = new a0(f);
        a0 a0Var2 = new a0(f);
        a0 a0Var3 = new a0(dimensionPixelOffset);
        a0 a0Var4 = new a0(dimensionPixelOffset);
        ? obj5 = new Object();
        obj5.a = obj;
        obj5.b = obj2;
        obj5.c = obj3;
        obj5.d = obj4;
        obj5.e = a0Var;
        obj5.f = a0Var2;
        obj5.g = a0Var4;
        obj5.h = a0Var3;
        obj5.i = g22;
        obj5.j = g222;
        obj5.k = g223;
        obj5.l = g224;
        EditText editText2 = this.A;
        if (editText2 instanceof zf4) {
            colorStateList = ((zf4) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = ug4.a0;
            TypedValue K2 = gw8.K(context, ug4.class.getSimpleName(), R.attr.colorSurface);
            int i2 = K2.resourceId;
            if (i2 != 0) {
                i = context.getColor(i2);
            } else {
                i = K2.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        ug4 ug4 = new ug4();
        ug4.k(context);
        ug4.n(colorStateList);
        ug4.m(f2);
        ug4.setShapeAppearanceModel(obj5);
        sg4 sg4 = ug4.x;
        if (sg4.h == null) {
            sg4.h = new Rect();
        }
        ug4.x.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        ug4.invalidateSelf();
        return ug4;
    }

    public final int i(int i, boolean z2) {
        int compoundPaddingLeft;
        if (!z2 && getPrefixText() != null) {
            compoundPaddingLeft = this.x.a();
        } else if (!z2 || getSuffixText() == null) {
            compoundPaddingLeft = this.A.getCompoundPaddingLeft();
        } else {
            compoundPaddingLeft = this.y.c();
        }
        return compoundPaddingLeft + i;
    }

    public final int j(int i, boolean z2) {
        int compoundPaddingRight;
        if (!z2 && getSuffixText() != null) {
            compoundPaddingRight = this.y.c();
        } else if (!z2 || getPrefixText() == null) {
            compoundPaddingRight = this.A.getCompoundPaddingRight();
        } else {
            compoundPaddingRight = this.x.a();
        }
        return i - compoundPaddingRight;
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [dd1, ug4] */
    public final void k() {
        int i = this.o0;
        if (i == 0) {
            this.f0 = null;
            this.j0 = null;
            this.k0 = null;
        } else if (i == 1) {
            this.f0 = new ug4(this.l0);
            this.j0 = new ug4();
            this.k0 = new ug4();
        } else if (i == 2) {
            if (!this.c0 || (this.f0 instanceof dd1)) {
                this.f0 = new ug4(this.l0);
            } else {
                rq6 rq6 = this.l0;
                int i2 = dd1.d0;
                if (rq6 == null) {
                    rq6 = new rq6();
                }
                cd1 cd1 = new cd1(rq6, new RectF());
                ? ug4 = new ug4((sg4) cd1);
                ug4.c0 = cd1;
                this.f0 = ug4;
            }
            this.j0 = null;
            this.k0 = null;
        } else {
            h.q(hl6.n(new StringBuilder(), this.o0, " is illegal; only @BoxBackgroundMode constants are supported."));
            return;
        }
        u();
        z();
        if (this.o0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.p0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (t49.R(getContext())) {
                this.p0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.o0 != 0) {
            v();
        }
        EditText editText = this.A;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.o0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    public final void l() {
        float f;
        RectF rectF;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        int i2;
        if (g()) {
            int width = this.A.getWidth();
            int gravity = this.A.getGravity();
            zs0 zs0 = this.S0;
            boolean c = zs0.c(zs0.B);
            zs0.D = c;
            Rect rect = zs0.d;
            if (gravity == 17 || (gravity & 7) == 1) {
                f4 = ((float) width) / 2.0f;
                f5 = zs0.a0 / 2.0f;
            } else {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                    } else {
                        f4 = (float) rect.right;
                        f5 = zs0.a0;
                    }
                } else if (c) {
                    f4 = (float) rect.right;
                    f5 = zs0.a0;
                } else {
                    i2 = rect.left;
                }
                f = (float) i2;
                float max = Math.max(f, (float) rect.left);
                rectF = this.x0;
                rectF.left = max;
                rectF.top = (float) rect.top;
                if (gravity == 17 || (gravity & 7) == 1) {
                    f2 = (((float) width) / 2.0f) + (zs0.a0 / 2.0f);
                } else {
                    if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                        if (zs0.D) {
                            f3 = zs0.a0;
                            f2 = f3 + max;
                        } else {
                            i = rect.right;
                        }
                    } else if (zs0.D) {
                        i = rect.right;
                    } else {
                        f3 = zs0.a0;
                        f2 = f3 + max;
                    }
                    f2 = (float) i;
                }
                rectF.right = Math.min(f2, (float) rect.right);
                rectF.bottom = zs0.f() + ((float) rect.top);
                if (zs0.Z != null && !zs0.o()) {
                    StaticLayout staticLayout = zs0.Z;
                    float lineWidth = (zs0.i / zs0.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (!zs0.D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    float f6 = rectF.left;
                    float f7 = (float) this.n0;
                    rectF.left = f6 - f7;
                    rectF.right += f7;
                    rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.q0));
                    rectF.top = 0.0f;
                    dd1 dd1 = (dd1) this.f0;
                    dd1.getClass();
                    dd1.t(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
                return;
            }
            f = f4 - f5;
            float max2 = Math.max(f, (float) rect.left);
            rectF = this.x0;
            rectF.left = max2;
            rectF.top = (float) rect.top;
            if (gravity == 17 || (gravity & 7) == 1) {
            }
            rectF.right = Math.min(f2, (float) rect.right);
            rectF.bottom = zs0.f() + ((float) rect.top);
            StaticLayout staticLayout2 = zs0.Z;
            float lineWidth2 = (zs0.i / zs0.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
            if (!zs0.D) {
            }
            if (rectF.width() > 0.0f || rectF.height() > 0.0f) {
            }
        }
    }

    public final void n(gq gqVar, int i) {
        try {
            gqVar.setTextAppearance(i);
            if (gqVar.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        gqVar.setTextAppearance(2131886538);
        gqVar.setTextColor(getContext().getColor(R.color.design_error));
    }

    public final boolean o() {
        ra3 ra3 = this.G;
        if (ra3.o != 1 || ra3.r == null || TextUtils.isEmpty(ra3.p)) {
            return false;
        }
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.S0.i(configuration);
    }

    public final void onGlobalLayout() {
        int max;
        p42 p42 = this.y;
        p42.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.Y0 = false;
        if (this.A != null && this.A.getMeasuredHeight() < (max = Math.max(p42.getMeasuredHeight(), this.x.getMeasuredHeight()))) {
            this.A.setMinimumHeight(max);
            z2 = true;
        }
        boolean s = s();
        if (z2 || s) {
            this.A.post(new y0(24, this));
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int i6;
        int i7;
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.A;
        if (editText != null) {
            Rect rect = this.v0;
            pq1.a(this, editText, rect);
            ug4 ug4 = this.j0;
            if (ug4 != null) {
                int i8 = rect.bottom;
                ug4.setBounds(rect.left, i8 - this.r0, rect.right, i8);
            }
            ug4 ug42 = this.k0;
            if (ug42 != null) {
                int i9 = rect.bottom;
                ug42.setBounds(rect.left, i9 - this.s0, rect.right, i9);
            }
            if (this.c0) {
                float textSize = this.A.getTextSize();
                zs0 zs0 = this.S0;
                float f2 = zs0.h;
                TextPaint textPaint = zs0.P;
                if (f2 != textSize) {
                    zs0.h = textSize;
                    zs0.j(false);
                }
                int gravity = this.A.getGravity();
                int i10 = (gravity & -113) | 48;
                if (zs0.g != i10) {
                    zs0.g = i10;
                    zs0.j(false);
                }
                if (zs0.f != gravity) {
                    zs0.f = gravity;
                    zs0.j(false);
                }
                Rect d = d(rect);
                int i11 = d.left;
                int i12 = d.top;
                int i13 = d.right;
                int i14 = d.bottom;
                Rect rect2 = zs0.d;
                if (!(rect2.left == i11 && rect2.top == i12 && rect2.right == i13 && rect2.bottom == i14)) {
                    rect2.set(i11, i12, i13, i14);
                    zs0.N = true;
                }
                if (this.A != null) {
                    if (getHintMaxLines() == 1) {
                        textPaint.setTextSize(zs0.h);
                        textPaint.setTypeface(zs0.v);
                        textPaint.setLetterSpacing(zs0.X);
                        f = -textPaint.ascent();
                    } else {
                        textPaint.setTextSize(zs0.h);
                        textPaint.setTypeface(zs0.v);
                        textPaint.setLetterSpacing(zs0.X);
                        f = ((float) zs0.l) * (textPaint.descent() + (-textPaint.ascent()));
                    }
                    int compoundPaddingLeft = this.A.getCompoundPaddingLeft() + rect.left;
                    Rect rect3 = this.w0;
                    rect3.left = compoundPaddingLeft;
                    if (this.o0 != 1 || this.A.getMinLines() > 1) {
                        if (this.o0 != 0 || getHintMaxLines() == 1) {
                            i7 = 0;
                        } else {
                            textPaint.setTextSize(zs0.h);
                            textPaint.setTypeface(zs0.v);
                            textPaint.setLetterSpacing(zs0.X);
                            i7 = (int) ((-textPaint.ascent()) / 2.0f);
                        }
                        i5 = (this.A.getCompoundPaddingTop() + rect.top) - i7;
                    } else {
                        i5 = (int) (((float) rect.centerY()) - (f / 2.0f));
                    }
                    rect3.top = i5;
                    rect3.right = rect.right - this.A.getCompoundPaddingRight();
                    if (this.o0 != 1 || this.A.getMinLines() > 1) {
                        i6 = rect.bottom - this.A.getCompoundPaddingBottom();
                    } else {
                        i6 = (int) (((float) rect3.top) + f);
                    }
                    rect3.bottom = i6;
                    int i15 = rect3.left;
                    int i16 = rect3.top;
                    int i17 = rect3.right;
                    Rect rect4 = zs0.c;
                    if (!(rect4.left == i15 && rect4.top == i16 && rect4.right == i17 && rect4.bottom == i6 && true == zs0.k0)) {
                        rect4.set(i15, i16, i17, i6);
                        zs0.N = true;
                        zs0.k0 = true;
                    }
                    zs0.j(false);
                    if (g() && !this.R0) {
                        l();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        float f;
        boolean z2;
        float f2;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z3 = this.Y0;
        p42 p42 = this.y;
        if (!z3) {
            p42.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.Y0 = true;
        }
        if (!(this.Q == null || (editText = this.A) == null)) {
            this.Q.setGravity(editText.getGravity());
            this.Q.setPadding(this.A.getCompoundPaddingLeft(), this.A.getCompoundPaddingTop(), this.A.getCompoundPaddingRight(), this.A.getCompoundPaddingBottom());
        }
        p42.m();
        if (getHintMaxLines() != 1) {
            int measuredWidth = (this.A.getMeasuredWidth() - this.A.getCompoundPaddingLeft()) - this.A.getCompoundPaddingRight();
            zs0 zs0 = this.S0;
            TextPaint textPaint = zs0.P;
            textPaint.setTextSize(zs0.i);
            textPaint.setTypeface(zs0.s);
            textPaint.setLetterSpacing(zs0.W);
            float f3 = (float) measuredWidth;
            zs0.i0 = zs0.e(zs0.f0, textPaint, zs0.B, (zs0.i / zs0.h) * f3, zs0.D).getHeight();
            textPaint.setTextSize(zs0.h);
            textPaint.setTypeface(zs0.v);
            textPaint.setLetterSpacing(zs0.X);
            zs0.j0 = zs0.e(zs0.e0, textPaint, zs0.B, f3, zs0.D).getHeight();
            EditText editText2 = this.A;
            Rect rect = this.v0;
            pq1.a(this, editText2, rect);
            Rect d = d(rect);
            int i3 = d.left;
            int i4 = d.top;
            int i5 = d.right;
            int i6 = d.bottom;
            Rect rect2 = zs0.d;
            if (!(rect2.left == i3 && rect2.top == i4 && rect2.right == i5 && rect2.bottom == i6)) {
                rect2.set(i3, i4, i5, i6);
                zs0.N = true;
            }
            v();
            a();
            if (this.A != null) {
                int i7 = zs0.j0;
                if (i7 != -1) {
                    f = (float) i7;
                } else {
                    TextPaint textPaint2 = zs0.P;
                    textPaint2.setTextSize(zs0.h);
                    textPaint2.setTypeface(zs0.v);
                    textPaint2.setLetterSpacing(zs0.X);
                    f = -textPaint2.ascent();
                }
                float f4 = 0.0f;
                if (this.O != null) {
                    TextPaint textPaint3 = new TextPaint(129);
                    textPaint3.set(this.Q.getPaint());
                    textPaint3.setTextSize(this.Q.getTextSize());
                    textPaint3.setTypeface(this.Q.getTypeface());
                    textPaint3.setLetterSpacing(this.Q.getLetterSpacing());
                    try {
                        r37 r37 = new r37(this.O, textPaint3, measuredWidth);
                        if (getLayoutDirection() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        r37.k = z2;
                        r37.j = true;
                        float lineSpacingExtra = this.Q.getLineSpacingExtra();
                        float lineSpacingMultiplier = this.Q.getLineSpacingMultiplier();
                        r37.g = lineSpacingExtra;
                        r37.h = lineSpacingMultiplier;
                        r37.m = new c9(17, this);
                        StaticLayout a = r37.a();
                        if (this.o0 == 1) {
                            f2 = zs0.f() + ((float) this.p0) + ((float) this.z);
                        } else {
                            f2 = 0.0f;
                        }
                        f4 = ((float) a.getHeight()) + f2;
                    } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
                        StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException staticLayoutBuilderCompat$StaticLayoutBuilderCompatException = e;
                        Log.e("TextInputLayout", staticLayoutBuilderCompat$StaticLayoutBuilderCompatException.getCause().getMessage(), staticLayoutBuilderCompat$StaticLayoutBuilderCompatException);
                    }
                }
                float max = Math.max(f, f4);
                if (((float) this.A.getMeasuredHeight()) < max) {
                    this.A.setMinimumHeight(Math.round(max));
                }
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qf7)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qf7 qf7 = (qf7) parcelable;
        super.onRestoreInstanceState(qf7.w);
        setError(qf7.y);
        if (qf7.z) {
            post(new ge(15, (Object) this));
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [rq6, java.lang.Object] */
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        if (z2 != this.m0) {
            z71 z71 = this.l0.e;
            RectF rectF = this.x0;
            float a = z71.a(rectF);
            float a2 = this.l0.f.a(rectF);
            float a3 = this.l0.h.a(rectF);
            float a4 = this.l0.g.a(rectF);
            rq6 rq6 = this.l0;
            h49 h49 = rq6.a;
            h49 h492 = rq6.b;
            h49 h493 = rq6.d;
            h49 h494 = rq6.c;
            g22 g22 = new g22(0);
            g22 g222 = new g22(0);
            g22 g223 = new g22(0);
            g22 g224 = new g22(0);
            a0 a0Var = new a0(a2);
            a0 a0Var2 = new a0(a);
            a0 a0Var3 = new a0(a4);
            a0 a0Var4 = new a0(a3);
            ? obj = new Object();
            obj.a = h492;
            obj.b = h49;
            obj.c = h493;
            obj.d = h494;
            obj.e = a0Var;
            obj.f = a0Var2;
            obj.g = a0Var4;
            obj.h = a0Var3;
            obj.i = g22;
            obj.j = g222;
            obj.k = g223;
            obj.l = g224;
            this.m0 = z2;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [qf7, android.os.Parcelable, x] */
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ? xVar = new x(super.onSaveInstanceState());
        if (o()) {
            xVar.y = getError();
        }
        p42 p42 = this.y;
        if (p42.E == 0 || !p42.C.z) {
            z2 = false;
        } else {
            z2 = true;
        }
        xVar.z = z2;
        return xVar;
    }

    public final void p(Editable editable) {
        int i;
        boolean z2;
        int i2;
        k80 k80;
        ((kj6) this.K).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z3 = this.J;
        int i3 = this.I;
        String str = null;
        if (i3 == -1) {
            this.L.setText(String.valueOf(i));
            this.L.setContentDescription((CharSequence) null);
            this.J = false;
        } else {
            if (i > i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.J = z2;
            Context context = getContext();
            gq gqVar = this.L;
            int i4 = this.I;
            if (this.J) {
                i2 = R.string.character_counter_overflowed_content_description;
            } else {
                i2 = R.string.character_counter_content_description;
            }
            gqVar.setContentDescription(context.getString(i2, new Object[]{Integer.valueOf(i), Integer.valueOf(i4)}));
            if (z3 != this.J) {
                q();
            }
            String str2 = k80.b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                k80 = k80.e;
            } else {
                k80 = k80.d;
            }
            gq gqVar2 = this.L;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.I)});
            k80.getClass();
            v70 v70 = vd7.a;
            if (string != null) {
                str = k80.c(string).toString();
            }
            gqVar2.setText(str);
        }
        if (this.A != null && z3 != this.J) {
            w(false, false);
            z();
            t();
        }
    }

    public final void q() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        gq gqVar = this.L;
        if (gqVar != null) {
            if (this.J) {
                i = this.M;
            } else {
                i = this.N;
            }
            n(gqVar, i);
            if (!this.J && (colorStateList2 = this.V) != null) {
                this.L.setTextColor(colorStateList2);
            }
            if (this.J && (colorStateList = this.W) != null) {
                this.L.setTextColor(colorStateList);
            }
        }
    }

    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.a0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue I2 = gw8.I(context, R.attr.colorControlActivated);
            if (I2 != null) {
                int i = I2.resourceId;
                if (i != 0) {
                    colorStateList2 = ag8.r(context, i);
                } else {
                    int i2 = I2.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.A;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = this.A.getTextCursorDrawable().mutate();
            if ((o() || (this.L != null && this.J)) && (colorStateList = this.b0) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d  */
    public final boolean s() {
        boolean z2;
        p42 p42;
        if (this.A == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            r27 r27 = this.x;
            if (r27.getMeasuredWidth() > 0) {
                int measuredWidth = r27.getMeasuredWidth() - this.A.getPaddingLeft();
                if (this.z0 == null || this.A0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.z0 = colorDrawable;
                    this.A0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.A.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.z0;
                if (drawable != colorDrawable2) {
                    this.A.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z2 = true;
                    p42 = this.y;
                    if ((p42.e() || ((p42.E != 0 && p42.d()) || p42.L != null)) && p42.getMeasuredWidth() > 0) {
                        int measuredWidth2 = p42.M.getMeasuredWidth() - this.A.getPaddingRight();
                        if (p42.e()) {
                            checkableImageButton = p42.y;
                        } else if (p42.E != 0 && p42.d()) {
                            checkableImageButton = p42.C;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        Drawable[] compoundDrawablesRelative2 = this.A.getCompoundDrawablesRelative();
                        ColorDrawable colorDrawable3 = this.C0;
                        if (colorDrawable3 == null || this.D0 == measuredWidth2) {
                            if (colorDrawable3 == null) {
                                ColorDrawable colorDrawable4 = new ColorDrawable();
                                this.C0 = colorDrawable4;
                                this.D0 = measuredWidth2;
                                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                            }
                            Drawable drawable2 = compoundDrawablesRelative2[2];
                            ColorDrawable colorDrawable5 = this.C0;
                            if (drawable2 != colorDrawable5) {
                                this.E0 = drawable2;
                                this.A.setCompoundDrawablesRelative(compoundDrawablesRelative2[0], compoundDrawablesRelative2[1], colorDrawable5, compoundDrawablesRelative2[3]);
                                return true;
                            }
                        } else {
                            this.D0 = measuredWidth2;
                            colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                            this.A.setCompoundDrawablesRelative(compoundDrawablesRelative2[0], compoundDrawablesRelative2[1], this.C0, compoundDrawablesRelative2[3]);
                            return true;
                        }
                    } else if (this.C0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.A.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.C0) {
                            this.A.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.E0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.C0 = null;
                        return z3;
                    }
                    return z2;
                }
                z2 = false;
                p42 = this.y;
                if ((p42.e() || ((p42.E != 0 && p42.d()) || p42.L != null)) && p42.getMeasuredWidth() > 0) {
                }
                return z2;
            }
        }
        if (this.z0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.A.getCompoundDrawablesRelative();
            this.A.setCompoundDrawablesRelative((Drawable) null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.z0 = null;
            z2 = true;
            p42 = this.y;
            if ((p42.e() || ((p42.E != 0 && p42.d()) || p42.L != null)) && p42.getMeasuredWidth() > 0) {
            }
            return z2;
        }
        z2 = false;
        p42 = this.y;
        if ((p42.e() || ((p42.E != 0 && p42.d()) || p42.L != null)) && p42.getMeasuredWidth() > 0) {
        }
        return z2;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            this.L0 = i;
            this.N0 = i;
            this.O0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.L0 = defaultColor;
        this.u0 = defaultColor;
        this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.N0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.O0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.o0) {
            this.o0 = i;
            if (this.A != null) {
                k();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.p0 = i;
    }

    public void setBoxCornerFamily(int i) {
        qq6 f = this.l0.f();
        z71 z71 = this.l0.e;
        f.a = rc9.B(i);
        f.e = z71;
        z71 z712 = this.l0.f;
        f.b = rc9.B(i);
        f.f = z712;
        z71 z713 = this.l0.h;
        f.d = rc9.B(i);
        f.h = z713;
        z71 z714 = this.l0.g;
        f.c = rc9.B(i);
        f.g = z714;
        this.l0 = f.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.J0 != i) {
            this.J0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.H0 = colorStateList.getDefaultColor();
            this.P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.I0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.J0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.J0 != colorStateList.getDefaultColor()) {
            this.J0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.r0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.s0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.H != z2) {
            ra3 ra3 = this.G;
            Editable editable = null;
            if (z2) {
                gq gqVar = new gq(getContext(), (AttributeSet) null);
                this.L = gqVar;
                gqVar.setId(R.id.textinput_counter);
                Typeface typeface = this.y0;
                if (typeface != null) {
                    this.L.setTypeface(typeface);
                }
                this.L.setMaxLines(1);
                ra3.a(this.L, 2);
                ((ViewGroup.MarginLayoutParams) this.L.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.L != null) {
                    EditText editText = this.A;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    p(editable);
                }
            } else {
                ra3.g(this.L, 2);
                this.L = null;
            }
            this.H = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable editable;
        if (this.I != i) {
            if (i > 0) {
                this.I = i;
            } else {
                this.I = -1;
            }
            if (this.H && this.L != null) {
                EditText editText = this.A;
                if (editText == null) {
                    editable = null;
                } else {
                    editable = editText.getText();
                }
                p(editable);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.M != i) {
            this.M = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.N != i) {
            this.N = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.b0 != colorStateList) {
            this.b0 = colorStateList;
            if (o() || (this.L != null && this.J)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.F0 = colorStateList;
        this.G0 = colorStateList;
        if (this.A != null) {
            w(false, false);
        }
    }

    public void setEnabled(boolean z2) {
        m(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.y.C.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.y.C.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        CharSequence charSequence;
        p42 p42 = this.y;
        if (i != 0) {
            charSequence = p42.getResources().getText(i);
        } else {
            charSequence = null;
        }
        CheckableImageButton checkableImageButton = p42.C;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        p42 p42 = this.y;
        if (i != 0) {
            drawable = rc9.N(p42.getContext(), i);
        } else {
            drawable = null;
        }
        TextInputLayout textInputLayout = p42.w;
        CheckableImageButton checkableImageButton = p42.C;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            t49.p(textInputLayout, checkableImageButton, p42.G, p42.H);
            t49.X(textInputLayout, checkableImageButton, p42.G);
        }
    }

    public void setEndIconMinSize(int i) {
        p42 p42 = this.y;
        if (i < 0) {
            p42.getClass();
            h.q("endIconSize cannot be less than 0");
        } else if (i != p42.I) {
            p42.I = i;
            CheckableImageButton checkableImageButton = p42.C;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = p42.y;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.y.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p42 p42 = this.y;
        CheckableImageButton checkableImageButton = p42.C;
        View.OnLongClickListener onLongClickListener = p42.K;
        checkableImageButton.setOnClickListener(onClickListener);
        t49.a0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p42 p42 = this.y;
        p42.K = onLongClickListener;
        CheckableImageButton checkableImageButton = p42.C;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t49.a0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p42 p42 = this.y;
        p42.J = scaleType;
        p42.C.setScaleType(scaleType);
        p42.y.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p42 p42 = this.y;
        if (p42.G != colorStateList) {
            p42.G = colorStateList;
            t49.p(p42.w, p42.C, colorStateList, p42.H);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p42 p42 = this.y;
        if (p42.H != mode) {
            p42.H = mode;
            t49.p(p42.w, p42.C, p42.G, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.y.h(z2);
    }

    public void setError(CharSequence charSequence) {
        ra3 ra3 = this.G;
        if (!ra3.q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            ra3.c();
            ra3.p = charSequence;
            ra3.r.setText(charSequence);
            int i = ra3.n;
            if (i != 1) {
                ra3.o = 1;
            }
            ra3.i(i, ra3.o, ra3.h(ra3.r, charSequence));
            return;
        }
        ra3.f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        ra3 ra3 = this.G;
        ra3.t = i;
        gq gqVar = ra3.r;
        if (gqVar != null) {
            gqVar.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        ra3 ra3 = this.G;
        ra3.s = charSequence;
        gq gqVar = ra3.r;
        if (gqVar != null) {
            gqVar.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        ra3 ra3 = this.G;
        TextInputLayout textInputLayout = ra3.h;
        if (ra3.q != z2) {
            ra3.c();
            if (z2) {
                gq gqVar = new gq(ra3.g, (AttributeSet) null);
                ra3.r = gqVar;
                gqVar.setId(R.id.textinput_error);
                ra3.r.setTextAlignment(5);
                Typeface typeface = ra3.B;
                if (typeface != null) {
                    ra3.r.setTypeface(typeface);
                }
                int i = ra3.u;
                ra3.u = i;
                gq gqVar2 = ra3.r;
                if (gqVar2 != null) {
                    ra3.h.n(gqVar2, i);
                }
                ColorStateList colorStateList = ra3.v;
                ra3.v = colorStateList;
                gq gqVar3 = ra3.r;
                if (!(gqVar3 == null || colorStateList == null)) {
                    gqVar3.setTextColor(colorStateList);
                }
                CharSequence charSequence = ra3.s;
                ra3.s = charSequence;
                gq gqVar4 = ra3.r;
                if (gqVar4 != null) {
                    gqVar4.setContentDescription(charSequence);
                }
                int i2 = ra3.t;
                ra3.t = i2;
                gq gqVar5 = ra3.r;
                if (gqVar5 != null) {
                    gqVar5.setAccessibilityLiveRegion(i2);
                }
                ra3.r.setVisibility(4);
                ra3.a(ra3.r, 0);
            } else {
                ra3.f();
                ra3.g(ra3.r, 0);
                ra3.r = null;
                textInputLayout.t();
                textInputLayout.z();
            }
            ra3.q = z2;
        }
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        p42 p42 = this.y;
        if (i != 0) {
            drawable = rc9.N(p42.getContext(), i);
        } else {
            drawable = null;
        }
        p42.i(drawable);
        t49.X(p42.w, p42.y, p42.z);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p42 p42 = this.y;
        CheckableImageButton checkableImageButton = p42.y;
        View.OnLongClickListener onLongClickListener = p42.B;
        checkableImageButton.setOnClickListener(onClickListener);
        t49.a0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p42 p42 = this.y;
        p42.B = onLongClickListener;
        CheckableImageButton checkableImageButton = p42.y;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t49.a0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p42 p42 = this.y;
        if (p42.z != colorStateList) {
            p42.z = colorStateList;
            t49.p(p42.w, p42.y, colorStateList, p42.A);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p42 p42 = this.y;
        if (p42.A != mode) {
            p42.A = mode;
            t49.p(p42.w, p42.y, p42.z, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        ra3 ra3 = this.G;
        ra3.u = i;
        gq gqVar = ra3.r;
        if (gqVar != null) {
            ra3.h.n(gqVar, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        ra3 ra3 = this.G;
        ra3.v = colorStateList;
        gq gqVar = ra3.r;
        if (gqVar != null && colorStateList != null) {
            gqVar.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.T0 != z2) {
            this.T0 = z2;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ra3 ra3 = this.G;
        if (!isEmpty) {
            if (!ra3.x) {
                setHelperTextEnabled(true);
            }
            ra3.c();
            ra3.w = charSequence;
            ra3.y.setText(charSequence);
            int i = ra3.n;
            if (i != 2) {
                ra3.o = 2;
            }
            ra3.i(i, ra3.o, ra3.h(ra3.y, charSequence));
        } else if (ra3.x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        ra3 ra3 = this.G;
        ra3.A = colorStateList;
        gq gqVar = ra3.y;
        if (gqVar != null && colorStateList != null) {
            gqVar.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        ra3 ra3 = this.G;
        TextInputLayout textInputLayout = ra3.h;
        if (ra3.x != z2) {
            ra3.c();
            if (z2) {
                gq gqVar = new gq(ra3.g, (AttributeSet) null);
                ra3.y = gqVar;
                gqVar.setId(R.id.textinput_helper_text);
                ra3.y.setTextAlignment(5);
                Typeface typeface = ra3.B;
                if (typeface != null) {
                    ra3.y.setTypeface(typeface);
                }
                ra3.y.setVisibility(4);
                ra3.y.setAccessibilityLiveRegion(1);
                int i = ra3.z;
                ra3.z = i;
                gq gqVar2 = ra3.y;
                if (gqVar2 != null) {
                    gqVar2.setTextAppearance(i);
                }
                ColorStateList colorStateList = ra3.A;
                ra3.A = colorStateList;
                gq gqVar3 = ra3.y;
                if (!(gqVar3 == null || colorStateList == null)) {
                    gqVar3.setTextColor(colorStateList);
                }
                ra3.a(ra3.y, 1);
                ra3.y.setAccessibilityDelegate(new qa3(ra3));
            } else {
                ra3.c();
                int i2 = ra3.n;
                if (i2 == 2) {
                    ra3.o = 0;
                }
                ra3.i(i2, ra3.o, ra3.h(ra3.y, ""));
                ra3.g(ra3.y, 1);
                ra3.y = null;
                textInputLayout.t();
                textInputLayout.z();
            }
            ra3.x = z2;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        ra3 ra3 = this.G;
        ra3.z = i;
        gq gqVar = ra3.y;
        if (gqVar != null) {
            gqVar.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.U0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.c0) {
            this.c0 = z2;
            if (!z2) {
                this.e0 = false;
                if (!TextUtils.isEmpty(this.d0) && TextUtils.isEmpty(this.A.getHint())) {
                    this.A.setHint(this.d0);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.A.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.d0)) {
                        setHint(hint);
                    }
                    this.A.setHint((CharSequence) null);
                }
                this.e0 = true;
            }
            if (this.A != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        zs0 zs0 = this.S0;
        if (i != zs0.f0) {
            zs0.f0 = i;
            zs0.j(false);
        }
        if (i != zs0.e0) {
            zs0.e0 = i;
            zs0.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        zs0 zs0 = this.S0;
        TextInputLayout textInputLayout = zs0.a;
        sc7 sc7 = new sc7(textInputLayout.getContext(), i);
        ColorStateList colorStateList = sc7.k;
        if (colorStateList != null) {
            zs0.k = colorStateList;
        }
        float f = sc7.l;
        if (f != 0.0f) {
            zs0.i = f;
        }
        ColorStateList colorStateList2 = sc7.a;
        if (colorStateList2 != null) {
            zs0.V = colorStateList2;
        }
        zs0.T = sc7.f;
        zs0.U = sc7.g;
        zs0.S = sc7.h;
        zs0.W = sc7.j;
        hk0 hk0 = zs0.z;
        if (hk0 != null) {
            hk0.e = true;
        }
        ns8 ns8 = new ns8(10, (Object) zs0);
        sc7.a();
        zs0.z = new hk0(ns8, sc7.p);
        sc7.b(textInputLayout.getContext(), zs0.z);
        zs0.j(false);
        this.G0 = zs0.k;
        if (this.A != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            if (this.F0 == null) {
                zs0 zs0 = this.S0;
                if (zs0.k != colorStateList) {
                    zs0.k = colorStateList;
                    zs0.j(false);
                }
            }
            this.G0 = colorStateList;
            if (this.A != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(pf7 pf7) {
        this.K = pf7;
    }

    public void setMaxEms(int i) {
        this.D = i;
        EditText editText = this.A;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.F = i;
        EditText editText = this.A;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.C = i;
        EditText editText = this.A;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.E = i;
        EditText editText = this.A;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        p42 p42 = this.y;
        if (i != 0) {
            charSequence = p42.getResources().getText(i);
        } else {
            charSequence = null;
        }
        p42.C.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        p42 p42 = this.y;
        if (i != 0) {
            drawable = rc9.N(p42.getContext(), i);
        } else {
            drawable = null;
        }
        p42.C.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        p42 p42 = this.y;
        if (z2 && p42.E != 1) {
            p42.g(1);
        } else if (!z2) {
            p42.g(0);
        } else {
            p42.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p42 p42 = this.y;
        p42.G = colorStateList;
        t49.p(p42.w, p42.C, colorStateList, p42.H);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p42 p42 = this.y;
        p42.H = mode;
        t49.p(p42.w, p42.C, p42.G, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.Q == null) {
            gq gqVar = new gq(getContext(), (AttributeSet) null);
            this.Q = gqVar;
            gqVar.setId(R.id.textinput_placeholder);
            this.Q.setImportantForAccessibility(1);
            this.Q.setAccessibilityLiveRegion(1);
            fb2 f = f();
            this.T = f;
            f.x = 67;
            this.U = f();
            setPlaceholderTextAppearance(this.S);
            setPlaceholderTextColor(this.R);
            e58.m(this.Q, new gg4(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.P) {
                setPlaceholderTextEnabled(true);
            }
            this.O = charSequence;
        }
        EditText editText = this.A;
        if (editText != null) {
            editable = editText.getText();
        }
        x(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.S = i;
        gq gqVar = this.Q;
        if (gqVar != null) {
            gqVar.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            gq gqVar = this.Q;
            if (gqVar != null && colorStateList != null) {
                gqVar.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        r27 r27 = this.x;
        r27.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        r27.y = charSequence2;
        r27.x.setText(charSequence);
        r27.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.x.x.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.x.x.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(rq6 rq6) {
        ug4 ug4 = this.f0;
        if (ug4 != null && ug4.x.a != rq6) {
            this.l0 = rq6;
            c();
        }
    }

    public void setStartIconCheckable(boolean z2) {
        this.x.z.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = rc9.N(getContext(), i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(int i) {
        r27 r27 = this.x;
        if (i < 0) {
            r27.getClass();
            h.q("startIconSize cannot be less than 0");
        } else if (i != r27.C) {
            r27.C = i;
            CheckableImageButton checkableImageButton = r27.z;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        r27 r27 = this.x;
        CheckableImageButton checkableImageButton = r27.z;
        View.OnLongClickListener onLongClickListener = r27.E;
        checkableImageButton.setOnClickListener(onClickListener);
        t49.a0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r27 r27 = this.x;
        r27.E = onLongClickListener;
        CheckableImageButton checkableImageButton = r27.z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t49.a0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        r27 r27 = this.x;
        r27.D = scaleType;
        r27.z.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        r27 r27 = this.x;
        if (r27.A != colorStateList) {
            r27.A = colorStateList;
            t49.p(r27.w, r27.z, colorStateList, r27.B);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        r27 r27 = this.x;
        if (r27.B != mode) {
            r27.B = mode;
            t49.p(r27.w, r27.z, r27.A, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.x.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        p42 p42 = this.y;
        p42.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        p42.L = charSequence2;
        p42.M.setText(charSequence);
        p42.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.y.M.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.y.M.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(of7 of7) {
        EditText editText = this.A;
        if (editText != null) {
            e58.m(editText, of7);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.y0) {
            this.y0 = typeface;
            this.S0.n(typeface);
            ra3 ra3 = this.G;
            if (typeface != ra3.B) {
                ra3.B = typeface;
                gq gqVar = ra3.r;
                if (gqVar != null) {
                    gqVar.setTypeface(typeface);
                }
                gq gqVar2 = ra3.y;
                if (gqVar2 != null) {
                    gqVar2.setTypeface(typeface);
                }
            }
            gq gqVar3 = this.L;
            if (gqVar3 != null) {
                gqVar3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        gq gqVar;
        EditText editText = this.A;
        if (editText != null && this.o0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = sz1.a;
            Drawable mutate = background.mutate();
            if (o()) {
                mutate.setColorFilter(yo.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.J || (gqVar = this.L) == null) {
                mutate.clearColorFilter();
                this.A.refreshDrawableState();
            } else {
                mutate.setColorFilter(yo.c(gqVar.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void u() {
        EditText editText = this.A;
        if (editText != null && this.f0 != null) {
            if ((this.i0 || editText.getBackground() == null) && this.o0 != 0) {
                this.A.setBackground(getEditTextBoxBackground());
                this.i0 = true;
            }
        }
    }

    public final void v() {
        if (this.o0 != 1) {
            FrameLayout frameLayout = this.w;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e = e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        ColorStateList colorStateList;
        gq gqVar;
        ColorStateList colorStateList2;
        boolean isEnabled = isEnabled();
        EditText editText = this.A;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z4 = false;
        } else {
            z4 = true;
        }
        EditText editText2 = this.A;
        if (editText2 == null || !editText2.hasFocus()) {
            z5 = false;
        } else {
            z5 = true;
        }
        ColorStateList colorStateList3 = this.F0;
        zs0 zs0 = this.S0;
        if (colorStateList3 != null) {
            zs0.k(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.F0;
            int i = this.P0;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, i);
            }
            zs0.k(ColorStateList.valueOf(i));
        } else if (o()) {
            gq gqVar2 = this.G.r;
            if (gqVar2 != null) {
                colorStateList2 = gqVar2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            zs0.k(colorStateList2);
        } else if (this.J && (gqVar = this.L) != null) {
            zs0.k(gqVar.getTextColors());
        } else if (!(!z5 || (colorStateList = this.G0) == null || zs0.k == colorStateList)) {
            zs0.k = colorStateList;
            zs0.j(false);
        }
        p42 p42 = this.y;
        r27 r27 = this.x;
        if (z4 || !this.T0 || (isEnabled() && z5)) {
            if (z3 || this.R0) {
                ValueAnimator valueAnimator = this.V0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.V0.cancel();
                }
                if (!z2 || !this.U0) {
                    zs0.m(1.0f);
                } else {
                    b(1.0f);
                }
                this.R0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.A;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                x(editable);
                r27.F = false;
                r27.e();
                p42.N = false;
                p42.n();
            }
        } else if (z3 || !this.R0) {
            ValueAnimator valueAnimator2 = this.V0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.V0.cancel();
            }
            if (!z2 || !this.U0) {
                zs0.m(0.0f);
            } else {
                b(0.0f);
            }
            if (g() && !((dd1) this.f0).c0.r.isEmpty() && g()) {
                ((dd1) this.f0).t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.R0 = true;
            gq gqVar3 = this.Q;
            if (gqVar3 != null && this.P) {
                gqVar3.setText((CharSequence) null);
                tm7.a(this.w, this.U);
                this.Q.setVisibility(4);
            }
            r27.F = true;
            r27.e();
            p42.N = true;
            p42.n();
        }
    }

    public final void x(Editable editable) {
        int i;
        ((kj6) this.K).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.w;
        if (i != 0 || this.R0) {
            gq gqVar = this.Q;
            if (gqVar != null && this.P) {
                gqVar.setText((CharSequence) null);
                tm7.a(frameLayout, this.U);
                this.Q.setVisibility(4);
            }
        } else if (this.Q != null && this.P && !TextUtils.isEmpty(this.O)) {
            this.Q.setText(this.O);
            tm7.a(frameLayout, this.T);
            this.Q.setVisibility(0);
            this.Q.bringToFront();
        }
    }

    public final void y(boolean z2, boolean z3) {
        int defaultColor = this.K0.getDefaultColor();
        int colorForState = this.K0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.K0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.t0 = colorForState2;
        } else if (z3) {
            this.t0 = colorForState;
        } else {
            this.t0 = defaultColor;
        }
    }

    public final void z() {
        boolean z2;
        gq gqVar;
        EditText editText;
        EditText editText2;
        if (this.f0 != null && this.o0 != 0) {
            boolean z3 = false;
            if (isFocused() || ((editText2 = this.A) != null && editText2.hasFocus())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (isHovered() || ((editText = this.A) != null && editText.isHovered())) {
                z3 = true;
            }
            if (!isEnabled()) {
                this.t0 = this.P0;
            } else if (o()) {
                if (this.K0 != null) {
                    y(z2, z3);
                } else {
                    this.t0 = getErrorCurrentTextColors();
                }
            } else if (!this.J || (gqVar = this.L) == null) {
                if (z2) {
                    this.t0 = this.J0;
                } else if (z3) {
                    this.t0 = this.I0;
                } else {
                    this.t0 = this.H0;
                }
            } else if (this.K0 != null) {
                y(z2, z3);
            } else {
                this.t0 = gqVar.getCurrentTextColor();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            p42 p42 = this.y;
            TextInputLayout textInputLayout = p42.w;
            CheckableImageButton checkableImageButton = p42.C;
            TextInputLayout textInputLayout2 = p42.w;
            p42.l();
            t49.X(textInputLayout2, p42.y, p42.z);
            t49.X(textInputLayout2, checkableImageButton, p42.G);
            if (p42.b() instanceof n02) {
                if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                    t49.p(textInputLayout, checkableImageButton, p42.G, p42.H);
                } else {
                    Drawable mutate = checkableImageButton.getDrawable().mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton.setImageDrawable(mutate);
                }
            }
            r27 r27 = this.x;
            t49.X(r27.w, r27.z, r27.A);
            if (this.o0 == 2) {
                int i = this.q0;
                if (!z2 || !isEnabled()) {
                    this.q0 = this.r0;
                } else {
                    this.q0 = this.s0;
                }
                if (this.q0 != i && g() && !this.R0) {
                    if (g()) {
                        ((dd1) this.f0).t(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    l();
                }
            }
            if (this.o0 == 1) {
                if (!isEnabled()) {
                    this.u0 = this.M0;
                } else if (z3 && !z2) {
                    this.u0 = this.O0;
                } else if (z2) {
                    this.u0 = this.N0;
                } else {
                    this.u0 = this.L0;
                }
            }
            c();
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.c0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.x.z;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.x.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.y.C.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.y.C.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.y.C;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.y.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        p42 p42 = this.y;
        TextInputLayout textInputLayout = p42.w;
        CheckableImageButton checkableImageButton = p42.C;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            t49.p(textInputLayout, checkableImageButton, p42.G, p42.H);
            t49.X(textInputLayout, checkableImageButton, p42.G);
        }
    }
}
