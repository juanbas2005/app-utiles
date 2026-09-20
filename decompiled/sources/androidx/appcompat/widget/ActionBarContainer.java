package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ActionBarContainer extends FrameLayout {
    public Drawable A;
    public Drawable B;
    public final boolean C;
    public boolean D;
    public final int E;
    public boolean w;
    public View x;
    public View y;
    public Drawable z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new q7(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qv5.a);
        boolean z2 = false;
        this.z = obtainStyledAttributes.getDrawable(0);
        this.A = obtainStyledAttributes.getDrawable(2);
        this.E = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.C = true;
            this.B = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.C ? this.z == null && this.A == null : this.B == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.z;
        if (drawable != null && drawable.isStateful()) {
            this.z.setState(getDrawableState());
        }
        Drawable drawable2 = this.A;
        if (drawable2 != null && drawable2.isStateful()) {
            this.A.setState(getDrawableState());
        }
        Drawable drawable3 = this.B;
        if (drawable3 != null && drawable3.isStateful()) {
            this.B.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.z;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.B;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.x = findViewById(R.id.action_bar);
        this.y = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.w || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        boolean z3 = true;
        if (this.C) {
            Drawable drawable = this.B;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.z == null) {
                z3 = false;
            } else if (this.x.getVisibility() == 0) {
                this.z.setBounds(this.x.getLeft(), this.x.getTop(), this.x.getRight(), this.x.getBottom());
            } else {
                View view = this.y;
                if (view == null || view.getVisibility() != 0) {
                    this.z.setBounds(0, 0, 0, 0);
                } else {
                    this.z.setBounds(this.y.getLeft(), this.y.getTop(), this.y.getRight(), this.y.getBottom());
                }
            }
            this.D = false;
        }
        if (z3) {
            invalidate();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.x == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.E) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.x != null) {
            View.MeasureSpec.getMode(i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.z;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.z);
        }
        this.z = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.x;
            if (view != null) {
                this.z.setBounds(view.getLeft(), this.x.getTop(), this.x.getRight(), this.x.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.C ? this.z == null && this.A == null : this.B == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.B;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.B);
        }
        this.B = drawable;
        boolean z2 = this.C;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.B) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? this.z == null && this.A == null : this.B == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.A);
        }
        this.A = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.D && this.A != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.C ? this.z == null && this.A == null : this.B == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        int i;
        this.w = z2;
        if (z2) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i) {
        boolean z2;
        super.setVisibility(i);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.z;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.A;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.B;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.z;
        boolean z2 = this.C;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.A && this.D) {
            return true;
        }
        if ((drawable != this.B || !z2) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(ai6 ai6) {
    }
}
