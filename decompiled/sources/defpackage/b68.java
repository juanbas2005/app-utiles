package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* renamed from: b68  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b68 extends w61 {
    public o21 a;

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new o21(view);
        }
        o21 o21 = this.a;
        View view2 = (View) o21.y;
        o21.w = view2.getTop();
        o21.x = view2.getLeft();
        o21 o212 = this.a;
        View view3 = (View) o212.y;
        WeakHashMap weakHashMap = e58.a;
        view3.offsetTopAndBottom(0 - (view3.getTop() - o212.w));
        view3.offsetLeftAndRight(0 - (view3.getLeft() - o212.x));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
