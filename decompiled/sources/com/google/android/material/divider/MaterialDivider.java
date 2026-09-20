package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class MaterialDivider extends View {
    public int A;
    public final ug4 w = new ug4();
    public int x;
    public int y;
    public int z;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(rg3.F(context, attributeSet, R.attr.materialDividerStyle, 2131887280), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        AttributeSet attributeSet2 = attributeSet;
        TypedArray F = gw8.F(context2, attributeSet2, ov5.p, R.attr.materialDividerStyle, 2131887280, new int[0]);
        this.x = F.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.z = F.getDimensionPixelOffset(2, 0);
        this.A = F.getDimensionPixelOffset(1, 0);
        setDividerColor(t49.L(context2, F, 0).getDefaultColor());
        F.recycle();
    }

    public int getDividerColor() {
        return this.y;
    }

    public int getDividerInsetEnd() {
        return this.A;
    }

    public int getDividerInsetStart() {
        return this.z;
    }

    public int getDividerThickness() {
        return this.x;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int width;
        int i2;
        super.onDraw(canvas);
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        if (z2) {
            i = this.A;
        } else {
            i = this.z;
        }
        if (z2) {
            width = getWidth();
            i2 = this.z;
        } else {
            width = getWidth();
            i2 = this.A;
        }
        int i3 = width - i2;
        ug4 ug4 = this.w;
        ug4.setBounds(i, 0, i3, getBottom() - getTop());
        ug4.draw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.x;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.y != i) {
            this.y = i;
            this.w.n(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.A = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.z = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.x != i) {
            this.x = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
