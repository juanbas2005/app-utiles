package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class SideSheetBehavior<V extends View> extends w61 {
    public z65 a;
    public final ug4 b;
    public final ColorStateList c;
    public final rq6 d;
    public final za0 e = new za0(this);
    public final float f;
    public final boolean g = true;
    public int h = 5;
    public i58 i;
    public boolean j;
    public final float k = 0.1f;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r = -1;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u = new LinkedHashSet();
    public final xa0 v = new xa0(this, 1);

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov5.z);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = t49.L(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = rq6.b(context, attributeSet, 0, 2131887168).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        rq6 rq6 = this.d;
        if (rq6 != null) {
            ug4 ug4 = new ug4(rq6);
            this.b = ug4;
            ug4.k(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void c(z61 z61) {
        this.p = null;
        this.i = null;
    }

    public final void e() {
        this.p = null;
        this.i = null;
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        i58 i58;
        VelocityTracker velocityTracker;
        if ((view.isShown() || e58.e(view) != null) && this.g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.s) != null) {
                velocityTracker.recycle();
                this.s = null;
            }
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.t = (int) motionEvent.getX();
            } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
                this.j = false;
                return false;
            }
            if (this.j || (i58 = this.i) == null || !i58.p(motionEvent)) {
                return false;
            }
            return true;
        }
        this.j = true;
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v27, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        View findViewById;
        View view2;
        View view3;
        int i7;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        ug4 ug4 = this.b;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            kl8.F(context, R.attr.motionDurationMedium2, 300);
            kl8.F(context, R.attr.motionDurationShort3, 150);
            kl8.F(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (ug4 != null) {
                view.setBackground(ug4);
                float f2 = this.f;
                if (f2 == -1.0f) {
                    f2 = view.getElevation();
                }
                ug4.m(f2);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = e58.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            if (this.h == 5) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (e58.e(view) == null) {
                e58.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((z61) view.getLayoutParams()).c, i2) == 3) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        z65 z65 = this.a;
        if (z65 == null || z65.D() != i3) {
            z61 z61 = null;
            rq6 rq6 = this.d;
            if (i3 == 0) {
                this.a = new m44(this, 1);
                if (rq6 != null) {
                    WeakReference weakReference2 = this.p;
                    if (!(weakReference2 == null || (view3 = (View) weakReference2.get()) == null || !(view3.getLayoutParams() instanceof z61))) {
                        z61 = view3.getLayoutParams();
                    }
                    if (z61 == null || z61.rightMargin <= 0) {
                        qq6 f3 = rq6.f();
                        f3.f = new a0(0.0f);
                        f3.g = new a0(0.0f);
                        rq6 a2 = f3.a();
                        if (ug4 != null) {
                            ug4.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else if (i3 == 1) {
                this.a = new m44(this, 0);
                if (rq6 != null) {
                    WeakReference weakReference3 = this.p;
                    if (!(weakReference3 == null || (view2 = (View) weakReference3.get()) == null || !(view2.getLayoutParams() instanceof z61))) {
                        z61 = view2.getLayoutParams();
                    }
                    if (z61 == null || z61.leftMargin <= 0) {
                        qq6 f4 = rq6.f();
                        f4.e = new a0(0.0f);
                        f4.h = new a0(0.0f);
                        rq6 a3 = f4.a();
                        if (ug4 != null) {
                            ug4.setShapeAppearanceModel(a3);
                        }
                    }
                }
            } else {
                h.q(pb4.i(i3, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                return false;
            }
        }
        if (this.i == null) {
            this.i = new i58(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        int A = this.a.A(view);
        coordinatorLayout.q(view, i2);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.B(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i4 = this.a.c(marginLayoutParams);
        } else {
            i4 = 0;
        }
        this.o = i4;
        int i8 = this.h;
        if (i8 == 1 || i8 == 2) {
            i5 = A - this.a.A(view);
        } else if (i8 == 3) {
            i5 = 0;
        } else if (i8 == 5) {
            i5 = this.a.w();
        } else {
            throw new IllegalStateException("Unexpected value: " + this.h);
        }
        WeakHashMap weakHashMap2 = e58.a;
        view.offsetLeftAndRight(i5);
        if (!(this.q != null || (i6 = this.r) == -1 || (findViewById = coordinatorLayout.findViewById(i6)) == null)) {
            this.q = new WeakReference(findViewById);
        }
        for (Object obj : this.u) {
            if (obj != null) {
                ku4.a();
                return false;
            }
        }
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    public final void m(View view, Parcelable parcelable) {
        int i2 = ((ts6) parcelable).y;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.h = i2;
    }

    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new ts6(this);
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.j && s()) {
            float abs = Math.abs(((float) this.t) - motionEvent.getX());
            i58 i58 = this.i;
            if (abs > ((float) i58.b)) {
                i58.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void r(int i2) {
        View view;
        int i3;
        if (this.h != i2) {
            this.h = i2;
            WeakReference weakReference = this.p;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (this.h == 5) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                if (view.getVisibility() != i3) {
                    view.setVisibility(i3);
                }
                Iterator it = this.u.iterator();
                if (!it.hasNext()) {
                    u();
                    return;
                }
                throw pb4.g(it);
            }
        }
    }

    public final boolean s() {
        if (this.i == null) {
            return false;
        }
        if (this.g || this.h == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1.o(r0, r3.getTop()) != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 != false) goto L_0x004b;
     */
    public final void t(View view, int i2, boolean z) {
        int i3;
        if (i2 == 3) {
            i3 = this.a.v();
        } else if (i2 == 5) {
            i3 = this.a.w();
        } else {
            h.q(hl6.k(i2, "Invalid state to get outer edge offset: "));
            return;
        }
        i58 i58 = this.i;
        if (i58 != null) {
            if (!z) {
                int top = view.getTop();
                i58.r = view;
                i58.c = -1;
                boolean h2 = i58.h(i3, top, 0, 0);
                if (!h2 && i58.a == 0 && i58.r != null) {
                    i58.r = null;
                }
            }
            r(2);
            this.e.b(i2);
            return;
        }
        r(i2);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            e58.j(view, 262144);
            e58.h(view, 0);
            e58.j(view, 1048576);
            e58.h(view, 0);
            if (this.h != 5) {
                e58.k(view, w4.l, new ss6(this, 5));
            }
            if (this.h != 3) {
                e58.k(view, w4.j, new ss6(this, 3));
            }
        }
    }

    public SideSheetBehavior() {
    }
}
