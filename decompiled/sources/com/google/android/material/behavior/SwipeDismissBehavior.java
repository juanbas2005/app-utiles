package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class SwipeDismissBehavior<V extends View> extends w61 {
    public i58 a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public float e = 0.0f;
    public float f = 0.5f;
    public final m97 g = new m97(this);

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = new i58(coordinatorLayout.getContext(), coordinatorLayout, this.g);
            }
            if (this.c || !this.a.p(motionEvent)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            e58.j(view, 1048576);
            e58.h(view, 0);
            if (r(view)) {
                e58.k(view, w4.l, new uy5(6, (Object) this));
            }
        }
        return false;
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
