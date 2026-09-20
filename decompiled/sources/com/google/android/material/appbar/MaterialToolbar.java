package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] v0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer q0;
    public boolean r0;
    public boolean s0;
    public ImageView.ScaleType t0;
    public Boolean u0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(rg3.F(context, attributeSet, R.attr.toolbarStyle, 2131887323), attributeSet, 0);
        ColorStateList colorStateList;
        Context context2 = getContext();
        AttributeSet attributeSet2 = attributeSet;
        TypedArray F = gw8.F(context2, attributeSet2, ov5.v, R.attr.toolbarStyle, 2131887323, new int[0]);
        if (F.hasValue(2)) {
            setNavigationIconTint(F.getColor(2, -1));
        }
        this.r0 = F.getBoolean(4, false);
        this.s0 = F.getBoolean(3, false);
        int i = F.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = v0;
            if (i < scaleTypeArr.length) {
                this.t0 = scaleTypeArr[i];
            }
        }
        if (F.hasValue(0)) {
            this.u0 = Boolean.valueOf(F.getBoolean(0, false));
        }
        F.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateList = ColorStateList.valueOf(0);
        } else {
            colorStateList = we.q(background);
        }
        if (colorStateList != null) {
            ug4 ug4 = new ug4();
            ug4.n(colorStateList);
            ug4.k(context2);
            ug4.m(getElevation());
            setBackground(ug4);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.t0;
    }

    public Integer getNavigationIconTint() {
        return this.q0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof ug4) {
            rc9.S0(this, (ug4) background);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        super.onLayout(z, i, i2, i3, i4);
        a91 a91 = t49.e;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.r0 || this.s0) {
            ArrayList Q = t49.Q(this, getTitle());
            if (Q.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(Q, a91);
            }
            ArrayList Q2 = t49.Q(this, getSubtitle());
            if (Q2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(Q2, a91);
            }
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.r0 && textView != null) {
                    u(textView, pair);
                }
                if (this.s0 && textView2 != null) {
                    u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.u0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.t0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof ug4) {
            ((ug4) background).m(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.u0;
        if (bool == null || bool.booleanValue() != z) {
            this.u0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.t0 != scaleType) {
            this.t0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.q0 == null)) {
            drawable = drawable.mutate();
            drawable.setTint(this.q0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.q0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.s0 != z) {
            this.s0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.r0 != z) {
            this.r0 = z;
            requestLayout();
        }
    }

    public final void u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
