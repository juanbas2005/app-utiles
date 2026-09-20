package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* renamed from: rz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class rz2 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int w;
    public final /* synthetic */ View x;
    public final /* synthetic */ w61 y;

    public /* synthetic */ rz2(w61 w61, View view, int i) {
        this.w = i;
        this.y = w61;
        this.x = view;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.w;
        View view = this.x;
        w61 w61 = this.y;
        switch (i) {
            case b85.b:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) w61;
                if (z && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.r(view);
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) w61;
                if (z && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.s(view);
                    return;
                }
                return;
        }
    }
}
