package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final d63 h;

    public BaseTransientBottomBar$Behavior() {
        d63 d63 = new d63(21);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = d63;
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (b5.b == null) {
                    b5.b = new b5();
                }
                synchronized (b5.b.a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (b5.b == null) {
                b5.b = new b5();
            }
            synchronized (b5.b.a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    public final boolean r(View view) {
        this.h.getClass();
        return view instanceof e60;
    }
}
