package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AppBarLayout$BaseBehavior<T> extends b68 {
    public boolean b;
    public int c = -1;
    public int d;
    public int e = -1;
    public VelocityTracker f;

    public AppBarLayout$BaseBehavior() {
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.e < 0) {
            this.e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            int i = this.c;
            if (!(i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1)) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.d) > this.e) {
                    this.d = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.c = -1;
        motionEvent.getX();
        motionEvent.getY();
        ku4.a();
        return false;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    public final boolean o(View view, int i, int i2) {
        throw new ClassCastException();
    }

    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062 A[RETURN] */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f.computeCurrentVelocity(1000);
                this.f.getYVelocity(this.c);
                view.getClass();
                ku4.a();
                return false;
            }
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.c);
            if (findPointerIndex != -1) {
                this.d = (int) motionEvent.getY(findPointerIndex);
                view.getClass();
                ku4.a();
                return false;
            }
            return false;
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                if (motionEvent.getActionIndex() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.c = motionEvent.getPointerId(i);
                this.d = (int) (motionEvent.getY(i) + 0.5f);
            }
            velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (this.b) {
                return false;
            }
            return true;
        }
        this.b = false;
        this.c = -1;
        VelocityTracker velocityTracker3 = this.f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f = null;
        }
        velocityTracker = this.f;
        if (velocityTracker != null) {
        }
        if (this.b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
