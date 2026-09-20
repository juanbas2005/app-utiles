package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

@Deprecated
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class HideBottomViewOnScrollBehavior<V extends View> extends w61 {
    public final LinkedHashSet a = new LinkedHashSet();
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public int f = 0;
    public AccessibilityManager g;
    public rz2 h;
    public final boolean i = true;
    public int j = 2;
    public ViewPropertyAnimator k;

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = kl8.F(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = kl8.F(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = kl8.G(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jl.d);
        this.e = kl8.G(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jl.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null && this.h == null) {
            rz2 rz2 = new rz2(this, view, 0);
            this.h = rz2;
            accessibilityManager.addTouchExplorationStateChangeListener(rz2);
            view.addOnAttachStateChangeListener(new fg(5, this));
        }
        return false;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i2 > 0) {
            if (this.j != 1) {
                if (!this.i || (accessibilityManager = this.g) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.j = 1;
                    Iterator it = this.a.iterator();
                    if (!it.hasNext()) {
                        int i5 = this.f;
                        this.k = view.animate().translationY((float) i5).setInterpolator(this.e).setDuration((long) this.c).setListener(new s7(3, (Object) this));
                        return;
                    }
                    throw pb4.g(it);
                }
            }
        } else if (i2 < 0) {
            r(view);
        }
    }

    public boolean o(View view, int i2, int i3) {
        if (i2 == 2) {
            return true;
        }
        return false;
    }

    public final void r(View view) {
        if (this.j != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 2;
            Iterator it = this.a.iterator();
            if (!it.hasNext()) {
                this.k = view.animate().translationY(0.0f).setInterpolator(this.d).setDuration((long) this.b).setListener(new s7(3, (Object) this));
                return;
            }
            throw pb4.g(it);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
