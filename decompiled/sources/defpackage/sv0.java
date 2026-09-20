package defpackage;

import android.view.View;
import android.view.ViewGroup;
import cu.lestebang.utiletecsa.R;

/* renamed from: sv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class sv0 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(rv0 rv0, fw0 fw0) {
        vx0 vx0;
        View childAt = ((ViewGroup) rv0.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof vx0) {
            vx0 = (vx0) childAt;
        } else {
            vx0 = null;
        }
        if (vx0 != null) {
            vx0.setParentCompositionContext((ky0) null);
            vx0.setContent(fw0);
            return;
        }
        vx0 vx02 = new vx0(rv0);
        vx02.setParentCompositionContext((ky0) null);
        vx02.setContent(fw0);
        View decorView = rv0.getWindow().getDecorView();
        if (i95.o(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, rv0);
        }
        if (aa5.g(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, rv0);
        }
        if (w95.g(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, rv0);
        }
        rv0.setContentView(vx02, a);
    }
}
