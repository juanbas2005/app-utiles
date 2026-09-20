package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: im2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class im2 extends r64 {
    public Drawable L;
    public final Rect M = new Rect();
    public final Rect N = new Rect();
    public int O = 119;
    public final boolean P = true;
    public boolean Q = false;

    public im2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        gw8.l(context, attributeSet, 0, 0);
        int[] iArr = ov5.h;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        gw8.m(context2, attributeSet2, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, 0, 0);
        this.O = obtainStyledAttributes.getInt(1, this.O);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.P = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.L;
        if (drawable != null) {
            if (this.Q) {
                this.Q = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.P;
                Rect rect = this.M;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.O;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.N;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.L;
        if (drawable != null && drawable.isStateful()) {
            this.L.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.L;
    }

    public int getForegroundGravity() {
        return this.O;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.Q = z | this.Q;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Q = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.L);
            }
            this.L = drawable;
            this.Q = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.O == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.O != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.O = i;
            if (i == 119 && this.L != null) {
                this.L.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.L) {
            return true;
        }
        return false;
    }
}
