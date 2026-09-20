package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class HideViewOnScrollBehavior<V extends View> extends w61 {
    public r16 a;
    public AccessibilityManager b;
    public rz2 c;
    public final LinkedHashSet d = new LinkedHashSet();
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public int i = 0;
    public int j = 2;
    public ViewPropertyAnimator k;

    public HideViewOnScrollBehavior() {
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3;
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            rz2 rz2 = new rz2(this, view, 1);
            this.c = rz2;
            accessibilityManager.addTouchExplorationStateChangeListener(rz2);
            view.addOnAttachStateChangeListener(new fg(6, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i4 = ((z61) view.getLayoutParams()).c;
        if (i4 == 80 || i4 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i2);
            if (absoluteGravity == 3 || absoluteGravity == 19) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            r(i3);
        }
        this.i = this.a.S(view, marginLayoutParams);
        this.e = kl8.F(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = kl8.F(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = kl8.G(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jl.d);
        this.h = kl8.G(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, jl.c);
        return false;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        if (i2 > 0) {
            if (this.j != 1) {
                AccessibilityManager accessibilityManager = this.b;
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.j = 1;
                    Iterator it = this.d.iterator();
                    if (!it.hasNext()) {
                        int i5 = this.i;
                        this.k = this.a.U(view, i5).setInterpolator(this.h).setDuration((long) this.f).setListener(new s7(4, (Object) this));
                        return;
                    }
                    throw pb4.g(it);
                }
            }
        } else if (i2 < 0) {
            s(view);
        }
    }

    public final boolean o(View view, int i2, int i3) {
        if (i2 == 2) {
            return true;
        }
        return false;
    }

    public final void r(int i2) {
        r16 r16 = this.a;
        if (r16 != null && r16.T() == i2) {
            return;
        }
        if (i2 == 0) {
            this.a = new sz2(2);
        } else if (i2 == 1) {
            this.a = new sz2(0);
        } else if (i2 == 2) {
            this.a = new sz2(1);
        } else {
            h.q(pb4.i(i2, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
        }
    }

    public final void s(View view) {
        if (this.j != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 2;
            Iterator it = this.d.iterator();
            if (!it.hasNext()) {
                this.a.getClass();
                this.k = this.a.U(view, 0).setInterpolator(this.g).setDuration((long) this.e).setListener(new s7(4, (Object) this));
                return;
            }
            throw pb4.g(it);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
