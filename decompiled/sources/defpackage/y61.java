package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cu.lestebang.utiletecsa.MainActivity;

/* renamed from: y61  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y61 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ KeyEvent.Callback b;

    public y61(h07 h07, MainActivity mainActivity) {
        this.b = mainActivity;
    }

    public final void onChildViewAdded(View view, View view2) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case b85.b:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) callback).M;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    return;
                }
                return;
            default:
                if (v41.y(view2)) {
                    SplashScreenView r = v41.r(view2);
                    r.getClass();
                    WindowInsets f = g07.k().build();
                    f.getClass();
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    if (f == r.getRootView().computeSystemWindowInsets(f, rect)) {
                        boolean isEmpty = rect.isEmpty();
                    }
                    View decorView = ((MainActivity) callback).getWindow().getDecorView();
                    decorView.getClass();
                    ((ViewGroup) decorView).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
                    return;
                }
                return;
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        switch (this.a) {
            case b85.b:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                coordinatorLayout.p(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.M;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public y61(CoordinatorLayout coordinatorLayout) {
        this.b = coordinatorLayout;
    }

    private final void a(View view, View view2) {
    }
}
