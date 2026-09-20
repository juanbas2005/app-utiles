package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import cu.lestebang.utiletecsa.R;

/* renamed from: e60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class e60 extends FrameLayout {
    public static final d60 E = new Object();
    public final int A;
    public final int B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public final rq6 w;
    public int x;
    public final float y;
    public final float z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ug4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    public e60(Context context, AttributeSet attributeSet) {
        super(rg3.F(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ov5.A);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation((float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.x = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.w = rq6.b(context2, attributeSet, 0, 0).a();
        }
        this.y = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(t49.L(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(ya5.n(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.z = obtainStyledAttributes.getFloat(1, 1.0f);
        this.A = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.B = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(E);
        setFocusable(true);
        if (getBackground() == null) {
            int G = h49.G(getBackgroundOverlayColorAlpha(), h49.z(this, R.attr.colorSurface), h49.z(this, R.attr.colorOnSurface));
            rq6 rq6 = this.w;
            if (rq6 != null) {
                int i = f60.a;
                ug4 ug4 = new ug4(rq6);
                ug4.n(ColorStateList.valueOf(G));
                gradientDrawable = ug4;
            } else {
                Resources resources = getResources();
                int i2 = f60.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(G);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.z;
    }

    public int getAnimationMode() {
        return this.x;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.y;
    }

    public int getMaxInlineActionWidth() {
        return this.B;
    }

    public int getMaxWidth() {
        return this.A;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.A;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.x = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.C == null)) {
            drawable = drawable.mutate();
            drawable.setTintList(this.C);
            drawable.setTintMode(this.D);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.D);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.D = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        d60 d60;
        if (onClickListener != null) {
            d60 = null;
        } else {
            d60 = E;
        }
        setOnTouchListener(d60);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(f60 f60) {
    }
}
