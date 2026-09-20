package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import cu.lestebang.utiletecsa.R;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* renamed from: fg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fg implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ fg(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void onViewAttachedToWindow(View view) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                gg ggVar = (gg) obj;
                Context context = view.getContext();
                if (!ggVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(ggVar.f);
                    ggVar.d = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                p42 p42 = (p42) obj;
                AccessibilityManager accessibilityManager = p42.P;
                if (p42.Q != null && accessibilityManager != null && p42.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(p42.Q);
                    return;
                }
                return;
            case 3:
                view.getViewTreeObserver().addOnDrawListener((dg2) obj);
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = e58.a;
                view2.requestApplyInsets();
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        Boolean bool;
        boolean z;
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                gg ggVar = (gg) obj;
                Context context = view.getContext();
                if (ggVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(ggVar.f);
                    ggVar.d = false;
                }
                gg.d(ggVar);
                return;
            case 1:
                am0 am0 = (am0) obj;
                ViewTreeObserver viewTreeObserver = am0.T;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        am0.T = view.getViewTreeObserver();
                    }
                    am0.T.removeGlobalOnLayoutListener(am0.E);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                p42 p42 = (p42) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = p42.Q;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = p42.P) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    return;
                }
                return;
            case 3:
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                return;
            case 5:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                rz2 rz2 = hideBottomViewOnScrollBehavior.h;
                if (rz2 != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(rz2);
                    hideBottomViewOnScrollBehavior.h = null;
                    return;
                }
                return;
            case 6:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                rz2 rz22 = hideViewOnScrollBehavior.c;
                if (rz22 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(rz22);
                    hideViewOnScrollBehavior.c = null;
                    return;
                }
                return;
            case 7:
                l27 l27 = (l27) obj;
                ViewTreeObserver viewTreeObserver2 = l27.K;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        l27.K = view.getViewTreeObserver();
                    }
                    l27.K.removeGlobalOnLayoutListener(l27.E);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                a1 a1Var = (a1) obj;
                for (ViewParent viewParent : cl6.S(n58.D, a1Var.getParent())) {
                    if (viewParent instanceof View) {
                        View view2 = (View) viewParent;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if (tag instanceof Boolean) {
                            bool = (Boolean) tag;
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            z = bool.booleanValue();
                        } else {
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                    }
                }
                a1Var.e();
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((h27) obj).o((CancellationException) null);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }
}
